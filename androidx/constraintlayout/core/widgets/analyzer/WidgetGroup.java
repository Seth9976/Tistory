package androidx.constraintlayout.core.widgets.analyzer;

import a5.b;
import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.widgets.Chain;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import wb.a;

public class WidgetGroup {
    public final ArrayList a;
    public final int b;
    public boolean c;
    public int d;
    public ArrayList e;
    public int f;
    public static int g;

    public WidgetGroup(int v) {
        this.a = new ArrayList();
        this.c = false;
        this.e = null;
        this.f = -1;
        int v1 = WidgetGroup.g;
        WidgetGroup.g = v1 + 1;
        this.b = v1;
        this.d = v;
    }

    public boolean add(ConstraintWidget constraintWidget0) {
        ArrayList arrayList0 = this.a;
        if(arrayList0.contains(constraintWidget0)) {
            return false;
        }
        arrayList0.add(constraintWidget0);
        return true;
    }

    public void apply() {
        if(this.e == null) {
            return;
        }
        if(!this.c) {
            return;
        }
        for(int v = 0; v < this.e.size(); ++v) {
            f f0 = (f)this.e.get(v);
            ConstraintWidget constraintWidget0 = (ConstraintWidget)f0.a.get();
            if(constraintWidget0 != null) {
                constraintWidget0.setFinalFrame(f0.b, f0.c, f0.d, f0.e, f0.f, f0.g);
            }
        }
    }

    public void cleanup(ArrayList arrayList0) {
        int v = this.a.size();
        if(this.f != -1 && v > 0) {
            for(int v1 = 0; v1 < arrayList0.size(); ++v1) {
                WidgetGroup widgetGroup0 = (WidgetGroup)arrayList0.get(v1);
                if(this.f == widgetGroup0.b) {
                    this.moveTo(this.d, widgetGroup0);
                }
            }
        }
        if(v == 0) {
            arrayList0.remove(this);
        }
    }

    public void clear() {
        this.a.clear();
    }

    public int getId() {
        return this.b;
    }

    public int getOrientation() {
        return this.d;
    }

    public boolean intersectWith(WidgetGroup widgetGroup0) {
        for(int v = 0; true; ++v) {
            ArrayList arrayList0 = this.a;
            if(v >= arrayList0.size()) {
                break;
            }
            ConstraintWidget constraintWidget0 = (ConstraintWidget)arrayList0.get(v);
            if(widgetGroup0.a.contains(constraintWidget0)) {
                return true;
            }
        }
        return false;
    }

    public boolean isAuthoritative() {
        return this.c;
    }

    public int measureWrap(LinearSystem linearSystem0, int v) {
        int v4;
        int v3;
        ArrayList arrayList0 = this.a;
        if(arrayList0.size() == 0) {
            return 0;
        }
        ConstraintWidgetContainer constraintWidgetContainer0 = (ConstraintWidgetContainer)((ConstraintWidget)arrayList0.get(0)).getParent();
        linearSystem0.reset();
        constraintWidgetContainer0.addToSolver(linearSystem0, false);
        for(int v2 = 0; v2 < arrayList0.size(); ++v2) {
            ((ConstraintWidget)arrayList0.get(v2)).addToSolver(linearSystem0, false);
        }
        if(v == 0 && constraintWidgetContainer0.mHorizontalChainsSize > 0) {
            Chain.applyChainConstraints(constraintWidgetContainer0, linearSystem0, arrayList0, 0);
        }
        if(v == 1 && constraintWidgetContainer0.mVerticalChainsSize > 0) {
            Chain.applyChainConstraints(constraintWidgetContainer0, linearSystem0, arrayList0, 1);
        }
        try {
            linearSystem0.minimize();
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
        }
        this.e = new ArrayList();
        for(int v1 = 0; v1 < arrayList0.size(); ++v1) {
            ConstraintWidget constraintWidget0 = (ConstraintWidget)arrayList0.get(v1);
            f f0 = new f();  // 初始化器: Ljava/lang/Object;-><init>()V
            f0.a = new WeakReference(constraintWidget0);
            f0.b = linearSystem0.getObjectVariableValue(constraintWidget0.mLeft);
            f0.c = linearSystem0.getObjectVariableValue(constraintWidget0.mTop);
            f0.d = linearSystem0.getObjectVariableValue(constraintWidget0.mRight);
            f0.e = linearSystem0.getObjectVariableValue(constraintWidget0.mBottom);
            f0.f = linearSystem0.getObjectVariableValue(constraintWidget0.mBaseline);
            f0.g = v;
            this.e.add(f0);
        }
        if(v == 0) {
            v3 = linearSystem0.getObjectVariableValue(constraintWidgetContainer0.mLeft);
            v4 = linearSystem0.getObjectVariableValue(constraintWidgetContainer0.mRight);
            linearSystem0.reset();
            return v4 - v3;
        }
        v3 = linearSystem0.getObjectVariableValue(constraintWidgetContainer0.mTop);
        v4 = linearSystem0.getObjectVariableValue(constraintWidgetContainer0.mBottom);
        linearSystem0.reset();
        return v4 - v3;
    }

    public void moveTo(int v, WidgetGroup widgetGroup0) {
        for(Object object0: this.a) {
            ConstraintWidget constraintWidget0 = (ConstraintWidget)object0;
            widgetGroup0.add(constraintWidget0);
            if(v == 0) {
                constraintWidget0.horizontalGroup = widgetGroup0.getId();
            }
            else {
                constraintWidget0.verticalGroup = widgetGroup0.getId();
            }
        }
        this.f = widgetGroup0.b;
    }

    public void setAuthoritative(boolean z) {
        this.c = z;
    }

    public void setOrientation(int v) {
        this.d = v;
    }

    public int size() {
        return this.a.size();
    }

    @Override
    public String toString() {
        String s;
        StringBuilder stringBuilder0 = new StringBuilder();
        int v = this.d;
        if(v == 0) {
            s = "Horizontal";
        }
        else {
            switch(v) {
                case 1: {
                    s = "Vertical";
                    break;
                }
                case 2: {
                    s = "Both";
                    break;
                }
                default: {
                    s = "Unknown";
                }
            }
        }
        stringBuilder0.append(s);
        stringBuilder0.append(" [");
        String s1 = a.c(this.b, "] <", stringBuilder0);
        for(Object object0: this.a) {
            StringBuilder stringBuilder1 = b.u(s1, " ");
            stringBuilder1.append(((ConstraintWidget)object0).getDebugName());
            s1 = stringBuilder1.toString();
        }
        return s1 + " >";
    }
}

