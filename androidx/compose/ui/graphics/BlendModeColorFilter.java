package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Immutable
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B%\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\n\u0010\b\u001A\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\t\u0010\u000BJ\u001A\u0010\u000F\u001A\u00020\u000E2\b\u0010\r\u001A\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000F\u0010\u0010J\u000F\u0010\u0012\u001A\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000F\u0010\u0015\u001A\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001D\u0010\u0003\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\u001AR\u001D\u0010\u0005\u001A\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\u0013\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u001E"}, d2 = {"Landroidx/compose/ui/graphics/BlendModeColorFilter;", "Landroidx/compose/ui/graphics/ColorFilter;", "Landroidx/compose/ui/graphics/Color;", "color", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "Landroid/graphics/ColorFilter;", "Landroidx/compose/ui/graphics/NativeColorFilter;", "nativeColorFilter", "<init>", "(JILandroid/graphics/ColorFilter;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(JILkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "b", "J", "getColor-0d7_KjU", "()J", "c", "I", "getBlendMode-0nO6VwU", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class BlendModeColorFilter extends ColorFilter {
    public final long b;
    public final int c;

    public BlendModeColorFilter(long v, int v1, android.graphics.ColorFilter colorFilter0, DefaultConstructorMarker defaultConstructorMarker0) {
        super(colorFilter0);
        this.b = v;
        this.c = v1;
    }

    public BlendModeColorFilter(long v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        this(v, v1, AndroidColorFilter_androidKt.actualTintColorFilter-xETnrds(v, v1), null);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof BlendModeColorFilter)) {
            return false;
        }
        return Color.equals-impl0(this.b, ((BlendModeColorFilter)object0).b) ? BlendMode.equals-impl0(this.c, ((BlendModeColorFilter)object0).c) : false;
    }

    public final int getBlendMode-0nO6VwU() {
        return this.c;
    }

    public final long getColor-0d7_KjU() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return BlendMode.hashCode-impl(this.c) + Color.hashCode-impl(this.b) * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("BlendModeColorFilter(color=");
        a.x(this.b, ", blendMode=", stringBuilder0);
        stringBuilder0.append(BlendMode.toString-impl(this.c));
        stringBuilder0.append(')');
        return stringBuilder0.toString();
    }
}

