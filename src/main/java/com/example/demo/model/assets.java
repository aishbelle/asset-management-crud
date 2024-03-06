package com.example.demo.model;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Set;

@Entity
@NoArgsConstructor
@Table(name = "assets")
public class assets {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int asset_id;

    @JoinColumn(name = "asset_type_id")
    @Column(name = "asset_type_id")
    private int assetsTypeId; // Represents the relationship with AssetType

    @Column(name = "asset_name")
    private String assetName;

    @Column(name = "manufacturer")
    private String manufacturer;

    @Column(name = "purchase_date")
    private Date purchaseDate;

    @Column(name = "quantity")
    private Integer quantity;

    public assets(int asset_id, int assetsTypeId, String assetName, String manufacturer, Date purchaseDate, Integer quantity) {
        this.asset_id = asset_id;
        this.assetsTypeId = assetsTypeId;
        this.assetName = assetName;
        this.manufacturer = manufacturer;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;
    }

    public int getAssets_id() {
        return asset_id;
    }

    public void setAssets_id(int assets_id) {
        this.asset_id = assets_id;
    }

    public int getAssetsTypeId() {
        return assetsTypeId;
    }

    public void setAssetsTypeId(int assetsTypeId) {
        this.assetsTypeId = assetsTypeId;
    }

    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
