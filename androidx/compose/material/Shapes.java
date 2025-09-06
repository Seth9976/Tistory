package androidx.compose.material;

import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u000B\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u001A\u0010\f\u001A\u00020\u000B2\b\u0010\n\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000F\u0010\u000F\u001A\u00020\u000EH\u0016¢\u0006\u0004\b\u000F\u0010\u0010J\u000F\u0010\u0012\u001A\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001A\u0004\b\u0019\u0010\u0017R\u0017\u0010\u0005\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001A\u0010\u0015\u001A\u0004\b\u001B\u0010\u0017¨\u0006\u001C"}, d2 = {"Landroidx/compose/material/Shapes;", "", "Landroidx/compose/foundation/shape/CornerBasedShape;", "small", "medium", "large", "<init>", "(Landroidx/compose/foundation/shape/CornerBasedShape;Landroidx/compose/foundation/shape/CornerBasedShape;Landroidx/compose/foundation/shape/CornerBasedShape;)V", "copy", "(Landroidx/compose/foundation/shape/CornerBasedShape;Landroidx/compose/foundation/shape/CornerBasedShape;Landroidx/compose/foundation/shape/CornerBasedShape;)Landroidx/compose/material/Shapes;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Landroidx/compose/foundation/shape/CornerBasedShape;", "getSmall", "()Landroidx/compose/foundation/shape/CornerBasedShape;", "b", "getMedium", "c", "getLarge", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nShapes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Shapes.kt\nandroidx/compose/material/Shapes\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,101:1\n154#2:102\n154#2:103\n154#2:104\n*S KotlinDebug\n*F\n+ 1 Shapes.kt\nandroidx/compose/material/Shapes\n*L\n50#1:102\n54#1:103\n58#1:104\n*E\n"})
public final class Shapes {
    public static final int $stable;
    public final CornerBasedShape a;
    public final CornerBasedShape b;
    public final CornerBasedShape c;

    public Shapes() {
        this(null, null, null, 7, null);
    }

    public Shapes(@NotNull CornerBasedShape cornerBasedShape0, @NotNull CornerBasedShape cornerBasedShape1, @NotNull CornerBasedShape cornerBasedShape2) {
        this.a = cornerBasedShape0;
        this.b = cornerBasedShape1;
        this.c = cornerBasedShape2;
    }

    public Shapes(CornerBasedShape cornerBasedShape0, CornerBasedShape cornerBasedShape1, CornerBasedShape cornerBasedShape2, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            cornerBasedShape0 = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(4.0f);
        }
        if((v & 2) != 0) {
            cornerBasedShape1 = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(4.0f);
        }
        if((v & 4) != 0) {
            cornerBasedShape2 = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(0.0f);
        }
        this(cornerBasedShape0, cornerBasedShape1, cornerBasedShape2);
    }

    @NotNull
    public final Shapes copy(@NotNull CornerBasedShape cornerBasedShape0, @NotNull CornerBasedShape cornerBasedShape1, @NotNull CornerBasedShape cornerBasedShape2) {
        return new Shapes(cornerBasedShape0, cornerBasedShape1, cornerBasedShape2);
    }

    public static Shapes copy$default(Shapes shapes0, CornerBasedShape cornerBasedShape0, CornerBasedShape cornerBasedShape1, CornerBasedShape cornerBasedShape2, int v, Object object0) {
        if((v & 1) != 0) {
            cornerBasedShape0 = shapes0.a;
        }
        if((v & 2) != 0) {
            cornerBasedShape1 = shapes0.b;
        }
        if((v & 4) != 0) {
            cornerBasedShape2 = shapes0.c;
        }
        return shapes0.copy(cornerBasedShape0, cornerBasedShape1, cornerBasedShape2);
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
        return Intrinsics.areEqual(this.b, ((Shapes)object0).b) ? Intrinsics.areEqual(this.c, ((Shapes)object0).c) : false;
    }

    @NotNull
    public final CornerBasedShape getLarge() {
        return this.c;
    }

    @NotNull
    public final CornerBasedShape getMedium() {
        return this.b;
    }

    @NotNull
    public final CornerBasedShape getSmall() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        return "Shapes(small=" + this.a + ", medium=" + this.b + ", large=" + this.c + ')';
    }
}

