package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class s4 extends Lambda implements Function3 {
    public final int w;
    public static final s4 x;
    public static final s4 y;

    static {
        s4.x = new s4(3, 0);
        s4.y = new s4(3, 1);
    }

    public s4(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        if(this.w != 0) {
            return ((LayoutDirection)object1) == LayoutDirection.Ltr ? ((WindowInsets)object0).getLeft(((Density)object2), ((LayoutDirection)object1)) : ((WindowInsets)object0).getRight(((Density)object2), ((LayoutDirection)object1));
        }
        return ((LayoutDirection)object1) == LayoutDirection.Rtl ? ((WindowInsets)object0).getLeft(((Density)object2), ((LayoutDirection)object1)) : ((WindowInsets)object0).getRight(((Density)object2), ((LayoutDirection)object1));
    }
}

