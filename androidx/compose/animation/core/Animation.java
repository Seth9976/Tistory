package androidx.compose.animation.core;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\u00020\u0004J\u0015\u0010\u0013\u001A\u00028\u00002\u0006\u0010\u0014\u001A\u00020\u0006H&¢\u0006\u0002\u0010\u0015J\u0015\u0010\u0016\u001A\u00028\u00012\u0006\u0010\u0014\u001A\u00020\u0006H&¢\u0006\u0002\u0010\u0017J\u0010\u0010\u0018\u001A\u00020\n2\u0006\u0010\u0014\u001A\u00020\u0006H\u0016R\u0014\u0010\u0005\u001A\u00020\u00068fX¦\u0004¢\u0006\u0006\u001A\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001A\u00020\nX¦\u0004¢\u0006\u0006\u001A\u0004\b\t\u0010\u000BR\u0012\u0010\f\u001A\u00028\u0000X¦\u0004¢\u0006\u0006\u001A\u0004\b\r\u0010\u000ER\u001E\u0010\u000F\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0011\u0010\u0012ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0019À\u0006\u0003"}, d2 = {"Landroidx/compose/animation/core/Animation;", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "", "durationNanos", "", "getDurationNanos", "()J", "isInfinite", "", "()Z", "targetValue", "getTargetValue", "()Ljava/lang/Object;", "typeConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "getTypeConverter", "()Landroidx/compose/animation/core/TwoWayConverter;", "getValueFromNanos", "playTimeNanos", "(J)Ljava/lang/Object;", "getVelocityVectorFromNanos", "(J)Landroidx/compose/animation/core/AnimationVector;", "isFinishedFromNanos", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface Animation {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public static final class DefaultImpls {
        @Deprecated
        public static boolean isFinishedFromNanos(@NotNull Animation animation0, long v) {
            return animation0.super.isFinishedFromNanos(v);
        }
    }

    long getDurationNanos();

    Object getTargetValue();

    @NotNull
    TwoWayConverter getTypeConverter();

    Object getValueFromNanos(long arg1);

    @NotNull
    AnimationVector getVelocityVectorFromNanos(long arg1);

    default boolean isFinishedFromNanos(long v) {
        return v >= this.getDurationNanos();
    }

    boolean isInfinite();
}

