package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.room.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class k6 extends Lambda implements Function4 {
    public final Long A;
    public final DatePickerFormatter B;
    public final SelectableDates C;
    public final DatePickerColors D;
    public final CalendarModel w;
    public final CalendarMonth x;
    public final Function1 y;
    public final CalendarDate z;

    public k6(CalendarModel calendarModel0, CalendarMonth calendarMonth0, Function1 function10, CalendarDate calendarDate0, Long long0, DatePickerFormatter datePickerFormatter0, SelectableDates selectableDates0, DatePickerColors datePickerColors0) {
        this.w = calendarModel0;
        this.x = calendarMonth0;
        this.y = function10;
        this.z = calendarDate0;
        this.A = long0;
        this.B = datePickerFormatter0;
        this.C = selectableDates0;
        this.D = datePickerColors0;
        super(4);
    }

    @Override  // kotlin.jvm.functions.Function4
    public final Object invoke(Object object0, Object object1, Object object2, Object object3) {
        int v = ((Number)object1).intValue();
        int v1 = ((Number)object3).intValue();
        int v2 = (v1 & 6) == 0 ? (((Composer)object2).changed(((LazyItemScope)object0)) ? 4 : 2) | v1 : v1;
        if((v1 & 0x30) == 0) {
            v2 |= (((Composer)object2).changed(v) ? 0x20 : 16);
        }
        if((v2 & 0x93) == 0x92 && ((Composer)object2).getSkipping()) {
            ((Composer)object2).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1137566309, v2, -1, "androidx.compose.material3.HorizontalMonthsList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:1658)");
        }
        CalendarMonth calendarMonth0 = this.w.plusMonths(this.x, v);
        Modifier modifier0 = LazyItemScope.fillParentMaxWidth$default(((LazyItemScope)object0), Modifier.Companion, 0.0f, 1, null);
        MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
        int v3 = ComposablesKt.getCurrentCompositeKeyHash(((Composer)object2), 0);
        CompositionLocalMap compositionLocalMap0 = ((Composer)object2).getCurrentCompositionLocalMap();
        Modifier modifier1 = ComposedModifierKt.materializeModifier(((Composer)object2), modifier0);
        Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
        Function0 function00 = composeUiNode$Companion0.getConstructor();
        if(((Composer)object2).getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        ((Composer)object2).startReusableNode();
        if(((Composer)object2).getInserting()) {
            ((Composer)object2).createNode(function00);
        }
        else {
            ((Composer)object2).useNode();
        }
        Composer composer0 = Updater.constructor-impl(((Composer)object2));
        Function2 function20 = a.r(composeUiNode$Companion0, composer0, measurePolicy0, composer0, compositionLocalMap0);
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v3)) {
            a.t(v3, composer0, v3, function20);
        }
        Updater.set-impl(composer0, modifier1, composeUiNode$Companion0.getSetModifier());
        DatePickerKt.Month(calendarMonth0, this.y, this.z.getUtcTimeMillis(), this.A, null, null, this.B, this.C, this.D, ((Composer)object2), 0x36000);
        ((Composer)object2).endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

