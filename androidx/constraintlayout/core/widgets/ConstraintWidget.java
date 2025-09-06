package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.Cache;
import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.Metrics;
import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.state.WidgetFrame;
import androidx.constraintlayout.core.widgets.analyzer.ChainRun;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun;
import androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import r0.a;

public class ConstraintWidget {
    public static enum DimensionBehaviour {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT;

    }

    public Object A;
    public static final int ANCHOR_BASELINE = 4;
    public static final int ANCHOR_BOTTOM = 3;
    public static final int ANCHOR_LEFT = 0;
    public static final int ANCHOR_RIGHT = 1;
    public static final int ANCHOR_TOP = 2;
    public int B;
    public static final int BOTH = 2;
    public int C;
    public static final int CHAIN_PACKED = 2;
    public static final int CHAIN_SPREAD = 0;
    public static final int CHAIN_SPREAD_INSIDE = 1;
    public boolean D;
    public static float DEFAULT_BIAS = 0.5f;
    protected static final int DIRECT = 2;
    public String E;
    public String F;
    public int G;
    public static final int GONE = 8;
    public int H;
    public static final int HORIZONTAL = 0;
    public ConstraintWidget I;
    public static final int INVISIBLE = 4;
    public ConstraintWidget J;
    public static final int MATCH_CONSTRAINT_PERCENT = 2;
    public static final int MATCH_CONSTRAINT_RATIO = 3;
    public static final int MATCH_CONSTRAINT_RATIO_RESOLVED = 4;
    public static final int MATCH_CONSTRAINT_SPREAD = 0;
    public static final int MATCH_CONSTRAINT_WRAP = 1;
    protected static final int SOLVER = 1;
    public static final int UNKNOWN = -1;
    public static final int VERTICAL = 1;
    public static final int VISIBLE = 0;
    public static final int WRAP_BEHAVIOR_HORIZONTAL_ONLY = 1;
    public static final int WRAP_BEHAVIOR_INCLUDED = 0;
    public static final int WRAP_BEHAVIOR_SKIPPED = 3;
    public static final int WRAP_BEHAVIOR_VERTICAL_ONLY = 2;
    public boolean a;
    public final boolean b;
    public int c;
    public int d;
    public boolean e;
    public boolean f;
    public WidgetFrame frame;
    public boolean g;
    public boolean h;
    public ChainRun horizontalChainRun;
    public int horizontalGroup;
    public HorizontalWidgetRun horizontalRun;
    public int i;
    public boolean[] isTerminalWidget;
    public int j;
    public float k;
    public int[] l;
    public float m;
    protected ArrayList mAnchors;
    public ConstraintAnchor mBaseline;
    public ConstraintAnchor mBottom;
    public ConstraintAnchor mCenter;
    public float mDimensionRatio;
    protected int mDimensionRatioSide;
    public int mHorizontalResolution;
    public boolean mIsHeightWrapContent;
    public boolean mIsWidthWrapContent;
    public ConstraintAnchor mLeft;
    public ConstraintAnchor[] mListAnchors;
    public DimensionBehaviour[] mListDimensionBehaviors;
    protected ConstraintWidget[] mListNextMatchConstraintsWidget;
    public int mMatchConstraintDefaultHeight;
    public int mMatchConstraintDefaultWidth;
    public int mMatchConstraintMaxHeight;
    public int mMatchConstraintMaxWidth;
    public int mMatchConstraintMinHeight;
    public int mMatchConstraintMinWidth;
    public float mMatchConstraintPercentHeight;
    public float mMatchConstraintPercentWidth;
    protected int mMinHeight;
    protected int mMinWidth;
    protected ConstraintWidget[] mNextChainWidget;
    protected int mOffsetX;
    protected int mOffsetY;
    public ConstraintWidget mParent;
    public int[] mResolvedMatchConstraintDefault;
    public ConstraintAnchor mRight;
    public ConstraintAnchor mTop;
    public int mVerticalResolution;
    public float[] mWeight;
    protected int mX;
    protected int mY;
    public boolean measured;
    public boolean n;
    public boolean o;
    public boolean p;
    public int q;
    public int r;
    public WidgetRun[] run;
    public final ConstraintAnchor s;
    public String stringId;
    public final ConstraintAnchor t;
    public final boolean[] u;
    public int v;
    public ChainRun verticalChainRun;
    public int verticalGroup;
    public VerticalWidgetRun verticalRun;
    public int w;
    public int x;
    public float y;
    public float z;

    public ConstraintWidget() {
        this.measured = false;
        this.run = new WidgetRun[2];
        this.horizontalRun = null;
        this.verticalRun = null;
        this.isTerminalWidget = new boolean[]{true, true};
        this.a = true;
        this.b = true;
        this.c = -1;
        this.d = -1;
        this.frame = new WidgetFrame(this);
        this.e = false;
        this.f = false;
        this.g = false;
        this.h = false;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        this.i = 0;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mResolvedMatchConstraintDefault = new int[2];
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMaxWidth = 0;
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintMinHeight = 0;
        this.mMatchConstraintMaxHeight = 0;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.j = -1;
        this.k = 1.0f;
        this.l = new int[]{0x7FFFFFFF, 0x7FFFFFFF};
        this.m = 0.0f;
        this.n = false;
        this.p = false;
        this.q = 0;
        this.r = 0;
        this.mLeft = new ConstraintAnchor(this, Type.LEFT);
        this.mTop = new ConstraintAnchor(this, Type.TOP);
        this.mRight = new ConstraintAnchor(this, Type.RIGHT);
        this.mBottom = new ConstraintAnchor(this, Type.BOTTOM);
        this.mBaseline = new ConstraintAnchor(this, Type.BASELINE);
        this.s = new ConstraintAnchor(this, Type.CENTER_X);
        this.t = new ConstraintAnchor(this, Type.CENTER_Y);
        ConstraintAnchor constraintAnchor0 = new ConstraintAnchor(this, Type.CENTER);
        this.mCenter = constraintAnchor0;
        this.mListAnchors = new ConstraintAnchor[]{this.mLeft, this.mRight, this.mTop, this.mBottom, this.mBaseline, constraintAnchor0};
        this.mAnchors = new ArrayList();
        this.u = new boolean[2];
        this.mListDimensionBehaviors = new DimensionBehaviour[]{DimensionBehaviour.FIXED, DimensionBehaviour.FIXED};
        this.mParent = null;
        this.v = 0;
        this.w = 0;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.mX = 0;
        this.mY = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.x = 0;
        this.y = ConstraintWidget.DEFAULT_BIAS;
        this.z = ConstraintWidget.DEFAULT_BIAS;
        this.B = 0;
        this.C = 0;
        this.D = false;
        this.E = null;
        this.F = null;
        this.G = 0;
        this.H = 0;
        this.mWeight = new float[]{-1.0f, -1.0f};
        this.mListNextMatchConstraintsWidget = new ConstraintWidget[]{0, 0};
        this.mNextChainWidget = new ConstraintWidget[]{0, 0};
        this.I = null;
        this.J = null;
        this.horizontalGroup = -1;
        this.verticalGroup = -1;
        this.a();
    }

    public ConstraintWidget(int v, int v1) {
        this(0, 0, v, v1);
    }

    public ConstraintWidget(int v, int v1, int v2, int v3) {
        this.measured = false;
        this.run = new WidgetRun[2];
        this.horizontalRun = null;
        this.verticalRun = null;
        this.isTerminalWidget = new boolean[]{true, true};
        this.a = true;
        this.b = true;
        this.c = -1;
        this.d = -1;
        this.frame = new WidgetFrame(this);
        this.e = false;
        this.f = false;
        this.g = false;
        this.h = false;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        this.i = 0;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mResolvedMatchConstraintDefault = new int[2];
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMaxWidth = 0;
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintMinHeight = 0;
        this.mMatchConstraintMaxHeight = 0;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.j = -1;
        this.k = 1.0f;
        this.l = new int[]{0x7FFFFFFF, 0x7FFFFFFF};
        this.m = 0.0f;
        this.n = false;
        this.p = false;
        this.q = 0;
        this.r = 0;
        this.mLeft = new ConstraintAnchor(this, Type.LEFT);
        this.mTop = new ConstraintAnchor(this, Type.TOP);
        this.mRight = new ConstraintAnchor(this, Type.RIGHT);
        this.mBottom = new ConstraintAnchor(this, Type.BOTTOM);
        this.mBaseline = new ConstraintAnchor(this, Type.BASELINE);
        this.s = new ConstraintAnchor(this, Type.CENTER_X);
        this.t = new ConstraintAnchor(this, Type.CENTER_Y);
        ConstraintAnchor constraintAnchor0 = new ConstraintAnchor(this, Type.CENTER);
        this.mCenter = constraintAnchor0;
        this.mListAnchors = new ConstraintAnchor[]{this.mLeft, this.mRight, this.mTop, this.mBottom, this.mBaseline, constraintAnchor0};
        this.mAnchors = new ArrayList();
        this.u = new boolean[2];
        this.mListDimensionBehaviors = new DimensionBehaviour[]{DimensionBehaviour.FIXED, DimensionBehaviour.FIXED};
        this.mParent = null;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.x = 0;
        this.y = ConstraintWidget.DEFAULT_BIAS;
        this.z = ConstraintWidget.DEFAULT_BIAS;
        this.B = 0;
        this.C = 0;
        this.D = false;
        this.E = null;
        this.F = null;
        this.G = 0;
        this.H = 0;
        this.mWeight = new float[]{-1.0f, -1.0f};
        this.mListNextMatchConstraintsWidget = new ConstraintWidget[]{0, 0};
        this.mNextChainWidget = new ConstraintWidget[]{0, 0};
        this.I = null;
        this.J = null;
        this.horizontalGroup = -1;
        this.verticalGroup = -1;
        this.mX = v;
        this.mY = v1;
        this.v = v2;
        this.w = v3;
        this.a();
    }

    public ConstraintWidget(String s) {
        this.measured = false;
        this.run = new WidgetRun[2];
        this.horizontalRun = null;
        this.verticalRun = null;
        this.isTerminalWidget = new boolean[]{true, true};
        this.a = true;
        this.b = true;
        this.c = -1;
        this.d = -1;
        this.frame = new WidgetFrame(this);
        this.e = false;
        this.f = false;
        this.g = false;
        this.h = false;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        this.i = 0;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mResolvedMatchConstraintDefault = new int[2];
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMaxWidth = 0;
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintMinHeight = 0;
        this.mMatchConstraintMaxHeight = 0;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.j = -1;
        this.k = 1.0f;
        this.l = new int[]{0x7FFFFFFF, 0x7FFFFFFF};
        this.m = 0.0f;
        this.n = false;
        this.p = false;
        this.q = 0;
        this.r = 0;
        this.mLeft = new ConstraintAnchor(this, Type.LEFT);
        this.mTop = new ConstraintAnchor(this, Type.TOP);
        this.mRight = new ConstraintAnchor(this, Type.RIGHT);
        this.mBottom = new ConstraintAnchor(this, Type.BOTTOM);
        this.mBaseline = new ConstraintAnchor(this, Type.BASELINE);
        this.s = new ConstraintAnchor(this, Type.CENTER_X);
        this.t = new ConstraintAnchor(this, Type.CENTER_Y);
        ConstraintAnchor constraintAnchor0 = new ConstraintAnchor(this, Type.CENTER);
        this.mCenter = constraintAnchor0;
        this.mListAnchors = new ConstraintAnchor[]{this.mLeft, this.mRight, this.mTop, this.mBottom, this.mBaseline, constraintAnchor0};
        this.mAnchors = new ArrayList();
        this.u = new boolean[2];
        this.mListDimensionBehaviors = new DimensionBehaviour[]{DimensionBehaviour.FIXED, DimensionBehaviour.FIXED};
        this.mParent = null;
        this.v = 0;
        this.w = 0;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.mX = 0;
        this.mY = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.x = 0;
        this.y = ConstraintWidget.DEFAULT_BIAS;
        this.z = ConstraintWidget.DEFAULT_BIAS;
        this.B = 0;
        this.C = 0;
        this.D = false;
        this.E = null;
        this.F = null;
        this.G = 0;
        this.H = 0;
        this.mWeight = new float[]{-1.0f, -1.0f};
        this.mListNextMatchConstraintsWidget = new ConstraintWidget[]{0, 0};
        this.mNextChainWidget = new ConstraintWidget[]{0, 0};
        this.I = null;
        this.J = null;
        this.horizontalGroup = -1;
        this.verticalGroup = -1;
        this.a();
        this.setDebugName(s);
    }

    public ConstraintWidget(String s, int v, int v1) {
        this(v, v1);
        this.setDebugName(s);
    }

    public ConstraintWidget(String s, int v, int v1, int v2, int v3) {
        this(v, v1, v2, v3);
        this.setDebugName(s);
    }

    public final void a() {
        this.mAnchors.add(this.mLeft);
        this.mAnchors.add(this.mTop);
        this.mAnchors.add(this.mRight);
        this.mAnchors.add(this.mBottom);
        this.mAnchors.add(this.s);
        this.mAnchors.add(this.t);
        this.mAnchors.add(this.mCenter);
        this.mAnchors.add(this.mBaseline);
    }

