/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.transbank.pos.exceptions.common;

import cl.transbank.pos.exceptions.common.TransbankException;

/**
 *
 * @author lanixerp
 */
public class TransbankConnectionException extends TransbankException{

    public TransbankConnectionException(String message) {
        super(message);
    }
    
    public TransbankConnectionException(String message, Throwable cause) {
        super(message, cause);
    }
    
}
