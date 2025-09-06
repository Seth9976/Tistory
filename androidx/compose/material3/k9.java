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

public final class k9 extends Lambda implements Function2 {
    public final MutableState A;
    public final ScrollState B;
    public final Shape C;
    public final long D;
    public final float E;
    public final float F;
    public final BorderStroke G;
    public final Function3 H;
    public final ExposedDropdownMenuBoxScope w;
    public final Modifier x;
    public final boolean y;
    public final MutableTransitionState z;

    public k9(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope0, Modifier modifier0, boolean z, MutableTransitionState mutableTransitionState0, MutableState mutableState0, ScrollState scrollState0, Shape shape0, long v, float f, float f1, BorderStroke borderStroke0, Function3 function30) {
        this.w = exposedDropdownMenuBoxScope0;
        this.x = modifier0;
        this.y = z;
        this.z = mutableTransitionState0;
        this.A = mutableState0;
        this.B = scrollState0;
        this.C = shape0;
        this.D = v;
        this.E = f;
        this.F = f1;
        this.G = borderStroke0;
        this.H = function30;
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
            ComposerKt.traceEventStart(0xBF7C3019, v, -1, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu.<anonymous> (ExposedDropdownMenu.android.kt:379)");
        }
        MenuKt.DropdownMenuContent-Qj0Zi0g(this.w.exposedDropdownSize(this.x, this.y), this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, ((Composer)object0), MutableTransitionState.$stable << 3 | 0x180);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

