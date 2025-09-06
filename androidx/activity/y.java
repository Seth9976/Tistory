package androidx.activity;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class y extends Lambda implements Function0 {
    public final int w;
    public final OnBackPressedDispatcher x;

    public y(OnBackPressedDispatcher onBackPressedDispatcher0, int v) {
        this.w = v;
        this.x = onBackPressedDispatcher0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.w) {
            case 0: {
                this.x.onBackPressed();
                return Unit.INSTANCE;
            }
            case 1: {
                this.x.a();
                return Unit.INSTANCE;
            }
            default: {
                this.x.onBackPressed();
                return Unit.INSTANCE;
            }
        }
    }
}

