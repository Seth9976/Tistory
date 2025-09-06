package androidx.compose.material;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.bc;
import androidx.compose.material3.v;
import androidx.compose.material3.w;
import androidx.compose.material3.x;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupProperties;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.e0;

@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001An\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\t2\b\b\u0002\u0010\n\u001A\u00020\u000B2\b\b\u0002\u0010\f\u001A\u00020\r2\u001C\u0010\u000E\u001A\u0018\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u000F¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001Ad\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\t2\b\b\u0002\u0010\f\u001A\u00020\r2\u001C\u0010\u000E\u001A\u0018\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u000F¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001Aa\u0010\u0017\u001A\u00020\u00012\f\u0010\u0018\u001A\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\u0019\u001A\u00020\u00032\b\b\u0002\u0010\u001A\u001A\u00020\u001B2\b\b\u0002\u0010\u001C\u001A\u00020\u001D2\u001C\u0010\u000E\u001A\u0018\u0012\u0004\u0012\u00020\u001E\u0012\u0004\u0012\u00020\u00010\u000F¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0012H\u0007¢\u0006\u0002\u0010\u001F\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006 "}, d2 = {"DropdownMenu", "", "expanded", "", "onDismissRequest", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "offset", "Landroidx/compose/ui/unit/DpOffset;", "scrollState", "Landroidx/compose/foundation/ScrollState;", "properties", "Landroidx/compose/ui/window/PopupProperties;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "DropdownMenu-4kj-_NE", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JLandroidx/compose/foundation/ScrollState;Landroidx/compose/ui/window/PopupProperties;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "DropdownMenu-ILWXrKs", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/window/PopupProperties;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "DropdownMenuItem", "onClick", "enabled", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "Landroidx/compose/foundation/layout/RowScope;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAndroidMenu.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidMenu.android.kt\nandroidx/compose/material/AndroidMenu_androidKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,185:1\n154#2:186\n154#2:187\n25#3:188\n25#3:195\n25#3:209\n1116#4,6:189\n1116#4,6:196\n1116#4,6:203\n1116#4,6:210\n74#5:202\n*S KotlinDebug\n*F\n+ 1 AndroidMenu.android.kt\nandroidx/compose/material/AndroidMenu_androidKt\n*L\n52#1:186\n116#1:187\n121#1:188\n125#1:195\n173#1:209\n121#1:189,6\n125#1:196,6\n130#1:203,6\n173#1:210,6\n126#1:202\n*E\n"})
public final class AndroidMenu_androidKt {
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void DropdownMenu-4kj-_NE(boolean z, @NotNull Function0 function00, @Nullable Modifier modifier0, long v, @Nullable ScrollState scrollState0, @Nullable PopupProperties popupProperties0, @NotNull Function3 function30, @Nullable Composer composer0, int v1, int v2) {
        PopupProperties popupProperties1;
        ScrollState scrollState2;
        long v6;
        Modifier modifier1;
        PopupProperties popupProperties2;
        Modifier modifier2;
        int v5;
        ScrollState scrollState1;
        long v4;
        int v3;
        Composer composer1 = composer0.startRestartGroup(0x80B8F405);
        if((v2 & 1) == 0) {
            v3 = (v1 & 14) == 0 ? (composer1.changed(z) ? 4 : 2) | v1 : v1;
        }
        else {
            v3 = v1 | 6;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
        }
        else if((v1 & 0x70) == 0) {
            v3 |= (composer1.changedInstance(function00) ? 0x20 : 16);
        }
        if((v2 & 4) != 0) {
            v3 |= 0x180;
        }
        else if((v1 & 0x380) == 0) {
            v3 |= (composer1.changed(modifier0) ? 0x100 : 0x80);
        }
        if((v2 & 8) != 0) {
            v3 |= 0xC00;
            v4 = v;
        }
        else if((v1 & 0x1C00) == 0) {
            v4 = v;
            v3 |= (composer1.changed(v4) ? 0x800 : 0x400);
        }
        else {
            v4 = v;
        }
        if((0xE000 & v1) == 0) {
            if((v2 & 16) == 0) {
                scrollState1 = scrollState0;
                v5 = composer1.changed(scrollState1) ? 0x4000 : 0x2000;
            }
            else {
                scrollState1 = scrollState0;
                v5 = 0x2000;
            }
            v3 |= v5;
        }
        else {
            scrollState1 = scrollState0;
        }
        if((v2 & 0x20) != 0) {
            v3 |= 0x30000;
        }
        else if((0x70000 & v1) == 0) {
            v3 |= (composer1.changed(popupProperties0) ? 0x20000 : 0x10000);
        }
        if((v2 & 0x40) != 0) {
            v3 |= 0x180000;
        }
        else if((0x380000 & v1) == 0) {
            v3 |= (composer1.changedInstance(function30) ? 0x100000 : 0x80000);
        }
        if((v3 & 0x2DB6DB) != 0x92492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v1 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v2 & 4) == 0 ? modifier0 : Modifier.Companion;
                if((v2 & 8) != 0) {
                    v4 = 0L;
                }
                if((v2 & 16) != 0) {
                    v3 &= 0xFFFF1FFF;
                    scrollState1 = ScrollKt.rememberScrollState(0, composer1, 0, 1);
                }
                popupProperties2 = (v2 & 0x20) == 0 ? popupProperties0 : new PopupProperties(true, false, false, null, false, false, 62, null);
            }
            else {
                composer1.skipToGroupEnd();
                if((v2 & 16) != 0) {
                    v3 &= 0xFFFF1FFF;
                }
                modifier2 = modifier0;
                popupProperties2 = popupProperties0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x80B8F405, v3, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:119)");
            }
            composer1.startReplaceableGroup(0xE2A708A4);
            MutableTransitionState mutableTransitionState0 = composer1.rememberedValue();
            Companion composer$Companion0 = Composer.Companion;
            if(mutableTransitionState0 == composer$Companion0.getEmpty()) {
                mutableTransitionState0 = new MutableTransitionState(Boolean.FALSE);
                composer1.updateRememberedValue(mutableTransitionState0);
            }
            composer1.endReplaceableGroup();
            mutableTransitionState0.setTargetState(Boolean.valueOf(z));
            if(((Boolean)mutableTransitionState0.getCurrentState()).booleanValue() || ((Boolean)mutableTransitionState0.getTargetState()).booleanValue()) {
                composer1.startReplaceableGroup(0xE2A708A4);
                MutableState mutableState0 = composer1.rememberedValue();
                if(mutableState0 == composer$Companion0.getEmpty()) {
                    mutableState0 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.box-impl(0x3F0000003F000000L), null, 2, null);
                    composer1.updateRememberedValue(mutableState0);
                }
                composer1.endReplaceableGroup();
                Object object0 = composer1.consume(CompositionLocalsKt.getLocalDensity());
                composer1.startReplaceableGroup(0x979B3B71);
                boolean z1 = composer1.changed(mutableState0);
                x x0 = composer1.rememberedValue();
                if(z1 || x0 == composer$Companion0.getEmpty()) {
                    x0 = new x(mutableState0, 5);
                    composer1.updateRememberedValue(x0);
                }
                composer1.endReplaceableGroup();
                AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(v4, ((Density)object0), x0, null), function00, popupProperties2, ComposableLambdaKt.composableLambda(composer1, -47803778, true, new bc(mutableTransitionState0, mutableState0, scrollState1, modifier2, function30, 2)), composer1, v3 & 0x70 | 0xC00 | v3 >> 9 & 0x380, 0);
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
            v6 = v4;
            scrollState2 = scrollState1;
            popupProperties1 = popupProperties2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            v6 = v4;
            scrollState2 = scrollState1;
            popupProperties1 = popupProperties0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new v(z, function00, modifier1, v6, scrollState2, popupProperties1, function30, v1, v2, 1));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Replaced by a DropdownMenu function with a ScrollState parameter", replaceWith = @ReplaceWith(expression = "DropdownMenu(expanded,onDismissRequest, modifier, offset, rememberScrollState(), properties, content)", imports = {"androidx.compose.foundation.rememberScrollState"}))
    public static final void DropdownMenu-ILWXrKs(boolean z, Function0 function00, Modifier modifier0, long v, PopupProperties popupProperties0, Function3 function30, Composer composer0, int v1, int v2) {
        PopupProperties popupProperties1;
        Modifier modifier2;
        long v4;
        Modifier modifier1;
        int v3;
        Composer composer1 = composer0.startRestartGroup(0xCDEA4BFD);
        if((v2 & 1) == 0) {
            v3 = (v1 & 14) == 0 ? (composer1.changed(z) ? 4 : 2) | v1 : v1;
        }
        else {
            v3 = v1 | 6;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
        }
        else if((v1 & 0x70) == 0) {
            v3 |= (composer1.changedInstance(function00) ? 0x20 : 16);
        }
        if((v2 & 4) != 0) {
            v3 |= 0x180;
            modifier1 = modifier0;
        }
        else if((v1 & 0x380) == 0) {
            modifier1 = modifier0;
            v3 |= (composer1.changed(modifier1) ? 0x100 : 0x80);
        }
        else {
            modifier1 = modifier0;
        }
        if((v2 & 8) != 0) {
            v3 |= 0xC00;
            v4 = v;
        }
        else if((v1 & 0x1C00) == 0) {
            v4 = v;
            v3 |= (composer1.changed(v4) ? 0x800 : 0x400);
        }
        else {
            v4 = v;
        }
        if((v2 & 16) != 0) {
            v3 |= 0x6000;
        }
        else if((0xE000 & v1) == 0) {
            v3 |= (composer1.changed(popupProperties0) ? 0x4000 : 0x2000);
        }
        if((v2 & 0x20) != 0) {
            v3 |= 0x30000;
        }
        else if((v1 & 0x70000) == 0) {
            v3 |= (composer1.changedInstance(function30) ? 0x20000 : 0x10000);
        }
        if((0x5B6DB & v3) != 74898 || !composer1.getSkipping()) {
            if((v2 & 4) != 0) {
                modifier1 = Modifier.Companion;
            }
            if((v2 & 8) != 0) {
                v4 = 0L;
            }
            PopupProperties popupProperties2 = (v2 & 16) == 0 ? popupProperties0 : new PopupProperties(true, false, false, null, false, false, 62, null);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xCDEA4BFD, v3, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:54)");
            }
            AndroidMenu_androidKt.DropdownMenu-4kj-_NE(z, function00, modifier1, v4, ScrollKt.rememberScrollState(0, composer1, 0, 1), popupProperties2, function30, composer1, v3 & 0x1FFE | 0x70000 & v3 << 3 | v3 << 3 & 0x380000, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier1;
            popupProperties1 = popupProperties2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier2 = modifier1;
            popupProperties1 = popupProperties0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new w(z, function00, modifier2, v4, popupProperties1, function30, v1, v2, 1));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void DropdownMenuItem(@NotNull Function0 function00, @Nullable Modifier modifier0, boolean z, @Nullable PaddingValues paddingValues0, @Nullable MutableInteractionSource mutableInteractionSource0, @NotNull Function3 function30, @Nullable Composer composer0, int v, int v1) {
        MutableInteractionSource mutableInteractionSource1;
        boolean z1;
        Modifier modifier1;
        MutableInteractionSource mutableInteractionSource3;
        PaddingValues paddingValues1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x8978F034);
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
            paddingValues1 = paddingValues0;
        }
        else if((v & 0x1C00) == 0) {
            paddingValues1 = paddingValues0;
            v2 |= (composer1.changed(paddingValues1) ? 0x800 : 0x400);
        }
        else {
            paddingValues1 = paddingValues0;
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
            v2 |= (composer1.changedInstance(function30) ? 0x20000 : 0x10000);
        }
        if((0x5B6DB & v2) != 74898 || !composer1.getSkipping()) {
            modifier1 = (v1 & 2) == 0 ? modifier0 : Modifier.Companion;
            boolean z2 = (v1 & 4) == 0 ? z : true;
            PaddingValues paddingValues2 = (v1 & 8) == 0 ? paddingValues1 : MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
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
                ComposerKt.traceEventStart(0x8978F034, v2, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:174)");
            }
            MenuKt.DropdownMenuItemContent(function00, modifier1, z2, paddingValues2, mutableInteractionSource3, function30, composer1, 0x7FFFE & v2, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z1 = z2;
            paddingValues1 = paddingValues2;
            mutableInteractionSource1 = mutableInteractionSource3;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            z1 = z;
            mutableInteractionSource1 = mutableInteractionSource0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new e0(function00, modifier1, z1, paddingValues1, mutableInteractionSource1, function30, v, v1, 0));
        }
    }
}

