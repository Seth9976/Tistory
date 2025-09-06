package androidx.compose.material.internal;

import aa.r;
import android.view.View;
import androidx.compose.material3.gf;
import androidx.compose.material3.sf;
import androidx.compose.material3.td;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import androidx.room.a;
import j0.b2;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s0.b;
import s0.d;
import s0.f;
import s0.g;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0007\u001A<\u0010\u0007\u001A\u00020\u00012\u0010\b\u0002\u0010\u0002\u001A\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u0006\u0010\u0004\u001A\u00020\u00032\u0011\u0010\u0006\u001A\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0005H\u0001¢\u0006\u0004\b\u0007\u0010\b\" \u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\n0\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000B\u0010\f\u001A\u0004\b\r\u0010\u000E¨\u0006\u0011²\u0006\u0017\u0010\u0010\u001A\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00058\nX\u008A\u0084\u0002"}, d2 = {"Lkotlin/Function0;", "", "onDismissRequest", "Landroidx/compose/ui/window/PopupPositionProvider;", "popupPositionProvider", "Landroidx/compose/runtime/Composable;", "content", "ExposedDropdownMenuPopup", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/window/PopupPositionProvider;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "", "a", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalPopupTestTag", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalPopupTestTag", "currentContent", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nExposedDropdownMenuPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenuPopup.android.kt\nandroidx/compose/material/internal/ExposedDropdownMenuPopup_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,464:1\n74#2:465\n74#2:466\n74#2:467\n74#2:468\n25#3:469\n456#3,8:487\n464#3,6:501\n456#3,8:519\n464#3,6:533\n1116#4,6:470\n79#5,11:476\n92#5:507\n79#5,11:508\n92#5:539\n3737#6,6:495\n3737#6,6:527\n81#7:540\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenuPopup.android.kt\nandroidx/compose/material/internal/ExposedDropdownMenuPopup_androidKt\n*L\n85#1:465\n86#1:466\n87#1:467\n88#1:468\n92#1:469\n150#1:487,8\n150#1:501,6\n179#1:519,8\n179#1:533,6\n92#1:470,6\n150#1:476,11\n150#1:507\n179#1:508,11\n179#1:539\n150#1:495,6\n179#1:527,6\n90#1:540\n*E\n"})
public final class ExposedDropdownMenuPopup_androidKt {
    public static final ProvidableCompositionLocal a;

    static {
        ExposedDropdownMenuPopup_androidKt.a = CompositionLocalKt.compositionLocalOf$default(null, d.y, 1, null);
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void ExposedDropdownMenuPopup(@Nullable Function0 function00, @NotNull PopupPositionProvider popupPositionProvider0, @NotNull Function2 function20, @Nullable Composer composer0, int v, int v1) {
        Function0 function01;
        int v3;
        Function0 function03;
        String s;
        LayoutDirection layoutDirection1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0xD5CF0C52);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changed(popupPositionProvider0) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changedInstance(function20) ? 0x100 : 0x80);
        }
        if((v2 & 731) != 0x92 || !composer1.getSkipping()) {
            Function0 function02 = (v1 & 1) == 0 ? function00 : null;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xD5CF0C52, v2, -1, "androidx.compose.material.internal.ExposedDropdownMenuPopup (ExposedDropdownMenuPopup.android.kt:83)");
            }
            Object object0 = composer1.consume(AndroidCompositionLocals_androidKt.getLocalView());
            Object object1 = composer1.consume(CompositionLocalsKt.getLocalDensity());
            Object object2 = composer1.consume(ExposedDropdownMenuPopup_androidKt.a);
            LayoutDirection layoutDirection0 = (LayoutDirection)composer1.consume(CompositionLocalsKt.getLocalLayoutDirection());
            CompositionContext compositionContext0 = ComposablesKt.rememberCompositionContext(composer1, 0);
            State state0 = SnapshotStateKt.rememberUpdatedState(function20, composer1, v2 >> 6 & 14);
            UUID uUID0 = (UUID)RememberSaveableKt.rememberSaveable(new Object[0], null, null, d.x, composer1, 3080, 6);
            composer1.startReplaceableGroup(0xE2A708A4);
            g g0 = composer1.rememberedValue();
            if(g0 == Composer.Companion.getEmpty()) {
                layoutDirection1 = layoutDirection0;
                s = (String)object2;
                function03 = function02;
                v3 = v2;
                g0 = new g(function02, ((View)object0), ((Density)object1), popupPositionProvider0, uUID0);
                ComposableLambda composableLambda0 = ComposableLambdaKt.composableLambdaInstance(580081703, true, new f(g0, state0));
                g0.setParentCompositionContext(compositionContext0);
                g0.Q.setValue(composableLambda0);
                g0.R = true;
                composer1.updateRememberedValue(g0);
            }
            else {
                layoutDirection1 = layoutDirection0;
                s = (String)object2;
                function03 = function02;
                v3 = v2;
            }
            composer1.endReplaceableGroup();
            EffectsKt.DisposableEffect(g0, new r(g0, function03, s, layoutDirection1), composer1, 8);
            EffectsKt.SideEffect(new td(g0, function03, s, layoutDirection1), composer1, 0);
            EffectsKt.DisposableEffect(popupPositionProvider0, new b2(17, g0, popupPositionProvider0), composer1, v3 >> 3 & 14);
            b b0 = new b(g0, 0);
            Modifier modifier0 = OnGloballyPositionedModifierKt.onGloballyPositioned(Modifier.Companion, b0);
            gf gf0 = new gf(2, g0, layoutDirection1);
            composer1.startReplaceableGroup(-1323940314);
            int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function04 = composeUiNode$Companion0.getConstructor();
            Function3 function30 = LayoutKt.modifierMaterializerOf(modifier0);
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function04);
            }
            else {
                composer1.useNode();
            }
            Updater.set-impl(composer1, gf0, composeUiNode$Companion0.getSetMeasurePolicy());
            Updater.set-impl(composer1, compositionLocalMap0, composeUiNode$Companion0.getSetResolvedCompositionLocals());
            Function2 function21 = composeUiNode$Companion0.getSetCompositeKeyHash();
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v4)) {
                a.t(v4, composer1, v4, function21);
            }
            function30.invoke(SkippableUpdater.box-impl(composer1), composer1, 0);
            composer1.startReplaceableGroup(2058660585);
            composer1.endReplaceableGroup();
            composer1.endNode();
            composer1.endReplaceableGroup();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function01 = function03;
        }
        else {
            composer1.skipToGroupEnd();
            function01 = function00;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new sf(function01, popupPositionProvider0, function20, v, v1, 17));
        }
    }

    public static final Function2 access$ExposedDropdownMenuPopup$lambda$0(State state0) {
        return (Function2)state0.getValue();
    }

    @NotNull
    public static final ProvidableCompositionLocal getLocalPopupTestTag() {
        return ExposedDropdownMenuPopup_androidKt.a;
    }
}

