package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.Metrics;
import androidx.constraintlayout.core.widgets.Barrier;
import androidx.constraintlayout.core.widgets.ConstraintAnchor.Type;
import androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.Helper;
import androidx.constraintlayout.core.widgets.Optimizer;
import androidx.constraintlayout.core.widgets.VirtualLayout;
import java.util.ArrayList;

public class BasicMeasure {
    public static class Measure {
        public static int SELF_DIMENSIONS = 0;
        public static int TRY_GIVEN_DIMENSIONS = 1;
        public static int USE_GIVEN_DIMENSIONS = 2;
        public DimensionBehaviour horizontalBehavior;
        public int horizontalDimension;
        public int measureStrategy;
        public int measuredBaseline;
        public boolean measuredHasBaseline;
        public int measuredHeight;
        public boolean measuredNeedsSolverPass;
        public int measuredWidth;
        public DimensionBehaviour verticalBehavior;
        public int verticalDimension;

    }

    public interface Measurer {
        void didMeasures();

        void measure(ConstraintWidget arg1, Measure arg2);
    }

    public static final int AT_MOST = 0x80000000;
    public static final int EXACTLY = 0x40000000;
    public static final int FIXED = -3;
    public static final int MATCH_PARENT = -1;
    public static final int UNSPECIFIED = 0;
    public static final int WRAP_CONTENT = -2;
    public final ArrayList a;
    public final Measure b;
    public final ConstraintWidgetContainer c;

    public BasicMeasure(ConstraintWidgetContainer constraintWidgetContainer0) {
        this.a = new ArrayList();
        this.b = new Measure();
        this.c = constraintWidgetContainer0;
    }

    public final boolean a(int v, ConstraintWidget constraintWidget0, Measurer basicMeasure$Measurer0) {
        Measure basicMeasure$Measure0 = this.b;
        basicMeasure$Measure0.horizontalBehavior = constraintWidget0.getHorizontalDimensionBehaviour();
        basicMeasure$Measure0.verticalBehavior = constraintWidget0.getVerticalDimensionBehaviour();
        basicMeasure$Measure0.horizontalDimension = constraintWidget0.getWidth();
        basicMeasure$Measure0.verticalDimension = constraintWidget0.getHeight();
        basicMeasure$Measure0.measuredNeedsSolverPass = false;
        basicMeasure$Measure0.measureStrategy = v;
        boolean z = basicMeasure$Measure0.verticalBehavior == DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget0.mDimensionRatio > 0.0f;
        if(basicMeasure$Measure0.horizontalBehavior == DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget0.mDimensionRatio > 0.0f && constraintWidget0.mResolvedMatchConstraintDefault[0] == 4) {
            basicMeasure$Measure0.horizontalBehavior = DimensionBehaviour.FIXED;
        }
        if(z && constraintWidget0.mResolvedMatchConstraintDefault[1] == 4) {
            basicMeasure$Measure0.verticalBehavior = DimensionBehaviour.FIXED;
        }
        basicMeasure$Measurer0.measure(constraintWidget0, basicMeasure$Measure0);
        constraintWidget0.setWidth(basicMeasure$Measure0.measuredWidth);
        constraintWidget0.setHeight(basicMeasure$Measure0.measuredHeight);
        constraintWidget0.setHasBaseline(basicMeasure$Measure0.measuredHasBaseline);
        constraintWidget0.setBaselineDistance(basicMeasure$Measure0.measuredBaseline);
        basicMeasure$Measure0.measureStrategy = Measure.SELF_DIMENSIONS;
        return basicMeasure$Measure0.measuredNeedsSolverPass;
    }

    public final void b(ConstraintWidgetContainer constraintWidgetContainer0, int v, int v1, int v2) {
        constraintWidgetContainer0.setMinWidth(0);
        constraintWidgetContainer0.setMinHeight(0);
        constraintWidgetContainer0.setWidth(v1);
        constraintWidgetContainer0.setHeight(v2);
        constraintWidgetContainer0.setMinWidth(constraintWidgetContainer0.getMinWidth());
        constraintWidgetContainer0.setMinHeight(constraintWidgetContainer0.getMinHeight());
        this.c.setPass(v);
        this.c.layout();
    }

