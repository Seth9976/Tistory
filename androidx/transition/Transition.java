package androidx.transition;

import a8.e;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import androidx.collection.LongSparseArray;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.view.ViewCompat;
import androidx.core.view.a1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

public abstract class Transition implements Cloneable {
    public static abstract class EpicenterCallback {
        public abstract Rect onGetEpicenter(@NonNull Transition arg1);
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface MatchOrder {
    }

    public interface TransitionListener {
        void onTransitionCancel(@NonNull Transition arg1);

        void onTransitionEnd(@NonNull Transition arg1);

        void onTransitionPause(@NonNull Transition arg1);

        void onTransitionResume(@NonNull Transition arg1);

        void onTransitionStart(@NonNull Transition arg1);
    }

    public ArrayList A;
    public ArrayList B;
    public TransitionPropagation C;
    public EpicenterCallback D;
    public PathMotion E;
    public static final int[] F = null;
    public static final g0 G = null;
    public static final ThreadLocal H = null;
    public static final int MATCH_ID = 3;
    public static final int MATCH_INSTANCE = 1;
    public static final int MATCH_ITEM_ID = 4;
    public static final int MATCH_NAME = 2;
    public final String a;
    public long b;
    public long c;
    public TimeInterpolator d;
    public final ArrayList e;
    public final ArrayList f;
    public ArrayList g;
    public ArrayList h;
    public ArrayList i;
    public ArrayList j;
    public ArrayList k;
    public ArrayList l;
    public ArrayList m;
    public ArrayList n;
    public ArrayList o;
    public o0 p;
    public o0 q;
    public TransitionSet r;
    public int[] s;
    public ArrayList t;
    public ArrayList u;
    public boolean v;
    public final ArrayList w;
    public int x;
    public boolean y;
    public boolean z;

    static {
        Transition.F = new int[]{2, 1, 3, 4};
        Transition.G = new g0();  // 初始化器: Landroidx/transition/PathMotion;-><init>()V
        Transition.H = new ThreadLocal();
    }

    public Transition() {
        this.a = this.getClass().getName();
        this.b = -1L;
        this.c = -1L;
        this.d = null;
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = new o0();
        this.q = new o0();
        this.r = null;
        this.s = Transition.F;
        this.v = false;
        this.w = new ArrayList();
        this.x = 0;
        this.y = false;
        this.z = false;
        this.A = null;
        this.B = new ArrayList();
        this.E = Transition.G;
    }

    @SuppressLint({"RestrictedApi"})
    public Transition(@NonNull Context context0, @NonNull AttributeSet attributeSet0) {
        this.a = this.getClass().getName();
        this.b = -1L;
        this.c = -1L;
        this.d = null;
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = new o0();
        this.q = new o0();
        this.r = null;
        this.s = Transition.F;
        this.v = false;
        this.w = new ArrayList();
        this.x = 0;
        this.y = false;
        this.z = false;
        this.A = null;
        this.B = new ArrayList();
        this.E = Transition.G;
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, f0.c);
        long v = (long)TypedArrayUtils.getNamedInt(typedArray0, ((XmlResourceParser)attributeSet0), "duration", 1, -1);
        if(v >= 0L) {
            this.setDuration(v);
        }
        long v1 = (long)TypedArrayUtils.getNamedInt(typedArray0, ((XmlResourceParser)attributeSet0), "startDelay", 2, -1);
        if(v1 > 0L) {
            this.setStartDelay(v1);
        }
        int v2 = TypedArrayUtils.getNamedResourceId(typedArray0, ((XmlResourceParser)attributeSet0), "interpolator", 0, 0);
        if(v2 > 0) {
            this.setInterpolator(AnimationUtils.loadInterpolator(context0, v2));
        }
        String s = TypedArrayUtils.getNamedString(typedArray0, ((XmlResourceParser)attributeSet0), "matchOrder", 3);
        if(s != null) {
            StringTokenizer stringTokenizer0 = new StringTokenizer(s, ",");
            int[] arr_v = new int[stringTokenizer0.countTokens()];
            for(int v3 = 0; stringTokenizer0.hasMoreTokens(); ++v3) {
                String s1 = stringTokenizer0.nextToken().trim();
                if("id".equalsIgnoreCase(s1)) {
                    arr_v[v3] = 3;
                }
                else if("instance".equalsIgnoreCase(s1)) {
                    arr_v[v3] = 1;
                }
                else if("name".equalsIgnoreCase(s1)) {
                    arr_v[v3] = 2;
                }
                else if("itemId".equalsIgnoreCase(s1)) {
                    arr_v[v3] = 4;
                }
                else {
                    if(!s1.isEmpty()) {
                        throw new InflateException("Unknown match type in matchOrder: \'" + s1 + "\'");
                    }
                    int[] arr_v1 = new int[arr_v.length - 1];
                    System.arraycopy(arr_v, 0, arr_v1, 0, v3);
                    --v3;
                    arr_v = arr_v1;
                }
            }
            this.setMatchOrder(arr_v);
        }
        typedArray0.recycle();
    }

