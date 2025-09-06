package androidx.constraintlayout.core;

import a5.b;
import java.util.ArrayList;

public class ArrayRow implements Row {
    public interface ArrayRowVariables {
        void add(SolverVariable arg1, float arg2, boolean arg3);

        void clear();

        boolean contains(SolverVariable arg1);

        void display();

        void divideByAmount(float arg1);

        float get(SolverVariable arg1);

        int getCurrentSize();

        SolverVariable getVariable(int arg1);

        float getVariableValue(int arg1);

        int indexOf(SolverVariable arg1);

        void invert();

        void put(SolverVariable arg1, float arg2);

        float remove(SolverVariable arg1, boolean arg2);

        int sizeInBytes();

        float use(ArrayRow arg1, boolean arg2);
    }

    public SolverVariable a;
    public float b;
    public final ArrayList c;
    public boolean d;
    public ArrayRowVariables variables;

    public ArrayRow() {
        this.a = null;
        this.b = 0.0f;
        this.c = new ArrayList();
        this.d = false;
    }

    public ArrayRow(Cache cache0) {
        this.a = null;
        this.b = 0.0f;
        this.c = new ArrayList();
        this.d = false;
        this.variables = new ArrayLinkedVariables(this, cache0);
    }

    public final SolverVariable a(boolean[] arr_z, SolverVariable solverVariable0) {
        int v = this.variables.getCurrentSize();
        SolverVariable solverVariable1 = null;
        float f = 0.0f;
        for(int v1 = 0; v1 < v; ++v1) {
            float f1 = this.variables.getVariableValue(v1);
            if(f1 < 0.0f) {
                SolverVariable solverVariable2 = this.variables.getVariable(v1);
                if((arr_z == null || !arr_z[solverVariable2.id]) && solverVariable2 != solverVariable0 && ((solverVariable2.e == Type.SLACK || solverVariable2.e == Type.ERROR) && f1 < f)) {
                    f = f1;
                    solverVariable1 = solverVariable2;
                }
            }
        }
        return solverVariable1;
    }

    public ArrayRow addError(LinearSystem linearSystem0, int v) {
        this.variables.put(linearSystem0.createErrorVariable(v, "ep"), 1.0f);
        this.variables.put(linearSystem0.createErrorVariable(v, "em"), -1.0f);
        return this;
    }

    @Override  // androidx.constraintlayout.core.LinearSystem$Row
    public void addError(SolverVariable solverVariable0) {
        float f = 1.0f;
        switch(solverVariable0.strength) {
            case 2: {
                f = 1000.0f;
                break;
            }
            case 3: {
                f = 1000000.0f;
                break;
            }
            case 4: {
                f = 1000000000.0f;
                break;
            }
            case 5: {
                f = 999999995904.0f;
            }
        }
        this.variables.put(solverVariable0, f);
    }

    public final void b(SolverVariable solverVariable0) {
        SolverVariable solverVariable1 = this.a;
        if(solverVariable1 != null) {
            this.variables.put(solverVariable1, -1.0f);
            this.a.b = -1;
            this.a = null;
        }
        float f = this.variables.remove(solverVariable0, true);
        this.a = solverVariable0;
        if(f * -1.0f == 1.0f) {
            return;
        }
        this.b /= f * -1.0f;
        this.variables.divideByAmount(f * -1.0f);
    }

    public final String c() {
        boolean z;
        String s = (this.a == null ? "0" : "" + this.a) + " = ";
        if(Float.compare(this.b, 0.0f) == 0) {
            z = false;
        }
        else {
            StringBuilder stringBuilder0 = b.t(s);
            stringBuilder0.append(this.b);
            s = stringBuilder0.toString();
            z = true;
        }
        int v1 = this.variables.getCurrentSize();
        for(int v = 0; v < v1; ++v) {
            SolverVariable solverVariable0 = this.variables.getVariable(v);
            if(solverVariable0 != null) {
                float f = this.variables.getVariableValue(v);
                int v2 = Float.compare(f, 0.0f);
                if(v2 != 0) {
                    String s1 = solverVariable0.toString();
                    if(z) {
                        if(v2 > 0) {
                            s = s + " + ";
                        }
                        else {
                            s = s + " - ";
                            f *= -1.0f;
                        }
                    }
                    else if(f < 0.0f) {
                        s = s + "- ";
                        f *= -1.0f;
                    }
                    s = f == 1.0f ? s + s1 : s + f + " " + s1;
                    z = true;
                }
            }
        }
        return z ? s : s + "0.0";
    }

    @Override  // androidx.constraintlayout.core.LinearSystem$Row
    public void clear() {
        this.variables.clear();
        this.a = null;
        this.b = 0.0f;
    }

    public ArrayRow createRowDimensionRatio(SolverVariable solverVariable0, SolverVariable solverVariable1, SolverVariable solverVariable2, SolverVariable solverVariable3, float f) {
        this.variables.put(solverVariable0, -1.0f);
        this.variables.put(solverVariable1, 1.0f);
        this.variables.put(solverVariable2, f);
        this.variables.put(solverVariable3, -f);
        return this;
    }

