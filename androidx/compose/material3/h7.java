package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.lazy.grid.GridCells.Fixed;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.grid.LazyGridStateKt;
import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.room.a;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.CoroutineScope;

public final class h7 extends Lambda implements Function2 {
    public final Modifier A;
    public final Function1 B;
    public final SelectableDates C;
    public final CalendarModel w;
    public final long x;
    public final IntRange y;
    public final DatePickerColors z;

    public h7(CalendarModel calendarModel0, long v, IntRange intRange0, DatePickerColors datePickerColors0, Modifier modifier0, Function1 function10, SelectableDates selectableDates0) {
        this.w = calendarModel0;
        this.x = v;
        this.y = intRange0;
        this.z = datePickerColors0;
        this.A = modifier0;
        this.B = function10;
        this.C = selectableDates0;
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
            ComposerKt.traceEventStart(1301915789, v, -1, "androidx.compose.material3.YearPicker.<anonymous> (DatePicker.kt:1985)");
        }
        CalendarDate calendarDate0 = this.w.getToday();
        int v1 = this.w.getMonth(calendarDate0).getYear();
        int v2 = this.w.getMonth(this.x).getYear();
        IntRange intRange0 = this.y;
        LazyGridState lazyGridState0 = LazyGridStateKt.rememberLazyGridState(Math.max(0, v2 - intRange0.getFirst() - 3), 0, composer0, 0, 2);
        DatePickerColors datePickerColors0 = this.z;
        long v3 = datePickerColors0.getContainerColor-0d7_KjU();
        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller0 = composer0.rememberedValue();
        Companion composer$Companion0 = Composer.Companion;
        if(compositionScopedCoroutineScopeCanceller0 == composer$Companion0.getEmpty()) {
            compositionScopedCoroutineScopeCanceller0 = a.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer0), composer0);
        }
        CoroutineScope coroutineScope0 = compositionScopedCoroutineScopeCanceller0.getCoroutineScope();
        String s = Strings_androidKt.getString-2EP1pXo(string.m3c_date_picker_scroll_to_earlier_years, composer0, 0);
        String s1 = Strings_androidKt.getString-2EP1pXo(string.m3c_date_picker_scroll_to_later_years, composer0, 0);
        Fixed gridCells$Fixed0 = new Fixed(3);
        Modifier modifier0 = SemanticsModifierKt.semantics$default(BackgroundKt.background-bw27NRU$default(this.A, v3, null, 2, null), false, a5.E, 1, null);
        HorizontalOrVertical arrangement$HorizontalOrVertical0 = Arrangement.INSTANCE.getSpaceEvenly();
        HorizontalOrVertical arrangement$HorizontalOrVertical1 = Arrangement.INSTANCE.spacedBy-0680j_4(16.0f);
        boolean z = composer0.changedInstance(intRange0);
        boolean z1 = composer0.changed(lazyGridState0);
        boolean z2 = composer0.changedInstance(coroutineScope0);
        boolean z3 = composer0.changed(s);
        boolean z4 = composer0.changed(s1);
        boolean z5 = composer0.changed(v2);
        boolean z6 = composer0.changed(v1);
        boolean z7 = composer0.changed(this.B);
        boolean z8 = composer0.changed(this.C);
        boolean z9 = composer0.changed(datePickerColors0);
        g7 g70 = composer0.rememberedValue();
        if((z | z1 | z2 | z3 | z4 | z5 | z6 | z7 | z8 | z9) != 0 || g70 == composer$Companion0.getEmpty()) {
            g70 = new g7(this.y, lazyGridState0, coroutineScope0, s, s1, v2, v1, this.B, this.C, this.z);
            composer0.updateRememberedValue(g70);
        }
        LazyGridDslKt.LazyVerticalGrid(gridCells$Fixed0, modifier0, lazyGridState0, null, false, arrangement$HorizontalOrVertical1, arrangement$HorizontalOrVertical0, null, false, g70, composer0, 0x1B0000, 408);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

