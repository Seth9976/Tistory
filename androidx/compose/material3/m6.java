package androidx.compose.material3;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;

public final class m6 extends Lambda implements Function2 {
    public final Function1 A;
    public final CalendarDate B;
    public final Long C;
    public final DatePickerFormatter D;
    public final SelectableDates E;
    public final DatePickerColors F;
    public final LazyListState w;
    public final IntRange x;
    public final CalendarModel y;
    public final CalendarMonth z;

    public m6(LazyListState lazyListState0, IntRange intRange0, CalendarModel calendarModel0, CalendarMonth calendarMonth0, Function1 function10, CalendarDate calendarDate0, Long long0, DatePickerFormatter datePickerFormatter0, SelectableDates selectableDates0, DatePickerColors datePickerColors0) {
        this.w = lazyListState0;
        this.x = intRange0;
        this.y = calendarModel0;
        this.z = calendarMonth0;
        this.A = function10;
        this.B = calendarDate0;
        this.C = long0;
        this.D = datePickerFormatter0;
        this.E = selectableDates0;
        this.F = datePickerColors0;
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
            ComposerKt.traceEventStart(1504086906, v, -1, "androidx.compose.material3.HorizontalMonthsList.<anonymous> (DatePicker.kt:1646)");
        }
        Modifier modifier0 = SemanticsModifierKt.semantics$default(Modifier.Companion, false, a5.z, 1, null);
        LazyListState lazyListState0 = this.w;
        FlingBehavior flingBehavior0 = DatePickerDefaults.INSTANCE.rememberSnapFlingBehavior$material3_release(lazyListState0, null, ((Composer)object0), 0x180, 2);
        boolean z = ((Composer)object0).changedInstance(this.x);
        boolean z1 = ((Composer)object0).changedInstance(this.y);
        boolean z2 = ((Composer)object0).changed(this.z);
        boolean z3 = ((Composer)object0).changed(this.A);
        boolean z4 = ((Composer)object0).changed(this.B);
        boolean z5 = ((Composer)object0).changed(this.C);
        boolean z6 = ((Composer)object0).changedInstance(this.D);
        boolean z7 = ((Composer)object0).changed(this.E);
        boolean z8 = ((Composer)object0).changed(this.F);
        l6 l60 = ((Composer)object0).rememberedValue();
        if((z | z1 | z2 | z3 | z4 | z5 | z6 | z7 | z8) != 0 || l60 == Composer.Companion.getEmpty()) {
            l60 = new l6(this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F);
            ((Composer)object0).updateRememberedValue(l60);
        }
        LazyDslKt.LazyRow(modifier0, lazyListState0, null, false, null, null, flingBehavior0, false, l60, ((Composer)object0), 0, 0xBC);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

