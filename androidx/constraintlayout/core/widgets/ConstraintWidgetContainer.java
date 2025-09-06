package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.Metrics;
import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.constraintlayout.core.widgets.analyzer.DependencyGraph;
import androidx.constraintlayout.core.widgets.analyzer.Direct;
import androidx.constraintlayout.core.widgets.analyzer.Grouping;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class ConstraintWidgetContainer extends WidgetContainer {
    public final BasicMeasure K;
    public int L;
    public boolean M;
    public int N;
    public int O;
    public ChainHead[] P;
    public ChainHead[] Q;
    public int R;
    public boolean S;
    public boolean T;
    public WeakReference U;
    public WeakReference V;
    public WeakReference W;
    public WeakReference X;
    public final HashSet Y;
    public DependencyGraph mDependencyGraph;
    public boolean mGroupsWrapOptimized;
    public int mHorizontalChainsSize;
    public boolean mHorizontalWrapOptimized;
    public Measure mMeasure;
    protected Measurer mMeasurer;
    public Metrics mMetrics;
    public boolean mSkipSolver;
    protected LinearSystem mSystem;
    public int mVerticalChainsSize;
    public boolean mVerticalWrapOptimized;
    public int mWrapFixedHeight;
    public int mWrapFixedWidth;

    public ConstraintWidgetContainer() {
        this.K = new BasicMeasure(this);
        this.mDependencyGraph = new DependencyGraph(this);
        this.mMeasurer = null;
        this.M = false;
        this.mSystem = new LinearSystem();
        this.mHorizontalChainsSize = 0;
        this.mVerticalChainsSize = 0;
        this.P = new ChainHead[4];
        this.Q = new ChainHead[4];
        this.mGroupsWrapOptimized = false;
        this.mHorizontalWrapOptimized = false;
        this.mVerticalWrapOptimized = false;
        this.mWrapFixedWidth = 0;
        this.mWrapFixedHeight = 0;
        this.R = 0x101;
        this.mSkipSolver = false;
        this.S = false;
        this.T = false;
        this.U = null;
        this.V = null;
        this.W = null;
        this.X = null;
        this.Y = new HashSet();
        this.mMeasure = new Measure();
    }

    public ConstraintWidgetContainer(int v, int v1) {
        super(v, v1);
        this.K = new BasicMeasure(this);
        this.mDependencyGraph = new DependencyGraph(this);
        this.mMeasurer = null;
        this.M = false;
        this.mSystem = new LinearSystem();
        this.mHorizontalChainsSize = 0;
        this.mVerticalChainsSize = 0;
        this.P = new ChainHead[4];
        this.Q = new ChainHead[4];
        this.mGroupsWrapOptimized = false;
        this.mHorizontalWrapOptimized = false;
        this.mVerticalWrapOptimized = false;
        this.mWrapFixedWidth = 0;
        this.mWrapFixedHeight = 0;
        this.R = 0x101;
        this.mSkipSolver = false;
        this.S = false;
        this.T = false;
        this.U = null;
        this.V = null;
        this.W = null;
        this.X = null;
        this.Y = new HashSet();
        this.mMeasure = new Measure();
    }

    public ConstraintWidgetContainer(int v, int v1, int v2, int v3) {
        super(v, v1, v2, v3);
        this.K = new BasicMeasure(this);
        this.mDependencyGraph = new DependencyGraph(this);
        this.mMeasurer = null;
        this.M = false;
        this.mSystem = new LinearSystem();
        this.mHorizontalChainsSize = 0;
        this.mVerticalChainsSize = 0;
        this.P = new ChainHead[4];
        this.Q = new ChainHead[4];
        this.mGroupsWrapOptimized = false;
        this.mHorizontalWrapOptimized = false;
        this.mVerticalWrapOptimized = false;
        this.mWrapFixedWidth = 0;
        this.mWrapFixedHeight = 0;
        this.R = 0x101;
        this.mSkipSolver = false;
        this.S = false;
        this.T = false;
        this.U = null;
        this.V = null;
        this.W = null;
        this.X = null;
        this.Y = new HashSet();
        this.mMeasure = new Measure();
    }

    public ConstraintWidgetContainer(String s, int v, int v1) {
        super(v, v1);
        this.K = new BasicMeasure(this);
        this.mDependencyGraph = new DependencyGraph(this);
        this.mMeasurer = null;
        this.M = false;
        this.mSystem = new LinearSystem();
        this.mHorizontalChainsSize = 0;
        this.mVerticalChainsSize = 0;
        this.P = new ChainHead[4];
        this.Q = new ChainHead[4];
        this.mGroupsWrapOptimized = false;
        this.mHorizontalWrapOptimized = false;
        this.mVerticalWrapOptimized = false;
        this.mWrapFixedWidth = 0;
        this.mWrapFixedHeight = 0;
        this.R = 0x101;
        this.mSkipSolver = false;
        this.S = false;
        this.T = false;
        this.U = null;
        this.V = null;
        this.W = null;
        this.X = null;
        this.Y = new HashSet();
        this.mMeasure = new Measure();
        this.setDebugName(s);
    }

    public boolean addChildrenToSolver(LinearSystem linearSystem0) {
        boolean z = this.optimizeFor(0x40);
        this.addToSolver(linearSystem0, z);
        int v = this.mChildren.size();
        boolean z1 = false;
        for(int v1 = 0; v1 < v; ++v1) {
            ConstraintWidget constraintWidget0 = (ConstraintWidget)this.mChildren.get(v1);
            constraintWidget0.setInBarrier(0, false);
            constraintWidget0.setInBarrier(1, false);
            if(constraintWidget0 instanceof Barrier) {
                z1 = true;
            }
        }
        if(z1) {
            for(int v2 = 0; v2 < v; ++v2) {
                ConstraintWidget constraintWidget1 = (ConstraintWidget)this.mChildren.get(v2);
                if(constraintWidget1 instanceof Barrier) {
                    ((Barrier)constraintWidget1).markWidgets();
                }
            }
        }
        HashSet hashSet0 = this.Y;
        hashSet0.clear();
        for(int v3 = 0; v3 < v; ++v3) {
            ConstraintWidget constraintWidget2 = (ConstraintWidget)this.mChildren.get(v3);
            constraintWidget2.getClass();
            boolean z2 = constraintWidget2 instanceof VirtualLayout;
            if(z2 || constraintWidget2 instanceof Guideline) {
                if(z2) {
                    hashSet0.add(constraintWidget2);
                }
                else {
                    constraintWidget2.addToSolver(linearSystem0, z);
                }
            }
        }
        while(hashSet0.size() > 0) {
            int v4 = hashSet0.size();
            for(Object object0: hashSet0) {
                VirtualLayout virtualLayout0 = (VirtualLayout)(((ConstraintWidget)object0));
                if(virtualLayout0.contains(hashSet0)) {
                    virtualLayout0.addToSolver(linearSystem0, z);
                    hashSet0.remove(virtualLayout0);
                    break;
                }
                if(false) {
                    break;
                }
            }
            if(v4 == hashSet0.size()) {
                for(Object object1: hashSet0) {
                    ((ConstraintWidget)object1).addToSolver(linearSystem0, z);
                }
                hashSet0.clear();
            }
        }
        if(LinearSystem.USE_DEPENDENCY_ORDERING) {
            HashSet hashSet1 = new HashSet();
            for(int v5 = 0; v5 < v; ++v5) {
                ConstraintWidget constraintWidget3 = (ConstraintWidget)this.mChildren.get(v5);
                constraintWidget3.getClass();
                if(!(constraintWidget3 instanceof VirtualLayout) && !(constraintWidget3 instanceof Guideline)) {
                    hashSet1.add(constraintWidget3);
                }
            }
            this.addChildrenToSolverByDependency(this, linearSystem0, hashSet1, (this.getHorizontalDimensionBehaviour() == DimensionBehaviour.WRAP_CONTENT ? 0 : 1), false);
            for(Object object2: hashSet1) {
                Optimizer.a(this, linearSystem0, ((ConstraintWidget)object2));
                ((ConstraintWidget)object2).addToSolver(linearSystem0, z);
            }
        }
        else {
            for(int v6 = 0; v6 < v; ++v6) {
                ConstraintWidget constraintWidget4 = (ConstraintWidget)this.mChildren.get(v6);
                if(constraintWidget4 instanceof ConstraintWidgetContainer) {
                    DimensionBehaviour[] arr_constraintWidget$DimensionBehaviour = constraintWidget4.mListDimensionBehaviors;
                    DimensionBehaviour constraintWidget$DimensionBehaviour0 = arr_constraintWidget$DimensionBehaviour[0];
                    DimensionBehaviour constraintWidget$DimensionBehaviour1 = arr_constraintWidget$DimensionBehaviour[1];
                    DimensionBehaviour constraintWidget$DimensionBehaviour2 = DimensionBehaviour.WRAP_CONTENT;
                    if(constraintWidget$DimensionBehaviour0 == constraintWidget$DimensionBehaviour2) {
                        constraintWidget4.setHorizontalDimensionBehaviour(DimensionBehaviour.FIXED);
                    }
                    if(constraintWidget$DimensionBehaviour1 == constraintWidget$DimensionBehaviour2) {
                        constraintWidget4.setVerticalDimensionBehaviour(DimensionBehaviour.FIXED);
                    }
                    constraintWidget4.addToSolver(linearSystem0, z);
                    if(constraintWidget$DimensionBehaviour0 == constraintWidget$DimensionBehaviour2) {
                        constraintWidget4.setHorizontalDimensionBehaviour(constraintWidget$DimensionBehaviour0);
                    }
                    if(constraintWidget$DimensionBehaviour1 == constraintWidget$DimensionBehaviour2) {
                        constraintWidget4.setVerticalDimensionBehaviour(constraintWidget$DimensionBehaviour1);
                    }
                }
                else {
                    Optimizer.a(this, linearSystem0, constraintWidget4);
                    if(!(constraintWidget4 instanceof VirtualLayout) && !(constraintWidget4 instanceof Guideline)) {
                        constraintWidget4.addToSolver(linearSystem0, z);
                    }
                }
            }
        }
        if(this.mHorizontalChainsSize > 0) {
            Chain.applyChainConstraints(this, linearSystem0, null, 0);
        }
        if(this.mVerticalChainsSize > 0) {
            Chain.applyChainConstraints(this, linearSystem0, null, 1);
        }
        return true;
    }

    public void addHorizontalWrapMaxVariable(ConstraintAnchor constraintAnchor0) {
        if(this.X == null || this.X.get() == null || constraintAnchor0.getFinalValue() > ((ConstraintAnchor)this.X.get()).getFinalValue()) {
            this.X = new WeakReference(constraintAnchor0);
        }
    }

    public void addHorizontalWrapMinVariable(ConstraintAnchor constraintAnchor0) {
        if(this.V == null || this.V.get() == null || constraintAnchor0.getFinalValue() > ((ConstraintAnchor)this.V.get()).getFinalValue()) {
            this.V = new WeakReference(constraintAnchor0);
        }
    }

    public void defineTerminalWidgets() {
        this.mDependencyGraph.defineTerminalWidgets(this.getHorizontalDimensionBehaviour(), this.getVerticalDimensionBehaviour());
    }

    public boolean directMeasure(boolean z) {
        return this.mDependencyGraph.directMeasure(z);
    }

    public boolean directMeasureSetup(boolean z) {
        return this.mDependencyGraph.directMeasureSetup(z);
    }

    public boolean directMeasureWithOrientation(boolean z, int v) {
        return this.mDependencyGraph.directMeasureWithOrientation(z, v);
    }

    public void fillMetrics(Metrics metrics0) {
        this.mMetrics = metrics0;
        this.mSystem.fillMetrics(metrics0);
    }

    public ArrayList getHorizontalGuidelines() {
        ArrayList arrayList0 = new ArrayList();
        int v = this.mChildren.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ConstraintWidget constraintWidget0 = (ConstraintWidget)this.mChildren.get(v1);
            if(constraintWidget0 instanceof Guideline && ((Guideline)constraintWidget0).getOrientation() == 0) {
                arrayList0.add(((Guideline)constraintWidget0));
            }
        }
        return arrayList0;
    }

    public Measurer getMeasurer() {
        return this.mMeasurer;
    }

    public int getOptimizationLevel() {
        return this.R;
    }

    @Override  // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void getSceneString(StringBuilder stringBuilder0) {
        stringBuilder0.append(this.stringId + ":{\n");
        stringBuilder0.append("  actualWidth:" + this.v);
        stringBuilder0.append("\n");
        stringBuilder0.append("  actualHeight:" + this.w);
        stringBuilder0.append("\n");
        for(Object object0: this.getChildren()) {
            ((ConstraintWidget)object0).getSceneString(stringBuilder0);
            stringBuilder0.append(",\n");
        }
        stringBuilder0.append("}");
    }

    public LinearSystem getSystem() {
        return this.mSystem;
    }

    @Override  // androidx.constraintlayout.core.widgets.ConstraintWidget
    public String getType() {
        return "ConstraintLayout";
    }

    public ArrayList getVerticalGuidelines() {
        ArrayList arrayList0 = new ArrayList();
        int v = this.mChildren.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ConstraintWidget constraintWidget0 = (ConstraintWidget)this.mChildren.get(v1);
            if(constraintWidget0 instanceof Guideline && ((Guideline)constraintWidget0).getOrientation() == 1) {
                arrayList0.add(((Guideline)constraintWidget0));
            }
        }
        return arrayList0;
    }

    public boolean handlesInternalConstraints() [...] // 潜在的解密器

    public void invalidateGraph() {
        this.mDependencyGraph.invalidateGraph();
    }

    public void invalidateMeasures() {
        this.mDependencyGraph.invalidateMeasures();
    }

    public boolean isHeightMeasuredTooSmall() {
        return this.T;
    }

    public boolean isRtl() {
        return this.M;
    }

    public boolean isWidthMeasuredTooSmall() {
        return this.S;
    }

    public final void k(ConstraintWidget constraintWidget0, int v) {
        switch(v) {
            case 0: {
                ChainHead[] arr_chainHead = this.Q;
                if(this.mHorizontalChainsSize + 1 >= arr_chainHead.length) {
                    this.Q = (ChainHead[])Arrays.copyOf(arr_chainHead, arr_chainHead.length * 2);
                }
                ChainHead[] arr_chainHead1 = this.Q;
                int v1 = this.mHorizontalChainsSize;
                arr_chainHead1[v1] = new ChainHead(constraintWidget0, 0, this.isRtl());
                ++this.mHorizontalChainsSize;
                return;
            }
            case 1: {
                ChainHead[] arr_chainHead2 = this.P;
                if(this.mVerticalChainsSize + 1 >= arr_chainHead2.length) {
                    this.P = (ChainHead[])Arrays.copyOf(arr_chainHead2, arr_chainHead2.length * 2);
                }
                ChainHead[] arr_chainHead3 = this.P;
                int v2 = this.mVerticalChainsSize;
                arr_chainHead3[v2] = new ChainHead(constraintWidget0, 1, this.isRtl());
                ++this.mVerticalChainsSize;
            }
        }
    }

    @Override  // androidx.constraintlayout.core.widgets.WidgetContainer
    public void layout() {
        boolean z6;
        int v21;
        boolean z5;
        int v18;
        boolean z4;
        int v11;
        SolverVariable solverVariable1;
        SolverVariable solverVariable0;
        int v6;
        int v5;
        int v4;
        this.mX = 0;
        this.mY = 0;
        this.S = false;
        this.T = false;
        int v = this.mChildren.size();
        int v1 = Math.max(0, this.getWidth());
        int v2 = Math.max(0, this.getHeight());
        DimensionBehaviour[] arr_constraintWidget$DimensionBehaviour = this.mListDimensionBehaviors;
        DimensionBehaviour constraintWidget$DimensionBehaviour0 = arr_constraintWidget$DimensionBehaviour[1];
        DimensionBehaviour constraintWidget$DimensionBehaviour1 = arr_constraintWidget$DimensionBehaviour[0];
        Metrics metrics0 = this.mMetrics;
        if(metrics0 != null) {
            ++metrics0.layouts;
        }
        if(this.L == 0 && Optimizer.enabled(this.R, 1)) {
            Direct.solvingPass(this, this.getMeasurer());
            for(int v3 = 0; v3 < v; ++v3) {
                ConstraintWidget constraintWidget0 = (ConstraintWidget)this.mChildren.get(v3);
                if(constraintWidget0.isMeasureRequested() && !(constraintWidget0 instanceof Guideline) && !(constraintWidget0 instanceof Barrier) && !(constraintWidget0 instanceof VirtualLayout) && !constraintWidget0.isInVirtualLayout()) {
                    DimensionBehaviour constraintWidget$DimensionBehaviour2 = constraintWidget0.getDimensionBehaviour(0);
                    DimensionBehaviour constraintWidget$DimensionBehaviour3 = constraintWidget0.getDimensionBehaviour(1);
                    if(constraintWidget$DimensionBehaviour2 != DimensionBehaviour.MATCH_CONSTRAINT || constraintWidget0.mMatchConstraintDefaultWidth == 1 || constraintWidget$DimensionBehaviour3 != DimensionBehaviour.MATCH_CONSTRAINT || constraintWidget0.mMatchConstraintDefaultHeight == 1) {
                        Measure basicMeasure$Measure0 = new Measure();
                        ConstraintWidgetContainer.measure(0, constraintWidget0, this.mMeasurer, basicMeasure$Measure0, Measure.SELF_DIMENSIONS);
                    }
                }
            }
        }
        if(v > 2) {
            DimensionBehaviour constraintWidget$DimensionBehaviour4 = DimensionBehaviour.WRAP_CONTENT;
            if((constraintWidget$DimensionBehaviour1 == constraintWidget$DimensionBehaviour4 || constraintWidget$DimensionBehaviour0 == constraintWidget$DimensionBehaviour4) && Optimizer.enabled(this.R, 0x400) && Grouping.simpleSolvingPass(this, this.getMeasurer())) {
                if(constraintWidget$DimensionBehaviour1 == constraintWidget$DimensionBehaviour4) {
                    if(v1 >= this.getWidth() || v1 <= 0) {
                        v1 = this.getWidth();
                    }
                    else {
                        this.setWidth(v1);
                        this.S = true;
                    }
                }
                if(constraintWidget$DimensionBehaviour0 == constraintWidget$DimensionBehaviour4) {
                    if(v2 >= this.getHeight() || v2 <= 0) {
                        v2 = this.getHeight();
                    }
                    else {
                        this.setHeight(v2);
                        this.T = true;
                    }
                }
                v4 = v2;
                v5 = v1;
                v6 = 1;
                goto label_48;
            }
            goto label_45;
        }
        else {
        label_45:
            v4 = v2;
            v5 = v1;
            v6 = 0;
        }
    label_48:
        boolean z = this.optimizeFor(0x40) || this.optimizeFor(0x80);
        LinearSystem linearSystem0 = this.mSystem;
        linearSystem0.graphOptimizer = false;
        linearSystem0.newgraphOptimizer = false;
        if(this.R != 0 && z) {
            linearSystem0.newgraphOptimizer = true;
        }
        ArrayList arrayList0 = this.mChildren;
        boolean z1 = this.getHorizontalDimensionBehaviour() == DimensionBehaviour.WRAP_CONTENT || this.getVerticalDimensionBehaviour() == DimensionBehaviour.WRAP_CONTENT;
        this.mHorizontalChainsSize = 0;
        this.mVerticalChainsSize = 0;
        for(int v7 = 0; v7 < v; ++v7) {
            ConstraintWidget constraintWidget1 = (ConstraintWidget)this.mChildren.get(v7);
            if(constraintWidget1 instanceof WidgetContainer) {
                ((WidgetContainer)constraintWidget1).layout();
            }
        }
        boolean z2 = this.optimizeFor(0x40);
        int v8 = v6;
        int v9 = 0;
        boolean z3 = true;
        while(z3) {
            try {
                this.mSystem.reset();
                this.mHorizontalChainsSize = 0;
                this.mVerticalChainsSize = 0;
                this.createObjectVariables(this.mSystem);
                for(int v10 = 0; v10 < v; ++v10) {
                    ((ConstraintWidget)this.mChildren.get(v10)).createObjectVariables(this.mSystem);
                }
                z3 = this.addChildrenToSolver(this.mSystem);
                if(this.U == null || this.U.get() == null) {
                    goto label_92;
                }
                else {
                    ConstraintAnchor constraintAnchor0 = (ConstraintAnchor)this.U.get();
                    solverVariable0 = this.mSystem.createObjectVariable(this.mTop);
                    solverVariable1 = this.mSystem.createObjectVariable(constraintAnchor0);
                    v11 = v8;
                    goto label_89;
                }
                goto label_93;
            }
            catch(Exception exception0) {
                v11 = v8;
                goto label_115;
            }
            try {
            label_89:
                this.mSystem.addGreaterThan(solverVariable1, solverVariable0, 0, 5);
                this.U = null;
                goto label_93;
            label_92:
                v11 = v8;
            label_93:
                if(this.W != null && this.W.get() != null) {
                    ConstraintAnchor constraintAnchor1 = (ConstraintAnchor)this.W.get();
                    SolverVariable solverVariable2 = this.mSystem.createObjectVariable(this.mBottom);
                    SolverVariable solverVariable3 = this.mSystem.createObjectVariable(constraintAnchor1);
                    this.mSystem.addGreaterThan(solverVariable2, solverVariable3, 0, 5);
                    this.W = null;
                }
                if(this.V != null && this.V.get() != null) {
                    ConstraintAnchor constraintAnchor2 = (ConstraintAnchor)this.V.get();
                    SolverVariable solverVariable4 = this.mSystem.createObjectVariable(this.mLeft);
                    SolverVariable solverVariable5 = this.mSystem.createObjectVariable(constraintAnchor2);
                    this.mSystem.addGreaterThan(solverVariable5, solverVariable4, 0, 5);
                    this.V = null;
                }
                if(this.X != null && this.X.get() != null) {
                    ConstraintAnchor constraintAnchor3 = (ConstraintAnchor)this.X.get();
                    SolverVariable solverVariable6 = this.mSystem.createObjectVariable(this.mRight);
                    SolverVariable solverVariable7 = this.mSystem.createObjectVariable(constraintAnchor3);
                    this.mSystem.addGreaterThan(solverVariable6, solverVariable7, 0, 5);
                    this.X = null;
                }
                if(z3) {
                    this.mSystem.minimize();
                }
                goto label_117;
            }
            catch(Exception exception0) {
            }
        label_115:
            exception0.printStackTrace();
            System.out.println("EXCEPTION : " + exception0);
        label_117:
            boolean[] arr_z = Optimizer.a;
            if(z3) {
                z4 = this.updateChildrenFromSolver(this.mSystem, arr_z);
            }
            else {
                this.updateFromSolver(this.mSystem, z2);
                for(int v12 = 0; v12 < v; ++v12) {
                    ((ConstraintWidget)this.mChildren.get(v12)).updateFromSolver(this.mSystem, z2);
                }
                z4 = false;
            }
            if(!z1 || v9 + 1 >= 8 || !arr_z[2]) {
                v18 = v11;
            }
            else {
                int v14 = 0;
                int v15 = 0;
                for(int v13 = 0; v13 < v; ++v13) {
                    ConstraintWidget constraintWidget2 = (ConstraintWidget)this.mChildren.get(v13);
                    v14 = Math.max(v14, constraintWidget2.getWidth() + constraintWidget2.mX);
                    v15 = Math.max(v15, constraintWidget2.getHeight() + constraintWidget2.mY);
                }
                int v16 = Math.max(this.mMinWidth, v14);
                int v17 = Math.max(this.mMinHeight, v15);
                DimensionBehaviour constraintWidget$DimensionBehaviour5 = DimensionBehaviour.WRAP_CONTENT;
                if(constraintWidget$DimensionBehaviour1 != constraintWidget$DimensionBehaviour5 || this.getWidth() >= v16) {
                    v18 = v11;
                }
                else {
                    this.setWidth(v16);
                    this.mListDimensionBehaviors[0] = constraintWidget$DimensionBehaviour5;
                    z4 = true;
                    v18 = 1;
                }
                if(constraintWidget$DimensionBehaviour0 == constraintWidget$DimensionBehaviour5 && this.getHeight() < v17) {
                    this.setHeight(v17);
                    this.mListDimensionBehaviors[1] = constraintWidget$DimensionBehaviour5;
                    z4 = true;
                    v18 = 1;
                }
            }
            int v19 = Math.max(this.mMinWidth, this.getWidth());
            if(v19 > this.getWidth()) {
                this.setWidth(v19);
                this.mListDimensionBehaviors[0] = DimensionBehaviour.FIXED;
                z4 = true;
                v18 = 1;
            }
            int v20 = Math.max(this.mMinHeight, this.getHeight());
            if(v20 > this.getHeight()) {
                this.setHeight(v20);
                this.mListDimensionBehaviors[1] = DimensionBehaviour.FIXED;
                z5 = true;
                v21 = 1;
            }
            else {
                z5 = z4;
                v21 = v18;
            }
            if(v21 == 0) {
                DimensionBehaviour constraintWidget$DimensionBehaviour6 = DimensionBehaviour.WRAP_CONTENT;
                if(this.mListDimensionBehaviors[0] == constraintWidget$DimensionBehaviour6 && v5 > 0 && this.getWidth() > v5) {
                    this.S = true;
                    this.mListDimensionBehaviors[0] = DimensionBehaviour.FIXED;
                    this.setWidth(v5);
                    z5 = true;
                    v21 = 1;
                }
                if(this.mListDimensionBehaviors[1] == constraintWidget$DimensionBehaviour6 && v4 > 0 && this.getHeight() > v4) {
                    this.T = true;
                    this.mListDimensionBehaviors[1] = DimensionBehaviour.FIXED;
                    this.setHeight(v4);
                    z6 = true;
                    v8 = 1;
                }
            }
            else {
                v8 = v21;
                z6 = z5;
            }
            z3 = v9 + 1 <= 8 ? z6 : false;
            ++v9;
        }
        this.mChildren = arrayList0;
        if(v8 != 0) {
            DimensionBehaviour[] arr_constraintWidget$DimensionBehaviour1 = this.mListDimensionBehaviors;
            arr_constraintWidget$DimensionBehaviour1[0] = constraintWidget$DimensionBehaviour1;
            arr_constraintWidget$DimensionBehaviour1[1] = constraintWidget$DimensionBehaviour0;
        }
        this.resetSolverVariables(this.mSystem.getCache());
    }

    public static boolean measure(int v, ConstraintWidget constraintWidget0, Measurer basicMeasure$Measurer0, Measure basicMeasure$Measure0, int v1) {
        int v3;
        int v2;
        if(basicMeasure$Measurer0 == null) {
            return false;
        }
        if(constraintWidget0.getVisibility() != 8 && !(constraintWidget0 instanceof Guideline) && !(constraintWidget0 instanceof Barrier)) {
            basicMeasure$Measure0.horizontalBehavior = constraintWidget0.getHorizontalDimensionBehaviour();
            basicMeasure$Measure0.verticalBehavior = constraintWidget0.getVerticalDimensionBehaviour();
            basicMeasure$Measure0.horizontalDimension = constraintWidget0.getWidth();
            basicMeasure$Measure0.verticalDimension = constraintWidget0.getHeight();
            basicMeasure$Measure0.measuredNeedsSolverPass = false;
            basicMeasure$Measure0.measureStrategy = v1;
            boolean z = basicMeasure$Measure0.horizontalBehavior == DimensionBehaviour.MATCH_CONSTRAINT;
            boolean z1 = basicMeasure$Measure0.verticalBehavior == DimensionBehaviour.MATCH_CONSTRAINT;
            boolean z2 = z && constraintWidget0.mDimensionRatio > 0.0f;
            boolean z3 = z1 && constraintWidget0.mDimensionRatio > 0.0f;
            if(z && constraintWidget0.hasDanglingDimension(0) && constraintWidget0.mMatchConstraintDefaultWidth == 0 && !z2) {
                basicMeasure$Measure0.horizontalBehavior = DimensionBehaviour.WRAP_CONTENT;
                if(z1 && constraintWidget0.mMatchConstraintDefaultHeight == 0) {
                    basicMeasure$Measure0.horizontalBehavior = DimensionBehaviour.FIXED;
                }
                z = false;
            }
            if(z1 && constraintWidget0.hasDanglingDimension(1) && constraintWidget0.mMatchConstraintDefaultHeight == 0 && !z3) {
                basicMeasure$Measure0.verticalBehavior = DimensionBehaviour.WRAP_CONTENT;
                if(z && constraintWidget0.mMatchConstraintDefaultWidth == 0) {
                    basicMeasure$Measure0.verticalBehavior = DimensionBehaviour.FIXED;
                }
                z1 = false;
            }
            if(constraintWidget0.isResolvedHorizontally()) {
                basicMeasure$Measure0.horizontalBehavior = DimensionBehaviour.FIXED;
                z = false;
            }
            if(constraintWidget0.isResolvedVertically()) {
                basicMeasure$Measure0.verticalBehavior = DimensionBehaviour.FIXED;
                z1 = false;
            }
            if(z2) {
                if(constraintWidget0.mResolvedMatchConstraintDefault[0] == 4) {
                    basicMeasure$Measure0.horizontalBehavior = DimensionBehaviour.FIXED;
                }
                else if(!z1) {
                    DimensionBehaviour constraintWidget$DimensionBehaviour0 = DimensionBehaviour.FIXED;
                    if(basicMeasure$Measure0.verticalBehavior == constraintWidget$DimensionBehaviour0) {
                        v2 = basicMeasure$Measure0.verticalDimension;
                    }
                    else {
                        basicMeasure$Measure0.horizontalBehavior = DimensionBehaviour.WRAP_CONTENT;
                        basicMeasure$Measurer0.measure(constraintWidget0, basicMeasure$Measure0);
                        v2 = basicMeasure$Measure0.measuredHeight;
                    }
                    basicMeasure$Measure0.horizontalBehavior = constraintWidget$DimensionBehaviour0;
                    basicMeasure$Measure0.horizontalDimension = (int)(constraintWidget0.getDimensionRatio() * ((float)v2));
                }
            }
            if(z3) {
                if(constraintWidget0.mResolvedMatchConstraintDefault[1] == 4) {
                    basicMeasure$Measure0.verticalBehavior = DimensionBehaviour.FIXED;
                }
                else if(!z) {
                    DimensionBehaviour constraintWidget$DimensionBehaviour1 = DimensionBehaviour.FIXED;
                    if(basicMeasure$Measure0.horizontalBehavior == constraintWidget$DimensionBehaviour1) {
                        v3 = basicMeasure$Measure0.horizontalDimension;
                    }
                    else {
                        basicMeasure$Measure0.verticalBehavior = DimensionBehaviour.WRAP_CONTENT;
                        basicMeasure$Measurer0.measure(constraintWidget0, basicMeasure$Measure0);
                        v3 = basicMeasure$Measure0.measuredWidth;
                    }
                    basicMeasure$Measure0.verticalBehavior = constraintWidget$DimensionBehaviour1;
                    basicMeasure$Measure0.verticalDimension = constraintWidget0.getDimensionRatioSide() == -1 ? ((int)(((float)v3) / constraintWidget0.getDimensionRatio())) : ((int)(constraintWidget0.getDimensionRatio() * ((float)v3)));
                }
            }
            basicMeasure$Measurer0.measure(constraintWidget0, basicMeasure$Measure0);
            constraintWidget0.setWidth(basicMeasure$Measure0.measuredWidth);
            constraintWidget0.setHeight(basicMeasure$Measure0.measuredHeight);
            constraintWidget0.setHasBaseline(basicMeasure$Measure0.measuredHasBaseline);
            constraintWidget0.setBaselineDistance(basicMeasure$Measure0.measuredBaseline);
            basicMeasure$Measure0.measureStrategy = Measure.SELF_DIMENSIONS;
            return basicMeasure$Measure0.measuredNeedsSolverPass;
        }
        basicMeasure$Measure0.measuredWidth = 0;
        basicMeasure$Measure0.measuredHeight = 0;
        return false;
    }

    public long measure(int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7, int v8) {
        this.N = v7;
        this.O = v8;
        return this.K.solverMeasure(this, v, v7, v8, v1, v2, v3, v4, v5, v6);
    }

    public boolean optimizeFor(int v) {
        return (this.R & v) == v;
    }

    @Override  // androidx.constraintlayout.core.widgets.WidgetContainer
    public void reset() {
        this.mSystem.reset();
        this.N = 0;
        this.O = 0;
        this.mSkipSolver = false;
        super.reset();
    }

    public void setMeasurer(Measurer basicMeasure$Measurer0) {
        this.mMeasurer = basicMeasure$Measurer0;
        this.mDependencyGraph.setMeasurer(basicMeasure$Measurer0);
    }

    public void setOptimizationLevel(int v) {
        this.R = v;
        LinearSystem.USE_DEPENDENCY_ORDERING = this.optimizeFor(0x200);
    }

    public void setPadding(int v, int v1, int v2, int v3) {
        this.N = v;
        this.O = v1;
    }

    public void setPass(int v) {
        this.L = v;
    }

    public void setRtl(boolean z) {
        this.M = z;
    }

    public boolean updateChildrenFromSolver(LinearSystem linearSystem0, boolean[] arr_z) {
        arr_z[2] = false;
        boolean z = this.optimizeFor(0x40);
        this.updateFromSolver(linearSystem0, z);
        int v1 = this.mChildren.size();
        boolean z1 = false;
        for(int v = 0; v < v1; ++v) {
            ConstraintWidget constraintWidget0 = (ConstraintWidget)this.mChildren.get(v);
            constraintWidget0.updateFromSolver(linearSystem0, z);
            if(constraintWidget0.hasDimensionOverride()) {
                z1 = true;
            }
        }
        return z1;
    }

    @Override  // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void updateFromRuns(boolean z, boolean z1) {
        super.updateFromRuns(z, z1);
        int v = this.mChildren.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((ConstraintWidget)this.mChildren.get(v1)).updateFromRuns(z, z1);
        }
    }

    public void updateHierarchy() {
        this.K.updateHierarchy(this);
    }
}

