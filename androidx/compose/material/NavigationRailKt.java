package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.material.ripple.RippleKt;
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
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.unit.Constraints;
import androidx.room.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.f1;
import p0.h0;
import p0.i1;
import p0.j1;
import p0.k0;
import p0.k1;
import p0.l1;
import p0.u5;
import p0.v5;
import p0.w5;
import p0.x5;
import p0.y5;
import zd.c;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\u001A\u0082\u0001\u0010\u0012\u001A\u00020\u000B2\u0006\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00042\b\b\u0002\u0010\b\u001A\u00020\u00072 \b\u0002\u0010\u000E\u001A\u001A\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000B\u0018\u00010\t\u00A2\u0006\u0002\b\f\u00A2\u0006\u0002\b\r2\u001C\u0010\u000F\u001A\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000B0\t\u00A2\u0006\u0002\b\f\u00A2\u0006\u0002\b\rH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0010\u0010\u0011\u001Az\u0010\u0012\u001A\u00020\u000B2\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00042\b\b\u0002\u0010\b\u001A\u00020\u00072 \b\u0002\u0010\u000E\u001A\u001A\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000B\u0018\u00010\t\u00A2\u0006\u0002\b\f\u00A2\u0006\u0002\b\r2\u001C\u0010\u000F\u001A\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000B0\t\u00A2\u0006\u0002\b\f\u00A2\u0006\u0002\b\rH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0013\u0010\u0014\u001A\u008E\u0001\u0010#\u001A\u00020\u000B2\u0006\u0010\u0016\u001A\u00020\u00152\f\u0010\u0018\u001A\b\u0012\u0004\u0012\u00020\u000B0\u00172\u0011\u0010\u0019\u001A\r\u0012\u0004\u0012\u00020\u000B0\u0017\u00A2\u0006\u0002\b\f2\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u001A\u001A\u00020\u00152\u0015\b\u0002\u0010\u001B\u001A\u000F\u0012\u0004\u0012\u00020\u000B\u0018\u00010\u0017\u00A2\u0006\u0002\b\f2\b\b\u0002\u0010\u001C\u001A\u00020\u00152\b\b\u0002\u0010\u001E\u001A\u00020\u001D2\b\b\u0002\u0010\u001F\u001A\u00020\u00042\b\b\u0002\u0010 \u001A\u00020\u0004H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b!\u0010\"\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006&\u00B2\u0006\f\u0010%\u001A\u00020$8\nX\u008A\u0084\u0002"}, d2 = {"Landroidx/compose/foundation/layout/WindowInsets;", "windowInsets", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "contentColor", "Landroidx/compose/ui/unit/Dp;", "elevation", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "header", "content", "NavigationRail-afqeVBk", "(Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/ui/Modifier;JJFLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "NavigationRail", "NavigationRail-HsRjFd4", "(Landroidx/compose/ui/Modifier;JJFLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "", "selected", "Lkotlin/Function0;", "onClick", "icon", "enabled", "label", "alwaysShowLabel", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "selectedContentColor", "unselectedContentColor", "NavigationRailItem-0S3VyRs", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;JJLandroidx/compose/runtime/Composer;II)V", "NavigationRailItem", "", "animationProgress", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nNavigationRail.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material/NavigationRailKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,474:1\n25#2:475\n456#2,8:499\n464#2,3:513\n467#2,3:517\n456#2,8:542\n464#2,3:556\n456#2,8:576\n464#2,3:590\n467#2,3:594\n456#2,8:616\n464#2,3:630\n467#2,3:634\n467#2,3:639\n1116#3,6:476\n1116#3,6:522\n74#4:482\n69#5,5:483\n74#5:516\n78#5:521\n68#5,6:559\n74#5:593\n78#5:598\n68#5,6:599\n74#5:633\n78#5:638\n79#6,11:488\n92#6:520\n76#6,14:528\n79#6,11:565\n92#6:597\n79#6,11:605\n92#6:637\n92#6:642\n3737#7,6:507\n3737#7,6:550\n3737#7,6:584\n3737#7,6:624\n81#8:643\n154#9:644\n154#9:645\n154#9:646\n154#9:647\n154#9:648\n154#9:649\n154#9:650\n*S KotlinDebug\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material/NavigationRailKt\n*L\n212#1:475\n233#1:499,8\n233#1:513,3\n233#1:517,3\n331#1:542,8\n331#1:556,3\n333#1:576,8\n333#1:590,3\n333#1:594,3\n335#1:616,8\n335#1:630,3\n335#1:634,3\n331#1:639,3\n212#1:476,6\n342#1:522,6\n214#1:482\n233#1:483,5\n233#1:516\n233#1:521\n333#1:559,6\n333#1:593\n333#1:598\n335#1:599,6\n335#1:633\n335#1:638\n233#1:488,11\n233#1:520\n331#1:528,14\n333#1:565,11\n333#1:597\n335#1:605,11\n335#1:637\n331#1:642\n233#1:507,6\n331#1:550,6\n333#1:584,6\n335#1:624,6\n299#1:643\n445#1:644\n450#1:645\n455#1:646\n461#1:647\n466#1:648\n471#1:649\n473#1:650\n*E\n"})
public final class NavigationRailKt {
    public static final TweenSpec a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;
    public static final float f;
    public static final float g;
    public static final WindowInsets h;

