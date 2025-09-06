package androidx.compose.material3;

import aa.x;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material.MutableWindowInsets;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.material.ScaffoldState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class zk extends Lambda implements Function2 {
    public final Function3 A;
    public final Object B;
    public final Object C;
    public final Object D;
    public final Object E;
    public final Object F;
    public final int w;
    public final boolean x;
    public final int y;
    public final Function3 z;

    public zk(Modifier modifier0, RangeSliderState rangeSliderState0, boolean z, MutableInteractionSource mutableInteractionSource0, MutableInteractionSource mutableInteractionSource1, Function3 function30, Function3 function31, Function3 function32, int v) {
        this.w = 0;
        this.B = modifier0;
        this.C = rangeSliderState0;
        this.x = z;
        this.D = mutableInteractionSource0;
        this.E = mutableInteractionSource1;
        this.z = function30;
        this.A = function31;
        this.F = function32;
        this.y = v;
        super(2);
    }

    public zk(boolean z, int v, Function2 function20, Function3 function30, Function2 function21, MutableWindowInsets mutableWindowInsets0, Function2 function22, Function3 function31, ScaffoldState scaffoldState0) {
        this.w = 1;
        this.x = z;
        this.y = v;
        this.B = function20;
        this.z = function30;
        this.C = function21;
        this.D = mutableWindowInsets0;
        this.E = function22;
        this.A = function31;
        this.F = scaffoldState0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            int v = ((Number)object1).intValue();
            if((v & 11) == 2 && ((Composer)object0).getSkipping()) {
                ((Composer)object0).skipToGroupEnd();
                return Unit.INSTANCE;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1772955108, v, -1, "androidx.compose.material.Scaffold.<anonymous>.<anonymous> (Scaffold.kt:218)");
            }
            ComposableLambda composableLambda0 = ComposableLambdaKt.composableLambda(((Composer)object0), 433906483, true, new x(24, this.A, ((ScaffoldState)this.F)));
            ScaffoldKt.access$ScaffoldLayout-i1QSOvI(this.x, this.y, ((Function2)this.B), this.z, composableLambda0, ((Function2)this.C), ((MutableWindowInsets)this.D), ((Function2)this.E), ((Composer)object0), 0x6000);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
        ((Number)object1).intValue();
        SliderKt.a(((Modifier)this.B), ((RangeSliderState)this.C), this.x, ((MutableInteractionSource)this.D), ((MutableInteractionSource)this.E), this.z, this.A, ((Function3)this.F), ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)));
        return Unit.INSTANCE;
    }
}

