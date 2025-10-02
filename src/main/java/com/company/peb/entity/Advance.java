package com.company.peb.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

@JmixEntity
@Table(name = "ADVANCE", indexes = {
        @Index(name = "IDX_ADVANCE_CONTRACT_STAGE", columnList = "CONTRACT_STAGE_ID")
})
@Entity
public class Advance {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "ADVANCE_PRICE", precision = 19, scale = 2)
    private BigDecimal advancePrice;

    @Temporal(TemporalType.DATE)
    @Column(name = "ADVANCE_DATE")
    private Date advanceDate;

    @JoinColumn(name = "CONTRACT_STAGE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private ContractStage contractStage;

    public ContractStage getContractStage() {
        return contractStage;
    }

    public void setContractStage(ContractStage contractStage) {
        this.contractStage = contractStage;
    }

    public Date getAdvanceDate() {
        return advanceDate;
    }

    public void setAdvanceDate(Date advanceDate) {
        this.advanceDate = advanceDate;
    }

    public BigDecimal getAdvancePrice() {
        return advancePrice;
    }

    public void setAdvancePrice(BigDecimal advancePrice) {
        this.advancePrice = advancePrice;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

}