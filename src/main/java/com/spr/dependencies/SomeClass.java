package com.spr.dependencies;

import java.util.Map;

// strongly typed collection
public class SomeClass {

    private Map<String, Float> accounts;

    public void setAccounts(Map<String, Float> accounts) {
        this.accounts = accounts;
    }
}