    public void addChildrenToSolverByDependency(ConstraintWidgetContainer constraintWidgetContainer0, LinearSystem linearSystem0, HashSet hashSet0, int v, boolean z) {
        if(z) {
            if(!hashSet0.contains(this)) {
                return;
            }
            Optimizer.a(constraintWidgetContainer0, linearSystem0, this);
            hashSet0.remove(this);
            this.addToSolver(linearSystem0, constraintWidgetContainer0.optimizeFor(0x40));
        }
        if(v == 0) {
            HashSet hashSet1 = this.mLeft.getDependents();
            if(hashSet1 != null) {
                for(Object object0: hashSet1) {
                    ((ConstraintAnchor)object0).mOwner.addChildrenToSolverByDependency(constraintWidgetContainer0, linearSystem0, hashSet0, 0, true);
                }
            }
            HashSet hashSet2 = this.mRight.getDependents();
            if(hashSet2 != null) {
                for(Object object1: hashSet2) {
                    ((ConstraintAnchor)object1).mOwner.addChildrenToSolverByDependency(constraintWidgetContainer0, linearSystem0, hashSet0, 0, true);
                }
            }
        }
        else {
            HashSet hashSet3 = this.mTop.getDependents();
            if(hashSet3 != null) {
                for(Object object2: hashSet3) {
                    ((ConstraintAnchor)object2).mOwner.addChildrenToSolverByDependency(constraintWidgetContainer0, linearSystem0, hashSet0, v, true);
                }
            }
            HashSet hashSet4 = this.mBottom.getDependents();
            if(hashSet4 != null) {
                for(Object object3: hashSet4) {
                    ((ConstraintAnchor)object3).mOwner.addChildrenToSolverByDependency(constraintWidgetContainer0, linearSystem0, hashSet0, v, true);
                }
            }
            HashSet hashSet5 = this.mBaseline.getDependents();
            if(hashSet5 != null) {
                for(Object object4: hashSet5) {
                    ((ConstraintAnchor)object4).mOwner.addChildrenToSolverByDependency(constraintWidgetContainer0, linearSystem0, hashSet0, v, true);
                }
            }
        }
    }

    public void addToSolver(LinearSystem linearSystem0, boolean z) {
        int v14;
        int v13;
        DimensionBehaviour constraintWidget$DimensionBehaviour5;
        DimensionBehaviour constraintWidget$DimensionBehaviour4;
        boolean z19;
        boolean z18;
        int v11;
        boolean z11;
        int v10;
        int v9;
        int v8;
        boolean[] arr_z1;
        boolean z10;
        boolean z9;
        boolean z8;
        boolean z7;
        boolean z4;
        boolean z3;
        SolverVariable solverVariable0 = linearSystem0.createObjectVariable(this.mLeft);
        SolverVariable solverVariable1 = linearSystem0.createObjectVariable(this.mRight);
        SolverVariable solverVariable2 = linearSystem0.createObjectVariable(this.mTop);
        SolverVariable solverVariable3 = linearSystem0.createObjectVariable(this.mBottom);
        SolverVariable solverVariable4 = linearSystem0.createObjectVariable(this.mBaseline);
        ConstraintWidget constraintWidget0 = this.mParent;
        if(constraintWidget0 == null) {
            z4 = false;
            z3 = false;
        }
        else {
            DimensionBehaviour[] arr_constraintWidget$DimensionBehaviour = constraintWidget0.mListDimensionBehaviors;
            boolean z1 = arr_constraintWidget$DimensionBehaviour[0] == DimensionBehaviour.WRAP_CONTENT;
            boolean z2 = arr_constraintWidget$DimensionBehaviour[1] == DimensionBehaviour.WRAP_CONTENT;
            switch(this.i) {
                case 1: {
                    z4 = z1;
                    z3 = false;
                    break;
                }
                case 2: {
                    z3 = z2;
                    z4 = false;
                    break;
                }
                case 3: {
                    z4 = false;
                    z3 = false;
                    break;
                }
                default: {
                    z3 = z2;
                    z4 = z1;
                }
            }
        }
        boolean[] arr_z = this.u;
        if(this.C == 8 && !this.D && !this.hasDependencies() && !arr_z[0] && !arr_z[1]) {
            return;
        }
        boolean z5 = this.e;
        if(z5 || this.f) {
            boolean z6 = this.b;
            if(z5) {
                linearSystem0.addEquality(solverVariable0, this.mX);
                linearSystem0.addEquality(solverVariable1, this.mX + this.v);
                if(z4) {
                    ConstraintWidget constraintWidget1 = this.mParent;
                    if(constraintWidget1 != null) {
                        if(z6) {
                            ((ConstraintWidgetContainer)constraintWidget1).addHorizontalWrapMinVariable(this.mLeft);
                            ((ConstraintWidgetContainer)constraintWidget1).addHorizontalWrapMaxVariable(this.mRight);
                        }
                        else {
                            linearSystem0.addGreaterThan(linearSystem0.createObjectVariable(constraintWidget1.mRight), solverVariable1, 0, 5);
                        }
                    }
                }
            }
            if(this.f) {
                linearSystem0.addEquality(solverVariable2, this.mY);
                linearSystem0.addEquality(solverVariable3, this.mY + this.w);
                if(this.mBaseline.hasDependents()) {
                    linearSystem0.addEquality(solverVariable4, this.mY + this.x);
                }
                if(z3) {
                    ConstraintWidget constraintWidget2 = this.mParent;
                    if(constraintWidget2 != null) {
                        if(z6) {
                            ConstraintAnchor constraintAnchor0 = this.mTop;
                            WeakReference weakReference0 = ((ConstraintWidgetContainer)constraintWidget2).U;
                            if(weakReference0 == null || weakReference0.get() == null || constraintAnchor0.getFinalValue() > ((ConstraintAnchor)((ConstraintWidgetContainer)constraintWidget2).U.get()).getFinalValue()) {
                                ((ConstraintWidgetContainer)constraintWidget2).U = new WeakReference(constraintAnchor0);
                            }
                            ConstraintAnchor constraintAnchor1 = this.mBottom;
                            WeakReference weakReference1 = ((ConstraintWidgetContainer)constraintWidget2).W;
                            if(weakReference1 == null || weakReference1.get() == null || constraintAnchor1.getFinalValue() > ((ConstraintAnchor)((ConstraintWidgetContainer)constraintWidget2).W.get()).getFinalValue()) {
                                ((ConstraintWidgetContainer)constraintWidget2).W = new WeakReference(constraintAnchor1);
                            }
                        }
                        else {
                            linearSystem0.addGreaterThan(linearSystem0.createObjectVariable(constraintWidget2.mBottom), solverVariable3, 0, 5);
                        }
                    }
                }
            }
            if(this.e && this.f) {
                this.e = false;
                this.f = false;
                return;
            }
        }
        Metrics metrics0 = LinearSystem.sMetrics;
        if(metrics0 != null) {
            ++metrics0.widgets;
        }
        if(z) {
            HorizontalWidgetRun horizontalWidgetRun0 = this.horizontalRun;
            if(horizontalWidgetRun0 != null) {
                VerticalWidgetRun verticalWidgetRun0 = this.verticalRun;
                if(verticalWidgetRun0 != null) {
                    DependencyNode dependencyNode0 = horizontalWidgetRun0.start;
                    if(dependencyNode0.resolved && horizontalWidgetRun0.end.resolved && verticalWidgetRun0.start.resolved && verticalWidgetRun0.end.resolved) {
                        if(metrics0 != null) {
                            ++metrics0.graphSolved;
                        }
                        linearSystem0.addEquality(solverVariable0, dependencyNode0.value);
                        linearSystem0.addEquality(solverVariable1, this.horizontalRun.end.value);
                        linearSystem0.addEquality(solverVariable2, this.verticalRun.start.value);
                        linearSystem0.addEquality(solverVariable3, this.verticalRun.end.value);
                        linearSystem0.addEquality(solverVariable4, this.verticalRun.baseline.value);
                        if(this.mParent != null) {
                            if(z4 && this.isTerminalWidget[0] && !this.isInHorizontalChain()) {
                                linearSystem0.addGreaterThan(linearSystem0.createObjectVariable(this.mParent.mRight), solverVariable1, 0, 8);
                            }
                            if(z3 && this.isTerminalWidget[1] && !this.isInVerticalChain()) {
                                linearSystem0.addGreaterThan(linearSystem0.createObjectVariable(this.mParent.mBottom), solverVariable3, 0, 8);
                            }
                        }
                        this.e = false;
                        this.f = false;
                        return;
                    }
                }
            }
        }
        if(metrics0 != null) {
            ++metrics0.linearSolved;
        }
        if(this.mParent == null) {
            z10 = false;
            z9 = false;
        }
        else {
            if(this.e(0)) {
                ((ConstraintWidgetContainer)this.mParent).k(this, 0);
                z7 = true;
            }
            else {
                z7 = this.isInHorizontalChain();
            }
            if(this.e(1)) {
                ((ConstraintWidgetContainer)this.mParent).k(this, 1);
                z8 = true;
            }
            else {
                z8 = this.isInVerticalChain();
            }
            if(!z7 && z4 && this.C != 8 && this.mLeft.mTarget == null && this.mRight.mTarget == null) {
                linearSystem0.addGreaterThan(linearSystem0.createObjectVariable(this.mParent.mRight), solverVariable1, 0, 1);
            }
            if(!z8 && z3 && this.C != 8 && this.mTop.mTarget == null && this.mBottom.mTarget == null && this.mBaseline == null) {
                linearSystem0.addGreaterThan(linearSystem0.createObjectVariable(this.mParent.mBottom), solverVariable3, 0, 1);
            }
            z9 = z7;
            z10 = z8;
        }
        int v = this.v;
        int v1 = v < this.mMinWidth ? this.mMinWidth : v;
        int v2 = this.w;
        int v3 = v2 < this.mMinHeight ? this.mMinHeight : v2;
        DimensionBehaviour[] arr_constraintWidget$DimensionBehaviour1 = this.mListDimensionBehaviors;
        DimensionBehaviour constraintWidget$DimensionBehaviour0 = arr_constraintWidget$DimensionBehaviour1[0];
        DimensionBehaviour constraintWidget$DimensionBehaviour1 = DimensionBehaviour.MATCH_CONSTRAINT;
        DimensionBehaviour constraintWidget$DimensionBehaviour2 = arr_constraintWidget$DimensionBehaviour1[1];
        int v4 = this.mDimensionRatioSide;
        this.j = v4;
        float f = this.mDimensionRatio;
        this.k = f;
        int v5 = this.mMatchConstraintDefaultWidth;
        int v6 = this.mMatchConstraintDefaultHeight;
        if(f > 0.0f) {
            arr_z1 = arr_z;
            if(this.C == 8) {
                goto label_173;
            }
            else {
                if(constraintWidget$DimensionBehaviour0 == constraintWidget$DimensionBehaviour1 && v5 == 0) {
                    v5 = 3;
                }
                if(constraintWidget$DimensionBehaviour2 == constraintWidget$DimensionBehaviour1 && v6 == 0) {
                    v6 = 3;
                }
                if(constraintWidget$DimensionBehaviour0 == constraintWidget$DimensionBehaviour1 && constraintWidget$DimensionBehaviour2 == constraintWidget$DimensionBehaviour1 && v5 == 3 && v6 == 3) {
                    this.setupDimensionRatio(z4, z3, constraintWidget$DimensionBehaviour0 != constraintWidget$DimensionBehaviour1, constraintWidget$DimensionBehaviour2 != constraintWidget$DimensionBehaviour1);
                    goto label_166;
                }
                else if(constraintWidget$DimensionBehaviour0 == constraintWidget$DimensionBehaviour1 && v5 == 3) {
                    this.j = 0;
                    int v7 = (int)(f * ((float)v2));
                    if(constraintWidget$DimensionBehaviour2 == constraintWidget$DimensionBehaviour1) {
                        v11 = v7;
                        v8 = 3;
                        v9 = v6;
                        v10 = v3;
                        z11 = true;
                    }
                    else {
                        v8 = 4;
                        v9 = v6;
                        v10 = v3;
                        z11 = false;
                        v11 = v7;
                    }
                }
                else if(constraintWidget$DimensionBehaviour2 != constraintWidget$DimensionBehaviour1 || v6 != 3) {
                label_166:
                    v8 = v5;
                    v9 = v6;
                    v11 = v1;
                    v10 = v3;
                    z11 = true;
                }
                else {
                    this.j = 1;
                    if(v4 == -1) {
                        this.k = 1.0f / f;
                    }
                    int v12 = (int)(this.k * ((float)v));
                    if(constraintWidget$DimensionBehaviour0 == constraintWidget$DimensionBehaviour1) {
                        v10 = v12;
                        v8 = v5;
                        v9 = 3;
                        v11 = v1;
                        z11 = true;
                    }
                    else {
                        v9 = 4;
                        v10 = v12;
                        v8 = v5;
                        v11 = v1;
                        z11 = false;
                    }
                }
            }
        }
        else {
            arr_z1 = arr_z;
        label_173:
            v8 = v5;
            v9 = v6;
            v11 = v1;
            v10 = v3;
            z11 = false;
        }
        int[] arr_v = this.mResolvedMatchConstraintDefault;
        arr_v[0] = v8;
        arr_v[1] = v9;
        boolean z12 = z11 && (this.j == -1 || this.j == 0);
        boolean z13 = z11 && (this.j == -1 || this.j == 1);
        DimensionBehaviour constraintWidget$DimensionBehaviour3 = DimensionBehaviour.WRAP_CONTENT;
        boolean z14 = this.mListDimensionBehaviors[0] == constraintWidget$DimensionBehaviour3 && this instanceof ConstraintWidgetContainer;
        boolean z15 = this.mCenter.isConnected();
        boolean z16 = arr_z1[0];
        boolean z17 = arr_z1[1];
        if(this.mHorizontalResolution == 2 || this.e) {
            z18 = z4;
            z19 = z3;
            constraintWidget$DimensionBehaviour4 = constraintWidget$DimensionBehaviour1;
            constraintWidget$DimensionBehaviour5 = constraintWidget$DimensionBehaviour3;
        }
        else if(z) {
            HorizontalWidgetRun horizontalWidgetRun1 = this.horizontalRun;
            if(horizontalWidgetRun1 != null) {
                DependencyNode dependencyNode1 = horizontalWidgetRun1.start;
                if(dependencyNode1.resolved && horizontalWidgetRun1.end.resolved) {
                    linearSystem0.addEquality(solverVariable0, dependencyNode1.value);
                    linearSystem0.addEquality(solverVariable1, this.horizontalRun.end.value);
                    if(this.mParent != null && z4 && this.isTerminalWidget[0] && !this.isInHorizontalChain()) {
                        linearSystem0.addGreaterThan(linearSystem0.createObjectVariable(this.mParent.mRight), solverVariable1, 0, 8);
                    }
                    z18 = z4;
                    z19 = z3;
                    constraintWidget$DimensionBehaviour4 = constraintWidget$DimensionBehaviour1;
                    constraintWidget$DimensionBehaviour5 = constraintWidget$DimensionBehaviour3;
                    goto label_215;
                }
            }
            goto label_203;
        }
        else {
        label_203:
            SolverVariable solverVariable5 = this.mParent == null ? null : linearSystem0.createObjectVariable(this.mParent.mRight);
            SolverVariable solverVariable6 = this.mParent == null ? null : linearSystem0.createObjectVariable(this.mParent.mLeft);
            z18 = z4;
            z19 = z3;
            constraintWidget$DimensionBehaviour4 = constraintWidget$DimensionBehaviour1;
            constraintWidget$DimensionBehaviour5 = constraintWidget$DimensionBehaviour3;
            this.b(linearSystem0, true, z4, z3, this.isTerminalWidget[0], solverVariable6, solverVariable5, this.mListDimensionBehaviors[0], z14, this.mLeft, this.mRight, this.mX, (z14 ? 0 : v11), this.mMinWidth, this.l[0], this.y, z12, this.mListDimensionBehaviors[1] == constraintWidget$DimensionBehaviour1, z9, z10, z16, v8, v9, this.mMatchConstraintMinWidth, this.mMatchConstraintMaxWidth, this.mMatchConstraintPercentWidth, !z15);
        }
    label_215:
        if(z) {
            VerticalWidgetRun verticalWidgetRun1 = this.verticalRun;
            if(verticalWidgetRun1 == null) {
                v13 = 1;
            }
            else {
                DependencyNode dependencyNode2 = verticalWidgetRun1.start;
                if(!dependencyNode2.resolved || !verticalWidgetRun1.end.resolved) {
                    v13 = 1;
                }
                else {
                    linearSystem0.addEquality(solverVariable2, dependencyNode2.value);
                    linearSystem0.addEquality(solverVariable3, this.verticalRun.end.value);
                    linearSystem0.addEquality(solverVariable4, this.verticalRun.baseline.value);
                    ConstraintWidget constraintWidget3 = this.mParent;
                    if(constraintWidget3 != null && !z10 && z19 && this.isTerminalWidget[1]) {
                        linearSystem0.addGreaterThan(linearSystem0.createObjectVariable(constraintWidget3.mBottom), solverVariable3, 0, 8);
                    }
                    v13 = 0;
                }
            }
        }
        else {
            v13 = 1;
        }
        if((this.mVerticalResolution == 2 ? 0 : v13) != 0 && !this.f) {
            boolean z20 = this.mListDimensionBehaviors[1] == constraintWidget$DimensionBehaviour5 && this instanceof ConstraintWidgetContainer;
            if(z20) {
                v10 = 0;
            }
            SolverVariable solverVariable7 = this.mParent == null ? null : linearSystem0.createObjectVariable(this.mParent.mBottom);
            SolverVariable solverVariable8 = this.mParent == null ? null : linearSystem0.createObjectVariable(this.mParent.mTop);
            if(this.x <= 0 && this.C != 8) {
            label_250:
                v14 = !z15;
            }
            else {
                ConstraintAnchor constraintAnchor2 = this.mBaseline;
                if(constraintAnchor2.mTarget == null) {
                    if(this.C == 8) {
                        linearSystem0.addEquality(solverVariable4, solverVariable2, constraintAnchor2.getMargin(), 8);
                    }
                    else {
                        linearSystem0.addEquality(solverVariable4, solverVariable2, this.getBaselineDistance(), 8);
                    }
                    goto label_250;
                }
                else {
                    linearSystem0.addEquality(solverVariable4, solverVariable2, this.getBaselineDistance(), 8);
                    linearSystem0.addEquality(solverVariable4, linearSystem0.createObjectVariable(this.mBaseline.mTarget), this.mBaseline.getMargin(), 8);
                    if(z19) {
                        linearSystem0.addGreaterThan(solverVariable7, linearSystem0.createObjectVariable(this.mBottom), 0, 5);
                    }
                    v14 = 0;
                }
            }
            this.b(linearSystem0, false, z19, z18, this.isTerminalWidget[1], solverVariable8, solverVariable7, this.mListDimensionBehaviors[1], z20, this.mTop, this.mBottom, this.mY, v10, this.mMinHeight, this.l[1], this.z, z13, this.mListDimensionBehaviors[0] == constraintWidget$DimensionBehaviour4, z10, z9, z17, v9, v8, this.mMatchConstraintMinHeight, this.mMatchConstraintMaxHeight, this.mMatchConstraintPercentHeight, ((boolean)v14));
        }
        if(z11) {
            if(this.j == 1) {
                linearSystem0.addRatio(solverVariable3, solverVariable2, solverVariable1, solverVariable0, this.k, 8);
            }
            else {
                linearSystem0.addRatio(solverVariable1, solverVariable0, solverVariable3, solverVariable2, this.k, 8);
            }
        }
        if(this.mCenter.isConnected()) {
            linearSystem0.addCenterPoint(this, this.mCenter.getTarget().getOwner(), ((float)Math.toRadians(this.m + 90.0f)), this.mCenter.getMargin());
        }
        this.e = false;
        this.f = false;
    }

