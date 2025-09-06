package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000P\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001A\u0080\u0001\u0010\u0012\u001A\u00020\t2\u0006\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00042\u001E\b\u0002\u0010\f\u001A\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u00A2\u0006\u0002\b\n\u00A2\u0006\u0002\b\u000B2\u0013\b\u0002\u0010\u000E\u001A\r\u0012\u0004\u0012\u00020\t0\r\u00A2\u0006\u0002\b\n2\u0011\u0010\u000F\u001A\r\u0012\u0004\u0012\u00020\t0\r\u00A2\u0006\u0002\b\nH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0010\u0010\u0011\u001A\u0080\u0001\u0010\u0014\u001A\u00020\t2\u0006\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00042\u001E\b\u0002\u0010\f\u001A\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u00A2\u0006\u0002\b\n\u00A2\u0006\u0002\b\u000B2\u0013\b\u0002\u0010\u000E\u001A\r\u0012\u0004\u0012\u00020\t0\r\u00A2\u0006\u0002\b\n2\u0011\u0010\u000F\u001A\r\u0012\u0004\u0012\u00020\t0\r\u00A2\u0006\u0002\b\nH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0013\u0010\u0011\u001A\u0090\u0001\u0010\u001B\u001A\u00020\t2\u0006\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00042.\b\u0002\u0010\f\u001A(\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00160\u0015\u00A2\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\t0\u0007\u00A2\u0006\u0002\b\n2\u0013\b\u0002\u0010\u000E\u001A\r\u0012\u0004\u0012\u00020\t0\r\u00A2\u0006\u0002\b\n2\u0011\u0010\u000F\u001A\r\u0012\u0004\u0012\u00020\t0\r\u00A2\u0006\u0002\b\nH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001A\u0010\u0011\u001A\u0094\u0001\u0010\"\u001A\u00020\t2\u0006\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u001D\u001A\u00020\u001C2\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00042\b\b\u0002\u0010\u001F\u001A\u00020\u001E2\u001E\b\u0002\u0010\f\u001A\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u00A2\u0006\u0002\b\n\u00A2\u0006\u0002\b\u000B2\u0013\b\u0002\u0010\u000E\u001A\r\u0012\u0004\u0012\u00020\t0\r\u00A2\u0006\u0002\b\n2\u0011\u0010\u000F\u001A\r\u0012\u0004\u0012\u00020\t0\r\u00A2\u0006\u0002\b\nH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b \u0010!\u001A\u0094\u0001\u0010$\u001A\u00020\t2\u0006\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u001D\u001A\u00020\u001C2\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00042\b\b\u0002\u0010\u001F\u001A\u00020\u001E2\u001E\b\u0002\u0010\f\u001A\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u00A2\u0006\u0002\b\n\u00A2\u0006\u0002\b\u000B2\u0013\b\u0002\u0010\u000E\u001A\r\u0012\u0004\u0012\u00020\t0\r\u00A2\u0006\u0002\b\n2\u0011\u0010\u000F\u001A\r\u0012\u0004\u0012\u00020\t0\r\u00A2\u0006\u0002\b\nH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b#\u0010!\u001A\u009A\u0001\u0010\'\u001A\u00020\t2\u0006\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00042\b\b\u0002\u0010\u001F\u001A\u00020\u001E2.\b\u0002\u0010\f\u001A(\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00160\u0015\u00A2\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\t0\u0007\u00A2\u0006\u0002\b\n2\u0013\b\u0002\u0010\u000E\u001A\r\u0012\u0004\u0012\u00020\t0\r\u00A2\u0006\u0002\b\n2\u0011\u0010\u000F\u001A\r\u0012\u0004\u0012\u00020\t0\r\u00A2\u0006\u0002\b\nH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b%\u0010&\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006("}, d2 = {"", "selectedTabIndex", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "Lkotlin/Function1;", "Landroidx/compose/material3/TabIndicatorScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "indicator", "Lkotlin/Function0;", "divider", "tabs", "PrimaryTabRow-pAZo6Ak", "(ILandroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "PrimaryTabRow", "SecondaryTabRow-pAZo6Ak", "SecondaryTabRow", "", "Landroidx/compose/material3/TabPosition;", "Lkotlin/ParameterName;", "name", "tabPositions", "TabRow-pAZo6Ak", "TabRow", "Landroidx/compose/foundation/ScrollState;", "scrollState", "Landroidx/compose/ui/unit/Dp;", "edgePadding", "PrimaryScrollableTabRow-qhFBPw4", "(ILandroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;JJFLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "PrimaryScrollableTabRow", "SecondaryScrollableTabRow-qhFBPw4", "SecondaryScrollableTabRow", "ScrollableTabRow-sKfQg0A", "(ILandroidx/compose/ui/Modifier;JJFLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ScrollableTabRow", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1355:1\n148#2:1356\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowKt\n*L\n1346#1:1356\n*E\n"})
public final class TabRowKt {
    public static final float a;
    public static final TweenSpec b;
    public static final TweenSpec c;

    static {
        TabRowKt.a = 90.0f;
        TabRowKt.b = AnimationSpecKt.tween$default(0xFA, 0, EasingKt.getFastOutSlowInEasing(), 2, null);
        TabRowKt.c = AnimationSpecKt.tween$default(0xFA, 0, EasingKt.getFastOutSlowInEasing(), 2, null);
    }

    @ExperimentalMaterial3Api
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_][_]]")
    public static final void PrimaryScrollableTabRow-qhFBPw4(int v, @Nullable Modifier modifier0, @Nullable ScrollState scrollState0, long v1, long v2, float f, @Nullable Function3 function30, @Nullable Function2 function20, @NotNull Function2 function21, @Nullable Composer composer0, int v3, int v4) {
        Function2 function22;
        float f1;
        long v11;
        long v10;
        Function3 function31;
        ScrollState scrollState1;
        Modifier modifier1;
        float f2;
        long v13;
        long v12;
        Function2 function23;
        Function3 function32;
        ScrollState scrollState2;
        Modifier modifier2;
        Function3 function33;
        int v14;
        ScrollState scrollState3;
        int v9;
        long v8;
        int v7;
        long v6;
        int v5;
        Composer composer1 = composer0.startRestartGroup(0x96E71367);
        if((v4 & 1) == 0) {
            v5 = (v3 & 6) == 0 ? (composer1.changed(v) ? 4 : 2) | v3 : v3;
        }
        else {
            v5 = v3 | 6;
        }
        if((v4 & 2) != 0) {
            v5 |= 0x30;
        }
        else if((v3 & 0x30) == 0) {
            v5 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v3 & 0x180) == 0) {
            v5 |= ((v4 & 4) != 0 || !composer1.changed(scrollState0) ? 0x80 : 0x100);
        }
        if((v3 & 0xC00) == 0) {
            if((v4 & 8) == 0) {
                v6 = v1;
                v7 = composer1.changed(v6) ? 0x800 : 0x400;
            }
            else {
                v6 = v1;
                v7 = 0x400;
            }
            v5 |= v7;
        }
        else {
            v6 = v1;
        }
        if((v3 & 0x6000) == 0) {
            if((v4 & 16) == 0) {
                v8 = v2;
                v9 = composer1.changed(v8) ? 0x4000 : 0x2000;
            }
            else {
                v8 = v2;
                v9 = 0x2000;
            }
            v5 |= v9;
        }
        else {
            v8 = v2;
        }
        if((v4 & 0x20) != 0) {
            v5 |= 0x30000;
        }
        else if((0x30000 & v3) == 0) {
            v5 |= (composer1.changed(f) ? 0x20000 : 0x10000);
        }
        if((v4 & 0x40) != 0) {
            v5 |= 0x180000;
        }
        else if((v3 & 0x180000) == 0) {
            v5 |= (composer1.changedInstance(function30) ? 0x100000 : 0x80000);
        }
        if((v4 & 0x80) != 0) {
            v5 |= 0xC00000;
        }
        else if((v3 & 0xC00000) == 0) {
            v5 |= (composer1.changedInstance(function20) ? 0x800000 : 0x400000);
        }
        if((v4 & 0x100) != 0) {
            v5 |= 0x6000000;
        }
        else if((v3 & 0x6000000) == 0) {
            v5 |= (composer1.changedInstance(function21) ? 0x4000000 : 0x2000000);
        }
        if((v5 & 0x2492493) != 0x2492492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v3 & 1) == 0 || composer1.getDefaultsInvalid()) {
                Modifier modifier3 = (v4 & 2) == 0 ? modifier0 : Modifier.Companion;
                if((v4 & 4) == 0) {
                    scrollState3 = scrollState0;
                }
                else {
                    scrollState3 = ScrollKt.rememberScrollState(0, composer1, 0, 1);
                    v5 &= -897;
                }
                if((v4 & 8) != 0) {
                    v6 = TabRowDefaults.INSTANCE.getPrimaryContainerColor(composer1, 6);
                    v5 &= 0xFFFFE3FF;
                }
                if((v4 & 16) != 0) {
                    v8 = TabRowDefaults.INSTANCE.getPrimaryContentColor(composer1, 6);
                    v5 &= 0xFFFF1FFF;
                }
                if((v4 & 0x40) == 0) {
                    v14 = v5;
                    function33 = function30;
                }
                else {
                    v14 = v5;
                    function33 = ComposableLambdaKt.rememberComposableLambda(1601820568, true, new nn(v), composer1, 54);
                }
                function23 = (v4 & 0x80) == 0 ? function20 : ComposableSingletons.TabRowKt.INSTANCE.getLambda-4$material3_release();
                function32 = function33;
                modifier2 = modifier3;
                scrollState2 = scrollState3;
                f2 = (v4 & 0x20) == 0 ? f : 52.0f;
                v12 = v6;
                v13 = v8;
                v5 = v14;
            }
            else {
                composer1.skipToGroupEnd();
                if((v4 & 4) != 0) {
                    v5 &= -897;
                }
                if((v4 & 8) != 0) {
                    v5 &= 0xFFFFE3FF;
                }
                if((v4 & 16) != 0) {
                    v5 &= 0xFFFF1FFF;
                }
                modifier2 = modifier0;
                scrollState2 = scrollState0;
                function32 = function30;
                function23 = function20;
                v12 = v6;
                v13 = v8;
                f2 = f;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x96E71367, v5, -1, "androidx.compose.material3.PrimaryScrollableTabRow (TabRow.kt:370)");
            }
            TabRowKt.a(v, modifier2, v12, v13, f2, scrollState2, function32, function23, function21, composer1, v5 & 0x7E | v5 >> 3 & 0x380 | v5 >> 3 & 0x1C00 | v5 >> 3 & 0xE000 | v5 << 9 & 0x70000 | 0x380000 & v5 | 0x1C00000 & v5 | v5 & 0xE000000);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
            scrollState1 = scrollState2;
            v10 = v12;
            v11 = v13;
            f1 = f2;
            function31 = function32;
            function22 = function23;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            scrollState1 = scrollState0;
            function31 = function30;
            v10 = v6;
            v11 = v8;
            f1 = f;
            function22 = function20;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new on(v, modifier1, scrollState1, v10, v11, f1, function31, function22, function21, v3, v4, 0));
        }
    }

    @ExperimentalMaterial3Api
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_][_]]")
    public static final void PrimaryTabRow-pAZo6Ak(int v, @Nullable Modifier modifier0, long v1, long v2, @Nullable Function3 function30, @Nullable Function2 function20, @NotNull Function2 function21, @Nullable Composer composer0, int v3, int v4) {
        Modifier modifier1;
        Function2 function23;
        Function3 function32;
        long v10;
        Modifier modifier2;
        Function2 function22;
        Function3 function31;
        int v9;
        long v8;
        int v7;
        long v6;
        int v5;
        Composer composer1 = composer0.startRestartGroup(0x8FA86DAC);
        if((v4 & 1) == 0) {
            v5 = (v3 & 6) == 0 ? (composer1.changed(v) ? 4 : 2) | v3 : v3;
        }
        else {
            v5 = v3 | 6;
        }
        if((v4 & 2) != 0) {
            v5 |= 0x30;
        }
        else if((v3 & 0x30) == 0) {
            v5 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v3 & 0x180) == 0) {
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
        if((v3 & 0xC00) == 0) {
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
            function31 = function30;
        }
        else if((v3 & 0x6000) == 0) {
            function31 = function30;
            v5 |= (composer1.changedInstance(function31) ? 0x4000 : 0x2000);
        }
        else {
            function31 = function30;
        }
        if((v4 & 0x20) != 0) {
            v5 |= 0x30000;
            function22 = function20;
        }
        else if((0x30000 & v3) == 0) {
            function22 = function20;
            v5 |= (composer1.changedInstance(function22) ? 0x20000 : 0x10000);
        }
        else {
            function22 = function20;
        }
        if((v4 & 0x40) != 0) {
            v5 |= 0x180000;
        }
        else if((v3 & 0x180000) == 0) {
            v5 |= (composer1.changedInstance(function21) ? 0x100000 : 0x80000);
        }
        if((v5 & 0x92493) != 0x92492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v3 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v4 & 2) == 0 ? modifier0 : Modifier.Companion;
                if((v4 & 4) != 0) {
                    v6 = TabRowDefaults.INSTANCE.getPrimaryContainerColor(composer1, 6);
                    v5 &= -897;
                }
                if((v4 & 8) == 0) {
                    v10 = v8;
                }
                else {
                    v10 = TabRowDefaults.INSTANCE.getPrimaryContentColor(composer1, 6);
                    v5 &= 0xFFFFE3FF;
                }
                function32 = (v4 & 16) == 0 ? function31 : ComposableLambdaKt.rememberComposableLambda(-2021049253, true, new pn(v), composer1, 54);
                function23 = (v4 & 0x20) == 0 ? function22 : ComposableSingletons.TabRowKt.INSTANCE.getLambda-1$material3_release();
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
                v10 = v8;
                function32 = function31;
                function23 = function22;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x8FA86DAC, v5, -1, "androidx.compose.material3.PrimaryTabRow (TabRow.kt:164)");
            }
            TabRowKt.c(modifier2, v6, v10, function32, function23, function21, composer1, v5 >> 3 & 0x7FFFE);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
            function31 = function32;
            function22 = function23;
            v8 = v10;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new qn(v, modifier1, v6, v8, function31, function22, function21, v3, v4, 0));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_][_]]")
    public static final void ScrollableTabRow-sKfQg0A(int v, @Nullable Modifier modifier0, long v1, long v2, float f, @Nullable Function3 function30, @Nullable Function2 function20, @NotNull Function2 function21, @Nullable Composer composer0, int v3, int v4) {
        Function2 function22;
        Function3 function32;
        float f2;
        long v11;
        long v10;
        Modifier modifier1;
        Function2 function23;
        Modifier modifier2;
        Function3 function31;
        float f1;
        int v9;
        long v8;
        int v7;
        long v6;
        int v5;
        Composer composer1 = composer0.startRestartGroup(-497821003);
        if((v4 & 1) == 0) {
            v5 = (v3 & 6) == 0 ? (composer1.changed(v) ? 4 : 2) | v3 : v3;
        }
        else {
            v5 = v3 | 6;
        }
        if((v4 & 2) != 0) {
            v5 |= 0x30;
        }
        else if((v3 & 0x30) == 0) {
            v5 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v3 & 0x180) == 0) {
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
        if((v3 & 0xC00) == 0) {
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
        else if((v3 & 0x6000) == 0) {
            f1 = f;
            v5 |= (composer1.changed(f1) ? 0x4000 : 0x2000);
        }
        else {
            f1 = f;
        }
        if((v4 & 0x20) != 0) {
            v5 |= 0x30000;
            function31 = function30;
        }
        else if((0x30000 & v3) == 0) {
            function31 = function30;
            v5 |= (composer1.changedInstance(function31) ? 0x20000 : 0x10000);
        }
        else {
            function31 = function30;
        }
        if((v4 & 0x40) != 0) {
            v5 |= 0x180000;
        }
        else if((v3 & 0x180000) == 0) {
            v5 |= (composer1.changedInstance(function20) ? 0x100000 : 0x80000);
        }
        if((v4 & 0x80) != 0) {
            v5 |= 0xC00000;
        }
        else if((v3 & 0xC00000) == 0) {
            v5 |= (composer1.changedInstance(function21) ? 0x800000 : 0x400000);
        }
        if((v5 & 0x492493) != 4793490 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v3 & 1) == 0 || composer1.getDefaultsInvalid()) {
                Modifier modifier3 = (v4 & 2) == 0 ? modifier0 : Modifier.Companion;
                if((v4 & 4) != 0) {
                    v6 = TabRowDefaults.INSTANCE.getPrimaryContainerColor(composer1, 6);
                    v5 &= -897;
                }
                if((v4 & 8) != 0) {
                    v5 &= 0xFFFFE3FF;
                    v8 = TabRowDefaults.INSTANCE.getPrimaryContentColor(composer1, 6);
                }
                if((v4 & 16) != 0) {
                    f1 = 52.0f;
                }
                if((v4 & 0x20) != 0) {
                    function31 = ComposableLambdaKt.rememberComposableLambda(0xC9894D3A, true, new rn(v), composer1, 54);
                }
                if((v4 & 0x40) == 0) {
                    function23 = function20;
                    modifier2 = modifier3;
                }
                else {
                    modifier2 = modifier3;
                    function23 = ComposableSingletons.TabRowKt.INSTANCE.getLambda-6$material3_release();
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
                function23 = function20;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-497821003, v5, -1, "androidx.compose.material3.ScrollableTabRow (TabRow.kt:506)");
            }
            TabRowKt.b(v, function31, modifier2, v6, v8, f1, function23, function21, ScrollKt.rememberScrollState(0, composer1, 0, 1), composer1, v5 & 14 | v5 >> 12 & 0x70 | v5 << 3 & 0x380 | v5 << 3 & 0x1C00 | 0xE000 & v5 << 3 | v5 << 3 & 0x70000 | 0x380000 & v5 | v5 & 0x1C00000, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
            v10 = v6;
            v11 = v8;
            f2 = f1;
            function32 = function31;
            function22 = function23;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            v10 = v6;
            v11 = v8;
            f2 = f1;
            function32 = function31;
            function22 = function20;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new sn(v, modifier1, v10, v11, f2, function32, function22, function21, v3, v4, 0));
        }
    }

    @ExperimentalMaterial3Api
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_][_]]")
    public static final void SecondaryScrollableTabRow-qhFBPw4(int v, @Nullable Modifier modifier0, @Nullable ScrollState scrollState0, long v1, long v2, float f, @Nullable Function3 function30, @Nullable Function2 function20, @NotNull Function2 function21, @Nullable Composer composer0, int v3, int v4) {
        Function2 function22;
        float f1;
        long v11;
        long v10;
        Function3 function31;
        ScrollState scrollState1;
        Modifier modifier1;
        float f2;
        long v13;
        long v12;
        Function2 function23;
        Function3 function32;
        ScrollState scrollState2;
        Modifier modifier2;
        Function3 function33;
        int v14;
        ScrollState scrollState3;
        int v9;
        long v8;
        int v7;
        long v6;
        int v5;
        Composer composer1 = composer0.startRestartGroup(1821940917);
        if((v4 & 1) == 0) {
            v5 = (v3 & 6) == 0 ? (composer1.changed(v) ? 4 : 2) | v3 : v3;
        }
        else {
            v5 = v3 | 6;
        }
        if((v4 & 2) != 0) {
            v5 |= 0x30;
        }
        else if((v3 & 0x30) == 0) {
            v5 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v3 & 0x180) == 0) {
            v5 |= ((v4 & 4) != 0 || !composer1.changed(scrollState0) ? 0x80 : 0x100);
        }
        if((v3 & 0xC00) == 0) {
            if((v4 & 8) == 0) {
                v6 = v1;
                v7 = composer1.changed(v6) ? 0x800 : 0x400;
            }
            else {
                v6 = v1;
                v7 = 0x400;
            }
            v5 |= v7;
        }
        else {
            v6 = v1;
        }
        if((v3 & 0x6000) == 0) {
            if((v4 & 16) == 0) {
                v8 = v2;
                v9 = composer1.changed(v8) ? 0x4000 : 0x2000;
            }
            else {
                v8 = v2;
                v9 = 0x2000;
            }
            v5 |= v9;
        }
        else {
            v8 = v2;
        }
        if((v4 & 0x20) != 0) {
            v5 |= 0x30000;
        }
        else if((0x30000 & v3) == 0) {
            v5 |= (composer1.changed(f) ? 0x20000 : 0x10000);
        }
        if((v4 & 0x40) != 0) {
            v5 |= 0x180000;
        }
        else if((v3 & 0x180000) == 0) {
            v5 |= (composer1.changedInstance(function30) ? 0x100000 : 0x80000);
        }
        if((v4 & 0x80) != 0) {
            v5 |= 0xC00000;
        }
        else if((v3 & 0xC00000) == 0) {
            v5 |= (composer1.changedInstance(function20) ? 0x800000 : 0x400000);
        }
        if((v4 & 0x100) != 0) {
            v5 |= 0x6000000;
        }
        else if((v3 & 0x6000000) == 0) {
            v5 |= (composer1.changedInstance(function21) ? 0x4000000 : 0x2000000);
        }
        if((v5 & 0x2492493) != 0x2492492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v3 & 1) == 0 || composer1.getDefaultsInvalid()) {
                Modifier modifier3 = (v4 & 2) == 0 ? modifier0 : Modifier.Companion;
                if((v4 & 4) == 0) {
                    scrollState3 = scrollState0;
                }
                else {
                    scrollState3 = ScrollKt.rememberScrollState(0, composer1, 0, 1);
                    v5 &= -897;
                }
                if((v4 & 8) != 0) {
                    v6 = TabRowDefaults.INSTANCE.getSecondaryContainerColor(composer1, 6);
                    v5 &= 0xFFFFE3FF;
                }
                if((v4 & 16) != 0) {
                    v8 = TabRowDefaults.INSTANCE.getSecondaryContentColor(composer1, 6);
                    v5 &= 0xFFFF1FFF;
                }
                if((v4 & 0x40) == 0) {
                    v14 = v5;
                    function33 = function30;
                }
                else {
                    v14 = v5;
                    function33 = ComposableLambdaKt.rememberComposableLambda(1535842470, true, new zn(v), composer1, 54);
                }
                function23 = (v4 & 0x80) == 0 ? function20 : ComposableSingletons.TabRowKt.INSTANCE.getLambda-5$material3_release();
                function32 = function33;
                modifier2 = modifier3;
                scrollState2 = scrollState3;
                f2 = (v4 & 0x20) == 0 ? f : 52.0f;
                v12 = v6;
                v13 = v8;
                v5 = v14;
            }
            else {
                composer1.skipToGroupEnd();
                if((v4 & 4) != 0) {
                    v5 &= -897;
                }
                if((v4 & 8) != 0) {
                    v5 &= 0xFFFFE3FF;
                }
                if((v4 & 16) != 0) {
                    v5 &= 0xFFFF1FFF;
                }
                modifier2 = modifier0;
                scrollState2 = scrollState0;
                function32 = function30;
                function23 = function20;
                v12 = v6;
                v13 = v8;
                f2 = f;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1821940917, v5, -1, "androidx.compose.material3.SecondaryScrollableTabRow (TabRow.kt:439)");
            }
            TabRowKt.a(v, modifier2, v12, v13, f2, scrollState2, function32, function23, function21, composer1, v5 & 0x7E | v5 >> 3 & 0x380 | v5 >> 3 & 0x1C00 | v5 >> 3 & 0xE000 | v5 << 9 & 0x70000 | 0x380000 & v5 | 0x1C00000 & v5 | v5 & 0xE000000);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
            scrollState1 = scrollState2;
            v10 = v12;
            v11 = v13;
            f1 = f2;
            function31 = function32;
            function22 = function23;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            scrollState1 = scrollState0;
            function31 = function30;
            v10 = v6;
            v11 = v8;
            f1 = f;
            function22 = function20;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new on(v, modifier1, scrollState1, v10, v11, f1, function31, function22, function21, v3, v4, 2));
        }
    }

    @ExperimentalMaterial3Api
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_][_]]")
    public static final void SecondaryTabRow-pAZo6Ak(int v, @Nullable Modifier modifier0, long v1, long v2, @Nullable Function3 function30, @Nullable Function2 function20, @NotNull Function2 function21, @Nullable Composer composer0, int v3, int v4) {
        Modifier modifier1;
        Function2 function23;
        Function3 function32;
        long v10;
        Modifier modifier2;
        Function2 function22;
        Function3 function31;
        int v9;
        long v8;
        int v7;
        long v6;
        int v5;
        Composer composer1 = composer0.startRestartGroup(-1909540706);
        if((v4 & 1) == 0) {
            v5 = (v3 & 6) == 0 ? (composer1.changed(v) ? 4 : 2) | v3 : v3;
        }
        else {
            v5 = v3 | 6;
        }
        if((v4 & 2) != 0) {
            v5 |= 0x30;
        }
        else if((v3 & 0x30) == 0) {
            v5 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v3 & 0x180) == 0) {
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
        if((v3 & 0xC00) == 0) {
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
            function31 = function30;
        }
        else if((v3 & 0x6000) == 0) {
            function31 = function30;
            v5 |= (composer1.changedInstance(function31) ? 0x4000 : 0x2000);
        }
        else {
            function31 = function30;
        }
        if((v4 & 0x20) != 0) {
            v5 |= 0x30000;
            function22 = function20;
        }
        else if((0x30000 & v3) == 0) {
            function22 = function20;
            v5 |= (composer1.changedInstance(function22) ? 0x20000 : 0x10000);
        }
        else {
            function22 = function20;
        }
        if((v4 & 0x40) != 0) {
            v5 |= 0x180000;
        }
        else if((v3 & 0x180000) == 0) {
            v5 |= (composer1.changedInstance(function21) ? 0x100000 : 0x80000);
        }
        if((v5 & 0x92493) != 0x92492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v3 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v4 & 2) == 0 ? modifier0 : Modifier.Companion;
                if((v4 & 4) != 0) {
                    v6 = TabRowDefaults.INSTANCE.getSecondaryContainerColor(composer1, 6);
                    v5 &= -897;
                }
                if((v4 & 8) == 0) {
                    v10 = v8;
                }
                else {
                    v10 = TabRowDefaults.INSTANCE.getSecondaryContentColor(composer1, 6);
                    v5 &= 0xFFFFE3FF;
                }
                function32 = (v4 & 16) == 0 ? function31 : ComposableLambdaKt.rememberComposableLambda(0x1116978D, true, new ao(v), composer1, 54);
                function23 = (v4 & 0x20) == 0 ? function22 : ComposableSingletons.TabRowKt.INSTANCE.getLambda-2$material3_release();
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
                v10 = v8;
                function32 = function31;
                function23 = function22;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1909540706, v5, -1, "androidx.compose.material3.SecondaryTabRow (TabRow.kt:218)");
            }
            TabRowKt.c(modifier2, v6, v10, function32, function23, function21, composer1, v5 >> 3 & 0x7FFFE);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
            function31 = function32;
            function22 = function23;
            v8 = v10;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new qn(v, modifier1, v6, v8, function31, function22, function21, v3, v4, 1));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_][_]]")
    public static final void TabRow-pAZo6Ak(int v, @Nullable Modifier modifier0, long v1, long v2, @Nullable Function3 function30, @Nullable Function2 function20, @NotNull Function2 function21, @Nullable Composer composer0, int v3, int v4) {
        Modifier modifier1;
        Function2 function23;
        Function3 function32;
        long v10;
        Modifier modifier2;
        Function2 function22;
        Function3 function31;
        int v9;
        long v8;
        int v7;
        long v6;
        int v5;
        Composer composer1 = composer0.startRestartGroup(0xB885FCA6);
        if((v4 & 1) == 0) {
            v5 = (v3 & 6) == 0 ? (composer1.changed(v) ? 4 : 2) | v3 : v3;
        }
        else {
            v5 = v3 | 6;
        }
        if((v4 & 2) != 0) {
            v5 |= 0x30;
        }
        else if((v3 & 0x30) == 0) {
            v5 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v3 & 0x180) == 0) {
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
        if((v3 & 0xC00) == 0) {
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
            function31 = function30;
        }
        else if((v3 & 0x6000) == 0) {
            function31 = function30;
            v5 |= (composer1.changedInstance(function31) ? 0x4000 : 0x2000);
        }
        else {
            function31 = function30;
        }
        if((v4 & 0x20) != 0) {
            v5 |= 0x30000;
            function22 = function20;
        }
        else if((0x30000 & v3) == 0) {
            function22 = function20;
            v5 |= (composer1.changedInstance(function22) ? 0x20000 : 0x10000);
        }
        else {
            function22 = function20;
        }
        if((v4 & 0x40) != 0) {
            v5 |= 0x180000;
        }
        else if((v3 & 0x180000) == 0) {
            v5 |= (composer1.changedInstance(function21) ? 0x100000 : 0x80000);
        }
        if((v5 & 0x92493) != 0x92492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v3 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v4 & 2) == 0 ? modifier0 : Modifier.Companion;
                if((v4 & 4) != 0) {
                    v6 = TabRowDefaults.INSTANCE.getPrimaryContainerColor(composer1, 6);
                    v5 &= -897;
                }
                if((v4 & 8) == 0) {
                    v10 = v8;
                }
                else {
                    v10 = TabRowDefaults.INSTANCE.getPrimaryContentColor(composer1, 6);
                    v5 &= 0xFFFFE3FF;
                }
                function32 = (v4 & 16) == 0 ? function31 : ComposableLambdaKt.rememberComposableLambda(0x85AFD601, true, new bo(v), composer1, 54);
                function23 = (v4 & 0x20) == 0 ? function22 : ComposableSingletons.TabRowKt.INSTANCE.getLambda-3$material3_release();
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
                v10 = v8;
                function32 = function31;
                function23 = function22;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xB885FCA6, v5, -1, "androidx.compose.material3.TabRow (TabRow.kt:314)");
            }
            TabRowKt.d(modifier2, v6, v10, function32, function23, function21, composer1, v5 >> 3 & 0x7FFFE);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
            function31 = function32;
            function22 = function23;
            v8 = v10;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new qn(v, modifier1, v6, v8, function31, function22, function21, v3, v4, 2));
        }
    }

    public static final void a(int v, Modifier modifier0, long v1, long v2, float f, ScrollState scrollState0, Function3 function30, Function2 function20, Function2 function21, Composer composer0, int v3) {
        Composer composer1 = composer0.startRestartGroup(0xA0FB5A7D);
        int v4 = (v3 & 6) == 0 ? (composer1.changed(v) ? 4 : 2) | v3 : v3;
        if((v3 & 0x30) == 0) {
            v4 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v3 & 0x180) == 0) {
            v4 |= (composer1.changed(v1) ? 0x100 : 0x80);
        }
        if((v3 & 0xC00) == 0) {
            v4 |= (composer1.changed(v2) ? 0x800 : 0x400);
        }
        if((v3 & 0x6000) == 0) {
            v4 |= (composer1.changed(f) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v3) == 0) {
            v4 |= (composer1.changed(scrollState0) ? 0x20000 : 0x10000);
        }
        if((0x180000 & v3) == 0) {
            v4 |= (composer1.changedInstance(function30) ? 0x100000 : 0x80000);
        }
        if((v3 & 0xC00000) == 0) {
            v4 |= (composer1.changedInstance(function20) ? 0x800000 : 0x400000);
        }
        if((0x6000000 & v3) == 0) {
            v4 |= (composer1.changedInstance(function21) ? 0x4000000 : 0x2000000);
        }
        if((v4 & 0x2492493) != 0x2492492 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xA0FB5A7D, v4, -1, "androidx.compose.material3.ScrollableTabRowImpl (TabRow.kt:698)");
            }
            SurfaceKt.Surface-T9BRK9s(ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(modifier0, 0.0f, 1, null), Alignment.Companion.getCenterStart(), false, 2, null), scrollState0, false, null, false, 14, null))), null, v1, v2, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1556158104, true, new vn(f, v, scrollState0, function21, function20, function30), composer1, 54), composer1, v4 & 0x380 | 0xC00000 | v4 & 0x1C00, 0x72);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new z(v, modifier0, v1, v2, f, scrollState0, function30, function20, function21, v3));
        }
    }

    public static final float access$getScrollableTabRowMinimumTabWidth$p() [...] // 潜在的解密器

    public static final void b(int v, Function3 function30, Modifier modifier0, long v1, long v2, float f, Function2 function20, Function2 function21, ScrollState scrollState0, Composer composer0, int v3, int v4) {
        Function2 function22;
        Function2 function23;
        float f1;
        int v9;
        long v8;
        int v7;
        long v6;
        Modifier modifier1;
        int v5;
        Composer composer1 = composer0.startRestartGroup(0xC70D99E5);
        if((v4 & 1) == 0) {
            v5 = (v3 & 6) == 0 ? (composer1.changed(v) ? 4 : 2) | v3 : v3;
        }
        else {
            v5 = v3 | 6;
        }
        if((v4 & 2) != 0) {
            v5 |= 0x30;
        }
        else if((v3 & 0x30) == 0) {
            v5 |= (composer1.changedInstance(function30) ? 0x20 : 16);
        }
        if((v4 & 4) != 0) {
            v5 |= 0x180;
            modifier1 = modifier0;
        }
        else if((v3 & 0x180) == 0) {
            modifier1 = modifier0;
            v5 |= (composer1.changed(modifier1) ? 0x100 : 0x80);
        }
        else {
            modifier1 = modifier0;
        }
        if((v3 & 0xC00) == 0) {
            if((v4 & 8) == 0) {
                v6 = v1;
                v7 = composer1.changed(v6) ? 0x800 : 0x400;
            }
            else {
                v6 = v1;
                v7 = 0x400;
            }
            v5 |= v7;
        }
        else {
            v6 = v1;
        }
        if((v3 & 0x6000) == 0) {
            if((v4 & 16) == 0) {
                v8 = v2;
                v9 = composer1.changed(v8) ? 0x4000 : 0x2000;
            }
            else {
                v8 = v2;
                v9 = 0x2000;
            }
            v5 |= v9;
        }
        else {
            v8 = v2;
        }
        if((v4 & 0x20) != 0) {
            v5 |= 0x30000;
            f1 = f;
        }
        else if((0x30000 & v3) == 0) {
            f1 = f;
            v5 |= (composer1.changed(f1) ? 0x20000 : 0x10000);
        }
        else {
            f1 = f;
        }
        if((v4 & 0x40) != 0) {
            v5 |= 0x180000;
        }
        else if((v3 & 0x180000) == 0) {
            v5 |= (composer1.changedInstance(function20) ? 0x100000 : 0x80000);
        }
        if((v4 & 0x80) != 0) {
            v5 |= 0xC00000;
        }
        else if((v3 & 0xC00000) == 0) {
            v5 |= (composer1.changedInstance(function21) ? 0x800000 : 0x400000);
        }
        if((v4 & 0x100) != 0) {
            v5 |= 0x6000000;
        }
        else if((v3 & 0x6000000) == 0) {
            v5 |= (composer1.changed(scrollState0) ? 0x4000000 : 0x2000000);
        }
        if((v5 & 0x2492493) != 0x2492492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v3 & 1) == 0 || composer1.getDefaultsInvalid()) {
                if((v4 & 4) != 0) {
                    modifier1 = Modifier.Companion;
                }
                if((v4 & 8) != 0) {
                    v6 = TabRowDefaults.INSTANCE.getPrimaryContainerColor(composer1, 6);
                    v5 &= 0xFFFFE3FF;
                }
                if((v4 & 16) != 0) {
                    v8 = TabRowDefaults.INSTANCE.getPrimaryContentColor(composer1, 6);
                    v5 &= 0xFFFF1FFF;
                }
                if((v4 & 0x20) != 0) {
                    f1 = 52.0f;
                }
                function23 = (v4 & 0x40) == 0 ? function20 : ComposableSingletons.TabRowKt.INSTANCE.getLambda-7$material3_release();
            }
            else {
                composer1.skipToGroupEnd();
                if((v4 & 8) != 0) {
                    v5 &= 0xFFFFE3FF;
                }
                if((v4 & 16) != 0) {
                    v5 &= 0xFFFF1FFF;
                }
                function23 = function20;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xC70D99E5, v5, -1, "androidx.compose.material3.ScrollableTabRowWithSubcomposeImpl (TabRow.kt:1014)");
            }
            SurfaceKt.Surface-T9BRK9s(modifier1, null, v6, v8, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(0xA23E8AC0, true, new yn(f1, v, scrollState0, function21, function23, function30), composer1, 54), composer1, v5 >> 6 & 14 | 0xC00000 | v5 >> 3 & 0x380 | v5 >> 3 & 0x1C00, 0x72);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function22 = function23;
        }
        else {
            composer1.skipToGroupEnd();
            function22 = function20;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new on(v, function30, modifier1, v6, v8, f1, function22, function21, scrollState0, v3, v4));
        }
    }

    public static final void c(Modifier modifier0, long v, long v1, Function3 function30, Function2 function20, Function2 function21, Composer composer0, int v2) {
        Composer composer1 = composer0.startRestartGroup(0x68C02F03);
        int v3 = (v2 & 6) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v2 : v2;
        if((v2 & 0x30) == 0) {
            v3 |= (composer1.changed(v) ? 0x20 : 16);
        }
        if((v2 & 0x180) == 0) {
            v3 |= (composer1.changed(v1) ? 0x100 : 0x80);
        }
        if((v2 & 0xC00) == 0) {
            v3 |= (composer1.changedInstance(function30) ? 0x800 : 0x400);
        }
        if((v2 & 0x6000) == 0) {
            v3 |= (composer1.changedInstance(function20) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v2) == 0) {
            v3 |= (composer1.changedInstance(function21) ? 0x20000 : 0x10000);
        }
        if((74899 & v3) != 74898 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x68C02F03, v3, -1, "androidx.compose.material3.TabRowImpl (TabRow.kt:570)");
            }
            SurfaceKt.Surface-T9BRK9s(SelectableGroupKt.selectableGroup(modifier0), null, v, v1, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-65106680, true, new fo(function21, function20, function30), composer1, 54), composer1, v3 << 3 & 0x380 | 0xC00000 | v3 << 3 & 0x1C00, 0x72);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new go(modifier0, v, v1, function30, function20, function21, v2, 0));
        }
    }

    public static final void d(Modifier modifier0, long v, long v1, Function3 function30, Function2 function20, Function2 function21, Composer composer0, int v2) {
        Composer composer1 = composer0.startRestartGroup(0xF668E09B);
        int v3 = (v2 & 6) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v2 : v2;
        if((v2 & 0x30) == 0) {
            v3 |= (composer1.changed(v) ? 0x20 : 16);
        }
        if((v2 & 0x180) == 0) {
            v3 |= (composer1.changed(v1) ? 0x100 : 0x80);
        }
        if((v2 & 0xC00) == 0) {
            v3 |= (composer1.changedInstance(function30) ? 0x800 : 0x400);
        }
        if((v2 & 0x6000) == 0) {
            v3 |= (composer1.changedInstance(function20) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v2) == 0) {
            v3 |= (composer1.changedInstance(function21) ? 0x20000 : 0x10000);
        }
        if((74899 & v3) != 74898 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xF668E09B, v3, -1, "androidx.compose.material3.TabRowWithSubcomposeImpl (TabRow.kt:942)");
            }
            SurfaceKt.Surface-T9BRK9s(SelectableGroupKt.selectableGroup(modifier0), null, v, v1, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(0x9F93D1E0, true, new ko(function21, function20, function30), composer1, 54), composer1, v3 << 3 & 0x380 | 0xC00000 | v3 << 3 & 0x1C00, 0x72);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new go(modifier0, v, v1, function30, function20, function21, v2, 1));
        }
    }
}

