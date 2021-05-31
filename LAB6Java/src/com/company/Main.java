package com.company;

import lab6.test.TestByConsol;
import lab6.test.TestCollections;
import lab6.test.testApp;

public class Main {

    public static void main(String[] args) throws Exception {
        TestCollections testCollections = new TestCollections();
        testCollections.main();
        testApp app = new testApp();
        app.startApp();
        TestByConsol testConsole = new TestByConsol();
        testConsole.startAppConsole();
       // TestFile.main();
       // TestStoreObject storeObject = new TestStoreObject();
        // storeObject.main();

    }
}
