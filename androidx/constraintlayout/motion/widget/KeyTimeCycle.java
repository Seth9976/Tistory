package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.utils.ViewTimeCycle.CustomSet;
import androidx.constraintlayout.motion.utils.ViewTimeCycle;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.R.styleable;
import androidx.room.a;
import java.util.HashMap;
import java.util.HashSet;

public class KeyTimeCycle extends Key {
    public static final int KEY_TYPE = 3;
    public static final int SHAPE_BOUNCE = 6;
    public static final int SHAPE_COS_WAVE = 5;
    public static final int SHAPE_REVERSE_SAW_WAVE = 4;
    public static final int SHAPE_SAW_WAVE = 3;
    public static final int SHAPE_SIN_WAVE = 0;
    public static final int SHAPE_SQUARE_WAVE = 1;
    public static final int SHAPE_TRIANGLE_WAVE = 2;
    public static final String WAVE_OFFSET = "waveOffset";
    public static final String WAVE_PERIOD = "wavePeriod";
    public static final String WAVE_SHAPE = "waveShape";
    public int e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public int r;
    public float s;
    public float t;

    public KeyTimeCycle() {
        this.e = -1;
        this.f = NaNf;
        this.g = NaNf;
        this.h = NaNf;
        this.i = NaNf;
        this.j = NaNf;
        this.k = NaNf;
        this.l = NaNf;
        this.m = NaNf;
        this.n = NaNf;
        this.o = NaNf;
        this.p = NaNf;
        this.q = NaNf;
        this.r = 0;
        this.s = NaNf;
        this.t = 0.0f;
        this.mType = 3;
        this.d = new HashMap();
    }

    public void addTimeValues(HashMap hashMap0) {
        for(Object object0: hashMap0.keySet()) {
            String s = (String)object0;
            ViewTimeCycle viewTimeCycle0 = (ViewTimeCycle)hashMap0.get(s);
            if(viewTimeCycle0 == null) {
            }
            else if(s.startsWith("CUSTOM")) {
                ConstraintAttribute constraintAttribute0 = (ConstraintAttribute)this.d.get(s.substring(7));
                if(constraintAttribute0 == null) {
                    continue;
                }
                ((CustomSet)viewTimeCycle0).setPoint(this.a, constraintAttribute0, this.s, this.r, this.t);
            }
            else {
                switch(s) {
                    case "alpha": {
                        if(!Float.isNaN(this.f)) {
                            break;
                        }
                        continue;
                    }
                    case "elevation": {
                        if(Float.isNaN(this.g)) {
                            continue;
                        }
                        viewTimeCycle0.setPoint(this.a, this.g, this.s, this.r, this.t);
                        continue;
                    }
                    case "progress": {
                        if(Float.isNaN(this.q)) {
                            continue;
                        }
                        viewTimeCycle0.setPoint(this.a, this.q, this.s, this.r, this.t);
                        continue;
                    }
                    case "rotation": {
                        if(Float.isNaN(this.h)) {
                            continue;
                        }
                        viewTimeCycle0.setPoint(this.a, this.h, this.s, this.r, this.t);
                        continue;
                    }
                    case "rotationX": {
                        if(Float.isNaN(this.i)) {
                            continue;
                        }
                        viewTimeCycle0.setPoint(this.a, this.i, this.s, this.r, this.t);
                        continue;
                    }
                    case "rotationY": {
                        if(Float.isNaN(this.j)) {
                            continue;
                        }
                        viewTimeCycle0.setPoint(this.a, this.j, this.s, this.r, this.t);
                        continue;
                    }
                    case "scaleX": {
                        if(Float.isNaN(this.l)) {
                            continue;
                        }
                        viewTimeCycle0.setPoint(this.a, this.l, this.s, this.r, this.t);
                        continue;
                    }
                    case "scaleY": {
                        if(Float.isNaN(this.m)) {
                            continue;
                        }
                        viewTimeCycle0.setPoint(this.a, this.m, this.s, this.r, this.t);
                        continue;
                    }
                    case "transitionPathRotate": {
                        if(Float.isNaN(this.k)) {
                            continue;
                        }
                        viewTimeCycle0.setPoint(this.a, this.k, this.s, this.r, this.t);
                        continue;
                    }
                    case "translationX": {
                        if(Float.isNaN(this.n)) {
                            continue;
                        }
                        viewTimeCycle0.setPoint(this.a, this.n, this.s, this.r, this.t);
                        continue;
                    }
                    case "translationY": {
                        if(Float.isNaN(this.o)) {
                            continue;
                        }
                        viewTimeCycle0.setPoint(this.a, this.o, this.s, this.r, this.t);
                        continue;
                    }
                    case "translationZ": {
                        if(Float.isNaN(this.p)) {
                            continue;
                        }
                        viewTimeCycle0.setPoint(this.a, this.p, this.s, this.r, this.t);
                        continue;
                    }
                    default: {
                        Log.e("KeyTimeCycles", "UNKNOWN addValues \"" + s + "\"");
                        continue;
                    }
                }
                viewTimeCycle0.setPoint(this.a, this.f, this.s, this.r, this.t);
            }
        }
    }

