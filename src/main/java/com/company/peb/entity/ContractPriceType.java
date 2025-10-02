package com.company.peb.entity;

import io.jmix.core.metamodel.datatype.EnumClass;

import org.springframework.lang.Nullable;


public enum ContractPriceType implements EnumClass<String> {

    NEW_VALUE("A"),
    NEW_VALUE1("B");

    private final String id;

    ContractPriceType(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static ContractPriceType fromId(String id) {
        for (ContractPriceType at : ContractPriceType.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}