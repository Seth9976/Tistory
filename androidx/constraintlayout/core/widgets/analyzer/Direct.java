package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.widgets.Barrier;
import androidx.constraintlayout.core.widgets.ChainHead;
import androidx.constraintlayout.core.widgets.ConstraintAnchor.Type;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Guideline;
import java.util.ArrayList;

public class Direct {
    public static final Measure a;

    static {
        Direct.a = new Measure();
    }

    public static boolean a(ConstraintWidget constraintWidget0) {
        DimensionBehaviour constraintWidget$DimensionBehaviour0 = constraintWidget0.getHorizontalDimensionBehaviour();
        DimensionBehaviour constraintWidget$DimensionBehaviour1 = constraintWidget0.getVerticalDimensionBehaviour();
        if(constraintWidget0.getParent() != null) {
            ConstraintWidgetContainer constraintWidgetContainer0 = (ConstraintWidgetContainer)constraintWidget0.getParent();
        }
        boolean z = constraintWidget$DimensionBehaviour0 == DimensionBehaviour.FIXED || constraintWidget0.isResolvedHorizontally() || constraintWidget$DimensionBehaviour0 == DimensionBehaviour.WRAP_CONTENT || (constraintWidget$DimensionBehaviour0 == DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget0.mMatchConstraintDefaultWidth == 0 && constraintWidget0.mDimensionRatio == 0.0f && constraintWidget0.hasDanglingDimension(0) || constraintWidget$DimensionBehaviour0 == DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget0.mMatchConstraintDefaultWidth == 1 && constraintWidget0.hasResolvedTargets(0, constraintWidget0.getWidth()));
        boolean z1 = constraintWidget$DimensionBehaviour1 == DimensionBehaviour.FIXED || constraintWidget0.isResolvedVertically() || constraintWidget$DimensionBehaviour1 == DimensionBehaviour.WRAP_CONTENT || (constraintWidget$DimensionBehaviour1 == DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget0.mMatchConstraintDefaultHeight == 0 && constraintWidget0.mDimensionRatio == 0.0f && constraintWidget0.hasDanglingDimension(1) || constraintWidget$DimensionBehaviour1 == DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget0.mMatchConstraintDefaultHeight == 1 && constraintWidget0.hasResolvedTargets(1, constraintWidget0.getHeight()));
        return constraintWidget0.mDimensionRatio <= 0.0f || !z && !z1 ? z && z1 : true;
    }

