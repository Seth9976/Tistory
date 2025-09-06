package androidx.core.view;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.DisplayCutout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.graphics.Insets;
import androidx.core.util.ObjectsCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class DisplayCutoutCompat {
    public final DisplayCutout a;

    public DisplayCutoutCompat(@Nullable Rect rect0, @Nullable List list0) {
        this((Build.VERSION.SDK_INT < 28 ? null : j.a(rect0, list0)));
    }

    public DisplayCutoutCompat(DisplayCutout displayCutout0) {
        this.a = displayCutout0;
    }

    public DisplayCutoutCompat(@NonNull Insets insets0, @Nullable Rect rect0, @Nullable Rect rect1, @Nullable Rect rect2, @Nullable Rect rect3, @NonNull Insets insets1) {
        DisplayCutout displayCutout0;
        int v = Build.VERSION.SDK_INT;
        if(v >= 30) {
            displayCutout0 = l.a(insets0.toPlatformInsets(), rect0, rect1, rect2, rect3, insets1.toPlatformInsets());
        }
        else if(v >= 29) {
            displayCutout0 = k.a(insets0.toPlatformInsets(), rect0, rect1, rect2, rect3);
        }
        else if(v >= 28) {
            Rect rect4 = new Rect(insets0.left, insets0.top, insets0.right, insets0.bottom);
            ArrayList arrayList0 = new ArrayList();
            if(rect0 != null) {
                arrayList0.add(rect0);
            }
            if(rect1 != null) {
                arrayList0.add(rect1);
            }
            if(rect2 != null) {
                arrayList0.add(rect2);
            }
            if(rect3 != null) {
                arrayList0.add(rect3);
            }
            displayCutout0 = j.a(rect4, arrayList0);
        }
        else {
            displayCutout0 = null;
        }
        this(displayCutout0);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return DisplayCutoutCompat.class == class0 ? ObjectsCompat.equals(this.a, ((DisplayCutoutCompat)object0).a) : false;
        }
        return false;
    }

    @NonNull
    public List getBoundingRects() {
        return Build.VERSION.SDK_INT < 28 ? Collections.emptyList() : j.b(this.a);
    }

    public int getSafeInsetBottom() {
        return Build.VERSION.SDK_INT < 28 ? 0 : j.c(this.a);
    }

    public int getSafeInsetLeft() {
        return Build.VERSION.SDK_INT < 28 ? 0 : j.d(this.a);
    }

    public int getSafeInsetRight() {
        return Build.VERSION.SDK_INT < 28 ? 0 : j.e(this.a);
    }

    public int getSafeInsetTop() {
        return Build.VERSION.SDK_INT < 28 ? 0 : j.f(this.a);
    }

    @NonNull
    public Insets getWaterfallInsets() {
        return Build.VERSION.SDK_INT < 30 ? Insets.NONE : Insets.toCompatInsets(l.b(this.a));
    }

    @Override
    public int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @Override
    @NonNull
    public String toString() {
        return "DisplayCutoutCompat{" + this.a + "}";
    }
}

