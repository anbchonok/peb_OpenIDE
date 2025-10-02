package com.company.peb.entity;

import io.jmix.core.metamodel.datatype.EnumClass;

import org.springframework.lang.Nullable;


public enum ContractVp implements EnumClass<String> {

    NEW_VALUE("A"),
    NEW_VALUE1("B");

    private final String id;

    ContractVp(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static ContractVp fromId(String id) {
        for (ContractVp at : ContractVp.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}