package androidx.compose.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u000B\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001C\u0010\t\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\r\u001A\u00020\u0003HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000B\u0010\fJ3\u0010\u0011\u001A\u00020\u000E2\u0014\b\u0002\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u0003HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\u000F\u0010\u0010J\u0010\u0010\u0013\u001A\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001A\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001A\u0010\u001A\u001A\u00020\u00192\b\u0010\u0018\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001A\u0010\u001BR#\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\nR(\u0010\u0006\u001A\u00020\u00038\u0006@\u0006X\u0086\u000Eø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b\u001F\u0010 \u001A\u0004\b!\u0010\f\"\u0004\b\"\u0010#\u0082\u0002\u000B\n\u0002\b!\n\u0005\b¡\u001E0\u0001¨\u0006$"}, d2 = {"androidx/compose/animation/SizeAnimationModifierNode$AnimData", "", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/animation/core/AnimationVector2D;", "anim", "startSize", "<init>", "(Landroidx/compose/animation/core/Animatable;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Landroidx/compose/animation/core/Animatable;", "component2-YbymL2g", "()J", "component2", "Landroidx/compose/animation/SizeAnimationModifierNode$AnimData;", "copy-O0kMr_c", "(Landroidx/compose/animation/core/Animatable;J)Landroidx/compose/animation/SizeAnimationModifierNode$AnimData;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/animation/core/Animatable;", "getAnim", "b", "J", "getStartSize-YbymL2g", "setStartSize-ozmzZPI", "(J)V", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class SizeAnimationModifierNode.AnimData {
    public static final int $stable = 8;
    public final Animatable a;
    public long b;

    public SizeAnimationModifierNode.AnimData(Animatable animatable0, long v, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = animatable0;
        this.b = v;
    }

    @NotNull
    public final Animatable component1() {
        return this.a;
    }

    public final long component2-YbymL2g() {
        return this.b;
    }

    @NotNull
    public final SizeAnimationModifierNode.AnimData copy-O0kMr_c(@NotNull Animatable animatable0, long v) {
        return new SizeAnimationModifierNode.AnimData(animatable0, v, null);
    }

    public static SizeAnimationModifierNode.AnimData copy-O0kMr_c$default(SizeAnimationModifierNode.AnimData sizeAnimationModifierNode$AnimData0, Animatable animatable0, long v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            animatable0 = sizeAnimationModifierNode$AnimData0.a;
        }
        if((v1 & 2) != 0) {
            v = sizeAnimationModifierNode$AnimData0.b;
        }
        return sizeAnimationModifierNode$AnimData0.copy-O0kMr_c(animatable0, v);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof SizeAnimationModifierNode.AnimData)) {
            return false;
        }
        return Intrinsics.areEqual(this.a, ((SizeAnimationModifierNode.AnimData)object0).a) ? IntSize.equals-impl0(this.b, ((SizeAnimationModifierNode.AnimData)object0).b) : false;
    }

    @NotNull
    public final Animatable getAnim() {
        return this.a;
    }

    public final long getStartSize-YbymL2g() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return IntSize.hashCode-impl(this.b) + this.a.hashCode() * 0x1F;
    }

    public final void setStartSize-ozmzZPI(long v) {
        this.b = v;
    }

    @Override
    @NotNull
    public String toString() {
        return "AnimData(anim=" + this.a + ", startSize=" + IntSize.toString-impl(this.b) + ')';
    }
}

