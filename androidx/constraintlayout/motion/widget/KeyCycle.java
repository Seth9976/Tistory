package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.motion.utils.ViewOscillator;
import androidx.constraintlayout.widget.ConstraintAttribute.AttributeType;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.R.styleable;
import java.util.HashMap;
import java.util.HashSet;

public class KeyCycle extends Key {
    public static final int KEY_TYPE = 4;
    public static final int SHAPE_BOUNCE = 6;
    public static final int SHAPE_COS_WAVE = 5;
    public static final int SHAPE_REVERSE_SAW_WAVE = 4;
    public static final int SHAPE_SAW_WAVE = 3;
    public static final int SHAPE_SIN_WAVE = 0;
    public static final int SHAPE_SQUARE_WAVE = 1;
    public static final int SHAPE_TRIANGLE_WAVE = 2;
    public static final String WAVE_OFFSET = "waveOffset";
    public static final String WAVE_PERIOD = "wavePeriod";
    public static final String WAVE_PHASE = "wavePhase";
    public static final String WAVE_SHAPE = "waveShape";
    public int e;
    public int f;
    public String g;
    public float h;
    public float i;
    public float j;
    public float k;
    public int l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public float t;
    public float u;
    public float v;
    public float w;

    public KeyCycle() {
        this.e = 0;
        this.f = -1;
        this.g = null;
        this.h = NaNf;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = NaNf;
        this.l = -1;
        this.m = NaNf;
        this.n = NaNf;
        this.o = NaNf;
        this.p = NaNf;
        this.q = NaNf;
        this.r = NaNf;
        this.s = NaNf;
        this.t = NaNf;
        this.u = NaNf;
        this.v = NaNf;
        this.w = NaNf;
        this.mType = 4;
        this.d = new HashMap();
    }

    public void addCycleValues(HashMap hashMap0) {
        for(Object object0: hashMap0.keySet()) {
            String s = (String)object0;
            if(s.startsWith("CUSTOM")) {
                ConstraintAttribute constraintAttribute0 = (ConstraintAttribute)this.d.get(s.substring(7));
                if(constraintAttribute0 == null || constraintAttribute0.getType() != AttributeType.FLOAT_TYPE) {
                    continue;
                }
                ViewOscillator viewOscillator0 = (ViewOscillator)hashMap0.get(s);
                if(viewOscillator0 == null) {
                    continue;
                }
                viewOscillator0.setPoint(this.a, this.f, this.g, this.l, this.h, this.i, this.j, constraintAttribute0.getValueToInterpolate(), constraintAttribute0);
            }
            else {
                float f = this.getValue(s);
                if(!Float.isNaN(f)) {
                    ViewOscillator viewOscillator1 = (ViewOscillator)hashMap0.get(s);
                    if(viewOscillator1 != null) {
                        viewOscillator1.setPoint(this.a, this.f, this.g, this.l, this.h, this.i, this.j, f);
                    }
                }
            }
        }
    }

    @Override  // androidx.constraintlayout.motion.widget.Key
    public void addValues(HashMap hashMap0) {
        Debug.logStack("KeyCycle", "add " + hashMap0.size() + " values", 2);
        for(Object object0: hashMap0.keySet()) {
            String s = (String)object0;
            SplineSet splineSet0 = (SplineSet)hashMap0.get(s);
            if(splineSet0 != null) {
                s.getClass();
                switch(s) {
                    case "alpha": {
                        splineSet0.setPoint(this.a, this.m);
                        break;
                    }
                    case "elevation": {
                        splineSet0.setPoint(this.a, this.n);
                        break;
                    }
                    case "progress": {
                        splineSet0.setPoint(this.a, this.k);
                        break;
                    }
                    case "rotation": {
                        splineSet0.setPoint(this.a, this.o);
                        break;
                    }
                    case "rotationX": {
                        splineSet0.setPoint(this.a, this.q);
                        break;
                    }
                    case "rotationY": {
                        splineSet0.setPoint(this.a, this.r);
                        break;
                    }
                    case "scaleX": {
                        splineSet0.setPoint(this.a, this.s);
                        break;
                    }
                    case "scaleY": {
                        splineSet0.setPoint(this.a, this.t);
                        break;
                    }
                    case "transitionPathRotate": {
                        splineSet0.setPoint(this.a, this.p);
                        break;
                    }
                    case "translationX": {
                        splineSet0.setPoint(this.a, this.u);
                        break;
                    }
                    case "translationY": {
                        splineSet0.setPoint(this.a, this.v);
                        break;
                    }
                    case "translationZ": {
                        splineSet0.setPoint(this.a, this.w);
                        break;
                    }
                    case "waveOffset": {
                        splineSet0.setPoint(this.a, this.i);
                        break;
                    }
                    case "wavePhase": {
                        splineSet0.setPoint(this.a, this.j);
                        break;
                    }
                    default: {
                        if(s.startsWith("CUSTOM")) {
                            continue;
                        }
                        Log.v("WARNING KeyCycle", "  UNKNOWN  " + s);
                    }
                }
            }
        }
    }

