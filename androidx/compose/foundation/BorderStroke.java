package androidx.compose.foundation;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Immutable
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u000E\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\n\u001A\u00020\t2\b\u0010\b\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000BJ\u000F\u0010\r\u001A\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000EJ\u000F\u0010\u0010\u001A\u00020\u000FH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0014\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u001D\u0010\u0003\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u001C\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u001D"}, d2 = {"Landroidx/compose/foundation/BorderStroke;", "", "Landroidx/compose/ui/unit/Dp;", "width", "Landroidx/compose/ui/graphics/Brush;", "brush", "<init>", "(FLandroidx/compose/ui/graphics/Brush;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "copy-D5KLDUw", "(FLandroidx/compose/ui/graphics/Brush;)Landroidx/compose/foundation/BorderStroke;", "copy", "a", "F", "getWidth-D9Ej5fM", "()F", "b", "Landroidx/compose/ui/graphics/Brush;", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class BorderStroke {
    public static final int $stable;
    public final float a;
    public final Brush b;

    public BorderStroke(float f, Brush brush0, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = f;
        this.b = brush0;
    }

    @NotNull
    public final BorderStroke copy-D5KLDUw(float f, @NotNull Brush brush0) {
        return new BorderStroke(f, brush0, null);
    }

    public static BorderStroke copy-D5KLDUw$default(BorderStroke borderStroke0, float f, Brush brush0, int v, Object object0) {
        if((v & 1) != 0) {
            f = borderStroke0.a;
        }
        if((v & 2) != 0) {
            brush0 = borderStroke0.b;
        }
        return borderStroke0.copy-D5KLDUw(f, brush0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof BorderStroke)) {
            return false;
        }
        return Dp.equals-impl0(this.a, ((BorderStroke)object0).a) ? Intrinsics.areEqual(this.b, ((BorderStroke)object0).b) : false;
    }

    @NotNull
    public final Brush getBrush() {
        return this.b;
    }

    public final float getWidth-D9Ej5fM() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return this.b.hashCode() + Dp.hashCode-impl(this.a) * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("BorderStroke(width=");
        a.u(this.a, ", brush=", stringBuilder0);
        stringBuilder0.append(this.b);
        stringBuilder0.append(')');
        return stringBuilder0.toString();
    }
}

