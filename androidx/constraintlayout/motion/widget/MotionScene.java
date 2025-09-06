package androidx.constraintlayout.motion.widget;

import a5.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.R.id;
import androidx.constraintlayout.widget.R.styleable;
import androidx.constraintlayout.widget.StateSet;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import r0.a;

public class MotionScene {
    public static class Transition {
        public static class TransitionOnClick implements View.OnClickListener {
            public static final int ANIM_TOGGLE = 17;
            public static final int ANIM_TO_END = 1;
            public static final int ANIM_TO_START = 16;
            public static final int JUMP_TO_END = 0x100;
            public static final int JUMP_TO_START = 0x1000;
            public final Transition a;
            public final int b;
            public int c;

            public TransitionOnClick(Context context0, Transition motionScene$Transition0, XmlPullParser xmlPullParser0) {
                this.b = -1;
                this.c = 17;
                this.a = motionScene$Transition0;
                TypedArray typedArray0 = context0.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser0), styleable.OnClick);
                int v = typedArray0.getIndexCount();
                for(int v1 = 0; v1 < v; ++v1) {
                    int v2 = typedArray0.getIndex(v1);
                    if(v2 == styleable.OnClick_targetId) {
                        this.b = typedArray0.getResourceId(v2, this.b);
                    }
                    else if(v2 == styleable.OnClick_clickAction) {
                        this.c = typedArray0.getInt(v2, this.c);
                    }
                }
                typedArray0.recycle();
            }

            public TransitionOnClick(Transition motionScene$Transition0, int v, int v1) {
                this.a = motionScene$Transition0;
                this.b = v;
                this.c = v1;
            }

