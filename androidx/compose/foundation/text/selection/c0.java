package androidx.compose.foundation.text.selection;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class c0 extends Lambda implements Function0 {
    public final int w;
    public static final c0 x;
    public static final c0 y;
    public static final c0 z;

    static {
        c0.x = new c0(0, 0);
        c0.y = new c0(0, 1);
        c0.z = new c0(0, 2);
    }

    public c0(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.w) {
            case 0: {
                return new SelectionRegistrarImpl();
            }
            case 1: {
                return null;
            }
            default: {
                return TextSelectionColorsKt.b;
            }
        }
    }
}

