package androidx.compose.material3;

import androidx.compose.material3.tokens.DialogTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Shape;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class k extends Lambda implements Function2 {
    public final long A;
    public final float B;
    public final long C;
    public final long D;
    public final long E;
    public final Function2 F;
    public final Function2 G;
    public final Function2 w;
    public final Function2 x;
    public final Function2 y;
    public final Shape z;

    public k(Function2 function20, Function2 function21, Function2 function22, Shape shape0, long v, float f, long v1, long v2, long v3, Function2 function23, Function2 function24) {
        this.w = function20;
        this.x = function21;
        this.y = function22;
        this.z = shape0;
        this.A = v;
        this.B = f;
        this.C = v1;
        this.D = v2;
        this.E = v3;
        this.F = function23;
        this.G = function24;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        int v = ((Number)object1).intValue();
        if((v & 3) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x918FE6DE, v, -1, "androidx.compose.material3.AlertDialogImpl.<anonymous> (AlertDialog.kt:252)");
        }
        ComposableLambda composableLambda0 = ComposableLambdaKt.rememberComposableLambda(0x455A457C, true, new j(this.F, this.G, 1), ((Composer)object0), 54);
        long v1 = ColorSchemeKt.getValue(DialogTokens.INSTANCE.getActionLabelTextColor(), ((Composer)object0), 6);
        AlertDialogKt.AlertDialogContent-4hvqGtA(composableLambda0, null, this.w, this.x, this.y, this.z, this.A, this.B, v1, this.C, this.D, this.E, ((Composer)object0), 6, 0, 2);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

