package androidx.compose.material3;

import androidx.compose.foundation.text.KeyboardActionScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class cq extends Lambda implements Function1 {
    public final TimePickerState w;

    public cq(TimePickerState timePickerState0) {
        this.w = timePickerState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        KeyboardActionScope keyboardActionScope0 = (KeyboardActionScope)object0;
        this.w.setSelection-6_8s6DQ(1);
        return Unit.INSTANCE;
    }
}

