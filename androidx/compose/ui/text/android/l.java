package androidx.compose.ui.text.android;

import android.os.Build.VERSION;
import android.text.StaticLayout.Builder;
import android.text.StaticLayout;
import androidx.annotation.DoNotInline;
import org.jetbrains.annotations.NotNull;

public final class l implements StaticLayoutFactoryImpl {
    @Override  // androidx.compose.ui.text.android.StaticLayoutFactoryImpl
    @DoNotInline
    @NotNull
    public StaticLayout create(@NotNull q q0) {
        StaticLayout.Builder staticLayout$Builder0 = StaticLayout.Builder.obtain(q0.a, q0.b, q0.c, q0.d, q0.e);
        staticLayout$Builder0.setTextDirection(q0.f);
        staticLayout$Builder0.setAlignment(q0.g);
        staticLayout$Builder0.setMaxLines(q0.h);
        staticLayout$Builder0.setEllipsize(q0.i);
        staticLayout$Builder0.setEllipsizedWidth(q0.j);
        staticLayout$Builder0.setLineSpacing(q0.l, q0.k);
        staticLayout$Builder0.setIncludePad(q0.n);
        staticLayout$Builder0.setBreakStrategy(q0.p);
        staticLayout$Builder0.setHyphenationFrequency(q0.s);
        staticLayout$Builder0.setIndents(q0.t, q0.u);
        int v = Build.VERSION.SDK_INT;
        m.a(staticLayout$Builder0, q0.m);
        if(v >= 28) {
            n.a(staticLayout$Builder0, q0.o);
        }
        if(v >= 33) {
            o.b(staticLayout$Builder0, q0.q, q0.r);
        }
        return staticLayout$Builder0.build();
    }

    @Override  // androidx.compose.ui.text.android.StaticLayoutFactoryImpl
    public final boolean isFallbackLineSpacingEnabled(StaticLayout staticLayout0, boolean z) {
        int v = Build.VERSION.SDK_INT;
        if(v >= 33) {
            return o.a(staticLayout0);
        }
        return v >= 28 ? z : false;
    }
}

