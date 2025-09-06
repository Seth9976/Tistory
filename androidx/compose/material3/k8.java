package androidx.compose.material3;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;

public final class k8 extends Lambda implements Function1 {
    public final Long A;
    public final Function1 B;
    public final CalendarDate C;
    public final DatePickerFormatter D;
    public final SelectableDates E;
    public final DatePickerColors F;
    public final List G;
    public final IntRange w;
    public final CalendarModel x;
    public final CalendarMonth y;
    public final Long z;

    public k8(IntRange intRange0, CalendarModel calendarModel0, CalendarMonth calendarMonth0, Long long0, Long long1, Function1 function10, CalendarDate calendarDate0, DatePickerFormatter datePickerFormatter0, SelectableDates selectableDates0, DatePickerColors datePickerColors0, List list0) {
        this.w = intRange0;
        this.x = calendarModel0;
        this.y = calendarMonth0;
        this.z = long0;
        this.A = long1;
        this.B = function10;
        this.C = calendarDate0;
        this.D = datePickerFormatter0;
        this.E = selectableDates0;
        this.F = datePickerColors0;
        this.G = list0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        LazyListScope.items$default(((LazyListScope)object0), DatePickerKt.numberOfMonthsInRange(this.w), null, null, ComposableLambdaKt.composableLambdaInstance(0xABBFAE3B, true, new j8(this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G)), 6, null);
        return Unit.INSTANCE;
    }
}

