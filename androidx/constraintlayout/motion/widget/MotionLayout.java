package androidx.constraintlayout.motion.widget;

import a5.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.a;
import androidx.constraintlayout.core.motion.utils.CurveFit;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.core.motion.utils.VelocityMatrix;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.motion.utils.StopLogic;
import androidx.constraintlayout.motion.utils.ViewOscillator;
import androidx.constraintlayout.motion.utils.ViewState;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayoutStates;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.R.id;
import androidx.constraintlayout.widget.R.styleable;
import androidx.constraintlayout.widget.StateSet;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.widget.NestedScrollView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class MotionLayout extends ConstraintLayout implements NestedScrollingParent3 {
    public interface MotionTracker {
        void addMovement(MotionEvent arg1);

        void clear();

        void computeCurrentVelocity(int arg1);

        void computeCurrentVelocity(int arg1, float arg2);

        float getXVelocity();

        float getXVelocity(int arg1);

        float getYVelocity();

        float getYVelocity(int arg1);

        void recycle();
    }

    public interface TransitionListener {
        void onTransitionChange(MotionLayout arg1, int arg2, int arg3, float arg4);

        void onTransitionCompleted(MotionLayout arg1, int arg2);

        void onTransitionStarted(MotionLayout arg1, int arg2, int arg3);

        void onTransitionTrigger(MotionLayout arg1, int arg2, boolean arg3, float arg4);
    }

    public int A;
    public int B;
    public boolean C;
    public float D;
    public static final int DEBUG_SHOW_NONE = 0;
    public static final int DEBUG_SHOW_PATH = 2;
    public static final int DEBUG_SHOW_PROGRESS = 1;
    public float E;
    public long F;
    public float G;
    public boolean H;
    public ArrayList I;
    public static boolean IS_IN_EDIT_MODE = false;
    public ArrayList J;
    public ArrayList K;
    public CopyOnWriteArrayList L;
    public int M;
    public long N;
    public float O;
    public int P;
    public float Q;
    public int R;
    public int S;
    public int T;
    public static final int TOUCH_UP_COMPLETE = 0;
    public static final int TOUCH_UP_COMPLETE_TO_END = 2;
    public static final int TOUCH_UP_COMPLETE_TO_START = 1;
    public static final int TOUCH_UP_DECELERATE = 4;
    public static final int TOUCH_UP_DECELERATE_AND_COMPLETE = 5;
    public static final int TOUCH_UP_NEVER_TO_END = 7;
    public static final int TOUCH_UP_NEVER_TO_START = 6;
    public static final int TOUCH_UP_STOP = 3;
    public int U;
    public int V;
    public static final int VELOCITY_LAYOUT = 1;
    public static final int VELOCITY_POST_LAYOUT = 0;
    public static final int VELOCITY_STATIC_LAYOUT = 3;
    public static final int VELOCITY_STATIC_POST_LAYOUT = 2;
    public int W;
    public MotionScene a;
    public float a0;
    public MotionInterpolator b;
    public final KeyCache b0;
    public Interpolator c;
    public boolean c0;
    public float d;
    public n d0;
    public int e;
    public Runnable e0;
    public int f;
    public int[] f0;
    public int g;
    public int g0;
    public int h;
    public boolean h0;
    public int i;
    public int i0;
    public boolean j;
    public final HashMap j0;
    public final HashMap k;
    public int k0;
    public long l;
    public int l0;
    public float m;
    public int m0;
    protected boolean mMeasureDuringTransition;
    public float n;
    public final Rect n0;
    public float o;
    public boolean o0;
    public long p;
    public o p0;
    public float q;
    public final l q0;
    public boolean r;
    public boolean r0;
    public boolean s;
    public final RectF s0;
    public TransitionListener t;
    public View t0;
    public int u;
    public Matrix u0;
    public k v;
    public final ArrayList v0;
    public boolean w;
    public final StopLogic x;
    public final j y;
    public DesignTool z;

    public MotionLayout(@NonNull Context context0) {
        super(context0);
        this.c = null;
        this.d = 0.0f;
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.h = 0;
        this.i = 0;
        this.j = true;
        this.k = new HashMap();
        this.l = 0L;
        this.m = 1.0f;
        this.n = 0.0f;
        this.o = 0.0f;
        this.q = 0.0f;
        this.s = false;
        this.u = 0;
        this.w = false;
        this.x = new StopLogic();
        this.y = new j(this);
        this.C = false;
        this.H = false;
        this.I = null;
        this.J = null;
        this.K = null;
        this.L = null;
        this.M = 0;
        this.N = -1L;
        this.O = 0.0f;
        this.P = 0;
        this.Q = 0.0f;
        this.mMeasureDuringTransition = false;
        this.b0 = new KeyCache();
        this.c0 = false;
        this.e0 = null;
        this.f0 = null;
        this.g0 = 0;
        this.h0 = false;
        this.i0 = 0;
        this.j0 = new HashMap();
        this.n0 = new Rect();
        this.o0 = false;
        this.p0 = o.a;
        this.q0 = new l(this);
        this.r0 = false;
        this.s0 = new RectF();
        this.t0 = null;
        this.u0 = null;
        this.v0 = new ArrayList();
        this.n(null);
    }

    public MotionLayout(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.c = null;
        this.d = 0.0f;
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.h = 0;
        this.i = 0;
        this.j = true;
        this.k = new HashMap();
        this.l = 0L;
        this.m = 1.0f;
        this.n = 0.0f;
        this.o = 0.0f;
        this.q = 0.0f;
        this.s = false;
        this.u = 0;
        this.w = false;
        this.x = new StopLogic();
        this.y = new j(this);
        this.C = false;
        this.H = false;
        this.I = null;
        this.J = null;
        this.K = null;
        this.L = null;
        this.M = 0;
        this.N = -1L;
        this.O = 0.0f;
        this.P = 0;
        this.Q = 0.0f;
        this.mMeasureDuringTransition = false;
        this.b0 = new KeyCache();
        this.c0 = false;
        this.e0 = null;
        this.f0 = null;
        this.g0 = 0;
        this.h0 = false;
        this.i0 = 0;
        this.j0 = new HashMap();
        this.n0 = new Rect();
        this.o0 = false;
        this.p0 = o.a;
        this.q0 = new l(this);
        this.r0 = false;
        this.s0 = new RectF();
        this.t0 = null;
        this.u0 = null;
        this.v0 = new ArrayList();
        this.n(attributeSet0);
    }

    public MotionLayout(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.c = null;
        this.d = 0.0f;
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.h = 0;
        this.i = 0;
        this.j = true;
        this.k = new HashMap();
        this.l = 0L;
        this.m = 1.0f;
        this.n = 0.0f;
        this.o = 0.0f;
        this.q = 0.0f;
        this.s = false;
        this.u = 0;
        this.w = false;
        this.x = new StopLogic();
        this.y = new j(this);
        this.C = false;
        this.H = false;
        this.I = null;
        this.J = null;
        this.K = null;
        this.L = null;
        this.M = 0;
        this.N = -1L;
        this.O = 0.0f;
        this.P = 0;
        this.Q = 0.0f;
        this.mMeasureDuringTransition = false;
        this.b0 = new KeyCache();
        this.c0 = false;
        this.e0 = null;
        this.f0 = null;
        this.g0 = 0;
        this.h0 = false;
        this.i0 = 0;
        this.j0 = new HashMap();
        this.n0 = new Rect();
        this.o0 = false;
        this.p0 = o.a;
        this.q0 = new l(this);
        this.r0 = false;
        this.s0 = new RectF();
        this.t0 = null;
        this.u0 = null;
        this.v0 = new ArrayList();
        this.n(attributeSet0);
    }

    public void addTransitionListener(TransitionListener motionLayout$TransitionListener0) {
        if(this.L == null) {
            this.L = new CopyOnWriteArrayList();
        }
        this.L.add(motionLayout$TransitionListener0);
    }

    public boolean applyViewTransition(int v, MotionController motionController0) {
        return this.a == null ? false : this.a.applyViewTransition(v, motionController0);
    }

    public static Rect c(MotionLayout motionLayout0, ConstraintWidget constraintWidget0) {
        motionLayout0.getClass();
        motionLayout0.n0.top = constraintWidget0.getY();
        motionLayout0.n0.left = constraintWidget0.getX();
        motionLayout0.n0.right = constraintWidget0.getWidth() + motionLayout0.n0.left;
        motionLayout0.n0.bottom = constraintWidget0.getHeight() + motionLayout0.n0.top;
        return motionLayout0.n0;
    }

    public ConstraintSet cloneConstraintSet(int v) {
        MotionScene motionScene0 = this.a;
        if(motionScene0 == null) {
            return null;
        }
        ConstraintSet constraintSet0 = motionScene0.b(v);
        ConstraintSet constraintSet1 = new ConstraintSet();
        constraintSet1.clone(constraintSet0);
        return constraintSet1;
    }

    @Override  // androidx.constraintlayout.widget.ConstraintLayout
    public void dispatchDraw(Canvas canvas0) {
        ArrayList arrayList0 = this.K;
        if(arrayList0 != null) {
            Iterator iterator0 = arrayList0.iterator();
            while(iterator0.hasNext()) {
                iterator0.next();
            }
        }
        this.j(false);
        MotionScene motionScene0 = this.a;
        if(motionScene0 != null) {
            ViewTransitionController viewTransitionController0 = motionScene0.r;
            if(viewTransitionController0 != null) {
                ArrayList arrayList1 = viewTransitionController0.e;
                if(arrayList1 != null) {
                    for(Object object0: arrayList1) {
                        ((t)object0).a();
                    }
                    viewTransitionController0.e.removeAll(viewTransitionController0.f);
                    viewTransitionController0.f.clear();
                    if(viewTransitionController0.e.isEmpty()) {
                        viewTransitionController0.e = null;
                    }
                }
            }
        }
        super.dispatchDraw(canvas0);
        if(this.a == null) {
            return;
        }
        if((this.u & 1) == 1 && !this.isInEditMode()) {
            ++this.M;
            long v = this.N;
            if(v == -1L) {
                this.N = 2258595069000L;
            }
            else if(2258595069000L - v > 200000000L) {
                this.O = ((float)(((int)(((float)this.M) / (((float)(2258595069000L - v)) * 1.000000E-09f) * 100.0f)))) / 100.0f;
                this.M = 0;
                this.N = 2258595069000L;
            }
            Paint paint0 = new Paint();
            paint0.setTextSize(42.0f);
            StringBuilder stringBuilder0 = b.t((this.O + " fps " + Debug.getState(this, this.e) + " -> "));
            stringBuilder0.append(Debug.getState(this, this.g));
            stringBuilder0.append(" (progress: ");
            stringBuilder0.append(((float)(((int)(this.getProgress() * 1000.0f)))) / 10.0f);
            stringBuilder0.append(" ) state=");
            stringBuilder0.append((this.f == -1 ? "undefined" : Debug.getState(this, this.f)));
            String s = stringBuilder0.toString();
            paint0.setColor(0xFF000000);
            canvas0.drawText(s, 11.0f, ((float)(this.getHeight() - 29)), paint0);
            paint0.setColor(0xFF880088);
            canvas0.drawText(s, 10.0f, ((float)(this.getHeight() - 30)), paint0);
        }
        if(this.u > 1) {
            if(this.v == null) {
                this.v = new k(this);
            }
            k k0 = this.v;
            int v1 = this.a.getDuration();
            int v2 = this.u;
            k0.getClass();
            HashMap hashMap0 = this.k;
            if(hashMap0 != null && hashMap0.size() != 0) {
                canvas0.save();
                MotionLayout motionLayout0 = k0.n;
                boolean z = motionLayout0.isInEditMode();
                Paint paint1 = k0.e;
                if(!z && (v2 & 1) == 2) {
                    String s1 = motionLayout0.getContext().getResources().getResourceName(motionLayout0.g) + ":" + motionLayout0.getProgress();
                    canvas0.drawText(s1, 10.0f, ((float)(motionLayout0.getHeight() - 30)), k0.h);
                    canvas0.drawText(s1, 11.0f, ((float)(motionLayout0.getHeight() - 29)), paint1);
                }
                for(Object object1: hashMap0.values()) {
                    MotionController motionController0 = (MotionController)object1;
                    int v3 = motionController0.getDrawPath();
                    if(v2 > 0 && v3 == 0) {
                        v3 = 1;
                    }
                    if(v3 != 0) {
                        k0.k = motionController0.a(k0.b, k0.c);
                        if(v3 >= 1) {
                            if(k0.a == null || k0.a.length != v1 / 16 * 2) {
                                k0.a = new float[v1 / 16 * 2];
                                k0.d = new Path();
                            }
                            float f = (float)k0.m;
                            canvas0.translate(f, f);
                            paint1.setColor(0x77000000);
                            k0.i.setColor(0x77000000);
                            k0.f.setColor(0x77000000);
                            k0.g.setColor(0x77000000);
                            motionController0.b(k0.a, v1 / 16);
                            k0.a(canvas0, v3, k0.k, motionController0);
                            paint1.setColor(0xFFFFAA33);
                            k0.f.setColor(-2067046);
                            k0.i.setColor(-2067046);
                            k0.g.setColor(0xFF33AA00);
                            float f1 = (float)(-k0.m);
                            canvas0.translate(f1, f1);
                            k0.a(canvas0, v3, k0.k, motionController0);
                            if(v3 == 5) {
                                k0.d.reset();
                                for(int v4 = 0; v4 <= 50; ++v4) {
                                    float f2 = motionController0.c(((float)v4) / 50.0f, null);
                                    motionController0.j[0].getPos(((double)f2), motionController0.p);
                                    motionController0.f.d(motionController0.o, motionController0.p, k0.j, 0);
                                    k0.d.moveTo(k0.j[0], k0.j[1]);
                                    k0.d.lineTo(k0.j[2], k0.j[3]);
                                    k0.d.lineTo(k0.j[4], k0.j[5]);
                                    k0.d.lineTo(k0.j[6], k0.j[7]);
                                    k0.d.close();
                                }
                                paint1.setColor(0x44000000);
                                canvas0.translate(2.0f, 2.0f);
                                canvas0.drawPath(k0.d, paint1);
                                canvas0.translate(-2.0f, -2.0f);
                                paint1.setColor(0xFFFF0000);
                                canvas0.drawPath(k0.d, paint1);
                            }
                        }
                    }
                }
                canvas0.restore();
            }
        }
        ArrayList arrayList2 = this.K;
        if(arrayList2 != null) {
            Iterator iterator3 = arrayList2.iterator();
            while(iterator3.hasNext()) {
                iterator3.next();
            }
        }
    }

    public void enableTransition(int v, boolean z) {
        Transition motionScene$Transition0 = this.getTransition(v);
        if(z) {
            motionScene$Transition0.setEnabled(true);
            return;
        }
        MotionScene motionScene0 = this.a;
        if(motionScene$Transition0 == motionScene0.c) {
            for(Object object0: motionScene0.getTransitionsWithState(this.f)) {
                Transition motionScene$Transition1 = (Transition)object0;
                if(motionScene$Transition1.isEnabled()) {
                    this.a.c = motionScene$Transition1;
                    break;
                }
                if(false) {
                    break;
                }
            }
        }
        motionScene$Transition0.setEnabled(false);
    }

    public void enableViewTransition(int v, boolean z) {
        MotionScene motionScene0 = this.a;
        if(motionScene0 != null) {
            motionScene0.enableViewTransition(v, z);
        }
    }

    public void fireTransitionCompleted() {
        if((this.t != null || this.L != null && !this.L.isEmpty()) && this.P == -1) {
            this.P = this.f;
            ArrayList arrayList0 = this.v0;
            int v = arrayList0.isEmpty() ? -1 : ((int)(((Integer)arrayList0.get(arrayList0.size() - 1))));
            int v1 = this.f;
            if(v != v1 && v1 != -1) {
                arrayList0.add(v1);
            }
        }
        this.p();
        Runnable runnable0 = this.e0;
        if(runnable0 != null) {
            runnable0.run();
        }
        int[] arr_v = this.f0;
        if(arr_v != null && this.g0 > 0) {
            this.transitionToState(arr_v[0]);
            System.arraycopy(this.f0, 1, this.f0, 0, this.f0.length - 1);
            --this.g0;
        }
    }

    public void fireTrigger(int v, boolean z, float f) {
        TransitionListener motionLayout$TransitionListener0 = this.t;
        if(motionLayout$TransitionListener0 != null) {
            motionLayout$TransitionListener0.onTransitionTrigger(this, v, z, f);
        }
        CopyOnWriteArrayList copyOnWriteArrayList0 = this.L;
        if(copyOnWriteArrayList0 != null) {
            for(Object object0: copyOnWriteArrayList0) {
                ((TransitionListener)object0).onTransitionTrigger(this, v, z, f);
            }
        }
    }

    public ConstraintSet getConstraintSet(int v) {
        return this.a == null ? null : this.a.b(v);
    }

    public int[] getConstraintSetIds() {
        return this.a == null ? null : this.a.getConstraintSetIds();
    }

    public int getCurrentState() {
        return this.f;
    }

    public void getDebugMode(boolean z) {
        this.u = z ? 2 : 1;
        this.invalidate();
    }

    public ArrayList getDefinedTransitions() {
        return this.a == null ? null : this.a.getDefinedTransitions();
    }

    public DesignTool getDesignTool() {
        if(this.z == null) {
            this.z = new DesignTool(this);
        }
        return this.z;
    }

    public int getEndState() {
        return this.g;
    }

    public long getNanoTime() [...] // 潜在的解密器

    public float getProgress() {
        return this.o;
    }

    public MotionScene getScene() {
        return this.a;
    }

    public int getStartState() {
        return this.e;
    }

    public float getTargetPosition() {
        return this.q;
    }

    public Transition getTransition(int v) {
        return this.a.getTransitionById(v);
    }

    public Bundle getTransitionState() {
        if(this.d0 == null) {
            this.d0 = new n(this);
        }
        n n0 = this.d0;
        n0.d = n0.e.g;
        n0.c = n0.e.e;
        n0.b = n0.e.getVelocity();
        n0.a = n0.e.getProgress();
        n n1 = this.d0;
        n1.getClass();
        Bundle bundle0 = new Bundle();
        bundle0.putFloat("motion.progress", n1.a);
        bundle0.putFloat("motion.velocity", n1.b);
        bundle0.putInt("motion.StartState", n1.c);
        bundle0.putInt("motion.EndState", n1.d);
        return bundle0;
    }

    public long getTransitionTimeMs() {
        MotionScene motionScene0 = this.a;
        if(motionScene0 != null) {
            this.m = ((float)motionScene0.getDuration()) / 1000.0f;
        }
        return (long)(this.m * 1000.0f);
    }

    public float getVelocity() {
        return this.d;
    }

    public void getViewVelocity(View view0, float f, float f1, float[] arr_f, int v) {
        double[] arr_f5;
        SplineSet splineSet2;
        float f8;
        float f2 = this.d;
        float f3 = this.o;
        if(this.b != null) {
            float f4 = Math.signum(this.q - f3);
            float f5 = this.b.getInterpolation(this.o + 0.00001f);
            float f6 = this.b.getInterpolation(this.o);
            f2 = (f5 - f6) / 0.00001f * f4 / this.m;
            f3 = f6;
        }
        MotionInterpolator motionInterpolator0 = this.b;
        if(motionInterpolator0 != null) {
            f2 = motionInterpolator0.getVelocity();
        }
        MotionController motionController0 = (MotionController)this.k.get(view0);
        if((v & 1) == 0) {
            int v1 = view0.getWidth();
            int v2 = view0.getHeight();
            float[] arr_f1 = motionController0.v;
            float f7 = motionController0.c(f3, arr_f1);
            SplineSet splineSet0 = motionController0.y == null ? null : ((SplineSet)motionController0.y.get("translationX"));
            SplineSet splineSet1 = motionController0.y == null ? null : ((SplineSet)motionController0.y.get("translationY"));
            HashMap hashMap0 = motionController0.y;
            if(hashMap0 == null) {
                f8 = f2;
                splineSet2 = null;
            }
            else {
                splineSet2 = (SplineSet)hashMap0.get("rotation");
                f8 = f2;
            }
            SplineSet splineSet3 = motionController0.y == null ? null : ((SplineSet)motionController0.y.get("scaleX"));
            SplineSet splineSet4 = motionController0.y == null ? null : ((SplineSet)motionController0.y.get("scaleY"));
            ViewOscillator viewOscillator0 = motionController0.z == null ? null : ((ViewOscillator)motionController0.z.get("translationX"));
            ViewOscillator viewOscillator1 = motionController0.z == null ? null : ((ViewOscillator)motionController0.z.get("translationY"));
            ViewOscillator viewOscillator2 = motionController0.z == null ? null : ((ViewOscillator)motionController0.z.get("rotation"));
            ViewOscillator viewOscillator3 = motionController0.z == null ? null : ((ViewOscillator)motionController0.z.get("scaleX"));
            ViewOscillator viewOscillator4 = motionController0.z == null ? null : ((ViewOscillator)motionController0.z.get("scaleY"));
            VelocityMatrix velocityMatrix0 = new VelocityMatrix();
            velocityMatrix0.clear();
            velocityMatrix0.setRotationVelocity(splineSet2, f7);
            velocityMatrix0.setTranslationVelocity(splineSet0, splineSet1, f7);
            velocityMatrix0.setScaleVelocity(splineSet3, splineSet4, f7);
            velocityMatrix0.setRotationVelocity(viewOscillator2, f7);
            velocityMatrix0.setTranslationVelocity(viewOscillator0, viewOscillator1, f7);
            velocityMatrix0.setScaleVelocity(viewOscillator3, viewOscillator4, f7);
            CurveFit curveFit0 = motionController0.k;
            if(curveFit0 != null) {
                double[] arr_f2 = motionController0.p;
                if(arr_f2.length > 0) {
                    curveFit0.getPos(((double)f7), arr_f2);
                    motionController0.k.getSlope(((double)f7), motionController0.q);
                    int[] arr_v = motionController0.o;
                    double[] arr_f3 = motionController0.q;
                    double[] arr_f4 = motionController0.p;
                    motionController0.f.getClass();
                    p.f(f, f1, arr_f, arr_v, arr_f3, arr_f4);
                }
            }
            else if(motionController0.j == null) {
                float f11 = motionController0.g.e - motionController0.f.e;
                float f12 = motionController0.g.f - motionController0.f.f;
                float f13 = motionController0.g.h - motionController0.f.h + f12;
                arr_f[0] = (motionController0.g.g - motionController0.f.g + f11) * f + (1.0f - f) * f11;
                arr_f[1] = f13 * f1 + (1.0f - f1) * f12;
                velocityMatrix0.clear();
                velocityMatrix0.setRotationVelocity(splineSet2, f7);
                velocityMatrix0.setTranslationVelocity(splineSet0, splineSet1, f7);
                velocityMatrix0.setScaleVelocity(splineSet3, splineSet4, f7);
                velocityMatrix0.setRotationVelocity(viewOscillator2, f7);
                velocityMatrix0.setTranslationVelocity(viewOscillator0, viewOscillator1, f7);
                velocityMatrix0.setScaleVelocity(viewOscillator3, viewOscillator4, f7);
            }
            else {
                float f9 = motionController0.c(f7, arr_f1);
                motionController0.j[0].getSlope(((double)f9), motionController0.q);
                motionController0.j[0].getPos(((double)f9), motionController0.p);
                float f10 = arr_f1[0];
                for(int v3 = 0; true; ++v3) {
                    arr_f5 = motionController0.q;
                    if(v3 >= arr_f5.length) {
                        break;
                    }
                    arr_f5[v3] *= (double)f10;
                }
                int[] arr_v1 = motionController0.o;
                double[] arr_f6 = motionController0.p;
                motionController0.f.getClass();
                p.f(f, f1, arr_f, arr_v1, arr_f5, arr_f6);
            }
            velocityMatrix0.applyTransform(f, f1, v1, v2, arr_f);
        }
        else {
            f8 = f2;
            motionController0.d(f3, arr_f, f, f1);
        }
        if(v < 2) {
            arr_f[0] *= f8;
            arr_f[1] *= f8;
        }
    }

    public final void h(float f) {
        MotionScene motionScene0 = this.a;
        if(motionScene0 == null) {
            return;
        }
        float f1 = this.n;
        if(this.o != f1 && this.r) {
            this.o = f1;
        }
        float f2 = this.o;
        if(f2 == f) {
            return;
        }
        this.w = false;
        this.q = f;
        this.m = ((float)motionScene0.getDuration()) / 1000.0f;
        this.setProgress(this.q);
        this.b = null;
        this.c = this.a.getInterpolator();
        this.r = false;
        this.l = 2259915984100L;
        this.s = true;
        this.n = f2;
        this.o = f2;
        this.invalidate();
    }

    public final void i(boolean z) {
        int v = this.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = this.getChildAt(v1);
            MotionController motionController0 = (MotionController)this.k.get(view0);
            if(motionController0 != null && "button".equals(Debug.getName(motionController0.b)) && motionController0.A != null) {
                for(int v2 = 0; true; ++v2) {
                    KeyTrigger[] arr_keyTrigger = motionController0.A;
                    if(v2 >= arr_keyTrigger.length) {
                        break;
                    }
                    arr_keyTrigger[v2].conditionallyFire((z ? -100.0f : 100.0f), motionController0.b);
                }
            }
        }
    }

    @Override  // android.view.View
    public boolean isAttachedToWindow() {
        return super.isAttachedToWindow();
    }

    public boolean isDelayedApplicationOfInitialState() {
        return this.o0;
    }

    public boolean isInRotation() {
        return this.h0;
    }

    public boolean isInteractionEnabled() {
        return this.j;
    }

    public boolean isViewTransitionEnabled(int v) {
        return this.a == null ? false : this.a.isViewTransitionEnabled(v);
    }

    public final void j(boolean z) {
        int v4;
        int v1;
        boolean z3;
        if(this.p == -1L) {
            this.p = 2260410262900L;
        }
        float f = this.o;
        if(Float.compare(f, 0.0f) > 0 && f < 1.0f) {
            this.f = -1;
        }
        boolean z1 = true;
        boolean z2 = false;
        if(this.H || this.s && (z || this.q != f)) {
            float f1 = Math.signum(this.q - f);
            MotionInterpolator motionInterpolator0 = this.b;
            float f2 = motionInterpolator0 == null ? ((float)(2260410719000L - this.p)) * f1 * 1.000000E-09f / this.m : 0.0f;
            float f3 = this.r ? this.q : this.o + f2;
            int v = Float.compare(f1, 0.0f);
            if((v <= 0 || f3 < this.q) && (f1 > 0.0f || f3 > this.q)) {
                z3 = false;
            }
            else {
                f3 = this.q;
                this.s = false;
                z3 = true;
            }
            this.o = f3;
            this.n = f3;
            this.p = 2260410719000L;
            if(motionInterpolator0 == null || z3) {
                this.d = f2;
                v1 = 0;
            }
            else if(this.w) {
                float f4 = motionInterpolator0.getInterpolation(((float)(2260410719000L - this.l)) * 1.000000E-09f);
                StopLogic stopLogic0 = this.x;
                if(this.b != stopLogic0) {
                    v1 = 0;
                }
                else if(stopLogic0.isStopped()) {
                    v1 = 2;
                }
                else {
                    v1 = 1;
                }
                this.o = f4;
                this.p = 2260410719000L;
                MotionInterpolator motionInterpolator1 = this.b;
                if(motionInterpolator1 == null) {
                    f3 = f4;
                }
                else {
                    float f5 = motionInterpolator1.getVelocity();
                    this.d = f5;
                    if(Math.abs(f5) * this.m <= 0.00001f && v1 == 2) {
                        this.s = false;
                    }
                    if(f5 > 0.0f && f4 >= 1.0f) {
                        this.o = 1.0f;
                        this.s = false;
                        f4 = 1.0f;
                    }
                    if(f5 >= 0.0f || f4 > 0.0f) {
                        f3 = f4;
                    }
                    else {
                        this.o = 0.0f;
                        this.s = false;
                        f3 = 0.0f;
                    }
                }
            }
            else {
                float f6 = motionInterpolator0.getInterpolation(f3);
                MotionInterpolator motionInterpolator2 = this.b;
                if(motionInterpolator2 == null) {
                    throw new NullPointerException();
                }
                this.d = motionInterpolator2.getVelocity();
                f3 = f6;
                v1 = 0;
            }
            if(Math.abs(this.d) > 0.00001f) {
                this.setState(o.c);
            }
            o o0 = o.d;
            if(v1 != 1) {
                if(v > 0 && f3 >= this.q || f1 <= 0.0f && f3 <= this.q) {
                    f3 = this.q;
                    this.s = false;
                }
                if(f3 >= 1.0f || f3 <= 0.0f) {
                    this.s = false;
                    this.setState(o0);
                }
            }
            int v2 = this.getChildCount();
            this.H = false;
            this.a0 = f3;
            float f7 = this.c == null ? f3 : this.c.getInterpolation(f3);
            Interpolator interpolator0 = this.c;
            if(interpolator0 != null) {
                this.d = interpolator0.getInterpolation(f1 / this.m + f3) - this.c.getInterpolation(f3);
            }
            for(int v3 = 0; v3 < v2; v3 = v4 + 1) {
                View view0 = this.getChildAt(v3);
                MotionController motionController0 = (MotionController)this.k.get(view0);
                if(motionController0 == null) {
                    v4 = v3;
                }
                else {
                    boolean z4 = this.H;
                    v4 = v3;
                    this.H = motionController0.f(view0, f7, 2260411274100L, this.b0) | z4;
                }
            }
            int v5 = (v <= 0 || f3 < this.q) && (f1 > 0.0f || f3 > this.q) ? 0 : 1;
            if(!this.H && !this.s && v5 != 0) {
                this.setState(o0);
            }
            if(this.mMeasureDuringTransition) {
                this.requestLayout();
            }
            this.H |= v5 ^ 1;
            if(f3 <= 0.0f) {
                int v6 = this.e;
                if(v6 != -1 && this.f != v6) {
                    this.f = v6;
                    this.a.b(v6).applyCustomAttributes(this);
                    this.setState(o0);
                    z2 = true;
                }
            }
            if(((double)f3) >= 1.0) {
                int v7 = this.g;
                if(this.f != v7) {
                    this.f = v7;
                    this.a.b(v7).applyCustomAttributes(this);
                    this.setState(o0);
                    z2 = true;
                }
            }
            if(this.H || this.s) {
                this.invalidate();
            }
            else if(v > 0 && f3 == 1.0f || f1 < 0.0f && f3 == 0.0f) {
                this.setState(o0);
            }
            if(!this.H && !this.s && (v > 0 && f3 == 1.0f || f1 < 0.0f && f3 == 0.0f)) {
                this.o();
            }
        }
        float f8 = this.o;
        if(f8 >= 1.0f) {
            int v8 = this.g;
            if(this.f == v8) {
                z1 = z2;
            }
            this.f = v8;
            z2 = z1;
        }
        else if(f8 <= 0.0f) {
            int v9 = this.e;
            if(this.f == v9) {
                z1 = z2;
            }
            this.f = v9;
            z2 = z1;
        }
        this.r0 |= z2;
        if(z2 && !this.c0) {
            this.requestLayout();
        }
        this.n = this.o;
    }

    public void jumpToState(int v) {
        if(!this.isAttachedToWindow()) {
            this.f = v;
        }
        if(this.e == v) {
            this.setProgress(0.0f);
            return;
        }
        if(this.g == v) {
            this.setProgress(1.0f);
            return;
        }
        this.setTransition(v, v);
    }

    public final void k() {
        if((this.t != null || this.L != null && !this.L.isEmpty()) && this.Q != this.n) {
            if(this.P != -1) {
                TransitionListener motionLayout$TransitionListener0 = this.t;
                if(motionLayout$TransitionListener0 != null) {
                    motionLayout$TransitionListener0.onTransitionStarted(this, this.e, this.g);
                }
                CopyOnWriteArrayList copyOnWriteArrayList0 = this.L;
                if(copyOnWriteArrayList0 != null) {
                    for(Object object0: copyOnWriteArrayList0) {
                        ((TransitionListener)object0).onTransitionStarted(this, this.e, this.g);
                    }
                }
            }
            this.P = -1;
            float f = this.n;
            this.Q = f;
            TransitionListener motionLayout$TransitionListener1 = this.t;
            if(motionLayout$TransitionListener1 != null) {
                motionLayout$TransitionListener1.onTransitionChange(this, this.e, this.g, f);
            }
            CopyOnWriteArrayList copyOnWriteArrayList1 = this.L;
            if(copyOnWriteArrayList1 != null) {
                for(Object object1: copyOnWriteArrayList1) {
                    ((TransitionListener)object1).onTransitionChange(this, this.e, this.g, this.n);
                }
            }
        }
    }

    public final void l(float f, float f1, float f2, int v, float[] arr_f) {
        View view0 = this.getViewById(v);
        MotionController motionController0 = (MotionController)this.k.get(view0);
        if(motionController0 != null) {
            motionController0.d(f, arr_f, f1, f2);
            view0.getY();
            return;
        }
        Log.w("MotionLayout", "WARNING could not find view id " + (view0 == null ? "" + v : view0.getContext().getResources().getResourceName(v)));
    }

    @Override  // androidx.constraintlayout.widget.ConstraintLayout
    public void loadLayoutDescription(int v) {
        if(v == 0) {
            this.a = null;
        }
        else {
            try {
                MotionScene motionScene0 = new MotionScene(this.getContext(), this, v);
                this.a = motionScene0;
                int v1 = -1;
                if(this.f == -1) {
                    this.f = motionScene0.g();
                    this.e = this.a.g();
                    Transition motionScene$Transition0 = this.a.c;
                    if(motionScene$Transition0 != null) {
                        v1 = motionScene$Transition0.c;
                    }
                    this.g = v1;
                }
                if(!this.isAttachedToWindow()) {
                    this.a = null;
                    return;
                }
            }
            catch(Exception exception0) {
                throw new IllegalArgumentException("unable to parse MotionScene file", exception0);
            }
            try {
                Display display0 = this.getDisplay();
                this.m0 = display0 == null ? 0 : display0.getRotation();
                MotionScene motionScene1 = this.a;
                if(motionScene1 != null) {
                    ConstraintSet constraintSet0 = motionScene1.b(this.f);
                    this.a.m(this);
                    ArrayList arrayList0 = this.K;
                    if(arrayList0 != null) {
                        Iterator iterator0 = arrayList0.iterator();
                        while(iterator0.hasNext()) {
                            iterator0.next();
                        }
                    }
                    if(constraintSet0 != null) {
                        constraintSet0.applyTo(this);
                    }
                    this.e = this.f;
                }
                this.o();
                n n0 = this.d0;
                if(n0 != null) {
                    if(this.o0) {
                        this.post(new i(this, 0));
                        return;
                    }
                    n0.a();
                    return;
                }
                if(this.a != null && (this.a.c != null && this.a.c.getAutoTransition() == 4)) {
                    this.transitionToEnd();
                    this.setState(o.b);
                    this.setState(o.c);
                    return;
                }
                return;
            }
            catch(Exception exception1) {
            }
            throw new IllegalArgumentException("unable to parse MotionScene file", exception1);
        }
    }

    public final boolean m(float f, float f1, View view0, MotionEvent motionEvent0) {
        boolean z1;
        boolean z = false;
        if(view0 instanceof ViewGroup) {
            for(int v = ((ViewGroup)view0).getChildCount() - 1; v >= 0; --v) {
                View view1 = ((ViewGroup)view0).getChildAt(v);
                if(this.m(((float)view1.getLeft()) + f - ((float)view0.getScrollX()), ((float)view1.getTop()) + f1 - ((float)view0.getScrollY()), view1, motionEvent0)) {
                    z = true;
                    break;
                }
            }
        }
        if(!z) {
            float f2 = ((float)view0.getRight()) + f - ((float)view0.getLeft());
            float f3 = ((float)view0.getBottom()) + f1 - ((float)view0.getTop());
            this.s0.set(f, f1, f2, f3);
            if(motionEvent0.getAction() != 0 || this.s0.contains(motionEvent0.getX(), motionEvent0.getY())) {
                Matrix matrix0 = view0.getMatrix();
                if(matrix0.isIdentity()) {
                    motionEvent0.offsetLocation(-f, -f1);
                    z1 = view0.onTouchEvent(motionEvent0);
                    motionEvent0.offsetLocation(--f, --f1);
                    return z1;
                }
                MotionEvent motionEvent1 = MotionEvent.obtain(motionEvent0);
                motionEvent1.offsetLocation(-f, -f1);
                if(this.u0 == null) {
                    this.u0 = new Matrix();
                }
                matrix0.invert(this.u0);
                motionEvent1.transform(this.u0);
                z1 = view0.onTouchEvent(motionEvent1);
                motionEvent1.recycle();
                return z1;
            }
        }
        return z;
    }

    public final void n(AttributeSet attributeSet0) {
        MotionLayout.IS_IN_EDIT_MODE = this.isInEditMode();
        int v = -1;
        if(attributeSet0 != null) {
            TypedArray typedArray0 = this.getContext().obtainStyledAttributes(attributeSet0, styleable.MotionLayout);
            int v2 = typedArray0.getIndexCount();
            boolean z = true;
            for(int v3 = 0; v3 < v2; ++v3) {
                int v4 = typedArray0.getIndex(v3);
                if(v4 == styleable.MotionLayout_layoutDescription) {
                    int v5 = typedArray0.getResourceId(v4, -1);
                    this.a = new MotionScene(this.getContext(), this, v5);
                }
                else if(v4 == styleable.MotionLayout_currentState) {
                    this.f = typedArray0.getResourceId(v4, -1);
                }
                else if(v4 == styleable.MotionLayout_motionProgress) {
                    this.q = typedArray0.getFloat(v4, 0.0f);
                    this.s = true;
                }
                else if(v4 == styleable.MotionLayout_applyMotionScene) {
                    z = typedArray0.getBoolean(v4, z);
                }
                else if(v4 != styleable.MotionLayout_showPaths) {
                    if(v4 == styleable.MotionLayout_motionDebug) {
                        this.u = typedArray0.getInt(v4, 0);
                    }
                }
                else if(this.u == 0) {
                    this.u = typedArray0.getBoolean(v4, false) ? 2 : 0;
                }
            }
            typedArray0.recycle();
            if(this.a == null) {
                Log.e("MotionLayout", "WARNING NO app:layoutDescription tag");
            }
            if(!z) {
                this.a = null;
            }
        }
        if(this.u != 0) {
            MotionScene motionScene0 = this.a;
            if(motionScene0 == null) {
                Log.e("MotionLayout", "CHECK: motion scene not set! set \"app:layoutDescription=\"@xml/file\"");
            }
            else {
                int v6 = motionScene0.g();
                ConstraintSet constraintSet0 = this.a.b(this.a.g());
                String s = Debug.getName(this.getContext(), v6);
                int v7 = this.getChildCount();
                for(int v8 = 0; v8 < v7; ++v8) {
                    View view0 = this.getChildAt(v8);
                    int v9 = view0.getId();
                    if(v9 == -1) {
                        StringBuilder stringBuilder0 = b.v("CHECK: ", s, " ALL VIEWS SHOULD HAVE ID\'s ");
                        stringBuilder0.append(view0.getClass().getName());
                        stringBuilder0.append(" does not!");
                        Log.w("MotionLayout", stringBuilder0.toString());
                    }
                    if(constraintSet0.getConstraint(v9) == null) {
                        StringBuilder stringBuilder1 = b.v("CHECK: ", s, " NO CONSTRAINTS for ");
                        stringBuilder1.append(Debug.getName(view0));
                        Log.w("MotionLayout", stringBuilder1.toString());
                    }
                }
                int[] arr_v = constraintSet0.getKnownIds();
                for(int v1 = 0; v1 < arr_v.length; ++v1) {
                    int v10 = arr_v[v1];
                    String s1 = Debug.getName(this.getContext(), v10);
                    if(this.findViewById(arr_v[v1]) == null) {
                        Log.w("MotionLayout", "CHECK: " + s + " NO View matches id " + s1);
                    }
                    if(constraintSet0.getHeight(v10) == -1) {
                        Log.w("MotionLayout", "CHECK: " + s + "(" + s1 + ") no LAYOUT_HEIGHT");
                    }
                    if(constraintSet0.getWidth(v10) == -1) {
                        Log.w("MotionLayout", "CHECK: " + s + "(" + s1 + ") no LAYOUT_HEIGHT");
                    }
                }
                SparseIntArray sparseIntArray0 = new SparseIntArray();
                SparseIntArray sparseIntArray1 = new SparseIntArray();
                for(Object object0: this.a.getDefinedTransitions()) {
                    if(((Transition)object0) == this.a.c) {
                        Log.v("MotionLayout", "CHECK: CURRENT");
                    }
                    if(((Transition)object0).getStartConstraintSetId() == ((Transition)object0).getEndConstraintSetId()) {
                        Log.e("MotionLayout", "CHECK: start and end constraint set should not be the same!");
                    }
                    int v11 = ((Transition)object0).getStartConstraintSetId();
                    int v12 = ((Transition)object0).getEndConstraintSetId();
                    String s2 = Debug.getName(this.getContext(), v11);
                    String s3 = Debug.getName(this.getContext(), v12);
                    if(sparseIntArray0.get(v11) == v12) {
                        Log.e("MotionLayout", "CHECK: two transitions with the same start and end " + s2 + "->" + s3);
                    }
                    if(sparseIntArray1.get(v12) == v11) {
                        Log.e("MotionLayout", "CHECK: you can\'t have reverse transitions" + s2 + "->" + s3);
                    }
                    sparseIntArray0.put(v11, v12);
                    sparseIntArray1.put(v12, v11);
                    if(this.a.b(v11) == null) {
                        Log.e("MotionLayout", " no such constraintSetStart " + s2);
                    }
                    if(this.a.b(v12) == null) {
                        Log.e("MotionLayout", " no such constraintSetEnd " + s2);
                    }
                }
            }
        }
        if(this.f == -1) {
            MotionScene motionScene1 = this.a;
            if(motionScene1 != null) {
                this.f = motionScene1.g();
                this.e = this.a.g();
                Transition motionScene$Transition0 = this.a.c;
                if(motionScene$Transition0 != null) {
                    v = motionScene$Transition0.c;
                }
                this.g = v;
            }
        }
    }

    public final void o() {
        View view0;
        MotionScene motionScene0 = this.a;
        if(motionScene0 == null) {
            return;
        }
        if(motionScene0.a(this, this.f)) {
            this.requestLayout();
            return;
        }
        int v = this.f;
        if(v != -1) {
            this.a.addOnClickListeners(this, v);
        }
        if(this.a.o()) {
            Transition motionScene$Transition0 = this.a.c;
            if(motionScene$Transition0 != null) {
                s s0 = motionScene$Transition0.l;
                if(s0 != null) {
                    int v1 = s0.d;
                    if(v1 == -1) {
                        view0 = null;
                    }
                    else {
                        MotionLayout motionLayout0 = s0.r;
                        view0 = motionLayout0.findViewById(v1);
                        if(view0 == null) {
                            Log.e("TouchResponse", "cannot find TouchAnchorId @id/" + Debug.getName(motionLayout0.getContext(), s0.d));
                        }
                    }
                    if(view0 instanceof NestedScrollView) {
                        ((NestedScrollView)view0).setOnTouchListener(new q(0));
                        ((NestedScrollView)view0).setOnScrollChangeListener(new r());  // 初始化器: Ljava/lang/Object;-><init>()V
                    }
                }
            }
        }
    }

    public MotionTracker obtainVelocityTracker() {
        m.b.a = VelocityTracker.obtain();
        return m.b;
    }

    @Override  // android.view.ViewGroup
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Display display0 = this.getDisplay();
        if(display0 != null) {
            this.m0 = display0.getRotation();
        }
        MotionScene motionScene0 = this.a;
        if(motionScene0 != null) {
            int v = this.f;
            if(v != -1) {
                ConstraintSet constraintSet0 = motionScene0.b(v);
                this.a.m(this);
                ArrayList arrayList0 = this.K;
                if(arrayList0 != null) {
                    Iterator iterator0 = arrayList0.iterator();
                    while(iterator0.hasNext()) {
                        iterator0.next();
                    }
                }
                if(constraintSet0 != null) {
                    constraintSet0.applyTo(this);
                }
                this.e = this.f;
            }
        }
        this.o();
        n n0 = this.d0;
        if(n0 != null) {
            if(this.o0) {
                this.post(new i(this, 2));
                return;
            }
            n0.a();
            return;
        }
        if(this.a != null && (this.a.c != null && this.a.c.getAutoTransition() == 4)) {
            this.transitionToEnd();
            this.setState(o.b);
            this.setState(o.c);
        }
    }

    @Override  // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent0) {
        ViewTransition viewTransition2;
        MotionScene motionScene0 = this.a;
        if(motionScene0 != null && this.j) {
            ViewTransitionController viewTransitionController0 = motionScene0.r;
            if(viewTransitionController0 != null) {
                MotionLayout motionLayout0 = viewTransitionController0.a;
                int v = motionLayout0.getCurrentState();
                if(v != -1) {
                    ArrayList arrayList0 = viewTransitionController0.b;
                    if(viewTransitionController0.c == null) {
                        viewTransitionController0.c = new HashSet();
                        for(Object object0: arrayList0) {
                            ViewTransition viewTransition0 = (ViewTransition)object0;
                            int v1 = motionLayout0.getChildCount();
                            for(int v2 = 0; v2 < v1; ++v2) {
                                View view0 = motionLayout0.getChildAt(v2);
                                if(viewTransition0.c(view0)) {
                                    view0.getId();
                                    viewTransitionController0.c.add(view0);
                                }
                            }
                        }
                    }
                    float f = motionEvent0.getX();
                    float f1 = motionEvent0.getY();
                    Rect rect0 = new Rect();
                    int v3 = motionEvent0.getAction();
                    if(viewTransitionController0.e != null && !viewTransitionController0.e.isEmpty()) {
                        for(Object object1: viewTransitionController0.e) {
                            t t0 = (t)object1;
                            switch(v3) {
                                case 1: {
                                    if(t0.h) {
                                        continue;
                                    }
                                    t0.b();
                                    continue;
                                }
                                case 2: {
                                    t0.c.getView().getHitRect(t0.l);
                                    if(!t0.l.contains(((int)f), ((int)f1)) && !t0.h) {
                                        break;
                                    }
                                    continue;
                                }
                                default: {
                                    t0.getClass();
                                    continue;
                                }
                            }
                            t0.b();
                        }
                    }
                    if(v3 == 0 || v3 == 1) {
                        ConstraintSet constraintSet0 = motionLayout0.getConstraintSet(v);
                        for(Object object2: arrayList0) {
                            ViewTransition viewTransition1 = (ViewTransition)object2;
                            int v4 = viewTransition1.b;
                            if(v4 == 1) {
                                if(v3 != 0) {
                                    continue;
                                }
                            }
                            else if(v4 != 2) {
                                if(v4 == 3 && v3 == 0) {
                                    goto label_57;
                                }
                                continue;
                            }
                            else if(v3 != 1) {
                                continue;
                            }
                        label_57:
                            for(Object object3: viewTransitionController0.c) {
                                View view1 = (View)object3;
                                if(viewTransition1.c(view1)) {
                                    view1.getHitRect(rect0);
                                    if(rect0.contains(((int)f), ((int)f1))) {
                                        viewTransition2 = viewTransition1;
                                        viewTransition1.a(viewTransitionController0, viewTransitionController0.a, v, constraintSet0, new View[]{view1});
                                    }
                                    else {
                                        viewTransition2 = viewTransition1;
                                    }
                                    viewTransition1 = viewTransition2;
                                }
                            }
                        }
                    }
                }
            }
            Transition motionScene$Transition0 = this.a.c;
            if(motionScene$Transition0 != null && motionScene$Transition0.isEnabled()) {
                s s0 = motionScene$Transition0.getTouchResponse();
                if(s0 != null) {
                    if(motionEvent0.getAction() == 0) {
                        RectF rectF0 = s0.b(this, new RectF());
                        if(rectF0 != null && !rectF0.contains(motionEvent0.getX(), motionEvent0.getY())) {
                            return false;
                        }
                    }
                    int v5 = s0.e;
                    if(v5 != -1) {
                        if(this.t0 == null || this.t0.getId() != v5) {
                            this.t0 = this.findViewById(v5);
                        }
                        View view2 = this.t0;
                        if(view2 != null) {
                            float f2 = (float)view2.getLeft();
                            float f3 = (float)this.t0.getTop();
                            float f4 = (float)this.t0.getRight();
                            float f5 = (float)this.t0.getBottom();
                            this.s0.set(f2, f3, f4, f5);
                            float f6 = motionEvent0.getX();
                            float f7 = motionEvent0.getY();
                            return !this.s0.contains(f6, f7) || this.m(((float)this.t0.getLeft()), ((float)this.t0.getTop()), this.t0, motionEvent0) ? false : this.onTouchEvent(motionEvent0);
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override  // androidx.constraintlayout.widget.ConstraintLayout
    public void onLayout(boolean z, int v, int v1, int v2, int v3) {
        try {
            this.c0 = true;
            if(this.a == null) {
                super.onLayout(z, v, v1, v2, v3);
                this.c0 = false;
                return;
            }
            int v4 = v2 - v;
            int v5 = v3 - v1;
            if(this.A != v4 || this.B != v5) {
                this.rebuildScene();
                this.j(true);
            }
            this.A = v4;
            this.B = v5;
            this.c0 = false;
        }
        catch(Throwable throwable0) {
            this.c0 = false;
            throw throwable0;
        }
    }

    @Override  // androidx.constraintlayout.widget.ConstraintLayout
    public void onMeasure(int v, int v1) {
        boolean z2;
        if(this.a == null) {
            super.onMeasure(v, v1);
            return;
        }
        boolean z = true;
        boolean z1 = this.h != v || this.i != v1;
        if(this.r0) {
            this.r0 = false;
            this.o();
            this.p();
            z1 = true;
        }
        if(this.mDirtyHierarchy) {
            z1 = true;
        }
        this.h = v;
        this.i = v1;
        int v3 = this.a.g();
        Transition motionScene$Transition0 = this.a.c;
        int v4 = motionScene$Transition0 == null ? -1 : motionScene$Transition0.c;
        l l0 = this.q0;
        if(!z1 && v3 == l0.e && v4 == l0.f || this.e == -1) {
            if(z1) {
                super.onMeasure(v, v1);
            }
            z2 = true;
        }
        else {
            super.onMeasure(v, v1);
            l0.e(this.a.b(v3), this.a.b(v4));
            l0.f();
            l0.e = v3;
            l0.f = v4;
            z2 = false;
        }
        if(this.mMeasureDuringTransition || z2) {
            int v5 = this.getPaddingTop();
            int v6 = this.getPaddingBottom();
            int v7 = this.getPaddingLeft();
            int v8 = this.getPaddingRight();
            int v9 = this.mLayoutWidget.getWidth() + (v8 + v7);
            int v10 = this.mLayoutWidget.getHeight() + (v6 + v5);
            if(this.V == 0x80000000 || this.V == 0) {
                v9 = (int)(this.a0 * ((float)(this.T - this.R)) + ((float)this.R));
                this.requestLayout();
            }
            if(this.W == 0x80000000 || this.W == 0) {
                v10 = (int)(this.a0 * ((float)(this.U - this.S)) + ((float)this.S));
                this.requestLayout();
            }
            this.setMeasuredDimension(v9, v10);
        }
        float f = Math.signum(this.q - this.o);
        MotionInterpolator motionInterpolator0 = this.b;
        float f1 = this.r ? this.q : this.o + (motionInterpolator0 instanceof StopLogic ? 0.0f : ((float)(2262124193900L - this.p)) * f * 1.000000E-09f / this.m);
        int v11 = Float.compare(f, 0.0f);
        if((v11 <= 0 || f1 < this.q) && (f > 0.0f || f1 > this.q)) {
            z = false;
        }
        else {
            f1 = this.q;
        }
        if(motionInterpolator0 != null && !z) {
            f1 = this.w ? motionInterpolator0.getInterpolation(((float)(2262124193900L - this.l)) * 1.000000E-09f) : motionInterpolator0.getInterpolation(f1);
        }
        if(v11 > 0 && f1 >= this.q || f <= 0.0f && f1 <= this.q) {
            f1 = this.q;
        }
        this.a0 = f1;
        int v12 = this.getChildCount();
        Interpolator interpolator0 = this.c;
        if(interpolator0 != null) {
            f1 = interpolator0.getInterpolation(f1);
        }
        for(int v2 = 0; v2 < v12; ++v2) {
            View view0 = this.getChildAt(v2);
            MotionController motionController0 = (MotionController)this.k.get(view0);
            if(motionController0 != null) {
                motionController0.f(view0, f1, 0x20EB12471F8L, this.b0);
            }
        }
        if(this.mMeasureDuringTransition) {
            this.requestLayout();
        }
    }

    @Override  // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(@NonNull View view0, float f, float f1, boolean z) {
        return false;
    }

    @Override  // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(@NonNull View view0, float f, float f1) {
        return false;
    }

    @Override  // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(@NonNull View view0, int v, int v1, @NonNull int[] arr_v, int v2) {
        float f1;
        boolean z;
        MotionScene motionScene0 = this.a;
        if(motionScene0 == null) {
            return;
        }
        int v3 = -1;
        Transition motionScene$Transition0 = motionScene0.c;
        if(motionScene$Transition0 != null && motionScene$Transition0.isEnabled()) {
            s s0 = motionScene$Transition0.getTouchResponse();
            if(s0 != null && (s0.e != -1 && view0.getId() != s0.e)) {
                return;
            }
            Transition motionScene$Transition1 = motionScene0.c;
            if(motionScene$Transition1 == null) {
                z = false;
            }
            else {
                s s1 = motionScene$Transition1.l;
                z = s1 == null ? false : s1.u;
            }
            if(z) {
                s s2 = motionScene$Transition0.getTouchResponse();
                if(s2 != null && (s2.w & 4) != 0) {
                    v3 = v1;
                }
                if((this.n == 0 || this.n == 0x3F800000) && view0.canScrollVertically(v3)) {
                    return;
                }
            }
            if(motionScene$Transition0.getTouchResponse() != null && (motionScene$Transition0.getTouchResponse().w & 1) != 0) {
                Transition motionScene$Transition2 = motionScene0.c;
                if(motionScene$Transition2 == null) {
                    f1 = 0.0f;
                }
                else {
                    s s3 = motionScene$Transition2.l;
                    if(s3 == null) {
                        f1 = 0.0f;
                    }
                    else {
                        s3.r.l(s3.r.getProgress(), s3.h, s3.g, s3.d, s3.n);
                        float f = s3.k;
                        float[] arr_f = s3.n;
                        if(Float.compare(f, 0.0f) == 0) {
                            if(arr_f[1] == 0.0f) {
                                arr_f[1] = 1.000000E-07f;
                            }
                            f1 = ((float)v1) * s3.l / arr_f[1];
                        }
                        else {
                            if(arr_f[0] == 0.0f) {
                                arr_f[0] = 1.000000E-07f;
                            }
                            f1 = ((float)v) * f / arr_f[0];
                        }
                    }
                }
                if(this.o <= 0.0f && f1 < 0.0f || this.o >= 1.0f && f1 > 0.0f) {
                    view0.setNestedScrollingEnabled(false);
                    view0.post(new a(view0, 3));
                    return;
                }
            }
            float f2 = this.n;
            this.D = (float)v;
            this.E = (float)v1;
            this.G = (float)(((double)(0x20E7C4F0948L - this.F)) * 1.000000E-09);
            this.F = 0x20E7C4F0948L;
            Transition motionScene$Transition3 = motionScene0.c;
            if(motionScene$Transition3 != null) {
                s s4 = motionScene$Transition3.l;
                if(s4 != null) {
                    MotionLayout motionLayout0 = s4.r;
                    float f3 = motionLayout0.getProgress();
                    if(!s4.m) {
                        s4.m = true;
                        motionLayout0.setProgress(f3);
                    }
                    s4.r.l(f3, s4.h, s4.g, s4.d, s4.n);
                    float[] arr_f1 = s4.n;
                    if(((double)Math.abs(s4.l * arr_f1[1] + s4.k * arr_f1[0])) < 0.01) {
                        arr_f1[0] = 0.01f;
                        arr_f1[1] = 0.01f;
                    }
                    float f4 = Math.max(Math.min(f3 + (s4.k == 0.0f ? ((float)v1) * s4.l / arr_f1[1] : ((float)v) * s4.k / arr_f1[0]), 1.0f), 0.0f);
                    if(f4 != motionLayout0.getProgress()) {
                        motionLayout0.setProgress(f4);
                    }
                }
            }
            if(f2 != this.n) {
                arr_v[0] = v;
                arr_v[1] = v1;
            }
            this.j(false);
            if(arr_v[0] != 0 || arr_v[1] != 0) {
                this.C = true;
            }
        }
    }

    @Override  // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(@NonNull View view0, int v, int v1, int v2, int v3, int v4) {
    }

    @Override  // androidx.core.view.NestedScrollingParent3
    public void onNestedScroll(@NonNull View view0, int v, int v1, int v2, int v3, int v4, int[] arr_v) {
        if(this.C || v != 0 || v1 != 0) {
            arr_v[0] += v2;
            arr_v[1] += v3;
        }
        this.C = false;
    }

    @Override  // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(@NonNull View view0, @NonNull View view1, int v, int v1) {
        this.F = 2261104141800L;
        this.G = 0.0f;
        this.D = 0.0f;
        this.E = 0.0f;
    }

    @Override  // android.view.View
    public void onRtlPropertiesChanged(int v) {
        MotionScene motionScene0 = this.a;
        if(motionScene0 != null) {
            motionScene0.setRtl(this.isRtl());
        }
    }

    @Override  // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(@NonNull View view0, @NonNull View view1, int v, int v1) {
        return this.a != null && (this.a.c != null && this.a.c.getTouchResponse() != null && (this.a.c.getTouchResponse().w & 2) == 0);
    }

    @Override  // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(@NonNull View view0, int v) {
        MotionScene motionScene0 = this.a;
        if(motionScene0 != null) {
            float f = this.G;
            float f1 = 0.0f;
            if(f != 0.0f) {
                float f2 = this.D / f;
                float f3 = this.E / f;
                Transition motionScene$Transition0 = motionScene0.c;
                if(motionScene$Transition0 != null) {
                    s s0 = motionScene$Transition0.l;
                    if(s0 != null) {
                        int v1 = 0;
                        s0.m = false;
                        MotionLayout motionLayout0 = s0.r;
                        float f4 = motionLayout0.getProgress();
                        s0.r.l(f4, s0.h, s0.g, s0.d, s0.n);
                        float f5 = s0.k == 0.0f ? f3 * s0.l / s0.n[1] : f2 * s0.k / s0.n[0];
                        if(!Float.isNaN(f5)) {
                            f4 += f5 / 3.0f;
                        }
                        if(f4 != 0.0f) {
                            int v2 = s0.c;
                            if(v2 != 3) {
                                v1 = 1;
                            }
                            if((v1 & (f4 == 1.0f ? 0 : 1)) != 0) {
                                if(((double)f4) >= 0.5) {
                                    f1 = 1.0f;
                                }
                                motionLayout0.touchAnimateTo(v2, f1, f5);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override  // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent0) {
        MotionScene motionScene1;
        int v4;
        float f9;
        float f8;
        if(this.a != null && this.j && this.a.o()) {
            Transition motionScene$Transition0 = this.a.c;
            if(motionScene$Transition0 != null && !motionScene$Transition0.isEnabled()) {
                return super.onTouchEvent(motionEvent0);
            }
            MotionScene motionScene0 = this.a;
            int v = this.getCurrentState();
            motionScene0.getClass();
            RectF rectF0 = new RectF();
            MotionLayout motionLayout0 = motionScene0.a;
            if(motionScene0.p == null) {
                motionScene0.p = motionLayout0.obtainVelocityTracker();
            }
            motionScene0.p.addMovement(motionEvent0);
            if(v == -1) {
            label_48:
                if(!motionScene0.n) {
                    Transition motionScene$Transition2 = motionScene0.c;
                    if(motionScene$Transition2 == null) {
                    label_279:
                        motionScene1 = motionScene0;
                    }
                    else {
                        s s1 = motionScene$Transition2.l;
                        if(s1 == null || motionScene0.o) {
                            goto label_279;
                        }
                        else {
                            MotionTracker motionLayout$MotionTracker0 = motionScene0.p;
                            o o0 = o.d;
                            float[] arr_f = s1.n;
                            MotionLayout motionLayout1 = s1.r;
                            if(s1.j) {
                                motionLayout$MotionTracker0.addMovement(motionEvent0);
                                int v1 = motionEvent0.getAction();
                                if(v1 == 0) {
                                    motionScene1 = motionScene0;
                                    s1.p = motionEvent0.getRawX();
                                    s1.q = motionEvent0.getRawY();
                                    s1.m = false;
                                }
                                else {
                                    int[] arr_v = s1.o;
                                    switch(v1) {
                                        case 1: {
                                            s1.m = false;
                                            motionLayout$MotionTracker0.computeCurrentVelocity(16);
                                            float f2 = motionLayout$MotionTracker0.getXVelocity();
                                            float f3 = motionLayout$MotionTracker0.getYVelocity();
                                            float f4 = motionLayout1.getProgress();
                                            float f5 = ((float)motionLayout1.getWidth()) / 2.0f;
                                            float f6 = ((float)motionLayout1.getHeight()) / 2.0f;
                                            int v2 = s1.i;
                                            if(v2 == -1) {
                                                int v5 = s1.d;
                                                if(v5 != -1) {
                                                    View view1 = motionLayout1.findViewById(v5);
                                                    View view2 = motionLayout1.findViewById(((MotionController)motionLayout1.k.get(view1)).getAnimateRelativeTo());
                                                    motionLayout1.getLocationOnScreen(arr_v);
                                                    float f10 = (float)arr_v[0];
                                                    int v6 = view2.getLeft();
                                                    f8 = f10 + ((float)(view2.getRight() + v6)) / 2.0f;
                                                    f9 = (float)arr_v[1];
                                                    v4 = view2.getTop();
                                                    f6 = ((float)(view2.getBottom() + v4)) / 2.0f + f9;
                                                    f5 = f8;
                                                }
                                            }
                                            else {
                                                View view0 = motionLayout1.findViewById(v2);
                                                motionLayout1.getLocationOnScreen(arr_v);
                                                float f7 = (float)arr_v[0];
                                                int v3 = view0.getLeft();
                                                f8 = f7 + ((float)(view0.getRight() + v3)) / 2.0f;
                                                f9 = (float)arr_v[1];
                                                v4 = view0.getTop();
                                                f6 = ((float)(view0.getBottom() + v4)) / 2.0f + f9;
                                                f5 = f8;
                                            }
                                            float f11 = motionEvent0.getRawX() - f5;
                                            float f12 = motionEvent0.getRawY() - f6;
                                            double f13 = Math.toDegrees(Math.atan2(f12, f11));
                                            int v7 = s1.d;
                                            if(v7 == -1) {
                                                motionScene1 = motionScene0;
                                                arr_f[1] = 360.0f;
                                            }
                                            else {
                                                motionScene1 = motionScene0;
                                                s1.r.l(f4, s1.h, s1.g, v7, s1.n);
                                                arr_f[1] = (float)Math.toDegrees(arr_f[1]);
                                            }
                                            float f14 = ((float)(Math.toDegrees(Math.atan2(f3 + f12, f2 + f11)) - f13)) * 62.5f;
                                            float f15 = Float.isNaN(f14) ? f4 : f14 * 3.0f * s1.v / arr_f[1] + f4;
                                            if(f15 == 0 || f15 == 0x3F800000) {
                                            label_125:
                                                if(0.0f >= f15 || 1.0f <= f15) {
                                                    motionLayout1.setState(o0);
                                                }
                                            }
                                            else {
                                                int v8 = s1.c;
                                                if(v8 == 3) {
                                                    goto label_125;
                                                }
                                                else {
                                                    float f16 = f14 * s1.v / arr_f[1];
                                                    float f17 = ((double)f15) < 0.5 ? 0.0f : 1.0f;
                                                    if(v8 == 6) {
                                                        if(f4 + f16 < 0.0f) {
                                                            f16 = Math.abs(f16);
                                                        }
                                                        f17 = 1.0f;
                                                    }
                                                    if(s1.c == 7) {
                                                        if(f4 + f16 > 1.0f) {
                                                            f16 = -Math.abs(f16);
                                                        }
                                                        f17 = 0.0f;
                                                    }
                                                    motionLayout1.touchAnimateTo(s1.c, f17, f16 * 3.0f);
                                                    if(0.0f >= f4 || 1.0f <= f4) {
                                                        motionLayout1.setState(o0);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        case 2: {
                                            motionEvent0.getRawY();
                                            motionEvent0.getRawX();
                                            float f18 = ((float)motionLayout1.getWidth()) / 2.0f;
                                            float f19 = ((float)motionLayout1.getHeight()) / 2.0f;
                                            int v9 = s1.i;
                                            if(v9 == -1) {
                                                int v13 = s1.d;
                                                if(v13 != -1) {
                                                    View view4 = motionLayout1.findViewById(v13);
                                                    View view5 = motionLayout1.findViewById(((MotionController)motionLayout1.k.get(view4)).getAnimateRelativeTo());
                                                    if(view5 == null) {
                                                        Log.e("TouchResponse", "could not find view to animate to");
                                                    }
                                                    else {
                                                        motionLayout1.getLocationOnScreen(arr_v);
                                                        float f22 = (float)arr_v[0];
                                                        int v14 = view5.getLeft();
                                                        f18 = f22 + ((float)(view5.getRight() + v14)) / 2.0f;
                                                        float f23 = (float)arr_v[1];
                                                        int v15 = view5.getTop();
                                                        f19 = ((float)(view5.getBottom() + v15)) / 2.0f + f23;
                                                    }
                                                }
                                            }
                                            else {
                                                View view3 = motionLayout1.findViewById(v9);
                                                motionLayout1.getLocationOnScreen(arr_v);
                                                float f20 = (float)arr_v[0];
                                                int v10 = view3.getLeft();
                                                int v11 = view3.getRight();
                                                float f21 = (float)arr_v[1];
                                                int v12 = view3.getTop();
                                                f19 = ((float)(view3.getBottom() + v12)) / 2.0f + f21;
                                                f18 = f20 + ((float)(v11 + v10)) / 2.0f;
                                            }
                                            float f24 = motionEvent0.getRawX();
                                            float f25 = motionEvent0.getRawY();
                                            double f26 = Math.atan2(motionEvent0.getRawY() - f19, motionEvent0.getRawX() - f18);
                                            float f27 = (float)((f26 - Math.atan2(s1.q - f19, s1.p - f18)) * 180.0 / 3.141593);
                                            if(f27 > 330.0f) {
                                                f27 -= 360.0f;
                                            }
                                            else if(f27 < -330.0f) {
                                                f27 += 360.0f;
                                            }
                                            if(((double)Math.abs(f27)) > 0.01 || s1.m) {
                                                float f28 = motionLayout1.getProgress();
                                                if(!s1.m) {
                                                    s1.m = true;
                                                    motionLayout1.setProgress(f28);
                                                }
                                                int v16 = s1.d;
                                                if(v16 == -1) {
                                                    arr_f[1] = 360.0f;
                                                }
                                                else {
                                                    s1.r.l(f28, s1.h, s1.g, v16, s1.n);
                                                    arr_f[1] = (float)Math.toDegrees(arr_f[1]);
                                                }
                                                float f29 = Math.max(Math.min(f27 * s1.v / arr_f[1] + f28, 1.0f), 0.0f);
                                                float f30 = motionLayout1.getProgress();
                                                if(f29 == f30) {
                                                    motionLayout1.d = 0.0f;
                                                }
                                                else {
                                                    int v17 = Float.compare(f30, 0.0f);
                                                    if(v17 == 0 || f30 == 1.0f) {
                                                        motionLayout1.i(v17 == 0);
                                                    }
                                                    motionLayout1.setProgress(f29);
                                                    motionLayout$MotionTracker0.computeCurrentVelocity(1000);
                                                    float f31 = motionLayout$MotionTracker0.getXVelocity();
                                                    double f32 = (double)motionLayout$MotionTracker0.getYVelocity();
                                                    motionLayout1.d = (float)Math.toDegrees(((float)(Math.sin(Math.atan2(f32, f31) - f26) * Math.hypot(f32, f31) / Math.hypot(f24 - f18, f25 - f19))));
                                                }
                                                s1.p = motionEvent0.getRawX();
                                                s1.q = motionEvent0.getRawY();
                                            }
                                            motionScene1 = motionScene0;
                                            break;
                                        }
                                        default: {
                                            motionScene1 = motionScene0;
                                            break;
                                        }
                                    }
                                }
                            }
                            else {
                                motionScene1 = motionScene0;
                                motionLayout$MotionTracker0.addMovement(motionEvent0);
                                int v18 = motionEvent0.getAction();
                                if(v18 == 0) {
                                    s1.p = motionEvent0.getRawX();
                                    s1.q = motionEvent0.getRawY();
                                    s1.m = false;
                                }
                                else {
                                    switch(v18) {
                                        case 1: {
                                            s1.m = false;
                                            motionLayout$MotionTracker0.computeCurrentVelocity(1000);
                                            float f33 = motionLayout$MotionTracker0.getXVelocity();
                                            float f34 = motionLayout$MotionTracker0.getYVelocity();
                                            float f35 = motionLayout1.getProgress();
                                            int v19 = s1.d;
                                            if(v19 == -1) {
                                                float f36 = (float)Math.min(motionLayout1.getWidth(), motionLayout1.getHeight());
                                                arr_f[1] = s1.l * f36;
                                                arr_f[0] = f36 * s1.k;
                                            }
                                            else {
                                                s1.r.l(f35, s1.h, s1.g, v19, s1.n);
                                            }
                                            float f37 = s1.k == 0.0f ? f34 / arr_f[1] : f33 / arr_f[0];
                                            float f38 = Float.isNaN(f37) ? f35 : f37 / 3.0f + f35;
                                            if(f38 == 0 || f38 == 0x3F800000) {
                                            label_236:
                                                if(0.0f >= f38 || 1.0f <= f38) {
                                                    motionLayout1.setState(o0);
                                                }
                                            }
                                            else {
                                                int v20 = s1.c;
                                                if(v20 == 3) {
                                                    goto label_236;
                                                }
                                                else {
                                                    float f39 = ((double)f38) < 0.5 ? 0.0f : 1.0f;
                                                    if(v20 == 6) {
                                                        if(f35 + f37 < 0.0f) {
                                                            f37 = Math.abs(f37);
                                                        }
                                                        f39 = 1.0f;
                                                    }
                                                    if(s1.c == 7) {
                                                        if(f35 + f37 > 1.0f) {
                                                            f37 = -Math.abs(f37);
                                                        }
                                                        f39 = 0.0f;
                                                    }
                                                    motionLayout1.touchAnimateTo(s1.c, f39, f37);
                                                    if(0.0f >= f35 || 1.0f <= f35) {
                                                        motionLayout1.setState(o0);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        case 2: {
                                            float f40 = motionEvent0.getRawY() - s1.q;
                                            float f41 = motionEvent0.getRawX() - s1.p;
                                            if(Math.abs(s1.l * f40 + s1.k * f41) > s1.x || s1.m) {
                                                float f42 = motionLayout1.getProgress();
                                                if(!s1.m) {
                                                    s1.m = true;
                                                    motionLayout1.setProgress(f42);
                                                }
                                                int v21 = s1.d;
                                                if(v21 == -1) {
                                                    float f43 = (float)Math.min(motionLayout1.getWidth(), motionLayout1.getHeight());
                                                    arr_f[1] = s1.l * f43;
                                                    arr_f[0] = f43 * s1.k;
                                                }
                                                else {
                                                    s1.r.l(f42, s1.h, s1.g, v21, s1.n);
                                                }
                                                if(Double.compare(Math.abs((s1.l * arr_f[1] + s1.k * arr_f[0]) * s1.v), 0.01) < 0) {
                                                    arr_f[0] = 0.01f;
                                                    arr_f[1] = 0.01f;
                                                }
                                                float f44 = s1.k == 0.0f ? f40 / arr_f[1] : f41 / arr_f[0];
                                                float f45 = s1.c == 6 ? Math.max(Math.max(Math.min(f42 + f44, 1.0f), 0.0f), 0.01f) : Math.max(Math.min(f42 + f44, 1.0f), 0.0f);
                                                if(s1.c == 7) {
                                                    f45 = Math.min(f45, 0.99f);
                                                }
                                                float f46 = motionLayout1.getProgress();
                                                if(f45 == f46) {
                                                    motionLayout1.d = 0.0f;
                                                }
                                                else {
                                                    int v22 = Float.compare(f46, 0.0f);
                                                    if(v22 == 0 || f46 == 1.0f) {
                                                        motionLayout1.i(v22 == 0);
                                                    }
                                                    motionLayout1.setProgress(f45);
                                                    motionLayout$MotionTracker0.computeCurrentVelocity(1000);
                                                    float f47 = motionLayout$MotionTracker0.getXVelocity();
                                                    float f48 = motionLayout$MotionTracker0.getYVelocity();
                                                    motionLayout1.d = s1.k == 0.0f ? f48 / arr_f[1] : f47 / arr_f[0];
                                                }
                                                s1.p = motionEvent0.getRawX();
                                                s1.q = motionEvent0.getRawY();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    motionScene1.s = motionEvent0.getRawX();
                    motionScene1.t = motionEvent0.getRawY();
                    if(motionEvent0.getAction() == 1) {
                        MotionTracker motionLayout$MotionTracker1 = motionScene1.p;
                        if(motionLayout$MotionTracker1 != null) {
                            motionLayout$MotionTracker1.recycle();
                            motionScene1.p = null;
                            int v23 = this.f;
                            if(v23 != -1) {
                                motionScene1.a(this, v23);
                            }
                        }
                    }
                }
            }
            else {
                switch(motionEvent0.getAction()) {
                    case 0: {
                        motionScene0.s = motionEvent0.getRawX();
                        motionScene0.t = motionEvent0.getRawY();
                        motionScene0.m = motionEvent0;
                        motionScene0.n = false;
                        s s0 = motionScene0.c.l;
                        if(s0 != null) {
                            RectF rectF1 = s0.a(motionLayout0, rectF0);
                            if(rectF1 != null && !rectF1.contains(motionScene0.m.getX(), motionScene0.m.getY())) {
                                motionScene0.m = null;
                                motionScene0.n = true;
                                return this.a.c.isTransitionFlag(4) ? this.a.c.getTouchResponse().m : true;
                            }
                            RectF rectF2 = motionScene0.c.l.b(motionLayout0, rectF0);
                            motionScene0.o = rectF2 == null || rectF2.contains(motionScene0.m.getX(), motionScene0.m.getY()) ? false : true;
                            motionScene0.c.l.p = motionScene0.s;
                            motionScene0.c.l.q = motionScene0.t;
                            return this.a.c.isTransitionFlag(4) ? this.a.c.getTouchResponse().m : true;
                        }
                        break;
                    }
                    case 2: {
                        if(motionScene0.n) {
                            goto label_48;
                        }
                        else {
                            float f = motionEvent0.getRawY() - motionScene0.t;
                            float f1 = motionEvent0.getRawX() - motionScene0.s;
                            if(((double)f1) != 0.0 || ((double)f) != 0.0) {
                                MotionEvent motionEvent1 = motionScene0.m;
                                if(motionEvent1 != null) {
                                    Transition motionScene$Transition1 = motionScene0.bestTransitionFor(v, f1, f, motionEvent1);
                                    if(motionScene$Transition1 != null) {
                                        this.setTransition(motionScene$Transition1);
                                        RectF rectF3 = motionScene0.c.l.b(motionLayout0, rectF0);
                                        motionScene0.o = rectF3 != null && !rectF3.contains(motionScene0.m.getX(), motionScene0.m.getY());
                                        motionScene0.c.l.p = motionScene0.s;
                                        motionScene0.c.l.q = motionScene0.t;
                                        motionScene0.c.l.m = false;
                                    }
                                    goto label_48;
                                }
                            }
                        }
                        break;
                    }
                    default: {
                        goto label_48;
                    }
                }
            }
            return this.a.c.isTransitionFlag(4) ? this.a.c.getTouchResponse().m : true;
        }
        return super.onTouchEvent(motionEvent0);
    }

    @Override  // androidx.constraintlayout.widget.ConstraintLayout
    public void onViewAdded(View view0) {
        super.onViewAdded(view0);
        if(view0 instanceof MotionHelper) {
            if(this.L == null) {
                this.L = new CopyOnWriteArrayList();
            }
            this.L.add(((MotionHelper)view0));
            if(((MotionHelper)view0).isUsedOnShow()) {
                if(this.I == null) {
                    this.I = new ArrayList();
                }
                this.I.add(((MotionHelper)view0));
            }
            if(((MotionHelper)view0).isUseOnHide()) {
                if(this.J == null) {
                    this.J = new ArrayList();
                }
                this.J.add(((MotionHelper)view0));
            }
            if(((MotionHelper)view0).isDecorator()) {
                if(this.K == null) {
                    this.K = new ArrayList();
                }
                this.K.add(((MotionHelper)view0));
            }
        }
    }

    @Override  // androidx.constraintlayout.widget.ConstraintLayout
    public void onViewRemoved(View view0) {
        super.onViewRemoved(view0);
        ArrayList arrayList0 = this.I;
        if(arrayList0 != null) {
            arrayList0.remove(view0);
        }
        ArrayList arrayList1 = this.J;
        if(arrayList1 != null) {
            arrayList1.remove(view0);
        }
    }

    public final void p() {
        if(this.t == null && (this.L == null || this.L.isEmpty())) {
            return;
        }
        ArrayList arrayList0 = this.v0;
        for(Object object0: arrayList0) {
            Integer integer0 = (Integer)object0;
            TransitionListener motionLayout$TransitionListener0 = this.t;
            if(motionLayout$TransitionListener0 != null) {
                motionLayout$TransitionListener0.onTransitionCompleted(this, ((int)integer0));
            }
            CopyOnWriteArrayList copyOnWriteArrayList0 = this.L;
            if(copyOnWriteArrayList0 != null) {
                for(Object object1: copyOnWriteArrayList0) {
                    ((TransitionListener)object1).onTransitionCompleted(this, ((int)integer0));
                }
            }
        }
        arrayList0.clear();
    }

    @Override  // androidx.constraintlayout.widget.ConstraintLayout
    public void parseLayoutDescription(int v) {
        this.mConstraintLayoutSpec = null;
    }

    @Deprecated
    public void rebuildMotion() {
        Log.e("MotionLayout", "This method is deprecated. Please call rebuildScene() instead.");
        this.rebuildScene();
    }

    public void rebuildScene() {
        this.q0.f();
        this.invalidate();
    }

    public boolean removeTransitionListener(TransitionListener motionLayout$TransitionListener0) {
        return this.L == null ? false : this.L.remove(motionLayout$TransitionListener0);
    }

    @Override  // androidx.constraintlayout.widget.ConstraintLayout
    public void requestLayout() {
        if(!this.mMeasureDuringTransition && this.f == -1) {
            MotionScene motionScene0 = this.a;
            if(motionScene0 != null) {
                Transition motionScene$Transition0 = motionScene0.c;
                if(motionScene$Transition0 != null) {
                    int v = motionScene$Transition0.getLayoutDuringTransition();
                    if(v == 0) {
                        return;
                    }
                    if(v == 2) {
                        int v1 = this.getChildCount();
                        for(int v2 = 0; v2 < v1; ++v2) {
                            View view0 = this.getChildAt(v2);
                            ((MotionController)this.k.get(view0)).remeasure();
                        }
                        return;
                    }
                }
            }
        }
        super.requestLayout();
    }

    @RequiresApi(api = 17)
    public void rotateTo(int v, int v1) {
        int v2 = 1;
        this.h0 = true;
        this.k0 = this.getWidth();
        this.l0 = this.getHeight();
        int v3 = this.getDisplay().getRotation();
        if((v3 + 1) % 4 <= (this.m0 + 1) % 4) {
            v2 = 2;
        }
        this.i0 = v2;
        this.m0 = v3;
        int v4 = this.getChildCount();
        for(int v5 = 0; v5 < v4; ++v5) {
            View view0 = this.getChildAt(v5);
            HashMap hashMap0 = this.j0;
            ViewState viewState0 = (ViewState)hashMap0.get(view0);
            if(viewState0 == null) {
                viewState0 = new ViewState();
                hashMap0.put(view0, viewState0);
            }
            viewState0.getState(view0);
        }
        this.e = -1;
        this.g = v;
        this.a.n(-1, v);
        ConstraintSet constraintSet0 = this.a.b(this.g);
        this.q0.e(null, constraintSet0);
        this.n = 0.0f;
        this.o = 0.0f;
        this.invalidate();
        this.transitionToEnd(new i(this, 1));
        if(v1 > 0) {
            this.m = ((float)v1) / 1000.0f;
        }
    }

    public void scheduleTransitionTo(int v) {
        if(this.getCurrentState() == -1) {
            this.transitionToState(v);
            return;
        }
        int[] arr_v = this.f0;
        if(arr_v == null) {
            this.f0 = new int[4];
        }
        else if(arr_v.length <= this.g0) {
            this.f0 = Arrays.copyOf(arr_v, arr_v.length * 2);
        }
        int v1 = this.g0;
        this.g0 = v1 + 1;
        this.f0[v1] = v;
    }

    public void setDebugMode(int v) {
        this.u = v;
        this.invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z) {
        this.o0 = z;
    }

    public void setInteractionEnabled(boolean z) {
        this.j = z;
    }

    public void setInterpolatedProgress(float f) {
        if(this.a != null) {
            this.setState(o.c);
            Interpolator interpolator0 = this.a.getInterpolator();
            if(interpolator0 != null) {
                this.setProgress(interpolator0.getInterpolation(f));
                return;
            }
        }
        this.setProgress(f);
    }

    public void setOnHide(float f) {
        ArrayList arrayList0 = this.J;
        if(arrayList0 != null) {
            int v = arrayList0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                ((MotionHelper)this.J.get(v1)).setProgress(f);
            }
        }
    }

    public void setOnShow(float f) {
        ArrayList arrayList0 = this.I;
        if(arrayList0 != null) {
            int v = arrayList0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                ((MotionHelper)this.I.get(v1)).setProgress(f);
            }
        }
    }

    public void setProgress(float f) {
        int v = Float.compare(f, 0.0f);
        if(v < 0 || f > 1.0f) {
            Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if(!this.isAttachedToWindow()) {
            if(this.d0 == null) {
                this.d0 = new n(this);
            }
            this.d0.a = f;
            return;
        }
        o o0 = o.d;
        o o1 = o.c;
        if(v <= 0) {
            if(this.o == 1.0f && this.f == this.g) {
                this.setState(o1);
            }
            this.f = this.e;
            if(this.o == 0.0f) {
                this.setState(o0);
            }
        }
        else if(f >= 1.0f) {
            if(this.o == 0.0f && this.f == this.e) {
                this.setState(o1);
            }
            this.f = this.g;
            if(this.o == 1.0f) {
                this.setState(o0);
            }
        }
        else {
            this.f = -1;
            this.setState(o1);
        }
        if(this.a == null) {
            return;
        }
        this.r = true;
        this.q = f;
        this.n = f;
        this.p = -1L;
        this.l = -1L;
        this.b = null;
        this.s = true;
        this.invalidate();
    }

    public void setProgress(float f, float f1) {
        if(!this.isAttachedToWindow()) {
            if(this.d0 == null) {
                this.d0 = new n(this);
            }
            this.d0.a = f;
            this.d0.b = f1;
            return;
        }
        this.setProgress(f);
        this.setState(o.c);
        this.d = f1;
        float f2 = 0.0f;
        int v = Float.compare(f1, 0.0f);
        if(v != 0) {
            if(v > 0) {
                f2 = 1.0f;
            }
            this.h(f2);
            return;
        }
        if(f != 0 && f != 0x3F800000) {
            if(f > 0.5f) {
                f2 = 1.0f;
            }
            this.h(f2);
        }
    }

    public void setScene(MotionScene motionScene0) {
        this.a = motionScene0;
        motionScene0.setRtl(this.isRtl());
        this.rebuildScene();
    }

    public void setStartState(int v) {
        if(!this.isAttachedToWindow()) {
            if(this.d0 == null) {
                this.d0 = new n(this);
            }
            this.d0.c = v;
            this.d0.d = v;
            return;
        }
        this.f = v;
    }

    @Override  // androidx.constraintlayout.widget.ConstraintLayout
    public void setState(int v, int v1, int v2) {
        this.setState(o.b);
        this.f = v;
        this.e = -1;
        this.g = -1;
        ConstraintLayoutStates constraintLayoutStates0 = this.mConstraintLayoutSpec;
        if(constraintLayoutStates0 != null) {
            constraintLayoutStates0.updateConstraints(v, ((float)v1), ((float)v2));
            return;
        }
        MotionScene motionScene0 = this.a;
        if(motionScene0 != null) {
            motionScene0.b(v).applyTo(this);
        }
    }

    public void setState(o o0) {
        o o1 = o.d;
        if(o0 == o1 && this.f == -1) {
            return;
        }
        o o2 = this.p0;
        this.p0 = o0;
        o o3 = o.c;
        if(o2 == o3 && o0 == o3) {
            this.k();
        }
        switch(o2.ordinal()) {
            case 0: 
            case 1: {
                if(o0 == o3) {
                    this.k();
                }
                if(o0 == o1) {
                    this.fireTransitionCompleted();
                    return;
                }
                break;
            }
            case 2: {
                if(o0 == o1) {
                    this.fireTransitionCompleted();
                    return;
                }
                break;
            }
        }
    }

    public void setTransition(int v) {
        float f1;
        if(this.a != null) {
            Transition motionScene$Transition0 = this.getTransition(v);
            this.e = motionScene$Transition0.getStartConstraintSetId();
            this.g = motionScene$Transition0.getEndConstraintSetId();
            if(!this.isAttachedToWindow()) {
                if(this.d0 == null) {
                    this.d0 = new n(this);
                }
                this.d0.c = this.e;
                this.d0.d = this.g;
                return;
            }
            int v1 = this.f;
            float f = 0.0f;
            if(v1 == this.e) {
                f1 = 0.0f;
            }
            else {
                f1 = v1 == this.g ? 1.0f : NaNf;
            }
            this.a.setTransition(motionScene$Transition0);
            ConstraintSet constraintSet0 = this.a.b(this.e);
            ConstraintSet constraintSet1 = this.a.b(this.g);
            this.q0.e(constraintSet0, constraintSet1);
            this.rebuildScene();
            if(this.o != f1) {
                switch(f1) {
                    case 0: {
                        this.i(true);
                        this.a.b(this.e).applyTo(this);
                        break;
                    }
                    case 0x3F800000: {
                        this.i(false);
                        this.a.b(this.g).applyTo(this);
                    }
                }
            }
            if(!Float.isNaN(f1)) {
                f = f1;
            }
            this.o = f;
            if(Float.isNaN(f1)) {
                Log.v("MotionLayout", ".(null:-1) transitionToStart ");
                this.transitionToStart();
                return;
            }
            this.setProgress(f1);
        }
    }

    public void setTransition(int v, int v1) {
        if(!this.isAttachedToWindow()) {
            if(this.d0 == null) {
                this.d0 = new n(this);
            }
            this.d0.c = v;
            this.d0.d = v1;
            return;
        }
        MotionScene motionScene0 = this.a;
        if(motionScene0 != null) {
            this.e = v;
            this.g = v1;
            motionScene0.n(v, v1);
            ConstraintSet constraintSet0 = this.a.b(v);
            ConstraintSet constraintSet1 = this.a.b(v1);
            this.q0.e(constraintSet0, constraintSet1);
            this.rebuildScene();
            this.o = 0.0f;
            this.transitionToStart();
        }
    }

    public void setTransition(Transition motionScene$Transition0) {
        this.a.setTransition(motionScene$Transition0);
        this.setState(o.b);
        Transition motionScene$Transition1 = this.a.c;
        int v = -1;
        if(this.f == (motionScene$Transition1 == null ? -1 : motionScene$Transition1.c)) {
            this.o = 1.0f;
            this.n = 1.0f;
            this.q = 1.0f;
        }
        else {
            this.o = 0.0f;
            this.n = 0.0f;
            this.q = 0.0f;
        }
        this.p = motionScene$Transition0.isTransitionFlag(1) ? -1L : 0x20EC47F75F4L;
        int v1 = this.a.g();
        MotionScene motionScene0 = this.a;
        Transition motionScene$Transition2 = motionScene0.c;
        if(motionScene$Transition2 != null) {
            v = motionScene$Transition2.c;
        }
        if(v1 == this.e && v == this.g) {
            return;
        }
        this.e = v1;
        this.g = v;
        motionScene0.n(v1, v);
        ConstraintSet constraintSet0 = this.a.b(this.e);
        ConstraintSet constraintSet1 = this.a.b(this.g);
        this.q0.e(constraintSet0, constraintSet1);
        this.q0.e = this.e;
        this.q0.f = this.g;
        this.q0.f();
        this.rebuildScene();
    }

    public void setTransitionDuration(int v) {
        MotionScene motionScene0 = this.a;
        if(motionScene0 == null) {
            Log.e("MotionLayout", "MotionScene not defined");
            return;
        }
        motionScene0.setDuration(v);
    }

    public void setTransitionListener(TransitionListener motionLayout$TransitionListener0) {
        this.t = motionLayout$TransitionListener0;
    }

    public void setTransitionState(Bundle bundle0) {
        if(this.d0 == null) {
            this.d0 = new n(this);
        }
        n n0 = this.d0;
        n0.getClass();
        n0.a = bundle0.getFloat("motion.progress");
        n0.b = bundle0.getFloat("motion.velocity");
        n0.c = bundle0.getInt("motion.StartState");
        n0.d = bundle0.getInt("motion.EndState");
        if(this.isAttachedToWindow()) {
            this.d0.a();
        }
    }

    @Override  // android.view.View
    public String toString() {
        Context context0 = this.getContext();
        return Debug.getName(context0, this.e) + "->" + Debug.getName(context0, this.g) + " (pos:" + this.o + " Dpos/Dt:" + this.d;
    }

    public void touchAnimateTo(int v, float f, float f1) {
        float f12;
        int v2;
        float f23;
        float f22;
        float f21;
        float f20;
        float f18;
        int v1;
        float f15;
        if(this.a == null) {
            return;
        }
        if(this.o == f) {
            return;
        }
        this.w = true;
        this.l = 2262602286900L;
        float f2 = ((float)this.a.getDuration()) / 1000.0f;
        this.m = f2;
        this.q = f;
        this.s = true;
        StopLogic stopLogic0 = this.x;
        if(v == 0 || v == 1 || v == 2) {
        label_56:
            if(v == 1 || v == 7) {
                f15 = 0.0f;
            }
            else if(v != 2 && v != 6) {
                f15 = f;
            }
            else {
                f15 = 1.0f;
            }
            MotionScene motionScene0 = this.a;
            Transition motionScene$Transition1 = motionScene0.c;
            if(motionScene$Transition1 == null) {
                v1 = 0;
            }
            else {
                s s1 = motionScene$Transition1.l;
                v1 = s1 == null ? 0 : s1.D;
            }
            if(v1 == 0) {
                float f16 = this.o;
                float f17 = motionScene0.f();
                Transition motionScene$Transition2 = this.a.c;
                if(motionScene$Transition2 == null) {
                    f18 = 0.0f;
                }
                else {
                    s s2 = motionScene$Transition2.l;
                    f18 = s2 == null ? 0.0f : s2.s;
                }
                this.x.config(f16, f15, f1, f2, f17, f18);
            }
            else {
                float f19 = this.o;
                if(motionScene$Transition1 == null) {
                    f20 = 0.0f;
                }
                else {
                    s s3 = motionScene$Transition1.l;
                    f20 = s3 == null ? 0.0f : s3.z;
                }
                if(motionScene$Transition1 == null) {
                    f21 = 0.0f;
                }
                else {
                    s s4 = motionScene$Transition1.l;
                    f21 = s4 == null ? 0.0f : s4.A;
                }
                if(motionScene$Transition1 == null) {
                    f22 = 0.0f;
                }
                else {
                    s s5 = motionScene$Transition1.l;
                    f22 = s5 == null ? 0.0f : s5.y;
                }
                if(motionScene$Transition1 == null) {
                    f23 = 0.0f;
                }
                else {
                    s s6 = motionScene$Transition1.l;
                    f23 = s6 == null ? 0.0f : s6.B;
                }
                if(motionScene$Transition1 == null) {
                    v2 = 0;
                }
                else {
                    s s7 = motionScene$Transition1.l;
                    v2 = s7 == null ? 0 : s7.C;
                }
                stopLogic0.springConfig(f19, f15, f1, f20, f21, f22, f23, v2);
            }
            this.q = f15;
            this.f = this.f;
            this.b = stopLogic0;
        }
        else {
            j j0 = this.y;
            if(v == 4) {
                float f13 = this.o;
                float f14 = this.a.f();
                j0.a = f1;
                j0.b = f13;
                j0.c = f14;
                this.b = j0;
            }
            else {
                switch(v) {
                    case 5: {
                        float f3 = this.o;
                        float f4 = this.a.f();
                        if(Float.compare(f1, 0.0f) > 0) {
                            float f5 = f1 / f4;
                            if(f1 * f5 - f4 * f5 * f5 / 2.0f + f3 > 1.0f) {
                                goto label_24;
                            }
                            else {
                                goto label_31;
                            }
                        }
                        else {
                            float f6 = -f1 / f4;
                            if(f4 * f6 * f6 / 2.0f + f1 * f6 + f3 < 0.0f) {
                            label_24:
                                float f7 = this.o;
                                float f8 = this.a.f();
                                j0.a = f1;
                                j0.b = f7;
                                j0.c = f8;
                                this.b = j0;
                            }
                            else {
                            label_31:
                                float f9 = this.o;
                                float f10 = this.m;
                                float f11 = this.a.f();
                                Transition motionScene$Transition0 = this.a.c;
                                if(motionScene$Transition0 == null) {
                                    f12 = 0.0f;
                                }
                                else {
                                    s s0 = motionScene$Transition0.l;
                                    f12 = s0 == null ? 0.0f : s0.s;
                                }
                                this.x.config(f9, f, f1, f10, f11, f12);
                                this.d = 0.0f;
                                this.q = f;
                                this.f = this.f;
                                this.b = stopLogic0;
                            }
                        }
                        break;
                    }
                    case 6: 
                    case 7: {
                        goto label_56;
                    }
                }
            }
        }
        this.r = false;
        this.l = 2262604159000L;
        this.invalidate();
    }

    public void touchSpringTo(float f, float f1) {
        int v;
        float f6;
        float f5;
        float f4;
        if(this.a == null) {
            return;
        }
        if(this.o == f) {
            return;
        }
        this.w = true;
        this.l = 2262563660000L;
        this.m = ((float)this.a.getDuration()) / 1000.0f;
        this.q = f;
        this.s = true;
        float f2 = this.o;
        Transition motionScene$Transition0 = this.a.c;
        float f3 = 0.0f;
        if(motionScene$Transition0 == null) {
            f4 = 0.0f;
        }
        else {
            s s0 = motionScene$Transition0.l;
            f4 = s0 == null ? 0.0f : s0.z;
        }
        if(motionScene$Transition0 == null) {
            f5 = 0.0f;
        }
        else {
            s s1 = motionScene$Transition0.l;
            f5 = s1 == null ? 0.0f : s1.A;
        }
        if(motionScene$Transition0 == null) {
            f6 = 0.0f;
        }
        else {
            s s2 = motionScene$Transition0.l;
            f6 = s2 == null ? 0.0f : s2.y;
        }
        if(motionScene$Transition0 != null) {
            s s3 = motionScene$Transition0.l;
            if(s3 != null) {
                f3 = s3.B;
            }
        }
        if(motionScene$Transition0 == null) {
            v = 0;
        }
        else {
            s s4 = motionScene$Transition0.l;
            v = s4 == null ? 0 : s4.C;
        }
        this.x.springConfig(f2, f, f1, f4, f5, f6, f3, v);
        this.q = f;
        this.f = this.f;
        this.b = this.x;
        this.r = false;
        this.l = 0x20ECB5EA00CL;
        this.invalidate();
    }

    public void transitionToEnd() {
        this.h(1.0f);
        this.e0 = null;
    }

    public void transitionToEnd(Runnable runnable0) {
        this.h(1.0f);
        this.e0 = runnable0;
    }

    public void transitionToStart() {
        this.h(0.0f);
    }

    public void transitionToState(int v) {
        if(!this.isAttachedToWindow()) {
            if(this.d0 == null) {
                this.d0 = new n(this);
            }
            this.d0.d = v;
            return;
        }
        this.transitionToState(v, -1, -1);
    }

    public void transitionToState(int v, int v1) {
        if(!this.isAttachedToWindow()) {
            if(this.d0 == null) {
                this.d0 = new n(this);
            }
            this.d0.d = v;
            return;
        }
        this.transitionToState(v, -1, -1, v1);
    }

    public void transitionToState(int v, int v1, int v2) {
        this.transitionToState(v, v1, v2, -1);
    }

    public void transitionToState(int v, int v1, int v2, int v3) {
        MotionScene motionScene0 = this.a;
        if(motionScene0 != null) {
            StateSet stateSet0 = motionScene0.b;
            if(stateSet0 != null) {
                int v4 = stateSet0.convertToConstraintSet(this.f, v, ((float)v1), ((float)v2));
                if(v4 != -1) {
                    v = v4;
                }
            }
        }
        int v5 = this.f;
        if(v5 == v) {
            return;
        }
        if(this.e == v) {
            this.h(0.0f);
            if(v3 > 0) {
                this.m = ((float)v3) / 1000.0f;
            }
            return;
        }
        if(this.g == v) {
            this.h(1.0f);
            if(v3 > 0) {
                this.m = ((float)v3) / 1000.0f;
            }
            return;
        }
        this.g = v;
        if(v5 != -1) {
            this.setTransition(v5, v);
            this.h(1.0f);
            this.o = 0.0f;
            this.transitionToEnd();
            if(v3 > 0) {
                this.m = ((float)v3) / 1000.0f;
            }
            return;
        }
        this.w = false;
        this.q = 1.0f;
        this.n = 0.0f;
        this.o = 0.0f;
        this.p = 0x20ED20C2014L;
        this.l = 2262677276600L;
        this.r = false;
        this.b = null;
        if(v3 == -1) {
            this.m = ((float)this.a.getDuration()) / 1000.0f;
        }
        this.e = -1;
        this.a.n(-1, this.g);
        SparseArray sparseArray0 = new SparseArray();
        if(v3 == 0) {
            this.m = ((float)this.a.getDuration()) / 1000.0f;
        }
        else if(v3 > 0) {
            this.m = ((float)v3) / 1000.0f;
        }
        int v7 = this.getChildCount();
        HashMap hashMap0 = this.k;
        hashMap0.clear();
        for(int v8 = 0; v8 < v7; ++v8) {
            View view0 = this.getChildAt(v8);
            hashMap0.put(view0, new MotionController(view0));
            sparseArray0.put(view0.getId(), ((MotionController)hashMap0.get(view0)));
        }
        this.s = true;
        ConstraintSet constraintSet0 = this.a.b(v);
        this.q0.e(null, constraintSet0);
        this.rebuildScene();
        this.q0.a();
        int v9 = this.getChildCount();
        for(int v10 = 0; v10 < v9; ++v10) {
            View view1 = this.getChildAt(v10);
            MotionController motionController0 = (MotionController)hashMap0.get(view1);
            if(motionController0 != null) {
                motionController0.f.c = 0.0f;
                motionController0.f.d = 0.0f;
                float f = view1.getX();
                float f1 = view1.getY();
                float f2 = (float)view1.getWidth();
                float f3 = (float)view1.getHeight();
                motionController0.f.e(f, f1, f2, f3);
                motionController0.h.getClass();
                view1.getX();
                view1.getY();
                view1.getWidth();
                view1.getHeight();
                motionController0.h.b(view1);
            }
        }
        int v11 = this.getWidth();
        int v12 = this.getHeight();
        if(this.K == null) {
            for(int v15 = 0; v15 < v7; ++v15) {
                MotionController motionController3 = (MotionController)hashMap0.get(this.getChildAt(v15));
                if(motionController3 != null) {
                    this.a.getKeyFrames(motionController3);
                    motionController3.setup(v11, v12, this.m, 0x20ED23AEE80L);
                }
            }
        }
        else {
            for(int v13 = 0; v13 < v7; ++v13) {
                MotionController motionController1 = (MotionController)hashMap0.get(this.getChildAt(v13));
                if(motionController1 != null) {
                    this.a.getKeyFrames(motionController1);
                }
            }
            for(Object object0: this.K) {
                ((MotionHelper)object0).onPreSetup(this, hashMap0);
            }
            for(int v14 = 0; v14 < v7; ++v14) {
                MotionController motionController2 = (MotionController)hashMap0.get(this.getChildAt(v14));
                if(motionController2 != null) {
                    motionController2.setup(v11, v12, this.m, 2262679049100L);
                }
            }
        }
        float f4 = this.a.getStaggered();
        if(f4 != 0.0f) {
            float f5 = 3.402823E+38f;
            float f6 = -3.402823E+38f;
            for(int v16 = 0; v16 < v7; ++v16) {
                MotionController motionController4 = (MotionController)hashMap0.get(this.getChildAt(v16));
                float f7 = motionController4.getFinalY() + motionController4.getFinalX();
                f5 = Math.min(f5, f7);
                f6 = Math.max(f6, f7);
            }
            for(int v6 = 0; v6 < v7; ++v6) {
                MotionController motionController5 = (MotionController)hashMap0.get(this.getChildAt(v6));
                motionController5.n = 1.0f / (1.0f - f4);
                motionController5.m = f4 - (motionController5.getFinalX() + motionController5.getFinalY() - f5) * f4 / (f6 - f5);
            }
        }
        this.n = 0.0f;
        this.o = 0.0f;
        this.s = true;
        this.invalidate();
    }

    public void updateState() {
        ConstraintSet constraintSet0 = this.a.b(this.e);
        ConstraintSet constraintSet1 = this.a.b(this.g);
        this.q0.e(constraintSet0, constraintSet1);
        this.rebuildScene();
    }

    public void updateState(int v, ConstraintSet constraintSet0) {
        MotionScene motionScene0 = this.a;
        if(motionScene0 != null) {
            motionScene0.setConstraintSet(v, constraintSet0);
        }
        this.updateState();
        if(this.f == v) {
            constraintSet0.applyTo(this);
        }
    }

    public void updateStateAnimate(int v, ConstraintSet constraintSet0, int v1) {
        if(this.a == null) {
            return;
        }
        if(this.f == v) {
            this.updateState(id.view_transition, this.getConstraintSet(v));
            this.setState(id.view_transition, -1, -1);
            this.updateState(v, constraintSet0);
            Transition motionScene$Transition0 = new Transition(-1, this.a, id.view_transition, v);
            motionScene$Transition0.setDuration(v1);
            this.setTransition(motionScene$Transition0);
            this.transitionToEnd();
        }
    }

    public void viewTransition(int v, View[] arr_view) {
        MotionScene motionScene0 = this.a;
        if(motionScene0 != null) {
            motionScene0.viewTransition(v, arr_view);
            return;
        }
        Log.e("MotionLayout", " no motionScene");
    }
}

