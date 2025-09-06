package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class hm extends Lambda implements Function2 {
    public final int w;
    public final SnackbarData x;

    public hm(SnackbarData snackbarData0, int v) {
        this.w = v;
        this.x = snackbarData0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            int v = ((Number)object1).intValue();
            if((v & 3) == 2 && ((Composer)object0).getSkipping()) {
                ((Composer)object0).skipToGroupEnd();
                return Unit.INSTANCE;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x93F5674F, v, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:228)");
            }
            SnackbarData snackbarData0 = this.x;
            boolean z = ((Composer)object0).changed(snackbarData0);
            sl sl0 = ((Composer)object0).rememberedValue();
            if(z || sl0 == Composer.Companion.getEmpty()) {
                sl0 = new sl(snackbarData0, 2);
                ((Composer)object0).updateRememberedValue(sl0);
            }
            IconButtonKt.IconButton(sl0, null, false, null, null, ComposableSingletons.SnackbarKt.INSTANCE.getLambda-1$material3_release(), ((Composer)object0), 0x30000, 30);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
        int v1 = ((Number)object1).intValue();
        if((v1 & 3) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xB4846F7A, v1, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:251)");
        }
        TextKt.Text--4IGK_g(this.x.getVisuals().getMessage(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, ((Composer)object0), 0, 0, 0x1FFFE);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

