package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.activity.h;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.MotionScene.Transition;
import androidx.constraintlayout.widget.ConstraintSet.Constraint;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.R.styleable;
import java.util.ArrayList;

public class Carousel extends MotionHelper {
    public interface Adapter {
        int count();

        void onNewItem(int arg1);

        void populate(View arg1, int arg2);
    }

    public static final int TOUCH_UP_CARRY_ON = 2;
    public static final int TOUCH_UP_IMMEDIATE_STOP = 1;
    public Adapter e;
    public final ArrayList f;
    public int g;
    public int h;
    public MotionLayout i;
    public int j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;
    public float p;
    public int q;
    public int r;
    public int s;
    public float t;
    public int u;
    public int v;
    public final b w;

    public Carousel(Context context0) {
        super(context0);
        this.e = null;
        this.f = new ArrayList();
        this.g = 0;
        this.h = 0;
        this.j = -1;
        this.k = false;
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.o = -1;
        this.p = 0.9f;
        this.q = 0;
        this.r = 4;
        this.s = 1;
        this.t = 2.0f;
        this.u = -1;
        this.v = 200;
        this.w = new b(this);
    }

    public Carousel(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.e = null;
        this.f = new ArrayList();
        this.g = 0;
        this.h = 0;
        this.j = -1;
        this.k = false;
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.o = -1;
        this.p = 0.9f;
        this.q = 0;
        this.r = 4;
        this.s = 1;
        this.t = 2.0f;
        this.u = -1;
        this.v = 200;
        this.w = new b(this);
        this.g(context0, attributeSet0);
    }

    public Carousel(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.e = null;
        this.f = new ArrayList();
        this.g = 0;
        this.h = 0;
        this.j = -1;
        this.k = false;
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.o = -1;
        this.p = 0.9f;
        this.q = 0;
        this.r = 4;
        this.s = 1;
        this.t = 2.0f;
        this.u = -1;
        this.v = 200;
        this.w = new b(this);
        this.g(context0, attributeSet0);
    }

    public final void f(int v, boolean z) {
        if(v == -1) {
            return;
        }
        MotionLayout motionLayout0 = this.i;
        if(motionLayout0 == null) {
            return;
        }
        Transition motionScene$Transition0 = motionLayout0.getTransition(v);
        if(motionScene$Transition0 == null) {
            return;
        }
        if(z == motionScene$Transition0.isEnabled()) {
            return;
        }
        motionScene$Transition0.setEnabled(z);
    }

