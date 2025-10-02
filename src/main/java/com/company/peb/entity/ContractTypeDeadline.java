package com.company.peb.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@JmixEntity
@Table(name = "CONTRACT_TYPE_DEADLINE")
@Entity
public class ContractTypeDeadline {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "FIXED_DEADLINE")
    private String fixedDeadline;

    @Column(name = "CONDITIONAL_DEADLINE")
    private String conditionalDeadline;

    public String getConditionalDeadline() {
        return conditionalDeadline;
    }

    public void setConditionalDeadline(String conditionalDeadline) {
        this.conditionalDeadline = conditionalDeadline;
    }

    public String getFixedDeadline() {
        return fixedDeadline;
    }

    public void setFixedDeadline(String fixedDeadline) {
        this.fixedDeadline = fixedDeadline;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

}