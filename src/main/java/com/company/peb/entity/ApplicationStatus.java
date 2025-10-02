package com.company.peb.entity;

import io.jmix.core.metamodel.datatype.EnumClass;

import org.springframework.lang.Nullable;


public enum ApplicationStatus implements EnumClass<String> {

    COMPLETED("Completed"),
    CANCELLED("Cancelled"),
    IN_PROGRESS("In progress");

    private final String id;

    ApplicationStatus(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static ApplicationStatus fromId(String id) {
        for (ApplicationStatus at : ApplicationStatus.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}