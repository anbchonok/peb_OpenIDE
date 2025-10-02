package com.company.peb.entity;

import io.jmix.core.metamodel.datatype.EnumClass;

import org.springframework.lang.Nullable;


public enum ApplicationCategory implements EnumClass<String> {

    COMMERCIAL_PROPOSAL("KP"),
    CONTRACT("Contract"),
    CONTRACT_SPECIFICATION("Conrtact-specification"),
    INTERNAL("Internal"),
    ADDITIONAL_AGREEMENT("DS");

    private final String id;

    ApplicationCategory(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static ApplicationCategory fromId(String id) {
        for (ApplicationCategory at : ApplicationCategory.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}