package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.utils.KeyCycleOscillator;
import androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType;
import androidx.constraintlayout.core.motion.utils.Utils;
import java.util.HashMap;
import java.util.HashSet;

public class MotionKeyCycle extends MotionKey {
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
    public int a;
    public String b;
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
    public float p;
    public float q;

    public MotionKeyCycle() {
        this.a = -1;
        this.b = null;
        this.c = NaNf;
        this.d = 0.0f;
        this.e = 0.0f;
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
        this.mType = 4;
        this.mCustom = new HashMap();
    }

    public void addCycleValues(HashMap hashMap0) {
        for(Object object0: hashMap0.keySet()) {
            String s = (String)object0;
            if(s.startsWith("CUSTOM")) {
                CustomVariable customVariable0 = (CustomVariable)this.mCustom.get(s.substring(7));
                if(customVariable0 == null || customVariable0.getType() != 901) {
                    continue;
                }
                KeyCycleOscillator keyCycleOscillator0 = (KeyCycleOscillator)hashMap0.get(s);
                if(keyCycleOscillator0 == null) {
                    continue;
                }
                keyCycleOscillator0.setPoint(this.mFramePosition, this.a, this.b, -1, this.c, this.d, this.e, customVariable0.getValueToInterpolate(), customVariable0);
            }
            else {
                float f = this.getValue(s);
                if(!Float.isNaN(f)) {
                    KeyCycleOscillator keyCycleOscillator1 = (KeyCycleOscillator)hashMap0.get(s);
                    if(keyCycleOscillator1 != null) {
                        keyCycleOscillator1.setPoint(this.mFramePosition, this.a, this.b, -1, this.c, this.d, this.e, f);
                    }
                }
            }
        }
    }

    @Override  // androidx.constraintlayout.core.motion.key.MotionKey
    public void addValues(HashMap hashMap0) {
    }

    @Override  // androidx.constraintlayout.core.motion.key.MotionKey
    public MotionKey clone() [...] // Inlined contents

    @Override  // androidx.constraintlayout.core.motion.key.MotionKey
    public Object clone() throws CloneNotSupportedException {
        return null;
    }

    public void dump() {
        System.out.println("MotionKeyCycle{mWaveShape=" + this.a + ", mWavePeriod=" + this.c + ", mWaveOffset=" + this.d + ", mWavePhase=" + this.e + ", mRotation=" + this.i + '}');
    }

    @Override  // androidx.constraintlayout.core.motion.key.MotionKey
    public void getAttributeNames(HashSet hashSet0) {
        if(!Float.isNaN(this.g)) {
            hashSet0.add("alpha");
        }
        if(!Float.isNaN(this.h)) {
            hashSet0.add("elevation");
        }
        if(!Float.isNaN(this.i)) {
            hashSet0.add("rotationZ");
        }
        if(!Float.isNaN(this.k)) {
            hashSet0.add("rotationX");
        }
        if(!Float.isNaN(this.l)) {
            hashSet0.add("rotationY");
        }
        if(!Float.isNaN(this.m)) {
            hashSet0.add("scaleX");
        }
        if(!Float.isNaN(this.n)) {
            hashSet0.add("scaleY");
        }
        if(!Float.isNaN(this.j)) {
            hashSet0.add("pathRotate");
        }
        if(!Float.isNaN(this.o)) {
            hashSet0.add("translationX");
        }
        if(!Float.isNaN(this.p)) {
            hashSet0.add("translationY");
        }
        if(!Float.isNaN(this.q)) {
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
        s.getClass();
        switch(s) {
            case "alpha": {
                return 403;
            }
            case "curveFit": {
                return 401;
            }
            case "customWave": {
                return 422;
            }
            case "easing": {
                return 420;
            }
            case "offset": {
                return 424;
            }
            case "pathRotate": {
                return 0x1A0;
            }
            case "period": {
                return 423;
            }
            case "phase": {
                return 425;
            }
            case "pivotX": {
                return 313;
            }
            case "pivotY": {
                return 314;
            }
            case "progress": {
                return 315;
            }
            case "rotationX": {
                return 308;
            }
            case "rotationY": {
                return 309;
            }
            case "rotationZ": {
                return 310;
            }
            case "scaleX": {
                return 311;
            }
            case "scaleY": {
                return 312;
            }
            case "translationX": {
                return 304;
            }
            case "translationY": {
                return 305;
            }
            case "translationZ": {
                return 306;
            }
            case "visibility": {
                return 402;
            }
            case "waveShape": {
                return 421;
            }
            default: {
                return -1;
            }
        }
    }

    public float getValue(String s) {
        s.getClass();
        switch(s) {
            case "alpha": {
                return this.g;
            }
            case "elevation": {
                return this.h;
            }
            case "offset": {
                return this.d;
            }
            case "pathRotate": {
                return this.j;
            }
            case "phase": {
                return this.e;
            }
            case "progress": {
                return this.f;
            }
            case "rotationX": {
                return this.k;
            }
            case "rotationY": {
                return this.l;
            }
            case "rotationZ": {
                return this.i;
            }
            case "scaleX": {
                return this.m;
            }
            case "scaleY": {
                return this.n;
            }
            case "translationX": {
                return this.o;
            }
            case "translationY": {
                return this.p;
            }
            case "translationZ": {
                return this.q;
            }
            default: {
                return NaNf;
            }
        }
    }

    public void printAttributes() {
        HashSet hashSet0 = new HashSet();
        this.getAttributeNames(hashSet0);
        Utils.log((" ------------- " + this.mFramePosition + " -------------"));
        Utils.log(("MotionKeyCycle{Shape=" + this.a + ", Period=" + this.c + ", Offset=" + this.d + ", Phase=" + this.e + '}'));
        String[] arr_s = (String[])hashSet0.toArray(new String[0]);
        for(int v = 0; v < arr_s.length; ++v) {
            AttributesType.getId(arr_s[v]);
            Utils.log((arr_s[v] + ":" + this.getValue(arr_s[v])));
        }
    }

    @Override  // androidx.constraintlayout.core.motion.key.MotionKey
    public boolean setValue(int v, float f) {
        switch(v) {
            case 304: {
                this.o = f;
                return true;
            }
            case 305: {
                this.p = f;
                return true;
            }
            case 306: {
                this.q = f;
                return true;
            }
            case 307: {
                this.h = f;
                return true;
            }
            case 308: {
                this.k = f;
                return true;
            }
            case 309: {
                this.l = f;
                return true;
            }
            case 310: {
                this.i = f;
                return true;
            }
            case 311: {
                this.m = f;
                return true;
            }
            case 312: {
                this.n = f;
                return true;
            }
            case 315: {
                this.f = f;
                return true;
            }
            case 403: {
                this.g = f;
                return true;
            }
            case 0x1A0: {
                this.j = f;
                return true;
            }
            case 423: {
                this.c = f;
                return true;
            }
            case 424: {
                this.d = f;
                return true;
            }
            case 425: {
                this.e = f;
                return true;
            }
            default: {
                return super.setValue(v, f);
            }
        }
    }

    @Override  // androidx.constraintlayout.core.motion.key.MotionKey
    public boolean setValue(int v, int v1) {
        if(v != 401) {
            if(v != 421) {
                return this.setValue(v, ((float)v1)) ? true : super.setValue(v, v1);
            }
            this.a = v1;
        }
        return true;
    }

    @Override  // androidx.constraintlayout.core.motion.key.MotionKey
    public boolean setValue(int v, String s) {
        if(v != 420) {
            if(v != 422) {
                return super.setValue(v, s);
            }
            this.b = s;
        }
        return true;
    }
}

