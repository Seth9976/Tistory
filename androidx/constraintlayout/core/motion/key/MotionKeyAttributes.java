package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.utils.SplineSet.CustomSpline;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType;
import androidx.room.a;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.HashSet;

public class MotionKeyAttributes extends MotionKey {
    public static final int KEY_TYPE = 1;
    public int a;
    public float b;
    public float c;
    public float d;
    public float e;
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

    public MotionKeyAttributes() {
        this.a = -1;
        this.b = NaNf;
        this.c = NaNf;
        this.d = NaNf;
        this.e = NaNf;
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
        this.mType = 1;
        this.mCustom = new HashMap();
    }

    @Override  // androidx.constraintlayout.core.motion.key.MotionKey
    public void addValues(HashMap hashMap0) {
        for(Object object0: hashMap0.keySet()) {
            String s = (String)object0;
            SplineSet splineSet0 = (SplineSet)hashMap0.get(s);
            if(splineSet0 == null) {
            }
            else if(s.startsWith("CUSTOM")) {
                CustomVariable customVariable0 = (CustomVariable)this.mCustom.get(s.substring(7));
                if(customVariable0 == null) {
                    continue;
                }
                ((CustomSpline)splineSet0).setPoint(this.mFramePosition, customVariable0);
            }
            else {
                switch(s) {
                    case "alpha": {
                        if(Float.isNaN(this.b)) {
                            continue;
                        }
                        splineSet0.setPoint(this.mFramePosition, this.b);
                        continue;
                    }
                    case "elevation": {
                        if(Float.isNaN(this.c)) {
                            continue;
                        }
                        splineSet0.setPoint(this.mFramePosition, this.c);
                        continue;
                    }
                    case "pathRotate": {
                        if(!Float.isNaN(this.i)) {
                            break;
                        }
                        continue;
                    }
                    case "pivotX": {
                        if(Float.isNaN(this.e)) {
                            continue;
                        }
                        splineSet0.setPoint(this.mFramePosition, this.g);
                        continue;
                    }
                    case "pivotY": {
                        if(Float.isNaN(this.f)) {
                            continue;
                        }
                        splineSet0.setPoint(this.mFramePosition, this.h);
                        continue;
                    }
                    case "progress": {
                        if(Float.isNaN(this.o)) {
                            continue;
                        }
                        splineSet0.setPoint(this.mFramePosition, this.o);
                        continue;
                    }
                    case "rotationX": {
                        if(Float.isNaN(this.e)) {
                            continue;
                        }
                        splineSet0.setPoint(this.mFramePosition, this.e);
                        continue;
                    }
                    case "rotationY": {
                        if(Float.isNaN(this.f)) {
                            continue;
                        }
                        splineSet0.setPoint(this.mFramePosition, this.f);
                        continue;
                    }
                    case "rotationZ": {
                        if(Float.isNaN(this.d)) {
                            continue;
                        }
                        splineSet0.setPoint(this.mFramePosition, this.d);
                        continue;
                    }
                    case "scaleX": {
                        if(Float.isNaN(this.j)) {
                            continue;
                        }
                        splineSet0.setPoint(this.mFramePosition, this.j);
                        continue;
                    }
                    case "scaleY": {
                        if(Float.isNaN(this.k)) {
                            continue;
                        }
                        splineSet0.setPoint(this.mFramePosition, this.k);
                        continue;
                    }
                    case "translationX": {
                        if(Float.isNaN(this.l)) {
                            continue;
                        }
                        splineSet0.setPoint(this.mFramePosition, this.l);
                        continue;
                    }
                    case "translationY": {
                        if(Float.isNaN(this.m)) {
                            continue;
                        }
                        splineSet0.setPoint(this.mFramePosition, this.m);
                        continue;
                    }
                    case "translationZ": {
                        if(Float.isNaN(this.n)) {
                            continue;
                        }
                        splineSet0.setPoint(this.mFramePosition, this.n);
                        continue;
                    }
                    default: {
                        System.err.println("not supported by KeyAttributes " + s);
                        continue;
                    }
                }
                splineSet0.setPoint(this.mFramePosition, this.i);
            }
        }
    }

    @Override  // androidx.constraintlayout.core.motion.key.MotionKey
    public MotionKey clone() [...] // Inlined contents

    @Override  // androidx.constraintlayout.core.motion.key.MotionKey
    public Object clone() throws CloneNotSupportedException {
        return null;
    }

    @Override  // androidx.constraintlayout.core.motion.key.MotionKey
    public void getAttributeNames(HashSet hashSet0) {
        if(!Float.isNaN(this.b)) {
            hashSet0.add("alpha");
        }
        if(!Float.isNaN(this.c)) {
            hashSet0.add("elevation");
        }
        if(!Float.isNaN(this.d)) {
            hashSet0.add("rotationZ");
        }
        if(!Float.isNaN(this.e)) {
            hashSet0.add("rotationX");
        }
        if(!Float.isNaN(this.f)) {
            hashSet0.add("rotationY");
        }
        if(!Float.isNaN(this.g)) {
            hashSet0.add("pivotX");
        }
        if(!Float.isNaN(this.h)) {
            hashSet0.add("pivotY");
        }
        if(!Float.isNaN(this.l)) {
            hashSet0.add("translationX");
        }
        if(!Float.isNaN(this.m)) {
            hashSet0.add("translationY");
        }
        if(!Float.isNaN(this.n)) {
            hashSet0.add("translationZ");
        }
        if(!Float.isNaN(this.i)) {
            hashSet0.add("pathRotate");
        }
        if(!Float.isNaN(this.j)) {
            hashSet0.add("scaleX");
        }
        if(!Float.isNaN(this.k)) {
            hashSet0.add("scaleY");
        }
        if(!Float.isNaN(this.o)) {
            hashSet0.add("progress");
        }
        if(this.mCustom.size() > 0) {
            for(Object object0: this.mCustom.keySet()) {
                hashSet0.add("CUSTOM," + ((String)object0));
            }
        }
    }

