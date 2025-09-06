package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Density;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class r4 extends Lambda implements Function2 {
    public final int w;
    public static final r4 x;
    public static final r4 y;

    static {
        r4.x = new r4(2, 0);
        r4.y = new r4(2, 1);
    }

    public r4(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return this.w == 0 ? ((WindowInsets)object0).getBottom(((Density)object1)) : ((WindowInsets)object0).getTop(((Density)object1));
    }
}