    @Override  // androidx.constraintlayout.motion.widget.Key
    public void addValues(HashMap hashMap0) {
        throw new IllegalArgumentException(" KeyTimeCycles do not support SplineSet");
    }

    @Override  // androidx.constraintlayout.motion.widget.Key
    public Key clone() {
        return new KeyTimeCycle().copy(this);
    }

    @Override  // androidx.constraintlayout.motion.widget.Key
    public Object clone() throws CloneNotSupportedException {
        return this.clone();
    }

    @Override  // androidx.constraintlayout.motion.widget.Key
    public Key copy(Key key0) {
        super.copy(key0);
        ((KeyTimeCycle)key0).getClass();
        this.e = ((KeyTimeCycle)key0).e;
        this.r = ((KeyTimeCycle)key0).r;
        this.s = ((KeyTimeCycle)key0).s;
        this.t = ((KeyTimeCycle)key0).t;
        this.q = ((KeyTimeCycle)key0).q;
        this.f = ((KeyTimeCycle)key0).f;
        this.g = ((KeyTimeCycle)key0).g;
        this.h = ((KeyTimeCycle)key0).h;
        this.k = ((KeyTimeCycle)key0).k;
        this.i = ((KeyTimeCycle)key0).i;
        this.j = ((KeyTimeCycle)key0).j;
        this.l = ((KeyTimeCycle)key0).l;
        this.m = ((KeyTimeCycle)key0).m;
        this.n = ((KeyTimeCycle)key0).n;
        this.o = ((KeyTimeCycle)key0).o;
        this.p = ((KeyTimeCycle)key0).p;
        return this;
    }

    @Override  // androidx.constraintlayout.motion.widget.Key
    public void getAttributeNames(HashSet hashSet0) {
        if(!Float.isNaN(this.f)) {
            hashSet0.add("alpha");
        }
        if(!Float.isNaN(this.g)) {
            hashSet0.add("elevation");
        }
        if(!Float.isNaN(this.h)) {
            hashSet0.add("rotation");
        }
        if(!Float.isNaN(this.i)) {
            hashSet0.add("rotationX");
        }
        if(!Float.isNaN(this.j)) {
            hashSet0.add("rotationY");
        }
        if(!Float.isNaN(this.n)) {
            hashSet0.add("translationX");
        }
        if(!Float.isNaN(this.o)) {
            hashSet0.add("translationY");
        }
        if(!Float.isNaN(this.p)) {
            hashSet0.add("translationZ");
        }
        if(!Float.isNaN(this.k)) {
            hashSet0.add("transitionPathRotate");
        }
        if(!Float.isNaN(this.l)) {
            hashSet0.add("scaleX");
        }
        if(!Float.isNaN(this.m)) {
            hashSet0.add("scaleY");
        }
        if(!Float.isNaN(this.q)) {
            hashSet0.add("progress");
        }
        if(this.d.size() > 0) {
            for(Object object0: this.d.keySet()) {
                hashSet0.add("CUSTOM," + ((String)object0));
            }
        }
    }

