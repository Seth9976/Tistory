package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.IntOffset;
import d0.g;
import d0.h;
import d0.j;
import d0.k;
import d0.m;
import d0.n;
import d0.o;
import d0.p;
import d0.q;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\u000F\b\u0000\u0018\u0000 T2\u00020\u0001:\u0001TB+\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\u000E\b\u0002\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006\u00A2\u0006\u0004\b\t\u0010\nJ\r\u0010\u000B\u001A\u00020\u0007\u00A2\u0006\u0004\b\u000B\u0010\fJ \u0010\u0013\u001A\u00020\u00072\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010\u0010\u001A\u00020\u000F\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001A\u00020\u0007\u00A2\u0006\u0004\b\u0014\u0010\fJ\r\u0010\u0015\u001A\u00020\u0007\u00A2\u0006\u0004\b\u0015\u0010\fJ\r\u0010\u0016\u001A\u00020\u0007\u00A2\u0006\u0004\b\u0016\u0010\fR*\u0010\u001F\u001A\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00178\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u001C\"\u0004\b\u001D\u0010\u001ER*\u0010#\u001A\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00178\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b \u0010\u001A\u001A\u0004\b!\u0010\u001C\"\u0004\b\"\u0010\u001ER*\u0010\'\u001A\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00178\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b$\u0010\u001A\u001A\u0004\b%\u0010\u001C\"\u0004\b&\u0010\u001ER$\u0010+\u001A\u00020\u000F2\u0006\u0010(\u001A\u00020\u000F8\u0006@BX\u0086\u000E\u00A2\u0006\f\n\u0004\b)\u0010*\u001A\u0004\b+\u0010,R+\u0010/\u001A\u00020\u000F2\u0006\u0010(\u001A\u00020\u000F8F@BX\u0086\u008E\u0002\u00A2\u0006\u0012\n\u0004\b-\u0010.\u001A\u0004\b/\u0010,\"\u0004\b0\u00101R+\u00103\u001A\u00020\u000F2\u0006\u0010(\u001A\u00020\u000F8F@BX\u0086\u008E\u0002\u00A2\u0006\u0012\n\u0004\b2\u0010.\u001A\u0004\b3\u0010,\"\u0004\b4\u00101R+\u00106\u001A\u00020\u000F2\u0006\u0010(\u001A\u00020\u000F8F@BX\u0086\u008E\u0002\u00A2\u0006\u0012\n\u0004\b5\u0010.\u001A\u0004\b6\u0010,\"\u0004\b7\u00101R+\u00109\u001A\u00020\u000F2\u0006\u0010(\u001A\u00020\u000F8F@BX\u0086\u008E\u0002\u00A2\u0006\u0012\n\u0004\b8\u0010.\u001A\u0004\b9\u0010,\"\u0004\b:\u00101R(\u0010A\u001A\u00020\r8\u0006@\u0006X\u0086\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0012\n\u0004\b;\u0010<\u001A\u0004\b=\u0010>\"\u0004\b?\u0010@R(\u0010E\u001A\u00020\r8\u0006@\u0006X\u0086\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0012\n\u0004\bB\u0010<\u001A\u0004\bC\u0010>\"\u0004\bD\u0010@R(\u0010K\u001A\u0004\u0018\u00010F2\b\u0010(\u001A\u0004\u0018\u00010F8\u0006@BX\u0086\u000E\u00A2\u0006\f\n\u0004\bG\u0010H\u001A\u0004\bI\u0010JR1\u0010O\u001A\u00020\r2\u0006\u0010(\u001A\u00020\r8F@BX\u0086\u008E\u0002\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0012\n\u0004\bL\u0010.\u001A\u0004\bM\u0010>\"\u0004\bN\u0010@R(\u0010S\u001A\u00020\r8\u0006@\u0006X\u0086\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0012\n\u0004\bP\u0010<\u001A\u0004\bQ\u0010>\"\u0004\bR\u0010@\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006U"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;", "", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Landroidx/compose/ui/graphics/GraphicsContext;", "graphicsContext", "Lkotlin/Function0;", "", "onLayerPropertyChanged", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/graphics/GraphicsContext;Lkotlin/jvm/functions/Function0;)V", "cancelPlacementAnimation", "()V", "Landroidx/compose/ui/unit/IntOffset;", "delta", "", "isMovingAway", "animatePlacementDelta-ar5cAso", "(JZ)V", "animatePlacementDelta", "animateAppearance", "animateDisappearance", "release", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "d", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "getFadeInSpec", "()Landroidx/compose/animation/core/FiniteAnimationSpec;", "setFadeInSpec", "(Landroidx/compose/animation/core/FiniteAnimationSpec;)V", "fadeInSpec", "e", "getPlacementSpec", "setPlacementSpec", "placementSpec", "f", "getFadeOutSpec", "setFadeOutSpec", "fadeOutSpec", "<set-?>", "g", "Z", "isRunningMovingAwayAnimation", "()Z", "h", "Landroidx/compose/runtime/MutableState;", "isPlacementAnimationInProgress", "setPlacementAnimationInProgress", "(Z)V", "i", "isAppearanceAnimationInProgress", "setAppearanceAnimationInProgress", "j", "isDisappearanceAnimationInProgress", "setDisappearanceAnimationInProgress", "k", "isDisappearanceAnimationFinished", "setDisappearanceAnimationFinished", "l", "J", "getRawOffset-nOcc-ac", "()J", "setRawOffset--gyyYBs", "(J)V", "rawOffset", "m", "getFinalOffset-nOcc-ac", "setFinalOffset--gyyYBs", "finalOffset", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "n", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "getLayer", "()Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "q", "getPlacementDelta-nOcc-ac", "setPlacementDelta--gyyYBs", "placementDelta", "r", "getLookaheadOffset-nOcc-ac", "setLookaheadOffset--gyyYBs", "lookaheadOffset", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLazyLayoutItemAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutItemAnimation.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,304:1\n81#2:305\n107#2,2:306\n81#2:308\n107#2,2:309\n81#2:311\n107#2,2:312\n81#2:314\n107#2,2:315\n81#2:317\n107#2,2:318\n1#3:320\n*S KotlinDebug\n*F\n+ 1 LazyLayoutItemAnimation.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation\n*L\n56#1:305\n56#1:306,2\n62#1:308\n62#1:309,2\n68#1:311\n68#1:312,2\n74#1:314\n74#1:315,2\n106#1:317\n106#1:318,2\n*E\n"})
public final class LazyLayoutItemAnimation {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001D\u0010\u0003\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation$Companion;", "", "Landroidx/compose/ui/unit/IntOffset;", "NotInitialized", "J", "getNotInitialized-nOcc-ac", "()J", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        // 去混淆评级： 低(20)
        public final long getNotInitialized-nOcc-ac() [...] // 潜在的解密器
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final CoroutineScope a;
    public final GraphicsContext b;
    public final Function0 c;
    public FiniteAnimationSpec d;
    public FiniteAnimationSpec e;
    public FiniteAnimationSpec f;
    public boolean g;
    public final MutableState h;
    public final MutableState i;
    public final MutableState j;
    public final MutableState k;
    public long l;
    public long m;
    public GraphicsLayer n;
    public final Animatable o;
    public final Animatable p;
    public final MutableState q;
    public long r;
    public static final long s;

