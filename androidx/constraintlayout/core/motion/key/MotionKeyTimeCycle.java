package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet.CustomVarSet;
import androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet;
import androidx.constraintlayout.core.motion.utils.TypedValues.CycleType;
import androidx.constraintlayout.core.motion.utils.Utils;
import java.util.HashMap;
import java.util.HashSet;

public class MotionKeyTimeCycle extends MotionKey {
    public static final int KEY_TYPE = 3;
    public float a;
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
    public int m;
    public float n;
    public float o;

    public MotionKeyTimeCycle() {
        this.a = NaNf;
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
        this.m = 0;
        this.n = NaNf;
        this.o = 0.0f;
        this.mType = 3;
        this.mCustom = new HashMap();
    }

    public void addTimeValues(HashMap hashMap0) {
        for(Object object0: hashMap0.keySet()) {
            String s = (String)object0;
            TimeCycleSplineSet timeCycleSplineSet0 = (TimeCycleSplineSet)hashMap0.get(s);
            if(timeCycleSplineSet0 == null) {
            }
            else if(s.startsWith("CUSTOM")) {
                CustomVariable customVariable0 = (CustomVariable)this.mCustom.get(s.substring(7));
                if(customVariable0 == null) {
                    continue;
                }
                ((CustomVarSet)timeCycleSplineSet0).setPoint(this.mFramePosition, customVariable0, this.n, this.m, this.o);
            }
            else {
                switch(s) {
                    case "alpha": {
                        if(Float.isNaN(this.a)) {
                            continue;
                        }
                        timeCycleSplineSet0.setPoint(this.mFramePosition, this.a, this.n, this.m, this.o);
                        continue;
                    }
                    case "elevation": {
                        if(Float.isNaN(this.k)) {
                            continue;
                        }
                        timeCycleSplineSet0.setPoint(this.mFramePosition, this.k, this.n, this.m, this.o);
                        continue;
                    }
                    case "pathRotate": {
                        if(!Float.isNaN(this.f)) {
                            break;
                        }
                        continue;
                    }
                    case "progress": {
                        if(Float.isNaN(this.l)) {
                            continue;
                        }
                        timeCycleSplineSet0.setPoint(this.mFramePosition, this.l, this.n, this.m, this.o);
                        continue;
                    }
                    case "rotationX": {
                        if(Float.isNaN(this.d)) {
                            continue;
                        }
                        timeCycleSplineSet0.setPoint(this.mFramePosition, this.d, this.n, this.m, this.o);
                        continue;
                    }
                    case "rotationY": {
                        if(Float.isNaN(this.e)) {
                            continue;
                        }
                        timeCycleSplineSet0.setPoint(this.mFramePosition, this.e, this.n, this.m, this.o);
                        continue;
                    }
                    case "rotationZ": {
                        if(Float.isNaN(this.c)) {
                            continue;
                        }
                        timeCycleSplineSet0.setPoint(this.mFramePosition, this.c, this.n, this.m, this.o);
                        continue;
                    }
                    case "scaleX": {
                        if(Float.isNaN(this.g)) {
                            continue;
                        }
                        timeCycleSplineSet0.setPoint(this.mFramePosition, this.g, this.n, this.m, this.o);
                        continue;
                    }
                    case "scaleY": {
                        if(Float.isNaN(this.h)) {
                            continue;
                        }
                        timeCycleSplineSet0.setPoint(this.mFramePosition, this.h, this.n, this.m, this.o);
                        continue;
                    }
                    case "translationX": {
                        if(Float.isNaN(this.i)) {
                            continue;
                        }
                        timeCycleSplineSet0.setPoint(this.mFramePosition, this.i, this.n, this.m, this.o);
                        continue;
                    }
                    case "translationY": {
                        if(Float.isNaN(this.j)) {
                            continue;
                        }
                        timeCycleSplineSet0.setPoint(this.mFramePosition, this.j, this.n, this.m, this.o);
                        continue;
                    }
                    case "translationZ": {
                        if(Float.isNaN(this.k)) {
                            continue;
                        }
                        timeCycleSplineSet0.setPoint(this.mFramePosition, this.k, this.n, this.m, this.o);
                        continue;
                    }
                    default: {
                        Utils.loge("KeyTimeCycles", "UNKNOWN addValues \"" + s + "\"");
                        continue;
                    }
                }
                timeCycleSplineSet0.setPoint(this.mFramePosition, this.f, this.n, this.m, this.o);
            }
        }
    }

    @Override  // androidx.constraintlayout.core.motion.key.MotionKey
    public void addValues(HashMap hashMap0) {
    }

    @Override  // androidx.constraintlayout.core.motion.key.MotionKey
    public MotionKey clone() {
        return new MotionKeyTimeCycle().copy(this);
    }

