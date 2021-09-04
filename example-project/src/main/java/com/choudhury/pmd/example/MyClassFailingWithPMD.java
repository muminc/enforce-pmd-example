package com.choudhury.pmd.example;

//@SuppressWarnings("PMD")  /* if you want to completely suppress PMD for this class uncomment this */
public class MyClassFailingWithPMD {
    private final int BAR=5;

    public static void sayHello(){
        System.out.println("hello");
    }



    @SuppressWarnings("PMD.SystemPrintln")  /* we are suppressing the SystemPrintln for this method */
    private void myUnusedMethod(){
        System.out.println("BAR = " + BAR);
    }
}
