package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.material3.le;
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
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.room.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.d1;
import p0.e1;
import p0.f1;
import p0.g1;
import p0.h1;
import p0.i1;
import p0.j1;
import p0.k1;
import p0.l1;
import p0.m1;
import p0.n1;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\u001A`\u0010\u0011\u001A\u00020\u000B2\u0006\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00042\b\b\u0002\u0010\b\u001A\u00020\u00072\u001C\u0010\u000E\u001A\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000B0\t¢\u0006\u0002\b\f¢\u0006\u0002\b\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000F\u0010\u0010\u001AX\u0010\u0011\u001A\u00020\u000B2\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00042\b\b\u0002\u0010\b\u001A\u00020\u00072\u001C\u0010\u000E\u001A\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000B0\t¢\u0006\u0002\b\f¢\u0006\u0002\b\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001A\u0092\u0001\u0010\"\u001A\u00020\u000B*\u00020\n2\u0006\u0010\u0015\u001A\u00020\u00142\f\u0010\u0017\u001A\b\u0012\u0004\u0012\u00020\u000B0\u00162\u0011\u0010\u0018\u001A\r\u0012\u0004\u0012\u00020\u000B0\u0016¢\u0006\u0002\b\f2\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0019\u001A\u00020\u00142\u0015\b\u0002\u0010\u001A\u001A\u000F\u0012\u0004\u0012\u00020\u000B\u0018\u00010\u0016¢\u0006\u0002\b\f2\b\b\u0002\u0010\u001B\u001A\u00020\u00142\b\b\u0002\u0010\u001D\u001A\u00020\u001C2\b\b\u0002\u0010\u001E\u001A\u00020\u00042\b\b\u0002\u0010\u001F\u001A\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b \u0010!\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006%²\u0006\f\u0010$\u001A\u00020#8\nX\u008A\u0084\u0002"}, d2 = {"Landroidx/compose/foundation/layout/WindowInsets;", "windowInsets", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "contentColor", "Landroidx/compose/ui/unit/Dp;", "elevation", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "content", "BottomNavigation-_UMDTes", "(Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/ui/Modifier;JJFLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "BottomNavigation", "BottomNavigation-PEIptTM", "(Landroidx/compose/ui/Modifier;JJFLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "", "selected", "Lkotlin/Function0;", "onClick", "icon", "enabled", "label", "alwaysShowLabel", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "selectedContentColor", "unselectedContentColor", "BottomNavigationItem-jY6E1Zs", "(Landroidx/compose/foundation/layout/RowScope;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;JJLandroidx/compose/runtime/Composer;III)V", "BottomNavigationItem", "", "animationProgress", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBottomNavigation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomNavigation.kt\nandroidx/compose/material/BottomNavigationKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,461:1\n25#2:462\n456#2,8:486\n464#2,3:500\n467#2,3:504\n456#2,8:529\n464#2,3:543\n456#2,8:563\n464#2,3:577\n467#2,3:581\n456#2,8:603\n464#2,3:617\n467#2,3:621\n467#2,3:626\n1116#3,6:463\n1116#3,6:509\n74#4:469\n69#5,5:470\n74#5:503\n78#5:508\n68#5,6:546\n74#5:580\n78#5:585\n68#5,6:586\n74#5:620\n78#5:625\n79#6,11:475\n92#6:507\n76#6,14:515\n79#6,11:552\n92#6:584\n79#6,11:592\n92#6:624\n92#6:629\n3737#7,6:494\n3737#7,6:537\n3737#7,6:571\n3737#7,6:611\n81#8:630\n154#9:631\n154#9:632\n154#9:633\n154#9:634\n*S KotlinDebug\n*F\n+ 1 BottomNavigation.kt\nandroidx/compose/material/BottomNavigationKt\n*L\n208#1:462\n223#1:486,8\n223#1:500,3\n223#1:504,3\n321#1:529,8\n321#1:543,3\n323#1:563,8\n323#1:577,3\n323#1:581,3\n325#1:603,8\n325#1:617,3\n325#1:621,3\n321#1:626,3\n208#1:463,6\n333#1:509,6\n209#1:469\n223#1:470,5\n223#1:503\n223#1:508\n323#1:546,6\n323#1:580\n323#1:585\n325#1:586,6\n325#1:620\n325#1:625\n223#1:475,11\n223#1:507\n321#1:515,14\n323#1:552,11\n323#1:584\n325#1:592,11\n325#1:624\n321#1:629\n223#1:494,6\n321#1:537,6\n323#1:571,6\n325#1:611,6\n289#1:630\n447#1:631\n452#1:632\n458#1:633\n460#1:634\n*E\n"})
public final class BottomNavigationKt {
    public static final TweenSpec a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final WindowInsets e;

    static {
        BottomNavigationKt.a = new TweenSpec(300, 0, EasingKt.getFastOutSlowInEasing(), 2, null);
        BottomNavigationKt.b = 56.0f;
        BottomNavigationKt.c = 12.0f;
        BottomNavigationKt.d = 12.0f;
        BottomNavigationKt.e = WindowInsetsKt.WindowInsets-a9UjIt4(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void BottomNavigation-PEIptTM(@Nullable Modifier modifier0, long v, long v1, float f, @NotNull Function3 function30, @Nullable Composer composer0, int v2, int v3) {
        float f1;
        Modifier modifier1;
        long v7;
        int v6;
        long v5;
        int v4;
        Composer composer1 = composer0.startRestartGroup(0x1B357A16);
        if((v3 & 1) == 0) {
            v4 = (v2 & 14) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v2 : v2;
        }
        else {
            v4 = v2 | 6;
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
            v7 = v1;
            v4 |= ((v3 & 4) != 0 || !composer1.changed(v7) ? 0x80 : 0x100);
        }
        else {
            v7 = v1;
        }
        if((v3 & 8) != 0) {
            v4 |= 0xC00;
        }
        else if((v2 & 0x1C00) == 0) {
            v4 |= (composer1.changed(f) ? 0x800 : 0x400);
        }
        if((v3 & 16) != 0) {
            v4 |= 0x6000;
        }
        else if((v2 & 0xE000) == 0) {
            v4 |= (composer1.changedInstance(function30) ? 0x4000 : 0x2000);
        }
        if((0xB6DB & v4) != 9362 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v2 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier1 = (v3 & 1) == 0 ? modifier0 : Modifier.Companion;
                if((v3 & 2) != 0) {
                    v5 = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composer1, 6));
                    v4 &= 0xFFFFFF8F;
                }
                if((v3 & 4) != 0) {
                    v7 = ColorsKt.contentColorFor-ek8zF_U(v5, composer1, v4 >> 3 & 14);
                    v4 &= -897;
                }
                f1 = (v3 & 8) == 0 ? f : 8.0f;
            }
            else {
                composer1.skipToGroupEnd();
                if((v3 & 2) != 0) {
                    v4 &= 0xFFFFFF8F;
                }
                if((v3 & 4) != 0) {
                    v4 &= -897;
                }
                modifier1 = modifier0;
                f1 = f;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x1B357A16, v4, -1, "androidx.compose.material.BottomNavigation (BottomNavigation.kt:162)");
            }
            BottomNavigationKt.BottomNavigation-_UMDTes(BottomNavigationKt.e, modifier1, v5, v7, f1, function30, composer1, v4 << 3 & 0x70 | 6 | v4 << 3 & 0x380 | v4 << 3 & 0x1C00 | v4 << 3 & 0xE000 | v4 << 3 & 0x70000, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            f1 = f;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new e1(modifier1, v5, v7, f1, function30, v2, v3));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void BottomNavigation-_UMDTes(@NotNull WindowInsets windowInsets0, @Nullable Modifier modifier0, long v, long v1, float f, @NotNull Function3 function30, @Nullable Composer composer0, int v2, int v3) {
        float f1;
        long v9;
        float f2;
        int v8;
        long v7;
        int v6;
        long v5;
        Modifier modifier1;
        int v4;
        Composer composer1 = composer0.startRestartGroup(0xB3CD0F66);
        if((v3 & 1) == 0) {
            v4 = (v2 & 14) == 0 ? (composer1.changed(windowInsets0) ? 4 : 2) | v2 : v2;
        }
        else {
            v4 = v2 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
            modifier1 = modifier0;
        }
        else if((v2 & 0x70) == 0) {
            modifier1 = modifier0;
            v4 |= (composer1.changed(modifier1) ? 0x20 : 16);
        }
        else {
            modifier1 = modifier0;
        }
        if((v2 & 0x380) == 0) {
            if((v3 & 4) == 0) {
                v5 = v;
                v6 = composer1.changed(v5) ? 0x100 : 0x80;
            }
            else {
                v5 = v;
                v6 = 0x80;
            }
            v4 |= v6;
        }
        else {
            v5 = v;
        }
        if((v2 & 0x1C00) == 0) {
            if((v3 & 8) == 0) {
                v7 = v1;
                v8 = composer1.changed(v7) ? 0x800 : 0x400;
            }
            else {
                v7 = v1;
                v8 = 0x400;
            }
            v4 |= v8;
        }
        else {
            v7 = v1;
        }
        if((v3 & 16) != 0) {
            v4 |= 0x6000;
        }
        else if((0xE000 & v2) == 0) {
            v4 |= (composer1.changed(f) ? 0x4000 : 0x2000);
        }
        if((v3 & 0x20) != 0) {
            v4 |= 0x30000;
        }
        else if((v2 & 0x70000) == 0) {
            v4 |= (composer1.changedInstance(function30) ? 0x20000 : 0x10000);
        }
        if((0x5B6DB & v4) != 74898 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v2 & 1) == 0 || composer1.getDefaultsInvalid()) {
                if((v3 & 2) != 0) {
                    modifier1 = Modifier.Companion;
                }
                if((v3 & 4) != 0) {
                    v5 = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composer1, 6));
                    v4 &= -897;
                }
                if((v3 & 8) != 0) {
                    v7 = ColorsKt.contentColorFor-ek8zF_U(v5, composer1, v4 >> 6 & 14);
                    v4 &= 0xFFFFE3FF;
                }
                f2 = (v3 & 16) == 0 ? f : 8.0f;
            }
            else {
                composer1.skipToGroupEnd();
                if((v3 & 4) != 0) {
                    v4 &= -897;
                }
                if((v3 & 8) != 0) {
                    v4 &= 0xFFFFE3FF;
                }
                f2 = f;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xB3CD0F66, v4, -1, "androidx.compose.material.BottomNavigation (BottomNavigation.kt:107)");
            }
            SurfaceKt.Surface-F-jzlyU(modifier1, null, v5, v7, null, f2, ComposableLambdaKt.composableLambda(composer1, 0xEAFB52A2, true, new d1(windowInsets0, function30)), composer1, v4 >> 3 & 14 | 0x180000 | v4 & 0x380 | v4 & 0x1C00 | v4 << 3 & 0x70000, 18);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            v9 = v5;
            f1 = f2;
        }
        else {
            composer1.skipToGroupEnd();
            v9 = v5;
            f1 = f;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new le(windowInsets0, modifier1, v9, v7, f1, function30, v2, v3));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void BottomNavigationItem-jY6E1Zs(@NotNull RowScope rowScope0, boolean z, @NotNull Function0 function00, @NotNull Function2 function20, @Nullable Modifier modifier0, boolean z1, @Nullable Function2 function21, boolean z2, @Nullable MutableInteractionSource mutableInteractionSource0, long v, long v1, @Nullable Composer composer0, int v2, int v3, int v4) {
        long v8;
        long v7;
        boolean z5;
        Modifier modifier1;
        MutableInteractionSource mutableInteractionSource1;
        boolean z4;
        Function2 function22;
        boolean z6;
        Modifier modifier2;
        long v10;
        long v9;
        MutableInteractionSource mutableInteractionSource2;
        Function2 function23;
        boolean z3;
        int v5;
        Composer composer1 = composer0.startRestartGroup(0xA828949B);
        if((0x80000000 & v4) == 0) {
            v5 = (v2 & 14) == 0 ? (composer1.changed(rowScope0) ? 4 : 2) | v2 : v2;
        }
        else {
            v5 = v2 | 6;
        }
        if((v4 & 1) != 0) {
            v5 |= 0x30;
        }
        else if((v2 & 0x70) == 0) {
            v5 |= (composer1.changed(z) ? 0x20 : 16);
        }
        if((v4 & 2) != 0) {
            v5 |= 0x180;
        }
        else if((v2 & 0x380) == 0) {
            v5 |= (composer1.changedInstance(function00) ? 0x100 : 0x80);
        }
        if((v4 & 4) != 0) {
            v5 |= 0xC00;
        }
        else if((v2 & 0x1C00) == 0) {
            v5 |= (composer1.changedInstance(function20) ? 0x800 : 0x400);
        }
        if((v4 & 8) != 0) {
            v5 |= 0x6000;
        }
        else if((0xE000 & v2) == 0) {
            v5 |= (composer1.changed(modifier0) ? 0x4000 : 0x2000);
        }
        if((v4 & 16) != 0) {
            v5 |= 0x30000;
            z3 = z1;
        }
        else if((0x70000 & v2) == 0) {
            z3 = z1;
            v5 |= (composer1.changed(z3) ? 0x20000 : 0x10000);
        }
        else {
            z3 = z1;
        }
        if((v4 & 0x20) != 0) {
            v5 |= 0x180000;
        }
        else if((v2 & 0x380000) == 0) {
            v5 |= (composer1.changedInstance(function21) ? 0x100000 : 0x80000);
        }
        if((v4 & 0x40) != 0) {
            v5 |= 0xC00000;
        }
        else if((v2 & 0x1C00000) == 0) {
            v5 |= (composer1.changed(z2) ? 0x800000 : 0x400000);
        }
        if((v4 & 0x80) != 0) {
            v5 |= 0x6000000;
        }
        else if((v2 & 0xE000000) == 0) {
            v5 |= (composer1.changed(mutableInteractionSource0) ? 0x4000000 : 0x2000000);
        }
        if((v2 & 0x70000000) == 0) {
            v5 |= ((v4 & 0x100) != 0 || !composer1.changed(v) ? 0x10000000 : 0x20000000);
        }
        int v6 = (v3 & 14) == 0 ? v3 | ((v4 & 0x200) != 0 || !composer1.changed(v1) ? 2 : 4) : v3;
        if((v5 & 0x5B6DB6DB) != 306783378 || (v6 & 11) != 2 || !composer1.getSkipping()) {
            composer1.startDefaults();
            ComposableLambda composableLambda0 = null;
            if((v2 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v4 & 8) == 0 ? modifier0 : Modifier.Companion;
                if((v4 & 16) != 0) {
                    z3 = true;
                }
                function23 = (v4 & 0x20) == 0 ? function21 : null;
                z6 = (v4 & 0x40) == 0 ? z2 : true;
                if((v4 & 0x80) == 0) {
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
                if((v4 & 0x100) == 0) {
                    v9 = v;
                }
                else {
                    v9 = ((Color)composer1.consume(ContentColorKt.getLocalContentColor())).unbox-impl();
                    v5 &= 0x8FFFFFFF;
                }
                if((v4 & 0x200) == 0) {
                    v10 = v1;
                }
                else {
                    v10 = Color.copy-wmQWz5c$default(v9, ContentAlpha.INSTANCE.getMedium(composer1, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    v6 &= -15;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v4 & 0x100) != 0) {
                    v5 &= 0x8FFFFFFF;
                }
                if((v4 & 0x200) != 0) {
                    v6 &= -15;
                }
                function23 = function21;
                mutableInteractionSource2 = mutableInteractionSource0;
                v9 = v;
                v10 = v1;
                modifier2 = modifier0;
                z6 = z2;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xA828949B, v5, v6, "androidx.compose.material.BottomNavigationItem (BottomNavigation.kt:210)");
            }
            if(function23 != null) {
                composableLambda0 = ComposableLambdaKt.composableLambda(composer1, 0x50111AD5, true, new h1(function23));
            }
            Modifier modifier3 = RowScope.weight$default(rowScope0, SelectableKt.selectable-O2vRcR0(modifier2, z, mutableInteractionSource2, RippleKt.rememberRipple-9IZ8Weo(false, 0.0f, v9, composer1, v5 >> 21 & 0x380 | 6, 2), z3, Role.box-impl(4), function00), 1.0f, false, 2, null);
            composer1.startReplaceableGroup(0x2BB5B5D7);
            MeasurePolicy measurePolicy0 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getCenter(), false, composer1, 6);
            composer1.startReplaceableGroup(-1323940314);
            int v11 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v11)) {
                a.t(v11, composer1, v11, function24);
            }
            function30.invoke(SkippableUpdater.box-impl(composer1), composer1, 0);
            composer1.startReplaceableGroup(2058660585);
            BottomNavigationKt.a(v9, v10, z, ComposableLambdaKt.composableLambda(composer1, -1411872801, true, new f1(z6, function20, composableLambda0, 0)), composer1, v6 << 3 & 0x70 | (v5 >> 27 & 14 | 0xC00) | v5 << 3 & 0x380);
            composer1.endReplaceableGroup();
            composer1.endNode();
            composer1.endReplaceableGroup();
            composer1.endReplaceableGroup();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
            function22 = function23;
            z4 = z6;
            z5 = z3;
            mutableInteractionSource1 = mutableInteractionSource2;
            v7 = v9;
            v8 = v10;
        }
        else {
            composer1.skipToGroupEnd();
            function22 = function21;
            z4 = z2;
            mutableInteractionSource1 = mutableInteractionSource0;
            modifier1 = modifier0;
            z5 = z3;
            v7 = v;
            v8 = v1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new g1(rowScope0, z, function00, function20, modifier1, z5, function22, z4, mutableInteractionSource1, v7, v8, v2, v3, v4));
        }
    }

    public static final void a(long v, long v1, boolean z, Function3 function30, Composer composer0, int v2) {
        Composer composer1 = composer0.startRestartGroup(-985175058);
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
                ComposerKt.traceEventStart(-985175058, v3, -1, "androidx.compose.material.BottomNavigationTransition (BottomNavigation.kt:287)");
            }
            State state0 = AnimateAsStateKt.animateFloatAsState((z ? 1.0f : 0.0f), BottomNavigationKt.a, 0.0f, null, null, composer1, 0x30, 28);
            long v4 = ColorKt.lerp-jxsXWHM(v1, v, ((Number)state0.getValue()).floatValue());
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.box-impl(Color.copy-wmQWz5c$default(v4, 1.0f, 0.0f, 0.0f, 0.0f, 14, null))), ContentAlphaKt.getLocalContentAlpha().provides(Color.getAlpha-impl(v4))}, ComposableLambdaKt.composableLambda(composer1, 0xF7C4DF2E, true, new k1(function30, state0, 0)), composer1, 56);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new l1(v, v1, z, function30, v2, 0));
        }
    }

    public static final void access$BottomNavigationItemBaselineLayout(Function2 function20, Function2 function21, float f, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(-1162995092);
        int v1 = (v & 14) == 0 ? (composer1.changedInstance(function20) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changedInstance(function21) ? 0x20 : 16);
        }
        if((v & 0x380) == 0) {
            v1 |= (composer1.changed(f) ? 0x100 : 0x80);
        }
        if((v1 & 731) != 0x92 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1162995092, v1, -1, "androidx.compose.material.BottomNavigationItemBaselineLayout (BottomNavigation.kt:319)");
            }
            composer1.startReplaceableGroup(-1545736730);
            boolean z = composer1.changedInstance(function21);
            boolean z1 = composer1.changed(f);
            i1 i10 = composer1.rememberedValue();
            if(z || z1 || i10 == Composer.Companion.getEmpty()) {
                i10 = new i1(function21, f, 0);
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
            composer1.startReplaceableGroup(-1198309649);
            if(function21 != null) {
                Modifier modifier1 = PaddingKt.padding-VpY3zN4$default(AlphaKt.alpha(LayoutIdKt.layoutId(modifier$Companion0, "label"), f), BottomNavigationKt.c, 0.0f, 2, null);
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
            scopeUpdateScope0.updateScope(new j1(function20, function21, f, v, 0));
        }
    }

    public static final float access$BottomNavigationTransition_Klgx_Pg$lambda$3(State state0) {
        return ((Number)state0.getValue()).floatValue();
    }

    public static final float access$getBottomNavigationHeight$p() [...] // 潜在的解密器

    public static final MeasureResult access$placeIcon-3p2s80s(MeasureScope measureScope0, Placeable placeable0, long v) {
        int v1 = ConstraintsKt.constrainHeight-K40F9xA(v, measureScope0.roundToPx-0680j_4(BottomNavigationKt.b));
        return MeasureScope.layout$default(measureScope0, placeable0.getWidth(), v1, null, new m1(placeable0, q.A(placeable0, v1, 2)), 4, null);
    }

    public static final MeasureResult access$placeLabelAndIcon-DIyivk0(MeasureScope measureScope0, Placeable placeable0, Placeable placeable1, long v, float f) {
        int v1 = placeable0.get(AlignmentLineKt.getFirstBaseline());
        int v2 = measureScope0.roundToPx-0680j_4(BottomNavigationKt.d) - v1;
        int v3 = placeable0.getHeight() + placeable1.getHeight() + v2;
        int v4 = ConstraintsKt.constrainHeight-K40F9xA(v, Math.max(v3, measureScope0.roundToPx-0680j_4(BottomNavigationKt.b)));
        int v5 = c.coerceAtLeast((v4 - v3) / 2, 0);
        int v6 = q.A(placeable1, v4, 2);
        int v7 = Math.max(placeable0.getWidth(), placeable1.getWidth());
        int v8 = q.d(placeable0, v7, 2);
        int v9 = q.d(placeable1, v7, 2);
        return MeasureScope.layout$default(measureScope0, v7, v4, null, new n1(f, placeable0, v8, placeable1.getHeight() + v5 + v2, zd.c.roundToInt((1.0f - f) * ((float)(v6 - v5))), placeable1, v9, v5), 4, null);
    }
}

