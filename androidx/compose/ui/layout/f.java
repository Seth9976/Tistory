package androidx.compose.ui.layout;

import java.util.Map.Entry;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class f extends Lambda implements Function1 {
    public final LayoutNodeSubcompositionsState w;

    public f(LayoutNodeSubcompositionsState layoutNodeSubcompositionsState0) {
        this.w = layoutNodeSubcompositionsState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Object object1 = ((Map.Entry)object0).getKey();
        PrecomposedSlotHandle subcomposeLayoutState$PrecomposedSlotHandle0 = (PrecomposedSlotHandle)((Map.Entry)object0).getValue();
        int v = this.w.m.indexOf(object1);
        if(v >= 0 && v < this.w.e) {
            return false;
        }
        subcomposeLayoutState$PrecomposedSlotHandle0.dispose();
        return true;
    }
}

