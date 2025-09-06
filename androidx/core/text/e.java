package androidx.core.text;

import java.util.concurrent.Callable;

public final class e implements Callable {
    public Params a;
    public CharSequence b;

    @Override
    public final Object call() {
        return PrecomputedTextCompat.create(this.b, this.a);
    }
}

