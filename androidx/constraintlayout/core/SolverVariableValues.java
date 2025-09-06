package androidx.constraintlayout.core;

import a5.b;
import java.util.Arrays;

public class SolverVariableValues implements ArrayRowVariables {
    public int a;
    public final int[] b;
    public int[] c;
    public int[] d;
    public float[] e;
    public int[] f;
    public int[] g;
    public int h;
    public int i;
    public final a j;
    protected final Cache mCache;

    public SolverVariableValues(a a0, Cache cache0) {
        this.a = 16;
        this.b = new int[16];
        this.c = new int[16];
        this.d = new int[16];
        this.e = new float[16];
        this.f = new int[16];
        this.g = new int[16];
        this.h = 0;
        this.i = -1;
        this.j = a0;
        this.mCache = cache0;
        this.clear();
    }

    public final void a(SolverVariable solverVariable0, int v) {
        int[] arr_v1;
        int v1 = solverVariable0.id % 16;
        int[] arr_v = this.b;
        int v2 = arr_v[v1];
        if(v2 == -1) {
            arr_v[v1] = v;
        }
        else {
            while(true) {
                arr_v1 = this.c;
                int v3 = arr_v1[v2];
                if(v3 == -1) {
                    break;
                }
                v2 = v3;
            }
            arr_v1[v2] = v;
        }
        this.c[v] = -1;
    }

    @Override  // androidx.constraintlayout.core.ArrayRow$ArrayRowVariables
    public void add(SolverVariable solverVariable0, float f, boolean z) {
        if(Float.compare(f, -0.001f) > 0 && f < 0.001f) {
            return;
        }
        int v = this.indexOf(solverVariable0);
        if(v == -1) {
            this.put(solverVariable0, f);
            return;
        }
        float[] arr_f = this.e;
        float f1 = arr_f[v] + f;
        arr_f[v] = f1;
        if(f1 > -0.001f && f1 < 0.001f) {
            arr_f[v] = 0.0f;
            this.remove(solverVariable0, z);
        }
    }

    public final void b(int v, SolverVariable solverVariable0, float f) {
        this.d[v] = solverVariable0.id;
        this.e[v] = f;
        this.f[v] = -1;
        this.g[v] = -1;
        solverVariable0.addToRow(this.j);
        ++solverVariable0.usageInRowCount;
        ++this.h;
    }

    @Override  // androidx.constraintlayout.core.ArrayRow$ArrayRowVariables
    public void clear() {
        int v = this.h;
        for(int v1 = 0; v1 < v; ++v1) {
            SolverVariable solverVariable0 = this.getVariable(v1);
            if(solverVariable0 != null) {
                solverVariable0.removeFromRow(this.j);
            }
        }
        for(int v2 = 0; v2 < this.a; ++v2) {
            this.d[v2] = -1;
            this.c[v2] = -1;
        }
        for(int v3 = 0; v3 < 16; ++v3) {
            this.b[v3] = -1;
        }
        this.h = 0;
        this.i = -1;
    }

    @Override  // androidx.constraintlayout.core.ArrayRow$ArrayRowVariables
    public boolean contains(SolverVariable solverVariable0) {
        return this.indexOf(solverVariable0) != -1;
    }

    @Override  // androidx.constraintlayout.core.ArrayRow$ArrayRowVariables
    public void display() {
        int v = this.h;
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
        int v = this.h;
        int v1 = this.i;
        for(int v2 = 0; v2 < v; ++v2) {
            this.e[v1] /= f;
            v1 = this.g[v1];
            if(v1 == -1) {
                break;
            }
        }
    }

    @Override  // androidx.constraintlayout.core.ArrayRow$ArrayRowVariables
    public float get(SolverVariable solverVariable0) {
        int v = this.indexOf(solverVariable0);
        return v == -1 ? 0.0f : this.e[v];
    }

    @Override  // androidx.constraintlayout.core.ArrayRow$ArrayRowVariables
    public int getCurrentSize() {
        return this.h;
    }

