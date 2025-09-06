package androidx.core.graphics;

import a5.b;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

public final class Insets {
    @NonNull
    public static final Insets NONE;
    public final int bottom;
    public final int left;
    public final int right;
    public final int top;

    static {
        Insets.NONE = new Insets(0, 0, 0, 0);
    }

    public Insets(int v, int v1, int v2, int v3) {
        this.left = v;
        this.top = v1;
        this.right = v2;
        this.bottom = v3;
    }

    @NonNull
    public static Insets add(@NonNull Insets insets0, @NonNull Insets insets1) {
        return Insets.of(insets0.left + insets1.left, insets0.top + insets1.top, insets0.right + insets1.right, insets0.bottom + insets1.bottom);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            if(Insets.class != class0 || this.bottom != ((Insets)object0).bottom) {
                return false;
            }
            if(this.left != ((Insets)object0).left) {
                return false;
            }
            return this.right == ((Insets)object0).right ? this.top == ((Insets)object0).top : false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return ((this.left * 0x1F + this.top) * 0x1F + this.right) * 0x1F + this.bottom;
    }

    @NonNull
    public static Insets max(@NonNull Insets insets0, @NonNull Insets insets1) {
        return Insets.of(Math.max(insets0.left, insets1.left), Math.max(insets0.top, insets1.top), Math.max(insets0.right, insets1.right), Math.max(insets0.bottom, insets1.bottom));
    }

    @NonNull
    public static Insets min(@NonNull Insets insets0, @NonNull Insets insets1) {
        return Insets.of(Math.min(insets0.left, insets1.left), Math.min(insets0.top, insets1.top), Math.min(insets0.right, insets1.right), Math.min(insets0.bottom, insets1.bottom));
    }

    @NonNull
    public static Insets of(int v, int v1, int v2, int v3) {
        return v != 0 || v1 != 0 || v2 != 0 || v3 != 0 ? new Insets(v, v1, v2, v3) : Insets.NONE;
    }

    @NonNull
    public static Insets of(@NonNull Rect rect0) {
        return Insets.of(rect0.left, rect0.top, rect0.right, rect0.bottom);
    }

    @NonNull
    public static Insets subtract(@NonNull Insets insets0, @NonNull Insets insets1) {
        return Insets.of(insets0.left - insets1.left, insets0.top - insets1.top, insets0.right - insets1.right, insets0.bottom - insets1.bottom);
    }

    @NonNull
    @RequiresApi(api = 29)
    public static Insets toCompatInsets(@NonNull android.graphics.Insets insets0) {
        return Insets.of(insets0.left, insets0.top, insets0.right, insets0.bottom);
    }

    @NonNull
    @RequiresApi(29)
    public android.graphics.Insets toPlatformInsets() {
        return h.a(this.left, this.top, this.right, this.bottom);
    }

    @Override
    @NonNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("Insets{left=");
        stringBuilder0.append(this.left);
        stringBuilder0.append(", top=");
        stringBuilder0.append(this.top);
        stringBuilder0.append(", right=");
        stringBuilder0.append(this.right);
        stringBuilder0.append(", bottom=");
        return b.p(stringBuilder0, this.bottom, '}');
    }

    @NonNull
    @RequiresApi(api = 29)
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static Insets wrap(@NonNull android.graphics.Insets insets0) {
        return Insets.toCompatInsets(insets0);
    }
}

