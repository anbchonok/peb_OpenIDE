package com.company.peb.entity;

import io.jmix.core.metamodel.datatype.EnumClass;

import org.springframework.lang.Nullable;


public enum ContractStageTzStatus implements EnumClass<String> {

    NEW_VALUE("A"),
    NEW_VALUE1("B"),
    NEW_VALUE2("C"),
    NEW_VALUE3("D"),
    NEW_VALUE4("E"),
    NEW_VALUE5("F");

    private final String id;

    ContractStageTzStatus(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static ContractStageTzStatus fromId(String id) {
        for (ContractStageTzStatus at : ContractStageTzStatus.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}