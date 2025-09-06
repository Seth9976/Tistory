package androidx.compose.material3;

import androidx.compose.animation.core.SnapSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.material3.tokens.SwitchTokens;
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
import androidx.compose.ui.Alignment.Companion;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import androidx.room.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00008\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001An\u0010\u000F\u001A\u00020\u00032\u0006\u0010\u0001\u001A\u00020\u00002\u0014\u0010\u0004\u001A\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\u0015\b\u0002\u0010\t\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\u0002\b\b2\b\b\u0002\u0010\n\u001A\u00020\u00002\b\b\u0002\u0010\f\u001A\u00020\u000B2\n\b\u0002\u0010\u000E\u001A\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u000F\u0010\u0010\"\u001A\u0010\u0016\u001A\u00020\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u0015\"\u001A\u0010\u0019\u001A\u00020\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001A\u0004\b\u0018\u0010\u0015¨\u0006\u001A"}, d2 = {"", "checked", "Lkotlin/Function1;", "", "onCheckedChange", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "thumbContent", "enabled", "Landroidx/compose/material3/SwitchColors;", "colors", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Switch", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/SwitchColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/unit/Dp;", "a", "F", "getThumbDiameter", "()F", "ThumbDiameter", "b", "getUncheckedThumbDiameter", "UncheckedThumbDiameter", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSwitch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Switch.kt\nandroidx/compose/material3/SwitchKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,625:1\n1223#2,6:626\n71#3:632\n68#3,6:633\n74#3:667\n71#3:669\n69#3,5:670\n74#3:703\n78#3:707\n78#3:711\n78#4,6:639\n85#4,4:654\n89#4,2:664\n78#4,6:675\n85#4,4:690\n89#4,2:700\n93#4:706\n93#4:710\n368#5,9:645\n377#5:666\n368#5,9:681\n377#5:702\n378#5,2:704\n378#5,2:708\n4032#6,6:658\n4032#6,6:694\n71#7:668\n56#7:712\n71#7:713\n*S KotlinDebug\n*F\n+ 1 Switch.kt\nandroidx/compose/material3/SwitchKt\n*L\n102#1:626,6\n150#1:632\n150#1:633,6\n150#1:667\n155#1:669\n155#1:670,5\n155#1:703\n155#1:707\n150#1:711\n150#1:639,6\n150#1:654,4\n150#1:664,2\n155#1:675,6\n155#1:690,4\n155#1:700,2\n155#1:706\n150#1:710\n150#1:645,9\n150#1:666\n155#1:681,9\n155#1:702\n155#1:704,2\n150#1:708,2\n150#1:658,6\n155#1:694,6\n164#1:668\n622#1:712\n622#1:713\n*E\n"})
public final class SwitchKt {
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;
    public static final SnapSpec f;
    public static final TweenSpec g;

    static {
        SwitchKt.a = 0.0f;
        SwitchKt.b = 0.0f;
        SwitchKt.c = 0.0f;
        SwitchKt.d = 0.0f;
        SwitchKt.e = 0.0f;
        SwitchKt.f = new SnapSpec(0, 1, null);
        SwitchKt.g = new TweenSpec(100, 0, null, 6, null);
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void Switch(boolean z, @Nullable Function1 function10, @Nullable Modifier modifier0, @Nullable Function2 function20, boolean z1, @Nullable SwitchColors switchColors0, @Nullable MutableInteractionSource mutableInteractionSource0, @Nullable Composer composer0, int v, int v1) {
        SwitchColors switchColors2;
        boolean z3;
        Function2 function22;
        MutableInteractionSource mutableInteractionSource4;
        Modifier modifier2;
        MutableInteractionSource mutableInteractionSource2;
        SwitchColors switchColors3;
        boolean z4;
        Function2 function23;
        int v4;
        MutableInteractionSource mutableInteractionSource1;
        int v3;
        SwitchColors switchColors1;
        boolean z2;
        Function2 function21;
        Modifier modifier1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(1580463220);
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
            v2 |= (composer1.changedInstance(function10) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
            modifier1 = modifier0;
        }
        else if((v & 0x180) == 0) {
            modifier1 = modifier0;
            v2 |= (composer1.changed(modifier1) ? 0x100 : 0x80);
        }
        else {
            modifier1 = modifier0;
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
            function21 = function20;
        }
        else if((v & 0xC00) == 0) {
            function21 = function20;
            v2 |= (composer1.changedInstance(function21) ? 0x800 : 0x400);
        }
        else {
            function21 = function20;
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
            z2 = z1;
        }
        else if((v & 0x6000) == 0) {
            z2 = z1;
            v2 |= (composer1.changed(z2) ? 0x4000 : 0x2000);
        }
        else {
            z2 = z1;
        }
        if((0x30000 & v) == 0) {
            if((v1 & 0x20) == 0) {
                switchColors1 = switchColors0;
                v3 = composer1.changed(switchColors1) ? 0x20000 : 0x10000;
            }
            else {
                switchColors1 = switchColors0;
                v3 = 0x10000;
            }
            v2 |= v3;
        }
        else {
            switchColors1 = switchColors0;
        }
        if((v1 & 0x40) != 0) {
            v2 |= 0x180000;
            mutableInteractionSource1 = mutableInteractionSource0;
        }
        else if((0x180000 & v) == 0) {
            mutableInteractionSource1 = mutableInteractionSource0;
            v2 |= (composer1.changed(mutableInteractionSource1) ? 0x100000 : 0x80000);
        }
        else {
            mutableInteractionSource1 = mutableInteractionSource0;
        }
        if((v2 & 0x92493) != 0x92492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                Modifier modifier3 = (v1 & 4) == 0 ? modifier0 : Modifier.Companion;
                if((v1 & 8) != 0) {
                    function21 = null;
                }
                if((v1 & 16) != 0) {
                    z2 = true;
                }
                if((v1 & 0x20) != 0) {
                    v2 &= 0xFFF8FFFF;
                    switchColors1 = SwitchDefaults.INSTANCE.colors(composer1, 6);
                }
                if((v1 & 0x40) == 0) {
                    v4 = v2;
                    function23 = function21;
                    z4 = z2;
                    switchColors3 = switchColors1;
                    mutableInteractionSource2 = mutableInteractionSource1;
                    modifier2 = modifier3;
                }
                else {
                    modifier2 = modifier3;
                    v4 = v2;
                    function23 = function21;
                    z4 = z2;
                    switchColors3 = switchColors1;
                    mutableInteractionSource2 = null;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 0x20) != 0) {
                    v2 &= 0xFFF8FFFF;
                }
                v4 = v2;
                function23 = function21;
                z4 = z2;
                switchColors3 = switchColors1;
                mutableInteractionSource2 = mutableInteractionSource1;
                modifier2 = modifier0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1580463220, v4, -1, "androidx.compose.material3.Switch (Switch.kt:99)");
            }
            composer1.startReplaceGroup(0x2EB3C1F3);
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
            Modifier modifier4 = function10 == null ? Modifier.Companion : ToggleableKt.toggleable-O2vRcR0(InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.Companion), z, mutableInteractionSource4, null, z4, Role.box-impl(2), function10);
            SwitchKt.a(SizeKt.requiredSize-VpY3zN4(SizeKt.wrapContentSize$default(modifier2.then(modifier4), Alignment.Companion.getCenter(), false, 2, null), SwitchKt.c, SwitchKt.d), z, z4, switchColors3, function23, mutableInteractionSource4, ShapesKt.getValue(SwitchTokens.INSTANCE.getHandleShape(), composer1, 6), composer1, v4 << 3 & 0x70 | v4 >> 6 & 0x380 | v4 >> 6 & 0x1C00 | v4 << 3 & 0xE000);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
            function22 = function23;
            z3 = z4;
            switchColors2 = switchColors3;
            mutableInteractionSource1 = mutableInteractionSource2;
        }
        else {
            composer1.skipToGroupEnd();
            function22 = function21;
            z3 = z2;
            switchColors2 = switchColors1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new gb(z, function10, modifier1, function22, z3, switchColors2, mutableInteractionSource1, v, v1));
        }
    }

    public static final void a(Modifier modifier0, boolean z, boolean z1, SwitchColors switchColors0, Function2 function20, InteractionSource interactionSource0, Shape shape0, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xA0FBFA36);
        int v1 = (v & 6) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (composer1.changed(z) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (composer1.changed(z1) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (composer1.changed(switchColors0) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            v1 |= (composer1.changedInstance(function20) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v) == 0) {
            v1 |= (composer1.changed(interactionSource0) ? 0x20000 : 0x10000);
        }
        if((0x180000 & v) == 0) {
            v1 |= (composer1.changed(shape0) ? 0x100000 : 0x80000);
        }
        if((0x92493 & v1) != 0x92492 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xA0FBFA36, v1, -1, "androidx.compose.material3.SwitchImpl (Switch.kt:144)");
            }
            long v2 = switchColors0.trackColor-WaAFU9c$material3_release(z1, z);
            long v3 = switchColors0.thumbColor-WaAFU9c$material3_release(z1, z);
            Shape shape1 = ShapesKt.getValue(SwitchTokens.INSTANCE.getTrackShape(), composer1, 6);
            Modifier modifier1 = BackgroundKt.background-bw27NRU(BorderKt.border-xT4_qwU(modifier0, 0.0f, switchColors0.borderColor-WaAFU9c$material3_release(z1, z), shape1), v2, shape1);
            Companion alignment$Companion0 = Alignment.Companion;
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
            int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier2 = ComposedModifierKt.materializeModifier(composer1, modifier1);
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
            Function2 function21 = a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v4)) {
                a.t(v4, composer1, v4, function21);
            }
            Updater.set-impl(composer1, modifier2, composeUiNode$Companion0.getSetModifier());
            Modifier modifier3 = BackgroundKt.background-bw27NRU(IndicationKt.indication(BoxScopeInstance.INSTANCE.align(Modifier.Companion, alignment$Companion0.getCenterStart()).then(new ThumbElement(interactionSource0, z)), interactionSource0, RippleKt.rippleOrFallbackImplementation-9IZ8Weo(false, 0.0f, 0L, composer1, 54, 4)), v3, shape0);
            MeasurePolicy measurePolicy1 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getCenter(), false);
            int v5 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier4 = ComposedModifierKt.materializeModifier(composer1, modifier3);
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
            Function2 function22 = a.r(composeUiNode$Companion0, composer1, measurePolicy1, composer1, compositionLocalMap1);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v5)) {
                a.t(v5, composer1, v5, function22);
            }
            r0.a.z(composeUiNode$Companion0, composer1, modifier4, composer1, 0x4558F502);
            if(function20 != null) {
                CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.box-impl(switchColors0.iconColor-WaAFU9c$material3_release(z1, z))), function20, composer1, ProvidedValue.$stable | v1 >> 9 & 0x70);
            }
            composer1.endReplaceGroup();
            composer1.endNode();
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new wm(modifier0, z, z1, switchColors0, function20, interactionSource0, shape0, v, 0));
        }
    }

    public static final float access$getSwitchHeight$p() [...] // 潜在的解密器

    public static final float access$getSwitchWidth$p() [...] // 潜在的解密器

    public static final float access$getThumbPadding$p() [...] // 潜在的解密器

    public static final float getThumbDiameter() [...] // 潜在的解密器

    public static final float getUncheckedThumbDiameter() [...] // 潜在的解密器
}

