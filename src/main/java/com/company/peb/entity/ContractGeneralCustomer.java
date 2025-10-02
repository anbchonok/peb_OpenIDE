package com.company.peb.entity;

import io.jmix.core.metamodel.datatype.EnumClass;

import org.springframework.lang.Nullable;


public enum ContractGeneralCustomer implements EnumClass<String> {

    NEW_VALUE("A"),
    NEW_VALUE1("B"),
    NEW_VALUE2("C");

    private final String id;

    ContractGeneralCustomer(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static ContractGeneralCustomer fromId(String id) {
        for (ContractGeneralCustomer at : ContractGeneralCustomer.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}