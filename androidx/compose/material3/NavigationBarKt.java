package androidx.compose.material3;

import a5.b;
import aa.l;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.material3.internal.MappedInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
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

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\u001Ab\u0010\u0011\u001A\u00020\u000B2\b\b\u0002\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00072\u001C\u0010\u000E\u001A\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000B0\t¢\u0006\u0002\b\f¢\u0006\u0002\b\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000F\u0010\u0010\u001A\u0087\u0001\u0010\u001E\u001A\u00020\u000B*\u00020\n2\u0006\u0010\u0013\u001A\u00020\u00122\f\u0010\u0015\u001A\b\u0012\u0004\u0012\u00020\u000B0\u00142\u0011\u0010\u0016\u001A\r\u0012\u0004\u0012\u00020\u000B0\u0014¢\u0006\u0002\b\f2\b\b\u0002\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0017\u001A\u00020\u00122\u0015\b\u0002\u0010\u0018\u001A\u000F\u0012\u0004\u0012\u00020\u000B\u0018\u00010\u0014¢\u0006\u0002\b\f2\b\b\u0002\u0010\u0019\u001A\u00020\u00122\b\b\u0002\u0010\u001B\u001A\u00020\u001A2\n\b\u0002\u0010\u001D\u001A\u0004\u0018\u00010\u001CH\u0007¢\u0006\u0004\b\u001E\u0010\u001F\"\u001A\u0010$\u001A\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010!\u001A\u0004\b\"\u0010#\"\u001A\u0010\'\u001A\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010!\u001A\u0004\b&\u0010#\"\u001A\u0010*\u001A\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u0010!\u001A\u0004\b)\u0010#\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006/²\u0006\f\u0010+\u001A\u00020\u00028\nX\u008A\u0084\u0002²\u0006\f\u0010,\u001A\u00020\u00028\nX\u008A\u0084\u0002²\u0006\u000E\u0010.\u001A\u00020-8\n@\nX\u008A\u008E\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "Landroidx/compose/ui/unit/Dp;", "tonalElevation", "Landroidx/compose/foundation/layout/WindowInsets;", "windowInsets", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "content", "NavigationBar-HsRjFd4", "(Landroidx/compose/ui/Modifier;JJFLandroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "NavigationBar", "", "selected", "Lkotlin/Function0;", "onClick", "icon", "enabled", "label", "alwaysShowLabel", "Landroidx/compose/material3/NavigationBarItemColors;", "colors", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "NavigationBarItem", "(Landroidx/compose/foundation/layout/RowScope;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/NavigationBarItemColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "b", "F", "getNavigationBarItemHorizontalPadding", "()F", "NavigationBarItemHorizontalPadding", "c", "getNavigationBarIndicatorToLabelPadding", "NavigationBarIndicatorToLabelPadding", "e", "getIndicatorVerticalPadding", "IndicatorVerticalPadding", "iconColor", "textColor", "", "itemWidth", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nNavigationBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationBar.kt\nandroidx/compose/material3/NavigationBarKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 9 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,718:1\n1223#2,6:719\n1223#2,6:725\n1223#2,6:731\n1223#2,6:770\n1223#2,6:776\n1223#2,6:786\n1223#2,6:863\n71#3,3:737\n74#3:768\n78#3:785\n71#3:823\n68#3,6:824\n74#3:858\n78#3:862\n71#3:870\n68#3,6:871\n74#3:905\n78#3:909\n78#4,6:740\n85#4,4:755\n89#4,2:765\n93#4:784\n78#4:792\n76#4,8:793\n85#4,4:810\n89#4,2:820\n78#4,6:830\n85#4,4:845\n89#4,2:855\n93#4:861\n78#4,6:877\n85#4,4:892\n89#4,2:902\n93#4:908\n93#4:912\n368#5,9:746\n377#5:767\n378#5,2:782\n368#5,9:801\n377#5:822\n368#5,9:836\n377#5:857\n378#5,2:859\n368#5,9:883\n377#5:904\n378#5,2:906\n378#5,2:910\n4032#6,6:759\n4032#6,6:814\n4032#6,6:849\n4032#6,6:896\n77#7:769\n71#8:869\n56#8:918\n71#8:919\n56#8:920\n71#8:921\n75#9:913\n108#9,2:914\n148#10:916\n148#10:917\n148#10:922\n*S KotlinDebug\n*F\n+ 1 NavigationBar.kt\nandroidx/compose/material3/NavigationBarKt\n*L\n184#1:719,6\n216#1:725,6\n230#1:731,6\n250#1:770,6\n282#1:776,6\n533#1:786,6\n527#1:863,6\n218#1:737,3\n218#1:768\n218#1:785\n522#1:823\n522#1:824,6\n522#1:858\n522#1:862\n525#1:870\n525#1:871,6\n525#1:905\n525#1:909\n218#1:740,6\n218#1:755,4\n218#1:765,2\n218#1:784\n518#1:792\n518#1:793,8\n518#1:810,4\n518#1:820,2\n522#1:830,6\n522#1:845,4\n522#1:855,2\n522#1:861\n525#1:877,6\n525#1:892,4\n525#1:902,2\n525#1:908\n518#1:912\n218#1:746,9\n218#1:767\n218#1:782,2\n518#1:801,9\n518#1:822\n522#1:836,9\n522#1:857\n522#1:859,2\n525#1:883,9\n525#1:904\n525#1:906,2\n518#1:910,2\n218#1:759,6\n518#1:814,6\n522#1:849,6\n525#1:896,6\n244#1:769\n528#1:869\n711#1:918\n711#1:919\n715#1:920\n715#1:921\n216#1:913\n216#1:914,2\n705#1:916\n708#1:917\n717#1:922\n*E\n"})
public final class NavigationBarKt {
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;
    public static final float f;

