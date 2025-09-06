package androidx.compose.ui.graphics;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\r\b\u0017\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001B\u0010\u000B\u001A\u00020\n2\f\u0010\t\u001A\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b\u000B\u0010\fJ\u001D\u0010\u000B\u001A\u00020\n2\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0005\u001A\u00020\u0003¢\u0006\u0004\b\u000B\u0010\rJ\u0018\u0010\u000F\u001A\u00020\n2\u0006\u0010\u000E\u001A\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\u000F\u0010\u0010J\u001A\u0010\u0011\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000F\u0010\u0014\u001A\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000F\u0010\u0017\u001A\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001A\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u001CR\u0017\u0010\u0005\u001A\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001D\u0010\u001A\u001A\u0004\b\u001E\u0010\u001CR\u0019\u0010\u0006\u001A\u0004\u0018\u00018\u00008\u0006¢\u0006\f\n\u0004\b\u001F\u0010 \u001A\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Landroidx/compose/ui/graphics/Interval;", "T", "", "", "start", "end", "data", "<init>", "(FFLjava/lang/Object;)V", "other", "", "overlaps", "(Landroidx/compose/ui/graphics/Interval;)Z", "(FF)Z", "value", "contains", "(F)Z", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "F", "getStart", "()F", "b", "getEnd", "c", "Ljava/lang/Object;", "getData", "()Ljava/lang/Object;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public class Interval {
    public final float a;
    public final float b;
    public final Object c;

    public Interval(float f, float f1, @Nullable Object object0) {
        this.a = f;
        this.b = f1;
        this.c = object0;
    }

    public Interval(float f, float f1, Object object0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 4) != 0) {
            object0 = null;
        }
        this(f, f1, object0);
    }

    public final boolean contains(float f) {
        return Float.compare(f, this.b) <= 0 && this.a <= f;
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(@Nullable Object object0) {
        return this == object0 ? true : object0 != null && this.getClass() == object0.getClass() && this.a == ((Interval)object0).a && this.b == ((Interval)object0).b && Intrinsics.areEqual(this.c, ((Interval)object0).c);
    }

    @Nullable
    public final Object getData() {
        return this.c;
    }

    public final float getEnd() {
        return this.b;
    }

    public final float getStart() {
        return this.a;
    }

    @Override
    public int hashCode() {
        int v = a.b(this.b, Float.hashCode(this.a) * 0x1F, 0x1F);
        return this.c == null ? v : v + this.c.hashCode();
    }

    public final boolean overlaps(float f, float f1) {
        return this.a <= f1 && this.b >= f;
    }

    public final boolean overlaps(@NotNull Interval interval0) {
        return this.a <= interval0.b && this.b >= interval0.a;
    }

    @Override
    @NotNull
    public String toString() {
        return "Interval(start=" + this.a + ", end=" + this.b + ", data=" + this.c + ')';
    }
}