    public static void b(int v, ConstraintWidget constraintWidget0, Measurer basicMeasure$Measurer0, boolean z) {
        boolean z4;
        boolean z2;
        if(constraintWidget0.isHorizontalSolvingPassDone()) {
            return;
        }
        if(!(constraintWidget0 instanceof ConstraintWidgetContainer) && constraintWidget0.isMeasureRequested() && Direct.a(constraintWidget0)) {
            ConstraintWidgetContainer.measure(v + 1, constraintWidget0, basicMeasure$Measurer0, new Measure(), Measure.SELF_DIMENSIONS);
        }
        ConstraintAnchor constraintAnchor0 = constraintWidget0.getAnchor(Type.LEFT);
        ConstraintAnchor constraintAnchor1 = constraintWidget0.getAnchor(Type.RIGHT);
        int v1 = constraintAnchor0.getFinalValue();
        int v2 = constraintAnchor1.getFinalValue();
        if(constraintAnchor0.getDependents() != null && constraintAnchor0.hasFinalValue()) {
            for(Object object0: constraintAnchor0.getDependents()) {
                ConstraintAnchor constraintAnchor2 = (ConstraintAnchor)object0;
                ConstraintWidget constraintWidget1 = constraintAnchor2.mOwner;
                boolean z1 = Direct.a(constraintWidget1);
                if(constraintWidget1.isMeasureRequested() && z1) {
                    ConstraintWidgetContainer.measure(v + 1, constraintWidget1, basicMeasure$Measurer0, new Measure(), Measure.SELF_DIMENSIONS);
                }
                if(constraintAnchor2 == constraintWidget1.mLeft) {
                    ConstraintAnchor constraintAnchor3 = constraintWidget1.mRight.mTarget;
                    if(constraintAnchor3 != null && constraintAnchor3.hasFinalValue()) {
                        z2 = true;
                    }
                }
                else {
                    if(constraintAnchor2 == constraintWidget1.mRight) {
                        ConstraintAnchor constraintAnchor4 = constraintWidget1.mLeft.mTarget;
                        if(constraintAnchor4 != null && constraintAnchor4.hasFinalValue()) {
                            z2 = true;
                            goto label_28;
                        }
                    }
                    z2 = false;
                }
            label_28:
                DimensionBehaviour constraintWidget$DimensionBehaviour0 = DimensionBehaviour.MATCH_CONSTRAINT;
                if(constraintWidget1.getHorizontalDimensionBehaviour() == constraintWidget$DimensionBehaviour0 && !z1) {
                    if(constraintWidget1.getHorizontalDimensionBehaviour() != constraintWidget$DimensionBehaviour0 || constraintWidget1.mMatchConstraintMaxWidth < 0 || constraintWidget1.mMatchConstraintMinWidth < 0 || constraintWidget1.getVisibility() != 8 && (constraintWidget1.mMatchConstraintDefaultWidth != 0 || constraintWidget1.getDimensionRatio() != 0.0f) || constraintWidget1.isInHorizontalChain() || constraintWidget1.isInVirtualLayout() || !z2 || constraintWidget1.isInHorizontalChain()) {
                        continue;
                    }
                    Direct.d(v + 1, constraintWidget0, basicMeasure$Measurer0, constraintWidget1, z);
                }
                else if(!constraintWidget1.isMeasureRequested()) {
                    ConstraintAnchor constraintAnchor5 = constraintWidget1.mLeft;
                    if(constraintAnchor2 == constraintAnchor5 && constraintWidget1.mRight.mTarget == null) {
                        int v3 = constraintAnchor5.getMargin();
                        constraintWidget1.setFinalHorizontal(v3 + v1, constraintWidget1.getWidth() + (v3 + v1));
                        Direct.b(v + 1, constraintWidget1, basicMeasure$Measurer0, z);
                    }
                    else {
                        ConstraintAnchor constraintAnchor6 = constraintWidget1.mRight;
                        if(constraintAnchor2 == constraintAnchor6 && constraintAnchor5.mTarget == null) {
                            int v4 = constraintAnchor6.getMargin();
                            constraintWidget1.setFinalHorizontal(v1 - v4 - constraintWidget1.getWidth(), v1 - v4);
                            Direct.b(v + 1, constraintWidget1, basicMeasure$Measurer0, z);
                        }
                        else if(z2 && !constraintWidget1.isInHorizontalChain()) {
                            Direct.c(v + 1, constraintWidget1, basicMeasure$Measurer0, z);
                        }
                    }
                }
            }
        }
        if(constraintWidget0 instanceof Guideline) {
            return;
        }
        if(constraintAnchor1.getDependents() != null && constraintAnchor1.hasFinalValue()) {
            for(Object object1: constraintAnchor1.getDependents()) {
                ConstraintAnchor constraintAnchor7 = (ConstraintAnchor)object1;
                ConstraintWidget constraintWidget2 = constraintAnchor7.mOwner;
                boolean z3 = Direct.a(constraintWidget2);
                if(constraintWidget2.isMeasureRequested() && z3) {
                    ConstraintWidgetContainer.measure(v + 1, constraintWidget2, basicMeasure$Measurer0, new Measure(), Measure.SELF_DIMENSIONS);
                }
                if(constraintAnchor7 == constraintWidget2.mLeft) {
                    ConstraintAnchor constraintAnchor8 = constraintWidget2.mRight.mTarget;
                    if(constraintAnchor8 != null && constraintAnchor8.hasFinalValue()) {
                        z4 = true;
                    }
                }
                else {
                    if(constraintAnchor7 == constraintWidget2.mRight) {
                        ConstraintAnchor constraintAnchor9 = constraintWidget2.mLeft.mTarget;
                        if(constraintAnchor9 != null && constraintAnchor9.hasFinalValue()) {
                            z4 = true;
                            goto label_71;
                        }
                    }
                    z4 = false;
                }
            label_71:
                DimensionBehaviour constraintWidget$DimensionBehaviour1 = DimensionBehaviour.MATCH_CONSTRAINT;
                if(constraintWidget2.getHorizontalDimensionBehaviour() == constraintWidget$DimensionBehaviour1 && !z3) {
                    if(constraintWidget2.getHorizontalDimensionBehaviour() != constraintWidget$DimensionBehaviour1 || constraintWidget2.mMatchConstraintMaxWidth < 0 || constraintWidget2.mMatchConstraintMinWidth < 0 || constraintWidget2.getVisibility() != 8 && (constraintWidget2.mMatchConstraintDefaultWidth != 0 || constraintWidget2.getDimensionRatio() != 0.0f) || constraintWidget2.isInHorizontalChain() || constraintWidget2.isInVirtualLayout() || !z4 || constraintWidget2.isInHorizontalChain()) {
                        continue;
                    }
                    Direct.d(v + 1, constraintWidget0, basicMeasure$Measurer0, constraintWidget2, z);
                }
                else if(!constraintWidget2.isMeasureRequested()) {
                    ConstraintAnchor constraintAnchor10 = constraintWidget2.mLeft;
                    if(constraintAnchor7 == constraintAnchor10 && constraintWidget2.mRight.mTarget == null) {
                        int v5 = constraintAnchor10.getMargin();
                        constraintWidget2.setFinalHorizontal(v5 + v2, constraintWidget2.getWidth() + (v5 + v2));
                        Direct.b(v + 1, constraintWidget2, basicMeasure$Measurer0, z);
                    }
                    else {
                        ConstraintAnchor constraintAnchor11 = constraintWidget2.mRight;
                        if(constraintAnchor7 == constraintAnchor11 && constraintAnchor10.mTarget == null) {
                            int v6 = constraintAnchor11.getMargin();
                            constraintWidget2.setFinalHorizontal(v2 - v6 - constraintWidget2.getWidth(), v2 - v6);
                            Direct.b(v + 1, constraintWidget2, basicMeasure$Measurer0, z);
                        }
                        else if(z4 && !constraintWidget2.isInHorizontalChain()) {
                            Direct.c(v + 1, constraintWidget2, basicMeasure$Measurer0, z);
                        }
                    }
                }
            }
        }
        constraintWidget0.markHorizontalSolvingPassDone();
    }

