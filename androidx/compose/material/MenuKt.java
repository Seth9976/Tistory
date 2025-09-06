package androidx.compose.material;

import aa.r;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.animation.core.Transition.Segment;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.material3.v2;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
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
import p0.d5;
import p0.e0;
import p0.e5;
import p0.e9;
import p0.f5;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\u001A[\u0010\u0010\u001A\u00020\f2\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\t\u001A\u00020\b2\u001C\u0010\u000F\u001A\u0018\u0012\u0004\u0012\u00020\u000B\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000EH\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001Ac\u0010\u001A\u001A\u00020\f2\f\u0010\u0013\u001A\b\u0012\u0004\u0012\u00020\f0\u00122\b\b\u0002\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\u0014\u001A\u00020\u00012\b\b\u0002\u0010\u0016\u001A\u00020\u00152\b\b\u0002\u0010\u0018\u001A\u00020\u00172\u001C\u0010\u000F\u001A\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000EH\u0001¢\u0006\u0004\b\u001A\u0010\u001B\u001A\u001F\u0010\u001F\u001A\u00020\u00042\u0006\u0010\u001D\u001A\u00020\u001C2\u0006\u0010\u001E\u001A\u00020\u001CH\u0000¢\u0006\u0004\b\u001F\u0010 \"\u001A\u0010&\u001A\u00020!8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001A\u0004\b$\u0010%\"\u001A\u0010)\u001A\u00020!8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\'\u0010#\u001A\u0004\b(\u0010%\"\u0014\u0010+\u001A\u00020*8\u0000X\u0080T¢\u0006\u0006\n\u0004\b+\u0010,\"\u0014\u0010-\u001A\u00020*8\u0000X\u0080T¢\u0006\u0006\n\u0004\b-\u0010,¨\u00061²\u0006\f\u0010/\u001A\u00020.8\nX\u008A\u0084\u0002²\u0006\f\u00100\u001A\u00020.8\nX\u008A\u0084\u0002"}, d2 = {"Landroidx/compose/animation/core/MutableTransitionState;", "", "expandedStates", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/ui/graphics/TransformOrigin;", "transformOriginState", "Landroidx/compose/foundation/ScrollState;", "scrollState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "content", "DropdownMenuContent", "(Landroidx/compose/animation/core/MutableTransitionState;Landroidx/compose/runtime/MutableState;Landroidx/compose/foundation/ScrollState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/Function0;", "onClick", "enabled", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/foundation/layout/RowScope;", "DropdownMenuItemContent", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/unit/IntRect;", "parentBounds", "menuBounds", "calculateTransformOrigin", "(Landroidx/compose/ui/unit/IntRect;Landroidx/compose/ui/unit/IntRect;)J", "Landroidx/compose/ui/unit/Dp;", "b", "F", "getMenuVerticalMargin", "()F", "MenuVerticalMargin", "d", "getDropdownMenuVerticalPadding", "DropdownMenuVerticalPadding", "", "InTransitionDuration", "I", "OutTransitionDuration", "", "scale", "alpha", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\nandroidx/compose/material/MenuKt\n+ 2 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,304:1\n1163#2,4:305\n1083#2,5:309\n1163#2,4:314\n1083#2,5:318\n1116#3,6:323\n1116#3,6:330\n25#4:329\n456#4,8:353\n464#4,3:367\n467#4,3:371\n87#5,6:336\n93#5:370\n97#5:375\n79#6,11:342\n92#6:374\n3737#7,6:361\n81#8:376\n81#8:377\n154#9:378\n154#9:379\n154#9:380\n154#9:381\n154#9:382\n154#9:383\n154#9:384\n*S KotlinDebug\n*F\n+ 1 Menu.kt\nandroidx/compose/material/MenuKt\n*L\n71#1:305,4\n71#1:309,5\n97#1:314,4\n97#1:318,5\n117#1:323,6\n141#1:330,6\n141#1:329\n145#1:353,8\n145#1:367,3\n145#1:371,3\n145#1:336,6\n145#1:370\n145#1:375\n145#1:342,11\n145#1:374\n145#1:361,6\n71#1:376\n97#1:377\n187#1:378\n188#1:379\n189#1:380\n190#1:381\n191#1:382\n192#1:383\n193#1:384\n*E\n"})
public final class MenuKt {
    public static final int InTransitionDuration = 120;
    public static final int OutTransitionDuration = 75;
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;
    public static final float f;
    public static final float g;

    static {
        MenuKt.a = 8.0f;
        MenuKt.b = 48.0f;
        MenuKt.c = 16.0f;
        MenuKt.d = 8.0f;
        MenuKt.e = 112.0f;
        MenuKt.f = 280.0f;
        MenuKt.g = 48.0f;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void DropdownMenuContent(@NotNull MutableTransitionState mutableTransitionState0, @NotNull MutableState mutableState0, @NotNull ScrollState scrollState0, @Nullable Modifier modifier0, @NotNull Function3 function30, @Nullable Composer composer0, int v, int v1) {
        Modifier modifier1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x19EF3FD5);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(mutableTransitionState0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changed(mutableState0) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changed(scrollState0) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
            modifier1 = modifier0;
        }
        else if((v & 0x1C00) == 0) {
            modifier1 = modifier0;
            v2 |= (composer1.changed(modifier1) ? 0x800 : 0x400);
        }
        else {
            modifier1 = modifier0;
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
        }
        else if((0xE000 & v) == 0) {
            v2 |= (composer1.changedInstance(function30) ? 0x4000 : 0x2000);
        }
        if((0xB6DB & v2) != 9362 || !composer1.getSkipping()) {
            Modifier modifier2 = (v1 & 8) == 0 ? modifier1 : Modifier.Companion;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x19EF3FD5, v2, -1, "androidx.compose.material.DropdownMenuContent (Menu.kt:66)");
            }
            Transition transition0 = TransitionKt.updateTransition(mutableTransitionState0, "DropDownMenu", composer1, MutableTransitionState.$stable | 0x30 | v2 & 14, 0);
            composer1.startReplaceableGroup(0xB03404EB);
            FloatCompanionObject floatCompanionObject0 = FloatCompanionObject.INSTANCE;
            TwoWayConverter twoWayConverter0 = VectorConvertersKt.getVectorConverter(floatCompanionObject0);
            composer1.startReplaceableGroup(0xF77F2E11);
            boolean z = ((Boolean)transition0.getCurrentState()).booleanValue();
            composer1.startReplaceableGroup(0x628098F1);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x628098F1, 0, -1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:87)");
            }
            float f = 0.8f;
            float f1 = 1.0f;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer1.endReplaceableGroup();
            Float float0 = (float)(z ? 1.0f : 0.8f);
            boolean z1 = ((Boolean)transition0.getTargetState()).booleanValue();
            composer1.startReplaceableGroup(0x628098F1);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x628098F1, 0, -1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:87)");
            }
            if(z1) {
                f = 1.0f;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer1.endReplaceableGroup();
            Segment transition$Segment0 = transition0.getSegment();
            State state0 = TransitionKt.createTransitionAnimation(transition0, float0, f, ((FiniteAnimationSpec)f5.w.invoke(transition$Segment0, composer1, 0)), twoWayConverter0, "FloatAnimation", composer1, 0);
            composer1.endReplaceableGroup();
            composer1.endReplaceableGroup();
            composer1.startReplaceableGroup(0xB03404EB);
            TwoWayConverter twoWayConverter1 = VectorConvertersKt.getVectorConverter(floatCompanionObject0);
            composer1.startReplaceableGroup(0xF77F2E11);
            boolean z2 = ((Boolean)transition0.getCurrentState()).booleanValue();
            composer1.startReplaceableGroup(0x17212F05);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x17212F05, 0, -1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:107)");
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer1.endReplaceableGroup();
            Float float1 = (float)(z2 ? 1.0f : 0.0f);
            boolean z3 = ((Boolean)transition0.getTargetState()).booleanValue();
            composer1.startReplaceableGroup(0x17212F05);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x17212F05, 0, -1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:107)");
            }
            if(!z3) {
                f1 = 0.0f;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer1.endReplaceableGroup();
            Segment transition$Segment1 = transition0.getSegment();
            State state1 = TransitionKt.createTransitionAnimation(transition0, float1, f1, ((FiniteAnimationSpec)e5.w.invoke(transition$Segment1, composer1, 0)), twoWayConverter1, "FloatAnimation", composer1, 0);
            composer1.endReplaceableGroup();
            composer1.endReplaceableGroup();
            Companion modifier$Companion0 = Modifier.Companion;
            composer1.startReplaceableGroup(0x9A4838FF);
            boolean z4 = composer1.changed(state0);
            boolean z5 = composer1.changed(state1);
            boolean z6 = composer1.changed(mutableState0);
            r r0 = composer1.rememberedValue();
            if((z4 | z5 | z6) != 0 || r0 == Composer.Companion.getEmpty()) {
                r0 = new r(mutableState0, state0, state1);
                composer1.updateRememberedValue(r0);
            }
            composer1.endReplaceableGroup();
            Modifier modifier3 = GraphicsLayerModifierKt.graphicsLayer(modifier$Companion0, r0);
            ComposableLambda composableLambda0 = ComposableLambdaKt.composableLambda(composer1, 0x356116D2, true, new d5(modifier2, scrollState0, function30));
            CardKt.Card-F-jzlyU(modifier3, null, 0L, 0L, null, MenuKt.a, composableLambda0, composer1, 0x1B0000, 30);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new v2(mutableTransitionState0, mutableState0, scrollState0, modifier1, function30, v, v1));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void DropdownMenuItemContent(@NotNull Function0 function00, @Nullable Modifier modifier0, boolean z, @Nullable PaddingValues paddingValues0, @Nullable MutableInteractionSource mutableInteractionSource0, @NotNull Function3 function30, @Nullable Composer composer0, int v, int v1) {
        MutableInteractionSource mutableInteractionSource1;
        boolean z1;
        Modifier modifier1;
        MutableInteractionSource mutableInteractionSource3;
        PaddingValues paddingValues1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x5319143);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changed(z) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
            paddingValues1 = paddingValues0;
        }
        else if((v & 0x1C00) == 0) {
            paddingValues1 = paddingValues0;
            v2 |= (composer1.changed(paddingValues1) ? 0x800 : 0x400);
        }
        else {
            paddingValues1 = paddingValues0;
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
        }
        else if((0xE000 & v) == 0) {
            v2 |= (composer1.changed(mutableInteractionSource0) ? 0x4000 : 0x2000);
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
        }
        else if((0x70000 & v) == 0) {
            v2 |= (composer1.changedInstance(function30) ? 0x20000 : 0x10000);
        }
        if((0x5B6DB & v2) != 74898 || !composer1.getSkipping()) {
            modifier1 = (v1 & 2) == 0 ? modifier0 : Modifier.Companion;
            boolean z2 = (v1 & 4) == 0 ? z : true;
            PaddingValues paddingValues2 = (v1 & 8) == 0 ? paddingValues1 : MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
            if((v1 & 16) == 0) {
                mutableInteractionSource3 = mutableInteractionSource0;
            }
            else {
                composer1.startReplaceableGroup(0xE2A708A4);
                MutableInteractionSource mutableInteractionSource2 = composer1.rememberedValue();
                if(mutableInteractionSource2 == Composer.Companion.getEmpty()) {
                    mutableInteractionSource2 = InteractionSourceKt.MutableInteractionSource();
                    composer1.updateRememberedValue(mutableInteractionSource2);
                }
                composer1.endReplaceableGroup();
                mutableInteractionSource3 = mutableInteractionSource2;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x5319143, v2, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:142)");
            }
            Modifier modifier2 = PaddingKt.padding(SizeKt.sizeIn-qDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.clickable-O2vRcR0$default(modifier1, mutableInteractionSource3, RippleKt.rememberRipple-9IZ8Weo(true, 0.0f, 0L, composer1, 6, 6), z2, null, null, function00, 24, null), 0.0f, 1, null), MenuKt.e, MenuKt.g, MenuKt.f, 0.0f, 8, null), paddingValues2);
            composer1.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composer1, 0x30);
            composer1.startReplaceableGroup(-1323940314);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function01 = composeUiNode$Companion0.getConstructor();
            Function3 function31 = LayoutKt.modifierMaterializerOf(modifier2);
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
            Function2 function20 = a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                a.t(v3, composer1, v3, function20);
            }
            r0.a.w(0, function31, SkippableUpdater.box-impl(composer1), composer1, 2058660585);
            TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer1, 6).getSubtitle1(), ComposableLambdaKt.composableLambda(composer1, 0x46F56D98, true, new e9(z2, function30, RowScopeInstance.INSTANCE)), composer1, 0x30);
            composer1.endReplaceableGroup();
            composer1.endNode();
            composer1.endReplaceableGroup();
            composer1.endReplaceableGroup();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            mutableInteractionSource1 = mutableInteractionSource3;
            paddingValues1 = paddingValues2;
            z1 = z2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            z1 = z;
            mutableInteractionSource1 = mutableInteractionSource0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new e0(function00, modifier1, z1, paddingValues1, mutableInteractionSource1, function30, v, v1, 1));
        }
    }

    public static final float access$DropdownMenuContent$lambda$1(State state0) {
        return ((Number)state0.getValue()).floatValue();
    }

    public static final float access$DropdownMenuContent$lambda$3(State state0) {
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

