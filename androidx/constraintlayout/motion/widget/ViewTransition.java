package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.activity.m;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout.LayoutParams;
import androidx.constraintlayout.widget.ConstraintSet.Constraint;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.R.id;
import androidx.constraintlayout.widget.R.styleable;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;

public class ViewTransition {
    public static final String CONSTRAINT_OVERRIDE = "ConstraintOverride";
    public static final String CUSTOM_ATTRIBUTE = "CustomAttribute";
    public static final String CUSTOM_METHOD = "CustomMethod";
    public static final String KEY_FRAME_SET_TAG = "KeyFrameSet";
    public static final int ONSTATE_ACTION_DOWN = 1;
    public static final int ONSTATE_ACTION_DOWN_UP = 3;
    public static final int ONSTATE_ACTION_UP = 2;
    public static final int ONSTATE_SHARED_VALUE_SET = 4;
    public static final int ONSTATE_SHARED_VALUE_UNSET = 5;
    public static final String VIEW_TRANSITION_TAG = "ViewTransition";
    public int a;
    public int b;
    public boolean c;
    public int d;
    public int e;
    public final KeyFrames f;
    public final Constraint g;
    public int h;
    public int i;
    public int j;
    public String k;
    public int l;
    public String m;
    public int n;
    public final Context o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;

    // This method was un-flattened
    public ViewTransition(Context context0, XmlResourceParser xmlResourceParser0) {
        this.b = -1;
        this.c = false;
        this.d = 0;
        this.h = -1;
        this.i = -1;
        this.l = 0;
        this.m = null;
        this.n = -1;
        this.p = -1;
        this.q = -1;
        this.r = -1;
        this.s = -1;
        this.t = -1;
        this.u = -1;
        this.v = -1;
        this.o = context0;
        try {
            for(int v = xmlResourceParser0.getEventType(); true; v = xmlResourceParser0.next()) {
                if(v == 1) {
                    return;
                }
                switch(v) {
                    case 2: {
                        String s = xmlResourceParser0.getName();
                        switch(s) {
                            case "ConstraintOverride": {
                                this.g = ConstraintSet.buildDelta(context0, xmlResourceParser0);
                                break;
                            }
                            case "CustomAttribute": {
                                ConstraintAttribute.parse(context0, xmlResourceParser0, this.g.mCustomConstraints);
                                break;
                            }
                            case "CustomMethod": {
                                ConstraintAttribute.parse(context0, xmlResourceParser0, this.g.mCustomConstraints);
                                break;
                            }
                            case "KeyFrameSet": {
                                this.f = new KeyFrames(context0, xmlResourceParser0);
                                break;
                            }
                            case "ViewTransition": {
                                this.d(context0, xmlResourceParser0);
                                break;
                            }
                            default: {
                                Log.e("ViewTransition", ".(null:-1) <init>() unknown tag " + s);
                                Log.e("ViewTransition", ".xml:" + xmlResourceParser0.getLineNumber());
                            }
                        }
                        break;
                    }
                    case 3: {
                        if("ViewTransition".equals(xmlResourceParser0.getName())) {
                            return;
                        }
                    }
                }
            }
        }
        catch(XmlPullParserException xmlPullParserException0) {
        }
        catch(IOException iOException0) {
            iOException0.printStackTrace();
            return;
        }
        xmlPullParserException0.printStackTrace();
    }

