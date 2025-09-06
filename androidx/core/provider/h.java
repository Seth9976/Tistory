package androidx.core.provider;

import android.content.Context;
import java.util.concurrent.Callable;

public final class h implements Callable {
    public final String a;
    public final Context b;
    public final FontRequest c;
    public final int d;

    public h(String s, Context context0, FontRequest fontRequest0, int v) {
        this.a = s;
        this.b = context0;
        this.c = fontRequest0;
        this.d = v;
    }

    @Override
    public final Object call() {
        return m.a(this.a, this.b, this.c, this.d);
    }
}