    @Override  // androidx.constraintlayout.core.motion.key.MotionKey
    public Object clone() throws CloneNotSupportedException {
        return this.clone();
    }

    @Override  // androidx.constraintlayout.core.motion.key.MotionKey
    public MotionKey copy(MotionKey motionKey0) {
        return this.copy(motionKey0);
    }

    public MotionKeyTimeCycle copy(MotionKey motionKey0) {
        super.copy(motionKey0);
        ((MotionKeyTimeCycle)motionKey0).getClass();
        this.m = ((MotionKeyTimeCycle)motionKey0).m;
        this.n = ((MotionKeyTimeCycle)motionKey0).n;
        this.o = ((MotionKeyTimeCycle)motionKey0).o;
        this.l = ((MotionKeyTimeCycle)motionKey0).l;
        this.a = ((MotionKeyTimeCycle)motionKey0).a;
        this.b = ((MotionKeyTimeCycle)motionKey0).b;
        this.c = ((MotionKeyTimeCycle)motionKey0).c;
        this.f = ((MotionKeyTimeCycle)motionKey0).f;
        this.d = ((MotionKeyTimeCycle)motionKey0).d;
        this.e = ((MotionKeyTimeCycle)motionKey0).e;
        this.g = ((MotionKeyTimeCycle)motionKey0).g;
        this.h = ((MotionKeyTimeCycle)motionKey0).h;
        this.i = ((MotionKeyTimeCycle)motionKey0).i;
        this.j = ((MotionKeyTimeCycle)motionKey0).j;
        this.k = ((MotionKeyTimeCycle)motionKey0).k;
        return this;
    }

    @Override  // androidx.constraintlayout.core.motion.key.MotionKey
    public void getAttributeNames(HashSet hashSet0) {
        if(!Float.isNaN(this.a)) {
            hashSet0.add("alpha");
        }
        if(!Float.isNaN(this.b)) {
            hashSet0.add("elevation");
        }
        if(!Float.isNaN(this.c)) {
            hashSet0.add("rotationZ");
        }
        if(!Float.isNaN(this.d)) {
            hashSet0.add("rotationX");
        }
        if(!Float.isNaN(this.e)) {
            hashSet0.add("rotationY");
        }
        if(!Float.isNaN(this.g)) {
            hashSet0.add("scaleX");
        }
        if(!Float.isNaN(this.h)) {
            hashSet0.add("scaleY");
        }
        if(!Float.isNaN(this.f)) {
            hashSet0.add("pathRotate");
        }
        if(!Float.isNaN(this.i)) {
            hashSet0.add("translationX");
        }
        if(!Float.isNaN(this.j)) {
            hashSet0.add("translationY");
        }
        if(!Float.isNaN(this.k)) {
            hashSet0.add("translationZ");
        }
        if(this.mCustom.size() > 0) {
            for(Object object0: this.mCustom.keySet()) {
                hashSet0.add("CUSTOM," + ((String)object0));
            }
        }
    }

    @Override  // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(String s) {
        return CycleType.getId(s);
    }

    @Override  // androidx.constraintlayout.core.motion.key.MotionKey
    public boolean setValue(int v, float f) {
        switch(v) {
            case 304: {
                this.i = f;
                return true;
            }
            case 305: {
                this.j = f;
                return true;
            }
            case 306: {
                this.k = f;
                return true;
            }
            case 307: {
                this.b = f;
                return true;
            }
            case 308: {
                this.d = f;
                return true;
            }
            case 309: {
                this.e = f;
                return true;
            }
            case 310: {
                this.c = f;
                return true;
            }
            case 311: {
                this.g = f;
                return true;
            }
            case 312: {
                this.h = f;
                return true;
            }
            case 315: {
                this.l = f;
                return true;
            }
            case 401: {
                Integer.parseInt(f.toString());
                return true;
            }
            case 403: {
                this.a = f;
                return true;
            }
            case 0x1A0: {
                this.f = f;
                return true;
            }
            case 423: {
                this.n = f;
                return true;
            }
            case 424: {
                this.o = f;
                return true;
            }
            default: {
                return super.setValue(v, f);
            }
        }
    }

    @Override  // androidx.constraintlayout.core.motion.key.MotionKey
    public boolean setValue(int v, int v1) {
        switch(v) {
            case 100: {
                this.mFramePosition = v1;
                return true;
            }
            case 421: {
                this.m = v1;
                return true;
            }
            default: {
                return super.setValue(v, v1);
            }
        }
    }

    @Override  // androidx.constraintlayout.core.motion.key.MotionKey
    public boolean setValue(int v, String s) {
        if(v != 420) {
            if(v != 421) {
                return super.setValue(v, s);
            }
            this.m = 7;
        }
        return true;
    }

    @Override  // androidx.constraintlayout.core.motion.key.MotionKey
    public boolean setValue(int v, boolean z) {
        return super.setValue(v, z);
    }
}

