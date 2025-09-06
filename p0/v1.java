package p0;

import aa.x;
import androidx.compose.material.BottomSheetScaffoldKt;
import androidx.compose.material.BottomSheetScaffoldState;
import androidx.compose.material.BottomSheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Shape;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import o0.e;

public final class v1 extends Lambda implements Function2 {
    public final float A;
    public final int B;
    public final boolean C;
    public final float D;
    public final Shape E;
    public final float F;
    public final long G;
    public final long H;
    public final Function3 I;
    public final Function3 J;
    public final BottomSheetScaffoldState w;
    public final Function2 x;
    public final Function3 y;
    public final Function2 z;

    public v1(BottomSheetScaffoldState bottomSheetScaffoldState0, Function2 function20, Function3 function30, Function2 function21, float f, int v, boolean z, float f1, Shape shape0, float f2, long v1, long v2, Function3 function31, Function3 function32) {
        this.w = bottomSheetScaffoldState0;
        this.x = function20;
        this.y = function30;
        this.z = function21;
        this.A = f;
        this.B = v;
        this.C = z;
        this.D = f1;
        this.E = shape0;
        this.F = f2;
        this.G = v1;
        this.H = v2;
        this.I = function31;
        this.J = function32;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        int v = ((Number)object1).intValue();
        if((v & 11) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xF82FA134, v, -1, "androidx.compose.material.BottomSheetScaffold.<anonymous> (BottomSheetScaffold.kt:466)");
        }
        BottomSheetScaffoldState bottomSheetScaffoldState0 = this.w;
        BottomSheetState bottomSheetState0 = bottomSheetScaffoldState0.getBottomSheetState();
        ComposableLambda composableLambda0 = ComposableLambdaKt.composableLambda(((Composer)object0), -1900337132, true, new u1(this.C, this.w, this.A, this.D, this.E, this.F, this.G, this.H, this.I));
        ComposableLambda composableLambda1 = ComposableLambdaKt.composableLambda(((Composer)object0), 0xC3AF4AD9, true, new x(21, this.J, bottomSheetScaffoldState0));
        ((Composer)object0).startReplaceableGroup(1938010078);
        boolean z = ((Composer)object0).changed(bottomSheetScaffoldState0);
        e e0 = ((Composer)object0).rememberedValue();
        if(z || e0 == Composer.Companion.getEmpty()) {
            e0 = new e(bottomSheetScaffoldState0, 3);
            ((Composer)object0).updateRememberedValue(e0);
        }
        ((Composer)object0).endReplaceableGroup();
        BottomSheetScaffoldKt.access$BottomSheetScaffoldLayout-KCBPh4w(this.x, this.y, composableLambda0, this.z, composableLambda1, this.A, this.B, e0, bottomSheetState0, ((Composer)object0), 0x6180);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

