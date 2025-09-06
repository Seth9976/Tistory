package androidx.compose.material3;

import a5.b;
import androidx.compose.animation.ColorVectorConverterKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition.Segment;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.layout.LayoutIdKt;
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

@Metadata(d1 = {"\u0000H\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001A\u008A\u0001\u0010\u0012\u001A\u00020\u00032\u0006\u0010\u0001\u001A\u00020\u00002\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00002\u0015\b\u0002\u0010\t\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u00A2\u0006\u0002\b\b2\u0015\b\u0002\u0010\n\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u00A2\u0006\u0002\b\b2\b\b\u0002\u0010\f\u001A\u00020\u000B2\b\b\u0002\u0010\r\u001A\u00020\u000B2\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u000EH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0010\u0010\u0011\u001A\u0082\u0001\u0010\u0015\u001A\u00020\u00032\u0006\u0010\u0001\u001A\u00020\u00002\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00022\u0011\u0010\t\u001A\r\u0012\u0004\u0012\u00020\u00030\u0002\u00A2\u0006\u0002\b\b2\u0011\u0010\n\u001A\r\u0012\u0004\u0012\u00020\u00030\u0002\u00A2\u0006\u0002\b\b2\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00002\b\b\u0002\u0010\f\u001A\u00020\u000B2\b\b\u0002\u0010\r\u001A\u00020\u000B2\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u000EH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0013\u0010\u0014\u001Az\u0010\u0012\u001A\u00020\u00032\u0006\u0010\u0001\u001A\u00020\u00002\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00002\b\b\u0002\u0010\f\u001A\u00020\u000B2\b\b\u0002\u0010\r\u001A\u00020\u000B2\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u000E2\u001C\u0010\u0019\u001A\u0018\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00030\u0016\u00A2\u0006\u0002\b\b\u00A2\u0006\u0002\b\u0018H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001A\u0010\u001B\"\u001A\u0010!\u001A\u00020\u001C8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b\u001D\u0010\u001E\u001A\u0004\b\u001F\u0010 \u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006#\u00B2\u0006\f\u0010\"\u001A\u00020\u000B8\nX\u008A\u0084\u0002"}, d2 = {"", "selected", "Lkotlin/Function0;", "", "onClick", "Landroidx/compose/ui/Modifier;", "modifier", "enabled", "Landroidx/compose/runtime/Composable;", "text", "icon", "Landroidx/compose/ui/graphics/Color;", "selectedContentColor", "unselectedContentColor", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Tab-wqdebIU", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;JJLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "Tab", "LeadingIconTab-wqdebIU", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZJJLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "LeadingIconTab", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "content", "Tab-bogVsAg", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZJJLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/unit/Dp;", "c", "F", "getHorizontalTextPadding", "()F", "HorizontalTextPadding", "color", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tab.kt\nandroidx/compose/material3/TabKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Transition.kt\nandroidx/compose/animation/TransitionKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 11 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,450:1\n77#2:451\n77#2:452\n77#2:453\n68#3:454\n66#3,5:455\n71#3:463\n74#3:467\n1223#4,3:460\n1226#4,3:464\n1223#4,6:475\n1882#5,7:468\n78#6:481\n76#6,8:482\n85#6,4:499\n89#6,2:509\n78#6,6:519\n85#6,4:534\n89#6,2:544\n93#6:550\n78#6,6:559\n85#6,4:574\n89#6,2:584\n93#6:590\n93#6:594\n368#7,9:490\n377#7:511\n368#7,9:525\n377#7:546\n378#7,2:548\n368#7,9:565\n377#7:586\n378#7,2:588\n378#7,2:592\n4032#8,6:503\n4032#8,6:538\n4032#8,6:578\n71#9:512\n68#9,6:513\n74#9:547\n78#9:551\n71#9:552\n68#9,6:553\n74#9:587\n78#9:591\n81#10:595\n148#11:596\n148#11:597\n148#11:598\n148#11:599\n148#11:600\n*S KotlinDebug\n*F\n+ 1 Tab.kt\nandroidx/compose/material3/TabKt\n*L\n100#1:451\n165#1:452\n239#1:453\n283#1:454\n283#1:455,5\n283#1:463\n283#1:467\n283#1:460,3\n283#1:464,3\n315#1:475,6\n283#1:468,7\n308#1:481\n308#1:482,8\n308#1:499,4\n308#1:509,2\n310#1:519,6\n310#1:534,4\n310#1:544,2\n310#1:550\n313#1:559,6\n313#1:574,4\n313#1:584,2\n313#1:590\n308#1:594\n308#1:490,9\n308#1:511\n310#1:525,9\n310#1:546\n310#1:548,2\n313#1:565,9\n313#1:586\n313#1:588,2\n308#1:592,2\n308#1:503,6\n310#1:538,6\n313#1:578,6\n310#1:512\n310#1:513,6\n310#1:547\n310#1:551\n313#1:552\n313#1:553,6\n313#1:587\n313#1:591\n283#1:595\n427#1:596\n435#1:597\n439#1:598\n443#1:599\n449#1:600\n*E\n"})
public final class TabKt {
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;
    public static final long f;
    public static final float g;

    static {
        TabKt.a = 0.0f;
        TabKt.b = 72.0f;
        TabKt.c = 16.0f;
        TabKt.d = 14.0f;
        TabKt.e = 6.0f;
        TabKt.f = 0x141A00000L;
        TabKt.g = 8.0f;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void LeadingIconTab-wqdebIU(boolean z, @NotNull Function0 function00, @NotNull Function2 function20, @NotNull Function2 function21, @Nullable Modifier modifier0, boolean z1, long v, long v1, @Nullable MutableInteractionSource mutableInteractionSource0, @Nullable Composer composer0, int v2, int v3) {
        long v7;
        long v6;
        MutableInteractionSource mutableInteractionSource1;
        boolean z2;
        long v8;
        boolean z3;
        long v10;
        Modifier modifier2;
        MutableInteractionSource mutableInteractionSource2;
        int v9;
        long v5;
        Modifier modifier1;
        int v4;
        Composer composer1 = composer0.startRestartGroup(0xD1AB1740);
        if((v3 & 1) == 0) {
            v4 = (v2 & 6) == 0 ? (composer1.changed(z) ? 4 : 2) | v2 : v2;
        }
        else {
            v4 = v2 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
        }
        else if((v2 & 0x30) == 0) {
            v4 |= (composer1.changedInstance(function00) ? 0x20 : 16);
        }
        if((v3 & 4) != 0) {
            v4 |= 0x180;
        }
        else if((v2 & 0x180) == 0) {
            v4 |= (composer1.changedInstance(function20) ? 0x100 : 0x80);
        }
        if((v3 & 8) != 0) {
            v4 |= 0xC00;
        }
        else if((v2 & 0xC00) == 0) {
            v4 |= (composer1.changedInstance(function21) ? 0x800 : 0x400);
        }
        if((v3 & 16) != 0) {
            v4 |= 0x6000;
            modifier1 = modifier0;
        }
        else if((v2 & 0x6000) == 0) {
            modifier1 = modifier0;
            v4 |= (composer1.changed(modifier1) ? 0x4000 : 0x2000);
        }
        else {
            modifier1 = modifier0;
        }
        if((v3 & 0x20) != 0) {
            v4 |= 0x30000;
        }
        else if((0x30000 & v2) == 0) {
            v4 |= (composer1.changed(z1) ? 0x20000 : 0x10000);
        }
        if((0x180000 & v2) == 0) {
            v4 |= ((v3 & 0x40) != 0 || !composer1.changed(v) ? 0x80000 : 0x100000);
        }
        if((0xC00000 & v2) == 0) {
            v5 = v1;
            v4 |= ((v3 & 0x80) != 0 || !composer1.changed(v5) ? 0x400000 : 0x800000);
        }
        else {
            v5 = v1;
        }
        if((v3 & 0x100) != 0) {
            v4 |= 0x6000000;
        }
        else if((0x6000000 & v2) == 0) {
            v4 |= (composer1.changed(mutableInteractionSource0) ? 0x4000000 : 0x2000000);
        }
        if((v4 & 0x2492493) != 0x2492492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v2 & 1) == 0 || composer1.getDefaultsInvalid()) {
                if((v3 & 16) != 0) {
                    modifier1 = Modifier.Companion;
                }
                boolean z4 = (v3 & 0x20) == 0 ? z1 : true;
                if((v3 & 0x40) == 0) {
                    v8 = v;
                }
                else {
                    v8 = ((Color)composer1.consume(ContentColorKt.getLocalContentColor())).unbox-impl();
                    v4 &= 0xFFC7FFFF;
                }
                if((v3 & 0x80) != 0) {
                    v4 &= 0xFE3FFFFF;
                    v5 = v8;
                }
                if((v3 & 0x100) == 0) {
                    z3 = z4;
                label_82:
                    modifier2 = modifier1;
                    v10 = v5;
                    mutableInteractionSource2 = mutableInteractionSource0;
                    v9 = v4;
                }
                else {
                    z3 = z4;
                    v9 = v4;
                    mutableInteractionSource2 = null;
                    modifier2 = modifier1;
                    v10 = v5;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v3 & 0x40) != 0) {
                    v4 &= 0xFFC7FFFF;
                }
                if((v3 & 0x80) != 0) {
                    v4 &= 0xFE3FFFFF;
                }
                z3 = z1;
                v8 = v;
                goto label_82;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xD1AB1740, v9, -1, "androidx.compose.material3.LeadingIconTab (Tab.kt:167)");
            }
            TabKt.a(v8, v10, z, ComposableLambdaKt.rememberComposableLambda(0xE66D6804, true, new bn(modifier2, z, mutableInteractionSource2, RippleKt.rippleOrFallbackImplementation-9IZ8Weo(true, 0.0f, v8, composer1, v9 >> 12 & 0x380 | 6, 2), z3, function00, function21, function20), composer1, 54), composer1, v9 >> 18 & 0x70 | (v9 >> 18 & 14 | 0xC00) | v9 << 6 & 0x380);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z2 = z3;
            modifier1 = modifier2;
            v7 = v8;
            v6 = v10;
            mutableInteractionSource1 = mutableInteractionSource2;
        }
        else {
            composer1.skipToGroupEnd();
            z2 = z1;
            mutableInteractionSource1 = mutableInteractionSource0;
            v6 = v5;
            v7 = v;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new cn(z, function00, function20, function21, modifier1, z2, v7, v6, mutableInteractionSource1, v2, v3));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void Tab-bogVsAg(boolean z, @NotNull Function0 function00, @Nullable Modifier modifier0, boolean z1, long v, long v1, @Nullable MutableInteractionSource mutableInteractionSource0, @NotNull Function3 function30, @Nullable Composer composer0, int v2, int v3) {
        long v10;
        long v9;
        boolean z3;
        MutableInteractionSource mutableInteractionSource1;
        Modifier modifier1;
        Modifier modifier2;
        int v8;
        long v7;
        int v6;
        long v5;
        boolean z2;
        int v4;
        Composer composer1 = composer0.startRestartGroup(-202735880);
        if((v3 & 1) == 0) {
            v4 = (v2 & 6) == 0 ? (composer1.changed(z) ? 4 : 2) | v2 : v2;
        }
        else {
            v4 = v2 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
        }
        else if((v2 & 0x30) == 0) {
            v4 |= (composer1.changedInstance(function00) ? 0x20 : 16);
        }
        if((v3 & 4) != 0) {
            v4 |= 0x180;
        }
        else if((v2 & 0x180) == 0) {
            v4 |= (composer1.changed(modifier0) ? 0x100 : 0x80);
        }
        if((v3 & 8) != 0) {
            v4 |= 0xC00;
            z2 = z1;
        }
        else if((v2 & 0xC00) == 0) {
            z2 = z1;
            v4 |= (composer1.changed(z2) ? 0x800 : 0x400);
        }
        else {
            z2 = z1;
        }
        if((v2 & 0x6000) == 0) {
            if((v3 & 16) == 0) {
                v5 = v;
                v6 = composer1.changed(v5) ? 0x4000 : 0x2000;
            }
            else {
                v5 = v;
                v6 = 0x2000;
            }
            v4 |= v6;
        }
        else {
            v5 = v;
        }
        if((0x30000 & v2) == 0) {
            if((v3 & 0x20) == 0) {
                v7 = v1;
                v8 = composer1.changed(v7) ? 0x20000 : 0x10000;
            }
            else {
                v7 = v1;
                v8 = 0x10000;
            }
            v4 |= v8;
        }
        else {
            v7 = v1;
        }
        if((v3 & 0x40) != 0) {
            v4 |= 0x180000;
        }
        else if((v2 & 0x180000) == 0) {
            v4 |= (composer1.changed(mutableInteractionSource0) ? 0x100000 : 0x80000);
        }
        if((v3 & 0x80) != 0) {
            v4 |= 0xC00000;
        }
        else if((v2 & 0xC00000) == 0) {
            v4 |= (composer1.changedInstance(function30) ? 0x800000 : 0x400000);
        }
        if((v4 & 0x492493) != 4793490 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v2 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v3 & 4) == 0 ? modifier0 : Modifier.Companion;
                if((v3 & 8) != 0) {
                    z2 = true;
                }
                if((v3 & 16) != 0) {
                    v5 = ((Color)composer1.consume(ContentColorKt.getLocalContentColor())).unbox-impl();
                    v4 &= 0xFFFF1FFF;
                }
                if((v3 & 0x20) != 0) {
                    v4 &= 0xFFF8FFFF;
                    v7 = v5;
                }
                mutableInteractionSource1 = (v3 & 0x40) == 0 ? mutableInteractionSource0 : null;
            }
            else {
                composer1.skipToGroupEnd();
                if((v3 & 16) != 0) {
                    v4 &= 0xFFFF1FFF;
                }
                if((v3 & 0x20) != 0) {
                    v4 &= 0xFFF8FFFF;
                }
                modifier2 = modifier0;
                mutableInteractionSource1 = mutableInteractionSource0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-202735880, v4, -1, "androidx.compose.material3.Tab (Tab.kt:242)");
            }
            TabKt.a(v5, v7, z, ComposableLambdaKt.rememberComposableLambda(0xDF1ABBB4, true, new en(modifier2, z, mutableInteractionSource1, RippleKt.rippleOrFallbackImplementation-9IZ8Weo(true, 0.0f, v5, composer1, v4 >> 6 & 0x380 | 6, 2), z2, function00, function30), composer1, 54), composer1, v4 >> 12 & 0x70 | (v4 >> 12 & 14 | 0xC00) | v4 << 6 & 0x380);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            mutableInteractionSource1 = mutableInteractionSource0;
        }
        z3 = z2;
        v9 = v5;
        v10 = v7;
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new fn(z, function00, modifier1, z3, v9, v10, mutableInteractionSource1, function30, v2, v3));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void Tab-wqdebIU(boolean z, @NotNull Function0 function00, @Nullable Modifier modifier0, boolean z1, @Nullable Function2 function20, @Nullable Function2 function21, long v, long v1, @Nullable MutableInteractionSource mutableInteractionSource0, @Nullable Composer composer0, int v2, int v3) {
        long v7;
        Function2 function24;
        long v6;
        Function2 function23;
        boolean z3;
        Modifier modifier1;
        MutableInteractionSource mutableInteractionSource1;
        long v9;
        long v8;
        Modifier modifier2;
        MutableInteractionSource mutableInteractionSource2;
        Function2 function25;
        long v5;
        Function2 function22;
        boolean z2;
        int v4;
        Composer composer1 = composer0.startRestartGroup(-350627181);
        if((v3 & 1) == 0) {
            v4 = (v2 & 6) == 0 ? (composer1.changed(z) ? 4 : 2) | v2 : v2;
        }
        else {
            v4 = v2 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
        }
        else if((v2 & 0x30) == 0) {
            v4 |= (composer1.changedInstance(function00) ? 0x20 : 16);
        }
        if((v3 & 4) != 0) {
            v4 |= 0x180;
        }
        else if((v2 & 0x180) == 0) {
            v4 |= (composer1.changed(modifier0) ? 0x100 : 0x80);
        }
        if((v3 & 8) != 0) {
            v4 |= 0xC00;
            z2 = z1;
        }
        else if((v2 & 0xC00) == 0) {
            z2 = z1;
            v4 |= (composer1.changed(z2) ? 0x800 : 0x400);
        }
        else {
            z2 = z1;
        }
        if((v3 & 16) != 0) {
            v4 |= 0x6000;
            function22 = function20;
        }
        else if((v2 & 0x6000) == 0) {
            function22 = function20;
            v4 |= (composer1.changedInstance(function22) ? 0x4000 : 0x2000);
        }
        else {
            function22 = function20;
        }
        if((v3 & 0x20) != 0) {
            v4 |= 0x30000;
        }
        else if((0x30000 & v2) == 0) {
            v4 |= (composer1.changedInstance(function21) ? 0x20000 : 0x10000);
        }
        if((0x180000 & v2) == 0) {
            v4 |= ((v3 & 0x40) != 0 || !composer1.changed(v) ? 0x80000 : 0x100000);
        }
        if((v2 & 0xC00000) == 0) {
            v5 = v1;
            v4 |= ((v3 & 0x80) != 0 || !composer1.changed(v5) ? 0x400000 : 0x800000);
        }
        else {
            v5 = v1;
        }
        if((v3 & 0x100) != 0) {
            v4 |= 0x6000000;
        }
        else if((v2 & 0x6000000) == 0) {
            v4 |= (composer1.changed(mutableInteractionSource0) ? 0x4000000 : 0x2000000);
        }
        if((v4 & 0x2492493) != 0x2492492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            ComposableLambda composableLambda0 = null;
            if((v2 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v3 & 4) == 0 ? modifier0 : Modifier.Companion;
                if((v3 & 8) != 0) {
                    z2 = true;
                }
                if((v3 & 16) != 0) {
                    function22 = null;
                }
                function25 = (v3 & 0x20) == 0 ? function21 : null;
                if((v3 & 0x40) == 0) {
                    v9 = v;
                }
                else {
                    v9 = ((Color)composer1.consume(ContentColorKt.getLocalContentColor())).unbox-impl();
                    v4 &= 0xFFC7FFFF;
                }
                if((v3 & 0x80) != 0) {
                    v4 &= 0xFE3FFFFF;
                    v5 = v9;
                }
                if((v3 & 0x100) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource0;
                    v8 = v5;
                }
                else {
                    v8 = v5;
                    mutableInteractionSource2 = null;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v3 & 0x40) != 0) {
                    v4 &= 0xFFC7FFFF;
                }
                if((v3 & 0x80) != 0) {
                    v4 &= 0xFE3FFFFF;
                }
                function25 = function21;
                mutableInteractionSource2 = mutableInteractionSource0;
                modifier2 = modifier0;
                v8 = v5;
                v9 = v;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-350627181, v4, -1, "androidx.compose.material3.Tab (Tab.kt:102)");
            }
            composer1.startReplaceGroup(79583089);
            if(function22 != null) {
                composableLambda0 = ComposableLambdaKt.rememberComposableLambda(0x2A4090BC, true, new gn(function22), composer1, 54);
            }
            composer1.endReplaceGroup();
            TabKt.Tab-bogVsAg(z, function00, modifier2, z2, v9, v8, mutableInteractionSource2, ComposableLambdaKt.rememberComposableLambda(1540996038, true, new dn(composableLambda0, function25, 0), composer1, 54), composer1, v4 & 14 | 0xC00000 | v4 & 0x70 | v4 & 0x380 | v4 & 0x1C00 | 0xE000 & v4 >> 6 | 0x70000 & v4 >> 6 | v4 >> 6 & 0x380000, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            mutableInteractionSource1 = mutableInteractionSource2;
            modifier1 = modifier2;
            z3 = z2;
            v7 = v9;
            function24 = function25;
            function23 = function22;
            v6 = v8;
        }
        else {
            composer1.skipToGroupEnd();
            mutableInteractionSource1 = mutableInteractionSource0;
            modifier1 = modifier0;
            z3 = z2;
            function23 = function22;
            v6 = v5;
            function24 = function21;
            v7 = v;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new cn(z, function00, modifier1, z3, function23, function24, v7, v6, mutableInteractionSource1, v2, v3));
        }
    }

    public static final void a(long v, long v1, boolean z, Function2 function20, Composer composer0, int v2) {
        Composer composer1 = composer0.startRestartGroup(0x2BDA6088);
        int v3 = (v2 & 6) == 0 ? (composer1.changed(v) ? 4 : 2) | v2 : v2;
        if((v2 & 0x30) == 0) {
            v3 |= (composer1.changed(v1) ? 0x20 : 16);
        }
        if((v2 & 0x180) == 0) {
            v3 |= (composer1.changed(z) ? 0x100 : 0x80);
        }
        if((v2 & 0xC00) == 0) {
            v3 |= (composer1.changedInstance(function20) ? 0x800 : 0x400);
        }
        if((v3 & 0x493) != 1170 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x2BDA6088, v3, -1, "androidx.compose.material3.TabTransition (Tab.kt:279)");
            }
            Transition transition0 = TransitionKt.updateTransition(Boolean.valueOf(z), null, composer1, v3 >> 6 & 14, 2);
            boolean z1 = ((Boolean)transition0.getTargetState()).booleanValue();
            composer1.startReplaceGroup(0x88F7CF25);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x88F7CF25, 0, -1, "androidx.compose.material3.TabTransition.<anonymous> (Tab.kt:295)");
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer1.endReplaceGroup();
            ColorSpace colorSpace0 = Color.getColorSpace-impl((z1 ? v : v1));
            boolean z2 = composer1.changed(colorSpace0);
            TwoWayConverter twoWayConverter0 = composer1.rememberedValue();
            if(z2 || twoWayConverter0 == Composer.Companion.getEmpty()) {
                twoWayConverter0 = (TwoWayConverter)ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(colorSpace0);
                composer1.updateRememberedValue(twoWayConverter0);
            }
            boolean z3 = ((Boolean)transition0.getCurrentState()).booleanValue();
            composer1.startReplaceGroup(0x88F7CF25);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x88F7CF25, 0, -1, "androidx.compose.material3.TabTransition.<anonymous> (Tab.kt:295)");
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer1.endReplaceGroup();
            Color color0 = Color.box-impl((z3 ? v : v1));
            boolean z4 = ((Boolean)transition0.getTargetState()).booleanValue();
            composer1.startReplaceGroup(0x88F7CF25);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x88F7CF25, 0, -1, "androidx.compose.material3.TabTransition.<anonymous> (Tab.kt:295)");
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer1.endReplaceGroup();
            Color color1 = Color.box-impl((z4 ? v : v1));
            Segment transition$Segment0 = transition0.getSegment();
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.box-impl(((Color)TransitionKt.createTransitionAnimation(transition0, color0, color1, ((FiniteAnimationSpec)kn.w.invoke(transition$Segment0, composer1, 0)), twoWayConverter0, "ColorAnimation", composer1, 0).getValue()).unbox-impl())), function20, composer1, v3 >> 6 & 0x70 | ProvidedValue.$stable);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new jn(v, v1, z, function20, v2, 0));
        }
    }

    public static final void access$TabBaselineLayout(Function2 function20, Function2 function21, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x1EA50644);
        int v1 = (v & 6) == 0 ? (composer1.changedInstance(function20) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (composer1.changedInstance(function21) ? 0x20 : 16);
        }
        if((v1 & 19) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x1EA50644, v1, -1, "androidx.compose.material3.TabBaselineLayout (Tab.kt:306)");
            }
            in in0 = composer1.rememberedValue();
            if((((v1 & 14) == 4 ? 1 : 0) | ((v1 & 0x70) == 0x20 ? 1 : 0)) != 0 || in0 == Composer.Companion.getEmpty()) {
                in0 = new in(function20, function21, 0);
                composer1.updateRememberedValue(in0);
            }
            Companion modifier$Companion0 = Modifier.Companion;
            int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier0 = ComposedModifierKt.materializeModifier(composer1, modifier$Companion0);
            androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function00 = composeUiNode$Companion0.getConstructor();
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
            r0.a.z(composeUiNode$Companion0, composer1, modifier0, composer1, 0x33F30BBF);
            if(function20 != null) {
                Modifier modifier1 = PaddingKt.padding-VpY3zN4$default(LayoutIdKt.layoutId(modifier$Companion0, "text"), TabKt.c, 0.0f, 2, null);
                MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
                CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
                Modifier modifier2 = ComposedModifierKt.materializeModifier(composer1, modifier1);
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
                Function2 function23 = a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap1);
                if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                    a.t(v3, composer1, v3, function23);
                }
                function20.invoke(composer1, r0.a.l(composeUiNode$Companion0, composer1, modifier2, v1 & 14));
                composer1.endNode();
            }
            composer1.endReplaceGroup();
            composer1.startReplaceGroup(0x33F31C93);
            if(function21 != null) {
                Modifier modifier3 = LayoutIdKt.layoutId(modifier$Companion0, "icon");
                MeasurePolicy measurePolicy1 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
                CompositionLocalMap compositionLocalMap2 = composer1.getCurrentCompositionLocalMap();
                Modifier modifier4 = ComposedModifierKt.materializeModifier(composer1, modifier3);
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
                Function2 function24 = a.r(composeUiNode$Companion0, composer1, measurePolicy1, composer1, compositionLocalMap2);
                if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v4)) {
                    a.t(v4, composer1, v4, function24);
                }
                Updater.set-impl(composer1, modifier4, composeUiNode$Companion0.getSetModifier());
                b.y(composer1, v1 >> 3 & 14, function21);
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
            scopeUpdateScope0.updateScope(new zj(function20, function21, v, 1));
        }
    }

    public static final long access$getIconDistanceFromBaseline$p() [...] // 潜在的解密器

    public static final float access$getLargeTabHeight$p() [...] // 潜在的解密器

    public static final float access$getSmallTabHeight$p() [...] // 潜在的解密器

    public static final float access$getTextDistanceFromLeadingIcon$p() [...] // 潜在的解密器

    public static final void access$placeTextAndIcon(PlacementScope placeable$PlacementScope0, Density density0, Placeable placeable0, Placeable placeable1, int v, int v1, int v2, int v3) {
        int v4 = density0.roundToPx-0680j_4((v2 == v3 ? TabKt.d : TabKt.e));
        int v5 = density0.roundToPx-0680j_4(0.0f);
        int v6 = density0.roundToPx--R2X_6o(TabKt.f);
        int v7 = v1 - v3 - (v5 + v4);
        PlacementScope.placeRelative$default(placeable$PlacementScope0, placeable0, q.d(placeable0, v, 2), v7, 0.0f, 4, null);
        PlacementScope.placeRelative$default(placeable$PlacementScope0, placeable1, q.d(placeable1, v, 2), v7 - (v6 + placeable1.getHeight() - v2), 0.0f, 4, null);
    }

    public static final void access$placeTextOrIcon(PlacementScope placeable$PlacementScope0, Placeable placeable0, int v) {
        PlacementScope.placeRelative$default(placeable$PlacementScope0, placeable0, 0, q.A(placeable0, v, 2), 0.0f, 4, null);
    }

    public static final float getHorizontalTextPadding() [...] // 潜在的解密器
}

