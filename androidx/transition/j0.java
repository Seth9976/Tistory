package androidx.transition;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View.OnAttachStateChangeListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.WindowId;
import androidx.collection.ArrayMap;
import androidx.collection.LongSparseArray;
import java.util.ArrayList;

public final class j0 implements View.OnAttachStateChangeListener, ViewTreeObserver.OnPreDrawListener {
    public Transition a;
    public ViewGroup b;

    @Override  // android.view.ViewTreeObserver$OnPreDrawListener
    public final boolean onPreDraw() {
        o0 o02;
        o0 o03;
        ArrayList arrayList1;
        ViewGroup viewGroup0 = this.b;
        viewGroup0.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup0.removeOnAttachStateChangeListener(this);
        ViewGroup viewGroup1 = this.b;
        if(!TransitionManager.e.remove(viewGroup1)) {
            return true;
        }
        ArrayMap arrayMap0 = TransitionManager.b();
        ArrayList arrayList0 = (ArrayList)arrayMap0.get(viewGroup1);
        if(arrayList0 == null) {
            arrayList0 = new ArrayList();
            arrayMap0.put(viewGroup1, arrayList0);
            arrayList1 = null;
        }
        else {
            arrayList1 = arrayList0.size() <= 0 ? null : new ArrayList(arrayList0);
        }
        Transition transition0 = this.a;
        arrayList0.add(transition0);
        transition0.addListener(new i0(this, arrayMap0));
        transition0.d(viewGroup1, false);
        if(arrayList1 != null) {
            for(Object object0: arrayList1) {
                ((Transition)object0).resume(viewGroup1);
            }
        }
        transition0.t = new ArrayList();
        transition0.u = new ArrayList();
        o0 o00 = transition0.p;
        o0 o01 = transition0.q;
        ArrayMap arrayMap1 = new ArrayMap(o00.a);
        ArrayMap arrayMap2 = new ArrayMap(o01.a);
        int v = 0;
        while(true) {
            int[] arr_v = transition0.s;
            if(v >= arr_v.length) {
                break;
            }
            int v1 = arr_v[v];
            if(v1 == 1) {
                o02 = o00;
                for(int v9 = arrayMap1.size() - 1; v9 >= 0; --v9) {
                    View view6 = (View)arrayMap1.keyAt(v9);
                    if(view6 != null && transition0.i(view6)) {
                        TransitionValues transitionValues6 = (TransitionValues)arrayMap2.remove(view6);
                        if(transitionValues6 != null && transition0.i(transitionValues6.view)) {
                            TransitionValues transitionValues7 = (TransitionValues)arrayMap1.removeAt(v9);
                            transition0.t.add(transitionValues7);
                            transition0.u.add(transitionValues6);
                        }
                    }
                }
            }
            else {
                switch(v1) {
                    case 2: {
                        o02 = o00;
                        ArrayMap arrayMap3 = o02.d;
                        ArrayMap arrayMap4 = o01.d;
                        int v2 = arrayMap3.size();
                        for(int v3 = 0; v3 < v2; ++v3) {
                            View view0 = (View)arrayMap3.valueAt(v3);
                            if(view0 != null && transition0.i(view0)) {
                                View view1 = (View)arrayMap4.get(arrayMap3.keyAt(v3));
                                if(view1 != null && transition0.i(view1)) {
                                    TransitionValues transitionValues0 = (TransitionValues)arrayMap1.get(view0);
                                    TransitionValues transitionValues1 = (TransitionValues)arrayMap2.get(view1);
                                    if(transitionValues0 != null && transitionValues1 != null) {
                                        transition0.t.add(transitionValues0);
                                        transition0.u.add(transitionValues1);
                                        arrayMap1.remove(view0);
                                        arrayMap2.remove(view1);
                                    }
                                }
                            }
                        }
                        break;
                    }
                    case 3: {
                        o02 = o00;
                        SparseArray sparseArray0 = o02.b;
                        SparseArray sparseArray1 = o01.b;
                        int v4 = sparseArray0.size();
                        for(int v5 = 0; v5 < v4; ++v5) {
                            View view2 = (View)sparseArray0.valueAt(v5);
                            if(view2 != null && transition0.i(view2)) {
                                View view3 = (View)sparseArray1.get(sparseArray0.keyAt(v5));
                                if(view3 != null && transition0.i(view3)) {
                                    TransitionValues transitionValues2 = (TransitionValues)arrayMap1.get(view2);
                                    TransitionValues transitionValues3 = (TransitionValues)arrayMap2.get(view3);
                                    if(transitionValues2 != null && transitionValues3 != null) {
                                        transition0.t.add(transitionValues2);
                                        transition0.u.add(transitionValues3);
                                        arrayMap1.remove(view2);
                                        arrayMap2.remove(view3);
                                    }
                                }
                            }
                        }
                        break;
                    }
                    case 4: {
                        LongSparseArray longSparseArray0 = o00.c;
                        int v6 = longSparseArray0.size();
                        int v7 = 0;
                        while(v7 < v6) {
                            View view4 = (View)longSparseArray0.valueAt(v7);
                            if(view4 == null || !transition0.i(view4)) {
                                o03 = o00;
                            }
                            else {
                                o03 = o00;
                                long v8 = longSparseArray0.keyAt(v7);
                                View view5 = (View)o01.c.get(v8);
                                if(view5 != null && transition0.i(view5)) {
                                    TransitionValues transitionValues4 = (TransitionValues)arrayMap1.get(view4);
                                    TransitionValues transitionValues5 = (TransitionValues)arrayMap2.get(view5);
                                    if(transitionValues4 != null && transitionValues5 != null) {
                                        transition0.t.add(transitionValues4);
                                        transition0.u.add(transitionValues5);
                                        arrayMap1.remove(view4);
                                        arrayMap2.remove(view5);
                                    }
                                }
                            }
                            ++v7;
                            o00 = o03;
                        }
                        o02 = o00;
                        break;
                    }
                    default: {
                        o02 = o00;
                    }
                }
            }
            ++v;
            o00 = o02;
        }
        for(int v10 = 0; v10 < arrayMap1.size(); ++v10) {
            TransitionValues transitionValues8 = (TransitionValues)arrayMap1.valueAt(v10);
            if(transition0.i(transitionValues8.view)) {
                transition0.t.add(transitionValues8);
                transition0.u.add(null);
            }
        }
        for(int v11 = 0; v11 < arrayMap2.size(); ++v11) {
            TransitionValues transitionValues9 = (TransitionValues)arrayMap2.valueAt(v11);
            if(transition0.i(transitionValues9.view)) {
                transition0.u.add(transitionValues9);
                transition0.t.add(null);
            }
        }
        ArrayMap arrayMap5 = Transition.h();
        WindowId windowId0 = viewGroup1.getWindowId();
        for(int v12 = arrayMap5.size() - 1; v12 >= 0; --v12) {
            Animator animator0 = (Animator)arrayMap5.keyAt(v12);
            if(animator0 != null) {
                h0 h00 = (h0)arrayMap5.get(animator0);
                if(h00 != null) {
                    View view7 = h00.a;
                    if(view7 != null && (h00.d != null && h00.d.a.equals(windowId0))) {
                        TransitionValues transitionValues10 = transition0.getTransitionValues(view7, true);
                        TransitionValues transitionValues11 = transition0.g(view7, true);
                        if(transitionValues10 == null && transitionValues11 == null) {
                            transitionValues11 = (TransitionValues)transition0.q.a.get(view7);
                        }
                        if((transitionValues10 != null || transitionValues11 != null) && h00.e.isTransitionRequired(h00.c, transitionValues11)) {
                            if(animator0.isRunning() || animator0.isStarted()) {
                                animator0.cancel();
                            }
                            else {
                                arrayMap5.remove(animator0);
                            }
                        }
                    }
                }
            }
        }
        transition0.createAnimators(viewGroup1, transition0.p, transition0.q, transition0.t, transition0.u);
        transition0.runAnimators();
        return true;
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view0) {
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view0) {
        ViewGroup viewGroup0 = this.b;
        viewGroup0.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup0.removeOnAttachStateChangeListener(this);
        ViewGroup viewGroup1 = this.b;
        TransitionManager.e.remove(viewGroup1);
        ArrayList arrayList0 = (ArrayList)TransitionManager.b().get(viewGroup1);
        if(arrayList0 != null && arrayList0.size() > 0) {
            for(Object object0: arrayList0) {
                ((Transition)object0).resume(viewGroup1);
            }
        }
        this.a.e(true);
    }
}

