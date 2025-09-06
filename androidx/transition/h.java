package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Matrix;
import android.view.View;
import androidx.core.view.ViewCompat;

public final class h extends AnimatorListenerAdapter {
    public boolean a;
    public final Matrix b;
    public final boolean c;
    public final Matrix d;
    public final View e;
    public final k f;
    public final j g;
    public final ChangeTransform h;

    public h(ChangeTransform changeTransform0, boolean z, Matrix matrix0, View view0, k k0, j j0) {
        this.h = changeTransform0;
        this.c = z;
        this.d = matrix0;
        this.e = view0;
        this.f = k0;
        this.g = j0;
        super();
        this.b = new Matrix();
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationCancel(Animator animator0) {
        this.a = true;
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationEnd(Animator animator0) {
        k k0 = this.f;
        View view0 = this.e;
        if(!this.a) {
            if(!this.c || !this.h.I) {
                view0.setTag(id.transition_transform, null);
                view0.setTag(id.parent_matrix, null);
            }
            else {
                this.b.set(this.d);
                view0.setTag(id.transition_transform, this.b);
                k0.getClass();
                view0.setTranslationX(k0.a);
                view0.setTranslationY(k0.b);
                ViewCompat.setTranslationZ(view0, k0.c);
                view0.setScaleX(k0.d);
                view0.setScaleY(k0.e);
                view0.setRotationX(k0.f);
                view0.setRotationY(k0.g);
                view0.setRotation(k0.h);
            }
        }
        r0.a.d(view0, null);
        k0.getClass();
        view0.setTranslationX(k0.a);
        view0.setTranslationY(k0.b);
        ViewCompat.setTranslationZ(view0, k0.c);
        view0.setScaleX(k0.d);
        view0.setScaleY(k0.e);
        view0.setRotationX(k0.f);
        view0.setRotationY(k0.g);
        view0.setRotation(k0.h);
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationPause(Animator animator0) {
        this.b.set(this.g.a);
        this.e.setTag(id.transition_transform, this.b);
        this.f.getClass();
        this.e.setTranslationX(this.f.a);
        this.e.setTranslationY(this.f.b);
        ViewCompat.setTranslationZ(this.e, this.f.c);
        this.e.setScaleX(this.f.d);
        this.e.setScaleY(this.f.e);
        this.e.setRotationX(this.f.f);
        this.e.setRotationY(this.f.g);
        this.e.setRotation(this.f.h);
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationResume(Animator animator0) {
        this.e.setTranslationX(0.0f);
        this.e.setTranslationY(0.0f);
        ViewCompat.setTranslationZ(this.e, 0.0f);
        this.e.setScaleX(1.0f);
        this.e.setScaleY(1.0f);
        this.e.setRotationX(0.0f);
        this.e.setRotationY(0.0f);
        this.e.setRotation(0.0f);
    }
}

