package androidx.compose.material3;

import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class lq extends Lambda implements Function2 {
    public final int A;
    public final KeyboardOptions B;
    public final KeyboardActions C;
    public final TimePickerColors D;
    public final int E;
    public final int F;
    public final Modifier w;
    public final TextFieldValue x;
    public final Function1 y;
    public final TimePickerState z;

    public lq(Modifier modifier0, TextFieldValue textFieldValue0, Function1 function10, TimePickerState timePickerState0, int v, KeyboardOptions keyboardOptions0, KeyboardActions keyboardActions0, TimePickerColors timePickerColors0, int v1, int v2) {
        this.w = modifier0;
        this.x = textFieldValue0;
        this.y = function10;
        this.z = timePickerState0;
        this.A = v;
        this.B = keyboardOptions0;
        this.C = keyboardActions0;
        this.D = timePickerColors0;
        this.E = v1;
        this.F = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        TimePickerKt.access$TimePickerTextField-1vLObsk(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, ((Composer)object0), (this.E | 1) & -920350135 | ((0x24924924 & (this.E | 1)) >> 1 | 306783378 & (this.E | 1)) | (306783378 & (this.E | 1)) << 1 & (0x24924924 & (this.E | 1)), this.F);
        return Unit.INSTANCE;
    }
}

