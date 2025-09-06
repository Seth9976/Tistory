package androidx.window.core;

import android.graphics.Rect;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wb.a;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0015\b\u0000\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\n\u001A\u00020\t¢\u0006\u0004\b\u0007\u0010\u000BJ\r\u0010\f\u001A\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u000F\u0010\u000F\u001A\u00020\u000EH\u0016¢\u0006\u0004\b\u000F\u0010\u0010J\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000F\u0010\u0015\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\u0016R\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001A\u0010\u0018\u001A\u0004\b\u001B\u0010\u0016R\u0017\u0010\u0005\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001C\u0010\u0018\u001A\u0004\b\u001D\u0010\u0016R\u0017\u0010\u0006\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001E\u0010\u0018\u001A\u0004\b\u001F\u0010\u0016R\u0011\u0010!\u001A\u00020\u00028F¢\u0006\u0006\u001A\u0004\b \u0010\u0016R\u0011\u0010#\u001A\u00020\u00028F¢\u0006\u0006\u001A\u0004\b\"\u0010\u0016R\u0011\u0010$\u001A\u00020\u00128F¢\u0006\u0006\u001A\u0004\b$\u0010%R\u0011\u0010&\u001A\u00020\u00128F¢\u0006\u0006\u001A\u0004\b&\u0010%¨\u0006\'"}, d2 = {"Landroidx/window/core/Bounds;", "", "", "left", "top", "right", "bottom", "<init>", "(IIII)V", "Landroid/graphics/Rect;", "rect", "(Landroid/graphics/Rect;)V", "toRect", "()Landroid/graphics/Rect;", "", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "I", "getLeft", "b", "getTop", "c", "getRight", "d", "getBottom", "getWidth", "width", "getHeight", "height", "isEmpty", "()Z", "isZero", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
public final class Bounds {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public Bounds(int v, int v1, int v2, int v3) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
    }

    public Bounds(@NotNull Rect rect0) {
        Intrinsics.checkNotNullParameter(rect0, "rect");
        this(rect0.left, rect0.top, rect0.right, rect0.bottom);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        Class class0 = object0 == null ? null : object0.getClass();
        if(!Intrinsics.areEqual(Bounds.class, class0)) {
            return false;
        }
        if(object0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.window.core.Bounds");
        }
        if(this.a != ((Bounds)object0).a) {
            return false;
        }
        if(this.b != ((Bounds)object0).b) {
            return false;
        }
        return this.c == ((Bounds)object0).c ? this.d == ((Bounds)object0).d : false;
    }

    public final int getBottom() {
        return this.d;
    }

    public final int getHeight() {
        return this.d - this.b;
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

    public final int getWidth() {
        return this.c - this.a;
    }

    @Override
    public int hashCode() {
        return ((this.a * 0x1F + this.b) * 0x1F + this.c) * 0x1F + this.d;
    }

    public final boolean isEmpty() {
        return this.getHeight() == 0 || this.getWidth() == 0;
    }

    public final boolean isZero() {
        return this.getHeight() == 0 && this.getWidth() == 0;
    }

    @NotNull
    public final Rect toRect() {
        return new Rect(this.a, this.b, this.c, this.d);
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("Bounds { [");
        stringBuilder0.append(this.a);
        stringBuilder0.append(',');
        stringBuilder0.append(this.b);
        stringBuilder0.append(',');
        stringBuilder0.append(this.c);
        stringBuilder0.append(',');
        return a.c(this.d, "] }", stringBuilder0);
    }
}

