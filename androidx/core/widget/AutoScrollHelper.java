package androidx.core.widget;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import p3.a;

public abstract class AutoScrollHelper implements View.OnTouchListener {
    public static final int EDGE_TYPE_INSIDE = 0;
    public static final int EDGE_TYPE_INSIDE_EXTEND = 1;
    public static final int EDGE_TYPE_OUTSIDE = 2;
    public static final float NO_MAX = 3.402823E+38f;
    public static final float NO_MIN;
    public static final float RELATIVE_UNSPECIFIED;
    public final a a;
    public final AccelerateInterpolator b;
    public final View c;
    public androidx.appcompat.widget.a d;
    public final float[] e;
    public final float[] f;
    public int g;
    public int h;
    public final float[] i;
    public final float[] j;
    public final float[] k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public static final int r;

    static {
        AutoScrollHelper.r = 100;
    }

    public AutoScrollHelper(@NonNull View view0) {
        a a0 = new a();  // 初始化器: Ljava/lang/Object;-><init>()V
        a0.e = 0x8000000000000000L;
        a0.g = -1L;
        a0.f = 0L;
        this.a = a0;
        this.b = new AccelerateInterpolator();
        this.e = new float[]{0.0f, 0.0f};
        this.f = new float[]{3.402823E+38f, 3.402823E+38f};
        this.i = new float[]{0.0f, 0.0f};
        this.j = new float[]{0.0f, 0.0f};
        this.k = new float[]{3.402823E+38f, 3.402823E+38f};
        this.c = view0;
        DisplayMetrics displayMetrics0 = Resources.getSystem().getDisplayMetrics();
        int v = (int)(displayMetrics0.density * 315.0f + 0.5f);
        float f = (float)(((int)(1575.0f * displayMetrics0.density + 0.5f)));
        this.setMaximumVelocity(f, f);
        this.setMinimumVelocity(((float)v), ((float)v));
        this.setEdgeType(1);
        this.setMaximumEdges(3.402823E+38f, 3.402823E+38f);
        this.setRelativeEdges(0.2f, 0.2f);
        this.setRelativeVelocity(1.0f, 1.0f);
        this.setActivationDelay(AutoScrollHelper.r);
        this.setRampUpDuration(500);
        this.setRampDownDuration(500);
    }

    public final float a(float f, float f1, float f2, int v) {
        float f5;
        float f3 = AutoScrollHelper.b(this.e[v] * f1, 0.0f, this.f[v]);
        float f4 = this.c(f1 - f, f3) - this.c(f, f3);
        AccelerateInterpolator accelerateInterpolator0 = this.b;
        if(Float.compare(f4, 0.0f) < 0) {
            f5 = AutoScrollHelper.b(-accelerateInterpolator0.getInterpolation(-f4), -1.0f, 1.0f);
        }
        else {
            f5 = f4 > 0.0f ? AutoScrollHelper.b(accelerateInterpolator0.getInterpolation(f4), -1.0f, 1.0f) : 0.0f;
        }
        int v1 = Float.compare(f5, 0.0f);
        if(v1 == 0) {
            return 0.0f;
        }
        float f6 = this.i[v];
        float f7 = this.j[v];
        float f8 = this.k[v];
        float f9 = f6 * f2;
        return v1 <= 0 ? -AutoScrollHelper.b(-f5 * f9, f7, f8) : AutoScrollHelper.b(f5 * f9, f7, f8);
    }

    public static float b(float f, float f1, float f2) {
        if(f > f2) {
            return f2;
        }
        return f < f1 ? f1 : f;
    }

    public final float c(float f, float f1) {
        if(f1 == 0.0f) {
            return 0.0f;
        }
        int v = this.g;
        if(v != 0 && v != 1) {
            return v != 2 || f >= 0.0f ? 0.0f : f / -f1;
        }
        if(f < f1) {
            if(Float.compare(f, 0.0f) >= 0) {
                return 1.0f - f / f1;
            }
            return !this.o || v != 1 ? 0.0f : 1.0f;
        }
        return 0.0f;
    }

    public abstract boolean canTargetScrollHorizontally(int arg1);

