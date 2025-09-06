package androidx.core.provider;

import android.os.Handler;
import g.a;

public final class c {
    public final FontRequestCallback a;
    public final Handler b;

    public c(FontRequestCallback fontsContractCompat$FontRequestCallback0) {
        this.a = fontsContractCompat$FontRequestCallback0;
        this.b = a.q();
    }

    public c(FontRequestCallback fontsContractCompat$FontRequestCallback0, Handler handler0) {
        this.a = fontsContractCompat$FontRequestCallback0;
        this.b = handler0;
    }

    public final void a(l l0) {
        int v = l0.b;
        Handler handler0 = this.b;
        FontRequestCallback fontsContractCompat$FontRequestCallback0 = this.a;
        if(v == 0) {
            handler0.post(new androidx.core.provider.a(fontsContractCompat$FontRequestCallback0, l0.a));
            return;
        }
        handler0.post(new b(fontsContractCompat$FontRequestCallback0, v));
    }
}

