package androidx.recyclerview.widget;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.browser.browseractions.c;
import androidx.core.view.ViewCompat;

public final class b0 extends ItemDecoration implements OnItemTouchListener {
    public int A;
    public float B;
    public int C;
    public int D;
    public final RecyclerView E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public final int[] J;
    public final int[] K;
    public final ValueAnimator L;
    public int M;
    public final f1 N;
    public static final int[] O;
    public static final int[] P;
    public final int m;
    public final int n;
    public final StateListDrawable o;
    public final Drawable p;
    public final int q;
    public final int r;
    public final StateListDrawable s;
    public final Drawable t;
    public final int u;
    public final int v;
    public int w;
    public int x;
    public float y;
    public int z;

    static {
        b0.O = new int[]{0x10100A7};
        b0.P = new int[0];
    }

    public b0(RecyclerView recyclerView0, StateListDrawable stateListDrawable0, Drawable drawable0, StateListDrawable stateListDrawable1, Drawable drawable1, int v, int v1, int v2) {
        this.C = 0;
        this.D = 0;
        this.F = false;
        this.G = false;
        this.H = 0;
        this.I = 0;
        this.J = new int[2];
        this.K = new int[2];
        ValueAnimator valueAnimator0 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.L = valueAnimator0;
        this.M = 0;
        f1 f10 = new f1(this, 1);
        this.N = f10;
        z z0 = new z(this);
        this.o = stateListDrawable0;
        this.p = drawable0;
        this.s = stateListDrawable1;
        this.t = drawable1;
        this.q = Math.max(v, stateListDrawable0.getIntrinsicWidth());
        this.r = Math.max(v, drawable0.getIntrinsicWidth());
        this.u = Math.max(v, stateListDrawable1.getIntrinsicWidth());
        this.v = Math.max(v, drawable1.getIntrinsicWidth());
        this.m = v1;
        this.n = v2;
        stateListDrawable0.setAlpha(0xFF);
        drawable0.setAlpha(0xFF);
        valueAnimator0.addListener(new c(this));
        valueAnimator0.addUpdateListener(new a0(this));
        RecyclerView recyclerView1 = this.E;
        if(recyclerView1 != recyclerView0) {
            if(recyclerView1 != null) {
                recyclerView1.removeItemDecoration(this);
                this.E.removeOnItemTouchListener(this);
                this.E.removeOnScrollListener(z0);
                this.E.removeCallbacks(f10);
            }
            this.E = recyclerView0;
            if(recyclerView0 != null) {
                recyclerView0.addItemDecoration(this);
                this.E.addOnItemTouchListener(this);
                this.E.addOnScrollListener(z0);
            }
        }
    }

    public final boolean a(float f, float f1) {
        return f1 >= ((float)(this.D - this.u)) && (f >= ((float)(this.A - this.z / 2)) && f <= ((float)(this.z / 2 + this.A)));
    }

    public final boolean b(float f, float f1) {
        boolean z = ViewCompat.getLayoutDirection(this.E) == 1;
        int v = this.q;
        if(!z) {
            if(f >= ((float)(this.C - v))) {
            label_6:
                int v1 = this.w / 2;
                return f1 >= ((float)(this.x - v1)) && f1 <= ((float)(v1 + this.x));
            }
        }
        else if(f <= ((float)v)) {
            goto label_6;
        }
        return false;
    }

    public static int c(float f, float f1, int[] arr_v, int v, int v1, int v2) {
        int v3 = arr_v[1] - arr_v[0];
        if(v3 == 0) {
            return 0;
        }
        int v4 = v - v2;
        int v5 = (int)((f1 - f) / ((float)v3) * ((float)v4));
        return v1 + v5 >= v4 || v1 + v5 < 0 ? 0 : v5;
    }

    public final void d(int v) {
        f1 f10 = this.N;
        StateListDrawable stateListDrawable0 = this.o;
        if(v == 2 && this.H != 2) {
            stateListDrawable0.setState(b0.O);
            this.E.removeCallbacks(f10);
        }
        if(v == 0) {
            this.E.invalidate();
        }
        else {
            this.e();
        }
        if(this.H == 2 && v != 2) {
            stateListDrawable0.setState(b0.P);
            this.E.removeCallbacks(f10);
            this.E.postDelayed(f10, 1200L);
        }
        else if(v == 1) {
            this.E.removeCallbacks(f10);
            this.E.postDelayed(f10, 1500L);
        }
        this.H = v;
    }

