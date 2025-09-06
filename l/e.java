package l;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.StateSet;
import androidx.appcompat.graphics.drawable.StateListDrawableCompat;
import androidx.core.graphics.drawable.DrawableCompat;

public class e extends Drawable.ConstantState {
    public int A;
    public boolean B;
    public ColorFilter C;
    public boolean D;
    public ColorStateList E;
    public PorterDuff.Mode F;
    public boolean G;
    public boolean H;
    public int[][] I;
    public final StateListDrawableCompat a;
    public Resources b;
    public int c;
    public int d;
    public int e;
    public SparseArray f;
    public Drawable[] g;
    public int h;
    public boolean i;
    public boolean j;
    public Rect k;
    public boolean l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public int q;
    public boolean r;
    public int s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public int y;
    public int z;

    public e(e e0, StateListDrawableCompat stateListDrawableCompat0, Resources resources0) {
        Resources resources1;
        this.i = false;
        this.l = false;
        this.x = true;
        this.z = 0;
        this.A = 0;
        this.a = stateListDrawableCompat0;
        Rect rect0 = null;
        if(resources0 == null) {
            resources1 = e0 == null ? null : e0.b;
        }
        else {
            resources1 = resources0;
        }
        this.b = resources1;
        int v1 = e0 == null ? 0 : e0.c;
        if(resources0 != null) {
            v1 = resources0.getDisplayMetrics().densityDpi;
        }
        if(v1 == 0) {
            v1 = 0xA0;
        }
        this.c = v1;
        if(e0 == null) {
            this.g = new Drawable[10];
            this.h = 0;
        }
        else {
            this.d = e0.d;
            this.e = e0.e;
            this.v = true;
            this.w = true;
            this.i = e0.i;
            this.l = e0.l;
            this.x = e0.x;
            this.y = e0.y;
            this.z = e0.z;
            this.A = e0.A;
            this.B = e0.B;
            this.C = e0.C;
            this.D = e0.D;
            this.E = e0.E;
            this.F = e0.F;
            this.G = e0.G;
            this.H = e0.H;
            if(e0.c == v1) {
                if(e0.j) {
                    if(e0.k != null) {
                        rect0 = new Rect(e0.k);
                    }
                    this.k = rect0;
                    this.j = true;
                }
                if(e0.m) {
                    this.n = e0.n;
                    this.o = e0.o;
                    this.p = e0.p;
                    this.q = e0.q;
                    this.m = true;
                }
            }
            if(e0.r) {
                this.s = e0.s;
                this.r = true;
            }
            if(e0.t) {
                this.u = e0.u;
                this.t = true;
            }
            Drawable[] arr_drawable = e0.g;
            this.g = new Drawable[arr_drawable.length];
            this.h = e0.h;
            SparseArray sparseArray0 = e0.f;
            this.f = sparseArray0 == null ? new SparseArray(this.h) : sparseArray0.clone();
            int v2 = this.h;
            for(int v = 0; v < v2; ++v) {
                Drawable drawable0 = arr_drawable[v];
                if(drawable0 != null) {
                    Drawable.ConstantState drawable$ConstantState0 = drawable0.getConstantState();
                    if(drawable$ConstantState0 == null) {
                        this.g[v] = arr_drawable[v];
                    }
                    else {
                        this.f.put(v, drawable$ConstantState0);
                    }
                }
            }
        }
        if(e0 != null) {
            this.I = e0.I;
            return;
        }
        this.I = new int[this.g.length][];
    }

    public final int a(Drawable drawable0) {
        int v = this.h;
        Drawable[] arr_drawable = this.g;
        if(v >= arr_drawable.length) {
            Drawable[] arr_drawable1 = new Drawable[v + 10];
            System.arraycopy(arr_drawable, 0, arr_drawable1, 0, v);
            this.g = arr_drawable1;
            int[][] arr2_v = new int[v + 10][];
            System.arraycopy(this.I, 0, arr2_v, 0, v);
            this.I = arr2_v;
        }
        drawable0.mutate();
        drawable0.setVisible(false, true);
        drawable0.setCallback(this.a);
        this.g[v] = drawable0;
        ++this.h;
        int v1 = this.e;
        this.e = drawable0.getChangingConfigurations() | v1;
        this.r = false;
        this.t = false;
        this.k = null;
        this.j = false;
        this.m = false;
        this.v = false;
        return v;
    }

