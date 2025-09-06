package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.transition.ArcMotion;
import android.transition.PathMotion;
import android.transition.PatternPathMotion;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.PathParser;
import androidx.core.view.ViewCompat;
import com.google.android.material.R.attr;
import com.google.android.material.R.id;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import com.google.android.material.transition.o;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;

@RequiresApi(21)
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

    public static final g A = null;
    public static final g B = null;
    public static final g C = null;
    public static final g D = null;
    public static final int FADE_MODE_CROSS = 2;
    public static final int FADE_MODE_IN = 0;
    public static final int FADE_MODE_OUT = 1;
    public static final int FADE_MODE_THROUGH = 3;
    public static final int FIT_MODE_AUTO = 0;
    public static final int FIT_MODE_HEIGHT = 2;
    public static final int FIT_MODE_WIDTH = 1;
    public static final int TRANSITION_DIRECTION_AUTO = 0;
    public static final int TRANSITION_DIRECTION_ENTER = 1;
    public static final int TRANSITION_DIRECTION_RETURN = 2;
    public boolean a;
    public boolean b;
    public boolean c;
    public final boolean d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public View o;
    public View p;
    public ShapeAppearanceModel q;
    public ShapeAppearanceModel r;
    public ProgressThresholds s;
    public ProgressThresholds t;
    public ProgressThresholds u;
    public ProgressThresholds v;
    public boolean w;
    public float x;
    public float y;
    public static final String[] z;

    static {
        MaterialContainerTransform.z = new String[]{"materialContainerTransition:bounds", "materialContainerTransition:shapeAppearance"};
        MaterialContainerTransform.A = new g(new ProgressThresholds(0.0f, 0.25f), new ProgressThresholds(0.0f, 1.0f), new ProgressThresholds(0.0f, 1.0f), new ProgressThresholds(0.0f, 0.75f));
        MaterialContainerTransform.B = new g(new ProgressThresholds(0.6f, 0.9f), new ProgressThresholds(0.0f, 1.0f), new ProgressThresholds(0.0f, 0.9f), new ProgressThresholds(0.3f, 0.9f));
        MaterialContainerTransform.C = new g(new ProgressThresholds(0.1f, 0.4f), new ProgressThresholds(0.1f, 1.0f), new ProgressThresholds(0.1f, 1.0f), new ProgressThresholds(0.1f, 0.9f));
        MaterialContainerTransform.D = new g(new ProgressThresholds(0.6f, 0.9f), new ProgressThresholds(0.0f, 0.9f), new ProgressThresholds(0.0f, 0.9f), new ProgressThresholds(0.2f, 0.9f));
    }

    public MaterialContainerTransform() {
        boolean z = false;
        this.a = false;
        this.b = false;
        this.c = false;
        this.d = false;
        this.e = 0x1020002;
        this.f = -1;
        this.g = -1;
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.k = 0x52000000;
        this.l = 0;
        this.m = 0;
        this.n = 0;
        if(Build.VERSION.SDK_INT >= 28) {
            z = true;
        }
        this.w = z;
        this.x = -1.0f;
        this.y = -1.0f;
    }

    public MaterialContainerTransform(@NonNull Context context0, boolean z) {
        boolean z1 = false;
        this.a = false;
        this.b = false;
        this.c = false;
        this.d = false;
        this.e = 0x1020002;
        this.f = -1;
        this.g = -1;
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.k = 0x52000000;
        this.l = 0;
        this.m = 0;
        this.n = 0;
        if(Build.VERSION.SDK_INT >= 28) {
            z1 = true;
        }
        this.w = z1;
        this.x = -1.0f;
        this.y = -1.0f;
        this.c(context0, z);
        this.d = true;
    }

    public static void a(TransitionValues transitionValues0, View view0, int v, ShapeAppearanceModel shapeAppearanceModel0) {
        if(v != -1) {
            View view1 = transitionValues0.view;
            View view2 = view1.findViewById(v);
            if(view2 == null) {
                view2 = l.a(v, view1);
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
            RectF rectF0 = view4.getParent() == null ? new RectF(((float)view4.getLeft()), ((float)view4.getTop()), ((float)view4.getRight()), ((float)view4.getBottom())) : l.b(view4);
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
            map0.put("materialContainerTransition:shapeAppearance", shapeAppearanceModel0.withTransformedCornerSizes(new o(rectF0, 1)));
        }
    }

    public final g b(boolean z, g g0, g g1) {
        if(!z) {
            g0 = g1;
        }
        ProgressThresholds materialContainerTransform$ProgressThresholds0 = this.s;
        ProgressThresholds materialContainerTransform$ProgressThresholds1 = g0.a;
        if(materialContainerTransform$ProgressThresholds0 == null) {
            materialContainerTransform$ProgressThresholds0 = materialContainerTransform$ProgressThresholds1;
        }
        return new g(materialContainerTransform$ProgressThresholds0, (this.t == null ? g0.b : this.t), (this.u == null ? g0.c : this.u), (this.v == null ? g0.d : this.v));
    }

    public final void c(Context context0, boolean z) {
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
        if(!this.c) {
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

    @Override  // android.transition.Transition
    public void captureEndValues(@NonNull TransitionValues transitionValues0) {
        MaterialContainerTransform.a(transitionValues0, this.p, this.g, this.r);
    }

    @Override  // android.transition.Transition
    public void captureStartValues(@NonNull TransitionValues transitionValues0) {
        MaterialContainerTransform.a(transitionValues0, this.o, this.f, this.q);
    }

    @Override  // android.transition.Transition
    @Nullable
    public Animator createAnimator(@NonNull ViewGroup viewGroup0, @Nullable TransitionValues transitionValues0, @Nullable TransitionValues transitionValues1) {
        a a6;
        a a5;
        a a2;
        boolean z3;
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
                    if(this.e == view2.getId()) {
                        view3 = (View)view2.getParent();
                        view4 = view2;
                    }
                    else {
                        view3 = l.a(this.e, view2);
                        view4 = null;
                    }
                    RectF rectF0 = l.b(view3);
                    float f = -rectF0.left;
                    float f1 = -rectF0.top;
                    if(view4 == null) {
                        rectF1 = new RectF(0.0f, 0.0f, ((float)view3.getWidth()), ((float)view3.getHeight()));
                    }
                    else {
                        rectF1 = l.b(view4);
                        rectF1.offset(f, f1);
                    }
                    ((RectF)object0).offset(f, f1);
                    ((RectF)object2).offset(f, f1);
                    boolean z = false;
                    switch(this.l) {
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
                            throw new IllegalArgumentException("Invalid transition direction: " + this.l);
                        }
                    }
                    if(!this.d) {
                        this.c(view2.getContext(), z1);
                    }
                    PathMotion pathMotion0 = this.getPathMotion();
                    float f5 = this.x == -1.0f ? ViewCompat.getElevation(view0) : this.x;
                    float f6 = this.y == -1.0f ? ViewCompat.getElevation(view1) : this.y;
                    int v = this.h;
                    int v1 = this.j;
                    int v2 = this.k;
                    boolean z2 = this.w;
                    int v3 = this.i;
                    int v4 = this.m;
                    a a0 = b.a;
                    a a1 = b.b;
                    if(v4 == 0) {
                        z3 = z2;
                        if(!z1) {
                            a0 = a1;
                        }
                        a2 = a0;
                    }
                    else {
                        z3 = z2;
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
                    int v5 = this.n;
                    a a3 = b.e;
                    a a4 = b.f;
                    switch(v5) {
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
                            throw new IllegalArgumentException("Invalid fit mode: " + v5);
                        }
                    }
                    PathMotion pathMotion1 = this.getPathMotion();
                    h h0 = new h(pathMotion0, view0, ((RectF)object0), ((ShapeAppearanceModel)object1), f5, view1, ((RectF)object2), ((ShapeAppearanceModel)object3), f6, v, v3, v1, v2, z1, z3, a2, a6, (pathMotion1 instanceof ArcMotion || pathMotion1 instanceof MaterialArcMotion ? this.b(z1, MaterialContainerTransform.C, MaterialContainerTransform.D) : this.b(z1, MaterialContainerTransform.A, MaterialContainerTransform.B)), this.a);
                    h0.setBounds(Math.round(rectF1.left), Math.round(rectF1.top), Math.round(rectF1.right), Math.round(rectF1.bottom));
                    Animator animator0 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                    ((ValueAnimator)animator0).addUpdateListener(new com.google.android.material.appbar.g(h0, 3));
                    this.addListener(new f(this, view3, h0, view0, view1));
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
        return this.h;
    }

    @IdRes
    public int getDrawingViewId() {
        return this.e;
    }

    @ColorInt
    public int getEndContainerColor() {
        return this.j;
    }

    public float getEndElevation() {
        return this.y;
    }

    @Nullable
    public ShapeAppearanceModel getEndShapeAppearanceModel() {
        return this.r;
    }

    @Nullable
    public View getEndView() {
        return this.p;
    }

    @IdRes
    public int getEndViewId() {
        return this.g;
    }

    public int getFadeMode() {
        return this.m;
    }

    @Nullable
    public ProgressThresholds getFadeProgressThresholds() {
        return this.s;
    }

    public int getFitMode() {
        return this.n;
    }

    @Nullable
    public ProgressThresholds getScaleMaskProgressThresholds() {
        return this.u;
    }

    @Nullable
    public ProgressThresholds getScaleProgressThresholds() {
        return this.t;
    }

    @ColorInt
    public int getScrimColor() {
        return this.k;
    }

    @Nullable
    public ProgressThresholds getShapeMaskProgressThresholds() {
        return this.v;
    }

    @ColorInt
    public int getStartContainerColor() {
        return this.i;
    }

    public float getStartElevation() {
        return this.x;
    }

    @Nullable
    public ShapeAppearanceModel getStartShapeAppearanceModel() {
        return this.q;
    }

    @Nullable
    public View getStartView() {
        return this.o;
    }

    @IdRes
    public int getStartViewId() {
        return this.f;
    }

    public int getTransitionDirection() {
        return this.l;
    }

    @Override  // android.transition.Transition
    @Nullable
    public String[] getTransitionProperties() {
        return MaterialContainerTransform.z;
    }

    public boolean isDrawDebugEnabled() {
        return this.a;
    }

    public boolean isElevationShadowEnabled() {
        return this.w;
    }

    public boolean isHoldAtEndEnabled() {
        return this.b;
    }

    public void setAllContainerColors(@ColorInt int v) {
        this.h = v;
        this.i = v;
        this.j = v;
    }

    public void setContainerColor(@ColorInt int v) {
        this.h = v;
    }

    public void setDrawDebugEnabled(boolean z) {
        this.a = z;
    }

    public void setDrawingViewId(@IdRes int v) {
        this.e = v;
    }

    public void setElevationShadowEnabled(boolean z) {
        this.w = z;
    }

    public void setEndContainerColor(@ColorInt int v) {
        this.j = v;
    }

    public void setEndElevation(float f) {
        this.y = f;
    }

    public void setEndShapeAppearanceModel(@Nullable ShapeAppearanceModel shapeAppearanceModel0) {
        this.r = shapeAppearanceModel0;
    }

    public void setEndView(@Nullable View view0) {
        this.p = view0;
    }

    public void setEndViewId(@IdRes int v) {
        this.g = v;
    }

    public void setFadeMode(int v) {
        this.m = v;
    }

    public void setFadeProgressThresholds(@Nullable ProgressThresholds materialContainerTransform$ProgressThresholds0) {
        this.s = materialContainerTransform$ProgressThresholds0;
    }

    public void setFitMode(int v) {
        this.n = v;
    }

    public void setHoldAtEndEnabled(boolean z) {
        this.b = z;
    }

    @Override  // android.transition.Transition
    public void setPathMotion(@Nullable PathMotion pathMotion0) {
        super.setPathMotion(pathMotion0);
        this.c = true;
    }

    public void setScaleMaskProgressThresholds(@Nullable ProgressThresholds materialContainerTransform$ProgressThresholds0) {
        this.u = materialContainerTransform$ProgressThresholds0;
    }

    public void setScaleProgressThresholds(@Nullable ProgressThresholds materialContainerTransform$ProgressThresholds0) {
        this.t = materialContainerTransform$ProgressThresholds0;
    }

    public void setScrimColor(@ColorInt int v) {
        this.k = v;
    }

    public void setShapeMaskProgressThresholds(@Nullable ProgressThresholds materialContainerTransform$ProgressThresholds0) {
        this.v = materialContainerTransform$ProgressThresholds0;
    }

    public void setStartContainerColor(@ColorInt int v) {
        this.i = v;
    }

    public void setStartElevation(float f) {
        this.x = f;
    }

    public void setStartShapeAppearanceModel(@Nullable ShapeAppearanceModel shapeAppearanceModel0) {
        this.q = shapeAppearanceModel0;
    }

    public void setStartView(@Nullable View view0) {
        this.o = view0;
    }

    public void setStartViewId(@IdRes int v) {
        this.f = v;
    }

    public void setTransitionDirection(int v) {
        this.l = v;
    }
}

