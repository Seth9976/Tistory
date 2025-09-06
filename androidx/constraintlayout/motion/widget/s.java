package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.R.styleable;

public final class s {
    public final float A;
    public final float B;
    public final int C;
    public final int D;
    public static final float[][] E;
    public static final float[][] F;
    public final int a;
    public final int b;
    public int c;
    public final int d;
    public final int e;
    public final int f;
    public float g;
    public float h;
    public final int i;
    public final boolean j;
    public float k;
    public float l;
    public boolean m;
    public final float[] n;
    public final int[] o;
    public float p;
    public float q;
    public final MotionLayout r;
    public final float s;
    public final float t;
    public final boolean u;
    public final float v;
    public final int w;
    public final float x;
    public final float y;
    public final float z;

    static {
        s.E = new float[][]{new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};
        s.F = new float[][]{new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};
    }

    public s(Context context0, MotionLayout motionLayout0, XmlResourceParser xmlResourceParser0) {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = -1;
        this.e = -1;
        this.f = -1;
        this.g = 0.5f;
        this.h = 0.5f;
        this.i = -1;
        this.j = false;
        this.k = 0.0f;
        this.l = 1.0f;
        this.m = false;
        this.n = new float[2];
        this.o = new int[2];
        this.s = 4.0f;
        this.t = 1.2f;
        this.u = true;
        this.v = 1.0f;
        this.w = 0;
        this.x = 10.0f;
        this.y = 10.0f;
        this.z = 1.0f;
        this.A = NaNf;
        this.B = NaNf;
        this.C = 0;
        this.D = 0;
        this.r = motionLayout0;
        TypedArray typedArray0 = context0.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser0), styleable.OnSwipe);
        int v = typedArray0.getIndexCount();
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = typedArray0.getIndex(v1);
            if(v2 == styleable.OnSwipe_touchAnchorId) {
                this.d = typedArray0.getResourceId(v2, this.d);
            }
            else if(v2 == styleable.OnSwipe_touchAnchorSide) {
                int v3 = typedArray0.getInt(v2, this.a);
                this.a = v3;
                float[] arr_f = s.E[v3];
                this.h = arr_f[0];
                this.g = arr_f[1];
            }
            else if(v2 == styleable.OnSwipe_dragDirection) {
                int v4 = typedArray0.getInt(v2, this.b);
                this.b = v4;
                if(v4 < 6) {
                    float[] arr_f1 = s.F[v4];
                    this.k = arr_f1[0];
                    this.l = arr_f1[1];
                }
                else {
                    this.l = NaNf;
                    this.k = NaNf;
                    this.j = true;
                }
            }
            else if(v2 == styleable.OnSwipe_maxVelocity) {
                this.s = typedArray0.getFloat(v2, this.s);
            }
            else if(v2 == styleable.OnSwipe_maxAcceleration) {
                this.t = typedArray0.getFloat(v2, this.t);
            }
            else if(v2 == styleable.OnSwipe_moveWhenScrollAtTop) {
                this.u = typedArray0.getBoolean(v2, this.u);
            }
            else if(v2 == styleable.OnSwipe_dragScale) {
                this.v = typedArray0.getFloat(v2, this.v);
            }
            else if(v2 == styleable.OnSwipe_dragThreshold) {
                this.x = typedArray0.getFloat(v2, this.x);
            }
            else if(v2 == styleable.OnSwipe_touchRegionId) {
                this.e = typedArray0.getResourceId(v2, this.e);
            }
            else if(v2 == styleable.OnSwipe_onTouchUp) {
                this.c = typedArray0.getInt(v2, this.c);
            }
            else if(v2 == styleable.OnSwipe_nestedScrollFlags) {
                this.w = typedArray0.getInteger(v2, 0);
            }
            else if(v2 == styleable.OnSwipe_limitBoundsTo) {
                this.f = typedArray0.getResourceId(v2, 0);
            }
            else if(v2 == styleable.OnSwipe_rotationCenterId) {
                this.i = typedArray0.getResourceId(v2, this.i);
            }
            else if(v2 == styleable.OnSwipe_springDamping) {
                this.y = typedArray0.getFloat(v2, this.y);
            }
            else if(v2 == styleable.OnSwipe_springMass) {
                this.z = typedArray0.getFloat(v2, this.z);
            }
            else if(v2 == styleable.OnSwipe_springStiffness) {
                this.A = typedArray0.getFloat(v2, this.A);
            }
            else if(v2 == styleable.OnSwipe_springStopThreshold) {
                this.B = typedArray0.getFloat(v2, this.B);
            }
            else if(v2 == styleable.OnSwipe_springBoundary) {
                this.C = typedArray0.getInt(v2, this.C);
            }
            else if(v2 == styleable.OnSwipe_autoCompleteMode) {
                this.D = typedArray0.getInt(v2, this.D);
            }
        }
        typedArray0.recycle();
    }

    public s(MotionLayout motionLayout0, OnSwipe onSwipe0) {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0.5f;
        this.h = 0.5f;
        this.i = -1;
        this.j = false;
        this.k = 0.0f;
        this.l = 1.0f;
        this.m = false;
        this.n = new float[2];
        this.o = new int[2];
        this.s = 4.0f;
        this.t = 1.2f;
        this.u = true;
        this.v = 1.0f;
        this.w = 0;
        this.x = 10.0f;
        this.y = 10.0f;
        this.z = 1.0f;
        this.A = NaNf;
        this.B = NaNf;
        this.C = 0;
        this.D = 0;
        this.r = motionLayout0;
        this.d = onSwipe0.getTouchAnchorId();
        int v = onSwipe0.getTouchAnchorSide();
        this.a = v;
        if(v != -1) {
            float[] arr_f = s.E[v];
            this.h = arr_f[0];
            this.g = arr_f[1];
        }
        int v1 = onSwipe0.getDragDirection();
        this.b = v1;
        if(v1 < 6) {
            float[] arr_f1 = s.F[v1];
            this.k = arr_f1[0];
            this.l = arr_f1[1];
        }
        else {
            this.l = NaNf;
            this.k = NaNf;
            this.j = true;
        }
        this.s = onSwipe0.getMaxVelocity();
        this.t = onSwipe0.getMaxAcceleration();
        this.u = onSwipe0.getMoveWhenScrollAtTop();
        this.v = onSwipe0.getDragScale();
        this.x = onSwipe0.getDragThreshold();
        this.e = onSwipe0.getTouchRegionId();
        this.c = onSwipe0.getOnTouchUp();
        this.w = onSwipe0.getNestedScrollFlags();
        this.f = onSwipe0.getLimitBoundsTo();
        this.i = onSwipe0.getRotationCenterId();
        this.C = onSwipe0.getSpringBoundary();
        this.y = onSwipe0.getSpringDamping();
        this.z = onSwipe0.getSpringMass();
        this.A = onSwipe0.getSpringStiffness();
        this.B = onSwipe0.getSpringStopThreshold();
        this.D = onSwipe0.getAutoCompleteMode();
    }

    public final RectF a(ViewGroup viewGroup0, RectF rectF0) {
        int v = this.f;
        if(v == -1) {
            return null;
        }
        View view0 = viewGroup0.findViewById(v);
        if(view0 == null) {
            return null;
        }
        rectF0.set(((float)view0.getLeft()), ((float)view0.getTop()), ((float)view0.getRight()), ((float)view0.getBottom()));
        return rectF0;
    }

    public final RectF b(ViewGroup viewGroup0, RectF rectF0) {
        int v = this.e;
        if(v == -1) {
            return null;
        }
        View view0 = viewGroup0.findViewById(v);
        if(view0 == null) {
            return null;
        }
        rectF0.set(((float)view0.getLeft()), ((float)view0.getTop()), ((float)view0.getRight()), ((float)view0.getBottom()));
        return rectF0;
    }

    public final void c(boolean z) {
        float[][] arr2_f = s.E;
        float[][] arr2_f1 = s.F;
        if(z) {
            arr2_f1[4] = arr2_f1[3];
            arr2_f1[5] = arr2_f1[2];
            arr2_f[5] = arr2_f[2];
            arr2_f[6] = arr2_f[1];
        }
        else {
            arr2_f1[4] = arr2_f1[2];
            arr2_f1[5] = arr2_f1[3];
            arr2_f[5] = arr2_f[1];
            arr2_f[6] = arr2_f[2];
        }
        float[] arr_f = arr2_f[this.a];
        this.h = arr_f[0];
        this.g = arr_f[1];
        int v = this.b;
        if(v >= 6) {
            return;
        }
        float[] arr_f1 = arr2_f1[v];
        this.k = arr_f1[0];
        this.l = arr_f1[1];
    }

    // 去混淆评级： 低(20)
    @Override
    public final String toString() {
        return Float.isNaN(this.k) ? "rotation" : this.k + " , " + this.l;
    }
}

