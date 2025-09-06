package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class i8 extends Lambda implements Function2 {
    public final DatePickerFormatter w;
    public final CalendarMonth x;
    public final List y;
    public final DatePickerColors z;

    public i8(DatePickerFormatter datePickerFormatter0, CalendarMonth calendarMonth0, List list0, DatePickerColors datePickerColors0) {
        this.w = datePickerFormatter0;
        this.x = calendarMonth0;
        this.y = list0;
        this.z = datePickerColors0;
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
            ComposerKt.traceEventStart(0x60AF4934, v, -1, "androidx.compose.material3.VerticalMonthsList.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DateRangePicker.kt:799)");
        }
        Locale locale0 = CalendarLocale_androidKt.defaultLocale(((Composer)object0), 0);
        String s = this.w.formatMonthYear(this.x.getStartUtcTimeMillis(), locale0);
        if(s == null) {
            s = "-";
        }
        Modifier modifier0 = PaddingKt.padding(Modifier.Companion, DateRangePickerKt.getCalendarMonthSubheadPadding());
        List list0 = this.y;
        boolean z = ((Composer)object0).changedInstance(list0);
        h8 h80 = ((Composer)object0).rememberedValue();
        if(z || h80 == Composer.Companion.getEmpty()) {
            h80 = new h8(list0, 0);
            ((Composer)object0).updateRememberedValue(h80);
        }
        TextKt.Text--4IGK_g(s, SemanticsModifierKt.semantics$default(modifier0, false, h80, 1, null), this.z.getSubheadContentColor-0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, ((Composer)object0), 0, 0, 0x1FFF8);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

