package androidx.compose.material3;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.animation.core.Transition.Segment;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.unit.IntRect;
import androidx.room.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\u001A\u0086\u0001\u0010\u001B\u001A\u00020\u00152\u0006\u0010\u0001\u001A\u00020\u00002\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\r\u001A\u00020\f2\u0006\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0010\u001A\u00020\u000E2\b\u0010\u0012\u001A\u0004\u0018\u00010\u00112\u001C\u0010\u0018\u001A\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013\u00A2\u0006\u0002\b\u0016\u00A2\u0006\u0002\b\u0017H\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0019\u0010\u001A\u001A\u0084\u0001\u0010(\u001A\u00020\u00152\u0011\u0010\u001D\u001A\r\u0012\u0004\u0012\u00020\u00150\u001C\u00A2\u0006\u0002\b\u00162\f\u0010\u001E\u001A\b\u0012\u0004\u0012\u00020\u00150\u001C2\u0006\u0010\u0001\u001A\u00020\u00002\u0013\u0010\u001F\u001A\u000F\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u001C\u00A2\u0006\u0002\b\u00162\u0013\u0010 \u001A\u000F\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u001C\u00A2\u0006\u0002\b\u00162\u0006\u0010!\u001A\u00020\u00032\u0006\u0010#\u001A\u00020\"2\u0006\u0010%\u001A\u00020$2\b\u0010\'\u001A\u0004\u0018\u00010&H\u0001\u00A2\u0006\u0004\b(\u0010)\u001A\u001F\u0010-\u001A\u00020\u00062\u0006\u0010+\u001A\u00020*2\u0006\u0010,\u001A\u00020*H\u0000\u00A2\u0006\u0004\b-\u0010.\"\u001A\u00103\u001A\u00020\u000E8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b/\u00100\u001A\u0004\b1\u00102\"\u001A\u00106\u001A\u00020\u000E8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b4\u00100\u001A\u0004\b5\u00102\"\u0014\u00108\u001A\u0002078\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\b8\u00109\"\u0014\u0010:\u001A\u0002078\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\b:\u00109\"\u0014\u0010<\u001A\u00020;8\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\b<\u00100\"\u0014\u0010=\u001A\u00020;8\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\b=\u00100\"\u0014\u0010>\u001A\u00020;8\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\b>\u00100\"\u0014\u0010?\u001A\u00020;8\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\b?\u00100\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006B\u00B2\u0006\f\u0010@\u001A\u00020;8\nX\u008A\u0084\u0002\u00B2\u0006\f\u0010A\u001A\u00020;8\nX\u008A\u0084\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/animation/core/MutableTransitionState;", "", "expandedState", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/ui/graphics/TransformOrigin;", "transformOriginState", "Landroidx/compose/foundation/ScrollState;", "scrollState", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", "containerColor", "Landroidx/compose/ui/unit/Dp;", "tonalElevation", "shadowElevation", "Landroidx/compose/foundation/BorderStroke;", "border", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "content", "DropdownMenuContent-Qj0Zi0g", "(Landroidx/compose/ui/Modifier;Landroidx/compose/animation/core/MutableTransitionState;Landroidx/compose/runtime/MutableState;Landroidx/compose/foundation/ScrollState;Landroidx/compose/ui/graphics/Shape;JFFLandroidx/compose/foundation/BorderStroke;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "DropdownMenuContent", "Lkotlin/Function0;", "text", "onClick", "leadingIcon", "trailingIcon", "enabled", "Landroidx/compose/material3/MenuItemColors;", "colors", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "DropdownMenuItemContent", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/MenuItemColors;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/unit/IntRect;", "anchorBounds", "menuBounds", "calculateTransformOrigin", "(Landroidx/compose/ui/unit/IntRect;Landroidx/compose/ui/unit/IntRect;)J", "a", "F", "getMenuVerticalMargin", "()F", "MenuVerticalMargin", "d", "getDropdownMenuVerticalPadding", "DropdownMenuVerticalPadding", "", "InTransitionDuration", "I", "OutTransitionDuration", "", "ExpandedScaleTarget", "ClosedScaleTarget", "ExpandedAlphaTarget", "ClosedAlphaTarget", "scale", "alpha", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\nandroidx/compose/material3/MenuKt\n+ 2 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,560:1\n1967#2:561\n1964#2:562\n1882#2,7:563\n1967#2:570\n1964#2:571\n1882#2,7:572\n77#3:579\n1223#4,6:580\n98#5:586\n95#5,6:587\n101#5:621\n105#5:625\n78#6,6:593\n85#6,4:608\n89#6,2:618\n93#6:624\n368#7,9:599\n377#7:620\n378#7,2:622\n4032#8,6:612\n81#9:626\n81#9:627\n148#10:628\n148#10:629\n148#10:630\n148#10:631\n148#10:632\n148#10:633\n*S KotlinDebug\n*F\n+ 1 Menu.kt\nandroidx/compose/material3/MenuKt\n*L\n380#1:561\n380#1:562\n380#1:563,7\n395#1:570\n395#1:571\n395#1:572,7\n409#1:579\n412#1:580,6\n453#1:586\n453#1:587,6\n453#1:621\n453#1:625\n453#1:593,6\n453#1:608,4\n453#1:618,2\n453#1:624\n453#1:599,9\n453#1:620\n453#1:622,2\n453#1:612,6\n380#1:626\n395#1:627\n546#1:628\n547#1:629\n548#1:630\n549#1:631\n550#1:632\n551#1:633\n*E\n"})
public final class MenuKt {
    public static final float ClosedAlphaTarget = 0.0f;
    public static final float ClosedScaleTarget = 0.8f;
    public static final float ExpandedAlphaTarget = 1.0f;
    public static final float ExpandedScaleTarget = 1.0f;
    public static final int InTransitionDuration = 120;
    public static final int OutTransitionDuration = 75;
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;
    public static final float f;

    static {
        MenuKt.a = 48.0f;
        MenuKt.b = 48.0f;
        MenuKt.c = 12.0f;
        MenuKt.d = 8.0f;
        MenuKt.e = 112.0f;
        MenuKt.f = 280.0f;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void DropdownMenuContent-Qj0Zi0g(@NotNull Modifier modifier0, @NotNull MutableTransitionState mutableTransitionState0, @NotNull MutableState mutableState0, @NotNull ScrollState scrollState0, @NotNull Shape shape0, long v, float f, float f1, @Nullable BorderStroke borderStroke0, @NotNull Function3 function30, @Nullable Composer composer0, int v1) {
        int v5;
        Composer composer1 = composer0.startRestartGroup(0xF6F912C8);
        int v2 = (v1 & 6) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v1 : v1;
        if((v1 & 0x30) == 0) {
            v2 |= (((v1 & 0x40) == 0 ? composer1.changed(mutableTransitionState0) : composer1.changedInstance(mutableTransitionState0)) ? 0x20 : 16);
        }
        if((v1 & 0x180) == 0) {
            v2 |= (composer1.changed(mutableState0) ? 0x100 : 0x80);
        }
        if((v1 & 0xC00) == 0) {
            v2 |= (composer1.changed(scrollState0) ? 0x800 : 0x400);
        }
        if((v1 & 0x6000) == 0) {
            v2 |= (composer1.changed(shape0) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v1) == 0) {
            v2 |= (composer1.changed(v) ? 0x20000 : 0x10000);
        }
        if((0x180000 & v1) == 0) {
            v2 |= (composer1.changed(f) ? 0x100000 : 0x80000);
        }
        if((v1 & 0xC00000) == 0) {
            v2 |= (composer1.changed(f1) ? 0x800000 : 0x400000);
        }
        if((v1 & 0x6000000) == 0) {
            v2 |= (composer1.changed(borderStroke0) ? 0x4000000 : 0x2000000);
        }
        if((v1 & 0x30000000) == 0) {
            v2 |= (composer1.changedInstance(function30) ? 0x20000000 : 0x10000000);
        }
        if((v2 & 306783379) != 306783378 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xF6F912C8, v2, -1, "androidx.compose.material3.DropdownMenuContent (Menu.kt:374)");
            }
            Transition transition0 = TransitionKt.updateTransition(mutableTransitionState0, "DropDownMenu", composer1, MutableTransitionState.$stable | 0x30 | v2 >> 3 & 14, 0);
            FloatCompanionObject floatCompanionObject0 = FloatCompanionObject.INSTANCE;
            TwoWayConverter twoWayConverter0 = VectorConvertersKt.getVectorConverter(floatCompanionObject0);
            boolean z = ((Boolean)transition0.getCurrentState()).booleanValue();
            composer1.startReplaceGroup(0x7F7EFBE4);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x7F7EFBE4, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:390)");
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer1.endReplaceGroup();
            Float float0 = (float)(z ? 1.0f : 0.8f);
            boolean z1 = ((Boolean)transition0.getTargetState()).booleanValue();
            composer1.startReplaceGroup(0x7F7EFBE4);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x7F7EFBE4, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:390)");
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer1.endReplaceGroup();
            Segment transition$Segment0 = transition0.getSegment();
            State state0 = TransitionKt.createTransitionAnimation(transition0, float0, ((float)(z1 ? 1.0f : 0.8f)), ((FiniteAnimationSpec)uc.w.invoke(transition$Segment0, composer1, 0)), twoWayConverter0, "FloatAnimation", composer1, 0);
            TwoWayConverter twoWayConverter1 = VectorConvertersKt.getVectorConverter(floatCompanionObject0);
            boolean z2 = ((Boolean)transition0.getCurrentState()).booleanValue();
            composer1.startReplaceGroup(0xF12241F8);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xF12241F8, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:405)");
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer1.endReplaceGroup();
            Float float1 = (float)(z2 ? 1.0f : 0.0f);
            boolean z3 = ((Boolean)transition0.getTargetState()).booleanValue();
            composer1.startReplaceGroup(0xF12241F8);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xF12241F8, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:405)");
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer1.endReplaceGroup();
            Segment transition$Segment1 = transition0.getSegment();
            int v3 = 0;
            State state1 = TransitionKt.createTransitionAnimation(transition0, float1, ((float)(z3 ? 1.0f : 0.0f)), ((FiniteAnimationSpec)tc.w.invoke(transition$Segment1, composer1, 0)), twoWayConverter1, "FloatAnimation", composer1, 0);
            boolean z4 = ((Boolean)composer1.consume(InspectionModeKt.getLocalInspectionMode())).booleanValue();
            Companion modifier$Companion0 = Modifier.Companion;
            boolean z5 = composer1.changed(z4);
            boolean z6 = composer1.changed(state0);
            int v4 = (v2 & 0x70) == 0x20 || (v2 & 0x40) != 0 && composer1.changedInstance(mutableTransitionState0) ? 1 : 0;
            boolean z7 = composer1.changed(state1);
            if((v2 & 0x380) == 0x100) {
                v3 = 1;
            }
            qc qc0 = composer1.rememberedValue();
            if((v3 | (z5 | z6 | v4 | z7)) != 0 || qc0 == Composer.Companion.getEmpty()) {
                v5 = v2;
                qc qc1 = new qc(z4, mutableTransitionState0, mutableState0, state0, state1);
                composer1.updateRememberedValue(qc1);
                qc0 = qc1;
            }
            else {
                v5 = v2;
            }
            SurfaceKt.Surface-T9BRK9s(GraphicsLayerModifierKt.graphicsLayer(modifier$Companion0, qc0), shape0, v, 0L, f, f1, borderStroke0, ComposableLambdaKt.rememberComposableLambda(0x5DCA9B0D, true, new rc(modifier0, scrollState0, function30), composer1, 54), composer1, v5 >> 9 & 0x380 | (v5 >> 9 & 0x70 | 0xC00000) | 0xE000 & v5 >> 6 | 0x70000 & v5 >> 6 | v5 >> 6 & 0x380000, 8);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new sc(modifier0, mutableTransitionState0, mutableState0, scrollState0, shape0, v, f, f1, borderStroke0, function30, v1));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void DropdownMenuItemContent(@NotNull Function2 function20, @NotNull Function0 function00, @NotNull Modifier modifier0, @Nullable Function2 function21, @Nullable Function2 function22, boolean z, @NotNull MenuItemColors menuItemColors0, @NotNull PaddingValues paddingValues0, @Nullable MutableInteractionSource mutableInteractionSource0, @Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xA2BC5117);
        int v1 = (v & 6) == 0 ? (composer1.changedInstance(function20) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (composer1.changedInstance(function00) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (composer1.changed(modifier0) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (composer1.changedInstance(function21) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            v1 |= (composer1.changedInstance(function22) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v) == 0) {
            v1 |= (composer1.changed(z) ? 0x20000 : 0x10000);
        }
        if((0x180000 & v) == 0) {
            v1 |= (composer1.changed(menuItemColors0) ? 0x100000 : 0x80000);
        }
        if((0xC00000 & v) == 0) {
            v1 |= (composer1.changed(paddingValues0) ? 0x800000 : 0x400000);
        }
        if((0x6000000 & v) == 0) {
            v1 |= (composer1.changed(mutableInteractionSource0) ? 0x4000000 : 0x2000000);
        }
        if((0x2492493 & v1) != 0x2492492 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xA2BC5117, v1, -1, "androidx.compose.material3.DropdownMenuItemContent (Menu.kt:451)");
            }
            Modifier modifier1 = PaddingKt.padding(SizeKt.sizeIn-qDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.clickable-O2vRcR0$default(modifier0, mutableInteractionSource0, RippleKt.rippleOrFallbackImplementation-9IZ8Weo(true, 0.0f, 0L, composer1, 6, 6), z, null, null, function00, 24, null), 0.0f, 1, null), MenuKt.e, MenuKt.b, MenuKt.f, 0.0f, 8, null), paddingValues0);
            MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composer1, 0x30);
            int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier2 = ComposedModifierKt.materializeModifier(composer1, modifier1);
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
            Function2 function23 = a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
                a.t(v2, composer1, v2, function23);
            }
            Updater.set-impl(composer1, modifier2, composeUiNode$Companion0.getSetModifier());
            TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer1, 6).getLabelLarge(), ComposableLambdaKt.rememberComposableLambda(1065051884, true, new yc(function21, menuItemColors0, z, function22, RowScopeInstance.INSTANCE, function20), composer1, 54), composer1, 0x30);
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
            scopeUpdateScope0.updateScope(new zc(function20, function00, modifier0, function21, function22, z, menuItemColors0, paddingValues0, mutableInteractionSource0, v));
        }
    }

    public static final float access$DropdownMenuContent_Qj0Zi0g$lambda$1(State state0) {
        return ((Number)state0.getValue()).floatValue();
    }

    public static final float access$DropdownMenuContent_Qj0Zi0g$lambda$3(State state0) {
        return ((Number)state0.getValue()).floatValue();
    }

    public static final float access$getDropdownMenuItemHorizontalPadding$p() [...] // 潜在的解密器

    public static final long calculateTransformOrigin(@NotNull IntRect intRect0, @NotNull IntRect intRect1) {
        float f1;
        float f = 1.0f;
        if(intRect1.getLeft() >= intRect0.getRight()) {
            f1 = 0.0f;
        }
        else if(intRect1.getRight() <= intRect0.getLeft()) {
            f1 = 1.0f;
        }
        else if(intRect1.getWidth() == 0) {
            f1 = 0.0f;
        }
        else {
            f1 = ((float)((Math.min(intRect0.getRight(), intRect1.getRight()) + Math.max(intRect0.getLeft(), intRect1.getLeft())) / 2 - intRect1.getLeft())) / ((float)intRect1.getWidth());
        }
        if(intRect1.getTop() < intRect0.getBottom()) {
            boolean z = false;
            if(intRect1.getBottom() <= intRect0.getTop()) {
                z = true;
            }
            else if(intRect1.getHeight() != 0) {
                z = true;
                f = ((float)((Math.min(intRect0.getBottom(), intRect1.getBottom()) + Math.max(intRect0.getTop(), intRect1.getTop())) / 2 - intRect1.getTop())) / ((float)intRect1.getHeight());
            }
            if(z) {
                return TransformOriginKt.TransformOrigin(f1, f);
            }
        }
        return TransformOriginKt.TransformOrigin(f1, 0.0f);
    }

    public static final float getDropdownMenuVerticalPadding() [...] // 潜在的解密器

    public static final float getMenuVerticalMargin() [...] // 潜在的解密器
}

