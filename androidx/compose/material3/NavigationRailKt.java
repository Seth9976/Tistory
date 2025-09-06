package androidx.compose.material3;

import a5.b;
import aa.l;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.material3.internal.MappedInteractionSource;
import androidx.compose.material3.tokens.NavigationRailTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode.Companion;
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

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\u001Az\u0010\u0010\u001A\u00020\u00072\b\b\u0002\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022 \b\u0002\u0010\n\u001A\u001A\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\b\b¢\u0006\u0002\b\t2\b\b\u0002\u0010\f\u001A\u00020\u000B2\u001C\u0010\r\u001A\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b¢\u0006\u0002\b\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000E\u0010\u000F\u001A\u0083\u0001\u0010\u001D\u001A\u00020\u00072\u0006\u0010\u0012\u001A\u00020\u00112\f\u0010\u0014\u001A\b\u0012\u0004\u0012\u00020\u00070\u00132\u0011\u0010\u0015\u001A\r\u0012\u0004\u0012\u00020\u00070\u0013¢\u0006\u0002\b\b2\b\b\u0002\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0016\u001A\u00020\u00112\u0015\b\u0002\u0010\u0017\u001A\u000F\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0013¢\u0006\u0002\b\b2\b\b\u0002\u0010\u0018\u001A\u00020\u00112\b\b\u0002\u0010\u001A\u001A\u00020\u00192\n\b\u0002\u0010\u001C\u001A\u0004\u0018\u00010\u001BH\u0007¢\u0006\u0004\b\u001D\u0010\u001E\"\u001A\u0010$\u001A\u00020\u001F8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010!\u001A\u0004\b\"\u0010#\"\u001A\u0010\'\u001A\u00020\u001F8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010!\u001A\u0004\b&\u0010#\"\u001A\u0010*\u001A\u00020\u001F8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u0010!\u001A\u0004\b)\u0010#\"\u001A\u0010-\u001A\u00020\u001F8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b+\u0010!\u001A\u0004\b,\u0010#\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u00060²\u0006\f\u0010.\u001A\u00020\u00028\nX\u008A\u0084\u0002²\u0006\f\u0010/\u001A\u00020\u00028\nX\u008A\u0084\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "header", "Landroidx/compose/foundation/layout/WindowInsets;", "windowInsets", "content", "NavigationRail-qi6gXK8", "(Landroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Landroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "NavigationRail", "", "selected", "Lkotlin/Function0;", "onClick", "icon", "enabled", "label", "alwaysShowLabel", "Landroidx/compose/material3/NavigationRailItemColors;", "colors", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "NavigationRailItem", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/NavigationRailItemColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/unit/Dp;", "a", "F", "getNavigationRailVerticalPadding", "()F", "NavigationRailVerticalPadding", "c", "getNavigationRailItemWidth", "NavigationRailItemWidth", "d", "getNavigationRailItemHeight", "NavigationRailItemHeight", "e", "getNavigationRailItemVerticalPadding", "NavigationRailItemVerticalPadding", "iconColor", "textColor", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nNavigationRail.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material3/NavigationRailKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,749:1\n1223#2,6:750\n1223#2,6:789\n1223#2,6:795\n1223#2,6:805\n1223#2,6:882\n71#3,3:756\n74#3:787\n78#3:804\n71#3:842\n68#3,6:843\n74#3:877\n78#3:881\n71#3:888\n68#3,6:889\n74#3:923\n78#3:927\n78#4,6:759\n85#4,4:774\n89#4,2:784\n93#4:803\n78#4:811\n76#4,8:812\n85#4,4:829\n89#4,2:839\n78#4,6:849\n85#4,4:864\n89#4,2:874\n93#4:880\n78#4,6:895\n85#4,4:910\n89#4,2:920\n93#4:926\n93#4:930\n368#5,9:765\n377#5:786\n378#5,2:801\n368#5,9:820\n377#5:841\n368#5,9:855\n377#5:876\n378#5,2:878\n368#5,9:901\n377#5:922\n378#5,2:924\n378#5,2:928\n4032#6,6:778\n4032#6,6:833\n4032#6,6:868\n4032#6,6:914\n77#7:788\n148#8:931\n148#8:932\n148#8:933\n56#9:934\n71#9:935\n56#9:936\n71#9:937\n56#9:938\n71#9:939\n*S KotlinDebug\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material3/NavigationRailKt\n*L\n184#1:750,6\n247#1:789,6\n283#1:795,6\n531#1:805,6\n524#1:882,6\n216#1:756,3\n216#1:787\n216#1:804\n520#1:842\n520#1:843,6\n520#1:877\n520#1:881\n523#1:888\n523#1:889,6\n523#1:923\n523#1:927\n216#1:759,6\n216#1:774,4\n216#1:784,2\n216#1:803\n516#1:811\n516#1:812,8\n516#1:829,4\n516#1:839,2\n520#1:849,6\n520#1:864,4\n520#1:874,2\n520#1:880\n523#1:895,6\n523#1:910,4\n523#1:920,2\n523#1:926\n516#1:930\n216#1:765,9\n216#1:786\n216#1:801,2\n516#1:820,9\n516#1:841\n520#1:855,9\n520#1:876\n520#1:878,2\n523#1:901,9\n523#1:922\n523#1:924,2\n516#1:928,2\n216#1:778,6\n516#1:833,6\n520#1:868,6\n523#1:914,6\n241#1:788\n719#1:931\n725#1:932\n739#1:933\n742#1:934\n742#1:935\n745#1:936\n745#1:937\n748#1:938\n748#1:939\n*E\n"})
public final class NavigationRailKt {
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;
    public static final float f;
    public static final float g;
    public static final float h;

