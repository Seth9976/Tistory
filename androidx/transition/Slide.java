package androidx.transition;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.TypedArrayUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.xmlpull.v1.XmlPullParser;

public class Slide extends Visibility {
    interface CalculateSlide {
        float getGoneX(ViewGroup arg1, View arg2);

        float getGoneY(ViewGroup arg1, View arg2);
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface GravityFlag {
    }

    public CalculateSlide K;
    public int L;
    public static final DecelerateInterpolator M;
    public static final AccelerateInterpolator N;
    public static final b0 O;
    public static final b0 P;
    public static final c0 Q;
    public static final b0 R;
    public static final b0 S;
    public static final c0 T;

    static {
        Slide.M = new DecelerateInterpolator();
        Slide.N = new AccelerateInterpolator();
        Slide.O = new b0(0);
        Slide.P = new b0(1);
        Slide.Q = new c0(0);
        Slide.R = new b0(2);
        Slide.S = new b0(3);
        Slide.T = new c0(1);
    }

    public Slide() {
        this.K = Slide.T;
        this.L = 80;
        this.setSlideEdge(80);
    }

    public Slide(int v) {
        this.K = Slide.T;
        this.L = 80;
        this.setSlideEdge(v);
    }

    @SuppressLint({"RestrictedApi"})
    public Slide(@NonNull Context context0, @NonNull AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.K = Slide.T;
        this.L = 80;
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, f0.h);
        int v = TypedArrayUtils.getNamedInt(typedArray0, ((XmlPullParser)attributeSet0), "slideEdge", 0, 80);
        typedArray0.recycle();
        this.setSlideEdge(v);
    }

    @Override  // androidx.transition.Visibility
    public void captureEndValues(@NonNull TransitionValues transitionValues0) {
        super.captureEndValues(transitionValues0);
        int[] arr_v = new int[2];
        transitionValues0.view.getLocationOnScreen(arr_v);
        transitionValues0.values.put("android:slide:screenPosition", arr_v);
    }

    @Override  // androidx.transition.Visibility
    public void captureStartValues(@NonNull TransitionValues transitionValues0) {
        super.captureStartValues(transitionValues0);
        int[] arr_v = new int[2];
        transitionValues0.view.getLocationOnScreen(arr_v);
        transitionValues0.values.put("android:slide:screenPosition", arr_v);
    }

    public int getSlideEdge() {
        return this.L;
    }

    @Override  // androidx.transition.Visibility
    @Nullable
    public Animator onAppear(ViewGroup viewGroup0, View view0, TransitionValues transitionValues0, TransitionValues transitionValues1) {
        if(transitionValues1 == null) {
            return null;
        }
        int[] arr_v = (int[])transitionValues1.values.get("android:slide:screenPosition");
        float f = view0.getTranslationX();
        float f1 = view0.getTranslationY();
        float f2 = this.K.getGoneX(viewGroup0, view0);
        float f3 = this.K.getGoneY(viewGroup0, view0);
        return q0.a(view0, transitionValues1, arr_v[0], arr_v[1], f2, f3, f, f1, Slide.M, this);
    }

    @Override  // androidx.transition.Visibility
    @Nullable
    public Animator onDisappear(ViewGroup viewGroup0, View view0, TransitionValues transitionValues0, TransitionValues transitionValues1) {
        if(transitionValues0 == null) {
            return null;
        }
        int[] arr_v = (int[])transitionValues0.values.get("android:slide:screenPosition");
        float f = view0.getTranslationX();
        float f1 = view0.getTranslationY();
        float f2 = this.K.getGoneX(viewGroup0, view0);
        float f3 = this.K.getGoneY(viewGroup0, view0);
        return q0.a(view0, transitionValues0, arr_v[0], arr_v[1], f, f1, f2, f3, Slide.N, this);
    }

    public void setSlideEdge(int v) {
        switch(v) {
            case 3: {
                this.K = Slide.O;
                break;
            }
            case 5: {
                this.K = Slide.R;
                break;
            }
            case 0x30: {
                this.K = Slide.Q;
                break;
            }
            case 80: {
                this.K = Slide.T;
                break;
            }
            case 0x800003: {
                this.K = Slide.P;
                break;
            }
            case 0x800005: {
                this.K = Slide.S;
                break;
            }
            default: {
                throw new IllegalArgumentException("Invalid slide direction");
            }
        }
        this.L = v;
        SidePropagation sidePropagation0 = new SidePropagation();
        sidePropagation0.setSide(v);
        this.setPropagation(sidePropagation0);
    }
}

