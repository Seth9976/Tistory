package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class mo extends Lambda implements Function2 {
    public final Shape A;
    public final boolean w;
    public final boolean x;
    public final InteractionSource y;
    public final TextFieldColors z;

    public mo(boolean z, boolean z1, InteractionSource interactionSource0, TextFieldColors textFieldColors0, Shape shape0) {
        this.w = z;
        this.x = z1;
        this.y = interactionSource0;
        this.z = textFieldColors0;
        this.A = shape0;
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
            ComposerKt.traceEventStart(0xE60A6F31, v, -1, "androidx.compose.material3.TextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:265)");
        }
        TextFieldDefaults.INSTANCE.Container-4EFweAY(this.w, this.x, this.y, Modifier.Companion, this.z, this.A, 2.0f, 1.0f, ((Composer)object0), 0x6D80C00, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

