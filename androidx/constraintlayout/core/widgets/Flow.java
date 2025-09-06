package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.LinearSystem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Flow extends VirtualLayout {
    public static final int HORIZONTAL_ALIGN_CENTER = 2;
    public static final int HORIZONTAL_ALIGN_END = 1;
    public static final int HORIZONTAL_ALIGN_START = 0;
    public int U;
    public int V;
    public static final int VERTICAL_ALIGN_BASELINE = 3;
    public static final int VERTICAL_ALIGN_BOTTOM = 1;
    public static final int VERTICAL_ALIGN_CENTER = 2;
    public static final int VERTICAL_ALIGN_TOP = 0;
    public int W;
    public static final int WRAP_ALIGNED = 2;
    public static final int WRAP_CHAIN = 1;
    public static final int WRAP_CHAIN_NEW = 3;
    public static final int WRAP_NONE;
    public int X;
    public int Y;
    public int Z;
    public float a0;
    public float b0;
    public float c0;
    public float d0;
    public float e0;
    public float f0;
    public int g0;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    public int m0;
    public final ArrayList n0;
    public ConstraintWidget[] o0;
    public ConstraintWidget[] p0;
    public int[] q0;
    public ConstraintWidget[] r0;
    public int s0;

    public Flow() {
        this.U = -1;
        this.V = -1;
        this.W = -1;
        this.X = -1;
        this.Y = -1;
        this.Z = -1;
        this.a0 = 0.5f;
        this.b0 = 0.5f;
        this.c0 = 0.5f;
        this.d0 = 0.5f;
        this.e0 = 0.5f;
        this.f0 = 0.5f;
        this.g0 = 0;
        this.h0 = 0;
        this.i0 = 2;
        this.j0 = 2;
        this.k0 = 0;
        this.l0 = -1;
        this.m0 = 0;
        this.n0 = new ArrayList();
        this.o0 = null;
        this.p0 = null;
        this.q0 = null;
        this.s0 = 0;
    }

    @Override  // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void addToSolver(LinearSystem linearSystem0, boolean z) {
        float f1;
        int v6;
        super.addToSolver(linearSystem0, z);
        boolean z1 = this.getParent() != null && ((ConstraintWidgetContainer)this.getParent()).isRtl();
        ArrayList arrayList0 = this.n0;
        switch(this.k0) {
            case 0: {
                if(arrayList0.size() > 0) {
                    ((c)arrayList0.get(0)).b(0, z1, true);
                }
                break;
            }
            case 1: {
                int v = arrayList0.size();
                for(int v1 = 0; v1 < v; ++v1) {
                    ((c)arrayList0.get(v1)).b(v1, z1, v1 == v - 1);
                }
                break;
            }
            case 2: {
                if(this.q0 != null && this.p0 != null && this.o0 != null) {
                    for(int v2 = 0; v2 < this.s0; ++v2) {
                        this.r0[v2].resetAnchors();
                    }
                    int[] arr_v = this.q0;
                    int v3 = arr_v[0];
                    int v4 = arr_v[1];
                    float f = this.a0;
                    ConstraintWidget constraintWidget0 = null;
                    int v5 = 0;
                    while(v5 < v3) {
                        if(z1) {
                            v6 = v3 - v5 - 1;
                            f1 = 1.0f - this.a0;
                        }
                        else {
                            f1 = f;
                            v6 = v5;
                        }
                        ConstraintWidget constraintWidget1 = this.p0[v6];
                        if(constraintWidget1 != null && constraintWidget1.getVisibility() != 8) {
                            if(v5 == 0) {
                                constraintWidget1.connect(constraintWidget1.mLeft, this.mLeft, this.getPaddingLeft());
                                constraintWidget1.setHorizontalChainStyle(this.U);
                                constraintWidget1.setHorizontalBiasPercent(f1);
                            }
                            if(v5 == v3 - 1) {
                                constraintWidget1.connect(constraintWidget1.mRight, this.mRight, this.getPaddingRight());
                            }
                            if(v5 > 0 && constraintWidget0 != null) {
                                constraintWidget1.connect(constraintWidget1.mLeft, constraintWidget0.mRight, this.g0);
                                constraintWidget0.connect(constraintWidget0.mRight, constraintWidget1.mLeft, 0);
                            }
                            constraintWidget0 = constraintWidget1;
                        }
                        ++v5;
                        f = f1;
                    }
                    for(int v7 = 0; v7 < v4; ++v7) {
                        ConstraintWidget constraintWidget2 = this.o0[v7];
                        if(constraintWidget2 != null && constraintWidget2.getVisibility() != 8) {
                            if(v7 == 0) {
                                constraintWidget2.connect(constraintWidget2.mTop, this.mTop, this.getPaddingTop());
                                constraintWidget2.setVerticalChainStyle(this.V);
                                constraintWidget2.setVerticalBiasPercent(this.b0);
                            }
                            if(v7 == v4 - 1) {
                                constraintWidget2.connect(constraintWidget2.mBottom, this.mBottom, this.getPaddingBottom());
                            }
                            if(v7 > 0 && constraintWidget0 != null) {
                                constraintWidget2.connect(constraintWidget2.mTop, constraintWidget0.mBottom, this.h0);
                                constraintWidget0.connect(constraintWidget0.mBottom, constraintWidget2.mTop, 0);
                            }
                            constraintWidget0 = constraintWidget2;
                        }
                    }
                    for(int v8 = 0; v8 < v3; ++v8) {
                        for(int v9 = 0; v9 < v4; ++v9) {
                            int v10 = this.m0 == 1 ? v8 * v4 + v9 : v9 * v3 + v8;
                            ConstraintWidget[] arr_constraintWidget = this.r0;
                            if(v10 < arr_constraintWidget.length) {
                                ConstraintWidget constraintWidget3 = arr_constraintWidget[v10];
                                if(constraintWidget3 != null && constraintWidget3.getVisibility() != 8) {
                                    ConstraintWidget constraintWidget4 = this.p0[v8];
                                    ConstraintWidget constraintWidget5 = this.o0[v9];
                                    if(constraintWidget3 != constraintWidget4) {
                                        constraintWidget3.connect(constraintWidget3.mLeft, constraintWidget4.mLeft, 0);
                                        constraintWidget3.connect(constraintWidget3.mRight, constraintWidget4.mRight, 0);
                                    }
                                    if(constraintWidget3 != constraintWidget5) {
                                        constraintWidget3.connect(constraintWidget3.mTop, constraintWidget5.mTop, 0);
                                        constraintWidget3.connect(constraintWidget3.mBottom, constraintWidget5.mBottom, 0);
                                    }
                                }
                            }
                        }
                    }
                }
                break;
            }
            case 3: {
                int v11 = arrayList0.size();
                for(int v12 = 0; v12 < v11; ++v12) {
                    ((c)arrayList0.get(v12)).b(v12, z1, v12 == v11 - 1);
                }
            }
        }
        this.needsCallbackFromSolver(false);
    }

    @Override  // androidx.constraintlayout.core.widgets.HelperWidget
    public void copy(ConstraintWidget constraintWidget0, HashMap hashMap0) {
        super.copy(constraintWidget0, hashMap0);
        this.U = ((Flow)constraintWidget0).U;
        this.V = ((Flow)constraintWidget0).V;
        this.W = ((Flow)constraintWidget0).W;
        this.X = ((Flow)constraintWidget0).X;
        this.Y = ((Flow)constraintWidget0).Y;
        this.Z = ((Flow)constraintWidget0).Z;
        this.a0 = ((Flow)constraintWidget0).a0;
        this.b0 = ((Flow)constraintWidget0).b0;
        this.c0 = ((Flow)constraintWidget0).c0;
        this.d0 = ((Flow)constraintWidget0).d0;
        this.e0 = ((Flow)constraintWidget0).e0;
        this.f0 = ((Flow)constraintWidget0).f0;
        this.g0 = ((Flow)constraintWidget0).g0;
        this.h0 = ((Flow)constraintWidget0).h0;
        this.i0 = ((Flow)constraintWidget0).i0;
        this.j0 = ((Flow)constraintWidget0).j0;
        this.k0 = ((Flow)constraintWidget0).k0;
        this.l0 = ((Flow)constraintWidget0).l0;
        this.m0 = ((Flow)constraintWidget0).m0;
    }

    public float getMaxElementsWrap() {
        return (float)this.l0;
    }

    public final int k(ConstraintWidget constraintWidget0, int v) {
        if(constraintWidget0 == null) {
            return 0;
        }
        if(constraintWidget0.getVerticalDimensionBehaviour() == DimensionBehaviour.MATCH_CONSTRAINT) {
            int v1 = constraintWidget0.mMatchConstraintDefaultHeight;
            if(v1 == 0) {
                return 0;
            }
            switch(v1) {
                case 1: {
                    return constraintWidget0.getHeight();
                }
                case 2: {
                    int v2 = (int)(constraintWidget0.mMatchConstraintPercentHeight * ((float)v));
                    if(v2 != constraintWidget0.getHeight()) {
                        constraintWidget0.setMeasureRequested(true);
                        this.measure(constraintWidget0, constraintWidget0.getHorizontalDimensionBehaviour(), constraintWidget0.getWidth(), DimensionBehaviour.FIXED, v2);
                    }
                    return v2;
                }
                case 3: {
                    return (int)(((float)constraintWidget0.getWidth()) * constraintWidget0.mDimensionRatio + 0.5f);
                }
                default: {
                    return constraintWidget0.getHeight();
                }
            }
        }
        return constraintWidget0.getHeight();
    }

    public final int l(ConstraintWidget constraintWidget0, int v) {
        if(constraintWidget0 == null) {
            return 0;
        }
        if(constraintWidget0.getHorizontalDimensionBehaviour() == DimensionBehaviour.MATCH_CONSTRAINT) {
            int v1 = constraintWidget0.mMatchConstraintDefaultWidth;
            if(v1 == 0) {
                return 0;
            }
            switch(v1) {
                case 1: {
                    return constraintWidget0.getWidth();
                }
                case 2: {
                    int v2 = (int)(constraintWidget0.mMatchConstraintPercentWidth * ((float)v));
                    if(v2 != constraintWidget0.getWidth()) {
                        constraintWidget0.setMeasureRequested(true);
                        DimensionBehaviour constraintWidget$DimensionBehaviour0 = constraintWidget0.getVerticalDimensionBehaviour();
                        int v3 = constraintWidget0.getHeight();
                        this.measure(constraintWidget0, DimensionBehaviour.FIXED, v2, constraintWidget$DimensionBehaviour0, v3);
                    }
                    return v2;
                }
                case 3: {
                    return (int)(((float)constraintWidget0.getHeight()) * constraintWidget0.mDimensionRatio + 0.5f);
                }
                default: {
                    return constraintWidget0.getWidth();
                }
            }
        }
        return constraintWidget0.getWidth();
    }

    @Override  // androidx.constraintlayout.core.widgets.VirtualLayout
    public void measure(int v, int v1, int v2, int v3) {
        int v95;
        int v17;
        int v16;
        int v90;
        ArrayList arrayList5;
        int v89;
        ArrayList arrayList4;
        int v77;
        int v72;
        ConstraintWidget constraintWidget12;
        int v71;
        int v70;
        int v66;
        int v49;
        int v47;
        int v40;
        ArrayList arrayList2;
        int v25;
        ConstraintWidget constraintWidget2;
        int v21;
        c c0;
        int v14;
        if(this.mWidgetsCount > 0 && !this.measureChildren()) {
            this.setMeasure(0, 0);
            this.needsCallbackFromSolver(false);
            return;
        }
        int v4 = this.getPaddingLeft();
        int v5 = this.getPaddingRight();
        int v6 = this.getPaddingTop();
        int v7 = this.getPaddingBottom();
        int v8 = 0;
        int v9 = 0;
        int v10 = v1 - v4 - v5;
        int v11 = this.m0;
        if(v11 == 1) {
            v10 = v3 - v6 - v7;
        }
        if(v11 == 0) {
            if(this.U == -1) {
                this.U = 0;
            }
            if(this.V == -1) {
                this.V = 0;
            }
        }
        else {
            if(this.U == -1) {
                this.U = 0;
            }
            if(this.V == -1) {
                this.V = 0;
            }
        }
        ConstraintWidget[] arr_constraintWidget = this.mWidgets;
        int v13 = 0;
        for(int v12 = 0; true; ++v12) {
            v14 = this.mWidgetsCount;
            if(v12 >= v14) {
                break;
            }
            if(this.mWidgets[v12].getVisibility() == 8) {
                ++v13;
            }
        }
        if(v13 > 0) {
            arr_constraintWidget = new ConstraintWidget[v14 - v13];
            v14 = 0;
            for(int v15 = 0; v15 < this.mWidgetsCount; ++v15) {
                ConstraintWidget constraintWidget0 = this.mWidgets[v15];
                if(constraintWidget0.getVisibility() != 8) {
                    arr_constraintWidget[v14] = constraintWidget0;
                    ++v14;
                }
            }
        }
        this.r0 = arr_constraintWidget;
        this.s0 = v14;
        ArrayList arrayList0 = this.n0;
        switch(this.k0) {
            case 0: {
                v16 = v4;
                v17 = v5;
                int v18 = this.m0;
                if(v14 != 0) {
                    if(arrayList0.size() == 0) {
                        c0 = new c(this, v18, this.mLeft, this.mTop, this.mRight, this.mBottom, v10);
                        arrayList0.add(c0);
                    }
                    else {
                        c0 = (c)arrayList0.get(0);
                        c0.c = 0;
                        c0.b = null;
                        c0.l = 0;
                        c0.m = 0;
                        c0.n = 0;
                        c0.o = 0;
                        c0.p = 0;
                        c0.f(v18, this.mLeft, this.mTop, this.mRight, this.mBottom, this.getPaddingLeft(), this.getPaddingTop(), this.getPaddingRight(), this.getPaddingBottom(), v10);
                    }
                    for(int v19 = 0; v19 < v14; ++v19) {
                        c0.a(arr_constraintWidget[v19]);
                    }
                    v8 = c0.d();
                    v9 = c0.c();
                }
                break;
            }
            case 1: {
                ArrayList arrayList1 = arrayList0;
                v16 = v4;
                v17 = v5;
                int v20 = this.m0;
                if(v14 != 0) {
                    arrayList1.clear();
                    c c1 = new c(this, v20, this.mLeft, this.mTop, this.mRight, this.mBottom, v10);
                    arrayList1.add(c1);
                    if(v20 == 0) {
                        v21 = 0;
                        int v22 = 0;
                        int v23 = 0;
                        while(v23 < v14) {
                            ConstraintWidget constraintWidget1 = arr_constraintWidget[v23];
                            int v24 = this.l(constraintWidget1, v10);
                            if(constraintWidget1.getHorizontalDimensionBehaviour() == DimensionBehaviour.MATCH_CONSTRAINT) {
                                ++v21;
                            }
                            if(((v22 == v10 || this.g0 + v22 + v24 > v10) && c1.b != null || v23 <= 0 || (this.l0 <= 0 || v23 % this.l0 != 0) ? (v22 == v10 || this.g0 + v22 + v24 > v10) && c1.b != null : true)) {
                                constraintWidget2 = constraintWidget1;
                                c1 = new c(this, 0, this.mLeft, this.mTop, this.mRight, this.mBottom, v10);
                                c1.n = v23;
                                arrayList1.add(c1);
                            }
                            else {
                                constraintWidget2 = constraintWidget1;
                                if(v23 > 0) {
                                    v22 = this.g0 + v24 + v22;
                                    goto label_104;
                                }
                            }
                            v22 = v24;
                        label_104:
                            c1.a(constraintWidget2);
                            ++v23;
                        }
                        v25 = 0;
                    }
                    else {
                        v25 = v20;
                        v21 = 0;
                        int v26 = 0;
                        int v27 = 0;
                        while(v27 < v14) {
                            ConstraintWidget constraintWidget3 = arr_constraintWidget[v27];
                            int v28 = this.k(constraintWidget3, v10);
                            if(constraintWidget3.getVerticalDimensionBehaviour() == DimensionBehaviour.MATCH_CONSTRAINT) {
                                ++v21;
                            }
                            if(((v26 == v10 || this.h0 + v26 + v28 > v10) && c1.b != null || v27 <= 0 || (this.l0 <= 0 || v27 % this.l0 != 0) ? (v26 == v10 || this.h0 + v26 + v28 > v10) && c1.b != null : true)) {
                                c1 = new c(this, v25, this.mLeft, this.mTop, this.mRight, this.mBottom, v10);
                                c1.n = v27;
                                arrayList1.add(c1);
                            }
                            else if(v27 > 0) {
                                v26 = this.h0 + v28 + v26;
                                goto label_127;
                            }
                            v26 = v28;
                        label_127:
                            c1.a(constraintWidget3);
                            ++v27;
                        }
                    }
                    int v29 = arrayList1.size();
                    ConstraintAnchor constraintAnchor0 = this.mLeft;
                    ConstraintAnchor constraintAnchor1 = this.mTop;
                    ConstraintAnchor constraintAnchor2 = this.mRight;
                    ConstraintAnchor constraintAnchor3 = this.mBottom;
                    int v30 = this.getPaddingLeft();
                    int v31 = this.getPaddingTop();
                    int v32 = this.getPaddingRight();
                    int v33 = this.getPaddingBottom();
                    if(v21 > 0 && (this.getHorizontalDimensionBehaviour() == DimensionBehaviour.WRAP_CONTENT || this.getVerticalDimensionBehaviour() == DimensionBehaviour.WRAP_CONTENT)) {
                        for(int v34 = 0; v34 < v29; ++v34) {
                            c c2 = (c)arrayList1.get(v34);
                            if(v25 == 0) {
                                c2.e(v10 - c2.d());
                            }
                            else {
                                c2.e(v10 - c2.c());
                            }
                        }
                    }
                    int v35 = 0;
                    int v36 = 0;
                    int v37 = 0;
                    while(v35 < v29) {
                        c c3 = (c)arrayList1.get(v35);
                        if(v25 == 0) {
                            if(v35 < v29 - 1) {
                                constraintAnchor3 = ((c)arrayList1.get(v35 + 1)).b.mTop;
                                arrayList2 = arrayList1;
                                v33 = 0;
                            }
                            else {
                                constraintAnchor3 = this.mBottom;
                                v33 = this.getPaddingBottom();
                                arrayList2 = arrayList1;
                            }
                            ConstraintAnchor constraintAnchor4 = c3.b.mBottom;
                            c3.f(0, constraintAnchor0, constraintAnchor1, constraintAnchor2, constraintAnchor3, v30, v31, v32, v33, v10);
                            int v38 = Math.max(v36, c3.d());
                            int v39 = c3.c() + v37;
                            if(v35 > 0) {
                                v39 += this.h0;
                            }
                            v36 = v38;
                            v37 = v39;
                            constraintAnchor1 = constraintAnchor4;
                            arrayList1 = arrayList2;
                            v31 = 0;
                            v40 = v29;
                        }
                        else {
                            if(v35 < v29 - 1) {
                                constraintAnchor2 = ((c)arrayList1.get(v35 + 1)).b.mLeft;
                                v40 = v29;
                                v32 = 0;
                            }
                            else {
                                constraintAnchor2 = this.mRight;
                                v32 = this.getPaddingRight();
                                v40 = v29;
                            }
                            ConstraintAnchor constraintAnchor5 = c3.b.mRight;
                            c3.f(v25, constraintAnchor0, constraintAnchor1, constraintAnchor2, constraintAnchor3, v30, v31, v32, v33, v10);
                            int v41 = c3.d() + v36;
                            int v42 = Math.max(v37, c3.c());
                            if(v35 > 0) {
                                v41 += this.g0;
                            }
                            v36 = v41;
                            v37 = v42;
                            v30 = 0;
                            constraintAnchor0 = constraintAnchor5;
                        }
                        ++v35;
                        v29 = v40;
                    }
                    v8 = v36;
                    v9 = v37;
                }
                break;
            }
            case 2: {
                v16 = v4;
                v17 = v5;
                int v43 = this.m0;
                if(v43 == 0) {
                    int v44 = this.l0;
                    if(v44 <= 0) {
                        int v46 = 0;
                        v47 = 0;
                        for(int v45 = 0; v45 < v14; ++v45) {
                            if(v45 > 0) {
                                v46 += this.g0;
                            }
                            ConstraintWidget constraintWidget4 = arr_constraintWidget[v45];
                            if(constraintWidget4 != null) {
                                int v48 = this.l(constraintWidget4, v10) + v46;
                                if(v48 > v10) {
                                    break;
                                }
                                ++v47;
                                v46 = v48;
                            }
                        }
                    }
                    else {
                        v47 = v44;
                    }
                    v49 = 0;
                }
                else {
                    v49 = this.l0;
                    if(v49 <= 0) {
                        int v51 = 0;
                        int v52 = 0;
                        for(int v50 = 0; v50 < v14; ++v50) {
                            if(v50 > 0) {
                                v51 += this.h0;
                            }
                            ConstraintWidget constraintWidget5 = arr_constraintWidget[v50];
                            if(constraintWidget5 != null) {
                                int v53 = this.k(constraintWidget5, v10) + v51;
                                if(v53 > v10) {
                                    break;
                                }
                                ++v52;
                                v51 = v53;
                            }
                        }
                        v49 = v52;
                    }
                    v47 = 0;
                }
                if(this.q0 == null) {
                    this.q0 = new int[2];
                }
                boolean z = v49 == 0 && v43 == 1 || v47 == 0 && v43 == 0;
                while(!z) {
                    if(v43 == 0) {
                        v49 = (int)Math.ceil(((float)v14) / ((float)v47));
                    }
                    else {
                        v47 = (int)Math.ceil(((float)v14) / ((float)v49));
                    }
                    ConstraintWidget[] arr_constraintWidget1 = this.p0;
                    if(arr_constraintWidget1 == null || arr_constraintWidget1.length < v47) {
                        this.p0 = new ConstraintWidget[v47];
                    }
                    else {
                        Arrays.fill(arr_constraintWidget1, null);
                    }
                    ConstraintWidget[] arr_constraintWidget2 = this.o0;
                    if(arr_constraintWidget2 == null || arr_constraintWidget2.length < v49) {
                        this.o0 = new ConstraintWidget[v49];
                    }
                    else {
                        Arrays.fill(arr_constraintWidget2, null);
                    }
                    for(int v54 = 0; v54 < v47; ++v54) {
                        for(int v55 = 0; v55 < v49; ++v55) {
                            int v56 = v43 == 1 ? v54 * v49 + v55 : v55 * v47 + v54;
                            if(v56 < arr_constraintWidget.length) {
                                ConstraintWidget constraintWidget6 = arr_constraintWidget[v56];
                                if(constraintWidget6 != null) {
                                    int v57 = this.l(constraintWidget6, v10);
                                    ConstraintWidget constraintWidget7 = this.p0[v54];
                                    if(constraintWidget7 == null || constraintWidget7.getWidth() < v57) {
                                        this.p0[v54] = constraintWidget6;
                                    }
                                    int v58 = this.k(constraintWidget6, v10);
                                    ConstraintWidget constraintWidget8 = this.o0[v55];
                                    if(constraintWidget8 == null || constraintWidget8.getHeight() < v58) {
                                        this.o0[v55] = constraintWidget6;
                                    }
                                }
                            }
                        }
                    }
                    int v60 = 0;
                    for(int v59 = 0; v59 < v47; ++v59) {
                        ConstraintWidget constraintWidget9 = this.p0[v59];
                        if(constraintWidget9 != null) {
                            if(v59 > 0) {
                                v60 += this.g0;
                            }
                            v60 = this.l(constraintWidget9, v10) + v60;
                        }
                    }
                    int v62 = 0;
                    for(int v61 = 0; v61 < v49; ++v61) {
                        ConstraintWidget constraintWidget10 = this.o0[v61];
                        if(constraintWidget10 != null) {
                            if(v61 > 0) {
                                v62 += this.h0;
                            }
                            v62 = this.k(constraintWidget10, v10) + v62;
                        }
                    }
                    v8 = v60;
                    v9 = v62;
                    if(v43 != 0) {
                        if(v62 > v10 && v49 > 1) {
                            --v49;
                            continue;
                        }
                    }
                    else if(v60 > v10 && v47 > 1) {
                        --v47;
                        continue;
                    }
                    z = true;
                }
                int[] arr_v = this.q0;
                arr_v[0] = v47;
                arr_v[1] = v49;
                break;
            }
            case 3: {
                int v63 = this.m0;
                if(v14 == 0) {
                    v16 = v4;
                    v17 = v5;
                }
                else {
                    arrayList0.clear();
                    ArrayList arrayList3 = arrayList0;
                    int v64 = v10;
                    c c4 = new c(this, v63, this.mLeft, this.mTop, this.mRight, this.mBottom, v64);
                    arrayList3.add(c4);
                    if(v63 == 0) {
                        c c5 = c4;
                        int v65 = 0;
                        v66 = 0;
                        int v67 = 0;
                        int v68 = 0;
                        while(v68 < v14) {
                            ConstraintWidget constraintWidget11 = arr_constraintWidget[v68];
                            int v69 = this.l(constraintWidget11, v64);
                            if(constraintWidget11.getHorizontalDimensionBehaviour() == DimensionBehaviour.MATCH_CONSTRAINT) {
                                ++v66;
                            }
                            if(((v67 == v64 || this.g0 + v67 + v69 > v64) && c5.b != null || v68 <= 0 || (this.l0 <= 0 || v65 + 1 <= this.l0) ? (v67 == v64 || this.g0 + v67 + v69 > v64) && c5.b != null : true)) {
                                v70 = v64;
                                v71 = v5;
                                constraintWidget12 = constraintWidget11;
                                c c6 = new c(this, 0, this.mLeft, this.mTop, this.mRight, this.mBottom, v70);
                                c6.n = v68;
                                arrayList3.add(c6);
                                c5 = c6;
                                v67 = v69;
                                ++v65;
                            }
                            else {
                                v70 = v64;
                                v71 = v5;
                                constraintWidget12 = constraintWidget11;
                                v67 = v68 <= 0 ? v69 : this.g0 + v69 + v67;
                                v65 = 0;
                            }
                            c5.a(constraintWidget12);
                            ++v68;
                            v64 = v70;
                            v5 = v71;
                        }
                        v17 = v5;
                        v72 = v64;
                        v16 = v4;
                    }
                    else {
                        v17 = v5;
                        c c7 = c4;
                        int v73 = 0;
                        int v74 = 0;
                        int v75 = 0;
                        while(v75 < v14) {
                            ConstraintWidget constraintWidget13 = arr_constraintWidget[v75];
                            int v76 = this.k(constraintWidget13, v64);
                            if(constraintWidget13.getVerticalDimensionBehaviour() == DimensionBehaviour.MATCH_CONSTRAINT) {
                                ++v73;
                            }
                            if(((v74 == v64 || this.h0 + v74 + v76 > v64) && c7.b != null || v75 <= 0 || (this.l0 <= 0 || this.l0 >= 0) ? (v74 == v64 || this.h0 + v74 + v76 > v64) && c7.b != null : true)) {
                                v77 = v4;
                                c c8 = new c(this, v63, this.mLeft, this.mTop, this.mRight, this.mBottom, v64);
                                c8.n = v75;
                                arrayList3.add(c8);
                                c7 = c8;
                            }
                            else {
                                v77 = v4;
                                if(v75 > 0) {
                                    v74 = this.h0 + v76 + v74;
                                    goto label_383;
                                }
                            }
                            v74 = v76;
                        label_383:
                            c7.a(constraintWidget13);
                            ++v75;
                            v4 = v77;
                        }
                        v72 = v64;
                        v16 = v4;
                        v66 = v73;
                    }
                    int v78 = arrayList3.size();
                    ConstraintAnchor constraintAnchor6 = this.mLeft;
                    ConstraintAnchor constraintAnchor7 = this.mTop;
                    ConstraintAnchor constraintAnchor8 = this.mRight;
                    ConstraintAnchor constraintAnchor9 = this.mBottom;
                    int v79 = this.getPaddingLeft();
                    int v80 = this.getPaddingTop();
                    int v81 = this.getPaddingRight();
                    int v82 = this.getPaddingBottom();
                    if(v66 > 0 && (this.getHorizontalDimensionBehaviour() == DimensionBehaviour.WRAP_CONTENT || this.getVerticalDimensionBehaviour() == DimensionBehaviour.WRAP_CONTENT)) {
                        for(int v83 = 0; v83 < v78; ++v83) {
                            c c9 = (c)arrayList3.get(v83);
                            if(v63 == 0) {
                                c9.e(v72 - c9.d());
                            }
                            else {
                                c9.e(v72 - c9.c());
                            }
                        }
                    }
                    int v84 = 0;
                    int v85 = 0;
                    int v86 = 0;
                    while(v84 < v78) {
                        c c10 = (c)arrayList3.get(v84);
                        if(v63 == 0) {
                            if(v84 < v78 - 1) {
                                constraintAnchor9 = ((c)arrayList3.get(v84 + 1)).b.mTop;
                                arrayList4 = arrayList3;
                                v82 = 0;
                            }
                            else {
                                constraintAnchor9 = this.mBottom;
                                v82 = this.getPaddingBottom();
                                arrayList4 = arrayList3;
                            }
                            ConstraintAnchor constraintAnchor10 = c10.b.mBottom;
                            c10.f(0, constraintAnchor6, constraintAnchor7, constraintAnchor8, constraintAnchor9, v79, v80, v81, v82, v72);
                            int v87 = Math.max(v85, c10.d());
                            int v88 = c10.c() + v86;
                            if(v84 > 0) {
                                v88 += this.h0;
                            }
                            v85 = v87;
                            v86 = v88;
                            constraintAnchor7 = constraintAnchor10;
                            v80 = 0;
                            v89 = v81;
                            arrayList5 = arrayList4;
                            v90 = v78;
                        }
                        else {
                            if(v84 < v78 - 1) {
                                arrayList5 = arrayList3;
                                constraintAnchor8 = ((c)arrayList5.get(v84 + 1)).b.mLeft;
                                v90 = v78;
                                v89 = 0;
                            }
                            else {
                                arrayList5 = arrayList3;
                                constraintAnchor8 = this.mRight;
                                v89 = this.getPaddingRight();
                                v90 = v78;
                            }
                            ConstraintAnchor constraintAnchor11 = c10.b.mRight;
                            c10.f(v63, constraintAnchor6, constraintAnchor7, constraintAnchor8, constraintAnchor9, v79, v80, v89, v82, v72);
                            int v91 = c10.d() + v85;
                            int v92 = Math.max(v86, c10.c());
                            if(v84 > 0) {
                                v91 += this.g0;
                            }
                            v85 = v91;
                            v86 = v92;
                            v79 = 0;
                            constraintAnchor6 = constraintAnchor11;
                        }
                        ++v84;
                        v78 = v90;
                        arrayList3 = arrayList5;
                        v81 = v89;
                    }
                    v8 = v85;
                    v9 = v86;
                }
                break;
            }
            default: {
                v16 = v4;
                v17 = v5;
            }
        }
        int v93 = v8 + v16 + v17;
        int v94 = v9 + v6 + v7;
        if(v == 0x40000000) {
            v93 = v1;
        }
        else if(v == 0x80000000) {
            v93 = Math.min(v93, v1);
        }
        else if(v != 0) {
            v93 = 0;
        }
        if(v2 == 0x40000000) {
            v95 = v3;
        }
        else if(v2 == 0x80000000) {
            v95 = Math.min(v94, v3);
        }
        else {
            v95 = v2 == 0 ? v94 : 0;
        }
        this.setMeasure(v93, v95);
        this.setWidth(v93);
        this.setHeight(v95);
        this.needsCallbackFromSolver(this.mWidgetsCount > 0);
    }

    public void setFirstHorizontalBias(float f) {
        this.c0 = f;
    }

    public void setFirstHorizontalStyle(int v) {
        this.W = v;
    }

    public void setFirstVerticalBias(float f) {
        this.d0 = f;
    }

    public void setFirstVerticalStyle(int v) {
        this.X = v;
    }

    public void setHorizontalAlign(int v) {
        this.i0 = v;
    }

    public void setHorizontalBias(float f) {
        this.a0 = f;
    }

    public void setHorizontalGap(int v) {
        this.g0 = v;
    }

    public void setHorizontalStyle(int v) {
        this.U = v;
    }

    public void setLastHorizontalBias(float f) {
        this.e0 = f;
    }

    public void setLastHorizontalStyle(int v) {
        this.Y = v;
    }

    public void setLastVerticalBias(float f) {
        this.f0 = f;
    }

    public void setLastVerticalStyle(int v) {
        this.Z = v;
    }

    public void setMaxElementsWrap(int v) {
        this.l0 = v;
    }

    public void setOrientation(int v) {
        this.m0 = v;
    }

    public void setVerticalAlign(int v) {
        this.j0 = v;
    }

    public void setVerticalBias(float f) {
        this.b0 = f;
    }

    public void setVerticalGap(int v) {
        this.h0 = v;
    }

    public void setVerticalStyle(int v) {
        this.V = v;
    }

    public void setWrapMode(int v) {
        this.k0 = v;
    }
}

