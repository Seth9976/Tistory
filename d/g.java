package d;

import dagger.internal.DoubleCheck;
import dagger.internal.Provider;

public final class g {
    public Provider a;
    public Provider b;
    public Provider c;
    public Provider d;

    public g(b b0, a a0, h h0) {
        this.a(b0, h0);
    }

    public final void a(b b0, h h0) {
        this.a = DoubleCheck.provider(new e(b0));
        this.b = DoubleCheck.provider(new d(b0));
        this.c = DoubleCheck.provider(new c.a(DoubleCheck.provider(new c(b0))));
        this.d = DoubleCheck.provider(new i(h0, DoubleCheck.provider(new j(h0))));
    }
}

