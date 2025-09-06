package androidx.compose.ui.geometry;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\n\u001A\u00020\t2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00022\u0006\u0010\u0006\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\n\u0010\bJ\u001B\u0010\u0010\u001A\u00020\r2\u0006\u0010\f\u001A\u00020\u000BH\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\u000E\u0010\u000FJ-\u0010\u0011\u001A\u00020\t2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00022\u0006\u0010\u0006\u001A\u00020\u0002¢\u0006\u0004\b\u0011\u0010\bJ\u000F\u0010\u0013\u001A\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0003\u001A\u00020\u00028\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001AR\"\u0010\u0004\u001A\u00020\u00028\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u001B\u0010\u0016\u001A\u0004\b\u001C\u0010\u0018\"\u0004\b\u001D\u0010\u001AR\"\u0010\u0005\u001A\u00020\u00028\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u001E\u0010\u0016\u001A\u0004\b\u001F\u0010\u0018\"\u0004\b \u0010\u001AR\"\u0010\u0006\u001A\u00020\u00028\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b!\u0010\u0016\u001A\u0004\b\"\u0010\u0018\"\u0004\b#\u0010\u001AR\u0012\u0010%\u001A\u00020\u00028Æ\u0002¢\u0006\u0006\u001A\u0004\b$\u0010\u0018R\u0012\u0010\'\u001A\u00020\u00028Æ\u0002¢\u0006\u0006\u001A\u0004\b&\u0010\u0018R\u0017\u0010+\u001A\u00020(8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b)\u0010*R\u0011\u0010,\u001A\u00020\r8F¢\u0006\u0006\u001A\u0004\b,\u0010-\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006."}, d2 = {"Landroidx/compose/ui/geometry/MutableRect;", "", "", "left", "top", "right", "bottom", "<init>", "(FFFF)V", "", "intersect", "Landroidx/compose/ui/geometry/Offset;", "offset", "", "contains-k-4lQ0M", "(J)Z", "contains", "set", "", "toString", "()Ljava/lang/String;", "a", "F", "getLeft", "()F", "setLeft", "(F)V", "b", "getTop", "setTop", "c", "getRight", "setRight", "d", "getBottom", "setBottom", "getWidth", "width", "getHeight", "height", "Landroidx/compose/ui/geometry/Size;", "getSize-NH-jbRc", "()J", "size", "isEmpty", "()Z", "ui-geometry_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nMutableRect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableRect.kt\nandroidx/compose/ui/geometry/MutableRect\n*L\n1#1,102:1\n40#1,5:103\n*S KotlinDebug\n*F\n+ 1 MutableRect.kt\nandroidx/compose/ui/geometry/MutableRect\n*L\n51#1:103,5\n*E\n"})
public final class MutableRect {
    public static final int $stable = 8;
    public float a;
    public float b;
    public float c;
    public float d;

    public MutableRect(float f, float f1, float f2, float f3) {
        this.a = f;
        this.b = f1;
        this.c = f2;
        this.d = f3;
    }

    public final boolean contains-k-4lQ0M(long v) {
        return Offset.getX-impl(v) >= this.a && Offset.getX-impl(v) < this.c && Offset.getY-impl(v) >= this.b && Offset.getY-impl(v) < this.d;
    }

    public final float getBottom() {
        return this.d;
    }

    public final float getHeight() {
        return this.getBottom() - this.getTop();
    }

    public final float getLeft() {
        return this.a;
    }

    public final float getRight() {
        return this.c;
    }

    public final long getSize-NH-jbRc() {
        return SizeKt.Size(this.getRight() - this.getLeft(), this.getBottom() - this.getTop());
    }

    public final float getTop() {
        return this.b;
    }

    public final float getWidth() {
        return this.getRight() - this.getLeft();
    }

    @Stable
    public final void intersect(float f, float f1, float f2, float f3) {
        this.a = Math.max(f, this.a);
        this.b = Math.max(f1, this.b);
        this.c = Math.min(f2, this.c);
        this.d = Math.min(f3, this.d);
    }

    public final boolean isEmpty() {
        return this.a >= this.c || this.b >= this.d;
    }

    public final void set(float f, float f1, float f2, float f3) {
        this.a = f;
        this.b = f1;
        this.c = f2;
        this.d = f3;
    }

    public final void setBottom(float f) {
        this.d = f;
    }

    public final void setLeft(float f) {
        this.a = f;
    }

    public final void setRight(float f) {
        this.c = f;
    }

    public final void setTop(float f) {
        this.b = f;
    }

    @Override
    @NotNull
    public String toString() {
        return "MutableRect(" + GeometryUtilsKt.toStringAsFixed(this.a, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.b, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.c, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.d, 1) + ')';
    }
}

