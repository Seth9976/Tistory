package androidx.compose.material3;

import androidx.compose.material.icons.Icons.Filled;
import androidx.compose.material.icons.filled.DateRangeKt;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class q4 extends Lambda implements Function2 {
    public static final q4 w;

    static {
        q4.w = new q4(2);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        int v = ((Number)object1).intValue();
        if((v & 3) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(668820324, v, -1, "androidx.compose.material3.ComposableSingletons$DatePickerKt.lambda-2.<anonymous> (DatePicker.kt:1365)");
        }
        IconKt.Icon-ww6aTOc(DateRangeKt.getDateRange(Filled.INSTANCE), Strings_androidKt.getString-2EP1pXo(string.m3c_date_picker_switch_to_calendar_mode, ((Composer)object0), 0), null, 0L, ((Composer)object0), 0, 12);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

