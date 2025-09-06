package androidx.recyclerview.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.List;

public class DefaultItemAnimator extends SimpleItemAnimator {
    public final ArrayList h;
    public final ArrayList i;
    public final ArrayList j;
    public final ArrayList k;
    public final ArrayList l;
    public final ArrayList m;
    public final ArrayList n;
    public final ArrayList o;
    public final ArrayList p;
    public final ArrayList q;
    public final ArrayList r;
    public static TimeInterpolator s;

    public DefaultItemAnimator() {
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.n = new ArrayList();
        this.o = new ArrayList();
        this.p = new ArrayList();
        this.q = new ArrayList();
        this.r = new ArrayList();
    }

    @Override  // androidx.recyclerview.widget.SimpleItemAnimator
    @SuppressLint({"UnknownNullness"})
    public boolean animateAdd(ViewHolder recyclerView$ViewHolder0) {
        this.f(recyclerView$ViewHolder0);
        recyclerView$ViewHolder0.itemView.setAlpha(0.0f);
        this.i.add(recyclerView$ViewHolder0);
        return true;
    }

    @Override  // androidx.recyclerview.widget.SimpleItemAnimator
    @SuppressLint({"UnknownNullness"})
    public boolean animateChange(ViewHolder recyclerView$ViewHolder0, ViewHolder recyclerView$ViewHolder1, int v, int v1, int v2, int v3) {
        if(recyclerView$ViewHolder0 == recyclerView$ViewHolder1) {
            return this.animateMove(recyclerView$ViewHolder0, v, v1, v2, v3);
        }
        float f = recyclerView$ViewHolder0.itemView.getTranslationX();
        float f1 = recyclerView$ViewHolder0.itemView.getTranslationY();
        float f2 = recyclerView$ViewHolder0.itemView.getAlpha();
        this.f(recyclerView$ViewHolder0);
        recyclerView$ViewHolder0.itemView.setTranslationX(f);
        recyclerView$ViewHolder0.itemView.setTranslationY(f1);
        recyclerView$ViewHolder0.itemView.setAlpha(f2);
        if(recyclerView$ViewHolder1 != null) {
            this.f(recyclerView$ViewHolder1);
            recyclerView$ViewHolder1.itemView.setTranslationX(((float)(-((int)(((float)(v2 - v)) - f)))));
            recyclerView$ViewHolder1.itemView.setTranslationY(((float)(-((int)(((float)(v3 - v1)) - f1)))));
            recyclerView$ViewHolder1.itemView.setAlpha(0.0f);
        }
        t t0 = new t();  // 初始化器: Ljava/lang/Object;-><init>()V
        t0.a = recyclerView$ViewHolder0;
        t0.b = recyclerView$ViewHolder1;
        t0.c = v;
        t0.d = v1;
        t0.e = v2;
        t0.f = v3;
        this.k.add(t0);
        return true;
    }

    @Override  // androidx.recyclerview.widget.SimpleItemAnimator
    @SuppressLint({"UnknownNullness"})
    public boolean animateMove(ViewHolder recyclerView$ViewHolder0, int v, int v1, int v2, int v3) {
        View view0 = recyclerView$ViewHolder0.itemView;
        int v4 = v + ((int)view0.getTranslationX());
        int v5 = v1 + ((int)recyclerView$ViewHolder0.itemView.getTranslationY());
        this.f(recyclerView$ViewHolder0);
        int v6 = v2 - v4;
        int v7 = v3 - v5;
        if(v6 == 0 && v7 == 0) {
            this.dispatchMoveFinished(recyclerView$ViewHolder0);
            return false;
        }
        if(v6 != 0) {
            view0.setTranslationX(((float)(-v6)));
        }
        if(v7 != 0) {
            view0.setTranslationY(((float)(-v7)));
        }
        u u0 = new u();  // 初始化器: Ljava/lang/Object;-><init>()V
        u0.a = recyclerView$ViewHolder0;
        u0.b = v4;
        u0.c = v5;
        u0.d = v2;
        u0.e = v3;
        this.j.add(u0);
        return true;
    }

