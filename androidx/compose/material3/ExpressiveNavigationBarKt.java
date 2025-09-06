package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.ShapeKeyTokens;
import androidx.compose.material3.tokens.TypographyKeyTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zd.c;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\u001AW\u0010\u000F\u001A\u00020\n2\b\b\u0002\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00072\u0011\u0010\f\u001A\r\u0012\u0004\u0012\u00020\n0\t\u00A2\u0006\u0002\b\u000BH\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b\r\u0010\u000E\u001A\u009D\u0001\u0010\u001F\u001A\u00020\n2\u0006\u0010\u0011\u001A\u00020\u00102\f\u0010\u0012\u001A\b\u0012\u0004\u0012\u00020\n0\t2\u0011\u0010\u0013\u001A\r\u0012\u0004\u0012\u00020\n0\t\u00A2\u0006\u0002\b\u000B2\b\b\u0002\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0014\u001A\u00020\u00102\u0015\b\u0002\u0010\u0015\u001A\u000F\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u00A2\u0006\u0002\b\u000B2\u0015\b\u0002\u0010\u0016\u001A\u000F\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u00A2\u0006\u0002\b\u000B2\b\b\u0002\u0010\u0018\u001A\u00020\u00172\b\b\u0002\u0010\u001A\u001A\u00020\u00192\n\b\u0002\u0010\u001C\u001A\u0004\u0018\u00010\u001BH\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001D\u0010\u001E\"\u001A\u0010%\u001A\u00020 8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b!\u0010\"\u001A\u0004\b#\u0010$\"\u001A\u0010(\u001A\u00020 8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b&\u0010\"\u001A\u0004\b\'\u0010$\"\u001A\u0010+\u001A\u00020 8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b)\u0010\"\u001A\u0004\b*\u0010$\"\u001A\u0010.\u001A\u00020 8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b,\u0010\"\u001A\u0004\b-\u0010$\"\u001A\u00101\u001A\u00020 8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b/\u0010\"\u001A\u0004\b0\u0010$\"\u001A\u00104\u001A\u00020 8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b2\u0010\"\u001A\u0004\b3\u0010$\"\u001A\u00107\u001A\u00020 8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b5\u0010\"\u001A\u0004\b6\u0010$\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u00068"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "Landroidx/compose/foundation/layout/WindowInsets;", "windowInsets", "Landroidx/compose/material3/NavigationBarArrangement;", "arrangement", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "ExpressiveNavigationBar-NiJtXQ4", "(Landroidx/compose/ui/Modifier;JJLandroidx/compose/foundation/layout/WindowInsets;ILkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ExpressiveNavigationBar", "", "selected", "onClick", "icon", "enabled", "label", "badge", "Landroidx/compose/material3/NavigationItemIconPosition;", "iconPosition", "Landroidx/compose/material3/NavigationItemColors;", "colors", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "ExpressiveNavigationBarItem-pli-t6k", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ILandroidx/compose/material3/NavigationItemColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "ExpressiveNavigationBarItem", "Landroidx/compose/ui/unit/Dp;", "j", "F", "getTopIconItemVerticalPadding", "()F", "TopIconItemVerticalPadding", "k", "getTopIconIndicatorVerticalPadding", "TopIconIndicatorVerticalPadding", "l", "getTopIconIndicatorHorizontalPadding", "TopIconIndicatorHorizontalPadding", "m", "getStartIconIndicatorVerticalPadding", "StartIconIndicatorVerticalPadding", "n", "getTopIconIndicatorToLabelPadding", "TopIconIndicatorToLabelPadding", "o", "getStartIconIndicatorHorizontalPadding", "StartIconIndicatorHorizontalPadding", "p", "getStartIconToLabelPadding", "StartIconToLabelPadding", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nExpressiveNavigationBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExpressiveNavigationBar.kt\nandroidx/compose/material3/ExpressiveNavigationBarKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,459:1\n1223#2,6:460\n158#3:466\n148#3:467\n148#3:468\n148#3:469\n148#3:470\n148#3:471\n148#3:478\n148#3:479\n148#3:480\n56#4:472\n71#4:473\n56#4:474\n71#4:475\n56#4:476\n71#4:477\n*S KotlinDebug\n*F\n+ 1 ExpressiveNavigationBar.kt\nandroidx/compose/material3/ExpressiveNavigationBarKt\n*L\n200#1:460,6\n430#1:466\n431#1:467\n432#1:468\n433#1:469\n443#1:470\n446#1:471\n454#1:478\n456#1:479\n458#1:480\n448#1:472\n448#1:473\n450#1:474\n450#1:475\n452#1:476\n452#1:477\n*E\n"})
public final class ExpressiveNavigationBarKt {
    public static final float a;
    public static final TypographyKeyTokens b;
    public static final ShapeKeyTokens c;
    public static final ColorSchemeKeyTokens d;
    public static final ColorSchemeKeyTokens e;
    public static final ColorSchemeKeyTokens f;
    public static final ColorSchemeKeyTokens g;
    public static final ColorSchemeKeyTokens h;
    public static final float i;
    public static final float j;
    public static final float k;
    public static final float l;
    public static final float m;
    public static final float n;
    public static final float o;
    public static final float p;

