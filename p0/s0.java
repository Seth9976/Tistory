package p0;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.BackdropScaffoldKt;
import androidx.compose.material.BackdropScaffoldState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.room.a;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.text.q;

public final class s0 extends Lambda implements Function2 {
    public final boolean A;
    public final boolean B;
    public final BackdropScaffoldState C;
    public final float D;
    public final Shape E;
    public final long F;
    public final long G;
    public final float H;
    public final float I;
    public final float J;
    public final Function2 K;
    public final long L;
    public final Function3 M;
    public final Modifier w;
    public final ComposableLambda x;
    public final Function1 y;
    public final float z;

    public s0(Modifier modifier0, ComposableLambda composableLambda0, Function1 function10, float f, boolean z, boolean z1, BackdropScaffoldState backdropScaffoldState0, float f1, Shape shape0, long v, long v1, float f2, float f3, float f4, Function2 function20, long v2, Function3 function30) {
        this.w = modifier0;
        this.x = composableLambda0;
        this.y = function10;
        this.z = f;
        this.A = z;
        this.B = z1;
        this.C = backdropScaffoldState0;
        this.D = f1;
        this.E = shape0;
        this.F = v;
        this.G = v1;
        this.H = f2;
        this.I = f3;
        this.J = f4;
        this.K = function20;
        this.L = v2;
        this.M = function30;
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
            ComposerKt.traceEventStart(-1049909631, v, -1, "androidx.compose.material.BackdropScaffold.<anonymous> (BackdropScaffold.kt:299)");
        }
        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller0 = q.h(0x2E20B340, ((Composer)object0), 0xE2A708A4);
        if(compositionScopedCoroutineScopeCanceller0 == Composer.Companion.getEmpty()) {
            compositionScopedCoroutineScopeCanceller0 = a.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, ((Composer)object0)), ((Composer)object0));
        }
        ((Composer)object0).endReplaceableGroup();
        ((Composer)object0).endReplaceableGroup();
        Modifier modifier0 = SizeKt.fillMaxSize$default(this.w, 0.0f, 1, null);
        ComposableLambda composableLambda0 = ComposableLambdaKt.composableLambda(((Composer)object0), 1800047509, true, new r0(this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, compositionScopedCoroutineScopeCanceller0.getCoroutineScope(), this.J, this.K, this.L, this.M));
        BackdropScaffoldKt.access$BackdropStack(modifier0, this.x, this.y, composableLambda0, ((Composer)object0), 0xC30);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

