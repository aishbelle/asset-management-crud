package com.example.demo.model;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

@Entity
@NoArgsConstructor
@Table(name = "asset_request")
public class asset_request {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id; // Using Long instead of asset_id (int) for portability and future scalability

    @JoinColumn(name = "asset_id")
    private int assetId; // Represents the relationship with the Asset

    @JoinColumn(name = "user_id")
    private int user_id; // Represents the relationship with the User

    private Integer quantity;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;

    private String status;

    @Column(name = "addtime")
    private LocalTime addtime;

    public LocalTime getAddtime(){
        return addtime;
    }

    public void setAddtime(LocalTime time){
        this.addtime=time;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAssetId() {
        return assetId;
    }

    public void setAssetId(int assetId) {
        this.assetId = assetId;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

