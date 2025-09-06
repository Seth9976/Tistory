package androidx.core.view;

import android.view.ViewConfiguration;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;

public abstract class t0 {
    @DoNotInline
    public static int a(@NonNull ViewConfiguration viewConfiguration0, int v, int v1, int v2) {
        return viewConfiguration0.getScaledMaximumFlingVelocity(v, v1, v2);
    }

    @DoNotInline
    public static int b(@NonNull ViewConfiguration viewConfiguration0, int v, int v1, int v2) {
        return viewConfiguration0.getScaledMinimumFlingVelocity(v, v1, v2);
    }
}

