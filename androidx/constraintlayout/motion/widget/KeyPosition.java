package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.widget.R.styleable;
import java.util.HashMap;

public class KeyPosition extends d {
    public static final String DRAWPATH = "drawPath";
    public static final String PERCENT_HEIGHT = "percentHeight";
    public static final String PERCENT_WIDTH = "percentWidth";
    public static final String PERCENT_X = "percentX";
    public static final String PERCENT_Y = "percentY";
    public static final String SIZE_PERCENT = "sizePercent";
    public static final String TRANSITION_EASING = "transitionEasing";
    public static final int TYPE_CARTESIAN = 0;
    public static final int TYPE_PATH = 1;
    public static final int TYPE_SCREEN = 2;
    public String f;
    public int g;
    public int h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public int o;
    public float p;
    public float q;

    public KeyPosition() {
        this.e = Key.UNSET;
        this.f = null;
        this.g = Key.UNSET;
        this.h = 0;
        this.i = NaNf;
        this.j = NaNf;
        this.k = NaNf;
        this.l = NaNf;
        this.m = NaNf;
        this.n = NaNf;
        this.o = 0;
        this.p = NaNf;
        this.q = NaNf;
        this.mType = 2;
    }

    @Override  // androidx.constraintlayout.motion.widget.Key
    public void addValues(HashMap hashMap0) {
    }

    @Override  // androidx.constraintlayout.motion.widget.Key
    public Key clone() {
        return new KeyPosition().copy(this);
    }

    @Override  // androidx.constraintlayout.motion.widget.Key
    public Object clone() throws CloneNotSupportedException {
        return this.clone();
    }

    @Override  // androidx.constraintlayout.motion.widget.Key
    public Key copy(Key key0) {
        super.copy(key0);
        this.f = ((KeyPosition)key0).f;
        this.g = ((KeyPosition)key0).g;
        this.h = ((KeyPosition)key0).h;
        this.i = ((KeyPosition)key0).i;
        this.j = NaNf;
        this.k = ((KeyPosition)key0).k;
        this.l = ((KeyPosition)key0).l;
        this.m = ((KeyPosition)key0).m;
        this.n = ((KeyPosition)key0).n;
        this.p = ((KeyPosition)key0).p;
        this.q = ((KeyPosition)key0).q;
        return this;
    }

    @Override  // androidx.constraintlayout.motion.widget.d
    public boolean intersects(int v, int v1, RectF rectF0, RectF rectF1, float f, float f1) {
        float f2 = rectF0.centerX();
        float f3 = rectF0.centerY();
        float f4 = rectF1.centerX();
        float f5 = rectF1.centerY();
        switch(this.o) {
            case 1: {
                float f12 = f4 - f2;
                float f13 = f5 - f3;
                this.p = -f13 * this.l + (f12 * this.k + f2);
                this.q = f12 * this.l + (f13 * this.k + f3);
                return Math.abs(f - this.p) < 20.0f && Math.abs(f1 - this.q) < 20.0f;
            }
            case 2: {
                this.p = ((float)v) * this.k + 0.0f;
                this.q = ((float)v1) * this.k + 0.0f;
                return Math.abs(f - this.p) < 20.0f && Math.abs(f1 - this.q) < 20.0f;
            }
            default: {
                float f6 = f4 - f2;
                float f7 = f5 - f3;
                float f8 = 0.0f;
                float f9 = Float.isNaN(this.k) ? 0.0f : this.k;
                float f10 = Float.isNaN(this.n) ? 0.0f : this.n;
                float f11 = Float.isNaN(this.l) ? 0.0f : this.l;
                if(!Float.isNaN(this.m)) {
                    f8 = this.m;
                }
                this.p = (float)(((int)(f8 * f7 + (f9 * f6 + f2))));
                this.q = (float)(((int)(f7 * f11 + (f6 * f10 + f3))));
                return Math.abs(f - this.p) < 20.0f && Math.abs(f1 - this.q) < 20.0f;
            }
        }
    }

