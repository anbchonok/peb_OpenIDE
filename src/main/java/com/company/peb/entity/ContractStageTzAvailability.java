package com.company.peb.entity;

import io.jmix.core.metamodel.datatype.EnumClass;

import org.springframework.lang.Nullable;


public enum ContractStageTzAvailability implements EnumClass<String> {

    NEW_VALUE("A"),
    NEW_VALUE1("B");

    private final String id;

    ContractStageTzAvailability(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static ContractStageTzAvailability fromId(String id) {
        for (ContractStageTzAvailability at : ContractStageTzAvailability.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}