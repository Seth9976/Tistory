package androidx.constraintlayout.core;

import a7.b;
import androidx.room.a;
import java.util.Arrays;

public class PriorityGoalRow extends ArrayRow {
    public SolverVariable[] e;
    public SolverVariable[] f;
    public int g;
    public final b h;

    public PriorityGoalRow(Cache cache0) {
        super(cache0);
        this.e = new SolverVariable[0x80];
        this.f = new SolverVariable[0x80];
        this.g = 0;
        this.h = new b(this);
    }

    @Override  // androidx.constraintlayout.core.ArrayRow
    public void addError(SolverVariable solverVariable0) {
        this.h.b = solverVariable0;
        Arrays.fill(solverVariable0.d, 0.0f);
        solverVariable0.d[solverVariable0.strength] = 1.0f;
        this.d(solverVariable0);
    }

    @Override  // androidx.constraintlayout.core.ArrayRow
    public void clear() {
        this.g = 0;
        this.b = 0.0f;
    }

    public final void d(SolverVariable solverVariable0) {
        int v3;
        SolverVariable[] arr_solverVariable = this.e;
        if(this.g + 1 > arr_solverVariable.length) {
            SolverVariable[] arr_solverVariable1 = (SolverVariable[])Arrays.copyOf(arr_solverVariable, arr_solverVariable.length * 2);
            this.e = arr_solverVariable1;
            this.f = (SolverVariable[])Arrays.copyOf(arr_solverVariable1, arr_solverVariable1.length * 2);
        }
        SolverVariable[] arr_solverVariable2 = this.e;
        int v = this.g;
        arr_solverVariable2[v] = solverVariable0;
        this.g = v + 1;
        if(v + 1 > 1 && arr_solverVariable2[v].id > solverVariable0.id) {
            for(int v2 = 0; true; ++v2) {
                v3 = this.g;
                if(v2 >= v3) {
                    break;
                }
                this.f[v2] = this.e[v2];
            }
            Arrays.sort(this.f, 0, v3, new c(0));
            for(int v1 = 0; v1 < this.g; ++v1) {
                this.e[v1] = this.f[v1];
            }
        }
        solverVariable0.inGoal = true;
        solverVariable0.addToRow(this);
    }

    public final void e(SolverVariable solverVariable0) {
        int v1;
        for(int v = 0; v < this.g; ++v) {
            if(this.e[v] == solverVariable0) {
                while(true) {
                    v1 = this.g;
                    if(v >= v1 - 1) {
                        break;
                    }
                    this.e[v] = this.e[v + 1];
                    ++v;
                }
                this.g = v1 - 1;
                solverVariable0.inGoal = false;
                return;
            }
        }
    }

    @Override  // androidx.constraintlayout.core.ArrayRow
    public SolverVariable getPivotCandidate(LinearSystem linearSystem0, boolean[] arr_z) {
        int v = 0;
        int v1 = -1;
        while(v < this.g) {
            SolverVariable[] arr_solverVariable = this.e;
            SolverVariable solverVariable0 = arr_solverVariable[v];
            if(!arr_z[solverVariable0.id]) {
                b b0 = this.h;
                b0.b = solverVariable0;
                int v2 = 8;
                if(v1 == -1) {
                    while(v2 >= 0) {
                        float f = ((SolverVariable)b0.b).d[v2];
                        if(f > 0.0f) {
                            goto label_30;
                        }
                        if(f >= 0.0f) {
                            --v2;
                            continue;
                        }
                        v1 = v;
                        goto label_30;
                    }
                    b0.getClass();
                }
                else {
                    SolverVariable solverVariable1 = arr_solverVariable[v1];
                    b0.getClass();
                    while(v2 >= 0) {
                        float f1 = solverVariable1.d[v2];
                        float f2 = ((SolverVariable)b0.b).d[v2];
                        if(f2 != f1) {
                            if(f2 >= f1) {
                                break;
                            }
                            v1 = v;
                            break;
                        }
                        --v2;
                    }
                }
            }
        label_30:
            ++v;
        }
        return v1 == -1 ? null : this.e[v1];
    }

    @Override  // androidx.constraintlayout.core.ArrayRow
    public boolean isEmpty() {
        return this.g == 0;
    }

    @Override  // androidx.constraintlayout.core.ArrayRow
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder(" goal -> (");
        String s = a.h(this.b, ") : ", stringBuilder0);
        for(int v = 0; v < this.g; ++v) {
            this.h.b = this.e[v];
            s = s + this.h + " ";
        }
        return s;
    }

    @Override  // androidx.constraintlayout.core.ArrayRow
    public void updateFromRow(LinearSystem linearSystem0, ArrayRow arrayRow0, boolean z) {
        SolverVariable solverVariable0 = arrayRow0.a;
        if(solverVariable0 == null) {
            return;
        }
        ArrayRowVariables arrayRow$ArrayRowVariables0 = arrayRow0.variables;
        int v = arrayRow$ArrayRowVariables0.getCurrentSize();
        for(int v1 = 0; v1 < v; ++v1) {
            SolverVariable solverVariable1 = arrayRow$ArrayRowVariables0.getVariable(v1);
            float f = arrayRow$ArrayRowVariables0.getVariableValue(v1);
            b b0 = this.h;
            b0.b = solverVariable1;
            float[] arr_f = solverVariable0.d;
            if(solverVariable1.inGoal) {
                boolean z1 = true;
                for(int v2 = 0; v2 < 9; ++v2) {
                    float[] arr_f1 = ((SolverVariable)b0.b).d;
                    float f1 = arr_f[v2] * f + arr_f1[v2];
                    arr_f1[v2] = f1;
                    if(Math.abs(f1) < 0.0001f) {
                        ((SolverVariable)b0.b).d[v2] = 0.0f;
                    }
                    else {
                        z1 = false;
                    }
                }
                if(z1) {
                    ((PriorityGoalRow)b0.c).e(((SolverVariable)b0.b));
                }
            }
            else {
                for(int v3 = 0; v3 < 9; ++v3) {
                    float f2 = arr_f[v3];
                    if(f2 == 0.0f) {
                        ((SolverVariable)b0.b).d[v3] = 0.0f;
                    }
                    else {
                        ((SolverVariable)b0.b).d[v3] = Math.abs(f2 * f) < 0.0001f ? 0.0f : f2 * f;
                    }
                }
                this.d(solverVariable1);
            }
            this.b = arrayRow0.b * f + this.b;
        }
        this.e(solverVariable0);
    }
}

