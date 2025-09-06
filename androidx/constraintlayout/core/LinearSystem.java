package androidx.constraintlayout.core;

import a5.b;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.Arrays;

public class LinearSystem {
    interface Row {
        void addError(SolverVariable arg1);

        void clear();

        SolverVariable getKey();

        SolverVariable getPivotCandidate(LinearSystem arg1, boolean[] arg2);

        void initFromRow(Row arg1);

        boolean isEmpty();

        void updateFromFinalVariable(LinearSystem arg1, SolverVariable arg2, boolean arg3);

        void updateFromRow(LinearSystem arg1, ArrayRow arg2, boolean arg3);

        void updateFromSystem(LinearSystem arg1);
    }

    public static long ARRAY_ROW_CREATION = 0L;
    public static final boolean DEBUG = false;
    public static final boolean FULL_DEBUG = false;
    public static final boolean MEASURE = false;
    public static long OPTIMIZED_ARRAY_ROW_CREATION = 0L;
    public static boolean OPTIMIZED_ENGINE = false;
    public static boolean SIMPLIFY_SYNONYMS = true;
    public static boolean SKIP_COLUMNS = true;
    public static boolean USE_BASIC_SYNONYMS = true;
    public static boolean USE_DEPENDENCY_ORDERING = false;
    public static boolean USE_SYNONYMS = true;
    public int a;
    public final PriorityGoalRow b;
    public int c;
    public int d;
    public ArrayRow[] e;
    public boolean[] f;
    public int g;
    public boolean graphOptimizer;
    public int h;
    public boolean hasSimpleDefinition;
    public int i;
    public final Cache j;
    public SolverVariable[] k;
    public int l;
    public ArrayRow m;
    public static int n = 1000;
    public boolean newgraphOptimizer;
    public static Metrics sMetrics;

    public LinearSystem() {
        this.hasSimpleDefinition = false;
        this.a = 0;
        this.c = 0x20;
        this.d = 0x20;
        this.e = null;
        this.graphOptimizer = false;
        this.newgraphOptimizer = false;
        this.f = new boolean[0x20];
        this.g = 1;
        this.h = 0;
        this.i = 0x20;
        this.k = new SolverVariable[LinearSystem.n];
        this.l = 0;
        this.e = new ArrayRow[0x20];
        this.h();
        Cache cache0 = new Cache();
        this.j = cache0;
        this.b = new PriorityGoalRow(cache0);
        if(LinearSystem.OPTIMIZED_ENGINE) {
            this.m = new a(cache0);
            return;
        }
        this.m = new ArrayRow(cache0);
    }

    public final SolverVariable a(Type solverVariable$Type0, String s) {
        SolverVariable solverVariable0 = (SolverVariable)this.j.c.acquire();
        if(solverVariable0 == null) {
            solverVariable0 = new SolverVariable(solverVariable$Type0, s);
        }
        else {
            solverVariable0.reset();
        }
        solverVariable0.setType(solverVariable$Type0, s);
        int v = LinearSystem.n;
        if(this.l >= v) {
            LinearSystem.n = v * 2;
            this.k = (SolverVariable[])Arrays.copyOf(this.k, v * 2);
        }
        int v1 = this.l;
        this.l = v1 + 1;
        this.k[v1] = solverVariable0;
        return solverVariable0;
    }

