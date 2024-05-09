package com.streams.wipro;

import java.math.BigDecimal;
import java.util.Optional;

public interface EURExchangeService {
    Optional<BigDecimal> rate(String currency);

}