    public static void a(o0 o00, View view0, TransitionValues transitionValues0) {
        o00.a.put(view0, transitionValues0);
        int v = view0.getId();
        if(v >= 0) {
            SparseArray sparseArray0 = o00.b;
            if(sparseArray0.indexOfKey(v) >= 0) {
                sparseArray0.put(v, null);
            }
            else {
                sparseArray0.put(v, view0);
            }
        }
        String s = ViewCompat.getTransitionName(view0);
        if(s != null) {
            ArrayMap arrayMap0 = o00.d;
            if(arrayMap0.containsKey(s)) {
                arrayMap0.put(s, null);
            }
            else {
                arrayMap0.put(s, view0);
            }
        }
        if(view0.getParent() instanceof ListView) {
            ListView listView0 = (ListView)view0.getParent();
            if(listView0.getAdapter().hasStableIds()) {
                long v1 = listView0.getItemIdAtPosition(listView0.getPositionForView(view0));
                LongSparseArray longSparseArray0 = o00.c;
                if(longSparseArray0.indexOfKey(v1) >= 0) {
                    View view1 = (View)longSparseArray0.get(v1);
                    if(view1 != null) {
                        ViewCompat.setHasTransientState(view1, false);
                        longSparseArray0.put(v1, null);
                    }
                }
                else {
                    ViewCompat.setHasTransientState(view0, true);
                    longSparseArray0.put(v1, view0);
                }
            }
        }
    }

    @NonNull
    public Transition addListener(@NonNull TransitionListener transition$TransitionListener0) {
        if(this.A == null) {
            this.A = new ArrayList();
        }
        this.A.add(transition$TransitionListener0);
        return this;
    }

    @NonNull
    public Transition addTarget(@IdRes int v) {
        if(v != 0) {
            this.e.add(v);
        }
        return this;
    }

    @NonNull
    public Transition addTarget(@NonNull View view0) {
        this.f.add(view0);
        return this;
    }

    @NonNull
    public Transition addTarget(@NonNull Class class0) {
        if(this.h == null) {
            this.h = new ArrayList();
        }
        this.h.add(class0);
        return this;
    }

