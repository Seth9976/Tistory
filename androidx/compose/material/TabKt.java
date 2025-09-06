package androidx.compose.material;

import androidx.compose.animation.ColorVectorConverterKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition.Segment;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.material3.cn;
import androidx.compose.material3.dn;
import androidx.compose.material3.fn;
import androidx.compose.material3.in;
import androidx.compose.material3.jn;
import androidx.compose.material3.zj;
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
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Density;
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
import p0.ka;
import p0.la;
import p0.ma;
import p0.oa;

@Metadata(d1 = {"\u0000>\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001A\u0088\u0001\u0010\u0012\u001A\u00020\u00032\u0006\u0010\u0001\u001A\u00020\u00002\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00002\u0015\b\u0002\u0010\t\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\b2\u0015\b\u0002\u0010\n\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\b2\b\b\u0002\u0010\f\u001A\u00020\u000B2\b\b\u0002\u0010\u000E\u001A\u00020\r2\b\b\u0002\u0010\u000F\u001A\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001A\u0080\u0001\u0010\u0015\u001A\u00020\u00032\u0006\u0010\u0001\u001A\u00020\u00002\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00022\u0011\u0010\t\u001A\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\b2\u0011\u0010\n\u001A\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\b2\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00002\b\b\u0002\u0010\f\u001A\u00020\u000B2\b\b\u0002\u0010\u000E\u001A\u00020\r2\b\b\u0002\u0010\u000F\u001A\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001Ax\u0010\u0012\u001A\u00020\u00032\u0006\u0010\u0001\u001A\u00020\u00002\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00002\b\b\u0002\u0010\f\u001A\u00020\u000B2\b\b\u0002\u0010\u000E\u001A\u00020\r2\b\b\u0002\u0010\u000F\u001A\u00020\r2\u001C\u0010\u0019\u001A\u0018\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00030\u0016¢\u0006\u0002\b\b¢\u0006\u0002\b\u0018H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001A\u0010\u001B\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u001D²\u0006\f\u0010\u001C\u001A\u00020\r8\nX\u008A\u0084\u0002"}, d2 = {"", "selected", "Lkotlin/Function0;", "", "onClick", "Landroidx/compose/ui/Modifier;", "modifier", "enabled", "Landroidx/compose/runtime/Composable;", "text", "icon", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/ui/graphics/Color;", "selectedContentColor", "unselectedContentColor", "Tab-0nD-MI0", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/MutableInteractionSource;JJLandroidx/compose/runtime/Composer;II)V", "Tab", "LeadingIconTab-0nD-MI0", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;JJLandroidx/compose/runtime/Composer;II)V", "LeadingIconTab", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "content", "Tab-EVJuX4I", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;JJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "color", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tab.kt\nandroidx/compose/material/TabKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Transition.kt\nandroidx/compose/animation/TransitionKt\n+ 6 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 11 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,435:1\n25#2:436\n25#2:444\n25#2:452\n36#2:465\n456#2,8:499\n464#2,3:513\n456#2,8:533\n464#2,3:547\n467#2,3:551\n456#2,8:573\n464#2,3:587\n467#2,3:591\n467#2,3:596\n1116#3,6:437\n1116#3,6:445\n1116#3,6:453\n1116#3,3:466\n1119#3,3:470\n1116#3,6:479\n74#4:443\n74#4:451\n74#4:459\n66#5,5:460\n71#5:469\n74#5:473\n1083#6,5:474\n76#7,14:485\n79#7,11:522\n92#7:554\n79#7,11:562\n92#7:594\n92#7:599\n3737#8,6:507\n3737#8,6:541\n3737#8,6:581\n68#9,6:516\n74#9:550\n78#9:555\n68#9,6:556\n74#9:590\n78#9:595\n81#10:600\n154#11:601\n154#11:602\n154#11:603\n154#11:604\n154#11:605\n154#11:606\n*S KotlinDebug\n*F\n+ 1 Tab.kt\nandroidx/compose/material/TabKt\n*L\n98#1:436\n160#1:444\n229#1:452\n271#1:465\n306#1:499,8\n306#1:513,3\n309#1:533,8\n309#1:547,3\n309#1:551,3\n314#1:573,8\n314#1:587,3\n314#1:591,3\n306#1:596,3\n98#1:437,6\n160#1:445,6\n229#1:453,6\n271#1:466,3\n271#1:470,3\n317#1:479,6\n99#1:443\n161#1:451\n230#1:459\n271#1:460,5\n271#1:469\n271#1:473\n271#1:474,5\n306#1:485,14\n309#1:522,11\n309#1:554\n314#1:562,11\n314#1:594\n306#1:599\n306#1:507,6\n309#1:541,6\n314#1:581,6\n309#1:516,6\n309#1:550\n309#1:555\n314#1:556,6\n314#1:590\n314#1:595\n271#1:600\n414#1:601\n415#1:602\n423#1:603\n427#1:604\n430#1:605\n434#1:606\n*E\n"})
public final class TabKt {
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;
    public static final long f;
    public static final float g;

