package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.Cache;
import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.analyzer.Grouping;
import androidx.constraintlayout.core.widgets.analyzer.WidgetGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ConstraintAnchor {
    public static enum Type {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y;

    }

    public HashSet a;
    public int b;
    public boolean c;
    public int d;
    public SolverVariable e;
    public int mMargin;
    public final ConstraintWidget mOwner;
    public ConstraintAnchor mTarget;
    public final Type mType;

    public ConstraintAnchor(ConstraintWidget constraintWidget0, Type constraintAnchor$Type0) {
        this.a = null;
        this.mMargin = 0;
        this.d = 0x80000000;
        this.mOwner = constraintWidget0;
        this.mType = constraintAnchor$Type0;
    }

    public final boolean a(ConstraintWidget constraintWidget0, HashSet hashSet0) {
        if(hashSet0.contains(constraintWidget0)) {
            return false;
        }
        hashSet0.add(constraintWidget0);
        if(constraintWidget0 == this.getOwner()) {
            return true;
        }
        ArrayList arrayList0 = constraintWidget0.getAnchors();
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ConstraintAnchor constraintAnchor0 = (ConstraintAnchor)arrayList0.get(v1);
            if(constraintAnchor0.isSimilarDimensionConnection(this) && constraintAnchor0.isConnected() && this.a(constraintAnchor0.getTarget().getOwner(), hashSet0)) {
                return true;
            }
        }
        return false;
    }

    public boolean connect(ConstraintAnchor constraintAnchor0, int v) {
        return this.connect(constraintAnchor0, v, 0x80000000, false);
    }

    public boolean connect(ConstraintAnchor constraintAnchor0, int v, int v1, boolean z) {
        if(constraintAnchor0 == null) {
            this.reset();
            return true;
        }
        if(!z && !this.isValidConnection(constraintAnchor0)) {
            return false;
        }
        this.mTarget = constraintAnchor0;
        if(constraintAnchor0.a == null) {
            constraintAnchor0.a = new HashSet();
        }
        HashSet hashSet0 = this.mTarget.a;
        if(hashSet0 != null) {
            hashSet0.add(this);
        }
        this.mMargin = v;
        this.d = v1;
        return true;
    }

    public void copyFrom(ConstraintAnchor constraintAnchor0, HashMap hashMap0) {
        ConstraintAnchor constraintAnchor1 = this.mTarget;
        if(constraintAnchor1 != null) {
            HashSet hashSet0 = constraintAnchor1.a;
            if(hashSet0 != null) {
                hashSet0.remove(this);
            }
        }
        ConstraintAnchor constraintAnchor2 = constraintAnchor0.mTarget;
        this.mTarget = constraintAnchor2 == null ? null : ((ConstraintWidget)hashMap0.get(constraintAnchor0.mTarget.mOwner)).getAnchor(constraintAnchor2.getType());
        ConstraintAnchor constraintAnchor3 = this.mTarget;
        if(constraintAnchor3 != null) {
            if(constraintAnchor3.a == null) {
                constraintAnchor3.a = new HashSet();
            }
            this.mTarget.a.add(this);
        }
        this.mMargin = constraintAnchor0.mMargin;
        this.d = constraintAnchor0.d;
    }

    public void findDependents(int v, ArrayList arrayList0, WidgetGroup widgetGroup0) {
        HashSet hashSet0 = this.a;
        if(hashSet0 != null) {
            for(Object object0: hashSet0) {
                Grouping.findDependents(((ConstraintAnchor)object0).mOwner, v, arrayList0, widgetGroup0);
            }
        }
    }

    public HashSet getDependents() {
        return this.a;
    }

    public int getFinalValue() {
        return this.c ? this.b : 0;
    }

    public int getMargin() {
        if(this.mOwner.getVisibility() == 8) {
            return 0;
        }
        return this.d == 0x80000000 || (this.mTarget == null || this.mTarget.mOwner.getVisibility() != 8) ? this.mMargin : this.d;
    }

    public final ConstraintAnchor getOpposite() {
        switch(a.a[this.mType.ordinal()]) {
            case 2: {
                return this.mOwner.mRight;
            }
            case 3: {
                return this.mOwner.mLeft;
            }
            case 4: {
                return this.mOwner.mBottom;
            }
            case 5: {
                return this.mOwner.mTop;
            }
            case 1: 
            case 6: 
            case 7: 
            case 8: 
            case 9: {
                return null;
            }
            default: {
                throw new AssertionError(this.mType.name());
            }
        }
    }

    public ConstraintWidget getOwner() {
        return this.mOwner;
    }

    public SolverVariable getSolverVariable() {
        return this.e;
    }

    public ConstraintAnchor getTarget() {
        return this.mTarget;
    }

    public Type getType() {
        return this.mType;
    }

    public boolean hasCenteredDependents() {
        HashSet hashSet0 = this.a;
        if(hashSet0 == null) {
            return false;
        }
        for(Object object0: hashSet0) {
            if(((ConstraintAnchor)object0).getOpposite().isConnected()) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    public boolean hasDependents() {
        return this.a == null ? false : this.a.size() > 0;
    }

    public boolean hasFinalValue() {
        return this.c;
    }

    public boolean isConnected() {
        return this.mTarget != null;
    }

    public boolean isConnectionAllowed(ConstraintWidget constraintWidget0) {
        if(this.a(constraintWidget0, new HashSet())) {
            return false;
        }
        ConstraintWidget constraintWidget1 = this.getOwner().getParent();
        return constraintWidget1 == constraintWidget0 ? true : constraintWidget0.getParent() == constraintWidget1;
    }

    public boolean isConnectionAllowed(ConstraintWidget constraintWidget0, ConstraintAnchor constraintAnchor0) {
        return this.isConnectionAllowed(constraintWidget0);
    }

    public boolean isSideAnchor() {
        switch(a.a[this.mType.ordinal()]) {
            case 2: 
            case 3: 
            case 4: 
            case 5: {
                return true;
            }
            case 1: 
            case 6: 
            case 7: 
            case 8: 
            case 9: {
                return false;
            }
            default: {
                throw new AssertionError(this.mType.name());
            }
        }
    }

    public boolean isSimilarDimensionConnection(ConstraintAnchor constraintAnchor0) {
        Type constraintAnchor$Type0 = constraintAnchor0.getType();
        Type constraintAnchor$Type1 = this.mType;
        if(constraintAnchor$Type0 == constraintAnchor$Type1) {
            return true;
        }
        switch(a.a[constraintAnchor$Type1.ordinal()]) {
            case 1: {
                return constraintAnchor$Type0 != Type.BASELINE;
            }
            case 2: 
            case 3: 
            case 7: {
                return constraintAnchor$Type0 == Type.LEFT || constraintAnchor$Type0 == Type.RIGHT || constraintAnchor$Type0 == Type.CENTER_X;
            }
            case 4: 
            case 5: 
            case 6: 
            case 8: {
                return constraintAnchor$Type0 == Type.TOP || constraintAnchor$Type0 == Type.BOTTOM || constraintAnchor$Type0 == Type.CENTER_Y || constraintAnchor$Type0 == Type.BASELINE;
            }
            case 9: {
                return false;
            }
            default: {
                throw new AssertionError(this.mType.name());
            }
        }
    }

    public boolean isValidConnection(ConstraintAnchor constraintAnchor0) {
        if(constraintAnchor0 == null) {
            return false;
        }
        Type constraintAnchor$Type0 = constraintAnchor0.getType();
        Type constraintAnchor$Type1 = this.mType;
        if(constraintAnchor$Type0 == constraintAnchor$Type1) {
            return constraintAnchor$Type1 != Type.BASELINE || constraintAnchor0.getOwner().hasBaseline() && this.getOwner().hasBaseline();
        }
        switch(a.a[constraintAnchor$Type1.ordinal()]) {
            case 1: {
                return constraintAnchor$Type0 != Type.BASELINE && constraintAnchor$Type0 != Type.CENTER_X && constraintAnchor$Type0 != Type.CENTER_Y;
            }
            case 2: 
            case 3: {
                boolean z = constraintAnchor$Type0 == Type.LEFT || constraintAnchor$Type0 == Type.RIGHT;
                return constraintAnchor0.getOwner() instanceof Guideline ? z || constraintAnchor$Type0 == Type.CENTER_X : z;
            }
            case 4: 
            case 5: {
                boolean z1 = constraintAnchor$Type0 == Type.TOP || constraintAnchor$Type0 == Type.BOTTOM;
                return constraintAnchor0.getOwner() instanceof Guideline ? z1 || constraintAnchor$Type0 == Type.CENTER_Y : z1;
            }
            case 6: {
                return constraintAnchor$Type0 != Type.LEFT && constraintAnchor$Type0 != Type.RIGHT;
            }
            case 7: 
            case 8: 
            case 9: {
                return false;
            }
            default: {
                throw new AssertionError(this.mType.name());
            }
        }
    }

    public boolean isVerticalAnchor() {
        switch(a.a[this.mType.ordinal()]) {
            case 1: 
            case 2: 
            case 3: 
            case 7: {
                return false;
            }
            case 4: 
            case 5: 
            case 6: 
            case 8: 
            case 9: {
                return true;
            }
            default: {
                throw new AssertionError(this.mType.name());
            }
        }
    }

    public void reset() {
        ConstraintAnchor constraintAnchor0 = this.mTarget;
        if(constraintAnchor0 != null) {
            HashSet hashSet0 = constraintAnchor0.a;
            if(hashSet0 != null) {
                hashSet0.remove(this);
                if(this.mTarget.a.size() == 0) {
                    this.mTarget.a = null;
                }
            }
        }
        this.a = null;
        this.mTarget = null;
        this.mMargin = 0;
        this.d = 0x80000000;
        this.c = false;
        this.b = 0;
    }

    public void resetFinalResolution() {
        this.c = false;
        this.b = 0;
    }

    public void resetSolverVariable(Cache cache0) {
        SolverVariable solverVariable0 = this.e;
        if(solverVariable0 == null) {
            this.e = new SolverVariable(androidx.constraintlayout.core.SolverVariable.Type.UNRESTRICTED, null);
            return;
        }
        solverVariable0.reset();
    }

    public void setFinalValue(int v) {
        this.b = v;
        this.c = true;
    }

    public void setGoneMargin(int v) {
        if(this.isConnected()) {
            this.d = v;
        }
    }

    public void setMargin(int v) {
        if(this.isConnected()) {
            this.mMargin = v;
        }
    }

    @Override
    public String toString() {
        return this.mOwner.getDebugName() + ":" + this.mType.toString();
    }
}

