package com.company.peb.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

@JmixEntity
@Table(name = "CONTRACT", indexes = {
        @Index(name = "IDX_CONTRACT_APPLICATION", columnList = "APPLICATION_ID"),
        @Index(name = "IDX_CONTRACT_TYPE_DEADLINE", columnList = "TYPE_DEADLINE_ID")
})
@Entity
public class Contract {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "CONTRACT_NUMBER")
    private String contractNumber;

    @Temporal(TemporalType.DATE)
    @Column(name = "CONTRACT_DATE")
    private Date contractDate;

    @Column(name = "CONTRACT_THEME")
    private String contractTheme;

    @JoinColumn(name = "APPLICATION_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Application application;

    @Temporal(TemporalType.DATE)
    @Column(name = "START_DATE")
    private Date startDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "END_DATE")
    private Date endDate;

    @Column(name = "EXECUTION_TERM")
    private String deadline;

    @Column(name = "PRICE", precision = 19, scale = 2)
    private BigDecimal price;

    @Column(name = "FOT_GENERAL", precision = 19, scale = 2)
    private BigDecimal fotGeneral;

    @Column(name = "FOT_OZP", precision = 19, scale = 2)
    private BigDecimal fotOzp;

    @Column(name = "PR")
    private String pr;

    @Column(name = "M")
    private String m;

    @Column(name = "STO")
    private String sto;

    @Column(name = "COM")
    private String com;

    @Column(name = "ORDER_NUMBER")
    private String orderNumber;

    @Column(name = "NDS")
    private String nds;

    @Column(name = "PRICE_TYPE")
    private String priceType;

    @Column(name = "VP")
    private String vp;

    @Column(name = "GENERAL_CUSTOMER")
    private String generalCustomer;

    @JoinColumn(name = "TYPE_DEADLINE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private ContractTypeDeadline typeDeadline;

    @Column(name = "ACCOUNT_TYPE")
    private String accountType;

    public ContractTypeDeadline getTypeDeadline() {
        return typeDeadline;
    }

    public void setTypeDeadline(ContractTypeDeadline typeDeadline) {
        this.typeDeadline = typeDeadline;
    }

    public ContractAccountType getAccountType() {
        return accountType == null ? null : ContractAccountType.fromId(accountType);
    }

    public void setAccountType(ContractAccountType accountType) {
        this.accountType = accountType == null ? null : accountType.getId();
    }

    public ContractGeneralCustomer getGeneralCustomer() {
        return generalCustomer == null ? null : ContractGeneralCustomer.fromId(generalCustomer);
    }

    public void setGeneralCustomer(ContractGeneralCustomer generalCustomer) {
        this.generalCustomer = generalCustomer == null ? null : generalCustomer.getId();
    }

    public ContractVp getVp() {
        return vp == null ? null : ContractVp.fromId(vp);
    }

    public void setVp(ContractVp vp) {
        this.vp = vp == null ? null : vp.getId();
    }

    public ContractPriceType getPriceType() {
        return priceType == null ? null : ContractPriceType.fromId(priceType);
    }

    public void setPriceType(ContractPriceType priceType) {
        this.priceType = priceType == null ? null : priceType.getId();
    }

    public ContractNds getNds() {
        return nds == null ? null : ContractNds.fromId(nds);
    }

    public void setNds(ContractNds nds) {
        this.nds = nds == null ? null : nds.getId();
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getCom() {
        return com;
    }

    public void setCom(String com) {
        this.com = com;
    }

    public String getSto() {
        return sto;
    }

    public void setSto(String sto) {
        this.sto = sto;
    }

    public String getM() {
        return m;
    }

    public void setM(String m) {
        this.m = m;
    }

    public String getPr() {
        return pr;
    }

    public void setPr(String pr) {
        this.pr = pr;
    }

    public BigDecimal getFotOzp() {
        return fotOzp;
    }

    public void setFotOzp(BigDecimal fotOzp) {
        this.fotOzp = fotOzp;
    }

    public BigDecimal getFotGeneral() {
        return fotGeneral;
    }

    public void setFotGeneral(BigDecimal fotGeneral) {
        this.fotGeneral = fotGeneral;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Application getApplication() {
        return application;
    }

    public void setApplication(Application application) {
        this.application = application;
    }

    public String getContractTheme() {
        return contractTheme;
    }

    public void setContractTheme(String contractTheme) {
        this.contractTheme = contractTheme;
    }

    public Date getContractDate() {
        return contractDate;
    }

    public void setContractDate(Date contractDate) {
        this.contractDate = contractDate;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

}