/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.facesvalidators;


import java.util.Map;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author jorodriguez
 */
@FacesValidator("text.requerido")
public class FacesValidationText implements Validator{    
     @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        System.out.println("Validation Text Requiered "+value);
        //-for input
        if (value == null || value.toString().equals("")) {
            throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "(x_x) Error de validación",
                   "el campo es requerido (x_x)"));
        }
    }
}
