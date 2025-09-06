package androidx.compose.animation.core;

import androidx.collection.IntListKt;
import androidx.collection.IntObjectMapKt;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ExperimentalAnimationSpecApi
@Immutable
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0010\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B/\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0005\u0012\b\b\u0002\u0010\t\u001A\u00020\b¢\u0006\u0004\b\n\u0010\u000BJ3\u0010\u0011\u001A\b\u0012\u0004\u0012\u00028\u00010\u0010\"\b\b\u0001\u0010\r*\u00020\f2\u0012\u0010\u000F\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000EH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001A\u0010\u0016\u001A\u00020\u00152\b\u0010\u0014\u001A\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000F\u0010\u0018\u001A\u00020\u0005H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001D\u0010\u0004\u001A\u00020\u00038\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\u0019R\u0017\u0010\u0006\u001A\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001D\u0010\u001B\u001A\u0004\b\u001E\u0010\u0019R\u0017\u0010\u0007\u001A\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001F\u0010\u001B\u001A\u0004\b \u0010\u0019R\u0017\u0010\t\u001A\u00020\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001A\u0004\b#\u0010$\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006%"}, d2 = {"Landroidx/compose/animation/core/ArcAnimationSpec;", "T", "Landroidx/compose/animation/core/DurationBasedAnimationSpec;", "Landroidx/compose/animation/core/ArcMode;", "mode", "", "durationMillis", "delayMillis", "Landroidx/compose/animation/core/Easing;", "easing", "<init>", "(IIILandroidx/compose/animation/core/Easing;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/TwoWayConverter;", "converter", "Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;", "vectorize", "(Landroidx/compose/animation/core/TwoWayConverter;)Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "I", "getMode--9T-Mq4", "b", "getDurationMillis", "c", "getDelayMillis", "d", "Landroidx/compose/animation/core/Easing;", "getEasing", "()Landroidx/compose/animation/core/Easing;", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ArcAnimationSpec implements DurationBasedAnimationSpec {
    public static final int $stable;
    public final int a;
    public final int b;
    public final int c;
    public final Easing d;

    public ArcAnimationSpec(int v, int v1, int v2, Easing easing0, int v3, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v3 & 1) != 0) {
            v = 4;
        }
        if((v3 & 2) != 0) {
            v1 = 300;
        }
        if((v3 & 4) != 0) {
            v2 = 0;
        }
        if((v3 & 8) != 0) {
            easing0 = EasingKt.getFastOutSlowInEasing();
        }
        this(v, v1, v2, easing0, null);
    }

    public ArcAnimationSpec(int v, int v1, int v2, Easing easing0, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = easing0;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ArcAnimationSpec)) {
            return false;
        }
        if(!ArcMode.equals-impl0(this.a, ((ArcAnimationSpec)object0).a)) {
            return false;
        }
        if(this.b != ((ArcAnimationSpec)object0).b) {
            return false;
        }
        return this.c == ((ArcAnimationSpec)object0).c ? Intrinsics.areEqual(this.d, ((ArcAnimationSpec)object0).d) : false;
    }

    public final int getDelayMillis() {
        return this.c;
    }

    public final int getDurationMillis() {
        return this.b;
    }

    @NotNull
    public final Easing getEasing() {
        return this.d;
    }

    public final int getMode--9T-Mq4() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return this.d.hashCode() + ((ArcMode.hashCode-impl(this.a) * 0x1F + this.b) * 0x1F + this.c) * 0x1F;
    }

    @Override  // androidx.compose.animation.core.AnimationSpec
    public VectorizedAnimationSpec vectorize(TwoWayConverter twoWayConverter0) {
        return this.vectorize(twoWayConverter0);
    }

    @Override  // androidx.compose.animation.core.DurationBasedAnimationSpec
    @NotNull
    public VectorizedDurationBasedAnimationSpec vectorize(@NotNull TwoWayConverter twoWayConverter0) {
        return new VectorizedKeyframesSpec(IntListKt.intListOf(0, this.b), IntObjectMapKt.emptyIntObjectMap(), this.b, this.c, this.d, this.a, null);
    }

    @Override  // androidx.compose.animation.core.FiniteAnimationSpec
    public VectorizedFiniteAnimationSpec vectorize(TwoWayConverter twoWayConverter0) {
        return this.vectorize(twoWayConverter0);
    }
}

