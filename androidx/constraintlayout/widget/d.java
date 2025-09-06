package androidx.constraintlayout.widget;

import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Optimizer;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer;

public final class d implements Measurer {
    public final ConstraintLayout a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public final ConstraintLayout h;

    public d(ConstraintLayout constraintLayout0, ConstraintLayout constraintLayout1) {
        this.h = constraintLayout0;
        this.a = constraintLayout1;
    }

    public static boolean a(int v, int v1, int v2) {
        if(v == v1) {
            return true;
        }
        int v3 = View.MeasureSpec.getMode(v);
        View.MeasureSpec.getSize(v);
        return View.MeasureSpec.getMode(v1) == 0x40000000 && (v3 == 0x80000000 || v3 == 0) && v2 == View.MeasureSpec.getSize(v1);
    }

    @Override  // androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measurer
    public final void didMeasures() {
        ConstraintLayout constraintLayout0 = this.a;
        int v = constraintLayout0.getChildCount();
        for(int v2 = 0; v2 < v; ++v2) {
            View view0 = constraintLayout0.getChildAt(v2);
            if(view0 instanceof Placeholder) {
                ((Placeholder)view0).updatePostMeasure(constraintLayout0);
            }
        }
        int v3 = constraintLayout0.mConstraintHelpers.size();
        if(v3 > 0) {
            for(int v1 = 0; v1 < v3; ++v1) {
                ((ConstraintHelper)constraintLayout0.mConstraintHelpers.get(v1)).updatePostMeasure(constraintLayout0);
            }
        }
    }

