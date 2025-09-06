package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.R.styleable;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

public class KeyTrigger extends Key {
    public static final String CROSS = "CROSS";
    public static final int KEY_TYPE = 5;
    public static final String NEGATIVE_CROSS = "negativeCross";
    public static final String POSITIVE_CROSS = "positiveCross";
    public static final String POST_LAYOUT = "postLayout";
    public static final String TRIGGER_COLLISION_ID = "triggerCollisionId";
    public static final String TRIGGER_COLLISION_VIEW = "triggerCollisionView";
    public static final String TRIGGER_ID = "triggerID";
    public static final String TRIGGER_RECEIVER = "triggerReceiver";
    public static final String TRIGGER_SLACK = "triggerSlack";
    public static final String VIEW_TRANSITION_ON_CROSS = "viewTransitionOnCross";
    public static final String VIEW_TRANSITION_ON_NEGATIVE_CROSS = "viewTransitionOnNegativeCross";
    public static final String VIEW_TRANSITION_ON_POSITIVE_CROSS = "viewTransitionOnPositiveCross";
    public String e;
    public int f;
    public String g;
    public String h;
    public int i;
    public int j;
    public View k;
    public float l;
    public boolean m;
    public boolean n;
    public boolean o;
    public float p;
    public float q;
    public boolean r;
    public int s;
    public int t;
    public int u;
    public RectF v;
    public RectF w;
    public HashMap x;

    public KeyTrigger() {
        this.e = null;
        this.f = Key.UNSET;
        this.g = null;
        this.h = null;
        this.i = Key.UNSET;
        this.j = Key.UNSET;
        this.k = null;
        this.l = 0.1f;
        this.m = true;
        this.n = true;
        this.o = true;
        this.p = NaNf;
        this.r = false;
        this.s = Key.UNSET;
        this.t = Key.UNSET;
        this.u = Key.UNSET;
        this.v = new RectF();
        this.w = new RectF();
        this.x = new HashMap();
        this.mType = 5;
        this.d = new HashMap();
    }

    @Override  // androidx.constraintlayout.motion.widget.Key
    public void addValues(HashMap hashMap0) {
    }

    public final void c(View view0, String s) {
        Method method0;
        if(s == null) {
            return;
        }
        if(s.startsWith(".")) {
            boolean z = s.length() == 1;
            if(!z) {
                s = s.substring(1).toLowerCase(Locale.ROOT);
            }
            for(Object object0: this.d.keySet()) {
                String s1 = (String)object0;
                if(z || s1.toLowerCase(Locale.ROOT).matches(s)) {
                    ConstraintAttribute constraintAttribute0 = (ConstraintAttribute)this.d.get(s1);
                    if(constraintAttribute0 != null) {
                        constraintAttribute0.applyCustom(view0);
                    }
                }
            }
            return;
        }
        if(this.x.containsKey(s)) {
            method0 = (Method)this.x.get(s);
            if(method0 == null) {
                return;
            }
        }
        else {
            method0 = null;
        }
        if(method0 == null) {
            try {
                method0 = view0.getClass().getMethod(s, null);
                this.x.put(s, method0);
            }
            catch(NoSuchMethodException unused_ex) {
                this.x.put(s, null);
                Log.e("KeyTrigger", "Could not find method \"" + s + "\"on class " + view0.getClass().getSimpleName() + " " + Debug.getName(view0));
                return;
            }
        }
        try {
            method0.invoke(view0, null);
        }
        catch(Exception unused_ex) {
            Log.e("KeyTrigger", "Exception in call \"" + this.e + "\"on class " + view0.getClass().getSimpleName() + " " + Debug.getName(view0));
        }
    }

    @Override  // androidx.constraintlayout.motion.widget.Key
    public Key clone() {
        return new KeyTrigger().copy(this);
    }

    @Override  // androidx.constraintlayout.motion.widget.Key
    public Object clone() throws CloneNotSupportedException {
        return this.clone();
    }

