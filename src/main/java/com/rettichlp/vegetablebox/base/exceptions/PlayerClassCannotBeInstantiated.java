package com.rettichlp.vegetablebox.base.exceptions;

public class PlayerClassCannotBeInstantiated extends RuntimeException {

    public PlayerClassCannotBeInstantiated(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }
}
