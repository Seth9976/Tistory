package androidx.compose.material;

import aa.e0;
import aa.w;
import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.material3.d3;
import androidx.compose.material3.mh;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;
import p0.fa;
import p0.ga;
import p0.ia;
import p0.ja;
import p0.r;
import p0.t;
import r0.a;

@Metadata(d1 = {"\u00006\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0002\b\u0004\u001AU\u0010\f\u001A\u00020\u00032\u0006\u0010\u0001\u001A\u00020\u00002\u0014\u0010\u0004\u001A\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00002\b\b\u0002\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\u000B\u001A\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r\"\u001A\u0010\u0013\u001A\u00020\u000E8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000F\u0010\u0010\u001A\u0004\b\u0011\u0010\u0012\"\u001A\u0010\u0016\u001A\u00020\u000E8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001A\u0004\b\u0015\u0010\u0012\"\u001A\u0010\u0019\u001A\u00020\u000E8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001A\u0004\b\u0018\u0010\u0012¨\u0006!²\u0006\u000E\u0010\u001A\u001A\u00020\u00008\n@\nX\u008A\u008E\u0002²\u0006\u001A\u0010\u001B\u001A\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\nX\u008A\u0084\u0002²\u0006\f\u0010\u001C\u001A\u00020\u00008\nX\u008A\u0084\u0002²\u0006\f\u0010\u001E\u001A\u00020\u001D8\nX\u008A\u0084\u0002²\u0006\f\u0010\u001F\u001A\u00020\u001D8\nX\u008A\u0084\u0002²\u0006\f\u0010 \u001A\u00020\u001D8\nX\u008A\u0084\u0002"}, d2 = {"", "checked", "Lkotlin/Function1;", "", "onCheckedChange", "Landroidx/compose/ui/Modifier;", "modifier", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/material/SwitchColors;", "colors", "Switch", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/SwitchColors;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/unit/Dp;", "a", "F", "getTrackWidth", "()F", "TrackWidth", "b", "getTrackStrokeWidth", "TrackStrokeWidth", "c", "getThumbDiameter", "ThumbDiameter", "forceAnimationCheck", "currentOnCheckedChange", "currentChecked", "Landroidx/compose/ui/graphics/Color;", "trackColor", "thumbColor", "resolvedThumbColor", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSwitch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Switch.kt\nandroidx/compose/material/SwitchKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 11 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,422:1\n25#2:423\n25#2:432\n50#2:440\n49#2:441\n456#2,8:478\n464#2,3:492\n467#2,3:502\n25#2:507\n1116#3,6:424\n1116#3,6:433\n1116#3,6:442\n1116#3,6:448\n1116#3,6:454\n1116#3,6:496\n1116#3,6:508\n1116#3,6:514\n1116#3,6:520\n1116#3,6:529\n74#4:430\n74#4:439\n74#4:460\n74#4:526\n74#4:527\n1#5:431\n68#6,6:461\n74#6:495\n78#6:506\n79#7,11:467\n92#7:505\n3737#8,6:486\n51#9:528\n58#9:548\n81#10:535\n107#10,2:536\n81#10:538\n81#10:539\n81#10:540\n81#10:541\n81#10:542\n154#11:543\n154#11:544\n154#11:545\n154#11:546\n154#11:547\n154#11:549\n154#11:550\n154#11:551\n*S KotlinDebug\n*F\n+ 1 Switch.kt\nandroidx/compose/material/SwitchKt\n*L\n99#1:423\n108#1:432\n110#1:440\n110#1:441\n153#1:478,8\n153#1:492,3\n153#1:502,3\n221#1:507\n99#1:424,6\n108#1:433,6\n110#1:442,6\n124#1:448,6\n133#1:454,6\n179#1:496,6\n221#1:508,6\n223#1:514,6\n246#1:520,6\n262#1:529,6\n103#1:430\n109#1:439\n138#1:460\n250#1:526\n251#1:527\n153#1:461,6\n153#1:495\n153#1:506\n153#1:467,11\n153#1:505\n153#1:486,6\n251#1:528\n293#1:548\n108#1:535\n108#1:536,2\n122#1:538\n123#1:539\n242#1:540\n249#1:541\n252#1:542\n284#1:543\n285#1:544\n286#1:545\n288#1:546\n290#1:547\n297#1:549\n298#1:550\n421#1:551\n*E\n"})
public final class SwitchKt {
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;
    public static final float f;
    public static final float g;
    public static final float h;
    public static final TweenSpec i;
    public static final float j;
    public static final float k;
    public static final float l;

    static {
        SwitchKt.a = 34.0f;
        SwitchKt.b = 14.0f;
        SwitchKt.c = 20.0f;
        SwitchKt.d = 24.0f;
        SwitchKt.e = 2.0f;
        SwitchKt.f = 34.0f;
        SwitchKt.g = 20.0f;
        SwitchKt.h = 14.0f;
        SwitchKt.i = new TweenSpec(100, 0, null, 6, null);
        SwitchKt.j = 1.0f;
        SwitchKt.k = 6.0f;
        SwitchKt.l = 125.0f;
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void Switch(boolean z, @Nullable Function1 function10, @Nullable Modifier modifier0, boolean z1, @Nullable MutableInteractionSource mutableInteractionSource0, @Nullable SwitchColors switchColors0, @Nullable Composer composer0, int v, int v1) {
        SwitchColors switchColors1;
        MutableInteractionSource mutableInteractionSource1;
        Modifier modifier1;
        Modifier modifier4;
        Modifier modifier2;
        int v3;
        SwitchColors switchColors2;
        MutableInteractionSource mutableInteractionSource2;
        boolean z3;
        MutableInteractionSource mutableInteractionSource4;
        boolean z2;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x18AB249);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(z) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changedInstance(function10) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changed(modifier0) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
            z2 = z1;
        }
        else if((v & 0x1C00) == 0) {
            z2 = z1;
            v2 |= (composer1.changed(z2) ? 0x800 : 0x400);
        }
        else {
            z2 = z1;
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
        }
        else if((0xE000 & v) == 0) {
            v2 |= (composer1.changed(mutableInteractionSource0) ? 0x4000 : 0x2000);
        }
        if((v & 0x70000) == 0) {
            v2 |= ((v1 & 0x20) != 0 || !composer1.changed(switchColors0) ? 0x10000 : 0x20000);
        }
        if((0x5B6DB & v2) != 74898 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                Modifier modifier3 = (v1 & 4) == 0 ? modifier0 : Modifier.Companion;
                boolean z4 = (v1 & 8) == 0 ? z2 : true;
                if((v1 & 16) == 0) {
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
                if((v1 & 0x20) == 0) {
                    v3 = v2;
                    modifier2 = modifier3;
                    z3 = z4;
                    mutableInteractionSource2 = mutableInteractionSource4;
                    switchColors2 = switchColors0;
                }
                else {
                    modifier2 = modifier3;
                    z3 = z4;
                    mutableInteractionSource2 = mutableInteractionSource4;
                    switchColors2 = SwitchDefaults.INSTANCE.colors-SQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composer1, 0, 6, 0x3FF);
                    v3 = v2 & 0xFFF8FFFF;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 0x20) != 0) {
                    v2 &= 0xFFF8FFFF;
                }
                z3 = z2;
                mutableInteractionSource2 = mutableInteractionSource0;
                switchColors2 = switchColors0;
                v3 = v2;
                modifier2 = modifier0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x18AB249, v3, -1, "androidx.compose.material.Switch (Switch.kt:100)");
            }
            float f = ((Density)composer1.consume(CompositionLocalsKt.getLocalDensity())).toPx-0680j_4(SwitchKt.h);
            composer1.startReplaceableGroup(0xE2A708A4);
            MutableState mutableState0 = composer1.rememberedValue();
            Companion composer$Companion0 = Composer.Companion;
            if(mutableState0 == composer$Companion0.getEmpty()) {
                mutableState0 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer1.updateRememberedValue(mutableState0);
            }
            composer1.endReplaceableGroup();
            float f1 = ((Density)composer1.consume(CompositionLocalsKt.getLocalDensity())).toPx-0680j_4(SwitchKt.l);
            composer1.startReplaceableGroup(0x1E7B2B64);
            boolean z5 = composer1.changed(f);
            boolean z6 = composer1.changed(f1);
            AnchoredDraggableState anchoredDraggableState0 = composer1.rememberedValue();
            if(z5 || z6 || anchoredDraggableState0 == composer$Companion0.getEmpty()) {
                DraggableAnchors draggableAnchors0 = AnchoredDraggableKt.DraggableAnchors(new e0(f, 12));
                mh mh0 = new mh(f1, 2);
                anchoredDraggableState0 = new AnchoredDraggableState(Boolean.valueOf(z), draggableAnchors0, r.Q, mh0, SwitchKt.i, null, 0x20, null);
                composer1.updateRememberedValue(anchoredDraggableState0);
            }
            composer1.endReplaceableGroup();
            State state0 = SnapshotStateKt.rememberUpdatedState(function10, composer1, v3 >> 3 & 14);
            State state1 = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z), composer1, v3 & 14);
            composer1.startReplaceableGroup(1204583054);
            boolean z7 = composer1.changed(anchoredDraggableState0);
            boolean z8 = composer1.changed(state1);
            boolean z9 = composer1.changed(state0);
            boolean z10 = composer1.changed(mutableState0);
            fa fa0 = composer1.rememberedValue();
            if((z7 | z8 | z9 | z10) != 0 || fa0 == composer$Companion0.getEmpty()) {
                fa0 = new fa(anchoredDraggableState0, state1, state0, mutableState0, null);
                composer1.updateRememberedValue(fa0);
            }
            composer1.endReplaceableGroup();
            EffectsKt.LaunchedEffect(anchoredDraggableState0, fa0, composer1, 0x40);
            Boolean boolean0 = Boolean.valueOf(z);
            Boolean boolean1 = (Boolean)mutableState0.getValue();
            boolean1.booleanValue();
            composer1.startReplaceableGroup(0x47CC7BFB);
            boolean z11 = composer1.changed(z);
            boolean z12 = composer1.changed(anchoredDraggableState0);
            ga ga0 = composer1.rememberedValue();
            if(z11 || z12 || ga0 == composer$Companion0.getEmpty()) {
                ga0 = new ga(z, anchoredDraggableState0, null);
                composer1.updateRememberedValue(ga0);
            }
            composer1.endReplaceableGroup();
            EffectsKt.LaunchedEffect(boolean0, boolean1, ga0, composer1, v3 & 14 | 0x200);
            boolean z13 = composer1.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
            if(function10 == null) {
                modifier4 = Modifier.Companion;
            }
            else {
                Role role0 = Role.box-impl(2);
                modifier4 = ToggleableKt.toggleable-O2vRcR0(Modifier.Companion, z, mutableInteractionSource2, null, z3, role0, function10);
            }
            Modifier modifier5 = function10 == null ? Modifier.Companion : InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.Companion);
            Modifier modifier6 = SizeKt.requiredSize-VpY3zN4(PaddingKt.padding-3ABfNKs(SizeKt.wrapContentSize$default(AnchoredDraggableKt.anchoredDraggable(modifier2.then(modifier5).then(modifier4), anchoredDraggableState0, Orientation.Horizontal, z3 && function10 != null, z13, mutableInteractionSource2, false), Alignment.Companion.getCenter(), false, 2, null), SwitchKt.e), SwitchKt.f, SwitchKt.g);
            composer1.startReplaceableGroup(0x2BB5B5D7);
            MeasurePolicy measurePolicy0 = a.i(Alignment.Companion, false, composer1, 0, -1323940314);
            int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function00 = composeUiNode$Companion0.getConstructor();
            Function3 function30 = LayoutKt.modifierMaterializerOf(modifier6);
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
            Function2 function20 = androidx.room.a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v4)) {
                androidx.room.a.t(v4, composer1, v4, function20);
            }
            a.w(0, function30, SkippableUpdater.box-impl(composer1), composer1, 2058660585);
            BoxScopeInstance boxScopeInstance0 = BoxScopeInstance.INSTANCE;
            boolean z14 = ((Boolean)anchoredDraggableState0.getTargetValue()).booleanValue();
            composer1.startReplaceableGroup(0x47CC820C);
            boolean z15 = composer1.changed(anchoredDraggableState0);
            t t0 = composer1.rememberedValue();
            if(z15 || t0 == composer$Companion0.getEmpty()) {
                t0 = new t(anchoredDraggableState0, 6);
                composer1.updateRememberedValue(t0);
            }
            composer1.endReplaceableGroup();
            SwitchKt.a(boxScopeInstance0, z14, z3, switchColors2, t0, mutableInteractionSource2, composer1, v3 >> 3 & 0x380 | 6 | v3 >> 6 & 0x1C00 | v3 << 3 & 0x70000);
            composer1.endReplaceableGroup();
            composer1.endNode();
            composer1.endReplaceableGroup();
            composer1.endReplaceableGroup();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
            z2 = z3;
            mutableInteractionSource1 = mutableInteractionSource2;
            switchColors1 = switchColors2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            mutableInteractionSource1 = mutableInteractionSource0;
            switchColors1 = switchColors0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new d3(z, function10, modifier1, z2, mutableInteractionSource1, switchColors1, v, v1, 6));
        }
    }

    public static final void a(BoxScope boxScope0, boolean z, boolean z1, SwitchColors switchColors0, Function0 function00, InteractionSource interactionSource0, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x439FBF2);
        int v1 = (v & 14) == 0 ? (composer1.changed(boxScope0) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changed(z) ? 0x20 : 16);
        }
        if((v & 0x380) == 0) {
            v1 |= (composer1.changed(z1) ? 0x100 : 0x80);
        }
        if((v & 0x1C00) == 0) {
            v1 |= (composer1.changed(switchColors0) ? 0x800 : 0x400);
        }
        if((0xE000 & v) == 0) {
            v1 |= (composer1.changedInstance(function00) ? 0x4000 : 0x2000);
        }
        if((0x70000 & v) == 0) {
            v1 |= (composer1.changed(interactionSource0) ? 0x20000 : 0x10000);
        }
        if((0x5B6DB & v1) != 74898 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x439FBF2, v1, -1, "androidx.compose.material.SwitchImpl (Switch.kt:219)");
            }
            composer1.startReplaceableGroup(0xE2A708A4);
            SnapshotStateList snapshotStateList0 = composer1.rememberedValue();
            Companion composer$Companion0 = Composer.Companion;
            if(snapshotStateList0 == composer$Companion0.getEmpty()) {
                snapshotStateList0 = SnapshotStateKt.mutableStateListOf();
                composer1.updateRememberedValue(snapshotStateList0);
            }
            composer1.endReplaceableGroup();
            composer1.startReplaceableGroup(0x47CC8709);
            boolean z2 = composer1.changed(interactionSource0);
            boolean z3 = composer1.changed(snapshotStateList0);
            ia ia0 = composer1.rememberedValue();
            if(z2 || z3 || ia0 == composer$Companion0.getEmpty()) {
                ia0 = new ia(interactionSource0, snapshotStateList0, null);
                composer1.updateRememberedValue(ia0);
            }
            composer1.endReplaceableGroup();
            EffectsKt.LaunchedEffect(interactionSource0, ia0, composer1, v1 >> 15 & 14 | 0x40);
            float f = snapshotStateList0.isEmpty() ? SwitchKt.j : SwitchKt.k;
            int v2 = v1 >> 6 & 14 | v1 & 0x70 | v1 >> 3 & 0x380;
            State state0 = switchColors0.trackColor(z1, z, composer1, v2);
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
            Modifier modifier0 = SizeKt.fillMaxSize$default(boxScope0.align(modifier$Companion0, alignment$Companion0.getCenter()), 0.0f, 1, null);
            composer1.startReplaceableGroup(1204587189);
            boolean z4 = composer1.changed(state0);
            w w0 = composer1.rememberedValue();
            if(z4 || w0 == composer$Companion0.getEmpty()) {
                w0 = new w(state0, 11);
                composer1.updateRememberedValue(w0);
            }
            composer1.endReplaceableGroup();
            CanvasKt.Canvas(modifier0, w0, composer1, 0);
            State state1 = switchColors0.thumbColor(z1, z, composer1, v2);
            ElevationOverlay elevationOverlay0 = (ElevationOverlay)composer1.consume(ElevationOverlayKt.getLocalElevationOverlay());
            float f1 = Dp.constructor-impl(((Dp)composer1.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).unbox-impl() + f);
            composer1.startReplaceableGroup(0xDFDBCBDE);
            long v3 = !Color.equals-impl0(((Color)state1.getValue()).unbox-impl(), MaterialTheme.INSTANCE.getColors(composer1, 6).getSurface-0d7_KjU()) || elevationOverlay0 == null ? ((Color)state1.getValue()).unbox-impl() : elevationOverlay0.apply-7g2Lkgo(((Color)state1.getValue()).unbox-impl(), f1, composer1, 0);
            composer1.endReplaceableGroup();
            State state2 = SingleValueAnimationKt.animateColorAsState-euL9pac(v3, null, null, null, composer1, 0, 14);
            Modifier modifier1 = boxScope0.align(modifier$Companion0, alignment$Companion0.getCenterStart());
            composer1.startReplaceableGroup(1204587807);
            boolean z5 = composer1.changedInstance(function00);
            aa.a a0 = composer1.rememberedValue();
            if(z5 || a0 == composer$Companion0.getEmpty()) {
                a0 = new aa.a(function00, 18);
                composer1.updateRememberedValue(a0);
            }
            composer1.endReplaceableGroup();
            SpacerKt.Spacer(BackgroundKt.background-bw27NRU(ShadowKt.shadow-s4CzXII$default(SizeKt.requiredSize-3ABfNKs(IndicationKt.indication(OffsetKt.offset(modifier1, a0), interactionSource0, RippleKt.rememberRipple-9IZ8Weo(false, SwitchKt.d, 0L, composer1, 54, 4)), SwitchKt.c), f, RoundedCornerShapeKt.getCircleShape(), false, 0L, 0L, 24, null), ((Color)state2.getValue()).unbox-impl(), RoundedCornerShapeKt.getCircleShape()), composer1, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new ja(boxScope0, z, z1, switchColors0, function00, interactionSource0, v));
        }
    }

    public static final boolean access$Switch$lambda$3(MutableState mutableState0) {
        return ((Boolean)mutableState0.getValue()).booleanValue();
    }

    public static final void access$Switch$lambda$4(MutableState mutableState0, boolean z) {
        mutableState0.setValue(Boolean.valueOf(z));
    }

    public static final Function1 access$Switch$lambda$7(State state0) {
        return (Function1)state0.getValue();
    }

    public static final boolean access$Switch$lambda$8(State state0) {
        return ((Boolean)state0.getValue()).booleanValue();
    }

    public static final long access$SwitchImpl$lambda$15(State state0) {
        return ((Color)state0.getValue()).unbox-impl();
    }

    public static final void access$drawTrack-RPmYEkk(DrawScope drawScope0, long v, float f, float f1) {
        DrawScope.drawLine-NGM6Ib0$default(drawScope0, v, androidx.compose.ui.geometry.OffsetKt.Offset(f1 / 2.0f, Offset.getY-impl(drawScope0.getCenter-F1C5BW0())), androidx.compose.ui.geometry.OffsetKt.Offset(f - f1 / 2.0f, Offset.getY-impl(drawScope0.getCenter-F1C5BW0())), f1, 1, null, 0.0f, null, 0, 480, null);
    }

    public static final float getThumbDiameter() {
        return SwitchKt.c;
    }

    public static final float getTrackStrokeWidth() [...] // 潜在的解密器

    public static final float getTrackWidth() [...] // 潜在的解密器
}

