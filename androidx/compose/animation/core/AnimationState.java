package androidx.compose.animation.core;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 4)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b&\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004BM\u0012\u0012\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0010\u0007\u001A\u00028\u0000\u0012\n\b\u0002\u0010\b\u001A\u0004\u0018\u00018\u0001\u0012\b\b\u0002\u0010\n\u001A\u00020\t\u0012\b\b\u0002\u0010\u000B\u001A\u00020\t\u0012\b\b\u0002\u0010\r\u001A\u00020\f¢\u0006\u0004\b\u000E\u0010\u000FJ\u000F\u0010\u0011\u001A\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R#\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0016R+\u0010\u001E\u001A\u00028\u00002\u0006\u0010\u0017\u001A\u00028\u00008V@PX\u0096\u008E\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\u001B\"\u0004\b\u001C\u0010\u001DR*\u0010%\u001A\u00028\u00012\u0006\u0010\u0017\u001A\u00028\u00018\u0006@@X\u0086\u000E¢\u0006\u0012\n\u0004\b\u001F\u0010 \u001A\u0004\b!\u0010\"\"\u0004\b#\u0010$R*\u0010\n\u001A\u00020\t2\u0006\u0010\u0017\u001A\u00020\t8F@@X\u0086\u000E¢\u0006\u0012\n\u0004\b&\u0010\'\u001A\u0004\b(\u0010)\"\u0004\b*\u0010+R*\u0010\u000B\u001A\u00020\t2\u0006\u0010\u0017\u001A\u00020\t8F@@X\u0086\u000E¢\u0006\u0012\n\u0004\b,\u0010\'\u001A\u0004\b-\u0010)\"\u0004\b.\u0010+R*\u0010\r\u001A\u00020\f2\u0006\u0010\u0017\u001A\u00020\f8\u0006@@X\u0086\u000E¢\u0006\u0012\n\u0004\b/\u00100\u001A\u0004\b\r\u00101\"\u0004\b2\u00103R\u0011\u00105\u001A\u00028\u00008F¢\u0006\u0006\u001A\u0004\b4\u0010\u001B¨\u00066"}, d2 = {"Landroidx/compose/animation/core/AnimationState;", "T", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/runtime/State;", "Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "initialValue", "initialVelocityVector", "", "lastFrameTimeNanos", "finishedTimeNanos", "", "isRunning", "<init>", "(Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationVector;JJZ)V", "", "toString", "()Ljava/lang/String;", "a", "Landroidx/compose/animation/core/TwoWayConverter;", "getTypeConverter", "()Landroidx/compose/animation/core/TwoWayConverter;", "<set-?>", "b", "Landroidx/compose/runtime/MutableState;", "getValue", "()Ljava/lang/Object;", "setValue$animation_core_release", "(Ljava/lang/Object;)V", "value", "c", "Landroidx/compose/animation/core/AnimationVector;", "getVelocityVector", "()Landroidx/compose/animation/core/AnimationVector;", "setVelocityVector$animation_core_release", "(Landroidx/compose/animation/core/AnimationVector;)V", "velocityVector", "d", "J", "getLastFrameTimeNanos", "()J", "setLastFrameTimeNanos$animation_core_release", "(J)V", "e", "getFinishedTimeNanos", "setFinishedTimeNanos$animation_core_release", "f", "Z", "()Z", "setRunning$animation_core_release", "(Z)V", "getVelocity", "velocity", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAnimationState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationState.kt\nandroidx/compose/animation/core/AnimationState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,343:1\n81#2:344\n107#2,2:345\n*S KotlinDebug\n*F\n+ 1 AnimationState.kt\nandroidx/compose/animation/core/AnimationState\n*L\n53#1:344\n53#1:345,2\n*E\n"})
public final class AnimationState implements State {
    public static final int $stable;
    public final TwoWayConverter a;
    public final MutableState b;
    public AnimationVector c;
    public long d;
    public long e;
    public boolean f;

    public AnimationState(@NotNull TwoWayConverter twoWayConverter0, Object object0, @Nullable AnimationVector animationVector0, long v, long v1, boolean z) {
        AnimationVector animationVector1;
        this.a = twoWayConverter0;
        this.b = SnapshotStateKt.mutableStateOf$default(object0, null, 2, null);
        if(animationVector0 == null) {
            animationVector1 = AnimationStateKt.createZeroVectorFrom(twoWayConverter0, object0);
        }
        else {
            animationVector1 = AnimationVectorsKt.copy(animationVector0);
            if(animationVector1 == null) {
                animationVector1 = AnimationStateKt.createZeroVectorFrom(twoWayConverter0, object0);
            }
        }
        this.c = animationVector1;
        this.d = v;
        this.e = v1;
        this.f = z;
    }

    public AnimationState(TwoWayConverter twoWayConverter0, Object object0, AnimationVector animationVector0, long v, long v1, boolean z, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
        this(twoWayConverter0, object0, ((v2 & 4) == 0 ? animationVector0 : null), ((v2 & 8) == 0 ? v : 0x8000000000000000L), ((v2 & 16) == 0 ? v1 : 0x8000000000000000L), ((v2 & 0x20) == 0 ? z : false));
    }

    public final long getFinishedTimeNanos() {
        return this.e;
    }

    public final long getLastFrameTimeNanos() {
        return this.d;
    }

    @NotNull
    public final TwoWayConverter getTypeConverter() {
        return this.a;
    }

    @Override  // androidx.compose.runtime.State
    public Object getValue() {
        return this.b.getValue();
    }

    public final Object getVelocity() {
        return this.a.getConvertFromVector().invoke(this.c);
    }

    @NotNull
    public final AnimationVector getVelocityVector() {
        return this.c;
    }

    public final boolean isRunning() {
        return this.f;
    }

    public final void setFinishedTimeNanos$animation_core_release(long v) {
        this.e = v;
    }

    public final void setLastFrameTimeNanos$animation_core_release(long v) {
        this.d = v;
    }

    public final void setRunning$animation_core_release(boolean z) {
        this.f = z;
    }

    public void setValue$animation_core_release(Object object0) {
        this.b.setValue(object0);
    }

    public final void setVelocityVector$animation_core_release(@NotNull AnimationVector animationVector0) {
        this.c = animationVector0;
    }

    @Override
    @NotNull
    public String toString() {
        return "AnimationState(value=" + this.getValue() + ", velocity=" + this.getVelocity() + ", isRunning=" + this.f + ", lastFrameTimeNanos=" + this.d + ", finishedTimeNanos=" + this.e + ')';
    }
}