    public void addCenterPoint(ConstraintWidget constraintWidget0, ConstraintWidget constraintWidget1, float f, int v) {
        SolverVariable solverVariable0 = this.createObjectVariable(constraintWidget0.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT));
        SolverVariable solverVariable1 = this.createObjectVariable(constraintWidget0.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP));
        SolverVariable solverVariable2 = this.createObjectVariable(constraintWidget0.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT));
        SolverVariable solverVariable3 = this.createObjectVariable(constraintWidget0.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM));
        SolverVariable solverVariable4 = this.createObjectVariable(constraintWidget1.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT));
        SolverVariable solverVariable5 = this.createObjectVariable(constraintWidget1.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP));
        SolverVariable solverVariable6 = this.createObjectVariable(constraintWidget1.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT));
        SolverVariable solverVariable7 = this.createObjectVariable(constraintWidget1.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM));
        ArrayRow arrayRow0 = this.createRow();
        arrayRow0.createRowWithAngle(solverVariable1, solverVariable3, solverVariable5, solverVariable7, ((float)(Math.sin(f) * ((double)v))));
        this.addConstraint(arrayRow0);
        ArrayRow arrayRow1 = this.createRow();
        arrayRow1.createRowWithAngle(solverVariable0, solverVariable2, solverVariable4, solverVariable6, ((float)(Math.cos(f) * ((double)v))));
        this.addConstraint(arrayRow1);
    }

    public void addCentering(SolverVariable solverVariable0, SolverVariable solverVariable1, int v, float f, SolverVariable solverVariable2, SolverVariable solverVariable3, int v1, int v2) {
        ArrayRow arrayRow0 = this.createRow();
        if(solverVariable1 == solverVariable2) {
            arrayRow0.variables.put(solverVariable0, 1.0f);
            arrayRow0.variables.put(solverVariable3, 1.0f);
            arrayRow0.variables.put(solverVariable1, -2.0f);
        }
        else if(Float.compare(f, 0.5f) == 0) {
            arrayRow0.variables.put(solverVariable0, 1.0f);
            arrayRow0.variables.put(solverVariable1, -1.0f);
            arrayRow0.variables.put(solverVariable2, -1.0f);
            arrayRow0.variables.put(solverVariable3, 1.0f);
            if(v > 0 || v1 > 0) {
                arrayRow0.b = (float)(v1 - v);
            }
        }
        else if(f <= 0.0f) {
            arrayRow0.variables.put(solverVariable0, -1.0f);
            arrayRow0.variables.put(solverVariable1, 1.0f);
            arrayRow0.b = (float)v;
        }
        else if(f >= 1.0f) {
            arrayRow0.variables.put(solverVariable3, -1.0f);
            arrayRow0.variables.put(solverVariable2, 1.0f);
            arrayRow0.b = (float)(-v1);
        }
        else {
            arrayRow0.variables.put(solverVariable0, (1.0f - f) * 1.0f);
            arrayRow0.variables.put(solverVariable1, (1.0f - f) * -1.0f);
            arrayRow0.variables.put(solverVariable2, -1.0f * f);
            arrayRow0.variables.put(solverVariable3, 1.0f * f);
            if(v > 0 || v1 > 0) {
                arrayRow0.b = ((float)v1) * f + ((float)(-v)) * (1.0f - f);
            }
        }
        if(v2 != 8) {
            arrayRow0.addError(this, v2);
        }
        this.addConstraint(arrayRow0);
    }

    public void addConstraint(ArrayRow arrayRow0) {
        int v4;
        boolean z2;
        if(arrayRow0 == null) {
            return;
        }
        Metrics metrics0 = LinearSystem.sMetrics;
        if(metrics0 != null) {
            ++metrics0.constraints;
            if(arrayRow0.d) {
                ++metrics0.simpleconstraints;
            }
        }
        int v = 1;
        if(this.h + 1 >= this.i || this.g + 1 >= this.d) {
            this.e();
        }
        if(arrayRow0.d) {
            v4 = 0;
        }
        else {
            arrayRow0.updateFromSystem(this);
            if(arrayRow0.isEmpty()) {
                return;
            }
            float f = arrayRow0.b;
            if(f < 0.0f) {
                arrayRow0.b = f * -1.0f;
                arrayRow0.variables.invert();
            }
            int v1 = arrayRow0.variables.getCurrentSize();
            SolverVariable solverVariable0 = null;
            float f1 = 0.0f;
            float f2 = 0.0f;
            SolverVariable solverVariable1 = null;
            int v2 = 0;
            boolean z = false;
            boolean z1 = false;
            while(v2 < v1) {
                float f3 = arrayRow0.variables.getVariableValue(v2);
                SolverVariable solverVariable2 = arrayRow0.variables.getVariable(v2);
                if(solverVariable2.e != Type.UNRESTRICTED) {
                    if(solverVariable0 == null && f3 < 0.0f) {
                        if(solverVariable1 == null) {
                            z1 = solverVariable2.usageInRowCount > 1 ? false : true;
                            goto label_55;
                        }
                        else if(f2 > f3) {
                            z1 = solverVariable2.usageInRowCount <= 1;
                        label_55:
                            solverVariable1 = solverVariable2;
                            f2 = f3;
                        }
                        else if(!z1 && solverVariable2.usageInRowCount <= 1) {
                            z1 = true;
                            solverVariable1 = solverVariable2;
                            f2 = f3;
                        }
                    }
                }
                else if(solverVariable0 == null) {
                    z = solverVariable2.usageInRowCount > 1 ? false : true;
                    goto label_38;
                }
                else if(f1 > f3) {
                    z = solverVariable2.usageInRowCount <= 1;
                label_38:
                    solverVariable0 = solverVariable2;
                    f1 = f3;
                }
                else if(!z && solverVariable2.usageInRowCount <= 1) {
                    z = true;
                    solverVariable0 = solverVariable2;
                    f1 = f3;
                }
                ++v2;
            }
            if(solverVariable0 == null) {
                solverVariable0 = solverVariable1;
            }
            if(solverVariable0 == null) {
                z2 = true;
            }
            else {
                arrayRow0.b(solverVariable0);
                z2 = false;
            }
            if(arrayRow0.variables.getCurrentSize() == 0) {
                arrayRow0.d = true;
            }
            if(z2) {
                SolverVariable solverVariable3 = this.createExtraVariable();
                arrayRow0.a = solverVariable3;
                int v3 = this.h;
                this.b(arrayRow0);
                if(this.h == v3 + 1) {
                    this.m.initFromRow(arrayRow0);
                    this.g(this.m);
                    if(solverVariable3.b == -1) {
                        if(arrayRow0.a == solverVariable3) {
                            SolverVariable solverVariable4 = arrayRow0.pickPivot(solverVariable3);
                            if(solverVariable4 != null) {
                                Metrics metrics1 = LinearSystem.sMetrics;
                                if(metrics1 != null) {
                                    ++metrics1.pivots;
                                }
                                arrayRow0.b(solverVariable4);
                            }
                        }
                        if(!arrayRow0.d) {
                            arrayRow0.a.updateReferencesWithNewDefinition(this, arrayRow0);
                        }
                        Cache cache0 = this.j;
                        if(LinearSystem.OPTIMIZED_ENGINE) {
                            cache0.a.release(arrayRow0);
                        }
                        else {
                            cache0.b.release(arrayRow0);
                        }
                        --this.h;
                    }
                }
                else {
                    v = 0;
                }
            }
            else {
                v = 0;
            }
            if(arrayRow0.a != null && (arrayRow0.a.e == Type.UNRESTRICTED || arrayRow0.b >= 0.0f)) {
                v4 = v;
                goto label_106;
            }
            return;
        }
    label_106:
        if(v4 == 0) {
            this.b(arrayRow0);
        }
    }

    public ArrayRow addEquality(SolverVariable solverVariable0, SolverVariable solverVariable1, int v, int v1) {
        if(LinearSystem.USE_BASIC_SYNONYMS && v1 == 8 && solverVariable1.isFinalValue && solverVariable0.b == -1) {
            solverVariable0.setFinalValue(this, solverVariable1.computedValue + ((float)v));
            return null;
        }
        ArrayRow arrayRow0 = this.createRow();
        arrayRow0.createRowEquals(solverVariable0, solverVariable1, v);
        if(v1 != 8) {
            arrayRow0.addError(this, v1);
        }
        this.addConstraint(arrayRow0);
        return arrayRow0;
    }

    public void addEquality(SolverVariable solverVariable0, int v) {
        if(LinearSystem.USE_BASIC_SYNONYMS && solverVariable0.b == -1) {
            solverVariable0.setFinalValue(this, ((float)v));
            for(int v1 = 0; v1 < this.a + 1; ++v1) {
                SolverVariable solverVariable1 = this.j.d[v1];
                if(solverVariable1 != null && solverVariable1.h && solverVariable1.i == solverVariable0.id) {
                    solverVariable1.setFinalValue(this, solverVariable1.j + ((float)v));
                }
            }
            return;
        }
        int v2 = solverVariable0.b;
        if(v2 != -1) {
            ArrayRow arrayRow0 = this.e[v2];
            if(arrayRow0.d) {
                arrayRow0.b = (float)v;
                return;
            }
            if(arrayRow0.variables.getCurrentSize() == 0) {
                arrayRow0.d = true;
                arrayRow0.b = (float)v;
                return;
            }
            ArrayRow arrayRow1 = this.createRow();
            arrayRow1.createRowEquals(solverVariable0, v);
            this.addConstraint(arrayRow1);
            return;
        }
        ArrayRow arrayRow2 = this.createRow();
        arrayRow2.a = solverVariable0;
        solverVariable0.computedValue = (float)v;
        arrayRow2.b = (float)v;
        arrayRow2.d = true;
        this.addConstraint(arrayRow2);
    }

    public void addGreaterBarrier(SolverVariable solverVariable0, SolverVariable solverVariable1, int v, boolean z) {
        ArrayRow arrayRow0 = this.createRow();
        SolverVariable solverVariable2 = this.createSlackVariable();
        solverVariable2.strength = 0;
        arrayRow0.createRowGreaterThan(solverVariable0, solverVariable1, solverVariable2, v);
        this.addConstraint(arrayRow0);
    }

    public void addGreaterThan(SolverVariable solverVariable0, SolverVariable solverVariable1, int v, int v1) {
        ArrayRow arrayRow0 = this.createRow();
        SolverVariable solverVariable2 = this.createSlackVariable();
        solverVariable2.strength = 0;
        arrayRow0.createRowGreaterThan(solverVariable0, solverVariable1, solverVariable2, v);
        if(v1 != 8) {
            float f = arrayRow0.variables.get(solverVariable2);
            SolverVariable solverVariable3 = this.createErrorVariable(v1, null);
            arrayRow0.variables.put(solverVariable3, ((float)(((int)(f * -1.0f)))));
        }
        this.addConstraint(arrayRow0);
    }

    public void addLowerBarrier(SolverVariable solverVariable0, SolverVariable solverVariable1, int v, boolean z) {
        ArrayRow arrayRow0 = this.createRow();
        SolverVariable solverVariable2 = this.createSlackVariable();
        solverVariable2.strength = 0;
        arrayRow0.createRowLowerThan(solverVariable0, solverVariable1, solverVariable2, v);
        this.addConstraint(arrayRow0);
    }

    public void addLowerThan(SolverVariable solverVariable0, SolverVariable solverVariable1, int v, int v1) {
        ArrayRow arrayRow0 = this.createRow();
        SolverVariable solverVariable2 = this.createSlackVariable();
        solverVariable2.strength = 0;
        arrayRow0.createRowLowerThan(solverVariable0, solverVariable1, solverVariable2, v);
        if(v1 != 8) {
            float f = arrayRow0.variables.get(solverVariable2);
            SolverVariable solverVariable3 = this.createErrorVariable(v1, null);
            arrayRow0.variables.put(solverVariable3, ((float)(((int)(f * -1.0f)))));
        }
        this.addConstraint(arrayRow0);
    }

    public void addRatio(SolverVariable solverVariable0, SolverVariable solverVariable1, SolverVariable solverVariable2, SolverVariable solverVariable3, float f, int v) {
        ArrayRow arrayRow0 = this.createRow();
        arrayRow0.createRowDimensionRatio(solverVariable0, solverVariable1, solverVariable2, solverVariable3, f);
        if(v != 8) {
            arrayRow0.addError(this, v);
        }
        this.addConstraint(arrayRow0);
    }

    public void addSynonym(SolverVariable solverVariable0, SolverVariable solverVariable1, int v) {
        if(solverVariable0.b == -1 && v == 0) {
            Cache cache0 = this.j;
            if(solverVariable1.h) {
                solverVariable1 = cache0.d[solverVariable1.i];
            }
            if(solverVariable0.h) {
                SolverVariable solverVariable2 = cache0.d[solverVariable0.i];
                return;
            }
            solverVariable0.setSynonym(this, solverVariable1, 0.0f);
            return;
        }
        this.addEquality(solverVariable0, solverVariable1, v, 8);
    }

    public final void b(ArrayRow arrayRow0) {
        int v4;
        if(!LinearSystem.SIMPLIFY_SYNONYMS || !arrayRow0.d) {
            int v = this.h;
            this.e[v] = arrayRow0;
            arrayRow0.a.b = v;
            this.h = v + 1;
            arrayRow0.a.updateReferencesWithNewDefinition(this, arrayRow0);
        }
        else {
            arrayRow0.a.setFinalValue(this, arrayRow0.b);
        }
        if(LinearSystem.SIMPLIFY_SYNONYMS && this.hasSimpleDefinition) {
            for(int v1 = 0; v1 < this.h; ++v1) {
                if(this.e[v1] == null) {
                    System.out.println("WTF");
                }
                ArrayRow arrayRow1 = this.e[v1];
                if(arrayRow1 != null && arrayRow1.d) {
                    arrayRow1.a.setFinalValue(this, arrayRow1.b);
                    Cache cache0 = this.j;
                    if(LinearSystem.OPTIMIZED_ENGINE) {
                        cache0.a.release(arrayRow1);
                    }
                    else {
                        cache0.b.release(arrayRow1);
                    }
                    this.e[v1] = null;
                    int v2 = v1 + 1;
                    int v3 = v2;
                    while(true) {
                        v4 = this.h;
                        if(v2 >= v4) {
                            break;
                        }
                        ArrayRow[] arr_arrayRow = this.e;
                        ArrayRow arrayRow2 = arr_arrayRow[v2];
                        arr_arrayRow[v2 - 1] = arrayRow2;
                        SolverVariable solverVariable0 = arrayRow2.a;
                        if(solverVariable0.b == v2) {
                            solverVariable0.b = v2 - 1;
                        }
                        v3 = v2;
                        ++v2;
                    }
                    if(v3 < v4) {
                        this.e[v3] = null;
                    }
                    this.h = v4 - 1;
                    --v1;
                }
            }
            this.hasSimpleDefinition = false;
        }
    }

    public final void c() {
        for(int v = 0; v < this.h; ++v) {
            ArrayRow arrayRow0 = this.e[v];
            arrayRow0.a.computedValue = arrayRow0.b;
        }
    }

    public SolverVariable createErrorVariable(int v, String s) {
        Metrics metrics0 = LinearSystem.sMetrics;
        if(metrics0 != null) {
            ++metrics0.errors;
        }
        if(this.g + 1 >= this.d) {
            this.e();
        }
        SolverVariable solverVariable0 = this.a(Type.ERROR, s);
        int v1 = this.a + 1;
        this.a = v1;
        ++this.g;
        solverVariable0.id = v1;
        solverVariable0.strength = v;
        this.j.d[v1] = solverVariable0;
        this.b.addError(solverVariable0);
        return solverVariable0;
    }

    public SolverVariable createExtraVariable() {
        Metrics metrics0 = LinearSystem.sMetrics;
        if(metrics0 != null) {
            ++metrics0.extravariables;
        }
        if(this.g + 1 >= this.d) {
            this.e();
        }
        SolverVariable solverVariable0 = this.a(Type.SLACK, null);
        int v = this.a + 1;
        this.a = v;
        ++this.g;
        solverVariable0.id = v;
        this.j.d[v] = solverVariable0;
        return solverVariable0;
    }

    public SolverVariable createObjectVariable(Object object0) {
        SolverVariable solverVariable0 = null;
        if(object0 == null) {
            return null;
        }
        if(this.g + 1 >= this.d) {
            this.e();
        }
        if(object0 instanceof ConstraintAnchor) {
            solverVariable0 = ((ConstraintAnchor)object0).getSolverVariable();
            Cache cache0 = this.j;
            if(solverVariable0 == null) {
                ((ConstraintAnchor)object0).resetSolverVariable(cache0);
                solverVariable0 = ((ConstraintAnchor)object0).getSolverVariable();
            }
            int v = solverVariable0.id;
            if(v == -1 || v > this.a || cache0.d[v] == null) {
                if(v != -1) {
                    solverVariable0.reset();
                }
                int v1 = this.a + 1;
                this.a = v1;
                ++this.g;
                solverVariable0.id = v1;
                solverVariable0.e = Type.UNRESTRICTED;
                cache0.d[v1] = solverVariable0;
            }
        }
        return solverVariable0;
    }

    public ArrayRow createRow() {
        ArrayRow arrayRow0;
        Cache cache0 = this.j;
        if(LinearSystem.OPTIMIZED_ENGINE) {
            arrayRow0 = (ArrayRow)cache0.a.acquire();
            if(arrayRow0 == null) {
                arrayRow0 = new a(cache0);
                ++LinearSystem.OPTIMIZED_ARRAY_ROW_CREATION;
                return arrayRow0;
            }
            arrayRow0.reset();
            return arrayRow0;
        }
        arrayRow0 = (ArrayRow)cache0.b.acquire();
        if(arrayRow0 == null) {
            arrayRow0 = new ArrayRow(cache0);
            ++LinearSystem.ARRAY_ROW_CREATION;
            return arrayRow0;
        }
        arrayRow0.reset();
        return arrayRow0;
    }

    public static ArrayRow createRowDimensionPercent(LinearSystem linearSystem0, SolverVariable solverVariable0, SolverVariable solverVariable1, float f) {
        ArrayRow arrayRow0 = linearSystem0.createRow();
        arrayRow0.variables.put(solverVariable0, -1.0f);
        arrayRow0.variables.put(solverVariable1, f);
        return arrayRow0;
    }

    public SolverVariable createSlackVariable() {
        Metrics metrics0 = LinearSystem.sMetrics;
        if(metrics0 != null) {
            ++metrics0.slackvariables;
        }
        if(this.g + 1 >= this.d) {
            this.e();
        }
        SolverVariable solverVariable0 = this.a(Type.SLACK, null);
        int v = this.a + 1;
        this.a = v;
        ++this.g;
        solverVariable0.id = v;
        this.j.d[v] = solverVariable0;
        return solverVariable0;
    }

    public final void d() {
        StringBuilder stringBuilder0 = new StringBuilder("Display Rows (");
        stringBuilder0.append(this.h);
        stringBuilder0.append("x");
        String s = wb.a.c(this.g, ")\n", stringBuilder0);
        System.out.println(s);
    }

    public void displayReadableRows() {
        Cache cache0;
        this.d();
        StringBuilder stringBuilder0 = new StringBuilder(" num vars ");
        String s = wb.a.c(this.a, "\n", stringBuilder0);
        for(int v1 = 0; true; ++v1) {
            cache0 = this.j;
            if(v1 >= this.a + 1) {
                break;
            }
            SolverVariable solverVariable0 = cache0.d[v1];
            if(solverVariable0 != null && solverVariable0.isFinalValue) {
                StringBuilder stringBuilder1 = new StringBuilder();
                stringBuilder1.append(s);
                stringBuilder1.append(" $[");
                stringBuilder1.append(v1);
                stringBuilder1.append("] => ");
                stringBuilder1.append(solverVariable0);
                stringBuilder1.append(" = ");
                s = androidx.room.a.h(solverVariable0.computedValue, "\n", stringBuilder1);
            }
        }
        String s1 = s + "\n";
        for(int v2 = 0; v2 < this.a + 1; ++v2) {
            SolverVariable[] arr_solverVariable = cache0.d;
            SolverVariable solverVariable1 = arr_solverVariable[v2];
            if(solverVariable1 != null && solverVariable1.h) {
                SolverVariable solverVariable2 = arr_solverVariable[solverVariable1.i];
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(s1);
                stringBuilder2.append(" ~[");
                stringBuilder2.append(v2);
                stringBuilder2.append("] => ");
                stringBuilder2.append(solverVariable1);
                stringBuilder2.append(" = ");
                stringBuilder2.append(solverVariable2);
                stringBuilder2.append(" + ");
                s1 = androidx.room.a.h(solverVariable1.j, "\n", stringBuilder2);
            }
        }
        String s2 = s1 + "\n\n #  ";
        for(int v = 0; v < this.h; ++v) {
            StringBuilder stringBuilder3 = b.t(s2);
            stringBuilder3.append(this.e[v].c());
            s2 = stringBuilder3.toString() + "\n #  ";
        }
        PriorityGoalRow priorityGoalRow0 = this.b;
        if(priorityGoalRow0 != null) {
            s2 = s2 + "Goal: " + priorityGoalRow0 + "\n";
        }
        System.out.println(s2);
    }

    public void displayVariablesReadableRows() {
        this.d();
        String s = "";
        for(int v = 0; v < this.h; ++v) {
            if(this.e[v].a.e == Type.UNRESTRICTED) {
                StringBuilder stringBuilder0 = b.t(s);
                stringBuilder0.append(this.e[v].c());
                s = stringBuilder0.toString() + "\n";
            }
        }
        StringBuilder stringBuilder1 = b.t(s);
        stringBuilder1.append(this.b);
        stringBuilder1.append("\n");
        System.out.println(stringBuilder1.toString());
    }

    public final void e() {
        int v = this.c * 2;
        this.c = v;
        this.e = (ArrayRow[])Arrays.copyOf(this.e, v);
        this.j.d = (SolverVariable[])Arrays.copyOf(this.j.d, this.c);
        int v1 = this.c;
        this.f = new boolean[v1];
        this.d = v1;
        this.i = v1;
        Metrics metrics0 = LinearSystem.sMetrics;
        if(metrics0 != null) {
            ++metrics0.tableSizeIncrease;
            metrics0.maxTableSize = Math.max(metrics0.maxTableSize, v1);
            LinearSystem.sMetrics.lastTableSize = LinearSystem.sMetrics.maxTableSize;
        }
    }

    public final void f(PriorityGoalRow priorityGoalRow0) {
        Cache cache0;
        Metrics metrics0 = LinearSystem.sMetrics;
        if(metrics0 != null) {
            ++metrics0.minimizeGoal;
            metrics0.maxVariables = Math.max(metrics0.maxVariables, this.g);
            LinearSystem.sMetrics.maxRows = Math.max(LinearSystem.sMetrics.maxRows, this.h);
        }
        for(int v = 0; v < this.h; ++v) {
            ArrayRow arrayRow0 = this.e[v];
            if(arrayRow0.a.e != Type.UNRESTRICTED && arrayRow0.b < 0.0f) {
                int v1 = 0;
                boolean z = false;
                while(!z) {
                    Metrics metrics1 = LinearSystem.sMetrics;
                    if(metrics1 != null) {
                        ++metrics1.bfs;
                    }
                    ++v1;
                    float f = 3.402823E+38f;
                    int v3 = -1;
                    int v4 = -1;
                    int v5 = 0;
                    for(int v2 = 0; true; ++v2) {
                        cache0 = this.j;
                        if(v2 >= this.h) {
                            break;
                        }
                        ArrayRow arrayRow1 = this.e[v2];
                        if(arrayRow1.a.e != Type.UNRESTRICTED && !arrayRow1.d && arrayRow1.b < 0.0f) {
                            if(LinearSystem.SKIP_COLUMNS) {
                                int v6 = arrayRow1.variables.getCurrentSize();
                                for(int v7 = 0; v7 < v6; ++v7) {
                                    SolverVariable solverVariable0 = arrayRow1.variables.getVariable(v7);
                                    float f1 = arrayRow1.variables.get(solverVariable0);
                                    if(f1 > 0.0f) {
                                        for(int v8 = 0; v8 < 9; ++v8) {
                                            float f2 = solverVariable0.c[v8] / f1;
                                            if(f2 < f && v8 == v5 || v8 > v5) {
                                                v5 = v8;
                                                v4 = solverVariable0.id;
                                                v3 = v2;
                                                f = f2;
                                            }
                                        }
                                    }
                                }
                            }
                            else {
                                for(int v9 = 1; v9 < this.g; ++v9) {
                                    SolverVariable solverVariable1 = cache0.d[v9];
                                    float f3 = arrayRow1.variables.get(solverVariable1);
                                    if(f3 > 0.0f) {
                                        for(int v10 = 0; v10 < 9; ++v10) {
                                            float f4 = solverVariable1.c[v10] / f3;
                                            if(f4 < f && v10 == v5 || v10 > v5) {
                                                v4 = v9;
                                                f = f4;
                                                v5 = v10;
                                                v3 = v2;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if(v3 == -1) {
                        z = true;
                    }
                    else {
                        ArrayRow arrayRow2 = this.e[v3];
                        arrayRow2.a.b = -1;
                        Metrics metrics2 = LinearSystem.sMetrics;
                        if(metrics2 != null) {
                            ++metrics2.pivots;
                        }
                        arrayRow2.b(cache0.d[v4]);
                        arrayRow2.a.b = v3;
                        arrayRow2.a.updateReferencesWithNewDefinition(this, arrayRow2);
                    }
                    if(v1 > this.g / 2) {
                        z = true;
                    }
                }
                break;
            }
        }
        this.g(priorityGoalRow0);
        this.c();
    }

    public void fillMetrics(Metrics metrics0) {
        LinearSystem.sMetrics = metrics0;
    }

    public final void g(ArrayRow arrayRow0) {
        Metrics metrics0 = LinearSystem.sMetrics;
        if(metrics0 != null) {
            ++metrics0.optimize;
        }
        for(int v = 0; v < this.g; ++v) {
            this.f[v] = false;
        }
        int v1 = 0;
        boolean z = false;
        while(!z) {
            Metrics metrics1 = LinearSystem.sMetrics;
            if(metrics1 != null) {
                ++metrics1.iterations;
            }
            ++v1;
            if(v1 >= this.g * 2) {
                return;
            }
            if(arrayRow0.getKey() != null) {
                boolean[] arr_z = this.f;
                arr_z[arrayRow0.getKey().id] = true;
            }
            SolverVariable solverVariable0 = arrayRow0.getPivotCandidate(this, this.f);
            if(solverVariable0 != null) {
                boolean[] arr_z1 = this.f;
                int v2 = solverVariable0.id;
                if(arr_z1[v2]) {
                    return;
                }
                arr_z1[v2] = true;
            }
            if(solverVariable0 == null) {
                z = true;
            }
            else {
                float f = 3.402823E+38f;
                int v4 = -1;
                for(int v3 = 0; v3 < this.h; ++v3) {
                    ArrayRow arrayRow1 = this.e[v3];
                    if(arrayRow1.a.e != Type.UNRESTRICTED && !arrayRow1.d && arrayRow1.variables.contains(solverVariable0)) {
                        float f1 = arrayRow1.variables.get(solverVariable0);
                        if(f1 < 0.0f) {
                            float f2 = -arrayRow1.b / f1;
                            if(f2 < f) {
                                v4 = v3;
                                f = f2;
                            }
                        }
                    }
                }
                if(v4 <= -1) {
                    continue;
                }
                ArrayRow arrayRow2 = this.e[v4];
                arrayRow2.a.b = -1;
                Metrics metrics2 = LinearSystem.sMetrics;
                if(metrics2 != null) {
                    ++metrics2.pivots;
                }
                arrayRow2.b(solverVariable0);
                arrayRow2.a.b = v4;
                arrayRow2.a.updateReferencesWithNewDefinition(this, arrayRow2);
            }
        }
    }

    public Cache getCache() {
        return this.j;
    }

    public int getMemoryUsed() {
        int v1 = 0;
        for(int v = 0; v < this.h; ++v) {
            ArrayRow arrayRow0 = this.e[v];
            if(arrayRow0 != null) {
                int v2 = arrayRow0.a == null ? 0 : 4;
                v1 += arrayRow0.variables.sizeInBytes() + (v2 + 8);
            }
        }
        return v1;
    }

    public static Metrics getMetrics() {
        return LinearSystem.sMetrics;
    }

    public int getNumEquations() {
        return this.h;
    }

    public int getNumVariables() {
        return this.a;
    }

    public int getObjectVariableValue(Object object0) {
        SolverVariable solverVariable0 = ((ConstraintAnchor)object0).getSolverVariable();
        return solverVariable0 == null ? 0 : ((int)(solverVariable0.computedValue + 0.5f));
    }

    public final void h() {
        Cache cache0 = this.j;
        int v = 0;
        if(LinearSystem.OPTIMIZED_ENGINE) {
            while(v < this.h) {
                ArrayRow arrayRow0 = this.e[v];
                if(arrayRow0 != null) {
                    cache0.a.release(arrayRow0);
                }
                this.e[v] = null;
                ++v;
            }
            return;
        }
        while(v < this.h) {
            ArrayRow arrayRow1 = this.e[v];
            if(arrayRow1 != null) {
                cache0.b.release(arrayRow1);
            }
            this.e[v] = null;
            ++v;
        }
    }

    public void minimize() throws Exception {
        Metrics metrics0 = LinearSystem.sMetrics;
        if(metrics0 != null) {
            ++metrics0.minimize;
        }
        PriorityGoalRow priorityGoalRow0 = this.b;
        if(priorityGoalRow0.isEmpty()) {
            this.c();
            return;
        }
        if(!this.graphOptimizer && !this.newgraphOptimizer) {
            this.f(priorityGoalRow0);
            return;
        }
        Metrics metrics1 = LinearSystem.sMetrics;
        if(metrics1 != null) {
            ++metrics1.graphOptimizer;
        }
        for(int v = 0; v < this.h; ++v) {
            if(!this.e[v].d) {
                this.f(priorityGoalRow0);
                return;
            }
        }
        Metrics metrics2 = LinearSystem.sMetrics;
        if(metrics2 != null) {
            ++metrics2.fullySolved;
        }
        this.c();
    }

    public void removeRow(ArrayRow arrayRow0) {
        int v1;
        if(arrayRow0.d) {
            SolverVariable solverVariable0 = arrayRow0.a;
            if(solverVariable0 != null) {
                int v = solverVariable0.b;
                if(v != -1) {
                    while(true) {
                        v1 = this.h - 1;
                        if(v >= v1) {
                            break;
                        }
                        ArrayRow[] arr_arrayRow = this.e;
                        ArrayRow arrayRow1 = arr_arrayRow[v + 1];
                        SolverVariable solverVariable1 = arrayRow1.a;
                        if(solverVariable1.b == v + 1) {
                            solverVariable1.b = v;
                        }
                        arr_arrayRow[v] = arrayRow1;
                        ++v;
                    }
                    this.h = v1;
                }
                SolverVariable solverVariable2 = arrayRow0.a;
                if(!solverVariable2.isFinalValue) {
                    solverVariable2.setFinalValue(this, arrayRow0.b);
                }
                Cache cache0 = this.j;
                if(LinearSystem.OPTIMIZED_ENGINE) {
                    cache0.a.release(arrayRow0);
                    return;
                }
                cache0.b.release(arrayRow0);
            }
        }
    }

    public void reset() {
        Cache cache0;
        for(int v = 0; true; ++v) {
            cache0 = this.j;
            SolverVariable[] arr_solverVariable = cache0.d;
            if(v >= arr_solverVariable.length) {
                break;
            }
            SolverVariable solverVariable0 = arr_solverVariable[v];
            if(solverVariable0 != null) {
                solverVariable0.reset();
            }
        }
        cache0.c.releaseAll(this.k, this.l);
        this.l = 0;
        Arrays.fill(cache0.d, null);
        this.a = 0;
        this.b.clear();
        this.g = 1;
        for(int v1 = 0; v1 < this.h; ++v1) {
            ArrayRow arrayRow0 = this.e[v1];
        }
        this.h();
        this.h = 0;
        if(LinearSystem.OPTIMIZED_ENGINE) {
            this.m = new a(cache0);
            return;
        }
        this.m = new ArrayRow(cache0);
    }
}