    public static void c(int v, ConstraintWidget constraintWidget0, Measurer basicMeasure$Measurer0, boolean z) {
        float f = constraintWidget0.getHorizontalBiasPercent();
        int v1 = constraintWidget0.mLeft.mTarget.getFinalValue();
        int v2 = constraintWidget0.mRight.mTarget.getFinalValue();
        int v3 = constraintWidget0.mLeft.getMargin();
        int v4 = constraintWidget0.mRight.getMargin();
        if(v1 == v2) {
            f = 0.5f;
        }
        else {
            v1 = v3 + v1;
            v2 -= v4;
        }
        int v5 = constraintWidget0.getWidth();
        int v6 = v1 <= v2 ? v2 - v1 - v5 : v1 - v2 - v5;
        int v7 = ((int)(v6 <= 0 ? f * ((float)v6) : f * ((float)v6) + 0.5f)) + v1;
        constraintWidget0.setFinalHorizontal(v7, (v1 <= v2 ? v7 + v5 : v7 - v5));
        Direct.b(v + 1, constraintWidget0, basicMeasure$Measurer0, z);
    }

    public static void d(int v, ConstraintWidget constraintWidget0, Measurer basicMeasure$Measurer0, ConstraintWidget constraintWidget1, boolean z) {
        float f = constraintWidget1.getHorizontalBiasPercent();
        int v1 = constraintWidget1.mLeft.mTarget.getFinalValue();
        int v2 = constraintWidget1.mLeft.getMargin() + v1;
        int v3 = constraintWidget1.mRight.mTarget.getFinalValue() - constraintWidget1.mRight.getMargin();
        if(v3 >= v2) {
            int v4 = constraintWidget1.getWidth();
            if(constraintWidget1.getVisibility() != 8) {
                int v5 = constraintWidget1.mMatchConstraintDefaultWidth;
                if(v5 == 2) {
                    v4 = (int)(constraintWidget1.getHorizontalBiasPercent() * 0.5f * ((float)(constraintWidget0 instanceof ConstraintWidgetContainer ? constraintWidget0.getWidth() : constraintWidget0.getParent().getWidth())));
                }
                else if(v5 == 0) {
                    v4 = v3 - v2;
                }
                v4 = Math.max(constraintWidget1.mMatchConstraintMinWidth, v4);
                int v6 = constraintWidget1.mMatchConstraintMaxWidth;
                if(v6 > 0) {
                    v4 = Math.min(v6, v4);
                }
            }
            int v7 = v2 + ((int)(f * ((float)(v3 - v2 - v4)) + 0.5f));
            constraintWidget1.setFinalHorizontal(v7, v4 + v7);
            Direct.b(v + 1, constraintWidget1, basicMeasure$Measurer0, z);
        }
    }

    public static void e(int v, ConstraintWidget constraintWidget0, Measurer basicMeasure$Measurer0) {
        float f = constraintWidget0.getVerticalBiasPercent();
        int v1 = constraintWidget0.mTop.mTarget.getFinalValue();
        int v2 = constraintWidget0.mBottom.mTarget.getFinalValue();
        int v3 = constraintWidget0.mTop.getMargin();
        int v4 = constraintWidget0.mBottom.getMargin();
        if(v1 == v2) {
            f = 0.5f;
        }
        else {
            v1 = v3 + v1;
            v2 -= v4;
        }
        int v5 = constraintWidget0.getHeight();
        int v6 = v1 <= v2 ? v2 - v1 - v5 : v1 - v2 - v5;
        float f1 = v6 <= 0 ? f * ((float)v6) : f * ((float)v6) + 0.5f;
        int v7 = v1 + ((int)f1);
        int v8 = v7 + v5;
        if(v1 > v2) {
            v7 = v1 - ((int)f1);
            v8 = v7 - v5;
        }
        constraintWidget0.setFinalVertical(v7, v8);
        Direct.g(v + 1, constraintWidget0, basicMeasure$Measurer0);
    }

