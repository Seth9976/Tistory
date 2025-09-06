package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.view.animation.Interpolator;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import java.util.ArrayList;

public final class t {
    public final int a;
    public final int b;
    public final MotionController c;
    public final int d;
    public final KeyCache e;
    public final ViewTransitionController f;
    public final Interpolator g;
    public boolean h;
    public float i;
    public float j;
    public long k;
    public final Rect l;
    public final boolean m;

    public t(ViewTransitionController viewTransitionController0, MotionController motionController0, int v, int v1, int v2, Interpolator interpolator0, int v3, int v4) {
        this.e = new KeyCache();
        this.h = false;
        this.l = new Rect();
        this.m = false;
        this.f = viewTransitionController0;
        this.c = motionController0;
        this.d = v1;
        this.k = System.nanoTime();
        if(viewTransitionController0.e == null) {
            viewTransitionController0.e = new ArrayList();
        }
        viewTransitionController0.e.add(this);
        this.g = interpolator0;
        this.a = v3;
        this.b = v4;
        if(v2 == 3) {
            this.m = true;
        }
        this.j = v == 0 ? 3.402823E+38f : 1.0f / ((float)v);
        this.a();
    }

    public final void a() {
        ViewTransitionController viewTransitionController0 = this.f;
        Interpolator interpolator0 = this.g;
        MotionController motionController0 = this.c;
        int v = this.b;
        int v1 = this.a;
        if(this.h) {
            long v2 = System.nanoTime();
            long v3 = v2 - this.k;
            this.k = v2;
            float f = this.i - ((float)(((double)v3) * 0.000001)) * this.j;
            this.i = f;
            if(f < 0.0f) {
                this.i = 0.0f;
            }
            float f1 = interpolator0 == null ? this.i : interpolator0.getInterpolation(this.i);
            boolean z = motionController0.f(motionController0.b, f1, v2, this.e);
            if(this.i <= 0.0f) {
                if(v1 != -1) {
                    motionController0.getView().setTag(v1, System.nanoTime());
                }
                if(v != -1) {
                    motionController0.getView().setTag(v, null);
                }
                viewTransitionController0.f.add(this);
            }
            if(this.i > 0.0f || z) {
                viewTransitionController0.a.invalidate();
            }
        }
        else {
            long v4 = System.nanoTime();
            long v5 = v4 - this.k;
            this.k = v4;
            float f2 = ((float)(((double)v5) * 0.000001)) * this.j + this.i;
            this.i = f2;
            if(f2 >= 1.0f) {
                this.i = 1.0f;
            }
            float f3 = interpolator0 == null ? this.i : interpolator0.getInterpolation(this.i);
            boolean z1 = motionController0.f(motionController0.b, f3, v4, this.e);
            if(this.i >= 1.0f) {
                if(v1 != -1) {
                    motionController0.getView().setTag(v1, System.nanoTime());
                }
                if(v != -1) {
                    motionController0.getView().setTag(v, null);
                }
                if(!this.m) {
                    viewTransitionController0.f.add(this);
                }
            }
            if(this.i < 1.0f || z1) {
                viewTransitionController0.a.invalidate();
            }
        }
    }

    public final void b() {
        this.h = true;
        int v = this.d;
        if(v != -1) {
            this.j = v == 0 ? 3.402823E+38f : 1.0f / ((float)v);
        }
        this.f.a.invalidate();
        this.k = System.nanoTime();
    }
}

