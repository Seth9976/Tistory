package androidx.core.view;

import android.view.ViewPropertyAnimator;
import androidx.annotation.DoNotInline;

public abstract class b1 {
    @DoNotInline
    public static ViewPropertyAnimator a(ViewPropertyAnimator viewPropertyAnimator0, float f) {
        return viewPropertyAnimator0.translationZ(f);
    }

    @DoNotInline
    public static ViewPropertyAnimator b(ViewPropertyAnimator viewPropertyAnimator0, float f) {
        return viewPropertyAnimator0.translationZBy(f);
    }

    @DoNotInline
    public static ViewPropertyAnimator c(ViewPropertyAnimator viewPropertyAnimator0, float f) {
        return viewPropertyAnimator0.z(f);
    }

    @DoNotInline
    public static ViewPropertyAnimator d(ViewPropertyAnimator viewPropertyAnimator0, float f) {
        return viewPropertyAnimator0.zBy(f);
    }
}

