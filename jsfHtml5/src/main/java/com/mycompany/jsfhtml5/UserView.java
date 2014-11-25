package com.mycompany.jsfhtml5;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author joel
 */
@ManagedBean
@SessionScoped
public class UserView {
 private User user;
    /**
     * Creates a new instance of UserView
     */
    public UserView() {
    }
    @PostConstruct
    public void postInit(){
        this.setUser(new User());
    }
    
    public void save(){
        System.out.println("FirstName : "+this.getUser().getFirstname());
        System.out.println("LastName : "+this.getUser().getLastname());
        System.out.println("Email : "+this.getUser().getEmail());
    }

    /**
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }
    
}
