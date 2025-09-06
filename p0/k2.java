package p0;

import androidx.compose.material.ChipColors;
import androidx.compose.material.ChipKt;
import androidx.compose.material.ContentAlphaKt;
import androidx.compose.material3.qp;
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

public final class k2 extends Lambda implements Function2 {
    public final Function3 A;
    public final State w;
    public final Function2 x;
    public final ChipColors y;
    public final boolean z;

    public k2(State state0, Function2 function20, ChipColors chipColors0, boolean z, Function3 function30) {
        this.w = state0;
        this.x = function20;
        this.y = chipColors0;
        this.z = z;
        this.A = function30;
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
            ComposerKt.traceEventStart(0x84A244F, v, -1, "androidx.compose.material.Chip.<anonymous> (Chip.kt:110)");
        }
        CompositionLocalKt.CompositionLocalProvider(ContentAlphaKt.getLocalContentAlpha().provides(Color.getAlpha-impl(ChipKt.access$Chip$lambda$1(this.w))), ComposableLambdaKt.composableLambda(((Composer)object0), 0x27C9C90F, true, new qp(this.x, this.y, this.z, this.A)), ((Composer)object0), ProvidedValue.$stable | 0x30);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

