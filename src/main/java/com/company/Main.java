package com.company;

import com.Soofa.SoofaPay;

public class Main {

    public static void main(String[] args) {
	SoofaPay soofaPay=new SoofaPay("5002","3ixwt45uq88wttqgixpyla8d27ob0w");
    System.out.println(soofaPay.GetBalance());
    System.out.println(soofaPay.GetTransaction("QUB5N"));

    }
}
