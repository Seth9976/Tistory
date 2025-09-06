package androidx.constraintlayout.core;

import a5.b;
import androidx.room.a;
import java.util.Arrays;

public class ArrayLinkedVariables implements ArrayRowVariables {
    public int a;
    public final ArrayRow b;
    public int c;
    public int[] d;
    public int[] e;
    public float[] f;
    public int g;
    public int h;
    public boolean i;
    protected final Cache mCache;

    public ArrayLinkedVariables(ArrayRow arrayRow0, Cache cache0) {
        this.a = 0;
        this.c = 8;
        this.d = new int[8];
        this.e = new int[8];
        this.f = new float[8];
        this.g = -1;
        this.h = -1;
        this.i = false;
        this.b = arrayRow0;
        this.mCache = cache0;
    }

    @Override  // androidx.constraintlayout.core.ArrayRow$ArrayRowVariables
    public void add(SolverVariable solverVariable0, float f, boolean z) {
        if(Float.compare(f, -0.001f) > 0 && f < 0.001f) {
            return;
        }
        int v = this.g;
        ArrayRow arrayRow0 = this.b;
        if(v == -1) {
            this.g = 0;
            this.f[0] = f;
            this.d[0] = solverVariable0.id;
            this.e[0] = -1;
            ++solverVariable0.usageInRowCount;
            solverVariable0.addToRow(arrayRow0);
            ++this.a;
            if(!this.i) {
                int v1 = this.h + 1;
                this.h = v1;
                int[] arr_v = this.d;
                if(v1 >= arr_v.length) {
                    this.i = true;
                    this.h = arr_v.length - 1;
                }
            }
            return;
        }
        int v3 = -1;
        for(int v2 = 0; v != -1 && v2 < this.a; ++v2) {
            int v4 = this.d[v];
            int v5 = solverVariable0.id;
            if(v4 == v5) {
                float[] arr_f = this.f;
                float f1 = arr_f[v] + f;
                if(Float.compare(f1, -0.001f) > 0 && f1 < 0.001f) {
                    f1 = 0.0f;
                }
                arr_f[v] = f1;
                if(f1 == 0.0f) {
                    if(v == this.g) {
                        this.g = this.e[v];
                    }
                    else {
                        this.e[v3] = this.e[v];
                    }
                    if(z) {
                        solverVariable0.removeFromRow(arrayRow0);
                    }
                    if(this.i) {
                        this.h = v;
                    }
                    --solverVariable0.usageInRowCount;
                    --this.a;
                }
                return;
            }
            if(v4 < v5) {
                v3 = v;
            }
            v = this.e[v];
        }
        int v6 = this.h;
        if(this.i) {
            int[] arr_v1 = this.d;
            if(arr_v1[v6] != -1) {
                v6 = arr_v1.length;
            }
        }
        else {
            ++v6;
        }
        if(v6 >= this.d.length && this.a < this.d.length) {
            for(int v7 = 0; true; ++v7) {
                int[] arr_v2 = this.d;
                if(v7 >= arr_v2.length) {
                    break;
                }
                if(arr_v2[v7] == -1) {
                    v6 = v7;
                    break;
                }
            }
        }
        int[] arr_v3 = this.d;
        if(v6 >= arr_v3.length) {
            v6 = arr_v3.length;
            int v8 = this.c * 2;
            this.c = v8;
            this.i = false;
            this.h = v6 - 1;
            this.f = Arrays.copyOf(this.f, v8);
            this.d = Arrays.copyOf(this.d, this.c);
            this.e = Arrays.copyOf(this.e, this.c);
        }
        this.d[v6] = solverVariable0.id;
        this.f[v6] = f;
        if(v3 == -1) {
            this.e[v6] = this.g;
            this.g = v6;
        }
        else {
            int[] arr_v4 = this.e;
            arr_v4[v6] = arr_v4[v3];
            arr_v4[v3] = v6;
        }
        ++solverVariable0.usageInRowCount;
        solverVariable0.addToRow(arrayRow0);
        ++this.a;
        if(!this.i) {
            ++this.h;
        }
        int[] arr_v5 = this.d;
        if(this.h >= arr_v5.length) {
            this.i = true;
            this.h = arr_v5.length - 1;
        }
    }

