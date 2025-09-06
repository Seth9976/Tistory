package androidx.constraintlayout.core;

import java.util.Arrays;

public class SolverVariable implements Comparable {
    public static enum Type {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN;

    }

    public static final int STRENGTH_BARRIER = 6;
    public static final int STRENGTH_CENTERING = 7;
    public static final int STRENGTH_EQUALITY = 5;
    public static final int STRENGTH_FIXED = 8;
    public static final int STRENGTH_HIGH = 3;
    public static final int STRENGTH_HIGHEST = 4;
    public static final int STRENGTH_LOW = 1;
    public static final int STRENGTH_MEDIUM = 2;
    public static final int STRENGTH_NONE;
    public String a;
    public int b;
    public final float[] c;
    public float computedValue;
    public final float[] d;
    public Type e;
    public ArrayRow[] f;
    public int g;
    public boolean h;
    public int i;
    public int id;
    public boolean inGoal;
    public boolean isFinalValue;
    public float j;
    public int strength;
    public int usageInRowCount;

    public SolverVariable(Type solverVariable$Type0, String s) {
        this.id = -1;
        this.b = -1;
        this.strength = 0;
        this.isFinalValue = false;
        this.c = new float[9];
        this.d = new float[9];
        this.f = new ArrayRow[16];
        this.g = 0;
        this.usageInRowCount = 0;
        this.h = false;
        this.i = -1;
        this.j = 0.0f;
        this.e = solverVariable$Type0;
    }

    public SolverVariable(String s, Type solverVariable$Type0) {
        this.id = -1;
        this.b = -1;
        this.strength = 0;
        this.isFinalValue = false;
        this.c = new float[9];
        this.d = new float[9];
        this.f = new ArrayRow[16];
        this.g = 0;
        this.usageInRowCount = 0;
        this.h = false;
        this.i = -1;
        this.j = 0.0f;
        this.a = s;
        this.e = solverVariable$Type0;
    }

    public final void addToRow(ArrayRow arrayRow0) {
        for(int v = 0; true; ++v) {
            int v1 = this.g;
            if(v >= v1) {
                break;
            }
            if(this.f[v] == arrayRow0) {
                return;
            }
        }
        ArrayRow[] arr_arrayRow = this.f;
        if(v1 >= arr_arrayRow.length) {
            this.f = (ArrayRow[])Arrays.copyOf(arr_arrayRow, arr_arrayRow.length * 2);
        }
        int v2 = this.g;
        this.f[v2] = arrayRow0;
        this.g = v2 + 1;
    }

    public int compareTo(SolverVariable solverVariable0) {
        return this.id - solverVariable0.id;
    }

    @Override
    public int compareTo(Object object0) {
        return this.compareTo(((SolverVariable)object0));
    }

    public String getName() {
        return this.a;
    }

    public final void removeFromRow(ArrayRow arrayRow0) {
        int v = this.g;
        for(int v1 = 0; v1 < v; ++v1) {
            if(this.f[v1] == arrayRow0) {
                while(v1 < v - 1) {
                    this.f[v1] = this.f[v1 + 1];
                    ++v1;
                }
                --this.g;
                return;
            }
        }
    }

    public void reset() {
        this.a = null;
        this.e = Type.UNKNOWN;
        this.strength = 0;
        this.id = -1;
        this.b = -1;
        this.computedValue = 0.0f;
        this.isFinalValue = false;
        this.h = false;
        this.i = -1;
        this.j = 0.0f;
        int v = this.g;
        for(int v1 = 0; v1 < v; ++v1) {
            this.f[v1] = null;
        }
        this.g = 0;
        this.usageInRowCount = 0;
        this.inGoal = false;
        Arrays.fill(this.d, 0.0f);
    }

    public void setFinalValue(LinearSystem linearSystem0, float f) {
        this.computedValue = f;
        this.isFinalValue = true;
        this.h = false;
        this.i = -1;
        this.j = 0.0f;
        int v = this.g;
        this.b = -1;
        for(int v1 = 0; v1 < v; ++v1) {
            this.f[v1].updateFromFinalVariable(linearSystem0, this, false);
        }
        this.g = 0;
    }

    public void setName(String s) {
        this.a = s;
    }

    public void setSynonym(LinearSystem linearSystem0, SolverVariable solverVariable0, float f) {
        this.h = true;
        this.i = solverVariable0.id;
        this.j = f;
        int v = this.g;
        this.b = -1;
        for(int v1 = 0; v1 < v; ++v1) {
            this.f[v1].updateFromSynonymVariable(linearSystem0, this, false);
        }
        this.g = 0;
        linearSystem0.displayReadableRows();
    }

    public void setType(Type solverVariable$Type0, String s) {
        this.e = solverVariable$Type0;
    }

    @Override
    public String toString() {
        return this.a == null ? "" + this.id : "" + this.a;
    }

    public final void updateReferencesWithNewDefinition(LinearSystem linearSystem0, ArrayRow arrayRow0) {
        int v = this.g;
        for(int v1 = 0; v1 < v; ++v1) {
            this.f[v1].updateFromRow(linearSystem0, arrayRow0, false);
        }
        this.g = 0;
    }
}

