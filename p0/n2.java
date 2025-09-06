package p0;

import androidx.compose.material.ContentAlphaKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.SelectableChipColors;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Color;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class n2 extends Lambda implements Function2 {
    public final Function2 A;
    public final Function2 B;
    public final Function3 C;
    public final SelectableChipColors D;
    public final boolean E;
    public final int w;
    public final State x;
    public final Function2 y;
    public final boolean z;

    public n2(State state0, Function2 function20, boolean z, Function2 function21, Function2 function22, Function3 function30, SelectableChipColors selectableChipColors0, boolean z1) {
        this.w = 1;
        this.x = state0;
        this.y = function20;
        this.z = z;
        this.A = function21;
        this.B = function22;
        this.C = function30;
        this.D = selectableChipColors0;
        this.E = z1;
        super(2);
    }

    public n2(Function2 function20, boolean z, Function2 function21, Function2 function22, Function3 function30, SelectableChipColors selectableChipColors0, boolean z1, State state0) {
        this.w = 0;
        this.y = function20;
        this.z = z;
        this.A = function21;
        this.B = function22;
        this.C = function30;
        this.D = selectableChipColors0;
        this.E = z1;
        this.x = state0;
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
                ComposerKt.traceEventStart(0x2B0AC65F, v, -1, "androidx.compose.material.FilterChip.<anonymous> (Chip.kt:211)");
            }
            CompositionLocalKt.CompositionLocalProvider(ContentAlphaKt.getLocalContentAlpha().provides(Color.getAlpha-impl(((Color)this.x.getValue()).unbox-impl())), ComposableLambdaKt.composableLambda(((Composer)object0), 0x5E4FD99F, true, new n2(this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.x)), ((Composer)object0), ProvidedValue.$stable | 0x30);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
        int v1 = ((Number)object1).intValue();
        if((v1 & 11) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x5E4FD99F, v1, -1, "androidx.compose.material.FilterChip.<anonymous>.<anonymous> (Chip.kt:212)");
        }
        TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(((Composer)object0), 6).getBody2(), ComposableLambdaKt.composableLambda(((Composer)object0), 0xA3FCF9CE, true, new m2(this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.x)), ((Composer)object0), 0x30);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

