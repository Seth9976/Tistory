package a8;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback;
import com.google.android.material.progressindicator.a;
import java.util.ArrayList;

public final class j extends AnimatorListenerAdapter {
    public final int a;
    public final a b;

    public j(a a0, int v) {
        this.a = v;
        this.b = a0;
        super();
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public void onAnimationEnd(Animator animator0) {
        if(this.a != 1) {
            super.onAnimationEnd(animator0);
            return;
        }
        super.onAnimationEnd(animator0);
        a a0 = this.b;
        a.a(a0);
        ArrayList arrayList0 = a0.f;
        if(arrayList0 != null && !a0.g) {
            for(Object object0: arrayList0) {
                ((AnimationCallback)object0).onAnimationEnd(a0);
            }
        }
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public void onAnimationStart(Animator animator0) {
        if(this.a != 0) {
            super.onAnimationStart(animator0);
            return;
        }
        super.onAnimationStart(animator0);
        a a0 = this.b;
        ArrayList arrayList0 = a0.f;
        if(arrayList0 != null && !a0.g) {
            for(Object object0: arrayList0) {
                ((AnimationCallback)object0).onAnimationStart(a0);
            }
        }
    }
}