    public boolean allowedInBarrier() {
        return this.C != 8;
    }

    public final void b(LinearSystem linearSystem0, boolean z, boolean z1, boolean z2, boolean z3, SolverVariable solverVariable0, SolverVariable solverVariable1, DimensionBehaviour constraintWidget$DimensionBehaviour0, boolean z4, ConstraintAnchor constraintAnchor0, ConstraintAnchor constraintAnchor1, int v, int v1, int v2, int v3, float f, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, int v4, int v5, int v6, int v7, float f1, boolean z10) {
        int v41;
        ConstraintWidget constraintWidget5;
        ConstraintWidget constraintWidget4;
        ConstraintWidget constraintWidget3;
        int v40;
        int v39;
        int v38;
        int v37;
        int v36;
        int v35;
        int v33;
        int v32;
        int v31;
        int v30;
        int v29;
        int v28;
        int v27;
        int v26;
        int v25;
        int v24;
        int v23;
        int v21;
        boolean z14;
        int v20;
        SolverVariable solverVariable7;
        SolverVariable solverVariable6;
        int v19;
        boolean z13;
        int v17;
        int v16;
        int v15;
        int v12;
        int v11;
        SolverVariable solverVariable2 = linearSystem0.createObjectVariable(constraintAnchor0);
        SolverVariable solverVariable3 = linearSystem0.createObjectVariable(constraintAnchor1);
        SolverVariable solverVariable4 = linearSystem0.createObjectVariable(constraintAnchor0.getTarget());
        SolverVariable solverVariable5 = linearSystem0.createObjectVariable(constraintAnchor1.getTarget());
        if(LinearSystem.getMetrics() != null) {
            Metrics metrics0 = LinearSystem.getMetrics();
            ++metrics0.nonresolvedWidgets;
        }
        int v8 = constraintAnchor0.isConnected();
        boolean z11 = constraintAnchor1.isConnected();
        boolean z12 = this.mCenter.isConnected();
        int v9 = z11 ? v8 + 1 : v8;
        if(z12) {
            ++v9;
        }
        int v10 = z5 ? 3 : v4;
        if(b.b[constraintWidget$DimensionBehaviour0.ordinal()] == 4) {
            v11 = v10;
            v12 = v11 == 4 ? 0 : 1;
        }
        else {
            v11 = v10;
            v12 = 0;
        }
        int v13 = this.c;
        if(v13 == -1 || !z) {
            v13 = v1;
        }
        else {
            this.c = -1;
            v12 = 0;
        }
        int v14 = this.d;
        if(v14 == -1 || z) {
            v14 = v13;
        }
        else {
            this.d = -1;
            v12 = 0;
        }
        if(this.C == 8) {
            v14 = 0;
            v12 = 0;
        }
        if(z10) {
            if(v8 == 0 && !z11 && !z12) {
                linearSystem0.addEquality(solverVariable2, v);
            }
            else if(v8 != 0 && !z11) {
                linearSystem0.addEquality(solverVariable2, solverVariable4, constraintAnchor0.getMargin(), 8);
            }
        }
        if(v12 == 0) {
            if(z4) {
                linearSystem0.addEquality(solverVariable3, solverVariable2, 0, 3);
                if(v2 > 0) {
                    linearSystem0.addGreaterThan(solverVariable3, solverVariable2, v2, 8);
                }
                if(v3 < 0x7FFFFFFF) {
                    linearSystem0.addLowerThan(solverVariable3, solverVariable2, v3, 8);
                }
            }
            else {
                linearSystem0.addEquality(solverVariable3, solverVariable2, v14, 8);
            }
            v15 = v6;
            v16 = v7;
            v17 = 0;
            z13 = z3;
            v19 = v9;
        }
        else if(v9 == 2 || z5 || v11 != 0 && v11 != 1) {
            int v18 = v6 == -2 ? v14 : v6;
            v16 = v7 == -2 ? v14 : v7;
            if(v14 > 0 && v11 != 1) {
                v14 = 0;
            }
            if(v18 > 0) {
                linearSystem0.addGreaterThan(solverVariable3, solverVariable2, v18, 8);
                v14 = Math.max(v14, v18);
            }
            if(v16 > 0) {
                if(!z1 || v11 != 1) {
                    linearSystem0.addLowerThan(solverVariable3, solverVariable2, v16, 8);
                }
                v14 = Math.min(v14, v16);
            }
            if(v11 == 1) {
                if(z1) {
                    linearSystem0.addEquality(solverVariable3, solverVariable2, v14, 8);
                }
                else {
                    if(!z7) {
                    }
                    linearSystem0.addEquality(solverVariable3, solverVariable2, v14, 5);
                    linearSystem0.addLowerThan(solverVariable3, solverVariable2, v14, 8);
                }
                v15 = v18;
                v17 = v12;
                z13 = z3;
                v19 = v9;
            }
            else if(v11 == 2) {
                Type constraintAnchor$Type0 = Type.TOP;
                if(constraintAnchor0.getType() == constraintAnchor$Type0 || constraintAnchor0.getType() == Type.BOTTOM) {
                    solverVariable6 = linearSystem0.createObjectVariable(this.mParent.getAnchor(constraintAnchor$Type0));
                    solverVariable7 = linearSystem0.createObjectVariable(this.mParent.getAnchor(Type.BOTTOM));
                }
                else {
                    solverVariable6 = linearSystem0.createObjectVariable(this.mParent.getAnchor(Type.LEFT));
                    solverVariable7 = linearSystem0.createObjectVariable(this.mParent.getAnchor(Type.RIGHT));
                }
                v19 = v9;
                linearSystem0.addConstraint(linearSystem0.createRow().createRowDimensionRatio(solverVariable3, solverVariable2, solverVariable7, solverVariable6, f1));
                if(z1) {
                    v12 = 0;
                }
                v15 = v18;
                v17 = v12;
                z13 = z3;
            }
            else {
                v19 = v9;
                v15 = v18;
                v17 = v12;
                z13 = true;
            }
        }
        else {
            linearSystem0.addEquality(solverVariable3, solverVariable2, (v7 <= 0 ? Math.max(v6, v14) : Math.min(v7, Math.max(v6, v14))), 8);
            z13 = z3;
            v15 = v6;
            v16 = v7;
            v17 = 0;
            v19 = v9;
        }
        if(z10) {
            if(z7) {
                v20 = v19;
                goto label_310;
            }
            if(v8 == 0 && !z11 && !z12) {
            label_302:
                z14 = z1;
                v21 = 5;
            }
            else if(v8 != 0 && !z11) {
                z14 = z1;
                v21 = !z1 || !(constraintAnchor0.mTarget.mOwner instanceof Barrier) ? 5 : 8;
            }
            else {
                if(v8 == 0 && z11) {
                    linearSystem0.addEquality(solverVariable3, solverVariable5, -constraintAnchor1.getMargin(), 8);
                    if(z1) {
                        linearSystem0.addGreaterThan(solverVariable2, solverVariable0, 0, 5);
                    }
                    goto label_302;
                }
                else if(v8 == 0 || !z11) {
                    goto label_302;
                }
                else {
                    ConstraintWidget constraintWidget0 = constraintAnchor0.mTarget.mOwner;
                    ConstraintWidget constraintWidget1 = constraintAnchor1.mTarget.mOwner;
                    ConstraintWidget constraintWidget2 = this.getParent();
                    int v22 = 6;
                    if(v17 == 0) {
                        if(solverVariable4.isFinalValue && solverVariable5.isFinalValue) {
                            linearSystem0.addCentering(solverVariable2, solverVariable4, constraintAnchor0.getMargin(), f, solverVariable5, solverVariable3, constraintAnchor1.getMargin(), 8);
                            if(z1 && z13) {
                                int v34 = constraintAnchor1.mTarget == null ? 0 : constraintAnchor1.getMargin();
                                if(solverVariable5 != solverVariable1) {
                                    linearSystem0.addGreaterThan(solverVariable1, solverVariable3, v34, 5);
                                }
                            }
                            return;
                        }
                    label_227:
                        v32 = 6;
                        v31 = 5;
                    label_229:
                        v30 = 4;
                    label_230:
                        v29 = 1;
                        v27 = 1;
                        v28 = 0;
                    }
                    else if(v11 == 0) {
                        if(v16 != 0 || v15 != 0) {
                            v26 = 1;
                            v27 = 1;
                            v24 = 5;
                            v25 = 5;
                            v23 = 0;
                        }
                        else {
                            if(solverVariable4.isFinalValue && solverVariable5.isFinalValue) {
                                linearSystem0.addEquality(solverVariable2, solverVariable4, constraintAnchor0.getMargin(), 8);
                                linearSystem0.addEquality(solverVariable3, solverVariable5, -constraintAnchor1.getMargin(), 8);
                                return;
                            }
                            v23 = 1;
                            v24 = 8;
                            v25 = 8;
                            v26 = 0;
                            v27 = 0;
                        }
                        if(constraintWidget0 instanceof Barrier || constraintWidget1 instanceof Barrier) {
                            v31 = v24;
                            v32 = 6;
                            v28 = v23;
                            v29 = v26;
                            v30 = 4;
                        }
                        else {
                            v28 = v23;
                            v29 = v26;
                            v30 = v25;
                            v31 = v24;
                            v32 = 6;
                        }
                    }
                    else {
                        switch(v11) {
                            case 1: {
                                v32 = 6;
                                v31 = 8;
                                goto label_229;
                            }
                            case 2: {
                                if(constraintWidget0 instanceof Barrier || constraintWidget1 instanceof Barrier) {
                                    goto label_227;
                                }
                                else {
                                    v32 = 6;
                                    v31 = 5;
                                    v30 = 5;
                                    goto label_230;
                                }
                                break;
                            }
                            case 3: {
                                if(this.j == -1) {
                                    if(!z8) {
                                        v32 = 8;
                                    }
                                    else if(z1) {
                                        v32 = 5;
                                    }
                                    else {
                                        v32 = 4;
                                    }
                                    v31 = 8;
                                    v30 = 5;
                                    v29 = 1;
                                    v27 = 1;
                                    v28 = 1;
                                    break;
                                }
                                else if(z5) {
                                    if(v5 == 1 || v5 == 2) {
                                        v24 = 5;
                                        v33 = 4;
                                    }
                                    else {
                                        v24 = 8;
                                        v33 = 5;
                                    }
                                    v30 = v33;
                                    v29 = 1;
                                    v27 = 1;
                                    v28 = 1;
                                    v31 = v24;
                                    v32 = 6;
                                }
                                else {
                                    if(v16 > 0) {
                                        v32 = 6;
                                        v31 = 5;
                                        v30 = 5;
                                    }
                                    else if(v16 != 0 || v15 != 0) {
                                        v32 = 6;
                                        v31 = 5;
                                        v30 = 4;
                                    }
                                    else if(!z8) {
                                        v32 = 6;
                                        v31 = 5;
                                        v30 = 8;
                                    }
                                    else {
                                        v31 = constraintWidget0 == constraintWidget2 || constraintWidget1 == constraintWidget2 ? 5 : 4;
                                        v32 = 6;
                                        v30 = 4;
                                    }
                                    v29 = 1;
                                    v27 = 1;
                                    v28 = 1;
                                }
                                break;
                            }
                            default: {
                                v32 = 6;
                                v31 = 5;
                                v30 = 4;
                                v29 = 0;
                                v27 = 0;
                                v28 = 0;
                            }
                        }
                    }
                    if(v27 == 0 || solverVariable4 != solverVariable5 || constraintWidget0 == constraintWidget2) {
                        v36 = v27;
                        v35 = 1;
                    }
                    else {
                        v35 = 0;
                        v36 = 0;
                    }
                    if(v29 == 0) {
                        v40 = v11;
                        constraintWidget3 = constraintWidget2;
                        constraintWidget4 = constraintWidget1;
                        z14 = z1;
                    }
                    else {
                        if(v17 != 0 || z6 || z8 || solverVariable4 != solverVariable0 || solverVariable5 != solverVariable1) {
                            z14 = z1;
                            v38 = v32;
                            v39 = v35;
                            v37 = v31;
                        }
                        else {
                            z14 = false;
                            v37 = 8;
                            v38 = 8;
                            v39 = 0;
                        }
                        v40 = v11;
                        constraintWidget3 = constraintWidget2;
                        constraintWidget4 = constraintWidget1;
                        linearSystem0.addCentering(solverVariable2, solverVariable4, constraintAnchor0.getMargin(), f, solverVariable5, solverVariable3, constraintAnchor1.getMargin(), v38);
                        v31 = v37;
                        v35 = v39;
                    }
                    if(this.C == 8 && !constraintAnchor1.hasDependents()) {
                        return;
                    }
                    if(v36 != 0) {
                        if(z14 && solverVariable4 != solverVariable5 && v17 == 0 && (constraintWidget0 instanceof Barrier || constraintWidget4 instanceof Barrier)) {
                            v31 = 6;
                        }
                        linearSystem0.addGreaterThan(solverVariable2, solverVariable4, constraintAnchor0.getMargin(), v31);
                        linearSystem0.addLowerThan(solverVariable3, solverVariable5, -constraintAnchor1.getMargin(), v31);
                    }
                    if(!z14 || !z9 || constraintWidget0 instanceof Barrier || constraintWidget4 instanceof Barrier) {
                        constraintWidget5 = constraintWidget3;
                        v41 = v30;
                    }
                    else {
                        constraintWidget5 = constraintWidget3;
                        if(constraintWidget4 == constraintWidget5) {
                            v41 = v30;
                        }
                        else {
                            v31 = 6;
                            v41 = 6;
                            v35 = 1;
                        }
                    }
                    if(v35 != 0) {
                        if(v28 != 0 && (!z8 || z2)) {
                            if(constraintWidget0 != constraintWidget5 && constraintWidget4 != constraintWidget5) {
                                v22 = v41;
                            }
                            if(constraintWidget0 instanceof Guideline || constraintWidget4 instanceof Guideline) {
                                v22 = 5;
                            }
                            if(constraintWidget0 instanceof Barrier || constraintWidget4 instanceof Barrier) {
                                v22 = 5;
                            }
                            v41 = Math.max((z8 ? 5 : v22), v41);
                        }
                        if(z14) {
                            v41 = !z5 || z8 || constraintWidget0 != constraintWidget5 && constraintWidget4 != constraintWidget5 ? Math.min(v31, v41) : 4;
                        }
                        linearSystem0.addEquality(solverVariable2, solverVariable4, constraintAnchor0.getMargin(), v41);
                        linearSystem0.addEquality(solverVariable3, solverVariable5, -constraintAnchor1.getMargin(), v41);
                    }
                    if(z14) {
                        int v42 = solverVariable0 == solverVariable4 ? constraintAnchor0.getMargin() : 0;
                        if(solverVariable4 != solverVariable0) {
                            linearSystem0.addGreaterThan(solverVariable2, solverVariable0, v42, 5);
                        }
                    }
                    if(z14 && v17 != 0 && v2 == 0 && v15 == 0) {
                        if(v17 == 0 || v40 != 3) {
                            linearSystem0.addGreaterThan(solverVariable3, solverVariable2, 0, 5);
                        }
                        else {
                            linearSystem0.addGreaterThan(solverVariable3, solverVariable2, 0, 8);
                        }
                    }
                }
                v21 = 5;
            }
            if(z14 && z13) {
                int v43 = constraintAnchor1.mTarget == null ? 0 : constraintAnchor1.getMargin();
                if(solverVariable5 != solverVariable1) {
                    linearSystem0.addGreaterThan(solverVariable1, solverVariable3, v43, v21);
                }
            }
            return;
        }
        else {
            v20 = v19;
        }
    label_310:
        if(v20 < 2 && z1 && z13) {
            linearSystem0.addGreaterThan(solverVariable2, solverVariable0, 0, 8);
            boolean z15 = z || this.mBaseline.mTarget == null;
            if(!z) {
                ConstraintAnchor constraintAnchor2 = this.mBaseline.mTarget;
                if(constraintAnchor2 != null) {
                    z15 = constraintAnchor2.mOwner.mDimensionRatio != 0.0f && (constraintAnchor2.mOwner.mListDimensionBehaviors[0] == DimensionBehaviour.MATCH_CONSTRAINT && constraintAnchor2.mOwner.mListDimensionBehaviors[1] == DimensionBehaviour.MATCH_CONSTRAINT);
                }
            }
            if(z15) {
                linearSystem0.addGreaterThan(solverVariable1, solverVariable3, 0, 8);
            }
        }
    }

