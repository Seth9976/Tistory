package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.widgets.Barrier;
import androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Flow;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.Helper;
import androidx.constraintlayout.core.widgets.HelperWidget;
import androidx.constraintlayout.core.widgets.Placeholder;
import androidx.constraintlayout.core.widgets.VirtualLayout;
import androidx.constraintlayout.motion.utils.ViewState;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintSet.Constraint;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.Constraints.LayoutParams;
import java.util.ArrayList;
import java.util.HashMap;

public final class l {
    public ConstraintWidgetContainer a;
    public ConstraintWidgetContainer b;
    public ConstraintSet c;
    public ConstraintSet d;
    public int e;
    public int f;
    public final MotionLayout g;

    public l(MotionLayout motionLayout0) {
        this.g = motionLayout0;
        this.a = new ConstraintWidgetContainer();
        this.b = new ConstraintWidgetContainer();
        this.c = null;
        this.d = null;
    }

    public final void a() {
        Interpolator interpolator0;
        int v4;
        MotionLayout motionLayout0 = this.g;
        int v = motionLayout0.getChildCount();
        motionLayout0.k.clear();
        SparseArray sparseArray0 = new SparseArray();
        int[] arr_v = new int[v];
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = motionLayout0.getChildAt(v1);
            MotionController motionController0 = new MotionController(view0);
            int v2 = view0.getId();
            arr_v[v1] = v2;
            sparseArray0.put(v2, motionController0);
            motionLayout0.k.put(view0, motionController0);
        }
        for(int v3 = 0; v3 < v; v3 = v4 + 1) {
            View view1 = motionLayout0.getChildAt(v3);
            MotionController motionController1 = (MotionController)motionLayout0.k.get(view1);
            if(motionController1 == null) {
                v4 = v3;
            }
            else {
                if(this.c == null) {
                    v4 = v3;
                    if(motionLayout0.h0) {
                        motionController1.setStartState(((ViewState)motionLayout0.j0.get(view1)), view1, motionLayout0.i0, motionLayout0.k0, motionLayout0.l0);
                    }
                }
                else {
                    ConstraintWidget constraintWidget0 = l.d(this.a, view1);
                    if(constraintWidget0 == null) {
                        v4 = v3;
                        if(motionLayout0.u != 0) {
                            Log.e("MotionLayout", ".(null:-1)no widget for  " + Debug.getName(view1) + " (" + view1.getClass().getName() + ")");
                        }
                    }
                    else {
                        Rect rect0 = MotionLayout.c(motionLayout0, constraintWidget0);
                        ConstraintSet constraintSet0 = this.c;
                        int v5 = motionLayout0.getWidth();
                        int v6 = motionLayout0.getHeight();
                        int v7 = constraintSet0.mRotate;
                        if(v7 != 0) {
                            MotionController.h(v7, v5, v6, rect0, motionController1.a);
                        }
                        motionController1.f.c = 0.0f;
                        motionController1.f.d = 0.0f;
                        motionController1.g(motionController1.f);
                        float f = (float)rect0.left;
                        float f1 = (float)rect0.top;
                        float f2 = (float)rect0.width();
                        v4 = v3;
                        float f3 = (float)rect0.height();
                        motionController1.f.e(f, f1, f2, f3);
                        Constraint constraintSet$Constraint0 = constraintSet0.getParameters(motionController1.c);
                        motionController1.f.a(constraintSet$Constraint0);
                        motionController1.l = constraintSet$Constraint0.motion.mMotionStagger;
                        motionController1.h.d(rect0, constraintSet0, v7, motionController1.c);
                        motionController1.C = constraintSet$Constraint0.transform.transformPivotTarget;
                        motionController1.E = constraintSet$Constraint0.motion.mQuantizeMotionSteps;
                        motionController1.F = constraintSet$Constraint0.motion.mQuantizeMotionPhase;
                        Context context0 = motionController1.b.getContext();
                        int v8 = constraintSet$Constraint0.motion.mQuantizeInterpolatorType;
                        String s = constraintSet$Constraint0.motion.mQuantizeInterpolatorString;
                        int v9 = constraintSet$Constraint0.motion.mQuantizeInterpolatorID;
                        if(v8 == -2) {
                            interpolator0 = AnimationUtils.loadInterpolator(context0, v9);
                        }
                        else {
                            switch(v8) {
                                case -1: {
                                    interpolator0 = new h(Easing.getInterpolator(s), 0);
                                    break;
                                }
                                case 0: {
                                    interpolator0 = new AccelerateDecelerateInterpolator();
                                    break;
                                }
                                case 1: {
                                    interpolator0 = new AccelerateInterpolator();
                                    break;
                                }
                                case 2: {
                                    interpolator0 = new DecelerateInterpolator();
                                    break;
                                }
                                case 4: {
                                    interpolator0 = new BounceInterpolator();
                                    break;
                                }
                                case 5: {
                                    interpolator0 = new OvershootInterpolator();
                                    break;
                                }
                                default: {
                                    interpolator0 = null;
                                }
                            }
                        }
                        motionController1.G = interpolator0;
                    }
                }
                if(this.d != null) {
                    ConstraintWidget constraintWidget1 = l.d(this.b, view1);
                    if(constraintWidget1 != null) {
                        Rect rect1 = MotionLayout.c(motionLayout0, constraintWidget1);
                        ConstraintSet constraintSet1 = this.d;
                        int v10 = motionLayout0.getWidth();
                        int v11 = motionLayout0.getHeight();
                        int v12 = constraintSet1.mRotate;
                        if(v12 != 0) {
                            MotionController.h(v12, v10, v11, rect1, motionController1.a);
                            rect1 = motionController1.a;
                        }
                        motionController1.g.c = 1.0f;
                        motionController1.g.d = 1.0f;
                        motionController1.g(motionController1.g);
                        float f4 = (float)rect1.left;
                        float f5 = (float)rect1.top;
                        float f6 = (float)rect1.width();
                        float f7 = (float)rect1.height();
                        motionController1.g.e(f4, f5, f6, f7);
                        Constraint constraintSet$Constraint1 = constraintSet1.getParameters(motionController1.c);
                        motionController1.g.a(constraintSet$Constraint1);
                        motionController1.i.d(rect1, constraintSet1, v12, motionController1.c);
                    }
                    else if(motionLayout0.u != 0) {
                        Log.e("MotionLayout", ".(null:-1)no widget for  " + Debug.getName(view1) + " (" + view1.getClass().getName() + ")");
                    }
                }
            }
        }
        for(int v13 = 0; v13 < v; ++v13) {
            MotionController motionController2 = (MotionController)sparseArray0.get(arr_v[v13]);
            int v14 = motionController2.getAnimateRelativeTo();
            if(v14 != -1) {
                motionController2.setupRelative(((MotionController)sparseArray0.get(v14)));
            }
        }
    }

    public final void b(int v, int v1) {
        MotionLayout motionLayout0 = this.g;
        int v2 = motionLayout0.getOptimizationLevel();
        if(motionLayout0.f == motionLayout0.getStartState()) {
            motionLayout0.resolveSystem(this.b, v2, (this.d == null || this.d.mRotate == 0 ? v : v1), (this.d == null || this.d.mRotate == 0 ? v1 : v));
            ConstraintSet constraintSet0 = this.c;
            if(constraintSet0 != null) {
                ConstraintWidgetContainer constraintWidgetContainer0 = this.a;
                int v3 = constraintSet0.mRotate == 0 ? v : v1;
                if(constraintSet0.mRotate == 0) {
                    v = v1;
                }
                motionLayout0.resolveSystem(constraintWidgetContainer0, v2, v3, v);
            }
        }
        else {
            ConstraintSet constraintSet1 = this.c;
            if(constraintSet1 != null) {
                motionLayout0.resolveSystem(this.a, v2, (constraintSet1.mRotate == 0 ? v : v1), (constraintSet1.mRotate == 0 ? v1 : v));
            }
            ConstraintWidgetContainer constraintWidgetContainer1 = this.b;
            int v4 = this.d == null || this.d.mRotate == 0 ? v : v1;
            if(this.d == null || this.d.mRotate == 0) {
                v = v1;
            }
            motionLayout0.resolveSystem(constraintWidgetContainer1, v2, v4, v);
        }
    }

    public static void c(ConstraintWidgetContainer constraintWidgetContainer0, ConstraintWidgetContainer constraintWidgetContainer1) {
        ConstraintWidget constraintWidget1;
        ArrayList arrayList0 = constraintWidgetContainer0.getChildren();
        HashMap hashMap0 = new HashMap();
        hashMap0.put(constraintWidgetContainer0, constraintWidgetContainer1);
        constraintWidgetContainer1.getChildren().clear();
        constraintWidgetContainer1.copy(constraintWidgetContainer0, hashMap0);
        for(Object object0: arrayList0) {
            ConstraintWidget constraintWidget0 = (ConstraintWidget)object0;
            if(constraintWidget0 instanceof Barrier) {
                constraintWidget1 = new Barrier();
            }
            else if(constraintWidget0 instanceof Guideline) {
                constraintWidget1 = new Guideline();
            }
            else if(constraintWidget0 instanceof Flow) {
                constraintWidget1 = new Flow();
            }
            else if(constraintWidget0 instanceof Placeholder) {
                constraintWidget1 = new Placeholder();
            }
            else if(constraintWidget0 instanceof Helper) {
                constraintWidget1 = new HelperWidget();
            }
            else {
                constraintWidget1 = new ConstraintWidget();
            }
            constraintWidgetContainer1.add(constraintWidget1);
            hashMap0.put(constraintWidget0, constraintWidget1);
        }
        for(Object object1: arrayList0) {
            ((ConstraintWidget)hashMap0.get(((ConstraintWidget)object1))).copy(((ConstraintWidget)object1), hashMap0);
        }
    }

    public static ConstraintWidget d(ConstraintWidgetContainer constraintWidgetContainer0, View view0) {
        if(constraintWidgetContainer0.getCompanionWidget() == view0) {
            return constraintWidgetContainer0;
        }
        ArrayList arrayList0 = constraintWidgetContainer0.getChildren();
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ConstraintWidget constraintWidget0 = (ConstraintWidget)arrayList0.get(v1);
            if(constraintWidget0.getCompanionWidget() == view0) {
                return constraintWidget0;
            }
        }
        return null;
    }

    public final void e(ConstraintSet constraintSet0, ConstraintSet constraintSet1) {
        this.c = constraintSet0;
        this.d = constraintSet1;
        this.a = new ConstraintWidgetContainer();
        this.b = new ConstraintWidgetContainer();
        MotionLayout motionLayout0 = this.g;
        this.a.setMeasurer(motionLayout0.mLayoutWidget.getMeasurer());
        this.b.setMeasurer(motionLayout0.mLayoutWidget.getMeasurer());
        this.a.removeAllChildren();
        this.b.removeAllChildren();
        l.c(motionLayout0.mLayoutWidget, this.a);
        l.c(motionLayout0.mLayoutWidget, this.b);
        if(((double)motionLayout0.o) > 0.5) {
            if(constraintSet0 != null) {
                this.g(this.a, constraintSet0);
            }
            this.g(this.b, constraintSet1);
        }
        else {
            this.g(this.b, constraintSet1);
            if(constraintSet0 != null) {
                this.g(this.a, constraintSet0);
            }
        }
        this.a.setRtl(motionLayout0.isRtl());
        this.a.updateHierarchy();
        this.b.setRtl(motionLayout0.isRtl());
        this.b.updateHierarchy();
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = motionLayout0.getLayoutParams();
        if(viewGroup$LayoutParams0 != null) {
            if(viewGroup$LayoutParams0.width == -2) {
                this.a.setHorizontalDimensionBehaviour(DimensionBehaviour.WRAP_CONTENT);
                this.b.setHorizontalDimensionBehaviour(DimensionBehaviour.WRAP_CONTENT);
            }
            if(viewGroup$LayoutParams0.height == -2) {
                this.a.setVerticalDimensionBehaviour(DimensionBehaviour.WRAP_CONTENT);
                this.b.setVerticalDimensionBehaviour(DimensionBehaviour.WRAP_CONTENT);
            }
        }
    }

    public final void f() {
        int v18;
        HashMap hashMap0;
        MotionLayout motionLayout0 = this.g;
        int v = motionLayout0.h;
        int v1 = motionLayout0.i;
        int v2 = View.MeasureSpec.getMode(v);
        int v3 = View.MeasureSpec.getMode(v1);
        motionLayout0.V = v2;
        motionLayout0.W = v3;
        this.b(v, v1);
        int v4 = 0;
        if(!(motionLayout0.getParent() instanceof MotionLayout) || v2 != 0x40000000 || v3 != 0x40000000) {
            this.b(v, v1);
            motionLayout0.R = this.a.getWidth();
            motionLayout0.S = this.a.getHeight();
            motionLayout0.T = this.b.getWidth();
            int v5 = this.b.getHeight();
            motionLayout0.U = v5;
            motionLayout0.mMeasureDuringTransition = motionLayout0.R != motionLayout0.T || motionLayout0.S != v5;
        }
        int v6 = motionLayout0.R;
        int v7 = motionLayout0.S;
        if(motionLayout0.V == 0x80000000 || motionLayout0.V == 0) {
            v6 = (int)(motionLayout0.a0 * ((float)(motionLayout0.T - v6)) + ((float)v6));
        }
        this.g.resolveMeasuredDimension(v, v1, v6, (motionLayout0.W == 0x80000000 || motionLayout0.W == 0 ? ((int)(motionLayout0.a0 * ((float)(motionLayout0.U - v7)) + ((float)v7))) : v7), this.a.isWidthMeasuredTooSmall() || this.b.isWidthMeasuredTooSmall(), this.a.isHeightMeasuredTooSmall() || this.b.isHeightMeasuredTooSmall());
        int v8 = motionLayout0.getChildCount();
        motionLayout0.q0.a();
        motionLayout0.s = true;
        SparseArray sparseArray0 = new SparseArray();
        for(int v9 = 0; true; ++v9) {
            hashMap0 = motionLayout0.k;
            if(v9 >= v8) {
                break;
            }
            View view0 = motionLayout0.getChildAt(v9);
            sparseArray0.put(view0.getId(), ((MotionController)hashMap0.get(view0)));
        }
        int v10 = motionLayout0.getWidth();
        int v11 = motionLayout0.getHeight();
        int v12 = motionLayout0.a.gatPathMotionArc();
        if(v12 != -1) {
            for(int v13 = 0; v13 < v8; ++v13) {
                MotionController motionController0 = (MotionController)hashMap0.get(motionLayout0.getChildAt(v13));
                if(motionController0 != null) {
                    motionController0.setPathMotionArc(v12);
                }
            }
        }
        SparseBooleanArray sparseBooleanArray0 = new SparseBooleanArray();
        int[] arr_v = new int[hashMap0.size()];
        int v15 = 0;
        for(int v14 = 0; v14 < v8; ++v14) {
            MotionController motionController1 = (MotionController)hashMap0.get(motionLayout0.getChildAt(v14));
            if(motionController1.getAnimateRelativeTo() != -1) {
                sparseBooleanArray0.put(motionController1.getAnimateRelativeTo(), true);
                arr_v[v15] = motionController1.getAnimateRelativeTo();
                ++v15;
            }
        }
        if(motionLayout0.K == null) {
            for(int v19 = 0; v19 < v15; ++v19) {
                MotionController motionController4 = (MotionController)hashMap0.get(motionLayout0.findViewById(arr_v[v19]));
                if(motionController4 != null) {
                    motionLayout0.a.getKeyFrames(motionController4);
                    motionController4.setup(v10, v11, motionLayout0.m, 2262360099600L);
                }
            }
        }
        else {
            for(int v16 = 0; v16 < v15; ++v16) {
                MotionController motionController2 = (MotionController)hashMap0.get(motionLayout0.findViewById(arr_v[v16]));
                if(motionController2 != null) {
                    motionLayout0.a.getKeyFrames(motionController2);
                }
            }
            for(Object object0: motionLayout0.K) {
                ((MotionHelper)object0).onPreSetup(motionLayout0, hashMap0);
            }
            int v17 = 0;
            while(v17 < v15) {
                MotionController motionController3 = (MotionController)hashMap0.get(motionLayout0.findViewById(arr_v[v17]));
                if(motionController3 == null) {
                    v18 = v15;
                }
                else {
                    v18 = v15;
                    motionController3.setup(v10, v11, motionLayout0.m, 0x20EBF24E710L);
                }
                ++v17;
                v15 = v18;
            }
        }
        for(int v20 = 0; v20 < v8; ++v20) {
            View view1 = motionLayout0.getChildAt(v20);
            MotionController motionController5 = (MotionController)hashMap0.get(view1);
            if(!sparseBooleanArray0.get(view1.getId()) && motionController5 != null) {
                motionLayout0.a.getKeyFrames(motionController5);
                motionController5.setup(v10, v11, motionLayout0.m, 0x20EBF31F2E8L);
            }
        }
        float f = motionLayout0.a.getStaggered();
        if(f != 0.0f) {
            float f1 = Math.abs(f);
            float f2 = -3.402823E+38f;
            float f3 = 3.402823E+38f;
            float f4 = -3.402823E+38f;
            float f5 = 3.402823E+38f;
            for(int v21 = 0; v21 < v8; ++v21) {
                MotionController motionController6 = (MotionController)hashMap0.get(motionLayout0.getChildAt(v21));
                if(!Float.isNaN(motionController6.l)) {
                    for(int v22 = 0; v22 < v8; ++v22) {
                        MotionController motionController7 = (MotionController)hashMap0.get(motionLayout0.getChildAt(v22));
                        if(!Float.isNaN(motionController7.l)) {
                            f3 = Math.min(f3, motionController7.l);
                            f2 = Math.max(f2, motionController7.l);
                        }
                    }
                    while(v4 < v8) {
                        MotionController motionController8 = (MotionController)hashMap0.get(motionLayout0.getChildAt(v4));
                        if(!Float.isNaN(motionController8.l)) {
                            motionController8.n = 1.0f / (1.0f - f1);
                            motionController8.m = ((double)f) < 0.0 ? f1 - (f2 - motionController8.l) / (f2 - f3) * f1 : f1 - (motionController8.l - f3) * f1 / (f2 - f3);
                        }
                        ++v4;
                    }
                    return;
                }
                float f6 = motionController6.getFinalX();
                float f7 = motionController6.getFinalY();
                float f8 = ((double)f) < 0.0 ? f7 - f6 : f7 + f6;
                f5 = Math.min(f5, f8);
                f4 = Math.max(f4, f8);
            }
            while(v4 < v8) {
                MotionController motionController9 = (MotionController)hashMap0.get(motionLayout0.getChildAt(v4));
                float f9 = motionController9.getFinalX();
                float f10 = motionController9.getFinalY();
                motionController9.n = 1.0f / (1.0f - f1);
                motionController9.m = f1 - ((((double)f) < 0.0 ? f10 - f9 : f10 + f9) - f5) * f1 / (f4 - f5);
                ++v4;
            }
        }
    }

    public final void g(ConstraintWidgetContainer constraintWidgetContainer0, ConstraintSet constraintSet0) {
        SparseArray sparseArray0 = new SparseArray();
        LayoutParams constraints$LayoutParams0 = new LayoutParams(-2, -2);
        sparseArray0.clear();
        sparseArray0.put(0, constraintWidgetContainer0);
        MotionLayout motionLayout0 = this.g;
        sparseArray0.put(motionLayout0.getId(), constraintWidgetContainer0);
        if(constraintSet0 != null && constraintSet0.mRotate != 0) {
            motionLayout0.resolveSystem(this.b, motionLayout0.getOptimizationLevel(), View.MeasureSpec.makeMeasureSpec(motionLayout0.getHeight(), 0x40000000), View.MeasureSpec.makeMeasureSpec(motionLayout0.getWidth(), 0x40000000));
        }
        for(Object object0: constraintWidgetContainer0.getChildren()) {
            ((ConstraintWidget)object0).setAnimated(true);
            sparseArray0.put(((View)((ConstraintWidget)object0).getCompanionWidget()).getId(), ((ConstraintWidget)object0));
        }
        for(Object object1: constraintWidgetContainer0.getChildren()) {
            ConstraintWidget constraintWidget0 = (ConstraintWidget)object1;
            View view0 = (View)constraintWidget0.getCompanionWidget();
            constraintSet0.applyToLayoutParams(view0.getId(), constraints$LayoutParams0);
            constraintWidget0.setWidth(constraintSet0.getWidth(view0.getId()));
            constraintWidget0.setHeight(constraintSet0.getHeight(view0.getId()));
            if(view0 instanceof ConstraintHelper) {
                constraintSet0.applyToHelper(((ConstraintHelper)view0), constraintWidget0, constraints$LayoutParams0, sparseArray0);
                if(view0 instanceof androidx.constraintlayout.widget.Barrier) {
                    ((androidx.constraintlayout.widget.Barrier)view0).validateParams();
                }
            }
            constraints$LayoutParams0.resolveLayoutDirection(motionLayout0.getLayoutDirection());
            this.g.applyConstraintsFromLayoutParams(false, view0, constraintWidget0, constraints$LayoutParams0, sparseArray0);
            if(constraintSet0.getVisibilityMode(view0.getId()) == 1) {
                constraintWidget0.setVisibility(view0.getVisibility());
            }
            else {
                constraintWidget0.setVisibility(constraintSet0.getVisibility(view0.getId()));
            }
        }
        for(Object object2: constraintWidgetContainer0.getChildren()) {
            ConstraintWidget constraintWidget1 = (ConstraintWidget)object2;
            if(constraintWidget1 instanceof VirtualLayout) {
                ((ConstraintHelper)constraintWidget1.getCompanionWidget()).updatePreLayout(constraintWidgetContainer0, ((Helper)constraintWidget1), sparseArray0);
                ((VirtualLayout)(((Helper)constraintWidget1))).captureWidgets();
            }
        }
    }
}