    public final void g(Context context0, AttributeSet attributeSet0) {
        if(attributeSet0 != null) {
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.Carousel);
            int v = typedArray0.getIndexCount();
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = typedArray0.getIndex(v1);
                if(v2 == styleable.Carousel_carousel_firstView) {
                    this.j = typedArray0.getResourceId(v2, this.j);
                }
                else if(v2 == styleable.Carousel_carousel_backwardTransition) {
                    this.l = typedArray0.getResourceId(v2, this.l);
                }
                else if(v2 == styleable.Carousel_carousel_forwardTransition) {
                    this.m = typedArray0.getResourceId(v2, this.m);
                }
                else if(v2 == styleable.Carousel_carousel_emptyViewsBehavior) {
                    this.r = typedArray0.getInt(v2, this.r);
                }
                else if(v2 == styleable.Carousel_carousel_previousState) {
                    this.n = typedArray0.getResourceId(v2, this.n);
                }
                else if(v2 == styleable.Carousel_carousel_nextState) {
                    this.o = typedArray0.getResourceId(v2, this.o);
                }
                else if(v2 == styleable.Carousel_carousel_touchUp_dampeningFactor) {
                    this.p = typedArray0.getFloat(v2, this.p);
                }
                else if(v2 == styleable.Carousel_carousel_touchUpMode) {
                    this.s = typedArray0.getInt(v2, this.s);
                }
                else if(v2 == styleable.Carousel_carousel_touchUp_velocityThreshold) {
                    this.t = typedArray0.getFloat(v2, this.t);
                }
                else if(v2 == styleable.Carousel_carousel_infinite) {
                    this.k = typedArray0.getBoolean(v2, this.k);
                }
            }
            typedArray0.recycle();
        }
    }

    public int getCount() {
        return this.e == null ? 0 : this.e.count();
    }

    public int getCurrentIndex() {
        return this.h;
    }

    public final void h() {
        Adapter carousel$Adapter0 = this.e;
        if(carousel$Adapter0 == null) {
            return;
        }
        if(this.i == null) {
            return;
        }
        if(carousel$Adapter0.count() == 0) {
            return;
        }
        ArrayList arrayList0 = this.f;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = (View)arrayList0.get(v1);
            int v2 = this.h + v1 - this.q;
            if(this.k) {
                if(v2 < 0) {
                    int v3 = this.r;
                    if(v3 == 4) {
                        this.i(0, view0);
                    }
                    else {
                        this.i(v3, view0);
                    }
                    if(v2 % this.e.count() == 0) {
                        this.e.populate(view0, 0);
                    }
                    else {
                        Adapter carousel$Adapter1 = this.e;
                        int v4 = carousel$Adapter1.count();
                        carousel$Adapter1.populate(view0, v2 % this.e.count() + v4);
                    }
                }
                else {
                    if(v2 >= this.e.count()) {
                        if(v2 == this.e.count()) {
                            v2 = 0;
                        }
                        else if(v2 > this.e.count()) {
                            v2 %= this.e.count();
                        }
                        int v5 = this.r;
                        if(v5 == 4) {
                            this.i(0, view0);
                        }
                        else {
                            this.i(v5, view0);
                        }
                    }
                    else {
                        this.i(0, view0);
                    }
                    this.e.populate(view0, v2);
                }
            }
            else if(v2 < 0) {
                this.i(this.r, view0);
            }
            else if(v2 >= this.e.count()) {
                this.i(this.r, view0);
            }
            else {
                this.i(0, view0);
                this.e.populate(view0, v2);
            }
        }
        int v6 = this.u;
        if(v6 != -1 && v6 != this.h) {
            this.i.post(new h(this, 5));
        }
        else if(v6 == this.h) {
            this.u = -1;
        }
        if(this.l != -1 && this.m != -1) {
            if(this.k) {
                return;
            }
            int v7 = this.e.count();
            if(this.h == 0) {
                this.f(this.l, false);
            }
            else {
                this.f(this.l, true);
                this.i.setTransition(this.l);
            }
            if(this.h == v7 - 1) {
                this.f(this.m, false);
                return;
            }
            this.f(this.m, true);
            this.i.setTransition(this.m);
            return;
        }
        Log.w("Carousel", "No backward or forward transitions defined for Carousel!");
    }

    public final void i(int v, View view0) {
        MotionLayout motionLayout0 = this.i;
        if(motionLayout0 == null) {
            return;
        }
        int[] arr_v = motionLayout0.getConstraintSetIds();
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            ConstraintSet constraintSet0 = this.i.getConstraintSet(arr_v[v1]);
            if(constraintSet0 != null) {
                Constraint constraintSet$Constraint0 = constraintSet0.getConstraint(view0.getId());
                if(constraintSet$Constraint0 != null) {
                    constraintSet$Constraint0.propertySet.mVisibilityMode = 1;
                    view0.setVisibility(v);
                }
            }
        }
    }

    public void jumpToIndex(int v) {
        this.h = Math.max(0, Math.min(this.getCount() - 1, v));
        this.refresh();
    }

    @Override  // androidx.constraintlayout.widget.ConstraintHelper
    @RequiresApi(api = 17)
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if(this.getParent() instanceof MotionLayout) {
            MotionLayout motionLayout0 = (MotionLayout)this.getParent();
            for(int v = 0; v < this.mCount; ++v) {
                int v1 = this.mIds[v];
                View view0 = motionLayout0.getViewById(v1);
                if(this.j == v1) {
                    this.q = v;
                }
                this.f.add(view0);
            }
            this.i = motionLayout0;
            if(this.s == 2) {
                Transition motionScene$Transition0 = motionLayout0.getTransition(this.m);
                if(motionScene$Transition0 != null) {
                    motionScene$Transition0.setOnTouchUp(5);
                }
                Transition motionScene$Transition1 = this.i.getTransition(this.l);
                if(motionScene$Transition1 != null) {
                    motionScene$Transition1.setOnTouchUp(5);
                }
            }
            this.h();
        }
    }

    @Override  // androidx.constraintlayout.motion.widget.MotionHelper
    public void onTransitionChange(MotionLayout motionLayout0, int v, int v1, float f) {
    }

    @Override  // androidx.constraintlayout.motion.widget.MotionHelper
    public void onTransitionCompleted(MotionLayout motionLayout0, int v) {
        int v1 = this.h;
        this.g = v1;
        if(v == this.o) {
            this.h = v1 + 1;
        }
        else if(v == this.n) {
            this.h = v1 - 1;
        }
        if(this.k) {
            if(this.h >= this.e.count()) {
                this.h = 0;
            }
            if(this.h < 0) {
                this.h = this.e.count() - 1;
            }
        }
        else {
            if(this.h >= this.e.count()) {
                this.h = this.e.count() - 1;
            }
            if(this.h < 0) {
                this.h = 0;
            }
        }
        if(this.g != this.h) {
            this.i.post(this.w);
        }
    }

    public void refresh() {
        ArrayList arrayList0 = this.f;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = (View)arrayList0.get(v1);
            if(this.e.count() == 0) {
                this.i(this.r, view0);
            }
            else {
                this.i(0, view0);
            }
        }
        this.i.rebuildScene();
        this.h();
    }

    public void setAdapter(Adapter carousel$Adapter0) {
        this.e = carousel$Adapter0;
    }

    public void transitionToIndex(int v, int v1) {
        this.u = Math.max(0, Math.min(this.getCount() - 1, v));
        int v2 = Math.max(0, v1);
        this.v = v2;
        this.i.setTransitionDuration(v2);
        if(v < this.h) {
            this.i.transitionToState(this.n, this.v);
            return;
        }
        this.i.transitionToState(this.o, this.v);
    }
}