    public static void c(StringBuilder stringBuilder0, String s, int v, int v1, int v2, int v3, int v4, float f) {
        stringBuilder0.append(s);
        stringBuilder0.append(" :  {\n");
        ConstraintWidget.g(v, 0, "      size", stringBuilder0);
        ConstraintWidget.g(v1, 0, "      min", stringBuilder0);
        ConstraintWidget.g(v2, 0x7FFFFFFF, "      max", stringBuilder0);
        ConstraintWidget.g(v3, 0, "      matchMin", stringBuilder0);
        ConstraintWidget.g(v4, 0, "      matchDef", stringBuilder0);
        ConstraintWidget.h(stringBuilder0, "      matchPercent", f, 1.0f);
        stringBuilder0.append("    },\n");
    }

    public void connect(Type constraintAnchor$Type0, ConstraintWidget constraintWidget0, Type constraintAnchor$Type1) {
        this.connect(constraintAnchor$Type0, constraintWidget0, constraintAnchor$Type1, 0);
    }

    public void connect(Type constraintAnchor$Type0, ConstraintWidget constraintWidget0, Type constraintAnchor$Type1, int v) {
        boolean z1;
        Type constraintAnchor$Type2 = Type.CENTER;
        if(constraintAnchor$Type0 != constraintAnchor$Type2) {
            Type constraintAnchor$Type9 = Type.CENTER_X;
            if(constraintAnchor$Type0 == constraintAnchor$Type9) {
                Type constraintAnchor$Type10 = Type.LEFT;
                if(constraintAnchor$Type1 == constraintAnchor$Type10 || constraintAnchor$Type1 == Type.RIGHT) {
                    ConstraintAnchor constraintAnchor4 = this.getAnchor(constraintAnchor$Type10);
                    ConstraintAnchor constraintAnchor5 = constraintWidget0.getAnchor(constraintAnchor$Type1);
                    ConstraintAnchor constraintAnchor6 = this.getAnchor(Type.RIGHT);
                    constraintAnchor4.connect(constraintAnchor5, 0);
                    constraintAnchor6.connect(constraintAnchor5, 0);
                    this.getAnchor(constraintAnchor$Type9).connect(constraintAnchor5, 0);
                    return;
                }
            }
            Type constraintAnchor$Type11 = Type.CENTER_Y;
            if(constraintAnchor$Type0 == constraintAnchor$Type11) {
                Type constraintAnchor$Type12 = Type.TOP;
                if(constraintAnchor$Type1 == constraintAnchor$Type12 || constraintAnchor$Type1 == Type.BOTTOM) {
                    ConstraintAnchor constraintAnchor7 = constraintWidget0.getAnchor(constraintAnchor$Type1);
                    this.getAnchor(constraintAnchor$Type12).connect(constraintAnchor7, 0);
                    this.getAnchor(Type.BOTTOM).connect(constraintAnchor7, 0);
                    this.getAnchor(constraintAnchor$Type11).connect(constraintAnchor7, 0);
                    return;
                }
            }
            if(constraintAnchor$Type0 == constraintAnchor$Type9 && constraintAnchor$Type1 == constraintAnchor$Type9) {
                this.getAnchor(Type.LEFT).connect(constraintWidget0.getAnchor(Type.LEFT), 0);
                this.getAnchor(Type.RIGHT).connect(constraintWidget0.getAnchor(Type.RIGHT), 0);
                this.getAnchor(constraintAnchor$Type9).connect(constraintWidget0.getAnchor(constraintAnchor$Type1), 0);
                return;
            }
            if(constraintAnchor$Type0 == constraintAnchor$Type11 && constraintAnchor$Type1 == constraintAnchor$Type11) {
                this.getAnchor(Type.TOP).connect(constraintWidget0.getAnchor(Type.TOP), 0);
                this.getAnchor(Type.BOTTOM).connect(constraintWidget0.getAnchor(Type.BOTTOM), 0);
                this.getAnchor(constraintAnchor$Type11).connect(constraintWidget0.getAnchor(constraintAnchor$Type1), 0);
                return;
            }
            ConstraintAnchor constraintAnchor8 = this.getAnchor(constraintAnchor$Type0);
            ConstraintAnchor constraintAnchor9 = constraintWidget0.getAnchor(constraintAnchor$Type1);
            if(constraintAnchor8.isValidConnection(constraintAnchor9)) {
                Type constraintAnchor$Type13 = Type.BASELINE;
                if(constraintAnchor$Type0 == constraintAnchor$Type13) {
                    ConstraintAnchor constraintAnchor10 = this.getAnchor(Type.TOP);
                    ConstraintAnchor constraintAnchor11 = this.getAnchor(Type.BOTTOM);
                    if(constraintAnchor10 != null) {
                        constraintAnchor10.reset();
                    }
                    if(constraintAnchor11 != null) {
                        constraintAnchor11.reset();
                    }
                }
                else if(constraintAnchor$Type0 == Type.TOP || constraintAnchor$Type0 == Type.BOTTOM) {
                    ConstraintAnchor constraintAnchor15 = this.getAnchor(constraintAnchor$Type13);
                    if(constraintAnchor15 != null) {
                        constraintAnchor15.reset();
                    }
                    ConstraintAnchor constraintAnchor16 = this.getAnchor(constraintAnchor$Type2);
                    if(constraintAnchor16.getTarget() != constraintAnchor9) {
                        constraintAnchor16.reset();
                    }
                    ConstraintAnchor constraintAnchor17 = this.getAnchor(constraintAnchor$Type0).getOpposite();
                    ConstraintAnchor constraintAnchor18 = this.getAnchor(constraintAnchor$Type11);
                    if(constraintAnchor18.isConnected()) {
                        constraintAnchor17.reset();
                        constraintAnchor18.reset();
                    }
                }
                else if(constraintAnchor$Type0 == Type.LEFT || constraintAnchor$Type0 == Type.RIGHT) {
                    ConstraintAnchor constraintAnchor12 = this.getAnchor(constraintAnchor$Type2);
                    if(constraintAnchor12.getTarget() != constraintAnchor9) {
                        constraintAnchor12.reset();
                    }
                    ConstraintAnchor constraintAnchor13 = this.getAnchor(constraintAnchor$Type0).getOpposite();
                    ConstraintAnchor constraintAnchor14 = this.getAnchor(constraintAnchor$Type9);
                    if(constraintAnchor14.isConnected()) {
                        constraintAnchor13.reset();
                        constraintAnchor14.reset();
                    }
                }
                constraintAnchor8.connect(constraintAnchor9, v);
            }
        }
        else if(constraintAnchor$Type1 == constraintAnchor$Type2) {
            Type constraintAnchor$Type3 = Type.LEFT;
            ConstraintAnchor constraintAnchor0 = this.getAnchor(constraintAnchor$Type3);
            Type constraintAnchor$Type4 = Type.RIGHT;
            ConstraintAnchor constraintAnchor1 = this.getAnchor(constraintAnchor$Type4);
            Type constraintAnchor$Type5 = Type.TOP;
            ConstraintAnchor constraintAnchor2 = this.getAnchor(constraintAnchor$Type5);
            Type constraintAnchor$Type6 = Type.BOTTOM;
            ConstraintAnchor constraintAnchor3 = this.getAnchor(constraintAnchor$Type6);
            boolean z = true;
            if((constraintAnchor0 == null || !constraintAnchor0.isConnected()) && (constraintAnchor1 == null || !constraintAnchor1.isConnected())) {
                this.connect(constraintAnchor$Type3, constraintWidget0, constraintAnchor$Type3, 0);
                this.connect(constraintAnchor$Type4, constraintWidget0, constraintAnchor$Type4, 0);
                z1 = true;
            }
            else {
                z1 = false;
            }
            if((constraintAnchor2 == null || !constraintAnchor2.isConnected()) && (constraintAnchor3 == null || !constraintAnchor3.isConnected())) {
                this.connect(constraintAnchor$Type5, constraintWidget0, constraintAnchor$Type5, 0);
                this.connect(constraintAnchor$Type6, constraintWidget0, constraintAnchor$Type6, 0);
            }
            else {
                z = false;
            }
            if(z1 && z) {
                this.getAnchor(constraintAnchor$Type2).connect(constraintWidget0.getAnchor(constraintAnchor$Type2), 0);
                return;
            }
            if(z1) {
                this.getAnchor(Type.CENTER_X).connect(constraintWidget0.getAnchor(Type.CENTER_X), 0);
                return;
            }
            if(z) {
                this.getAnchor(Type.CENTER_Y).connect(constraintWidget0.getAnchor(Type.CENTER_Y), 0);
            }
        }
        else {
            Type constraintAnchor$Type7 = Type.LEFT;
            if(constraintAnchor$Type1 == constraintAnchor$Type7 || constraintAnchor$Type1 == Type.RIGHT) {
                this.connect(constraintAnchor$Type7, constraintWidget0, constraintAnchor$Type1, 0);
                this.connect(Type.RIGHT, constraintWidget0, constraintAnchor$Type1, 0);
                this.getAnchor(constraintAnchor$Type2).connect(constraintWidget0.getAnchor(constraintAnchor$Type1), 0);
                return;
            }
            Type constraintAnchor$Type8 = Type.TOP;
            if(constraintAnchor$Type1 == constraintAnchor$Type8 || constraintAnchor$Type1 == Type.BOTTOM) {
                this.connect(constraintAnchor$Type8, constraintWidget0, constraintAnchor$Type1, 0);
                this.connect(Type.BOTTOM, constraintWidget0, constraintAnchor$Type1, 0);
                this.getAnchor(constraintAnchor$Type2).connect(constraintWidget0.getAnchor(constraintAnchor$Type1), 0);
            }
        }
    }

