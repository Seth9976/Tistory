package androidx.compose.material3;

import androidx.compose.ui.unit.Density;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class ik extends Lambda implements Function1 {
    public final boolean w;
    public final Density x;
    public final Function1 y;
    public final boolean z;

    public ik(boolean z, Function1 function10, Density density0, boolean z1) {
        this.w = z;
        this.x = density0;
        this.y = function10;
        this.z = z1;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return new SheetState(this.w, this.x, ((SheetValue)object0), this.y, this.z);
    }
}

