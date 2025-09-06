package androidx.compose.material3;

import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class oo extends Lambda implements Function3 {
    public final float A;
    public final float B;
    public final InteractionSource w;
    public final boolean x;
    public final boolean y;
    public final TextFieldColors z;

    public oo(boolean z, boolean z1, InteractionSource interactionSource0, TextFieldColors textFieldColors0, float f, float f1) {
        this.w = interactionSource0;
        this.x = z;
        this.y = z1;
        this.z = textFieldColors0;
        this.A = f;
        this.B = f1;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        Modifier modifier0 = (Modifier)object0;
        int v = ((Number)object2).intValue();
        ((Composer)object1).startReplaceGroup(-891038934);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-891038934, v, -1, "androidx.compose.material3.TextFieldDefaults.indicatorLine.<anonymous> (TextFieldDefaults.kt:169)");
        }
        boolean z = ((Boolean)FocusInteractionKt.collectIsFocusedAsState(this.w, ((Composer)object1), 0).getValue()).booleanValue();
        State state0 = TextFieldImplKt.animateBorderStrokeAsState-NuRrP5Q(this.x, this.y, z, this.z, this.A, this.B, ((Composer)object1), 0);
        Modifier modifier1 = TextFieldKt.drawIndicatorLine(Modifier.Companion, state0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ((Composer)object1).endReplaceGroup();
        return modifier1;
    }
}

