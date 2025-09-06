package androidx.compose.material3;

import aa.q;
import androidx.activity.g0;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.DateInputFormat;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.input.TextFieldValue;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000z\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001Af\u0010\u0012\u001A\u00020\u00062\b\u0010\u0001\u001A\u0004\u0018\u00010\u00002#\u0010\u0007\u001A\u001F\u0012\u0015\u0012\u0013\u0018\u00010\u0000¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u00022\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\r\u001A\u00020\f2\u0006\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0011\u001A\u00020\u0010H\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001A\u0098\u0001\u0010&\u001A\u00020\u00062\u0006\u0010\u0015\u001A\u00020\u00142\b\u0010\u0016\u001A\u0004\u0018\u00010\u00002\u0014\u0010\u0007\u001A\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0004\u0012\u00020\u00060\u00022\u0006\u0010\t\u001A\u00020\b2\u0013\u0010\u0019\u001A\u000F\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0013\u0010\u001A\u001A\u000F\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0006\u0010\u001C\u001A\u00020\u001B2\u0006\u0010\u001E\u001A\u00020\u001D2\u0006\u0010 \u001A\u00020\u001F2\n\u0010#\u001A\u00060!j\u0002`\"2\u0006\u0010\u0011\u001A\u00020\u0010H\u0001ø\u0001\u0000¢\u0006\u0004\b$\u0010%\"\u001A\u0010,\u001A\u00020\'8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u0010)\u001A\u0004\b*\u0010+\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006/²\u0006\u000E\u0010.\u001A\u00020-8\n@\nX\u008A\u008E\u0002"}, d2 = {"", "selectedDateMillis", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "dateInMillis", "", "onDateSelectionChange", "Landroidx/compose/material3/internal/CalendarModel;", "calendarModel", "Lkotlin/ranges/IntRange;", "yearRange", "Landroidx/compose/material3/DatePickerFormatter;", "dateFormatter", "Landroidx/compose/material3/SelectableDates;", "selectableDates", "Landroidx/compose/material3/DatePickerColors;", "colors", "DateInputContent", "(Ljava/lang/Long;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/internal/CalendarModel;Lkotlin/ranges/IntRange;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/Modifier;", "modifier", "initialDateMillis", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "label", "placeholder", "Landroidx/compose/material3/InputIdentifier;", "inputIdentifier", "Landroidx/compose/material3/DateInputValidator;", "dateInputValidator", "Landroidx/compose/material3/internal/DateInputFormat;", "dateInputFormat", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "DateInputTextField-tQNruF0", "(Landroidx/compose/ui/Modifier;Ljava/lang/Long;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/internal/CalendarModel;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ILandroidx/compose/material3/DateInputValidator;Landroidx/compose/material3/internal/DateInputFormat;Ljava/util/Locale;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;II)V", "DateInputTextField", "Landroidx/compose/foundation/layout/PaddingValues;", "a", "Landroidx/compose/foundation/layout/PaddingValues;", "getInputTextFieldPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "InputTextFieldPadding", "Landroidx/compose/ui/text/input/TextFieldValue;", "text", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDateInput.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateInput.kt\nandroidx/compose/material3/DateInputKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Strings.android.kt\nandroidx/compose/material3/internal/Strings$Companion\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,386:1\n1223#2,6:387\n1223#2,6:396\n1223#2,6:403\n1223#2,6:409\n1223#2,6:416\n141#3:393\n144#3:394\n138#3:395\n129#3:402\n148#4:415\n148#4:425\n148#4:426\n81#5:422\n107#5,2:423\n*S KotlinDebug\n*F\n+ 1 DateInput.kt\nandroidx/compose/material3/DateInputKt\n*L\n65#1:387,6\n70#1:396,6\n125#1:403,6\n143#1:409,6\n189#1:416,6\n66#1:393\n67#1:394\n68#1:395\n83#1:402\n184#1:415\n381#1:425\n385#1:426\n125#1:422\n125#1:423,2\n*E\n"})
public final class DateInputKt {
    public static final PaddingValues a;
    public static final float b;

