package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import java.util.ArrayList;

public class ChainRun extends WidgetRun {
    public final ArrayList e;
    public int f;

    public ChainRun(ConstraintWidget constraintWidget0, int v) {
        super(constraintWidget0);
        ConstraintWidget constraintWidget3;
        this.e = new ArrayList();
        this.orientation = v;
        ConstraintWidget constraintWidget1 = this.a;
        for(ConstraintWidget constraintWidget2 = constraintWidget1.getPreviousChainMember(v); true; constraintWidget2 = constraintWidget1.getPreviousChainMember(this.orientation)) {
            constraintWidget3 = constraintWidget1;
            constraintWidget1 = constraintWidget2;
            if(constraintWidget1 == null) {
                break;
            }
        }
        this.a = constraintWidget3;
        ArrayList arrayList0 = this.e;
        arrayList0.add(constraintWidget3.getRun(this.orientation));
        for(ConstraintWidget constraintWidget4 = constraintWidget3.getNextChainMember(this.orientation); constraintWidget4 != null; constraintWidget4 = constraintWidget4.getNextChainMember(this.orientation)) {
            arrayList0.add(constraintWidget4.getRun(this.orientation));
        }
        for(Object object0: arrayList0) {
            WidgetRun widgetRun0 = (WidgetRun)object0;
            int v1 = this.orientation;
            if(v1 == 0) {
                widgetRun0.a.horizontalChainRun = this;
            }
            else if(v1 == 1) {
                widgetRun0.a.verticalChainRun = this;
            }
        }
        if(this.orientation == 0 && ((ConstraintWidgetContainer)this.a.getParent()).isRtl() && arrayList0.size() > 1) {
            this.a = ((WidgetRun)arrayList0.get(arrayList0.size() - 1)).a;
        }
        this.f = this.orientation == 0 ? this.a.getHorizontalChainStyle() : this.a.getVerticalChainStyle();
    }

