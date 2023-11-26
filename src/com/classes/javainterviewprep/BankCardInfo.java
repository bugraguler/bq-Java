package com.classes.javainterviewprep;

import java.util.Scanner;

public class BankCardInfo {
    public static void main(String[] args) {
        System.out.println("write your credit card number");
        Scanner scan = new Scanner(System.in);
        String ccNumber = scan.next().trim();
        String displayedCCNumber;
        String fourStar="****";
        if (ccNumber.length()!=16){
            System.out.println("Your credit card number should consist of 16 digit ");
        }else{
            displayedCCNumber=fourStar.concat(ccNumber.substring(4,12)).concat(fourStar);
            System.out.println(displayedCCNumber);
        }
    }
}