    static {
        DateInputKt.a = PaddingKt.PaddingValues-a9UjIt4$default(24.0f, 10.0f, 24.0f, 0.0f, 8, null);
        DateInputKt.b = 16.0f;
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void DateInputContent(@Nullable Long long0, @NotNull Function1 function10, @NotNull CalendarModel calendarModel0, @NotNull IntRange intRange0, @NotNull DatePickerFormatter datePickerFormatter0, @NotNull SelectableDates selectableDates0, @NotNull DatePickerColors datePickerColors0, @Nullable Composer composer0, int v) {
        int v2;
        Locale locale1;
        DateInputFormat dateInputFormat1;
        Composer composer1 = composer0.startRestartGroup(643325609);
        int v1 = (v & 6) == 0 ? (composer1.changed(long0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (composer1.changedInstance(function10) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (composer1.changedInstance(calendarModel0) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (composer1.changedInstance(intRange0) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            v1 |= (((v & 0x8000) == 0 ? composer1.changed(datePickerFormatter0) : composer1.changedInstance(datePickerFormatter0)) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v) == 0) {
            v1 |= (composer1.changed(selectableDates0) ? 0x20000 : 0x10000);
        }
        if((0x180000 & v) == 0) {
            v1 |= (composer1.changed(datePickerColors0) ? 0x100000 : 0x80000);
        }
        if((0x92493 & v1) != 0x92492 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(643325609, v1, -1, "androidx.compose.material3.DateInputContent (DateInput.kt:60)");
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
            boolean z1 = composer1.changed(dateInputFormat0);
            boolean z2 = (v1 & 0xE000) == 0x4000 || (v1 & 0x8000) != 0 && composer1.changed(datePickerFormatter0);
            DateInputValidator dateInputValidator0 = composer1.rememberedValue();
            if(z1 || z2 || dateInputValidator0 == Composer.Companion.getEmpty()) {
                dateInputFormat1 = dateInputFormat0;
                locale1 = locale0;
                v2 = v1;
                DateInputValidator dateInputValidator1 = new DateInputValidator(intRange0, selectableDates0, dateInputFormat1, datePickerFormatter0, s, s1, s2, "", null, null, 0x300, null);
                composer1.updateRememberedValue(dateInputValidator1);
                dateInputValidator0 = dateInputValidator1;
            }
            else {
                dateInputFormat1 = dateInputFormat0;
                locale1 = locale0;
                v2 = v1;
            }
            String s3 = dateInputFormat1.getPatternWithDelimiters().toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(s3, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            String s4 = Strings_androidKt.getString-2EP1pXo(string.m3c_date_input_label, composer1, 0);
            Modifier modifier0 = PaddingKt.padding(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), DateInputKt.a);
            dateInputValidator0.setCurrentStartDateMillis$material3_release(long0);
            DateInputKt.DateInputTextField-tQNruF0(modifier0, long0, function10, calendarModel0, ComposableLambdaKt.rememberComposableLambda(0x9394082B, true, new z4(s4, s3), composer1, 54), ComposableLambdaKt.rememberComposableLambda(-564233108, true, new b5(s3), composer1, 54), 0, dateInputValidator0, dateInputFormat1, locale1, datePickerColors0, composer1, v2 << 3 & 0x70 | 0x1B6006 | v2 << 3 & 0x380 | v2 << 3 & 0x1C00, v2 >> 18 & 14);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new c5(long0, function10, calendarModel0, intRange0, datePickerFormatter0, selectableDates0, datePickerColors0, v, 0));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void DateInputTextField-tQNruF0(@NotNull Modifier modifier0, @Nullable Long long0, @NotNull Function1 function10, @NotNull CalendarModel calendarModel0, @Nullable Function2 function20, @Nullable Function2 function21, int v, @NotNull DateInputValidator dateInputValidator0, @NotNull DateInputFormat dateInputFormat0, @NotNull Locale locale0, @NotNull DatePickerColors datePickerColors0, @Nullable Composer composer0, int v1, int v2) {
        MutableState mutableState2;
        MutableState mutableState0;
        int v7;
        int v6;
        int v5;
        Composer composer1 = composer0.startRestartGroup(-857008589);
        int v3 = 4;
        int v4 = (v1 & 6) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v1 : v1;
        if((v1 & 0x30) == 0) {
            v4 |= (composer1.changed(long0) ? 0x20 : 16);
        }
        if((v1 & 0x180) == 0) {
            v4 |= (composer1.changedInstance(function10) ? 0x100 : 0x80);
        }
        if((v1 & 0xC00) == 0) {
            v4 |= (composer1.changedInstance(calendarModel0) ? 0x800 : 0x400);
        }
        if((v1 & 0x6000) == 0) {
            v4 |= (composer1.changedInstance(function20) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v1) == 0) {
            v4 |= (composer1.changedInstance(function21) ? 0x20000 : 0x10000);
        }
        if((v1 & 0x180000) == 0) {
            v4 |= (composer1.changed(v) ? 0x100000 : 0x80000);
        }
        if((v1 & 0xC00000) == 0) {
            v4 |= (composer1.changed(dateInputValidator0) ? 0x800000 : 0x400000);
        }
        if((v1 & 0x6000000) == 0) {
            v4 |= (composer1.changed(dateInputFormat0) ? 0x4000000 : 0x2000000);
        }
        if((v1 & 0x30000000) == 0) {
            v4 |= (composer1.changedInstance(locale0) ? 0x20000000 : 0x10000000);
        }
        if((v2 & 6) == 0) {
            if(!composer1.changed(datePickerColors0)) {
                v3 = 2;
            }
            v5 = v2 | v3;
        }
        else {
            v5 = v2;
        }
        if((v4 & 306783379) != 306783378 || (v5 & 3) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-857008589, v4, v5, "androidx.compose.material3.DateInputTextField (DateInput.kt:121)");
            }
            Object object0 = RememberSaveableKt.rememberSaveable(new Object[0], null, null, m4.z, composer1, 0xC00, 6);
            Saver saver0 = TextFieldValue.Companion.getSaver();
            boolean z = composer1.changedInstance(calendarModel0);
            boolean z1 = composer1.changedInstance(locale0);
            g0 g00 = composer1.rememberedValue();
            if(((v4 & 0x70) == 0x20 | z | ((v4 & 0xE000000) == 0x4000000 ? 1 : 0) | z1) != 0 || g00 == Composer.Companion.getEmpty()) {
                mutableState0 = (MutableState)object0;
                v6 = v4 & 0xE000000;
                v7 = v4;
                g0 g01 = new g0(1, long0, calendarModel0, dateInputFormat0, locale0);
                composer1.updateRememberedValue(g01);
                g00 = g01;
            }
            else {
                v6 = v4 & 0xE000000;
                v7 = v4;
                mutableState0 = (MutableState)object0;
            }
            MutableState mutableState1 = RememberSaveableKt.rememberSaveable(new Object[0], saver0, null, g00, composer1, 0, 4);
            Object object1 = mutableState1.getValue();
            boolean z2 = composer1.changed(mutableState1);
            boolean z3 = composer1.changed(mutableState0);
            boolean z4 = composer1.changedInstance(calendarModel0);
            boolean z5 = composer1.changedInstance(locale0);
            d5 d50 = composer1.rememberedValue();
            if((v6 == 0x4000000 | z2 | z3 | ((v7 & 0x380) == 0x100 ? 1 : 0) | z4 | ((0x1C00000 & v7) == 0x800000 ? 1 : 0) | ((0x380000 & v7) == 0x100000 ? 1 : 0) | z5) != 0 || d50 == Composer.Companion.getEmpty()) {
                mutableState2 = mutableState0;
                d5 d51 = new d5(dateInputFormat0, mutableState0, function10, calendarModel0, dateInputValidator0, v, locale0, mutableState1);
                composer1.updateRememberedValue(d51);
                d50 = d51;
            }
            else {
                mutableState2 = mutableState0;
            }
            Modifier modifier1 = PaddingKt.padding-qDBjuR0$default(modifier0, 0.0f, 0.0f, 0.0f, (p.isBlank(((CharSequence)mutableState2.getValue())) ? DateInputKt.b : 0.0f), 7, null);
            boolean z6 = composer1.changed(mutableState2);
            q q0 = composer1.rememberedValue();
            if(z6 || q0 == Composer.Companion.getEmpty()) {
                q0 = new q(mutableState2, 2);
                composer1.updateRememberedValue(q0);
            }
            OutlinedTextFieldKt.OutlinedTextField(((TextFieldValue)object1), d50, SemanticsModifierKt.semantics$default(modifier1, false, q0, 1, null), false, false, null, function20, function21, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(0xDCB6EB5A, true, new x(mutableState2, 1), composer1, 54), !p.isBlank(((CharSequence)mutableState2.getValue())), new s8(dateInputFormat0), new KeyboardOptions(0, Boolean.FALSE, 3, 7, null, null, null, 0x71, null), null, true, 0, 0, null, null, datePickerColors0.getDateTextFieldColors(), composer1, v7 << 6 & 0x1F80000, 0xC30180, 0, 0x3D0F38);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new e5(modifier0, long0, function10, calendarModel0, function20, function21, v, dateInputValidator0, dateInputFormat0, locale0, datePickerColors0, v1, v2));
        }
    }

    public static final void access$DateInputTextField_tQNruF0$lambda$5(MutableState mutableState0, TextFieldValue textFieldValue0) {
        mutableState0.setValue(textFieldValue0);
    }

    @NotNull
    public static final PaddingValues getInputTextFieldPadding() {
        return DateInputKt.a;
    }
}

