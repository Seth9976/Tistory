package androidx.compose.material3;

import aa.q;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class bq extends Lambda implements Function1 {
    public final TimePickerState w;
    public final MutableState x;

    public bq(TimePickerState timePickerState0, MutableState mutableState0) {
        this.w = timePickerState0;
        this.x = mutableState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        TextFieldValue textFieldValue0 = TimePickerKt.access$TimeInputImpl$lambda$6(this.x);
        int v = this.w.is24hour() ? 23 : 12;
        q q0 = new q(this.x, 3);
        TimePickerKt.access$timeInputOnChange-z7XvuPQ(0, this.w, ((TextFieldValue)object0), textFieldValue0, v, q0);
        return Unit.INSTANCE;
    }
}

