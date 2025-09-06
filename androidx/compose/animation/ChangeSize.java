package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.Alignment;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;
import s.s;

@Immutable
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\r\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00020\u0001BL\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012#\b\u0002\u0010\t\u001A\u001D\u0012\u0013\u0012\u00110\u0005\u00A2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\u00050\n\u0012\b\b\u0002\u0010\r\u001A\u00020\f\u00A2\u0006\u0004\b\u000E\u0010\u000FJ\u0010\u0010\u0010\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0012\u001A\u001D\u0012\u0013\u0012\u00110\u0005\u00A2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0014\u001A\b\u0012\u0004\u0012\u00020\u00050\nH\u00C6\u0003\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001A\u00020\fH\u00C6\u0003\u00A2\u0006\u0004\b\u0016\u0010\u0017JY\u0010\u0018\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022#\b\u0002\u0010\t\u001A\u001D\u0012\u0013\u0012\u00110\u0005\u00A2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u00042\u000E\b\u0002\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\u00050\n2\b\b\u0002\u0010\r\u001A\u00020\fH\u00C6\u0001\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001B\u001A\u00020\u001AH\u00D6\u0001\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u0010\u0010\u001E\u001A\u00020\u001DH\u00D6\u0001\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\u001A\u0010!\u001A\u00020\f2\b\u0010 \u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b#\u0010$\u001A\u0004\b%\u0010\u0011R2\u0010\t\u001A\u001D\u0012\u0013\u0012\u00110\u0005\u00A2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006\u00A2\u0006\f\n\u0004\b&\u0010\'\u001A\u0004\b(\u0010\u0013R\u001D\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\u00050\n8\u0006\u00A2\u0006\f\n\u0004\b)\u0010*\u001A\u0004\b+\u0010\u0015R\u0017\u0010\r\u001A\u00020\f8\u0006\u00A2\u0006\f\n\u0004\b,\u0010-\u001A\u0004\b.\u0010\u0017\u00A8\u0006/"}, d2 = {"Landroidx/compose/animation/ChangeSize;", "", "Landroidx/compose/ui/Alignment;", "alignment", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/IntSize;", "Lkotlin/ParameterName;", "name", "fullSize", "size", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "animationSpec", "", "clip", "<init>", "(Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function1;Landroidx/compose/animation/core/FiniteAnimationSpec;Z)V", "component1", "()Landroidx/compose/ui/Alignment;", "component2", "()Lkotlin/jvm/functions/Function1;", "component3", "()Landroidx/compose/animation/core/FiniteAnimationSpec;", "component4", "()Z", "copy", "(Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function1;Landroidx/compose/animation/core/FiniteAnimationSpec;Z)Landroidx/compose/animation/ChangeSize;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/ui/Alignment;", "getAlignment", "b", "Lkotlin/jvm/functions/Function1;", "getSize", "c", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "getAnimationSpec", "d", "Z", "getClip", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ChangeSize {
    public static final int $stable;
    public final Alignment a;
    public final Function1 b;
    public final FiniteAnimationSpec c;
    public final boolean d;

    public ChangeSize(@NotNull Alignment alignment0, @NotNull Function1 function10, @NotNull FiniteAnimationSpec finiteAnimationSpec0, boolean z) {
        this.a = alignment0;
        this.b = function10;
        this.c = finiteAnimationSpec0;
        this.d = z;
    }

    public ChangeSize(Alignment alignment0, Function1 function10, FiniteAnimationSpec finiteAnimationSpec0, boolean z, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            function10 = s.D;
        }
        if((v & 8) != 0) {
            z = true;
        }
        this(alignment0, function10, finiteAnimationSpec0, z);
    }

    @NotNull
    public final Alignment component1() {
        return this.a;
    }

    @NotNull
    public final Function1 component2() {
        return this.b;
    }

    @NotNull
    public final FiniteAnimationSpec component3() {
        return this.c;
    }

    public final boolean component4() {
        return this.d;
    }

    @NotNull
    public final ChangeSize copy(@NotNull Alignment alignment0, @NotNull Function1 function10, @NotNull FiniteAnimationSpec finiteAnimationSpec0, boolean z) {
        return new ChangeSize(alignment0, function10, finiteAnimationSpec0, z);
    }

    public static ChangeSize copy$default(ChangeSize changeSize0, Alignment alignment0, Function1 function10, FiniteAnimationSpec finiteAnimationSpec0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            alignment0 = changeSize0.a;
        }
        if((v & 2) != 0) {
            function10 = changeSize0.b;
        }
        if((v & 4) != 0) {
            finiteAnimationSpec0 = changeSize0.c;
        }
        if((v & 8) != 0) {
            z = changeSize0.d;
        }
        return changeSize0.copy(alignment0, function10, finiteAnimationSpec0, z);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ChangeSize)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.a, ((ChangeSize)object0).a)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, ((ChangeSize)object0).b)) {
            return false;
        }
        return Intrinsics.areEqual(this.c, ((ChangeSize)object0).c) ? this.d == ((ChangeSize)object0).d : false;
    }

    @NotNull
    public final Alignment getAlignment() {
        return this.a;
    }

    @NotNull
    public final FiniteAnimationSpec getAnimationSpec() {
        return this.c;
    }

    public final boolean getClip() {
        return this.d;
    }

    @NotNull
    public final Function1 getSize() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return Boolean.hashCode(this.d) + (this.c.hashCode() + a.d(this.a.hashCode() * 0x1F, 0x1F, this.b)) * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("ChangeSize(alignment=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", size=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", animationSpec=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", clip=");
        return a.p(stringBuilder0, this.d, ')');
    }
}