    public void connect(ConstraintAnchor constraintAnchor0, ConstraintAnchor constraintAnchor1, int v) {
        if(constraintAnchor0.getOwner() == this) {
            this.connect(constraintAnchor0.getType(), constraintAnchor1.getOwner(), constraintAnchor1.getType(), v);
        }
    }

    public void connectCircularConstraint(ConstraintWidget constraintWidget0, float f, int v) {
        this.immediateConnect(Type.CENTER, constraintWidget0, Type.CENTER, v, 0);
        this.m = f;
    }

    public void copy(ConstraintWidget constraintWidget0, HashMap hashMap0) {
        this.mHorizontalResolution = constraintWidget0.mHorizontalResolution;
        this.mVerticalResolution = constraintWidget0.mVerticalResolution;
        this.mMatchConstraintDefaultWidth = constraintWidget0.mMatchConstraintDefaultWidth;
        this.mMatchConstraintDefaultHeight = constraintWidget0.mMatchConstraintDefaultHeight;
        int[] arr_v = this.mResolvedMatchConstraintDefault;
        int[] arr_v1 = constraintWidget0.mResolvedMatchConstraintDefault;
        arr_v[0] = arr_v1[0];
        arr_v[1] = arr_v1[1];
        this.mMatchConstraintMinWidth = constraintWidget0.mMatchConstraintMinWidth;
        this.mMatchConstraintMaxWidth = constraintWidget0.mMatchConstraintMaxWidth;
        this.mMatchConstraintMinHeight = constraintWidget0.mMatchConstraintMinHeight;
        this.mMatchConstraintMaxHeight = constraintWidget0.mMatchConstraintMaxHeight;
        this.mMatchConstraintPercentHeight = constraintWidget0.mMatchConstraintPercentHeight;
        this.mIsWidthWrapContent = constraintWidget0.mIsWidthWrapContent;
        this.mIsHeightWrapContent = constraintWidget0.mIsHeightWrapContent;
        this.j = constraintWidget0.j;
        this.k = constraintWidget0.k;
        this.l = Arrays.copyOf(constraintWidget0.l, constraintWidget0.l.length);
        this.m = constraintWidget0.m;
        this.n = constraintWidget0.n;
        this.o = constraintWidget0.o;
        this.mLeft.reset();
        this.mTop.reset();
        this.mRight.reset();
        this.mBottom.reset();
        this.mBaseline.reset();
        this.s.reset();
        this.t.reset();
        this.mCenter.reset();
        this.mListDimensionBehaviors = (DimensionBehaviour[])Arrays.copyOf(this.mListDimensionBehaviors, 2);
        ConstraintWidget constraintWidget1 = null;
        this.mParent = this.mParent == null ? null : ((ConstraintWidget)hashMap0.get(constraintWidget0.mParent));
        this.v = constraintWidget0.v;
        this.w = constraintWidget0.w;
        this.mDimensionRatio = constraintWidget0.mDimensionRatio;
        this.mDimensionRatioSide = constraintWidget0.mDimensionRatioSide;
        this.mX = constraintWidget0.mX;
        this.mY = constraintWidget0.mY;
        this.mOffsetX = constraintWidget0.mOffsetX;
        this.mOffsetY = constraintWidget0.mOffsetY;
        this.x = constraintWidget0.x;
        this.mMinWidth = constraintWidget0.mMinWidth;
        this.mMinHeight = constraintWidget0.mMinHeight;
        this.y = constraintWidget0.y;
        this.z = constraintWidget0.z;
        this.A = constraintWidget0.A;
        this.B = constraintWidget0.B;
        this.C = constraintWidget0.C;
        this.D = constraintWidget0.D;
        this.E = constraintWidget0.E;
        this.F = constraintWidget0.F;
        this.G = constraintWidget0.G;
        this.H = constraintWidget0.H;
        float[] arr_f = this.mWeight;
        float[] arr_f1 = constraintWidget0.mWeight;
        arr_f[0] = arr_f1[0];
        arr_f[1] = arr_f1[1];
        ConstraintWidget[] arr_constraintWidget = this.mListNextMatchConstraintsWidget;
        ConstraintWidget[] arr_constraintWidget1 = constraintWidget0.mListNextMatchConstraintsWidget;
        arr_constraintWidget[0] = arr_constraintWidget1[0];
        arr_constraintWidget[1] = arr_constraintWidget1[1];
        ConstraintWidget[] arr_constraintWidget2 = this.mNextChainWidget;
        ConstraintWidget[] arr_constraintWidget3 = constraintWidget0.mNextChainWidget;
        arr_constraintWidget2[0] = arr_constraintWidget3[0];
        arr_constraintWidget2[1] = arr_constraintWidget3[1];
        this.I = constraintWidget0.I == null ? null : ((ConstraintWidget)hashMap0.get(constraintWidget0.I));
        ConstraintWidget constraintWidget2 = constraintWidget0.J;
        if(constraintWidget2 != null) {
            constraintWidget1 = (ConstraintWidget)hashMap0.get(constraintWidget2);
        }
        this.J = constraintWidget1;
    }

    public void createObjectVariables(LinearSystem linearSystem0) {
        linearSystem0.createObjectVariable(this.mLeft);
        linearSystem0.createObjectVariable(this.mTop);
        linearSystem0.createObjectVariable(this.mRight);
        linearSystem0.createObjectVariable(this.mBottom);
        if(this.x > 0) {
            linearSystem0.createObjectVariable(this.mBaseline);
        }
    }

    public static void d(StringBuilder stringBuilder0, String s, ConstraintAnchor constraintAnchor0) {
        if(constraintAnchor0.mTarget == null) {
            return;
        }
        stringBuilder0.append("    ");
        stringBuilder0.append(s);
        stringBuilder0.append(" : [ \'");
        stringBuilder0.append(constraintAnchor0.mTarget);
        stringBuilder0.append("\'");
        if(constraintAnchor0.d != 0x80000000 || constraintAnchor0.mMargin != 0) {
            stringBuilder0.append(",");
            stringBuilder0.append(constraintAnchor0.mMargin);
            if(constraintAnchor0.d != 0x80000000) {
                stringBuilder0.append(",");
                stringBuilder0.append(constraintAnchor0.d);
                stringBuilder0.append(",");
            }
        }
        stringBuilder0.append(" ] ,\n");
    }

    public final boolean e(int v) {
        ConstraintAnchor[] arr_constraintAnchor = this.mListAnchors;
        ConstraintAnchor constraintAnchor0 = arr_constraintAnchor[v * 2];
        if(constraintAnchor0.mTarget != null && constraintAnchor0.mTarget.mTarget != constraintAnchor0) {
            ConstraintAnchor constraintAnchor1 = arr_constraintAnchor[v * 2 + 1];
            return constraintAnchor1.mTarget != null && constraintAnchor1.mTarget.mTarget == constraintAnchor1;
        }
        return false;
    }

    public void ensureMeasureRequested() {
        this.a = true;
    }

    public void ensureWidgetRuns() {
        if(this.horizontalRun == null) {
            this.horizontalRun = new HorizontalWidgetRun(this);
        }
        if(this.verticalRun == null) {
            this.verticalRun = new VerticalWidgetRun(this);
        }
    }

    public static void f(StringBuilder stringBuilder0, String s, ConstraintAnchor constraintAnchor0) {
        if(constraintAnchor0.mTarget == null) {
            return;
        }
        stringBuilder0.append(s);
        stringBuilder0.append(" : [ \'");
        stringBuilder0.append(constraintAnchor0.mTarget);
        stringBuilder0.append("\',");
        stringBuilder0.append(constraintAnchor0.mMargin);
        stringBuilder0.append(",");
        stringBuilder0.append(constraintAnchor0.d);
        stringBuilder0.append(",");
        stringBuilder0.append(" ] ,\n");
    }

    public static void g(int v, int v1, String s, StringBuilder stringBuilder0) {
        if(v == v1) {
            return;
        }
        stringBuilder0.append(s);
        stringBuilder0.append(" :   ");
        stringBuilder0.append(v);
        stringBuilder0.append(",\n");
    }

    public ConstraintAnchor getAnchor(Type constraintAnchor$Type0) {
        switch(b.a[constraintAnchor$Type0.ordinal()]) {
            case 1: {
                return this.mLeft;
            }
            case 2: {
                return this.mTop;
            }
            case 3: {
                return this.mRight;
            }
            case 4: {
                return this.mBottom;
            }
            case 5: {
                return this.mBaseline;
            }
            case 6: {
                return this.mCenter;
            }
            case 7: {
                return this.s;
            }
            case 8: {
                return this.t;
            }
            case 9: {
                return null;
            }
            default: {
                throw new AssertionError(constraintAnchor$Type0.name());
            }
        }
    }

    public ArrayList getAnchors() {
        return this.mAnchors;
    }

    public int getBaselineDistance() {
        return this.x;
    }

    public float getBiasPercent(int v) {
        if(v == 0) {
            return this.y;
        }
        return v == 1 ? this.z : -1.0f;
    }

    public int getBottom() {
        return this.getY() + this.w;
    }

    public Object getCompanionWidget() {
        return this.A;
    }

    public int getContainerItemSkip() {
        return this.B;
    }

    public String getDebugName() {
        return this.E;
    }

    public DimensionBehaviour getDimensionBehaviour(int v) {
        if(v == 0) {
            return this.getHorizontalDimensionBehaviour();
        }
        return v == 1 ? this.getVerticalDimensionBehaviour() : null;
    }

    public float getDimensionRatio() {
        return this.mDimensionRatio;
    }

    public int getDimensionRatioSide() {
        return this.mDimensionRatioSide;
    }

    public boolean getHasBaseline() {
        return this.n;
    }

    public int getHeight() {
        return this.C == 8 ? 0 : this.w;
    }

    public float getHorizontalBiasPercent() {
        return this.y;
    }

    public ConstraintWidget getHorizontalChainControlWidget() {
        if(this.isInHorizontalChain()) {
            ConstraintWidget constraintWidget0 = this;
            ConstraintWidget constraintWidget1 = null;
            while(constraintWidget1 == null && constraintWidget0 != null) {
                ConstraintAnchor constraintAnchor0 = constraintWidget0.getAnchor(Type.LEFT);
                ConstraintAnchor constraintAnchor1 = constraintAnchor0 == null ? null : constraintAnchor0.getTarget();
                ConstraintWidget constraintWidget2 = constraintAnchor1 == null ? null : constraintAnchor1.getOwner();
                if(constraintWidget2 == this.getParent()) {
                    return constraintWidget0;
                }
                ConstraintAnchor constraintAnchor2 = constraintWidget2 == null ? null : constraintWidget2.getAnchor(Type.RIGHT).getTarget();
                if(constraintAnchor2 != null && constraintAnchor2.getOwner() != constraintWidget0) {
                    constraintWidget1 = constraintWidget0;
                }
                else {
                    constraintWidget0 = constraintWidget2;
                }
            }
            return constraintWidget1;
        }
        return null;
    }

    public int getHorizontalChainStyle() {
        return this.G;
    }

