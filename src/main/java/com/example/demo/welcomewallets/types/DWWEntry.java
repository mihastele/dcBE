package com.example.demo.welcomewallets.types;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "dwwentry")
public class DWWEntry {


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

//    public String getStoreId() {
//        return storeId;
//    }
//
//    public void setStoreId(String storeId) {
//        this.storeId = storeId;
//    }
    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public String getServedBy() {
        return servedBy;
    }

    public void setServedBy(String servedBy) {
        this.servedBy = servedBy;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBtBroadband() {
        return btBroadband;
    }

    public void setBtBroadband(String btBroadband) {
        this.btBroadband = btBroadband;
    }

    public String getBtTvPackage() {
        return btTvPackage;
    }

    public void setBtTvPackage(String btTvPackage) {
        this.btTvPackage = btTvPackage;
    }

    public Date getSportPackage() {
        return sportPackage;
    }

    public void setSportPackage(Date sportPackage) {
        this.sportPackage = sportPackage;
    }

    public BigDecimal getMonthlyCharge() {
        return monthlyCharge;
    }

    public void setMonthlyCharge(BigDecimal monthlyCharge) {
        this.monthlyCharge = monthlyCharge;
    }

    public BigDecimal getUpfrontFee() {
        return upfrontFee;
    }

    public void setUpfrontFee(BigDecimal upfrontFee) {
        this.upfrontFee = upfrontFee;
    }

    public Integer getInstallmentsOfPayment() {
        return installmentsOfPayment;
    }

    public void setInstallmentsOfPayment(Integer installmentsOfPayment) {
        this.installmentsOfPayment = installmentsOfPayment;
    }

    public BigDecimal getTotalContractCost() {
        return totalContractCost;
    }

    public void setTotalContractCost(BigDecimal totalContractCost) {
        this.totalContractCost = totalContractCost;
    }

    public String getOtherHandyInfo() {
        return otherHandyInfo;
    }

    public void setOtherHandyInfo(String otherHandyInfo) {
        this.otherHandyInfo = otherHandyInfo;
    }

    @Id
    @GeneratedValue
    Long id;

    String date;

//    String storeId;

    @ManyToOne
    @JoinColumn(name = "storeName")
    Store store;

    String servedBy;
    String email;
    String btBroadband;
    String btTvPackage;
    Date sportPackage;
    BigDecimal monthlyCharge;
    BigDecimal upfrontFee;
    Integer installmentsOfPayment;
    BigDecimal totalContractCost;

    @Column(name = "otherHandyInfo", length = 50)
    String otherHandyInfo;

    public DWWEntry(Long id, String date, Store store, String servedBy, String email, String btBroadband, String btTvPackage, Date sportPackage, BigDecimal monthlyCharge, BigDecimal upfrontFee, Integer installmentsOfPayment, BigDecimal totalContractCost, String otherHandyInfo) {
        this.id = id;
        this.date = date;
//        this.storeId = storeId;
        this.store = store;
        this.servedBy = servedBy;
        this.email = email;
        this.btBroadband = btBroadband;
        this.btTvPackage = btTvPackage;
        this.sportPackage = sportPackage;
        this.monthlyCharge = monthlyCharge;
        this.upfrontFee = upfrontFee;
        this.installmentsOfPayment = installmentsOfPayment;
        this.totalContractCost = totalContractCost;
        this.otherHandyInfo = otherHandyInfo;
    }

    public DWWEntry() {
    }

    @Override
    public String toString() {
        return "DWWEntry{" +
                "id='" + id + '\'' +
                ", date='" + date + '\'' +
//                ", storeId='" + storeId + '\'' +
                ", servedBy='" + servedBy + '\'' +
                ", email='" + email + '\'' +
                ", BtBroadband='" + btBroadband + '\'' +
                ", BTTVPackage='" + btTvPackage + '\'' +
                ", sportPackage=" + sportPackage +
                ", monthlyCharge=" + monthlyCharge +
                ", upfrontFee=" + upfrontFee +
                ", installmentsOfPayment=" + installmentsOfPayment +
                ", totalContractCost=" + totalContractCost +
                ", otherHandyInfo='" + otherHandyInfo + '\'' +
                '}';
    }
}