    @Override  // androidx.constraintlayout.motion.widget.Key
    public void load(Context context0, AttributeSet attributeSet0) {
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.KeyTimeCycle);
        int v = typedArray0.getIndexCount();
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = typedArray0.getIndex(v1);
            SparseIntArray sparseIntArray0 = e.a;
            switch(sparseIntArray0.get(v2)) {
                case 1: {
                    this.f = typedArray0.getFloat(v2, this.f);
                    break;
                }
                case 2: {
                    this.g = typedArray0.getDimension(v2, this.g);
                    break;
                }
                case 4: {
                    this.h = typedArray0.getFloat(v2, this.h);
                    break;
                }
                case 5: {
                    this.i = typedArray0.getFloat(v2, this.i);
                    break;
                }
                case 6: {
                    this.j = typedArray0.getFloat(v2, this.j);
                    break;
                }
                case 7: {
                    this.l = typedArray0.getFloat(v2, this.l);
                    break;
                }
                case 8: {
                    this.k = typedArray0.getFloat(v2, this.k);
                    break;
                }
                case 9: {
                    typedArray0.getString(v2);
                    break;
                }
                case 10: {
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
                case 12: {
                    this.a = typedArray0.getInt(v2, this.a);
                    break;
                }
                case 13: {
                    this.e = typedArray0.getInteger(v2, this.e);
                    break;
                }
                case 14: {
                    this.m = typedArray0.getFloat(v2, this.m);
                    break;
                }
                case 15: {
                    this.n = typedArray0.getDimension(v2, this.n);
                    break;
                }
                case 16: {
                    this.o = typedArray0.getDimension(v2, this.o);
                    break;
                }
                case 17: {
                    this.p = typedArray0.getDimension(v2, this.p);
                    break;
                }
                case 18: {
                    this.q = typedArray0.getFloat(v2, this.q);
                    break;
                }
                case 19: {
                    if(typedArray0.peekValue(v2).type == 3) {
                        typedArray0.getString(v2);
                        this.r = 7;
                    }
                    else {
                        this.r = typedArray0.getInt(v2, this.r);
                    }
                    break;
                }
                case 20: {
                    this.s = typedArray0.getFloat(v2, this.s);
                    break;
                }
                case 21: {
                    this.t = typedArray0.peekValue(v2).type == 5 ? typedArray0.getDimension(v2, this.t) : typedArray0.getFloat(v2, this.t);
                    break;
                }
                default: {
                    Log.e("KeyTimeCycle", "unused attribute 0x" + Integer.toHexString(v2) + "   " + sparseIntArray0.get(v2));
                }
            }
        }
    }

    @Override  // androidx.constraintlayout.motion.widget.Key
    public void setInterpolation(HashMap hashMap0) {
        if(this.e == -1) {
            return;
        }
        if(!Float.isNaN(this.f)) {
            hashMap0.put("alpha", this.e);
        }
        if(!Float.isNaN(this.g)) {
            hashMap0.put("elevation", this.e);
        }
        if(!Float.isNaN(this.h)) {
            hashMap0.put("rotation", this.e);
        }
        if(!Float.isNaN(this.i)) {
            hashMap0.put("rotationX", this.e);
        }
        if(!Float.isNaN(this.j)) {
            hashMap0.put("rotationY", this.e);
        }
        if(!Float.isNaN(this.n)) {
            hashMap0.put("translationX", this.e);
        }
        if(!Float.isNaN(this.o)) {
            hashMap0.put("translationY", this.e);
        }
        if(!Float.isNaN(this.p)) {
            hashMap0.put("translationZ", this.e);
        }
        if(!Float.isNaN(this.k)) {
            hashMap0.put("transitionPathRotate", this.e);
        }
        if(!Float.isNaN(this.l)) {
            hashMap0.put("scaleX", this.e);
        }
        if(!Float.isNaN(this.l)) {
            hashMap0.put("scaleY", this.e);
        }
        if(!Float.isNaN(this.q)) {
            hashMap0.put("progress", this.e);
        }
        if(this.d.size() > 0) {
            for(Object object0: this.d.keySet()) {
                hashMap0.put(a.j("CUSTOM,", ((String)object0)), this.e);
            }
        }
    }

    @Override  // androidx.constraintlayout.motion.widget.Key
    public void setValue(String s, Object object0) {
        s.getClass();
        switch(s) {
            case "alpha": {
                this.f = Key.a(object0);
                return;
            }
            case "curveFit": {
                this.e = Key.b(object0);
                return;
            }
            case "elevation": {
                this.g = Key.a(object0);
                return;
            }
            case "motionProgress": {
                this.q = Key.a(object0);
                return;
            }
            case "rotation": {
                this.h = Key.a(object0);
                return;
            }
            case "rotationX": {
                this.i = Key.a(object0);
                return;
            }
            case "rotationY": {
                this.j = Key.a(object0);
                return;
            }
            case "scaleX": {
                this.l = Key.a(object0);
                return;
            }
            case "scaleY": {
                this.m = Key.a(object0);
                return;
            }
            case "transitionEasing": {
                object0.toString();
                return;
            }
            case "transitionPathRotate": {
                this.k = Key.a(object0);
                return;
            }
            case "translationX": {
                this.n = Key.a(object0);
                return;
            }
            case "translationY": {
                this.o = Key.a(object0);
                return;
            }
            case "translationZ": {
                this.p = Key.a(object0);
                return;
            }
            case "waveOffset": {
                this.t = Key.a(object0);
                return;
            }
            case "wavePeriod": {
                this.s = Key.a(object0);
                return;
            }
            case "waveShape": {
                if(object0 instanceof Integer) {
                    this.r = Key.b(object0);
                    return;
                }
                this.r = 7;
                object0.toString();
            }
        }
    }
}

