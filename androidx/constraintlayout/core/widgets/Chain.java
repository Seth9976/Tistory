package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.ArrayRow;
import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.SolverVariable;
import java.util.ArrayList;

public class Chain {
    public static final boolean USE_CHAIN_OPTIMIZATION = false;

    public static void applyChainConstraints(ConstraintWidgetContainer constraintWidgetContainer0, LinearSystem linearSystem0, ArrayList arrayList0, int v) {
        int v5;
        int v4;
        ConstraintAnchor constraintAnchor22;
        ConstraintAnchor constraintAnchor21;
        ConstraintWidget constraintWidget31;
        ConstraintWidget constraintWidget30;
        ConstraintWidget constraintWidget29;
        SolverVariable solverVariable12;
        SolverVariable solverVariable11;
        ConstraintAnchor constraintAnchor13;
        ConstraintAnchor constraintAnchor16;
        SolverVariable solverVariable13;
        ConstraintWidget constraintWidget22;
        ConstraintWidget constraintWidget21;
        ConstraintWidget constraintWidget20;
        ConstraintWidget constraintWidget19;
        ConstraintWidget constraintWidget24;
        SolverVariable solverVariable7;
        ConstraintWidget constraintWidget23;
        ConstraintAnchor constraintAnchor11;
        ConstraintWidget constraintWidget14;
        ConstraintWidget constraintWidget13;
        ConstraintWidget constraintWidget12;
        ConstraintWidget constraintWidget32;
        ArrayList arrayList2;
        ChainHead chainHead1;
        ConstraintWidget constraintWidget8;
        ConstraintWidget constraintWidget7;
        boolean z3;
        int v11;
        ConstraintWidget constraintWidget6;
        int v8;
        int v7;
        ConstraintWidget constraintWidget5;
        boolean z1;
        int v6;
        int v2;
        ChainHead[] arr_chainHead;
        int v1;
        if(v == 0) {
            v1 = constraintWidgetContainer0.mHorizontalChainsSize;
            arr_chainHead = constraintWidgetContainer0.Q;
            v2 = 0;
        }
        else {
            v1 = constraintWidgetContainer0.mVerticalChainsSize;
            arr_chainHead = constraintWidgetContainer0.P;
            v2 = 2;
        }
        int v3 = 0;
        while(v3 < v1) {
            ChainHead chainHead0 = arr_chainHead[v3];
            chainHead0.define();
            if(arrayList0 == null || arrayList0.contains(chainHead0.mFirst)) {
                ConstraintWidget constraintWidget0 = chainHead0.mFirst;
                ConstraintWidget constraintWidget1 = chainHead0.mLast;
                ConstraintWidget constraintWidget2 = chainHead0.mFirstVisibleWidget;
                ConstraintWidget constraintWidget3 = chainHead0.mLastVisibleWidget;
                ConstraintWidget constraintWidget4 = chainHead0.mHead;
                float f = chainHead0.mTotalWeight;
                boolean z = constraintWidgetContainer0.mListDimensionBehaviors[v] == DimensionBehaviour.WRAP_CONTENT;
                if(v == 0) {
                    v6 = v3;
                    z1 = constraintWidget4.G == 2;
                    constraintWidget5 = constraintWidget0;
                    v7 = constraintWidget4.G == 0 ? 1 : 0;
                    v8 = constraintWidget4.G == 1 ? 1 : 0;
                }
                else {
                    v6 = v3;
                    v8 = constraintWidget4.H == 1 ? 1 : 0;
                    z1 = constraintWidget4.H == 2;
                    constraintWidget5 = constraintWidget0;
                    v7 = constraintWidget4.H == 0 ? 1 : 0;
                }
                boolean z2 = false;
                while(true) {
                    constraintWidget6 = null;
                    if(z2) {
                        break;
                    }
                    ConstraintAnchor constraintAnchor0 = constraintWidget5.mListAnchors[v2];
                    int v9 = z1 ? 1 : 4;
                    int v10 = constraintAnchor0.getMargin();
                    DimensionBehaviour constraintWidget$DimensionBehaviour0 = DimensionBehaviour.MATCH_CONSTRAINT;
                    if(constraintWidget5.mListDimensionBehaviors[v] != constraintWidget$DimensionBehaviour0 || constraintWidget5.mResolvedMatchConstraintDefault[v] != 0) {
                        v11 = v1;
                        z3 = false;
                    }
                    else {
                        v11 = v1;
                        z3 = true;
                    }
                    ConstraintAnchor constraintAnchor1 = constraintAnchor0.mTarget;
                    if(constraintAnchor1 != null && constraintWidget5 != constraintWidget0) {
                        v10 = constraintAnchor1.getMargin() + v10;
                    }
                    if(!z1 || constraintWidget5 == constraintWidget0 || constraintWidget5 == constraintWidget2) {
                        constraintWidget7 = constraintWidget4;
                    }
                    else {
                        constraintWidget7 = constraintWidget4;
                        v9 = 8;
                    }
                    ConstraintAnchor constraintAnchor2 = constraintAnchor0.mTarget;
                    if(constraintAnchor2 == null) {
                        chainHead1 = chainHead0;
                        constraintWidget8 = constraintWidget0;
                    }
                    else {
                        if(constraintWidget5 == constraintWidget2) {
                            constraintWidget8 = constraintWidget0;
                            chainHead1 = chainHead0;
                            linearSystem0.addGreaterThan(constraintAnchor0.e, constraintAnchor2.e, v10, 6);
                        }
                        else {
                            chainHead1 = chainHead0;
                            constraintWidget8 = constraintWidget0;
                            linearSystem0.addGreaterThan(constraintAnchor0.e, constraintAnchor2.e, v10, 8);
                        }
                        if(z3 && !z1) {
                            v9 = 5;
                        }
                        int v12 = constraintWidget5 != constraintWidget2 || !z1 || !constraintWidget5.isInBarrier(v) ? v9 : 5;
                        linearSystem0.addEquality(constraintAnchor0.e, constraintAnchor0.mTarget.e, v10, v12);
                    }
                    if(z) {
                        if(constraintWidget5.getVisibility() != 8 && constraintWidget5.mListDimensionBehaviors[v] == constraintWidget$DimensionBehaviour0) {
                            linearSystem0.addGreaterThan(constraintWidget5.mListAnchors[v2 + 1].e, constraintWidget5.mListAnchors[v2].e, 0, 5);
                        }
                        linearSystem0.addGreaterThan(constraintWidget5.mListAnchors[v2].e, constraintWidgetContainer0.mListAnchors[v2].e, 0, 8);
                    }
                    ConstraintAnchor constraintAnchor3 = constraintWidget5.mListAnchors[v2 + 1].mTarget;
                    if(constraintAnchor3 != null) {
                        ConstraintWidget constraintWidget9 = constraintAnchor3.mOwner;
                        ConstraintAnchor constraintAnchor4 = constraintWidget9.mListAnchors[v2].mTarget;
                        if(constraintAnchor4 != null && constraintAnchor4.mOwner == constraintWidget5) {
                            constraintWidget6 = constraintWidget9;
                        }
                    }
                    if(constraintWidget6 == null) {
                        z2 = true;
                    }
                    else {
                        constraintWidget5 = constraintWidget6;
                    }
                    constraintWidget4 = constraintWidget7;
                    v1 = v11;
                    constraintWidget0 = constraintWidget8;
                    chainHead0 = chainHead1;
                }
                float f1 = f;
                v5 = v1;
                if(constraintWidget3 != null && constraintWidget1.mListAnchors[v2 + 1].mTarget != null) {
                    ConstraintAnchor constraintAnchor5 = constraintWidget3.mListAnchors[v2 + 1];
                    if(constraintWidget3.mListDimensionBehaviors[v] == DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget3.mResolvedMatchConstraintDefault[v] == 0 && !z1) {
                        ConstraintAnchor constraintAnchor6 = constraintAnchor5.mTarget;
                        if(constraintAnchor6.mOwner == constraintWidgetContainer0) {
                            linearSystem0.addEquality(constraintAnchor5.e, constraintAnchor6.e, -constraintAnchor5.getMargin(), 5);
                        }
                    }
                    else if(z1) {
                        ConstraintAnchor constraintAnchor7 = constraintAnchor5.mTarget;
                        if(constraintAnchor7.mOwner == constraintWidgetContainer0) {
                            linearSystem0.addEquality(constraintAnchor5.e, constraintAnchor7.e, -constraintAnchor5.getMargin(), 4);
                        }
                    }
                    linearSystem0.addLowerThan(constraintAnchor5.e, constraintWidget1.mListAnchors[v2 + 1].mTarget.e, -constraintAnchor5.getMargin(), 6);
                }
                if(z) {
                    SolverVariable solverVariable0 = constraintWidgetContainer0.mListAnchors[v2 + 1].e;
                    ConstraintAnchor constraintAnchor8 = constraintWidget1.mListAnchors[v2 + 1];
                    linearSystem0.addGreaterThan(solverVariable0, constraintAnchor8.e, constraintAnchor8.getMargin(), 8);
                }
                ChainHead chainHead2 = chainHead0;
                ArrayList arrayList1 = chainHead2.mWeightedMatchConstraintsWidgets;
                if(arrayList1 != null) {
                    int v13 = arrayList1.size();
                    if(v13 > 1) {
                        if(chainHead2.mHasUndefinedWeights && !chainHead2.mHasComplexMatchWeights) {
                            f1 = (float)chainHead2.mWidgetsMatchCount;
                        }
                        float f2 = 0.0f;
                        ConstraintWidget constraintWidget10 = null;
                        int v14 = 0;
                        while(v14 < v13) {
                            ConstraintWidget constraintWidget11 = (ConstraintWidget)arrayList1.get(v14);
                            float f3 = constraintWidget11.mWeight[v];
                            if(f3 < 0.0f) {
                                if(chainHead2.mHasComplexMatchWeights) {
                                    linearSystem0.addEquality(constraintWidget11.mListAnchors[v2 + 1].e, constraintWidget11.mListAnchors[v2].e, 0, 4);
                                    ++v14;
                                    continue;
                                }
                                else {
                                    f3 = 1.0f;
                                }
                            }
                            if(f3 == 0.0f) {
                                linearSystem0.addEquality(constraintWidget11.mListAnchors[v2 + 1].e, constraintWidget11.mListAnchors[v2].e, 0, 8);
                                arrayList2 = arrayList1;
                            }
                            else {
                                if(constraintWidget10 == null) {
                                    arrayList2 = arrayList1;
                                }
                                else {
                                    ConstraintAnchor[] arr_constraintAnchor = constraintWidget10.mListAnchors;
                                    SolverVariable solverVariable1 = arr_constraintAnchor[v2].e;
                                    SolverVariable solverVariable2 = arr_constraintAnchor[v2 + 1].e;
                                    ConstraintAnchor[] arr_constraintAnchor1 = constraintWidget11.mListAnchors;
                                    SolverVariable solverVariable3 = arr_constraintAnchor1[v2].e;
                                    SolverVariable solverVariable4 = arr_constraintAnchor1[v2 + 1].e;
                                    arrayList2 = arrayList1;
                                    ArrayRow arrayRow0 = linearSystem0.createRow();
                                    arrayRow0.createRowEqualMatchDimensions(f2, f1, f3, solverVariable1, solverVariable2, solverVariable3, solverVariable4);
                                    linearSystem0.addConstraint(arrayRow0);
                                }
                                f2 = f3;
                                constraintWidget10 = constraintWidget11;
                            }
                            ++v14;
                            arrayList1 = arrayList2;
                        }
                    }
                }
                if(constraintWidget2 != null && (constraintWidget2 == constraintWidget3 || z1)) {
                    ConstraintAnchor constraintAnchor23 = constraintWidget0.mListAnchors[v2];
                    ConstraintAnchor constraintAnchor24 = constraintWidget1.mListAnchors[v2 + 1];
                    SolverVariable solverVariable14 = constraintAnchor23.mTarget == null ? null : constraintAnchor23.mTarget.e;
                    SolverVariable solverVariable15 = constraintAnchor24.mTarget == null ? null : constraintAnchor24.mTarget.e;
                    ConstraintAnchor constraintAnchor25 = constraintWidget2.mListAnchors[v2];
                    if(constraintWidget3 != null) {
                        constraintAnchor24 = constraintWidget3.mListAnchors[v2 + 1];
                    }
                    if(solverVariable14 == null || solverVariable15 == null) {
                        constraintWidget12 = constraintWidget3;
                        constraintWidget13 = constraintWidget2;
                        constraintWidget32 = constraintWidget1;
                        v4 = v6;
                    }
                    else {
                        float f4 = v == 0 ? constraintWidget4.y : constraintWidget4.z;
                        int v22 = constraintAnchor25.getMargin();
                        int v23 = constraintAnchor24.getMargin();
                        constraintWidget12 = constraintWidget3;
                        constraintWidget32 = constraintWidget1;
                        constraintWidget13 = constraintWidget2;
                        v4 = v6;
                        linearSystem0.addCentering(constraintAnchor25.e, solverVariable14, v22, f4, solverVariable15, constraintAnchor24.e, v23, 7);
                    }
                    constraintWidget14 = constraintWidget32;
                }
                else {
                    constraintWidget12 = constraintWidget3;
                    constraintWidget13 = constraintWidget2;
                    constraintWidget14 = constraintWidget1;
                    v4 = v6;
                    ConstraintWidget constraintWidget15 = constraintWidget0;
                    if(v7 != 0 && constraintWidget13 != null) {
                        boolean z4 = chainHead2.mWidgetsMatchCount > 0 && chainHead2.mWidgetsCount == chainHead2.mWidgetsMatchCount;
                        ConstraintWidget constraintWidget16 = constraintWidget13;
                        ConstraintWidget constraintWidget17 = constraintWidget16;
                        while(constraintWidget17 != null) {
                            ConstraintWidget constraintWidget18;
                            for(constraintWidget18 = constraintWidget17.mNextChainWidget[v]; constraintWidget18 != null && constraintWidget18.getVisibility() == 8; constraintWidget18 = constraintWidget18.mNextChainWidget[v]) {
                            }
                            if(constraintWidget18 != null || constraintWidget17 == constraintWidget12) {
                                ConstraintAnchor constraintAnchor9 = constraintWidget17.mListAnchors[v2];
                                SolverVariable solverVariable5 = constraintAnchor9.e;
                                SolverVariable solverVariable6 = constraintAnchor9.mTarget == null ? null : constraintAnchor9.mTarget.e;
                                if(constraintWidget16 != constraintWidget17) {
                                    solverVariable6 = constraintWidget16.mListAnchors[v2 + 1].e;
                                }
                                else if(constraintWidget17 == constraintWidget13) {
                                    ConstraintAnchor constraintAnchor10 = constraintWidget15.mListAnchors[v2].mTarget;
                                    solverVariable6 = constraintAnchor10 == null ? null : constraintAnchor10.e;
                                }
                                int v15 = constraintAnchor9.getMargin();
                                int v16 = constraintWidget17.mListAnchors[v2 + 1].getMargin();
                                if(constraintWidget18 == null) {
                                    constraintWidget23 = constraintWidget15;
                                    constraintAnchor11 = constraintWidget14.mListAnchors[v2 + 1].mTarget;
                                    if(constraintAnchor11 == null) {
                                        constraintWidget24 = null;
                                        solverVariable7 = null;
                                    }
                                    else {
                                        solverVariable7 = constraintAnchor11.e;
                                        constraintWidget24 = null;
                                    }
                                }
                                else {
                                    constraintAnchor11 = constraintWidget18.mListAnchors[v2];
                                    constraintWidget23 = constraintWidget15;
                                    solverVariable7 = constraintAnchor11.e;
                                    constraintWidget24 = constraintWidget18;
                                }
                                SolverVariable solverVariable8 = constraintWidget17.mListAnchors[v2 + 1].e;
                                if(constraintAnchor11 != null) {
                                    v16 += constraintAnchor11.getMargin();
                                }
                                int v17 = constraintWidget16.mListAnchors[v2 + 1].getMargin() + v15;
                                if(solverVariable5 == null || solverVariable6 == null || solverVariable7 == null || solverVariable8 == null) {
                                    constraintWidget22 = constraintWidget17;
                                    constraintWidget20 = constraintWidget24;
                                    constraintWidget19 = constraintWidget23;
                                    constraintWidget21 = constraintWidget16;
                                }
                                else {
                                    if(constraintWidget17 == constraintWidget13) {
                                        v17 = constraintWidget13.mListAnchors[v2].getMargin();
                                    }
                                    constraintWidget20 = constraintWidget24;
                                    constraintWidget21 = constraintWidget16;
                                    constraintWidget19 = constraintWidget23;
                                    constraintWidget22 = constraintWidget17;
                                    linearSystem0.addCentering(solverVariable5, solverVariable6, v17, 0.5f, solverVariable7, solverVariable8, (constraintWidget17 == constraintWidget12 ? constraintWidget12.mListAnchors[v2 + 1].getMargin() : v16), (z4 ? 8 : 5));
                                }
                            }
                            else {
                                constraintWidget19 = constraintWidget15;
                                constraintWidget20 = null;
                                constraintWidget21 = constraintWidget16;
                                constraintWidget22 = constraintWidget17;
                            }
                            constraintWidget16 = constraintWidget22.getVisibility() == 8 ? constraintWidget21 : constraintWidget22;
                            constraintWidget17 = constraintWidget20;
                            constraintWidget15 = constraintWidget19;
                        }
                    }
                    else if(v8 != 0 && constraintWidget13 != null) {
                        boolean z5 = chainHead2.mWidgetsMatchCount > 0 && chainHead2.mWidgetsCount == chainHead2.mWidgetsMatchCount;
                        ConstraintWidget constraintWidget25 = constraintWidget13;
                        ConstraintWidget constraintWidget26 = constraintWidget25;
                        while(constraintWidget25 != null) {
                            ConstraintWidget constraintWidget27;
                            for(constraintWidget27 = constraintWidget25.mNextChainWidget[v]; constraintWidget27 != null && constraintWidget27.getVisibility() == 8; constraintWidget27 = constraintWidget27.mNextChainWidget[v]) {
                            }
                            if(constraintWidget25 == constraintWidget13 || constraintWidget25 == constraintWidget12 || constraintWidget27 == null) {
                                constraintWidget30 = constraintWidget26;
                                constraintWidget31 = constraintWidget27;
                            }
                            else {
                                ConstraintWidget constraintWidget28 = constraintWidget27 == constraintWidget12 ? null : constraintWidget27;
                                ConstraintAnchor constraintAnchor12 = constraintWidget25.mListAnchors[v2];
                                SolverVariable solverVariable9 = constraintAnchor12.e;
                                SolverVariable solverVariable10 = constraintWidget26.mListAnchors[v2 + 1].e;
                                int v18 = constraintAnchor12.getMargin();
                                int v19 = constraintWidget25.mListAnchors[v2 + 1].getMargin();
                                if(constraintWidget28 == null) {
                                    ConstraintAnchor constraintAnchor15 = constraintWidget12.mListAnchors[v2];
                                    if(constraintAnchor15 == null) {
                                        constraintAnchor16 = null;
                                        solverVariable13 = null;
                                    }
                                    else {
                                        solverVariable13 = constraintAnchor15.e;
                                        constraintAnchor16 = constraintAnchor15;
                                    }
                                    solverVariable12 = constraintWidget25.mListAnchors[v2 + 1].e;
                                    constraintAnchor13 = constraintAnchor16;
                                    solverVariable11 = solverVariable13;
                                }
                                else {
                                    constraintAnchor13 = constraintWidget28.mListAnchors[v2];
                                    solverVariable11 = constraintAnchor13.e;
                                    ConstraintAnchor constraintAnchor14 = constraintAnchor13.mTarget;
                                    solverVariable12 = constraintAnchor14 == null ? null : constraintAnchor14.e;
                                }
                                int v20 = constraintAnchor13 == null ? v19 : constraintAnchor13.getMargin() + v19;
                                int v21 = constraintWidget26.mListAnchors[v2 + 1].getMargin() + v18;
                                if(solverVariable9 == null || solverVariable10 == null || solverVariable11 == null || solverVariable12 == null) {
                                    constraintWidget29 = constraintWidget28;
                                    constraintWidget30 = constraintWidget26;
                                }
                                else {
                                    constraintWidget29 = constraintWidget28;
                                    constraintWidget30 = constraintWidget26;
                                    linearSystem0.addCentering(solverVariable9, solverVariable10, v21, 0.5f, solverVariable11, solverVariable12, v20, (z5 ? 8 : 4));
                                }
                                constraintWidget31 = constraintWidget29;
                            }
                            constraintWidget26 = constraintWidget25.getVisibility() == 8 ? constraintWidget30 : constraintWidget25;
                            constraintWidget25 = constraintWidget31;
                        }
                        ConstraintAnchor constraintAnchor17 = constraintWidget13.mListAnchors[v2];
                        ConstraintAnchor constraintAnchor18 = constraintWidget15.mListAnchors[v2].mTarget;
                        ConstraintAnchor constraintAnchor19 = constraintWidget12.mListAnchors[v2 + 1];
                        ConstraintAnchor constraintAnchor20 = constraintWidget14.mListAnchors[v2 + 1].mTarget;
                        if(constraintAnchor18 == null) {
                            constraintAnchor21 = constraintAnchor20;
                            constraintAnchor22 = constraintAnchor19;
                        }
                        else if(constraintWidget13 != constraintWidget12) {
                            linearSystem0.addEquality(constraintAnchor17.e, constraintAnchor18.e, constraintAnchor17.getMargin(), 5);
                            constraintAnchor21 = constraintAnchor20;
                            constraintAnchor22 = constraintAnchor19;
                        }
                        else if(constraintAnchor20 != null) {
                            constraintAnchor21 = constraintAnchor20;
                            constraintAnchor22 = constraintAnchor19;
                            linearSystem0.addCentering(constraintAnchor17.e, constraintAnchor18.e, constraintAnchor17.getMargin(), 0.5f, constraintAnchor19.e, constraintAnchor20.e, constraintAnchor19.getMargin(), 5);
                        }
                        if(constraintAnchor21 != null && constraintWidget13 != constraintWidget12) {
                            linearSystem0.addEquality(constraintAnchor22.e, constraintAnchor21.e, -constraintAnchor22.getMargin(), 5);
                        }
                    }
                }
                if(v7 == 0 && v8 == 0 || constraintWidget13 == null || constraintWidget13 == constraintWidget12) {
                    goto label_332;
                }
                else {
                    ConstraintAnchor[] arr_constraintAnchor2 = constraintWidget13.mListAnchors;
                    ConstraintAnchor constraintAnchor26 = arr_constraintAnchor2[v2];
                    ConstraintWidget constraintWidget33 = constraintWidget12 == null ? constraintWidget13 : constraintWidget12;
                    ConstraintAnchor constraintAnchor27 = constraintWidget33.mListAnchors[v2 + 1];
                    SolverVariable solverVariable16 = constraintAnchor26.mTarget == null ? null : constraintAnchor26.mTarget.e;
                    SolverVariable solverVariable17 = constraintAnchor27.mTarget == null ? null : constraintAnchor27.mTarget.e;
                    if(constraintWidget14 == constraintWidget33) {
                        constraintWidget6 = solverVariable17;
                    }
                    else {
                        ConstraintAnchor constraintAnchor28 = constraintWidget14.mListAnchors[v2 + 1].mTarget;
                        if(constraintAnchor28 != null) {
                            constraintWidget6 = constraintAnchor28.e;
                        }
                    }
                    if(constraintWidget13 == constraintWidget33) {
                        constraintAnchor27 = arr_constraintAnchor2[v2 + 1];
                    }
                    if(solverVariable16 != null && constraintWidget6 != null) {
                        int v24 = constraintAnchor26.getMargin();
                        int v25 = constraintWidget33.mListAnchors[v2 + 1].getMargin();
                        linearSystem0.addCentering(constraintAnchor26.e, solverVariable16, v24, 0.5f, ((SolverVariable)constraintWidget6), constraintAnchor27.e, v25, 5);
                    }
                }
            }
            else {
                v4 = v3;
                v5 = v1;
            }
            v3 = v4 + 1;
            v1 = v5;
            continue;
        label_332:
            v3 = v4 + 1;
            v1 = v5;
        }
    }
}