    @Override  // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void a() {
        ArrayList arrayList0 = this.e;
        for(Object object0: arrayList0) {
            ((WidgetRun)object0).a();
        }
        int v = arrayList0.size();
        if(v < 1) {
            return;
        }
        ConstraintWidget constraintWidget0 = ((WidgetRun)arrayList0.get(0)).a;
        ConstraintWidget constraintWidget1 = ((WidgetRun)arrayList0.get(v - 1)).a;
        if(this.orientation == 0) {
            ConstraintAnchor constraintAnchor0 = constraintWidget0.mLeft;
            ConstraintAnchor constraintAnchor1 = constraintWidget1.mRight;
            DependencyNode dependencyNode0 = this.getTarget(constraintAnchor0, 0);
            int v1 = constraintAnchor0.getMargin();
            ConstraintWidget constraintWidget2 = this.d();
            if(constraintWidget2 != null) {
                v1 = constraintWidget2.mLeft.getMargin();
            }
            if(dependencyNode0 != null) {
                this.addTarget(this.start, dependencyNode0, v1);
            }
            DependencyNode dependencyNode1 = this.getTarget(constraintAnchor1, 0);
            int v2 = constraintAnchor1.getMargin();
            ConstraintWidget constraintWidget3 = this.e();
            if(constraintWidget3 != null) {
                v2 = constraintWidget3.mRight.getMargin();
            }
            if(dependencyNode1 != null) {
                this.addTarget(this.end, dependencyNode1, -v2);
            }
        }
        else {
            ConstraintAnchor constraintAnchor2 = constraintWidget0.mTop;
            ConstraintAnchor constraintAnchor3 = constraintWidget1.mBottom;
            DependencyNode dependencyNode2 = this.getTarget(constraintAnchor2, 1);
            int v3 = constraintAnchor2.getMargin();
            ConstraintWidget constraintWidget4 = this.d();
            if(constraintWidget4 != null) {
                v3 = constraintWidget4.mTop.getMargin();
            }
            if(dependencyNode2 != null) {
                this.addTarget(this.start, dependencyNode2, v3);
            }
            DependencyNode dependencyNode3 = this.getTarget(constraintAnchor3, 1);
            int v4 = constraintAnchor3.getMargin();
            ConstraintWidget constraintWidget5 = this.e();
            if(constraintWidget5 != null) {
                v4 = constraintWidget5.mBottom.getMargin();
            }
            if(dependencyNode3 != null) {
                this.addTarget(this.end, dependencyNode3, -v4);
            }
        }
        this.start.updateDelegate = this;
        this.end.updateDelegate = this;
    }

    @Override  // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void applyToWidget() {
        for(int v = 0; true; ++v) {
            ArrayList arrayList0 = this.e;
            if(v >= arrayList0.size()) {
                break;
            }
            ((WidgetRun)arrayList0.get(v)).applyToWidget();
        }
    }

    @Override  // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void b() {
        this.b = null;
        for(Object object0: this.e) {
            ((WidgetRun)object0).b();
        }
    }

    @Override  // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final boolean c() {
        ArrayList arrayList0 = this.e;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            if(!((WidgetRun)arrayList0.get(v1)).c()) {
                return false;
            }
        }
        return true;
    }

    public final ConstraintWidget d() {
        for(int v = 0; true; ++v) {
            ArrayList arrayList0 = this.e;
            if(v >= arrayList0.size()) {
                break;
            }
            WidgetRun widgetRun0 = (WidgetRun)arrayList0.get(v);
            if(widgetRun0.a.getVisibility() != 8) {
                return widgetRun0.a;
            }
        }
        return null;
    }

    public final ConstraintWidget e() {
        ArrayList arrayList0 = this.e;
        for(int v = arrayList0.size() - 1; v >= 0; --v) {
            WidgetRun widgetRun0 = (WidgetRun)arrayList0.get(v);
            if(widgetRun0.a.getVisibility() != 8) {
                return widgetRun0.a;
            }
        }
        return null;
    }

    @Override  // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public long getWrapDimension() {
        ArrayList arrayList0 = this.e;
        int v = arrayList0.size();
        long v1 = 0L;
        for(int v2 = 0; v2 < v; ++v2) {
            WidgetRun widgetRun0 = (WidgetRun)arrayList0.get(v2);
            long v3 = v1 + ((long)widgetRun0.start.c);
            long v4 = widgetRun0.getWrapDimension();
            v1 = ((long)widgetRun0.end.c) + (v4 + v3);
        }
        return v1;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("ChainRun ");
        stringBuilder0.append((this.orientation == 0 ? "horizontal : " : "vertical : "));
        for(Object object0: this.e) {
            stringBuilder0.append("<");
            stringBuilder0.append(((WidgetRun)object0));
            stringBuilder0.append("> ");
        }
        return stringBuilder0.toString();
    }

    @Override  // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void update(Dependency dependency0) {
        int v29;
        int v26;
        boolean z3;
        boolean z2;
        int v23;
        int v22;
        float f3;
        int v21;
        int v20;
        int v15;
        int v14;
        int v13;
        float f;
        int v8;
        int v3;
        if(this.start.resolved && this.end.resolved) {
            ConstraintWidget constraintWidget0 = this.a.getParent();
            boolean z = constraintWidget0 instanceof ConstraintWidgetContainer ? ((ConstraintWidgetContainer)constraintWidget0).isRtl() : false;
            int v = this.end.value - this.start.value;
            ArrayList arrayList0 = this.e;
            int v1 = arrayList0.size();
            int v2;
            for(v2 = 0; true; ++v2) {
                v3 = -1;
                if(v2 >= v1) {
                    v2 = -1;
                    break;
                }
                if(((WidgetRun)arrayList0.get(v2)).a.getVisibility() != 8) {
                    break;
                }
            }
            int v4 = v1 - 1;
            while(v4 >= 0) {
                if(((WidgetRun)arrayList0.get(v4)).a.getVisibility() == 8) {
                    --v4;
                }
                else {
                    v3 = v4;
                    if(true) {
                        break;
                    }
                }
            }
            int v5 = 0;
            int v6 = 0;
            while(v6 < 2) {
                int v7 = 0;
                v8 = 0;
                int v9 = 0;
                int v10 = 0;
                f = 0.0f;
                while(v7 < v1) {
                    WidgetRun widgetRun0 = (WidgetRun)arrayList0.get(v7);
                    if(widgetRun0.a.getVisibility() != 8) {
                        ++v10;
                        if(v7 > 0 && v7 >= v2) {
                            v8 += widgetRun0.start.c;
                        }
                        b b0 = widgetRun0.c;
                        int v11 = b0.value;
                        boolean z1 = widgetRun0.dimensionBehavior != DimensionBehaviour.MATCH_CONSTRAINT;
                        if(z1) {
                            int v12 = this.orientation;
                            if(v12 == 0 && !widgetRun0.a.horizontalRun.c.resolved) {
                                return;
                            }
                            if(v12 == 1 && !widgetRun0.a.verticalRun.c.resolved) {
                                return;
                            }
                            v13 = v11;
                        }
                        else {
                            v13 = v11;
                            if(widgetRun0.matchConstraintsType == 1 && v6 == 0) {
                                v14 = b0.h;
                                ++v9;
                                z1 = true;
                                goto label_57;
                            }
                            else if(b0.resolved) {
                                v14 = v13;
                                z1 = true;
                                goto label_57;
                            }
                        }
                        v14 = v13;
                    label_57:
                        if(z1) {
                            v8 += v14;
                        }
                        else {
                            ++v9;
                            float f1 = widgetRun0.a.mWeight[this.orientation];
                            if(f1 >= 0.0f) {
                                f += f1;
                            }
                        }
                        if(v7 < v1 - 1 && v7 < v3) {
                            v8 -= widgetRun0.end.c;
                        }
                    }
                    ++v7;
                }
                if(v8 < v || v9 == 0) {
                    v5 = v9;
                    v15 = v10;
                }
                else {
                    ++v6;
                    continue;
                }
                goto label_77;
            }
            v15 = 0;
            v8 = 0;
            f = 0.0f;
        label_77:
            int v16 = z ? this.end.value : this.start.value;
            if(v8 > v) {
                v16 = z ? v16 + ((int)(((float)(v8 - v)) / 2.0f + 0.5f)) : v16 - ((int)(((float)(v8 - v)) / 2.0f + 0.5f));
            }
            if(v5 > 0) {
                float f2 = (float)(v - v8);
                int v17 = (int)(f2 / ((float)v5) + 0.5f);
                int v18 = 0;
                int v19 = 0;
                while(v18 < v1) {
                    WidgetRun widgetRun1 = (WidgetRun)arrayList0.get(v18);
                    if(widgetRun1.a.getVisibility() == 8 || widgetRun1.dimensionBehavior != DimensionBehaviour.MATCH_CONSTRAINT) {
                        z2 = z;
                        v20 = v16;
                        f3 = f2;
                    }
                    else {
                        b b1 = widgetRun1.c;
                        if(!b1.resolved) {
                            if(f > 0.0f) {
                                v20 = v16;
                                v21 = (int)(widgetRun1.a.mWeight[this.orientation] * f2 / f + 0.5f);
                            }
                            else {
                                v20 = v16;
                                v21 = v17;
                            }
                            if(this.orientation == 0) {
                                f3 = f2;
                                v22 = widgetRun1.a.mMatchConstraintMaxWidth;
                                v23 = widgetRun1.a.mMatchConstraintMinWidth;
                            }
                            else {
                                f3 = f2;
                                v23 = widgetRun1.a.mMatchConstraintMinHeight;
                                v22 = widgetRun1.a.mMatchConstraintMaxHeight;
                            }
                            z2 = z;
                            int v24 = widgetRun1.matchConstraintsType == 1 ? Math.min(v21, b1.h) : v21;
                            int v25 = v22 <= 0 ? Math.max(v23, v24) : Math.min(v22, Math.max(v23, v24));
                            if(v25 != v21) {
                                ++v19;
                                v21 = v25;
                            }
                            b1.resolve(v21);
                        }
                    }
                    ++v18;
                    v16 = v20;
                    f2 = f3;
                    z = z2;
                }
                z3 = z;
                v26 = v16;
                if(v19 > 0) {
                    v5 -= v19;
                    v8 = 0;
                    for(int v27 = 0; v27 < v1; ++v27) {
                        WidgetRun widgetRun2 = (WidgetRun)arrayList0.get(v27);
                        if(widgetRun2.a.getVisibility() != 8) {
                            if(v27 > 0 && v27 >= v2) {
                                v8 += widgetRun2.start.c;
                            }
                            v8 += widgetRun2.c.value;
                            if(v27 < v1 - 1 && v27 < v3) {
                                v8 -= widgetRun2.end.c;
                            }
                        }
                    }
                }
                if(this.f == 2 && v19 == 0) {
                    this.f = 0;
                }
            }
            else {
                z3 = z;
                v26 = v16;
            }
            if(v8 > v) {
                this.f = 2;
            }
            if(v15 > 0 && v5 == 0 && v2 == v3) {
                this.f = 2;
            }
            int v28 = this.f;
            if(v28 == 1) {
                if(v15 > 1) {
                    v29 = (v - v8) / (v15 - 1);
                }
                else {
                    v29 = v15 == 1 ? (v - v8) / 2 : 0;
                }
                if(v5 > 0) {
                    v29 = 0;
                }
                int v31 = v26;
                for(int v30 = 0; v30 < v1; ++v30) {
                    WidgetRun widgetRun3 = (WidgetRun)arrayList0.get((z3 ? v1 - (v30 + 1) : v30));
                    if(widgetRun3.a.getVisibility() == 8) {
                        widgetRun3.start.resolve(v31);
                        widgetRun3.end.resolve(v31);
                    }
                    else {
                        if(v30 > 0) {
                            v31 = z3 ? v31 - v29 : v31 + v29;
                        }
                        if(v30 > 0 && v30 >= v2) {
                            v31 = z3 ? v31 - widgetRun3.start.c : v31 + widgetRun3.start.c;
                        }
                        if(z3) {
                            widgetRun3.end.resolve(v31);
                        }
                        else {
                            widgetRun3.start.resolve(v31);
                        }
                        int v32 = widgetRun3.dimensionBehavior != DimensionBehaviour.MATCH_CONSTRAINT || widgetRun3.matchConstraintsType != 1 ? widgetRun3.c.value : widgetRun3.c.h;
                        v31 = z3 ? v31 - v32 : v31 + v32;
                        if(z3) {
                            widgetRun3.start.resolve(v31);
                        }
                        else {
                            widgetRun3.end.resolve(v31);
                        }
                        widgetRun3.d = true;
                        if(v30 < v1 - 1 && v30 < v3) {
                            v31 = z3 ? v31 - -widgetRun3.end.c : v31 - widgetRun3.end.c;
                        }
                    }
                }
                return;
            }
            if(v28 == 0) {
                int v33 = (v - v8) / (v15 + 1);
                if(v5 > 0) {
                    v33 = 0;
                }
                int v35 = v26;
                for(int v34 = 0; v34 < v1; ++v34) {
                    WidgetRun widgetRun4 = (WidgetRun)arrayList0.get((z3 ? v1 - (v34 + 1) : v34));
                    if(widgetRun4.a.getVisibility() == 8) {
                        widgetRun4.start.resolve(v35);
                        widgetRun4.end.resolve(v35);
                    }
                    else {
                        int v36 = z3 ? v35 - v33 : v35 + v33;
                        if(v34 > 0 && v34 >= v2) {
                            v36 = z3 ? v36 - widgetRun4.start.c : v36 + widgetRun4.start.c;
                        }
                        if(z3) {
                            widgetRun4.end.resolve(v36);
                        }
                        else {
                            widgetRun4.start.resolve(v36);
                        }
                        int v37 = widgetRun4.dimensionBehavior != DimensionBehaviour.MATCH_CONSTRAINT || widgetRun4.matchConstraintsType != 1 ? widgetRun4.c.value : Math.min(widgetRun4.c.value, widgetRun4.c.h);
                        v35 = z3 ? v36 - v37 : v36 + v37;
                        if(z3) {
                            widgetRun4.start.resolve(v35);
                        }
                        else {
                            widgetRun4.end.resolve(v35);
                        }
                        if(v34 < v1 - 1 && v34 < v3) {
                            v35 = z3 ? v35 - -widgetRun4.end.c : v35 - widgetRun4.end.c;
                        }
                    }
                }
                return;
            }
            if(v28 == 2) {
                float f4 = this.orientation == 0 ? this.a.getHorizontalBiasPercent() : this.a.getVerticalBiasPercent();
                if(z3) {
                    f4 = 1.0f - f4;
                }
                int v38 = ((int)(((float)(v - v8)) * f4 + 0.5f)) >= 0 && v5 <= 0 ? ((int)(((float)(v - v8)) * f4 + 0.5f)) : 0;
                int v39 = z3 ? v26 - v38 : v26 + v38;
                for(int v40 = 0; v40 < v1; ++v40) {
                    WidgetRun widgetRun5 = (WidgetRun)arrayList0.get((z3 ? v1 - (v40 + 1) : v40));
                    if(widgetRun5.a.getVisibility() == 8) {
                        widgetRun5.start.resolve(v39);
                        widgetRun5.end.resolve(v39);
                    }
                    else {
                        if(v40 > 0 && v40 >= v2) {
                            v39 = z3 ? v39 - widgetRun5.start.c : v39 + widgetRun5.start.c;
                        }
                        if(z3) {
                            widgetRun5.end.resolve(v39);
                        }
                        else {
                            widgetRun5.start.resolve(v39);
                        }
                        int v41 = widgetRun5.dimensionBehavior != DimensionBehaviour.MATCH_CONSTRAINT || widgetRun5.matchConstraintsType != 1 ? widgetRun5.c.value : widgetRun5.c.h;
                        v39 = z3 ? v39 - v41 : v39 + v41;
                        if(z3) {
                            widgetRun5.start.resolve(v39);
                        }
                        else {
                            widgetRun5.end.resolve(v39);
                        }
                        if(v40 < v1 - 1 && v40 < v3) {
                            v39 = z3 ? v39 - -widgetRun5.end.c : v39 - widgetRun5.end.c;
                        }
                    }
                }
            }
        }
    }
}

