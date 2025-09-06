package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a0;
import p0.b0;
import p0.c0;
import p0.d0;

@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001Aª\u0001\u0010\u0000\u001A\u00020\u00012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00032\u0011\u0010\u0004\u001A\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\u0015\b\u0002\u0010\b\u001A\u000F\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0015\b\u0002\u0010\t\u001A\u000F\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0015\b\u0002\u0010\n\u001A\u000F\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u000B\u001A\u00020\f2\b\b\u0002\u0010\r\u001A\u00020\u000E2\b\b\u0002\u0010\u000F\u001A\u00020\u000E2\b\b\u0002\u0010\u0010\u001A\u00020\u0011H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001A\u0093\u0001\u0010\u0000\u001A\u00020\u00012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00032\u0011\u0010\u0014\u001A\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\u0015\b\u0002\u0010\t\u001A\u000F\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0015\b\u0002\u0010\n\u001A\u000F\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u000B\u001A\u00020\f2\b\b\u0002\u0010\r\u001A\u00020\u000E2\b\b\u0002\u0010\u000F\u001A\u00020\u000E2\b\b\u0002\u0010\u0010\u001A\u00020\u0011H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0017"}, d2 = {"AlertDialog", "", "onDismissRequest", "Lkotlin/Function0;", "confirmButton", "Landroidx/compose/runtime/Composable;", "modifier", "Landroidx/compose/ui/Modifier;", "dismissButton", "title", "text", "shape", "Landroidx/compose/ui/graphics/Shape;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "properties", "Landroidx/compose/ui/window/DialogProperties;", "AlertDialog-6oU6zVQ", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/ui/window/DialogProperties;Landroidx/compose/runtime/Composer;II)V", "buttons", "AlertDialog-wqdebIU", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/ui/window/DialogProperties;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class AndroidAlertDialog_androidKt {
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void AlertDialog-6oU6zVQ(@NotNull Function0 function00, @NotNull Function2 function20, @Nullable Modifier modifier0, @Nullable Function2 function21, @Nullable Function2 function22, @Nullable Function2 function23, @Nullable Shape shape0, long v, long v1, @Nullable DialogProperties dialogProperties0, @Nullable Composer composer0, int v2, int v3) {
        long v6;
        Function2 function27;
        Function2 function26;
        DialogProperties dialogProperties1;
        Shape shape1;
        Function2 function25;
        Modifier modifier1;
        long v8;
        Function2 function29;
        int v7;
        DialogProperties dialogProperties2;
        Shape shape2;
        Function2 function28;
        Modifier modifier2;
        int v9;
        Modifier modifier4;
        long v5;
        Function2 function24;
        int v4;
        Composer composer1 = composer0.startRestartGroup(0xDBD8FB89);
        if((v3 & 1) == 0) {
            v4 = (v2 & 14) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v2 : v2;
        }
        else {
            v4 = v2 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
        }
        else if((v2 & 0x70) == 0) {
            v4 |= (composer1.changedInstance(function20) ? 0x20 : 16);
        }
        if((v3 & 4) != 0) {
            v4 |= 0x180;
        }
        else if((v2 & 0x380) == 0) {
            v4 |= (composer1.changed(modifier0) ? 0x100 : 0x80);
        }
        if((v3 & 8) != 0) {
            v4 |= 0xC00;
            function24 = function21;
        }
        else if((v2 & 0x1C00) == 0) {
            function24 = function21;
            v4 |= (composer1.changedInstance(function24) ? 0x800 : 0x400);
        }
        else {
            function24 = function21;
        }
        if((v3 & 16) != 0) {
            v4 |= 0x6000;
        }
        else if((v2 & 0xE000) == 0) {
            v4 |= (composer1.changedInstance(function22) ? 0x4000 : 0x2000);
        }
        if((v3 & 0x20) != 0) {
            v4 |= 0x30000;
        }
        else if((v2 & 0x70000) == 0) {
            v4 |= (composer1.changedInstance(function23) ? 0x20000 : 0x10000);
        }
        if((v2 & 0x380000) == 0) {
            v4 |= ((v3 & 0x40) != 0 || !composer1.changed(shape0) ? 0x80000 : 0x100000);
        }
        if((v2 & 0x1C00000) == 0) {
            v4 |= ((v3 & 0x80) != 0 || !composer1.changed(v) ? 0x400000 : 0x800000);
        }
        if((v2 & 0xE000000) == 0) {
            v5 = v1;
            v4 |= ((v3 & 0x100) != 0 || !composer1.changed(v5) ? 0x2000000 : 0x4000000);
        }
        else {
            v5 = v1;
        }
        if((v3 & 0x200) != 0) {
            v4 |= 0x30000000;
        }
        else if((v2 & 0x70000000) == 0) {
            v4 |= (composer1.changed(dialogProperties0) ? 0x20000000 : 0x10000000);
        }
        if((v4 & 0x5B6DB6DB) != 306783378 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v2 & 1) == 0 || composer1.getDefaultsInvalid()) {
                Modifier modifier3 = (v3 & 4) == 0 ? modifier0 : Modifier.Companion;
                function29 = null;
                if((v3 & 8) != 0) {
                    function24 = null;
                }
                function28 = (v3 & 16) == 0 ? function22 : null;
                if((v3 & 0x20) == 0) {
                    function29 = function23;
                }
                if((v3 & 0x40) == 0) {
                    shape2 = shape0;
                }
                else {
                    shape2 = MaterialTheme.INSTANCE.getShapes(composer1, 6).getMedium();
                    v4 &= 0xFFC7FFFF;
                }
                if((v3 & 0x80) == 0) {
                    modifier4 = modifier3;
                    v9 = v4;
                    v8 = v;
                }
                else {
                    modifier4 = modifier3;
                    v9 = v4 & 0xFE3FFFFF;
                    v8 = MaterialTheme.INSTANCE.getColors(composer1, 6).getSurface-0d7_KjU();
                }
                if((v3 & 0x100) != 0) {
                    v5 = ColorsKt.contentColorFor-ek8zF_U(v8, composer1, v9 >> 21 & 14);
                    v9 &= 0xF1FFFFFF;
                }
                if((v3 & 0x200) == 0) {
                    modifier2 = modifier4;
                    v7 = v9;
                    dialogProperties2 = dialogProperties0;
                }
                else {
                    v7 = v9;
                    dialogProperties2 = new DialogProperties(false, false, null, 7, null);
                    modifier2 = modifier4;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v3 & 0x40) != 0) {
                    v4 &= 0xFFC7FFFF;
                }
                if((v3 & 0x80) != 0) {
                    v4 &= 0xFE3FFFFF;
                }
                if((v3 & 0x100) != 0) {
                    v4 &= 0xF1FFFFFF;
                }
                modifier2 = modifier0;
                function28 = function22;
                shape2 = shape0;
                dialogProperties2 = dialogProperties0;
                v7 = v4;
                function29 = function23;
                v8 = v;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xDBD8FB89, v7, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:74)");
            }
            AndroidAlertDialog_androidKt.AlertDialog-wqdebIU(function00, ComposableLambdaKt.composableLambda(composer1, 0x91C03A41, true, new a0(function24, function20)), modifier2, function28, function29, shape2, v8, v5, dialogProperties2, composer1, v7 & 14 | 0x30 | v7 & 0x380 | v7 >> 3 & 0x1C00 | 0xE000 & v7 >> 3 | 0x70000 & v7 >> 3 | v7 >> 3 & 0x380000 | v7 >> 3 & 0x1C00000 | v7 >> 3 & 0xE000000, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            dialogProperties1 = dialogProperties2;
            function27 = function29;
            function25 = function28;
            shape1 = shape2;
            modifier1 = modifier2;
            function26 = function24;
            v6 = v8;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            function25 = function22;
            shape1 = shape0;
            dialogProperties1 = dialogProperties0;
            function26 = function24;
            function27 = function23;
            v6 = v;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new b0(function00, function20, modifier1, function26, function25, function27, shape1, v6, v5, dialogProperties1, v2, v3));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void AlertDialog-wqdebIU(@NotNull Function0 function00, @NotNull Function2 function20, @Nullable Modifier modifier0, @Nullable Function2 function21, @Nullable Function2 function22, @Nullable Shape shape0, long v, long v1, @Nullable DialogProperties dialogProperties0, @Nullable Composer composer0, int v2, int v3) {
        DialogProperties dialogProperties1;
        Shape shape1;
        long v8;
        long v7;
        Function2 function25;
        Modifier modifier1;
        Function2 function24;
        Modifier modifier2;
        DialogProperties dialogProperties2;
        int v6;
        long v5;
        Function2 function23;
        int v4;
        Composer composer1 = composer0.startRestartGroup(1035523925);
        if((v3 & 1) == 0) {
            v4 = (v2 & 14) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v2 : v2;
        }
        else {
            v4 = v2 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
        }
        else if((v2 & 0x70) == 0) {
            v4 |= (composer1.changedInstance(function20) ? 0x20 : 16);
        }
        if((v3 & 4) != 0) {
            v4 |= 0x180;
        }
        else if((v2 & 0x380) == 0) {
            v4 |= (composer1.changed(modifier0) ? 0x100 : 0x80);
        }
        if((v3 & 8) != 0) {
            v4 |= 0xC00;
            function23 = function21;
        }
        else if((v2 & 0x1C00) == 0) {
            function23 = function21;
            v4 |= (composer1.changedInstance(function23) ? 0x800 : 0x400);
        }
        else {
            function23 = function21;
        }
        if((v3 & 16) != 0) {
            v4 |= 0x6000;
        }
        else if((0xE000 & v2) == 0) {
            v4 |= (composer1.changedInstance(function22) ? 0x4000 : 0x2000);
        }
        if((0x70000 & v2) == 0) {
            v4 |= ((v3 & 0x20) != 0 || !composer1.changed(shape0) ? 0x10000 : 0x20000);
        }
        if((0x380000 & v2) == 0) {
            if((v3 & 0x40) == 0) {
                v5 = v;
                v6 = composer1.changed(v5) ? 0x100000 : 0x80000;
            }
            else {
                v5 = v;
                v6 = 0x80000;
            }
            v4 |= v6;
        }
        else {
            v5 = v;
        }
        if((v2 & 0x1C00000) == 0) {
            v4 |= ((v3 & 0x80) != 0 || !composer1.changed(v1) ? 0x400000 : 0x800000);
        }
        if((v3 & 0x100) != 0) {
            v4 |= 0x6000000;
        }
        else if((v2 & 0xE000000) == 0) {
            v4 |= (composer1.changed(dialogProperties0) ? 0x4000000 : 0x2000000);
        }
        if((v4 & 0xB6DB6DB) != 0x2492492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v2 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v3 & 4) == 0 ? modifier0 : Modifier.Companion;
                function24 = null;
                if((v3 & 8) != 0) {
                    function23 = null;
                }
                if((v3 & 16) == 0) {
                    function24 = function22;
                }
                if((v3 & 0x20) == 0) {
                    shape1 = shape0;
                }
                else {
                    shape1 = MaterialTheme.INSTANCE.getShapes(composer1, 6).getMedium();
                    v4 &= 0xFFF8FFFF;
                }
                if((v3 & 0x40) != 0) {
                    v5 = MaterialTheme.INSTANCE.getColors(composer1, 6).getSurface-0d7_KjU();
                    v4 &= 0xFFC7FFFF;
                }
                if((v3 & 0x80) == 0) {
                    v7 = v1;
                }
                else {
                    v7 = ColorsKt.contentColorFor-ek8zF_U(v5, composer1, v4 >> 18 & 14);
                    v4 &= 0xFE3FFFFF;
                }
                dialogProperties2 = (v3 & 0x100) == 0 ? dialogProperties0 : new DialogProperties(false, false, null, 7, null);
            }
            else {
                composer1.skipToGroupEnd();
                if((v3 & 0x20) != 0) {
                    v4 &= 0xFFF8FFFF;
                }
                if((v3 & 0x40) != 0) {
                    v4 &= 0xFFC7FFFF;
                }
                if((v3 & 0x80) != 0) {
                    v4 &= 0xFE3FFFFF;
                }
                function24 = function22;
                dialogProperties2 = dialogProperties0;
                modifier2 = modifier0;
                v7 = v1;
                shape1 = shape0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1035523925, v4, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:135)");
            }
            AndroidDialog_androidKt.Dialog(function00, dialogProperties2, ComposableLambdaKt.composableLambda(composer1, 0x9576276C, true, new c0(function20, modifier2, function23, function24, shape1, v5, v7)), composer1, v4 >> 21 & 0x70 | (v4 & 14 | 0x180), 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            dialogProperties1 = dialogProperties2;
            modifier1 = modifier2;
            function25 = function23;
            v8 = v5;
        }
        else {
            composer1.skipToGroupEnd();
            function24 = function22;
            modifier1 = modifier0;
            function25 = function23;
            v7 = v1;
            v8 = v5;
            shape1 = shape0;
            dialogProperties1 = dialogProperties0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new d0(function00, function20, modifier1, function25, function24, shape1, v8, v7, dialogProperties1, v2, v3));
        }
    }
}

