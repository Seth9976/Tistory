package androidx.compose.material3;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.window.DialogProperties;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001Aß\u0001\u0010\u0000\u001A\u00020\u00012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00032\u0011\u0010\u0004\u001A\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\u0015\b\u0002\u0010\b\u001A\u000F\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0015\b\u0002\u0010\t\u001A\u000F\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0015\b\u0002\u0010\n\u001A\u000F\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0015\b\u0002\u0010\u000B\u001A\u000F\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\f\u001A\u00020\r2\b\b\u0002\u0010\u000E\u001A\u00020\u000F2\b\b\u0002\u0010\u0010\u001A\u00020\u000F2\b\b\u0002\u0010\u0011\u001A\u00020\u000F2\b\b\u0002\u0010\u0012\u001A\u00020\u000F2\b\b\u0002\u0010\u0013\u001A\u00020\u00142\b\b\u0002\u0010\u0015\u001A\u00020\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0019"}, d2 = {"AlertDialog", "", "onDismissRequest", "Lkotlin/Function0;", "confirmButton", "Landroidx/compose/runtime/Composable;", "modifier", "Landroidx/compose/ui/Modifier;", "dismissButton", "icon", "title", "text", "shape", "Landroidx/compose/ui/graphics/Shape;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "iconContentColor", "titleContentColor", "textContentColor", "tonalElevation", "Landroidx/compose/ui/unit/Dp;", "properties", "Landroidx/compose/ui/window/DialogProperties;", "AlertDialog-Oix01E0", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;JJJJFLandroidx/compose/ui/window/DialogProperties;Landroidx/compose/runtime/Composer;III)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class AndroidAlertDialog_androidKt {
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void AlertDialog-Oix01E0(@NotNull Function0 function00, @NotNull Function2 function20, @Nullable Modifier modifier0, @Nullable Function2 function21, @Nullable Function2 function22, @Nullable Function2 function23, @Nullable Function2 function24, @Nullable Shape shape0, long v, long v1, long v2, long v3, float f, @Nullable DialogProperties dialogProperties0, @Nullable Composer composer0, int v4, int v5, int v6) {
        long v14;
        long v13;
        Modifier modifier2;
        Shape shape2;
        Function2 function29;
        Function2 function28;
        DialogProperties dialogProperties1;
        float f1;
        long v12;
        long v11;
        Function2 function27;
        Function2 function26;
        float f2;
        int v19;
        DialogProperties dialogProperties2;
        int v18;
        Function2 function212;
        long v17;
        long v16;
        long v15;
        Function2 function211;
        Function2 function210;
        long v23;
        long v22;
        long v21;
        long v20;
        int v9;
        Shape shape1;
        Function2 function25;
        Modifier modifier1;
        int v7;
        Composer composer1 = composer0.startRestartGroup(0x83F12AD0);
        if((v6 & 1) == 0) {
            v7 = (v4 & 6) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v4 : v4;
        }
        else {
            v7 = v4 | 6;
        }
        if((v6 & 2) != 0) {
            v7 |= 0x30;
        }
        else if((v4 & 0x30) == 0) {
            v7 |= (composer1.changedInstance(function20) ? 0x20 : 16);
        }
        if((v6 & 4) != 0) {
            v7 |= 0x180;
            modifier1 = modifier0;
        }
        else if((v4 & 0x180) == 0) {
            modifier1 = modifier0;
            v7 |= (composer1.changed(modifier1) ? 0x100 : 0x80);
        }
        else {
            modifier1 = modifier0;
        }
        int v8 = 0x400;
        if((v6 & 8) != 0) {
            v7 |= 0xC00;
        }
        else if((v4 & 0xC00) == 0) {
            v7 |= (composer1.changedInstance(function21) ? 0x800 : 0x400);
        }
        if((v6 & 16) != 0) {
            v7 |= 0x6000;
        }
        else if((v4 & 0x6000) == 0) {
            v7 |= (composer1.changedInstance(function22) ? 0x4000 : 0x2000);
        }
        if((v6 & 0x20) == 0) {
            function25 = function23;
            if((v4 & 0x30000) == 0) {
                v7 |= (composer1.changedInstance(function25) ? 0x20000 : 0x10000);
            }
        }
        else {
            v7 |= 0x30000;
            function25 = function23;
        }
        if((v6 & 0x40) != 0) {
            v7 |= 0x180000;
        }
        else if((v4 & 0x180000) == 0) {
            v7 |= (composer1.changedInstance(function24) ? 0x100000 : 0x80000);
        }
        if((v4 & 0xC00000) == 0) {
            if((v6 & 0x80) == 0) {
                shape1 = shape0;
                v9 = composer1.changed(shape1) ? 0x800000 : 0x400000;
            }
            else {
                shape1 = shape0;
                v9 = 0x400000;
            }
            v7 |= v9;
        }
        else {
            shape1 = shape0;
        }
        if((v4 & 0x6000000) == 0) {
            v7 |= ((v6 & 0x100) != 0 || !composer1.changed(v) ? 0x2000000 : 0x4000000);
        }
        if((0x30000000 & v4) == 0) {
            v7 |= ((v6 & 0x200) != 0 || !composer1.changed(v1) ? 0x10000000 : 0x20000000);
        }
        int v10 = (v5 & 6) == 0 ? v5 | ((v6 & 0x400) != 0 || !composer1.changed(v2) ? 2 : 4) : v5;
        if((v5 & 0x30) == 0) {
            v10 |= ((v6 & 0x800) != 0 || !composer1.changed(v3) ? 16 : 0x20);
        }
        if((v6 & 0x1000) != 0) {
            v10 |= 0x180;
        }
        else if((v5 & 0x180) == 0) {
            v10 |= (composer1.changed(f) ? 0x100 : 0x80);
        }
        if((v6 & 0x2000) != 0) {
            v10 |= 0xC00;
        }
        else if((v5 & 0xC00) == 0) {
            if(composer1.changed(dialogProperties0)) {
                v8 = 0x800;
            }
            v10 |= v8;
        }
        if((v7 & 306783379) != 306783378 || (v10 & 0x493) != 1170 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v4 & 1) == 0 || composer1.getDefaultsInvalid()) {
                if((v6 & 4) != 0) {
                    modifier1 = Modifier.Companion;
                }
                function212 = null;
                function210 = (v6 & 8) == 0 ? function21 : null;
                if((v6 & 0x20) != 0) {
                    function25 = null;
                }
                if((v6 & 0x40) == 0) {
                    function212 = function24;
                }
                if((v6 & 0x80) != 0) {
                    v7 &= 0xFE3FFFFF;
                    shape1 = AlertDialogDefaults.INSTANCE.getShape(composer1, 6);
                }
                if((v6 & 0x100) == 0) {
                    v20 = v;
                }
                else {
                    v20 = AlertDialogDefaults.INSTANCE.getContainerColor(composer1, 6);
                    v7 &= 0xF1FFFFFF;
                }
                if((v6 & 0x200) == 0) {
                    v21 = v1;
                }
                else {
                    v21 = AlertDialogDefaults.INSTANCE.getIconContentColor(composer1, 6);
                    v7 &= 0x8FFFFFFF;
                }
                if((v6 & 0x400) == 0) {
                    v22 = v2;
                }
                else {
                    v22 = AlertDialogDefaults.INSTANCE.getTitleContentColor(composer1, 6);
                    v10 &= -15;
                }
                if((v6 & 0x800) == 0) {
                    v23 = v3;
                }
                else {
                    v23 = AlertDialogDefaults.INSTANCE.getTextContentColor(composer1, 6);
                    v10 &= 0xFFFFFF8F;
                }
                dialogProperties2 = (v6 & 0x2000) == 0 ? dialogProperties0 : new DialogProperties(false, false, false, 7, null);
                v18 = v10;
                v15 = v20;
                v16 = v21;
                v17 = v22;
                v12 = v23;
                v19 = v7;
                f2 = (v6 & 0x1000) == 0 ? f : 0.0f;
                function211 = (v6 & 16) == 0 ? function22 : null;
            }
            else {
                composer1.skipToGroupEnd();
                if((v6 & 0x80) != 0) {
                    v7 &= 0xFE3FFFFF;
                }
                if((v6 & 0x100) != 0) {
                    v7 &= 0xF1FFFFFF;
                }
                if((v6 & 0x200) != 0) {
                    v7 &= 0x8FFFFFFF;
                }
                if((v6 & 0x400) != 0) {
                    v10 &= -15;
                }
                if((v6 & 0x800) != 0) {
                    v10 &= 0xFFFFFF8F;
                }
                function210 = function21;
                function211 = function22;
                v15 = v;
                v16 = v1;
                v17 = v2;
                v12 = v3;
                function212 = function24;
                v18 = v10;
                dialogProperties2 = dialogProperties0;
                v19 = v7;
                f2 = f;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x83F12AD0, v19, v18, "androidx.compose.material3.AlertDialog (AndroidAlertDialog.android.kt:46)");
            }
            AlertDialogKt.AlertDialogImpl-wrnwzgE(function00, function20, modifier1, function210, function211, function25, function212, shape1, v15, v16, v17, v12, f2, dialogProperties2, composer1, v19 & 0x7FFFFFFE, v18 & 0x1FFE);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f1 = f2;
            function28 = function25;
            dialogProperties1 = dialogProperties2;
            shape2 = shape1;
            v11 = v17;
            function27 = function211;
            function29 = function212;
            function26 = function210;
            v13 = v15;
            modifier2 = modifier1;
            v14 = v16;
        }
        else {
            composer1.skipToGroupEnd();
            function26 = function21;
            function27 = function22;
            v11 = v2;
            v12 = v3;
            f1 = f;
            dialogProperties1 = dialogProperties0;
            function28 = function25;
            function29 = function24;
            shape2 = shape1;
            modifier2 = modifier1;
            v13 = v;
            v14 = v1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new s(function00, function20, modifier2, function26, function27, function28, function29, shape2, v13, v14, v11, v12, f1, dialogProperties1, v4, v5, v6));
        }
    }
}

