/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programa03cc;

//Una clase abstracta puede tener métodos abstractos y métodos concretos a diferencia de una interface

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author irvin
 */
public abstract class MensajeAbstracto {
    
    public void imprimir() {
        Logger.getLogger(MensajeAbstracto.class.getName()).log(Level.INFO, "Hola Mundo Abstracto");
    }
    
    public abstract void msg();
}
