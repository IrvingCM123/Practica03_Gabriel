/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.programa03cc;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author irvin
 */
public class Programa03CC {

    public static void main(String[] args) {
        
        MensajeAbstracto ma;
        IMensaje maI;
        
        ma = new MensajeSaludo();
        ma.msg();
        
        ma = new MensajeDespedida();
        ma.msg();
        
        //REALIZAR UNA INSTANCIA ANONIMA 
        
        ma = new MensajeAbstracto() {
            @Override
            public void msg() {
                Logger.getLogger(Programa03CC.class.getName()).log(Level.INFO, "Iniciar Clase Anónima");      
            }
        };
        ma.msg();
        
        maI = new MensajeSaludoI();
        maI.msg();
        
        maI = new MensajeDespedidaI();
        maI.msg();
        
        maI = new IMensaje() {
            @Override
            public void msg() {
                Logger.getLogger(Programa03CC.class.getName()).log(Level.INFO, "Instancias Anónimamente la interface");
            }
        };
        maI.msg();
    }
}
