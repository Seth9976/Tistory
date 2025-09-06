package androidx.compose.animation.core;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b+\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B[\b\u0000\u0012\u0006\u0010\u0005\u001A\u00028\u0000\u0012\u0012\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0006\u0010\b\u001A\u00028\u0001\u0012\u0006\u0010\n\u001A\u00020\t\u0012\u0006\u0010\u000B\u001A\u00028\u0000\u0012\u0006\u0010\f\u001A\u00020\t\u0012\u0006\u0010\u000E\u001A\u00020\r\u0012\f\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\u00100\u000F\u00A2\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001A\u00020\u0010\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0016\u00A2\u0006\u0004\b\u0017\u0010\u0018R#\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00068\u0006\u00A2\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u001CR\u0017\u0010\u000B\u001A\u00028\u00008\u0006\u00A2\u0006\f\n\u0004\b\u001D\u0010\u001E\u001A\u0004\b\u001F\u0010 R\u0017\u0010\f\u001A\u00020\t8\u0006\u00A2\u0006\f\n\u0004\b!\u0010\"\u001A\u0004\b#\u0010$R+\u0010+\u001A\u00028\u00002\u0006\u0010%\u001A\u00028\u00008F@@X\u0086\u008E\u0002\u00A2\u0006\u0012\n\u0004\b&\u0010\'\u001A\u0004\b(\u0010 \"\u0004\b)\u0010*R*\u00102\u001A\u00028\u00012\u0006\u0010%\u001A\u00028\u00018\u0006@@X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b,\u0010-\u001A\u0004\b.\u0010/\"\u0004\b0\u00101R*\u0010\n\u001A\u00020\t2\u0006\u0010%\u001A\u00020\t8F@@X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b3\u0010\"\u001A\u0004\b4\u0010$\"\u0004\b5\u00106R*\u0010:\u001A\u00020\t2\u0006\u0010%\u001A\u00020\t8F@@X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b7\u0010\"\u001A\u0004\b8\u0010$\"\u0004\b9\u00106R+\u0010\u000E\u001A\u00020\r2\u0006\u0010%\u001A\u00020\r8F@@X\u0086\u008E\u0002\u00A2\u0006\u0012\n\u0004\b;\u0010\'\u001A\u0004\b\u000E\u0010<\"\u0004\b=\u0010>R\u0011\u0010@\u001A\u00028\u00008F\u00A2\u0006\u0006\u001A\u0004\b?\u0010 \u00A8\u0006A"}, d2 = {"Landroidx/compose/animation/core/AnimationScope;", "T", "Landroidx/compose/animation/core/AnimationVector;", "V", "", "initialValue", "Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "initialVelocityVector", "", "lastFrameTimeNanos", "targetValue", "startTimeNanos", "", "isRunning", "Lkotlin/Function0;", "", "onCancel", "<init>", "(Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Landroidx/compose/animation/core/AnimationVector;JLjava/lang/Object;JZLkotlin/jvm/functions/Function0;)V", "cancelAnimation", "()V", "Landroidx/compose/animation/core/AnimationState;", "toAnimationState", "()Landroidx/compose/animation/core/AnimationState;", "a", "Landroidx/compose/animation/core/TwoWayConverter;", "getTypeConverter", "()Landroidx/compose/animation/core/TwoWayConverter;", "b", "Ljava/lang/Object;", "getTargetValue", "()Ljava/lang/Object;", "c", "J", "getStartTimeNanos", "()J", "<set-?>", "e", "Landroidx/compose/runtime/MutableState;", "getValue", "setValue$animation_core_release", "(Ljava/lang/Object;)V", "value", "f", "Landroidx/compose/animation/core/AnimationVector;", "getVelocityVector", "()Landroidx/compose/animation/core/AnimationVector;", "setVelocityVector$animation_core_release", "(Landroidx/compose/animation/core/AnimationVector;)V", "velocityVector", "g", "getLastFrameTimeNanos", "setLastFrameTimeNanos$animation_core_release", "(J)V", "h", "getFinishedTimeNanos", "setFinishedTimeNanos$animation_core_release", "finishedTimeNanos", "i", "()Z", "setRunning$animation_core_release", "(Z)V", "getVelocity", "velocity", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAnimationState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationState.kt\nandroidx/compose/animation/core/AnimationScope\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,343:1\n81#2:344\n107#2,2:345\n81#2:347\n107#2,2:348\n*S KotlinDebug\n*F\n+ 1 AnimationState.kt\nandroidx/compose/animation/core/AnimationScope\n*L\n147#1:344\n147#1:345,2\n181#1:347\n181#1:348,2\n*E\n"})
public final class AnimationScope {
    public static final int $stable = 8;
    public final TwoWayConverter a;
    public final Object b;
    public final long c;
    public final Function0 d;
    public final MutableState e;
    public AnimationVector f;
    public long g;
    public long h;
    public final MutableState i;

    public AnimationScope(Object object0, @NotNull TwoWayConverter twoWayConverter0, @NotNull AnimationVector animationVector0, long v, Object object1, long v1, boolean z, @NotNull Function0 function00) {
        this.a = twoWayConverter0;
        this.b = object1;
        this.c = v1;
        this.d = function00;
        this.e = SnapshotStateKt.mutableStateOf$default(object0, null, 2, null);
        this.f = AnimationVectorsKt.copy(animationVector0);
        this.g = v;
        this.h = 0x8000000000000000L;
        this.i = SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z), null, 2, null);
    }

    public final void cancelAnimation() {
        this.setRunning$animation_core_release(false);
        this.d.invoke();
    }

    public final long getFinishedTimeNanos() {
        return this.h;
    }

    public final long getLastFrameTimeNanos() {
        return this.g;
    }

    public final long getStartTimeNanos() {
        return this.c;
    }

    public final Object getTargetValue() {
        return this.b;
    }

    @NotNull
    public final TwoWayConverter getTypeConverter() {
        return this.a;
    }

    public final Object getValue() {
        return this.e.getValue();
    }

    public final Object getVelocity() {
        return this.a.getConvertFromVector().invoke(this.f);
    }

    @NotNull
    public final AnimationVector getVelocityVector() {
        return this.f;
    }

    public final boolean isRunning() {
        return ((Boolean)this.i.getValue()).booleanValue();
    }

    public final void setFinishedTimeNanos$animation_core_release(long v) {
        this.h = v;
    }

    public final void setLastFrameTimeNanos$animation_core_release(long v) {
        this.g = v;
    }

    public final void setRunning$animation_core_release(boolean z) {
        this.i.setValue(Boolean.valueOf(z));
    }

    public final void setValue$animation_core_release(Object object0) {
        this.e.setValue(object0);
    }

    public final void setVelocityVector$animation_core_release(@NotNull AnimationVector animationVector0) {
        this.f = animationVector0;
    }

    @NotNull
    public final AnimationState toAnimationState() {
        Object object0 = this.getValue();
        AnimationVector animationVector0 = this.f;
        long v = this.g;
        long v1 = this.h;
        boolean z = this.isRunning();
        return new AnimationState(this.a, object0, animationVector0, v, v1, z);
    }
}

