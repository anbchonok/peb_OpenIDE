package com.company.peb.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

@JmixEntity
@Table(name = "CONTRACT_STAGE", indexes = {
        @Index(name = "IDX_CONTRACT_STAGE_CONTRACT", columnList = "CONTRACT_ID"),
        @Index(name = "IDX_CONTRACT_STAGE_USER", columnList = "USER_ID"),
        @Index(name = "IDX_CONTRACT_STAGE_LOCATION", columnList = "LOCATION_ID"),
        @Index(name = "IDX_CONTRACT_STAGE_CUSTOMER", columnList = "CUSTOMER_ID")
})
@Entity
public class ContractStage {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @JoinColumn(name = "LOCATION_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Location location;

    @JoinColumn(name = "CUSTOMER_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Customer customer;

    @Column(name = "CONTRACT_STAGE_NUMBER")
    private String contractStageNumber;

    @Temporal(TemporalType.DATE)
    @Column(name = "CONTRACT_STAGE_DATE")
    private Date contractStageDate;

    @JoinColumn(name = "CONTRACT_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Contract contract;

    @Column(name = "FULL_PAYMENT_PRICE", precision = 19, scale = 2)
    private BigDecimal fullPaymentPrice;

    @Temporal(TemporalType.DATE)
    @Column(name = "FULL_PAYMENT_DATE")
    private Date fullPaymentDate;

    @JoinColumn(name = "USER_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @Column(name = "FOT_REMAINDER", precision = 19, scale = 2)
    private BigDecimal fotRemainder;

    @Column(name = "COMMENT_")
    private String comment;

    @Column(name = "ACTS_RECEIVED")
    private Boolean actsReceived;

    @Temporal(TemporalType.DATE)
    @Column(name = "TZ_DATE")
    private Date tzDate;

    @Column(name = "TZ_AVAILABILITY")
    private String tzAvailability;

    @Column(name = "TZ_STATUS")
    private String tzStatus;

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public ContractStageTzStatus getTzStatus() {
        return tzStatus == null ? null : ContractStageTzStatus.fromId(tzStatus);
    }

    public void setTzStatus(ContractStageTzStatus tzStatus) {
        this.tzStatus = tzStatus == null ? null : tzStatus.getId();
    }

    public ContractStageTzAvailability getTzAvailability() {
        return tzAvailability == null ? null : ContractStageTzAvailability.fromId(tzAvailability);
    }

    public void setTzAvailability(ContractStageTzAvailability tzAvailability) {
        this.tzAvailability = tzAvailability == null ? null : tzAvailability.getId();
    }

    public Date getTzDate() {
        return tzDate;
    }

    public void setTzDate(Date tzDate) {
        this.tzDate = tzDate;
    }

    public Boolean getActsReceived() {
        return actsReceived;
    }

    public void setActsReceived(Boolean actsReceived) {
        this.actsReceived = actsReceived;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public BigDecimal getFotRemainder() {
        return fotRemainder;
    }

    public void setFotRemainder(BigDecimal fotRemainder) {
        this.fotRemainder = fotRemainder;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getFullPaymentDate() {
        return fullPaymentDate;
    }

    public void setFullPaymentDate(Date fullPaymentDate) {
        this.fullPaymentDate = fullPaymentDate;
    }

    public BigDecimal getFullPaymentPrice() {
        return fullPaymentPrice;
    }

    public void setFullPaymentPrice(BigDecimal fullPaymentPrice) {
        this.fullPaymentPrice = fullPaymentPrice;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public Date getContractStageDate() {
        return contractStageDate;
    }

    public void setContractStageDate(Date contractStageDate) {
        this.contractStageDate = contractStageDate;
    }

    public String getContractStageNumber() {
        return contractStageNumber;
    }

    public void setContractStageNumber(String contractStageNumber) {
        this.contractStageNumber = contractStageNumber;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

}