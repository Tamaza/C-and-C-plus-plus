/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author user_2
 */
public class IllegalPasswordException extends Exception {

    /**
     * Creates a new instance of <code>IllegalPasswordException</code> without
     * detail message.
     */
    public IllegalPasswordException() {
    }

    /**
     * Constructs an instance of <code>IllegalPasswordException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public IllegalPasswordException(String msg) {
        super(msg);
    }
}