    public static void f(int v, ConstraintWidget constraintWidget0, Measurer basicMeasure$Measurer0, ConstraintWidget constraintWidget1) {
        float f = constraintWidget1.getVerticalBiasPercent();
        int v1 = constraintWidget1.mTop.mTarget.getFinalValue();
        int v2 = constraintWidget1.mTop.getMargin() + v1;
        int v3 = constraintWidget1.mBottom.mTarget.getFinalValue() - constraintWidget1.mBottom.getMargin();
        if(v3 >= v2) {
            int v4 = constraintWidget1.getHeight();
            if(constraintWidget1.getVisibility() != 8) {
                int v5 = constraintWidget1.mMatchConstraintDefaultHeight;
                if(v5 == 2) {
                    v4 = (int)(f * 0.5f * ((float)(constraintWidget0 instanceof ConstraintWidgetContainer ? constraintWidget0.getHeight() : constraintWidget0.getParent().getHeight())));
                }
                else if(v5 == 0) {
                    v4 = v3 - v2;
                }
                v4 = Math.max(constraintWidget1.mMatchConstraintMinHeight, v4);
                int v6 = constraintWidget1.mMatchConstraintMaxHeight;
                if(v6 > 0) {
                    v4 = Math.min(v6, v4);
                }
            }
            int v7 = v2 + ((int)(f * ((float)(v3 - v2 - v4)) + 0.5f));
            constraintWidget1.setFinalVertical(v7, v4 + v7);
            Direct.g(v + 1, constraintWidget1, basicMeasure$Measurer0);
        }
    }