    public final void a(ViewTransitionController viewTransitionController0, MotionLayout motionLayout0, int v, ConstraintSet constraintSet0, View[] arr_view) {
        Interpolator interpolator0;
        if(this.c) {
            return;
        }
        int v1 = this.e;
        KeyFrames keyFrames0 = this.f;
        if(v1 == 2) {
            View view0 = arr_view[0];
            MotionController motionController0 = new MotionController(view0);
            motionController0.f.c = 0.0f;
            motionController0.f.d = 0.0f;
            motionController0.H = true;
            float f = view0.getX();
            float f1 = view0.getY();
            float f2 = (float)view0.getWidth();
            float f3 = (float)view0.getHeight();
            motionController0.f.e(f, f1, f2, f3);
            float f4 = view0.getX();
            float f5 = view0.getY();
            float f6 = (float)view0.getWidth();
            float f7 = (float)view0.getHeight();
            motionController0.g.e(f4, f5, f6, f7);
            motionController0.h.getClass();
            view0.getX();
            view0.getY();
            view0.getWidth();
            view0.getHeight();
            motionController0.h.b(view0);
            motionController0.i.getClass();
            view0.getX();
            view0.getY();
            view0.getWidth();
            view0.getHeight();
            motionController0.i.b(view0);
            keyFrames0.addAllFrames(motionController0);
            motionController0.setup(motionLayout0.getWidth(), motionLayout0.getHeight(), ((float)this.h), System.nanoTime());
            int v3 = this.h;
            int v4 = this.i;
            int v5 = this.b;
            Context context0 = motionLayout0.getContext();
            switch(this.l) {
                case -2: {
                    interpolator0 = AnimationUtils.loadInterpolator(context0, this.n);
                    break;
                }
                case -1: {
                    interpolator0 = new h(Easing.getInterpolator(this.m), 2);
                    break;
                }
                case 0: {
                    interpolator0 = new AccelerateDecelerateInterpolator();
                    break;
                }
                case 1: {
                    interpolator0 = new AccelerateInterpolator();
                    break;
                }
                case 2: {
                    interpolator0 = new DecelerateInterpolator();
                    break;
                }
                case 4: {
                    interpolator0 = new BounceInterpolator();
                    break;
                }
                case 5: {
                    interpolator0 = new OvershootInterpolator();
                    break;
                }
                case 6: {
                    interpolator0 = new AnticipateInterpolator();
                    break;
                }
                default: {
                    interpolator0 = null;
                }
            }
            new t(viewTransitionController0, motionController0, v3, v4, v5, interpolator0, this.p, this.q);
            return;
        }
        Constraint constraintSet$Constraint0 = this.g;
        if(v1 == 1) {
            int[] arr_v = motionLayout0.getConstraintSetIds();
            for(int v6 = 0; v6 < arr_v.length; ++v6) {
                int v7 = arr_v[v6];
                if(v7 != v) {
                    ConstraintSet constraintSet1 = motionLayout0.getConstraintSet(v7);
                    for(int v8 = 0; v8 < arr_view.length; ++v8) {
                        Constraint constraintSet$Constraint1 = constraintSet1.getConstraint(arr_view[v8].getId());
                        if(constraintSet$Constraint0 != null) {
                            constraintSet$Constraint0.applyDelta(constraintSet$Constraint1);
                            constraintSet$Constraint1.mCustomConstraints.putAll(constraintSet$Constraint0.mCustomConstraints);
                        }
                    }
                }
            }
        }
        ConstraintSet constraintSet2 = new ConstraintSet();
        constraintSet2.clone(constraintSet0);
        for(int v9 = 0; v9 < arr_view.length; ++v9) {
            Constraint constraintSet$Constraint2 = constraintSet2.getConstraint(arr_view[v9].getId());
            if(constraintSet$Constraint0 != null) {
                constraintSet$Constraint0.applyDelta(constraintSet$Constraint2);
                constraintSet$Constraint2.mCustomConstraints.putAll(constraintSet$Constraint0.mCustomConstraints);
            }
        }
        motionLayout0.updateState(v, constraintSet2);
        motionLayout0.updateState(id.view_transition, constraintSet0);
        motionLayout0.setState(id.view_transition, -1, -1);
        Transition motionScene$Transition0 = new Transition(-1, motionLayout0.a, id.view_transition, v);
        for(int v2 = 0; v2 < arr_view.length; ++v2) {
            View view1 = arr_view[v2];
            int v10 = this.h;
            if(v10 != -1) {
                motionScene$Transition0.setDuration(v10);
            }
            motionScene$Transition0.setPathMotionArc(this.d);
            motionScene$Transition0.setInterpolatorInfo(this.l, this.m, this.n);
            int v11 = view1.getId();
            if(keyFrames0 != null) {
                ArrayList arrayList0 = keyFrames0.getKeyFramesForView(-1);
                KeyFrames keyFrames1 = new KeyFrames();
                for(Object object0: arrayList0) {
                    keyFrames1.addKey(((Key)object0).clone().setViewId(v11));
                }
                motionScene$Transition0.addKeyFrame(keyFrames1);
            }
        }
        motionLayout0.setTransition(motionScene$Transition0);
        motionLayout0.transitionToEnd(new m(2, this, arr_view));
    }

    public final boolean b(View view0) {
        boolean z;
        int v = this.r;
        if(v == -1) {
            z = true;
        }
        else if(view0.getTag(v) == null) {
            z = false;
        }
        else {
            z = true;
        }
        int v1 = this.s;
        if(v1 == -1) {
            return z;
        }
        return view0.getTag(v1) == null ? z : false;
    }

