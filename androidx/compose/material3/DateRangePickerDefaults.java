package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.room.a;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ExperimentalMaterial3Api
@Stable
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001J$\u0010\t\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ@\u0010\u0011\u001A\u00020\u00062\b\u0010\u000B\u001A\u0004\u0018\u00010\n2\b\u0010\f\u001A\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u000E\u001A\u00020\r2\b\b\u0002\u0010\u0005\u001A\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000F\u0010\u0010\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0012"}, d2 = {"Landroidx/compose/material3/DateRangePickerDefaults;", "", "Landroidx/compose/material3/DisplayMode;", "displayMode", "Landroidx/compose/ui/Modifier;", "modifier", "", "DateRangePickerTitle-hOD91z4", "(ILandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "DateRangePickerTitle", "", "selectedStartDateMillis", "selectedEndDateMillis", "Landroidx/compose/material3/DatePickerFormatter;", "dateFormatter", "DateRangePickerHeadline-v84Udv0", "(Ljava/lang/Long;Ljava/lang/Long;ILandroidx/compose/material3/DatePickerFormatter;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "DateRangePickerHeadline", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDateRangePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerDefaults\n+ 2 Strings.android.kt\nandroidx/compose/material3/internal/Strings$Companion\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,1058:1\n153#2:1059\n171#2:1060\n156#2:1061\n159#2:1062\n111#2:1063\n135#2:1064\n111#2:1065\n135#2:1066\n1223#3,6:1067\n148#4:1073\n98#5,3:1074\n101#5:1105\n105#5:1109\n78#6,6:1077\n85#6,4:1092\n89#6,2:1102\n93#6:1108\n368#7,9:1083\n377#7:1104\n378#7,2:1106\n4032#8,6:1096\n*S KotlinDebug\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerDefaults\n*L\n338#1:1059\n340#1:1060\n364#1:1061\n365#1:1062\n431#1:1063\n432#1:1064\n443#1:1065\n444#1:1066\n453#1:1067,6\n458#1:1073\n451#1:1074,3\n451#1:1105\n451#1:1109\n451#1:1077,6\n451#1:1092,4\n451#1:1102,2\n451#1:1108\n451#1:1083,9\n451#1:1104\n451#1:1106,2\n451#1:1096,6\n*E\n"})
public final class DateRangePickerDefaults {
    public static final int $stable;
    @NotNull
    public static final DateRangePickerDefaults INSTANCE;

