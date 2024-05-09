package com.streams.wipro;


import lombok.Value;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Value
class SoldProduct {

    private final String name;
    private final BigDecimal price;
    private final String currency;

}

@Value
class SimpleSoldProduct{

    private final String name;
    private final BigDecimal price;
}

@Value
class SoldProductAggregate{
    private final List<SimpleSoldProduct> products;
    private final BigDecimal total;
}

public class SoldProductsAggregator{
    private final EURExchangeService eurExchangeService;


    SoldProductsAggregator(EURExchangeService eurExchangeService1){
        this.eurExchangeService = eurExchangeService1;
    }


    SoldProductAggregate aggregator(Stream<SoldProduct> products){


            List<SimpleSoldProduct> simpleSoldProductStream = products.filter(Objects::nonNull).
                    filter(product-> eurExchangeService.rate(product.getCurrency()).isPresent() )
                    .filter(product -> eurExchangeService.rate(product.getCurrency()).get().multiply(product.getPrice()).signum() ==1 )
                    .map(product -> new SimpleSoldProduct(product.getName(), eurExchangeService.rate(product.getCurrency()).get().multiply(product.getPrice())))
                    .collect(Collectors.toList());

            BigDecimal total = simpleSoldProductStream.stream().map(SimpleSoldProduct::getPrice).
                    reduce(BigDecimal.ZERO, BigDecimal::add);

            return new SoldProductAggregate(simpleSoldProductStream, total);



    }

    public static void main(String[] args) {
        SoldProductsAggregator soldProductsAggregator= new SoldProductsAggregator(new EURExchangeService() {
            @Override
            public Optional<BigDecimal> rate(String currency) {
                if(currency.equals("EUR")) {
                    return Optional.of(new BigDecimal("85.5"));
                } else if(currency.equals("USD")) {
                    return Optional.of(new BigDecimal(33));
                } else if(currency.equals("GBP")) {
                    return Optional.of(new BigDecimal(33));
                } else if(currency.equals("INR")) {
                    return Optional.of(new BigDecimal(33));
                }
                return Optional.ofNullable(null);

            }
        });

        List<SoldProduct> soldProducts= new ArrayList<>();
        SoldProduct soldProduct1 = new SoldProduct("prd1",new BigDecimal(33.3),"EUR");;
        SoldProduct soldProduct2 = new SoldProduct("prd2",new BigDecimal(333.3),"INR");
        SoldProduct soldProduct3 = new SoldProduct("prd3",new BigDecimal(3333.3),"USD");
        SoldProduct soldProduct4 = new SoldProduct("prd4",new BigDecimal(33333.3),"GBP");
        soldProducts.add(soldProduct1);
        soldProducts.add(soldProduct2);
        soldProducts.add(soldProduct3);
        soldProducts.add(soldProduct4);
        System.out.println(soldProductsAggregator.aggregator(soldProducts.stream()));

    }
}


