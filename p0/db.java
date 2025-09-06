package p0;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.material.TextFieldColors;
import androidx.compose.material.TextFieldDefaultsKt;
import androidx.compose.material.TextFieldKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class db extends Lambda implements Function3 {
    public final float A;
    public final float B;
    public final boolean w;
    public final boolean x;
    public final InteractionSource y;
    public final TextFieldColors z;

    public db(boolean z, boolean z1, InteractionSource interactionSource0, TextFieldColors textFieldColors0, float f, float f1) {
        this.w = z;
        this.x = z1;
        this.y = interactionSource0;
        this.z = textFieldColors0;
        this.A = f;
        this.B = f1;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        Modifier modifier0 = (Modifier)object0;
        int v = ((Number)object2).intValue();
        ((Composer)object1).startReplaceableGroup(0x5361FD9D);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x5361FD9D, v, -1, "androidx.compose.material.TextFieldDefaults.indicatorLine.<anonymous> (TextFieldDefaults.kt:299)");
        }
        BorderStroke borderStroke0 = (BorderStroke)TextFieldDefaultsKt.access$animateBorderStrokeAsState-NuRrP5Q(this.w, this.x, this.y, this.z, this.A, this.B, ((Composer)object1), 0).getValue();
        Modifier modifier1 = TextFieldKt.drawIndicatorLine(Modifier.Companion, borderStroke0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ((Composer)object1).endReplaceableGroup();
        return modifier1;
    }
}

