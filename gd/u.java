package gd;

import java.util.NoSuchElementException;
import java.util.concurrent.Callable;

public enum u implements Callable {
    INSTANCE;

    @Override
    public final Object call() {
        return new NoSuchElementException();
    }
}