    public DimensionBehaviour getHorizontalDimensionBehaviour() {
        return this.mListDimensionBehaviors[0];
    }

    public int getHorizontalMargin() {
        int v = this.mLeft == null ? 0 : this.mLeft.mMargin;
        return this.mRight == null ? v : v + this.mRight.mMargin;
    }

    public int getLastHorizontalMeasureSpec() {
        return this.q;
    }

    public int getLastVerticalMeasureSpec() {
        return this.r;
    }

    public int getLeft() {
        return this.getX();
    }

    public int getLength(int v) {
        if(v == 0) {
            return this.getWidth();
        }
        return v == 1 ? this.getHeight() : 0;
    }

    public int getMaxHeight() {
        return this.l[1];
    }

    public int getMaxWidth() {
        return this.l[0];
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public ConstraintWidget getNextChainMember(int v) {
        if(v == 0) {
            ConstraintAnchor constraintAnchor0 = this.mRight.mTarget;
            return constraintAnchor0 == null || constraintAnchor0.mTarget != this.mRight ? null : constraintAnchor0.mOwner;
        }
        if(v == 1) {
            ConstraintAnchor constraintAnchor1 = this.mBottom.mTarget;
            return constraintAnchor1 == null || constraintAnchor1.mTarget != this.mBottom ? null : constraintAnchor1.mOwner;
        }
        return null;
    }

    public int getOptimizerWrapHeight() {
        int v = this.w;
        if(this.mListDimensionBehaviors[1] == DimensionBehaviour.MATCH_CONSTRAINT) {
            if(this.mMatchConstraintDefaultHeight == 1) {
                v = Math.max(this.mMatchConstraintMinHeight, v);
                return this.mMatchConstraintMaxHeight <= 0 || this.mMatchConstraintMaxHeight >= v ? v : this.mMatchConstraintMaxHeight;
            }
            v = this.mMatchConstraintMinHeight;
            if(v > 0) {
                this.w = v;
                return this.mMatchConstraintMaxHeight <= 0 || this.mMatchConstraintMaxHeight >= v ? v : this.mMatchConstraintMaxHeight;
            }
            return this.mMatchConstraintMaxHeight <= 0 || this.mMatchConstraintMaxHeight >= 0 ? 0 : this.mMatchConstraintMaxHeight;
        }
        return v;
    }

    public int getOptimizerWrapWidth() {
        int v = this.v;
        if(this.mListDimensionBehaviors[0] == DimensionBehaviour.MATCH_CONSTRAINT) {
            if(this.mMatchConstraintDefaultWidth == 1) {
                v = Math.max(this.mMatchConstraintMinWidth, v);
                return this.mMatchConstraintMaxWidth <= 0 || this.mMatchConstraintMaxWidth >= v ? v : this.mMatchConstraintMaxWidth;
            }
            v = this.mMatchConstraintMinWidth;
            if(v > 0) {
                this.v = v;
                return this.mMatchConstraintMaxWidth <= 0 || this.mMatchConstraintMaxWidth >= v ? v : this.mMatchConstraintMaxWidth;
            }
            return this.mMatchConstraintMaxWidth <= 0 || this.mMatchConstraintMaxWidth >= 0 ? 0 : this.mMatchConstraintMaxWidth;
        }
        return v;
    }

    public ConstraintWidget getParent() {
        return this.mParent;
    }

    public ConstraintWidget getPreviousChainMember(int v) {
        if(v == 0) {
            ConstraintAnchor constraintAnchor0 = this.mLeft.mTarget;
            return constraintAnchor0 == null || constraintAnchor0.mTarget != this.mLeft ? null : constraintAnchor0.mOwner;
        }
        if(v == 1) {
            ConstraintAnchor constraintAnchor1 = this.mTop.mTarget;
            return constraintAnchor1 == null || constraintAnchor1.mTarget != this.mTop ? null : constraintAnchor1.mOwner;
        }
        return null;
    }

    public int getRight() {
        return this.getX() + this.v;
    }

    public int getRootX() {
        return this.mX + this.mOffsetX;
    }

    public int getRootY() {
        return this.mY + this.mOffsetY;
    }

    public WidgetRun getRun(int v) {
        if(v == 0) {
            return this.horizontalRun;
        }
        return v == 1 ? this.verticalRun : null;
    }

    public void getSceneString(StringBuilder stringBuilder0) {
        stringBuilder0.append("  " + this.stringId + ":{\n");
        stringBuilder0.append("    actualWidth:" + this.v);
        stringBuilder0.append("\n");
        stringBuilder0.append("    actualHeight:" + this.w);
        stringBuilder0.append("\n");
        stringBuilder0.append("    actualLeft:" + this.mX);
        stringBuilder0.append("\n");
        stringBuilder0.append("    actualTop:" + this.mY);
        stringBuilder0.append("\n");
        ConstraintWidget.d(stringBuilder0, "left", this.mLeft);
        ConstraintWidget.d(stringBuilder0, "top", this.mTop);
        ConstraintWidget.d(stringBuilder0, "right", this.mRight);
        ConstraintWidget.d(stringBuilder0, "bottom", this.mBottom);
        ConstraintWidget.d(stringBuilder0, "baseline", this.mBaseline);
        ConstraintWidget.d(stringBuilder0, "centerX", this.s);
        ConstraintWidget.d(stringBuilder0, "centerY", this.t);
        int v = this.v;
        int v1 = this.mMinWidth;
        int v2 = this.l[0];
        int v3 = this.mMatchConstraintMinWidth;
        int v4 = this.mMatchConstraintDefaultWidth;
        float f = this.mMatchConstraintPercentWidth;
        float f1 = this.mWeight[0];
        ConstraintWidget.c(stringBuilder0, "    width", v, v1, v2, v3, v4, f);
        int v5 = this.w;
        int v6 = this.mMinHeight;
        int v7 = this.l[1];
        int v8 = this.mMatchConstraintMinHeight;
        int v9 = this.mMatchConstraintDefaultHeight;
        float f2 = this.mMatchConstraintPercentHeight;
        float f3 = this.mWeight[1];
        ConstraintWidget.c(stringBuilder0, "    height", v5, v6, v7, v8, v9, f2);
        ConstraintWidget.i(stringBuilder0, "    dimensionRatio", this.mDimensionRatio, this.mDimensionRatioSide);
        ConstraintWidget.h(stringBuilder0, "    horizontalBias", this.y, ConstraintWidget.DEFAULT_BIAS);
        ConstraintWidget.h(stringBuilder0, "    verticalBias", this.z, ConstraintWidget.DEFAULT_BIAS);
        ConstraintWidget.g(this.G, 0, "    horizontalChainStyle", stringBuilder0);
        ConstraintWidget.g(this.H, 0, "    verticalChainStyle", stringBuilder0);
        stringBuilder0.append("  }");
    }

    public int getTop() {
        return this.getY();
    }

    public String getType() {
        return this.F;
    }

    public float getVerticalBiasPercent() {
        return this.z;
    }

    public ConstraintWidget getVerticalChainControlWidget() {
        if(this.isInVerticalChain()) {
            ConstraintWidget constraintWidget0 = this;
            ConstraintWidget constraintWidget1 = null;
            while(constraintWidget1 == null && constraintWidget0 != null) {
                ConstraintAnchor constraintAnchor0 = constraintWidget0.getAnchor(Type.TOP);
                ConstraintAnchor constraintAnchor1 = constraintAnchor0 == null ? null : constraintAnchor0.getTarget();
                ConstraintWidget constraintWidget2 = constraintAnchor1 == null ? null : constraintAnchor1.getOwner();
                if(constraintWidget2 == this.getParent()) {
                    return constraintWidget0;
                }
                ConstraintAnchor constraintAnchor2 = constraintWidget2 == null ? null : constraintWidget2.getAnchor(Type.BOTTOM).getTarget();
                if(constraintAnchor2 != null && constraintAnchor2.getOwner() != constraintWidget0) {
                    constraintWidget1 = constraintWidget0;
                }
                else {
                    constraintWidget0 = constraintWidget2;
                }
            }
            return constraintWidget1;
        }
        return null;
    }

    public int getVerticalChainStyle() {
        return this.H;
    }

    public DimensionBehaviour getVerticalDimensionBehaviour() {
        return this.mListDimensionBehaviors[1];
    }

    public int getVerticalMargin() {
        int v = this.mLeft == null ? 0 : this.mTop.mMargin;
        return this.mRight == null ? v : v + this.mBottom.mMargin;
    }

    public int getVisibility() {
        return this.C;
    }

    public int getWidth() {
        return this.C == 8 ? 0 : this.v;
    }

    public int getWrapBehaviorInParent() {
        return this.i;
    }

    public int getX() {
        return this.mParent == null || !(this.mParent instanceof ConstraintWidgetContainer) ? this.mX : ((ConstraintWidgetContainer)this.mParent).N + this.mX;
    }

    public int getY() {
        return this.mParent == null || !(this.mParent instanceof ConstraintWidgetContainer) ? this.mY : ((ConstraintWidgetContainer)this.mParent).O + this.mY;
    }

    public static void h(StringBuilder stringBuilder0, String s, float f, float f1) {
        if(f == f1) {
            return;
        }
        stringBuilder0.append(s);
        stringBuilder0.append(" :   ");
        stringBuilder0.append(f);
        stringBuilder0.append(",\n");
    }

    public boolean hasBaseline() {
        return this.n;
    }

    public boolean hasDanglingDimension(int v) {
        return v == 0 ? (this.mLeft.mTarget == null ? 0 : 1) + (this.mRight.mTarget == null ? 0 : 1) < 2 : (this.mTop.mTarget == null ? 0 : 1) + (this.mBottom.mTarget == null ? 0 : 1) + (this.mBaseline.mTarget == null ? 0 : 1) < 2;
    }

    public boolean hasDependencies() {
        int v = this.mAnchors.size();
        for(int v1 = 0; v1 < v; ++v1) {
            if(((ConstraintAnchor)this.mAnchors.get(v1)).hasDependents()) {
                return true;
            }
        }
        return false;
    }

    public boolean hasDimensionOverride() {
        return this.c != -1 || this.d != -1;
    }

    public boolean hasResolvedTargets(int v, int v1) {
        if(v == 0) {
            ConstraintAnchor constraintAnchor0 = this.mLeft.mTarget;
            if(constraintAnchor0 != null && constraintAnchor0.hasFinalValue()) {
                ConstraintAnchor constraintAnchor1 = this.mRight.mTarget;
                if(constraintAnchor1 != null && constraintAnchor1.hasFinalValue()) {
                    int v2 = this.mRight.mTarget.getFinalValue();
                    int v3 = this.mRight.getMargin();
                    int v4 = this.mLeft.mTarget.getFinalValue();
                    return v2 - v3 - (this.mLeft.getMargin() + v4) >= v1;
                }
            }
        }
        else {
            ConstraintAnchor constraintAnchor2 = this.mTop.mTarget;
            if(constraintAnchor2 != null && constraintAnchor2.hasFinalValue()) {
                ConstraintAnchor constraintAnchor3 = this.mBottom.mTarget;
                if(constraintAnchor3 != null && constraintAnchor3.hasFinalValue()) {
                    int v5 = this.mBottom.mTarget.getFinalValue();
                    int v6 = this.mBottom.getMargin();
                    int v7 = this.mTop.mTarget.getFinalValue();
                    return v5 - v6 - (this.mTop.getMargin() + v7) >= v1;
                }
            }
        }
        return false;
    }

    public static void i(StringBuilder stringBuilder0, String s, float f, int v) {
        if(f == 0.0f) {
            return;
        }
        stringBuilder0.append(s);
        stringBuilder0.append(" :  [");
        stringBuilder0.append(f);
        stringBuilder0.append(",");
        stringBuilder0.append(v);
        stringBuilder0.append("");
        stringBuilder0.append("],\n");
    }

    public void immediateConnect(Type constraintAnchor$Type0, ConstraintWidget constraintWidget0, Type constraintAnchor$Type1, int v, int v1) {
        this.getAnchor(constraintAnchor$Type0).connect(constraintWidget0.getAnchor(constraintAnchor$Type1), v, v1, true);
    }

    public boolean isAnimated() {
        return this.D;
    }

    public boolean isHeightWrapContent() {
        return this.mIsHeightWrapContent;
    }

    public boolean isHorizontalSolvingPassDone() {
        return this.g;
    }

    public boolean isInBarrier(int v) {
        return this.u[v];
    }

    public boolean isInHorizontalChain() {
        ConstraintAnchor constraintAnchor0 = this.mLeft.mTarget;
        if(constraintAnchor0 == null || constraintAnchor0.mTarget != this.mLeft) {
            ConstraintAnchor constraintAnchor1 = this.mRight.mTarget;
            return constraintAnchor1 != null && constraintAnchor1.mTarget == this.mRight;
        }
        return true;
    }

    public boolean isInPlaceholder() {
        return this.o;
    }

    public boolean isInVerticalChain() {
        ConstraintAnchor constraintAnchor0 = this.mTop.mTarget;
        if(constraintAnchor0 == null || constraintAnchor0.mTarget != this.mTop) {
            ConstraintAnchor constraintAnchor1 = this.mBottom.mTarget;
            return constraintAnchor1 != null && constraintAnchor1.mTarget == this.mBottom;
        }
        return true;
    }

    public boolean isInVirtualLayout() {
        return this.p;
    }

    public boolean isMeasureRequested() {
        return this.a && this.C != 8;
    }

    // 去混淆评级： 低(30)
    public boolean isResolvedHorizontally() {
        return this.e || this.mLeft.hasFinalValue() && this.mRight.hasFinalValue();
    }

    // 去混淆评级： 低(30)
    public boolean isResolvedVertically() {
        return this.f || this.mTop.hasFinalValue() && this.mBottom.hasFinalValue();
    }

    public boolean isRoot() {
        return this.mParent == null;
    }

    public boolean isSpreadHeight() {
        return this.mMatchConstraintDefaultHeight == 0 && this.mDimensionRatio == 0.0f && this.mMatchConstraintMinHeight == 0 && this.mMatchConstraintMaxHeight == 0 && this.mListDimensionBehaviors[1] == DimensionBehaviour.MATCH_CONSTRAINT;
    }

    public boolean isSpreadWidth() {
        return this.mMatchConstraintDefaultWidth == 0 && this.mDimensionRatio == 0.0f && this.mMatchConstraintMinWidth == 0 && this.mMatchConstraintMaxWidth == 0 && this.mListDimensionBehaviors[0] == DimensionBehaviour.MATCH_CONSTRAINT;
    }

    public boolean isVerticalSolvingPassDone() {
        return this.h;
    }

    public boolean isWidthWrapContent() {
        return this.mIsWidthWrapContent;
    }

    public static void j(StringBuilder stringBuilder0, String s, int v, int v1, int v2, int v3, int v4) {
        stringBuilder0.append(s);
        stringBuilder0.append(" :  {\n");
        ConstraintWidget.g(v, 0x80000000, "size", stringBuilder0);
        ConstraintWidget.g(v1, 0, "min", stringBuilder0);
        ConstraintWidget.g(v2, 0x7FFFFFFF, "max", stringBuilder0);
        ConstraintWidget.g(v3, 0, "matchMin", stringBuilder0);
        ConstraintWidget.g(v4, 0, "matchDef", stringBuilder0);
        ConstraintWidget.g(v4, 1, "matchPercent", stringBuilder0);
        stringBuilder0.append("},\n");
    }

    public void markHorizontalSolvingPassDone() {
        this.g = true;
    }

    public void markVerticalSolvingPassDone() {
        this.h = true;
    }

    public boolean oppositeDimensionDependsOn(int v) {
        return this.mListDimensionBehaviors[v] == DimensionBehaviour.MATCH_CONSTRAINT && this.mListDimensionBehaviors[(v == 0 ? 1 : 0)] == DimensionBehaviour.MATCH_CONSTRAINT;
    }

    public boolean oppositeDimensionsTied() {
        return this.mListDimensionBehaviors[0] == DimensionBehaviour.MATCH_CONSTRAINT && this.mListDimensionBehaviors[1] == DimensionBehaviour.MATCH_CONSTRAINT;
    }

    public void reset() {
        this.mLeft.reset();
        this.mTop.reset();
        this.mRight.reset();
        this.mBottom.reset();
        this.mBaseline.reset();
        this.s.reset();
        this.t.reset();
        this.mCenter.reset();
        this.mParent = null;
        this.m = 0.0f;
        this.v = 0;
        this.w = 0;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.mX = 0;
        this.mY = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.x = 0;
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.y = ConstraintWidget.DEFAULT_BIAS;
        this.z = ConstraintWidget.DEFAULT_BIAS;
        DimensionBehaviour[] arr_constraintWidget$DimensionBehaviour = this.mListDimensionBehaviors;
        arr_constraintWidget$DimensionBehaviour[0] = DimensionBehaviour.FIXED;
        arr_constraintWidget$DimensionBehaviour[1] = DimensionBehaviour.FIXED;
        this.A = null;
        this.B = 0;
        this.C = 0;
        this.F = null;
        this.G = 0;
        this.H = 0;
        float[] arr_f = this.mWeight;
        arr_f[0] = -1.0f;
        arr_f[1] = -1.0f;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        int[] arr_v = this.l;
        arr_v[0] = 0x7FFFFFFF;
        arr_v[1] = 0x7FFFFFFF;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.mMatchConstraintMaxWidth = 0x7FFFFFFF;
        this.mMatchConstraintMaxHeight = 0x7FFFFFFF;
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMinHeight = 0;
        this.j = -1;
        this.k = 1.0f;
        boolean[] arr_z = this.isTerminalWidget;
        arr_z[0] = true;
        arr_z[1] = true;
        this.p = false;
        this.u[0] = false;
        this.u[1] = false;
        this.a = true;
        int[] arr_v1 = this.mResolvedMatchConstraintDefault;
        arr_v1[0] = 0;
        arr_v1[1] = 0;
        this.c = -1;
        this.d = -1;
    }

    public void resetAllConstraints() {
        this.resetAnchors();
        this.setVerticalBiasPercent(ConstraintWidget.DEFAULT_BIAS);
        this.setHorizontalBiasPercent(ConstraintWidget.DEFAULT_BIAS);
    }

    public void resetAnchor(ConstraintAnchor constraintAnchor0) {
        ConstraintAnchor constraintAnchor1 = this.getAnchor(Type.LEFT);
        ConstraintAnchor constraintAnchor2 = this.getAnchor(Type.RIGHT);
        ConstraintAnchor constraintAnchor3 = this.getAnchor(Type.TOP);
        ConstraintAnchor constraintAnchor4 = this.getAnchor(Type.BOTTOM);
        ConstraintAnchor constraintAnchor5 = this.getAnchor(Type.CENTER);
        ConstraintAnchor constraintAnchor6 = this.getAnchor(Type.CENTER_X);
        ConstraintAnchor constraintAnchor7 = this.getAnchor(Type.CENTER_Y);
        if(constraintAnchor0 == constraintAnchor5) {
            if(constraintAnchor1.isConnected() && constraintAnchor2.isConnected() && constraintAnchor1.getTarget() == constraintAnchor2.getTarget()) {
                constraintAnchor1.reset();
                constraintAnchor2.reset();
            }
            if(constraintAnchor3.isConnected() && constraintAnchor4.isConnected() && constraintAnchor3.getTarget() == constraintAnchor4.getTarget()) {
                constraintAnchor3.reset();
                constraintAnchor4.reset();
            }
            this.y = 0.5f;
            this.z = 0.5f;
        }
        else if(constraintAnchor0 == constraintAnchor6) {
            if(constraintAnchor1.isConnected() && constraintAnchor2.isConnected() && constraintAnchor1.getTarget().getOwner() == constraintAnchor2.getTarget().getOwner()) {
                constraintAnchor1.reset();
                constraintAnchor2.reset();
            }
            this.y = 0.5f;
        }
        else if(constraintAnchor0 == constraintAnchor7) {
            if(constraintAnchor3.isConnected() && constraintAnchor4.isConnected() && constraintAnchor3.getTarget().getOwner() == constraintAnchor4.getTarget().getOwner()) {
                constraintAnchor3.reset();
                constraintAnchor4.reset();
            }
            this.z = 0.5f;
        }
        else if(constraintAnchor0 == constraintAnchor1 || constraintAnchor0 == constraintAnchor2) {
            if(constraintAnchor1.isConnected() && constraintAnchor1.getTarget() == constraintAnchor2.getTarget()) {
                constraintAnchor5.reset();
            }
        }
        else if((constraintAnchor0 == constraintAnchor3 || constraintAnchor0 == constraintAnchor4) && constraintAnchor3.isConnected() && constraintAnchor3.getTarget() == constraintAnchor4.getTarget()) {
            constraintAnchor5.reset();
        }
        constraintAnchor0.reset();
    }

    public void resetAnchors() {
        int v = this.mAnchors.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((ConstraintAnchor)this.mAnchors.get(v1)).reset();
        }
    }

