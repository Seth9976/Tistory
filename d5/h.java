package d5;

import android.graphics.Matrix;
import androidx.collection.ArrayMap;
import java.util.ArrayList;

public final class h extends i {
    public final Matrix a;
    public final ArrayList b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public final Matrix j;
    public String k;

    public h() {
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = new Matrix();
        this.k = null;
    }

    public h(h h0, ArrayMap arrayMap0) {
        g g0;
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        Matrix matrix0 = new Matrix();
        this.j = matrix0;
        this.c = h0.c;
        this.d = h0.d;
        this.e = h0.e;
        this.f = h0.f;
        this.g = h0.g;
        this.h = h0.h;
        this.i = h0.i;
        String s = h0.k;
        this.k = s;
        if(s != null) {
            arrayMap0.put(s, this);
        }
        matrix0.set(h0.j);
        ArrayList arrayList0 = h0.b;
        for(int v = 0; v < arrayList0.size(); ++v) {
            Object object0 = arrayList0.get(v);
            if(object0 instanceof h) {
                h h1 = new h(((h)object0), arrayMap0);
                this.b.add(h1);
            }
            else {
                if(object0 instanceof g) {
                    g0 = new g(((g)object0));  // 初始化器: Ld5/j;-><init>(Ld5/j;)V
                    g0.d = ((g)object0).d;
                    g0.e = ((g)object0).e;
                    g0.g = ((g)object0).g;
                    g0.f = ((g)object0).f;
                    g0.c = ((g)object0).c;
                    g0.h = ((g)object0).h;
                    g0.i = ((g)object0).i;
                    g0.j = ((g)object0).j;
                    g0.k = ((g)object0).k;
                    g0.l = ((g)object0).l;
                    g0.m = ((g)object0).m;
                    g0.n = ((g)object0).n;
                }
                else {
                    if(!(object0 instanceof f)) {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    g0 = new f(((f)object0));  // 初始化器: Ld5/j;-><init>(Ld5/j;)V
                }
                this.b.add(g0);
                String s1 = g0.b;
                if(s1 != null) {
                    arrayMap0.put(s1, g0);
                }
            }
        }
    }

    @Override  // d5.i
    public final boolean a() {
        for(int v = 0; true; ++v) {
            ArrayList arrayList0 = this.b;
            if(v >= arrayList0.size()) {
                break;
            }
            if(((i)arrayList0.get(v)).a()) {
                return true;
            }
        }
        return false;
    }

    @Override  // d5.i
    public final boolean b(int[] arr_v) {
        boolean z = false;
        for(int v = 0; true; ++v) {
            ArrayList arrayList0 = this.b;
            if(v >= arrayList0.size()) {
                break;
            }
            z |= ((i)arrayList0.get(v)).b(arr_v);
        }
        return z;
    }

    public final void c() {
        this.j.reset();
        this.j.postTranslate(-this.d, -this.e);
        this.j.postScale(this.f, this.g);
        this.j.postRotate(this.c, 0.0f, 0.0f);
        this.j.postTranslate(this.h + this.d, this.i + this.e);
    }

    public String getGroupName() {
        return this.k;
    }

    public Matrix getLocalMatrix() {
        return this.j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.c;
    }

    public float getScaleX() {
        return this.f;
    }

    public float getScaleY() {
        return this.g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.i;
    }

    public void setPivotX(float f) {
        if(f != this.d) {
            this.d = f;
            this.c();
        }
    }

    public void setPivotY(float f) {
        if(f != this.e) {
            this.e = f;
            this.c();
        }
    }

    public void setRotation(float f) {
        if(f != this.c) {
            this.c = f;
            this.c();
        }
    }

    public void setScaleX(float f) {
        if(f != this.f) {
            this.f = f;
            this.c();
        }
    }

    public void setScaleY(float f) {
        if(f != this.g) {
            this.g = f;
            this.c();
        }
    }

    public void setTranslateX(float f) {
        if(f != this.h) {
            this.h = f;
            this.c();
        }
    }

    public void setTranslateY(float f) {
        if(f != this.i) {
            this.i = f;
            this.c();
        }
    }
}

