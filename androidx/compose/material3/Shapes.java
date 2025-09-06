package androidx.compose.material3;

import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u000F\b\u0007\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ?\u0010\n\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u0002¢\u0006\u0004\b\n\u0010\u000BJ\u001A\u0010\u000E\u001A\u00020\r2\b\u0010\f\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000E\u0010\u000FJ\u000F\u0010\u0011\u001A\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000F\u0010\u0014\u001A\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001A\u0010\u0017\u001A\u0004\b\u001B\u0010\u0019R\u0017\u0010\u0005\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001C\u0010\u0017\u001A\u0004\b\u001D\u0010\u0019R\u0017\u0010\u0006\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001E\u0010\u0017\u001A\u0004\b\u001F\u0010\u0019R\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0017\u001A\u0004\b!\u0010\u0019¨\u0006\""}, d2 = {"Landroidx/compose/material3/Shapes;", "", "Landroidx/compose/foundation/shape/CornerBasedShape;", "extraSmall", "small", "medium", "large", "extraLarge", "<init>", "(Landroidx/compose/foundation/shape/CornerBasedShape;Landroidx/compose/foundation/shape/CornerBasedShape;Landroidx/compose/foundation/shape/CornerBasedShape;Landroidx/compose/foundation/shape/CornerBasedShape;Landroidx/compose/foundation/shape/CornerBasedShape;)V", "copy", "(Landroidx/compose/foundation/shape/CornerBasedShape;Landroidx/compose/foundation/shape/CornerBasedShape;Landroidx/compose/foundation/shape/CornerBasedShape;Landroidx/compose/foundation/shape/CornerBasedShape;Landroidx/compose/foundation/shape/CornerBasedShape;)Landroidx/compose/material3/Shapes;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Landroidx/compose/foundation/shape/CornerBasedShape;", "getExtraSmall", "()Landroidx/compose/foundation/shape/CornerBasedShape;", "b", "getSmall", "c", "getMedium", "d", "getLarge", "e", "getExtraLarge", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class Shapes {
    public static final int $stable;
    public final CornerBasedShape a;
    public final CornerBasedShape b;
    public final CornerBasedShape c;
    public final CornerBasedShape d;
    public final CornerBasedShape e;

    public Shapes() {
        this(null, null, null, null, null, 0x1F, null);
    }

    public Shapes(@NotNull CornerBasedShape cornerBasedShape0, @NotNull CornerBasedShape cornerBasedShape1, @NotNull CornerBasedShape cornerBasedShape2, @NotNull CornerBasedShape cornerBasedShape3, @NotNull CornerBasedShape cornerBasedShape4) {
        this.a = cornerBasedShape0;
        this.b = cornerBasedShape1;
        this.c = cornerBasedShape2;
        this.d = cornerBasedShape3;
        this.e = cornerBasedShape4;
    }

    public Shapes(CornerBasedShape cornerBasedShape0, CornerBasedShape cornerBasedShape1, CornerBasedShape cornerBasedShape2, CornerBasedShape cornerBasedShape3, CornerBasedShape cornerBasedShape4, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            cornerBasedShape0 = ShapeDefaults.INSTANCE.getExtraSmall();
        }
        if((v & 2) != 0) {
            cornerBasedShape1 = ShapeDefaults.INSTANCE.getSmall();
        }
        if((v & 4) != 0) {
            cornerBasedShape2 = ShapeDefaults.INSTANCE.getMedium();
        }
        if((v & 8) != 0) {
            cornerBasedShape3 = ShapeDefaults.INSTANCE.getLarge();
        }
        if((v & 16) != 0) {
            cornerBasedShape4 = ShapeDefaults.INSTANCE.getExtraLarge();
        }
        this(cornerBasedShape0, cornerBasedShape1, cornerBasedShape2, cornerBasedShape3, cornerBasedShape4);
    }

    @NotNull
    public final Shapes copy(@NotNull CornerBasedShape cornerBasedShape0, @NotNull CornerBasedShape cornerBasedShape1, @NotNull CornerBasedShape cornerBasedShape2, @NotNull CornerBasedShape cornerBasedShape3, @NotNull CornerBasedShape cornerBasedShape4) {
        return new Shapes(cornerBasedShape0, cornerBasedShape1, cornerBasedShape2, cornerBasedShape3, cornerBasedShape4);
    }

    public static Shapes copy$default(Shapes shapes0, CornerBasedShape cornerBasedShape0, CornerBasedShape cornerBasedShape1, CornerBasedShape cornerBasedShape2, CornerBasedShape cornerBasedShape3, CornerBasedShape cornerBasedShape4, int v, Object object0) {
        if((v & 1) != 0) {
            cornerBasedShape0 = shapes0.a;
        }
        if((v & 2) != 0) {
            cornerBasedShape1 = shapes0.b;
        }
        if((v & 4) != 0) {
            cornerBasedShape2 = shapes0.c;
        }
        if((v & 8) != 0) {
            cornerBasedShape3 = shapes0.d;
        }
        if((v & 16) != 0) {
            cornerBasedShape4 = shapes0.e;
        }
        return shapes0.copy(cornerBasedShape0, cornerBasedShape1, cornerBasedShape2, cornerBasedShape3, cornerBasedShape4);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Shapes)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.a, ((Shapes)object0).a)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, ((Shapes)object0).b)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.c, ((Shapes)object0).c)) {
            return false;
        }
        return Intrinsics.areEqual(this.d, ((Shapes)object0).d) ? Intrinsics.areEqual(this.e, ((Shapes)object0).e) : false;
    }

    @NotNull
    public final CornerBasedShape getExtraLarge() {
        return this.e;
    }

    @NotNull
    public final CornerBasedShape getExtraSmall() {
        return this.a;
    }

    @NotNull
    public final CornerBasedShape getLarge() {
        return this.d;
    }

    @NotNull
    public final CornerBasedShape getMedium() {
        return this.c;
    }

    @NotNull
    public final CornerBasedShape getSmall() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() + (this.c.hashCode() + (this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F) * 0x1F) * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        return "Shapes(extraSmall=" + this.a + ", small=" + this.b + ", medium=" + this.c + ", large=" + this.d + ", extraLarge=" + this.e + ')';
    }
}

