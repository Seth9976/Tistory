package cd;

import java.util.ArrayList;
import java.util.concurrent.Callable;

public final class c implements Callable {
    public final int a;

    public c(int v) {
        this.a = v;
    }

    @Override
    public final Object call() {
        return new ArrayList(this.a);
    }
}

