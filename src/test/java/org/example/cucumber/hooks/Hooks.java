package org.example.cucumber.hooks;


import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
        @Before
        public void prepareData() {
            System.out.println("Hook before");
        }

        @After
        public void clearData() {
            System.out.println("Hook after");

        }
    }


