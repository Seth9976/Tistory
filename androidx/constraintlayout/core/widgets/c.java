package androidx.constraintlayout.core.widgets;

public final class c {
    public int a;
    public ConstraintWidget b;
    public int c;
    public ConstraintAnchor d;
    public ConstraintAnchor e;
    public ConstraintAnchor f;
    public ConstraintAnchor g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public final Flow r;

    public c(Flow flow0, int v, ConstraintAnchor constraintAnchor0, ConstraintAnchor constraintAnchor1, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, int v1) {
        this.r = flow0;
        this.b = null;
        this.c = 0;
        this.i = 0;
        this.j = 0;
        this.k = 0;
        this.l = 0;
        this.m = 0;
        this.n = 0;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.a = v;
        this.d = constraintAnchor0;
        this.e = constraintAnchor1;
        this.f = constraintAnchor2;
        this.g = constraintAnchor3;
        this.h = flow0.getPaddingLeft();
        this.i = flow0.getPaddingTop();
        this.j = flow0.getPaddingRight();
        this.k = flow0.getPaddingBottom();
        this.q = v1;
    }

    public final void a(ConstraintWidget constraintWidget0) {
        int v = 0;
        Flow flow0 = this.r;
        if(this.a == 0) {
            int v1 = flow0.l(constraintWidget0, this.q);
            if(constraintWidget0.getHorizontalDimensionBehaviour() == DimensionBehaviour.MATCH_CONSTRAINT) {
                ++this.p;
                v1 = 0;
            }
            int v2 = flow0.g0;
            if(constraintWidget0.getVisibility() != 8) {
                v = v2;
            }
            this.l = v1 + v + this.l;
            int v3 = flow0.k(constraintWidget0, this.q);
            if(this.b == null || this.c < v3) {
                this.b = constraintWidget0;
                this.c = v3;
                this.m = v3;
            }
        }
        else {
            int v4 = flow0.l(constraintWidget0, this.q);
            int v5 = flow0.k(constraintWidget0, this.q);
            if(constraintWidget0.getVerticalDimensionBehaviour() == DimensionBehaviour.MATCH_CONSTRAINT) {
                ++this.p;
                v5 = 0;
            }
            int v6 = flow0.h0;
            if(constraintWidget0.getVisibility() != 8) {
                v = v6;
            }
            this.m = v5 + v + this.m;
            if(this.b == null || this.c < v4) {
                this.b = constraintWidget0;
                this.c = v4;
                this.l = v4;
            }
        }
        ++this.o;
    }