    public final boolean c(View view0) {
        if(view0 == null) {
            return false;
        }
        if(this.j == -1 && this.k == null) {
            return false;
        }
        if(!this.b(view0)) {
            return false;
        }
        if(view0.getId() == this.j) {
            return true;
        }
        if(this.k == null) {
            return false;
        }
        if(view0.getLayoutParams() instanceof LayoutParams) {
            String s = ((LayoutParams)view0.getLayoutParams()).constraintTag;
            return s != null && s.matches(this.k);
        }
        return false;
    }

    public final void d(Context context0, XmlResourceParser xmlResourceParser0) {
        TypedArray typedArray0 = context0.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser0), styleable.ViewTransition);
        int v = typedArray0.getIndexCount();
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = typedArray0.getIndex(v1);
            if(v2 == styleable.ViewTransition_android_id) {
                this.a = typedArray0.getResourceId(v2, this.a);
            }
            else if(v2 != styleable.ViewTransition_motionTarget) {
                if(v2 == styleable.ViewTransition_onStateTransition) {
                    this.b = typedArray0.getInt(v2, this.b);
                }
                else if(v2 == styleable.ViewTransition_transitionDisable) {
                    this.c = typedArray0.getBoolean(v2, this.c);
                }
                else if(v2 == styleable.ViewTransition_pathMotionArc) {
                    this.d = typedArray0.getInt(v2, this.d);
                }
                else if(v2 == styleable.ViewTransition_duration) {
                    this.h = typedArray0.getInt(v2, this.h);
                }
                else if(v2 == styleable.ViewTransition_upDuration) {
                    this.i = typedArray0.getInt(v2, this.i);
                }
                else if(v2 == styleable.ViewTransition_viewTransitionMode) {
                    this.e = typedArray0.getInt(v2, this.e);
                }
                else if(v2 == styleable.ViewTransition_motionInterpolator) {
                    int v4 = typedArray0.peekValue(v2).type;
                    if(v4 == 1) {
                        int v5 = typedArray0.getResourceId(v2, -1);
                        this.n = v5;
                        if(v5 != -1) {
                            this.l = -2;
                        }
                    }
                    else if(v4 == 3) {
                        String s = typedArray0.getString(v2);
                        this.m = s;
                        if(s == null || s.indexOf("/") <= 0) {
                            this.l = -1;
                        }
                        else {
                            this.n = typedArray0.getResourceId(v2, -1);
                            this.l = -2;
                        }
                    }
                    else {
                        this.l = typedArray0.getInteger(v2, this.l);
                    }
                }
                else if(v2 == styleable.ViewTransition_setsTag) {
                    this.p = typedArray0.getResourceId(v2, this.p);
                }
                else if(v2 == styleable.ViewTransition_clearsTag) {
                    this.q = typedArray0.getResourceId(v2, this.q);
                }
                else if(v2 == styleable.ViewTransition_ifTagSet) {
                    this.r = typedArray0.getResourceId(v2, this.r);
                }
                else if(v2 == styleable.ViewTransition_ifTagNotSet) {
                    this.s = typedArray0.getResourceId(v2, this.s);
                }
                else if(v2 == styleable.ViewTransition_SharedValueId) {
                    this.u = typedArray0.getResourceId(v2, this.u);
                }
                else if(v2 == styleable.ViewTransition_SharedValue) {
                    this.t = typedArray0.getInteger(v2, this.t);
                }
            }
            else if(MotionLayout.IS_IN_EDIT_MODE) {
                int v3 = typedArray0.getResourceId(v2, this.j);
                this.j = v3;
                if(v3 == -1) {
                    this.k = typedArray0.getString(v2);
                }
            }
            else if(typedArray0.peekValue(v2).type == 3) {
                this.k = typedArray0.getString(v2);
            }
            else {
                this.j = typedArray0.getResourceId(v2, this.j);
            }
        }
        typedArray0.recycle();
    }

    public int getSharedValue() {
        return this.t;
    }

    public int getSharedValueCurrent() {
        return this.v;
    }

    public int getSharedValueID() {
        return this.u;
    }

    public int getStateTransition() {
        return this.b;
    }

    public void setSharedValue(int v) {
        this.t = v;
    }

    public void setSharedValueCurrent(int v) {
        this.v = v;
    }

    public void setSharedValueID(int v) {
        this.u = v;
    }

    public void setStateTransition(int v) {
        this.b = v;
    }

    @Override
    public String toString() {
        return "ViewTransition(" + Debug.getName(this.o, this.a) + ")";
    }
}

