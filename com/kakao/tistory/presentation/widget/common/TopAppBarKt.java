package com.kakao.tistory.presentation.widget.common;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TopAppBarScrollBehavior;
import androidx.compose.material3.TopAppBarState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import com.kakao.tistory.presentation.common.TistoryWindowInsetsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.FloatRef;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001AR\u0010\u000F\u001A\u00020\n2\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00002\u0006\u0010\u0004\u001A\u00020\u00032&\u0010\f\u001A\"\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\u0002\b\u000BH\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000E\u001A\u001B\u0010\u0011\u001A\u00020\u0010*\u00020\u00102\u0006\u0010\u0004\u001A\u00020\u0003H\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/unit/Dp;", "pinnedHeight", "maxHeight", "Landroidx/compose/material3/TopAppBarScrollBehavior;", "scrollBehavior", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "fraction", "", "Landroidx/compose/runtime/Composable;", "content", "TopAppBar-if577FI", "(FFLandroidx/compose/material3/TopAppBarScrollBehavior;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "TopAppBar", "Landroidx/compose/ui/Modifier;", "appBarDrag", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TopAppBarScrollBehavior;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTopAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopAppBar.kt\ncom/kakao/tistory/presentation/widget/common/TopAppBarKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,133:1\n77#2:134\n77#2:141\n1223#3,6:135\n1223#3,6:142\n1223#3,6:148\n*S KotlinDebug\n*F\n+ 1 TopAppBar.kt\ncom/kakao/tistory/presentation/widget/common/TopAppBarKt\n*L\n38#1:134\n51#1:141\n44#1:135,6\n72#1:142,6\n75#1:148,6\n*E\n"})
public final class TopAppBarKt {
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void TopAppBar-if577FI(float f, float f1, @NotNull TopAppBarScrollBehavior topAppBarScrollBehavior0, @NotNull Function3 function30, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(topAppBarScrollBehavior0, "scrollBehavior");
        Intrinsics.checkNotNullParameter(function30, "content");
        Composer composer1 = composer0.startRestartGroup(0xE2CFB060);
        int v1 = (v & 14) == 0 ? (composer1.changed(f) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changed(f1) ? 0x20 : 16);
        }
        if((v & 0x380) == 0) {
            v1 |= (composer1.changed(topAppBarScrollBehavior0) ? 0x100 : 0x80);
        }
        if((v & 0x1C00) == 0) {
            v1 |= (composer1.changedInstance(function30) ? 0x800 : 0x400);
        }
        if((v1 & 5851) == 1170 && composer1.getSkipping()) {
            composer1.skipToGroupEnd();
        }
        else {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xE2CFB060, v1, -1, "com.kakao.tistory.presentation.widget.common.TopAppBar (TopAppBar.kt:30)");
            }
            if(Dp.compareTo-0680j_4(f1, f) <= 0) {
                throw new IllegalArgumentException("A TopAppBar max height should be greater than or equal its pinned height");
            }
            FloatRef ref$FloatRef0 = new FloatRef();
            FloatRef ref$FloatRef1 = new FloatRef();
            Density density0 = (Density)composer1.consume(CompositionLocalsKt.getLocalDensity());
            ref$FloatRef0.element = density0.toPx-0680j_4(f);
            ref$FloatRef1.element = density0.toPx-0680j_4(f1);
            TopAppBarState topAppBarState0 = topAppBarScrollBehavior0.getState();
            composer1.startReplaceGroup(1420063790);
            boolean z = composer1.changed(ref$FloatRef0.element);
            boolean z1 = composer1.changed(ref$FloatRef1.element);
            boolean z2 = composer1.changed(topAppBarState0);
            y4 y40 = composer1.rememberedValue();
            if((z | z1 | z2) != 0 || y40 == Composer.Companion.getEmpty()) {
                y40 = new y4(ref$FloatRef0, ref$FloatRef1, topAppBarState0);
                composer1.updateRememberedValue(y40);
            }
            composer1.endReplaceGroup();
            EffectsKt.SideEffect(y40, composer1, 0);
            Density density1 = (Density)composer1.consume(CompositionLocalsKt.getLocalDensity());
            float f2 = ref$FloatRef1.element;
            float f3 = density1.toDp-u2uoSUM(StrictMath.max(ref$FloatRef0.element, topAppBarState0.getHeightOffset() + f2));
            float f4 = topAppBarScrollBehavior0.isPinned() ? topAppBarState0.getOverlappedFraction() : topAppBarState0.getCollapsedFraction();
            SurfaceKt.Surface-T9BRK9s(ClipKt.clipToBounds(TistoryWindowInsetsKt.topInsetsHeight-3ABfNKs(TopAppBarKt.appBarDrag(Modifier.Companion, topAppBarScrollBehavior0, composer1, v1 >> 3 & 0x70 | 6), f3)), null, 0L, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-165001221, true, new z4(function30, f4), composer1, 54), composer1, 0xC00000, 0x7E);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new a5(f, f1, topAppBarScrollBehavior0, function30, v));
        }
    }

    public static final Object access$settleAppBar(TopAppBarState topAppBarState0, float f, DecayAnimationSpec decayAnimationSpec0, AnimationSpec animationSpec0, Continuation continuation0) {
        AnimationSpec animationSpec1;
        FloatRef ref$FloatRef1;
        d5 d50;
        TopAppBarState topAppBarState1 = topAppBarState0;
        if(continuation0 instanceof d5) {
            d50 = (d5)continuation0;
            int v = d50.e;
            if((v & 0x80000000) == 0) {
                d50 = new d5(continuation0);
            }
            else {
                d50.e = v ^ 0x80000000;
            }
        }
        else {
            d50 = new d5(continuation0);
        }
        Object object0 = d50.d;
        Velocity velocity0 = a.getCOROUTINE_SUSPENDED();
        switch(d50.e) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                if(topAppBarState0.getCollapsedFraction() >= 0.01f && topAppBarState0.getCollapsedFraction() != 1.0f) {
                    ref$FloatRef1 = new FloatRef();
                    ref$FloatRef1.element = f;
                    if(decayAnimationSpec0 != null && Math.abs(f) > 1.0f) {
                        FloatRef ref$FloatRef2 = new FloatRef();
                        AnimationState animationState0 = AnimationStateKt.AnimationState$default(0.0f, f, 0L, 0L, false, 28, null);
                        e5 e50 = new e5(ref$FloatRef2, topAppBarState1, ref$FloatRef1);
                        d50.a = topAppBarState1;
                        d50.b = animationSpec0;
                        d50.c = ref$FloatRef1;
                        d50.e = 1;
                        if(SuspendAnimationKt.animateDecay$default(animationState0, decayAnimationSpec0, false, e50, d50, 2, null) == velocity0) {
                            return velocity0;
                        }
                    }
                    animationSpec1 = animationSpec0;
                    break;
                }
                return Velocity.box-impl(0L);
            }
            case 1: {
                FloatRef ref$FloatRef3 = d50.c;
                AnimationSpec animationSpec2 = d50.b;
                TopAppBarState topAppBarState2 = (TopAppBarState)d50.a;
                ResultKt.throwOnFailure(object0);
                ref$FloatRef1 = ref$FloatRef3;
                animationSpec1 = animationSpec2;
                topAppBarState1 = topAppBarState2;
                break;
            }
            case 2: {
                FloatRef ref$FloatRef0 = (FloatRef)d50.a;
                ResultKt.throwOnFailure(object0);
                return Velocity.box-impl(VelocityKt.Velocity(0.0f, ref$FloatRef0.element));
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(animationSpec1 != null && topAppBarState1.getHeightOffset() < 0.0f && topAppBarState1.getHeightOffset() > topAppBarState1.getHeightOffsetLimit()) {
            AnimationState animationState1 = AnimationStateKt.AnimationState$default(topAppBarState1.getHeightOffset(), 0.0f, 0L, 0L, false, 30, null);
            float f1 = topAppBarState1.getCollapsedFraction() < 0.5f ? 0.0f : topAppBarState1.getHeightOffsetLimit();
            f5 f50 = new f5(topAppBarState1);
            d50.a = ref$FloatRef1;
            d50.b = null;
            d50.c = null;
            d50.e = 2;
            return SuspendAnimationKt.animateTo$default(animationState1, Boxing.boxFloat(f1), animationSpec1, false, f50, d50, 4, null) == velocity0 ? velocity0 : Velocity.box-impl(VelocityKt.Velocity(0.0f, ref$FloatRef1.element));
        }
        return Velocity.box-impl(VelocityKt.Velocity(0.0f, ref$FloatRef1.element));
    }

    @Composable
    @NotNull
    public static final Modifier appBarDrag(@NotNull Modifier modifier0, @NotNull TopAppBarScrollBehavior topAppBarScrollBehavior0, @Nullable Composer composer0, int v) {
        Modifier modifier1;
        Intrinsics.checkNotNullParameter(modifier0, "<this>");
        Intrinsics.checkNotNullParameter(topAppBarScrollBehavior0, "scrollBehavior");
        composer0.startReplaceGroup(180897206);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(180897206, v, -1, "com.kakao.tistory.presentation.widget.common.appBarDrag (TopAppBar.kt:68)");
        }
        if(topAppBarScrollBehavior0.isPinned()) {
            modifier1 = Modifier.Companion;
        }
        else {
            Companion modifier$Companion0 = Modifier.Companion;
            Orientation orientation0 = Orientation.Vertical;
            composer0.startReplaceGroup(0x24F08F70);
            int v1 = v & 0x70 ^ 0x30;
            boolean z = true;
            boolean z1 = v1 > 0x20 && composer0.changed(topAppBarScrollBehavior0) || (v & 0x30) == 0x20;
            b5 b50 = composer0.rememberedValue();
            if(z1 || b50 == Composer.Companion.getEmpty()) {
                b50 = new b5(topAppBarScrollBehavior0);
                composer0.updateRememberedValue(b50);
            }
            composer0.endReplaceGroup();
            DraggableState draggableState0 = DraggableKt.rememberDraggableState(b50, composer0, 0);
            composer0.startReplaceGroup(0x24F09B14);
            if((v1 <= 0x20 || !composer0.changed(topAppBarScrollBehavior0)) && (v & 0x30) != 0x20) {
                z = false;
            }
            c5 c50 = composer0.rememberedValue();
            if(z || c50 == Composer.Companion.getEmpty()) {
                c50 = new c5(topAppBarScrollBehavior0, null);
                composer0.updateRememberedValue(c50);
            }
            composer0.endReplaceGroup();
            modifier1 = DraggableKt.draggable$default(modifier$Companion0, draggableState0, orientation0, false, null, false, null, c50, false, 0xBC, null);
        }
        Modifier modifier2 = modifier0.then(modifier1);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return modifier2;
    }
}

