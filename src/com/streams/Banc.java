package com.streams;

import java.util.HashMap;
import java.util.Map;

public class Banc {

    String []  solution(String[] [] a){

        Map<String,String> accountMap = new HashMap<>();
        String [] response = new String[a.length];
         for(int i= 0;i<a.length;i++){
            for(int j= 0;j<a[i].length;j++){


                    if("CREATE".equals(a[i][j])){
                        if(!accountMap.containsKey(a[i][2])) {
                            accountMap.put(a[i][2], "");
                            response[i] = "true";
                            break;
                        } else {
                            response[i] = "false";
                            break;
                        }
                    } else if("DEPOSIT".equals(a[i][j])){
                        if(accountMap.containsKey(a[i][2])){
                            accountMap.put(a[i][2],a[i][3]);
                            response[i] = "true";
                            break;
                        } else{
                            response[i] = "";
                            break;
                        }
                    } else if("PAY".equals(a[i][j])){
                        if(accountMap.containsKey(a[i][2])){
                            String bal = accountMap.get(a[i][2]);
                            Integer balIn = Integer.parseInt(bal);
                            Integer currentPay = Integer.parseInt(a[i][3]);
                            if(currentPay > balIn){
                                response[i] = "";
                                break;
                            } else{
                                balIn -= currentPay;
                                response[i] = balIn.toString();
                            }
                            accountMap.put(a[i][2], balIn.toString());
                        } else {
                            response   [i] = "";
                            break;
                        }
                    }
            }
        }

        return response;

    }
    public static void main(String[] args) {
        String [] [] str =  new String[][] {
                {"CREATE","1","ACCT1"}, //TRUE
                {"CREATE","2","ACCT1"},  //FALSE ACCT ALREADY EXISTS
                {"CREATE","3","ACCT2"}, //TRUE
                {"DEPOSIT","4","NON-EXISTING","2700"}, //RETURN "" ACCOUNT NOT FOUND
                {"DEPOSIT","5","ACCT1","2700"}, //TRUE
                {"PAY","6","NON-EXISTING","2700"}, //RETURN ""
                {"PAY","7","ACCT1","2701"},// RETURN "" INSUFFICEINT
                {"PAY","8","ACCT1","200"}, //RETURN "2500"
        };


        Banc b = new Banc();
        String [] s = b.solution(str);
        for(String st: s){
            System.out.println(st);
        }
    }
}
