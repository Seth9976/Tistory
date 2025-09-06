package androidx.compose.material3;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;

public final class l6 extends Lambda implements Function1 {
    public final CalendarDate A;
    public final Long B;
    public final DatePickerFormatter C;
    public final SelectableDates D;
    public final DatePickerColors E;
    public final IntRange w;
    public final CalendarModel x;
    public final CalendarMonth y;
    public final Function1 z;

    public l6(IntRange intRange0, CalendarModel calendarModel0, CalendarMonth calendarMonth0, Function1 function10, CalendarDate calendarDate0, Long long0, DatePickerFormatter datePickerFormatter0, SelectableDates selectableDates0, DatePickerColors datePickerColors0) {
        this.w = intRange0;
        this.x = calendarModel0;
        this.y = calendarMonth0;
        this.z = function10;
        this.A = calendarDate0;
        this.B = long0;
        this.C = datePickerFormatter0;
        this.D = selectableDates0;
        this.E = datePickerColors0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        LazyListScope.items$default(((LazyListScope)object0), DatePickerKt.numberOfMonthsInRange(this.w), null, null, ComposableLambdaKt.composableLambdaInstance(1137566309, true, new k6(this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E)), 6, null);
        return Unit.INSTANCE;
    }
}