            public void addOnClickListeners(MotionLayout motionLayout0, int v, Transition motionScene$Transition0) {
                int v1 = this.b;
                if(v1 != -1) {
                    motionLayout0 = motionLayout0.findViewById(v1);
                }
                if(motionLayout0 == null) {
                    Log.e("MotionScene", "OnClick could not find id " + v1);
                    return;
                }
                int v2 = motionScene$Transition0.d;
                int v3 = motionScene$Transition0.c;
                if(v2 == -1) {
                    motionLayout0.setOnClickListener(this);
                    return;
                }
                if((((this.c & 1) == 0 || v != v2 ? 0 : 1) | ((this.c & 0x100) == 0 || v != v2 ? 0 : 1) | ((this.c & 16) == 0 || v != v3 ? 0 : 1) | ((this.c & 0x1000) == 0 || v != v3 ? 0 : 1)) != 0) {
                    motionLayout0.setOnClickListener(this);
                }
            }

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                Transition motionScene$Transition0 = this.a;
                MotionLayout motionLayout0 = motionScene$Transition0.j.a;
                if(!motionLayout0.isInteractionEnabled()) {
                    return;
                }
                if(motionScene$Transition0.d == -1) {
                    int v = motionLayout0.getCurrentState();
                    if(v == -1) {
                        motionLayout0.transitionToState(motionScene$Transition0.c);
                        return;
                    }
                    Transition motionScene$Transition1 = new Transition(motionScene$Transition0.j, motionScene$Transition0);
                    motionScene$Transition1.d = v;
                    motionScene$Transition1.c = motionScene$Transition0.c;
                    motionLayout0.setTransition(motionScene$Transition1);
                    motionLayout0.transitionToEnd();
                    return;
                }
                Transition motionScene$Transition2 = motionScene$Transition0.j.c;
                int v1 = 0;
                int v2 = (this.c & 1) != 0 || (this.c & 0x100) != 0 ? 1 : 0;
                boolean z = (this.c & 16) != 0 || (this.c & 0x1000) != 0;
                if(v2 == 0 || !z) {
                    v1 = v2;
                }
                else {
                    if(motionScene$Transition2 != motionScene$Transition0) {
                        motionLayout0.setTransition(motionScene$Transition0);
                    }
                    if(motionLayout0.getCurrentState() != motionLayout0.getEndState() && motionLayout0.getProgress() <= 0.5f) {
                        z = false;
                        v1 = v2;
                    }
                }
                if(motionScene$Transition0 == motionScene$Transition2) {
                label_34:
                    if(v1 != 0 && (this.c & 1) != 0) {
                        motionLayout0.setTransition(motionScene$Transition0);
                        motionLayout0.transitionToEnd();
                        return;
                    }
                    if(z && (this.c & 16) != 0) {
                        motionLayout0.setTransition(motionScene$Transition0);
                        motionLayout0.transitionToStart();
                        return;
                    }
                    if(v1 != 0 && (this.c & 0x100) != 0) {
                        motionLayout0.setTransition(motionScene$Transition0);
                        motionLayout0.setProgress(1.0f);
                        return;
                    }
                    if(z && (this.c & 0x1000) != 0) {
                        motionLayout0.setTransition(motionScene$Transition0);
                        motionLayout0.setProgress(0.0f);
                    }
                }
                else {
                    int v3 = motionScene$Transition0.c;
                    int v4 = motionScene$Transition0.d;
                    if(v4 != -1) {
                        if(motionLayout0.f == v4 || motionLayout0.f == v3) {
                            goto label_34;
                        }
                    }
                    else if(motionLayout0.f != v3) {
                        goto label_34;
                    }
                }
            }

            public void removeOnClickListeners(MotionLayout motionLayout0) {
                int v = this.b;
                if(v == -1) {
                    return;
                }
                View view0 = motionLayout0.findViewById(v);
                if(view0 == null) {
                    Log.e("MotionScene", " (*)  could not find id " + v);
                    return;
                }
                view0.setOnClickListener(null);
            }
        }

        public static final int AUTO_ANIMATE_TO_END = 4;
        public static final int AUTO_ANIMATE_TO_START = 3;
        public static final int AUTO_JUMP_TO_END = 2;
        public static final int AUTO_JUMP_TO_START = 1;
        public static final int AUTO_NONE = 0;
        public static final int INTERPOLATE_ANTICIPATE = 6;
        public static final int INTERPOLATE_BOUNCE = 4;
        public static final int INTERPOLATE_EASE_IN = 1;
        public static final int INTERPOLATE_EASE_IN_OUT = 0;
        public static final int INTERPOLATE_EASE_OUT = 2;
        public static final int INTERPOLATE_LINEAR = 3;
        public static final int INTERPOLATE_OVERSHOOT = 5;
        public static final int INTERPOLATE_REFERENCE_ID = -2;
        public static final int INTERPOLATE_SPLINE_STRING = -1;
        public final int a;
        public final boolean b;
        public int c;
        public int d;
        public int e;
        public String f;
        public int g;
        public int h;
        public float i;
        public final MotionScene j;
        public final ArrayList k;
        public s l;
        public final ArrayList m;
        public int n;
        public boolean o;
        public int p;
        public int q;
        public int r;

        public Transition(int v, MotionScene motionScene0, int v1, int v2) {
            this.a = -1;
            this.b = false;
            this.c = -1;
            this.d = -1;
            this.e = 0;
            this.f = null;
            this.g = -1;
            this.h = 400;
            this.i = 0.0f;
            this.k = new ArrayList();
            this.l = null;
            this.m = new ArrayList();
            this.n = 0;
            this.o = false;
            this.p = -1;
            this.r = 0;
            this.a = v;
            this.j = motionScene0;
            this.d = v1;
            this.c = v2;
            this.h = motionScene0.k;
            this.q = motionScene0.l;
        }

        public Transition(MotionScene motionScene0, Context context0, XmlResourceParser xmlResourceParser0) {
            this.a = -1;
            this.b = false;
            this.c = -1;
            this.d = -1;
            this.e = 0;
            this.f = null;
            this.g = -1;
            this.h = 400;
            this.i = 0.0f;
            this.k = new ArrayList();
            this.l = null;
            this.m = new ArrayList();
            this.n = 0;
            this.o = false;
            this.p = -1;
            this.r = 0;
            this.h = motionScene0.k;
            this.q = motionScene0.l;
            this.j = motionScene0;
            TypedArray typedArray0 = context0.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser0), styleable.Transition);
            int v = typedArray0.getIndexCount();
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = typedArray0.getIndex(v1);
                SparseArray sparseArray0 = motionScene0.h;
                if(v2 == styleable.Transition_constraintSetEnd) {
                    this.c = typedArray0.getResourceId(v2, -1);
                    String s = context0.getResources().getResourceTypeName(this.c);
                    if("layout".equals(s)) {
                        ConstraintSet constraintSet0 = new ConstraintSet();
                        constraintSet0.load(context0, this.c);
                        sparseArray0.append(this.c, constraintSet0);
                    }
                    else if("xml".equals(s)) {
                        this.c = motionScene0.i(context0, this.c);
                    }
                }
                else if(v2 == styleable.Transition_constraintSetStart) {
                    this.d = typedArray0.getResourceId(v2, this.d);
                    String s1 = context0.getResources().getResourceTypeName(this.d);
                    if("layout".equals(s1)) {
                        ConstraintSet constraintSet1 = new ConstraintSet();
                        constraintSet1.load(context0, this.d);
                        sparseArray0.append(this.d, constraintSet1);
                    }
                    else if("xml".equals(s1)) {
                        this.d = motionScene0.i(context0, this.d);
                    }
                }
                else if(v2 == styleable.Transition_motionInterpolator) {
                    int v3 = typedArray0.peekValue(v2).type;
                    if(v3 == 1) {
                        int v4 = typedArray0.getResourceId(v2, -1);
                        this.g = v4;
                        if(v4 != -1) {
                            this.e = -2;
                        }
                    }
                    else if(v3 == 3) {
                        String s2 = typedArray0.getString(v2);
                        this.f = s2;
                        if(s2 != null) {
                            if(s2.indexOf("/") > 0) {
                                this.g = typedArray0.getResourceId(v2, -1);
                                this.e = -2;
                            }
                            else {
                                this.e = -1;
                            }
                        }
                    }
                    else {
                        this.e = typedArray0.getInteger(v2, this.e);
                    }
                }
                else if(v2 == styleable.Transition_duration) {
                    int v5 = typedArray0.getInt(v2, this.h);
                    this.h = v5;
                    if(v5 < 8) {
                        this.h = 8;
                    }
                }
                else if(v2 == styleable.Transition_staggered) {
                    this.i = typedArray0.getFloat(v2, this.i);
                }
                else if(v2 == styleable.Transition_autoTransition) {
                    this.n = typedArray0.getInteger(v2, this.n);
                }
                else if(v2 == styleable.Transition_android_id) {
                    this.a = typedArray0.getResourceId(v2, this.a);
                }
                else if(v2 == styleable.Transition_transitionDisable) {
                    this.o = typedArray0.getBoolean(v2, this.o);
                }
                else if(v2 == styleable.Transition_pathMotionArc) {
                    this.p = typedArray0.getInteger(v2, -1);
                }
                else if(v2 == styleable.Transition_layoutDuringTransition) {
                    this.q = typedArray0.getInteger(v2, 0);
                }
                else if(v2 == styleable.Transition_transitionFlags) {
                    this.r = typedArray0.getInteger(v2, 0);
                }
            }
            if(this.d == -1) {
                this.b = true;
            }
            typedArray0.recycle();
        }

        public Transition(MotionScene motionScene0, Transition motionScene$Transition0) {
            this.a = -1;
            this.b = false;
            this.c = -1;
            this.d = -1;
            this.e = 0;
            this.f = null;
            this.g = -1;
            this.h = 400;
            this.i = 0.0f;
            this.k = new ArrayList();
            this.l = null;
            this.m = new ArrayList();
            this.n = 0;
            this.o = false;
            this.p = -1;
            this.q = 0;
            this.r = 0;
            this.j = motionScene0;
            this.h = motionScene0.k;
            if(motionScene$Transition0 != null) {
                this.p = motionScene$Transition0.p;
                this.e = motionScene$Transition0.e;
                this.f = motionScene$Transition0.f;
                this.g = motionScene$Transition0.g;
                this.h = motionScene$Transition0.h;
                this.k = motionScene$Transition0.k;
                this.i = motionScene$Transition0.i;
                this.q = motionScene$Transition0.q;
            }
        }

        public void addKeyFrame(KeyFrames keyFrames0) {
            this.k.add(keyFrames0);
        }

        public void addOnClick(int v, int v1) {
            ArrayList arrayList0 = this.m;
            for(Object object0: arrayList0) {
                TransitionOnClick motionScene$Transition$TransitionOnClick0 = (TransitionOnClick)object0;
                if(motionScene$Transition$TransitionOnClick0.b == v) {
                    motionScene$Transition$TransitionOnClick0.c = v1;
                    return;
                }
                if(false) {
                    break;
                }
            }
            arrayList0.add(new TransitionOnClick(this, v, v1));
        }

        public void addOnClick(Context context0, XmlPullParser xmlPullParser0) {
            TransitionOnClick motionScene$Transition$TransitionOnClick0 = new TransitionOnClick(context0, this, xmlPullParser0);
            this.m.add(motionScene$Transition$TransitionOnClick0);
        }

        public String debugString(Context context0) {
            String s = this.d == -1 ? "null" : context0.getResources().getResourceEntryName(this.d);
            if(this.c == -1) {
                return s + " -> null";
            }
            StringBuilder stringBuilder0 = b.u(s, " -> ");
            stringBuilder0.append(context0.getResources().getResourceEntryName(this.c));
            return stringBuilder0.toString();
        }

        public int getAutoTransition() {
            return this.n;
        }

        public int getDuration() {
            return this.h;
        }

        public int getEndConstraintSetId() {
            return this.c;
        }

        public int getId() {
            return this.a;
        }

        public List getKeyFrameList() {
            return this.k;
        }

        public int getLayoutDuringTransition() {
            return this.q;
        }

        public List getOnClickList() {
            return this.m;
        }

        public int getPathMotionArc() {
            return this.p;
        }

        public float getStagger() {
            return this.i;
        }

        public int getStartConstraintSetId() {
            return this.d;
        }

        public s getTouchResponse() {
            return this.l;
        }

        public boolean isEnabled() {
            return !this.o;
        }

        public boolean isTransitionFlag(int v) {
            return (v & this.r) != 0;
        }

        public void removeOnClick(int v) {
            TransitionOnClick motionScene$Transition$TransitionOnClick0 = null;
            ArrayList arrayList0 = this.m;
            for(Object object0: arrayList0) {
                TransitionOnClick motionScene$Transition$TransitionOnClick1 = (TransitionOnClick)object0;
                if(motionScene$Transition$TransitionOnClick1.b == v) {
                    motionScene$Transition$TransitionOnClick0 = motionScene$Transition$TransitionOnClick1;
                    break;
                }
            }
            if(motionScene$Transition$TransitionOnClick0 != null) {
                arrayList0.remove(motionScene$Transition$TransitionOnClick0);
            }
        }

        public void setAutoTransition(int v) {
            this.n = v;
        }

        public void setDuration(int v) {
            this.h = Math.max(v, 8);
        }

        public void setEnable(boolean z) {
            this.setEnabled(z);
        }

        public void setEnabled(boolean z) {
            this.o = !z;
        }

        public void setInterpolatorInfo(int v, String s, int v1) {
            this.e = v;
            this.f = s;
            this.g = v1;
        }

        public void setLayoutDuringTransition(int v) {
            this.q = v;
        }

        public void setOnSwipe(OnSwipe onSwipe0) {
            this.l = onSwipe0 == null ? null : new s(this.j.a, onSwipe0);
        }

        public void setOnTouchUp(int v) {
            s s0 = this.getTouchResponse();
            if(s0 != null) {
                s0.c = v;
            }
        }

        public void setPathMotionArc(int v) {
            this.p = v;
        }

        public void setStagger(float f) {
            this.i = f;
        }

        public void setTransitionFlag(int v) {
            this.r = v;
        }
    }

    public static final int LAYOUT_CALL_MEASURE = 2;
    public static final int LAYOUT_HONOR_REQUEST = 1;
    public static final int LAYOUT_IGNORE_REQUEST = 0;
    public static final int UNSET = -1;
    public final MotionLayout a;
    public final StateSet b;
    public Transition c;
    public boolean d;
    public final ArrayList e;
    public final Transition f;
    public final ArrayList g;
    public final SparseArray h;
    public final HashMap i;
    public final SparseIntArray j;
    public int k;
    public int l;
    public MotionEvent m;
    public boolean n;
    public boolean o;
    public MotionTracker p;
    public boolean q;
    public final ViewTransitionController r;
    public float s;
    public float t;

    // This method was un-flattened
    public MotionScene(Context context0, MotionLayout motionLayout0, int v) {
        Transition motionScene$Transition0 = null;
        this.b = null;
        this.c = null;
        this.d = false;
        ArrayList arrayList0 = new ArrayList();
        this.e = arrayList0;
        this.f = null;
        this.g = new ArrayList();
        this.h = new SparseArray();
        this.i = new HashMap();
        this.j = new SparseIntArray();
        this.k = 400;
        this.l = 0;
        this.n = false;
        this.o = false;
        this.a = motionLayout0;
        this.r = new ViewTransitionController(motionLayout0);
        XmlResourceParser xmlResourceParser0 = context0.getResources().getXml(v);
        try {
            int v1 = xmlResourceParser0.getEventType();
            while(true) {
                switch(v1) {
                    case 0: {
                        xmlResourceParser0.getName();
                        v1 = xmlResourceParser0.next();
                        break;
                    }
                    case 1: {
                        goto label_73;
                    }
                    default: {
                        if(v1 == 2) {
                            switch(xmlResourceParser0.getName()) {
                                case "ConstraintSet": {
                                    this.h(context0, xmlResourceParser0);
                                    break;
                                }
                                case "Include": {
                                    this.j(context0, xmlResourceParser0);
                                    break;
                                }
                                case "KeyFrameSet": {
                                    KeyFrames keyFrames0 = new KeyFrames(context0, xmlResourceParser0);
                                    if(motionScene$Transition0 != null) {
                                        motionScene$Transition0.k.add(keyFrames0);
                                    }
                                    break;
                                }
                                case "MotionScene": {
                                    this.k(context0, xmlResourceParser0);
                                    break;
                                }
                                case "OnClick": {
                                    if(motionScene$Transition0 != null) {
                                        motionScene$Transition0.addOnClick(context0, xmlResourceParser0);
                                    }
                                    break;
                                }
                                case "OnSwipe": {
                                    if(motionScene$Transition0 == null) {
                                        Log.v("MotionScene", " OnSwipe (" + context0.getResources().getResourceEntryName(v) + ".xml:" + xmlResourceParser0.getLineNumber() + ")");
                                    }
                                    if(motionScene$Transition0 != null) {
                                        motionScene$Transition0.l = new s(context0, this.a, xmlResourceParser0);
                                    }
                                    break;
                                }
                                case "StateSet": {
                                    this.b = new StateSet(context0, xmlResourceParser0);
                                    break;
                                }
                                case "Transition": {
                                    motionScene$Transition0 = new Transition(this, context0, xmlResourceParser0);
                                    arrayList0.add(motionScene$Transition0);
                                    if(this.c == null && !motionScene$Transition0.b) {
                                        this.c = motionScene$Transition0;
                                        s s0 = motionScene$Transition0.l;
                                        if(s0 != null) {
                                            s0.c(this.q);
                                        }
                                    }
                                    if(motionScene$Transition0.b) {
                                        if(motionScene$Transition0.c == -1) {
                                            this.f = motionScene$Transition0;
                                        }
                                        else {
                                            this.g.add(motionScene$Transition0);
                                        }
                                        arrayList0.remove(motionScene$Transition0);
                                    }
                                    break;
                                }
                                case "ViewTransition": {
                                    ViewTransition viewTransition0 = new ViewTransition(context0, xmlResourceParser0);
                                    this.r.add(viewTransition0);
                                    break;
                                }
                                case "include": {
                                    this.j(context0, xmlResourceParser0);
                                }
                            }
                        }
                        v1 = xmlResourceParser0.next();
                        break;
                    }
                }
            }
        }
        catch(XmlPullParserException xmlPullParserException0) {
        }
        catch(IOException iOException0) {
            goto label_71;
        }
        xmlPullParserException0.printStackTrace();
        goto label_73;
    label_71:
        iOException0.printStackTrace();
    label_73:
        int v2 = id.motion_base;
        ConstraintSet constraintSet0 = new ConstraintSet();
        this.h.put(v2, constraintSet0);
        this.i.put("motion_base", id.motion_base);
    }

    public MotionScene(MotionLayout motionLayout0) {
        this.b = null;
        this.c = null;
        this.d = false;
        this.e = new ArrayList();
        this.f = null;
        this.g = new ArrayList();
        this.h = new SparseArray();
        this.i = new HashMap();
        this.j = new SparseIntArray();
        this.k = 400;
        this.l = 0;
        this.n = false;
        this.o = false;
        this.a = motionLayout0;
        this.r = new ViewTransitionController(motionLayout0);
    }

    public final boolean a(MotionLayout motionLayout0, int v) {
        if(this.p != null) {
            return false;
        }
        if(this.d) {
            return false;
        }
        for(Object object0: this.e) {
            Transition motionScene$Transition0 = (Transition)object0;
            if(motionScene$Transition0.n != 0 && (this.c != motionScene$Transition0 || !this.c.isTransitionFlag(2))) {
                o o0 = o.d;
                o o1 = o.c;
                o o2 = o.b;
                if(v == motionScene$Transition0.d && (motionScene$Transition0.n == 2 || motionScene$Transition0.n == 4)) {
                    motionLayout0.setState(o0);
                    motionLayout0.setTransition(motionScene$Transition0);
                    if(motionScene$Transition0.n == 4) {
                        motionLayout0.transitionToEnd();
                        motionLayout0.setState(o2);
                        motionLayout0.setState(o1);
                        return true;
                    }
                    motionLayout0.setProgress(1.0f);
                    motionLayout0.j(true);
                    motionLayout0.setState(o2);
                    motionLayout0.setState(o1);
                    motionLayout0.setState(o0);
                    motionLayout0.o();
                    return true;
                }
                if(v == motionScene$Transition0.c && (motionScene$Transition0.n == 1 || motionScene$Transition0.n == 3)) {
                    motionLayout0.setState(o0);
                    motionLayout0.setTransition(motionScene$Transition0);
                    if(motionScene$Transition0.n == 3) {
                        motionLayout0.transitionToStart();
                        motionLayout0.setState(o2);
                        motionLayout0.setState(o1);
                        return true;
                    }
                    motionLayout0.setProgress(0.0f);
                    motionLayout0.j(true);
                    motionLayout0.setState(o2);
                    motionLayout0.setState(o1);
                    motionLayout0.setState(o0);
                    motionLayout0.o();
                    return true;
                }
                if(false) {
                    break;
                }
            }
        }
        return false;
    }

    public void addOnClickListeners(MotionLayout motionLayout0, int v) {
        ArrayList arrayList0 = this.e;
        for(Object object0: arrayList0) {
            Transition motionScene$Transition0 = (Transition)object0;
            if(motionScene$Transition0.m.size() > 0) {
                for(Object object1: motionScene$Transition0.m) {
                    ((TransitionOnClick)object1).removeOnClickListeners(motionLayout0);
                }
            }
        }
        ArrayList arrayList1 = this.g;
        for(Object object2: arrayList1) {
            Transition motionScene$Transition1 = (Transition)object2;
            if(motionScene$Transition1.m.size() > 0) {
                for(Object object3: motionScene$Transition1.m) {
                    ((TransitionOnClick)object3).removeOnClickListeners(motionLayout0);
                }
            }
        }
        for(Object object4: arrayList0) {
            Transition motionScene$Transition2 = (Transition)object4;
            if(motionScene$Transition2.m.size() > 0) {
                for(Object object5: motionScene$Transition2.m) {
                    ((TransitionOnClick)object5).addOnClickListeners(motionLayout0, v, motionScene$Transition2);
                }
            }
        }
        for(Object object6: arrayList1) {
            Transition motionScene$Transition3 = (Transition)object6;
            if(motionScene$Transition3.m.size() > 0) {
                for(Object object7: motionScene$Transition3.m) {
                    ((TransitionOnClick)object7).addOnClickListeners(motionLayout0, v, motionScene$Transition3);
                }
            }
        }
    }

    public void addTransition(Transition motionScene$Transition0) {
        int v = this.d(motionScene$Transition0);
        ArrayList arrayList0 = this.e;
        if(v == -1) {
            arrayList0.add(motionScene$Transition0);
            return;
        }
        arrayList0.set(v, motionScene$Transition0);
    }

    public boolean applyViewTransition(int v, MotionController motionController0) {
        for(Object object0: this.r.b) {
            ViewTransition viewTransition0 = (ViewTransition)object0;
            if(viewTransition0.a == v) {
                viewTransition0.f.addAllFrames(motionController0);
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    public final ConstraintSet b(int v) {
        SparseArray sparseArray0 = this.h;
        StateSet stateSet0 = this.b;
        if(stateSet0 != null) {
            int v1 = stateSet0.stateGetConstraintID(v, -1, -1);
            if(v1 != -1) {
                v = v1;
            }
        }
        if(sparseArray0.get(v) == null) {
            Log.e("MotionScene", "Warning could not find ConstraintSet id/" + Debug.getName(this.a.getContext(), v) + " In MotionScene");
            return (ConstraintSet)sparseArray0.get(sparseArray0.keyAt(0));
        }
        return (ConstraintSet)sparseArray0.get(v);
    }

    public Transition bestTransitionFor(int v, float f, float f1, MotionEvent motionEvent0) {
        if(v != -1) {
            List list0 = this.getTransitionsWithState(v);
            RectF rectF0 = new RectF();
            float f2 = 0.0f;
            Transition motionScene$Transition0 = null;
            for(Object object0: list0) {
                Transition motionScene$Transition1 = (Transition)object0;
                if(!motionScene$Transition1.o) {
                    s s0 = motionScene$Transition1.l;
                    if(s0 != null) {
                        s0.c(this.q);
                        MotionLayout motionLayout0 = this.a;
                        RectF rectF1 = motionScene$Transition1.l.b(motionLayout0, rectF0);
                        if(rectF1 == null || motionEvent0 == null || rectF1.contains(motionEvent0.getX(), motionEvent0.getY())) {
                            RectF rectF2 = motionScene$Transition1.l.a(motionLayout0, rectF0);
                            if(rectF2 == null || motionEvent0 == null || rectF2.contains(motionEvent0.getX(), motionEvent0.getY())) {
                                float f3 = motionScene$Transition1.l.l * f1 + motionScene$Transition1.l.k * f;
                                if(motionScene$Transition1.l.j && motionEvent0 != null) {
                                    float f4 = motionEvent0.getX();
                                    motionScene$Transition1.l.getClass();
                                    float f5 = motionEvent0.getY();
                                    motionScene$Transition1.l.getClass();
                                    f3 = ((float)(Math.atan2(f1 + (f5 - 0.5f), f + (f4 - 0.5f)) - Math.atan2(f4 - 0.5f, f5 - 0.5f))) * 10.0f;
                                }
                                float f6 = f3 * (motionScene$Transition1.c == v ? -1.0f : 1.1f);
                                if(f6 > f2) {
                                    motionScene$Transition0 = motionScene$Transition1;
                                    f2 = f6;
                                }
                            }
                        }
                    }
                }
            }
            return motionScene$Transition0;
        }
        return this.c;
    }

    public final int c(Context context0, String s) {
        int v = s.contains("/") ? context0.getResources().getIdentifier(s.substring(s.indexOf(0x2F) + 1), "id", "net.daum.android.tistoryapp") : -1;
        if(v == -1) {
            if(s.length() > 1) {
                return Integer.parseInt(s.substring(1));
            }
            Log.e("MotionScene", "error in parsing id");
        }
        return v;
    }

    public final int d(Transition motionScene$Transition0) {
        int v = motionScene$Transition0.a;
        if(v == -1) {
            throw new IllegalArgumentException("The transition must have an id");
        }
        for(int v1 = 0; true; ++v1) {
            ArrayList arrayList0 = this.e;
            if(v1 >= arrayList0.size()) {
                break;
            }
            if(((Transition)arrayList0.get(v1)).a == v) {
                return v1;
            }
        }
        return -1;
    }

    public void disableAutoTransition(boolean z) {
        this.d = z;
    }

    public final Key e(int v, int v1, int v2) {
        Transition motionScene$Transition0 = this.c;
        if(motionScene$Transition0 == null) {
            return null;
        }
        for(Object object0: motionScene$Transition0.k) {
            KeyFrames keyFrames0 = (KeyFrames)object0;
            for(Object object1: keyFrames0.getKeys()) {
                Integer integer0 = (Integer)object1;
                if(v1 == ((int)integer0)) {
                    for(Object object2: keyFrames0.getKeyFramesForView(((int)integer0))) {
                        Key key0 = (Key)object2;
                        if(key0.a == v2 && key0.mType == v) {
                            return key0;
                        }
                        if(false) {
                            break;
                        }
                    }
                    if(false) {
                        break;
                    }
                }
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    public void enableViewTransition(int v, boolean z) {
        for(Object object0: this.r.b) {
            ViewTransition viewTransition0 = (ViewTransition)object0;
            if(viewTransition0.a == v) {
                viewTransition0.c = !z;
                return;
            }
            if(false) {
                break;
            }
        }
    }

    public final float f() {
        Transition motionScene$Transition0 = this.c;
        if(motionScene$Transition0 != null) {
            return motionScene$Transition0.l == null ? 0.0f : motionScene$Transition0.l.t;
        }
        return 0.0f;
    }

    public final int g() {
        return this.c == null ? -1 : this.c.d;
    }

    public int gatPathMotionArc() {
        return this.c == null ? -1 : this.c.p;
    }

    public ConstraintSet getConstraintSet(Context context0, String s) {
        SparseArray sparseArray0 = this.h;
        for(int v = 0; v < sparseArray0.size(); ++v) {
            int v1 = sparseArray0.keyAt(v);
            if(s.equals(context0.getResources().getResourceName(v1))) {
                return (ConstraintSet)sparseArray0.get(v1);
            }
        }
        return null;
    }

    public int[] getConstraintSetIds() {
        SparseArray sparseArray0 = this.h;
        int v = sparseArray0.size();
        int[] arr_v = new int[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_v[v1] = sparseArray0.keyAt(v1);
        }
        return arr_v;
    }

    public ArrayList getDefinedTransitions() {
        return this.e;
    }

    public int getDuration() {
        return this.c == null ? this.k : this.c.h;
    }

    public Interpolator getInterpolator() {
        Transition motionScene$Transition0 = this.c;
        int v = motionScene$Transition0.e;
        if(v != -2) {
            switch(v) {
                case -1: {
                    return new h(Easing.getInterpolator(motionScene$Transition0.f), 1);
                }
                case 0: {
                    return new AccelerateDecelerateInterpolator();
                }
                case 1: {
                    return new AccelerateInterpolator();
                }
                case 2: {
                    return new DecelerateInterpolator();
                }
                case 4: {
                    return new BounceInterpolator();
                }
                case 5: {
                    return new OvershootInterpolator();
                }
                case 6: {
                    return new AnticipateInterpolator();
                }
                default: {
                    return null;
                }
            }
        }
        return AnimationUtils.loadInterpolator(this.a.getContext(), this.c.g);
    }

    public void getKeyFrames(MotionController motionController0) {
        Transition motionScene$Transition0 = this.c;
        if(motionScene$Transition0 == null) {
            Transition motionScene$Transition1 = this.f;
            if(motionScene$Transition1 != null) {
                for(Object object0: motionScene$Transition1.k) {
                    ((KeyFrames)object0).addFrames(motionController0);
                }
            }
            return;
        }
        for(Object object1: motionScene$Transition0.k) {
            ((KeyFrames)object1).addFrames(motionController0);
        }
    }

    public float getPathPercent(View view0, int v) {
        return 0.0f;
    }

    public float getStaggered() {
        return this.c == null ? 0.0f : this.c.i;
    }

    public Transition getTransitionById(int v) {
        for(Object object0: this.e) {
            Transition motionScene$Transition0 = (Transition)object0;
            if(motionScene$Transition0.a == v) {
                return motionScene$Transition0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    public List getTransitionsWithState(int v) {
        StateSet stateSet0 = this.b;
        if(stateSet0 != null) {
            int v1 = stateSet0.stateGetConstraintID(v, -1, -1);
            if(v1 != -1) {
                v = v1;
            }
        }
        List list0 = new ArrayList();
        for(Object object0: this.e) {
            Transition motionScene$Transition0 = (Transition)object0;
            if(motionScene$Transition0.d == v || motionScene$Transition0.c == v) {
                ((ArrayList)list0).add(motionScene$Transition0);
            }
        }
        return list0;
    }

    // This method was un-flattened
    public final int h(Context context0, XmlResourceParser xmlResourceParser0) {
        ConstraintSet constraintSet0 = new ConstraintSet();
        constraintSet0.setForceId(false);
        int v = xmlResourceParser0.getAttributeCount();
        int v2 = -1;
        int v3 = -1;
        for(int v1 = 0; v1 < v; ++v1) {
            String s = xmlResourceParser0.getAttributeName(v1);
            String s1 = xmlResourceParser0.getAttributeValue(v1);
            s.getClass();
            switch(s) {
                case "constraintRotate": {
                    try {
                        constraintSet0.mRotate = Integer.parseInt(s1);
                    }
                    catch(NumberFormatException unused_ex) {
                        s1.getClass();
                        switch(s1) {
                            case "left": {
                                constraintSet0.mRotate = 2;
                                break;
                            }
                            case "none": {
                                constraintSet0.mRotate = 0;
                                break;
                            }
                            case "right": {
                                constraintSet0.mRotate = 1;
                                break;
                            }
                            case "x_left": {
                                constraintSet0.mRotate = 4;
                                break;
                            }
                            case "x_right": {
                                constraintSet0.mRotate = 3;
                            }
                        }
                    }
                    break;
                }
                case "deriveConstraintsFrom": {
                    v3 = this.c(context0, s1);
                    break;
                }
                case "id": {
                    v2 = this.c(context0, s1);
                    this.i.put(MotionScene.stripID(s1), v2);
                    constraintSet0.mIdString = Debug.getName(context0, v2);
                }
            }
        }
        if(v2 != -1) {
            constraintSet0.load(context0, xmlResourceParser0);
            if(v3 != -1) {
                this.j.put(v2, v3);
            }
            this.h.put(v2, constraintSet0);
        }
        return v2;
    }

    public final int i(Context context0, int v) {
        XmlResourceParser xmlResourceParser0 = context0.getResources().getXml(v);
        try {
            for(int v1 = xmlResourceParser0.getEventType(); true; v1 = xmlResourceParser0.next()) {
                if(v1 == 1) {
                    return -1;
                }
                if(2 == v1 && "ConstraintSet".equals(xmlResourceParser0.getName())) {
                    return this.h(context0, xmlResourceParser0);
                }
            }
        }
        catch(XmlPullParserException xmlPullParserException0) {
        }
        catch(IOException iOException0) {
            iOException0.printStackTrace();
            return -1;
        }
        xmlPullParserException0.printStackTrace();
        return -1;
    }

    public boolean isViewTransitionEnabled(int v) {
        for(Object object0: this.r.b) {
            ViewTransition viewTransition0 = (ViewTransition)object0;
            if(viewTransition0.a == v) {
                return !viewTransition0.c;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    public final void j(Context context0, XmlResourceParser xmlResourceParser0) {
        TypedArray typedArray0 = context0.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser0), styleable.include);
        int v = typedArray0.getIndexCount();
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = typedArray0.getIndex(v1);
            if(v2 == styleable.include_constraintSet) {
                this.i(context0, typedArray0.getResourceId(v2, -1));
            }
        }
        typedArray0.recycle();
    }

    public final void k(Context context0, XmlResourceParser xmlResourceParser0) {
        TypedArray typedArray0 = context0.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser0), styleable.MotionScene);
        int v = typedArray0.getIndexCount();
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = typedArray0.getIndex(v1);
            if(v2 == styleable.MotionScene_defaultDuration) {
                int v3 = typedArray0.getInt(v2, this.k);
                this.k = v3;
                if(v3 < 8) {
                    this.k = 8;
                }
            }
            else if(v2 == styleable.MotionScene_layoutDuringTransition) {
                this.l = typedArray0.getInteger(v2, 0);
            }
        }
        typedArray0.recycle();
    }

    public final void l(MotionLayout motionLayout0, int v) {
        SparseArray sparseArray0 = this.h;
        ConstraintSet constraintSet0 = (ConstraintSet)sparseArray0.get(v);
        constraintSet0.derivedState = constraintSet0.mIdString;
        int v1 = this.j.get(v);
        if(v1 > 0) {
            this.l(motionLayout0, v1);
            ConstraintSet constraintSet1 = (ConstraintSet)sparseArray0.get(v1);
            if(constraintSet1 == null) {
                Log.e("MotionScene", "ERROR! invalid deriveConstraintsFrom: @id/" + Debug.getName(this.a.getContext(), v1));
                return;
            }
            constraintSet0.derivedState = constraintSet0.derivedState + "/" + constraintSet1.derivedState;
            constraintSet0.readFallback(constraintSet1);
        }
        else {
            constraintSet0.derivedState = a.o(new StringBuilder(), constraintSet0.derivedState, "  layout");
            constraintSet0.readFallback(motionLayout0);
        }
        constraintSet0.applyDeltaFrom(constraintSet0);
    }

    public int lookUpConstraintId(String s) {
        Integer integer0 = (Integer)this.i.get(s);
        return integer0 == null ? 0 : ((int)integer0);
    }

    public String lookUpConstraintName(int v) {
        for(Object object0: this.i.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            Integer integer0 = (Integer)map$Entry0.getValue();
            if(integer0 != null && ((int)integer0) == v) {
                return (String)map$Entry0.getKey();
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    public final void m(MotionLayout motionLayout0) {
        for(int v = 0; true; ++v) {
            SparseArray sparseArray0 = this.h;
            if(v >= sparseArray0.size()) {
                break;
            }
            int v1 = sparseArray0.keyAt(v);
            SparseIntArray sparseIntArray0 = this.j;
            int v2 = sparseIntArray0.get(v1);
            for(int v3 = sparseIntArray0.size(); v2 > 0; --v3) {
                if(v2 == v1 || v3 < 0) {
                    Log.e("MotionScene", "Cannot be derived from yourself");
                    return;
                }
                v2 = sparseIntArray0.get(v2);
            }
            this.l(motionLayout0, v1);
        }
    }

    public final void n(int v, int v1) {
        int v3;
        int v2;
        StateSet stateSet0 = this.b;
        if(stateSet0 == null) {
            v2 = v;
            v3 = v1;
        }
        else {
            v2 = stateSet0.stateGetConstraintID(v, -1, -1);
            if(v2 == -1) {
                v2 = v;
            }
            v3 = this.b.stateGetConstraintID(v1, -1, -1);
            if(v3 == -1) {
                v3 = v1;
            }
        }
        if(this.c != null && this.c.c == v1 && this.c.d == v) {
            return;
        }
        ArrayList arrayList0 = this.e;
        for(Object object0: arrayList0) {
            Transition motionScene$Transition0 = (Transition)object0;
            if(motionScene$Transition0.c == v3 && motionScene$Transition0.d == v2 || motionScene$Transition0.c == v1 && motionScene$Transition0.d == v) {
                this.c = motionScene$Transition0;
                s s0 = motionScene$Transition0.l;
                if(s0 != null) {
                    s0.c(this.q);
                }
                return;
            }
            if(false) {
                break;
            }
        }
        Transition motionScene$Transition1 = this.f;
        for(Object object1: this.g) {
            Transition motionScene$Transition2 = (Transition)object1;
            if(motionScene$Transition2.c == v1) {
                motionScene$Transition1 = motionScene$Transition2;
            }
        }
        Transition motionScene$Transition3 = new Transition(this, motionScene$Transition1);
        motionScene$Transition3.d = v2;
        motionScene$Transition3.c = v3;
        if(v2 != -1) {
            arrayList0.add(motionScene$Transition3);
        }
        this.c = motionScene$Transition3;
    }

    public final boolean o() {
        for(Object object0: this.e) {
            if(((Transition)object0).l != null) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return this.c != null && this.c.l != null;
    }

    public void onLayout(boolean z, int v, int v1, int v2, int v3) {
    }

    public void removeTransition(Transition motionScene$Transition0) {
        int v = this.d(motionScene$Transition0);
        if(v != -1) {
            this.e.remove(v);
        }
    }

    public void setConstraintSet(int v, ConstraintSet constraintSet0) {
        this.h.put(v, constraintSet0);
    }

    public void setDuration(int v) {
        Transition motionScene$Transition0 = this.c;
        if(motionScene$Transition0 != null) {
            motionScene$Transition0.setDuration(v);
            return;
        }
        this.k = v;
    }

    public void setKeyframe(View view0, int v, String s, Object object0) {
        Transition motionScene$Transition0 = this.c;
        if(motionScene$Transition0 == null) {
            return;
        }
        for(Object object1: motionScene$Transition0.k) {
            for(Object object2: ((KeyFrames)object1).getKeyFramesForView(view0.getId())) {
                if(((Key)object2).a == v) {
                    if(object0 != null) {
                        Float float0 = (Float)object0;
                    }
                    s.equalsIgnoreCase("app:PerpendicularPath_percent");
                }
            }
        }
    }

    public void setRtl(boolean z) {
        this.q = z;
        Transition motionScene$Transition0 = this.c;
        if(motionScene$Transition0 != null) {
            s s0 = motionScene$Transition0.l;
            if(s0 != null) {
                s0.c(z);
            }
        }
    }

    public void setTransition(Transition motionScene$Transition0) {
        this.c = motionScene$Transition0;
        if(motionScene$Transition0 != null) {
            s s0 = motionScene$Transition0.l;
            if(s0 != null) {
                s0.c(this.q);
            }
        }
    }

    public static String stripID(String s) {
        if(s == null) {
            return "";
        }
        int v = s.indexOf(0x2F);
        return v >= 0 ? s.substring(v + 1) : s;
    }

    public boolean validateLayout(MotionLayout motionLayout0) {
        return motionLayout0 == this.a && motionLayout0.a == this;
    }

    public void viewTransition(int v, View[] arr_view) {
        String s;
        ViewTransitionController viewTransitionController0 = this.r;
        viewTransitionController0.getClass();
        ArrayList arrayList0 = new ArrayList();
        Iterator iterator0 = viewTransitionController0.b.iterator();
        ViewTransition viewTransition0 = null;
        while(true) {
            boolean z = iterator0.hasNext();
            s = viewTransitionController0.d;
            if(!z) {
                break;
            }
            Object object0 = iterator0.next();
            ViewTransition viewTransition1 = (ViewTransition)object0;
            if(viewTransition1.a == v) {
                for(int v1 = 0; v1 < arr_view.length; ++v1) {
                    View view0 = arr_view[v1];
                    if(viewTransition1.b(view0)) {
                        arrayList0.add(view0);
                    }
                }
                if(!arrayList0.isEmpty()) {
                    View[] arr_view1 = (View[])arrayList0.toArray(new View[0]);
                    MotionLayout motionLayout0 = viewTransitionController0.a;
                    int v2 = motionLayout0.getCurrentState();
                    if(viewTransition1.e == 2) {
                        viewTransition1.a(viewTransitionController0, viewTransitionController0.a, v2, null, arr_view1);
                    }
                    else if(v2 == -1) {
                        Log.w(s, "No support for ViewTransition within transition yet. Currently: " + motionLayout0.toString());
                    }
                    else {
                        ConstraintSet constraintSet0 = motionLayout0.getConstraintSet(v2);
                        if(constraintSet0 != null) {
                            viewTransition1.a(viewTransitionController0, viewTransitionController0.a, v2, constraintSet0, arr_view1);
                        }
                    }
                    arrayList0.clear();
                }
                viewTransition0 = viewTransition1;
            }
        }
        if(viewTransition0 == null) {
            Log.e(s, " Could not find ViewTransition");
        }
    }
}