    static {
        ExpressiveNavigationBarKt.a = 56.0f;
        ExpressiveNavigationBarKt.b = TypographyKeyTokens.LabelMedium;
        ExpressiveNavigationBarKt.c = ShapeKeyTokens.CornerFull;
        ExpressiveNavigationBarKt.d = ColorSchemeKeyTokens.Secondary;
        ExpressiveNavigationBarKt.e = ColorSchemeKeyTokens.Secondary;
        ExpressiveNavigationBarKt.f = ColorSchemeKeyTokens.SecondaryContainer;
        ExpressiveNavigationBarKt.g = ColorSchemeKeyTokens.OnSurfaceVariant;
        ExpressiveNavigationBarKt.h = ColorSchemeKeyTokens.OnSurfaceVariant;
        ExpressiveNavigationBarKt.i = 64.0f;
        ExpressiveNavigationBarKt.j = 6.0f;
        ExpressiveNavigationBarKt.k = 4.0f;
        ExpressiveNavigationBarKt.l = 16.0f;
        ExpressiveNavigationBarKt.m = 8.0f;
        ExpressiveNavigationBarKt.n = 4.0f;
        ExpressiveNavigationBarKt.o = 16.0f;
        ExpressiveNavigationBarKt.p = 4.0f;
    }

    @ExperimentalMaterial3Api
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void ExpressiveNavigationBar-NiJtXQ4(@Nullable Modifier modifier0, long v, long v1, @Nullable WindowInsets windowInsets0, int v2, @NotNull Function2 function20, @Nullable Composer composer0, int v3, int v4) {
        Modifier modifier1;
        int v12;
        int v11;
        int v10;
        int v9;
        WindowInsets windowInsets1;
        long v8;
        int v7;
        long v6;
        int v5;
        Composer composer1 = composer0.startRestartGroup(-1171105467);
        if((v4 & 1) == 0) {
            v5 = (v3 & 6) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v3 : v3;
        }
        else {
            v5 = v3 | 6;
        }
        if((v3 & 0x30) == 0) {
            if((v4 & 2) == 0) {
                v6 = v;
                v7 = composer1.changed(v6) ? 0x20 : 16;
            }
            else {
                v6 = v;
                v7 = 16;
            }
            v5 |= v7;
        }
        else {
            v6 = v;
        }
        if((v3 & 0x180) == 0) {
            v8 = v1;
            v5 |= ((v4 & 4) != 0 || !composer1.changed(v8) ? 0x80 : 0x100);
        }
        else {
            v8 = v1;
        }
        if((v3 & 0xC00) == 0) {
            if((v4 & 8) == 0) {
                windowInsets1 = windowInsets0;
                v9 = composer1.changed(windowInsets1) ? 0x800 : 0x400;
            }
            else {
                windowInsets1 = windowInsets0;
                v9 = 0x400;
            }
            v5 |= v9;
        }
        else {
            windowInsets1 = windowInsets0;
        }
        if((v3 & 0x6000) == 0) {
            if((v4 & 16) == 0) {
                v10 = v2;
                v11 = composer1.changed(v10) ? 0x4000 : 0x2000;
            }
            else {
                v10 = v2;
                v11 = 0x2000;
            }
            v5 |= v11;
        }
        else {
            v10 = v2;
        }
        if((v4 & 0x20) != 0) {
            v5 |= 0x30000;
        }
        else if((v3 & 0x30000) == 0) {
            v5 |= (composer1.changedInstance(function20) ? 0x20000 : 0x10000);
        }
        if((74899 & v5) != 74898 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v3 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier1 = (v4 & 1) == 0 ? modifier0 : Modifier.Companion;
                if((v4 & 2) != 0) {
                    v6 = ExpressiveNavigationBarDefaults.INSTANCE.getContainerColor(composer1, 6);
                    v5 &= 0xFFFFFF8F;
                }
                if((v4 & 4) != 0) {
                    v8 = ExpressiveNavigationBarDefaults.INSTANCE.getContentColor(composer1, 6);
                    v5 &= -897;
                }
                if((v4 & 8) != 0) {
                    v5 &= 0xFFFFE3FF;
                    windowInsets1 = ExpressiveNavigationBarDefaults.INSTANCE.getWindowInsets(composer1, 6);
                }
                if((v4 & 16) == 0) {
                    v12 = v10;
                }
                else {
                    v5 &= 0xFFFF1FFF;
                    v12 = 0;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v4 & 2) != 0) {
                    v5 &= 0xFFFFFF8F;
                }
                if((v4 & 4) != 0) {
                    v5 &= -897;
                }
                if((v4 & 8) != 0) {
                    v5 &= 0xFFFFE3FF;
                }
                if((v4 & 16) != 0) {
                    v5 &= 0xFFFF1FFF;
                }
                modifier1 = modifier0;
                v12 = v10;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1171105467, v5, -1, "androidx.compose.material3.ExpressiveNavigationBar (ExpressiveNavigationBar.kt:88)");
            }
            SurfaceKt.Surface-T9BRK9s(null, null, v6, v8, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(0x5DCCB94A, true, new ba(modifier1, windowInsets1, v12, function20), composer1, 54), composer1, v5 << 3 & 0x380 | 0xC00000 | v5 << 3 & 0x1C00, 0x73);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            v10 = v12;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new ca(modifier1, v6, v8, windowInsets1, v10, function20, v3, v4));
        }
    }

    @ExperimentalMaterial3Api
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void ExpressiveNavigationBarItem-pli-t6k(boolean z, @NotNull Function0 function00, @NotNull Function2 function20, @Nullable Modifier modifier0, boolean z1, @Nullable Function2 function21, @Nullable Function2 function22, int v, @Nullable NavigationItemColors navigationItemColors0, @Nullable MutableInteractionSource mutableInteractionSource0, @Nullable Composer composer0, int v1, int v2) {
        NavigationItemColors navigationItemColors1;
        Function2 function26;
        Function2 function25;
        boolean z2;
        Modifier modifier1;
        MutableInteractionSource mutableInteractionSource1;
        int v4;
        MutableInteractionSource mutableInteractionSource4;
        int v6;
        int v5;
        MutableInteractionSource mutableInteractionSource2;
        Function2 function28;
        Function2 function27;
        boolean z3;
        NavigationItemColors navigationItemColors2;
        Function2 function24;
        Function2 function23;
        int v3;
        Composer composer1 = composer0.startRestartGroup(1250474866);
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
        }
        else if((v1 & 0x180) == 0) {
            v3 |= (composer1.changedInstance(function20) ? 0x100 : 0x80);
        }
        if((v2 & 8) != 0) {
            v3 |= 0xC00;
        }
        else if((v1 & 0xC00) == 0) {
            v3 |= (composer1.changed(modifier0) ? 0x800 : 0x400);
        }
        if((v2 & 16) != 0) {
            v3 |= 0x6000;
        }
        else if((v1 & 0x6000) == 0) {
            v3 |= (composer1.changed(z1) ? 0x4000 : 0x2000);
        }
        if((v2 & 0x20) != 0) {
            v3 |= 0x30000;
            function23 = function21;
        }
        else if((0x30000 & v1) == 0) {
            function23 = function21;
            v3 |= (composer1.changedInstance(function23) ? 0x20000 : 0x10000);
        }
        else {
            function23 = function21;
        }
        if((v2 & 0x40) != 0) {
            v3 |= 0x180000;
            function24 = function22;
        }
        else if((0x180000 & v1) == 0) {
            function24 = function22;
            v3 |= (composer1.changedInstance(function24) ? 0x100000 : 0x80000);
        }
        else {
            function24 = function22;
        }
        if((v2 & 0x80) != 0) {
            v3 |= 0xC00000;
        }
        else if((v1 & 0xC00000) == 0) {
            v3 |= (composer1.changed(v) ? 0x800000 : 0x400000);
        }
        if((v1 & 0x6000000) == 0) {
            v3 |= ((v2 & 0x100) != 0 || !composer1.changed(navigationItemColors0) ? 0x2000000 : 0x4000000);
        }
        if((v2 & 0x200) != 0) {
            v3 |= 0x30000000;
        }
        else if((v1 & 0x30000000) == 0) {
            v3 |= (composer1.changed(mutableInteractionSource0) ? 0x20000000 : 0x10000000);
        }
        if((v3 & 306783379) != 306783378 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v1 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier1 = (v2 & 8) == 0 ? modifier0 : Modifier.Companion;
                z3 = (v2 & 16) == 0 ? z1 : true;
                mutableInteractionSource2 = null;
                if((v2 & 0x20) != 0) {
                    function23 = null;
                }
                if((v2 & 0x40) != 0) {
                    function24 = null;
                }
                if((v2 & 0x100) == 0) {
                    navigationItemColors2 = navigationItemColors0;
                }
                else {
                    navigationItemColors2 = ExpressiveNavigationBarItemDefaults.INSTANCE.colors(composer1, 6);
                    v3 &= 0xF1FFFFFF;
                }
                if((v2 & 0x200) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource0;
                }
                v5 = v3;
                function28 = function24;
                v6 = (v2 & 0x80) == 0 ? v : 0;
                function27 = function23;
            }
            else {
                composer1.skipToGroupEnd();
                if((v2 & 0x100) != 0) {
                    v3 &= 0xF1FFFFFF;
                }
                navigationItemColors2 = navigationItemColors0;
                modifier1 = modifier0;
                z3 = z1;
                function27 = function23;
                function28 = function24;
                mutableInteractionSource2 = mutableInteractionSource0;
                v5 = v3;
                v6 = v;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1250474866, v5, -1, "androidx.compose.material3.ExpressiveNavigationBarItem (ExpressiveNavigationBar.kt:197)");
            }
            composer1.startReplaceGroup(0xC532A5E3);
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
            boolean z4 = NavigationItemIconPosition.equals-impl0(v6, 0);
            NavigationItemKt.NavigationItem-SHbi2eg(z, function00, function20, TypographyKt.getValue(ExpressiveNavigationBarKt.b, composer1, 6), ShapesKt.getValue(ExpressiveNavigationBarKt.c, composer1, 6), ExpressiveNavigationBarKt.a, (z4 ? ExpressiveNavigationBarKt.l : ExpressiveNavigationBarKt.o), (z4 ? ExpressiveNavigationBarKt.k : ExpressiveNavigationBarKt.m), ExpressiveNavigationBarKt.n, ExpressiveNavigationBarKt.p, ExpressiveNavigationBarKt.j, navigationItemColors2, modifier1, z3, function27, function28, v6, mutableInteractionSource4, composer1, v5 & 14 | 0x36030000 | v5 & 0x70 | v5 & 0x380, 6 | v5 >> 21 & 0x70 | v5 >> 3 & 0x380 | v5 >> 3 & 0x1C00 | 0xE000 & v5 >> 3 | 0x70000 & v5 >> 3 | v5 >> 3 & 0x380000);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z2 = z3;
            mutableInteractionSource1 = mutableInteractionSource2;
            navigationItemColors1 = navigationItemColors2;
            function25 = function27;
            function26 = function28;
            v4 = v6;
        }
        else {
            composer1.skipToGroupEnd();
            v4 = v;
            mutableInteractionSource1 = mutableInteractionSource0;
            modifier1 = modifier0;
            z2 = z1;
            function25 = function23;
            function26 = function24;
            navigationItemColors1 = navigationItemColors0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new da(z, function00, function20, modifier1, z2, function25, function26, v4, navigationItemColors1, mutableInteractionSource1, v1, v2));
        }
    }

    public static final int access$calculateCenteredContentHorizontalPadding(int v, int v1) {
        return v <= 6 ? c.roundToInt(((float)(100 - (v + 3) * 10)) / 2.0f / 100.0f * ((float)v1)) : 0;
    }

    public static final ColorSchemeKeyTokens access$getActiveIconColor$p() {
        return ExpressiveNavigationBarKt.d;
    }

    public static final ColorSchemeKeyTokens access$getActiveIndicatorColor$p() {
        return ExpressiveNavigationBarKt.f;
    }

    public static final ColorSchemeKeyTokens access$getActiveLabelTextColor$p() {
        return ExpressiveNavigationBarKt.e;
    }

    public static final ColorSchemeKeyTokens access$getInactiveIconColor$p() {
        return ExpressiveNavigationBarKt.g;
    }

    public static final ColorSchemeKeyTokens access$getInactiveLabelTextColor$p() {
        return ExpressiveNavigationBarKt.h;
    }

    public static final float access$getNavigationBarHeight$p() [...] // 潜在的解密器

    public static final float getStartIconIndicatorHorizontalPadding() {
        return ExpressiveNavigationBarKt.o;
    }

    public static final float getStartIconIndicatorVerticalPadding() {
        return ExpressiveNavigationBarKt.m;
    }

    public static final float getStartIconToLabelPadding() {
        return ExpressiveNavigationBarKt.p;
    }

    public static final float getTopIconIndicatorHorizontalPadding() {
        return ExpressiveNavigationBarKt.l;
    }

    public static final float getTopIconIndicatorToLabelPadding() {
        return ExpressiveNavigationBarKt.n;
    }

    public static final float getTopIconIndicatorVerticalPadding() {
        return ExpressiveNavigationBarKt.k;
    }

    public static final float getTopIconItemVerticalPadding() {
        return ExpressiveNavigationBarKt.j;
    }
}