    @Override  // androidx.constraintlayout.motion.widget.Key
    public Key clone() {
        return new KeyCycle().copy(this);
    }

    @Override  // androidx.constraintlayout.motion.widget.Key
    public Object clone() throws CloneNotSupportedException {
        return this.clone();
    }

    @Override  // androidx.constraintlayout.motion.widget.Key
    public Key copy(Key key0) {
        super.copy(key0);
        KeyCycle keyCycle0 = (KeyCycle)key0;
        keyCycle0.getClass();
        this.e = keyCycle0.e;
        this.f = keyCycle0.f;
        this.g = keyCycle0.g;
        this.h = keyCycle0.h;
        this.i = keyCycle0.i;
        this.j = keyCycle0.j;
        this.k = keyCycle0.k;
        this.l = keyCycle0.l;
        this.m = keyCycle0.m;
        this.n = keyCycle0.n;
        this.o = keyCycle0.o;
        this.p = keyCycle0.p;
        this.q = keyCycle0.q;
        this.r = keyCycle0.r;
        this.s = keyCycle0.s;
        this.t = keyCycle0.t;
        this.u = keyCycle0.u;
        this.v = keyCycle0.v;
        this.w = keyCycle0.w;
        return this;
    }

    @Override  // androidx.constraintlayout.motion.widget.Key
    public void getAttributeNames(HashSet hashSet0) {
        if(!Float.isNaN(this.m)) {
            hashSet0.add("alpha");
        }
        if(!Float.isNaN(this.n)) {
            hashSet0.add("elevation");
        }
        if(!Float.isNaN(this.o)) {
            hashSet0.add("rotation");
        }
        if(!Float.isNaN(this.q)) {
            hashSet0.add("rotationX");
        }
        if(!Float.isNaN(this.r)) {
            hashSet0.add("rotationY");
        }
        if(!Float.isNaN(this.s)) {
            hashSet0.add("scaleX");
        }
        if(!Float.isNaN(this.t)) {
            hashSet0.add("scaleY");
        }
        if(!Float.isNaN(this.p)) {
            hashSet0.add("transitionPathRotate");
        }
        if(!Float.isNaN(this.u)) {
            hashSet0.add("translationX");
        }
        if(!Float.isNaN(this.v)) {
            hashSet0.add("translationY");
        }
        if(!Float.isNaN(this.w)) {
            hashSet0.add("translationZ");
        }
        if(this.d.size() > 0) {
            for(Object object0: this.d.keySet()) {
                hashSet0.add("CUSTOM," + ((String)object0));
            }
        }
    }

    public float getValue(String s) {
        s.getClass();
        switch(s) {
            case "alpha": {
                return this.m;
            }
            case "elevation": {
                return this.n;
            }
            case "progress": {
                return this.k;
            }
            case "rotation": {
                return this.o;
            }
            case "rotationX": {
                return this.q;
            }
            case "rotationY": {
                return this.r;
            }
            case "scaleX": {
                return this.s;
            }
            case "scaleY": {
                return this.t;
            }
            case "transitionPathRotate": {
                return this.p;
            }
            case "translationX": {
                return this.u;
            }
            case "translationY": {
                return this.v;
            }
            case "translationZ": {
                return this.w;
            }
            case "waveOffset": {
                return this.i;
            }
            case "wavePhase": {
                return this.j;
            }
            default: {
                if(!s.startsWith("CUSTOM")) {
                    Log.v("WARNING! KeyCycle", "  UNKNOWN  " + s);
                }
                return NaNf;
            }
        }
    }

