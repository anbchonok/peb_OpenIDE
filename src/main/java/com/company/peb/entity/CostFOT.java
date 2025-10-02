package com.company.peb.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.UUID;

@JmixEntity
@Table(name = "COST_FOT", indexes = {
        @Index(name = "IDX_COST_FOT_CONTRACT_STAGE", columnList = "CONTRACT_STAGE_ID")
})
@Entity
public class CostFOT {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "MONTH_")
    private Integer month;

    @Column(name = "YEAR_")
    private Integer year;

    @Column(name = "SUM_", precision = 19, scale = 2)
    private BigDecimal sum;

    @JoinColumn(name = "CONTRACT_STAGE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private ContractStage contractStage;

    @Column(name = "PAYMENT_TYPE")
    private String paymentType;

    public PaymentType getPaymentType() {
        return paymentType == null ? null : PaymentType.fromId(paymentType);
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType == null ? null : paymentType.getId();
    }

    public ContractStage getContractStage() {
        return contractStage;
    }

    public void setContractStage(ContractStage contractStage) {
        this.contractStage = contractStage;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getYear() {
        return year;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getMonth() {
        return month;
    }

    public BigDecimal getSum() {
        return sum;
    }

    public void setSum(BigDecimal sum) {
        this.sum = sum;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

}