    @Override  // androidx.constraintlayout.core.ArrayRow$ArrayRowVariables
    public SolverVariable getVariable(int v) {
        int v1 = this.h;
        if(v1 == 0) {
            return null;
        }
        int v2 = this.i;
        for(int v3 = 0; v3 < v1; ++v3) {
            if(v3 == v && v2 != -1) {
                return this.mCache.d[this.d[v2]];
            }
            v2 = this.g[v2];
            if(v2 == -1) {
                break;
            }
        }
        return null;
    }

    @Override  // androidx.constraintlayout.core.ArrayRow$ArrayRowVariables
    public float getVariableValue(int v) {
        int v1 = this.h;
        int v2 = this.i;
        for(int v3 = 0; v3 < v1; ++v3) {
            if(v3 == v) {
                return this.e[v2];
            }
            v2 = this.g[v2];
            if(v2 == -1) {
                break;
            }
        }
        return 0.0f;
    }

    @Override  // androidx.constraintlayout.core.ArrayRow$ArrayRowVariables
    public int indexOf(SolverVariable solverVariable0) {
        if(this.h != 0 && solverVariable0 != null) {
            int v = solverVariable0.id;
            int v1 = this.b[v % 16];
            if(v1 == -1) {
                return -1;
            }
            if(this.d[v1] == v) {
                return v1;
            }
            do {
                v1 = this.c[v1];
            }
            while(v1 != -1 && this.d[v1] != v);
            if(v1 == -1) {
                return -1;
            }
            return this.d[v1] == v ? v1 : -1;
        }
        return -1;
    }

    @Override  // androidx.constraintlayout.core.ArrayRow$ArrayRowVariables
    public void invert() {
        int v = this.h;
        int v1 = this.i;
        for(int v2 = 0; v2 < v; ++v2) {
            this.e[v1] *= -1.0f;
            v1 = this.g[v1];
            if(v1 == -1) {
                break;
            }
        }
    }

    @Override  // androidx.constraintlayout.core.ArrayRow$ArrayRowVariables
    public void put(SolverVariable solverVariable0, float f) {
        int v = 0;
        if(Float.compare(f, -0.001f) > 0 && f < 0.001f) {
            this.remove(solverVariable0, true);
            return;
        }
        if(this.h == 0) {
            this.b(0, solverVariable0, f);
            this.a(solverVariable0, 0);
            this.i = 0;
            return;
        }
        int v1 = this.indexOf(solverVariable0);
        if(v1 != -1) {
            this.e[v1] = f;
            return;
        }
        int v2 = this.a;
        if(this.h + 1 >= v2) {
            this.d = Arrays.copyOf(this.d, v2 * 2);
            this.e = Arrays.copyOf(this.e, v2 * 2);
            this.f = Arrays.copyOf(this.f, v2 * 2);
            this.g = Arrays.copyOf(this.g, v2 * 2);
            this.c = Arrays.copyOf(this.c, v2 * 2);
            for(int v3 = this.a; v3 < v2 * 2; ++v3) {
                this.d[v3] = -1;
                this.c[v3] = -1;
            }
            this.a = v2 * 2;
        }
        int v4 = this.h;
        int v5 = this.i;
        int v7 = -1;
        for(int v6 = 0; v6 < v4; ++v6) {
            int v8 = this.d[v5];
            int v9 = solverVariable0.id;
            if(v8 == v9) {
                this.e[v5] = f;
                return;
            }
            if(v8 < v9) {
                v7 = v5;
            }
            v5 = this.g[v5];
            if(v5 == -1) {
                break;
            }
        }
        while(true) {
            if(v >= this.a) {
                v = -1;
                break;
            }
            if(this.d[v] == -1) {
                break;
            }
            ++v;
        }
        this.b(v, solverVariable0, f);
        if(v7 == -1) {
            this.f[v] = -1;
            if(this.h > 0) {
                this.g[v] = this.i;
                this.i = v;
            }
            else {
                this.g[v] = -1;
            }
        }
        else {
            this.f[v] = v7;
            int[] arr_v = this.g;
            arr_v[v] = arr_v[v7];
            arr_v[v7] = v;
        }
        int v10 = this.g[v];
        if(v10 != -1) {
            this.f[v10] = v;
        }
        this.a(solverVariable0, v);
    }

