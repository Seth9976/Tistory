package androidx.compose.animation;

import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition.DeferredAnimation;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s.m;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000B\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002UVB\'\b\u0000\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0007\u00A2\u0006\u0004\b\t\u0010\nJ\u001E\u0010\u000E\u001A\u00020\u000B*\u00020\u000B2\b\u0010\r\u001A\u0004\u0018\u00010\fH\u0096\u0004\u00A2\u0006\u0004\b\u000E\u0010\u000FJK\u0010\u001E\u001A\u00020\u001B2\u0006\u0010\u0011\u001A\u00020\u00102\f\u0010\u0014\u001A\b\u0012\u0004\u0012\u00020\u00130\u00122!\u0010\u001A\u001A\u001D\u0012\u0013\u0012\u00110\u0016\u00A2\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00160\u0015H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001C\u0010\u001DJK\u0010#\u001A\u00020 2\u0006\u0010\u0011\u001A\u00020\u00102\f\u0010\u0014\u001A\b\u0012\u0004\u0012\u00020\u00130\u00122!\u0010\u001F\u001A\u001D\u0012\u0013\u0012\u00110\u0016\u00A2\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00160\u0015H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b!\u0010\"J\u0017\u0010(\u001A\u00020%2\u0006\u0010$\u001A\u00020\u000BH\u0001\u00A2\u0006\u0004\b&\u0010\'R \u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u00038\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b)\u0010*\u001A\u0004\b+\u0010,R\"\u0010\u0006\u001A\u00020\u00058\u0016@\u0016X\u0096\u000E\u00A2\u0006\u0012\n\u0004\b-\u0010.\u001A\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010\b\u001A\u00020\u00078\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b3\u00104\u001A\u0004\b5\u00106\"\u0004\b7\u00108R1\u0010A\u001A\u0002092\u0006\u0010:\u001A\u0002098@@@X\u0080\u008E\u0002\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0012\n\u0004\b;\u0010<\u001A\u0004\b=\u0010>\"\u0004\b?\u0010@R,\u0010H\u001A\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u0002090C0B8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bD\u0010E\u001A\u0004\bF\u0010GR*\u0010O\u001A\n\u0012\u0004\u0012\u000209\u0018\u00010C8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bI\u0010J\u001A\u0004\bK\u0010L\"\u0004\bM\u0010NR\u0014\u0010R\u001A\u00028\u00008VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bP\u0010QR\u0014\u0010T\u001A\u00028\u00008VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bS\u0010Q\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006Y\u00B2\u0006\u0014\u0010X\u001A\u00020W\"\u0004\b\u0000\u0010\u00018\n@\nX\u008A\u008E\u0002"}, d2 = {"Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;", "S", "Landroidx/compose/animation/AnimatedContentTransitionScope;", "Landroidx/compose/animation/core/Transition;", "transition", "Landroidx/compose/ui/Alignment;", "contentAlignment", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "<init>", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/unit/LayoutDirection;)V", "Landroidx/compose/animation/ContentTransform;", "Landroidx/compose/animation/SizeTransform;", "sizeTransform", "using", "(Landroidx/compose/animation/ContentTransform;Landroidx/compose/animation/SizeTransform;)Landroidx/compose/animation/ContentTransform;", "Landroidx/compose/animation/AnimatedContentTransitionScope$SlideDirection;", "towards", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/ui/unit/IntOffset;", "animationSpec", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "offsetForFullSlide", "initialOffset", "Landroidx/compose/animation/EnterTransition;", "slideIntoContainer-mOhB8PU", "(ILandroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/EnterTransition;", "slideIntoContainer", "targetOffset", "Landroidx/compose/animation/ExitTransition;", "slideOutOfContainer-mOhB8PU", "(ILandroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/ExitTransition;", "slideOutOfContainer", "contentTransform", "Landroidx/compose/ui/Modifier;", "createSizeAnimationModifier$animation_release", "(Landroidx/compose/animation/ContentTransform;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "createSizeAnimationModifier", "a", "Landroidx/compose/animation/core/Transition;", "getTransition$animation_release", "()Landroidx/compose/animation/core/Transition;", "b", "Landroidx/compose/ui/Alignment;", "getContentAlignment", "()Landroidx/compose/ui/Alignment;", "setContentAlignment", "(Landroidx/compose/ui/Alignment;)V", "c", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection$animation_release", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection$animation_release", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "Landroidx/compose/ui/unit/IntSize;", "<set-?>", "d", "Landroidx/compose/runtime/MutableState;", "getMeasuredSize-YbymL2g$animation_release", "()J", "setMeasuredSize-ozmzZPI$animation_release", "(J)V", "measuredSize", "Landroidx/collection/MutableScatterMap;", "Landroidx/compose/runtime/State;", "e", "Landroidx/collection/MutableScatterMap;", "getTargetSizeMap$animation_release", "()Landroidx/collection/MutableScatterMap;", "targetSizeMap", "f", "Landroidx/compose/runtime/State;", "getAnimatedSize$animation_release", "()Landroidx/compose/runtime/State;", "setAnimatedSize$animation_release", "(Landroidx/compose/runtime/State;)V", "animatedSize", "getInitialState", "()Ljava/lang/Object;", "initialState", "getTargetState", "targetState", "ChildData", "s/m", "", "shouldAnimateSize", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentTransitionScopeImpl\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,899:1\n81#2:900\n107#2,2:901\n81#2:915\n107#2,2:916\n1223#3,6:903\n1223#3,6:909\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentTransitionScopeImpl\n*L\n561#1:900\n561#1:901,2\n575#1:915\n575#1:916,2\n575#1:903,6\n587#1:909,6\n*E\n"})
public final class AnimatedContentTransitionScopeImpl implements AnimatedContentTransitionScope {
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001D\u0010\t\u001A\u00020\u0007*\u00020\u00062\b\u0010\b\u001A\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR+\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u000B\u001A\u00020\u00028F@FX\u0086\u008E\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001A\u0004\b\u0003\u0010\u000E\"\u0004\b\u000F\u0010\u0005¨\u0006\u0010"}, d2 = {"Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$ChildData;", "Landroidx/compose/ui/layout/ParentDataModifier;", "", "isTarget", "<init>", "(Z)V", "Landroidx/compose/ui/unit/Density;", "", "parentData", "modifyParentData", "(Landroidx/compose/ui/unit/Density;Ljava/lang/Object;)Ljava/lang/Object;", "<set-?>", "a", "Landroidx/compose/runtime/MutableState;", "()Z", "setTarget", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentTransitionScopeImpl$ChildData\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,899:1\n81#2:900\n107#2,2:901\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentTransitionScopeImpl$ChildData\n*L\n602#1:900\n602#1:901,2\n*E\n"})
    public static final class ChildData implements ParentDataModifier {
        public static final int $stable;
        public final MutableState a;

        public ChildData(boolean z) {
            this.a = SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z), null, 2, null);
        }

        public final boolean isTarget() {
            return ((Boolean)this.a.getValue()).booleanValue();
        }

        @Override  // androidx.compose.ui.layout.ParentDataModifier
        @NotNull
        public Object modifyParentData(@NotNull Density density0, @Nullable Object object0) {
            return this;
        }

        public final void setTarget(boolean z) {
            this.a.setValue(Boolean.valueOf(z));
        }
    }

    public static final int $stable = 8;
    public final Transition a;
    public Alignment b;
    public LayoutDirection c;
    public final MutableState d;
    public final MutableScatterMap e;
    public State f;

    public AnimatedContentTransitionScopeImpl(@NotNull Transition transition0, @NotNull Alignment alignment0, @NotNull LayoutDirection layoutDirection0) {
        this.a = transition0;
        this.b = alignment0;
        this.c = layoutDirection0;
        this.d = SnapshotStateKt.mutableStateOf$default(IntSize.box-impl(0L), null, 2, null);
        this.e = ScatterMapKt.mutableScatterMapOf();
    }

    // 去混淆评级： 中等(90)
    public final boolean a(int v) {
        return SlideDirection.equals-impl0(v, 0) || SlideDirection.equals-impl0(v, 4) && this.c == LayoutDirection.Ltr || SlideDirection.equals-impl0(v, 5) && this.c == LayoutDirection.Rtl;
    }

    public static final long access$calculateOffset-emnUabE(AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl0, long v, long v1) {
        return animatedContentTransitionScopeImpl0.getContentAlignment().align-KFBX0sM(v, v1, LayoutDirection.Ltr);
    }

    public static final long access$getCurrentSize-YbymL2g(AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl0) {
        State state0 = animatedContentTransitionScopeImpl0.f;
        return state0 == null ? animatedContentTransitionScopeImpl0.getMeasuredSize-YbymL2g$animation_release() : ((IntSize)state0.getValue()).unbox-impl();
    }

    // 去混淆评级： 中等(90)
    public final boolean b(int v) {
        return SlideDirection.equals-impl0(v, 1) || SlideDirection.equals-impl0(v, 4) && this.c == LayoutDirection.Rtl || SlideDirection.equals-impl0(v, 5) && this.c == LayoutDirection.Ltr;
    }

    @Composable
    @NotNull
    public final Modifier createSizeAnimationModifier$animation_release(@NotNull ContentTransform contentTransform0, @Nullable Composer composer0, int v) {
        Modifier modifier2;
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(93755870, v, -1, "androidx.compose.animation.AnimatedContentTransitionScopeImpl.createSizeAnimationModifier (AnimatedContent.kt:573)");
        }
        boolean z = composer0.changed(this);
        MutableState mutableState0 = composer0.rememberedValue();
        if(z || mutableState0 == Composer.Companion.getEmpty()) {
            mutableState0 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer0.updateRememberedValue(mutableState0);
        }
        State state0 = SnapshotStateKt.rememberUpdatedState(contentTransform0.getSizeTransform(), composer0, 0);
        if(Intrinsics.areEqual(this.a.getCurrentState(), this.a.getTargetState())) {
            mutableState0.setValue(Boolean.FALSE);
        }
        else if(state0.getValue() != null) {
            mutableState0.setValue(Boolean.TRUE);
        }
        if(((Boolean)mutableState0.getValue()).booleanValue()) {
            composer0.startReplaceGroup(0xED801FD);
            DeferredAnimation transition$DeferredAnimation0 = TransitionKt.createDeferredAnimation(this.a, VectorConvertersKt.getVectorConverter(IntSize.Companion), null, composer0, 0, 2);
            boolean z1 = composer0.changed(transition$DeferredAnimation0);
            Modifier modifier0 = composer0.rememberedValue();
            if(z1 || modifier0 == Composer.Companion.getEmpty()) {
                SizeTransform sizeTransform0 = (SizeTransform)state0.getValue();
                Modifier modifier1 = sizeTransform0 == null || sizeTransform0.getClip() ? ClipKt.clipToBounds(Modifier.Companion) : Modifier.Companion;
                modifier0 = modifier1.then(new m(this, transition$DeferredAnimation0, state0));
                composer0.updateRememberedValue(modifier0);
            }
            modifier2 = modifier0;
            composer0.endReplaceGroup();
        }
        else {
            composer0.startReplaceGroup(0xEDCD5FE);
            composer0.endReplaceGroup();
            this.f = null;
            modifier2 = Modifier.Companion;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return modifier2;
    }

    @Nullable
    public final State getAnimatedSize$animation_release() {
        return this.f;
    }

    @Override  // androidx.compose.animation.AnimatedContentTransitionScope
    @NotNull
    public Alignment getContentAlignment() {
        return this.b;
    }

    @Override  // androidx.compose.animation.core.Transition$Segment
    public Object getInitialState() {
        return this.a.getSegment().getInitialState();
    }

    @NotNull
    public final LayoutDirection getLayoutDirection$animation_release() {
        return this.c;
    }

    public final long getMeasuredSize-YbymL2g$animation_release() {
        return ((IntSize)this.d.getValue()).unbox-impl();
    }

    @NotNull
    public final MutableScatterMap getTargetSizeMap$animation_release() {
        return this.e;
    }

    @Override  // androidx.compose.animation.core.Transition$Segment
    public Object getTargetState() {
        return this.a.getSegment().getTargetState();
    }

    @NotNull
    public final Transition getTransition$animation_release() {
        return this.a;
    }

    public final void setAnimatedSize$animation_release(@Nullable State state0) {
        this.f = state0;
    }

    public void setContentAlignment(@NotNull Alignment alignment0) {
        this.b = alignment0;
    }

    public final void setLayoutDirection$animation_release(@NotNull LayoutDirection layoutDirection0) {
        this.c = layoutDirection0;
    }

    public final void setMeasuredSize-ozmzZPI$animation_release(long v) {
        IntSize intSize0 = IntSize.box-impl(v);
        this.d.setValue(intSize0);
    }

    @Override  // androidx.compose.animation.AnimatedContentTransitionScope
    @NotNull
    public EnterTransition slideIntoContainer-mOhB8PU(int v, @NotNull FiniteAnimationSpec finiteAnimationSpec0, @NotNull Function1 function10) {
        if(this.a(v)) {
            return EnterExitTransitionKt.slideInHorizontally(finiteAnimationSpec0, new e(this, function10));
        }
        if(this.b(v)) {
            return EnterExitTransitionKt.slideInHorizontally(finiteAnimationSpec0, new f(this, function10));
        }
        if(SlideDirection.equals-impl0(v, 2)) {
            return EnterExitTransitionKt.slideInVertically(finiteAnimationSpec0, new g(this, function10));
        }
        return SlideDirection.equals-impl0(v, 3) ? EnterExitTransitionKt.slideInVertically(finiteAnimationSpec0, new h(this, function10)) : EnterTransition.Companion.getNone();
    }

    @Override  // androidx.compose.animation.AnimatedContentTransitionScope
    @NotNull
    public ExitTransition slideOutOfContainer-mOhB8PU(int v, @NotNull FiniteAnimationSpec finiteAnimationSpec0, @NotNull Function1 function10) {
        if(this.a(v)) {
            return EnterExitTransitionKt.slideOutHorizontally(finiteAnimationSpec0, new i(this, function10));
        }
        if(this.b(v)) {
            return EnterExitTransitionKt.slideOutHorizontally(finiteAnimationSpec0, new j(this, function10));
        }
        if(SlideDirection.equals-impl0(v, 2)) {
            return EnterExitTransitionKt.slideOutVertically(finiteAnimationSpec0, new k(this, function10));
        }
        return SlideDirection.equals-impl0(v, 3) ? EnterExitTransitionKt.slideOutVertically(finiteAnimationSpec0, new l(this, function10)) : ExitTransition.Companion.getNone();
    }

    @Override  // androidx.compose.animation.AnimatedContentTransitionScope
    @NotNull
    public ContentTransform using(@NotNull ContentTransform contentTransform0, @Nullable SizeTransform sizeTransform0) {
        contentTransform0.setSizeTransform$animation_release(sizeTransform0);
        return contentTransform0;
    }
}