    public abstract boolean canTargetScrollVertically(int arg1);

    public final void d() {
        int v = 0;
        if(this.m) {
            this.o = false;
            return;
        }
        a a0 = this.a;
        long v1 = AnimationUtils.currentAnimationTimeMillis();
        int v2 = (int)(v1 - a0.e);
        int v3 = a0.b;
        if(v2 > v3) {
            v = v3;
        }
        else if(v2 >= 0) {
            v = v2;
        }
        a0.i = v;
        a0.h = a0.a(v1);
        a0.g = v1;
    }

    public final boolean e() {
        int v = (int)(this.a.d / Math.abs(this.a.d));
        int v1 = (int)(this.a.c / Math.abs(this.a.c));
        return v != 0 && this.canTargetScrollVertically(v) || v1 != 0 && this.canTargetScrollHorizontally(v1);
    }

    public boolean isEnabled() {
        return this.p;
    }

    public boolean isExclusive() {
        return this.q;
    }

    @Override  // android.view.View$OnTouchListener
    public boolean onTouch(View view0, MotionEvent motionEvent0) {
        if(!this.p) {
            return false;
        }
        switch(motionEvent0.getActionMasked()) {
            case 0: {
                this.n = true;
                this.l = false;
                break;
            }
            case 2: {
                break;
            }
            case 1: 
            case 3: {
                this.d();
                return this.q && this.o;
            }
            default: {
                return this.q && this.o;
            }
        }
        float f = motionEvent0.getX();
        float f1 = (float)view0.getWidth();
        View view1 = this.c;
        float f2 = this.a(f, f1, ((float)view1.getWidth()), 0);
        float f3 = this.a(motionEvent0.getY(), ((float)view0.getHeight()), ((float)view1.getHeight()), 1);
        this.a.c = f2;
        this.a.d = f3;
        if(!this.o && this.e()) {
            if(this.d == null) {
                this.d = new androidx.appcompat.widget.a(this, 19);
            }
            this.o = true;
            this.m = true;
            if(this.l) {
                this.d.run();
            }
            else {
                int v = this.h;
                if(v > 0) {
                    ViewCompat.postOnAnimationDelayed(view1, this.d, ((long)v));
                }
                else {
                    this.d.run();
                }
            }
            this.l = true;
        }
        return this.q && this.o;
    }

    public abstract void scrollTargetBy(int arg1, int arg2);

    @NonNull
    public AutoScrollHelper setActivationDelay(int v) {
        this.h = v;
        return this;
    }

    @NonNull
    public AutoScrollHelper setEdgeType(int v) {
        this.g = v;
        return this;
    }

    public AutoScrollHelper setEnabled(boolean z) {
        if(this.p && !z) {
            this.d();
        }
        this.p = z;
        return this;
    }

    public AutoScrollHelper setExclusive(boolean z) {
        this.q = z;
        return this;
    }

    @NonNull
    public AutoScrollHelper setMaximumEdges(float f, float f1) {
        this.f[0] = f;
        this.f[1] = f1;
        return this;
    }

    @NonNull
    public AutoScrollHelper setMaximumVelocity(float f, float f1) {
        this.k[0] = f / 1000.0f;
        this.k[1] = f1 / 1000.0f;
        return this;
    }

    @NonNull
    public AutoScrollHelper setMinimumVelocity(float f, float f1) {
        this.j[0] = f / 1000.0f;
        this.j[1] = f1 / 1000.0f;
        return this;
    }

    @NonNull
    public AutoScrollHelper setRampDownDuration(int v) {
        this.a.b = v;
        return this;
    }

    @NonNull
    public AutoScrollHelper setRampUpDuration(int v) {
        this.a.a = v;
        return this;
    }

    @NonNull
    public AutoScrollHelper setRelativeEdges(float f, float f1) {
        this.e[0] = f;
        this.e[1] = f1;
        return this;
    }

    @NonNull
    public AutoScrollHelper setRelativeVelocity(float f, float f1) {
        this.i[0] = f / 1000.0f;
        this.i[1] = f1 / 1000.0f;
        return this;
    }
}