    public void resetFinalResolution() {
        this.e = false;
        this.f = false;
        this.g = false;
        this.h = false;
        int v1 = this.mAnchors.size();
        for(int v = 0; v < v1; ++v) {
            ((ConstraintAnchor)this.mAnchors.get(v)).resetFinalResolution();
        }
    }

    public void resetSolverVariables(Cache cache0) {
        this.mLeft.resetSolverVariable(cache0);
        this.mTop.resetSolverVariable(cache0);
        this.mRight.resetSolverVariable(cache0);
        this.mBottom.resetSolverVariable(cache0);
        this.mBaseline.resetSolverVariable(cache0);
        this.mCenter.resetSolverVariable(cache0);
        this.s.resetSolverVariable(cache0);
        this.t.resetSolverVariable(cache0);
    }

    public void resetSolvingPassFlag() {
        this.g = false;
        this.h = false;
    }

    public StringBuilder serialize(StringBuilder stringBuilder0) {
        stringBuilder0.append("{\n");
        ConstraintWidget.f(stringBuilder0, "left", this.mLeft);
        ConstraintWidget.f(stringBuilder0, "top", this.mTop);
        ConstraintWidget.f(stringBuilder0, "right", this.mRight);
        ConstraintWidget.f(stringBuilder0, "bottom", this.mBottom);
        ConstraintWidget.f(stringBuilder0, "baseline", this.mBaseline);
        ConstraintWidget.f(stringBuilder0, "centerX", this.s);
        ConstraintWidget.f(stringBuilder0, "centerY", this.t);
        ConstraintAnchor constraintAnchor0 = this.mCenter;
        float f = this.m;
        if(constraintAnchor0.mTarget != null) {
            stringBuilder0.append("circle : [ \'");
            stringBuilder0.append(constraintAnchor0.mTarget);
            stringBuilder0.append("\',");
            stringBuilder0.append(constraintAnchor0.mMargin);
            stringBuilder0.append(",");
            stringBuilder0.append(f);
            stringBuilder0.append(",");
            stringBuilder0.append(" ] ,\n");
        }
        int v = this.v;
        int v1 = this.mMinWidth;
        int v2 = this.l[0];
        int v3 = this.mMatchConstraintMinWidth;
        int v4 = this.mMatchConstraintDefaultWidth;
        float f1 = this.mWeight[0];
        ConstraintWidget.j(stringBuilder0, "width", v, v1, v2, v3, v4);
        int v5 = this.w;
        int v6 = this.mMinHeight;
        int v7 = this.l[1];
        int v8 = this.mMatchConstraintMinHeight;
        int v9 = this.mMatchConstraintDefaultHeight;
        float f2 = this.mWeight[1];
        ConstraintWidget.j(stringBuilder0, "height", v5, v6, v7, v8, v9);
        ConstraintWidget.i(stringBuilder0, "dimensionRatio", this.mDimensionRatio, this.mDimensionRatioSide);
        ConstraintWidget.h(stringBuilder0, "horizontalBias", this.y, ConstraintWidget.DEFAULT_BIAS);
        ConstraintWidget.h(stringBuilder0, "verticalBias", this.z, ConstraintWidget.DEFAULT_BIAS);
        stringBuilder0.append("}\n");
        return stringBuilder0;
    }

    public void setAnimated(boolean z) {
        this.D = z;
    }

    public void setBaselineDistance(int v) {
        this.x = v;
        this.n = v > 0;
    }

    public void setCompanionWidget(Object object0) {
        this.A = object0;
    }

    public void setContainerItemSkip(int v) {
        if(v >= 0) {
            this.B = v;
            return;
        }
        this.B = 0;
    }

    public void setDebugName(String s) {
        this.E = s;
    }

    public void setDebugSolverName(LinearSystem linearSystem0, String s) {
        this.E = s;
        SolverVariable solverVariable0 = linearSystem0.createObjectVariable(this.mLeft);
        SolverVariable solverVariable1 = linearSystem0.createObjectVariable(this.mTop);
        SolverVariable solverVariable2 = linearSystem0.createObjectVariable(this.mRight);
        SolverVariable solverVariable3 = linearSystem0.createObjectVariable(this.mBottom);
        solverVariable0.setName(s + ".left");
        solverVariable1.setName(s + ".top");
        solverVariable2.setName(s + ".right");
        solverVariable3.setName(s + ".bottom");
        linearSystem0.createObjectVariable(this.mBaseline).setName(s + ".baseline");
    }

    public void setDimension(int v, int v1) {
        this.v = v;
        int v2 = this.mMinWidth;
        if(v < v2) {
            this.v = v2;
        }
        this.w = v1;
        int v3 = this.mMinHeight;
        if(v1 < v3) {
            this.w = v3;
        }
    }

    public void setDimensionRatio(float f, int v) {
        this.mDimensionRatio = f;
        this.mDimensionRatioSide = v;
    }

    public void setDimensionRatio(String s) {
        float f2;
        if(s != null && s.length() != 0) {
            int v = s.length();
            int v1 = s.indexOf(44);
            int v2 = 0;
            int v3 = -1;
            if(v1 > 0 && v1 < v - 1) {
                String s1 = s.substring(0, v1);
                if(!s1.equalsIgnoreCase("W")) {
                    v2 = s1.equalsIgnoreCase("H") ? 1 : -1;
                }
                v3 = v2;
                v2 = v1 + 1;
            }
            int v4 = s.indexOf(58);
            if(v4 < 0 || v4 >= v - 1) {
                String s4 = s.substring(v2);
                if(s4.length() > 0) {
                    try {
                        f2 = Float.parseFloat(s4);
                        goto label_29;
                    label_28:
                        f2 = 0.0f;
                    }
                    catch(NumberFormatException unused_ex) {
                        goto label_28;
                    }
                }
                else {
                    goto label_28;
                }
            }
            else {
                String s2 = s.substring(v2, v4);
                String s3 = s.substring(v4 + 1);
                if(s2.length() <= 0 || s3.length() <= 0) {
                    goto label_28;
                }
                else {
                    try {
                        float f = Float.parseFloat(s2);
                        float f1 = Float.parseFloat(s3);
                        if(f <= 0.0f || f1 <= 0.0f) {
                            goto label_28;
                        }
                        else if(v3 == 1) {
                            f2 = Math.abs(f1 / f);
                        }
                        else {
                            f2 = Math.abs(f / f1);
                        }
                    }
                    catch(NumberFormatException unused_ex) {
                        goto label_28;
                    }
                }
            }
        label_29:
            if(f2 > 0.0f) {
                this.mDimensionRatio = f2;
                this.mDimensionRatioSide = v3;
            }
            return;
        }
        this.mDimensionRatio = 0.0f;
    }

    public void setFinalBaseline(int v) {
        if(!this.n) {
            return;
        }
        int v1 = v - this.x;
        int v2 = this.w + v1;
        this.mY = v1;
        this.mTop.setFinalValue(v1);
        this.mBottom.setFinalValue(v2);
        this.mBaseline.setFinalValue(v);
        this.f = true;
    }

