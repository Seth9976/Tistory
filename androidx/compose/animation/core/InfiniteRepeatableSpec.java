package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000F\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B!\b\u0017\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB)\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0005\u0012\b\b\u0002\u0010\n\u001A\u00020\t¢\u0006\u0004\b\u0007\u0010\u000BJ3\u0010\u0011\u001A\b\u0012\u0004\u0012\u00028\u00010\u0010\"\b\b\u0001\u0010\r*\u00020\f2\u0012\u0010\u000F\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000EH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001A\u0010\u0016\u001A\u00020\u00152\b\u0010\u0014\u001A\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000F\u0010\u0019\u001A\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001AR\u001D\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\u001ER\u0017\u0010\u0006\u001A\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001F\u0010 \u001A\u0004\b!\u0010\"R\u001D\u0010\n\u001A\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b#\u0010$\u001A\u0004\b%\u0010&\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\'"}, d2 = {"Landroidx/compose/animation/core/InfiniteRepeatableSpec;", "T", "Landroidx/compose/animation/core/AnimationSpec;", "Landroidx/compose/animation/core/DurationBasedAnimationSpec;", "animation", "Landroidx/compose/animation/core/RepeatMode;", "repeatMode", "<init>", "(Landroidx/compose/animation/core/DurationBasedAnimationSpec;Landroidx/compose/animation/core/RepeatMode;)V", "Landroidx/compose/animation/core/StartOffset;", "initialStartOffset", "(Landroidx/compose/animation/core/DurationBasedAnimationSpec;Landroidx/compose/animation/core/RepeatMode;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/TwoWayConverter;", "converter", "Landroidx/compose/animation/core/VectorizedAnimationSpec;", "vectorize", "(Landroidx/compose/animation/core/TwoWayConverter;)Landroidx/compose/animation/core/VectorizedAnimationSpec;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Landroidx/compose/animation/core/DurationBasedAnimationSpec;", "getAnimation", "()Landroidx/compose/animation/core/DurationBasedAnimationSpec;", "b", "Landroidx/compose/animation/core/RepeatMode;", "getRepeatMode", "()Landroidx/compose/animation/core/RepeatMode;", "c", "J", "getInitialStartOffset-Rmkjzm4", "()J", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class InfiniteRepeatableSpec implements AnimationSpec {
    public static final int $stable = 8;
    public final DurationBasedAnimationSpec a;
    public final RepeatMode b;
    public final long c;

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This constructor has been deprecated")
    public InfiniteRepeatableSpec(DurationBasedAnimationSpec durationBasedAnimationSpec0, RepeatMode repeatMode0) {
        this(durationBasedAnimationSpec0, repeatMode0, 0L, null);
    }

    public InfiniteRepeatableSpec(DurationBasedAnimationSpec durationBasedAnimationSpec0, RepeatMode repeatMode0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            repeatMode0 = RepeatMode.Restart;
        }
        this(durationBasedAnimationSpec0, repeatMode0);
    }

    public InfiniteRepeatableSpec(DurationBasedAnimationSpec durationBasedAnimationSpec0, RepeatMode repeatMode0, long v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 2) != 0) {
            repeatMode0 = RepeatMode.Restart;
        }
        if((v1 & 4) != 0) {
            v = 0L;
        }
        this(durationBasedAnimationSpec0, repeatMode0, v, null);
    }

    public InfiniteRepeatableSpec(DurationBasedAnimationSpec durationBasedAnimationSpec0, RepeatMode repeatMode0, long v, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = durationBasedAnimationSpec0;
        this.b = repeatMode0;
        this.c = v;
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(@Nullable Object object0) {
        return object0 instanceof InfiniteRepeatableSpec && Intrinsics.areEqual(((InfiniteRepeatableSpec)object0).a, this.a) && ((InfiniteRepeatableSpec)object0).b == this.b && StartOffset.equals-impl0(((InfiniteRepeatableSpec)object0).c, this.c);
    }

    @NotNull
    public final DurationBasedAnimationSpec getAnimation() {
        return this.a;
    }

    public final long getInitialStartOffset-Rmkjzm4() {
        return this.c;
    }

    @NotNull
    public final RepeatMode getRepeatMode() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return StartOffset.hashCode-impl(this.c) + (this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F;
    }

    @Override  // androidx.compose.animation.core.AnimationSpec
    @NotNull
    public VectorizedAnimationSpec vectorize(@NotNull TwoWayConverter twoWayConverter0) {
        return new VectorizedInfiniteRepeatableSpec(this.a.vectorize(twoWayConverter0), this.b, this.c, null);
    }
}

