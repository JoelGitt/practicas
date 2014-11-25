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
@FacesValidator("combo.requerido")
public class FacesValidationCombo implements Validator {

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        System.out.println("Validation Combo Requiered " + value);
        //-for combo        
        int v = value != null ? Integer.valueOf(value.toString()) : -1;
        if (value == null || v == -1) {
            throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "(x_x) Error de validación",
                    " la selección es requerida (x_x)"));
        }
    }
}
