/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


/**
 *
 * @author Ad3E
 */
public class City {
    
      @Id
    private int id;
    
    @Column
    private String code;
    
    @Column
    private String country;
    
    @Column
    private int region;
    
    @Column
    private int latitude, longitude;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getRegion() {
        return region;
    }

    public void setRegion(int region) {
        this.region = region;
    }

    public int getLatitude() {
        return latitude;
    }

    public void setLatitude(int lat) {
        this.latitude = lat;
    }

    public int getLongitude() {
        return longitude;
    }

    public void setLongitude(int lon) {
        this.longitude = lon;
    }

  
}