    public int getCurveFit() {
        return this.a;
    }

    @Override  // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(String s) {
        return AttributesType.getId(s);
    }

    public void printAttributes() {
        float f;
        HashSet hashSet0 = new HashSet();
        this.getAttributeNames(hashSet0);
        System.out.println(" ------------- " + this.mFramePosition + " -------------");
        String[] arr_s = (String[])hashSet0.toArray(new String[0]);
        for(int v = 0; v < arr_s.length; ++v) {
            int v1 = AttributesType.getId(arr_s[v]);
            PrintStream printStream0 = System.out;
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append(arr_s[v]);
            stringBuilder0.append(":");
            if(v1 == 100) {
                f = (float)this.mFramePosition;
            }
            else {
                switch(v1) {
                    case 303: {
                        f = this.b;
                        break;
                    }
                    case 304: {
                        f = this.l;
                        break;
                    }
                    case 305: {
                        f = this.m;
                        break;
                    }
                    case 306: {
                        f = this.n;
                        break;
                    }
                    case 307: {
                        f = this.c;
                        break;
                    }
                    case 308: {
                        f = this.e;
                        break;
                    }
                    case 309: {
                        f = this.f;
                        break;
                    }
                    case 310: {
                        f = this.d;
                        break;
                    }
                    case 311: {
                        f = this.j;
                        break;
                    }
                    case 312: {
                        f = this.k;
                        break;
                    }
                    case 313: {
                        f = this.g;
                        break;
                    }
                    case 314: {
                        f = this.h;
                        break;
                    }
                    case 315: {
                        f = this.o;
                        break;
                    }
                    case 316: {
                        f = this.i;
                        break;
                    }
                    default: {
                        f = NaNf;
                    }
                }
            }
            stringBuilder0.append(f);
            printStream0.println(stringBuilder0.toString());
        }
    }

    @Override  // androidx.constraintlayout.core.motion.key.MotionKey
    public void setInterpolation(HashMap hashMap0) {
        if(!Float.isNaN(this.b)) {
            hashMap0.put("alpha", this.a);
        }
        if(!Float.isNaN(this.c)) {
            hashMap0.put("elevation", this.a);
        }
        if(!Float.isNaN(this.d)) {
            hashMap0.put("rotationZ", this.a);
        }
        if(!Float.isNaN(this.e)) {
            hashMap0.put("rotationX", this.a);
        }
        if(!Float.isNaN(this.f)) {
            hashMap0.put("rotationY", this.a);
        }
        if(!Float.isNaN(this.g)) {
            hashMap0.put("pivotX", this.a);
        }
        if(!Float.isNaN(this.h)) {
            hashMap0.put("pivotY", this.a);
        }
        if(!Float.isNaN(this.l)) {
            hashMap0.put("translationX", this.a);
        }
        if(!Float.isNaN(this.m)) {
            hashMap0.put("translationY", this.a);
        }
        if(!Float.isNaN(this.n)) {
            hashMap0.put("translationZ", this.a);
        }
        if(!Float.isNaN(this.i)) {
            hashMap0.put("pathRotate", this.a);
        }
        if(!Float.isNaN(this.j)) {
            hashMap0.put("scaleX", this.a);
        }
        if(!Float.isNaN(this.k)) {
            hashMap0.put("scaleY", this.a);
        }
        if(!Float.isNaN(this.o)) {
            hashMap0.put("progress", this.a);
        }
        if(this.mCustom.size() > 0) {
            for(Object object0: this.mCustom.keySet()) {
                hashMap0.put(a.j("CUSTOM,", ((String)object0)), this.a);
            }
        }
    }

    @Override  // androidx.constraintlayout.core.motion.key.MotionKey
    public boolean setValue(int v, float f) {
        if(v != 100) {
            switch(v) {
                case 303: {
                    this.b = f;
                    return true;
                }
                case 304: {
                    this.l = f;
                    return true;
                }
                case 305: {
                    this.m = f;
                    return true;
                }
                case 306: {
                    this.n = f;
                    return true;
                }
                case 307: {
                    this.c = f;
                    return true;
                }
                case 308: {
                    this.e = f;
                    return true;
                }
                case 309: {
                    this.f = f;
                    return true;
                }
                case 310: {
                    this.d = f;
                    return true;
                }
                case 311: {
                    this.j = f;
                    return true;
                }
                case 312: {
                    this.k = f;
                    return true;
                }
                case 313: {
                    this.g = f;
                    return true;
                }
                case 314: {
                    this.h = f;
                    return true;
                }
                case 315: {
                    this.o = f;
                    return true;
                }
                case 316: {
                    this.i = f;
                    return true;
                }
                default: {
                    return super.setValue(v, f);
                }
            }
        }
        this.i = f;
        return true;
    }

    @Override  // androidx.constraintlayout.core.motion.key.MotionKey
    public boolean setValue(int v, int v1) {
        switch(v) {
            case 100: {
                this.mFramePosition = v1;
                break;
            }
            case 301: {
                this.a = v1;
                return true;
            }
            case 302: {
                break;
            }
            default: {
                return this.setValue(v, v1) ? true : super.setValue(v, v1);
            }
        }
        return true;
    }

    @Override  // androidx.constraintlayout.core.motion.key.MotionKey
    public boolean setValue(int v, String s) {
        return v == 101 || v == 317 ? true : super.setValue(v, s);
    }
}