    public final void e() {
        int v = this.M;
        ValueAnimator valueAnimator0 = this.L;
        if(v == 0) {
        label_5:
            this.M = 1;
            valueAnimator0.setFloatValues(new float[]{((float)(((Float)valueAnimator0.getAnimatedValue()))), 1.0f});
            valueAnimator0.setDuration(500L);
            valueAnimator0.setStartDelay(0L);
            valueAnimator0.start();
        }
        else if(v == 3) {
            valueAnimator0.cancel();
            goto label_5;
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$ItemDecoration
    public final void onDrawOver(Canvas canvas0, RecyclerView recyclerView0, State recyclerView$State0) {
        if(this.C == this.E.getWidth() && this.D == this.E.getHeight()) {
            if(this.M != 0) {
                if(this.F) {
                    int v = this.q;
                    int v1 = this.C - v;
                    int v2 = this.x - this.w / 2;
                    StateListDrawable stateListDrawable0 = this.o;
                    stateListDrawable0.setBounds(0, 0, v, this.w);
                    Drawable drawable0 = this.p;
                    drawable0.setBounds(0, 0, this.r, this.D);
                    if(ViewCompat.getLayoutDirection(this.E) == 1) {
                        drawable0.draw(canvas0);
                        canvas0.translate(((float)v), ((float)v2));
                        canvas0.scale(-1.0f, 1.0f);
                        stateListDrawable0.draw(canvas0);
                        canvas0.scale(-1.0f, 1.0f);
                        canvas0.translate(((float)(-v)), ((float)(-v2)));
                    }
                    else {
                        canvas0.translate(((float)v1), 0.0f);
                        drawable0.draw(canvas0);
                        canvas0.translate(0.0f, ((float)v2));
                        stateListDrawable0.draw(canvas0);
                        canvas0.translate(((float)(-v1)), ((float)(-v2)));
                    }
                }
                if(this.G) {
                    int v3 = this.D - this.u;
                    int v4 = this.A - this.z / 2;
                    this.s.setBounds(0, 0, this.z, this.u);
                    this.t.setBounds(0, 0, this.C, this.v);
                    canvas0.translate(0.0f, ((float)v3));
                    this.t.draw(canvas0);
                    canvas0.translate(((float)v4), 0.0f);
                    this.s.draw(canvas0);
                    canvas0.translate(((float)(-v4)), ((float)(-v3)));
                }
            }
            return;
        }
        this.C = this.E.getWidth();
        this.D = this.E.getHeight();
        this.d(0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$OnItemTouchListener
    public final boolean onInterceptTouchEvent(RecyclerView recyclerView0, MotionEvent motionEvent0) {
        int v = this.H;
        if(v == 1) {
            boolean z = this.b(motionEvent0.getX(), motionEvent0.getY());
            boolean z1 = this.a(motionEvent0.getX(), motionEvent0.getY());
            if(motionEvent0.getAction() == 0 && (z || z1)) {
                if(z1) {
                    this.I = 1;
                    this.B = (float)(((int)motionEvent0.getX()));
                }
                else if(z) {
                    this.I = 2;
                    this.y = (float)(((int)motionEvent0.getY()));
                }
                this.d(2);
                return true;
            }
            return false;
        }
        return v == 2;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$OnItemTouchListener
    public final void onRequestDisallowInterceptTouchEvent(boolean z) {
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$OnItemTouchListener
    public final void onTouchEvent(RecyclerView recyclerView0, MotionEvent motionEvent0) {
        if(this.H == 0) {
            return;
        }
        switch(motionEvent0.getAction()) {
            case 0: {
                boolean z = this.b(motionEvent0.getX(), motionEvent0.getY());
                boolean z1 = this.a(motionEvent0.getX(), motionEvent0.getY());
                if(z || z1) {
                    if(z1) {
                        this.I = 1;
                        this.B = (float)(((int)motionEvent0.getX()));
                    }
                    else if(z) {
                        this.I = 2;
                        this.y = (float)(((int)motionEvent0.getY()));
                    }
                    this.d(2);
                    return;
                }
                break;
            }
            case 1: {
                if(this.H == 2) {
                    this.y = 0.0f;
                    this.B = 0.0f;
                    this.d(1);
                    this.I = 0;
                    return;
                }
            label_22:
                if(motionEvent0.getAction() == 2 && this.H == 2) {
                    this.e();
                    int v = this.n;
                    if(this.I == 1) {
                        float f = motionEvent0.getX();
                        int[] arr_v = this.K;
                        arr_v[0] = v;
                        int v1 = this.C - v;
                        arr_v[1] = v1;
                        float f1 = Math.max(v, Math.min(v1, f));
                        if(Math.abs(((float)this.A) - f1) >= 2.0f) {
                            int v2 = b0.c(this.B, f1, arr_v, this.E.computeHorizontalScrollRange(), this.E.computeHorizontalScrollOffset(), this.C);
                            if(v2 != 0) {
                                this.E.scrollBy(v2, 0);
                            }
                            this.B = f1;
                        }
                    }
                    if(this.I == 2) {
                        float f2 = motionEvent0.getY();
                        int[] arr_v1 = this.J;
                        arr_v1[0] = v;
                        int v3 = this.D - v;
                        arr_v1[1] = v3;
                        float f3 = Math.max(v, Math.min(v3, f2));
                        if(Math.abs(((float)this.x) - f3) >= 2.0f) {
                            int v4 = b0.c(this.y, f3, arr_v1, this.E.computeVerticalScrollRange(), this.E.computeVerticalScrollOffset(), this.D);
                            if(v4 != 0) {
                                this.E.scrollBy(0, v4);
                            }
                            this.y = f3;
                        }
                    }
                }
                break;
            }
            default: {
                goto label_22;
            }
        }
    }
}

