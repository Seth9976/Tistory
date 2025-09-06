package androidx.compose.material3;

import androidx.compose.material.ListItemKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class lp extends Lambda implements Function2 {
    public final int A;
    public final int B;
    public final int w;
    public final float x;
    public final Modifier y;
    public final Function2 z;

    public lp(float f, Modifier modifier0, Function2 function20, int v, int v1) {
        this.w = 1;
        this.x = f;
        this.y = modifier0;
        this.z = function20;
        this.A = v;
        this.B = v1;
        super(2);
    }

    public lp(Modifier modifier0, float f, Function2 function20, int v, int v1) {
        this.w = 0;
        this.y = modifier0;
        this.x = f;
        this.z = function20;
        this.A = v;
        this.B = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            ((Number)object1).intValue();
            ListItemKt.access$OffsetToBaselineOrCenter-Kz89ssw(this.x, this.y, this.z, ((Composer)object0), RecomposeScopeImplKt.updateChangedFlags(this.A | 1), this.B);
            return Unit.INSTANCE;
        }
        ((Number)object1).intValue();
        TimePickerKt.access$CircularLayout-uFdPcIQ(this.y, this.x, this.z, ((Composer)object0), RecomposeScopeImplKt.updateChangedFlags(this.A | 1), this.B);
        return Unit.INSTANCE;
    }
}