    public void conditionallyFire(float f, View view0) {
        int v1;
        boolean z2;
        boolean z1;
        int v2;
        boolean z = true;
        int v = 0;
        if(this.j == Key.UNSET) {
            if(!this.m) {
                if(Math.abs(f - this.p) > this.l) {
                    this.m = true;
                }
                z1 = false;
            }
            else if((this.q - this.p) * (f - this.p) < 0.0f) {
                this.m = false;
                z1 = true;
            }
            else {
                z1 = false;
            }
            if(this.n) {
                float f1 = f - this.p;
                if((this.q - this.p) * f1 >= 0.0f || f1 >= 0.0f) {
                    v2 = 0;
                }
                else {
                    this.n = false;
                    v2 = 1;
                }
            }
            else {
                if(Math.abs(f - this.p) > this.l) {
                    this.n = true;
                }
                v2 = 0;
            }
            if(this.o) {
                float f2 = f - this.p;
                if((this.q - this.p) * f2 >= 0.0f || f2 <= 0.0f) {
                    z = false;
                }
                else {
                    this.o = false;
                }
                z2 = z;
            }
            else {
                if(Math.abs(f - this.p) > this.l) {
                    this.o = true;
                }
                z2 = false;
            }
            v = v2;
        }
        else {
            if(this.k == null) {
                this.k = ((ViewGroup)view0.getParent()).findViewById(this.j);
            }
            KeyTrigger.d(this.v, this.k, this.r);
            KeyTrigger.d(this.w, view0, this.r);
            if(this.v.intersect(this.w)) {
                if(this.m) {
                    this.m = false;
                    z1 = true;
                }
                else {
                    z1 = false;
                }
                if(this.o) {
                    this.o = false;
                    z2 = true;
                }
                else {
                    z2 = false;
                }
                this.n = true;
            }
            else {
                if(this.m) {
                    z1 = false;
                }
                else {
                    this.m = true;
                    z1 = true;
                }
                if(this.n) {
                    this.n = false;
                    v1 = 1;
                }
                else {
                    v1 = 0;
                }
                this.o = true;
                v = v1;
                z2 = false;
            }
        }
        this.q = f;
        if(v != 0 || z1 || z2) {
            ((MotionLayout)view0.getParent()).fireTrigger(this.i, z2, f);
        }
        View view1 = this.f == Key.UNSET ? view0 : ((MotionLayout)view0.getParent()).findViewById(this.f);
        if(v != 0) {
            String s = this.g;
            if(s != null) {
                this.c(view1, s);
            }
            if(this.s != Key.UNSET) {
                ((MotionLayout)view0.getParent()).viewTransition(this.s, new View[]{view1});
            }
        }
        if(z2) {
            String s1 = this.h;
            if(s1 != null) {
                this.c(view1, s1);
            }
            if(this.t != Key.UNSET) {
                ((MotionLayout)view0.getParent()).viewTransition(this.t, new View[]{view1});
            }
        }
        if(z1) {
            String s2 = this.e;
            if(s2 != null) {
                this.c(view1, s2);
            }
            if(this.u != Key.UNSET) {
                ((MotionLayout)view0.getParent()).viewTransition(this.u, new View[]{view1});
            }
        }
    }

    @Override  // androidx.constraintlayout.motion.widget.Key
    public Key copy(Key key0) {
        super.copy(key0);
        ((KeyTrigger)key0).getClass();
        this.e = ((KeyTrigger)key0).e;
        this.f = ((KeyTrigger)key0).f;
        this.g = ((KeyTrigger)key0).g;
        this.h = ((KeyTrigger)key0).h;
        this.i = ((KeyTrigger)key0).i;
        this.j = ((KeyTrigger)key0).j;
        this.k = ((KeyTrigger)key0).k;
        this.l = ((KeyTrigger)key0).l;
        this.m = ((KeyTrigger)key0).m;
        this.n = ((KeyTrigger)key0).n;
        this.o = ((KeyTrigger)key0).o;
        this.p = ((KeyTrigger)key0).p;
        this.q = ((KeyTrigger)key0).q;
        this.r = ((KeyTrigger)key0).r;
        this.v = ((KeyTrigger)key0).v;
        this.w = ((KeyTrigger)key0).w;
        this.x = ((KeyTrigger)key0).x;
        return this;
    }

