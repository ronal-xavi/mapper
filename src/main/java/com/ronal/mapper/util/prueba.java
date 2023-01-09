package com.ronal.mapper.util;

public class prueba {
    public static void main(String[] args) {

        String methodName1 = Thread.currentThread().getStackTrace()[1].getMethodName();

        System.out.println(methodName1);

    }

    static void nada (){
        String methodName = new Throwable().getStackTrace()[0].getMethodName();

        System.out.println(methodName);

    }
}
