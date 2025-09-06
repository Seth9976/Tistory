package p0;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material.TextFieldColors;
import androidx.compose.material.TextFieldDefaults;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Shape;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class d6 extends Lambda implements Function2 {
    public final TextFieldColors A;
    public final Shape B;
    public final int w;
    public final boolean x;
    public final boolean y;
    public final MutableInteractionSource z;

    public d6(boolean z, boolean z1, MutableInteractionSource mutableInteractionSource0, TextFieldColors textFieldColors0, Shape shape0, int v) {
        this.w = v;
        this.x = z;
        this.y = z1;
        this.z = mutableInteractionSource0;
        this.A = textFieldColors0;
        this.B = shape0;
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
                ComposerKt.traceEventStart(0xD314CE82, v, -1, "androidx.compose.material.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:410)");
            }
            TextFieldDefaults.INSTANCE.BorderBox-nbWgWpA(this.x, this.y, this.z, this.A, this.B, 0.0f, 0.0f, ((Composer)object0), 0xC00000, 0x60);
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
            ComposerKt.traceEventStart(0x934A5C2F, v1, -1, "androidx.compose.material.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:208)");
        }
        TextFieldDefaults.INSTANCE.BorderBox-nbWgWpA(this.x, this.y, this.z, this.A, this.B, 0.0f, 0.0f, ((Composer)object0), 0xC00000, 0x60);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

