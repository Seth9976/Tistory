package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.PathParser;
import androidx.core.view.ViewCompat;
import androidx.transition.ArcMotion;
import androidx.transition.PathMotion;
import androidx.transition.PatternPathMotion;
import androidx.transition.Transition;
import androidx.transition.TransitionValues;
import com.google.android.material.R.attr;
import com.google.android.material.R.id;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.appbar.g;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;

public final class MaterialContainerTransform extends Transition {
    @RestrictTo({Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface FadeMode {
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface FitMode {
    }

    public static class ProgressThresholds {
        public final float a;
        public final float b;

        public ProgressThresholds(@FloatRange(from = 0.0, to = 1.0) float f, @FloatRange(from = 0.0, to = 1.0) float f1) {
            this.a = f;
            this.b = f1;
        }

        @FloatRange(from = 0.0, to = 1.0)
        public float getEnd() {
            return this.b;
        }

        @FloatRange(from = 0.0, to = 1.0)
        public float getStart() {
            return this.a;
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface TransitionDirection {
    }

    public static final int FADE_MODE_CROSS = 2;
    public static final int FADE_MODE_IN = 0;
    public static final int FADE_MODE_OUT = 1;
    public static final int FADE_MODE_THROUGH = 3;
    public static final int FIT_MODE_AUTO = 0;
    public static final int FIT_MODE_HEIGHT = 2;
    public static final int FIT_MODE_WIDTH = 1;
    public boolean I;
    public boolean J;
    public boolean K;
    public final boolean L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public static final int TRANSITION_DIRECTION_AUTO = 0;
    public static final int TRANSITION_DIRECTION_ENTER = 1;
    public static final int TRANSITION_DIRECTION_RETURN = 2;
    public int U;
    public int V;
    public View W;
    public View a0;
    public ShapeAppearanceModel b0;
    public ShapeAppearanceModel c0;
    public ProgressThresholds d0;
    public ProgressThresholds e0;
    public ProgressThresholds f0;
    public ProgressThresholds g0;
    public boolean h0;
    public float i0;
    public float j0;
    public static final String[] k0;
    public static final j l0;
    public static final j m0;
    public static final j n0;
    public static final j o0;

    static {
        MaterialContainerTransform.k0 = new String[]{"materialContainerTransition:bounds", "materialContainerTransition:shapeAppearance"};
        MaterialContainerTransform.l0 = new j(new ProgressThresholds(0.0f, 0.25f), new ProgressThresholds(0.0f, 1.0f), new ProgressThresholds(0.0f, 1.0f), new ProgressThresholds(0.0f, 0.75f));
        MaterialContainerTransform.m0 = new j(new ProgressThresholds(0.6f, 0.9f), new ProgressThresholds(0.0f, 1.0f), new ProgressThresholds(0.0f, 0.9f), new ProgressThresholds(0.3f, 0.9f));
        MaterialContainerTransform.n0 = new j(new ProgressThresholds(0.1f, 0.4f), new ProgressThresholds(0.1f, 1.0f), new ProgressThresholds(0.1f, 1.0f), new ProgressThresholds(0.1f, 0.9f));
        MaterialContainerTransform.o0 = new j(new ProgressThresholds(0.6f, 0.9f), new ProgressThresholds(0.0f, 0.9f), new ProgressThresholds(0.0f, 0.9f), new ProgressThresholds(0.2f, 0.9f));
    }

    public MaterialContainerTransform() {
        boolean z = false;
        this.I = false;
        this.J = false;
        this.K = false;
        this.L = false;
        this.M = 0x1020002;
        this.N = -1;
        this.O = -1;
        this.P = 0;
        this.Q = 0;
        this.R = 0;
        this.S = 0x52000000;
        this.T = 0;
        this.U = 0;
        this.V = 0;
        if(Build.VERSION.SDK_INT >= 28) {
            z = true;
        }
        this.h0 = z;
        this.i0 = -1.0f;
        this.j0 = -1.0f;
    }

    public MaterialContainerTransform(@NonNull Context context0, boolean z) {
        boolean z1 = false;
        this.I = false;
        this.J = false;
        this.K = false;
        this.L = false;
        this.M = 0x1020002;
        this.N = -1;
        this.O = -1;
        this.P = 0;
        this.Q = 0;
        this.R = 0;
        this.S = 0x52000000;
        this.T = 0;
        this.U = 0;
        this.V = 0;
        if(Build.VERSION.SDK_INT >= 28) {
            z1 = true;
        }
        this.h0 = z1;
        this.i0 = -1.0f;
        this.j0 = -1.0f;
        this.n(context0, z);
        this.L = true;
    }

    @Override  // androidx.transition.Transition
    public void captureEndValues(@NonNull TransitionValues transitionValues0) {
        MaterialContainerTransform.l(transitionValues0, this.a0, this.O, this.c0);
    }

    @Override  // androidx.transition.Transition
    public void captureStartValues(@NonNull TransitionValues transitionValues0) {
        MaterialContainerTransform.l(transitionValues0, this.W, this.N, this.b0);
    }

    @Override  // androidx.transition.Transition
    @Nullable
    public Animator createAnimator(@NonNull ViewGroup viewGroup0, @Nullable TransitionValues transitionValues0, @Nullable TransitionValues transitionValues1) {
        a a6;
        a a5;
        a a2;
        int v5;
        boolean z1;
        RectF rectF1;
        View view4;
        View view3;
        if(transitionValues0 != null && transitionValues1 != null) {
            Object object0 = transitionValues0.values.get("materialContainerTransition:bounds");
            Object object1 = transitionValues0.values.get("materialContainerTransition:shapeAppearance");
            if(((RectF)object0) != null && ((ShapeAppearanceModel)object1) != null) {
                Object object2 = transitionValues1.values.get("materialContainerTransition:bounds");
                Object object3 = transitionValues1.values.get("materialContainerTransition:shapeAppearance");
                if(((RectF)object2) != null && ((ShapeAppearanceModel)object3) != null) {
                    View view0 = transitionValues0.view;
                    View view1 = transitionValues1.view;
                    View view2 = view1.getParent() == null ? view0 : view1;
                    if(this.M == view2.getId()) {
                        view3 = (View)view2.getParent();
                        view4 = view2;
                    }
                    else {
                        view3 = p.a(this.M, view2);
                        view4 = null;
                    }
                    RectF rectF0 = p.b(view3);
                    float f = -rectF0.left;
                    float f1 = -rectF0.top;
                    if(view4 == null) {
                        rectF1 = new RectF(0.0f, 0.0f, ((float)view3.getWidth()), ((float)view3.getHeight()));
                    }
                    else {
                        rectF1 = p.b(view4);
                        rectF1.offset(f, f1);
                    }
                    ((RectF)object0).offset(f, f1);
                    ((RectF)object2).offset(f, f1);
                    boolean z = false;
                    switch(this.T) {
                        case 0: {
                            float f2 = ((RectF)object2).width();
                            float f3 = ((RectF)object2).height();
                            float f4 = ((RectF)object0).width();
                            if(f3 * f2 > ((RectF)object0).height() * f4) {
                                z = true;
                            }
                            z1 = z;
                            break;
                        }
                        case 1: {
                            z1 = true;
                            break;
                        }
                        case 2: {
                            z1 = false;
                            break;
                        }
                        default: {
                            throw new IllegalArgumentException("Invalid transition direction: " + this.T);
                        }
                    }
                    if(!this.L) {
                        this.n(view2.getContext(), z1);
                    }
                    PathMotion pathMotion0 = this.getPathMotion();
                    float f5 = this.i0 == -1.0f ? ViewCompat.getElevation(view0) : this.i0;
                    float f6 = this.j0 == -1.0f ? ViewCompat.getElevation(view1) : this.j0;
                    int v = this.P;
                    int v1 = this.R;
                    int v2 = this.S;
                    boolean z2 = this.h0;
                    int v3 = this.Q;
                    int v4 = this.U;
                    a a0 = b.a;
                    a a1 = b.b;
                    if(v4 == 0) {
                        v5 = v2;
                        if(!z1) {
                            a0 = a1;
                        }
                        a2 = a0;
                    }
                    else {
                        v5 = v2;
                        switch(v4) {
                            case 1: {
                                if(z1) {
                                    a0 = a1;
                                }
                                a2 = a0;
                                break;
                            }
                            case 2: {
                                a2 = b.c;
                                break;
                            }
                            case 3: {
                                a2 = b.d;
                                break;
                            }
                            default: {
                                throw new IllegalArgumentException("Invalid fade mode: " + v4);
                            }
                        }
                    }
                    int v6 = this.V;
                    a a3 = b.e;
                    a a4 = b.f;
                    switch(v6) {
                        case 0: {
                            float f7 = ((RectF)object0).width();
                            float f8 = ((RectF)object0).height();
                            float f9 = ((RectF)object2).width();
                            float f10 = ((RectF)object2).height();
                            if(!z1) {
                                a5 = f9 * f8 / f7 >= f10 ? a3 : a4;
                            }
                            else if(f10 * f7 / f9 >= f8) {
                                a5 = a3;
                            }
                            else {
                                a5 = a4;
                            }
                            a6 = a5;
                            break;
                        }
                        case 1: {
                            a6 = a3;
                            break;
                        }
                        case 2: {
                            a6 = a4;
                            break;
                        }
                        default: {
                            throw new IllegalArgumentException("Invalid fit mode: " + v6);
                        }
                    }
                    PathMotion pathMotion1 = this.getPathMotion();
                    k k0 = new k(pathMotion0, view0, ((RectF)object0), ((ShapeAppearanceModel)object1), f5, view1, ((RectF)object2), ((ShapeAppearanceModel)object3), f6, v, v3, v1, v5, z1, z2, a2, a6, (pathMotion1 instanceof ArcMotion || pathMotion1 instanceof MaterialArcMotion ? this.m(z1, MaterialContainerTransform.n0, MaterialContainerTransform.o0) : this.m(z1, MaterialContainerTransform.l0, MaterialContainerTransform.m0)), this.I);
                    k0.setBounds(Math.round(rectF1.left), Math.round(rectF1.top), Math.round(rectF1.right), Math.round(rectF1.bottom));
                    Animator animator0 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                    ((ValueAnimator)animator0).addUpdateListener(new g(k0, 2));
                    this.addListener(new i(this, view3, k0, view0, view1));
                    return animator0;
                }
                Log.w("MaterialContainerTransform", "Skipping due to null end bounds. Ensure end view is laid out and measured.");
                return null;
            }
            Log.w("MaterialContainerTransform", "Skipping due to null start bounds. Ensure start view is laid out and measured.");
        }
        return null;
    }

    @ColorInt
    public int getContainerColor() {
        return this.P;
    }

    @IdRes
    public int getDrawingViewId() {
        return this.M;
    }

    @ColorInt
    public int getEndContainerColor() {
        return this.R;
    }

    public float getEndElevation() {
        return this.j0;
    }

    @Nullable
    public ShapeAppearanceModel getEndShapeAppearanceModel() {
        return this.c0;
    }

    @Nullable
    public View getEndView() {
        return this.a0;
    }

    @IdRes
    public int getEndViewId() {
        return this.O;
    }

    public int getFadeMode() {
        return this.U;
    }

    @Nullable
    public ProgressThresholds getFadeProgressThresholds() {
        return this.d0;
    }

    public int getFitMode() {
        return this.V;
    }

    @Nullable
    public ProgressThresholds getScaleMaskProgressThresholds() {
        return this.f0;
    }

    @Nullable
    public ProgressThresholds getScaleProgressThresholds() {
        return this.e0;
    }

    @ColorInt
    public int getScrimColor() {
        return this.S;
    }

    @Nullable
    public ProgressThresholds getShapeMaskProgressThresholds() {
        return this.g0;
    }

    @ColorInt
    public int getStartContainerColor() {
        return this.Q;
    }

    public float getStartElevation() {
        return this.i0;
    }

    @Nullable
    public ShapeAppearanceModel getStartShapeAppearanceModel() {
        return this.b0;
    }

    @Nullable
    public View getStartView() {
        return this.W;
    }

    @IdRes
    public int getStartViewId() {
        return this.N;
    }

    public int getTransitionDirection() {
        return this.T;
    }

    @Override  // androidx.transition.Transition
    @Nullable
    public String[] getTransitionProperties() {
        return MaterialContainerTransform.k0;
    }

    public boolean isDrawDebugEnabled() {
        return this.I;
    }

    public boolean isElevationShadowEnabled() {
        return this.h0;
    }

    public boolean isHoldAtEndEnabled() {
        return this.J;
    }

    public static void l(TransitionValues transitionValues0, View view0, int v, ShapeAppearanceModel shapeAppearanceModel0) {
        if(v != -1) {
            View view1 = transitionValues0.view;
            View view2 = view1.findViewById(v);
            if(view2 == null) {
                view2 = p.a(v, view1);
            }
            transitionValues0.view = view2;
        }
        else if(view0 != null) {
            transitionValues0.view = view0;
        }
        else if(transitionValues0.view.getTag(id.mtrl_motion_snapshot_view) instanceof View) {
            View view3 = (View)transitionValues0.view.getTag(id.mtrl_motion_snapshot_view);
            transitionValues0.view.setTag(id.mtrl_motion_snapshot_view, null);
            transitionValues0.view = view3;
        }
        View view4 = transitionValues0.view;
        if(ViewCompat.isLaidOut(view4) || view4.getWidth() != 0 || view4.getHeight() != 0) {
            RectF rectF0 = view4.getParent() == null ? new RectF(((float)view4.getLeft()), ((float)view4.getTop()), ((float)view4.getRight()), ((float)view4.getBottom())) : p.b(view4);
            transitionValues0.values.put("materialContainerTransition:bounds", rectF0);
            Map map0 = transitionValues0.values;
            if(shapeAppearanceModel0 == null) {
                if(view4.getTag(id.mtrl_motion_snapshot_view) instanceof ShapeAppearanceModel) {
                    shapeAppearanceModel0 = (ShapeAppearanceModel)view4.getTag(id.mtrl_motion_snapshot_view);
                }
                else {
                    Context context0 = view4.getContext();
                    TypedArray typedArray0 = context0.obtainStyledAttributes(new int[]{attr.transitionShapeAppearance});
                    int v1 = typedArray0.getResourceId(0, -1);
                    typedArray0.recycle();
                    if(v1 == -1) {
                        shapeAppearanceModel0 = view4 instanceof Shapeable ? ((Shapeable)view4).getShapeAppearanceModel() : ShapeAppearanceModel.builder().build();
                    }
                    else {
                        shapeAppearanceModel0 = ShapeAppearanceModel.builder(context0, v1, 0).build();
                    }
                }
            }
            map0.put("materialContainerTransition:shapeAppearance", shapeAppearanceModel0.withTransformedCornerSizes(new o(rectF0, 0)));
        }
    }

    public final j m(boolean z, j j0, j j1) {
        if(!z) {
            j0 = j1;
        }
        ProgressThresholds materialContainerTransform$ProgressThresholds0 = this.d0;
        ProgressThresholds materialContainerTransform$ProgressThresholds1 = j0.a;
        if(materialContainerTransform$ProgressThresholds0 == null) {
            materialContainerTransform$ProgressThresholds0 = materialContainerTransform$ProgressThresholds1;
        }
        return new j(materialContainerTransform$ProgressThresholds0, (this.e0 == null ? j0.b : this.e0), (this.f0 == null ? j0.c : this.f0), (this.g0 == null ? j0.d : this.g0));
    }

    public final void n(Context context0, boolean z) {
        int v = attr.motionEasingEmphasizedInterpolator;
        TimeInterpolator timeInterpolator0 = AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
        if(v != 0 && this.getInterpolator() == null) {
            this.setInterpolator(MotionUtils.resolveThemeInterpolator(context0, v, timeInterpolator0));
        }
        int v1 = z ? attr.motionDurationLong2 : attr.motionDurationMedium4;
        if(v1 != 0 && this.getDuration() == -1L) {
            int v2 = MotionUtils.resolveThemeDuration(context0, v1, -1);
            if(v2 != -1) {
                this.setDuration(((long)v2));
            }
        }
        if(!this.K) {
            int v3 = attr.motionPath;
            if(v3 != 0) {
                TypedValue typedValue0 = new TypedValue();
                PathMotion pathMotion0 = null;
                if(context0.getTheme().resolveAttribute(v3, typedValue0, true)) {
                    int v4 = typedValue0.type;
                    if(v4 == 16) {
                        int v5 = typedValue0.data;
                        if(v5 != 0) {
                            if(v5 != 1) {
                                throw new IllegalArgumentException("Invalid motion path type: " + v5);
                            }
                            pathMotion0 = new MaterialArcMotion();
                        }
                    }
                    else {
                        if(v4 != 3) {
                            throw new IllegalArgumentException("Motion path theme attribute must either be an enum value or path data string");
                        }
                        pathMotion0 = new PatternPathMotion(PathParser.createPathFromPathData(String.valueOf(typedValue0.string)));
                    }
                }
                if(pathMotion0 != null) {
                    this.setPathMotion(pathMotion0);
                }
            }
        }
    }

    public void setAllContainerColors(@ColorInt int v) {
        this.P = v;
        this.Q = v;
        this.R = v;
    }

    public void setContainerColor(@ColorInt int v) {
        this.P = v;
    }

    public void setDrawDebugEnabled(boolean z) {
        this.I = z;
    }

    public void setDrawingViewId(@IdRes int v) {
        this.M = v;
    }

    public void setElevationShadowEnabled(boolean z) {
        this.h0 = z;
    }

    public void setEndContainerColor(@ColorInt int v) {
        this.R = v;
    }

    public void setEndElevation(float f) {
        this.j0 = f;
    }

    public void setEndShapeAppearanceModel(@Nullable ShapeAppearanceModel shapeAppearanceModel0) {
        this.c0 = shapeAppearanceModel0;
    }

    public void setEndView(@Nullable View view0) {
        this.a0 = view0;
    }

    public void setEndViewId(@IdRes int v) {
        this.O = v;
    }

    public void setFadeMode(int v) {
        this.U = v;
    }

    public void setFadeProgressThresholds(@Nullable ProgressThresholds materialContainerTransform$ProgressThresholds0) {
        this.d0 = materialContainerTransform$ProgressThresholds0;
    }

    public void setFitMode(int v) {
        this.V = v;
    }

    public void setHoldAtEndEnabled(boolean z) {
        this.J = z;
    }

    @Override  // androidx.transition.Transition
    public void setPathMotion(@Nullable PathMotion pathMotion0) {
        super.setPathMotion(pathMotion0);
        this.K = true;
    }

    public void setScaleMaskProgressThresholds(@Nullable ProgressThresholds materialContainerTransform$ProgressThresholds0) {
        this.f0 = materialContainerTransform$ProgressThresholds0;
    }

    public void setScaleProgressThresholds(@Nullable ProgressThresholds materialContainerTransform$ProgressThresholds0) {
        this.e0 = materialContainerTransform$ProgressThresholds0;
    }

    public void setScrimColor(@ColorInt int v) {
        this.S = v;
    }

    public void setShapeMaskProgressThresholds(@Nullable ProgressThresholds materialContainerTransform$ProgressThresholds0) {
        this.g0 = materialContainerTransform$ProgressThresholds0;
    }

    public void setStartContainerColor(@ColorInt int v) {
        this.Q = v;
    }

    public void setStartElevation(float f) {
        this.i0 = f;
    }

    public void setStartShapeAppearanceModel(@Nullable ShapeAppearanceModel shapeAppearanceModel0) {
        this.b0 = shapeAppearanceModel0;
    }

    public void setStartView(@Nullable View view0) {
        this.W = view0;
    }

    public void setStartViewId(@IdRes int v) {
        this.N = v;
    }

    public void setTransitionDirection(int v) {
        this.T = v;
    }
}

