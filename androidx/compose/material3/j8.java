package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.material3.tokens.DatePickerModalTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.room.a;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class j8 extends Lambda implements Function4 {
    public final Function1 A;
    public final CalendarDate B;
    public final DatePickerFormatter C;
    public final SelectableDates D;
    public final DatePickerColors E;
    public final List F;
    public final CalendarModel w;
    public final CalendarMonth x;
    public final Long y;
    public final Long z;

    public j8(CalendarModel calendarModel0, CalendarMonth calendarMonth0, Long long0, Long long1, Function1 function10, CalendarDate calendarDate0, DatePickerFormatter datePickerFormatter0, SelectableDates selectableDates0, DatePickerColors datePickerColors0, List list0) {
        this.w = calendarModel0;
        this.x = calendarMonth0;
        this.y = long0;
        this.z = long1;
        this.A = function10;
        this.B = calendarDate0;
        this.C = datePickerFormatter0;
        this.D = selectableDates0;
        this.E = datePickerColors0;
        this.F = list0;
        super(4);
    }

    @Override  // kotlin.jvm.functions.Function4
    public final Object invoke(Object object0, Object object1, Object object2, Object object3) {
        SelectedRangeInfo selectedRangeInfo1;
        int v = ((Number)object1).intValue();
        Composer composer0 = (Composer)object2;
        int v1 = ((Number)object3).intValue();
        int v2 = (v1 & 6) == 0 ? (composer0.changed(((LazyItemScope)object0)) ? 4 : 2) | v1 : v1;
        if((v1 & 0x30) == 0) {
            v2 |= (composer0.changed(v) ? 0x20 : 16);
        }
        if((v2 & 0x93) == 0x92 && composer0.getSkipping()) {
            composer0.skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xABBFAE3B, v2, -1, "androidx.compose.material3.VerticalMonthsList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DateRangePicker.kt:796)");
        }
        CalendarModel calendarModel0 = this.w;
        CalendarMonth calendarMonth0 = calendarModel0.plusMonths(this.x, v);
        Modifier modifier0 = LazyItemScope.fillParentMaxWidth$default(((LazyItemScope)object0), Modifier.Companion, 0.0f, 1, null);
        MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer0, 0);
        int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
        CompositionLocalMap compositionLocalMap0 = composer0.getCurrentCompositionLocalMap();
        Modifier modifier1 = ComposedModifierKt.materializeModifier(composer0, modifier0);
        Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
        Function0 function00 = composeUiNode$Companion0.getConstructor();
        if(composer0.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer0.startReusableNode();
        if(composer0.getInserting()) {
            composer0.createNode(function00);
        }
        else {
            composer0.useNode();
        }
        Function2 function20 = a.r(composeUiNode$Companion0, composer0, measurePolicy0, composer0, compositionLocalMap0);
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v3)) {
            a.t(v3, composer0, v3, function20);
        }
        Updater.set-impl(composer0, modifier1, composeUiNode$Companion0.getSetModifier());
        TextStyle textStyle0 = TypographyKt.getValue(DatePickerModalTokens.INSTANCE.getRangeSelectionMonthSubheadFont(), composer0, 6);
        DatePickerFormatter datePickerFormatter0 = this.C;
        DatePickerColors datePickerColors0 = this.E;
        TextKt.ProvideTextStyle(textStyle0, ComposableLambdaKt.rememberComposableLambda(0x60AF4934, true, new i8(datePickerFormatter0, calendarMonth0, this.F, datePickerColors0), composer0, 54), composer0, 0x30);
        composer0.startReplaceGroup(2125314509);
        Long long0 = this.y;
        Long long1 = this.z;
        if(long0 == null || long1 == null) {
            selectedRangeInfo1 = null;
        }
        else {
            boolean z = composer0.changed(long0);
            boolean z1 = composer0.changed(long1);
            SelectedRangeInfo selectedRangeInfo0 = composer0.rememberedValue();
            if(z || z1 || selectedRangeInfo0 == Composer.Companion.getEmpty()) {
                CalendarDate calendarDate0 = calendarModel0.getCanonicalDate(((long)long0));
                CalendarDate calendarDate1 = calendarModel0.getCanonicalDate(((long)long1));
                selectedRangeInfo0 = SelectedRangeInfo.Companion.calculateRangeInfo(calendarMonth0, calendarDate0, calendarDate1);
                composer0.updateRememberedValue(selectedRangeInfo0);
            }
            selectedRangeInfo1 = selectedRangeInfo0;
        }
        composer0.endReplaceGroup();
        DatePickerKt.Month(calendarMonth0, this.A, this.B.getUtcTimeMillis(), long0, long1, selectedRangeInfo1, datePickerFormatter0, this.D, datePickerColors0, composer0, 0);
        composer0.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

