package androidx.compose.material3;

import aa.q;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class eq extends Lambda implements Function1 {
    public final TimePickerState w;
    public final MutableState x;

    public eq(TimePickerState timePickerState0, MutableState mutableState0) {
        this.w = timePickerState0;
        this.x = mutableState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        TextFieldValue textFieldValue0 = TimePickerKt.access$TimeInputImpl$lambda$9(this.x);
        q q0 = new q(this.x, 4);
        TimePickerKt.access$timeInputOnChange-z7XvuPQ(1, this.w, ((TextFieldValue)object0), textFieldValue0, 59, q0);
        return Unit.INSTANCE;
    }
}

