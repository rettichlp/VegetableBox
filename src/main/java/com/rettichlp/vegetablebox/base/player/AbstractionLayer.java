package com.rettichlp.vegetablebox.base.player;

import com.rettichlp.vegetablebox.base.exceptions.PlayerClassCannotBeInstantiated;

import java.lang.reflect.InvocationTargetException;

/**
 * @author RettichLP
 * @see <a href="https://github.com/paulzhng/UCUtils/blob/master/src/main/java/de/fuzzlemann/ucutils/base/abstraction/AbstractionLayer.java">UCUtils by paulzhng</a>
 */
public class AbstractionLayer {

    private static final Class<? extends UPlayer> playerClass = UPlayerImpl.class;

    public static UPlayer getPlayer() {
        try {
            return playerClass.getDeclaredConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            throw new PlayerClassCannotBeInstantiated("Class " + playerClass + " cannot be instantiated.", e);
        }
    }
}
