package androidx.compose.material3;

import a5.b;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt;
import androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.DatePickerModalTokens;
import androidx.compose.material3.tokens.DividerTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ExperimentalMaterial3Api
@Stable
@Metadata(d1 = {"\u0000\u008C\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00C7\u0002\u0018\u00002\u00020\u0001J\u000F\u0010\u0003\u001A\u00020\u0002H\u0007\u00A2\u0006\u0004\b\u0003\u0010\u0004J\u008E\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00052\b\b\u0002\u0010\t\u001A\u00020\u00052\b\b\u0002\u0010\n\u001A\u00020\u00052\b\b\u0002\u0010\u000B\u001A\u00020\u00052\b\b\u0002\u0010\f\u001A\u00020\u00052\b\b\u0002\u0010\r\u001A\u00020\u00052\b\b\u0002\u0010\u000E\u001A\u00020\u00052\b\b\u0002\u0010\u000F\u001A\u00020\u00052\b\b\u0002\u0010\u0010\u001A\u00020\u00052\b\b\u0002\u0010\u0011\u001A\u00020\u00052\b\b\u0002\u0010\u0012\u001A\u00020\u00052\b\b\u0002\u0010\u0013\u001A\u00020\u00052\b\b\u0002\u0010\u0014\u001A\u00020\u00052\b\b\u0002\u0010\u0015\u001A\u00020\u00052\b\b\u0002\u0010\u0016\u001A\u00020\u00052\b\b\u0002\u0010\u0017\u001A\u00020\u00052\b\b\u0002\u0010\u0018\u001A\u00020\u00052\b\b\u0002\u0010\u0019\u001A\u00020\u00052\b\b\u0002\u0010\u001A\u001A\u00020\u00052\b\b\u0002\u0010\u001B\u001A\u00020\u00052\b\b\u0002\u0010\u001C\u001A\u00020\u00052\b\b\u0002\u0010\u001D\u001A\u00020\u00052\n\b\u0002\u0010\u001F\u001A\u0004\u0018\u00010\u001EH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b \u0010!J+\u0010\'\u001A\u00020&2\b\b\u0002\u0010#\u001A\u00020\"2\b\b\u0002\u0010$\u001A\u00020\"2\b\b\u0002\u0010%\u001A\u00020\"\u00A2\u0006\u0004\b\'\u0010(J$\u00100\u001A\u00020-2\u0006\u0010*\u001A\u00020)2\b\b\u0002\u0010,\u001A\u00020+H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b.\u0010/J6\u00105\u001A\u00020-2\b\u00102\u001A\u0004\u0018\u0001012\u0006\u0010*\u001A\u00020)2\u0006\u0010\'\u001A\u00020&2\b\b\u0002\u0010,\u001A\u00020+H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b3\u00104J\'\u0010>\u001A\u00020;2\u0006\u00107\u001A\u0002062\u000E\b\u0002\u0010:\u001A\b\u0012\u0004\u0012\u00020908H\u0001\u00A2\u0006\u0004\b<\u0010=R\u0017\u0010D\u001A\u00020?8\u0006\u00A2\u0006\f\n\u0004\b@\u0010A\u001A\u0004\bB\u0010CR\u001D\u0010J\u001A\u00020E8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bF\u0010G\u001A\u0004\bH\u0010IR\u0017\u0010P\u001A\u00020K8\u0006\u00A2\u0006\f\n\u0004\bL\u0010M\u001A\u0004\bN\u0010OR\u0014\u0010Q\u001A\u00020\"8\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010S\u001A\u00020\"8\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\bS\u0010RR\u0014\u0010T\u001A\u00020\"8\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\bT\u0010RR\u0018\u0010X\u001A\u00020\u0002*\u00020U8AX\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\bV\u0010WR\u0011\u0010\\\u001A\u00020Y8G\u00A2\u0006\u0006\u001A\u0004\bZ\u0010[\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006]"}, d2 = {"Landroidx/compose/material3/DatePickerDefaults;", "", "Landroidx/compose/material3/DatePickerColors;", "colors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/DatePickerColors;", "Landroidx/compose/ui/graphics/Color;", "containerColor", "titleContentColor", "headlineContentColor", "weekdayContentColor", "subheadContentColor", "navigationContentColor", "yearContentColor", "disabledYearContentColor", "currentYearContentColor", "selectedYearContentColor", "disabledSelectedYearContentColor", "selectedYearContainerColor", "disabledSelectedYearContainerColor", "dayContentColor", "disabledDayContentColor", "selectedDayContentColor", "disabledSelectedDayContentColor", "selectedDayContainerColor", "disabledSelectedDayContainerColor", "todayContentColor", "todayDateBorderColor", "dayInSelectionRangeContentColor", "dayInSelectionRangeContainerColor", "dividerColor", "Landroidx/compose/material3/TextFieldColors;", "dateTextFieldColors", "colors-bSRYm20", "(JJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;IIII)Landroidx/compose/material3/DatePickerColors;", "", "yearSelectionSkeleton", "selectedDateSkeleton", "selectedDateDescriptionSkeleton", "Landroidx/compose/material3/DatePickerFormatter;", "dateFormatter", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroidx/compose/material3/DatePickerFormatter;", "Landroidx/compose/material3/DisplayMode;", "displayMode", "Landroidx/compose/ui/Modifier;", "modifier", "", "DatePickerTitle-hOD91z4", "(ILandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "DatePickerTitle", "", "selectedDateMillis", "DatePickerHeadline-3kbWawI", "(Ljava/lang/Long;ILandroidx/compose/material3/DatePickerFormatter;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "DatePickerHeadline", "Landroidx/compose/foundation/lazy/LazyListState;", "lazyListState", "Landroidx/compose/animation/core/DecayAnimationSpec;", "", "decayAnimationSpec", "Landroidx/compose/foundation/gestures/FlingBehavior;", "rememberSnapFlingBehavior$material3_release", "(Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/gestures/FlingBehavior;", "rememberSnapFlingBehavior", "Lkotlin/ranges/IntRange;", "a", "Lkotlin/ranges/IntRange;", "getYearRange", "()Lkotlin/ranges/IntRange;", "YearRange", "Landroidx/compose/ui/unit/Dp;", "b", "F", "getTonalElevation-D9Ej5fM", "()F", "TonalElevation", "Landroidx/compose/material3/SelectableDates;", "c", "Landroidx/compose/material3/SelectableDates;", "getAllDates", "()Landroidx/compose/material3/SelectableDates;", "AllDates", "YearMonthSkeleton", "Ljava/lang/String;", "YearAbbrMonthDaySkeleton", "YearMonthWeekdayDaySkeleton", "Landroidx/compose/material3/ColorScheme;", "getDefaultDatePickerColors", "(Landroidx/compose/material3/ColorScheme;Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/DatePickerColors;", "defaultDatePickerColors", "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "shape", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerDefaults\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Strings.android.kt\nandroidx/compose/material3/internal/Strings$Companion\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,2252:1\n1#2:2253\n84#3:2254\n123#3:2255\n111#3:2256\n135#3:2257\n87#3:2258\n126#3:2259\n108#3:2260\n132#3:2261\n1223#4,6:2262\n1223#4,6:2268\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerDefaults\n*L\n629#1:2254\n631#1:2255\n662#1:2256\n663#1:2257\n670#1:2258\n671#1:2259\n677#1:2260\n678#1:2261\n685#1:2262,6\n705#1:2268,6\n*E\n"})
public final class DatePickerDefaults {
    public static final int $stable = 0;
    @NotNull
    public static final DatePickerDefaults INSTANCE = null;
    @NotNull
    public static final String YearAbbrMonthDaySkeleton = "yMMMd";
    @NotNull
    public static final String YearMonthSkeleton = "yMMMM";
    @NotNull
    public static final String YearMonthWeekdayDaySkeleton = "yMMMMEEEEd";
    public static final IntRange a;
    public static final float b;
    public static final DatePickerDefaults.AllDates.1 c;

    static {
        DatePickerDefaults.INSTANCE = new DatePickerDefaults();  // 初始化器: Ljava/lang/Object;-><init>()V
        DatePickerDefaults.a = new IntRange(1900, 2100);
        DatePickerDefaults.b = 0.0f;
        DatePickerDefaults.c = new DatePickerDefaults.AllDates.1();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void DatePickerHeadline-3kbWawI(@Nullable Long long0, int v, @NotNull DatePickerFormatter datePickerFormatter0, @Nullable Modifier modifier0, @Nullable Composer composer0, int v1, int v2) {
        Modifier modifier1;
        int v3;
        Composer composer1 = composer0.startRestartGroup(1502835813);
        if((v2 & 1) == 0) {
            v3 = (v1 & 6) == 0 ? (composer1.changed(long0) ? 4 : 2) | v1 : v1;
        }
        else {
            v3 = v1 | 6;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
        }
        else if((v1 & 0x30) == 0) {
            v3 |= (composer1.changed(v) ? 0x20 : 16);
        }
        if((v2 & 4) != 0) {
            v3 |= 0x180;
        }
        else if((v1 & 0x180) == 0) {
            v3 |= (((v1 & 0x200) == 0 ? composer1.changed(datePickerFormatter0) : composer1.changedInstance(datePickerFormatter0)) ? 0x100 : 0x80);
        }
        if((v2 & 8) != 0) {
            v3 |= 0xC00;
        }
        else if((v1 & 0xC00) == 0) {
            v3 |= (composer1.changed(modifier0) ? 0x800 : 0x400);
        }
        if((v3 & 0x493) != 1170 || !composer1.getSkipping()) {
            Modifier modifier2 = (v2 & 8) == 0 ? modifier0 : Modifier.Companion;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1502835813, v3, -1, "androidx.compose.material3.DatePickerDefaults.DatePickerHeadline (DatePicker.kt:650)");
            }
            Locale locale0 = CalendarLocale_androidKt.defaultLocale(composer1, 0);
            String s = DatePickerFormatter.formatDate$default(datePickerFormatter0, long0, locale0, false, 4, null);
            String s1 = datePickerFormatter0.formatDate(long0, locale0, true);
            composer1.startReplaceGroup(0x4479BDE9);
            String s2 = "";
            if(s1 == null) {
                if(DisplayMode.equals-impl0(v, 0)) {
                    composer1.startReplaceGroup(0x4479DC60);
                    s1 = Strings_androidKt.getString-2EP1pXo(string.m3c_date_picker_no_selection_description, composer1, 0);
                    composer1.endReplaceGroup();
                }
                else if(DisplayMode.equals-impl0(v, 1)) {
                    composer1.startReplaceGroup(0x4479E7FB);
                    s1 = Strings_androidKt.getString-2EP1pXo(string.m3c_date_input_no_input_description, composer1, 0);
                    composer1.endReplaceGroup();
                }
                else {
                    composer1.startReplaceGroup(0x4AC434B1);
                    composer1.endReplaceGroup();
                    s1 = "";
                }
            }
            composer1.endReplaceGroup();
            composer1.startReplaceGroup(0x4479F9D1);
            if(s == null) {
                if(DisplayMode.equals-impl0(v, 0)) {
                    composer1.startReplaceGroup(0x447A04F2);
                    s = Strings_androidKt.getString-2EP1pXo(string.m3c_date_picker_headline, composer1, 0);
                    composer1.endReplaceGroup();
                }
                else if(DisplayMode.equals-impl0(v, 1)) {
                    composer1.startReplaceGroup(0x447A0ED1);
                    s = Strings_androidKt.getString-2EP1pXo(string.m3c_date_input_headline, composer1, 0);
                    composer1.endReplaceGroup();
                }
                else {
                    composer1.startReplaceGroup(0x4AC8C311);
                    composer1.endReplaceGroup();
                    s = "";
                }
            }
            composer1.endReplaceGroup();
            if(DisplayMode.equals-impl0(v, 0)) {
                composer1.startReplaceGroup(1148856029);
                s2 = Strings_androidKt.getString-2EP1pXo(string.m3c_date_picker_headline_description, composer1, 0);
            }
            else if(DisplayMode.equals-impl0(v, 1)) {
                composer1.startReplaceGroup(1148858780);
                s2 = Strings_androidKt.getString-2EP1pXo(string.m3c_date_input_headline_description, composer1, 0);
            }
            else {
                composer1.startReplaceGroup(0x4ACD1371);
            }
            composer1.endReplaceGroup();
            String s3 = b.f(1, s2, "format(this, *args)", new Object[]{s1});
            boolean z = composer1.changed(s3);
            f5 f50 = composer1.rememberedValue();
            if(z || f50 == Composer.Companion.getEmpty()) {
                f50 = new f5(s3);
                composer1.updateRememberedValue(f50);
            }
            TextKt.Text--4IGK_g(s, SemanticsModifierKt.semantics$default(modifier2, false, f50, 1, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, null, composer1, 0, 0xC00, 0x1DFFC);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new g5(this, long0, v, datePickerFormatter0, modifier1, v1, v2));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void DatePickerTitle-hOD91z4(int v, @Nullable Modifier modifier0, @Nullable Composer composer0, int v1, int v2) {
        Modifier modifier1;
        int v3;
        Composer composer1 = composer0.startRestartGroup(0x1383EF3B);
        if((v2 & 1) == 0) {
            v3 = (v1 & 6) == 0 ? v1 | (composer1.changed(v) ? 4 : 2) : v1;
        }
        else {
            v3 = v1 | 6;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
        }
        else if((v1 & 0x30) == 0) {
            v3 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v3 & 19) != 18 || !composer1.getSkipping()) {
            Modifier modifier2 = (v2 & 2) == 0 ? modifier0 : Modifier.Companion;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x1383EF3B, v3, -1, "androidx.compose.material3.DatePickerDefaults.DatePickerTitle (DatePicker.kt:625)");
            }
            if(DisplayMode.equals-impl0(v, 0)) {
                composer1.startReplaceGroup(406433164);
                TextKt.Text--4IGK_g(Strings_androidKt.getString-2EP1pXo(string.m3c_date_picker_title, composer1, 0), modifier2, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer1, v3 & 0x70, 0, 0x1FFFC);
            }
            else if(DisplayMode.equals-impl0(v, 1)) {
                composer1.startReplaceGroup(406437227);
                TextKt.Text--4IGK_g(Strings_androidKt.getString-2EP1pXo(string.m3c_date_input_title, composer1, 0), modifier2, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer1, v3 & 0x70, 0, 0x1FFFC);
            }
            else {
                composer1.startReplaceGroup(0xEEFF3403);
            }
            composer1.endReplaceGroup();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new h5(this, v, modifier1, v1, v2, 0));
        }
    }

    @Composable
    @NotNull
    public final DatePickerColors colors(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xEF987B65, v, -1, "androidx.compose.material3.DatePickerDefaults.colors (DatePicker.kt:428)");
        }
        DatePickerColors datePickerColors0 = this.getDefaultDatePickerColors(MaterialTheme.INSTANCE.getColorScheme(composer0, 6), composer0, v << 3 & 0x70);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return datePickerColors0;
    }

    // 去混淆评级： 中等(83)
    @Composable
    @NotNull
    public final DatePickerColors colors-bSRYm20(long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7, long v8, long v9, long v10, long v11, long v12, long v13, long v14, long v15, long v16, long v17, long v18, long v19, long v20, long v21, long v22, long v23, @Nullable TextFieldColors textFieldColors0, @Nullable Composer composer0, int v24, int v25, int v26, int v27) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x76B5CE76, v24, v25, "androidx.compose.material3.DatePickerDefaults.colors (DatePicker.kt:497)");
        }
        DatePickerColors datePickerColors0 = this.getDefaultDatePickerColors(MaterialTheme.INSTANCE.getColorScheme(composer0, 6), composer0, v26 >> 12 & 0x70).copy-tNwlRmA(((v27 & 1) == 0 ? v : 0L), ((v27 & 2) == 0 ? v1 : 0L), ((v27 & 4) == 0 ? v2 : 0L), ((v27 & 8) == 0 ? v3 : 0L), ((v27 & 16) == 0 ? v4 : 0L), ((v27 & 0x20) == 0 ? v5 : 0L), ((v27 & 0x40) == 0 ? v6 : 0L), ((v27 & 0x80) == 0 ? v7 : 0L), ((v27 & 0x100) == 0 ? v8 : 0L), ((v27 & 0x200) == 0 ? v9 : 0L), ((v27 & 0x400) == 0 ? v10 : 0L), ((v27 & 0x800) == 0 ? v11 : 0L), ((v27 & 0x1000) == 0 ? v12 : 0L), ((v27 & 0x2000) == 0 ? v13 : 0L), ((v27 & 0x4000) == 0 ? v14 : 0L), ((v27 & 0x8000) == 0 ? v15 : 0L), ((v27 & 0x10000) == 0 ? v16 : 0L), ((v27 & 0x20000) == 0 ? v17 : 0L), ((v27 & 0x40000) == 0 ? v18 : 0L), ((v27 & 0x80000) == 0 ? v19 : 0L), ((v27 & 0x100000) == 0 ? v20 : 0L), ((v27 & 0x400000) == 0 ? v22 : 0L), ((v27 & 0x200000) == 0 ? v21 : 0L), ((v27 & 0x800000) == 0 ? v23 : 0L), ((v27 & 0x1000000) == 0 ? textFieldColors0 : null));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return datePickerColors0;
    }

    @NotNull
    public final DatePickerFormatter dateFormatter(@NotNull String s, @NotNull String s1, @NotNull String s2) {
        return new l5(s, s1, s2);
    }

    public static DatePickerFormatter dateFormatter$default(DatePickerDefaults datePickerDefaults0, String s, String s1, String s2, int v, Object object0) {
        if((v & 1) != 0) {
            s = "yMMMM";
        }
        if((v & 2) != 0) {
            s1 = "yMMMd";
        }
        if((v & 4) != 0) {
            s2 = "yMMMMEEEEd";
        }
        return datePickerDefaults0.dateFormatter(s, s1, s2);
    }

    @NotNull
    public final SelectableDates getAllDates() {
        return DatePickerDefaults.c;
    }

    @Composable
    @JvmName(name = "getDefaultDatePickerColors")
    @NotNull
    public final DatePickerColors getDefaultDatePickerColors(@NotNull ColorScheme colorScheme0, @Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1180555308, v, -1, "androidx.compose.material3.DatePickerDefaults.<get-defaultDatePickerColors> (DatePicker.kt:527)");
        }
        DatePickerColors datePickerColors0 = colorScheme0.getDefaultDatePickerColorsCached$material3_release();
        composer0.startReplaceGroup(0xD9098713);
        if(datePickerColors0 == null) {
            datePickerColors0 = new DatePickerColors(ColorSchemeKt.fromToken(colorScheme0, DatePickerModalTokens.INSTANCE.getContainerColor()), ColorSchemeKt.fromToken(colorScheme0, DatePickerModalTokens.INSTANCE.getHeaderSupportingTextColor()), ColorSchemeKt.fromToken(colorScheme0, DatePickerModalTokens.INSTANCE.getHeaderHeadlineColor()), ColorSchemeKt.fromToken(colorScheme0, DatePickerModalTokens.INSTANCE.getWeekdaysLabelTextColor()), ColorSchemeKt.fromToken(colorScheme0, DatePickerModalTokens.INSTANCE.getRangeSelectionMonthSubheadColor()), colorScheme0.getOnSurfaceVariant-0d7_KjU(), ColorSchemeKt.fromToken(colorScheme0, DatePickerModalTokens.INSTANCE.getSelectionYearUnselectedLabelTextColor()), Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, DatePickerModalTokens.INSTANCE.getSelectionYearUnselectedLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme0, DatePickerModalTokens.INSTANCE.getDateTodayLabelTextColor()), ColorSchemeKt.fromToken(colorScheme0, DatePickerModalTokens.INSTANCE.getSelectionYearSelectedLabelTextColor()), Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, DatePickerModalTokens.INSTANCE.getSelectionYearSelectedLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme0, DatePickerModalTokens.INSTANCE.getSelectionYearSelectedContainerColor()), Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, DatePickerModalTokens.INSTANCE.getSelectionYearSelectedContainerColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme0, DatePickerModalTokens.INSTANCE.getDateUnselectedLabelTextColor()), Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, DatePickerModalTokens.INSTANCE.getDateUnselectedLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme0, DatePickerModalTokens.INSTANCE.getDateSelectedLabelTextColor()), Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, DatePickerModalTokens.INSTANCE.getDateSelectedLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme0, DatePickerModalTokens.INSTANCE.getDateSelectedContainerColor()), Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, DatePickerModalTokens.INSTANCE.getDateSelectedContainerColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme0, DatePickerModalTokens.INSTANCE.getDateTodayLabelTextColor()), ColorSchemeKt.fromToken(colorScheme0, DatePickerModalTokens.INSTANCE.getDateTodayContainerOutlineColor()), ColorSchemeKt.fromToken(colorScheme0, DatePickerModalTokens.INSTANCE.getRangeSelectionActiveIndicatorContainerColor()), ColorSchemeKt.fromToken(colorScheme0, DatePickerModalTokens.INSTANCE.getSelectionDateInRangeLabelTextColor()), ColorSchemeKt.fromToken(colorScheme0, DividerTokens.INSTANCE.getColor()), OutlinedTextFieldDefaults.INSTANCE.getDefaultOutlinedTextFieldColors(colorScheme0, composer0, v & 14 | 0x30), null);
            colorScheme0.setDefaultDatePickerColorsCached$material3_release(datePickerColors0);
        }
        composer0.endReplaceGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return datePickerColors0;
    }

    @Composable
    @JvmName(name = "getShape")
    @NotNull
    public final Shape getShape(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(700927667, v, -1, "androidx.compose.material3.DatePickerDefaults.<get-shape> (DatePicker.kt:730)");
        }
        Shape shape0 = ShapesKt.getValue(DatePickerModalTokens.INSTANCE.getContainerShape(), composer0, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return shape0;
    }

    public final float getTonalElevation-D9Ej5fM() [...] // 潜在的解密器

    @NotNull
    public final IntRange getYearRange() {
        return DatePickerDefaults.a;
    }

    @Composable
    @NotNull
    public final FlingBehavior rememberSnapFlingBehavior$material3_release(@NotNull LazyListState lazyListState0, @Nullable DecayAnimationSpec decayAnimationSpec0, @Nullable Composer composer0, int v, int v1) {
        if((v1 & 2) != 0) {
            decayAnimationSpec0 = DecayAnimationSpecKt.exponentialDecay$default(0.0f, 0.0f, 3, null);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2036003494, v, -1, "androidx.compose.material3.DatePickerDefaults.rememberSnapFlingBehavior (DatePicker.kt:703)");
        }
        boolean z = composer0.changed(decayAnimationSpec0);
        boolean z1 = (v & 14 ^ 6) > 4 && composer0.changed(lazyListState0) || (v & 6) == 4;
        TargetedFlingBehavior targetedFlingBehavior0 = composer0.rememberedValue();
        if(z1 || z || targetedFlingBehavior0 == Composer.Companion.getEmpty()) {
            targetedFlingBehavior0 = SnapFlingBehaviorKt.snapFlingBehavior(new SnapLayoutInfoProvider() {
                public final SnapLayoutInfoProvider a;

                {
                    this.a = snapLayoutInfoProvider0;
                }

                @Override  // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
                public float calculateApproachOffset(float f, float f1) {
                    return 0.0f;
                }

                @Override  // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
                public float calculateSnapOffset(float f) {
                    return this.a.calculateSnapOffset(f);
                }
            }, decayAnimationSpec0, AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null));
            composer0.updateRememberedValue(targetedFlingBehavior0);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return targetedFlingBehavior0;
    }
}

