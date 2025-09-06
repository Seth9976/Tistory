package androidx.compose.material3;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class t extends Lambda implements Function2 {
    public final Shape A;
    public final long B;
    public final float C;
    public final float D;
    public final BorderStroke E;
    public final Function3 F;
    public final Modifier w;
    public final MutableTransitionState x;
    public final MutableState y;
    public final ScrollState z;

    public t(Modifier modifier0, MutableTransitionState mutableTransitionState0, MutableState mutableState0, ScrollState scrollState0, Shape shape0, long v, float f, float f1, BorderStroke borderStroke0, Function3 function30) {
        this.w = modifier0;
        this.x = mutableTransitionState0;
        this.y = mutableState0;
        this.z = scrollState0;
        this.A = shape0;
        this.B = v;
        this.C = f;
        this.D = f1;
        this.E = borderStroke0;
        this.F = function30;
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
            ComposerKt.traceEventStart(0x7EC6F865, v, -1, "androidx.compose.material3.DropdownMenu.<anonymous> (AndroidMenu.android.kt:73)");
        }
        MenuKt.DropdownMenuContent-Qj0Zi0g(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, ((Composer)object0), MutableTransitionState.$stable << 3 | 0x180);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

