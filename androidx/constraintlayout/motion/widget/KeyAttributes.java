package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.motion.utils.ViewSpline.CustomSet;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.R.styleable;
import java.util.HashMap;
import java.util.HashSet;

public class KeyAttributes extends Key {
    public static final int KEY_TYPE = 1;
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
    public float r;
    public float s;

    public KeyAttributes() {
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
        this.r = NaNf;
        this.s = NaNf;
        this.mType = 1;
        this.d = new HashMap();
    }

    @Override  // androidx.constraintlayout.motion.widget.Key
    public void addValues(HashMap hashMap0) {
        for(Object object0: hashMap0.keySet()) {
            String s = (String)object0;
            SplineSet splineSet0 = (SplineSet)hashMap0.get(s);
            if(splineSet0 == null) {
            }
            else if(s.startsWith("CUSTOM")) {
                ConstraintAttribute constraintAttribute0 = (ConstraintAttribute)this.d.get(s.substring(7));
                if(constraintAttribute0 == null) {
                    continue;
                }
                ((CustomSet)splineSet0).setPoint(this.a, constraintAttribute0);
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
                        splineSet0.setPoint(this.a, this.g);
                        continue;
                    }
                    case "progress": {
                        if(Float.isNaN(this.s)) {
                            continue;
                        }
                        splineSet0.setPoint(this.a, this.s);
                        continue;
                    }
                    case "rotation": {
                        if(Float.isNaN(this.h)) {
                            continue;
                        }
                        splineSet0.setPoint(this.a, this.h);
                        continue;
                    }
                    case "rotationX": {
                        if(Float.isNaN(this.i)) {
                            continue;
                        }
                        splineSet0.setPoint(this.a, this.i);
                        continue;
                    }
                    case "rotationY": {
                        if(Float.isNaN(this.j)) {
                            continue;
                        }
                        splineSet0.setPoint(this.a, this.j);
                        continue;
                    }
                    case "scaleX": {
                        if(Float.isNaN(this.n)) {
                            continue;
                        }
                        splineSet0.setPoint(this.a, this.n);
                        continue;
                    }
                    case "scaleY": {
                        if(Float.isNaN(this.o)) {
                            continue;
                        }
                        splineSet0.setPoint(this.a, this.o);
                        continue;
                    }
                    case "transformPivotX": {
                        if(Float.isNaN(this.i)) {
                            continue;
                        }
                        splineSet0.setPoint(this.a, this.k);
                        continue;
                    }
                    case "transformPivotY": {
                        if(Float.isNaN(this.j)) {
                            continue;
                        }
                        splineSet0.setPoint(this.a, this.l);
                        continue;
                    }
                    case "transitionPathRotate": {
                        if(Float.isNaN(this.m)) {
                            continue;
                        }
                        splineSet0.setPoint(this.a, this.m);
                        continue;
                    }
                    case "translationX": {
                        if(Float.isNaN(this.p)) {
                            continue;
                        }
                        splineSet0.setPoint(this.a, this.p);
                        continue;
                    }
                    case "translationY": {
                        if(Float.isNaN(this.q)) {
                            continue;
                        }
                        splineSet0.setPoint(this.a, this.q);
                        continue;
                    }
                    case "translationZ": {
                        if(Float.isNaN(this.r)) {
                            continue;
                        }
                        splineSet0.setPoint(this.a, this.r);
                        continue;
                    }
                    default: {
                        continue;
                    }
                }
                splineSet0.setPoint(this.a, this.f);
            }
        }
    }

    @Override  // androidx.constraintlayout.motion.widget.Key
    public Key clone() {
        return new KeyAttributes().copy(this);
    }

    @Override  // androidx.constraintlayout.motion.widget.Key
    public Object clone() throws CloneNotSupportedException {
        return this.clone();
    }

    @Override  // androidx.constraintlayout.motion.widget.Key
    public Key copy(Key key0) {
        super.copy(key0);
        this.e = ((KeyAttributes)key0).e;
        this.f = ((KeyAttributes)key0).f;
        this.g = ((KeyAttributes)key0).g;
        this.h = ((KeyAttributes)key0).h;
        this.i = ((KeyAttributes)key0).i;
        this.j = ((KeyAttributes)key0).j;
        this.k = ((KeyAttributes)key0).k;
        this.l = ((KeyAttributes)key0).l;
        this.m = ((KeyAttributes)key0).m;
        this.n = ((KeyAttributes)key0).n;
        this.o = ((KeyAttributes)key0).o;
        this.p = ((KeyAttributes)key0).p;
        this.q = ((KeyAttributes)key0).q;
        this.r = ((KeyAttributes)key0).r;
        this.s = ((KeyAttributes)key0).s;
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
        if(!Float.isNaN(this.k)) {
            hashSet0.add("transformPivotX");
        }
        if(!Float.isNaN(this.l)) {
            hashSet0.add("transformPivotY");
        }
        if(!Float.isNaN(this.p)) {
            hashSet0.add("translationX");
        }
        if(!Float.isNaN(this.q)) {
            hashSet0.add("translationY");
        }
        if(!Float.isNaN(this.r)) {
            hashSet0.add("translationZ");
        }
        if(!Float.isNaN(this.m)) {
            hashSet0.add("transitionPathRotate");
        }
        if(!Float.isNaN(this.n)) {
            hashSet0.add("scaleX");
        }
        if(!Float.isNaN(this.o)) {
            hashSet0.add("scaleY");
        }
        if(!Float.isNaN(this.s)) {
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
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.KeyAttribute);
        int v = typedArray0.getIndexCount();
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = typedArray0.getIndex(v1);
            SparseIntArray sparseIntArray0 = a.a;
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
                    this.n = typedArray0.getFloat(v2, this.n);
                    break;
                }
                case 8: {
                    this.m = typedArray0.getFloat(v2, this.m);
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
                    this.o = typedArray0.getFloat(v2, this.o);
                    break;
                }
                case 15: {
                    this.p = typedArray0.getDimension(v2, this.p);
                    break;
                }
                case 16: {
                    this.q = typedArray0.getDimension(v2, this.q);
                    break;
                }
                case 17: {
                    this.r = typedArray0.getDimension(v2, this.r);
                    break;
                }
                case 18: {
                    this.s = typedArray0.getFloat(v2, this.s);
                    break;
                }
                case 19: {
                    this.k = typedArray0.getDimension(v2, this.k);
                    break;
                }
                case 20: {
                    this.l = typedArray0.getDimension(v2, this.l);
                    break;
                }
                default: {
                    Log.e("KeyAttribute", "unused attribute 0x" + Integer.toHexString(v2) + "   " + sparseIntArray0.get(v2));
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
        if(!Float.isNaN(this.k)) {
            hashMap0.put("transformPivotX", this.e);
        }
        if(!Float.isNaN(this.l)) {
            hashMap0.put("transformPivotY", this.e);
        }
        if(!Float.isNaN(this.p)) {
            hashMap0.put("translationX", this.e);
        }
        if(!Float.isNaN(this.q)) {
            hashMap0.put("translationY", this.e);
        }
        if(!Float.isNaN(this.r)) {
            hashMap0.put("translationZ", this.e);
        }
        if(!Float.isNaN(this.m)) {
            hashMap0.put("transitionPathRotate", this.e);
        }
        if(!Float.isNaN(this.n)) {
            hashMap0.put("scaleX", this.e);
        }
        if(!Float.isNaN(this.o)) {
            hashMap0.put("scaleY", this.e);
        }
        if(!Float.isNaN(this.s)) {
            hashMap0.put("progress", this.e);
        }
        if(this.d.size() > 0) {
            for(Object object0: this.d.keySet()) {
                hashMap0.put(androidx.room.a.j("CUSTOM,", ((String)object0)), this.e);
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
                this.s = Key.a(object0);
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
                this.n = Key.a(object0);
                return;
            }
            case "scaleY": {
                this.o = Key.a(object0);
                return;
            }
            case "transformPivotX": {
                this.k = Key.a(object0);
                return;
            }
            case "transformPivotY": {
                this.l = Key.a(object0);
                return;
            }
            case "transitionEasing": {
                object0.toString();
                return;
            }
            case "transitionPathRotate": {
                this.m = Key.a(object0);
                return;
            }
            case "translationX": {
                this.p = Key.a(object0);
                return;
            }
            case "translationY": {
                this.q = Key.a(object0);
                return;
            }
            case "translationZ": {
                this.r = Key.a(object0);
                return;
            }
            case "visibility": {
                if(object0 instanceof Boolean) {
                    ((Boolean)object0).booleanValue();
                    return;
                }
                object0.toString();
            }
        }
    }
}

