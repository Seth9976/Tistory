package com.google.android.material.transformation;

import android.animation.Animator.AnimatorListener;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import com.google.android.material.R.id;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.animation.ArgbEvaluatorCompat;
import com.google.android.material.animation.ChildrenAlphaProperty;
import com.google.android.material.animation.DrawableAlphaProperty;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.animation.MotionTiming;
import com.google.android.material.animation.Positioning;
import com.google.android.material.circularreveal.CircularRevealCompat;
import com.google.android.material.circularreveal.CircularRevealHelper;
import com.google.android.material.circularreveal.CircularRevealWidget.CircularRevealScrimColorProperty;
import com.google.android.material.circularreveal.CircularRevealWidget.RevealInfo;
import com.google.android.material.circularreveal.CircularRevealWidget;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.floatingactionbutton.p;
import com.google.android.material.math.MathUtils;
import java.util.ArrayList;

@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    public static class FabTransformationSpec {
        public Positioning positioning;
        @Nullable
        public MotionSpec timings;

    }

    public final Rect q;
    public final RectF r;
    public final RectF s;
    public final int[] t;
    public float u;
    public float v;

    public FabTransformationBehavior() {
        this.q = new Rect();
        this.r = new RectF();
        this.s = new RectF();
        this.t = new int[2];
    }

    public FabTransformationBehavior(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.q = new Rect();
        this.r = new RectF();
        this.s = new RectF();
        this.t = new int[2];
    }

    public static Pair a(float f, float f1, boolean z, FabTransformationSpec fabTransformationBehavior$FabTransformationSpec0) {
        if(f != 0.0f) {
            int v = Float.compare(f1, 0.0f);
            if(v != 0) {
                return (!z || f1 >= 0.0f) && (z || v <= 0) ? new Pair(fabTransformationBehavior$FabTransformationSpec0.timings.getTiming("translationXCurveDownwards"), fabTransformationBehavior$FabTransformationSpec0.timings.getTiming("translationYCurveDownwards")) : new Pair(fabTransformationBehavior$FabTransformationSpec0.timings.getTiming("translationXCurveUpwards"), fabTransformationBehavior$FabTransformationSpec0.timings.getTiming("translationYCurveUpwards"));
            }
        }
        return new Pair(fabTransformationBehavior$FabTransformationSpec0.timings.getTiming("translationXLinear"), fabTransformationBehavior$FabTransformationSpec0.timings.getTiming("translationYLinear"));
    }

    public final float b(View view0, View view1, Positioning positioning0) {
        RectF rectF0 = this.r;
        RectF rectF1 = this.s;
        this.e(view0, rectF0);
        rectF0.offset(this.u, this.v);
        this.e(view1, rectF1);
        switch(positioning0.gravity & 7) {
            case 1: {
                return rectF1.centerX() - rectF0.centerX() + positioning0.xAdjustment;
            }
            case 3: {
                return rectF1.left - rectF0.left + positioning0.xAdjustment;
            }
            case 5: {
                return rectF1.right - rectF0.right + positioning0.xAdjustment;
            }
            default: {
                return positioning0.xAdjustment + 0.0f;
            }
        }
    }

    public final float c(View view0, View view1, Positioning positioning0) {
        RectF rectF0 = this.r;
        RectF rectF1 = this.s;
        this.e(view0, rectF0);
        rectF0.offset(this.u, this.v);
        this.e(view1, rectF1);
        switch(positioning0.gravity & 0x70) {
            case 16: {
                return rectF1.centerY() - rectF0.centerY() + positioning0.yAdjustment;
            }
            case 0x30: {
                return rectF1.top - rectF0.top + positioning0.yAdjustment;
            }
            case 80: {
                return rectF1.bottom - rectF0.bottom + positioning0.yAdjustment;
            }
            default: {
                return positioning0.yAdjustment + 0.0f;
            }
        }
    }

    public static float d(FabTransformationSpec fabTransformationBehavior$FabTransformationSpec0, MotionTiming motionTiming0, float f) {
        MotionTiming motionTiming1 = fabTransformationBehavior$FabTransformationSpec0.timings.getTiming("expansion");
        return AnimationUtils.lerp(f, 0.0f, motionTiming0.getInterpolator().getInterpolation(((float)(motionTiming1.getDuration() + motionTiming1.getDelay() + 17L - motionTiming0.getDelay())) / ((float)motionTiming0.getDuration())));
    }

    public final void e(View view0, RectF rectF0) {
        rectF0.set(0.0f, 0.0f, ((float)view0.getWidth()), ((float)view0.getHeight()));
        view0.getLocationInWindow(this.t);
        rectF0.offsetTo(((float)this.t[0]), ((float)this.t[1]));
        rectF0.offset(((float)(((int)(-view0.getTranslationX())))), ((float)(((int)(-view0.getTranslationY())))));
    }

    @Override  // com.google.android.material.transformation.ExpandableBehavior
    @CallSuper
    public boolean layoutDependsOn(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull View view1) {
        if(view0.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        }
        if(view1 instanceof FloatingActionButton) {
            int v = ((FloatingActionButton)view1).getExpandedComponentIdHint();
            return v == 0 || v == view0.getId();
        }
        return false;
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    @CallSuper
    public void onAttachedToLayoutParams(@NonNull LayoutParams coordinatorLayout$LayoutParams0) {
        if(coordinatorLayout$LayoutParams0.dodgeInsetEdges == 0) {
            coordinatorLayout$LayoutParams0.dodgeInsetEdges = 80;
        }
    }

    @Override  // com.google.android.material.transformation.ExpandableTransformationBehavior
    @NonNull
    public AnimatorSet onCreateExpandedStateChangeAnimation(@NonNull View view0, @NonNull View view1, boolean z, boolean z1) {
        ObjectAnimator objectAnimator9;
        ObjectAnimator objectAnimator8;
        ArrayList arrayList4;
        CircularRevealWidget circularRevealWidget0;
        ArrayList arrayList5;
        Animator animator0;
        ArrayList arrayList3;
        ObjectAnimator objectAnimator7;
        ObjectAnimator objectAnimator4;
        ObjectAnimator objectAnimator3;
        ArrayList arrayList2;
        ObjectAnimator objectAnimator0;
        FabTransformationSpec fabTransformationBehavior$FabTransformationSpec0 = this.onCreateMotionSpec(view1.getContext(), z);
        if(z) {
            this.u = view0.getTranslationX();
            this.v = view0.getTranslationY();
        }
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        float f = ViewCompat.getElevation(view1) - ViewCompat.getElevation(view0);
        if(z) {
            if(!z1) {
                view1.setTranslationZ(-f);
            }
            objectAnimator0 = ObjectAnimator.ofFloat(view1, View.TRANSLATION_Z, new float[]{0.0f});
        }
        else {
            objectAnimator0 = ObjectAnimator.ofFloat(view1, View.TRANSLATION_Z, new float[]{-f});
        }
        fabTransformationBehavior$FabTransformationSpec0.timings.getTiming("elevation").apply(objectAnimator0);
        arrayList0.add(objectAnimator0);
        RectF rectF0 = this.r;
        float f1 = this.b(view0, view1, fabTransformationBehavior$FabTransformationSpec0.positioning);
        float f2 = this.c(view0, view1, fabTransformationBehavior$FabTransformationSpec0.positioning);
        Pair pair0 = FabTransformationBehavior.a(f1, f2, z, fabTransformationBehavior$FabTransformationSpec0);
        MotionTiming motionTiming0 = (MotionTiming)pair0.first;
        MotionTiming motionTiming1 = (MotionTiming)pair0.second;
        RectF rectF1 = this.s;
        Rect rect0 = this.q;
        if(z) {
            if(!z1) {
                view1.setTranslationX(-f1);
                view1.setTranslationY(-f2);
            }
            arrayList2 = arrayList1;
            ObjectAnimator objectAnimator1 = ObjectAnimator.ofFloat(view1, View.TRANSLATION_X, new float[]{0.0f});
            ObjectAnimator objectAnimator2 = ObjectAnimator.ofFloat(view1, View.TRANSLATION_Y, new float[]{0.0f});
            float f3 = FabTransformationBehavior.d(fabTransformationBehavior$FabTransformationSpec0, motionTiming0, -f1);
            float f4 = FabTransformationBehavior.d(fabTransformationBehavior$FabTransformationSpec0, motionTiming1, -f2);
            view1.getWindowVisibleDisplayFrame(rect0);
            rectF0.set(rect0);
            this.e(view1, rectF1);
            rectF1.offset(f3, f4);
            rectF1.intersect(rectF0);
            rectF0.set(rectF1);
            objectAnimator3 = objectAnimator2;
            objectAnimator4 = objectAnimator1;
        }
        else {
            arrayList2 = arrayList1;
            objectAnimator4 = ObjectAnimator.ofFloat(view1, View.TRANSLATION_X, new float[]{-f1});
            objectAnimator3 = ObjectAnimator.ofFloat(view1, View.TRANSLATION_Y, new float[]{-f2});
        }
        motionTiming0.apply(objectAnimator4);
        motionTiming1.apply(objectAnimator3);
        arrayList0.add(objectAnimator4);
        arrayList0.add(objectAnimator3);
        float f5 = rectF0.width();
        float f6 = rectF0.height();
        float f7 = this.b(view0, view1, fabTransformationBehavior$FabTransformationSpec0.positioning);
        float f8 = this.c(view0, view1, fabTransformationBehavior$FabTransformationSpec0.positioning);
        Pair pair1 = FabTransformationBehavior.a(f7, f8, z, fabTransformationBehavior$FabTransformationSpec0);
        MotionTiming motionTiming2 = (MotionTiming)pair1.first;
        MotionTiming motionTiming3 = (MotionTiming)pair1.second;
        Property property0 = View.TRANSLATION_X;
        if(!z) {
            f7 = this.u;
        }
        ObjectAnimator objectAnimator5 = ObjectAnimator.ofFloat(view0, property0, new float[]{f7});
        Property property1 = View.TRANSLATION_Y;
        if(!z) {
            f8 = this.v;
        }
        ObjectAnimator objectAnimator6 = ObjectAnimator.ofFloat(view0, property1, new float[]{f8});
        motionTiming2.apply(objectAnimator5);
        motionTiming3.apply(objectAnimator6);
        arrayList0.add(objectAnimator5);
        arrayList0.add(objectAnimator6);
        if(!(view1 instanceof CircularRevealWidget) || !(view0 instanceof ImageView)) {
            arrayList3 = arrayList2;
        }
        else {
            Drawable drawable0 = ((ImageView)view0).getDrawable();
            if(drawable0 == null) {
                arrayList3 = arrayList2;
            }
            else {
                drawable0.mutate();
                if(z) {
                    if(!z1) {
                        drawable0.setAlpha(0xFF);
                    }
                    objectAnimator7 = ObjectAnimator.ofInt(drawable0, DrawableAlphaProperty.DRAWABLE_ALPHA_COMPAT, new int[]{0});
                }
                else {
                    objectAnimator7 = ObjectAnimator.ofInt(drawable0, DrawableAlphaProperty.DRAWABLE_ALPHA_COMPAT, new int[]{0xFF});
                }
                objectAnimator7.addUpdateListener(new a(view1));
                fabTransformationBehavior$FabTransformationSpec0.timings.getTiming("iconFade").apply(objectAnimator7);
                arrayList0.add(objectAnimator7);
                arrayList3 = arrayList2;
                arrayList3.add(new b(((CircularRevealWidget)view1), drawable0));
            }
        }
        if(view1 instanceof CircularRevealWidget) {
            Positioning positioning0 = fabTransformationBehavior$FabTransformationSpec0.positioning;
            this.e(view0, rectF0);
            rectF0.offset(this.u, this.v);
            this.e(view1, rectF1);
            rectF1.offset(-this.b(view0, view1, positioning0), 0.0f);
            float f9 = rectF0.centerX() - rectF1.left;
            Positioning positioning1 = fabTransformationBehavior$FabTransformationSpec0.positioning;
            this.e(view0, rectF0);
            rectF0.offset(this.u, this.v);
            this.e(view1, rectF1);
            rectF1.offset(0.0f, -this.c(view0, view1, positioning1));
            float f10 = rectF0.centerY() - rectF1.top;
            ((FloatingActionButton)view0).getContentRect(rect0);
            float f11 = ((float)rect0.width()) / 2.0f;
            MotionTiming motionTiming4 = fabTransformationBehavior$FabTransformationSpec0.timings.getTiming("expansion");
            if(z) {
                if(!z1) {
                    ((CircularRevealWidget)view1).setRevealInfo(new RevealInfo(f9, f10, f11));
                }
                if(z1) {
                    f11 = ((CircularRevealWidget)view1).getRevealInfo().radius;
                }
                animator0 = CircularRevealCompat.createCircularReveal(((CircularRevealWidget)view1), f9, f10, MathUtils.distanceToFurthestCorner(f9, f10, 0.0f, 0.0f, f5, f6));
                animator0.addListener(new c(((CircularRevealWidget)view1)));
                long v = motionTiming4.getDelay();
                if(v > 0L) {
                    Animator animator1 = ViewAnimationUtils.createCircularReveal(view1, ((int)f9), ((int)f10), f11, f11);
                    animator1.setStartDelay(0L);
                    animator1.setDuration(v);
                    arrayList0.add(animator1);
                }
                arrayList5 = arrayList3;
                circularRevealWidget0 = (CircularRevealWidget)view1;
            }
            else {
                float f12 = ((CircularRevealWidget)view1).getRevealInfo().radius;
                animator0 = CircularRevealCompat.createCircularReveal(((CircularRevealWidget)view1), f9, f10, f11);
                long v1 = motionTiming4.getDelay();
                arrayList5 = arrayList3;
                circularRevealWidget0 = (CircularRevealWidget)view1;
                if(v1 > 0L) {
                    Animator animator2 = ViewAnimationUtils.createCircularReveal(view1, ((int)f9), ((int)f10), f12, f12);
                    animator2.setStartDelay(0L);
                    animator2.setDuration(v1);
                    arrayList0.add(animator2);
                }
                long v2 = fabTransformationBehavior$FabTransformationSpec0.timings.getTotalDuration();
                long v3 = motionTiming4.getDelay() + motionTiming4.getDuration();
                if(v3 < v2) {
                    Animator animator3 = ViewAnimationUtils.createCircularReveal(view1, ((int)f9), ((int)f10), f11, f11);
                    animator3.setStartDelay(v3);
                    animator3.setDuration(v2 - v3);
                    arrayList0.add(animator3);
                }
            }
            motionTiming4.apply(animator0);
            arrayList0.add(animator0);
            arrayList4 = arrayList5;
            arrayList4.add(CircularRevealCompat.createCircularRevealListener(circularRevealWidget0));
        }
        else {
            arrayList4 = arrayList3;
        }
        if(view1 instanceof CircularRevealWidget) {
            ColorStateList colorStateList0 = ViewCompat.getBackgroundTintList(view0);
            int v4 = colorStateList0 == null ? 0 : colorStateList0.getColorForState(view0.getDrawableState(), colorStateList0.getDefaultColor());
            if(z) {
                if(!z1) {
                    ((CircularRevealWidget)view1).setCircularRevealScrimColor(v4);
                }
                objectAnimator8 = ObjectAnimator.ofInt(((CircularRevealWidget)view1), CircularRevealScrimColorProperty.CIRCULAR_REVEAL_SCRIM_COLOR, new int[]{0xFFFFFF & v4});
            }
            else {
                objectAnimator8 = ObjectAnimator.ofInt(((CircularRevealWidget)view1), CircularRevealScrimColorProperty.CIRCULAR_REVEAL_SCRIM_COLOR, new int[]{v4});
            }
            objectAnimator8.setEvaluator(ArgbEvaluatorCompat.getInstance());
            fabTransformationBehavior$FabTransformationSpec0.timings.getTiming("color").apply(objectAnimator8);
            arrayList0.add(objectAnimator8);
        }
        if(view1 instanceof ViewGroup && (!(view1 instanceof CircularRevealWidget) || CircularRevealHelper.STRATEGY != 0)) {
            View view2 = view1.findViewById(id.mtrl_child_content_container);
            ViewGroup viewGroup0 = null;
            if(view2 == null) {
                if(view1 instanceof TransformationChildLayout || view1 instanceof TransformationChildCard) {
                    View view3 = ((ViewGroup)view1).getChildAt(0);
                    if(view3 instanceof ViewGroup) {
                        viewGroup0 = (ViewGroup)view3;
                    }
                }
                else if(view1 instanceof ViewGroup) {
                    viewGroup0 = (ViewGroup)view1;
                }
            }
            else if(view2 instanceof ViewGroup) {
                viewGroup0 = (ViewGroup)view2;
            }
            if(viewGroup0 != null) {
                if(z) {
                    if(!z1) {
                        ChildrenAlphaProperty.CHILDREN_ALPHA.set(viewGroup0, 0.0f);
                    }
                    objectAnimator9 = ObjectAnimator.ofFloat(viewGroup0, ChildrenAlphaProperty.CHILDREN_ALPHA, new float[]{1.0f});
                }
                else {
                    objectAnimator9 = ObjectAnimator.ofFloat(viewGroup0, ChildrenAlphaProperty.CHILDREN_ALPHA, new float[]{0.0f});
                }
                fabTransformationBehavior$FabTransformationSpec0.timings.getTiming("contentFade").apply(objectAnimator9);
                arrayList0.add(objectAnimator9);
            }
        }
        AnimatorSet animatorSet0 = new AnimatorSet();
        AnimatorSetCompat.playTogether(animatorSet0, arrayList0);
        animatorSet0.addListener(new p(z, view1, view0));
        int v5 = arrayList4.size();
        for(int v6 = 0; v6 < v5; ++v6) {
            animatorSet0.addListener(((Animator.AnimatorListener)arrayList4.get(v6)));
        }
        return animatorSet0;
    }

    public abstract FabTransformationSpec onCreateMotionSpec(Context arg1, boolean arg2);
}

