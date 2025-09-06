package androidx.activity;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class x extends Lambda implements Function1 {
    public final int w;
    public final OnBackPressedDispatcher x;

    public x(OnBackPressedDispatcher onBackPressedDispatcher0, int v) {
        this.w = v;
        this.x = onBackPressedDispatcher0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            Intrinsics.checkNotNullParameter(((BackEventCompat)object0), "backEvent");
            this.x.b(((BackEventCompat)object0));
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(((BackEventCompat)object0), "backEvent");
        this.x.c(((BackEventCompat)object0));
        return Unit.INSTANCE;
    }
}

