package o;

public final class a extends androidx.arch.core.internal.a {
    public final int c;

    public a(b b0, b b1, int v) {
        this.c = v;
        super();
        this.a = b1;
        this.b = b0;
    }

    @Override  // androidx.arch.core.internal.a
    public final b b(b b0) {
        return this.c == 0 ? b0.d : b0.c;
    }

    @Override  // androidx.arch.core.internal.a
    public final b c(b b0) {
        return this.c == 0 ? b0.c : b0.d;
    }
}