    public static void d(RectF rectF0, View view0, boolean z) {
        rectF0.top = (float)view0.getTop();
        rectF0.bottom = (float)view0.getBottom();
        rectF0.left = (float)view0.getLeft();
        rectF0.right = (float)view0.getRight();
        if(z) {
            view0.getMatrix().mapRect(rectF0);
        }
    }

    @Override  // androidx.constraintlayout.motion.widget.Key
    public void getAttributeNames(HashSet hashSet0) {
    }

    @Override  // androidx.constraintlayout.motion.widget.Key
    public void load(Context context0, AttributeSet attributeSet0) {
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.KeyTrigger);
        int v = typedArray0.getIndexCount();
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = typedArray0.getIndex(v1);
            SparseIntArray sparseIntArray0 = f.a;
            switch(sparseIntArray0.get(v2)) {
                case 1: {
                    this.g = typedArray0.getString(v2);
                    break;
                }
                case 2: {
                    this.h = typedArray0.getString(v2);
                    break;
                }
                case 4: {
                    this.e = typedArray0.getString(v2);
                    break;
                }
                case 5: {
                    this.l = typedArray0.getFloat(v2, this.l);
                    break;
                }
                case 6: {
                    this.i = typedArray0.getResourceId(v2, this.i);
                    break;
                }
                case 7: {
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
                case 8: {
                    int v4 = typedArray0.getInteger(v2, this.a);
                    this.a = v4;
                    this.p = (((float)v4) + 0.5f) / 100.0f;
                    break;
                }
                case 9: {
                    this.j = typedArray0.getResourceId(v2, this.j);
                    break;
                }
                case 10: {
                    this.r = typedArray0.getBoolean(v2, this.r);
                    break;
                }
                case 11: {
                    this.f = typedArray0.getResourceId(v2, this.f);
                    break;
                }
                case 12: {
                    this.u = typedArray0.getResourceId(v2, this.u);
                    break;
                }
                case 13: {
                    this.s = typedArray0.getResourceId(v2, this.s);
                    break;
                }
                case 14: {
                    this.t = typedArray0.getResourceId(v2, this.t);
                    break;
                }
                default: {
                    Log.e("KeyTrigger", "unused attribute 0x" + Integer.toHexString(v2) + "   " + sparseIntArray0.get(v2));
                }
            }
        }
    }

    @Override  // androidx.constraintlayout.motion.widget.Key
    public void setValue(String s, Object object0) {
        s.getClass();
        switch(s) {
            case "CROSS": {
                this.e = object0.toString();
                return;
            }
            case "negativeCross": {
                this.g = object0.toString();
                return;
            }
            case "positiveCross": {
                this.h = object0.toString();
                return;
            }
            case "postLayout": {
                this.r = object0 instanceof Boolean ? ((Boolean)object0).booleanValue() : Boolean.parseBoolean(object0.toString());
                return;
            }
            case "triggerCollisionId": {
                this.j = Key.b(object0);
                return;
            }
            case "triggerCollisionView": {
                this.k = (View)object0;
                return;
            }
            case "triggerID": {
                this.i = Key.b(object0);
                return;
            }
            case "triggerReceiver": {
                this.f = Key.b(object0);
                return;
            }
            case "triggerSlack": {
                this.l = Key.a(object0);
                return;
            }
            case "viewTransitionOnCross": {
                this.u = Key.b(object0);
                return;
            }
            case "viewTransitionOnNegativeCross": {
                this.s = Key.b(object0);
                return;
            }
            case "viewTransitionOnPositiveCross": {
                this.t = Key.b(object0);
            }
        }
    }
}