    static {
        NavigationRailKt.a = 4.0f;
        NavigationRailKt.b = 8.0f;
        NavigationRailKt.c = 0.0f;
        NavigationRailKt.d = 0.0f;
        NavigationRailKt.e = 4.0f;
        NavigationRailKt.f = 0.0f;
        NavigationRailKt.g = 0.0f;
        NavigationRailKt.h = 0.0f;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void NavigationRail-qi6gXK8(@Nullable Modifier modifier0, long v, long v1, @Nullable Function3 function30, @Nullable WindowInsets windowInsets0, @NotNull Function3 function31, @Nullable Composer composer0, int v2, int v3) {
        Function3 function33;
        Modifier modifier1;
        WindowInsets windowInsets2;
        int v8;
        WindowInsets windowInsets1;
        Function3 function32;
        long v7;
        int v6;
        long v5;
        int v4;
        Composer composer1 = composer0.startRestartGroup(0x710F848);
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
            function32 = function30;
        }
        else if((v2 & 0xC00) == 0) {
            function32 = function30;
            v4 |= (composer1.changedInstance(function32) ? 0x800 : 0x400);
        }
        else {
            function32 = function30;
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
            v4 |= (composer1.changedInstance(function31) ? 0x20000 : 0x10000);
        }
        if((74899 & v4) != 74898 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v2 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier1 = (v3 & 1) == 0 ? modifier0 : Modifier.Companion;
                if((v3 & 2) != 0) {
                    v5 = NavigationRailDefaults.INSTANCE.getContainerColor(composer1, 6);
                    v4 &= 0xFFFFFF8F;
                }
                if((v3 & 4) != 0) {
                    v7 = ColorSchemeKt.contentColorFor-ek8zF_U(v5, composer1, v4 >> 3 & 14);
                    v4 &= -897;
                }
                if((v3 & 8) != 0) {
                    function32 = null;
                }
                if((v3 & 16) == 0) {
                    function33 = function32;
                    windowInsets2 = windowInsets1;
                }
                else {
                    v4 &= 0xFFFF1FFF;
                    windowInsets2 = NavigationRailDefaults.INSTANCE.getWindowInsets(composer1, 6);
                    function33 = function32;
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
                function33 = function32;
                windowInsets2 = windowInsets1;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x710F848, v4, -1, "androidx.compose.material3.NavigationRail (NavigationRail.kt:118)");
            }
            SurfaceKt.Surface-T9BRK9s(modifier1, null, v5, v7, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(0x83442FA3, true, new ig(windowInsets2, function33, function31), composer1, 54), composer1, v4 & 14 | 0xC00000 | v4 << 3 & 0x380 | v4 << 3 & 0x1C00, 0x72);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            windowInsets1 = windowInsets2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            function33 = function32;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new jg(modifier1, v5, v7, function33, windowInsets1, function31, v2, v3));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void NavigationRailItem(boolean z, @NotNull Function0 function00, @NotNull Function2 function20, @Nullable Modifier modifier0, boolean z1, @Nullable Function2 function21, boolean z2, @Nullable NavigationRailItemColors navigationRailItemColors0, @Nullable MutableInteractionSource mutableInteractionSource0, @Nullable Composer composer0, int v, int v1) {
        NavigationRailItemColors navigationRailItemColors1;
        boolean z5;
        Function2 function22;
        MutableInteractionSource mutableInteractionSource1;
        boolean z4;
        Modifier modifier1;
        Shape shape0;
        MutableInteractionSource mutableInteractionSource5;
        MutableInteractionSource mutableInteractionSource4;
        boolean z7;
        boolean z6;
        int v3;
        MutableInteractionSource mutableInteractionSource2;
        NavigationRailItemColors navigationRailItemColors2;
        Function2 function23;
        Modifier modifier2;
        NavigationRailItemColors navigationRailItemColors3;
        boolean z3;
        int v2;
        Composer composer1 = composer0.startRestartGroup(-1533971045);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changed(z) ? 4 : 2) | v : v;
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
            v2 |= (composer1.changedInstance(function20) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0xC00) == 0) {
            v2 |= (composer1.changed(modifier0) ? 0x800 : 0x400);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
        }
        else if((v & 0x6000) == 0) {
            v2 |= (composer1.changed(z1) ? 0x4000 : 0x2000);
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
        }
        else if((0x30000 & v) == 0) {
            v2 |= (composer1.changedInstance(function21) ? 0x20000 : 0x10000);
        }
        if((v1 & 0x40) == 0) {
            z3 = z2;
            if((v & 0x180000) == 0) {
                v2 |= (composer1.changed(z3) ? 0x100000 : 0x80000);
            }
        }
        else {
            v2 |= 0x180000;
            z3 = z2;
        }
        if((v & 0xC00000) == 0) {
            v2 |= ((v1 & 0x80) != 0 || !composer1.changed(navigationRailItemColors0) ? 0x400000 : 0x800000);
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
                Modifier modifier3 = (v1 & 8) == 0 ? modifier0 : Modifier.Companion;
                Function2 function24 = (v1 & 0x20) == 0 ? function21 : null;
                if((v1 & 0x40) != 0) {
                    z3 = true;
                }
                if((v1 & 0x80) == 0) {
                    navigationRailItemColors3 = navigationRailItemColors0;
                }
                else {
                    navigationRailItemColors3 = NavigationRailItemDefaults.INSTANCE.colors(composer1, 6);
                    v2 &= 0xFE3FFFFF;
                }
                if((v1 & 0x100) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource0;
                    modifier2 = modifier3;
                    function23 = function24;
                    navigationRailItemColors2 = navigationRailItemColors3;
                    z6 = z3;
                }
                else {
                    modifier2 = modifier3;
                    function23 = function24;
                    navigationRailItemColors2 = navigationRailItemColors3;
                    z6 = z3;
                    mutableInteractionSource2 = null;
                }
                v3 = v2;
                z7 = (v1 & 16) == 0 ? z1 : true;
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 0x80) != 0) {
                    v2 &= 0xFE3FFFFF;
                }
                modifier2 = modifier0;
                function23 = function21;
                navigationRailItemColors2 = navigationRailItemColors0;
                mutableInteractionSource2 = mutableInteractionSource0;
                v3 = v2;
                z6 = z3;
                z7 = z1;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1533971045, v3, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:181)");
            }
            composer1.startReplaceGroup(-782588008);
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
            ComposableLambda composableLambda0 = ComposableLambdaKt.rememberComposableLambda(0xC300CDB5, true, new ng(navigationRailItemColors2, z, z7, function23, z6, function20), composer1, 54);
            composer1.startReplaceGroup(0xD15B0DBC);
            ComposableLambda composableLambda1 = function23 == null ? null : ComposableLambdaKt.rememberComposableLambda(0xF9B9B6A1, true, new re(navigationRailItemColors2, z, z7, function23, 1), composer1, 54);
            composer1.endReplaceGroup();
            Modifier modifier4 = SizeKt.widthIn-VpY3zN4$default(SizeKt.defaultMinSize-VpY3zN4$default(SelectableKt.selectable-O2vRcR0(modifier2, z, mutableInteractionSource4, null, z7, Role.box-impl(4), function00), 0.0f, NavigationRailKt.d, 1, null), NavigationRailKt.c, 0.0f, 2, null);
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), true);
            int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier5 = ComposedModifierKt.materializeModifier(composer1, modifier4);
            Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            float f = NavigationRailKt.c;
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
                mutableInteractionSource5 = mutableInteractionSource4;
                a.t(v4, composer1, v4, function25);
            }
            else {
                mutableInteractionSource5 = mutableInteractionSource4;
                if(!Intrinsics.areEqual(composer1.rememberedValue(), v4)) {
                    a.t(v4, composer1, v4, function25);
                }
            }
            Updater.set-impl(composer1, modifier5, composeUiNode$Companion0.getSetModifier());
            State state0 = AnimateAsStateKt.animateFloatAsState((z ? 1.0f : 0.0f), AnimationSpecKt.tween$default(150, 0, null, 6, null), 0.0f, null, null, composer1, 0x30, 28);
            Density density0 = (Density)composer1.consume(CompositionLocalsKt.getLocalDensity());
            int v5 = density0.roundToPx-0680j_4(f);
            NavigationRailTokens navigationRailTokens0 = NavigationRailTokens.INSTANCE;
            long v6 = OffsetKt.Offset(((float)(v5 - density0.roundToPx-0680j_4(0.0f))) / 2.0f, 0.0f);
            boolean z8 = composer1.changed(mutableInteractionSource5);
            boolean z9 = composer1.changed(v6);
            MappedInteractionSource mappedInteractionSource0 = composer1.rememberedValue();
            if(z8 || z9 || mappedInteractionSource0 == Composer.Companion.getEmpty()) {
                mappedInteractionSource0 = new MappedInteractionSource(mutableInteractionSource5, v6, null);
                composer1.updateRememberedValue(mappedInteractionSource0);
            }
            if(function23 == null) {
                composer1.startReplaceGroup(0x22E43011);
                shape0 = ShapesKt.getValue(navigationRailTokens0.getNoLabelActiveIndicatorShape(), composer1, 6);
            }
            else {
                composer1.startReplaceGroup(585295320);
                shape0 = ShapesKt.getValue(navigationRailTokens0.getActiveIndicatorShape(), composer1, 6);
            }
            composer1.endReplaceGroup();
            ComposableLambda composableLambda2 = ComposableLambdaKt.rememberComposableLambda(0xC9401CE, true, new lg(shape0, mappedInteractionSource0), composer1, 54);
            ComposableLambda composableLambda3 = ComposableLambdaKt.rememberComposableLambda(0x9103F59E, true, new kg(state0, navigationRailItemColors2, shape0), composer1, 54);
            boolean z10 = composer1.changed(state0);
            l l0 = composer1.rememberedValue();
            if(z10 || l0 == Composer.Companion.getEmpty()) {
                l0 = new l(state0, 6);
                composer1.updateRememberedValue(l0);
            }
            NavigationRailKt.a(composableLambda2, composableLambda3, composableLambda0, composableLambda1, z6, l0, composer1, 0xE000 & v3 >> 6 | 438);
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
            navigationRailItemColors1 = navigationRailItemColors2;
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
            navigationRailItemColors1 = navigationRailItemColors0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new mg(z, function00, function20, modifier1, z4, function22, z5, navigationRailItemColors1, mutableInteractionSource1, v, v1));
        }
    }

    public static final void a(Function2 function20, Function2 function21, Function2 function22, Function2 function23, boolean z, Function0 function00, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x594FC274);
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
                ComposerKt.traceEventStart(0x594FC274, v1, -1, "androidx.compose.material3.NavigationRailItemLayout (NavigationRail.kt:514)");
            }
            og og0 = composer1.rememberedValue();
            if((((v1 & 0x1C00) == 0x800 ? 1 : 0) | ((0x70000 & v1) == 0x20000 ? 1 : 0) | ((0xE000 & v1) == 0x4000 ? 1 : 0)) != 0 || og0 == Composer.Companion.getEmpty()) {
                og0 = new og(function00, function23, z);
                composer1.updateRememberedValue(og0);
            }
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier0 = ComposedModifierKt.materializeModifier(composer1, modifier$Companion0);
            Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
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
            Function2 function24 = a.r(composeUiNode$Companion0, composer1, og0, composer1, compositionLocalMap0);
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
            composer1.startReplaceGroup(0x7FE0386D);
            if(function23 != null) {
                Modifier modifier3 = LayoutIdKt.layoutId(modifier$Companion0, "label");
                se se0 = composer1.rememberedValue();
                if((((0xE000 & v1) == 0x4000 ? 1 : 0) | ((0x70000 & v1) == 0x20000 ? 1 : 0)) != 0 || se0 == Composer.Companion.getEmpty()) {
                    se0 = new se(z, function00, 1);
                    composer1.updateRememberedValue(se0);
                }
                Modifier modifier4 = GraphicsLayerModifierKt.graphicsLayer(modifier3, se0);
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
            scopeUpdateScope0.updateScope(new ue(function20, function21, function22, function23, z, function00, v, 1));
        }
    }

    public static final float access$getIndicatorHorizontalPadding$p() [...] // 潜在的解密器

    public static final float access$getIndicatorVerticalPaddingNoLabel$p() [...] // 潜在的解密器

    public static final float access$getNavigationRailHeaderPadding$p() [...] // 潜在的解密器

    public static final MeasureResult access$placeIcon-X9ElhV4(MeasureScope measureScope0, Placeable placeable0, Placeable placeable1, Placeable placeable2, long v) {
        int v1 = ConstraintsKt.constrainWidth-K40F9xA(v, Math.max(placeable0.getWidth(), Math.max(placeable1.getWidth(), (placeable2 == null ? 0 : placeable2.getWidth()))));
        int v2 = ConstraintsKt.constrainHeight-K40F9xA(v, measureScope0.roundToPx-0680j_4(NavigationRailKt.d));
        return MeasureScope.layout$default(measureScope0, v1, v2, null, new pg(q.d(placeable0, v1, 2), q.A(placeable0, v2, 2), q.d(placeable1, v1, 2), q.A(placeable1, v2, 2), v1, v2, placeable2, placeable0, placeable1), 4, null);
    }

    public static final MeasureResult access$placeLabelAndIcon-zUg2_y0(MeasureScope measureScope0, Placeable placeable0, Placeable placeable1, Placeable placeable2, Placeable placeable3, long v, boolean z, float f) {
        float f1 = measureScope0.toPx-0680j_4(NavigationRailKt.g);
        float f2 = measureScope0.toPx-0680j_4(NavigationRailKt.e) + (f1 + ((float)placeable1.getHeight())) + ((float)placeable0.getHeight());
        float f3 = c.coerceAtLeast((((float)Constraints.getMinHeight-impl(v)) - f2) / 2.0f, measureScope0.toPx-0680j_4(NavigationRailKt.g));
        float f4 = f3 * 2.0f + f2;
        float f5 = measureScope0.toPx-0680j_4(NavigationRailKt.g);
        float f6 = measureScope0.toPx-0680j_4(NavigationRailKt.e) + (f5 + (((float)placeable1.getHeight()) + f3));
        int v1 = ConstraintsKt.constrainWidth-K40F9xA(v, Math.max(placeable1.getWidth(), Math.max(placeable0.getWidth(), (placeable3 == null ? 0 : placeable3.getWidth()))));
        int v2 = q.d(placeable0, v1, 2);
        int v3 = q.d(placeable1, v1, 2);
        int v4 = q.d(placeable2, v1, 2);
        float f7 = measureScope0.toPx-0680j_4(NavigationRailKt.g);
        return MeasureScope.layout$default(measureScope0, v1, zd.c.roundToInt(f4), null, new qg(placeable3, z, f, placeable0, v2, f6, (1.0f - f) * ((z ? f3 : (f4 - ((float)placeable1.getHeight())) / 2.0f) - f3), placeable1, v3, f3, placeable2, v4, f3 - f7, v1, measureScope0), 4, null);
    }

    public static final float getNavigationRailItemHeight() [...] // 潜在的解密器

    public static final float getNavigationRailItemVerticalPadding() {
        return NavigationRailKt.e;
    }

    public static final float getNavigationRailItemWidth() [...] // 潜在的解密器

    public static final float getNavigationRailVerticalPadding() [...] // 潜在的解密器
}

