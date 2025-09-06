package androidx.core.content;

import androidx.core.util.Consumer;

public final class k implements Consumer {
    public final int a;

    public k(int v) {
        this.a = v;
        super();
    }

    @Override  // androidx.core.util.Consumer
    public final void accept(Object object0) {
        if(this.a == 0) {
            throw new SecurityException(((String)object0));
        }
    }
}

