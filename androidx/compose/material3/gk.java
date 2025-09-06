package androidx.compose.material3;

import androidx.compose.ui.unit.Density;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class gk extends Lambda implements Function0 {
    public final boolean A;
    public final boolean w;
    public final Density x;
    public final SheetValue y;
    public final Function1 z;

    public gk(boolean z, Density density0, SheetValue sheetValue0, Function1 function10, boolean z1) {
        this.w = z;
        this.x = density0;
        this.y = sheetValue0;
        this.z = function10;
        this.A = z1;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new SheetState(this.w, this.x, this.y, this.z, this.A);
    }
}

