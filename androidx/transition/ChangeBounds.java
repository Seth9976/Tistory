package androidx.transition;

import a8.g;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.view.ViewCompat;

public class ChangeBounds extends Transition {
    public boolean I;
    public static final String[] J;
    public static final g K;
    public static final g L;
    public static final g M;
    public static final g N;
    public static final g O;
    public static final n P;

    static {
        ChangeBounds.J = new String[]{"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
        a a0 = new a(PointF.class, "boundsOrigin");  // 初始化器: Landroid/util/Property;-><init>(Ljava/lang/Class;Ljava/lang/String;)V
        a0.a = new Rect();
        ChangeBounds.K = new g(6, "topLeft", PointF.class);
        ChangeBounds.L = new g(7, "bottomRight", PointF.class);
        ChangeBounds.M = new g(8, "bottomRight", PointF.class);
        ChangeBounds.N = new g(9, "topLeft", PointF.class);
        ChangeBounds.O = new g(10, "position", PointF.class);
        ChangeBounds.P = new n(1);
    }

    public ChangeBounds() {
        this.I = false;
    }

    @SuppressLint({"RestrictedApi"})
    public ChangeBounds(@NonNull Context context0, @NonNull AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.I = false;
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, f0.d);
        boolean z = TypedArrayUtils.getNamedBoolean(typedArray0, ((XmlResourceParser)attributeSet0), "resizeClip", 0, false);
        typedArray0.recycle();
        this.setResizeClip(z);
    }

    @Override  // androidx.transition.Transition
    public void captureEndValues(@NonNull TransitionValues transitionValues0) {
        this.l(transitionValues0);
    }

    @Override  // androidx.transition.Transition
    public void captureStartValues(@NonNull TransitionValues transitionValues0) {
        this.l(transitionValues0);
    }