    public ArrayRow createRowEqualDimension(float f, float f1, float f2, SolverVariable solverVariable0, int v, SolverVariable solverVariable1, int v1, SolverVariable solverVariable2, int v2, SolverVariable solverVariable3, int v3) {
        if(Float.compare(f1, 0.0f) != 0 && f != f2) {
            float f3 = f / f1 / (f2 / f1);
            this.b = ((float)v3) * f3 + (((float)v2) * f3 + ((float)(-v - v1)));
            this.variables.put(solverVariable0, 1.0f);
            this.variables.put(solverVariable1, -1.0f);
            this.variables.put(solverVariable3, f3);
            this.variables.put(solverVariable2, -f3);
            return this;
        }
        this.b = (float)(-v - v1 + v2 + v3);
        this.variables.put(solverVariable0, 1.0f);
        this.variables.put(solverVariable1, -1.0f);
        this.variables.put(solverVariable3, 1.0f);
        this.variables.put(solverVariable2, -1.0f);
        return this;
    }

    public ArrayRow createRowEqualMatchDimensions(float f, float f1, float f2, SolverVariable solverVariable0, SolverVariable solverVariable1, SolverVariable solverVariable2, SolverVariable solverVariable3) {
        this.b = 0.0f;
        if(Float.compare(f1, 0.0f) != 0 && f != f2) {
            if(f == 0.0f) {
                this.variables.put(solverVariable0, 1.0f);
                this.variables.put(solverVariable1, -1.0f);
                return this;
            }
            if(f2 == 0.0f) {
                this.variables.put(solverVariable2, 1.0f);
                this.variables.put(solverVariable3, -1.0f);
                return this;
            }
            float f3 = f / f1 / (f2 / f1);
            this.variables.put(solverVariable0, 1.0f);
            this.variables.put(solverVariable1, -1.0f);
            this.variables.put(solverVariable3, f3);
            this.variables.put(solverVariable2, -f3);
            return this;
        }
        this.variables.put(solverVariable0, 1.0f);
        this.variables.put(solverVariable1, -1.0f);
        this.variables.put(solverVariable3, 1.0f);
        this.variables.put(solverVariable2, -1.0f);
        return this;
    }

    public ArrayRow createRowEquals(SolverVariable solverVariable0, int v) {
        if(v < 0) {
            this.b = (float)(-v);
            this.variables.put(solverVariable0, 1.0f);
            return this;
        }
        this.b = (float)v;
        this.variables.put(solverVariable0, -1.0f);
        return this;
    }

    public ArrayRow createRowEquals(SolverVariable solverVariable0, SolverVariable solverVariable1, int v) {
        boolean z = false;
        if(v != 0) {
            if(v < 0) {
                v = -v;
                z = true;
            }
            this.b = (float)v;
        }
        if(!z) {
            this.variables.put(solverVariable0, -1.0f);
            this.variables.put(solverVariable1, 1.0f);
            return this;
        }
        this.variables.put(solverVariable0, 1.0f);
        this.variables.put(solverVariable1, -1.0f);
        return this;
    }

    public ArrayRow createRowGreaterThan(SolverVariable solverVariable0, int v, SolverVariable solverVariable1) {
        this.b = (float)v;
        this.variables.put(solverVariable0, -1.0f);
        return this;
    }

    public ArrayRow createRowGreaterThan(SolverVariable solverVariable0, SolverVariable solverVariable1, SolverVariable solverVariable2, int v) {
        boolean z = false;
        if(v != 0) {
            if(v < 0) {
                v = -v;
                z = true;
            }
            this.b = (float)v;
        }
        if(!z) {
            this.variables.put(solverVariable0, -1.0f);
            this.variables.put(solverVariable1, 1.0f);
            this.variables.put(solverVariable2, 1.0f);
            return this;
        }
        this.variables.put(solverVariable0, 1.0f);
        this.variables.put(solverVariable1, -1.0f);
        this.variables.put(solverVariable2, -1.0f);
        return this;
    }

