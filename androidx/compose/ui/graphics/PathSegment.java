package androidx.compose.ui.graphics;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001 B!\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001A\u0010\f\u001A\u00020\u000B2\b\u0010\n\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000F\u0010\u000F\u001A\u00020\u000EH\u0016¢\u0006\u0004\b\u000F\u0010\u0010J\u000F\u0010\u0012\u001A\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\u001BR\u0017\u0010\u0007\u001A\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\u001F¨\u0006!"}, d2 = {"Landroidx/compose/ui/graphics/PathSegment;", "", "Landroidx/compose/ui/graphics/PathSegment$Type;", "type", "", "points", "", "weight", "<init>", "(Landroidx/compose/ui/graphics/PathSegment$Type;[FF)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Landroidx/compose/ui/graphics/PathSegment$Type;", "getType", "()Landroidx/compose/ui/graphics/PathSegment$Type;", "b", "[F", "getPoints", "()[F", "c", "F", "getWeight", "()F", "Type", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class PathSegment {
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/graphics/PathSegment$Type;", "", "Move", "Line", "Quadratic", "Conic", "Cubic", "Close", "Done", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static enum Type {
        Move,
        Line,
        Quadratic,
        Conic,
        Cubic,
        Close,
        Done;

    }

    public final Type a;
    public final float[] b;
    public final float c;

    public PathSegment(@NotNull Type pathSegment$Type0, @NotNull float[] arr_f, float f) {
        this.a = pathSegment$Type0;
        this.b = arr_f;
        this.c = f;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            if(PathSegment.class != class0 || this.a != ((PathSegment)object0).a) {
                return false;
            }
            return Arrays.equals(this.b, ((PathSegment)object0).b) ? this.c == ((PathSegment)object0).c : false;
        }
        return false;
    }

    @NotNull
    public final float[] getPoints() {
        return this.b;
    }

    @NotNull
    public final Type getType() {
        return this.a;
    }

    public final float getWeight() {
        return this.c;
    }

    @Override
    public int hashCode() {
        int v = Arrays.hashCode(this.b);
        return Float.hashCode(this.c) + (v + this.a.hashCode() * 0x1F) * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("PathSegment(type=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", points=");
        String s = Arrays.toString(this.b);
        Intrinsics.checkNotNullExpressionValue(s, "toString(this)");
        stringBuilder0.append(s);
        stringBuilder0.append(", weight=");
        return a.n(stringBuilder0, this.c, ')');
    }
}

