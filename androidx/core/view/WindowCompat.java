package androidx.core.view;

import android.os.Build.VERSION;
import android.view.View;
import android.view.Window;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;

public final class WindowCompat {
    public static final int FEATURE_ACTION_BAR = 8;
    public static final int FEATURE_ACTION_BAR_OVERLAY = 9;
    public static final int FEATURE_ACTION_MODE_OVERLAY = 10;

    @NonNull
    public static WindowInsetsControllerCompat getInsetsController(@NonNull Window window0, @NonNull View view0) {
        return new WindowInsetsControllerCompat(window0, view0);
    }

    @NonNull
    public static View requireViewById(@NonNull Window window0, @IdRes int v) {
        if(Build.VERSION.SDK_INT >= 28) {
            return (View)d1.a(window0, v);
        }
        View view0 = window0.findViewById(v);
        if(view0 == null) {
            throw new IllegalArgumentException("ID does not reference a View inside this Window");
        }
        return view0;
    }

    public static void setDecorFitsSystemWindows(@NonNull Window window0, boolean z) {
        if(Build.VERSION.SDK_INT >= 30) {
            e1.a(window0, z);
            return;
        }
        View view0 = window0.getDecorView();
        int v = view0.getSystemUiVisibility();
        view0.setSystemUiVisibility((z ? v & 0xFFFFF8FF : v | 0x700));
    }
}