    public static void g(int v, ConstraintWidget constraintWidget0, Measurer basicMeasure$Measurer0) {
        boolean z3;
        boolean z1;
        if(constraintWidget0.isVerticalSolvingPassDone()) {
            return;
        }
        if(!(constraintWidget0 instanceof ConstraintWidgetContainer) && constraintWidget0.isMeasureRequested() && Direct.a(constraintWidget0)) {
            ConstraintWidgetContainer.measure(v + 1, constraintWidget0, basicMeasure$Measurer0, new Measure(), Measure.SELF_DIMENSIONS);
        }
        ConstraintAnchor constraintAnchor0 = constraintWidget0.getAnchor(Type.TOP);
        ConstraintAnchor constraintAnchor1 = constraintWidget0.getAnchor(Type.BOTTOM);
        int v1 = constraintAnchor0.getFinalValue();
        int v2 = constraintAnchor1.getFinalValue();
        if(constraintAnchor0.getDependents() != null && constraintAnchor0.hasFinalValue()) {
            for(Object object0: constraintAnchor0.getDependents()) {
                ConstraintAnchor constraintAnchor2 = (ConstraintAnchor)object0;
                ConstraintWidget constraintWidget1 = constraintAnchor2.mOwner;
                boolean z = Direct.a(constraintWidget1);
                if(constraintWidget1.isMeasureRequested() && z) {
                    ConstraintWidgetContainer.measure(v + 1, constraintWidget1, basicMeasure$Measurer0, new Measure(), Measure.SELF_DIMENSIONS);
                }
                if(constraintAnchor2 == constraintWidget1.mTop) {
                    ConstraintAnchor constraintAnchor3 = constraintWidget1.mBottom.mTarget;
                    if(constraintAnchor3 != null && constraintAnchor3.hasFinalValue()) {
                        z1 = true;
                    }
                }
                else {
                    if(constraintAnchor2 == constraintWidget1.mBottom) {
                        ConstraintAnchor constraintAnchor4 = constraintWidget1.mTop.mTarget;
                        if(constraintAnchor4 != null && constraintAnchor4.hasFinalValue()) {
                            z1 = true;
                            goto label_28;
                        }
                    }
                    z1 = false;
                }
            label_28:
                DimensionBehaviour constraintWidget$DimensionBehaviour0 = DimensionBehaviour.MATCH_CONSTRAINT;
                if(constraintWidget1.getVerticalDimensionBehaviour() == constraintWidget$DimensionBehaviour0 && !z) {
                    if(constraintWidget1.getVerticalDimensionBehaviour() != constraintWidget$DimensionBehaviour0 || constraintWidget1.mMatchConstraintMaxHeight < 0 || constraintWidget1.mMatchConstraintMinHeight < 0 || constraintWidget1.getVisibility() != 8 && (constraintWidget1.mMatchConstraintDefaultHeight != 0 || constraintWidget1.getDimensionRatio() != 0.0f) || constraintWidget1.isInVerticalChain() || constraintWidget1.isInVirtualLayout() || !z1 || constraintWidget1.isInVerticalChain()) {
                        continue;
                    }
                    Direct.f(v + 1, constraintWidget0, basicMeasure$Measurer0, constraintWidget1);
                }
                else if(!constraintWidget1.isMeasureRequested()) {
                    ConstraintAnchor constraintAnchor5 = constraintWidget1.mTop;
                    if(constraintAnchor2 == constraintAnchor5 && constraintWidget1.mBottom.mTarget == null) {
                        int v3 = constraintAnchor5.getMargin();
                        constraintWidget1.setFinalVertical(v3 + v1, constraintWidget1.getHeight() + (v3 + v1));
                        Direct.g(v + 1, constraintWidget1, basicMeasure$Measurer0);
                    }
                    else {
                        ConstraintAnchor constraintAnchor6 = constraintWidget1.mBottom;
                        if(constraintAnchor2 == constraintAnchor6 && constraintAnchor5.mTarget == null) {
                            int v4 = constraintAnchor6.getMargin();
                            constraintWidget1.setFinalVertical(v1 - v4 - constraintWidget1.getHeight(), v1 - v4);
                            Direct.g(v + 1, constraintWidget1, basicMeasure$Measurer0);
                        }
                        else if(z1 && !constraintWidget1.isInVerticalChain()) {
                            Direct.e(v + 1, constraintWidget1, basicMeasure$Measurer0);
                        }
                    }
                }
            }
        }
        if(constraintWidget0 instanceof Guideline) {
            return;
        }
        if(constraintAnchor1.getDependents() != null && constraintAnchor1.hasFinalValue()) {
            for(Object object1: constraintAnchor1.getDependents()) {
                ConstraintAnchor constraintAnchor7 = (ConstraintAnchor)object1;
                ConstraintWidget constraintWidget2 = constraintAnchor7.mOwner;
                boolean z2 = Direct.a(constraintWidget2);
                if(constraintWidget2.isMeasureRequested() && z2) {
                    ConstraintWidgetContainer.measure(v + 1, constraintWidget2, basicMeasure$Measurer0, new Measure(), Measure.SELF_DIMENSIONS);
                }
                if(constraintAnchor7 == constraintWidget2.mTop) {
                    ConstraintAnchor constraintAnchor8 = constraintWidget2.mBottom.mTarget;
                    if(constraintAnchor8 != null && constraintAnchor8.hasFinalValue()) {
                        z3 = true;
                    }
                }
                else {
                    if(constraintAnchor7 == constraintWidget2.mBottom) {
                        ConstraintAnchor constraintAnchor9 = constraintWidget2.mTop.mTarget;
                        if(constraintAnchor9 != null && constraintAnchor9.hasFinalValue()) {
                            z3 = true;
                            goto label_71;
                        }
                    }
                    z3 = false;
                }
            label_71:
                DimensionBehaviour constraintWidget$DimensionBehaviour1 = DimensionBehaviour.MATCH_CONSTRAINT;
                if(constraintWidget2.getVerticalDimensionBehaviour() == constraintWidget$DimensionBehaviour1 && !z2) {
                    if(constraintWidget2.getVerticalDimensionBehaviour() != constraintWidget$DimensionBehaviour1 || constraintWidget2.mMatchConstraintMaxHeight < 0 || constraintWidget2.mMatchConstraintMinHeight < 0 || constraintWidget2.getVisibility() != 8 && (constraintWidget2.mMatchConstraintDefaultHeight != 0 || constraintWidget2.getDimensionRatio() != 0.0f) || constraintWidget2.isInVerticalChain() || constraintWidget2.isInVirtualLayout() || !z3 || constraintWidget2.isInVerticalChain()) {
                        continue;
                    }
                    Direct.f(v + 1, constraintWidget0, basicMeasure$Measurer0, constraintWidget2);
                }
                else if(!constraintWidget2.isMeasureRequested()) {
                    ConstraintAnchor constraintAnchor10 = constraintWidget2.mTop;
                    if(constraintAnchor7 == constraintAnchor10 && constraintWidget2.mBottom.mTarget == null) {
                        int v5 = constraintAnchor10.getMargin();
                        constraintWidget2.setFinalVertical(v5 + v2, constraintWidget2.getHeight() + (v5 + v2));
                        Direct.g(v + 1, constraintWidget2, basicMeasure$Measurer0);
                    }
                    else {
                        ConstraintAnchor constraintAnchor11 = constraintWidget2.mBottom;
                        if(constraintAnchor7 == constraintAnchor11 && constraintAnchor10.mTarget == null) {
                            int v6 = constraintAnchor11.getMargin();
                            constraintWidget2.setFinalVertical(v2 - v6 - constraintWidget2.getHeight(), v2 - v6);
                            Direct.g(v + 1, constraintWidget2, basicMeasure$Measurer0);
                        }
                        else if(z3 && !constraintWidget2.isInVerticalChain()) {
                            Direct.e(v + 1, constraintWidget2, basicMeasure$Measurer0);
                        }
                    }
                }
            }
        }
        ConstraintAnchor constraintAnchor12 = constraintWidget0.getAnchor(Type.BASELINE);
        if(constraintAnchor12.getDependents() != null && constraintAnchor12.hasFinalValue()) {
            int v7 = constraintAnchor12.getFinalValue();
            for(Object object2: constraintAnchor12.getDependents()) {
                ConstraintAnchor constraintAnchor13 = (ConstraintAnchor)object2;
                ConstraintWidget constraintWidget3 = constraintAnchor13.mOwner;
                boolean z4 = Direct.a(constraintWidget3);
                if(constraintWidget3.isMeasureRequested() && z4) {
                    ConstraintWidgetContainer.measure(v + 1, constraintWidget3, basicMeasure$Measurer0, new Measure(), Measure.SELF_DIMENSIONS);
                }
                if((constraintWidget3.getVerticalDimensionBehaviour() != DimensionBehaviour.MATCH_CONSTRAINT || z4) && !constraintWidget3.isMeasureRequested() && constraintAnchor13 == constraintWidget3.mBaseline) {
                    constraintWidget3.setFinalBaseline(constraintAnchor13.getMargin() + v7);
                    Direct.g(v + 1, constraintWidget3, basicMeasure$Measurer0);
                }
            }
        }
        constraintWidget0.markVerticalSolvingPassDone();
    }