    public ArrayRow createRowLowerThan(SolverVariable solverVariable0, SolverVariable solverVariable1, SolverVariable solverVariable2, int v) {
        boolean z = false;
        if(v != 0) {
            if(v < 0) {
                v = -v;
                z = true;
            }
            this.b = (float)v;
        }
        if(!z) {
            this.variables.put(solverVariable0, -1.0f);
            this.variables.put(solverVariable1, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
            return this;
        }
        this.variables.put(solverVariable0, 1.0f);
        this.variables.put(solverVariable1, -1.0f);
        this.variables.put(solverVariable2, 1.0f);
        return this;
    }

    public ArrayRow createRowWithAngle(SolverVariable solverVariable0, SolverVariable solverVariable1, SolverVariable solverVariable2, SolverVariable solverVariable3, float f) {
        this.variables.put(solverVariable2, 0.5f);
        this.variables.put(solverVariable3, 0.5f);
        this.variables.put(solverVariable0, -0.5f);
        this.variables.put(solverVariable1, -0.5f);
        this.b = -f;
        return this;
    }

    @Override  // androidx.constraintlayout.core.LinearSystem$Row
    public SolverVariable getKey() {
        return this.a;
    }

    @Override  // androidx.constraintlayout.core.LinearSystem$Row
    public SolverVariable getPivotCandidate(LinearSystem linearSystem0, boolean[] arr_z) {
        return this.a(arr_z, null);
    }

    @Override  // androidx.constraintlayout.core.LinearSystem$Row
    public void initFromRow(Row linearSystem$Row0) {
        if(linearSystem$Row0 instanceof ArrayRow) {
            this.a = null;
            this.variables.clear();
            for(int v = 0; v < ((ArrayRow)linearSystem$Row0).variables.getCurrentSize(); ++v) {
                SolverVariable solverVariable0 = ((ArrayRow)linearSystem$Row0).variables.getVariable(v);
                float f = ((ArrayRow)linearSystem$Row0).variables.getVariableValue(v);
                this.variables.add(solverVariable0, f, true);
            }
        }
    }

    @Override  // androidx.constraintlayout.core.LinearSystem$Row
    public boolean isEmpty() {
        return this.a == null && this.b == 0.0f && this.variables.getCurrentSize() == 0;
    }

    public SolverVariable pickPivot(SolverVariable solverVariable0) {
        return this.a(null, solverVariable0);
    }

    public void reset() {
        this.a = null;
        this.variables.clear();
        this.b = 0.0f;
        this.d = false;
    }

    @Override
    public String toString() {
        return this.c();
    }

    @Override  // androidx.constraintlayout.core.LinearSystem$Row
    public void updateFromFinalVariable(LinearSystem linearSystem0, SolverVariable solverVariable0, boolean z) {
        if(solverVariable0 != null && solverVariable0.isFinalValue) {
            float f = this.variables.get(solverVariable0);
            this.b = solverVariable0.computedValue * f + this.b;
            this.variables.remove(solverVariable0, z);
            if(z) {
                solverVariable0.removeFromRow(this);
            }
            if(LinearSystem.SIMPLIFY_SYNONYMS && this.variables.getCurrentSize() == 0) {
                this.d = true;
                linearSystem0.hasSimpleDefinition = true;
            }
        }
    }

    @Override  // androidx.constraintlayout.core.LinearSystem$Row
    public void updateFromRow(LinearSystem linearSystem0, ArrayRow arrayRow0, boolean z) {
        float f = this.variables.use(arrayRow0, z);
        this.b = arrayRow0.b * f + this.b;
        if(z) {
            arrayRow0.a.removeFromRow(this);
        }
        if(LinearSystem.SIMPLIFY_SYNONYMS && this.a != null && this.variables.getCurrentSize() == 0) {
            this.d = true;
            linearSystem0.hasSimpleDefinition = true;
        }
    }

    public void updateFromSynonymVariable(LinearSystem linearSystem0, SolverVariable solverVariable0, boolean z) {
        if(solverVariable0 != null && solverVariable0.h) {
            float f = this.variables.get(solverVariable0);
            this.b = solverVariable0.j * f + this.b;
            this.variables.remove(solverVariable0, z);
            if(z) {
                solverVariable0.removeFromRow(this);
            }
            this.variables.add(linearSystem0.j.d[solverVariable0.i], f, z);
            if(LinearSystem.SIMPLIFY_SYNONYMS && this.variables.getCurrentSize() == 0) {
                this.d = true;
                linearSystem0.hasSimpleDefinition = true;
            }
        }
    }

    @Override  // androidx.constraintlayout.core.LinearSystem$Row
    public void updateFromSystem(LinearSystem linearSystem0) {
        ArrayList arrayList0;
        if(linearSystem0.e.length == 0) {
            return;
        }
        boolean z = false;
        while(!z) {
            int v = this.variables.getCurrentSize();
            for(int v1 = 0; true; ++v1) {
                arrayList0 = this.c;
                if(v1 >= v) {
                    break;
                }
                SolverVariable solverVariable0 = this.variables.getVariable(v1);
                if(solverVariable0.b != -1 || solverVariable0.isFinalValue || solverVariable0.h) {
                    arrayList0.add(solverVariable0);
                }
            }
            int v2 = arrayList0.size();
            if(v2 > 0) {
                for(int v3 = 0; v3 < v2; ++v3) {
                    SolverVariable solverVariable1 = (SolverVariable)arrayList0.get(v3);
                    if(solverVariable1.isFinalValue) {
                        this.updateFromFinalVariable(linearSystem0, solverVariable1, true);
                    }
                    else if(solverVariable1.h) {
                        this.updateFromSynonymVariable(linearSystem0, solverVariable1, true);
                    }
                    else {
                        this.updateFromRow(linearSystem0, linearSystem0.e[solverVariable1.b], true);
                    }
                }
                arrayList0.clear();
            }
            else {
                z = true;
            }
        }
        if(LinearSystem.SIMPLIFY_SYNONYMS && this.a != null && this.variables.getCurrentSize() == 0) {
            this.d = true;
            linearSystem0.hasSimpleDefinition = true;
        }
    }
}

