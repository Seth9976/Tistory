package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.DateInputFormat;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.room.a;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000:\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A\u0087\u0001\u0010\u0014\u001A\u00020\b2\b\u0010\u0001\u001A\u0004\u0018\u00010\u00002\b\u0010\u0002\u001A\u0004\u0018\u00010\u00002:\u0010\t\u001A6\u0012\u0015\u0012\u0013\u0018\u00010\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0015\u0012\u0013\u0018\u00010\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00032\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\r\u001A\u00020\f2\u0006\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0011\u001A\u00020\u00102\u0006\u0010\u0013\u001A\u00020\u0012H\u0001¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"", "selectedStartDateMillis", "selectedEndDateMillis", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "startDateMillis", "endDateMillis", "", "onDatesSelectionChange", "Landroidx/compose/material3/internal/CalendarModel;", "calendarModel", "Lkotlin/ranges/IntRange;", "yearRange", "Landroidx/compose/material3/DatePickerFormatter;", "dateFormatter", "Landroidx/compose/material3/SelectableDates;", "selectableDates", "Landroidx/compose/material3/DatePickerColors;", "colors", "DateRangeInputContent", "(Ljava/lang/Long;Ljava/lang/Long;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/internal/CalendarModel;Lkotlin/ranges/IntRange;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDateRangeInput.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateRangeInput.kt\nandroidx/compose/material3/DateRangeInputKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Strings.android.kt\nandroidx/compose/material3/internal/Strings$Companion\n+ 4 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,125:1\n1223#2,6:126\n1223#2,6:136\n1223#2,6:178\n1223#2,6:185\n141#3:132\n144#3:133\n138#3:134\n174#3:135\n156#3:177\n159#3:184\n98#4:142\n96#4,5:143\n101#4:176\n105#4:194\n78#5,6:148\n85#5,4:163\n89#5,2:173\n93#5:193\n368#6,9:154\n377#6:175\n378#6,2:191\n4032#7,6:167\n148#8:195\n*S KotlinDebug\n*F\n+ 1 DateRangeInput.kt\nandroidx/compose/material3/DateRangeInputKt\n*L\n48#1:126,6\n54#1:136,6\n89#1:178,6\n111#1:185,6\n49#1:132\n50#1:133\n51#1:134\n52#1:135\n76#1:177\n99#1:184\n71#1:142\n71#1:143,5\n71#1:176\n71#1:194\n71#1:148,6\n71#1:163,4\n71#1:173,2\n71#1:193\n71#1:154,9\n71#1:175\n71#1:191,2\n71#1:167,6\n124#1:195\n*E\n"})
public final class DateRangeInputKt {
    public static final float a;

