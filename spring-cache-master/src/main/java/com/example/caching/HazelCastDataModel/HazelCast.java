package com.example.caching.HazelCastDataModel;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "hazelcast" ,indexes = { @Index(columnList = "country") })
public class HazelCast {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long id;

    public long countryName;

    @Override
    public String toString() {
        return "HazelCast{" +
                "id=" + id +
                ", countryName=" + countryName +
                '}';
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCountryName() {
        return countryName;
    }

    public void setCountryName(long countryName) {
        this.countryName = countryName;
    }

    public HazelCast(long id, long countryName) {
        this.id = id;
        this.countryName = countryName;
    }
}
