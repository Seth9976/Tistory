package p0;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.material.TextFieldColors;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class jb extends Lambda implements Function3 {
    public final TextFieldColors w;
    public final boolean x;
    public final boolean y;
    public final InteractionSource z;

    public jb(InteractionSource interactionSource0, TextFieldColors textFieldColors0, boolean z, boolean z1) {
        this.w = textFieldColors0;
        this.x = z;
        this.y = z1;
        this.z = interactionSource0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ((Composer)object1).startReplaceableGroup(0x298F18C6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x298F18C6, v, -1, "androidx.compose.material.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:91)");
        }
        long v1 = ((Color)this.w.labelColor(this.x, (((s4)object0) == s4.b ? false : this.y), this.z, ((Composer)object1), 0).getValue()).unbox-impl();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ((Composer)object1).endReplaceableGroup();
        return Color.box-impl(v1);
    }
}