    public long solverMeasure(ConstraintWidgetContainer constraintWidgetContainer0, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7, int v8) {
        int v52;
        ArrayList arrayList1;
        int v44;
        int v43;
        int v39;
        int v38;
        int v24;
        int v23;
        boolean z5;
        int v22;
        int v17;
        boolean z2;
        int v18;
        Measurer basicMeasure$Measurer0 = constraintWidgetContainer0.getMeasurer();
        int v9 = constraintWidgetContainer0.mChildren.size();
        int v10 = constraintWidgetContainer0.getWidth();
        int v11 = constraintWidgetContainer0.getHeight();
        boolean z = Optimizer.enabled(v, 0x80);
        int v12 = z || Optimizer.enabled(v, 0x40) ? 1 : 0;
        if(v12 != 0) {
            int v13 = 0;
            while(v13 < v9) {
                ConstraintWidget constraintWidget0 = (ConstraintWidget)constraintWidgetContainer0.mChildren.get(v13);
                boolean z1 = constraintWidget0.getHorizontalDimensionBehaviour() == DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget0.getVerticalDimensionBehaviour() == DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget0.getDimensionRatio() > 0.0f;
                if((!constraintWidget0.isInHorizontalChain() || !z1) && ((!constraintWidget0.isInVerticalChain() || !z1) && !(constraintWidget0 instanceof VirtualLayout) && !constraintWidget0.isInHorizontalChain() && !constraintWidget0.isInVerticalChain())) {
                    ++v13;
                }
                else {
                    v12 = 0;
                    if(true) {
                        break;
                    }
                }
            }
        }
        if(v12 != 0) {
            Metrics metrics0 = LinearSystem.sMetrics;
            if(metrics0 != null) {
                ++metrics0.measures;
            }
        }
        int v14 = v12 & ((v3 != 0x40000000 || v5 != 0x40000000) && !z ? 0 : 1);
        if(v14 == 0) {
            z2 = false;
            v17 = 0;
        }
        else {
            int v15 = Math.min(constraintWidgetContainer0.getMaxWidth(), v4);
            int v16 = Math.min(constraintWidgetContainer0.getMaxHeight(), v6);
            if(v3 == 0x40000000 && constraintWidgetContainer0.getWidth() != v15) {
                constraintWidgetContainer0.setWidth(v15);
                constraintWidgetContainer0.invalidateGraph();
            }
            if(v5 == 0x40000000 && constraintWidgetContainer0.getHeight() != v16) {
                constraintWidgetContainer0.setHeight(v16);
                constraintWidgetContainer0.invalidateGraph();
            }
            if(v3 != 0x40000000 || v5 != 0x40000000) {
                boolean z3 = constraintWidgetContainer0.directMeasureSetup(z);
                if(v3 == 0x40000000) {
                    v18 = z3 & constraintWidgetContainer0.directMeasureWithOrientation(z, 0);
                    v17 = 1;
                }
                else {
                    v18 = z3;
                    v17 = 0;
                }
                if(v5 == 0x40000000) {
                    z2 = constraintWidgetContainer0.directMeasureWithOrientation(z, 1) & v18;
                    ++v17;
                }
                else {
                    z2 = v18;
                }
            }
            else {
                z2 = constraintWidgetContainer0.directMeasure(z);
                v17 = 2;
            }
            if(z2) {
                constraintWidgetContainer0.updateFromRuns(v3 == 0x40000000, v5 == 0x40000000);
            }
        }
        if(!z2 || v17 != 2) {
            int v19 = constraintWidgetContainer0.getOptimizationLevel();
            if(v9 > 0) {
                int v20 = constraintWidgetContainer0.mChildren.size();
                boolean z4 = constraintWidgetContainer0.optimizeFor(0x40);
                Measurer basicMeasure$Measurer1 = constraintWidgetContainer0.getMeasurer();
                int v21 = 0;
                while(v21 < v20) {
                    ConstraintWidget constraintWidget1 = (ConstraintWidget)constraintWidgetContainer0.mChildren.get(v21);
                    if(constraintWidget1 instanceof Guideline) {
                        v22 = v20;
                        z5 = z4;
                    }
                    else if(!(constraintWidget1 instanceof Barrier) && !constraintWidget1.isInVirtualLayout() && (!z4 || (constraintWidget1.horizontalRun == null || (constraintWidget1.verticalRun == null || !constraintWidget1.horizontalRun.c.resolved || !constraintWidget1.verticalRun.c.resolved)))) {
                        DimensionBehaviour constraintWidget$DimensionBehaviour0 = constraintWidget1.getDimensionBehaviour(0);
                        DimensionBehaviour constraintWidget$DimensionBehaviour1 = constraintWidget1.getDimensionBehaviour(1);
                        DimensionBehaviour constraintWidget$DimensionBehaviour2 = DimensionBehaviour.MATCH_CONSTRAINT;
                        v22 = v20;
                        if(constraintWidget$DimensionBehaviour0 == constraintWidget$DimensionBehaviour2) {
                            z5 = z4;
                            if(constraintWidget1.mMatchConstraintDefaultWidth != 1 && constraintWidget$DimensionBehaviour1 == constraintWidget$DimensionBehaviour2 && constraintWidget1.mMatchConstraintDefaultHeight != 1) {
                                v23 = 1;
                                goto label_73;
                            }
                        }
                        else {
                            z5 = z4;
                        }
                        v23 = 0;
                    label_73:
                        if(v23 != 0 || !constraintWidgetContainer0.optimizeFor(1) || constraintWidget1 instanceof VirtualLayout) {
                            v24 = v23;
                        }
                        else {
                            if(constraintWidget$DimensionBehaviour0 == constraintWidget$DimensionBehaviour2 && constraintWidget1.mMatchConstraintDefaultWidth == 0 && constraintWidget$DimensionBehaviour1 != constraintWidget$DimensionBehaviour2 && !constraintWidget1.isInHorizontalChain()) {
                                v23 = 1;
                            }
                            if(constraintWidget$DimensionBehaviour1 == constraintWidget$DimensionBehaviour2 && constraintWidget1.mMatchConstraintDefaultHeight == 0 && constraintWidget$DimensionBehaviour0 != constraintWidget$DimensionBehaviour2 && !constraintWidget1.isInHorizontalChain()) {
                                v23 = 1;
                            }
                            if((constraintWidget$DimensionBehaviour0 == constraintWidget$DimensionBehaviour2 || constraintWidget$DimensionBehaviour1 == constraintWidget$DimensionBehaviour2) && constraintWidget1.mDimensionRatio > 0.0f) {
                                v24 = 1;
                            }
                        }
                        if(v24 == 0) {
                            this.a(Measure.SELF_DIMENSIONS, constraintWidget1, basicMeasure$Measurer1);
                            Metrics metrics1 = constraintWidgetContainer0.mMetrics;
                            if(metrics1 != null) {
                                ++metrics1.measuredWidgets;
                            }
                        }
                    }
                    else {
                        v22 = v20;
                        z5 = z4;
                    }
                    ++v21;
                    v20 = v22;
                    z4 = z5;
                }
                basicMeasure$Measurer1.didMeasures();
            }
            this.updateHierarchy(constraintWidgetContainer0);
            ArrayList arrayList0 = this.a;
            int v25 = arrayList0.size();
            if(v9 > 0) {
                this.b(constraintWidgetContainer0, 0, v10, v11);
            }
            if(v25 > 0) {
                boolean z6 = constraintWidgetContainer0.getHorizontalDimensionBehaviour() == DimensionBehaviour.WRAP_CONTENT;
                boolean z7 = constraintWidgetContainer0.getVerticalDimensionBehaviour() == DimensionBehaviour.WRAP_CONTENT;
                int v26 = constraintWidgetContainer0.getWidth();
                int v27 = constraintWidgetContainer0.getHeight();
                int v28 = Math.max(v26, this.c.getMinWidth());
                int v29 = Math.max(v27, this.c.getMinHeight());
                boolean z8 = false;
                for(int v30 = 0; v30 < v25; ++v30) {
                    ConstraintWidget constraintWidget2 = (ConstraintWidget)arrayList0.get(v30);
                    if(constraintWidget2 instanceof VirtualLayout) {
                        int v31 = constraintWidget2.getWidth();
                        int v32 = constraintWidget2.getHeight();
                        int v33 = this.a(Measure.TRY_GIVEN_DIMENSIONS, constraintWidget2, basicMeasure$Measurer0) | z8;
                        Metrics metrics2 = constraintWidgetContainer0.mMetrics;
                        if(metrics2 != null) {
                            ++metrics2.measuredMatchWidgets;
                        }
                        int v34 = constraintWidget2.getWidth();
                        int v35 = constraintWidget2.getHeight();
                        if(v34 != v31) {
                            constraintWidget2.setWidth(v34);
                            if(z6 && constraintWidget2.getRight() > v28) {
                                int v36 = constraintWidget2.getRight();
                                v28 = Math.max(v28, constraintWidget2.getAnchor(Type.RIGHT).getMargin() + v36);
                            }
                            v33 = 1;
                        }
                        if(v35 == v32) {
                            v38 = v29;
                            v39 = v33;
                        }
                        else {
                            constraintWidget2.setHeight(v35);
                            if(z7 && constraintWidget2.getBottom() > v29) {
                                int v37 = constraintWidget2.getBottom();
                                v29 = Math.max(v29, constraintWidget2.getAnchor(Type.BOTTOM).getMargin() + v37);
                            }
                            v38 = v29;
                            v39 = 1;
                        }
                        v29 = v38;
                        z8 = ((VirtualLayout)constraintWidget2).needSolverPass() | v39;
                    }
                }
                int v40 = 0;
                while(v40 < 2) {
                    int v41 = v29;
                    int v42 = 0;
                    boolean z9 = z8;
                    while(v42 < v25) {
                        ConstraintWidget constraintWidget3 = (ConstraintWidget)arrayList0.get(v42);
                        if((!(constraintWidget3 instanceof Helper) || constraintWidget3 instanceof VirtualLayout) && !(constraintWidget3 instanceof Guideline) && constraintWidget3.getVisibility() != 8 && (v14 == 0 || !constraintWidget3.horizontalRun.c.resolved || !constraintWidget3.verticalRun.c.resolved) && !(constraintWidget3 instanceof VirtualLayout)) {
                            int v45 = constraintWidget3.getWidth();
                            int v46 = constraintWidget3.getHeight();
                            int v47 = constraintWidget3.getBaselineDistance();
                            v44 = v14;
                            z9 |= this.a((v40 == 1 ? Measure.USE_GIVEN_DIMENSIONS : Measure.TRY_GIVEN_DIMENSIONS), constraintWidget3, basicMeasure$Measurer0);
                            arrayList1 = arrayList0;
                            Metrics metrics3 = constraintWidgetContainer0.mMetrics;
                            v43 = v42;
                            if(metrics3 != null) {
                                ++metrics3.measuredMatchWidgets;
                            }
                            int v48 = constraintWidget3.getWidth();
                            int v49 = constraintWidget3.getHeight();
                            if(v48 != v45) {
                                constraintWidget3.setWidth(v48);
                                if(z6 && constraintWidget3.getRight() > v28) {
                                    int v50 = constraintWidget3.getRight();
                                    v28 = Math.max(v28, constraintWidget3.getAnchor(Type.RIGHT).getMargin() + v50);
                                }
                                z9 = true;
                            }
                            if(v49 != v46) {
                                constraintWidget3.setHeight(v49);
                                if(z7 && constraintWidget3.getBottom() > v41) {
                                    int v51 = constraintWidget3.getBottom();
                                    v41 = Math.max(v41, constraintWidget3.getAnchor(Type.BOTTOM).getMargin() + v51);
                                }
                                z9 = true;
                            }
                            if(constraintWidget3.hasBaseline() && v47 != constraintWidget3.getBaselineDistance()) {
                                z9 = true;
                            }
                        }
                        else {
                            v43 = v42;
                            v44 = v14;
                            arrayList1 = arrayList0;
                        }
                        v42 = v43 + 1;
                        arrayList0 = arrayList1;
                        v14 = v44;
                    }
                    if(z9) {
                        ++v40;
                        this.b(constraintWidgetContainer0, v40, v10, v11);
                        v29 = v41;
                        z8 = false;
                        continue;
                    }
                    else {
                        v52 = v19;
                    }
                    constraintWidgetContainer0.setOptimizationLevel(v52);
                    return 0L;
                }
            }
            v52 = v19;
            constraintWidgetContainer0.setOptimizationLevel(v52);
        }
        return 0L;
    }

    public void updateHierarchy(ConstraintWidgetContainer constraintWidgetContainer0) {
        ArrayList arrayList0 = this.a;
        arrayList0.clear();
        int v = constraintWidgetContainer0.mChildren.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ConstraintWidget constraintWidget0 = (ConstraintWidget)constraintWidgetContainer0.mChildren.get(v1);
            if(constraintWidget0.getHorizontalDimensionBehaviour() == DimensionBehaviour.MATCH_CONSTRAINT || constraintWidget0.getVerticalDimensionBehaviour() == DimensionBehaviour.MATCH_CONSTRAINT) {
                arrayList0.add(constraintWidget0);
            }
        }
        constraintWidgetContainer0.invalidateGraph();
    }
}

