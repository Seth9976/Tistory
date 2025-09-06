package androidx.compose.material3;

import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class zp extends Lambda implements Function0 {
    public final int w;
    public final TimePickerState x;

    public zp(TimePickerState timePickerState0, int v) {
        this.w = v;
        this.x = timePickerState0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.w) {
            case 0: {
                this.x.setAfternoon(false);
                return Unit.INSTANCE;
            }
            case 1: {
                this.x.setAfternoon(true);
                return Unit.INSTANCE;
            }
            case 2: {
                return SnapshotStateKt.mutableStateOf$default(new TextFieldValue(CalendarLocale_jvmKt.toLocalString$default(TimePickerKt.getHourForDisplay(this.x), 2, 0, false, 6, null), 0L, null, 6, null), null, 2, null);
            }
            default: {
                return SnapshotStateKt.mutableStateOf$default(new TextFieldValue(CalendarLocale_jvmKt.toLocalString$default(this.x.getMinute(), 2, 0, false, 6, null), 0L, null, 6, null), null, 2, null);
            }
        }
    }
}

