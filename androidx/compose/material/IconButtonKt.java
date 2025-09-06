package androidx.compose.material;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.material3.d3;
import androidx.compose.material3.vb;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import androidx.room.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001AN\u0010\u000B\u001A\u00020\u00012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00072\u0011\u0010\n\u001A\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\tH\u0007¢\u0006\u0004\b\u000B\u0010\f\u001A\\\u0010\u0010\u001A\u00020\u00012\u0006\u0010\r\u001A\u00020\u00052\u0012\u0010\u000F\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u000E2\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00072\u0011\u0010\n\u001A\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\tH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lkotlin/Function0;", "", "onClick", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/runtime/Composable;", "content", "IconButton", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "checked", "Lkotlin/Function1;", "onCheckedChange", "IconToggleButton", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nIconButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IconButton.kt\nandroidx/compose/material/IconButtonKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,130:1\n25#2:131\n456#2,8:154\n464#2,3:168\n467#2,3:173\n25#2:178\n456#2,8:201\n464#2,3:215\n467#2,3:220\n1116#3,6:132\n1116#3,6:179\n69#4,5:138\n74#4:171\n78#4:177\n69#4,5:185\n74#4:218\n78#4:224\n79#5,11:143\n92#5:176\n79#5,11:190\n92#5:223\n3737#6,6:162\n3737#6,6:209\n74#7:172\n74#7:219\n154#8:225\n*S KotlinDebug\n*F\n+ 1 IconButton.kt\nandroidx/compose/material/IconButtonKt\n*L\n63#1:131\n66#1:154,8\n66#1:168,3\n66#1:173,3\n107#1:178\n110#1:201,8\n110#1:215,3\n110#1:220,3\n63#1:132,6\n107#1:179,6\n66#1:138,5\n66#1:171\n66#1:177\n110#1:185,5\n110#1:218\n110#1:224\n66#1:143,11\n66#1:176\n110#1:190,11\n110#1:223\n66#1:162,6\n110#1:209,6\n78#1:172\n123#1:219\n129#1:225\n*E\n"})
public final class IconButtonKt {
    public static final float a;