    @Override  // androidx.constraintlayout.core.ArrayRow$ArrayRowVariables
    public final void clear() {
        int v = this.g;
        for(int v1 = 0; v != -1 && v1 < this.a; ++v1) {
            SolverVariable solverVariable0 = this.mCache.d[this.d[v]];
            if(solverVariable0 != null) {
                solverVariable0.removeFromRow(this.b);
            }
            v = this.e[v];
        }
        this.g = -1;
        this.h = -1;
        this.i = false;
        this.a = 0;
    }

    @Override  // androidx.constraintlayout.core.ArrayRow$ArrayRowVariables
    public boolean contains(SolverVariable solverVariable0) {
        int v = this.g;
        if(v == -1) {
            return false;
        }
        for(int v1 = 0; v != -1 && v1 < this.a; ++v1) {
            if(this.d[v] == solverVariable0.id) {
                return true;
            }
            v = this.e[v];
        }
        return false;
    }

    @Override  // androidx.constraintlayout.core.ArrayRow$ArrayRowVariables
    public void display() {
        int v = this.a;
        System.out.print("{ ");
        for(int v1 = 0; v1 < v; ++v1) {
            SolverVariable solverVariable0 = this.getVariable(v1);
            if(solverVariable0 != null) {
                System.out.print(solverVariable0 + " = " + this.getVariableValue(v1) + " ");
            }
        }
        System.out.println(" }");
    }

    @Override  // androidx.constraintlayout.core.ArrayRow$ArrayRowVariables
    public void divideByAmount(float f) {
        int v = this.g;
        for(int v1 = 0; v != -1 && v1 < this.a; ++v1) {
            this.f[v] /= f;
            v = this.e[v];
        }
    }

    @Override  // androidx.constraintlayout.core.ArrayRow$ArrayRowVariables
    public final float get(SolverVariable solverVariable0) {
        int v = this.g;
        for(int v1 = 0; v != -1 && v1 < this.a; ++v1) {
            if(this.d[v] == solverVariable0.id) {
                return this.f[v];
            }
            v = this.e[v];
        }
        return 0.0f;
    }

    @Override  // androidx.constraintlayout.core.ArrayRow$ArrayRowVariables
    public int getCurrentSize() {
        return this.a;
    }

    public int getHead() {
        return this.g;
    }

    public final int getId(int v) {
        return this.d[v];
    }

    public final int getNextIndice(int v) {
        return this.e[v];
    }

    public final float getValue(int v) {
        return this.f[v];
    }

    @Override  // androidx.constraintlayout.core.ArrayRow$ArrayRowVariables
    public SolverVariable getVariable(int v) {
        int v1 = this.g;
        for(int v2 = 0; v1 != -1 && v2 < this.a; ++v2) {
            if(v2 == v) {
                return this.mCache.d[this.d[v1]];
            }
            v1 = this.e[v1];
        }
        return null;
    }

    @Override  // androidx.constraintlayout.core.ArrayRow$ArrayRowVariables
    public float getVariableValue(int v) {
        int v1 = this.g;
        for(int v2 = 0; v1 != -1 && v2 < this.a; ++v2) {
            if(v2 == v) {
                return this.f[v1];
            }
            v1 = this.e[v1];
        }
        return 0.0f;
    }

    @Override  // androidx.constraintlayout.core.ArrayRow$ArrayRowVariables
    public int indexOf(SolverVariable solverVariable0) {
        int v = this.g;
        if(v == -1) {
            return -1;
        }
        for(int v1 = 0; v != -1 && v1 < this.a; ++v1) {
            if(this.d[v] == solverVariable0.id) {
                return v;
            }
            v = this.e[v];
        }
        return -1;
    }

    @Override  // androidx.constraintlayout.core.ArrayRow$ArrayRowVariables
    public void invert() {
        int v = this.g;
        for(int v1 = 0; v != -1 && v1 < this.a; ++v1) {
            this.f[v] *= -1.0f;
            v = this.e[v];
        }
    }

