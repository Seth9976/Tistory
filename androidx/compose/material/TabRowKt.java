package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.material3.qn;
import androidx.compose.material3.sn;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.UiComposable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.ra;
import p0.va;
import p0.wa;
import p0.za;

@Metadata(d1 = {"\u0000F\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u001A\u009F\u0001\u0010\u0016\u001A\u00020\r2\u0006\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u000423\b\u0002\u0010\u0010\u001A-\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\t0\b¢\u0006\f\b\n\u0012\b\b\u000B\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0007¢\u0006\u0002\b\u000E¢\u0006\u0002\b\u000F2\u0018\b\u0002\u0010\u0012\u001A\u0012\u0012\u0004\u0012\u00020\r0\u0011¢\u0006\u0002\b\u000E¢\u0006\u0002\b\u000F2\u0016\u0010\u0013\u001A\u0012\u0012\u0004\u0012\u00020\r0\u0011¢\u0006\u0002\b\u000E¢\u0006\u0002\b\u000FH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001A©\u0001\u0010\u001B\u001A\u00020\r2\u0006\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00042\b\b\u0002\u0010\u0018\u001A\u00020\u001723\b\u0002\u0010\u0010\u001A-\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\t0\b¢\u0006\f\b\n\u0012\b\b\u000B\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0007¢\u0006\u0002\b\u000E¢\u0006\u0002\b\u000F2\u0018\b\u0002\u0010\u0012\u001A\u0012\u0012\u0004\u0012\u00020\r0\u0011¢\u0006\u0002\b\u000E¢\u0006\u0002\b\u000F2\u0016\u0010\u0013\u001A\u0012\u0012\u0004\u0012\u00020\r0\u0011¢\u0006\u0002\b\u000E¢\u0006\u0002\b\u000FH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001A\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u001C"}, d2 = {"", "selectedTabIndex", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "contentColor", "Lkotlin/Function1;", "", "Landroidx/compose/material/TabPosition;", "Lkotlin/ParameterName;", "name", "tabPositions", "", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/ui/UiComposable;", "indicator", "Lkotlin/Function0;", "divider", "tabs", "TabRow-pAZo6Ak", "(ILandroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "TabRow", "Landroidx/compose/ui/unit/Dp;", "edgePadding", "ScrollableTabRow-sKfQg0A", "(ILandroidx/compose/ui/Modifier;JJFLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ScrollableTabRow", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabRowKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,521:1\n154#2:522\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabRowKt\n*L\n512#1:522\n*E\n"})
public final class TabRowKt {
    public static final float a;
    public static final TweenSpec b;

    static {
        TabRowKt.a = 90.0f;
        TabRowKt.b = AnimationSpecKt.tween$default(0xFA, 0, EasingKt.getFastOutSlowInEasing(), 2, null);
    }

    @Composable
    @UiComposable
    public static final void ScrollableTabRow-sKfQg0A(int v, @Nullable Modifier modifier0, long v1, long v2, float f, @Nullable Function3 function30, @Nullable Function2 function20, @NotNull Function2 function21, @Nullable Composer composer0, int v3, int v4) {
        Function3 function31;
        Function2 function22;
        Modifier modifier1;
        Function2 function23;
        int v10;
        float f2;
        Modifier modifier2;
        float f1;
        int v9;
        long v8;
        int v7;
        long v6;
        int v5;
        Composer composer1 = composer0.startRestartGroup(-1473476840);
        if((v4 & 1) == 0) {
            v5 = (v3 & 14) == 0 ? (composer1.changed(v) ? 4 : 2) | v3 : v3;
        }
        else {
            v5 = v3 | 6;
        }
        if((v4 & 2) != 0) {
            v5 |= 0x30;
        }
        else if((v3 & 0x70) == 0) {
            v5 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v3 & 0x380) == 0) {
            if((v4 & 4) == 0) {
                v6 = v1;
                v7 = composer1.changed(v6) ? 0x100 : 0x80;
            }
            else {
                v6 = v1;
                v7 = 0x80;
            }
            v5 |= v7;
        }
        else {
            v6 = v1;
        }
        if((v3 & 0x1C00) == 0) {
            if((v4 & 8) == 0) {
                v8 = v2;
                v9 = composer1.changed(v8) ? 0x800 : 0x400;
            }
            else {
                v8 = v2;
                v9 = 0x400;
            }
            v5 |= v9;
        }
        else {
            v8 = v2;
        }
        if((v4 & 16) != 0) {
            v5 |= 0x6000;
            f1 = f;
        }
        else if((0xE000 & v3) == 0) {
            f1 = f;
            v5 |= (composer1.changed(f1) ? 0x4000 : 0x2000);
        }
        else {
            f1 = f;
        }
        if((v4 & 0x20) != 0) {
            v5 |= 0x30000;
        }
        else if((0x70000 & v3) == 0) {
            v5 |= (composer1.changedInstance(function30) ? 0x20000 : 0x10000);
        }
        if((v4 & 0x40) != 0) {
            v5 |= 0x180000;
        }
        else if((v3 & 0x380000) == 0) {
            v5 |= (composer1.changedInstance(function20) ? 0x100000 : 0x80000);
        }
        if((v4 & 0x80) != 0) {
            v5 |= 0xC00000;
        }
        else if((0x1C00000 & v3) == 0) {
            v5 |= (composer1.changedInstance(function21) ? 0x800000 : 0x400000);
        }
        if((v5 & 0x16DB6DB) != 4793490 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v3 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v4 & 2) == 0 ? modifier0 : Modifier.Companion;
                if((v4 & 4) != 0) {
                    v6 = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composer1, 6));
                    v5 &= -897;
                }
                if((v4 & 8) != 0) {
                    v8 = ColorsKt.contentColorFor-ek8zF_U(v6, composer1, v5 >> 6 & 14);
                    v5 &= 0xFFFFE3FF;
                }
                f2 = (v4 & 16) == 0 ? f1 : 52.0f;
                function31 = (v4 & 0x20) == 0 ? function30 : ComposableLambdaKt.composableLambda(composer1, 0xD8EC2FF3, true, new ra(v));
                if((v4 & 0x40) == 0) {
                    v10 = v5;
                    function23 = function20;
                }
                else {
                    v10 = v5;
                    function23 = ComposableSingletons.TabRowKt.INSTANCE.getLambda-2$material_release();
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v4 & 4) != 0) {
                    v5 &= -897;
                }
                if((v4 & 8) != 0) {
                    v5 &= 0xFFFFE3FF;
                }
                modifier2 = modifier0;
                f2 = f1;
                function31 = function30;
                v10 = v5;
                function23 = function20;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1473476840, v10, -1, "androidx.compose.material.ScrollableTabRow (TabRow.kt:243)");
            }
            SurfaceKt.Surface-F-jzlyU(modifier2, null, v6, v8, null, 0.0f, ComposableLambdaKt.composableLambda(composer1, 1455860572, true, new va(f2, function21, function23, v, function31)), composer1, v10 >> 3 & 14 | 0x180000 | v10 & 0x380 | v10 & 0x1C00, 50);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function22 = function23;
            f1 = f2;
            modifier1 = modifier2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            function22 = function20;
            function31 = function30;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new sn(v, modifier1, v6, v8, f1, function31, function22, function21, v3, v4, 1));
        }
    }

    @Composable
    @UiComposable
    public static final void TabRow-pAZo6Ak(int v, @Nullable Modifier modifier0, long v1, long v2, @Nullable Function3 function30, @Nullable Function2 function20, @NotNull Function2 function21, @Nullable Composer composer0, int v3, int v4) {
        Function3 function31;
        Modifier modifier1;
        Modifier modifier2;
        Function2 function22;
        long v8;
        int v7;
        long v6;
        int v5;
        Composer composer1 = composer0.startRestartGroup(0xF125E307);
        if((v4 & 1) == 0) {
            v5 = (v3 & 14) == 0 ? (composer1.changed(v) ? 4 : 2) | v3 : v3;
        }
        else {
            v5 = v3 | 6;
        }
        if((v4 & 2) != 0) {
            v5 |= 0x30;
        }
        else if((v3 & 0x70) == 0) {
            v5 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v3 & 0x380) == 0) {
            if((v4 & 4) == 0) {
                v6 = v1;
                v7 = composer1.changed(v6) ? 0x100 : 0x80;
            }
            else {
                v6 = v1;
                v7 = 0x80;
            }
            v5 |= v7;
        }
        else {
            v6 = v1;
        }
        if((v3 & 0x1C00) == 0) {
            v8 = v2;
            v5 |= ((v4 & 8) != 0 || !composer1.changed(v8) ? 0x400 : 0x800);
        }
        else {
            v8 = v2;
        }
        if((v4 & 16) != 0) {
            v5 |= 0x6000;
        }
        else if((0xE000 & v3) == 0) {
            v5 |= (composer1.changedInstance(function30) ? 0x4000 : 0x2000);
        }
        if((v4 & 0x20) != 0) {
            v5 |= 0x30000;
            function22 = function20;
        }
        else if((0x70000 & v3) == 0) {
            function22 = function20;
            v5 |= (composer1.changedInstance(function22) ? 0x20000 : 0x10000);
        }
        else {
            function22 = function20;
        }
        if((v4 & 0x40) != 0) {
            v5 |= 0x180000;
        }
        else if((v3 & 0x380000) == 0) {
            v5 |= (composer1.changedInstance(function21) ? 0x100000 : 0x80000);
        }
        if((v5 & 0x2DB6DB) != 0x92492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v3 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v4 & 2) == 0 ? modifier0 : Modifier.Companion;
                if((v4 & 4) != 0) {
                    v6 = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composer1, 6));
                    v5 &= -897;
                }
                if((v4 & 8) != 0) {
                    v8 = ColorsKt.contentColorFor-ek8zF_U(v6, composer1, v5 >> 6 & 14);
                    v5 &= 0xFFFFE3FF;
                }
                Function3 function32 = (v4 & 16) == 0 ? function30 : ComposableLambdaKt.composableLambda(composer1, 0xDEFDF24C, true, new wa(v));
                if((v4 & 0x20) != 0) {
                    function22 = ComposableSingletons.TabRowKt.INSTANCE.getLambda-1$material_release();
                }
                function31 = function32;
            }
            else {
                composer1.skipToGroupEnd();
                if((v4 & 4) != 0) {
                    v5 &= -897;
                }
                if((v4 & 8) != 0) {
                    v5 &= 0xFFFFE3FF;
                }
                modifier2 = modifier0;
                function31 = function30;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xF125E307, v5, -1, "androidx.compose.material.TabRow (TabRow.kt:148)");
            }
            SurfaceKt.Surface-F-jzlyU(SelectableGroupKt.selectableGroup(modifier2), null, v6, v8, null, 0.0f, ComposableLambdaKt.composableLambda(composer1, 0x8B122043, true, new za(function21, function22, function31)), composer1, v5 & 0x380 | 0x180000 | v5 & 0x1C00, 50);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            function31 = function30;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new qn(v, modifier1, v6, v8, function31, function22, function21, v3, v4, 3));
        }
    }

    public static final float access$getScrollableTabRowMinimumTabWidth$p() [...] // 潜在的解密器
}

