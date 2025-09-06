package androidx.compose.material3;

import aa.r;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.room.a;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.CoroutineScope;

public final class l8 extends Lambda implements Function2 {
    public final IntRange A;
    public final CalendarModel B;
    public final CalendarMonth C;
    public final DatePickerFormatter D;
    public final DatePickerColors E;
    public final CalendarDate F;
    public final SelectableDates G;
    public final Long w;
    public final Long x;
    public final Function2 y;
    public final LazyListState z;

    public l8(Long long0, Long long1, Function2 function20, LazyListState lazyListState0, IntRange intRange0, CalendarModel calendarModel0, CalendarMonth calendarMonth0, DatePickerFormatter datePickerFormatter0, DatePickerColors datePickerColors0, CalendarDate calendarDate0, SelectableDates selectableDates0) {
        this.w = long0;
        this.x = long1;
        this.y = function20;
        this.z = lazyListState0;
        this.A = intRange0;
        this.B = calendarModel0;
        this.C = calendarMonth0;
        this.D = datePickerFormatter0;
        this.E = datePickerColors0;
        this.F = calendarDate0;
        this.G = selectableDates0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        Composer composer0 = (Composer)object0;
        int v = ((Number)object1).intValue();
        if((v & 3) == 2 && composer0.getSkipping()) {
            composer0.skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1090773432, v, -1, "androidx.compose.material3.VerticalMonthsList.<anonymous> (DateRangePicker.kt:763)");
        }
        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller0 = composer0.rememberedValue();
        Companion composer$Companion0 = Composer.Companion;
        if(compositionScopedCoroutineScopeCanceller0 == composer$Companion0.getEmpty()) {
            compositionScopedCoroutineScopeCanceller0 = a.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer0), composer0);
        }
        CoroutineScope coroutineScope0 = compositionScopedCoroutineScopeCanceller0.getCoroutineScope();
        String s = Strings_androidKt.getString-2EP1pXo(string.m3c_date_range_picker_scroll_to_previous_month, composer0, 0);
        String s1 = Strings_androidKt.getString-2EP1pXo(string.m3c_date_range_picker_scroll_to_next_month, composer0, 0);
        Long long0 = this.w;
        boolean z = composer0.changed(long0);
        Long long1 = this.x;
        boolean z1 = composer0.changed(long1);
        Function2 function20 = this.y;
        boolean z2 = composer0.changed(function20);
        r r0 = composer0.rememberedValue();
        if((z | z1 | z2) != 0 || r0 == composer$Companion0.getEmpty()) {
            r0 = new r(long0, long1, 2, function20);
            composer0.updateRememberedValue(r0);
        }
        List list0 = DateRangePickerKt.access$customScrollActions(this.z, coroutineScope0, s, s1);
        Modifier modifier0 = SemanticsModifierKt.semantics$default(Modifier.Companion, false, a5.J, 1, null);
        boolean z3 = composer0.changedInstance(this.A);
        boolean z4 = composer0.changedInstance(this.B);
        boolean z5 = composer0.changed(this.C);
        boolean z6 = composer0.changedInstance(this.D);
        boolean z7 = composer0.changedInstance(list0);
        boolean z8 = composer0.changed(this.E);
        boolean z9 = composer0.changed(long0);
        boolean z10 = composer0.changed(long1);
        boolean z11 = composer0.changed(r0);
        boolean z12 = composer0.changed(this.F);
        boolean z13 = composer0.changed(this.G);
        k8 k80 = composer0.rememberedValue();
        if((z3 | z4 | z5 | z6 | z7 | z8 | z9 | z10 | z11 | z12 | z13) != 0 || k80 == composer$Companion0.getEmpty()) {
            k80 = new k8(this.A, this.B, this.C, this.w, this.x, r0, this.F, this.D, this.G, this.E, list0);
            composer0.updateRememberedValue(k80);
        }
        LazyDslKt.LazyColumn(modifier0, this.z, null, false, null, null, null, false, k80, composer0, 0, 0xFC);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

