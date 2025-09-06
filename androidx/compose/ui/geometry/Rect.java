package androidx.compose.ui.geometry;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Immutable
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b#\b\u0087\b\u0018\u0000 g2\u00020\u0001:\u0001gB\'\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0007\u0010\bJ\u001A\u0010\r\u001A\u00020\u00002\u0006\u0010\n\u001A\u00020\tH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u000B\u0010\fJ\u001F\u0010\r\u001A\u00020\u00002\u0006\u0010\u000E\u001A\u00020\u00022\u0006\u0010\u000F\u001A\u00020\u0002H\u0007\u00A2\u0006\u0004\b\r\u0010\u0010J\u0017\u0010\u0012\u001A\u00020\u00002\u0006\u0010\u0011\u001A\u00020\u0002H\u0007\u00A2\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001A\u00020\u00002\u0006\u0010\u0011\u001A\u00020\u0002H\u0007\u00A2\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0016\u001A\u00020\u00002\u0006\u0010\u0015\u001A\u00020\u0000H\u0007\u00A2\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u0016\u001A\u00020\u00002\u0006\u0010\u0018\u001A\u00020\u00022\u0006\u0010\u0019\u001A\u00020\u00022\u0006\u0010\u001A\u001A\u00020\u00022\u0006\u0010\u001B\u001A\u00020\u0002H\u0007\u00A2\u0006\u0004\b\u0016\u0010\u001CJ\u0015\u0010\u001E\u001A\u00020\u001D2\u0006\u0010\u0015\u001A\u00020\u0000\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\u001B\u0010\"\u001A\u00020\u001D2\u0006\u0010\n\u001A\u00020\tH\u0086\u0002\u00F8\u0001\u0000\u00A2\u0006\u0004\b \u0010!J\u000F\u0010$\u001A\u00020#H\u0016\u00A2\u0006\u0004\b$\u0010%J\u0010\u0010&\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b&\u0010\'J\u0010\u0010(\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b(\u0010\'J\u0010\u0010)\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b)\u0010\'J\u0010\u0010*\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b*\u0010\'J8\u0010+\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u0002H\u00C6\u0001\u00A2\u0006\u0004\b+\u0010\u001CJ\u0010\u0010-\u001A\u00020,H\u00D6\u0001\u00A2\u0006\u0004\b-\u0010.J\u001A\u0010/\u001A\u00020\u001D2\b\u0010\u0015\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\b/\u00100R \u0010\u0003\u001A\u00020\u00028\u0006X\u0087\u0004\u00A2\u0006\u0012\n\u0004\b1\u00102\u0012\u0004\b4\u00105\u001A\u0004\b3\u0010\'R \u0010\u0004\u001A\u00020\u00028\u0006X\u0087\u0004\u00A2\u0006\u0012\n\u0004\b6\u00102\u0012\u0004\b8\u00105\u001A\u0004\b7\u0010\'R \u0010\u0005\u001A\u00020\u00028\u0006X\u0087\u0004\u00A2\u0006\u0012\n\u0004\b9\u00102\u0012\u0004\b;\u00105\u001A\u0004\b:\u0010\'R \u0010\u0006\u001A\u00020\u00028\u0006X\u0087\u0004\u00A2\u0006\u0012\n\u0004\b<\u00102\u0012\u0004\b>\u00105\u001A\u0004\b=\u0010\'R\u001A\u0010A\u001A\u00020\u00028FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b@\u00105\u001A\u0004\b?\u0010\'R\u001A\u0010D\u001A\u00020\u00028FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\bC\u00105\u001A\u0004\bB\u0010\'R \u0010I\u001A\u00020E8FX\u0087\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\u0012\u0004\bH\u00105\u001A\u0004\bF\u0010GR\u001A\u0010J\u001A\u00020\u001D8FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\bL\u00105\u001A\u0004\bJ\u0010KR\u001A\u0010M\u001A\u00020\u001D8FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\bN\u00105\u001A\u0004\bM\u0010KR\u001A\u0010O\u001A\u00020\u001D8FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\bP\u00105\u001A\u0004\bO\u0010KR\u0011\u0010R\u001A\u00020\u00028F\u00A2\u0006\u0006\u001A\u0004\bQ\u0010\'R\u0011\u0010T\u001A\u00020\u00028F\u00A2\u0006\u0006\u001A\u0004\bS\u0010\'R\u0017\u0010V\u001A\u00020\t8F\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\u001A\u0004\bU\u0010GR\u0017\u0010X\u001A\u00020\t8F\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\u001A\u0004\bW\u0010GR\u0017\u0010Z\u001A\u00020\t8F\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\u001A\u0004\bY\u0010GR\u0017\u0010\\\u001A\u00020\t8F\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\u001A\u0004\b[\u0010GR\u0017\u0010^\u001A\u00020\t8F\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\u001A\u0004\b]\u0010GR\u0017\u0010`\u001A\u00020\t8F\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\u001A\u0004\b_\u0010GR\u0017\u0010b\u001A\u00020\t8F\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\u001A\u0004\ba\u0010GR\u0017\u0010d\u001A\u00020\t8F\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\u001A\u0004\bc\u0010GR\u0017\u0010f\u001A\u00020\t8F\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\u001A\u0004\be\u0010G\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006h"}, d2 = {"Landroidx/compose/ui/geometry/Rect;", "", "", "left", "top", "right", "bottom", "<init>", "(FFFF)V", "Landroidx/compose/ui/geometry/Offset;", "offset", "translate-k-4lQ0M", "(J)Landroidx/compose/ui/geometry/Rect;", "translate", "translateX", "translateY", "(FF)Landroidx/compose/ui/geometry/Rect;", "delta", "inflate", "(F)Landroidx/compose/ui/geometry/Rect;", "deflate", "other", "intersect", "(Landroidx/compose/ui/geometry/Rect;)Landroidx/compose/ui/geometry/Rect;", "otherLeft", "otherTop", "otherRight", "otherBottom", "(FFFF)Landroidx/compose/ui/geometry/Rect;", "", "overlaps", "(Landroidx/compose/ui/geometry/Rect;)Z", "contains-k-4lQ0M", "(J)Z", "contains", "", "toString", "()Ljava/lang/String;", "component1", "()F", "component2", "component3", "component4", "copy", "", "hashCode", "()I", "equals", "(Ljava/lang/Object;)Z", "a", "F", "getLeft", "getLeft$annotations", "()V", "b", "getTop", "getTop$annotations", "c", "getRight", "getRight$annotations", "d", "getBottom", "getBottom$annotations", "getWidth", "getWidth$annotations", "width", "getHeight", "getHeight$annotations", "height", "Landroidx/compose/ui/geometry/Size;", "getSize-NH-jbRc", "()J", "getSize-NH-jbRc$annotations", "size", "isInfinite", "()Z", "isInfinite$annotations", "isFinite", "isFinite$annotations", "isEmpty", "isEmpty$annotations", "getMinDimension", "minDimension", "getMaxDimension", "maxDimension", "getTopLeft-F1C5BW0", "topLeft", "getTopCenter-F1C5BW0", "topCenter", "getTopRight-F1C5BW0", "topRight", "getCenterLeft-F1C5BW0", "centerLeft", "getCenter-F1C5BW0", "center", "getCenterRight-F1C5BW0", "centerRight", "getBottomLeft-F1C5BW0", "bottomLeft", "getBottomCenter-F1C5BW0", "bottomCenter", "getBottomRight-F1C5BW0", "bottomRight", "Companion", "ui-geometry_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class Rect {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R \u0010\u0003\u001A\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001A\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/compose/ui/geometry/Rect$Companion;", "", "Landroidx/compose/ui/geometry/Rect;", "Zero", "Landroidx/compose/ui/geometry/Rect;", "getZero", "()Landroidx/compose/ui/geometry/Rect;", "getZero$annotations", "()V", "ui-geometry_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final Rect getZero() {
            return Rect.e;
        }

        @Stable
        public static void getZero$annotations() {
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public static final Rect e;

    static {
        Rect.Companion = new Companion(null);
        Rect.e = new Rect(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public Rect(float f, float f1, float f2, float f3) {
        this.a = f;
        this.b = f1;
        this.c = f2;
        this.d = f3;
    }

    public final float component1() {
        return this.a;
    }

    public final float component2() {
        return this.b;
    }

    public final float component3() {
        return this.c;
    }

    public final float component4() {
        return this.d;
    }

    public final boolean contains-k-4lQ0M(long v) {
        return Offset.getX-impl(v) >= this.a && Offset.getX-impl(v) < this.c && Offset.getY-impl(v) >= this.b && Offset.getY-impl(v) < this.d;
    }

    @NotNull
    public final Rect copy(float f, float f1, float f2, float f3) {
        return new Rect(f, f1, f2, f3);
    }

    public static Rect copy$default(Rect rect0, float f, float f1, float f2, float f3, int v, Object object0) {
        if((v & 1) != 0) {
            f = rect0.a;
        }
        if((v & 2) != 0) {
            f1 = rect0.b;
        }
        if((v & 4) != 0) {
            f2 = rect0.c;
        }
        if((v & 8) != 0) {
            f3 = rect0.d;
        }
        return rect0.copy(f, f1, f2, f3);
    }

    @Stable
    @NotNull
    public final Rect deflate(float f) {
        return this.inflate(-f);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Rect)) {
            return false;
        }
        if(Float.compare(this.a, ((Rect)object0).a) != 0) {
            return false;
        }
        if(Float.compare(this.b, ((Rect)object0).b) != 0) {
            return false;
        }
        return Float.compare(this.c, ((Rect)object0).c) == 0 ? Float.compare(this.d, ((Rect)object0).d) == 0 : false;
    }

    public final float getBottom() {
        return this.d;
    }

    @Stable
    public static void getBottom$annotations() {
    }

    public final long getBottomCenter-F1C5BW0() {
        return OffsetKt.Offset(this.getWidth() / 2.0f + this.a, this.d);
    }

    public final long getBottomLeft-F1C5BW0() {
        return OffsetKt.Offset(this.a, this.d);
    }

    public final long getBottomRight-F1C5BW0() {
        return OffsetKt.Offset(this.c, this.d);
    }

    public final long getCenter-F1C5BW0() {
        return OffsetKt.Offset(this.getWidth() / 2.0f + this.a, this.getHeight() / 2.0f + this.b);
    }

    public final long getCenterLeft-F1C5BW0() {
        return OffsetKt.Offset(this.a, this.getHeight() / 2.0f + this.b);
    }

    public final long getCenterRight-F1C5BW0() {
        return OffsetKt.Offset(this.c, this.getHeight() / 2.0f + this.b);
    }

    public final float getHeight() {
        return this.d - this.b;
    }

    @Stable
    public static void getHeight$annotations() {
    }

    public final float getLeft() {
        return this.a;
    }

    @Stable
    public static void getLeft$annotations() {
    }

    public final float getMaxDimension() {
        return Math.max(Math.abs(this.getWidth()), Math.abs(this.getHeight()));
    }

    public final float getMinDimension() {
        return Math.min(Math.abs(this.getWidth()), Math.abs(this.getHeight()));
    }

    public final float getRight() {
        return this.c;
    }

    @Stable
    public static void getRight$annotations() {
    }

    public final long getSize-NH-jbRc() {
        return SizeKt.Size(this.getWidth(), this.getHeight());
    }

    @Stable
    public static void getSize-NH-jbRc$annotations() {
    }

    public final float getTop() {
        return this.b;
    }

    @Stable
    public static void getTop$annotations() {
    }

    public final long getTopCenter-F1C5BW0() {
        return OffsetKt.Offset(this.getWidth() / 2.0f + this.a, this.b);
    }

    public final long getTopLeft-F1C5BW0() {
        return OffsetKt.Offset(this.a, this.b);
    }

    public final long getTopRight-F1C5BW0() {
        return OffsetKt.Offset(this.c, this.b);
    }

    public final float getWidth() {
        return this.c - this.a;
    }

    @Stable
    public static void getWidth$annotations() {
    }

    @Override
    public int hashCode() {
        return Float.hashCode(this.d) + a.b(this.c, a.b(this.b, Float.hashCode(this.a) * 0x1F, 0x1F), 0x1F);
    }

    @Stable
    @NotNull
    public final Rect inflate(float f) {
        return new Rect(this.a - f, this.b - f, this.c + f, this.d + f);
    }

    @Stable
    @NotNull
    public final Rect intersect(float f, float f1, float f2, float f3) {
        return new Rect(Math.max(this.a, f), Math.max(this.b, f1), Math.min(this.c, f2), Math.min(this.d, f3));
    }

    @Stable
    @NotNull
    public final Rect intersect(@NotNull Rect rect0) {
        return new Rect(Math.max(this.a, rect0.a), Math.max(this.b, rect0.b), Math.min(this.c, rect0.c), Math.min(this.d, rect0.d));
    }

    public final boolean isEmpty() {
        return this.a >= this.c || this.b >= this.d;
    }

    @Stable
    public static void isEmpty$annotations() {
    }

    // 去混淆评级： 中等(80)
    public final boolean isFinite() {
        return !Float.isInfinite(this.a) && !Float.isNaN(this.a) && (!Float.isInfinite(this.b) && !Float.isNaN(this.b)) && (!Float.isInfinite(this.c) && !Float.isNaN(this.c)) && (!Float.isInfinite(this.d) && !Float.isNaN(this.d));
    }

    @Stable
    public static void isFinite$annotations() {
    }

    public final boolean isInfinite() {
        return this.a >= Infinityf || this.b >= Infinityf || this.c >= Infinityf || this.d >= Infinityf;
    }

    @Stable
    public static void isInfinite$annotations() {
    }

    public final boolean overlaps(@NotNull Rect rect0) {
        return Float.compare(this.c, rect0.a) > 0 && rect0.c > this.a && this.d > rect0.b && rect0.d > this.b;
    }

    @Override
    @NotNull
    public String toString() {
        return "Rect.fromLTRB(" + GeometryUtilsKt.toStringAsFixed(this.a, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.b, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.c, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.d, 1) + ')';
    }

    @Stable
    @NotNull
    public final Rect translate(float f, float f1) {
        return new Rect(this.a + f, this.b + f1, this.c + f, this.d + f1);
    }

    @Stable
    @NotNull
    public final Rect translate-k-4lQ0M(long v) {
        return new Rect(Offset.getX-impl(v) + this.a, Offset.getY-impl(v) + this.b, Offset.getX-impl(v) + this.c, Offset.getY-impl(v) + this.d);
    }
}

