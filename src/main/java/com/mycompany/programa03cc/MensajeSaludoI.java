/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programa03cc;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author irvin
 */
public class MensajeSaludoI implements IMensaje {

    @Override
    public void msg() {
        Logger.getLogger(MensajeSaludoI.class.getName()).log(Level.INFO, "Hola Mundo Interface");
    }
}
