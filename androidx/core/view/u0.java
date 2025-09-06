package androidx.core.view;

import android.view.ViewGroup;
import androidx.annotation.DoNotInline;

public abstract class u0 {
    @DoNotInline
    public static int a(ViewGroup viewGroup0) {
        return viewGroup0.getNestedScrollAxes();
    }

    @DoNotInline
    public static boolean b(ViewGroup viewGroup0) {
        return viewGroup0.isTransitionGroup();
    }

    @DoNotInline
    public static void c(ViewGroup viewGroup0, boolean z) {
        viewGroup0.setTransitionGroup(z);
    }
}