    public final void b() {
        this.m = true;
        this.c();
        int v = this.h;
        Drawable[] arr_drawable = this.g;
        this.o = -1;
        this.n = -1;
        this.q = 0;
        this.p = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            Drawable drawable0 = arr_drawable[v1];
            int v2 = drawable0.getIntrinsicWidth();
            if(v2 > this.n) {
                this.n = v2;
            }
            int v3 = drawable0.getIntrinsicHeight();
            if(v3 > this.o) {
                this.o = v3;
            }
            int v4 = drawable0.getMinimumWidth();
            if(v4 > this.p) {
                this.p = v4;
            }
            int v5 = drawable0.getMinimumHeight();
            if(v5 > this.q) {
                this.q = v5;
            }
        }
    }

    public final void c() {
        SparseArray sparseArray0 = this.f;
        if(sparseArray0 != null) {
            int v = sparseArray0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = this.f.keyAt(v1);
                Drawable.ConstantState drawable$ConstantState0 = (Drawable.ConstantState)this.f.valueAt(v1);
                Drawable[] arr_drawable = this.g;
                Drawable drawable0 = drawable$ConstantState0.newDrawable(this.b);
                DrawableCompat.setLayoutDirection(drawable0, this.y);
                Drawable drawable1 = drawable0.mutate();
                drawable1.setCallback(this.a);
                arr_drawable[v2] = drawable1;
            }
            this.f = null;
        }
    }

    @Override  // android.graphics.drawable.Drawable$ConstantState
    public final boolean canApplyTheme() {
        int v = this.h;
        Drawable[] arr_drawable = this.g;
        for(int v1 = 0; v1 < v; ++v1) {
            Drawable drawable0 = arr_drawable[v1];
            if(drawable0 == null) {
                Drawable.ConstantState drawable$ConstantState0 = (Drawable.ConstantState)this.f.get(v1);
                if(drawable$ConstantState0 != null && drawable$ConstantState0.canApplyTheme()) {
                    return true;
                }
            }
            else if(DrawableCompat.canApplyTheme(drawable0)) {
                return true;
            }
        }
        return false;
    }

    public final Drawable d(int v) {
        Drawable drawable0 = this.g[v];
        if(drawable0 != null) {
            return drawable0;
        }
        SparseArray sparseArray0 = this.f;
        if(sparseArray0 != null) {
            int v1 = sparseArray0.indexOfKey(v);
            if(v1 >= 0) {
                Drawable drawable1 = ((Drawable.ConstantState)this.f.valueAt(v1)).newDrawable(this.b);
                DrawableCompat.setLayoutDirection(drawable1, this.y);
                Drawable drawable2 = drawable1.mutate();
                drawable2.setCallback(this.a);
                this.g[v] = drawable2;
                this.f.removeAt(v1);
                if(this.f.size() == 0) {
                    this.f = null;
                }
                return drawable2;
            }
        }
        return null;
    }

    public final int e(int[] arr_v) {
        int[][] arr2_v = this.I;
        int v = this.h;
        for(int v1 = 0; v1 < v; ++v1) {
            if(StateSet.stateSetMatches(arr2_v[v1], arr_v)) {
                return v1;
            }
        }
        return -1;
    }

    public void f() {
        int[][] arr2_v = this.I;
        int[][] arr2_v1 = new int[arr2_v.length][];
        for(int v = arr2_v.length - 1; v >= 0; --v) {
            int[] arr_v = this.I[v];
            arr2_v1[v] = arr_v == null ? null : ((int[])arr_v.clone());
        }
        this.I = arr2_v1;
    }

    @Override  // android.graphics.drawable.Drawable$ConstantState
    public final int getChangingConfigurations() {
        return this.d | this.e;
    }

    @Override  // android.graphics.drawable.Drawable$ConstantState
    public Drawable newDrawable() {
        return new StateListDrawableCompat(this, null);
    }

    @Override  // android.graphics.drawable.Drawable$ConstantState
    public Drawable newDrawable(Resources resources0) {
        return new StateListDrawableCompat(this, resources0);
    }
}

