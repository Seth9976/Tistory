package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.text.TextRange;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class aq extends Lambda implements Function1 {
    public final TimePickerState w;
    public final MutableState x;

    public aq(TimePickerState timePickerState0, MutableState mutableState0) {
        this.w = timePickerState0;
        this.x = mutableState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        int v = KeyEvent_androidKt.getUtf16CodePoint-ZmokQxo(((KeyEvent)object0).unbox-impl());
        if(0x30 <= v && v < 58 && (TextRange.getStart-impl(TimePickerKt.access$TimeInputImpl$lambda$6(this.x).getSelection-d9O1mEE()) == 2 && TimePickerKt.access$TimeInputImpl$lambda$6(this.x).getText().length() == 2)) {
            this.w.setSelection-6_8s6DQ(1);
        }
        return false;
    }
}

