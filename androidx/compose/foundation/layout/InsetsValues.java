package androidx.compose.foundation.layout;

import a5.b;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001A\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000B\u0010\fJ\u000F\u0010\r\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000EJ\u000F\u0010\u0010\u001A\u00020\u000FH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u000ER\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001A\u0004\b\u0016\u0010\u000ER\u0017\u0010\u0005\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001A\u0004\b\u0018\u0010\u000ER\u0017\u0010\u0006\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0013\u001A\u0004\b\u001A\u0010\u000E¨\u0006\u001B"}, d2 = {"Landroidx/compose/foundation/layout/InsetsValues;", "", "", "left", "top", "right", "bottom", "<init>", "(IIII)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "I", "getLeft", "b", "getTop", "c", "getRight", "d", "getBottom", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class InsetsValues {
    public static final int $stable;
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public InsetsValues(int v, int v1, int v2, int v3) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof InsetsValues ? this.a == ((InsetsValues)object0).a && this.b == ((InsetsValues)object0).b && this.c == ((InsetsValues)object0).c && this.d == ((InsetsValues)object0).d : false;
    }

    public final int getBottom() {
        return this.d;
    }

    public final int getLeft() {
        return this.a;
    }

    public final int getRight() {
        return this.c;
    }

    public final int getTop() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return ((this.a * 0x1F + this.b) * 0x1F + this.c) * 0x1F + this.d;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("InsetsValues(left=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", top=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", right=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", bottom=");
        return b.p(stringBuilder0, this.d, ')');
    }
}

