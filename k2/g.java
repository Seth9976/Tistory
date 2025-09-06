package k2;

import androidx.compose.runtime.State;

public final class g {
    public final State a;
    public final g b;
    public final Object c;

    public g(State state0, g g0) {
        this.a = state0;
        this.b = g0;
        this.c = state0.getValue();
    }

    // 去混淆评级： 低(20)
    public final boolean a() {
        return this.a.getValue() != this.c || this.b != null && this.b.a();
    }
}

