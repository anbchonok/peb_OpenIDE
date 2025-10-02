package com.company.peb.entity;

import io.jmix.core.metamodel.datatype.EnumClass;

import org.springframework.lang.Nullable;


public enum ContractNds implements EnumClass<String> {

    NEW_VALUE("A"),
    NEW_VALUE1("B"),
    NEW_VALUE2("C");

    private final String id;

    ContractNds(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static ContractNds fromId(String id) {
        for (ContractNds at : ContractNds.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}