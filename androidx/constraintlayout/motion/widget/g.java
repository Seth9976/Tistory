package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.motion.utils.ViewSpline.CustomSet;
import androidx.constraintlayout.motion.utils.ViewSpline;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintSet.Constraint;
import androidx.constraintlayout.widget.ConstraintSet;
import java.util.HashMap;
import java.util.LinkedHashMap;

public final class g implements Comparable {
    public float a;
    public int b;
    public int c;
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
    public final LinkedHashMap q;

    public g() {
        this.a = 1.0f;
        this.b = 0;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 1.0f;
        this.i = 1.0f;
        this.j = NaNf;
        this.k = NaNf;
        this.l = 0.0f;
        this.m = 0.0f;
        this.n = 0.0f;
        this.o = NaNf;
        this.p = NaNf;
        this.q = new LinkedHashMap();
    }

    public final void a(HashMap hashMap0, int v) {
        for(Object object0: hashMap0.keySet()) {
            String s = (String)object0;
            ViewSpline viewSpline0 = (ViewSpline)hashMap0.get(s);
            s.getClass();
            float f = 1.0f;
            float f1 = 0.0f;
            switch(s) {
                case "alpha": {
                    if(!Float.isNaN(this.a)) {
                        f = this.a;
                    }
                    break;
                }
                case "elevation": {
                    if(!Float.isNaN(this.d)) {
                        f1 = this.d;
                    }
                    viewSpline0.setPoint(v, f1);
                    continue;
                }
                case "progress": {
                    if(!Float.isNaN(this.p)) {
                        f1 = this.p;
                    }
                    viewSpline0.setPoint(v, f1);
                    continue;
                }
                case "rotation": {
                    if(!Float.isNaN(this.e)) {
                        f1 = this.e;
                    }
                    viewSpline0.setPoint(v, f1);
                    continue;
                }
                case "rotationX": {
                    if(!Float.isNaN(this.f)) {
                        f1 = this.f;
                    }
                    viewSpline0.setPoint(v, f1);
                    continue;
                }
                case "rotationY": {
                    if(!Float.isNaN(this.g)) {
                        f1 = this.g;
                    }
                    viewSpline0.setPoint(v, f1);
                    continue;
                }
                case "scaleX": {
                    if(!Float.isNaN(this.h)) {
                        f = this.h;
                    }
                    viewSpline0.setPoint(v, f);
                    continue;
                }
                case "scaleY": {
                    if(!Float.isNaN(this.i)) {
                        f = this.i;
                    }
                    viewSpline0.setPoint(v, f);
                    continue;
                }
                case "transformPivotX": {
                    if(!Float.isNaN(this.j)) {
                        f1 = this.j;
                    }
                    viewSpline0.setPoint(v, f1);
                    continue;
                }
                case "transformPivotY": {
                    if(!Float.isNaN(this.k)) {
                        f1 = this.k;
                    }
                    viewSpline0.setPoint(v, f1);
                    continue;
                }
                case "transitionPathRotate": {
                    if(!Float.isNaN(this.o)) {
                        f1 = this.o;
                    }
                    viewSpline0.setPoint(v, f1);
                    continue;
                }
                case "translationX": {
                    if(!Float.isNaN(this.l)) {
                        f1 = this.l;
                    }
                    viewSpline0.setPoint(v, f1);
                    continue;
                }
                case "translationY": {
                    if(!Float.isNaN(this.m)) {
                        f1 = this.m;
                    }
                    viewSpline0.setPoint(v, f1);
                    continue;
                }
                case "translationZ": {
                    if(!Float.isNaN(this.n)) {
                        f1 = this.n;
                    }
                    viewSpline0.setPoint(v, f1);
                    continue;
                }
                default: {
                    if(s.startsWith("CUSTOM")) {
                        String s1 = s.split(",")[1];
                        LinkedHashMap linkedHashMap0 = this.q;
                        if(!linkedHashMap0.containsKey(s1)) {
                            continue;
                        }
                        ConstraintAttribute constraintAttribute0 = (ConstraintAttribute)linkedHashMap0.get(s1);
                        if(viewSpline0 instanceof CustomSet) {
                            ((CustomSet)viewSpline0).setPoint(v, constraintAttribute0);
                        }
                        else {
                            Log.e("MotionPaths", s + " ViewSpline not a CustomSet frame = " + v + ", value" + constraintAttribute0.getValueToInterpolate() + viewSpline0);
                        }
                    }
                    else {
                        Log.e("MotionPaths", "UNKNOWN spline " + s);
                    }
                    continue;
                }
            }
            viewSpline0.setPoint(v, f);
        }
    }

