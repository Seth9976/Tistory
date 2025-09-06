package x2;

import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.MotionWidget;
import androidx.constraintlayout.core.motion.utils.SplineSet.CustomSpline;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.core.motion.utils.Utils;
import java.util.HashMap;
import java.util.LinkedHashMap;

public final class b implements Comparable {
    public float a;
    public int b;
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
    public final LinkedHashMap m;

    public b() {
        this.a = 1.0f;
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = NaNf;
        this.i = NaNf;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = 0.0f;
        this.m = new LinkedHashMap();
    }

    public final void a(HashMap hashMap0, int v) {
        for(Object object0: hashMap0.keySet()) {
            String s = (String)object0;
            SplineSet splineSet0 = (SplineSet)hashMap0.get(s);
            s.getClass();
            float f = 1.0f;
            float f1 = 0.0f;
            switch(s) {
                case "alpha": {
                    if(!Float.isNaN(this.a)) {
                        f = this.a;
                    }
                    splineSet0.setPoint(v, f);
                    break;
                }
                case "pathRotate": {
                    splineSet0.setPoint(v, 0.0f);
                    break;
                }
                case "pivotX": {
                    if(!Float.isNaN(this.h)) {
                        f1 = this.h;
                    }
                    splineSet0.setPoint(v, f1);
                    break;
                }
                case "pivotY": {
                    if(!Float.isNaN(this.i)) {
                        f1 = this.i;
                    }
                    splineSet0.setPoint(v, f1);
                    break;
                }
                case "progress": {
                    splineSet0.setPoint(v, 0.0f);
                    break;
                }
                case "rotationX": {
                label_21:
                    if(!Float.isNaN(this.d)) {
                        f1 = this.d;
                    }
                    splineSet0.setPoint(v, f1);
                    break;
                }
                case "rotationY": {
                    if(!Float.isNaN(this.e)) {
                        f1 = this.e;
                    }
                    splineSet0.setPoint(v, f1);
                    break;
                }
                case "rotationZ": {
                    if(!Float.isNaN(this.c)) {
                        f1 = this.c;
                    }
                    splineSet0.setPoint(v, f1);
                    break;
                }
                case "scaleX": {
                    if(!Float.isNaN(this.f)) {
                        f = this.f;
                    }
                    splineSet0.setPoint(v, f);
                    break;
                }
                case "scaleY": {
                    if(!Float.isNaN(this.g)) {
                        f = this.g;
                    }
                    splineSet0.setPoint(v, f);
                    break;
                }
                case "translationX": {
                    if(!Float.isNaN(this.j)) {
                        f1 = this.j;
                    }
                    splineSet0.setPoint(v, f1);
                    break;
                }
                case "translationY": {
                    if(!Float.isNaN(this.k)) {
                        f1 = this.k;
                    }
                    splineSet0.setPoint(v, f1);
                    break;
                }
                case "translationZ": {
                    if(!Float.isNaN(this.l)) {
                        f1 = this.l;
                    }
                    splineSet0.setPoint(v, f1);
                    break;
                }
                default: {
                    if(s.startsWith("CUSTOM")) {
                        String s1 = s.split(",")[1];
                        LinkedHashMap linkedHashMap0 = this.m;
                        if(!linkedHashMap0.containsKey(s1)) {
                            continue;
                        }
                        CustomVariable customVariable0 = (CustomVariable)linkedHashMap0.get(s1);
                        if(splineSet0 instanceof CustomSpline) {
                            ((CustomSpline)splineSet0).setPoint(v, customVariable0);
                        }
                        else {
                            Utils.loge("MotionPaths", s + " ViewSpline not a CustomSet frame = " + v + ", value" + customVariable0.getValueToInterpolate() + splineSet0);
                        }
                        continue;
                    }
                    else {
                        Utils.loge("MotionPaths", "UNKNOWN spline " + s);
                        break;
                    }
                    goto label_21;
                }
            }
        }
    }

    public final void b(MotionWidget motionWidget0) {
        this.b = motionWidget0.getVisibility();
        this.a = motionWidget0.getVisibility() == 4 ? motionWidget0.getAlpha() : 0.0f;
        this.c = motionWidget0.getRotationZ();
        this.d = motionWidget0.getRotationX();
        this.e = motionWidget0.getRotationY();
        this.f = motionWidget0.getScaleX();
        this.g = motionWidget0.getScaleY();
        this.h = motionWidget0.getPivotX();
        this.i = motionWidget0.getPivotY();
        this.j = motionWidget0.getTranslationX();
        this.k = motionWidget0.getTranslationY();
        this.l = motionWidget0.getTranslationZ();
        for(Object object0: motionWidget0.getCustomAttributeNames()) {
            String s = (String)object0;
            CustomVariable customVariable0 = motionWidget0.getCustomAttribute(s);
            if(customVariable0 != null && customVariable0.isContinuous()) {
                this.m.put(s, customVariable0);
            }
        }
    }

    // 去混淆评级： 低(20)
    public static boolean c(float f, float f1) [...] // 潜在的解密器

    @Override
    public final int compareTo(Object object0) {
        ((b)object0).getClass();
        return 0;
    }
}

