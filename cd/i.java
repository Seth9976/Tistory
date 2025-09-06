package cd;

import java.util.HashSet;
import java.util.concurrent.Callable;

public enum i implements Callable {
    INSTANCE;

    @Override
    public final Object call() {
        return new HashSet();
    }
}