    static {
        NavigationBarKt.a = 0.0f;
        NavigationBarKt.b = 8.0f;
        NavigationBarKt.c = 4.0f;
        NavigationBarKt.d = 0.0f;
        NavigationBarKt.e = 0.0f;
        NavigationBarKt.f = 12.0f;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void NavigationBar-HsRjFd4(@Nullable Modifier modifier0, long v, long v1, float f, @Nullable WindowInsets windowInsets0, @NotNull Function3 function30, @Nullable Composer composer0, int v2, int v3) {
        float f2;
        Modifier modifier1;
        WindowInsets windowInsets2;
        int v8;
        WindowInsets windowInsets1;
        float f1;
        long v7;
        int v6;
        long v5;
        int v4;
        Composer composer1 = composer0.startRestartGroup(0x5F2D444B);
        if((v3 & 1) == 0) {
            v4 = (v2 & 6) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v2 : v2;
        }
        else {
            v4 = v2 | 6;
        }
        if((v2 & 0x30) == 0) {
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
        if((v2 & 0x180) == 0) {
            v7 = v1;
            v4 |= ((v3 & 4) != 0 || !composer1.changed(v7) ? 0x80 : 0x100);
        }
        else {
            v7 = v1;
        }
        if((v3 & 8) != 0) {
            v4 |= 0xC00;
            f1 = f;
        }
        else if((v2 & 0xC00) == 0) {
            f1 = f;
            v4 |= (composer1.changed(f1) ? 0x800 : 0x400);
        }
        else {
            f1 = f;
        }
        if((v2 & 0x6000) == 0) {
            if((v3 & 16) == 0) {
                windowInsets1 = windowInsets0;
                v8 = composer1.changed(windowInsets1) ? 0x4000 : 0x2000;
            }
            else {
                windowInsets1 = windowInsets0;
                v8 = 0x2000;
            }
            v4 |= v8;
        }
        else {
            windowInsets1 = windowInsets0;
        }
        if((v3 & 0x20) != 0) {
            v4 |= 0x30000;
        }
        else if((v2 & 0x30000) == 0) {
            v4 |= (composer1.changedInstance(function30) ? 0x20000 : 0x10000);
        }
        if((74899 & v4) != 74898 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v2 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier1 = (v3 & 1) == 0 ? modifier0 : Modifier.Companion;
                if((v3 & 2) != 0) {
                    v5 = NavigationBarDefaults.INSTANCE.getContainerColor(composer1, 6);
                    v4 &= 0xFFFFFF8F;
                }
                if((v3 & 4) != 0) {
                    v7 = ColorSchemeKt.contentColorFor-4WTKRHQ(MaterialTheme.INSTANCE.getColorScheme(composer1, 6), v5);
                    v4 &= -897;
                }
                if((v3 & 8) != 0) {
                    f1 = 0.0f;
                }
                if((v3 & 16) == 0) {
                    f2 = f1;
                    windowInsets2 = windowInsets1;
                }
                else {
                    v4 &= 0xFFFF1FFF;
                    windowInsets2 = NavigationBarDefaults.INSTANCE.getWindowInsets(composer1, 6);
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
                if((v3 & 16) != 0) {
                    v4 &= 0xFFFF1FFF;
                }
                modifier1 = modifier0;
                f2 = f1;
                windowInsets2 = windowInsets1;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x5F2D444B, v4, -1, "androidx.compose.material3.NavigationBar (NavigationBar.kt:116)");
            }
            SurfaceKt.Surface-T9BRK9s(modifier1, null, v5, v7, f2, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(105663120, true, new ke(windowInsets2, function30), composer1, 54), composer1, v4 & 14 | 0xC00000 | v4 << 3 & 0x380 | v4 << 3 & 0x1C00 | v4 << 3 & 0xE000, 98);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            windowInsets1 = windowInsets2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            f2 = f1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new le(modifier1, v5, v7, f2, windowInsets1, function30, v2, v3));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void NavigationBarItem(@NotNull RowScope rowScope0, boolean z, @NotNull Function0 function00, @NotNull Function2 function20, @Nullable Modifier modifier0, boolean z1, @Nullable Function2 function21, boolean z2, @Nullable NavigationBarItemColors navigationBarItemColors0, @Nullable MutableInteractionSource mutableInteractionSource0, @Nullable Composer composer0, int v, int v1) {
        NavigationBarItemColors navigationBarItemColors1;
        boolean z5;
        Function2 function22;
        MutableInteractionSource mutableInteractionSource1;
        boolean z4;
        Modifier modifier1;
        MutableIntState mutableIntState1;
        MutableInteractionSource mutableInteractionSource4;
        boolean z7;
        boolean z6;
        int v3;
        MutableInteractionSource mutableInteractionSource2;
        NavigationBarItemColors navigationBarItemColors2;
        Function2 function23;
        Modifier modifier2;
        boolean z3;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0xD873A042);
        if((0x80000000 & v1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changed(rowScope0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 1) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (composer1.changed(z) ? 0x20 : 16);
        }
        if((v1 & 2) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v2 |= (composer1.changedInstance(function00) ? 0x100 : 0x80);
        }
        if((v1 & 4) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0xC00) == 0) {
            v2 |= (composer1.changedInstance(function20) ? 0x800 : 0x400);
        }
        if((v1 & 8) != 0) {
            v2 |= 0x6000;
        }
        else if((v & 0x6000) == 0) {
            v2 |= (composer1.changed(modifier0) ? 0x4000 : 0x2000);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x30000;
        }
        else if((0x30000 & v) == 0) {
            v2 |= (composer1.changed(z1) ? 0x20000 : 0x10000);
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x180000;
        }
        else if((0x180000 & v) == 0) {
            v2 |= (composer1.changedInstance(function21) ? 0x100000 : 0x80000);
        }
        if((v1 & 0x40) == 0) {
            z3 = z2;
            if((v & 0xC00000) == 0) {
                v2 |= (composer1.changed(z3) ? 0x800000 : 0x400000);
            }
        }
        else {
            v2 |= 0xC00000;
            z3 = z2;
        }
        if((v & 0x6000000) == 0) {
            v2 |= ((v1 & 0x80) != 0 || !composer1.changed(navigationBarItemColors0) ? 0x2000000 : 0x4000000);
        }
        if((v1 & 0x100) != 0) {
            v2 |= 0x30000000;
        }
        else if((v & 0x30000000) == 0) {
            v2 |= (composer1.changed(mutableInteractionSource0) ? 0x20000000 : 0x10000000);
        }
        if((v2 & 306783379) != 306783378 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                Modifier modifier3 = (v1 & 8) == 0 ? modifier0 : Modifier.Companion;
                Function2 function24 = (v1 & 0x20) == 0 ? function21 : null;
                if((v1 & 0x40) != 0) {
                    z3 = true;
                }
                if((v1 & 0x80) == 0) {
                    navigationBarItemColors2 = navigationBarItemColors0;
                }
                else {
                    navigationBarItemColors2 = NavigationBarItemDefaults.INSTANCE.colors(composer1, 6);
                    v2 &= 0xF1FFFFFF;
                }
                if((v1 & 0x100) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource0;
                    modifier2 = modifier3;
                    function23 = function24;
                }
                else {
                    modifier2 = modifier3;
                    function23 = function24;
                    mutableInteractionSource2 = null;
                }
                z6 = z3;
                v3 = v2;
                z7 = (v1 & 16) == 0 ? z1 : true;
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 0x80) != 0) {
                    v2 &= 0xF1FFFFFF;
                }
                modifier2 = modifier0;
                function23 = function21;
                navigationBarItemColors2 = navigationBarItemColors0;
                mutableInteractionSource2 = mutableInteractionSource0;
                v3 = v2;
                z6 = z3;
                z7 = z1;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xD873A042, v3, -1, "androidx.compose.material3.NavigationBarItem (NavigationBar.kt:181)");
            }
            composer1.startReplaceGroup(-103235253);
            if(mutableInteractionSource2 == null) {
                MutableInteractionSource mutableInteractionSource3 = composer1.rememberedValue();
                if(mutableInteractionSource3 == Composer.Companion.getEmpty()) {
                    mutableInteractionSource3 = InteractionSourceKt.MutableInteractionSource();
                    composer1.updateRememberedValue(mutableInteractionSource3);
                }
                mutableInteractionSource4 = mutableInteractionSource3;
            }
            else {
                mutableInteractionSource4 = mutableInteractionSource2;
            }
            composer1.endReplaceGroup();
            ComposableLambda composableLambda0 = ComposableLambdaKt.rememberComposableLambda(-1419576100, true, new qe(navigationBarItemColors2, z, z7, function23, z6, function20), composer1, 54);
            composer1.startReplaceGroup(-103209106);
            ComposableLambda composableLambda1 = function23 == null ? null : ComposableLambdaKt.rememberComposableLambda(0x620C84C8, true, new re(navigationBarItemColors2, z, z7, function23, 0), composer1, 54);
            composer1.endReplaceGroup();
            MutableIntState mutableIntState0 = composer1.rememberedValue();
            Companion composer$Companion0 = Composer.Companion;
            if(mutableIntState0 == composer$Companion0.getEmpty()) {
                mutableIntState0 = SnapshotIntStateKt.mutableIntStateOf(0);
                composer1.updateRememberedValue(mutableIntState0);
            }
            Modifier modifier4 = RowScope.weight$default(rowScope0, SizeKt.defaultMinSize-VpY3zN4$default(SelectableKt.selectable-O2vRcR0(modifier2, z, mutableInteractionSource4, null, z7, Role.box-impl(4), function00), 0.0f, NavigationBarKt.a, 1, null), 1.0f, false, 2, null);
            me me0 = composer1.rememberedValue();
            if(me0 == composer$Companion0.getEmpty()) {
                me0 = new me(mutableIntState0, 0);
                composer1.updateRememberedValue(me0);
            }
            Modifier modifier5 = OnRemeasuredModifierKt.onSizeChanged(modifier4, me0);
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), true);
            int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier6 = ComposedModifierKt.materializeModifier(composer1, modifier5);
            androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function01 = composeUiNode$Companion0.getConstructor();
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
            Function2 function25 = a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting()) {
                mutableIntState1 = mutableIntState0;
                a.t(v4, composer1, v4, function25);
            }
            else {
                mutableIntState1 = mutableIntState0;
                if(!Intrinsics.areEqual(composer1.rememberedValue(), v4)) {
                    a.t(v4, composer1, v4, function25);
                }
            }
            Updater.set-impl(composer1, modifier6, composeUiNode$Companion0.getSetModifier());
            State state0 = AnimateAsStateKt.animateFloatAsState((z ? 1.0f : 0.0f), AnimationSpecKt.tween$default(100, 0, null, 6, null), 0.0f, null, null, composer1, 0x30, 28);
            Density density0 = (Density)composer1.consume(CompositionLocalsKt.getLocalDensity());
            int v5 = density0.roundToPx-0680j_4(0.0f);
            long v6 = OffsetKt.Offset(((float)(mutableIntState1.getIntValue() - v5)) / 2.0f, density0.toPx-0680j_4(NavigationBarKt.f));
            boolean z8 = composer1.changed(mutableInteractionSource4);
            boolean z9 = composer1.changed(v6);
            MappedInteractionSource mappedInteractionSource0 = composer1.rememberedValue();
            if(z8 || z9 || mappedInteractionSource0 == composer$Companion0.getEmpty()) {
                mappedInteractionSource0 = new MappedInteractionSource(mutableInteractionSource4, v6, null);
                composer1.updateRememberedValue(mappedInteractionSource0);
            }
            ComposableLambda composableLambda2 = ComposableLambdaKt.rememberComposableLambda(0x293AFA35, true, new oe(mappedInteractionSource0), composer1, 54);
            ComposableLambda composableLambda3 = ComposableLambdaKt.rememberComposableLambda(0xE3B8D205, true, new ne(state0, navigationBarItemColors2), composer1, 54);
            boolean z10 = composer1.changed(state0);
            l l0 = composer1.rememberedValue();
            if(z10 || l0 == composer$Companion0.getEmpty()) {
                l0 = new l(state0, 4);
                composer1.updateRememberedValue(l0);
            }
            NavigationBarKt.a(composableLambda2, composableLambda3, composableLambda0, composableLambda1, z6, l0, composer1, v3 >> 9 & 0xE000 | 438);
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
            navigationBarItemColors1 = navigationBarItemColors2;
            z4 = z7;
            function22 = function23;
            z5 = z6;
            mutableInteractionSource1 = mutableInteractionSource2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            z4 = z1;
            mutableInteractionSource1 = mutableInteractionSource0;
            function22 = function21;
            z5 = z3;
            navigationBarItemColors1 = navigationBarItemColors0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new pe(rowScope0, z, function00, function20, modifier1, z4, function22, z5, navigationBarItemColors1, mutableInteractionSource1, v, v1));
        }
    }

    public static final void a(Function2 function20, Function2 function21, Function2 function22, Function2 function23, boolean z, Function0 function00, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xAAF08CD2);
        int v1 = (v & 6) == 0 ? (composer1.changedInstance(function20) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (composer1.changedInstance(function21) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (composer1.changedInstance(function22) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (composer1.changedInstance(function23) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            v1 |= (composer1.changed(z) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v) == 0) {
            v1 |= (composer1.changedInstance(function00) ? 0x20000 : 0x10000);
        }
        if((74899 & v1) != 74898 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xAAF08CD2, v1, -1, "androidx.compose.material3.NavigationBarItemLayout (NavigationBar.kt:516)");
            }
            te te0 = composer1.rememberedValue();
            if((((0x70000 & v1) == 0x20000 ? 1 : 0) | ((v1 & 0x1C00) == 0x800 ? 1 : 0) | ((0xE000 & v1) == 0x4000 ? 1 : 0)) != 0 || te0 == Composer.Companion.getEmpty()) {
                te0 = new te(function00, function23, z);
                composer1.updateRememberedValue(te0);
            }
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier0 = ComposedModifierKt.materializeModifier(composer1, modifier$Companion0);
            androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function01 = composeUiNode$Companion0.getConstructor();
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
            Function2 function24 = a.r(composeUiNode$Companion0, composer1, te0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
                a.t(v2, composer1, v2, function24);
            }
            Updater.set-impl(composer1, modifier0, composeUiNode$Companion0.getSetModifier());
            function20.invoke(composer1, ((int)(v1 & 14)));
            function21.invoke(composer1, ((int)(v1 >> 3 & 14)));
            Modifier modifier1 = LayoutIdKt.layoutId(modifier$Companion0, "icon");
            androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier2 = ComposedModifierKt.materializeModifier(composer1, modifier1);
            Function0 function02 = composeUiNode$Companion0.getConstructor();
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
            Function2 function25 = a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap1);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                a.t(v3, composer1, v3, function25);
            }
            Updater.set-impl(composer1, modifier2, composeUiNode$Companion0.getSetModifier());
            function22.invoke(composer1, ((int)(v1 >> 6 & 14)));
            composer1.endNode();
            composer1.startReplaceGroup(0x40CD5423);
            if(function23 != null) {
                Modifier modifier3 = LayoutIdKt.layoutId(modifier$Companion0, "label");
                se se0 = composer1.rememberedValue();
                if((((0xE000 & v1) == 0x4000 ? 1 : 0) | ((0x70000 & v1) == 0x20000 ? 1 : 0)) != 0 || se0 == Composer.Companion.getEmpty()) {
                    se0 = new se(z, function00, 0);
                    composer1.updateRememberedValue(se0);
                }
                Modifier modifier4 = PaddingKt.padding-VpY3zN4$default(GraphicsLayerModifierKt.graphicsLayer(modifier3, se0), NavigationBarKt.b / 2.0f, 0.0f, 2, null);
                MeasurePolicy measurePolicy1 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
                int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
                CompositionLocalMap compositionLocalMap2 = composer1.getCurrentCompositionLocalMap();
                Modifier modifier5 = ComposedModifierKt.materializeModifier(composer1, modifier4);
                Function0 function03 = composeUiNode$Companion0.getConstructor();
                if(composer1.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer1.startReusableNode();
                if(composer1.getInserting()) {
                    composer1.createNode(function03);
                }
                else {
                    composer1.useNode();
                }
                Function2 function26 = a.r(composeUiNode$Companion0, composer1, measurePolicy1, composer1, compositionLocalMap2);
                if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v4)) {
                    a.t(v4, composer1, v4, function26);
                }
                Updater.set-impl(composer1, modifier5, composeUiNode$Companion0.getSetModifier());
                b.y(composer1, v1 >> 9 & 14, function23);
            }
            if(a.x(composer1)) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new ue(function20, function21, function22, function23, z, function00, v, 0));
        }
    }

    public static final void access$NavigationBarItem$lambda$4(MutableIntState mutableIntState0, int v) {
        mutableIntState0.setIntValue(v);
    }

    public static final float access$getIndicatorHorizontalPadding$p() [...] // 潜在的解密器

    public static final float access$getNavigationBarHeight$p() [...] // 潜在的解密器

    public static final MeasureResult access$placeIcon-X9ElhV4(MeasureScope measureScope0, Placeable placeable0, Placeable placeable1, Placeable placeable2, long v) {
        int v1 = Constraints.getMaxWidth-impl(v);
        int v2 = ConstraintsKt.constrainHeight-K40F9xA(v, measureScope0.roundToPx-0680j_4(NavigationBarKt.a));
        return MeasureScope.layout$default(measureScope0, v1, v2, null, new ve(q.d(placeable0, v1, 2), q.A(placeable0, v2, 2), q.d(placeable1, v1, 2), q.A(placeable1, v2, 2), v1, v2, placeable2, placeable0, placeable1), 4, null);
    }

    public static final MeasureResult access$placeLabelAndIcon-zUg2_y0(MeasureScope measureScope0, Placeable placeable0, Placeable placeable1, Placeable placeable2, Placeable placeable3, long v, boolean z, float f) {
        float f1 = measureScope0.toPx-0680j_4(NavigationBarKt.e);
        float f2 = measureScope0.toPx-0680j_4(NavigationBarKt.c) + (f1 + ((float)placeable1.getHeight())) + ((float)placeable0.getHeight());
        float f3 = c.coerceAtLeast((((float)Constraints.getMinHeight-impl(v)) - f2) / 2.0f, measureScope0.toPx-0680j_4(NavigationBarKt.e));
        float f4 = f3 * 2.0f + f2;
        float f5 = measureScope0.toPx-0680j_4(NavigationBarKt.e);
        float f6 = measureScope0.toPx-0680j_4(NavigationBarKt.c);
        int v1 = Constraints.getMaxWidth-impl(v);
        int v2 = q.d(placeable0, v1, 2);
        int v3 = q.d(placeable1, v1, 2);
        int v4 = q.d(placeable2, v1, 2);
        float f7 = measureScope0.toPx-0680j_4(NavigationBarKt.e);
        return MeasureScope.layout$default(measureScope0, v1, zd.c.roundToInt(f4), null, new we(placeable3, z, f, placeable0, v2, f6 + (f5 + (((float)placeable1.getHeight()) + f3)), (1.0f - f) * ((z ? f3 : (f4 - ((float)placeable1.getHeight())) / 2.0f) - f3), placeable1, v3, f3, placeable2, v4, f3 - f7, v1, measureScope0), 4, null);
    }

    public static final float getIndicatorVerticalPadding() [...] // 潜在的解密器

    public static final float getNavigationBarIndicatorToLabelPadding() {
        return NavigationBarKt.c;
    }

    public static final float getNavigationBarItemHorizontalPadding() [...] // 潜在的解密器
}

