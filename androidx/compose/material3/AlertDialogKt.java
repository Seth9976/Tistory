package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\u001AD\u0010\t\u001A\u00020\u00012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00052\u0011\u0010\b\u001A\r\u0012\u0004\u0012\u00020\u00010\u0000\u00A2\u0006\u0002\b\u0007H\u0007\u00A2\u0006\u0004\b\t\u0010\n\u001AD\u0010\u000B\u001A\u00020\u00012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00052\u0011\u0010\b\u001A\r\u0012\u0004\u0012\u00020\u00010\u0000\u00A2\u0006\u0002\b\u0007H\u0007\u00A2\u0006\u0004\b\u000B\u0010\n\u001A\u00C7\u0001\u0010\u001C\u001A\u00020\u00012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00002\u0011\u0010\f\u001A\r\u0012\u0004\u0012\u00020\u00010\u0000\u00A2\u0006\u0002\b\u00072\u0006\u0010\u0004\u001A\u00020\u00032\u0013\u0010\r\u001A\u000F\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000\u00A2\u0006\u0002\b\u00072\u0013\u0010\u000E\u001A\u000F\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000\u00A2\u0006\u0002\b\u00072\u0013\u0010\u000F\u001A\u000F\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000\u00A2\u0006\u0002\b\u00072\u0013\u0010\u0010\u001A\u000F\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000\u00A2\u0006\u0002\b\u00072\u0006\u0010\u0012\u001A\u00020\u00112\u0006\u0010\u0014\u001A\u00020\u00132\u0006\u0010\u0015\u001A\u00020\u00132\u0006\u0010\u0016\u001A\u00020\u00132\u0006\u0010\u0017\u001A\u00020\u00132\u0006\u0010\u0019\u001A\u00020\u00182\u0006\u0010\u0006\u001A\u00020\u0005H\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001A\u0010\u001B\u001A\u00A6\u0001\u0010!\u001A\u00020\u00012\u0011\u0010\u001D\u001A\r\u0012\u0004\u0012\u00020\u00010\u0000\u00A2\u0006\u0002\b\u00072\b\b\u0002\u0010\u0004\u001A\u00020\u00032\u0013\u0010\u000E\u001A\u000F\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000\u00A2\u0006\u0002\b\u00072\u0013\u0010\u000F\u001A\u000F\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000\u00A2\u0006\u0002\b\u00072\u0013\u0010\u0010\u001A\u000F\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000\u00A2\u0006\u0002\b\u00072\u0006\u0010\u0012\u001A\u00020\u00112\u0006\u0010\u0014\u001A\u00020\u00132\u0006\u0010\u0019\u001A\u00020\u00182\u0006\u0010\u001E\u001A\u00020\u00132\u0006\u0010\u0015\u001A\u00020\u00132\u0006\u0010\u0016\u001A\u00020\u00132\u0006\u0010\u0017\u001A\u00020\u0013H\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001F\u0010 \u001A5\u0010&\u001A\u00020\u00012\u0006\u0010\"\u001A\u00020\u00182\u0006\u0010#\u001A\u00020\u00182\u0011\u0010\b\u001A\r\u0012\u0004\u0012\u00020\u00010\u0000\u00A2\u0006\u0002\b\u0007H\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b$\u0010%\"\u001A\u0010+\u001A\u00020\u00188\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b\'\u0010(\u001A\u0004\b)\u0010*\"\u001A\u0010.\u001A\u00020\u00188\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b,\u0010(\u001A\u0004\b-\u0010*\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006/"}, d2 = {"Lkotlin/Function0;", "", "onDismissRequest", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/window/DialogProperties;", "properties", "Landroidx/compose/runtime/Composable;", "content", "BasicAlertDialog", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/window/DialogProperties;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "AlertDialog", "confirmButton", "dismissButton", "icon", "title", "text", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", "containerColor", "iconContentColor", "titleContentColor", "textContentColor", "Landroidx/compose/ui/unit/Dp;", "tonalElevation", "AlertDialogImpl-wrnwzgE", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;JJJJFLandroidx/compose/ui/window/DialogProperties;Landroidx/compose/runtime/Composer;II)V", "AlertDialogImpl", "buttons", "buttonContentColor", "AlertDialogContent-4hvqGtA", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;JFJJJJLandroidx/compose/runtime/Composer;III)V", "AlertDialogContent", "mainAxisSpacing", "crossAxisSpacing", "AlertDialogFlowRow-ixp7dh8", "(FFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "AlertDialogFlowRow", "a", "F", "getDialogMinWidth", "()F", "DialogMinWidth", "b", "getDialogMaxWidth", "DialogMaxWidth", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAlertDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material3/AlertDialogKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,464:1\n1223#2,6:465\n78#3:471\n76#3,8:472\n85#3,4:489\n89#3,2:499\n93#3:504\n368#4,9:480\n377#4,3:501\n4032#5,6:493\n148#6:505\n148#6:506\n148#6:507\n148#6:508\n148#6:509\n148#6:510\n148#6:511\n148#6:512\n*S KotlinDebug\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material3/AlertDialogKt\n*L\n366#1:465,6\n366#1:471\n366#1:472,8\n366#1:489,4\n366#1:499,2\n366#1:504\n366#1:480,9\n366#1:501,3\n366#1:493,6\n453#1:505\n454#1:506\n456#1:507\n457#1:508\n460#1:509\n461#1:510\n462#1:511\n463#1:512\n*E\n"})
public final class AlertDialogKt {
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final PaddingValues e;
    public static final PaddingValues f;
    public static final PaddingValues g;
    public static final PaddingValues h;