    @Override  // androidx.constraintlayout.motion.widget.Key
    public void load(Context context0, AttributeSet attributeSet0) {
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.KeyPosition);
        int v = typedArray0.getIndexCount();
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = typedArray0.getIndex(v1);
            SparseIntArray sparseIntArray0 = c.a;
            switch(sparseIntArray0.get(v2)) {
                case 1: {
                    if(MotionLayout.IS_IN_EDIT_MODE) {
                        int v3 = typedArray0.getResourceId(v2, this.b);
                        this.b = v3;
                        if(v3 == -1) {
                            this.c = typedArray0.getString(v2);
                        }
                    }
                    else if(typedArray0.peekValue(v2).type == 3) {
                        this.c = typedArray0.getString(v2);
                    }
                    else {
                        this.b = typedArray0.getResourceId(v2, this.b);
                    }
                    break;
                }
                case 2: {
                    this.a = typedArray0.getInt(v2, this.a);
                    break;
                }
                case 3: {
                    if(typedArray0.peekValue(v2).type == 3) {
                        this.f = typedArray0.getString(v2);
                    }
                    else {
                        String[] arr_s = Easing.NAMED_EASING;
                        this.f = arr_s[typedArray0.getInteger(v2, 0)];
                    }
                    break;
                }
                case 4: {
                    this.e = typedArray0.getInteger(v2, this.e);
                    break;
                }
                case 5: {
                    this.h = typedArray0.getInt(v2, this.h);
                    break;
                }
                case 6: {
                    this.k = typedArray0.getFloat(v2, this.k);
                    break;
                }
                case 7: {
                    this.l = typedArray0.getFloat(v2, this.l);
                    break;
                }
                case 8: {
                    float f = typedArray0.getFloat(v2, this.j);
                    this.i = f;
                    this.j = f;
                    break;
                }
                case 9: {
                    this.o = typedArray0.getInt(v2, this.o);
                    break;
                }
                case 10: {
                    this.g = typedArray0.getInt(v2, this.g);
                    break;
                }
                case 11: {
                    this.i = typedArray0.getFloat(v2, this.i);
                    break;
                }
                case 12: {
                    this.j = typedArray0.getFloat(v2, this.j);
                    break;
                }
                default: {
                    Log.e("KeyPosition", "unused attribute 0x" + Integer.toHexString(v2) + "   " + sparseIntArray0.get(v2));
                }
            }
        }
        if(this.a == -1) {
            Log.e("KeyPosition", "no frame position");
        }
    }

    @Override  // androidx.constraintlayout.motion.widget.d
    public void positionAttributes(View view0, RectF rectF0, RectF rectF1, float f, float f1, String[] arr_s, float[] arr_f) {
        switch(this.o) {
            case 1: {
                float f6 = rectF0.centerX();
                float f7 = rectF0.centerY();
                float f8 = rectF1.centerX() - f6;
                float f9 = rectF1.centerY() - f7;
                float f10 = (float)Math.hypot(f8, f9);
                if(((double)f10) < 0.0001) {
                    System.out.println("distance ~ 0");
                    arr_f[0] = 0.0f;
                    arr_f[1] = 0.0f;
                    return;
                }
                float f11 = f8 / f10;
                float f12 = f9 / f10;
                float f13 = f1 - f7;
                float f14 = f - f6;
                float f15 = (f11 * f13 - f14 * f12) / f10;
                float f16 = (f12 * f13 + f11 * f14) / f10;
                String s1 = arr_s[0];
                if(s1 == null) {
                    arr_s[0] = "percentX";
                    arr_s[1] = "percentY";
                    arr_f[0] = f16;
                    arr_f[1] = f15;
                }
                else if("percentX".equals(s1)) {
                    arr_f[0] = f16;
                    arr_f[1] = f15;
                    return;
                }
                return;
            }
            case 2: {
                rectF0.centerX();
                rectF0.centerY();
                rectF1.centerX();
                rectF1.centerY();
                ViewGroup viewGroup0 = (ViewGroup)view0.getParent();
                int v = viewGroup0.getWidth();
                int v1 = viewGroup0.getHeight();
                String s2 = arr_s[0];
                if(s2 != null) {
                    if("percentX".equals(s2)) {
                        arr_f[0] = f / ((float)v);
                        arr_f[1] = f1 / ((float)v1);
                        return;
                    }
                    arr_f[1] = f / ((float)v);
                    arr_f[0] = f1 / ((float)v1);
                    return;
                }
                arr_s[0] = "percentX";
                arr_f[0] = f / ((float)v);
                arr_s[1] = "percentY";
                arr_f[1] = f1 / ((float)v1);
                return;
            }
            default: {
                float f2 = rectF0.centerX();
                float f3 = rectF0.centerY();
                float f4 = rectF1.centerX() - f2;
                float f5 = rectF1.centerY() - f3;
                String s = arr_s[0];
                if(s != null) {
                    if("percentX".equals(s)) {
                        arr_f[0] = (f - f2) / f4;
                        arr_f[1] = (f1 - f3) / f5;
                        return;
                    }
                    arr_f[1] = (f - f2) / f4;
                    arr_f[0] = (f1 - f3) / f5;
                    return;
                }
                arr_s[0] = "percentX";
                arr_f[0] = (f - f2) / f4;
                arr_s[1] = "percentY";
                arr_f[1] = (f1 - f3) / f5;
            }
        }
    }

    public void setType(int v) {
        this.o = v;
    }

    @Override  // androidx.constraintlayout.motion.widget.Key
    public void setValue(String s, Object object0) {
        s.getClass();
        switch(s) {
            case "drawPath": {
                this.h = Key.b(object0);
                return;
            }
            case "percentHeight": {
                this.j = Key.a(object0);
                return;
            }
            case "percentWidth": {
                this.i = Key.a(object0);
                return;
            }
            case "percentX": {
                this.k = Key.a(object0);
                return;
            }
            case "percentY": {
                this.l = Key.a(object0);
                return;
            }
            case "sizePercent": {
                float f = Key.a(object0);
                this.i = f;
                this.j = f;
                return;
            }
            case "transitionEasing": {
                this.f = object0.toString();
            }
        }
    }
}

