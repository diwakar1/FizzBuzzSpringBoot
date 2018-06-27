package com.example.fizzbuzz;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;

public class FizzBuzz {
    @NotNull
    @Min(1)
    private int startNumber;

    @NotNull
    @Min(1)
    private int endNumber;


    public int getStartNumber() {
        return startNumber;
    }

    public void setStartNumber(int startNumber) {
        this.startNumber = startNumber;
    }

    public int getEndNumber() {
        return endNumber;
    }

    public void setEndNumber(int endNumber) {
        this.endNumber = endNumber;
    }

    public static ArrayList<String>show(int startNumber,int endNumber){

        ArrayList<String>result =new ArrayList<>();
        for(int i = startNumber;i<=endNumber;i++){

            if(i %3==0){
                if(i%5==0){
                    result.add("FizzBuzz");
                }
                else{
                    result.add("Buzz");
                }
            }
            else{
                result.add(String.valueOf(i));
            }
        }
        return result;
    }
}