    public static String ls(int v) {
        StringBuilder stringBuilder0 = new StringBuilder();
        for(int v1 = 0; v1 < v; ++v1) {
            stringBuilder0.append("  ");
        }
        stringBuilder0.append("+-(" + v + ") ");
        return stringBuilder0.toString();
    }

    // This method was un-flattened
    public static boolean solveChain(ConstraintWidgetContainer constraintWidgetContainer0, LinearSystem linearSystem0, int v, int v1, ChainHead chainHead0, boolean z, boolean z1, boolean z2) {
        ConstraintWidget constraintWidget8;
        int v15;
        if(z2) {
            return false;
        }
        if(v == 0) {
            if(!constraintWidgetContainer0.isResolvedHorizontally()) {
                return false;
            }
        }
        else if(!constraintWidgetContainer0.isResolvedVertically()) {
            return false;
        }
        boolean z3 = constraintWidgetContainer0.isRtl();
        ConstraintWidget constraintWidget0 = chainHead0.getFirst();
        ConstraintWidget constraintWidget1 = chainHead0.getFirstVisibleWidget();
        ConstraintWidget constraintWidget2 = chainHead0.getLastVisibleWidget();
        ConstraintWidget constraintWidget3 = chainHead0.getHead();
        ConstraintAnchor constraintAnchor0 = constraintWidget0.mListAnchors[v1];
        ConstraintAnchor constraintAnchor1 = chainHead0.getLast().mListAnchors[v1 + 1];
        if(constraintAnchor0.mTarget != null && constraintAnchor1.mTarget != null && constraintAnchor0.mTarget.hasFinalValue() && constraintAnchor1.mTarget.hasFinalValue() && constraintWidget1 != null && constraintWidget2 != null) {
            int v2 = constraintAnchor0.mTarget.getFinalValue();
            int v3 = constraintWidget1.mListAnchors[v1].getMargin() + v2;
            int v4 = constraintAnchor1.mTarget.getFinalValue() - constraintWidget2.mListAnchors[v1 + 1].getMargin();
            int v5 = v4 - v3;
            if(v5 <= 0) {
                return false;
            }
            Measure basicMeasure$Measure0 = new Measure();
            int v6 = 0;
            int v7 = 0;
            int v8 = 0;
            ConstraintWidget constraintWidget4 = constraintWidget0;
            for(ConstraintWidget constraintWidget5 = null; true; constraintWidget5 = null) {
                if(!Direct.a(constraintWidget4)) {
                    return false;
                }
                if(constraintWidget4.mListDimensionBehaviors[v] == DimensionBehaviour.MATCH_CONSTRAINT) {
                    return false;
                }
                if(constraintWidget4.isMeasureRequested()) {
                    ConstraintWidgetContainer.measure(1, constraintWidget4, constraintWidgetContainer0.getMeasurer(), basicMeasure$Measure0, Measure.SELF_DIMENSIONS);
                }
                int v9 = constraintWidget4.mListAnchors[v1].getMargin();
                int v10 = v == 0 ? constraintWidget4.getWidth() : constraintWidget4.getHeight();
                v8 = constraintWidget4.mListAnchors[v1 + 1].getMargin() + (v10 + (v9 + v8));
                ++v7;
                if(constraintWidget4.getVisibility() != 8) {
                    ++v6;
                }
                ConstraintAnchor constraintAnchor2 = constraintWidget4.mListAnchors[v1 + 1].mTarget;
                if(constraintAnchor2 != null) {
                    ConstraintWidget constraintWidget6 = constraintAnchor2.mOwner;
                    ConstraintAnchor constraintAnchor3 = constraintWidget6.mListAnchors[v1].mTarget;
                    if(constraintAnchor3 != null && constraintAnchor3.mOwner == constraintWidget4) {
                        constraintWidget5 = constraintWidget6;
                    }
                }
                if(constraintWidget5 == null) {
                    break;
                }
                constraintWidget4 = constraintWidget5;
            }
            if(v6 == 0) {
                return false;
            }
            if(v6 != v7) {
                return false;
            }
            if(v5 < v8) {
                return false;
            }
            int v11 = v5 - v8;
            if(z) {
                v11 /= v6 + 1;
            }
            else if(z1 && v6 > 2) {
                v11 = v11 / v6 - 1;
            }
            if(v6 == 1) {
                int v12 = (int)(((float)v11) * (v == 0 ? constraintWidget3.getHorizontalBiasPercent() : constraintWidget3.getVerticalBiasPercent()) + (((float)v3) + 0.5f));
                if(v == 0) {
                    constraintWidget1.setFinalHorizontal(v12, constraintWidget1.getWidth() + v12);
                }
                else {
                    constraintWidget1.setFinalVertical(v12, constraintWidget1.getHeight() + v12);
                }
                Direct.b(1, constraintWidget1, constraintWidgetContainer0.getMeasurer(), z3);
                return true;
            }
            if(z) {
                int v13 = v3 + v11;
                ConstraintWidget constraintWidget7 = constraintWidget0;
                boolean z4 = false;
                while(!z4) {
                    if(constraintWidget7.getVisibility() != 8) {
                        int v14 = constraintWidget7.mListAnchors[v1].getMargin() + v13;
                        if(v == 0) {
                            constraintWidget7.setFinalHorizontal(v14, constraintWidget7.getWidth() + v14);
                            Direct.b(1, constraintWidget7, constraintWidgetContainer0.getMeasurer(), z3);
                            v15 = constraintWidget7.getWidth();
                        }
                        else {
                            constraintWidget7.setFinalVertical(v14, constraintWidget7.getHeight() + v14);
                            Direct.g(1, constraintWidget7, constraintWidgetContainer0.getMeasurer());
                            v15 = constraintWidget7.getHeight();
                        }
                        v13 = constraintWidget7.mListAnchors[v1 + 1].getMargin() + (v15 + v14) + v11;
                    }
                    else if(v == 0) {
                        constraintWidget7.setFinalHorizontal(v13, v13);
                        Direct.b(1, constraintWidget7, constraintWidgetContainer0.getMeasurer(), z3);
                    }
                    else {
                        constraintWidget7.setFinalVertical(v13, v13);
                        Direct.g(1, constraintWidget7, constraintWidgetContainer0.getMeasurer());
                    }
                    constraintWidget7.addToSolver(linearSystem0, false);
                    ConstraintAnchor constraintAnchor4 = constraintWidget7.mListAnchors[v1 + 1].mTarget;
                    if(constraintAnchor4 == null) {
                        constraintWidget8 = null;
                    }
                    else {
                        constraintWidget8 = constraintAnchor4.mOwner;
                        ConstraintAnchor constraintAnchor5 = constraintWidget8.mListAnchors[v1].mTarget;
                        if(constraintAnchor5 == null || constraintAnchor5.mOwner != constraintWidget7) {
                            constraintWidget8 = null;
                        }
                    }
                    if(constraintWidget8 == null) {
                        z4 = true;
                    }
                    else {
                        constraintWidget7 = constraintWidget8;
                    }
                }
                return true;
            }
            if(z1) {
                if(v6 == 2) {
                    if(v == 0) {
                        constraintWidget1.setFinalHorizontal(v3, constraintWidget1.getWidth() + v3);
                        constraintWidget2.setFinalHorizontal(v4 - constraintWidget2.getWidth(), v4);
                        Direct.b(1, constraintWidget1, constraintWidgetContainer0.getMeasurer(), z3);
                        Direct.b(1, constraintWidget2, constraintWidgetContainer0.getMeasurer(), z3);
                        return true;
                    }
                    constraintWidget1.setFinalVertical(v3, constraintWidget1.getHeight() + v3);
                    constraintWidget2.setFinalVertical(v4 - constraintWidget2.getHeight(), v4);
                    Direct.g(1, constraintWidget1, constraintWidgetContainer0.getMeasurer());
                    Direct.g(1, constraintWidget2, constraintWidgetContainer0.getMeasurer());
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static void solvingPass(ConstraintWidgetContainer constraintWidgetContainer0, Measurer basicMeasure$Measurer0) {
        DimensionBehaviour constraintWidget$DimensionBehaviour0 = constraintWidgetContainer0.getHorizontalDimensionBehaviour();
        DimensionBehaviour constraintWidget$DimensionBehaviour1 = constraintWidgetContainer0.getVerticalDimensionBehaviour();
        constraintWidgetContainer0.resetFinalResolution();
        ArrayList arrayList0 = constraintWidgetContainer0.getChildren();
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((ConstraintWidget)arrayList0.get(v1)).resetFinalResolution();
        }
        boolean z = constraintWidgetContainer0.isRtl();
        if(constraintWidget$DimensionBehaviour0 == DimensionBehaviour.FIXED) {
            constraintWidgetContainer0.setFinalHorizontal(0, constraintWidgetContainer0.getWidth());
        }
        else {
            constraintWidgetContainer0.setFinalLeft(0);
        }
        boolean z1 = false;
        boolean z2 = false;
        for(int v2 = 0; v2 < v; ++v2) {
            ConstraintWidget constraintWidget0 = (ConstraintWidget)arrayList0.get(v2);
            if(!(constraintWidget0 instanceof Guideline)) {
                if(constraintWidget0 instanceof Barrier && ((Barrier)constraintWidget0).getOrientation() == 0) {
                    z2 = true;
                }
            }
            else if(((Guideline)constraintWidget0).getOrientation() == 1) {
                if(((Guideline)constraintWidget0).getRelativeBegin() != -1) {
                    ((Guideline)constraintWidget0).setFinalValue(((Guideline)constraintWidget0).getRelativeBegin());
                }
                else if(((Guideline)constraintWidget0).getRelativeEnd() != -1 && constraintWidgetContainer0.isResolvedHorizontally()) {
                    ((Guideline)constraintWidget0).setFinalValue(constraintWidgetContainer0.getWidth() - ((Guideline)constraintWidget0).getRelativeEnd());
                }
                else if(constraintWidgetContainer0.isResolvedHorizontally()) {
                    ((Guideline)constraintWidget0).setFinalValue(((int)(((Guideline)constraintWidget0).getRelativePercent() * ((float)constraintWidgetContainer0.getWidth()) + 0.5f)));
                }
                z1 = true;
            }
        }
        if(z1) {
            for(int v3 = 0; v3 < v; ++v3) {
                ConstraintWidget constraintWidget1 = (ConstraintWidget)arrayList0.get(v3);
                if(constraintWidget1 instanceof Guideline && ((Guideline)constraintWidget1).getOrientation() == 1) {
                    Direct.b(0, ((Guideline)constraintWidget1), basicMeasure$Measurer0, z);
                }
            }
        }
        Direct.b(0, constraintWidgetContainer0, basicMeasure$Measurer0, z);
        if(z2) {
            for(int v4 = 0; v4 < v; ++v4) {
                ConstraintWidget constraintWidget2 = (ConstraintWidget)arrayList0.get(v4);
                if(constraintWidget2 instanceof Barrier && ((Barrier)constraintWidget2).getOrientation() == 0 && ((Barrier)constraintWidget2).allSolved()) {
                    Direct.b(1, ((Barrier)constraintWidget2), basicMeasure$Measurer0, z);
                }
            }
        }
        if(constraintWidget$DimensionBehaviour1 == DimensionBehaviour.FIXED) {
            constraintWidgetContainer0.setFinalVertical(0, constraintWidgetContainer0.getHeight());
        }
        else {
            constraintWidgetContainer0.setFinalTop(0);
        }
        boolean z3 = false;
        boolean z4 = false;
        for(int v5 = 0; v5 < v; ++v5) {
            ConstraintWidget constraintWidget3 = (ConstraintWidget)arrayList0.get(v5);
            if(!(constraintWidget3 instanceof Guideline)) {
                if(constraintWidget3 instanceof Barrier && ((Barrier)constraintWidget3).getOrientation() == 1) {
                    z4 = true;
                }
            }
            else if(((Guideline)constraintWidget3).getOrientation() == 0) {
                if(((Guideline)constraintWidget3).getRelativeBegin() != -1) {
                    ((Guideline)constraintWidget3).setFinalValue(((Guideline)constraintWidget3).getRelativeBegin());
                }
                else if(((Guideline)constraintWidget3).getRelativeEnd() != -1 && constraintWidgetContainer0.isResolvedVertically()) {
                    ((Guideline)constraintWidget3).setFinalValue(constraintWidgetContainer0.getHeight() - ((Guideline)constraintWidget3).getRelativeEnd());
                }
                else if(constraintWidgetContainer0.isResolvedVertically()) {
                    ((Guideline)constraintWidget3).setFinalValue(((int)(((Guideline)constraintWidget3).getRelativePercent() * ((float)constraintWidgetContainer0.getHeight()) + 0.5f)));
                }
                z3 = true;
            }
        }
        if(z3) {
            for(int v6 = 0; v6 < v; ++v6) {
                ConstraintWidget constraintWidget4 = (ConstraintWidget)arrayList0.get(v6);
                if(constraintWidget4 instanceof Guideline && ((Guideline)constraintWidget4).getOrientation() == 0) {
                    Direct.g(1, ((Guideline)constraintWidget4), basicMeasure$Measurer0);
                }
            }
        }
        Direct.g(0, constraintWidgetContainer0, basicMeasure$Measurer0);
        if(z4) {
            for(int v7 = 0; v7 < v; ++v7) {
                ConstraintWidget constraintWidget5 = (ConstraintWidget)arrayList0.get(v7);
                if(constraintWidget5 instanceof Barrier && ((Barrier)constraintWidget5).getOrientation() == 1 && ((Barrier)constraintWidget5).allSolved()) {
                    Direct.g(1, ((Barrier)constraintWidget5), basicMeasure$Measurer0);
                }
            }
        }
        for(int v8 = 0; v8 < v; ++v8) {
            ConstraintWidget constraintWidget6 = (ConstraintWidget)arrayList0.get(v8);
            if(constraintWidget6.isMeasureRequested() && Direct.a(constraintWidget6)) {
                ConstraintWidgetContainer.measure(0, constraintWidget6, basicMeasure$Measurer0, Direct.a, Measure.SELF_DIMENSIONS);
                if(!(constraintWidget6 instanceof Guideline)) {
                    Direct.b(0, constraintWidget6, basicMeasure$Measurer0, z);
                    Direct.g(0, constraintWidget6, basicMeasure$Measurer0);
                }
                else if(((Guideline)constraintWidget6).getOrientation() == 0) {
                    Direct.g(0, constraintWidget6, basicMeasure$Measurer0);
                }
                else {
                    Direct.b(0, constraintWidget6, basicMeasure$Measurer0, z);
                }
            }
        }
    }
}

