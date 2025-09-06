package androidx.compose.material3.internal;

import aa.r;
import androidx.compose.foundation.R.string;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.y;
import androidx.compose.material3.ExperimentalMaterial3Api;
import androidx.compose.material3.TooltipState;
import androidx.compose.material3.gb;
import androidx.compose.material3.qq;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupPositionProvider;
import androidx.compose.ui.window.PopupProperties;
import androidx.room.a;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s.h1;
import w0.d0;
import w0.f0;
import w0.m0;
import w0.q0;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\u001Ac\u0010\u000E\u001A\u00020\u00032\u0006\u0010\u0001\u001A\u00020\u00002\u0011\u0010\u0005\u001A\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0006\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\u000B\u001A\u00020\n2\b\b\u0002\u0010\f\u001A\u00020\n2\u0011\u0010\r\u001A\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0001¢\u0006\u0004\b\u000E\u0010\u000F¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/window/PopupPositionProvider;", "positionProvider", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "tooltip", "Landroidx/compose/material3/TooltipState;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "", "focusable", "enableUserInput", "content", "BasicTooltipBox", "(Landroidx/compose/ui/window/PopupPositionProvider;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/TooltipState;Landroidx/compose/ui/Modifier;ZZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBasicTooltip.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTooltip.android.kt\nandroidx/compose/material3/internal/BasicTooltip_androidKt\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,247:1\n488#2:248\n487#2,4:249\n491#2,2:256\n495#2:262\n488#2:310\n487#2,4:311\n491#2,2:318\n495#2:324\n1223#3,3:253\n1226#3,3:259\n1223#3,6:304\n1223#3,3:315\n1226#3,3:321\n1223#3,6:365\n487#4:258\n487#4:320\n71#5:263\n67#5,7:264\n74#5:299\n78#5:303\n71#5:325\n68#5,6:326\n74#5:360\n78#5:364\n78#6,6:271\n85#6,4:286\n89#6,2:296\n93#6:302\n78#6,6:332\n85#6,4:347\n89#6,2:357\n93#6:363\n368#7,9:277\n377#7:298\n378#7,2:300\n368#7,9:338\n377#7:359\n378#7,2:361\n4032#8,6:290\n4032#8,6:351\n*S KotlinDebug\n*F\n+ 1 BasicTooltip.android.kt\nandroidx/compose/material3/internal/BasicTooltip_androidKt\n*L\n87#1:248\n87#1:249,4\n87#1:256,2\n87#1:262\n117#1:310\n117#1:311,4\n117#1:318,2\n117#1:324\n87#1:253,3\n87#1:259,3\n107#1:304,6\n117#1:315,3\n117#1:321,3\n140#1:365,6\n87#1:258\n117#1:320\n88#1:263\n88#1:264,7\n88#1:299\n88#1:303\n119#1:325\n119#1:326,6\n119#1:360\n119#1:364\n88#1:271,6\n88#1:286,4\n88#1:296,2\n88#1:302\n119#1:332,6\n119#1:347,4\n119#1:357,2\n119#1:363\n88#1:277,9\n88#1:298\n88#1:300,2\n119#1:338,9\n119#1:359\n119#1:361,2\n88#1:290,6\n119#1:351,6\n*E\n"})
public final class BasicTooltip_androidKt {
    @ExperimentalMaterial3Api
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void BasicTooltipBox(@NotNull PopupPositionProvider popupPositionProvider0, @NotNull Function2 function20, @NotNull TooltipState tooltipState0, @Nullable Modifier modifier0, boolean z, boolean z1, @NotNull Function2 function21, @Nullable Composer composer0, int v, int v1) {
        boolean z4;
        Modifier modifier1;
        boolean z3;
        boolean z2;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0xDF2FE401);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changed(popupPositionProvider0) ? 4 : 2) | v : v;
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
            v2 |= (((v & 0x200) == 0 ? composer1.changed(tooltipState0) : composer1.changedInstance(tooltipState0)) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0xC00) == 0) {
            v2 |= (composer1.changed(modifier0) ? 0x800 : 0x400);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
            z2 = z;
        }
        else if((v & 0x6000) == 0) {
            z2 = z;
            v2 |= (composer1.changed(z2) ? 0x4000 : 0x2000);
        }
        else {
            z2 = z;
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
            z3 = z1;
        }
        else if((0x30000 & v) == 0) {
            z3 = z1;
            v2 |= (composer1.changed(z3) ? 0x20000 : 0x10000);
        }
        else {
            z3 = z1;
        }
        if((v1 & 0x40) != 0) {
            v2 |= 0x180000;
        }
        else if((v & 0x180000) == 0) {
            v2 |= (composer1.changedInstance(function21) ? 0x100000 : 0x80000);
        }
        if((0x92493 & v2) != 0x92492 || !composer1.getSkipping()) {
            Modifier modifier2 = (v1 & 8) == 0 ? modifier0 : Modifier.Companion;
            boolean z5 = true;
            boolean z6 = (v1 & 16) == 0 ? z2 : true;
            if((v1 & 0x20) != 0) {
                z3 = true;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xDF2FE401, v2, -1, "androidx.compose.material3.internal.BasicTooltipBox (BasicTooltip.android.kt:85)");
            }
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller0 = composer1.rememberedValue();
            Companion composer$Companion0 = Composer.Companion;
            if(compositionScopedCoroutineScopeCanceller0 == composer$Companion0.getEmpty()) {
                compositionScopedCoroutineScopeCanceller0 = a.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer1), composer1);
            }
            CoroutineScope coroutineScope0 = compositionScopedCoroutineScopeCanceller0.getCoroutineScope();
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier3 = ComposedModifierKt.materializeModifier(composer1, Modifier.Companion);
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
            Function2 function22 = a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                a.t(v3, composer1, v3, function22);
            }
            r0.a.z(composeUiNode$Companion0, composer1, modifier3, composer1, 0xDAB1E02B);
            if(tooltipState0.isVisible()) {
                BasicTooltip_androidKt.a(popupPositionProvider0, tooltipState0, coroutineScope0, z6, function20, composer1, v2 & 14 | v2 >> 3 & 0x70 | v2 >> 3 & 0x1C00 | v2 << 9 & 0xE000);
            }
            composer1.endReplaceGroup();
            BasicTooltip_androidKt.b(z3, tooltipState0, modifier2, function21, composer1, v2 >> 15 & 14 | v2 >> 3 & 0x70 | v2 >> 3 & 0x380 | v2 >> 9 & 0x1C00, 0);
            composer1.endNode();
            if((v2 & 0x380) != 0x100 && ((v2 & 0x200) == 0 || !composer1.changedInstance(tooltipState0))) {
                z5 = false;
            }
            h1 h10 = composer1.rememberedValue();
            if(z5 || h10 == composer$Companion0.getEmpty()) {
                h10 = new h1(tooltipState0, 18);
                composer1.updateRememberedValue(h10);
            }
            EffectsKt.DisposableEffect(tooltipState0, h10, composer1, v2 >> 6 & 14);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
            z4 = z3;
            z2 = z6;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            z4 = z3;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new gb(popupPositionProvider0, function20, tooltipState0, modifier1, z2, z4, function21, v, v1, 5));
        }
    }

    public static final void a(PopupPositionProvider popupPositionProvider0, TooltipState tooltipState0, CoroutineScope coroutineScope0, boolean z, Function2 function20, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xEFB5E14D);
        int v1 = (v & 6) == 0 ? (composer1.changed(popupPositionProvider0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (((v & 0x40) == 0 ? composer1.changed(tooltipState0) : composer1.changedInstance(tooltipState0)) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (composer1.changedInstance(coroutineScope0) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (composer1.changed(z) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            v1 |= (composer1.changedInstance(function20) ? 0x4000 : 0x2000);
        }
        if((v1 & 9363) != 9362 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xEFB5E14D, v1, -1, "androidx.compose.material3.internal.TooltipPopup (BasicTooltip.android.kt:135)");
            }
            boolean z1 = false;
            String s = StringResources_androidKt.stringResource(string.tooltip_description, composer1, 0);
            if((v1 & 0x70) == 0x20 || (v1 & 0x40) != 0 && composer1.changedInstance(tooltipState0)) {
                z1 = true;
            }
            boolean z2 = composer1.changedInstance(coroutineScope0);
            d0 d00 = composer1.rememberedValue();
            if(z2 || z1 || d00 == Composer.Companion.getEmpty()) {
                d00 = new d0(tooltipState0, coroutineScope0);
                composer1.updateRememberedValue(d00);
            }
            AndroidPopup_androidKt.Popup(popupPositionProvider0, d00, new PopupProperties(z, false, false, false, 14, null), ComposableLambdaKt.rememberComposableLambda(610617071, true, new f0(s, function20), composer1, 54), composer1, v1 & 14 | 0xC00, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new qq(popupPositionProvider0, tooltipState0, coroutineScope0, z, function20, v, 3));
        }
    }

    public static final void b(boolean z, TooltipState tooltipState0, Modifier modifier0, Function2 function20, Composer composer0, int v, int v1) {
        int v2;
        Composer composer1 = composer0.startRestartGroup(1848240995);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changed(z) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (((v & 0x40) == 0 ? composer1.changed(tooltipState0) : composer1.changedInstance(tooltipState0)) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v2 |= (composer1.changed(modifier0) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0xC00) == 0) {
            v2 |= (composer1.changedInstance(function20) ? 0x800 : 0x400);
        }
        if((v2 & 0x493) != 1170 || !composer1.getSkipping()) {
            if((v1 & 4) != 0) {
                modifier0 = Modifier.Companion;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1848240995, v2, -1, "androidx.compose.material3.internal.WrappedAnchor (BasicTooltip.android.kt:115)");
            }
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller0 = composer1.rememberedValue();
            if(compositionScopedCoroutineScopeCanceller0 == Composer.Companion.getEmpty()) {
                compositionScopedCoroutineScopeCanceller0 = a.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer1), composer1);
            }
            CoroutineScope coroutineScope0 = compositionScopedCoroutineScopeCanceller0.getCoroutineScope();
            String s = StringResources_androidKt.stringResource(string.tooltip_label, composer1, 0);
            Modifier modifier1 = z ? SuspendingPointerInputFilterKt.pointerInput(SuspendingPointerInputFilterKt.pointerInput(modifier0, tooltipState0, new m0(tooltipState0, null)), tooltipState0, new q0(tooltipState0, null)) : modifier0;
            if(z) {
                modifier1 = SemanticsModifierKt.semantics(modifier1, true, new r(s, coroutineScope0, 27, tooltipState0));
            }
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier2 = ComposedModifierKt.materializeModifier(composer1, modifier1);
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                a.t(v3, composer1, v3, function21);
            }
            Updater.set-impl(composer1, modifier2, composeUiNode$Companion0.getSetModifier());
            function20.invoke(composer1, ((int)(v2 >> 9 & 14)));
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
            scopeUpdateScope0.updateScope(new y(z, tooltipState0, modifier0, function20, v, v1, 5));
        }
    }
}

