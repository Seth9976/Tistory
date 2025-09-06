package androidx.compose.animation.core;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import t.i;

@ExperimentalAnimatableApi
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u0003\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B\u001B\u0012\u0012\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u000E\u001A\u00028\u00002\u0006\u0010\t\u001A\u00028\u00002\u0006\u0010\u000B\u001A\u00020\n2\u000E\b\u0002\u0010\r\u001A\b\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0004\b\u000E\u0010\u000FR\u0013\u0010\u0012\u001A\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001A\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0014\u001A\u00020\u00138F¢\u0006\u0006\u001A\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/compose/animation/core/DeferredTargetAnimation;", "T", "Landroidx/compose/animation/core/AnimationVector;", "V", "", "Landroidx/compose/animation/core/TwoWayConverter;", "vectorConverter", "<init>", "(Landroidx/compose/animation/core/TwoWayConverter;)V", "target", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "animationSpec", "updateTarget", "(Ljava/lang/Object;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/animation/core/FiniteAnimationSpec;)Ljava/lang/Object;", "getPendingTarget", "()Ljava/lang/Object;", "pendingTarget", "", "isIdle", "()Z", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDeferredTargetAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeferredTargetAnimation.kt\nandroidx/compose/animation/core/DeferredTargetAnimation\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,91:1\n81#2:92\n107#2,2:93\n1#3:95\n*S KotlinDebug\n*F\n+ 1 DeferredTargetAnimation.kt\nandroidx/compose/animation/core/DeferredTargetAnimation\n*L\n53#1:92\n53#1:93,2\n*E\n"})
public final class DeferredTargetAnimation {
    public static final int $stable = 8;
    public final TwoWayConverter a;
    public final MutableState b;
    public Animatable c;

    public DeferredTargetAnimation(@NotNull TwoWayConverter twoWayConverter0) {
        this.a = twoWayConverter0;
        this.b = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    public static final Object access$get_pendingTarget(DeferredTargetAnimation deferredTargetAnimation0) {
        return deferredTargetAnimation0.b.getValue();
    }

    @Nullable
    public final Object getPendingTarget() {
        return this.b.getValue();
    }

    // 去混淆评级： 低(20)
    public final boolean isIdle() {
        return Intrinsics.areEqual(this.b.getValue(), (this.c == null ? null : this.c.getTargetValue())) && (this.c == null || !this.c.isRunning());
    }

    public final Object updateTarget(Object object0, @NotNull CoroutineScope coroutineScope0, @NotNull FiniteAnimationSpec finiteAnimationSpec0) {
        Animatable animatable1;
        this.b.setValue(object0);
        Animatable animatable0 = this.c;
        if(animatable0 == null) {
            animatable1 = new Animatable(object0, this.a, null, null, 12, null);
            this.c = animatable1;
        }
        else {
            animatable1 = animatable0;
        }
        BuildersKt.launch$default(coroutineScope0, null, null, new i(animatable1, this, object0, finiteAnimationSpec0, null), 3, null);
        return animatable1.getValue();
    }

    public static Object updateTarget$default(DeferredTargetAnimation deferredTargetAnimation0, Object object0, CoroutineScope coroutineScope0, FiniteAnimationSpec finiteAnimationSpec0, int v, Object object1) {
        if((v & 4) != 0) {
            finiteAnimationSpec0 = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        return deferredTargetAnimation0.updateTarget(object0, coroutineScope0, finiteAnimationSpec0);
    }
}