    static {
        DateRangePickerDefaults.INSTANCE = new DateRangePickerDefaults();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void DateRangePickerHeadline-v84Udv0(@Nullable Long long0, @Nullable Long long1, int v, @NotNull DatePickerFormatter datePickerFormatter0, @Nullable Modifier modifier0, @Nullable Composer composer0, int v1, int v2) {
        Modifier modifier1;
        int v3;
        Composer composer1 = composer0.startRestartGroup(0x9FF907E0);
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
            v3 |= (composer1.changed(long1) ? 0x20 : 16);
        }
        if((v2 & 4) != 0) {
            v3 |= 0x180;
        }
        else if((v1 & 0x180) == 0) {
            v3 |= (composer1.changed(v) ? 0x100 : 0x80);
        }
        if((v2 & 8) != 0) {
            v3 |= 0xC00;
        }
        else if((v1 & 0xC00) == 0) {
            v3 |= (((v1 & 0x1000) == 0 ? composer1.changed(datePickerFormatter0) : composer1.changedInstance(datePickerFormatter0)) ? 0x800 : 0x400);
        }
        if((v2 & 16) != 0) {
            v3 |= 0x6000;
        }
        else if((v1 & 0x6000) == 0) {
            v3 |= (composer1.changed(modifier0) ? 0x4000 : 0x2000);
        }
        if((v2 & 0x20) != 0) {
            v3 |= 0x30000;
        }
        else if((v1 & 0x30000) == 0) {
            v3 |= (composer1.changed(this) ? 0x20000 : 0x10000);
        }
        if((74899 & v3) != 74898 || !composer1.getSkipping()) {
            Modifier modifier2 = (v2 & 16) == 0 ? modifier0 : Modifier.Companion;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x9FF907E0, v3, -1, "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerHeadline (DateRangePicker.kt:362)");
            }
            String s = Strings_androidKt.getString-2EP1pXo(string.m3c_date_range_picker_start_headline, composer1, 0);
            String s1 = Strings_androidKt.getString-2EP1pXo(string.m3c_date_range_picker_end_headline, composer1, 0);
            this.a(long0, long1, v, datePickerFormatter0, modifier2, s, s1, ComposableLambdaKt.rememberComposableLambda(0x1CC74401, true, new x7(s, 0), composer1, 54), ComposableLambdaKt.rememberComposableLambda(0xA53DE742, true, new x7(s1, 1), composer1, 54), ComposableSingletons.DateRangePickerKt.INSTANCE.getLambda-1$material3_release(), composer1, v3 & 14 | 0x36C00000 | v3 & 0x70 | v3 & 0x380 | v3 & 0x1C00 | 0xE000 & v3, v3 >> 15 & 14);
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
            scopeUpdateScope0.updateScope(new y7(this, long0, long1, v, datePickerFormatter0, modifier1, v1, v2));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void DateRangePickerTitle-hOD91z4(int v, @Nullable Modifier modifier0, @Nullable Composer composer0, int v1, int v2) {
        Modifier modifier1;
        int v3;
        Composer composer1 = composer0.startRestartGroup(-1412719908);
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
                ComposerKt.traceEventStart(-1412719908, v3, -1, "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerTitle (DateRangePicker.kt:334)");
            }
            if(DisplayMode.equals-impl0(v, 0)) {
                composer1.startReplaceGroup(0x3A70AD68);
                TextKt.Text--4IGK_g(Strings_androidKt.getString-2EP1pXo(string.m3c_date_range_picker_title, composer1, 0), modifier2, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer1, v3 & 0x70, 0, 0x1FFFC);
            }
            else if(DisplayMode.equals-impl0(v, 1)) {
                composer1.startReplaceGroup(0x3A70BD07);
                TextKt.Text--4IGK_g(Strings_androidKt.getString-2EP1pXo(string.m3c_date_range_input_title, composer1, 0), modifier2, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer1, v3 & 0x70, 0, 0x1FFFC);
            }
            else {
                composer1.startReplaceGroup(0x13A82065);
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
            scopeUpdateScope0.updateScope(new h5(this, v, modifier1, v1, v2, 1));
        }
    }

    public final void a(Long long0, Long long1, int v, DatePickerFormatter datePickerFormatter0, Modifier modifier0, String s, String s1, Function2 function20, Function2 function21, Function2 function22, Composer composer0, int v1, int v2) {
        Composer composer1 = composer0.startRestartGroup(0xCF1A3F64);
        int v3 = (v1 & 6) == 0 ? (composer1.changed(long0) ? 4 : 2) | v1 : v1;
        if((v1 & 0x30) == 0) {
            v3 |= (composer1.changed(long1) ? 0x20 : 16);
        }
        if((v1 & 0x180) == 0) {
            v3 |= (composer1.changed(v) ? 0x100 : 0x80);
        }
        if((v1 & 0xC00) == 0) {
            v3 |= (((v1 & 0x1000) == 0 ? composer1.changed(datePickerFormatter0) : composer1.changedInstance(datePickerFormatter0)) ? 0x800 : 0x400);
        }
        if((v1 & 0x6000) == 0) {
            v3 |= (composer1.changed(modifier0) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v1) == 0) {
            v3 |= (composer1.changed(s) ? 0x20000 : 0x10000);
        }
        if((0x180000 & v1) == 0) {
            v3 |= (composer1.changed(s1) ? 0x100000 : 0x80000);
        }
        if((0xC00000 & v1) == 0) {
            v3 |= (composer1.changedInstance(function20) ? 0x800000 : 0x400000);
        }
        if((0x6000000 & v1) == 0) {
            v3 |= (composer1.changedInstance(function21) ? 0x4000000 : 0x2000000);
        }
        if((0x30000000 & v1) == 0) {
            v3 |= (composer1.changedInstance(function22) ? 0x20000000 : 0x10000000);
        }
        if((306783379 & v3) != 306783378 || (v2 & 1) != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xCF1A3F64, v3, v2, "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerHeadline (DateRangePicker.kt:415)");
            }
            Locale locale0 = CalendarLocale_androidKt.defaultLocale(composer1, 0);
            String s2 = DatePickerFormatter.formatDate$default(datePickerFormatter0, long0, locale0, false, 4, null);
            String s3 = DatePickerFormatter.formatDate$default(datePickerFormatter0, long1, locale0, false, 4, null);
            String s4 = datePickerFormatter0.formatDate(long0, locale0, true);
            composer1.startReplaceGroup(0x3F5E6A30);
            String s5 = "";
            if(s4 == null) {
                if(DisplayMode.equals-impl0(v, 0)) {
                    composer1.startReplaceGroup(1063160130);
                    s4 = Strings_androidKt.getString-2EP1pXo(string.m3c_date_picker_no_selection_description, composer1, 0);
                    composer1.endReplaceGroup();
                }
                else if(DisplayMode.equals-impl0(v, 1)) {
                    composer1.startReplaceGroup(1063163101);
                    s4 = Strings_androidKt.getString-2EP1pXo(string.m3c_date_input_no_input_description, composer1, 0);
                    composer1.endReplaceGroup();
                }
                else {
                    composer1.startReplaceGroup(-1401609201);
                    composer1.endReplaceGroup();
                    s4 = "";
                }
            }
            composer1.endReplaceGroup();
            String s6 = datePickerFormatter0.formatDate(long1, locale0, true);
            composer1.startReplaceGroup(0x3F5EA90E);
            if(s6 != null) {
                s5 = s6;
            }
            else if(DisplayMode.equals-impl0(v, 0)) {
                composer1.startReplaceGroup(0x3F5EC7E2);
                s5 = Strings_androidKt.getString-2EP1pXo(string.m3c_date_picker_no_selection_description, composer1, 0);
                composer1.endReplaceGroup();
            }
            else {
                if(DisplayMode.equals-impl0(v, 1)) {
                    composer1.startReplaceGroup(0x3F5ED37D);
                    s5 = Strings_androidKt.getString-2EP1pXo(string.m3c_date_input_no_input_description, composer1, 0);
                }
                else {
                    composer1.startReplaceGroup(-1401112209);
                }
                composer1.endReplaceGroup();
            }
            composer1.endReplaceGroup();
            String s7 = s + ": " + s4;
            String s8 = s1 + ": " + s5;
            boolean z = composer1.changed(s7);
            boolean z1 = composer1.changed(s8);
            z7 z70 = composer1.rememberedValue();
            if(z || z1 || z70 == Composer.Companion.getEmpty()) {
                z70 = new z7(s7, s8);
                composer1.updateRememberedValue(z70);
            }
            Modifier modifier1 = SemanticsModifierKt.clearAndSetSemantics(modifier0, z70);
            MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.spacedBy-0680j_4(4.0f), Alignment.Companion.getCenterVertically(), composer1, 54);
            int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier2 = ComposedModifierKt.materializeModifier(composer1, modifier1);
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
            Function2 function23 = a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v4)) {
                a.t(v4, composer1, v4, function23);
            }
            Updater.set-impl(composer1, modifier2, composeUiNode$Companion0.getSetModifier());
            if(s2 == null) {
                composer1.startReplaceGroup(303414750);
                function20.invoke(composer1, ((int)(v3 >> 21 & 14)));
            }
            else {
                composer1.startReplaceGroup(303346581);
                TextKt.Text--4IGK_g(s2, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer1, 0, 0, 0x1FFFE);
            }
            composer1.endReplaceGroup();
            function22.invoke(composer1, ((int)(v3 >> 27 & 14)));
            if(s3 == null) {
                composer1.startReplaceGroup(303606144);
                function21.invoke(composer1, ((int)(v3 >> 24 & 14)));
            }
            else {
                composer1.startReplaceGroup(0x1217A6F7);
                TextKt.Text--4IGK_g(s3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer1, 0, 0, 0x1FFFE);
            }
            composer1.endReplaceGroup();
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
            scopeUpdateScope0.updateScope(new e5(this, long0, long1, v, datePickerFormatter0, modifier0, s, s1, function20, function21, function22, v1, v2));
        }
    }
}