    @Override  // androidx.constraintlayout.core.ArrayRow$ArrayRowVariables
    public final void put(SolverVariable solverVariable0, float f) {
        if(Float.compare(f, 0.0f) == 0) {
            this.remove(solverVariable0, true);
            return;
        }
        int v = this.g;
        ArrayRow arrayRow0 = this.b;
        if(v == -1) {
            this.g = 0;
            this.f[0] = f;
            this.d[0] = solverVariable0.id;
            this.e[0] = -1;
            ++solverVariable0.usageInRowCount;
            solverVariable0.addToRow(arrayRow0);
            ++this.a;
            if(!this.i) {
                int v1 = this.h + 1;
                this.h = v1;
                int[] arr_v = this.d;
                if(v1 >= arr_v.length) {
                    this.i = true;
                    this.h = arr_v.length - 1;
                }
            }
            return;
        }
        int v3 = -1;
        for(int v2 = 0; v != -1 && v2 < this.a; ++v2) {
            int v4 = this.d[v];
            int v5 = solverVariable0.id;
            if(v4 == v5) {
                this.f[v] = f;
                return;
            }
            if(v4 < v5) {
                v3 = v;
            }
            v = this.e[v];
        }
        int v6 = this.h;
        if(this.i) {
            int[] arr_v1 = this.d;
            if(arr_v1[v6] != -1) {
                v6 = arr_v1.length;
            }
        }
        else {
            ++v6;
        }
        if(v6 >= this.d.length && this.a < this.d.length) {
            for(int v7 = 0; true; ++v7) {
                int[] arr_v2 = this.d;
                if(v7 >= arr_v2.length) {
                    break;
                }
                if(arr_v2[v7] == -1) {
                    v6 = v7;
                    break;
                }
            }
        }
        int[] arr_v3 = this.d;
        if(v6 >= arr_v3.length) {
            v6 = arr_v3.length;
            int v8 = this.c * 2;
            this.c = v8;
            this.i = false;
            this.h = v6 - 1;
            this.f = Arrays.copyOf(this.f, v8);
            this.d = Arrays.copyOf(this.d, this.c);
            this.e = Arrays.copyOf(this.e, this.c);
        }
        this.d[v6] = solverVariable0.id;
        this.f[v6] = f;
        if(v3 == -1) {
            this.e[v6] = this.g;
            this.g = v6;
        }
        else {
            int[] arr_v4 = this.e;
            arr_v4[v6] = arr_v4[v3];
            arr_v4[v3] = v6;
        }
        ++solverVariable0.usageInRowCount;
        solverVariable0.addToRow(arrayRow0);
        int v9 = this.a + 1;
        this.a = v9;
        if(!this.i) {
            ++this.h;
        }
        int[] arr_v5 = this.d;
        if(v9 >= arr_v5.length) {
            this.i = true;
        }
        if(this.h >= arr_v5.length) {
            this.i = true;
            this.h = arr_v5.length - 1;
        }
    }

    @Override  // androidx.constraintlayout.core.ArrayRow$ArrayRowVariables
    public final float remove(SolverVariable solverVariable0, boolean z) {
        int v = this.g;
        if(v == -1) {
            return 0.0f;
        }
        int v1 = 0;
        int v2 = -1;
        while(v != -1 && v1 < this.a) {
            if(this.d[v] == solverVariable0.id) {
                if(v == this.g) {
                    this.g = this.e[v];
                }
                else {
                    this.e[v2] = this.e[v];
                }
                if(z) {
                    solverVariable0.removeFromRow(this.b);
                }
                --solverVariable0.usageInRowCount;
                --this.a;
                this.d[v] = -1;
                if(this.i) {
                    this.h = v;
                }
                return this.f[v];
            }
            ++v1;
            v2 = v;
            v = this.e[v];
        }
        return 0.0f;
    }

    @Override  // androidx.constraintlayout.core.ArrayRow$ArrayRowVariables
    public int sizeInBytes() {
        return this.d.length * 12 + 36;
    }

    @Override
    public String toString() {
        int v = this.g;
        String s = "";
        for(int v1 = 0; v != -1 && v1 < this.a; ++v1) {
            StringBuilder stringBuilder0 = b.t((s + " -> "));
            StringBuilder stringBuilder1 = b.t(a.h(this.f[v], " : ", stringBuilder0));
            stringBuilder1.append(this.mCache.d[this.d[v]]);
            s = stringBuilder1.toString();
            v = this.e[v];
        }
        return s;
    }

    @Override  // androidx.constraintlayout.core.ArrayRow$ArrayRowVariables
    public float use(ArrayRow arrayRow0, boolean z) {
        float f = this.get(arrayRow0.a);
        this.remove(arrayRow0.a, z);
        ArrayRowVariables arrayRow$ArrayRowVariables0 = arrayRow0.variables;
        int v = arrayRow$ArrayRowVariables0.getCurrentSize();
        for(int v1 = 0; v1 < v; ++v1) {
            SolverVariable solverVariable0 = arrayRow$ArrayRowVariables0.getVariable(v1);
            this.add(solverVariable0, arrayRow$ArrayRowVariables0.get(solverVariable0) * f, z);
        }
        return f;
    }
}

