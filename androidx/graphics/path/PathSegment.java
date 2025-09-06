package androidx.graphics.path;

import android.graphics.PointF;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001!B\'\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001A\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001A\u0010\r\u001A\u00020\f2\b\u0010\u000B\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000EJ\u000F\u0010\u0010\u001A\u00020\u000FH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000F\u0010\u0013\u001A\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0018R\u001D\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u001CR\u0017\u0010\b\u001A\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001D\u0010\u001E\u001A\u0004\b\u001F\u0010 ¨\u0006\""}, d2 = {"Landroidx/graphics/path/PathSegment;", "", "Landroidx/graphics/path/PathSegment$Type;", "type", "", "Landroid/graphics/PointF;", "points", "", "weight", "<init>", "(Landroidx/graphics/path/PathSegment$Type;[Landroid/graphics/PointF;F)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Landroidx/graphics/path/PathSegment$Type;", "getType", "()Landroidx/graphics/path/PathSegment$Type;", "b", "[Landroid/graphics/PointF;", "getPoints", "()[Landroid/graphics/PointF;", "c", "F", "getWeight", "()F", "Type", "graphics-path_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class PathSegment {
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Landroidx/graphics/path/PathSegment$Type;", "", "Move", "Line", "Quadratic", "Conic", "Cubic", "Close", "Done", "graphics-path_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
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
    public final PointF[] b;
    public final float c;

    public PathSegment(@NotNull Type pathSegment$Type0, @NotNull PointF[] arr_pointF, float f) {
        Intrinsics.checkNotNullParameter(pathSegment$Type0, "type");
        Intrinsics.checkNotNullParameter(arr_pointF, "points");
        super();
        this.a = pathSegment$Type0;
        this.b = arr_pointF;
        this.c = f;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        Class class0 = object0 == null ? null : object0.getClass();
        if(!Intrinsics.areEqual(PathSegment.class, class0)) {
            return false;
        }
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type androidx.graphics.path.PathSegment");
        if(this.a != ((PathSegment)object0).a) {
            return false;
        }
        return Arrays.equals(this.b, ((PathSegment)object0).b) ? this.c == ((PathSegment)object0).c : false;
    }

    @NotNull
    public final PointF[] getPoints() {
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
        return Float.hashCode(this.c) + (this.a.hashCode() * 0x1F + v) * 0x1F;
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

