package androidx.constraintlayout.core.widgets;

import java.util.ArrayList;

public class ChainHead {
    public final int a;
    public final boolean b;
    public boolean c;
    protected ConstraintWidget mFirst;
    protected ConstraintWidget mFirstMatchConstraintWidget;
    protected ConstraintWidget mFirstVisibleWidget;
    protected boolean mHasComplexMatchWeights;
    protected boolean mHasDefinedWeights;
    protected boolean mHasRatio;
    protected boolean mHasUndefinedWeights;
    protected ConstraintWidget mHead;
    protected ConstraintWidget mLast;
    protected ConstraintWidget mLastMatchConstraintWidget;
    protected ConstraintWidget mLastVisibleWidget;
    protected float mTotalWeight;
    protected ArrayList mWeightedMatchConstraintsWidgets;
    protected int mWidgetsCount;
    protected int mWidgetsMatchCount;

    public ChainHead(ConstraintWidget constraintWidget0, int v, boolean z) {
        this.mTotalWeight = 0.0f;
        this.mFirst = constraintWidget0;
        this.a = v;
        this.b = z;
    }

    public void define() {
        if(!this.c) {
            int v = this.a;
            ConstraintWidget constraintWidget0 = this.mFirst;
            boolean z = false;
            ConstraintWidget constraintWidget1 = constraintWidget0;
            boolean z1 = false;
            while(!z1) {
                ++this.mWidgetsCount;
                ConstraintWidget constraintWidget2 = null;
                constraintWidget0.mNextChainWidget[v] = null;
                constraintWidget0.mListNextMatchConstraintsWidget[v] = null;
                if(constraintWidget0.getVisibility() != 8) {
                    DimensionBehaviour constraintWidget$DimensionBehaviour0 = DimensionBehaviour.MATCH_CONSTRAINT;
                    if(constraintWidget0.getDimensionBehaviour(v) != constraintWidget$DimensionBehaviour0) {
                        constraintWidget0.getLength(v);
                    }
                    constraintWidget0.mListAnchors[v * 2].getMargin();
                    int v1 = v * 2 + 1;
                    constraintWidget0.mListAnchors[v1].getMargin();
                    constraintWidget0.mListAnchors[v * 2].getMargin();
                    constraintWidget0.mListAnchors[v1].getMargin();
                    if(this.mFirstVisibleWidget == null) {
                        this.mFirstVisibleWidget = constraintWidget0;
                    }
                    this.mLastVisibleWidget = constraintWidget0;
                    if(constraintWidget0.mListDimensionBehaviors[v] == constraintWidget$DimensionBehaviour0) {
                        int v2 = constraintWidget0.mResolvedMatchConstraintDefault[v];
                        if(v2 == 0 || v2 == 3 || v2 == 2) {
                            ++this.mWidgetsMatchCount;
                            float f = constraintWidget0.mWeight[v];
                            if(f > 0.0f) {
                                this.mTotalWeight += f;
                            }
                            if(constraintWidget0.getVisibility() != 8 && constraintWidget0.mListDimensionBehaviors[v] == constraintWidget$DimensionBehaviour0) {
                                switch(constraintWidget0.mResolvedMatchConstraintDefault[v]) {
                                    case 0: 
                                    case 3: {
                                        if(f < 0.0f) {
                                            this.mHasUndefinedWeights = true;
                                        }
                                        else {
                                            this.mHasDefinedWeights = true;
                                        }
                                        if(this.mWeightedMatchConstraintsWidgets == null) {
                                            this.mWeightedMatchConstraintsWidgets = new ArrayList();
                                        }
                                        this.mWeightedMatchConstraintsWidgets.add(constraintWidget0);
                                    }
                                }
                            }
                            if(this.mFirstMatchConstraintWidget == null) {
                                this.mFirstMatchConstraintWidget = constraintWidget0;
                            }
                            ConstraintWidget constraintWidget3 = this.mLastMatchConstraintWidget;
                            if(constraintWidget3 != null) {
                                constraintWidget3.mListNextMatchConstraintsWidget[v] = constraintWidget0;
                            }
                            this.mLastMatchConstraintWidget = constraintWidget0;
                        }
                        if(constraintWidget0.mDimensionRatio != 0.0f) {
                            this.mHasRatio = true;
                        }
                    }
                }
                if(constraintWidget1 != constraintWidget0) {
                    constraintWidget1.mNextChainWidget[v] = constraintWidget0;
                }
                ConstraintAnchor constraintAnchor0 = constraintWidget0.mListAnchors[v * 2 + 1].mTarget;
                if(constraintAnchor0 != null) {
                    ConstraintWidget constraintWidget4 = constraintAnchor0.mOwner;
                    ConstraintAnchor constraintAnchor1 = constraintWidget4.mListAnchors[v * 2].mTarget;
                    if(constraintAnchor1 != null && constraintAnchor1.mOwner == constraintWidget0) {
                        constraintWidget2 = constraintWidget4;
                    }
                }
                if(constraintWidget2 == null) {
                    z1 = true;
                    constraintWidget2 = constraintWidget0;
                }
                constraintWidget1 = constraintWidget0;
                constraintWidget0 = constraintWidget2;
            }
            ConstraintWidget constraintWidget5 = this.mFirstVisibleWidget;
            if(constraintWidget5 != null) {
                constraintWidget5.mListAnchors[v * 2].getMargin();
            }
            ConstraintWidget constraintWidget6 = this.mLastVisibleWidget;
            if(constraintWidget6 != null) {
                constraintWidget6.mListAnchors[v * 2 + 1].getMargin();
            }
            this.mLast = constraintWidget0;
            this.mHead = v != 0 || !this.b ? this.mFirst : constraintWidget0;
            if(this.mHasDefinedWeights && this.mHasUndefinedWeights) {
                z = true;
            }
            this.mHasComplexMatchWeights = z;
        }
        this.c = true;
    }

    public ConstraintWidget getFirst() {
        return this.mFirst;
    }

    public ConstraintWidget getFirstMatchConstraintWidget() {
        return this.mFirstMatchConstraintWidget;
    }

    public ConstraintWidget getFirstVisibleWidget() {
        return this.mFirstVisibleWidget;
    }

    public ConstraintWidget getHead() {
        return this.mHead;
    }

    public ConstraintWidget getLast() {
        return this.mLast;
    }

    public ConstraintWidget getLastMatchConstraintWidget() {
        return this.mLastMatchConstraintWidget;
    }

    public ConstraintWidget getLastVisibleWidget() {
        return this.mLastVisibleWidget;
    }

    public float getTotalWeight() {
        return this.mTotalWeight;
    }
}

