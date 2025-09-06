package androidx.compose.material3;

import aa.x;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class iq extends Lambda implements Function3 {
    public final TextFieldValue w;
    public final MutableInteractionSource x;
    public final TextFieldColors y;

    public iq(TextFieldValue textFieldValue0, MutableInteractionSource mutableInteractionSource0, TextFieldColors textFieldColors0) {
        this.w = textFieldValue0;
        this.x = mutableInteractionSource0;
        this.y = textFieldColors0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        if((v & 6) == 0) {
            v |= (((Composer)object1).changedInstance(((Function2)object0)) ? 4 : 2);
        }
        if((v & 19) == 18 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(825138052, v, -1, "androidx.compose.material3.TimePickerTextField.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1820)");
        }
        String s = this.w.getText();
        PaddingValues paddingValues0 = PaddingKt.PaddingValues-0680j_4(0.0f);
        ComposableLambda composableLambda0 = ComposableLambdaKt.rememberComposableLambda(-833003881, true, new x(10, this.x, this.y), ((Composer)object1), 54);
        OutlinedTextFieldDefaults.INSTANCE.DecorationBox(s, ((Function2)object0), true, true, VisualTransformation.Companion.getNone(), this.x, false, null, null, null, null, null, null, null, this.y, paddingValues0, composableLambda0, ((Composer)object1), v << 3 & 0x70 | 0x36D80, 0xDB0000, 0x3FC0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