    @Override  // androidx.constraintlayout.motion.widget.Key
    public void load(Context context0, AttributeSet attributeSet0) {
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.KeyCycle);
        int v = typedArray0.getIndexCount();
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = typedArray0.getIndex(v1);
            SparseIntArray sparseIntArray0 = b.a;
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
                    typedArray0.getString(v2);
                    break;
                }
                case 4: {
                    this.e = typedArray0.getInteger(v2, this.e);
                    break;
                }
                case 5: {
                    if(typedArray0.peekValue(v2).type == 3) {
                        this.g = typedArray0.getString(v2);
                        this.f = 7;
                    }
                    else {
                        this.f = typedArray0.getInt(v2, this.f);
                    }
                    break;
                }
                case 6: {
                    this.h = typedArray0.getFloat(v2, this.h);
                    break;
                }
                case 7: {
                    this.i = typedArray0.peekValue(v2).type == 5 ? typedArray0.getDimension(v2, this.i) : typedArray0.getFloat(v2, this.i);
                    break;
                }
                case 8: {
                    this.l = typedArray0.getInt(v2, this.l);
                    break;
                }
                case 9: {
                    this.m = typedArray0.getFloat(v2, this.m);
                    break;
                }
                case 10: {
                    this.n = typedArray0.getDimension(v2, this.n);
                    break;
                }
                case 11: {
                    this.o = typedArray0.getFloat(v2, this.o);
                    break;
                }
                case 12: {
                    this.q = typedArray0.getFloat(v2, this.q);
                    break;
                }
                case 13: {
                    this.r = typedArray0.getFloat(v2, this.r);
                    break;
                }
                case 14: {
                    this.p = typedArray0.getFloat(v2, this.p);
                    break;
                }
                case 15: {
                    this.s = typedArray0.getFloat(v2, this.s);
                    break;
                }
                case 16: {
                    this.t = typedArray0.getFloat(v2, this.t);
                    break;
                }
                case 17: {
                    this.u = typedArray0.getDimension(v2, this.u);
                    break;
                }
                case 18: {
                    this.v = typedArray0.getDimension(v2, this.v);
                    break;
                }
                case 19: {
                    this.w = typedArray0.getDimension(v2, this.w);
                    break;
                }
                case 20: {
                    this.k = typedArray0.getFloat(v2, this.k);
                    break;
                }
                case 21: {
                    this.j = typedArray0.getFloat(v2, this.j) / 360.0f;
                    break;
                }
                default: {
                    Log.e("KeyCycle", "unused attribute 0x" + Integer.toHexString(v2) + "   " + sparseIntArray0.get(v2));
                }
            }
        }
    }

    @Override  // androidx.constraintlayout.motion.widget.Key
    public void setValue(String s, Object object0) {
        s.getClass();
        switch(s) {
            case "alpha": {
                this.m = Key.a(object0);
                return;
            }
            case "curveFit": {
                this.e = Key.b(object0);
                return;
            }
            case "elevation": {
                this.n = Key.a(object0);
                return;
            }
            case "motionProgress": {
                this.k = Key.a(object0);
                return;
            }
            case "rotation": {
                this.o = Key.a(object0);
                return;
            }
            case "rotationX": {
                this.q = Key.a(object0);
                return;
            }
            case "rotationY": {
                this.r = Key.a(object0);
                return;
            }
            case "scaleX": {
                this.s = Key.a(object0);
                return;
            }
            case "scaleY": {
                this.t = Key.a(object0);
                return;
            }
            case "transitionEasing": {
                object0.toString();
                return;
            }
            case "transitionPathRotate": {
                this.p = Key.a(object0);
                return;
            }
            case "translationX": {
                this.u = Key.a(object0);
                return;
            }
            case "translationY": {
                this.v = Key.a(object0);
                return;
            }
            case "translationZ": {
                this.w = Key.a(object0);
                return;
            }
            case "waveOffset": {
                this.i = Key.a(object0);
                return;
            }
            case "wavePeriod": {
                this.h = Key.a(object0);
                return;
            }
            case "wavePhase": {
                this.j = Key.a(object0);
                return;
            }
            case "waveShape": {
                if(object0 instanceof Integer) {
                    this.f = Key.b(object0);
                    return;
                }
                this.f = 7;
                this.g = object0.toString();
            }
        }
    }
}