    public final void b(int v, boolean z, boolean z1) {
        int v21;
        int v16;
        ConstraintWidget constraintWidget4;
        Flow flow0;
        int v1 = this.o;
        for(int v2 = 0; true; ++v2) {
            flow0 = this.r;
            if(v2 >= v1) {
                break;
            }
            int v3 = this.n;
            if(v3 + v2 >= flow0.s0) {
                break;
            }
            ConstraintWidget constraintWidget0 = flow0.r0[v3 + v2];
            if(constraintWidget0 != null) {
                constraintWidget0.resetAnchors();
            }
        }
        if(v1 != 0 && this.b != null) {
            boolean z2 = z1 && v == 0;
            int v5 = -1;
            int v6 = -1;
            for(int v4 = 0; v4 < v1; ++v4) {
                int v7 = z ? v1 - 1 - v4 : v4;
                int v8 = this.n;
                if(v8 + v7 >= flow0.s0) {
                    break;
                }
                ConstraintWidget constraintWidget1 = flow0.r0[v8 + v7];
                if(constraintWidget1 != null && constraintWidget1.getVisibility() == 0) {
                    if(v5 == -1) {
                        v5 = v4;
                    }
                    v6 = v4;
                }
            }
            if(this.a == 0) {
                ConstraintWidget constraintWidget2 = this.b;
                constraintWidget2.setVerticalChainStyle(flow0.V);
                constraintWidget2.mTop.connect(this.e, (v <= 0 ? this.i : this.i + flow0.h0));
                if(z1) {
                    constraintWidget2.mBottom.connect(this.g, this.k);
                }
                if(v > 0) {
                    this.e.mOwner.mBottom.connect(constraintWidget2.mTop, 0);
                }
                if(flow0.j0 == 3 && !constraintWidget2.hasBaseline()) {
                    int v9 = 0;
                    while(v9 < v1) {
                        int v10 = z ? v1 - 1 - v9 : v9;
                        int v11 = this.n;
                        if(v11 + v10 >= flow0.s0) {
                            break;
                        }
                        ConstraintWidget constraintWidget3 = flow0.r0[v11 + v10];
                        if(constraintWidget3.hasBaseline()) {
                            constraintWidget4 = constraintWidget3;
                            goto label_48;
                        }
                        ++v9;
                    }
                }
                constraintWidget4 = constraintWidget2;
            label_48:
                int v12 = 0;
                ConstraintWidget constraintWidget5 = null;
                while(v12 < v1) {
                    int v13 = z ? v1 - 1 - v12 : v12;
                    int v14 = this.n;
                    if(v14 + v13 >= flow0.s0) {
                        return;
                    }
                    ConstraintWidget constraintWidget6 = flow0.r0[v14 + v13];
                    if(constraintWidget6 == null) {
                        constraintWidget6 = constraintWidget5;
                    }
                    else {
                        if(v12 == 0) {
                            constraintWidget6.connect(constraintWidget6.mLeft, this.d, this.h);
                        }
                        if(v13 == 0) {
                            int v15 = flow0.U;
                            float f = z ? 1.0f - flow0.a0 : flow0.a0;
                            if(this.n == 0) {
                                v16 = flow0.W;
                                if(v16 != -1) {
                                    f = z ? 1.0f - flow0.c0 : flow0.c0;
                                    constraintWidget6.setHorizontalChainStyle(v16);
                                    constraintWidget6.setHorizontalBiasPercent(f);
                                    goto label_77;
                                }
                            }
                            if(z1) {
                                v16 = flow0.Y;
                                if(v16 != -1) {
                                    f = z ? 1.0f - flow0.e0 : flow0.e0;
                                    v15 = v16;
                                }
                            }
                            constraintWidget6.setHorizontalChainStyle(v15);
                            constraintWidget6.setHorizontalBiasPercent(f);
                        }
                    label_77:
                        if(v12 == v1 - 1) {
                            constraintWidget6.connect(constraintWidget6.mRight, this.f, this.j);
                        }
                        if(constraintWidget5 != null) {
                            constraintWidget6.mLeft.connect(constraintWidget5.mRight, flow0.g0);
                            if(v12 == v5) {
                                constraintWidget6.mLeft.setGoneMargin(this.h);
                            }
                            constraintWidget5.mRight.connect(constraintWidget6.mLeft, 0);
                            if(v12 == v6 + 1) {
                                constraintWidget5.mRight.setGoneMargin(this.j);
                            }
                        }
                        if(constraintWidget6 != constraintWidget2) {
                            if(flow0.j0 != 3 || !constraintWidget4.hasBaseline() || constraintWidget6 == constraintWidget4 || !constraintWidget6.hasBaseline()) {
                                switch(flow0.j0) {
                                    case 0: {
                                        constraintWidget6.mTop.connect(constraintWidget2.mTop, 0);
                                        break;
                                    }
                                    case 1: {
                                        constraintWidget6.mBottom.connect(constraintWidget2.mBottom, 0);
                                        break;
                                    }
                                    default: {
                                        if(z2) {
                                            constraintWidget6.mTop.connect(this.e, this.i);
                                            constraintWidget6.mBottom.connect(this.g, this.k);
                                        }
                                        else {
                                            constraintWidget6.mTop.connect(constraintWidget2.mTop, 0);
                                            constraintWidget6.mBottom.connect(constraintWidget2.mBottom, 0);
                                        }
                                    }
                                }
                            }
                            else {
                                constraintWidget6.mBaseline.connect(constraintWidget4.mBaseline, 0);
                            }
                        }
                    }
                    ++v12;
                    constraintWidget5 = constraintWidget6;
                }
            }
            else {
                ConstraintWidget constraintWidget7 = this.b;
                constraintWidget7.setHorizontalChainStyle(flow0.U);
                int v17 = v <= 0 ? this.h : this.h + flow0.g0;
                if(z) {
                    constraintWidget7.mRight.connect(this.f, v17);
                    if(z1) {
                        constraintWidget7.mLeft.connect(this.d, this.j);
                    }
                    if(v > 0) {
                        this.f.mOwner.mLeft.connect(constraintWidget7.mRight, 0);
                    }
                }
                else {
                    constraintWidget7.mLeft.connect(this.d, v17);
                    if(z1) {
                        constraintWidget7.mRight.connect(this.f, this.j);
                    }
                    if(v > 0) {
                        this.d.mOwner.mRight.connect(constraintWidget7.mLeft, 0);
                    }
                }
                ConstraintWidget constraintWidget8 = null;
                int v18 = 0;
                while(v18 < v1) {
                    int v19 = this.n;
                    if(v19 + v18 >= flow0.s0) {
                        break;
                    }
                    ConstraintWidget constraintWidget9 = flow0.r0[v19 + v18];
                    if(constraintWidget9 != null) {
                        if(v18 == 0) {
                            constraintWidget9.connect(constraintWidget9.mTop, this.e, this.i);
                            int v20 = flow0.V;
                            float f1 = flow0.b0;
                            if(this.n == 0) {
                                v21 = flow0.X;
                                if(v21 != -1) {
                                    f1 = flow0.d0;
                                    constraintWidget9.setVerticalChainStyle(v21);
                                    constraintWidget9.setVerticalBiasPercent(f1);
                                    goto label_145;
                                }
                            }
                            if(z1) {
                                v21 = flow0.Z;
                                if(v21 != -1) {
                                    f1 = flow0.f0;
                                    v20 = v21;
                                }
                            }
                            constraintWidget9.setVerticalChainStyle(v20);
                            constraintWidget9.setVerticalBiasPercent(f1);
                        }
                    label_145:
                        if(v18 == v1 - 1) {
                            constraintWidget9.connect(constraintWidget9.mBottom, this.g, this.k);
                        }
                        if(constraintWidget8 != null) {
                            constraintWidget9.mTop.connect(constraintWidget8.mBottom, flow0.h0);
                            if(v18 == v5) {
                                constraintWidget9.mTop.setGoneMargin(this.i);
                            }
                            constraintWidget8.mBottom.connect(constraintWidget9.mTop, 0);
                            if(v18 == v6 + 1) {
                                constraintWidget8.mBottom.setGoneMargin(this.k);
                            }
                        }
                        if(constraintWidget9 != constraintWidget7) {
                            if(z) {
                                int v22 = flow0.i0;
                                if(v22 == 0) {
                                    constraintWidget9.mRight.connect(constraintWidget7.mRight, 0);
                                }
                                else {
                                    switch(v22) {
                                        case 1: {
                                            constraintWidget9.mLeft.connect(constraintWidget7.mLeft, 0);
                                            break;
                                        }
                                        case 2: {
                                            constraintWidget9.mLeft.connect(constraintWidget7.mLeft, 0);
                                            constraintWidget9.mRight.connect(constraintWidget7.mRight, 0);
                                        }
                                    }
                                }
                            }
                            else {
                                int v23 = flow0.i0;
                                if(v23 == 0) {
                                    constraintWidget9.mLeft.connect(constraintWidget7.mLeft, 0);
                                }
                                else {
                                    switch(v23) {
                                        case 1: {
                                            constraintWidget9.mRight.connect(constraintWidget7.mRight, 0);
                                            break;
                                        }
                                        case 2: {
                                            if(z2) {
                                                constraintWidget9.mLeft.connect(this.d, this.h);
                                                constraintWidget9.mRight.connect(this.f, this.j);
                                            }
                                            else {
                                                constraintWidget9.mLeft.connect(constraintWidget7.mLeft, 0);
                                                constraintWidget9.mRight.connect(constraintWidget7.mRight, 0);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        constraintWidget8 = constraintWidget9;
                    }
                    ++v18;
                }
            }
        }
    }

    public final int c() {
        return this.a == 1 ? this.m - this.r.h0 : this.m;
    }

    public final int d() {
        return this.a == 0 ? this.l - this.r.g0 : this.l;
    }

    public final void e(int v) {
        Flow flow0;
        int v1 = this.p;
        if(v1 == 0) {
            return;
        }
        int v2 = this.o;
        int v3 = v / v1;
        for(int v4 = 0; true; ++v4) {
            flow0 = this.r;
            if(v4 >= v2) {
                break;
            }
            int v5 = this.n;
            if(v5 + v4 >= flow0.s0) {
                break;
            }
            ConstraintWidget constraintWidget0 = flow0.r0[v5 + v4];
            if(this.a != 0) {
                if(constraintWidget0 != null && constraintWidget0.getVerticalDimensionBehaviour() == DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget0.mMatchConstraintDefaultHeight == 0) {
                    DimensionBehaviour constraintWidget$DimensionBehaviour1 = constraintWidget0.getHorizontalDimensionBehaviour();
                    int v7 = constraintWidget0.getWidth();
                    this.r.measure(constraintWidget0, constraintWidget$DimensionBehaviour1, v7, DimensionBehaviour.FIXED, v3);
                }
            }
            else if(constraintWidget0 != null && constraintWidget0.getHorizontalDimensionBehaviour() == DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget0.mMatchConstraintDefaultWidth == 0) {
                DimensionBehaviour constraintWidget$DimensionBehaviour0 = constraintWidget0.getVerticalDimensionBehaviour();
                int v6 = constraintWidget0.getHeight();
                this.r.measure(constraintWidget0, DimensionBehaviour.FIXED, v3, constraintWidget$DimensionBehaviour0, v6);
            }
        }
        this.l = 0;
        this.m = 0;
        this.b = null;
        this.c = 0;
        int v8 = this.o;
        for(int v9 = 0; v9 < v8; ++v9) {
            int v10 = this.n + v9;
            if(v10 >= flow0.s0) {
                break;
            }
            ConstraintWidget constraintWidget1 = flow0.r0[v10];
            if(this.a == 0) {
                this.l = constraintWidget1.getWidth() + (constraintWidget1.getVisibility() == 8 ? 0 : flow0.g0) + this.l;
                int v11 = flow0.k(constraintWidget1, this.q);
                if(this.b == null || this.c < v11) {
                    this.b = constraintWidget1;
                    this.c = v11;
                    this.m = v11;
                }
            }
            else {
                int v12 = flow0.l(constraintWidget1, this.q);
                this.m = flow0.k(constraintWidget1, this.q) + (constraintWidget1.getVisibility() == 8 ? 0 : flow0.h0) + this.m;
                if(this.b == null || this.c < v12) {
                    this.b = constraintWidget1;
                    this.c = v12;
                    this.l = v12;
                }
            }
        }
    }

    public final void f(int v, ConstraintAnchor constraintAnchor0, ConstraintAnchor constraintAnchor1, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, int v1, int v2, int v3, int v4, int v5) {
        this.a = v;
        this.d = constraintAnchor0;
        this.e = constraintAnchor1;
        this.f = constraintAnchor2;
        this.g = constraintAnchor3;
        this.h = v1;
        this.i = v2;
        this.j = v3;
        this.k = v4;
        this.q = v5;
    }
}