    @Override  // androidx.constraintlayout.core.ArrayRow$ArrayRowVariables
    public float remove(SolverVariable solverVariable0, boolean z) {
        int v3;
        int[] arr_v2;
        int v = this.indexOf(solverVariable0);
        if(v == -1) {
            return 0.0f;
        }
        int v1 = solverVariable0.id;
        int[] arr_v = this.b;
        int v2 = arr_v[v1 % 16];
        if(v2 != -1) {
            if(this.d[v2] == v1) {
                int[] arr_v1 = this.c;
                arr_v[v1 % 16] = arr_v1[v2];
                arr_v1[v2] = -1;
            }
            else {
                while(true) {
                    arr_v2 = this.c;
                    v3 = arr_v2[v2];
                    if(v3 == -1 || this.d[v3] == v1) {
                        break;
                    }
                    v2 = v3;
                }
                if(v3 != -1 && this.d[v3] == v1) {
                    arr_v2[v2] = arr_v2[v3];
                    arr_v2[v3] = -1;
                }
            }
        }
        float f = this.e[v];
        if(this.i == v) {
            this.i = this.g[v];
        }
        this.d[v] = -1;
        int[] arr_v3 = this.f;
        int v4 = arr_v3[v];
        if(v4 != -1) {
            this.g[v4] = this.g[v];
        }
        int v5 = this.g[v];
        if(v5 != -1) {
            arr_v3[v5] = arr_v3[v];
        }
        --this.h;
        --solverVariable0.usageInRowCount;
        if(z) {
            solverVariable0.removeFromRow(this.j);
        }
        return f;
    }

    @Override  // androidx.constraintlayout.core.ArrayRow$ArrayRowVariables
    public int sizeInBytes() {
        return 0;
    }

    @Override
    public String toString() {
        String s3;
        String s2;
        String s = this.hashCode() + " { ";
        int v = this.h;
        for(int v1 = 0; v1 < v; ++v1) {
            SolverVariable solverVariable0 = this.getVariable(v1);
            if(solverVariable0 != null) {
                int v2 = this.indexOf(solverVariable0);
                String s1 = androidx.room.a.z((s + solverVariable0 + " = " + this.getVariableValue(v1) + " "), "[p: ");
                if(this.f[v2] == -1) {
                    s2 = s1 + "none";
                }
                else {
                    StringBuilder stringBuilder0 = b.t(s1);
                    stringBuilder0.append(this.mCache.d[this.d[this.f[v2]]]);
                    s2 = stringBuilder0.toString();
                }
                if(this.g[v2] == -1) {
                    s3 = s2 + ", n: " + "none";
                }
                else {
                    StringBuilder stringBuilder1 = b.t((s2 + ", n: "));
                    stringBuilder1.append(this.mCache.d[this.d[this.g[v2]]]);
                    s3 = stringBuilder1.toString();
                }
                s = s3 + "]";
            }
        }
        return s + " }";
    }

    @Override  // androidx.constraintlayout.core.ArrayRow$ArrayRowVariables
    public float use(ArrayRow arrayRow0, boolean z) {
        float f = this.get(arrayRow0.a);
        this.remove(arrayRow0.a, z);
        SolverVariableValues solverVariableValues0 = (SolverVariableValues)arrayRow0.variables;
        int v = solverVariableValues0.getCurrentSize();
        int v1 = 0;
        for(int v2 = 0; v1 < v; ++v2) {
            int v3 = solverVariableValues0.d[v2];
            if(v3 != -1) {
                this.add(this.mCache.d[v3], solverVariableValues0.e[v2] * f, z);
                ++v1;
            }
        }
        return f;
    }
}