    @Override  // androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measurer
    public final void measure(ConstraintWidget constraintWidget0, Measure basicMeasure$Measure0) {
        int v8;
        int v7;
        int v6;
        int v13;
        int v5;
        int v4;
        if(constraintWidget0 == null) {
            return;
        }
        if(constraintWidget0.getVisibility() == 8 && !constraintWidget0.isInPlaceholder()) {
            basicMeasure$Measure0.measuredWidth = 0;
            basicMeasure$Measure0.measuredHeight = 0;
            basicMeasure$Measure0.measuredBaseline = 0;
            return;
        }
        if(constraintWidget0.getParent() == null) {
            return;
        }
        DimensionBehaviour constraintWidget$DimensionBehaviour0 = basicMeasure$Measure0.horizontalBehavior;
        DimensionBehaviour constraintWidget$DimensionBehaviour1 = basicMeasure$Measure0.verticalBehavior;
        int v = basicMeasure$Measure0.horizontalDimension;
        int v1 = basicMeasure$Measure0.verticalDimension;
        int v2 = this.b + this.c;
        int v3 = this.d;
        View view0 = (View)constraintWidget0.getCompanionWidget();
        int[] arr_v = b.a;
        switch(arr_v[constraintWidget$DimensionBehaviour0.ordinal()]) {
            case 1: {
                v4 = View.MeasureSpec.makeMeasureSpec(v, 0x40000000);
                break;
            }
            case 2: {
                v4 = ViewGroup.getChildMeasureSpec(this.f, v3, -2);
                break;
            }
            case 3: {
                v4 = ViewGroup.getChildMeasureSpec(this.f, constraintWidget0.getHorizontalMargin() + v3, -1);
                break;
            }
            case 4: {
                v4 = ViewGroup.getChildMeasureSpec(this.f, v3, -2);
                boolean z = constraintWidget0.mMatchConstraintDefaultWidth == 1;
                if(basicMeasure$Measure0.measureStrategy == Measure.TRY_GIVEN_DIMENSIONS || basicMeasure$Measure0.measureStrategy == Measure.USE_GIVEN_DIMENSIONS) {
                    boolean z1 = view0.getMeasuredHeight() == constraintWidget0.getHeight();
                    if(basicMeasure$Measure0.measureStrategy == Measure.USE_GIVEN_DIMENSIONS || !z || z1 || view0 instanceof Placeholder || constraintWidget0.isResolvedHorizontally()) {
                        v4 = View.MeasureSpec.makeMeasureSpec(constraintWidget0.getWidth(), 0x40000000);
                    }
                }
                break;
            }
            default: {
                v4 = 0;
            }
        }
        switch(arr_v[constraintWidget$DimensionBehaviour1.ordinal()]) {
            case 1: {
                v5 = View.MeasureSpec.makeMeasureSpec(v1, 0x40000000);
                break;
            }
            case 2: {
                v5 = ViewGroup.getChildMeasureSpec(this.g, v2, -2);
                break;
            }
            case 3: {
                v5 = ViewGroup.getChildMeasureSpec(this.g, constraintWidget0.getVerticalMargin() + v2, -1);
                break;
            }
            case 4: {
                v5 = ViewGroup.getChildMeasureSpec(this.g, v2, -2);
                boolean z2 = constraintWidget0.mMatchConstraintDefaultHeight == 1;
                if(basicMeasure$Measure0.measureStrategy == Measure.TRY_GIVEN_DIMENSIONS || basicMeasure$Measure0.measureStrategy == Measure.USE_GIVEN_DIMENSIONS) {
                    boolean z3 = view0.getMeasuredWidth() == constraintWidget0.getWidth();
                    if(basicMeasure$Measure0.measureStrategy == Measure.USE_GIVEN_DIMENSIONS || !z2 || z3 || view0 instanceof Placeholder || constraintWidget0.isResolvedVertically()) {
                        v5 = View.MeasureSpec.makeMeasureSpec(constraintWidget0.getHeight(), 0x40000000);
                    }
                }
                break;
            }
            default: {
                v5 = 0;
            }
        }
        ConstraintWidgetContainer constraintWidgetContainer0 = (ConstraintWidgetContainer)constraintWidget0.getParent();
        ConstraintLayout constraintLayout0 = this.h;
        if(constraintWidgetContainer0 != null && Optimizer.enabled(constraintLayout0.mOptimizationLevel, 0x100) && view0.getMeasuredWidth() == constraintWidget0.getWidth() && view0.getMeasuredWidth() < constraintWidgetContainer0.getWidth() && view0.getMeasuredHeight() == constraintWidget0.getHeight() && view0.getMeasuredHeight() < constraintWidgetContainer0.getHeight() && view0.getBaseline() == constraintWidget0.getBaselineDistance() && !constraintWidget0.isMeasureRequested() && d.a(constraintWidget0.getLastHorizontalMeasureSpec(), v4, constraintWidget0.getWidth()) && d.a(constraintWidget0.getLastVerticalMeasureSpec(), v5, constraintWidget0.getHeight())) {
            basicMeasure$Measure0.measuredWidth = constraintWidget0.getWidth();
            basicMeasure$Measure0.measuredHeight = constraintWidget0.getHeight();
            basicMeasure$Measure0.measuredBaseline = constraintWidget0.getBaselineDistance();
            return;
        }
        boolean z4 = constraintWidget$DimensionBehaviour0 == DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z5 = constraintWidget$DimensionBehaviour1 == DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z6 = constraintWidget$DimensionBehaviour1 == DimensionBehaviour.MATCH_PARENT || constraintWidget$DimensionBehaviour1 == DimensionBehaviour.FIXED;
        boolean z7 = constraintWidget$DimensionBehaviour0 == DimensionBehaviour.MATCH_PARENT || constraintWidget$DimensionBehaviour0 == DimensionBehaviour.FIXED;
        boolean z8 = z4 && constraintWidget0.mDimensionRatio > 0.0f;
        boolean z9 = z5 && constraintWidget0.mDimensionRatio > 0.0f;
        if(view0 == null) {
            return;
        }
        LayoutParams constraintLayout$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
        if(basicMeasure$Measure0.measureStrategy == Measure.TRY_GIVEN_DIMENSIONS || basicMeasure$Measure0.measureStrategy == Measure.USE_GIVEN_DIMENSIONS || !z4 || constraintWidget0.mMatchConstraintDefaultWidth != 0 || !z5 || constraintWidget0.mMatchConstraintDefaultHeight != 0) {
            if(!(view0 instanceof VirtualLayout) || !(constraintWidget0 instanceof androidx.constraintlayout.core.widgets.VirtualLayout)) {
                view0.measure(v4, v5);
            }
            else {
                ((VirtualLayout)view0).onMeasure(((androidx.constraintlayout.core.widgets.VirtualLayout)constraintWidget0), v4, v5);
            }
            constraintWidget0.setLastMeasureSpec(v4, v5);
            int v9 = view0.getMeasuredWidth();
            int v10 = view0.getMeasuredHeight();
            v7 = view0.getBaseline();
            v8 = constraintWidget0.mMatchConstraintMinWidth <= 0 ? v9 : Math.max(constraintWidget0.mMatchConstraintMinWidth, v9);
            int v11 = constraintWidget0.mMatchConstraintMaxWidth;
            if(v11 > 0) {
                v8 = Math.min(v11, v8);
            }
            int v12 = constraintWidget0.mMatchConstraintMinHeight;
            if(v12 > 0) {
                v6 = Math.max(v12, v10);
                v13 = v4;
            }
            else {
                v13 = v4;
                v6 = v10;
            }
            int v14 = constraintWidget0.mMatchConstraintMaxHeight;
            if(v14 > 0) {
                v6 = Math.min(v14, v6);
            }
            if(!Optimizer.enabled(constraintLayout0.mOptimizationLevel, 1)) {
                if(z8 && z6) {
                    v8 = (int)(((float)v6) * constraintWidget0.mDimensionRatio + 0.5f);
                }
                else if(z9 && z7) {
                    v6 = (int)(((float)v8) / constraintWidget0.mDimensionRatio + 0.5f);
                }
            }
            if(v9 != v8 || v10 != v6) {
                int v15 = v9 == v8 ? v13 : View.MeasureSpec.makeMeasureSpec(v8, 0x40000000);
                if(v10 != v6) {
                    v5 = View.MeasureSpec.makeMeasureSpec(v6, 0x40000000);
                }
                view0.measure(v15, v5);
                constraintWidget0.setLastMeasureSpec(v15, v5);
                v8 = view0.getMeasuredWidth();
                v6 = view0.getMeasuredHeight();
                v7 = view0.getBaseline();
            }
        }
        else {
            v6 = 0;
            v7 = 0;
            v8 = 0;
        }
        boolean z10 = v7 != -1;
        basicMeasure$Measure0.measuredNeedsSolverPass = v8 != basicMeasure$Measure0.horizontalDimension || v6 != basicMeasure$Measure0.verticalDimension;
        if(constraintLayout$LayoutParams0.needsBaseline) {
            z10 = true;
        }
        if(z10 && v7 != -1 && constraintWidget0.getBaselineDistance() != v7) {
            basicMeasure$Measure0.measuredNeedsSolverPass = true;
        }
        basicMeasure$Measure0.measuredWidth = v8;
        basicMeasure$Measure0.measuredHeight = v6;
        basicMeasure$Measure0.measuredHasBaseline = z10;
        basicMeasure$Measure0.measuredBaseline = v7;
    }
}

