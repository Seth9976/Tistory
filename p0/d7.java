package p0;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.material.MutableWindowInsets;
import androidx.compose.material.ScaffoldState;
import androidx.compose.material.SurfaceKt;
import androidx.compose.material3.zk;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import j0.b2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class d7 extends Lambda implements Function3 {
    public final boolean A;
    public final int B;
    public final Function2 C;
    public final Function3 D;
    public final Function2 E;
    public final Function2 F;
    public final Function3 G;
    public final ScaffoldState H;
    public final MutableWindowInsets w;
    public final WindowInsets x;
    public final long y;
    public final long z;

    public d7(MutableWindowInsets mutableWindowInsets0, WindowInsets windowInsets0, long v, long v1, boolean z, int v2, Function2 function20, Function3 function30, Function2 function21, Function2 function22, Function3 function31, ScaffoldState scaffoldState0) {
        this.w = mutableWindowInsets0;
        this.x = windowInsets0;
        this.y = v;
        this.z = v1;
        this.A = z;
        this.B = v2;
        this.C = function20;
        this.D = function30;
        this.E = function21;
        this.F = function22;
        this.G = function31;
        this.H = scaffoldState0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        if((v & 14) == 0) {
            v |= (((Composer)object1).changed(((Modifier)object0)) ? 4 : 2);
        }
        if((v & 91) == 18 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xF2E59CA8, v, -1, "androidx.compose.material.Scaffold.<anonymous> (Scaffold.kt:209)");
        }
        ((Composer)object1).startReplaceableGroup(-757570588);
        MutableWindowInsets mutableWindowInsets0 = this.w;
        boolean z = ((Composer)object1).changed(mutableWindowInsets0);
        WindowInsets windowInsets0 = this.x;
        boolean z1 = ((Composer)object1).changed(windowInsets0);
        b2 b20 = ((Composer)object1).rememberedValue();
        if(z || z1 || b20 == Composer.Companion.getEmpty()) {
            b20 = new b2(13, mutableWindowInsets0, windowInsets0);
            ((Composer)object1).updateRememberedValue(b20);
        }
        ((Composer)object1).endReplaceableGroup();
        Modifier modifier0 = WindowInsetsPaddingKt.onConsumedWindowInsetsChanged(((Modifier)object0), b20);
        ComposableLambda composableLambda0 = ComposableLambdaKt.composableLambda(((Composer)object1), 1772955108, true, new zk(this.A, this.B, this.C, this.D, this.E, this.w, this.F, this.G, this.H));
        SurfaceKt.Surface-F-jzlyU(modifier0, null, this.y, this.z, null, 0.0f, composableLambda0, ((Composer)object1), 0x180000, 50);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

