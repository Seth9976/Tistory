package androidx.compose.material3;

import a5.b;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.text.selection.z;
import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.CalendarModel_androidKt;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.material3.tokens.DatePickerModalTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.CustomAccessibilityAction;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.room.a;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u001Am\u0010\u000F\u001A\u00020\u00072\u0006\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\u0015\b\u0002\u0010\t\u001A\u000F\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\b\b2\u0015\b\u0002\u0010\n\u001A\u000F\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\b\b2\b\b\u0002\u0010\f\u001A\u00020\u000B2\b\b\u0002\u0010\u000E\u001A\u00020\rH\u0007¢\u0006\u0004\b\u000F\u0010\u0010\u001AT\u0010\u001D\u001A\u00020\u00002\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001A\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001A\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0016\u001A\u00020\u00152\b\b\u0002\u0010\u0018\u001A\u00020\u00172\b\b\u0002\u0010\u001A\u001A\u00020\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001B\u0010\u001C\u001A`\u0010#\u001A\u00020\u00002\n\u0010 \u001A\u00060\u001Ej\u0002`\u001F2\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001A\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001A\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0016\u001A\u00020\u00152\b\b\u0002\u0010\u0018\u001A\u00020\u00172\b\b\u0002\u0010\u001A\u001A\u00020\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001A&\u0010+\u001A\u00020\u0007*\u00020$2\u0006\u0010&\u001A\u00020%2\u0006\u0010(\u001A\u00020\'H\u0000ø\u0001\u0000¢\u0006\u0004\b)\u0010*\"\u001A\u00101\u001A\u00020,8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b-\u0010.\u001A\u0004\b/\u00100\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u00062"}, d2 = {"Landroidx/compose/material3/DateRangePickerState;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/material3/DatePickerFormatter;", "dateFormatter", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "title", "headline", "", "showModeToggle", "Landroidx/compose/material3/DatePickerColors;", "colors", "DateRangePicker", "(Landroidx/compose/material3/DateRangePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/DatePickerFormatter;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;II)V", "", "initialSelectedStartDateMillis", "initialSelectedEndDateMillis", "initialDisplayedMonthMillis", "Lkotlin/ranges/IntRange;", "yearRange", "Landroidx/compose/material3/DisplayMode;", "initialDisplayMode", "Landroidx/compose/material3/SelectableDates;", "selectableDates", "rememberDateRangePickerState-IlFM19s", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/ranges/IntRange;ILandroidx/compose/material3/SelectableDates;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/DateRangePickerState;", "rememberDateRangePickerState", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "DateRangePickerState-HVP43zI", "(Ljava/util/Locale;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/ranges/IntRange;ILandroidx/compose/material3/SelectableDates;)Landroidx/compose/material3/DateRangePickerState;", "DateRangePickerState", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "Landroidx/compose/material3/SelectedRangeInfo;", "selectedRangeInfo", "Landroidx/compose/ui/graphics/Color;", "color", "drawRangeBackground-mxwnekA", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;Landroidx/compose/material3/SelectedRangeInfo;J)V", "drawRangeBackground", "Landroidx/compose/foundation/layout/PaddingValues;", "a", "Landroidx/compose/foundation/layout/PaddingValues;", "getCalendarMonthSubheadPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "CalendarMonthSubheadPadding", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDateRangePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1058:1\n1223#2,6:1059\n1223#2,6:1065\n1223#2,6:1072\n1223#2,6:1118\n1223#2,6:1124\n56#3:1071\n85#4:1078\n82#4,6:1079\n88#4:1113\n92#4:1117\n78#5,6:1085\n85#5,4:1100\n89#5,2:1110\n93#5:1116\n368#6,9:1091\n377#6:1112\n378#6,2:1114\n4032#7,6:1104\n57#8,4:1130\n57#8,4:1134\n148#9:1138\n148#9:1139\n148#9:1140\n148#9:1141\n*S KotlinDebug\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerKt\n*L\n96#1:1059,6\n116#1:1065,6\n264#1:1072,6\n757#1:1118,6\n840#1:1124,6\n135#1:1071\n720#1:1078\n720#1:1079,6\n720#1:1113\n720#1:1117\n720#1:1085,6\n720#1:1100,4\n720#1:1110,2\n720#1:1116\n720#1:1091,9\n720#1:1112\n720#1:1114,2\n720#1:1104,6\n960#1:1130,4\n961#1:1134,4\n871#1:1138\n1050#1:1139\n1052#1:1140\n1057#1:1141\n*E\n"})
public final class DateRangePickerKt {
    public static final PaddingValues a;
    public static final PaddingValues b;
    public static final PaddingValues c;
    public static final float d;

    static {
        DateRangePickerKt.a = PaddingKt.PaddingValues-a9UjIt4$default(24.0f, 20.0f, 0.0f, 8.0f, 4, null);
        DateRangePickerKt.b = PaddingKt.PaddingValues-a9UjIt4$default(64.0f, 0.0f, 12.0f, 0.0f, 10, null);
        DateRangePickerKt.c = PaddingKt.PaddingValues-a9UjIt4$default(64.0f, 0.0f, 12.0f, 12.0f, 2, null);
        DateRangePickerKt.d = 60.0f;
    }

    @ExperimentalMaterial3Api
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void DateRangePicker(@NotNull DateRangePickerState dateRangePickerState0, @Nullable Modifier modifier0, @Nullable DatePickerFormatter datePickerFormatter0, @Nullable Function2 function20, @Nullable Function2 function21, boolean z, @Nullable DatePickerColors datePickerColors0, @Nullable Composer composer0, int v, int v1) {
        DatePickerColors datePickerColors1;
        boolean z2;
        Function2 function24;
        Modifier modifier2;
        DatePickerFormatter datePickerFormatter1;
        boolean z3;
        Function2 function25;
        boolean z1;
        Function2 function23;
        Function2 function22;
        Modifier modifier1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(650830774);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changed(dateRangePickerState0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
            modifier1 = modifier0;
        }
        else if((v & 0x30) == 0) {
            modifier1 = modifier0;
            v2 |= (composer1.changed(modifier1) ? 0x20 : 16);
        }
        else {
            modifier1 = modifier0;
        }
        if((v & 0x180) == 0) {
            v2 |= ((v1 & 4) != 0 || !((v & 0x200) == 0 ? composer1.changed(datePickerFormatter0) : composer1.changedInstance(datePickerFormatter0)) ? 0x80 : 0x100);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
            function22 = function20;
        }
        else if((v & 0xC00) == 0) {
            function22 = function20;
            v2 |= (composer1.changedInstance(function22) ? 0x800 : 0x400);
        }
        else {
            function22 = function20;
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
            function23 = function21;
        }
        else if((v & 0x6000) == 0) {
            function23 = function21;
            v2 |= (composer1.changedInstance(function23) ? 0x4000 : 0x2000);
        }
        else {
            function23 = function21;
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
            z1 = z;
        }
        else if((0x30000 & v) == 0) {
            z1 = z;
            v2 |= (composer1.changed(z1) ? 0x20000 : 0x10000);
        }
        else {
            z1 = z;
        }
        if((0x180000 & v) == 0) {
            v2 |= ((v1 & 0x40) != 0 || !composer1.changed(datePickerColors0) ? 0x80000 : 0x100000);
        }
        if((0x92493 & v2) != 0x92492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                if((v1 & 2) != 0) {
                    modifier1 = Modifier.Companion;
                }
                if((v1 & 4) != 0) {
                    DatePickerFormatter datePickerFormatter2 = composer1.rememberedValue();
                    if(datePickerFormatter2 == Composer.Companion.getEmpty()) {
                        datePickerFormatter2 = DatePickerDefaults.dateFormatter$default(DatePickerDefaults.INSTANCE, null, null, null, 7, null);
                        composer1.updateRememberedValue(datePickerFormatter2);
                    }
                    datePickerFormatter0 = datePickerFormatter2;
                    v2 &= -897;
                }
                if((v1 & 8) != 0) {
                    function22 = ComposableLambdaKt.rememberComposableLambda(0xF655902A, true, new a8(dateRangePickerState0), composer1, 54);
                }
                if((v1 & 16) != 0) {
                    function23 = ComposableLambdaKt.rememberComposableLambda(0xF4F4DC54, true, new b8(dateRangePickerState0, datePickerFormatter0), composer1, 54);
                }
                if((v1 & 0x20) != 0) {
                    z1 = true;
                }
                if((v1 & 0x40) == 0) {
                label_82:
                    function25 = function22;
                    z3 = z1;
                    datePickerColors1 = datePickerColors0;
                }
                else {
                    v2 &= 0xFFC7FFFF;
                    datePickerColors1 = DatePickerDefaults.INSTANCE.colors(composer1, 6);
                    function25 = function22;
                    z3 = z1;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 4) != 0) {
                    v2 &= -897;
                }
                if((v1 & 0x40) != 0) {
                    v2 &= 0xFFC7FFFF;
                }
                goto label_82;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(650830774, v2, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:113)");
            }
            Locale locale0 = CalendarLocale_androidKt.defaultLocale(composer1, 0);
            boolean z4 = composer1.changed(locale0);
            CalendarModel calendarModel0 = composer1.rememberedValue();
            if(z4 || calendarModel0 == Composer.Companion.getEmpty()) {
                calendarModel0 = CalendarModel_androidKt.createCalendarModel(locale0);
                composer1.updateRememberedValue(calendarModel0);
            }
            composer1.startReplaceGroup(0xA94A501B);
            ComposableLambda composableLambda0 = z3 ? ComposableLambdaKt.rememberComposableLambda(-1490010652, true, new d8(dateRangePickerState0), composer1, 54) : null;
            composer1.endReplaceGroup();
            DatePickerKt.DateEntryContainer-au3_HiA(modifier1, function25, function23, composableLambda0, datePickerColors1, TypographyKt.getValue(DatePickerModalTokens.INSTANCE.getRangeSelectionHeaderHeadlineFont(), composer1, 6), 0.0f - DateRangePickerKt.d, ComposableLambdaKt.rememberComposableLambda(0xFC921885, true, new z(2, dateRangePickerState0, calendarModel0, datePickerFormatter0, datePickerColors1), composer1, 54), composer1, v2 >> 3 & 14 | 0xD80000 | v2 >> 6 & 0x70 | v2 >> 6 & 0x380 | v2 >> 6 & 0xE000);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function22 = function25;
            modifier2 = modifier1;
            z2 = z3;
            function24 = function23;
            datePickerFormatter1 = datePickerFormatter0;
        }
        else {
            composer1.skipToGroupEnd();
            datePickerFormatter1 = datePickerFormatter0;
            modifier2 = modifier1;
            function24 = function23;
            z2 = z1;
            datePickerColors1 = datePickerColors0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new t5(dateRangePickerState0, modifier2, datePickerFormatter1, function22, function24, z2, datePickerColors1, v, v1, 1));
        }
    }

    @ExperimentalMaterial3Api
    @NotNull
    public static final DateRangePickerState DateRangePickerState-HVP43zI(@NotNull Locale locale0, @Nullable Long long0, @Nullable Long long1, @Nullable Long long2, @NotNull IntRange intRange0, int v, @NotNull SelectableDates selectableDates0) {
        return new r8(locale0, long0, long1, long2, intRange0, v, selectableDates0);
    }

    public static DateRangePickerState DateRangePickerState-HVP43zI$default(Locale locale0, Long long0, Long long1, Long long2, IntRange intRange0, int v, SelectableDates selectableDates0, int v1, Object object0) {
        if((v1 & 2) != 0) {
            long0 = null;
        }
        if((v1 & 4) != 0) {
            long1 = null;
        }
        if((v1 & 8) != 0) {
            long2 = long0;
        }
        if((v1 & 16) != 0) {
            intRange0 = DatePickerDefaults.INSTANCE.getYearRange();
        }
        if((v1 & 0x20) != 0) {
            v = 0;
        }
        if((v1 & 0x40) != 0) {
            selectableDates0 = DatePickerDefaults.INSTANCE.getAllDates();
        }
        return DateRangePickerKt.DateRangePickerState-HVP43zI(locale0, long0, long1, long2, intRange0, v, selectableDates0);
    }

    public static final void a(LazyListState lazyListState0, Long long0, Long long1, Function2 function20, Function1 function10, CalendarModel calendarModel0, IntRange intRange0, DatePickerFormatter datePickerFormatter0, SelectableDates selectableDates0, DatePickerColors datePickerColors0, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x4AF1DE09);
        int v1 = (v & 6) == 0 ? (composer1.changed(lazyListState0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (composer1.changed(long0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (composer1.changed(long1) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (composer1.changedInstance(function20) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            v1 |= (composer1.changedInstance(function10) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v) == 0) {
            v1 |= (composer1.changedInstance(calendarModel0) ? 0x20000 : 0x10000);
        }
        if((0x180000 & v) == 0) {
            v1 |= (composer1.changedInstance(intRange0) ? 0x100000 : 0x80000);
        }
        if((0xC00000 & v) == 0) {
            v1 |= (((0x1000000 & v) == 0 ? composer1.changed(datePickerFormatter0) : composer1.changedInstance(datePickerFormatter0)) ? 0x800000 : 0x400000);
        }
        if((0x6000000 & v) == 0) {
            v1 |= (composer1.changed(selectableDates0) ? 0x4000000 : 0x2000000);
        }
        if((0x30000000 & v) == 0) {
            v1 |= (composer1.changed(datePickerColors0) ? 0x20000000 : 0x10000000);
        }
        if((v1 & 306783379) != 306783378 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x4AF1DE09, v1, -1, "androidx.compose.material3.VerticalMonthsList (DateRangePicker.kt:753)");
            }
            CalendarDate calendarDate0 = calendarModel0.getToday();
            boolean z = composer1.changed(intRange0);
            CalendarMonth calendarMonth0 = composer1.rememberedValue();
            if(z || calendarMonth0 == Composer.Companion.getEmpty()) {
                calendarMonth0 = calendarModel0.getMonth(intRange0.getFirst(), 1);
                composer1.updateRememberedValue(calendarMonth0);
            }
            TextKt.ProvideTextStyle(TypographyKt.getValue(DatePickerModalTokens.INSTANCE.getDateLabelTextFont(), composer1, 6), ComposableLambdaKt.rememberComposableLambda(1090773432, true, new l8(long0, long1, function20, lazyListState0, intRange0, calendarModel0, calendarMonth0, datePickerFormatter0, datePickerColors0, calendarDate0, selectableDates0), composer1, 54), composer1, 0x30);
            boolean z1 = composer1.changedInstance(calendarModel0);
            boolean z2 = composer1.changedInstance(intRange0);
            m8 m80 = composer1.rememberedValue();
            if((((v1 & 14) == 4 ? 1 : 0) | ((v1 & 0xE000) == 0x4000 ? 1 : 0) | z1 | z2) != 0 || m80 == Composer.Companion.getEmpty()) {
                m8 m81 = new m8(lazyListState0, function10, calendarModel0, intRange0, null);
                composer1.updateRememberedValue(m81);
                m80 = m81;
            }
            EffectsKt.LaunchedEffect(lazyListState0, m80, composer1, v1 & 14);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new n8(lazyListState0, long0, long1, function20, function10, calendarModel0, intRange0, datePickerFormatter0, selectableDates0, datePickerColors0, v, 0));
        }
    }

    public static final void access$DateRangePickerContent(Long long0, Long long1, long v, Function2 function20, Function1 function10, CalendarModel calendarModel0, IntRange intRange0, DatePickerFormatter datePickerFormatter0, SelectableDates selectableDates0, DatePickerColors datePickerColors0, Composer composer0, int v1) {
        Composer composer1 = composer0.startRestartGroup(-787063721);
        int v2 = (v1 & 6) == 0 ? (composer1.changed(long0) ? 4 : 2) | v1 : v1;
        if((v1 & 0x30) == 0) {
            v2 |= (composer1.changed(long1) ? 0x20 : 16);
        }
        if((v1 & 0x180) == 0) {
            v2 |= (composer1.changed(v) ? 0x100 : 0x80);
        }
        if((v1 & 0xC00) == 0) {
            v2 |= (composer1.changedInstance(function20) ? 0x800 : 0x400);
        }
        if((v1 & 0x6000) == 0) {
            v2 |= (composer1.changedInstance(function10) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v1) == 0) {
            v2 |= (composer1.changedInstance(calendarModel0) ? 0x20000 : 0x10000);
        }
        if((0x180000 & v1) == 0) {
            v2 |= (composer1.changedInstance(intRange0) ? 0x100000 : 0x80000);
        }
        if((0xC00000 & v1) == 0) {
            v2 |= (((0x1000000 & v1) == 0 ? composer1.changed(datePickerFormatter0) : composer1.changedInstance(datePickerFormatter0)) ? 0x800000 : 0x400000);
        }
        if((0x6000000 & v1) == 0) {
            v2 |= (composer1.changed(selectableDates0) ? 0x4000000 : 0x2000000);
        }
        if((v1 & 0x30000000) == 0) {
            v2 |= (composer1.changed(datePickerColors0) ? 0x20000000 : 0x10000000);
        }
        if((v2 & 306783379) != 306783378 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-787063721, v2, -1, "androidx.compose.material3.DateRangePickerContent (DateRangePicker.kt:715)");
            }
            LazyListState lazyListState0 = LazyListStateKt.rememberLazyListState(calendarModel0.getMonth(v).indexIn(intRange0), 0, composer1, 0, 2);
            Modifier modifier0 = PaddingKt.padding-VpY3zN4$default(Modifier.Companion, 12.0f, 0.0f, 2, null);
            MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer1, 0);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier1 = ComposedModifierKt.materializeModifier(composer1, modifier0);
            Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                a.t(v3, composer1, v3, function21);
            }
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            DatePickerKt.WeekDays(datePickerColors0, calendarModel0, composer1, v2 >> 27 & 14 | v2 >> 12 & 0x70);
            DateRangePickerKt.a(lazyListState0, long0, long1, function20, function10, calendarModel0, intRange0, datePickerFormatter0, selectableDates0, datePickerColors0, composer1, v2 << 3 & 0x3F0 | v2 & 0x1C00 | 0xE000 & v2 | 0x70000 & v2 | 0x380000 & v2 | 0x1C00000 & v2 | 0xE000000 & v2 | 0x70000000 & v2);
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
            scopeUpdateScope0.updateScope(new e8(long0, long1, v, function20, function10, calendarModel0, intRange0, datePickerFormatter0, selectableDates0, datePickerColors0, v1));
        }
    }

    public static final void access$SwitchableDateEntryContent-RN-2D1Q(Long long0, Long long1, long v, int v1, Function2 function20, Function1 function10, CalendarModel calendarModel0, IntRange intRange0, DatePickerFormatter datePickerFormatter0, SelectableDates selectableDates0, DatePickerColors datePickerColors0, Composer composer0, int v2, int v3) {
        int v6;
        Composer composer1 = composer0.startRestartGroup(0xE03E47A9);
        int v4 = 4;
        int v5 = (v2 & 6) == 0 ? (composer1.changed(long0) ? 4 : 2) | v2 : v2;
        if((v2 & 0x30) == 0) {
            v5 |= (composer1.changed(long1) ? 0x20 : 16);
        }
        if((v2 & 0x180) == 0) {
            v5 |= (composer1.changed(v) ? 0x100 : 0x80);
        }
        if((v2 & 0xC00) == 0) {
            v5 |= (composer1.changed(v1) ? 0x800 : 0x400);
        }
        if((v2 & 0x6000) == 0) {
            v5 |= (composer1.changedInstance(function20) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v2) == 0) {
            v5 |= (composer1.changedInstance(function10) ? 0x20000 : 0x10000);
        }
        if((0x180000 & v2) == 0) {
            v5 |= (composer1.changedInstance(calendarModel0) ? 0x100000 : 0x80000);
        }
        if((0xC00000 & v2) == 0) {
            v5 |= (composer1.changedInstance(intRange0) ? 0x800000 : 0x400000);
        }
        if((v2 & 0x6000000) == 0) {
            v5 |= (((v2 & 0x8000000) == 0 ? composer1.changed(datePickerFormatter0) : composer1.changedInstance(datePickerFormatter0)) ? 0x4000000 : 0x2000000);
        }
        if((v2 & 0x30000000) == 0) {
            v5 |= (composer1.changed(selectableDates0) ? 0x20000000 : 0x10000000);
        }
        if((v3 & 6) == 0) {
            if(!composer1.changed(datePickerColors0)) {
                v4 = 2;
            }
            v6 = v3 | v4;
        }
        else {
            v6 = v3;
        }
        if((v5 & 306783379) != 306783378 || (v6 & 3) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xE03E47A9, v5, v6, "androidx.compose.material3.SwitchableDateEntryContent (DateRangePicker.kt:661)");
            }
            SpringSpec springSpec0 = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
            Modifier modifier0 = SemanticsModifierKt.semantics$default(Modifier.Companion, false, a5.I, 1, null);
            CrossfadeKt.Crossfade(DisplayMode.box-impl(v1), modifier0, springSpec0, null, ComposableLambdaKt.rememberComposableLambda(-1026642619, true, new f8(long0, long1, v, function20, function10, calendarModel0, intRange0, datePickerFormatter0, selectableDates0, datePickerColors0), composer1, 54), composer1, v5 >> 9 & 14 | 0x6180, 8);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new g8(long0, long1, v, v1, function20, function10, calendarModel0, intRange0, datePickerFormatter0, selectableDates0, datePickerColors0, v2, v3));
        }
    }

    public static final List access$customScrollActions(LazyListState lazyListState0, CoroutineScope coroutineScope0, String s, String s1) {
        v5 v50 = new v5(lazyListState0, coroutineScope0, 3);
        v5 v51 = new v5(lazyListState0, coroutineScope0, 2);
        return CollectionsKt__CollectionsKt.listOf(new CustomAccessibilityAction[]{new CustomAccessibilityAction(s, v50), new CustomAccessibilityAction(s1, v51)});
    }

    public static final void access$updateDateSelection(long v, Long long0, Long long1, Function2 function20) {
        if(long0 == null && long1 == null || long0 != null && long1 != null) {
            function20.invoke(v, null);
            return;
        }
        if(long0 != null && v >= ((long)long0)) {
            function20.invoke(long0, v);
            return;
        }
        function20.invoke(v, null);
    }

    public static final void drawRangeBackground-mxwnekA(@NotNull ContentDrawScope contentDrawScope0, @NotNull SelectedRangeInfo selectedRangeInfo0, long v) {
        float f10;
        float f = contentDrawScope0.toPx-0680j_4(48.0f);
        float f1 = contentDrawScope0.toPx-0680j_4(48.0f);
        float f2 = contentDrawScope0.toPx-0680j_4(0.0f);
        float f3 = (f1 - f2) / 2.0f;
        float f4 = b.a(7.0f, f, Size.getWidth-impl(contentDrawScope0.getSize-NH-jbRc()), 7.0f);
        long v1 = selectedRangeInfo0.getGridStartCoordinates-nOcc-ac();
        int v2 = IntOffset.getY-impl(v1);
        long v3 = selectedRangeInfo0.getGridEndCoordinates-nOcc-ac();
        int v4 = IntOffset.getX-impl(v3);
        int v5 = IntOffset.getY-impl(v3);
        float f5 = f + f4;
        float f6 = ((float)IntOffset.getX-impl(v1)) * f5 + (selectedRangeInfo0.getFirstIsSelectionStart() ? f / 2.0f : 0.0f) + f4 / 2.0f;
        float f7 = ((float)v2) * f1 + f3;
        if(selectedRangeInfo0.getLastIsSelectionEnd()) {
            f /= 2.0f;
        }
        float f8 = ((float)v4) * f5 + f + f4 / 2.0f;
        boolean z = contentDrawScope0.getLayoutDirection() == LayoutDirection.Rtl;
        if(z) {
            f6 = Size.getWidth-impl(contentDrawScope0.getSize-NH-jbRc()) - f6;
            f8 = Size.getWidth-impl(contentDrawScope0.getSize-NH-jbRc()) - f8;
        }
        float f9 = f8;
        long v6 = OffsetKt.Offset(f6, f7);
        if(v2 == v5) {
            f10 = f9 - f6;
        }
        else {
            f10 = z ? -f6 : Size.getWidth-impl(contentDrawScope0.getSize-NH-jbRc()) - f6;
        }
        DrawScope.drawRect-n-J9OG0$default(contentDrawScope0, v, v6, SizeKt.Size(f10, f2), 0.0f, null, null, 0, 120, null);
        if(v2 != v5) {
            for(int v7 = v5 - v2 - 1; v7 > 0; --v7) {
                DrawScope.drawRect-n-J9OG0$default(contentDrawScope0, v, OffsetKt.Offset(0.0f, ((float)v7) * f1 + f7), SizeKt.Size(Size.getWidth-impl(contentDrawScope0.getSize-NH-jbRc()), f2), 0.0f, null, null, 0, 120, null);
            }
            long v8 = OffsetKt.Offset((contentDrawScope0.getLayoutDirection() == LayoutDirection.Ltr ? 0.0f : Size.getWidth-impl(contentDrawScope0.getSize-NH-jbRc())), ((float)v5) * f1 + f3);
            if(z) {
                f9 -= Size.getWidth-impl(contentDrawScope0.getSize-NH-jbRc());
            }
            DrawScope.drawRect-n-J9OG0$default(contentDrawScope0, v, v8, SizeKt.Size(f9, f2), 0.0f, null, null, 0, 120, null);
        }
    }

    @NotNull
    public static final PaddingValues getCalendarMonthSubheadPadding() {
        return DateRangePickerKt.a;
    }

    @ExperimentalMaterial3Api
    @Composable
    @NotNull
    public static final DateRangePickerState rememberDateRangePickerState-IlFM19s(@Nullable Long long0, @Nullable Long long1, @Nullable Long long2, @Nullable IntRange intRange0, int v, @Nullable SelectableDates selectableDates0, @Nullable Composer composer0, int v1, int v2) {
        Long long3 = (v2 & 1) == 0 ? long0 : null;
        Long long4 = (v2 & 2) == 0 ? long1 : null;
        Long long5 = (v2 & 4) == 0 ? long2 : long3;
        IntRange intRange1 = (v2 & 8) == 0 ? intRange0 : DatePickerDefaults.INSTANCE.getYearRange();
        int v3 = (v2 & 16) == 0 ? v : 0;
        SelectableDates selectableDates1 = (v2 & 0x20) == 0 ? selectableDates0 : DatePickerDefaults.INSTANCE.getAllDates();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2012087461, v1, -1, "androidx.compose.material3.rememberDateRangePickerState (DateRangePicker.kt:261)");
        }
        Locale locale0 = CalendarLocale_androidKt.defaultLocale(composer0, 0);
        Saver saver0 = r8.h.Saver(selectableDates1, locale0);
        int v4 = ((v1 & 14 ^ 6) <= 4 || !composer0.changed(long3)) && (v1 & 6) != 4 ? 0 : 1;
        int v5 = ((v1 & 0x70 ^ 0x30) <= 0x20 || !composer0.changed(long4)) && (v1 & 0x30) != 0x20 ? 0 : 1;
        int v6 = ((v1 & 0x380 ^ 0x180) <= 0x100 || !composer0.changed(long5)) && (v1 & 0x180) != 0x100 ? 0 : 1;
        boolean z = composer0.changedInstance(intRange1);
        int v7 = ((0xE000 & v1 ^ 0x6000) <= 0x4000 || !composer0.changed(v3)) && (v1 & 0x6000) != 0x4000 ? 0 : 1;
        int v8 = ((0x70000 & v1 ^ 0x30000) <= 0x20000 || !composer0.changed(selectableDates1)) && (v1 & 0x30000) != 0x20000 ? 0 : 1;
        boolean z1 = composer0.changedInstance(locale0);
        q8 q80 = composer0.rememberedValue();
        if((v5 | v4 | v6 | z | v7 | v8 | z1) != 0 || q80 == Composer.Companion.getEmpty()) {
            q80 = new q8(locale0, long3, long4, long5, intRange1, v3, selectableDates1);
            composer0.updateRememberedValue(q80);
        }
        DateRangePickerState dateRangePickerState0 = (r8)RememberSaveableKt.rememberSaveable(new Object[0], saver0, null, q80, composer0, 0, 4);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return dateRangePickerState0;
    }
}

