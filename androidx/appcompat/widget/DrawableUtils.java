package androidx.appcompat.widget;

import android.graphics.Insets;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.DrawableCompat;
import java.lang.reflect.InvocationTargetException;

@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
public class DrawableUtils {
    public static final Rect INSETS_NONE;
    public static final int[] a;
    public static final int[] b;

    static {
        DrawableUtils.a = new int[]{0x10100A0};
        DrawableUtils.b = new int[0];
        DrawableUtils.INSETS_NONE = new Rect();
    }

    public static void a(Drawable drawable0) {
        String s = drawable0.getClass().getName();
        if(Build.VERSION.SDK_INT >= 29 && Build.VERSION.SDK_INT < 0x1F && "android.graphics.drawable.ColorStateListDrawable".equals(s)) {
            int[] arr_v = drawable0.getState();
            if(arr_v == null || arr_v.length == 0) {
                drawable0.setState(DrawableUtils.a);
            }
            else {
                drawable0.setState(DrawableUtils.b);
            }
            drawable0.setState(arr_v);
        }
    }

    public static boolean canSafelyMutateDrawable(@NonNull Drawable drawable0) [...] // Inlined contents

    @NonNull
    public static Rect getOpticalBounds(@NonNull Drawable drawable0) {
        int v = Build.VERSION.SDK_INT;
        if(v >= 29) {
            Insets insets0 = m1.a(drawable0);
            return new Rect(insets0.left, insets0.top, insets0.right, insets0.bottom);
        }
        Drawable drawable1 = DrawableCompat.unwrap(drawable0);
        if(v < 29 && l1.a) {
            try {
                Object object0 = l1.b.invoke(drawable1, null);
                return object0 == null ? DrawableUtils.INSETS_NONE : new Rect(l1.c.getInt(object0), l1.d.getInt(object0), l1.e.getInt(object0), l1.f.getInt(object0));
            }
            catch(IllegalAccessException | InvocationTargetException unused_ex) {
            }
        }
        return DrawableUtils.INSETS_NONE;
    }

    public static PorterDuff.Mode parseTintMode(int v, PorterDuff.Mode porterDuff$Mode0) {
        switch(v) {
            case 3: {
                return PorterDuff.Mode.SRC_OVER;
            }
            case 5: {
                return PorterDuff.Mode.SRC_IN;
            }
            case 9: {
                return PorterDuff.Mode.SRC_ATOP;
            }
            case 14: {
                return PorterDuff.Mode.MULTIPLY;
            }
            case 15: {
                return PorterDuff.Mode.SCREEN;
            }
            case 16: {
                return PorterDuff.Mode.ADD;
            }
            default: {
                return porterDuff$Mode0;
            }
        }
    }
}