    static {
        DateRangeInputKt.a = 8.0f;
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void DateRangeInputContent(@Nullable Long long0, @Nullable Long long1, @NotNull Function2 function20, @NotNull CalendarModel calendarModel0, @NotNull IntRange intRange0, @NotNull DatePickerFormatter datePickerFormatter0, @NotNull SelectableDates selectableDates0, @NotNull DatePickerColors datePickerColors0, @Nullable Composer composer0, int v) {
        int v5;
        Composer composer1 = composer0.startRestartGroup(-607499086);
        int v1 = (v & 6) == 0 ? (composer1.changed(long0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (composer1.changed(long1) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (composer1.changedInstance(function20) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (composer1.changedInstance(calendarModel0) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            v1 |= (composer1.changedInstance(intRange0) ? 0x4000 : 0x2000);
        }
        if((v & 0x30000) == 0) {
            v1 |= (((v & 0x40000) == 0 ? composer1.changed(datePickerFormatter0) : composer1.changedInstance(datePickerFormatter0)) ? 0x20000 : 0x10000);
        }
        if((v & 0x180000) == 0) {
            v1 |= (composer1.changed(selectableDates0) ? 0x100000 : 0x80000);
        }
        if((v & 0xC00000) == 0) {
            v1 |= (composer1.changed(datePickerColors0) ? 0x800000 : 0x400000);
        }
        if((v1 & 0x492493) != 4793490 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-607499086, v1, -1, "androidx.compose.material3.DateRangeInputContent (DateRangeInput.kt:43)");
            }
            Locale locale0 = CalendarLocale_androidKt.defaultLocale(composer1, 0);
            boolean z = composer1.changed(locale0);
            DateInputFormat dateInputFormat0 = composer1.rememberedValue();
            if(z || dateInputFormat0 == Composer.Companion.getEmpty()) {
                dateInputFormat0 = calendarModel0.getDateInputFormat(locale0);
                composer1.updateRememberedValue(dateInputFormat0);
            }
            String s = Strings_androidKt.getString-2EP1pXo(string.m3c_date_input_invalid_for_pattern, composer1, 0);
            String s1 = Strings_androidKt.getString-2EP1pXo(string.m3c_date_input_invalid_year_range, composer1, 0);
            String s2 = Strings_androidKt.getString-2EP1pXo(string.m3c_date_input_invalid_not_allowed, composer1, 0);
            String s3 = Strings_androidKt.getString-2EP1pXo(string.m3c_date_range_input_invalid_range_input, composer1, 0);
            boolean z1 = composer1.changed(dateInputFormat0);
            boolean z2 = (v1 & 0x70000) == 0x20000 || (v1 & 0x40000) != 0 && composer1.changed(datePickerFormatter0);
            DateInputValidator dateInputValidator0 = composer1.rememberedValue();
            if(z1 || z2 || dateInputValidator0 == Composer.Companion.getEmpty()) {
                dateInputValidator0 = new DateInputValidator(intRange0, selectableDates0, dateInputFormat0, datePickerFormatter0, s, s1, s2, s3, null, null, 0x300, null);
                composer1.updateRememberedValue(dateInputValidator0);
            }
            dateInputValidator0.setCurrentStartDateMillis$material3_release(long0);
            dateInputValidator0.setCurrentEndDateMillis$material3_release(long1);
            Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier0 = PaddingKt.padding(modifier$Companion0, DateInputKt.getInputTextFieldPadding());
            MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.spacedBy-0680j_4(DateRangeInputKt.a), Alignment.Companion.getTop(), composer1, 6);
            int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier1 = ComposedModifierKt.materializeModifier(composer1, modifier0);
            androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function00 = composeUiNode$Companion0.getConstructor();
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function00);
            }
            else {
                composer1.useNode();
            }
            Function2 function21 = a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
                a.t(v2, composer1, v2, function21);
            }
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            RowScopeInstance rowScopeInstance0 = RowScopeInstance.INSTANCE;
            String s4 = dateInputFormat0.getPatternWithDelimiters().toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(s4, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            String s5 = Strings_androidKt.getString-2EP1pXo(string.m3c_date_range_picker_start_headline, composer1, 0);
            Modifier modifier2 = RowScope.weight$default(rowScopeInstance0, modifier$Companion0, 0.5f, false, 2, null);
            r7 r70 = composer1.rememberedValue();
            if((((v1 & 0x380) == 0x100 ? 1 : 0) | ((v1 & 0x70) == 0x20 ? 1 : 0)) != 0 || r70 == Composer.Companion.getEmpty()) {
                r70 = new r7(function20, long1, 0);
                composer1.updateRememberedValue(r70);
            }
            int v3 = v1 >> 21 & 14;
            int v4 = 0;
            DateInputKt.DateInputTextField-tQNruF0(modifier2, long0, r70, calendarModel0, ComposableLambdaKt.rememberComposableLambda(801434508, true, new s7(s5, s4), composer1, 54), ComposableLambdaKt.rememberComposableLambda(665407211, true, new t7(s4), composer1, 54), 1, dateInputValidator0, dateInputFormat0, locale0, datePickerColors0, composer1, v1 << 3 & 0x70 | 0x1B6000 | v1 & 0x1C00, v3);
            String s6 = Strings_androidKt.getString-2EP1pXo(string.m3c_date_range_picker_end_headline, composer1, 0);
            Modifier modifier3 = RowScope.weight$default(rowScopeInstance0, modifier$Companion0, 0.5f, false, 2, null);
            if((v1 & 14) == 4) {
                v4 = 1;
            }
            r7 r71 = composer1.rememberedValue();
            if((((v1 & 0x380) == 0x100 ? 1 : 0) | v4) != 0 || r71 == Composer.Companion.getEmpty()) {
                v5 = v1 & 0x70;
                r71 = new r7(function20, long0, 1);
                composer1.updateRememberedValue(r71);
            }
            else {
                v5 = v1 & 0x70;
            }
            DateInputKt.DateInputTextField-tQNruF0(modifier3, long1, r71, calendarModel0, ComposableLambdaKt.rememberComposableLambda(0x36543135, true, new u7(s6, s4), composer1, 54), ComposableLambdaKt.rememberComposableLambda(0xC6AD38D4, true, new v7(s4), composer1, 54), 2, dateInputValidator0, dateInputFormat0, locale0, datePickerColors0, composer1, v5 | 0x1B6000 | v1 & 0x1C00, v3);
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new w7(long0, long1, function20, calendarModel0, intRange0, datePickerFormatter0, selectableDates0, datePickerColors0, v, 0));
        }
    }
}

