package com.developer_khusanjon.thymeleaf_templete.models;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Nationality {
    @Id
    private Integer id;
    private String name;
    private String capital;
    private String updatedBy;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date updatedDate;

    public Nationality(Integer id, String name, String capital, String updatedBy, Date updatedDate) {
        this.id = id;
        this.name = name;
        this.capital = capital;
        this.updatedBy = updatedBy;
        this.updatedDate = updatedDate;
    }

    public Nationality() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updateBy) {
        this.updatedBy = updateBy;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updateDate) {
        this.updatedDate = updateDate;
    }
}
