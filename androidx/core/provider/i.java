package androidx.core.provider;

import androidx.core.util.Consumer;

public final class i implements Consumer {
    public final c a;

    public i(c c0) {
        this.a = c0;
    }

    @Override  // androidx.core.util.Consumer
    public final void accept(Object object0) {
        l l0 = (l)object0;
        if(l0 == null) {
            l0 = new l(-3);
        }
        this.a.a(l0);
    }
}