    @Override  // androidx.recyclerview.widget.SimpleItemAnimator
    @SuppressLint({"UnknownNullness"})
    public boolean animateRemove(ViewHolder recyclerView$ViewHolder0) {
        this.f(recyclerView$ViewHolder0);
        this.h.add(recyclerView$ViewHolder0);
        return true;
    }

    public static void b(ArrayList arrayList0) {
        for(int v = arrayList0.size() - 1; v >= 0; --v) {
            ((ViewHolder)arrayList0.get(v)).itemView.animate().cancel();
        }
    }

    public final void c() {
        if(!this.isRunning()) {
            this.dispatchAnimationsFinished();
        }
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.recyclerview.widget.RecyclerView$ItemAnimator
    public boolean canReuseUpdatedViewHolder(@NonNull ViewHolder recyclerView$ViewHolder0, @NonNull List list0) {
        return !list0.isEmpty() || super.canReuseUpdatedViewHolder(recyclerView$ViewHolder0, list0);
    }

    public final void d(ArrayList arrayList0, ViewHolder recyclerView$ViewHolder0) {
        for(int v = arrayList0.size() - 1; v >= 0; --v) {
            t t0 = (t)arrayList0.get(v);
            if(this.e(t0, recyclerView$ViewHolder0) && t0.a == null && t0.b == null) {
                arrayList0.remove(t0);
            }
        }
    }

    public final boolean e(t t0, ViewHolder recyclerView$ViewHolder0) {
        boolean z = false;
        if(t0.b == recyclerView$ViewHolder0) {
            t0.b = null;
        }
        else if(t0.a == recyclerView$ViewHolder0) {
            t0.a = null;
            z = true;
        }
        else {
            return false;
        }
        recyclerView$ViewHolder0.itemView.setAlpha(1.0f);
        recyclerView$ViewHolder0.itemView.setTranslationX(0.0f);
        recyclerView$ViewHolder0.itemView.setTranslationY(0.0f);
        this.dispatchChangeFinished(recyclerView$ViewHolder0, z);
        return true;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$ItemAnimator
    @SuppressLint({"UnknownNullness"})
    public void endAnimation(ViewHolder recyclerView$ViewHolder0) {
        View view0 = recyclerView$ViewHolder0.itemView;
        view0.animate().cancel();
        ArrayList arrayList0 = this.j;
        for(int v = arrayList0.size() - 1; v >= 0; --v) {
            if(((u)arrayList0.get(v)).a == recyclerView$ViewHolder0) {
                view0.setTranslationY(0.0f);
                view0.setTranslationX(0.0f);
                this.dispatchMoveFinished(recyclerView$ViewHolder0);
                arrayList0.remove(v);
            }
        }
        this.d(this.k, recyclerView$ViewHolder0);
        if(this.h.remove(recyclerView$ViewHolder0)) {
            view0.setAlpha(1.0f);
            this.dispatchRemoveFinished(recyclerView$ViewHolder0);
        }
        if(this.i.remove(recyclerView$ViewHolder0)) {
            view0.setAlpha(1.0f);
            this.dispatchAddFinished(recyclerView$ViewHolder0);
        }
        ArrayList arrayList1 = this.n;
        for(int v1 = arrayList1.size() - 1; v1 >= 0; --v1) {
            ArrayList arrayList2 = (ArrayList)arrayList1.get(v1);
            this.d(arrayList2, recyclerView$ViewHolder0);
            if(arrayList2.isEmpty()) {
                arrayList1.remove(v1);
            }
        }
        ArrayList arrayList3 = this.m;
        for(int v2 = arrayList3.size() - 1; v2 >= 0; --v2) {
            ArrayList arrayList4 = (ArrayList)arrayList3.get(v2);
            for(int v3 = arrayList4.size() - 1; v3 >= 0; --v3) {
                if(((u)arrayList4.get(v3)).a == recyclerView$ViewHolder0) {
                    view0.setTranslationY(0.0f);
                    view0.setTranslationX(0.0f);
                    this.dispatchMoveFinished(recyclerView$ViewHolder0);
                    arrayList4.remove(v3);
                    if(arrayList4.isEmpty()) {
                        arrayList3.remove(v2);
                    }
                    break;
                }
            }
        }
        ArrayList arrayList5 = this.l;
        for(int v4 = arrayList5.size() - 1; v4 >= 0; --v4) {
            ArrayList arrayList6 = (ArrayList)arrayList5.get(v4);
            if(arrayList6.remove(recyclerView$ViewHolder0)) {
                view0.setAlpha(1.0f);
                this.dispatchAddFinished(recyclerView$ViewHolder0);
                if(arrayList6.isEmpty()) {
                    arrayList5.remove(v4);
                }
            }
        }
        this.q.remove(recyclerView$ViewHolder0);
        this.o.remove(recyclerView$ViewHolder0);
        this.r.remove(recyclerView$ViewHolder0);
        this.p.remove(recyclerView$ViewHolder0);
        this.c();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$ItemAnimator
    public void endAnimations() {
        ArrayList arrayList0 = this.j;
        for(int v = arrayList0.size() - 1; v >= 0; --v) {
            u u0 = (u)arrayList0.get(v);
            View view0 = u0.a.itemView;
            view0.setTranslationY(0.0f);
            view0.setTranslationX(0.0f);
            this.dispatchMoveFinished(u0.a);
            arrayList0.remove(v);
        }
        ArrayList arrayList1 = this.h;
        for(int v1 = arrayList1.size() - 1; v1 >= 0; --v1) {
            this.dispatchRemoveFinished(((ViewHolder)arrayList1.get(v1)));
            arrayList1.remove(v1);
        }
        ArrayList arrayList2 = this.i;
        for(int v2 = arrayList2.size() - 1; v2 >= 0; --v2) {
            ViewHolder recyclerView$ViewHolder0 = (ViewHolder)arrayList2.get(v2);
            recyclerView$ViewHolder0.itemView.setAlpha(1.0f);
            this.dispatchAddFinished(recyclerView$ViewHolder0);
            arrayList2.remove(v2);
        }
        ArrayList arrayList3 = this.k;
        for(int v3 = arrayList3.size() - 1; v3 >= 0; --v3) {
            t t0 = (t)arrayList3.get(v3);
            ViewHolder recyclerView$ViewHolder1 = t0.a;
            if(recyclerView$ViewHolder1 != null) {
                this.e(t0, recyclerView$ViewHolder1);
            }
            ViewHolder recyclerView$ViewHolder2 = t0.b;
            if(recyclerView$ViewHolder2 != null) {
                this.e(t0, recyclerView$ViewHolder2);
            }
        }
        arrayList3.clear();
        if(!this.isRunning()) {
            return;
        }
        ArrayList arrayList4 = this.m;
        for(int v4 = arrayList4.size() - 1; v4 >= 0; --v4) {
            ArrayList arrayList5 = (ArrayList)arrayList4.get(v4);
            for(int v5 = arrayList5.size() - 1; v5 >= 0; --v5) {
                u u1 = (u)arrayList5.get(v5);
                View view1 = u1.a.itemView;
                view1.setTranslationY(0.0f);
                view1.setTranslationX(0.0f);
                this.dispatchMoveFinished(u1.a);
                arrayList5.remove(v5);
                if(arrayList5.isEmpty()) {
                    arrayList4.remove(arrayList5);
                }
            }
        }
        ArrayList arrayList6 = this.l;
        for(int v6 = arrayList6.size() - 1; v6 >= 0; --v6) {
            ArrayList arrayList7 = (ArrayList)arrayList6.get(v6);
            for(int v7 = arrayList7.size() - 1; v7 >= 0; --v7) {
                ViewHolder recyclerView$ViewHolder3 = (ViewHolder)arrayList7.get(v7);
                recyclerView$ViewHolder3.itemView.setAlpha(1.0f);
                this.dispatchAddFinished(recyclerView$ViewHolder3);
                arrayList7.remove(v7);
                if(arrayList7.isEmpty()) {
                    arrayList6.remove(arrayList7);
                }
            }
        }
        ArrayList arrayList8 = this.n;
        for(int v8 = arrayList8.size() - 1; v8 >= 0; --v8) {
            ArrayList arrayList9 = (ArrayList)arrayList8.get(v8);
            for(int v9 = arrayList9.size() - 1; v9 >= 0; --v9) {
                t t1 = (t)arrayList9.get(v9);
                ViewHolder recyclerView$ViewHolder4 = t1.a;
                if(recyclerView$ViewHolder4 != null) {
                    this.e(t1, recyclerView$ViewHolder4);
                }
                ViewHolder recyclerView$ViewHolder5 = t1.b;
                if(recyclerView$ViewHolder5 != null) {
                    this.e(t1, recyclerView$ViewHolder5);
                }
                if(arrayList9.isEmpty()) {
                    arrayList8.remove(arrayList9);
                }
            }
        }
        DefaultItemAnimator.b(this.q);
        DefaultItemAnimator.b(this.p);
        DefaultItemAnimator.b(this.o);
        DefaultItemAnimator.b(this.r);
        this.dispatchAnimationsFinished();
    }

    public final void f(ViewHolder recyclerView$ViewHolder0) {
        if(DefaultItemAnimator.s == null) {
            DefaultItemAnimator.s = new ValueAnimator().getInterpolator();
        }
        recyclerView$ViewHolder0.itemView.animate().setInterpolator(DefaultItemAnimator.s);
        this.endAnimation(recyclerView$ViewHolder0);
    }

    // 去混淆评级： 中等(110)
    @Override  // androidx.recyclerview.widget.RecyclerView$ItemAnimator
    public boolean isRunning() {
        return !this.i.isEmpty() || !this.k.isEmpty() || !this.j.isEmpty() || !this.h.isEmpty() || !this.p.isEmpty() || !this.q.isEmpty() || !this.o.isEmpty() || !this.r.isEmpty() || !this.m.isEmpty() || !this.l.isEmpty() || !this.n.isEmpty();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$ItemAnimator
    public void runPendingAnimations() {
        ArrayList arrayList0 = this.h;
        boolean z = arrayList0.isEmpty();
        ArrayList arrayList1 = this.j;
        boolean z1 = arrayList1.isEmpty();
        ArrayList arrayList2 = this.k;
        boolean z2 = arrayList2.isEmpty();
        ArrayList arrayList3 = this.i;
        boolean z3 = arrayList3.isEmpty();
        if(z && z1 && z3 && z2) {
            return;
        }
        for(Object object0: arrayList0) {
            ViewPropertyAnimator viewPropertyAnimator0 = ((ViewHolder)object0).itemView.animate();
            this.q.add(((ViewHolder)object0));
            viewPropertyAnimator0.setDuration(this.getRemoveDuration()).alpha(0.0f).setListener(new o(((ViewHolder)object0).itemView, viewPropertyAnimator0, this, ((ViewHolder)object0))).start();
        }
        arrayList0.clear();
        if(!z1) {
            ArrayList arrayList4 = new ArrayList();
            arrayList4.addAll(arrayList1);
            this.m.add(arrayList4);
            arrayList1.clear();
            m m0 = new m(this, arrayList4);
            if(z) {
                m0.run();
            }
            else {
                ViewCompat.postOnAnimationDelayed(((u)arrayList4.get(0)).a.itemView, m0, this.getRemoveDuration());
            }
        }
        if(!z2) {
            ArrayList arrayList5 = new ArrayList();
            arrayList5.addAll(arrayList2);
            this.n.add(arrayList5);
            arrayList2.clear();
            androidx.core.app.o o0 = new androidx.core.app.o(this, arrayList5, false, 4);
            if(z) {
                o0.run();
            }
            else {
                ViewCompat.postOnAnimationDelayed(((t)arrayList5.get(0)).a.itemView, o0, this.getRemoveDuration());
            }
        }
        if(!z3) {
            long v = 0L;
            ArrayList arrayList6 = new ArrayList();
            arrayList6.addAll(arrayList3);
            this.l.add(arrayList6);
            arrayList3.clear();
            n n0 = new n(this, arrayList6);
            if(z && z1 && z2) {
                n0.run();
                return;
            }
            long v1 = z ? 0L : this.getRemoveDuration();
            long v2 = z1 ? 0L : this.getMoveDuration();
            if(!z2) {
                v = this.getChangeDuration();
            }
            ViewCompat.postOnAnimationDelayed(((ViewHolder)arrayList6.get(0)).itemView, n0, Math.max(v2, v) + v1);
        }
    }
}