    static {
        LazyLayoutItemAnimation.Companion = new Companion(null);
        LazyLayoutItemAnimation.$stable = 8;
        LazyLayoutItemAnimation.s = 0x7FFFFFFF7FFFFFFFL;
    }

    public LazyLayoutItemAnimation(@NotNull CoroutineScope coroutineScope0, @Nullable GraphicsContext graphicsContext0, @NotNull Function0 function00) {
        this.a = coroutineScope0;
        this.b = graphicsContext0;
        this.c = function00;
        this.h = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.i = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.j = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.k = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.l = LazyLayoutItemAnimation.s;
        this.m = 0L;
        this.n = graphicsContext0 == null ? null : graphicsContext0.createGraphicsLayer();
        this.o = new Animatable(IntOffset.box-impl(0L), VectorConvertersKt.getVectorConverter(IntOffset.Companion), null, null, 12, null);
        this.p = new Animatable(1.0f, VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE), null, null, 12, null);
        this.q = SnapshotStateKt.mutableStateOf$default(IntOffset.box-impl(0L), null, 2, null);
        this.r = LazyLayoutItemAnimation.s;
    }

    public LazyLayoutItemAnimation(CoroutineScope coroutineScope0, GraphicsContext graphicsContext0, Function0 function00, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            graphicsContext0 = null;
        }
        if((v & 4) != 0) {
            function00 = g.w;
        }
        this(coroutineScope0, graphicsContext0, function00);
    }

    public static final long access$getNotInitialized$cp() [...] // 潜在的解密器

    public static final void access$setAppearanceAnimationInProgress(LazyLayoutItemAnimation lazyLayoutItemAnimation0, boolean z) {
        lazyLayoutItemAnimation0.i.setValue(Boolean.valueOf(z));
    }

    public static final void access$setDisappearanceAnimationFinished(LazyLayoutItemAnimation lazyLayoutItemAnimation0, boolean z) {
        lazyLayoutItemAnimation0.k.setValue(Boolean.valueOf(z));
    }

    public static final void access$setDisappearanceAnimationInProgress(LazyLayoutItemAnimation lazyLayoutItemAnimation0, boolean z) {
        lazyLayoutItemAnimation0.j.setValue(Boolean.valueOf(z));
    }

    public static final void access$setPlacementAnimationInProgress(LazyLayoutItemAnimation lazyLayoutItemAnimation0, boolean z) {
        lazyLayoutItemAnimation0.h.setValue(Boolean.valueOf(z));
    }

    public static final void access$setPlacementDelta--gyyYBs(LazyLayoutItemAnimation lazyLayoutItemAnimation0, long v) {
        IntOffset intOffset0 = IntOffset.box-impl(v);
        lazyLayoutItemAnimation0.q.setValue(intOffset0);
    }

    public final void animateAppearance() {
        GraphicsLayer graphicsLayer0 = this.n;
        FiniteAnimationSpec finiteAnimationSpec0 = this.d;
        if(!this.isAppearanceAnimationInProgress() && finiteAnimationSpec0 != null && graphicsLayer0 != null) {
            this.i.setValue(Boolean.TRUE);
            boolean z = this.isDisappearanceAnimationInProgress();
            if(!z) {
                graphicsLayer0.setAlpha(0.0f);
            }
            j j0 = new j(!z, this, finiteAnimationSpec0, graphicsLayer0, null);
            BuildersKt.launch$default(this.a, null, null, j0, 3, null);
            return;
        }
        if(this.isDisappearanceAnimationInProgress()) {
            if(graphicsLayer0 != null) {
                graphicsLayer0.setAlpha(1.0f);
            }
            h h0 = new h(this, null);
            BuildersKt.launch$default(this.a, null, null, h0, 3, null);
        }
    }

    public final void animateDisappearance() {
        GraphicsLayer graphicsLayer0 = this.n;
        FiniteAnimationSpec finiteAnimationSpec0 = this.f;
        if(graphicsLayer0 != null && !this.isDisappearanceAnimationInProgress() && finiteAnimationSpec0 != null) {
            this.j.setValue(Boolean.TRUE);
            k k0 = new k(this, finiteAnimationSpec0, graphicsLayer0, null);
            BuildersKt.launch$default(this.a, null, null, k0, 3, null);
        }
    }

    public final void animatePlacementDelta-ar5cAso(long v, boolean z) {
        FiniteAnimationSpec finiteAnimationSpec0 = this.e;
        if(finiteAnimationSpec0 == null) {
            return;
        }
        long v1 = IntOffset.minus-qkQi6aY(this.getPlacementDelta-nOcc-ac(), v);
        IntOffset intOffset0 = IntOffset.box-impl(v1);
        this.q.setValue(intOffset0);
        this.h.setValue(Boolean.TRUE);
        this.g = z;
        m m0 = new m(this, finiteAnimationSpec0, v1, null);
        BuildersKt.launch$default(this.a, null, null, m0, 3, null);
    }

    public final void cancelPlacementAnimation() {
        if(this.isPlacementAnimationInProgress()) {
            n n0 = new n(this, null);
            BuildersKt.launch$default(this.a, null, null, n0, 3, null);
        }
    }

    @Nullable
    public final FiniteAnimationSpec getFadeInSpec() {
        return this.d;
    }

    @Nullable
    public final FiniteAnimationSpec getFadeOutSpec() {
        return this.f;
    }

    public final long getFinalOffset-nOcc-ac() {
        return this.m;
    }

    @Nullable
    public final GraphicsLayer getLayer() {
        return this.n;
    }

    public final long getLookaheadOffset-nOcc-ac() {
        return this.r;
    }

    public final long getPlacementDelta-nOcc-ac() {
        return ((IntOffset)this.q.getValue()).unbox-impl();
    }

    @Nullable
    public final FiniteAnimationSpec getPlacementSpec() {
        return this.e;
    }

    public final long getRawOffset-nOcc-ac() {
        return this.l;
    }

    public final boolean isAppearanceAnimationInProgress() {
        return ((Boolean)this.i.getValue()).booleanValue();
    }

    public final boolean isDisappearanceAnimationFinished() {
        return ((Boolean)this.k.getValue()).booleanValue();
    }

    public final boolean isDisappearanceAnimationInProgress() {
        return ((Boolean)this.j.getValue()).booleanValue();
    }

    public final boolean isPlacementAnimationInProgress() {
        return ((Boolean)this.h.getValue()).booleanValue();
    }

    public final boolean isRunningMovingAwayAnimation() {
        return this.g;
    }

    public final void release() {
        if(this.isPlacementAnimationInProgress()) {
            this.h.setValue(Boolean.FALSE);
            o o0 = new o(this, null);
            BuildersKt.launch$default(this.a, null, null, o0, 3, null);
        }
        if(this.isAppearanceAnimationInProgress()) {
            this.i.setValue(Boolean.FALSE);
            p p0 = new p(this, null);
            BuildersKt.launch$default(this.a, null, null, p0, 3, null);
        }
        if(this.isDisappearanceAnimationInProgress()) {
            this.j.setValue(Boolean.FALSE);
            q q0 = new q(this, null);
            BuildersKt.launch$default(this.a, null, null, q0, 3, null);
        }
        this.g = false;
        IntOffset intOffset0 = IntOffset.box-impl(0L);
        this.q.setValue(intOffset0);
        this.l = 0x7FFFFFFF7FFFFFFFL;
        GraphicsLayer graphicsLayer0 = this.n;
        if(graphicsLayer0 != null) {
            GraphicsContext graphicsContext0 = this.b;
            if(graphicsContext0 != null) {
                graphicsContext0.releaseGraphicsLayer(graphicsLayer0);
            }
        }
        this.n = null;
        this.d = null;
        this.f = null;
        this.e = null;
    }

    public final void setFadeInSpec(@Nullable FiniteAnimationSpec finiteAnimationSpec0) {
        this.d = finiteAnimationSpec0;
    }

    public final void setFadeOutSpec(@Nullable FiniteAnimationSpec finiteAnimationSpec0) {
        this.f = finiteAnimationSpec0;
    }

    public final void setFinalOffset--gyyYBs(long v) {
        this.m = v;
    }

    public final void setLookaheadOffset--gyyYBs(long v) {
        this.r = v;
    }

    public final void setPlacementSpec(@Nullable FiniteAnimationSpec finiteAnimationSpec0) {
        this.e = finiteAnimationSpec0;
    }

    public final void setRawOffset--gyyYBs(long v) {
        this.l = v;
    }
}

