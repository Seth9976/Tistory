package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B8\u0012!\u0010\b\u001A\u001D\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0002\u0012\f\u0010\n\u001A\b\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0004\b\u000B\u0010\fJ+\u0010\r\u001A\u001D\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000EJ\u0016\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u00070\tHÆ\u0003¢\u0006\u0004\b\u000F\u0010\u0010JE\u0010\u0011\u001A\u00020\u00002#\b\u0002\u0010\b\u001A\u001D\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u00022\u000E\b\u0002\u0010\n\u001A\b\u0012\u0004\u0012\u00020\u00070\tHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001A\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001A\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001A\u0010\u001B\u001A\u00020\u001A2\b\u0010\u0019\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001B\u0010\u001CR2\u0010\b\u001A\u001D\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u00028\u0006¢\u0006\f\n\u0004\b\u001D\u0010\u001E\u001A\u0004\b\u001F\u0010\u000ER\u001D\u0010\n\u001A\b\u0012\u0004\u0012\u00020\u00070\t8\u0006¢\u0006\f\n\u0004\b \u0010!\u001A\u0004\b\"\u0010\u0010¨\u0006#"}, d2 = {"Landroidx/compose/animation/Slide;", "", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/IntSize;", "Lkotlin/ParameterName;", "name", "fullSize", "Landroidx/compose/ui/unit/IntOffset;", "slideOffset", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "animationSpec", "<init>", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/animation/core/FiniteAnimationSpec;)V", "component1", "()Lkotlin/jvm/functions/Function1;", "component2", "()Landroidx/compose/animation/core/FiniteAnimationSpec;", "copy", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/animation/core/FiniteAnimationSpec;)Landroidx/compose/animation/Slide;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkotlin/jvm/functions/Function1;", "getSlideOffset", "b", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "getAnimationSpec", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class Slide {
    public static final int $stable;
    public final Function1 a;
    public final FiniteAnimationSpec b;

    public Slide(@NotNull Function1 function10, @NotNull FiniteAnimationSpec finiteAnimationSpec0) {
        this.a = function10;
        this.b = finiteAnimationSpec0;
    }

    @NotNull
    public final Function1 component1() {
        return this.a;
    }

    @NotNull
    public final FiniteAnimationSpec component2() {
        return this.b;
    }

    @NotNull
    public final Slide copy(@NotNull Function1 function10, @NotNull FiniteAnimationSpec finiteAnimationSpec0) {
        return new Slide(function10, finiteAnimationSpec0);
    }

    public static Slide copy$default(Slide slide0, Function1 function10, FiniteAnimationSpec finiteAnimationSpec0, int v, Object object0) {
        if((v & 1) != 0) {
            function10 = slide0.a;
        }
        if((v & 2) != 0) {
            finiteAnimationSpec0 = slide0.b;
        }
        return slide0.copy(function10, finiteAnimationSpec0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Slide)) {
            return false;
        }
        return Intrinsics.areEqual(this.a, ((Slide)object0).a) ? Intrinsics.areEqual(this.b, ((Slide)object0).b) : false;
    }

    @NotNull
    public final FiniteAnimationSpec getAnimationSpec() {
        return this.b;
    }

    @NotNull
    public final Function1 getSlideOffset() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        return "Slide(slideOffset=" + this.a + ", animationSpec=" + this.b + ')';
    }
}