    static {
        IconButtonKt.a = 24.0f;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void IconButton(@NotNull Function0 function00, @Nullable Modifier modifier0, boolean z, @Nullable MutableInteractionSource mutableInteractionSource0, @NotNull Function2 function20, @Nullable Composer composer0, int v, int v1) {
        boolean z1;
        Modifier modifier1;
        float f;
        MutableInteractionSource mutableInteractionSource3;
        MutableInteractionSource mutableInteractionSource1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(-111063634);
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
            v2 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changed(z) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
            mutableInteractionSource1 = mutableInteractionSource0;
        }
        else if((v & 0x1C00) == 0) {
            mutableInteractionSource1 = mutableInteractionSource0;
            v2 |= (composer1.changed(mutableInteractionSource1) ? 0x800 : 0x400);
        }
        else {
            mutableInteractionSource1 = mutableInteractionSource0;
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
        }
        else if((0xE000 & v) == 0) {
            v2 |= (composer1.changedInstance(function20) ? 0x4000 : 0x2000);
        }
        if((0xB6DB & v2) != 9362 || !composer1.getSkipping()) {
            modifier1 = (v1 & 2) == 0 ? modifier0 : Modifier.Companion;
            boolean z2 = (v1 & 4) == 0 ? z : true;
            if((v1 & 8) == 0) {
                mutableInteractionSource3 = mutableInteractionSource1;
            }
            else {
                composer1.startReplaceableGroup(0xE2A708A4);
                MutableInteractionSource mutableInteractionSource2 = composer1.rememberedValue();
                if(mutableInteractionSource2 == Composer.Companion.getEmpty()) {
                    mutableInteractionSource2 = InteractionSourceKt.MutableInteractionSource();
                    composer1.updateRememberedValue(mutableInteractionSource2);
                }
                composer1.endReplaceableGroup();
                mutableInteractionSource3 = mutableInteractionSource2;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-111063634, v2, -1, "androidx.compose.material.IconButton (IconButton.kt:64)");
            }
            Modifier modifier2 = ClickableKt.clickable-O2vRcR0$default(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier1), mutableInteractionSource3, RippleKt.rememberRipple-9IZ8Weo(false, IconButtonKt.a, 0L, composer1, 54, 4), z2, null, Role.box-impl(0), function00, 8, null);
            composer1.startReplaceableGroup(0x2BB5B5D7);
            MeasurePolicy measurePolicy0 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getCenter(), false, composer1, 6);
            composer1.startReplaceableGroup(-1323940314);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function01 = composeUiNode$Companion0.getConstructor();
            Function3 function30 = LayoutKt.modifierMaterializerOf(modifier2);
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function01);
            }
            else {
                composer1.useNode();
            }
            Function2 function21 = a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                a.t(v3, composer1, v3, function21);
            }
            r0.a.w(0, function30, SkippableUpdater.box-impl(composer1), composer1, 2058660585);
            if(z2) {
                composer1.startReplaceableGroup(0x2CEA5948);
                f = ((Number)composer1.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue();
            }
            else {
                composer1.startReplaceableGroup(753555810);
                f = ContentAlpha.INSTANCE.getDisabled(composer1, 6);
            }
            composer1.endReplaceableGroup();
            CompositionLocalKt.CompositionLocalProvider(ContentAlphaKt.getLocalContentAlpha().provides(f), function20, composer1, v2 >> 9 & 0x70 | ProvidedValue.$stable);
            composer1.endReplaceableGroup();
            composer1.endNode();
            composer1.endReplaceableGroup();
            composer1.endReplaceableGroup();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z1 = z2;
            mutableInteractionSource1 = mutableInteractionSource3;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            z1 = z;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new vb(function00, modifier1, z1, mutableInteractionSource1, function20, v, v1));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void IconToggleButton(boolean z, @NotNull Function1 function10, @Nullable Modifier modifier0, boolean z1, @Nullable MutableInteractionSource mutableInteractionSource0, @NotNull Function2 function20, @Nullable Composer composer0, int v, int v1) {
        MutableInteractionSource mutableInteractionSource1;
        Modifier modifier1;
        float f;
        MutableInteractionSource mutableInteractionSource3;
        boolean z2;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0xFCBDFCFF);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(z) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changedInstance(function10) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changed(modifier0) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
            z2 = z1;
        }
        else if((v & 0x1C00) == 0) {
            z2 = z1;
            v2 |= (composer1.changed(z2) ? 0x800 : 0x400);
        }
        else {
            z2 = z1;
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
        }
        else if((0xE000 & v) == 0) {
            v2 |= (composer1.changed(mutableInteractionSource0) ? 0x4000 : 0x2000);
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
        }
        else if((0x70000 & v) == 0) {
            v2 |= (composer1.changedInstance(function20) ? 0x20000 : 0x10000);
        }
        if((0x5B6DB & v2) != 74898 || !composer1.getSkipping()) {
            Modifier modifier2 = (v1 & 4) == 0 ? modifier0 : Modifier.Companion;
            boolean z3 = (v1 & 8) == 0 ? z2 : true;
            if((v1 & 16) == 0) {
                mutableInteractionSource3 = mutableInteractionSource0;
            }
            else {
                composer1.startReplaceableGroup(0xE2A708A4);
                MutableInteractionSource mutableInteractionSource2 = composer1.rememberedValue();
                if(mutableInteractionSource2 == Composer.Companion.getEmpty()) {
                    mutableInteractionSource2 = InteractionSourceKt.MutableInteractionSource();
                    composer1.updateRememberedValue(mutableInteractionSource2);
                }
                composer1.endReplaceableGroup();
                mutableInteractionSource3 = mutableInteractionSource2;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xFCBDFCFF, v2, -1, "androidx.compose.material.IconToggleButton (IconButton.kt:108)");
            }
            Modifier modifier3 = ToggleableKt.toggleable-O2vRcR0(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier2), z, mutableInteractionSource3, RippleKt.rememberRipple-9IZ8Weo(false, IconButtonKt.a, 0L, composer1, 54, 4), z3, Role.box-impl(1), function10);
            composer1.startReplaceableGroup(0x2BB5B5D7);
            MeasurePolicy measurePolicy0 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getCenter(), false, composer1, 6);
            composer1.startReplaceableGroup(-1323940314);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function00 = composeUiNode$Companion0.getConstructor();
            Function3 function30 = LayoutKt.modifierMaterializerOf(modifier3);
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
            r0.a.w(0, function30, SkippableUpdater.box-impl(composer1), composer1, 2058660585);
            if(z3) {
                composer1.startReplaceableGroup(0x90BB883C);
                f = ((Number)composer1.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue();
            }
            else {
                composer1.startReplaceableGroup(0x90BB8856);
                f = ContentAlpha.INSTANCE.getDisabled(composer1, 6);
            }
            composer1.endReplaceableGroup();
            CompositionLocalKt.CompositionLocalProvider(ContentAlphaKt.getLocalContentAlpha().provides(f), function20, composer1, v2 >> 12 & 0x70 | ProvidedValue.$stable);
            composer1.endReplaceableGroup();
            composer1.endNode();
            composer1.endReplaceableGroup();
            composer1.endReplaceableGroup();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
            z2 = z3;
            mutableInteractionSource1 = mutableInteractionSource3;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            mutableInteractionSource1 = mutableInteractionSource0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new d3(z, function10, modifier1, z2, mutableInteractionSource1, function20, v, v1, 4));
        }
    }
}

