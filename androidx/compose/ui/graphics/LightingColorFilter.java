package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Immutable
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B%\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\n\u0010\u0007\u001A\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002¢\u0006\u0004\b\b\u0010\nJ\u001A\u0010\u000E\u001A\u00020\r2\b\u0010\f\u001A\u0004\u0018\u00010\u000BH\u0096\u0002¢\u0006\u0004\b\u000E\u0010\u000FJ\u000F\u0010\u0011\u001A\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000F\u0010\u0014\u001A\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001D\u0010\u0003\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\u0019R\u001D\u0010\u0004\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001A\u0010\u0017\u001A\u0004\b\u001B\u0010\u0019\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u001C"}, d2 = {"Landroidx/compose/ui/graphics/LightingColorFilter;", "Landroidx/compose/ui/graphics/ColorFilter;", "Landroidx/compose/ui/graphics/Color;", "multiply", "add", "Landroid/graphics/ColorFilter;", "Landroidx/compose/ui/graphics/NativeColorFilter;", "nativeColorFilter", "<init>", "(JJLandroid/graphics/ColorFilter;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "b", "J", "getMultiply-0d7_KjU", "()J", "c", "getAdd-0d7_KjU", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class LightingColorFilter extends ColorFilter {
    public final long b;
    public final long c;

    public LightingColorFilter(long v, long v1, android.graphics.ColorFilter colorFilter0, DefaultConstructorMarker defaultConstructorMarker0) {
        super(colorFilter0);
        this.b = v;
        this.c = v1;
    }

    public LightingColorFilter(long v, long v1, DefaultConstructorMarker defaultConstructorMarker0) {
        this(v, v1, AndroidColorFilter_androidKt.actualLightingColorFilter--OWjLjI(v, v1), null);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof LightingColorFilter)) {
            return false;
        }
        return Color.equals-impl0(this.b, ((LightingColorFilter)object0).b) ? Color.equals-impl0(this.c, ((LightingColorFilter)object0).c) : false;
    }

    public final long getAdd-0d7_KjU() {
        return this.c;
    }

    public final long getMultiply-0d7_KjU() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return Color.hashCode-impl(this.c) + Color.hashCode-impl(this.b) * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("LightingColorFilter(multiply=");
        a.x(this.b, ", add=", stringBuilder0);
        stringBuilder0.append(Color.toString-impl(this.c));
        stringBuilder0.append(')');
        return stringBuilder0.toString();
    }
}