    static {
        NavigationRailKt.a = new TweenSpec(300, 0, EasingKt.getFastOutSlowInEasing(), 2, null);
        NavigationRailKt.b = 72.0f;
        NavigationRailKt.c = 56.0f;
        NavigationRailKt.d = 8.0f;
        NavigationRailKt.e = 8.0f;
        NavigationRailKt.f = 16.0f;
        NavigationRailKt.g = 14.0f;
        NavigationRailKt.h = WindowInsetsKt.WindowInsets-a9UjIt4$default(0.0f, 0.0f, 0.0f, 0.0f, 14, null);
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void NavigationRail-HsRjFd4(@Nullable Modifier modifier0, long v, long v1, float f, @Nullable Function3 function30, @NotNull Function3 function31, @Nullable Composer composer0, int v2, int v3) {
        Function3 function33;
        float f2;
        Modifier modifier2;
        Function3 function32;
        float f1;
        int v8;
        long v7;
        int v6;
        long v5;
        Modifier modifier1;
        int v4;
        Composer composer1 = composer0.startRestartGroup(0x6AC00E83);
        if((v3 & 1) != 0) {
            v4 = v2 | 6;
            modifier1 = modifier0;
        }
        else if((v2 & 14) == 0) {
            modifier1 = modifier0;
            v4 = (composer1.changed(modifier1) ? 4 : 2) | v2;
        }
        else {
            modifier1 = modifier0;
            v4 = v2;
        }
        if((v2 & 0x70) == 0) {
            if((v3 & 2) == 0) {
                v5 = v;
                v6 = composer1.changed(v5) ? 0x20 : 16;
            }
            else {
                v5 = v;
                v6 = 16;
            }
            v4 |= v6;
        }
        else {
            v5 = v;
        }
        if((v2 & 0x380) == 0) {
            if((v3 & 4) == 0) {
                v7 = v1;
                v8 = composer1.changed(v7) ? 0x100 : 0x80;
            }
            else {
                v7 = v1;
                v8 = 0x80;
            }
            v4 |= v8;
        }
        else {
            v7 = v1;
        }
        if((v3 & 8) != 0) {
            v4 |= 0xC00;
            f1 = f;
        }
        else if((v2 & 0x1C00) == 0) {
            f1 = f;
            v4 |= (composer1.changed(f1) ? 0x800 : 0x400);
        }
        else {
            f1 = f;
        }
        if((v3 & 16) != 0) {
            v4 |= 0x6000;
            function32 = function30;
        }
        else if((v2 & 0xE000) == 0) {
            function32 = function30;
            v4 |= (composer1.changedInstance(function32) ? 0x4000 : 0x2000);
        }
        else {
            function32 = function30;
        }
        if((v3 & 0x20) != 0) {
            v4 |= 0x30000;
        }
        else if((v2 & 0x70000) == 0) {
            v4 |= (composer1.changedInstance(function31) ? 0x20000 : 0x10000);
        }
        if((v4 & 0x5B6DB) != 74898 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v2 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v3 & 1) == 0 ? modifier1 : Modifier.Companion;
                if((v3 & 2) != 0) {
                    v4 &= 0xFFFFFF8F;
                    v5 = MaterialTheme.INSTANCE.getColors(composer1, 6).getSurface-0d7_KjU();
                }
                if((v3 & 4) != 0) {
                    long v9 = ColorsKt.contentColorFor-ek8zF_U(v5, composer1, v4 >> 3 & 14);
                    v4 &= -897;
                    v7 = v9;
                }
                if((v3 & 8) != 0) {
                    f1 = 8.0f;
                }
                if((v3 & 16) == 0) {
                    f2 = f1;
                    function33 = function32;
                }
                else {
                    function33 = null;
                    f2 = f1;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v3 & 2) != 0) {
                    v4 &= 0xFFFFFF8F;
                }
                if((v3 & 4) != 0) {
                    v4 &= -897;
                }
                modifier2 = modifier1;
                f2 = f1;
                function33 = function32;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x6AC00E83, v4, -1, "androidx.compose.material.NavigationRail (NavigationRail.kt:175)");
            }
            NavigationRailKt.NavigationRail-afqeVBk(NavigationRailKt.h, modifier2, v5, v7, f2, function33, function31, composer1, v4 << 3 & 0x70 | 6 | v4 << 3 & 0x380 | v4 << 3 & 0x1C00 | 0xE000 & v4 << 3 | v4 << 3 & 0x70000 | v4 << 3 & 0x380000, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f1 = f2;
            function32 = function33;
            modifier1 = modifier2;
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new k0(modifier1, v5, v7, f1, function32, function31, v2, v3));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void NavigationRail-afqeVBk(@NotNull WindowInsets windowInsets0, @Nullable Modifier modifier0, long v, long v1, float f, @Nullable Function3 function30, @NotNull Function3 function31, @Nullable Composer composer0, int v2, int v3) {
        float f1;
        long v6;
        long v5;
        Modifier modifier1;
        Function3 function33;
        int v7;
        Modifier modifier2;
        Function3 function32;
        int v4;
        Composer composer1 = composer0.startRestartGroup(0xAD31D465);
        if((v3 & 1) == 0) {
            v4 = (v2 & 14) == 0 ? (composer1.changed(windowInsets0) ? 4 : 2) | v2 : v2;
        }
        else {
            v4 = v2 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
        }
        else if((v2 & 0x70) == 0) {
            v4 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v2 & 0x380) == 0) {
            v4 |= ((v3 & 4) != 0 || !composer1.changed(v) ? 0x80 : 0x100);
        }
        if((v2 & 0x1C00) == 0) {
            v4 |= ((v3 & 8) != 0 || !composer1.changed(v1) ? 0x400 : 0x800);
        }
        if((v3 & 16) != 0) {
            v4 |= 0x6000;
        }
        else if((0xE000 & v2) == 0) {
            v4 |= (composer1.changed(f) ? 0x4000 : 0x2000);
        }
        if((v3 & 0x20) == 0) {
            function32 = function30;
            if((v2 & 0x70000) == 0) {
                v4 |= (composer1.changedInstance(function32) ? 0x20000 : 0x10000);
            }
        }
        else {
            v4 |= 0x30000;
            function32 = function30;
        }
        if((v3 & 0x40) != 0) {
            v4 |= 0x180000;
        }
        else if((v2 & 0x380000) == 0) {
            v4 |= (composer1.changedInstance(function31) ? 0x100000 : 0x80000);
        }
        if((v4 & 0x2DB6DB) != 0x92492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v2 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v3 & 2) == 0 ? modifier0 : Modifier.Companion;
                if((v3 & 4) == 0) {
                    v5 = v;
                }
                else {
                    v5 = MaterialTheme.INSTANCE.getColors(composer1, 6).getSurface-0d7_KjU();
                    v4 &= -897;
                }
                if((v3 & 8) == 0) {
                    v6 = v1;
                }
                else {
                    v6 = ColorsKt.contentColorFor-ek8zF_U(v5, composer1, v4 >> 6 & 14);
                    v4 &= 0xFFFFE3FF;
                }
                f1 = (v3 & 16) == 0 ? f : 8.0f;
                if((v3 & 0x20) == 0) {
                    v7 = v4;
                    function33 = function32;
                }
                else {
                    v7 = v4;
                    function33 = null;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v3 & 4) != 0) {
                    v4 &= -897;
                }
                if((v3 & 8) != 0) {
                    v4 &= 0xFFFFE3FF;
                }
                modifier2 = modifier0;
                v5 = v;
                v6 = v1;
                f1 = f;
                v7 = v4;
                function33 = function32;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xAD31D465, v7, -1, "androidx.compose.material.NavigationRail (NavigationRail.kt:110)");
            }
            SurfaceKt.Surface-F-jzlyU(modifier2, null, v5, v6, null, f1, ComposableLambdaKt.composableLambda(composer1, 0xF157BAA1, true, new u5(windowInsets0, function33, function31)), composer1, v7 >> 3 & 14 | 0x180000 | v7 & 0x380 | v7 & 0x1C00 | v7 << 3 & 0x70000, 18);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function32 = function33;
            modifier1 = modifier2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            v5 = v;
            v6 = v1;
            f1 = f;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new h0(windowInsets0, modifier1, v5, v6, f1, function32, function31, v2, v3));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void NavigationRailItem-0S3VyRs(boolean z, @NotNull Function0 function00, @NotNull Function2 function20, @Nullable Modifier modifier0, boolean z1, @Nullable Function2 function21, boolean z2, @Nullable MutableInteractionSource mutableInteractionSource0, long v, long v1, @Nullable Composer composer0, int v2, int v3) {
        long v6;
        long v5;
        boolean z6;
        Function2 function23;
        boolean z5;
        Modifier modifier1;
        MutableInteractionSource mutableInteractionSource1;
        long v8;
        Modifier modifier2;
        long v7;
        MutableInteractionSource mutableInteractionSource2;
        boolean z4;
        Function2 function22;
        boolean z3;
        int v4;
        Composer composer1 = composer0.startRestartGroup(0x93E77263);
        if((v3 & 1) == 0) {
            v4 = (v2 & 14) == 0 ? (composer1.changed(z) ? 4 : 2) | v2 : v2;
        }
        else {
            v4 = v2 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
        }
        else if((v2 & 0x70) == 0) {
            v4 |= (composer1.changedInstance(function00) ? 0x20 : 16);
        }
        if((v3 & 4) != 0) {
            v4 |= 0x180;
        }
        else if((v2 & 0x380) == 0) {
            v4 |= (composer1.changedInstance(function20) ? 0x100 : 0x80);
        }
        if((v3 & 8) != 0) {
            v4 |= 0xC00;
        }
        else if((v2 & 0x1C00) == 0) {
            v4 |= (composer1.changed(modifier0) ? 0x800 : 0x400);
        }
        if((v3 & 16) != 0) {
            v4 |= 0x6000;
            z3 = z1;
        }
        else if((0xE000 & v2) == 0) {
            z3 = z1;
            v4 |= (composer1.changed(z3) ? 0x4000 : 0x2000);
        }
        else {
            z3 = z1;
        }
        if((v3 & 0x20) != 0) {
            v4 |= 0x30000;
            function22 = function21;
        }
        else if((0x70000 & v2) == 0) {
            function22 = function21;
            v4 |= (composer1.changedInstance(function22) ? 0x20000 : 0x10000);
        }
        else {
            function22 = function21;
        }
        if((v3 & 0x40) != 0) {
            v4 |= 0x180000;
            z4 = z2;
        }
        else if((0x380000 & v2) == 0) {
            z4 = z2;
            v4 |= (composer1.changed(z4) ? 0x100000 : 0x80000);
        }
        else {
            z4 = z2;
        }
        if((v3 & 0x80) != 0) {
            v4 |= 0xC00000;
        }
        else if((v2 & 0x1C00000) == 0) {
            v4 |= (composer1.changed(mutableInteractionSource0) ? 0x800000 : 0x400000);
        }
        if((v2 & 0xE000000) == 0) {
            v4 |= ((v3 & 0x100) != 0 || !composer1.changed(v) ? 0x2000000 : 0x4000000);
        }
        if((v2 & 0x70000000) == 0) {
            v4 |= ((v3 & 0x200) != 0 || !composer1.changed(v1) ? 0x10000000 : 0x20000000);
        }
        if((v4 & 0x5B6DB6DB) != 306783378 || !composer1.getSkipping()) {
            composer1.startDefaults();
            ComposableLambda composableLambda0 = null;
            if((v2 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v3 & 8) == 0 ? modifier0 : Modifier.Companion;
                if((v3 & 16) != 0) {
                    z3 = true;
                }
                if((v3 & 0x20) != 0) {
                    function22 = null;
                }
                if((v3 & 0x40) != 0) {
                    z4 = true;
                }
                if((v3 & 0x80) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource0;
                }
                else {
                    composer1.startReplaceableGroup(0xE2A708A4);
                    MutableInteractionSource mutableInteractionSource3 = composer1.rememberedValue();
                    if(mutableInteractionSource3 == Composer.Companion.getEmpty()) {
                        mutableInteractionSource3 = InteractionSourceKt.MutableInteractionSource();
                        composer1.updateRememberedValue(mutableInteractionSource3);
                    }
                    composer1.endReplaceableGroup();
                    mutableInteractionSource2 = mutableInteractionSource3;
                }
                if((v3 & 0x100) == 0) {
                    v8 = v;
                }
                else {
                    v8 = MaterialTheme.INSTANCE.getColors(composer1, 6).getPrimary-0d7_KjU();
                    v4 &= 0xF1FFFFFF;
                }
                if((v3 & 0x200) == 0) {
                    v7 = v1;
                }
                else {
                    v7 = Color.copy-wmQWz5c$default(((Color)composer1.consume(ContentColorKt.getLocalContentColor())).unbox-impl(), ContentAlpha.INSTANCE.getMedium(composer1, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    v4 &= 0x8FFFFFFF;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v3 & 0x100) != 0) {
                    v4 &= 0xF1FFFFFF;
                }
                if((v3 & 0x200) != 0) {
                    v4 &= 0x8FFFFFFF;
                }
                mutableInteractionSource2 = mutableInteractionSource0;
                v7 = v1;
                modifier2 = modifier0;
                v8 = v;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x93E77263, v4, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:214)");
            }
            if(function22 != null) {
                composableLambda0 = ComposableLambdaKt.composableLambda(composer1, 0xF53F55E9, true, new w5(function22));
            }
            Modifier modifier3 = SizeKt.size-3ABfNKs(SelectableKt.selectable-O2vRcR0(modifier2, z, mutableInteractionSource2, RippleKt.rememberRipple-9IZ8Weo(false, 0.0f, v8, composer1, v4 >> 18 & 0x380 | 6, 2), z3, Role.box-impl(4), function00), (function22 == null ? NavigationRailKt.c : NavigationRailKt.b));
            composer1.startReplaceableGroup(0x2BB5B5D7);
            MeasurePolicy measurePolicy0 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getCenter(), false, composer1, 6);
            composer1.startReplaceableGroup(-1323940314);
            int v9 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function01 = composeUiNode$Companion0.getConstructor();
            Function3 function30 = LayoutKt.modifierMaterializerOf(modifier3);
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
            Function2 function24 = a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v9)) {
                a.t(v9, composer1, v9, function24);
            }
            function30.invoke(SkippableUpdater.box-impl(composer1), composer1, 0);
            composer1.startReplaceableGroup(2058660585);
            NavigationRailKt.a(v8, v7, z, ComposableLambdaKt.composableLambda(composer1, 0x27F83098, true, new f1(z4, function20, composableLambda0, 1)), composer1, v4 >> 24 & 0x70 | (v4 >> 24 & 14 | 0xC00) | v4 << 6 & 0x380);
            composer1.endReplaceableGroup();
            composer1.endNode();
            composer1.endReplaceableGroup();
            composer1.endReplaceableGroup();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            mutableInteractionSource1 = mutableInteractionSource2;
            z5 = z3;
            modifier1 = modifier2;
            v5 = v8;
            function23 = function22;
            z6 = z4;
            v6 = v7;
        }
        else {
            composer1.skipToGroupEnd();
            mutableInteractionSource1 = mutableInteractionSource0;
            modifier1 = modifier0;
            z5 = z3;
            function23 = function22;
            z6 = z4;
            v5 = v;
            v6 = v1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new v5(z, function00, function20, modifier1, z5, function23, z6, mutableInteractionSource1, v5, v6, v2, v3));
        }
    }

    public static final void a(long v, long v1, boolean z, Function3 function30, Composer composer0, int v2) {
        Composer composer1 = composer0.startRestartGroup(-207161906);
        int v3 = (v2 & 14) == 0 ? (composer1.changed(v) ? 4 : 2) | v2 : v2;
        if((v2 & 0x70) == 0) {
            v3 |= (composer1.changed(v1) ? 0x20 : 16);
        }
        if((v2 & 0x380) == 0) {
            v3 |= (composer1.changed(z) ? 0x100 : 0x80);
        }
        if((v2 & 0x1C00) == 0) {
            v3 |= (composer1.changedInstance(function30) ? 0x800 : 0x400);
        }
        if((v3 & 5851) != 1170 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-207161906, v3, -1, "androidx.compose.material.NavigationRailTransition (NavigationRail.kt:297)");
            }
            State state0 = AnimateAsStateKt.animateFloatAsState((z ? 1.0f : 0.0f), NavigationRailKt.a, 0.0f, null, null, composer1, 0x30, 28);
            long v4 = ColorKt.lerp-jxsXWHM(v1, v, ((Number)state0.getValue()).floatValue());
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.box-impl(Color.copy-wmQWz5c$default(v4, 1.0f, 0.0f, 0.0f, 0.0f, 14, null))), ContentAlphaKt.getLocalContentAlpha().provides(Color.getAlpha-impl(v4))}, ComposableLambdaKt.composableLambda(composer1, 0x9B60090E, true, new k1(function30, state0, 1)), composer1, 56);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new l1(v, v1, z, function30, v2, 1));
        }
    }

    public static final void access$NavigationRailItemBaselineLayout(Function2 function20, Function2 function21, float f, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x8E85604C);
        int v1 = (v & 14) == 0 ? (composer1.changedInstance(function20) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changedInstance(function21) ? 0x20 : 16);
        }
        if((v & 0x380) == 0) {
            v1 |= (composer1.changed(f) ? 0x100 : 0x80);
        }
        if((v1 & 731) != 0x92 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x8E85604C, v1, -1, "androidx.compose.material.NavigationRailItemBaselineLayout (NavigationRail.kt:329)");
            }
            composer1.startReplaceableGroup(0xE24DF09E);
            boolean z = composer1.changedInstance(function21);
            boolean z1 = composer1.changed(f);
            i1 i10 = composer1.rememberedValue();
            if(z || z1 || i10 == Composer.Companion.getEmpty()) {
                i10 = new i1(function21, f, 1);
                composer1.updateRememberedValue(i10);
            }
            composer1.endReplaceableGroup();
            composer1.startReplaceableGroup(-1323940314);
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function00 = composeUiNode$Companion0.getConstructor();
            Function3 function30 = LayoutKt.modifierMaterializerOf(modifier$Companion0);
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
            Function2 function22 = a.r(composeUiNode$Companion0, composer1, i10, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
                a.t(v2, composer1, v2, function22);
            }
            r0.a.w(0, function30, SkippableUpdater.box-impl(composer1), composer1, 2058660585);
            Modifier modifier0 = LayoutIdKt.layoutId(modifier$Companion0, "icon");
            composer1.startReplaceableGroup(0x2BB5B5D7);
            androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
            MeasurePolicy measurePolicy0 = r0.a.i(alignment$Companion0, false, composer1, 0, -1323940314);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
            Function0 function01 = composeUiNode$Companion0.getConstructor();
            Function3 function31 = LayoutKt.modifierMaterializerOf(modifier0);
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
            Function2 function23 = a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap1);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                a.t(v3, composer1, v3, function23);
            }
            r0.a.w(0, function31, SkippableUpdater.box-impl(composer1), composer1, 2058660585);
            function20.invoke(composer1, ((int)(v1 & 14)));
            composer1.endReplaceableGroup();
            composer1.endNode();
            composer1.endReplaceableGroup();
            composer1.endReplaceableGroup();
            composer1.startReplaceableGroup(0x11167ECE);
            if(function21 != null) {
                Modifier modifier1 = AlphaKt.alpha(LayoutIdKt.layoutId(modifier$Companion0, "label"), f);
                composer1.startReplaceableGroup(0x2BB5B5D7);
                MeasurePolicy measurePolicy1 = r0.a.i(alignment$Companion0, false, composer1, 0, -1323940314);
                int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
                CompositionLocalMap compositionLocalMap2 = composer1.getCurrentCompositionLocalMap();
                Function0 function02 = composeUiNode$Companion0.getConstructor();
                Function3 function32 = LayoutKt.modifierMaterializerOf(modifier1);
                if(composer1.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer1.startReusableNode();
                if(composer1.getInserting()) {
                    composer1.createNode(function02);
                }
                else {
                    composer1.useNode();
                }
                Function2 function24 = a.r(composeUiNode$Companion0, composer1, measurePolicy1, composer1, compositionLocalMap2);
                if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v4)) {
                    a.t(v4, composer1, v4, function24);
                }
                r0.a.w(0, function32, SkippableUpdater.box-impl(composer1), composer1, 2058660585);
                function21.invoke(composer1, ((int)(v1 >> 3 & 14)));
                composer1.endReplaceableGroup();
                composer1.endNode();
                composer1.endReplaceableGroup();
                composer1.endReplaceableGroup();
            }
            composer1.endReplaceableGroup();
            composer1.endReplaceableGroup();
            composer1.endNode();
            composer1.endReplaceableGroup();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new j1(function20, function21, f, v, 1));
        }
    }

    public static final float access$NavigationRailTransition_Klgx_Pg$lambda$3(State state0) {
        return ((Number)state0.getValue()).floatValue();
    }

    public static final float access$getHeaderPadding$p() [...] // 潜在的解密器

    public static final float access$getNavigationRailPadding$p() [...] // 潜在的解密器

    public static final MeasureResult access$placeIcon-3p2s80s(MeasureScope measureScope0, Placeable placeable0, long v) {
        return MeasureScope.layout$default(measureScope0, Constraints.getMaxWidth-impl(v), Constraints.getMaxHeight-impl(v), null, new x5(placeable0, Math.max(0, (Constraints.getMaxWidth-impl(v) - placeable0.getWidth()) / 2), Math.max(0, (Constraints.getMaxHeight-impl(v) - placeable0.getHeight()) / 2)), 4, null);
    }

    public static final MeasureResult access$placeLabelAndIcon-DIyivk0(MeasureScope measureScope0, Placeable placeable0, Placeable placeable1, long v, float f) {
        int v1 = placeable0.get(AlignmentLineKt.getLastBaseline());
        int v2 = measureScope0.roundToPx-0680j_4(NavigationRailKt.f);
        int v3 = q.d(placeable0, Constraints.getMaxWidth-impl(v), 2);
        int v4 = measureScope0.roundToPx-0680j_4(NavigationRailKt.g);
        int v5 = q.A(placeable1, Constraints.getMaxHeight-impl(v), 2);
        int v6 = q.d(placeable1, Constraints.getMaxWidth-impl(v), 2);
        return MeasureScope.layout$default(measureScope0, Constraints.getMaxWidth-impl(v), Constraints.getMaxHeight-impl(v), null, new y5(f, placeable0, v3, Constraints.getMaxHeight-impl(v) - v1 - v2, c.roundToInt((1.0f - f) * ((float)(v5 - v4))), placeable1, v6, v4), 4, null);
    }
}

