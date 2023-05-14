package com.testing.magang.utils;

public enum TestScenarios {
    T1("Menampilkan From Contact Message"),
    T2("Menampilkan data filter email"),
    T3("Menampilkan data filter phone number"),
    T4("Menampilkan data filter subject"),
    T5("Menampilkan data filter messages"),
    T6("Menampilkan field list berdasarkan nama"),
    T7("Menampilkan field list berdasarkan nama invalid"),
    T8("Menampilkan field list berdasarkan email"),
    T9("Menampilkan field list berdasarkan email invalid"),
    T10("Menampilkan field list berdasarkan phone number");


    private final String testCaseName;

    TestScenarios(String value){
        testCaseName = value;
    }

    public String getTestCaseName(){
        return testCaseName;
    }
}
