package androidx.compose.material3;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.internal.DropdownMenuPositionProvider;
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
import androidx.compose.ui.graphics.Shape;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000j\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001A\u00A2\u0001\u0010\u001D\u001A\u00020\u00032\u0006\u0010\u0001\u001A\u00020\u00002\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\n\u001A\u00020\t2\b\b\u0002\u0010\f\u001A\u00020\u000B2\b\b\u0002\u0010\u000E\u001A\u00020\r2\b\b\u0002\u0010\u0010\u001A\u00020\u000F2\b\b\u0002\u0010\u0012\u001A\u00020\u00112\b\b\u0002\u0010\u0013\u001A\u00020\u00112\n\b\u0002\u0010\u0015\u001A\u0004\u0018\u00010\u00142\u001C\u0010\u001A\u001A\u0018\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00030\u0016\u00A2\u0006\u0002\b\u0018\u00A2\u0006\u0002\b\u0019H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001B\u0010\u001C\u001An\u0010\u001D\u001A\u00020\u00032\u0006\u0010\u0001\u001A\u00020\u00002\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\n\u001A\u00020\t2\b\b\u0002\u0010\f\u001A\u00020\u000B2\u001C\u0010\u001A\u001A\u0018\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00030\u0016\u00A2\u0006\u0002\b\u0018\u00A2\u0006\u0002\b\u0019H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001E\u0010\u001F\u001Ad\u0010\u001D\u001A\u00020\u00032\u0006\u0010\u0001\u001A\u00020\u00002\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\f\u001A\u00020\u000B2\u001C\u0010\u001A\u001A\u0018\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00030\u0016\u00A2\u0006\u0002\b\u0018\u00A2\u0006\u0002\b\u0019H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b \u0010!\u001A\u0092\u0001\u0010-\u001A\u00020\u00032\u0011\u0010\"\u001A\r\u0012\u0004\u0012\u00020\u00030\u0002\u00A2\u0006\u0002\b\u00182\f\u0010#\u001A\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\u0015\b\u0002\u0010$\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u00A2\u0006\u0002\b\u00182\u0015\b\u0002\u0010%\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u00A2\u0006\u0002\b\u00182\b\b\u0002\u0010&\u001A\u00020\u00002\b\b\u0002\u0010(\u001A\u00020\'2\b\b\u0002\u0010*\u001A\u00020)2\n\b\u0002\u0010,\u001A\u0004\u0018\u00010+H\u0007\u00A2\u0006\u0004\b-\u0010.\"\u001A\u00103\u001A\u00020\u000B8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b/\u00100\u001A\u0004\b1\u00102\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u00064"}, d2 = {"", "expanded", "Lkotlin/Function0;", "", "onDismissRequest", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/unit/DpOffset;", "offset", "Landroidx/compose/foundation/ScrollState;", "scrollState", "Landroidx/compose/ui/window/PopupProperties;", "properties", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", "containerColor", "Landroidx/compose/ui/unit/Dp;", "tonalElevation", "shadowElevation", "Landroidx/compose/foundation/BorderStroke;", "border", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "content", "DropdownMenu-IlH_yew", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JLandroidx/compose/foundation/ScrollState;Landroidx/compose/ui/window/PopupProperties;Landroidx/compose/ui/graphics/Shape;JFFLandroidx/compose/foundation/BorderStroke;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "DropdownMenu", "DropdownMenu-4kj-_NE", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JLandroidx/compose/foundation/ScrollState;Landroidx/compose/ui/window/PopupProperties;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "DropdownMenu-ILWXrKs", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/window/PopupProperties;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "text", "onClick", "leadingIcon", "trailingIcon", "enabled", "Landroidx/compose/material3/MenuItemColors;", "colors", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "DropdownMenuItem", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/MenuItemColors;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "a", "Landroidx/compose/ui/window/PopupProperties;", "getDefaultMenuProperties", "()Landroidx/compose/ui/window/PopupProperties;", "DefaultMenuProperties", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAndroidMenu.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidMenu.android.kt\nandroidx/compose/material3/AndroidMenu_androidKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,195:1\n148#2:196\n148#2:216\n148#2:217\n1223#3,6:197\n1223#3,6:203\n1223#3,6:210\n77#4:209\n*S KotlinDebug\n*F\n+ 1 AndroidMenu.android.kt\nandroidx/compose/material3/AndroidMenu_androidKt\n*L\n181#1:196\n119#1:216\n155#1:217\n56#1:197,6\n60#1:203,6\n63#1:210,6\n61#1:209\n*E\n"})
public final class AndroidMenu_androidKt {
    public static final PopupProperties a;

    static {
        AndroidMenu_androidKt.a = new PopupProperties(true, false, false, false, 14, null);
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use overload with parameters for shape, color, elevation, and border.", replaceWith = @ReplaceWith(expression = "DropdownMenu(\n    expanded = expanded,\n    onDismissRequest = onDismissRequest,\n    modifier = modifier,\n    offset = offset,\n    scrollState = scrollState,\n    properties = properties,\n    shape = MenuDefaults.shape,\n    containerColor = MenuDefaults.containerColor,\n    tonalElevation = MenuDefaults.TonalElevation,\n    shadowElevation = MenuDefaults.ShadowElevation,\n    border = null,\n    content = content,\n)", imports = {}))
    public static final void DropdownMenu-4kj-_NE(boolean z, Function0 function00, Modifier modifier0, long v, ScrollState scrollState0, PopupProperties popupProperties0, Function3 function30, Composer composer0, int v1, int v2) {
        long v6;
        ScrollState scrollState2;
        Modifier modifier2;
        ScrollState scrollState3;
        PopupProperties popupProperties2;
        int v7;
        PopupProperties popupProperties1;
        int v5;
        ScrollState scrollState1;
        long v4;
        Modifier modifier1;
        int v3;
        Composer composer1 = composer0.startRestartGroup(0xBC2C92A2);
        if((v2 & 1) == 0) {
            v3 = (v1 & 6) == 0 ? (composer1.changed(z) ? 4 : 2) | v1 : v1;
        }
        else {
            v3 = v1 | 6;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
        }
        else if((v1 & 0x30) == 0) {
            v3 |= (composer1.changedInstance(function00) ? 0x20 : 16);
        }
        if((v2 & 4) != 0) {
            v3 |= 0x180;
            modifier1 = modifier0;
        }
        else if((v1 & 0x180) == 0) {
            modifier1 = modifier0;
            v3 |= (composer1.changed(modifier1) ? 0x100 : 0x80);
        }
        else {
            modifier1 = modifier0;
        }
        if((v2 & 8) == 0) {
            v4 = v;
            if((v1 & 0xC00) == 0) {
                v3 |= (composer1.changed(v4) ? 0x800 : 0x400);
            }
        }
        else {
            v3 |= 0xC00;
            v4 = v;
        }
        if((v1 & 0x6000) == 0) {
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
            popupProperties1 = popupProperties0;
        }
        else if((0x30000 & v1) == 0) {
            popupProperties1 = popupProperties0;
            v3 |= (composer1.changed(popupProperties1) ? 0x20000 : 0x10000);
        }
        else {
            popupProperties1 = popupProperties0;
        }
        if((v2 & 0x40) != 0) {
            v3 |= 0x180000;
        }
        else if((v1 & 0x180000) == 0) {
            v3 |= (composer1.changedInstance(function30) ? 0x100000 : 0x80000);
        }
        if((0x92493 & v3) != 0x92492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v1 & 1) == 0 || composer1.getDefaultsInvalid()) {
                if((v2 & 4) != 0) {
                    modifier1 = Modifier.Companion;
                }
                if((v2 & 8) != 0) {
                    v4 = 0L;
                }
                if((v2 & 16) != 0) {
                    v3 &= 0xFFFF1FFF;
                    scrollState1 = ScrollKt.rememberScrollState(0, composer1, 0, 1);
                }
                if((v2 & 0x20) == 0) {
                label_78:
                    v7 = v3;
                    scrollState3 = scrollState1;
                    v6 = v4;
                    popupProperties2 = popupProperties1;
                }
                else {
                    v7 = v3;
                    popupProperties2 = new PopupProperties(true, false, false, false, 14, null);
                    scrollState3 = scrollState1;
                    v6 = v4;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v2 & 16) != 0) {
                    v3 &= 0xFFFF1FFF;
                }
                goto label_78;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xBC2C92A2, v7, -1, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:123)");
            }
            AndroidMenu_androidKt.DropdownMenu-IlH_yew(z, function00, modifier1, v6, scrollState3, popupProperties2, MenuDefaults.INSTANCE.getShape(composer1, 6), MenuDefaults.INSTANCE.getContainerColor(composer1, 6), 0.0f, 0.0f, null, function30, composer1, v7 & 14 | 0x36000000 | v7 & 0x70 | v7 & 0x380 | v7 & 0x1C00 | 0xE000 & v7 | 0x70000 & v7, v7 >> 15 & 0x70 | 6, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            popupProperties1 = popupProperties2;
            modifier2 = modifier1;
            scrollState2 = scrollState3;
        }
        else {
            composer1.skipToGroupEnd();
            modifier2 = modifier1;
            scrollState2 = scrollState1;
            v6 = v4;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new v(z, function00, modifier2, v6, scrollState2, popupProperties1, function30, v1, v2, 0));
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
        Composer composer1 = composer0.startRestartGroup(0x152639AA);
        if((v2 & 1) == 0) {
            v3 = (v1 & 6) == 0 ? (composer1.changed(z) ? 4 : 2) | v1 : v1;
        }
        else {
            v3 = v1 | 6;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
        }
        else if((v1 & 0x30) == 0) {
            v3 |= (composer1.changedInstance(function00) ? 0x20 : 16);
        }
        if((v2 & 4) != 0) {
            v3 |= 0x180;
            modifier1 = modifier0;
        }
        else if((v1 & 0x180) == 0) {
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
        else if((v1 & 0xC00) == 0) {
            v4 = v;
            v3 |= (composer1.changed(v4) ? 0x800 : 0x400);
        }
        else {
            v4 = v;
        }
        if((v2 & 16) != 0) {
            v3 |= 0x6000;
        }
        else if((v1 & 0x6000) == 0) {
            v3 |= (composer1.changed(popupProperties0) ? 0x4000 : 0x2000);
        }
        if((v2 & 0x20) != 0) {
            v3 |= 0x30000;
        }
        else if((v1 & 0x30000) == 0) {
            v3 |= (composer1.changedInstance(function30) ? 0x20000 : 0x10000);
        }
        if((74899 & v3) != 74898 || !composer1.getSkipping()) {
            if((v2 & 4) != 0) {
                modifier1 = Modifier.Companion;
            }
            if((v2 & 8) != 0) {
                v4 = 0L;
            }
            PopupProperties popupProperties2 = (v2 & 16) == 0 ? popupProperties0 : new PopupProperties(true, false, false, false, 14, null);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x152639AA, v3, -1, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:158)");
            }
            AndroidMenu_androidKt.DropdownMenu-IlH_yew(z, function00, modifier1, v4, ScrollKt.rememberScrollState(0, composer1, 0, 1), popupProperties2, null, 0L, 0.0f, 0.0f, null, function30, composer1, v3 & 0x1FFE | v3 << 3 & 0x70000, v3 >> 12 & 0x70, 0x7C0);
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
            scopeUpdateScope0.updateScope(new w(z, function00, modifier2, v4, popupProperties1, function30, v1, v2, 0));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void DropdownMenu-IlH_yew(boolean z, @NotNull Function0 function00, @Nullable Modifier modifier0, long v, @Nullable ScrollState scrollState0, @Nullable PopupProperties popupProperties0, @Nullable Shape shape0, long v1, float f, float f1, @Nullable BorderStroke borderStroke0, @NotNull Function3 function30, @Nullable Composer composer0, int v2, int v3, int v4) {
        BorderStroke borderStroke1;
        float f3;
        long v8;
        PopupProperties popupProperties1;
        Shape shape2;
        Modifier modifier1;
        float f2;
        ScrollState scrollState1;
        long v7;
        PopupProperties popupProperties3;
        float f5;
        int v11;
        long v10;
        PopupProperties popupProperties2;
        Modifier modifier2;
        BorderStroke borderStroke2;
        float f4;
        long v9;
        ScrollState scrollState2;
        long v12;
        int v6;
        Shape shape1;
        int v5;
        Composer composer1 = composer0.startRestartGroup(1431928300);
        if((v4 & 1) == 0) {
            v5 = (v2 & 6) == 0 ? (composer1.changed(z) ? 4 : 2) | v2 : v2;
        }
        else {
            v5 = v2 | 6;
        }
        if((v4 & 2) != 0) {
            v5 |= 0x30;
        }
        else if((v2 & 0x30) == 0) {
            v5 |= (composer1.changedInstance(function00) ? 0x20 : 16);
        }
        if((v4 & 4) != 0) {
            v5 |= 0x180;
        }
        else if((v2 & 0x180) == 0) {
            v5 |= (composer1.changed(modifier0) ? 0x100 : 0x80);
        }
        if((v4 & 8) != 0) {
            v5 |= 0xC00;
        }
        else if((v2 & 0xC00) == 0) {
            v5 |= (composer1.changed(v) ? 0x800 : 0x400);
        }
        if((v2 & 0x6000) == 0) {
            v5 |= ((v4 & 16) != 0 || !composer1.changed(scrollState0) ? 0x2000 : 0x4000);
        }
        if((v4 & 0x20) != 0) {
            v5 |= 0x30000;
        }
        else if((v2 & 0x30000) == 0) {
            v5 |= (composer1.changed(popupProperties0) ? 0x20000 : 0x10000);
        }
        if((v2 & 0x180000) == 0) {
            shape1 = shape0;
            v5 |= ((v4 & 0x40) != 0 || !composer1.changed(shape1) ? 0x80000 : 0x100000);
        }
        else {
            shape1 = shape0;
        }
        if((v2 & 0xC00000) == 0) {
            v5 |= ((v4 & 0x80) != 0 || !composer1.changed(v1) ? 0x400000 : 0x800000);
        }
        if((v4 & 0x100) != 0) {
            v5 |= 0x6000000;
        }
        else if((v2 & 0x6000000) == 0) {
            v5 |= (composer1.changed(f) ? 0x4000000 : 0x2000000);
        }
        if((v4 & 0x200) != 0) {
            v5 |= 0x30000000;
        }
        else if((v2 & 0x30000000) == 0) {
            v5 |= (composer1.changed(f1) ? 0x20000000 : 0x10000000);
        }
        if((v4 & 0x400) == 0) {
            v6 = (v3 & 6) == 0 ? v3 | (composer1.changed(borderStroke0) ? 4 : 2) : v3;
        }
        else {
            v6 = v3 | 6;
        }
        if((v4 & 0x800) != 0) {
            v6 |= 0x30;
        }
        else if((v3 & 0x30) == 0) {
            v6 |= (composer1.changedInstance(function30) ? 0x20 : 16);
        }
        if((v5 & 306783379) != 306783378 || (v6 & 19) != 18 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v2 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v4 & 4) == 0 ? modifier0 : Modifier.Companion;
                v10 = (v4 & 8) == 0 ? v : 0L;
                if((v4 & 16) == 0) {
                    scrollState2 = scrollState0;
                }
                else {
                    scrollState2 = ScrollKt.rememberScrollState(0, composer1, 0, 1);
                    v5 &= 0xFFFF1FFF;
                }
                popupProperties2 = (v4 & 0x20) == 0 ? popupProperties0 : AndroidMenu_androidKt.a;
                if((v4 & 0x40) != 0) {
                    shape1 = MenuDefaults.INSTANCE.getShape(composer1, 6);
                    v5 &= 0xFFC7FFFF;
                }
                if((v4 & 0x80) == 0) {
                    v12 = v1;
                }
                else {
                    v12 = MenuDefaults.INSTANCE.getContainerColor(composer1, 6);
                    v5 &= 0xFE3FFFFF;
                }
                if((v4 & 0x400) == 0) {
                    borderStroke2 = borderStroke0;
                    v11 = v5;
                }
                else {
                    v11 = v5;
                    borderStroke2 = null;
                }
                f5 = (v4 & 0x200) == 0 ? f1 : 0.0f;
                f4 = (v4 & 0x100) == 0 ? f : 0.0f;
                v9 = v12;
            }
            else {
                composer1.skipToGroupEnd();
                if((v4 & 16) != 0) {
                    v5 &= 0xFFFF1FFF;
                }
                if((v4 & 0x40) != 0) {
                    v5 &= 0xFFC7FFFF;
                }
                if((v4 & 0x80) != 0) {
                    v5 &= 0xFE3FFFFF;
                }
                scrollState2 = scrollState0;
                v9 = v1;
                f4 = f;
                borderStroke2 = borderStroke0;
                modifier2 = modifier0;
                popupProperties2 = popupProperties0;
                v10 = v;
                v11 = v5;
                f5 = f1;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1431928300, v11, v6, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:54)");
            }
            MutableTransitionState mutableTransitionState0 = composer1.rememberedValue();
            Companion composer$Companion0 = Composer.Companion;
            if(mutableTransitionState0 == composer$Companion0.getEmpty()) {
                mutableTransitionState0 = new MutableTransitionState(Boolean.FALSE);
                composer1.updateRememberedValue(mutableTransitionState0);
            }
            mutableTransitionState0.setTargetState(Boolean.valueOf(z));
            if(((Boolean)mutableTransitionState0.getCurrentState()).booleanValue() || ((Boolean)mutableTransitionState0.getTargetState()).booleanValue()) {
                MutableState mutableState0 = composer1.rememberedValue();
                if(mutableState0 == composer$Companion0.getEmpty()) {
                    popupProperties3 = popupProperties2;
                    mutableState0 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.box-impl(0x3F0000003F000000L), null, 2, null);
                    composer1.updateRememberedValue(mutableState0);
                }
                else {
                    popupProperties3 = popupProperties2;
                }
                Density density0 = (Density)composer1.consume(CompositionLocalsKt.getLocalDensity());
                boolean z1 = composer1.changed(density0);
                DropdownMenuPositionProvider dropdownMenuPositionProvider0 = composer1.rememberedValue();
                if((v11 & 0x1C00) == 0x800 || z1 || dropdownMenuPositionProvider0 == composer$Companion0.getEmpty()) {
                    dropdownMenuPositionProvider0 = new DropdownMenuPositionProvider(v10, density0, 0, new x(mutableState0, 0), 4, null);
                    composer1.updateRememberedValue(dropdownMenuPositionProvider0);
                }
                AndroidPopup_androidKt.Popup(dropdownMenuPositionProvider0, function00, popupProperties3, ComposableLambdaKt.rememberComposableLambda(0x7EC6F865, true, new t(modifier2, mutableTransitionState0, mutableState0, scrollState2, shape1, v9, f4, f5, borderStroke2, function30), composer1, 54), composer1, v11 & 0x70 | 0xC00 | v11 >> 9 & 0x380, 0);
            }
            else {
                popupProperties3 = popupProperties2;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            popupProperties1 = popupProperties3;
            borderStroke1 = borderStroke2;
            shape2 = shape1;
            f3 = f5;
            f2 = f4;
            v8 = v9;
            modifier1 = modifier2;
            v7 = v10;
            scrollState1 = scrollState2;
        }
        else {
            composer1.skipToGroupEnd();
            v7 = v;
            scrollState1 = scrollState0;
            f2 = f;
            modifier1 = modifier0;
            shape2 = shape1;
            popupProperties1 = popupProperties0;
            v8 = v1;
            f3 = f1;
            borderStroke1 = borderStroke0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new u(z, function00, modifier1, v7, scrollState1, popupProperties1, shape2, v8, f2, f3, borderStroke1, function30, v2, v3, v4));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void DropdownMenuItem(@NotNull Function2 function20, @NotNull Function0 function00, @Nullable Modifier modifier0, @Nullable Function2 function21, @Nullable Function2 function22, boolean z, @Nullable MenuItemColors menuItemColors0, @Nullable PaddingValues paddingValues0, @Nullable MutableInteractionSource mutableInteractionSource0, @Nullable Composer composer0, int v, int v1) {
        PaddingValues paddingValues1;
        MenuItemColors menuItemColors1;
        boolean z1;
        Function2 function26;
        Function2 function25;
        MutableInteractionSource mutableInteractionSource1;
        Modifier modifier1;
        MenuItemColors menuItemColors2;
        boolean z2;
        Function2 function27;
        MutableInteractionSource mutableInteractionSource2;
        PaddingValues paddingValues2;
        Modifier modifier2;
        Function2 function24;
        Function2 function23;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x6CDBBE60);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changedInstance(function20) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (composer1.changedInstance(function00) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v2 |= (composer1.changed(modifier0) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
            function23 = function21;
        }
        else if((v & 0xC00) == 0) {
            function23 = function21;
            v2 |= (composer1.changedInstance(function23) ? 0x800 : 0x400);
        }
        else {
            function23 = function21;
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
            function24 = function22;
        }
        else if((v & 0x6000) == 0) {
            function24 = function22;
            v2 |= (composer1.changedInstance(function24) ? 0x4000 : 0x2000);
        }
        else {
            function24 = function22;
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
        }
        else if((0x30000 & v) == 0) {
            v2 |= (composer1.changed(z) ? 0x20000 : 0x10000);
        }
        if((0x180000 & v) == 0) {
            v2 |= ((v1 & 0x40) != 0 || !composer1.changed(menuItemColors0) ? 0x80000 : 0x100000);
        }
        if((v1 & 0x80) != 0) {
            v2 |= 0xC00000;
        }
        else if((v & 0xC00000) == 0) {
            v2 |= (composer1.changed(paddingValues0) ? 0x800000 : 0x400000);
        }
        if((v1 & 0x100) != 0) {
            v2 |= 0x6000000;
        }
        else if((v & 0x6000000) == 0) {
            v2 |= (composer1.changed(mutableInteractionSource0) ? 0x4000000 : 0x2000000);
        }
        if((v2 & 0x2492493) != 0x2492492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v1 & 4) == 0 ? modifier0 : Modifier.Companion;
                mutableInteractionSource2 = null;
                if((v1 & 8) != 0) {
                    function23 = null;
                }
                if((v1 & 16) != 0) {
                    function24 = null;
                }
                z2 = (v1 & 0x20) == 0 ? z : true;
                if((v1 & 0x40) == 0) {
                    menuItemColors2 = menuItemColors0;
                }
                else {
                    menuItemColors2 = MenuDefaults.INSTANCE.itemColors(composer1, 6);
                    v2 &= 0xFFC7FFFF;
                }
                PaddingValues paddingValues3 = (v1 & 0x80) == 0 ? paddingValues0 : MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                if((v1 & 0x100) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource0;
                }
                paddingValues2 = paddingValues3;
                function27 = function24;
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 0x40) != 0) {
                    v2 &= 0xFFC7FFFF;
                }
                modifier2 = modifier0;
                paddingValues2 = paddingValues0;
                mutableInteractionSource2 = mutableInteractionSource0;
                function27 = function24;
                z2 = z;
                menuItemColors2 = menuItemColors0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x6CDBBE60, v2, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:179)");
            }
            MenuKt.DropdownMenuItemContent(function20, function00, modifier2, function23, function27, z2, menuItemColors2, paddingValues2, mutableInteractionSource2, composer1, v2 & 0xFFFFFFE);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
            z1 = z2;
            function25 = function23;
            menuItemColors1 = menuItemColors2;
            paddingValues1 = paddingValues2;
            mutableInteractionSource1 = mutableInteractionSource2;
            function26 = function27;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            mutableInteractionSource1 = mutableInteractionSource0;
            function25 = function23;
            function26 = function24;
            z1 = z;
            menuItemColors1 = menuItemColors0;
            paddingValues1 = paddingValues0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new y(function20, function00, modifier1, function25, function26, z1, menuItemColors1, paddingValues1, mutableInteractionSource1, v, v1));
        }
    }

    @NotNull
    public static final PopupProperties getDefaultMenuProperties() {
        return AndroidMenu_androidKt.a;
    }
}