    @NonNull
    public Transition addTarget(@NonNull String s) {
        if(this.g == null) {
            this.g = new ArrayList();
        }
        this.g.add(s);
        return this;
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public void animate(Animator animator0) {
        if(animator0 == null) {
            this.end();
            return;
        }
        if(this.getDuration() >= 0L) {
            animator0.setDuration(this.getDuration());
        }
        if(this.getStartDelay() >= 0L) {
            animator0.setStartDelay(animator0.getStartDelay() + this.getStartDelay());
        }
        if(this.getInterpolator() != null) {
            animator0.setInterpolator(this.getInterpolator());
        }
        animator0.addListener(new e(this, 5));
        animator0.start();
    }

    public final void b(View view0, boolean z) {
        if(view0 == null) {
            return;
        }
        int v = view0.getId();
        if(this.i != null && this.i.contains(v)) {
            return;
        }
        if(this.j != null && this.j.contains(view0)) {
            return;
        }
        ArrayList arrayList0 = this.k;
        if(arrayList0 != null) {
            int v2 = arrayList0.size();
            for(int v3 = 0; v3 < v2; ++v3) {
                if(((Class)this.k.get(v3)).isInstance(view0)) {
                    return;
                }
            }
        }
        if(view0.getParent() instanceof ViewGroup) {
            TransitionValues transitionValues0 = new TransitionValues(view0);
            if(z) {
                this.captureStartValues(transitionValues0);
            }
            else {
                this.captureEndValues(transitionValues0);
            }
            transitionValues0.a.add(this);
            this.c(transitionValues0);
            if(z) {
                Transition.a(this.p, view0, transitionValues0);
            }
            else {
                Transition.a(this.q, view0, transitionValues0);
            }
        }
        if(!(view0 instanceof ViewGroup) || this.m != null && this.m.contains(v)) {
            return;
        }
        if(this.n != null && this.n.contains(view0)) {
            return;
        }
        ArrayList arrayList1 = this.o;
        if(arrayList1 != null) {
            int v4 = arrayList1.size();
            for(int v5 = 0; v5 < v4; ++v5) {
                if(((Class)this.o.get(v5)).isInstance(view0)) {
                    return;
                }
            }
        }
        for(int v1 = 0; v1 < ((ViewGroup)view0).getChildCount(); ++v1) {
            this.b(((ViewGroup)view0).getChildAt(v1), z);
        }
    }

    public void c(TransitionValues transitionValues0) {
        if(this.C != null && !transitionValues0.values.isEmpty()) {
            String[] arr_s = this.C.getPropagationProperties();
            if(arr_s == null) {
                return;
            }
            for(int v = 0; v < arr_s.length; ++v) {
                if(!transitionValues0.values.containsKey(arr_s[v])) {
                    this.C.captureValues(transitionValues0);
                    return;
                }
            }
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public void cancel() {
        ArrayList arrayList0 = this.w;
        for(int v = arrayList0.size() - 1; v >= 0; --v) {
            ((Animator)arrayList0.get(v)).cancel();
        }
        if(this.A != null && this.A.size() > 0) {
            ArrayList arrayList1 = (ArrayList)this.A.clone();
            int v1 = arrayList1.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                ((TransitionListener)arrayList1.get(v2)).onTransitionCancel(this);
            }
        }
    }

    public abstract void captureEndValues(@NonNull TransitionValues arg1);

    public abstract void captureStartValues(@NonNull TransitionValues arg1);

    public Transition clone() {
        try {
            Transition transition0 = (Transition)super.clone();
            transition0.B = new ArrayList();
            transition0.p = new o0();
            transition0.q = new o0();
            transition0.t = null;
            transition0.u = null;
            return transition0;
        }
        catch(CloneNotSupportedException unused_ex) {
            return null;
        }
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return this.clone();
    }

    @Nullable
    public Animator createAnimator(@NonNull ViewGroup viewGroup0, @Nullable TransitionValues transitionValues0, @Nullable TransitionValues transitionValues1) {
        return null;
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public void createAnimators(ViewGroup viewGroup0, o0 o00, o0 o01, ArrayList arrayList0, ArrayList arrayList1) {
        TransitionValues transitionValues5;
        Animator animator1;
        TransitionValues transitionValues4;
        View view0;
        ArrayMap arrayMap0 = Transition.h();
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        int v = arrayList0.size();
        long v1 = 0x7FFFFFFFFFFFFFFFL;
        int v2 = 0;
        while(v2 < v) {
            TransitionValues transitionValues0 = (TransitionValues)arrayList0.get(v2);
            TransitionValues transitionValues1 = (TransitionValues)arrayList1.get(v2);
            if(transitionValues0 != null && !transitionValues0.a.contains(this)) {
                transitionValues0 = null;
            }
            if(transitionValues1 != null && !transitionValues1.a.contains(this)) {
                transitionValues1 = null;
            }
            if((transitionValues0 != null || transitionValues1 != null) && (transitionValues0 == null || transitionValues1 == null || this.isTransitionRequired(transitionValues0, transitionValues1))) {
                Animator animator0 = this.createAnimator(viewGroup0, transitionValues0, transitionValues1);
                if(animator0 != null) {
                    if(transitionValues1 == null) {
                        view0 = transitionValues0.view;
                        transitionValues5 = null;
                    }
                    else {
                        view0 = transitionValues1.view;
                        String[] arr_s = this.getTransitionProperties();
                        if(arr_s == null || arr_s.length <= 0) {
                            animator1 = animator0;
                            transitionValues4 = null;
                        }
                        else {
                            TransitionValues transitionValues2 = new TransitionValues(view0);
                            TransitionValues transitionValues3 = (TransitionValues)o01.a.get(view0);
                            if(transitionValues3 != null) {
                                for(int v3 = 0; v3 < arr_s.length; ++v3) {
                                    String s = arr_s[v3];
                                    Object object0 = transitionValues3.values.get(s);
                                    transitionValues2.values.put(s, object0);
                                }
                            }
                            int v4 = arrayMap0.size();
                            int v5 = 0;
                            while(v5 < v4) {
                                h0 h00 = (h0)arrayMap0.get(((Animator)arrayMap0.keyAt(v5)));
                                if(h00.c != null && h00.a == view0 && h00.b.equals("androidx.transition.Transition") && h00.c.equals(transitionValues2)) {
                                    transitionValues4 = transitionValues2;
                                    animator1 = null;
                                    goto label_44;
                                }
                                ++v5;
                            }
                            transitionValues4 = transitionValues2;
                            animator1 = animator0;
                        }
                    label_44:
                        animator0 = animator1;
                        transitionValues5 = transitionValues4;
                    }
                    if(animator0 != null) {
                        TransitionPropagation transitionPropagation0 = this.C;
                        if(transitionPropagation0 != null) {
                            long v6 = transitionPropagation0.getStartDelay(viewGroup0, this, transitionValues0, transitionValues1);
                            sparseIntArray0.put(this.B.size(), ((int)v6));
                            v1 = Math.min(v6, v1);
                        }
                        z0 z00 = new z0(viewGroup0);
                        h0 h01 = new h0();  // 初始化器: Ljava/lang/Object;-><init>()V
                        h01.a = view0;
                        h01.b = "androidx.transition.Transition";
                        h01.c = transitionValues5;
                        h01.d = z00;
                        h01.e = this;
                        arrayMap0.put(animator0, h01);
                        this.B.add(animator0);
                    }
                }
            }
            ++v2;
        }
        if(sparseIntArray0.size() != 0) {
            for(int v7 = 0; v7 < sparseIntArray0.size(); ++v7) {
                int v8 = sparseIntArray0.keyAt(v7);
                Animator animator2 = (Animator)this.B.get(v8);
                long v9 = ((long)sparseIntArray0.valueAt(v7)) - v1;
                animator2.setStartDelay(animator2.getStartDelay() + v9);
            }
        }
    }

    public final void d(ViewGroup viewGroup0, boolean z) {
        this.e(z);
        ArrayList arrayList0 = this.e;
        ArrayList arrayList1 = this.f;
        if(arrayList0.size() <= 0 && arrayList1.size() <= 0 || this.g != null && !this.g.isEmpty() || this.h != null && !this.h.isEmpty()) {
            this.b(viewGroup0, z);
            return;
        }
        for(int v1 = 0; v1 < arrayList0.size(); ++v1) {
            View view0 = viewGroup0.findViewById(((int)(((Integer)arrayList0.get(v1)))));
            if(view0 != null) {
                TransitionValues transitionValues0 = new TransitionValues(view0);
                if(z) {
                    this.captureStartValues(transitionValues0);
                }
                else {
                    this.captureEndValues(transitionValues0);
                }
                transitionValues0.a.add(this);
                this.c(transitionValues0);
                if(z) {
                    Transition.a(this.p, view0, transitionValues0);
                }
                else {
                    Transition.a(this.q, view0, transitionValues0);
                }
            }
        }
        for(int v = 0; v < arrayList1.size(); ++v) {
            View view1 = (View)arrayList1.get(v);
            TransitionValues transitionValues1 = new TransitionValues(view1);
            if(z) {
                this.captureStartValues(transitionValues1);
            }
            else {
                this.captureEndValues(transitionValues1);
            }
            transitionValues1.a.add(this);
            this.c(transitionValues1);
            if(z) {
                Transition.a(this.p, view1, transitionValues1);
            }
            else {
                Transition.a(this.q, view1, transitionValues1);
            }
        }
    }

    public final void e(boolean z) {
        if(z) {
            this.p.a.clear();
            this.p.b.clear();
            this.p.c.clear();
            return;
        }
        this.q.a.clear();
        this.q.b.clear();
        this.q.c.clear();
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public void end() {
        int v = this.x - 1;
        this.x = v;
        if(v == 0) {
            if(this.A != null && this.A.size() > 0) {
                ArrayList arrayList0 = (ArrayList)this.A.clone();
                int v1 = arrayList0.size();
                for(int v2 = 0; v2 < v1; ++v2) {
                    ((TransitionListener)arrayList0.get(v2)).onTransitionEnd(this);
                }
            }
            for(int v3 = 0; v3 < this.p.c.size(); ++v3) {
                View view0 = (View)this.p.c.valueAt(v3);
                if(view0 != null) {
                    ViewCompat.setHasTransientState(view0, false);
                }
            }
            for(int v4 = 0; v4 < this.q.c.size(); ++v4) {
                View view1 = (View)this.q.c.valueAt(v4);
                if(view1 != null) {
                    ViewCompat.setHasTransientState(view1, false);
                }
            }
            this.z = true;
        }
    }

    @NonNull
    public Transition excludeChildren(@IdRes int v, boolean z) {
        ArrayList arrayList0 = this.m;
        if(v > 0) {
            arrayList0 = z ? f0.a(v, arrayList0) : f0.c(v, arrayList0);
        }
        this.m = arrayList0;
        return this;
    }

    @NonNull
    public Transition excludeChildren(@NonNull View view0, boolean z) {
        ArrayList arrayList0 = this.n;
        if(view0 != null) {
            arrayList0 = z ? f0.a(view0, arrayList0) : f0.c(view0, arrayList0);
        }
        this.n = arrayList0;
        return this;
    }

    @NonNull
    public Transition excludeChildren(@NonNull Class class0, boolean z) {
        ArrayList arrayList0 = this.o;
        if(class0 != null) {
            arrayList0 = z ? f0.a(class0, arrayList0) : f0.c(class0, arrayList0);
        }
        this.o = arrayList0;
        return this;
    }

    @NonNull
    public Transition excludeTarget(@IdRes int v, boolean z) {
        ArrayList arrayList0 = this.i;
        if(v > 0) {
            arrayList0 = z ? f0.a(v, arrayList0) : f0.c(v, arrayList0);
        }
        this.i = arrayList0;
        return this;
    }

    @NonNull
    public Transition excludeTarget(@NonNull View view0, boolean z) {
        ArrayList arrayList0 = this.j;
        if(view0 != null) {
            arrayList0 = z ? f0.a(view0, arrayList0) : f0.c(view0, arrayList0);
        }
        this.j = arrayList0;
        return this;
    }

    @NonNull
    public Transition excludeTarget(@NonNull Class class0, boolean z) {
        ArrayList arrayList0 = this.k;
        if(class0 != null) {
            arrayList0 = z ? f0.a(class0, arrayList0) : f0.c(class0, arrayList0);
        }
        this.k = arrayList0;
        return this;
    }

    @NonNull
    public Transition excludeTarget(@NonNull String s, boolean z) {
        ArrayList arrayList0 = this.l;
        if(s != null) {
            arrayList0 = z ? f0.a(s, arrayList0) : f0.c(s, arrayList0);
        }
        this.l = arrayList0;
        return this;
    }

    public void f(ViewGroup viewGroup0) {
        ArrayMap arrayMap0 = Transition.h();
        int v = arrayMap0.size();
        if(viewGroup0 != null && v != 0) {
            WindowId windowId0 = viewGroup0.getWindowId();
            ArrayMap arrayMap1 = new ArrayMap(arrayMap0);
            arrayMap0.clear();
            for(int v1 = v - 1; v1 >= 0; --v1) {
                h0 h00 = (h0)arrayMap1.valueAt(v1);
                if(h00.a != null && (h00.d != null && h00.d.a.equals(windowId0))) {
                    ((Animator)arrayMap1.keyAt(v1)).end();
                }
            }
        }
    }

    public final TransitionValues g(View view0, boolean z) {
        TransitionSet transitionSet0 = this.r;
        if(transitionSet0 != null) {
            return transitionSet0.g(view0, z);
        }
        ArrayList arrayList0 = z ? this.t : this.u;
        if(arrayList0 == null) {
            return null;
        }
        int v = arrayList0.size();
        int v1;
        for(v1 = 0; true; ++v1) {
            if(v1 >= v) {
                v1 = -1;
                break;
            }
            TransitionValues transitionValues0 = (TransitionValues)arrayList0.get(v1);
            if(transitionValues0 == null) {
                return null;
            }
            if(transitionValues0.view == view0) {
                break;
            }
        }
        if(v1 >= 0) {
            return z ? ((TransitionValues)this.u.get(v1)) : ((TransitionValues)this.t.get(v1));
        }
        return null;
    }

    public long getDuration() {
        return this.c;
    }

    @Nullable
    public Rect getEpicenter() {
        return this.D == null ? null : this.D.onGetEpicenter(this);
    }

    @Nullable
    public EpicenterCallback getEpicenterCallback() {
        return this.D;
    }

    @Nullable
    public TimeInterpolator getInterpolator() {
        return this.d;
    }

    @NonNull
    public String getName() [...] // 潜在的解密器

    @NonNull
    public PathMotion getPathMotion() {
        return this.E;
    }

    @Nullable
    public TransitionPropagation getPropagation() {
        return this.C;
    }

    public long getStartDelay() {
        return this.b;
    }

    @NonNull
    public List getTargetIds() {
        return this.e;
    }

    @Nullable
    public List getTargetNames() {
        return this.g;
    }

    @Nullable
    public List getTargetTypes() {
        return this.h;
    }

    @NonNull
    public List getTargets() {
        return this.f;
    }

    @Nullable
    public String[] getTransitionProperties() {
        return null;
    }

    @Nullable
    public TransitionValues getTransitionValues(@NonNull View view0, boolean z) {
        TransitionSet transitionSet0 = this.r;
        if(transitionSet0 != null) {
            return transitionSet0.getTransitionValues(view0, z);
        }
        return z ? ((TransitionValues)this.p.a.get(view0)) : ((TransitionValues)this.q.a.get(view0));
    }

    public static ArrayMap h() {
        ThreadLocal threadLocal0 = Transition.H;
        ArrayMap arrayMap0 = (ArrayMap)threadLocal0.get();
        if(arrayMap0 == null) {
            arrayMap0 = new ArrayMap();
            threadLocal0.set(arrayMap0);
        }
        return arrayMap0;
    }

    public final boolean i(View view0) {
        int v = view0.getId();
        if(this.i != null && this.i.contains(v)) {
            return false;
        }
        if(this.j != null && this.j.contains(view0)) {
            return false;
        }
        ArrayList arrayList0 = this.k;
        if(arrayList0 != null) {
            int v1 = arrayList0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                if(((Class)this.k.get(v2)).isInstance(view0)) {
                    return false;
                }
            }
        }
        if(this.l != null && ViewCompat.getTransitionName(view0) != null && this.l.contains(ViewCompat.getTransitionName(view0))) {
            return false;
        }
        ArrayList arrayList1 = this.e;
        ArrayList arrayList2 = this.f;
        if(arrayList1.size() == 0 && arrayList2.size() == 0 && (this.h == null || this.h.isEmpty()) && (this.g == null || this.g.isEmpty())) {
            return true;
        }
        if(arrayList1.contains(v) || arrayList2.contains(view0) || this.g != null && this.g.contains(ViewCompat.getTransitionName(view0))) {
            return true;
        }
        if(this.h != null) {
            for(int v3 = 0; v3 < this.h.size(); ++v3) {
                if(((Class)this.h.get(v3)).isInstance(view0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isTransitionRequired(@Nullable TransitionValues transitionValues0, @Nullable TransitionValues transitionValues1) {
        int v1;
        int v2;
        if(transitionValues0 != null && transitionValues1 != null) {
            String[] arr_s = this.getTransitionProperties();
            if(arr_s == null) {
                Iterator iterator0 = transitionValues0.values.keySet().iterator();
                while(true) {
                    if(!iterator0.hasNext()) {
                        return false;
                    }
                    Object object2 = iterator0.next();
                    Object object3 = transitionValues0.values.get(((String)object2));
                    Object object4 = transitionValues1.values.get(((String)object2));
                    if(object3 == null && object4 == null) {
                        v2 = 0;
                    }
                    else if(object3 == null || object4 == null) {
                        v2 = 1;
                    }
                    else {
                        v2 = !object3.equals(object4);
                    }
                    if(v2 != 0) {
                        break;
                    }
                }
            }
            else {
                for(int v = 0; v < arr_s.length; ++v) {
                    String s = arr_s[v];
                    Object object0 = transitionValues0.values.get(s);
                    Object object1 = transitionValues1.values.get(s);
                    if(object0 == null && object1 == null) {
                        v1 = 0;
                    }
                    else if(object0 == null || object1 == null) {
                        v1 = 1;
                    }
                    else {
                        v1 = !object0.equals(object1);
                    }
                    if(v1 != 0) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public void j() {
        this.v = true;
    }

    public String k(String s) [...] // 潜在的解密器

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public void pause(View view0) {
        if(!this.z) {
            ArrayList arrayList0 = this.w;
            for(int v = arrayList0.size() - 1; v >= 0; --v) {
                ((Animator)arrayList0.get(v)).pause();
            }
            if(this.A != null && this.A.size() > 0) {
                ArrayList arrayList1 = (ArrayList)this.A.clone();
                int v1 = arrayList1.size();
                for(int v2 = 0; v2 < v1; ++v2) {
                    ((TransitionListener)arrayList1.get(v2)).onTransitionPause(this);
                }
            }
            this.y = true;
        }
    }

    @NonNull
    public Transition removeListener(@NonNull TransitionListener transition$TransitionListener0) {
        ArrayList arrayList0 = this.A;
        if(arrayList0 == null) {
            return this;
        }
        arrayList0.remove(transition$TransitionListener0);
        if(this.A.size() == 0) {
            this.A = null;
        }
        return this;
    }

    @NonNull
    public Transition removeTarget(@IdRes int v) {
        if(v != 0) {
            this.e.remove(Integer.valueOf(v));
        }
        return this;
    }

    @NonNull
    public Transition removeTarget(@NonNull View view0) {
        this.f.remove(view0);
        return this;
    }

    @NonNull
    public Transition removeTarget(@NonNull Class class0) {
        ArrayList arrayList0 = this.h;
        if(arrayList0 != null) {
            arrayList0.remove(class0);
        }
        return this;
    }

    @NonNull
    public Transition removeTarget(@NonNull String s) {
        ArrayList arrayList0 = this.g;
        if(arrayList0 != null) {
            arrayList0.remove(s);
        }
        return this;
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public void resume(View view0) {
        if(this.y) {
            if(!this.z) {
                ArrayList arrayList0 = this.w;
                for(int v = arrayList0.size() - 1; v >= 0; --v) {
                    ((Animator)arrayList0.get(v)).resume();
                }
                if(this.A != null && this.A.size() > 0) {
                    ArrayList arrayList1 = (ArrayList)this.A.clone();
                    int v1 = arrayList1.size();
                    for(int v2 = 0; v2 < v1; ++v2) {
                        ((TransitionListener)arrayList1.get(v2)).onTransitionResume(this);
                    }
                }
            }
            this.y = false;
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public void runAnimators() {
        this.start();
        ArrayMap arrayMap0 = Transition.h();
        for(Object object0: this.B) {
            Animator animator0 = (Animator)object0;
            if(arrayMap0.containsKey(animator0)) {
                this.start();
                if(animator0 != null) {
                    animator0.addListener(new a1(2, this, arrayMap0));
                    this.animate(animator0);
                }
            }
        }
        this.B.clear();
        this.end();
    }

    @NonNull
    public Transition setDuration(long v) {
        this.c = v;
        return this;
    }

    public void setEpicenterCallback(@Nullable EpicenterCallback transition$EpicenterCallback0) {
        this.D = transition$EpicenterCallback0;
    }

    @NonNull
    public Transition setInterpolator(@Nullable TimeInterpolator timeInterpolator0) {
        this.d = timeInterpolator0;
        return this;
    }

    public void setMatchOrder(int[] arr_v) {
        if(arr_v != null && arr_v.length != 0) {
            for(int v = 0; v < arr_v.length; ++v) {
                int v1 = arr_v[v];
                if(v1 < 1 || v1 > 4) {
                    throw new IllegalArgumentException("matches contains invalid value");
                }
                for(int v2 = 0; v2 < v; ++v2) {
                    if(arr_v[v2] == v1) {
                        throw new IllegalArgumentException("matches contains a duplicate value");
                    }
                }
            }
            this.s = (int[])arr_v.clone();
            return;
        }
        this.s = Transition.F;
    }

    public void setPathMotion(@Nullable PathMotion pathMotion0) {
        if(pathMotion0 == null) {
            this.E = Transition.G;
            return;
        }
        this.E = pathMotion0;
    }

    public void setPropagation(@Nullable TransitionPropagation transitionPropagation0) {
        this.C = transitionPropagation0;
    }

    @NonNull
    public Transition setStartDelay(long v) {
        this.b = v;
        return this;
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public void start() {
        if(this.x == 0) {
            if(this.A != null && this.A.size() > 0) {
                ArrayList arrayList0 = (ArrayList)this.A.clone();
                int v = arrayList0.size();
                for(int v1 = 0; v1 < v; ++v1) {
                    ((TransitionListener)arrayList0.get(v1)).onTransitionStart(this);
                }
            }
            this.z = false;
        }
        ++this.x;
    }

    // 去混淆评级： 低(20)
    @Override
    public String toString() {
        return "Transition@775164f1: ";
    }
}