    static {
        AlertDialogKt.a = 280.0f;
        AlertDialogKt.b = 560.0f;
        AlertDialogKt.c = 8.0f;
        AlertDialogKt.d = 12.0f;
        AlertDialogKt.e = PaddingKt.PaddingValues-0680j_4(24.0f);
        AlertDialogKt.f = PaddingKt.PaddingValues-a9UjIt4$default(0.0f, 0.0f, 0.0f, 16.0f, 7, null);
        AlertDialogKt.g = PaddingKt.PaddingValues-a9UjIt4$default(0.0f, 0.0f, 0.0f, 16.0f, 7, null);
        AlertDialogKt.h = PaddingKt.PaddingValues-a9UjIt4$default(0.0f, 0.0f, 0.0f, 24.0f, 7, null);
    }

    @ExperimentalMaterial3Api
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @Deprecated(message = "Use BasicAlertDialog instead", replaceWith = @ReplaceWith(expression = "BasicAlertDialog(onDismissRequest, modifier, properties, content)", imports = {}))
    public static final void AlertDialog(@NotNull Function0 function00, @Nullable Modifier modifier0, @Nullable DialogProperties dialogProperties0, @NotNull Function2 function20, @Nullable Composer composer0, int v, int v1) {
        DialogProperties dialogProperties1;
        Modifier modifier1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x1362E9D9);
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
            v2 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v2 |= (composer1.changed(dialogProperties0) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0xC00) == 0) {
            v2 |= (composer1.changedInstance(function20) ? 0x800 : 0x400);
        }
        if((v2 & 0x493) != 1170 || !composer1.getSkipping()) {
            modifier1 = (v1 & 2) == 0 ? modifier0 : Modifier.Companion;
            DialogProperties dialogProperties2 = (v1 & 4) == 0 ? dialogProperties0 : new DialogProperties(false, false, false, 7, null);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x1362E9D9, v2, -1, "androidx.compose.material3.AlertDialog (AlertDialog.kt:201)");
            }
            AlertDialogKt.BasicAlertDialog(function00, modifier1, dialogProperties2, function20, composer1, v2 & 0x1FFE, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            dialogProperties1 = dialogProperties2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            dialogProperties1 = dialogProperties0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new a(function00, modifier1, dialogProperties1, function20, v, v1, 0));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void AlertDialogContent-4hvqGtA(@NotNull Function2 function20, @Nullable Modifier modifier0, @Nullable Function2 function21, @Nullable Function2 function22, @Nullable Function2 function23, @NotNull Shape shape0, long v, float f, long v1, long v2, long v3, long v4, @Nullable Composer composer0, int v5, int v6, int v7) {
        Modifier modifier1;
        int v9;
        int v8;
        Composer composer1 = composer0.startRestartGroup(0x5AC0A9B7);
        if((v7 & 1) == 0) {
            v8 = (v5 & 6) == 0 ? (composer1.changedInstance(function20) ? 4 : 2) | v5 : v5;
        }
        else {
            v8 = v5 | 6;
        }
        if((v7 & 2) != 0) {
            v8 |= 0x30;
        }
        else if((v5 & 0x30) == 0) {
            v8 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v7 & 4) != 0) {
            v8 |= 0x180;
        }
        else if((v5 & 0x180) == 0) {
            v8 |= (composer1.changedInstance(function21) ? 0x100 : 0x80);
        }
        if((v7 & 8) != 0) {
            v8 |= 0xC00;
        }
        else if((v5 & 0xC00) == 0) {
            v8 |= (composer1.changedInstance(function22) ? 0x800 : 0x400);
        }
        if((v7 & 16) != 0) {
            v8 |= 0x6000;
        }
        else if((v5 & 0x6000) == 0) {
            v8 |= (composer1.changedInstance(function23) ? 0x4000 : 0x2000);
        }
        if((v7 & 0x20) != 0) {
            v8 |= 0x30000;
        }
        else if((v5 & 0x30000) == 0) {
            v8 |= (composer1.changed(shape0) ? 0x20000 : 0x10000);
        }
        if((v7 & 0x40) != 0) {
            v8 |= 0x180000;
        }
        else if((v5 & 0x180000) == 0) {
            v8 |= (composer1.changed(v) ? 0x100000 : 0x80000);
        }
        if((v7 & 0x80) != 0) {
            v8 |= 0xC00000;
        }
        else if((v5 & 0xC00000) == 0) {
            v8 |= (composer1.changed(f) ? 0x800000 : 0x400000);
        }
        if((v7 & 0x100) != 0) {
            v8 |= 0x6000000;
        }
        else if((v5 & 0x6000000) == 0) {
            v8 |= (composer1.changed(v1) ? 0x4000000 : 0x2000000);
        }
        if((v7 & 0x200) != 0) {
            v8 |= 0x30000000;
        }
        else if((v5 & 0x30000000) == 0) {
            v8 |= (composer1.changed(v2) ? 0x20000000 : 0x10000000);
        }
        if((v7 & 0x400) == 0) {
            v9 = (v6 & 6) == 0 ? v6 | (composer1.changed(v3) ? 4 : 2) : v6;
        }
        else {
            v9 = v6 | 6;
        }
        if((v7 & 0x800) != 0) {
            v9 |= 0x30;
        }
        else if((v6 & 0x30) == 0) {
            v9 |= (composer1.changed(v4) ? 0x20 : 16);
        }
        if((306783379 & v8) != 306783378 || (v9 & 19) != 18 || !composer1.getSkipping()) {
            Modifier modifier2 = (v7 & 2) == 0 ? modifier0 : Modifier.Companion;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x5AC0A9B7, v8, v9, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:293)");
            }
            SurfaceKt.Surface-T9BRK9s(modifier2, shape0, v, 0L, f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-2126308228, true, new e(function21, function22, function23, v2, v3, v4, v1, function20), composer1, 54), composer1, v8 >> 3 & 14 | 0xC00000 | v8 >> 12 & 0x70 | v8 >> 12 & 0x380 | v8 >> 9 & 0xE000, 104);
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
            scopeUpdateScope0.updateScope(new f(function20, modifier1, function21, function22, function23, shape0, v, f, v1, v2, v3, v4, v5, v6, v7));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void AlertDialogFlowRow-ixp7dh8(float f, float f1, @NotNull Function2 function20, @Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x22FA2EE9);
        int v1 = (v & 6) == 0 ? (composer1.changed(f) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (composer1.changed(f1) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (composer1.changedInstance(function20) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) != 0x92 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x22FA2EE9, v1, -1, "androidx.compose.material3.AlertDialogFlowRow (AlertDialog.kt:364)");
            }
            h h0 = composer1.rememberedValue();
            if((((v1 & 14) == 4 ? 1 : 0) | ((v1 & 0x70) == 0x20 ? 1 : 0)) != 0 || h0 == Composer.Companion.getEmpty()) {
                h0 = new h(f, f1);
                composer1.updateRememberedValue(h0);
            }
            int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier0 = ComposedModifierKt.materializeModifier(composer1, Modifier.Companion);
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
            Function2 function21 = androidx.room.a.r(composeUiNode$Companion0, composer1, h0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
                androidx.room.a.t(v2, composer1, v2, function21);
            }
            Updater.set-impl(composer1, modifier0, composeUiNode$Companion0.getSetModifier());
            function20.invoke(composer1, ((int)(((v1 >> 6 & 14) << 6 & 0x380 | 6) >> 6 & 14)));
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
            scopeUpdateScope0.updateScope(new i(f, f1, function20, v, 0));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void AlertDialogImpl-wrnwzgE(@NotNull Function0 function00, @NotNull Function2 function20, @NotNull Modifier modifier0, @Nullable Function2 function21, @Nullable Function2 function22, @Nullable Function2 function23, @Nullable Function2 function24, @NotNull Shape shape0, long v, long v1, long v2, long v3, float f, @NotNull DialogProperties dialogProperties0, @Nullable Composer composer0, int v4, int v5) {
        Composer composer1 = composer0.startRestartGroup(0xC92C90A4);
        int v6 = (v4 & 6) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v4 : v4;
        int v7 = 16;
        if((v4 & 0x30) == 0) {
            v6 |= (composer1.changedInstance(function20) ? 0x20 : 16);
        }
        if((v4 & 0x180) == 0) {
            v6 |= (composer1.changed(modifier0) ? 0x100 : 0x80);
        }
        int v8 = 0x800;
        if((v4 & 0xC00) == 0) {
            v6 |= (composer1.changedInstance(function21) ? 0x800 : 0x400);
        }
        if((v4 & 0x6000) == 0) {
            v6 |= (composer1.changedInstance(function22) ? 0x4000 : 0x2000);
        }
        if((v4 & 0x30000) == 0) {
            v6 |= (composer1.changedInstance(function23) ? 0x20000 : 0x10000);
        }
        if((v4 & 0x180000) == 0) {
            v6 |= (composer1.changedInstance(function24) ? 0x100000 : 0x80000);
        }
        if((v4 & 0xC00000) == 0) {
            v6 |= (composer1.changed(shape0) ? 0x800000 : 0x400000);
        }
        int v9 = (v4 & 0x6000000) == 0 ? v6 | (composer1.changed(v) ? 0x4000000 : 0x2000000) : v6;
        if((v4 & 0x30000000) == 0) {
            v9 |= (composer1.changed(v1) ? 0x20000000 : 0x10000000);
        }
        int v10 = (v5 & 6) == 0 ? v5 | (composer1.changed(v2) ? 4 : 2) : v5;
        if((v5 & 0x30) == 0) {
            if(composer1.changed(v3)) {
                v7 = 0x20;
            }
            v10 |= v7;
        }
        if((v5 & 0x180) == 0) {
            v10 |= (composer1.changed(f) ? 0x100 : 0x80);
        }
        if((v5 & 0xC00) == 0) {
            if(!composer1.changed(dialogProperties0)) {
                v8 = 0x400;
            }
            v10 |= v8;
        }
        if((306783379 & v9) != 306783378 || (v10 & 0x493) != 1170 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xC92C90A4, v9, v10, "androidx.compose.material3.AlertDialogImpl (AlertDialog.kt:247)");
            }
            AlertDialogKt.BasicAlertDialog(function00, modifier0, dialogProperties0, ComposableLambdaKt.rememberComposableLambda(0x918FE6DE, true, new k(function22, function23, function24, shape0, v, f, v1, v2, v3, function21, function20), composer1, 54), composer1, v10 >> 3 & 0x380 | (v9 & 14 | 0xC00 | v9 >> 3 & 0x70), 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new l(function00, function20, modifier0, function21, function22, function23, function24, shape0, v, v1, v2, v3, f, dialogProperties0, v4, v5));
        }
    }

    @ExperimentalMaterial3Api
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void BasicAlertDialog(@NotNull Function0 function00, @Nullable Modifier modifier0, @Nullable DialogProperties dialogProperties0, @NotNull Function2 function20, @Nullable Composer composer0, int v, int v1) {
        DialogProperties dialogProperties1;
        Modifier modifier1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(-1922902937);
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
            v2 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v2 |= (composer1.changed(dialogProperties0) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0xC00) == 0) {
            v2 |= (composer1.changedInstance(function20) ? 0x800 : 0x400);
        }
        if((v2 & 0x493) != 1170 || !composer1.getSkipping()) {
            modifier1 = (v1 & 2) == 0 ? modifier0 : Modifier.Companion;
            DialogProperties dialogProperties2 = (v1 & 4) == 0 ? dialogProperties0 : new DialogProperties(false, false, false, 7, null);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1922902937, v2, -1, "androidx.compose.material3.BasicAlertDialog (AlertDialog.kt:145)");
            }
            AndroidDialog_androidKt.Dialog(function00, dialogProperties2, ComposableLambdaKt.rememberComposableLambda(905289008, true, new n(modifier1, function20), composer1, 54), composer1, v2 & 14 | 0x180 | v2 >> 3 & 0x70, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            dialogProperties1 = dialogProperties2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            dialogProperties1 = dialogProperties0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new a(function00, modifier1, dialogProperties1, function20, v, v1, 1));
        }
    }

    public static final float access$getButtonsCrossAxisSpacing$p() [...] // 潜在的解密器

    public static final float access$getButtonsMainAxisSpacing$p() [...] // 潜在的解密器

    public static final float getDialogMaxWidth() [...] // 潜在的解密器

    public static final float getDialogMinWidth() [...] // 潜在的解密器
}

