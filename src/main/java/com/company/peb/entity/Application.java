package com.company.peb.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.Date;
import java.util.UUID;

@JmixEntity
@Table(name = "APPLICATION")
@Entity
public class Application {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "APPLICATION_NUMBER")
    private String applicationNumber;

    @Column(name = "APPLICATION_CATEGORY")
    private String applicationCategory;

    @NotNull
    @Column(name = "ISH", nullable = false)
    private String ish;

    @NotNull
    @Temporal(TemporalType.DATE)
    @Column(name = "ISH_DATE", nullable = false)
    private Date ishDate;

    @Column(name = "INCOMING_NUMBER")
    private Integer incomingNumber;

    @NotNull
    @Temporal(TemporalType.DATE)
    @Column(name = "INCOMING_DATE", nullable = false)
    private Date incomingDate;

    @NotNull
    @Column(name = "CUSTOMER", nullable = false)
    private String customer;

    @NotNull
    @Column(name = "WORK_SUMMARY", nullable = false)
    private String workSummary;

    @Column(name = "RESPONSE_DEADLINE")
    private String responseDeadline;

    @Column(name = "NOTE")
    private String note;

    @Column(name = "RESPONSE_NUMBER")
    private String responseNumber;

    @Temporal(TemporalType.DATE)
    @Column(name = "RESPONSE_DATE")
    private Date responseDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "STATUS_CHANGE_DATE", nullable = false)
    @NotNull
    private Date statusChangeDate;

    @Column(name = "STATUS")
    private String status;

    public String getApplicationNumber() {
        return applicationNumber;
    }

    public void setApplicationNumber(String applicationNumber) {
        this.applicationNumber = applicationNumber;
    }

    public void setStatus(ApplicationStatus status) {
        this.status = status == null ? null : status.getId();
    }

    public ApplicationStatus getStatus() {
        return status == null ? null : ApplicationStatus.fromId(status);
    }

    public ApplicationCategory getApplicationCategory() {
        return applicationCategory == null ? null : ApplicationCategory.fromId(applicationCategory);
    }

    public void setApplicationCategory(ApplicationCategory applicationCategory) {
        this.applicationCategory = applicationCategory == null ? null : applicationCategory.getId();
    }

    public Date getStatusChangeDate() {
        return statusChangeDate;
    }

    public void setStatusChangeDate(Date statusChangeDate) {
        this.statusChangeDate = statusChangeDate;
    }

    public Date getResponseDate() {
        return responseDate;
    }

    public void setResponseDate(Date responseDate) {
        this.responseDate = responseDate;
    }

    public String getResponseNumber() {
        return responseNumber;
    }

    public void setResponseNumber(String responseNumber) {
        this.responseNumber = responseNumber;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getResponseDeadline() {
        return responseDeadline;
    }

    public void setResponseDeadline(String responseDeadline) {
        this.responseDeadline = responseDeadline;
    }

    public String getWorkSummary() {
        return workSummary;
    }

    public void setWorkSummary(String workSummary) {
        this.workSummary = workSummary;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public Date getIncomingDate() {
        return incomingDate;
    }

    public void setIncomingDate(Date incomingDate) {
        this.incomingDate = incomingDate;
    }

    public Integer getIncomingNumber() {
        return incomingNumber;
    }

    public void setIncomingNumber(Integer incomingNumber) {
        this.incomingNumber = incomingNumber;
    }

    public Date getIshDate() {
        return ishDate;
    }

    public void setIshDate(Date ishDate) {
        this.ishDate = ishDate;
    }

    public String getIsh() {
        return ish;
    }

    public void setIsh(String ish) {
        this.ish = ish;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

}