package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.res.TypedArrayUtils;

public class Fade extends Visibility {
    public static final int IN = 1;
    public static final int OUT = 2;

    public Fade() {
    }

    public Fade(int v) {
        this.setMode(v);
    }

    @SuppressLint({"RestrictedApi"})
    public Fade(@NonNull Context context0, @NonNull AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, f0.f);
        this.setMode(TypedArrayUtils.getNamedInt(typedArray0, ((XmlResourceParser)attributeSet0), "fadingMode", 0, this.getMode()));
        typedArray0.recycle();
    }

    @Override  // androidx.transition.Visibility
    public void captureStartValues(@NonNull TransitionValues transitionValues0) {
        super.captureStartValues(transitionValues0);
        Float float0 = r0.a.b(transitionValues0.view);
        transitionValues0.values.put("android:fade:transitionAlpha", float0);
    }

    public final ObjectAnimator n(View view0, float f, float f1) {
        if(f == f1) {
            return null;
        }
        r0.b(view0, f);
        ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(view0, r0.b, new float[]{f1});
        objectAnimator0.addListener(new m(0, view0));
        this.addListener(new l(view0));
        return objectAnimator0;
    }

    @Override  // androidx.transition.Visibility
    @Nullable
    public Animator onAppear(ViewGroup viewGroup0, View view0, TransitionValues transitionValues0, TransitionValues transitionValues1) {
        float f1;
        float f = 0.0f;
        if(transitionValues0 == null) {
            f1 = 0.0f;
        }
        else {
            Float float0 = (Float)transitionValues0.values.get("android:fade:transitionAlpha");
            f1 = float0 == null ? 0.0f : ((float)float0);
        }
        if(f1 != 1.0f) {
            f = f1;
        }
        return this.n(view0, f, 1.0f);
    }

    @Override  // androidx.transition.Visibility
    @Nullable
    public Animator onDisappear(ViewGroup viewGroup0, View view0, TransitionValues transitionValues0, TransitionValues transitionValues1) {
        r0.a.getClass();
        if(transitionValues0 != null) {
            Float float0 = (Float)transitionValues0.values.get("android:fade:transitionAlpha");
            return float0 == null ? this.n(view0, 1.0f, 0.0f) : this.n(view0, ((float)float0), 0.0f);
        }
        return this.n(view0, 1.0f, 0.0f);
    }
}

