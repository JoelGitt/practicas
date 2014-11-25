/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.facesvalidators;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;
import javax.faces.event.ValueChangeListener;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author jorodriguez
 */
@ManagedBean
@ViewScoped
public class beanBacking {

    @Getter @Setter
    private String saludo;
    @Getter @Setter
    private int sexo;    
    @Getter @Setter
    private int color;
    @Getter @Setter   
    private String nombre;
    
    /**
     * Creates a new instance of beanBacking
     */
    public beanBacking() {
    }
    
    public void accion(ActionEvent event){
        //new FacesMessage(saludo, saludo)sMessage.
        setSaludo("Click en el boton... ");
    }
    public void valueChangeSexo(ValueChangeEvent listener){
        System.out.println("Seleccion ValueChangeEvent "+listener.getNewValue());
        
    }
    
    public void valueChangeColor(ValueChangeEvent listener) {
        System.out.println("Seleccion ValueChangeEvent " + listener.getNewValue());

    }
    
}