    @Override  // androidx.transition.Transition
    @Nullable
    public Animator createAnimator(@NonNull ViewGroup viewGroup0, @Nullable TransitionValues transitionValues0, @Nullable TransitionValues transitionValues1) {
        Animator animator0;
        ObjectAnimator objectAnimator2;
        View view1;
        ObjectAnimator objectAnimator3;
        int v12;
        if(transitionValues0 != null && transitionValues1 != null && (((ViewGroup)transitionValues0.values.get("android:changeBounds:parent")) != null && ((ViewGroup)transitionValues1.values.get("android:changeBounds:parent")) != null)) {
            View view0 = transitionValues1.view;
            Rect rect0 = (Rect)transitionValues0.values.get("android:changeBounds:bounds");
            Rect rect1 = (Rect)transitionValues1.values.get("android:changeBounds:bounds");
            int v = rect0.left;
            int v1 = rect1.left;
            int v2 = rect0.top;
            int v3 = rect1.top;
            int v4 = rect0.right;
            int v5 = rect1.right;
            int v6 = rect0.bottom;
            int v7 = rect1.bottom;
            int v8 = v4 - v;
            int v9 = v6 - v2;
            int v10 = v5 - v1;
            int v11 = v7 - v3;
            Rect rect2 = (Rect)transitionValues0.values.get("android:changeBounds:clip");
            Rect rect3 = (Rect)transitionValues1.values.get("android:changeBounds:clip");
            if((v8 == 0 || v9 == 0) && (v10 == 0 || v11 == 0)) {
                v12 = 0;
            }
            else {
                v12 = v != v1 || v2 != v3 ? 1 : 0;
                if(v4 != v5 || v6 != v7) {
                    ++v12;
                }
            }
            if(rect2 != null && !rect2.equals(rect3) || rect2 == null && rect3 != null) {
                ++v12;
            }
            if(v12 > 0) {
                g g0 = ChangeBounds.O;
                if(this.I) {
                    view1 = view0;
                    r0.a(view1, v, v2, Math.max(v8, v10) + v, Math.max(v9, v11) + v2);
                    objectAnimator2 = v != v1 || v2 != v3 ? ObjectAnimator.ofObject(view1, g0, null, this.getPathMotion().getPath(((float)v), ((float)v2), ((float)v1), ((float)v3))) : null;
                    if(rect2 == null) {
                        rect2 = new Rect(0, 0, v8, v9);
                    }
                    Rect rect4 = rect3 == null ? new Rect(0, 0, v10, v11) : rect3;
                    if(rect2.equals(rect4)) {
                        objectAnimator3 = null;
                    }
                    else {
                        ViewCompat.setClipBounds(view1, rect2);
                        objectAnimator3 = ObjectAnimator.ofObject(view1, "clipBounds", ChangeBounds.P, new Object[]{rect2, rect4});
                        objectAnimator3.addListener(new c(view1, rect3, v1, v3, v5, v7));
                    }
                    if(objectAnimator2 == null) {
                        animator0 = objectAnimator3;
                    }
                    else if(objectAnimator3 == null) {
                        animator0 = objectAnimator2;
                    }
                    else {
                        animator0 = new AnimatorSet();
                        ((AnimatorSet)animator0).playTogether(new Animator[]{objectAnimator2, objectAnimator3});
                    }
                }
                else {
                    view1 = view0;
                    r0.a(view1, v, v2, v4, v6);
                    if(v12 != 2) {
                        if(v != v1 || v2 != v3) {
                            Path path3 = this.getPathMotion().getPath(((float)v), ((float)v2), ((float)v1), ((float)v3));
                            objectAnimator2 = ObjectAnimator.ofObject(view1, ChangeBounds.N, null, path3);
                        }
                        else {
                            Path path2 = this.getPathMotion().getPath(((float)v4), ((float)v6), ((float)v5), ((float)v7));
                            objectAnimator2 = ObjectAnimator.ofObject(view1, ChangeBounds.M, null, path2);
                        }
                        animator0 = objectAnimator2;
                    }
                    else if(v8 == v10 && v9 == v11) {
                        animator0 = ObjectAnimator.ofObject(view1, g0, null, this.getPathMotion().getPath(((float)v), ((float)v2), ((float)v1), ((float)v3)));
                    }
                    else {
                        e e0 = new e();  // 初始化器: Ljava/lang/Object;-><init>()V
                        e0.e = view1;
                        Path path0 = this.getPathMotion().getPath(((float)v), ((float)v2), ((float)v1), ((float)v3));
                        ObjectAnimator objectAnimator0 = ObjectAnimator.ofObject(e0, ChangeBounds.K, null, path0);
                        Path path1 = this.getPathMotion().getPath(((float)v4), ((float)v6), ((float)v5), ((float)v7));
                        ObjectAnimator objectAnimator1 = ObjectAnimator.ofObject(e0, ChangeBounds.L, null, path1);
                        AnimatorSet animatorSet0 = new AnimatorSet();
                        animatorSet0.playTogether(new Animator[]{objectAnimator0, objectAnimator1});
                        animatorSet0.addListener(new b(e0));
                        animator0 = animatorSet0;
                    }
                }
                if(view1.getParent() instanceof ViewGroup) {
                    ViewGroup viewGroup1 = (ViewGroup)view1.getParent();
                    f0.d(viewGroup1, true);
                    this.addListener(new d(viewGroup1));
                }
                return animator0;
            }
        }
        return null;
    }

    public boolean getResizeClip() {
        return this.I;
    }

    @Override  // androidx.transition.Transition
    @NonNull
    public String[] getTransitionProperties() {
        return ChangeBounds.J;
    }

    public final void l(TransitionValues transitionValues0) {
        View view0 = transitionValues0.view;
        if(ViewCompat.isLaidOut(view0) || view0.getWidth() != 0 || view0.getHeight() != 0) {
            Rect rect0 = new Rect(view0.getLeft(), view0.getTop(), view0.getRight(), view0.getBottom());
            transitionValues0.values.put("android:changeBounds:bounds", rect0);
            ViewParent viewParent0 = transitionValues0.view.getParent();
            transitionValues0.values.put("android:changeBounds:parent", viewParent0);
            if(this.I) {
                Rect rect1 = ViewCompat.getClipBounds(view0);
                transitionValues0.values.put("android:changeBounds:clip", rect1);
            }
        }
    }

    public void setResizeClip(boolean z) {
        this.I = z;
    }
}

