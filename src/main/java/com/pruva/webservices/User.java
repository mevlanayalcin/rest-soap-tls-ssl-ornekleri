/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pruva.webservices;

/**
 *
 * @author Mevlana
 */
public class User 
{
    private Integer id;
    
    private String name;
    
    private String city;
    
    public User()
    {
        
    }

    public User(Integer id, String name, String city) 
    {
        this.id = id;
        this.name = name;
        this.city = city;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name=" + name + ", city=" + city + '}';
    }
    
    
    
}
