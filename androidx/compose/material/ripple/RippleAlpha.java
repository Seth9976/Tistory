package androidx.compose.material.ripple;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Immutable
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001A\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000B\u0010\fJ\u000F\u0010\u000E\u001A\u00020\rH\u0016¢\u0006\u0004\b\u000E\u0010\u000FJ\u000F\u0010\u0011\u001A\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001A\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0005\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001A\u0004\b\u001A\u0010\u0016R\u0017\u0010\u0006\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001B\u0010\u0014\u001A\u0004\b\u001C\u0010\u0016¨\u0006\u001D"}, d2 = {"Landroidx/compose/material/ripple/RippleAlpha;", "", "", "draggedAlpha", "focusedAlpha", "hoveredAlpha", "pressedAlpha", "<init>", "(FFFF)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "F", "getDraggedAlpha", "()F", "b", "getFocusedAlpha", "c", "getHoveredAlpha", "d", "getPressedAlpha", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class RippleAlpha {
    public static final int $stable;
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public RippleAlpha(float f, float f1, float f2, float f3) {
        this.a = f;
        this.b = f1;
        this.c = f2;
        this.d = f3;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof RippleAlpha ? this.a == ((RippleAlpha)object0).a && this.b == ((RippleAlpha)object0).b && this.c == ((RippleAlpha)object0).c && this.d == ((RippleAlpha)object0).d : false;
    }

    public final float getDraggedAlpha() {
        return this.a;
    }

    public final float getFocusedAlpha() {
        return this.b;
    }

    public final float getHoveredAlpha() {
        return this.c;
    }

    public final float getPressedAlpha() {
        return this.d;
    }

    @Override
    public int hashCode() {
        return Float.hashCode(this.d) + a.b(this.c, a.b(this.b, Float.hashCode(this.a) * 0x1F, 0x1F), 0x1F);
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("RippleAlpha(draggedAlpha=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", focusedAlpha=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", hoveredAlpha=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", pressedAlpha=");
        return a.n(stringBuilder0, this.d, ')');
    }
}

