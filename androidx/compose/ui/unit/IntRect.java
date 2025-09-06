package androidx.compose.ui.unit;

import a5.b;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Immutable
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000E\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u001F\b\u0087\b\u0018\u0000 ]2\u00020\u0001:\u0001]B\'\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0007\u0010\bJ\u001A\u0010\r\u001A\u00020\u00002\u0006\u0010\n\u001A\u00020\tH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u000B\u0010\fJ\u001F\u0010\r\u001A\u00020\u00002\u0006\u0010\u000E\u001A\u00020\u00022\u0006\u0010\u000F\u001A\u00020\u0002H\u0007\u00A2\u0006\u0004\b\r\u0010\u0010J\u0017\u0010\u0012\u001A\u00020\u00002\u0006\u0010\u0011\u001A\u00020\u0002H\u0007\u00A2\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001A\u00020\u00002\u0006\u0010\u0011\u001A\u00020\u0002H\u0007\u00A2\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0016\u001A\u00020\u00002\u0006\u0010\u0015\u001A\u00020\u0000H\u0007\u00A2\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001A\u00020\u00182\u0006\u0010\u0015\u001A\u00020\u0000\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u0018\u0010\u001D\u001A\u00020\u00182\u0006\u0010\n\u001A\u00020\t\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u000F\u0010\u001F\u001A\u00020\u001EH\u0016\u00A2\u0006\u0004\b\u001F\u0010 J\u0010\u0010!\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b#\u0010\"J\u0010\u0010$\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b$\u0010\"J\u0010\u0010%\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b%\u0010\"J8\u0010&\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u0002H\u00C6\u0001\u00A2\u0006\u0004\b&\u0010\'J\u0010\u0010(\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\b(\u0010\"J\u001A\u0010)\u001A\u00020\u00182\b\u0010\u0015\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\b)\u0010*R \u0010\u0003\u001A\u00020\u00028\u0006X\u0087\u0004\u00A2\u0006\u0012\n\u0004\b+\u0010,\u0012\u0004\b.\u0010/\u001A\u0004\b-\u0010\"R \u0010\u0004\u001A\u00020\u00028\u0006X\u0087\u0004\u00A2\u0006\u0012\n\u0004\b0\u0010,\u0012\u0004\b2\u0010/\u001A\u0004\b1\u0010\"R \u0010\u0005\u001A\u00020\u00028\u0006X\u0087\u0004\u00A2\u0006\u0012\n\u0004\b3\u0010,\u0012\u0004\b5\u0010/\u001A\u0004\b4\u0010\"R \u0010\u0006\u001A\u00020\u00028\u0006X\u0087\u0004\u00A2\u0006\u0012\n\u0004\b6\u0010,\u0012\u0004\b8\u0010/\u001A\u0004\b7\u0010\"R\u001A\u0010;\u001A\u00020\u00028FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b:\u0010/\u001A\u0004\b9\u0010\"R\u001A\u0010>\u001A\u00020\u00028FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b=\u0010/\u001A\u0004\b<\u0010\"R \u0010C\u001A\u00020?8FX\u0087\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\u0012\u0004\bB\u0010/\u001A\u0004\b@\u0010AR\u001A\u0010D\u001A\u00020\u00188FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\bF\u0010/\u001A\u0004\bD\u0010ER\u0011\u0010H\u001A\u00020\u00028F\u00A2\u0006\u0006\u001A\u0004\bG\u0010\"R\u0011\u0010J\u001A\u00020\u00028F\u00A2\u0006\u0006\u001A\u0004\bI\u0010\"R\u0017\u0010L\u001A\u00020\t8F\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\u001A\u0004\bK\u0010AR\u0017\u0010N\u001A\u00020\t8F\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\u001A\u0004\bM\u0010AR\u0017\u0010P\u001A\u00020\t8F\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\u001A\u0004\bO\u0010AR\u0017\u0010R\u001A\u00020\t8F\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\u001A\u0004\bQ\u0010AR\u0017\u0010T\u001A\u00020\t8F\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\u001A\u0004\bS\u0010AR\u0017\u0010V\u001A\u00020\t8F\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\u001A\u0004\bU\u0010AR\u0017\u0010X\u001A\u00020\t8F\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\u001A\u0004\bW\u0010AR\u0017\u0010Z\u001A\u00020\t8F\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\u001A\u0004\bY\u0010AR\u0017\u0010\\\u001A\u00020\t8F\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\u001A\u0004\b[\u0010A\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006^"}, d2 = {"Landroidx/compose/ui/unit/IntRect;", "", "", "left", "top", "right", "bottom", "<init>", "(IIII)V", "Landroidx/compose/ui/unit/IntOffset;", "offset", "translate--gyyYBs", "(J)Landroidx/compose/ui/unit/IntRect;", "translate", "translateX", "translateY", "(II)Landroidx/compose/ui/unit/IntRect;", "delta", "inflate", "(I)Landroidx/compose/ui/unit/IntRect;", "deflate", "other", "intersect", "(Landroidx/compose/ui/unit/IntRect;)Landroidx/compose/ui/unit/IntRect;", "", "overlaps", "(Landroidx/compose/ui/unit/IntRect;)Z", "contains--gyyYBs", "(J)Z", "contains", "", "toString", "()Ljava/lang/String;", "component1", "()I", "component2", "component3", "component4", "copy", "(IIII)Landroidx/compose/ui/unit/IntRect;", "hashCode", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getLeft", "getLeft$annotations", "()V", "b", "getTop", "getTop$annotations", "c", "getRight", "getRight$annotations", "d", "getBottom", "getBottom$annotations", "getWidth", "getWidth$annotations", "width", "getHeight", "getHeight$annotations", "height", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "()J", "getSize-YbymL2g$annotations", "size", "isEmpty", "()Z", "isEmpty$annotations", "getMinDimension", "minDimension", "getMaxDimension", "maxDimension", "getTopLeft-nOcc-ac", "topLeft", "getTopCenter-nOcc-ac", "topCenter", "getTopRight-nOcc-ac", "topRight", "getCenterLeft-nOcc-ac", "centerLeft", "getCenter-nOcc-ac", "center", "getCenterRight-nOcc-ac", "centerRight", "getBottomLeft-nOcc-ac", "bottomLeft", "getBottomCenter-nOcc-ac", "bottomCenter", "getBottomRight-nOcc-ac", "bottomRight", "Companion", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class IntRect {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R \u0010\u0003\u001A\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001A\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/compose/ui/unit/IntRect$Companion;", "", "Landroidx/compose/ui/unit/IntRect;", "Zero", "Landroidx/compose/ui/unit/IntRect;", "getZero", "()Landroidx/compose/ui/unit/IntRect;", "getZero$annotations", "()V", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final IntRect getZero() {
            return IntRect.e;
        }

        @Stable
        public static void getZero$annotations() {
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public static final IntRect e;

    static {
        IntRect.Companion = new Companion(null);
        IntRect.e = new IntRect(0, 0, 0, 0);
    }

    public IntRect(int v, int v1, int v2, int v3) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
    }

    public final int component1() {
        return this.a;
    }

    public final int component2() {
        return this.b;
    }

    public final int component3() {
        return this.c;
    }

    public final int component4() {
        return this.d;
    }

    public final boolean contains--gyyYBs(long v) {
        return IntOffset.getX-impl(v) >= this.a && IntOffset.getX-impl(v) < this.c && IntOffset.getY-impl(v) >= this.b && IntOffset.getY-impl(v) < this.d;
    }

    @NotNull
    public final IntRect copy(int v, int v1, int v2, int v3) {
        return new IntRect(v, v1, v2, v3);
    }

    public static IntRect copy$default(IntRect intRect0, int v, int v1, int v2, int v3, int v4, Object object0) {
        if((v4 & 1) != 0) {
            v = intRect0.a;
        }
        if((v4 & 2) != 0) {
            v1 = intRect0.b;
        }
        if((v4 & 4) != 0) {
            v2 = intRect0.c;
        }
        if((v4 & 8) != 0) {
            v3 = intRect0.d;
        }
        return intRect0.copy(v, v1, v2, v3);
    }

    @Stable
    @NotNull
    public final IntRect deflate(int v) {
        return this.inflate(-v);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof IntRect)) {
            return false;
        }
        if(this.a != ((IntRect)object0).a) {
            return false;
        }
        if(this.b != ((IntRect)object0).b) {
            return false;
        }
        return this.c == ((IntRect)object0).c ? this.d == ((IntRect)object0).d : false;
    }

    public final int getBottom() {
        return this.d;
    }

    @Stable
    public static void getBottom$annotations() {
    }

    public final long getBottomCenter-nOcc-ac() {
        return IntOffsetKt.IntOffset(this.getWidth() / 2 + this.a, this.d);
    }

    public final long getBottomLeft-nOcc-ac() {
        return IntOffsetKt.IntOffset(this.a, this.d);
    }

    public final long getBottomRight-nOcc-ac() {
        return IntOffsetKt.IntOffset(this.c, this.d);
    }

    public final long getCenter-nOcc-ac() {
        return IntOffsetKt.IntOffset(this.getWidth() / 2 + this.a, this.getHeight() / 2 + this.b);
    }

    public final long getCenterLeft-nOcc-ac() {
        return IntOffsetKt.IntOffset(this.a, this.getHeight() / 2 + this.b);
    }

    public final long getCenterRight-nOcc-ac() {
        return IntOffsetKt.IntOffset(this.c, this.getHeight() / 2 + this.b);
    }

    public final int getHeight() {
        return this.d - this.b;
    }

    @Stable
    public static void getHeight$annotations() {
    }

    public final int getLeft() {
        return this.a;
    }

    @Stable
    public static void getLeft$annotations() {
    }

    public final int getMaxDimension() {
        return Math.max(Math.abs(this.getWidth()), Math.abs(this.getHeight()));
    }

    public final int getMinDimension() {
        return Math.min(Math.abs(this.getWidth()), Math.abs(this.getHeight()));
    }

    public final int getRight() {
        return this.c;
    }

    @Stable
    public static void getRight$annotations() {
    }

    public final long getSize-YbymL2g() {
        return IntSizeKt.IntSize(this.getWidth(), this.getHeight());
    }

    @Stable
    public static void getSize-YbymL2g$annotations() {
    }

    public final int getTop() {
        return this.b;
    }

    @Stable
    public static void getTop$annotations() {
    }

    public final long getTopCenter-nOcc-ac() {
        return IntOffsetKt.IntOffset(this.getWidth() / 2 + this.a, this.b);
    }

    public final long getTopLeft-nOcc-ac() {
        return IntOffsetKt.IntOffset(this.a, this.b);
    }

    public final long getTopRight-nOcc-ac() {
        return IntOffsetKt.IntOffset(this.c, this.b);
    }

    public final int getWidth() {
        return this.c - this.a;
    }

    @Stable
    public static void getWidth$annotations() {
    }

    @Override
    public int hashCode() {
        return this.d + a.c(this.c, a.c(this.b, this.a * 0x1F, 0x1F), 0x1F);
    }

    @Stable
    @NotNull
    public final IntRect inflate(int v) {
        return new IntRect(this.a - v, this.b - v, this.c + v, this.d + v);
    }

    @Stable
    @NotNull
    public final IntRect intersect(@NotNull IntRect intRect0) {
        return new IntRect(Math.max(this.a, intRect0.a), Math.max(this.b, intRect0.b), Math.min(this.c, intRect0.c), Math.min(this.d, intRect0.d));
    }

    public final boolean isEmpty() {
        return this.a >= this.c || this.b >= this.d;
    }

    @Stable
    public static void isEmpty$annotations() {
    }

    public final boolean overlaps(@NotNull IntRect intRect0) {
        return this.c > intRect0.a && intRect0.c > this.a && this.d > intRect0.b && intRect0.d > this.b;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("IntRect.fromLTRB(");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", ");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", ");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", ");
        return b.p(stringBuilder0, this.d, ')');
    }

    @Stable
    @NotNull
    public final IntRect translate(int v, int v1) {
        return new IntRect(this.a + v, this.b + v1, this.c + v, this.d + v1);
    }

    @Stable
    @NotNull
    public final IntRect translate--gyyYBs(long v) {
        return new IntRect(IntOffset.getX-impl(v) + this.a, IntOffset.getY-impl(v) + this.b, IntOffset.getX-impl(v) + this.c, IntOffset.getY-impl(v) + this.d);
    }
}

