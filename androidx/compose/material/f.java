package androidx.compose.material;

import androidx.compose.ui.unit.Density;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class f extends Lambda implements Function1 {
    public final Density w;
    public final Function1 x;

    public f(Density density0, Function1 function10) {
        this.w = density0;
        this.x = function10;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return DrawerKt.BottomDrawerState(((BottomDrawerValue)object0), this.w, this.x);
    }
}

