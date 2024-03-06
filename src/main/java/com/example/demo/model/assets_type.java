package com.example.demo.model;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Set;

@Entity
@NoArgsConstructor
@Table(name = "assets_type")
public class assets_type{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "assets_type_id")
    private int assetsTypeId;// Using Long instead of int for portability and scalability

    @Column(name = "type_name") // Consider using "typeName" for consistency and better readability
    private String typeName;

    @Column(name = "description")
    private String description;

    public assets_type(int assetsTypeId, String typeName, String description) {
        this.assetsTypeId = assetsTypeId;
        this.typeName = typeName;
        this.description = description;
    }

    public int getAssetsTypeId() {
        return assetsTypeId;
    }

    public void setAssetsTypeId(int assetsTypeId) {
        this.assetsTypeId = assetsTypeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