    static {
        TabKt.a = 48.0f;
        TabKt.b = 72.0f;
        TabKt.c = 16.0f;
        TabKt.d = 14.0f;
        TabKt.e = 6.0f;
        TabKt.f = 0x141A00000L;
        TabKt.g = 8.0f;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void LeadingIconTab-0nD-MI0(boolean z, @NotNull Function0 function00, @NotNull Function2 function20, @NotNull Function2 function21, @Nullable Modifier modifier0, boolean z1, @Nullable MutableInteractionSource mutableInteractionSource0, long v, long v1, @Nullable Composer composer0, int v2, int v3) {
        long v7;
        MutableInteractionSource mutableInteractionSource1;
        long v6;
        boolean z3;
        int v10;
        long v9;
        boolean z4;
        Modifier modifier2;
        long v8;
        MutableInteractionSource mutableInteractionSource2;
        long v11;
        MutableInteractionSource mutableInteractionSource4;
        long v5;
        boolean z2;
        Modifier modifier1;
        int v4;
        Composer composer1 = composer0.startRestartGroup(0xA699ECFF);
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
            v4 |= (composer1.changedInstance(function21) ? 0x800 : 0x400);
        }
        if((v3 & 16) != 0) {
            v4 |= 0x6000;
            modifier1 = modifier0;
        }
        else if((0xE000 & v2) == 0) {
            modifier1 = modifier0;
            v4 |= (composer1.changed(modifier1) ? 0x4000 : 0x2000);
        }
        else {
            modifier1 = modifier0;
        }
        if((v3 & 0x20) != 0) {
            v4 |= 0x30000;
            z2 = z1;
        }
        else if((0x70000 & v2) == 0) {
            z2 = z1;
            v4 |= (composer1.changed(z2) ? 0x20000 : 0x10000);
        }
        else {
            z2 = z1;
        }
        if((v3 & 0x40) != 0) {
            v4 |= 0x180000;
        }
        else if((0x380000 & v2) == 0) {
            v4 |= (composer1.changed(mutableInteractionSource0) ? 0x100000 : 0x80000);
        }
        if((0x1C00000 & v2) == 0) {
            v4 |= ((v3 & 0x80) != 0 || !composer1.changed(v) ? 0x400000 : 0x800000);
        }
        if((v2 & 0xE000000) == 0) {
            v5 = v1;
            v4 |= ((v3 & 0x100) != 0 || !composer1.changed(v5) ? 0x2000000 : 0x4000000);
        }
        else {
            v5 = v1;
        }
        if((0xB6DB6DB & v4) != 0x2492492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v2 & 1) == 0 || composer1.getDefaultsInvalid()) {
                if((v3 & 16) != 0) {
                    modifier1 = Modifier.Companion;
                }
                if((v3 & 0x20) != 0) {
                    z2 = true;
                }
                if((v3 & 0x40) == 0) {
                    mutableInteractionSource4 = mutableInteractionSource0;
                }
                else {
                    composer1.startReplaceableGroup(0xE2A708A4);
                    MutableInteractionSource mutableInteractionSource3 = composer1.rememberedValue();
                    if(mutableInteractionSource3 == Composer.Companion.getEmpty()) {
                        mutableInteractionSource3 = InteractionSourceKt.MutableInteractionSource();
                        composer1.updateRememberedValue(mutableInteractionSource3);
                    }
                    composer1.endReplaceableGroup();
                    mutableInteractionSource4 = mutableInteractionSource3;
                }
                if((v3 & 0x80) == 0) {
                    v11 = v;
                }
                else {
                    v11 = ((Color)composer1.consume(ContentColorKt.getLocalContentColor())).unbox-impl();
                    v4 &= 0xFE3FFFFF;
                }
                if((v3 & 0x100) == 0) {
                    z4 = z2;
                    v9 = v5;
                    v8 = v11;
                    mutableInteractionSource2 = mutableInteractionSource4;
                    v10 = v4;
                }
                else {
                    v10 = v4 & 0xF1FFFFFF;
                    z4 = z2;
                    v9 = Color.copy-wmQWz5c$default(v11, ContentAlpha.INSTANCE.getMedium(composer1, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    v8 = v11;
                    mutableInteractionSource2 = mutableInteractionSource4;
                }
                modifier2 = modifier1;
            }
            else {
                composer1.skipToGroupEnd();
                if((v3 & 0x80) != 0) {
                    v4 &= 0xFE3FFFFF;
                }
                if((v3 & 0x100) != 0) {
                    v4 &= 0xF1FFFFFF;
                }
                mutableInteractionSource2 = mutableInteractionSource0;
                v8 = v;
                modifier2 = modifier1;
                z4 = z2;
                v9 = v5;
                v10 = v4;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xA699ECFF, v10, -1, "androidx.compose.material.LeadingIconTab (Tab.kt:162)");
            }
            TabKt.a(v8, v9, z, ComposableLambdaKt.composableLambda(composer1, 0x33A873BB, true, new ka(modifier2, z, mutableInteractionSource2, RippleKt.rememberRipple-9IZ8Weo(true, 0.0f, v8, composer1, v10 >> 15 & 0x380 | 6, 2), z4, function00, function21, function20)), composer1, v10 >> 21 & 0x70 | (v10 >> 21 & 14 | 0xC00) | v10 << 6 & 0x380);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
            z3 = z4;
            mutableInteractionSource1 = mutableInteractionSource2;
            v7 = v8;
            v6 = v9;
        }
        else {
            composer1.skipToGroupEnd();
            z3 = z2;
            v6 = v5;
            mutableInteractionSource1 = mutableInteractionSource0;
            v7 = v;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new cn(z, function00, function20, function21, modifier1, z3, mutableInteractionSource1, v7, v6, v2, v3));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void Tab-0nD-MI0(boolean z, @NotNull Function0 function00, @Nullable Modifier modifier0, boolean z1, @Nullable Function2 function20, @Nullable Function2 function21, @Nullable MutableInteractionSource mutableInteractionSource0, long v, long v1, @Nullable Composer composer0, int v2, int v3) {
        long v7;
        Function2 function24;
        long v6;
        Modifier modifier2;
        MutableInteractionSource mutableInteractionSource1;
        Function2 function23;
        Function2 function26;
        int v8;
        MutableInteractionSource mutableInteractionSource2;
        Function2 function25;
        long v9;
        long v5;
        Function2 function22;
        boolean z2;
        Modifier modifier1;
        int v4;
        Composer composer1 = composer0.startRestartGroup(0xA76BF34C);
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
            modifier1 = modifier0;
        }
        else if((v2 & 0x380) == 0) {
            modifier1 = modifier0;
            v4 |= (composer1.changed(modifier1) ? 0x100 : 0x80);
        }
        else {
            modifier1 = modifier0;
        }
        if((v3 & 8) != 0) {
            v4 |= 0xC00;
            z2 = z1;
        }
        else if((v2 & 0x1C00) == 0) {
            z2 = z1;
            v4 |= (composer1.changed(z2) ? 0x800 : 0x400);
        }
        else {
            z2 = z1;
        }
        if((v3 & 16) != 0) {
            v4 |= 0x6000;
        }
        else if((v2 & 0xE000) == 0) {
            v4 |= (composer1.changedInstance(function20) ? 0x4000 : 0x2000);
        }
        if((v3 & 0x20) == 0) {
            function22 = function21;
            if((v2 & 0x70000) == 0) {
                v4 |= (composer1.changedInstance(function22) ? 0x20000 : 0x10000);
            }
        }
        else {
            v4 |= 0x30000;
            function22 = function21;
        }
        if((v3 & 0x40) != 0) {
            v4 |= 0x180000;
        }
        else if((v2 & 0x380000) == 0) {
            v4 |= (composer1.changed(mutableInteractionSource0) ? 0x100000 : 0x80000);
        }
        if((v2 & 0x1C00000) == 0) {
            v4 |= ((v3 & 0x80) != 0 || !composer1.changed(v) ? 0x400000 : 0x800000);
        }
        if((0xE000000 & v2) == 0) {
            v5 = v1;
            v4 |= ((v3 & 0x100) != 0 || !composer1.changed(v5) ? 0x2000000 : 0x4000000);
        }
        else {
            v5 = v1;
        }
        if((0xB6DB6DB & v4) != 0x2492492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            ComposableLambda composableLambda0 = null;
            if((v2 & 1) == 0 || composer1.getDefaultsInvalid()) {
                if((v3 & 4) != 0) {
                    modifier1 = Modifier.Companion;
                }
                if((v3 & 8) != 0) {
                    z2 = true;
                }
                function25 = (v3 & 16) == 0 ? function20 : null;
                if((v3 & 0x20) != 0) {
                    function22 = null;
                }
                if((v3 & 0x40) == 0) {
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
                if((v3 & 0x80) == 0) {
                    v9 = v;
                }
                else {
                    v9 = ((Color)composer1.consume(ContentColorKt.getLocalContentColor())).unbox-impl();
                    v4 &= 0xFE3FFFFF;
                }
                if((v3 & 0x100) == 0) {
                    v8 = v4;
                    v6 = v5;
                }
                else {
                    v8 = v4 & 0xF1FFFFFF;
                    v6 = Color.copy-wmQWz5c$default(v9, ContentAlpha.INSTANCE.getMedium(composer1, 6), 0.0f, 0.0f, 0.0f, 14, null);
                }
                function26 = function22;
                v7 = v9;
            }
            else {
                composer1.skipToGroupEnd();
                if((v3 & 0x80) != 0) {
                    v4 &= 0xFE3FFFFF;
                }
                if((v3 & 0x100) != 0) {
                    v4 &= 0xF1FFFFFF;
                }
                function25 = function20;
                mutableInteractionSource2 = mutableInteractionSource0;
                v8 = v4;
                v6 = v5;
                function26 = function22;
                v7 = v;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xA76BF34C, v8, -1, "androidx.compose.material.Tab (Tab.kt:100)");
            }
            if(function25 != null) {
                composableLambda0 = ComposableLambdaKt.composableLambda(composer1, 0x98F15403, true, new ma(function25));
            }
            TabKt.Tab-EVJuX4I(z, function00, modifier1, z2, mutableInteractionSource2, v7, v6, ComposableLambdaKt.composableLambda(composer1, 0xF5619FB9, true, new dn(composableLambda0, function26, 1)), composer1, 0xC00000 | v8 & 14 | v8 & 0x70 | v8 & 0x380 | v8 & 0x1C00 | 0xE000 & v8 >> 6 | 0x70000 & v8 >> 6 | v8 >> 6 & 0x380000, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            mutableInteractionSource1 = mutableInteractionSource2;
            function23 = function25;
            function24 = function26;
            modifier2 = modifier1;
        }
        else {
            composer1.skipToGroupEnd();
            function23 = function20;
            mutableInteractionSource1 = mutableInteractionSource0;
            modifier2 = modifier1;
            v6 = v5;
            function24 = function22;
            v7 = v;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new cn(z, function00, modifier2, z2, function23, function24, mutableInteractionSource1, v7, v6, v2, v3));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void Tab-EVJuX4I(boolean z, @NotNull Function0 function00, @Nullable Modifier modifier0, boolean z1, @Nullable MutableInteractionSource mutableInteractionSource0, long v, long v1, @NotNull Function3 function30, @Nullable Composer composer0, int v2, int v3) {
        long v9;
        MutableInteractionSource mutableInteractionSource2;
        boolean z3;
        long v8;
        int v11;
        long v10;
        MutableInteractionSource mutableInteractionSource4;
        boolean z4;
        Modifier modifier2;
        int v6;
        long v5;
        MutableInteractionSource mutableInteractionSource1;
        boolean z2;
        Modifier modifier1;
        int v4;
        Composer composer1 = composer0.startRestartGroup(0x2A89E147);
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
            modifier1 = modifier0;
        }
        else if((v2 & 0x380) == 0) {
            modifier1 = modifier0;
            v4 |= (composer1.changed(modifier1) ? 0x100 : 0x80);
        }
        else {
            modifier1 = modifier0;
        }
        if((v3 & 8) != 0) {
            v4 |= 0xC00;
            z2 = z1;
        }
        else if((v2 & 0x1C00) == 0) {
            z2 = z1;
            v4 |= (composer1.changed(z2) ? 0x800 : 0x400);
        }
        else {
            z2 = z1;
        }
        if((v3 & 16) != 0) {
            v4 |= 0x6000;
            mutableInteractionSource1 = mutableInteractionSource0;
        }
        else if((0xE000 & v2) == 0) {
            mutableInteractionSource1 = mutableInteractionSource0;
            v4 |= (composer1.changed(mutableInteractionSource1) ? 0x4000 : 0x2000);
        }
        else {
            mutableInteractionSource1 = mutableInteractionSource0;
        }
        if((0x70000 & v2) == 0) {
            if((v3 & 0x20) == 0) {
                v5 = v;
                v6 = composer1.changed(v5) ? 0x20000 : 0x10000;
            }
            else {
                v5 = v;
                v6 = 0x10000;
            }
            v4 |= v6;
        }
        else {
            v5 = v;
        }
        int v7 = (0x380000 & v2) == 0 ? v4 | ((v3 & 0x40) != 0 || !composer1.changed(v1) ? 0x80000 : 0x100000) : v4;
        if((v3 & 0x80) != 0) {
            v7 |= 0xC00000;
        }
        else if((0x1C00000 & v2) == 0) {
            v7 |= (composer1.changedInstance(function30) ? 0x800000 : 0x400000);
        }
        if((v7 & 0x16DB6DB) != 4793490 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v2 & 1) == 0 || composer1.getDefaultsInvalid()) {
                if((v3 & 4) != 0) {
                    modifier1 = Modifier.Companion;
                }
                if((v3 & 8) != 0) {
                    z2 = true;
                }
                if((v3 & 16) != 0) {
                    composer1.startReplaceableGroup(0xE2A708A4);
                    MutableInteractionSource mutableInteractionSource3 = composer1.rememberedValue();
                    if(mutableInteractionSource3 == Composer.Companion.getEmpty()) {
                        mutableInteractionSource3 = InteractionSourceKt.MutableInteractionSource();
                        composer1.updateRememberedValue(mutableInteractionSource3);
                    }
                    composer1.endReplaceableGroup();
                    mutableInteractionSource1 = mutableInteractionSource3;
                }
                if((v3 & 0x20) != 0) {
                    v5 = ((Color)composer1.consume(ContentColorKt.getLocalContentColor())).unbox-impl();
                    v7 &= 0xFFF8FFFF;
                }
                if((v3 & 0x40) == 0) {
                label_94:
                    v8 = v1;
                    modifier2 = modifier1;
                    z4 = z2;
                    mutableInteractionSource4 = mutableInteractionSource1;
                    v10 = v5;
                    v11 = v7;
                }
                else {
                    modifier2 = modifier1;
                    z4 = z2;
                    mutableInteractionSource4 = mutableInteractionSource1;
                    v10 = v5;
                    v11 = v7 & 0xFFC7FFFF;
                    v8 = Color.copy-wmQWz5c$default(v5, ContentAlpha.INSTANCE.getMedium(composer1, 6), 0.0f, 0.0f, 0.0f, 14, null);
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v3 & 0x20) != 0) {
                    v7 &= 0xFFF8FFFF;
                }
                if((v3 & 0x40) != 0) {
                    v7 &= 0xFFC7FFFF;
                }
                goto label_94;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x2A89E147, v11, -1, "androidx.compose.material.Tab (Tab.kt:232)");
            }
            TabKt.a(v10, v8, z, ComposableLambdaKt.composableLambda(composer1, 0xB6411D0B, true, new la(modifier2, z, mutableInteractionSource4, RippleKt.rememberRipple-9IZ8Weo(true, 0.0f, v10, composer1, v11 >> 9 & 0x380 | 6, 2), z4, function00, function30)), composer1, v11 >> 15 & 0x70 | (v11 >> 15 & 14 | 0xC00) | v11 << 6 & 0x380);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
            z3 = z4;
            mutableInteractionSource2 = mutableInteractionSource4;
            v9 = v10;
        }
        else {
            composer1.skipToGroupEnd();
            v8 = v1;
            z3 = z2;
            mutableInteractionSource2 = mutableInteractionSource1;
            v9 = v5;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new fn(z, function00, modifier1, z3, mutableInteractionSource2, v9, v8, function30, v2, v3));
        }
    }

    public static final void a(long v, long v1, boolean z, Function2 function20, Composer composer0, int v2) {
        Composer composer1 = composer0.startRestartGroup(-405571117);
        int v3 = (v2 & 14) == 0 ? (composer1.changed(v) ? 4 : 2) | v2 : v2;
        if((v2 & 0x70) == 0) {
            v3 |= (composer1.changed(v1) ? 0x20 : 16);
        }
        if((v2 & 0x380) == 0) {
            v3 |= (composer1.changed(z) ? 0x100 : 0x80);
        }
        if((v2 & 0x1C00) == 0) {
            v3 |= (composer1.changedInstance(function20) ? 0x800 : 0x400);
        }
        if((v3 & 5851) != 1170 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-405571117, v3, -1, "androidx.compose.material.TabTransition (Tab.kt:268)");
            }
            Transition transition0 = TransitionKt.updateTransition(Boolean.valueOf(z), null, composer1, v3 >> 6 & 14, 2);
            composer1.startReplaceableGroup(0x8C629A81);
            boolean z1 = ((Boolean)transition0.getTargetState()).booleanValue();
            composer1.startReplaceableGroup(1445938070);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1445938070, 0, -1, "androidx.compose.material.TabTransition.<anonymous> (Tab.kt:286)");
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer1.endReplaceableGroup();
            ColorSpace colorSpace0 = Color.getColorSpace-impl((z1 ? v : v1));
            composer1.startReplaceableGroup(0x44FAF204);
            boolean z2 = composer1.changed(colorSpace0);
            TwoWayConverter twoWayConverter0 = composer1.rememberedValue();
            if(z2 || twoWayConverter0 == Composer.Companion.getEmpty()) {
                twoWayConverter0 = (TwoWayConverter)ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(colorSpace0);
                composer1.updateRememberedValue(twoWayConverter0);
            }
            composer1.endReplaceableGroup();
            composer1.startReplaceableGroup(0xF77F2E11);
            boolean z3 = ((Boolean)transition0.getCurrentState()).booleanValue();
            composer1.startReplaceableGroup(1445938070);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1445938070, 0, -1, "androidx.compose.material.TabTransition.<anonymous> (Tab.kt:286)");
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer1.endReplaceableGroup();
            Color color0 = Color.box-impl((z3 ? v : v1));
            boolean z4 = ((Boolean)transition0.getTargetState()).booleanValue();
            composer1.startReplaceableGroup(1445938070);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1445938070, 0, -1, "androidx.compose.material.TabTransition.<anonymous> (Tab.kt:286)");
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer1.endReplaceableGroup();
            Color color1 = Color.box-impl((z4 ? v : v1));
            Segment transition$Segment0 = transition0.getSegment();
            State state0 = TransitionKt.createTransitionAnimation(transition0, color0, color1, ((FiniteAnimationSpec)oa.w.invoke(transition$Segment0, composer1, 0)), twoWayConverter0, "ColorAnimation", composer1, 0x8000);
            composer1.endReplaceableGroup();
            composer1.endReplaceableGroup();
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.box-impl(Color.copy-wmQWz5c$default(((Color)state0.getValue()).unbox-impl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null))), ContentAlphaKt.getLocalContentAlpha().provides(Color.getAlpha-impl(((Color)state0.getValue()).unbox-impl()))}, function20, composer1, v3 >> 6 & 0x70 | 8);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new jn(v, v1, z, function20, v2, 1));
        }
    }

    public static final void access$TabBaselineLayout(Function2 function20, Function2 function21, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x4A7F2C97);
        int v1 = (v & 14) == 0 ? (composer1.changedInstance(function20) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changedInstance(function21) ? 0x20 : 16);
        }
        if((v1 & 91) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x4A7F2C97, v1, -1, "androidx.compose.material.TabBaselineLayout (Tab.kt:304)");
            }
            composer1.startReplaceableGroup(782580000);
            boolean z = composer1.changedInstance(function20);
            boolean z1 = composer1.changedInstance(function21);
            in in0 = composer1.rememberedValue();
            if(z || z1 || in0 == Composer.Companion.getEmpty()) {
                in0 = new in(function20, function21, 1);
                composer1.updateRememberedValue(in0);
            }
            composer1.endReplaceableGroup();
            composer1.startReplaceableGroup(-1323940314);
            Companion modifier$Companion0 = Modifier.Companion;
            int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
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
            Function2 function22 = a.r(composeUiNode$Companion0, composer1, in0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
                a.t(v2, composer1, v2, function22);
            }
            r0.a.w(0, function30, SkippableUpdater.box-impl(composer1), composer1, 2058660585);
            composer1.startReplaceableGroup(0x80627FC6);
            if(function20 != null) {
                Modifier modifier0 = PaddingKt.padding-VpY3zN4$default(LayoutIdKt.layoutId(modifier$Companion0, "text"), TabKt.c, 0.0f, 2, null);
                composer1.startReplaceableGroup(0x2BB5B5D7);
                MeasurePolicy measurePolicy0 = r0.a.i(Alignment.Companion, false, composer1, 0, -1323940314);
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
            }
            composer1.endReplaceableGroup();
            composer1.startReplaceableGroup(0x1AB9A15F);
            if(function21 != null) {
                Modifier modifier1 = LayoutIdKt.layoutId(modifier$Companion0, "icon");
                composer1.startReplaceableGroup(0x2BB5B5D7);
                MeasurePolicy measurePolicy1 = r0.a.i(Alignment.Companion, false, composer1, 0, -1323940314);
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
            scopeUpdateScope0.updateScope(new zj(function20, function21, v, 4));
        }
    }

    public static final float access$getHorizontalTextPadding$p() [...] // 潜在的解密器

    public static final float access$getLargeTabHeight$p() [...] // 潜在的解密器

    public static final float access$getSmallTabHeight$p() [...] // 潜在的解密器

    public static final float access$getTextDistanceFromLeadingIcon$p() [...] // 潜在的解密器

    public static final void access$placeTextAndIcon(PlacementScope placeable$PlacementScope0, Density density0, Placeable placeable0, Placeable placeable1, int v, int v1, int v2, int v3) {
        int v4 = density0.roundToPx-0680j_4((v2 == v3 ? TabKt.d : TabKt.e));
        int v5 = density0.roundToPx-0680j_4(2.0f);
        int v6 = density0.roundToPx--R2X_6o(TabKt.f);
        int v7 = v1 - v3 - (v5 + v4);
        PlacementScope.placeRelative$default(placeable$PlacementScope0, placeable0, q.d(placeable0, v, 2), v7, 0.0f, 4, null);
        PlacementScope.placeRelative$default(placeable$PlacementScope0, placeable1, q.d(placeable1, v, 2), v7 - (v6 + placeable1.getHeight() - v2), 0.0f, 4, null);
    }

    public static final void access$placeTextOrIcon(PlacementScope placeable$PlacementScope0, Placeable placeable0, int v) {
        PlacementScope.placeRelative$default(placeable$PlacementScope0, placeable0, 0, q.A(placeable0, v, 2), 0.0f, 4, null);
    }
}

