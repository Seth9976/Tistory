package androidx.dynamicanimation.animation;

import androidx.appcompat.app.w0;
import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;

public final class c {
    public final SimpleArrayMap a;
    public final ArrayList b;
    public final a c;
    public w0 d;
    public boolean e;
    public static final ThreadLocal f;

    static {
        c.f = new ThreadLocal();
    }

    public c() {
        this.a = new SimpleArrayMap();
        this.b = new ArrayList();
        this.c = new a(this);
        this.e = false;
    }
}

