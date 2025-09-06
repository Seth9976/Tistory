package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.text.TextRange;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class dq extends Lambda implements Function1 {
    public final TimePickerState w;
    public final MutableState x;

    public dq(TimePickerState timePickerState0, MutableState mutableState0) {
        this.w = timePickerState0;
        this.x = mutableState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        boolean z = KeyEvent_androidKt.getUtf16CodePoint-ZmokQxo(((KeyEvent)object0).unbox-impl()) == 0 && TextRange.getStart-impl(TimePickerKt.access$TimeInputImpl$lambda$9(this.x).getSelection-d9O1mEE()) == 0;
        if(z) {
            this.w.setSelection-6_8s6DQ(0);
        }
        return Boolean.valueOf(z);
    }
}

