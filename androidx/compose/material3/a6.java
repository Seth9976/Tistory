package androidx.compose.material3;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.room.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.CoroutineScope;

public final class a6 extends Lambda implements Function3 {
    public final IntRange A;
    public final CalendarMonth B;
    public final SelectableDates C;
    public final CalendarModel D;
    public final DatePickerColors E;
    public final long w;
    public final MutableState x;
    public final CoroutineScope y;
    public final LazyListState z;

    public a6(long v, MutableState mutableState0, CoroutineScope coroutineScope0, LazyListState lazyListState0, IntRange intRange0, CalendarMonth calendarMonth0, SelectableDates selectableDates0, CalendarModel calendarModel0, DatePickerColors datePickerColors0) {
        this.w = v;
        this.x = mutableState0;
        this.y = coroutineScope0;
        this.z = lazyListState0;
        this.A = intRange0;
        this.B = calendarMonth0;
        this.C = selectableDates0;
        this.D = calendarModel0;
        this.E = datePickerColors0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        AnimatedVisibilityScope animatedVisibilityScope0 = (AnimatedVisibilityScope)object0;
        Composer composer0 = (Composer)object1;
        int v = ((Number)object2).intValue();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1193716082, v, -1, "androidx.compose.material3.DatePickerContent.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:1556)");
        }
        String s = Strings_androidKt.getString-2EP1pXo(string.m3c_date_picker_year_picker_pane_title, composer0, 0);
        Companion modifier$Companion0 = Modifier.Companion;
        boolean z = composer0.changed(s);
        m m0 = composer0.rememberedValue();
        if(z || m0 == Composer.Companion.getEmpty()) {
            m0 = new m(s, 2);
            composer0.updateRememberedValue(m0);
        }
        Modifier modifier0 = SemanticsModifierKt.semantics$default(modifier$Companion0, false, m0, 1, null);
        MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer0, 0);
        int v1 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
        CompositionLocalMap compositionLocalMap0 = composer0.getCurrentCompositionLocalMap();
        Modifier modifier1 = ComposedModifierKt.materializeModifier(composer0, modifier0);
        androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
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
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v1)) {
            a.t(v1, composer0, v1, function20);
        }
        Updater.set-impl(composer0, modifier1, composeUiNode$Companion0.getSetModifier());
        Modifier modifier2 = PaddingKt.padding-VpY3zN4$default(SizeKt.requiredHeight-3ABfNKs(modifier$Companion0, 336.0f), 12.0f, 0.0f, 2, null);
        MutableState mutableState0 = this.x;
        boolean z1 = composer0.changed(mutableState0);
        CoroutineScope coroutineScope0 = this.y;
        boolean z2 = composer0.changedInstance(coroutineScope0);
        LazyListState lazyListState0 = this.z;
        boolean z3 = composer0.changed(lazyListState0);
        IntRange intRange0 = this.A;
        boolean z4 = composer0.changedInstance(intRange0);
        CalendarMonth calendarMonth0 = this.B;
        boolean z5 = composer0.changed(calendarMonth0);
        z5 z50 = composer0.rememberedValue();
        if((z1 | z2 | z3 | z4 | z5) != 0 || z50 == Composer.Companion.getEmpty()) {
            z50 = new z5(coroutineScope0, mutableState0, lazyListState0, intRange0, calendarMonth0, 0);
            composer0.updateRememberedValue(z50);
        }
        DatePickerKt.access$YearPicker(modifier2, this.w, z50, this.C, this.D, intRange0, this.E, composer0, 6);
        DividerKt.HorizontalDivider-9IZ8Weo(null, 0.0f, this.E.getDividerColor-0d7_KjU(), composer0, 0, 3);
        composer0.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