    public final void b(View view0) {
        this.c = view0.getVisibility();
        this.a = view0.getVisibility() == 0 ? view0.getAlpha() : 0.0f;
        this.d = view0.getElevation();
        this.e = view0.getRotation();
        this.f = view0.getRotationX();
        this.g = view0.getRotationY();
        this.h = view0.getScaleX();
        this.i = view0.getScaleY();
        this.j = view0.getPivotX();
        this.k = view0.getPivotY();
        this.l = view0.getTranslationX();
        this.m = view0.getTranslationY();
        this.n = view0.getTranslationZ();
    }

    // 去混淆评级： 低(20)
    public static boolean c(float f, float f1) {
        return Float.isNaN(f) || Float.isNaN(f1) ? Float.isNaN(f) != Float.isNaN(f1) : Math.abs(f - f1) > 0.000001f;
    }

    @Override
    public final int compareTo(Object object0) {
        ((g)object0).getClass();
        return 0;
    }

    public final void d(Rect rect0, ConstraintSet constraintSet0, int v, int v1) {
        rect0.width();
        rect0.height();
        Constraint constraintSet$Constraint0 = constraintSet0.getParameters(v1);
        this.b = constraintSet$Constraint0.propertySet.mVisibilityMode;
        this.c = constraintSet$Constraint0.propertySet.visibility;
        this.a = constraintSet$Constraint0.propertySet.visibility == 0 || constraintSet$Constraint0.propertySet.mVisibilityMode != 0 ? constraintSet$Constraint0.propertySet.alpha : 0.0f;
        this.d = constraintSet$Constraint0.transform.elevation;
        this.e = constraintSet$Constraint0.transform.rotation;
        this.f = constraintSet$Constraint0.transform.rotationX;
        this.g = constraintSet$Constraint0.transform.rotationY;
        this.h = constraintSet$Constraint0.transform.scaleX;
        this.i = constraintSet$Constraint0.transform.scaleY;
        this.j = constraintSet$Constraint0.transform.transformPivotX;
        this.k = constraintSet$Constraint0.transform.transformPivotY;
        this.l = constraintSet$Constraint0.transform.translationX;
        this.m = constraintSet$Constraint0.transform.translationY;
        this.n = constraintSet$Constraint0.transform.translationZ;
        Easing.getInterpolator(constraintSet$Constraint0.motion.mTransitionEasing);
        this.o = constraintSet$Constraint0.motion.mPathRotate;
        this.p = constraintSet$Constraint0.propertySet.mProgress;
        for(Object object0: constraintSet$Constraint0.mCustomConstraints.keySet()) {
            String s = (String)object0;
            ConstraintAttribute constraintAttribute0 = (ConstraintAttribute)constraintSet$Constraint0.mCustomConstraints.get(s);
            if(constraintAttribute0.isContinuous()) {
                this.q.put(s, constraintAttribute0);
            }
        }
        switch(v) {
            case 1: 
            case 3: {
                this.e -= 90.0f;
                return;
            }
            case 2: 
            case 4: {
                float f = this.e + 90.0f;
                this.e = f;
                if(f > 180.0f) {
                    this.e = f - 360.0f;
                }
            }
        }
    }
}

