package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class ug extends Lambda implements Function2 {
    public final boolean w;
    public final boolean x;
    public final InteractionSource y;
    public final TextFieldColors z;

    public ug(boolean z, boolean z1, InteractionSource interactionSource0, TextFieldColors textFieldColors0) {
        this.w = z;
        this.x = z1;
        this.y = interactionSource0;
        this.z = textFieldColors0;
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
            ComposerKt.traceEventStart(-1448570018, v, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:873)");
        }
        Shape shape0 = OutlinedTextFieldDefaults.INSTANCE.getShape(((Composer)object0), 6);
        OutlinedTextFieldDefaults.INSTANCE.Container-4EFweAY(this.w, this.x, this.y, Modifier.Companion, this.z, shape0, 2.0f, 1.0f, ((Composer)object0), 0x6D80C00, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