    public void setFinalFrame(int v, int v1, int v2, int v3, int v4, int v5) {
        this.setFrame(v, v1, v2, v3);
        this.setBaselineDistance(v4);
        if(v5 == 0) {
            this.e = true;
            this.f = false;
            return;
        }
        if(v5 == 1) {
            this.e = false;
            this.f = true;
            return;
        }
        if(v5 == 2) {
            this.e = true;
            this.f = true;
            return;
        }
        this.e = false;
        this.f = false;
    }

    public void setFinalHorizontal(int v, int v1) {
        if(this.e) {
            return;
        }
        this.mLeft.setFinalValue(v);
        this.mRight.setFinalValue(v1);
        this.mX = v;
        this.v = v1 - v;
        this.e = true;
    }

    public void setFinalLeft(int v) {
        this.mLeft.setFinalValue(v);
        this.mX = v;
    }

    public void setFinalTop(int v) {
        this.mTop.setFinalValue(v);
        this.mY = v;
    }

    public void setFinalVertical(int v, int v1) {
        if(this.f) {
            return;
        }
        this.mTop.setFinalValue(v);
        this.mBottom.setFinalValue(v1);
        this.mY = v;
        this.w = v1 - v;
        if(this.n) {
            this.mBaseline.setFinalValue(v + this.x);
        }
        this.f = true;
    }

    public void setFrame(int v, int v1, int v2) {
        if(v2 == 0) {
            this.setHorizontalDimension(v, v1);
            return;
        }
        if(v2 == 1) {
            this.setVerticalDimension(v, v1);
        }
    }

    public void setFrame(int v, int v1, int v2, int v3) {
        int v4 = v2 - v;
        int v5 = v3 - v1;
        this.mX = v;
        this.mY = v1;
        if(this.C == 8) {
            this.v = 0;
            this.w = 0;
            return;
        }
        DimensionBehaviour[] arr_constraintWidget$DimensionBehaviour = this.mListDimensionBehaviors;
        DimensionBehaviour constraintWidget$DimensionBehaviour0 = arr_constraintWidget$DimensionBehaviour[0];
        DimensionBehaviour constraintWidget$DimensionBehaviour1 = DimensionBehaviour.FIXED;
        if(constraintWidget$DimensionBehaviour0 == constraintWidget$DimensionBehaviour1) {
            int v6 = this.v;
            if(v4 < v6) {
                v4 = v6;
            }
        }
        if(arr_constraintWidget$DimensionBehaviour[1] == constraintWidget$DimensionBehaviour1) {
            int v7 = this.w;
            if(v5 < v7) {
                v5 = v7;
            }
        }
        this.v = v4;
        this.w = v5;
        int v8 = this.mMinHeight;
        if(v5 < v8) {
            this.w = v8;
        }
        int v9 = this.mMinWidth;
        if(v4 < v9) {
            this.v = v9;
        }
        int v10 = this.mMatchConstraintMaxWidth;
        if(v10 > 0 && constraintWidget$DimensionBehaviour0 == DimensionBehaviour.MATCH_CONSTRAINT) {
            this.v = Math.min(this.v, v10);
        }
        int v11 = this.mMatchConstraintMaxHeight;
        if(v11 > 0 && this.mListDimensionBehaviors[1] == DimensionBehaviour.MATCH_CONSTRAINT) {
            this.w = Math.min(this.w, v11);
        }
        int v12 = this.v;
        if(v4 != v12) {
            this.c = v12;
        }
        int v13 = this.w;
        if(v5 != v13) {
            this.d = v13;
        }
    }

    public void setGoneMargin(Type constraintAnchor$Type0, int v) {
        switch(b.a[constraintAnchor$Type0.ordinal()]) {
            case 1: {
                this.mLeft.d = v;
                return;
            }
            case 2: {
                this.mTop.d = v;
                return;
            }
            case 3: {
                this.mRight.d = v;
                return;
            }
            case 4: {
                this.mBottom.d = v;
                return;
            }
            case 5: {
                this.mBaseline.d = v;
            }
        }
    }

    public void setHasBaseline(boolean z) {
        this.n = z;
    }

    public void setHeight(int v) {
        this.w = v;
        int v1 = this.mMinHeight;
        if(v < v1) {
            this.w = v1;
        }
    }

    public void setHeightWrapContent(boolean z) {
        this.mIsHeightWrapContent = z;
    }

    public void setHorizontalBiasPercent(float f) {
        this.y = f;
    }

    public void setHorizontalChainStyle(int v) {
        this.G = v;
    }

    public void setHorizontalDimension(int v, int v1) {
        this.mX = v;
        int v2 = v1 - v;
        this.v = v2;
        int v3 = this.mMinWidth;
        if(v2 < v3) {
            this.v = v3;
        }
    }

    public void setHorizontalDimensionBehaviour(DimensionBehaviour constraintWidget$DimensionBehaviour0) {
        this.mListDimensionBehaviors[0] = constraintWidget$DimensionBehaviour0;
    }

    public void setHorizontalMatchStyle(int v, int v1, int v2, float f) {
        this.mMatchConstraintDefaultWidth = v;
        this.mMatchConstraintMinWidth = v1;
        if(v2 == 0x7FFFFFFF) {
            v2 = 0;
        }
        this.mMatchConstraintMaxWidth = v2;
        this.mMatchConstraintPercentWidth = f;
        if(f > 0.0f && f < 1.0f && v == 0) {
            this.mMatchConstraintDefaultWidth = 2;
        }
    }

    public void setHorizontalWeight(float f) {
        this.mWeight[0] = f;
    }

    public void setInBarrier(int v, boolean z) {
        this.u[v] = z;
    }

    public void setInPlaceholder(boolean z) {
        this.o = z;
    }

    public void setInVirtualLayout(boolean z) {
        this.p = z;
    }

    public void setLastMeasureSpec(int v, int v1) {
        this.q = v;
        this.r = v1;
        this.setMeasureRequested(false);
    }

    public void setLength(int v, int v1) {
        if(v1 == 0) {
            this.setWidth(v);
            return;
        }
        if(v1 == 1) {
            this.setHeight(v);
        }
    }

    public void setMaxHeight(int v) {
        this.l[1] = v;
    }

    public void setMaxWidth(int v) {
        this.l[0] = v;
    }

    public void setMeasureRequested(boolean z) {
        this.a = z;
    }

    public void setMinHeight(int v) {
        if(v < 0) {
            this.mMinHeight = 0;
            return;
        }
        this.mMinHeight = v;
    }

    public void setMinWidth(int v) {
        if(v < 0) {
            this.mMinWidth = 0;
            return;
        }
        this.mMinWidth = v;
    }

    public void setOffset(int v, int v1) {
        this.mOffsetX = v;
        this.mOffsetY = v1;
    }

    public void setOrigin(int v, int v1) {
        this.mX = v;
        this.mY = v1;
    }

    public void setParent(ConstraintWidget constraintWidget0) {
        this.mParent = constraintWidget0;
    }

    public void setType(String s) {
        this.F = s;
    }

    public void setVerticalBiasPercent(float f) {
        this.z = f;
    }

    public void setVerticalChainStyle(int v) {
        this.H = v;
    }

    public void setVerticalDimension(int v, int v1) {
        this.mY = v;
        int v2 = v1 - v;
        this.w = v2;
        int v3 = this.mMinHeight;
        if(v2 < v3) {
            this.w = v3;
        }
    }

    public void setVerticalDimensionBehaviour(DimensionBehaviour constraintWidget$DimensionBehaviour0) {
        this.mListDimensionBehaviors[1] = constraintWidget$DimensionBehaviour0;
    }

    public void setVerticalMatchStyle(int v, int v1, int v2, float f) {
        this.mMatchConstraintDefaultHeight = v;
        this.mMatchConstraintMinHeight = v1;
        if(v2 == 0x7FFFFFFF) {
            v2 = 0;
        }
        this.mMatchConstraintMaxHeight = v2;
        this.mMatchConstraintPercentHeight = f;
        if(f > 0.0f && f < 1.0f && v == 0) {
            this.mMatchConstraintDefaultHeight = 2;
        }
    }

    public void setVerticalWeight(float f) {
        this.mWeight[1] = f;
    }

    public void setVisibility(int v) {
        this.C = v;
    }

    public void setWidth(int v) {
        this.v = v;
        int v1 = this.mMinWidth;
        if(v < v1) {
            this.v = v1;
        }
    }

    public void setWidthWrapContent(boolean z) {
        this.mIsWidthWrapContent = z;
    }

    public void setWrapBehaviorInParent(int v) {
        if(v >= 0 && v <= 3) {
            this.i = v;
        }
    }

    public void setX(int v) {
        this.mX = v;
    }

    public void setY(int v) {
        this.mY = v;
    }

    public void setupDimensionRatio(boolean z, boolean z1, boolean z2, boolean z3) {
        if(this.j == -1) {
            if(z2 && !z3) {
                this.j = 0;
            }
            else if(!z2 && z3) {
                this.j = 1;
                if(this.mDimensionRatioSide == -1) {
                    this.k = 1.0f / this.k;
                }
            }
        }
        if(this.j == 0 && (!this.mTop.isConnected() || !this.mBottom.isConnected())) {
            this.j = 1;
        }
        else if(this.j == 1 && (!this.mLeft.isConnected() || !this.mRight.isConnected())) {
            this.j = 0;
        }
        if(this.j == -1 && (!this.mTop.isConnected() || !this.mBottom.isConnected() || !this.mLeft.isConnected() || !this.mRight.isConnected())) {
            if(this.mTop.isConnected() && this.mBottom.isConnected()) {
                this.j = 0;
            }
            else if(this.mLeft.isConnected() && this.mRight.isConnected()) {
                this.k = 1.0f / this.k;
                this.j = 1;
            }
        }
        if(this.j == -1) {
            int v = this.mMatchConstraintMinWidth;
            if(v > 0 && this.mMatchConstraintMinHeight == 0) {
                this.j = 0;
                return;
            }
            if(v == 0 && this.mMatchConstraintMinHeight > 0) {
                this.k = 1.0f / this.k;
                this.j = 1;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        String s = "";
        stringBuilder0.append((this.F == null ? "" : a.o(new StringBuilder("type: "), this.F, " ")));
        if(this.E != null) {
            s = a.o(new StringBuilder("id: "), this.E, " ");
        }
        stringBuilder0.append(s);
        stringBuilder0.append("(");
        stringBuilder0.append(this.mX);
        stringBuilder0.append(", ");
        stringBuilder0.append(this.mY);
        stringBuilder0.append(") - (");
        stringBuilder0.append(this.v);
        stringBuilder0.append(" x ");
        return wb.a.c(this.w, ")", stringBuilder0);
    }

    public void updateFromRuns(boolean z, boolean z1) {
        int v = z & this.horizontalRun.isResolved();
        int v1 = z1 & this.verticalRun.isResolved();
        int v2 = this.horizontalRun.start.value;
        int v3 = this.verticalRun.start.value;
        int v4 = this.horizontalRun.end.value;
        int v5 = this.verticalRun.end.value;
        if(v4 - v2 < 0 || v5 - v3 < 0 || (v2 == 0x80000000 || v2 == 0x7FFFFFFF) || (v3 == 0x80000000 || v3 == 0x7FFFFFFF) || (v4 == 0x80000000 || v4 == 0x7FFFFFFF) || (v5 == 0x80000000 || v5 == 0x7FFFFFFF)) {
            v4 = 0;
            v2 = 0;
            v5 = 0;
            v3 = 0;
        }
        int v6 = v4 - v2;
        int v7 = v5 - v3;
        if(v != 0) {
            this.mX = v2;
        }
        if(v1 != 0) {
            this.mY = v3;
        }
        if(this.C == 8) {
            this.v = 0;
            this.w = 0;
            return;
        }
        if(v != 0) {
            if(this.mListDimensionBehaviors[0] == DimensionBehaviour.FIXED) {
                int v8 = this.v;
                if(v6 < v8) {
                    v6 = v8;
                }
            }
            this.v = v6;
            int v9 = this.mMinWidth;
            if(v6 < v9) {
                this.v = v9;
            }
        }
        if(v1 != 0) {
            if(this.mListDimensionBehaviors[1] == DimensionBehaviour.FIXED) {
                int v10 = this.w;
                if(v7 < v10) {
                    v7 = v10;
                }
            }
            this.w = v7;
            int v11 = this.mMinHeight;
            if(v7 < v11) {
                this.w = v11;
            }
        }
    }

    public void updateFromSolver(LinearSystem linearSystem0, boolean z) {
        int v = linearSystem0.getObjectVariableValue(this.mLeft);
        int v1 = linearSystem0.getObjectVariableValue(this.mTop);
        int v2 = linearSystem0.getObjectVariableValue(this.mRight);
        int v3 = linearSystem0.getObjectVariableValue(this.mBottom);
        if(z) {
            HorizontalWidgetRun horizontalWidgetRun0 = this.horizontalRun;
            if(horizontalWidgetRun0 != null) {
                DependencyNode dependencyNode0 = horizontalWidgetRun0.start;
                if(dependencyNode0.resolved) {
                    DependencyNode dependencyNode1 = horizontalWidgetRun0.end;
                    if(dependencyNode1.resolved) {
                        v = dependencyNode0.value;
                        v2 = dependencyNode1.value;
                    }
                }
            }
        }
        if(z) {
            VerticalWidgetRun verticalWidgetRun0 = this.verticalRun;
            if(verticalWidgetRun0 != null) {
                DependencyNode dependencyNode2 = verticalWidgetRun0.start;
                if(dependencyNode2.resolved) {
                    DependencyNode dependencyNode3 = verticalWidgetRun0.end;
                    if(dependencyNode3.resolved) {
                        v1 = dependencyNode2.value;
                        v3 = dependencyNode3.value;
                    }
                }
            }
        }
        if(v2 - v < 0 || v3 - v1 < 0 || (v == 0x80000000 || v == 0x7FFFFFFF) || (v1 == 0x80000000 || v1 == 0x7FFFFFFF) || (v2 == 0x80000000 || v2 == 0x7FFFFFFF) || (v3 == 0x80000000 || v3 == 0x7FFFFFFF)) {
            v = 0;
            v3 = 0;
            v1 = 0;
            v2 = 0;
        }
        this.setFrame(v, v1, v2, v3);
    }
}

