package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.window.DialogProperties;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001A\u009A\u0001\u0010\u0016\u001A\u00020\u00012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00002\u0011\u0010\u0004\u001A\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00052\u0015\b\u0002\u0010\u0007\u001A\u000F\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\u000B\u001A\u00020\n2\b\b\u0002\u0010\r\u001A\u00020\f2\b\b\u0002\u0010\u000F\u001A\u00020\u000E2\u001C\u0010\u0013\u001A\u0018\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u0010¢\u0006\u0002\b\u0003¢\u0006\u0002\b\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0017"}, d2 = {"Lkotlin/Function0;", "", "onDismissRequest", "Landroidx/compose/runtime/Composable;", "confirmButton", "Landroidx/compose/ui/Modifier;", "modifier", "dismissButton", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/unit/Dp;", "tonalElevation", "Landroidx/compose/material3/DatePickerColors;", "colors", "Landroidx/compose/ui/window/DialogProperties;", "properties", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "content", "DatePickerDialog-GmEhDVc", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;FLandroidx/compose/material3/DatePickerColors;Landroidx/compose/ui/window/DialogProperties;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "DatePickerDialog", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDatePickerDialog.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePickerDialog.android.kt\nandroidx/compose/material3/DatePickerDialog_androidKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,121:1\n148#2:122\n148#2:123\n148#2:124\n*S KotlinDebug\n*F\n+ 1 DatePickerDialog.android.kt\nandroidx/compose/material3/DatePickerDialog_androidKt\n*L\n118#1:122\n119#1:123\n120#1:124\n*E\n"})
public final class DatePickerDialog_androidKt {
    public static final PaddingValues a;
    public static final float b;
    public static final float c;

    static {
        DatePickerDialog_androidKt.a = PaddingKt.PaddingValues-a9UjIt4$default(0.0f, 0.0f, 6.0f, 8.0f, 3, null);
        DatePickerDialog_androidKt.b = 8.0f;
        DatePickerDialog_androidKt.c = 12.0f;
    }

    @ExperimentalMaterial3Api
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void DatePickerDialog-GmEhDVc(@NotNull Function0 function00, @NotNull Function2 function20, @Nullable Modifier modifier0, @Nullable Function2 function21, @Nullable Shape shape0, float f, @Nullable DatePickerColors datePickerColors0, @Nullable DialogProperties dialogProperties0, @NotNull Function3 function30, @Nullable Composer composer0, int v, int v1) {
        DatePickerColors datePickerColors2;
        float f2;
        Shape shape2;
        Function2 function23;
        DialogProperties dialogProperties1;
        Modifier modifier1;
        Modifier modifier2;
        int v4;
        DatePickerColors datePickerColors1;
        float f1;
        int v3;
        Shape shape1;
        Function2 function22;
        int v2;
        Composer composer1 = composer0.startRestartGroup(-36517340);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (composer1.changedInstance(function20) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v2 |= (composer1.changed(modifier0) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
            function22 = function21;
        }
        else if((v & 0xC00) == 0) {
            function22 = function21;
            v2 |= (composer1.changedInstance(function22) ? 0x800 : 0x400);
        }
        else {
            function22 = function21;
        }
        if((v & 0x6000) == 0) {
            if((v1 & 16) == 0) {
                shape1 = shape0;
                v3 = composer1.changed(shape1) ? 0x4000 : 0x2000;
            }
            else {
                shape1 = shape0;
                v3 = 0x2000;
            }
            v2 |= v3;
        }
        else {
            shape1 = shape0;
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
            f1 = f;
        }
        else if((0x30000 & v) == 0) {
            f1 = f;
            v2 |= (composer1.changed(f1) ? 0x20000 : 0x10000);
        }
        else {
            f1 = f;
        }
        if((0x180000 & v) == 0) {
            if((v1 & 0x40) == 0) {
                datePickerColors1 = datePickerColors0;
                v4 = composer1.changed(datePickerColors1) ? 0x100000 : 0x80000;
            }
            else {
                datePickerColors1 = datePickerColors0;
                v4 = 0x80000;
            }
            v2 |= v4;
        }
        else {
            datePickerColors1 = datePickerColors0;
        }
        if((v1 & 0x80) != 0) {
            v2 |= 0xC00000;
        }
        else if((v & 0xC00000) == 0) {
            v2 |= (composer1.changed(dialogProperties0) ? 0x800000 : 0x400000);
        }
        if((v1 & 0x100) != 0) {
            v2 |= 0x6000000;
        }
        else if((v & 0x6000000) == 0) {
            v2 |= (composer1.changedInstance(function30) ? 0x4000000 : 0x2000000);
        }
        if((v2 & 0x2492493) != 0x2492492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v1 & 4) == 0 ? modifier0 : Modifier.Companion;
                if((v1 & 8) != 0) {
                    function22 = null;
                }
                if((v1 & 16) != 0) {
                    v2 &= 0xFFFF1FFF;
                    shape1 = DatePickerDefaults.INSTANCE.getShape(composer1, 6);
                }
                if((v1 & 0x20) != 0) {
                    f1 = 0.0f;
                }
                if((v1 & 0x40) != 0) {
                    v2 &= 0xFFC7FFFF;
                    datePickerColors1 = DatePickerDefaults.INSTANCE.colors(composer1, 6);
                }
                dialogProperties1 = (v1 & 0x80) == 0 ? dialogProperties0 : new DialogProperties(false, false, false, 3, null);
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 16) != 0) {
                    v2 &= 0xFFFF1FFF;
                }
                if((v1 & 0x40) != 0) {
                    v2 &= 0xFFC7FFFF;
                }
                modifier2 = modifier0;
                dialogProperties1 = dialogProperties0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-36517340, v2, -1, "androidx.compose.material3.DatePickerDialog (DatePickerDialog.android.kt:76)");
            }
            AlertDialogKt.BasicAlertDialog(function00, SizeKt.wrapContentHeight$default(modifier2, null, false, 3, null), dialogProperties1, ComposableLambdaKt.rememberComposableLambda(-10625622, true, new j5(shape1, datePickerColors1, f1, function30, function22, function20), composer1, 54), composer1, v2 & 14 | 0xC00 | v2 >> 15 & 0x380, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            dialogProperties1 = dialogProperties0;
        }
        function23 = function22;
        shape2 = shape1;
        f2 = f1;
        datePickerColors2 = datePickerColors1;
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new k5(function00, function20, modifier1, function23, shape2, f2, datePickerColors2, dialogProperties1, function30, v, v1));
        }
    }

    public static final float access$getDialogButtonsCrossAxisSpacing$p() [...] // 潜在的解密器

    public static final float access$getDialogButtonsMainAxisSpacing$p() [...] // 潜在的解密器
}

