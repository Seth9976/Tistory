package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.Lifecycle.State;
import java.io.PrintWriter;
import java.util.ArrayList;

public final class a extends FragmentTransaction implements BackStackEntry, OpGenerator {
    public final FragmentManager t;
    public boolean u;
    public int v;
    public boolean w;

    public a(FragmentManager fragmentManager0) {
        super(fragmentManager0.getFragmentFactory(), (fragmentManager0.getHost() == null ? null : fragmentManager0.getHost().b.getClassLoader()));
        this.v = -1;
        this.w = false;
        this.t = fragmentManager0;
    }

    public a(a a0) {
        super(a0.t.getFragmentFactory(), (a0.t.getHost() == null ? null : a0.t.getHost().b.getClassLoader()));
        for(Object object0: a0.c) {
            p1 p10 = new p1();  // 初始化器: Ljava/lang/Object;-><init>()V
            p10.a = ((p1)object0).a;
            p10.b = ((p1)object0).b;
            p10.c = ((p1)object0).c;
            p10.d = ((p1)object0).d;
            p10.e = ((p1)object0).e;
            p10.f = ((p1)object0).f;
            p10.g = ((p1)object0).g;
            p10.h = ((p1)object0).h;
            p10.i = ((p1)object0).i;
            this.c.add(p10);
        }
        this.d = a0.d;
        this.e = a0.e;
        this.f = a0.f;
        this.g = a0.g;
        this.h = a0.h;
        this.i = a0.i;
        this.j = a0.j;
        this.k = a0.k;
        this.n = a0.n;
        this.o = a0.o;
        this.l = a0.l;
        this.m = a0.m;
        if(a0.p != null) {
            ArrayList arrayList0 = new ArrayList();
            this.p = arrayList0;
            arrayList0.addAll(a0.p);
        }
        if(a0.q != null) {
            ArrayList arrayList1 = new ArrayList();
            this.q = arrayList1;
            arrayList1.addAll(a0.q);
        }
        this.r = a0.r;
        this.t = a0.t;
        this.u = a0.u;
        this.v = a0.v;
        this.w = a0.w;
    }

    @Override  // androidx.fragment.app.FragmentTransaction
    public final void c(int v, Fragment fragment0, String s, int v1) {
        super.c(v, fragment0, s, v1);
        fragment0.mFragmentManager = this.t;
    }

    @Override  // androidx.fragment.app.FragmentTransaction
    public final int commit() {
        return this.e(false);
    }

    @Override  // androidx.fragment.app.FragmentTransaction
    public final int commitAllowingStateLoss() {
        return this.e(true);
    }

    @Override  // androidx.fragment.app.FragmentTransaction
    public final void commitNow() {
        this.disallowAddToBackStack();
        this.t.x(this, false);
    }

    @Override  // androidx.fragment.app.FragmentTransaction
    public final void commitNowAllowingStateLoss() {
        this.disallowAddToBackStack();
        this.t.x(this, true);
    }

    public final void d(int v) {
        if(!this.i) {
            return;
        }
        if(FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "Bump nesting in " + this + " by " + v);
        }
        ArrayList arrayList0 = this.c;
        int v1 = arrayList0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            p1 p10 = (p1)arrayList0.get(v2);
            Fragment fragment0 = p10.b;
            if(fragment0 != null) {
                fragment0.mBackStackNesting += v;
                if(FragmentManager.isLoggingEnabled(2)) {
                    Log.v("FragmentManager", "Bump nesting of " + p10.b + " to " + p10.b.mBackStackNesting);
                }
            }
        }
    }

    @Override  // androidx.fragment.app.FragmentTransaction
    public final FragmentTransaction detach(Fragment fragment0) {
        if(fragment0.mFragmentManager != null && fragment0.mFragmentManager != this.t) {
            throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + fragment0.toString() + " is already attached to a FragmentManager.");
        }
        return super.detach(fragment0);
    }

    public final int e(boolean z) {
        if(this.u) {
            throw new IllegalStateException("commit already called");
        }
        if(FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter0 = new PrintWriter(new a2());
            this.f("  ", printWriter0, true);
            printWriter0.close();
        }
        this.u = true;
        FragmentManager fragmentManager0 = this.t;
        this.v = this.i ? fragmentManager0.i.getAndIncrement() : -1;
        fragmentManager0.u(this, z);
        return this.v;
    }

    public final void f(String s, PrintWriter printWriter0, boolean z) {
        String s1;
        if(z) {
            printWriter0.print(s);
            printWriter0.print("mName=");
            printWriter0.print(this.k);
            printWriter0.print(" mIndex=");
            printWriter0.print(this.v);
            printWriter0.print(" mCommitted=");
            printWriter0.println(this.u);
            if(this.h != 0) {
                printWriter0.print(s);
                printWriter0.print("mTransition=#");
                printWriter0.print(Integer.toHexString(this.h));
            }
            if(this.d != 0 || this.e != 0) {
                printWriter0.print(s);
                printWriter0.print("mEnterAnim=#");
                printWriter0.print(Integer.toHexString(this.d));
                printWriter0.print(" mExitAnim=#");
                printWriter0.println(Integer.toHexString(this.e));
            }
            if(this.f != 0 || this.g != 0) {
                printWriter0.print(s);
                printWriter0.print("mPopEnterAnim=#");
                printWriter0.print(Integer.toHexString(this.f));
                printWriter0.print(" mPopExitAnim=#");
                printWriter0.println(Integer.toHexString(this.g));
            }
            if(this.l != 0 || this.m != null) {
                printWriter0.print(s);
                printWriter0.print("mBreadCrumbTitleRes=#");
                printWriter0.print(Integer.toHexString(this.l));
                printWriter0.print(" mBreadCrumbTitleText=");
                printWriter0.println(this.m);
            }
            if(this.n != 0 || this.o != null) {
                printWriter0.print(s);
                printWriter0.print("mBreadCrumbShortTitleRes=#");
                printWriter0.print(Integer.toHexString(this.n));
                printWriter0.print(" mBreadCrumbShortTitleText=");
                printWriter0.println(this.o);
            }
        }
        ArrayList arrayList0 = this.c;
        if(!arrayList0.isEmpty()) {
            printWriter0.print(s);
            printWriter0.println("Operations:");
            int v = arrayList0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                p1 p10 = (p1)arrayList0.get(v1);
                switch(p10.a) {
                    case 0: {
                        s1 = "NULL";
                        break;
                    }
                    case 1: {
                        s1 = "ADD";
                        break;
                    }
                    case 2: {
                        s1 = "REPLACE";
                        break;
                    }
                    case 3: {
                        s1 = "REMOVE";
                        break;
                    }
                    case 4: {
                        s1 = "HIDE";
                        break;
                    }
                    case 5: {
                        s1 = "SHOW";
                        break;
                    }
                    case 6: {
                        s1 = "DETACH";
                        break;
                    }
                    case 7: {
                        s1 = "ATTACH";
                        break;
                    }
                    case 8: {
                        s1 = "SET_PRIMARY_NAV";
                        break;
                    }
                    case 9: {
                        s1 = "UNSET_PRIMARY_NAV";
                        break;
                    }
                    case 10: {
                        s1 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    }
                    default: {
                        s1 = "cmd=" + p10.a;
                    }
                }
                printWriter0.print(s);
                printWriter0.print("  Op #");
                printWriter0.print(v1);
                printWriter0.print(": ");
                printWriter0.print(s1);
                printWriter0.print(" ");
                printWriter0.println(p10.b);
                if(z) {
                    if(p10.d != 0 || p10.e != 0) {
                        printWriter0.print(s);
                        printWriter0.print("enterAnim=#");
                        printWriter0.print(Integer.toHexString(p10.d));
                        printWriter0.print(" exitAnim=#");
                        printWriter0.println(Integer.toHexString(p10.e));
                    }
                    if(p10.f != 0 || p10.g != 0) {
                        printWriter0.print(s);
                        printWriter0.print("popEnterAnim=#");
                        printWriter0.print(Integer.toHexString(p10.f));
                        printWriter0.print(" popExitAnim=#");
                        printWriter0.println(Integer.toHexString(p10.g));
                    }
                }
            }
        }
    }

    @Override  // androidx.fragment.app.FragmentManager$OpGenerator
    public final boolean generateOps(ArrayList arrayList0, ArrayList arrayList1) {
        if(FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList0.add(this);
        arrayList1.add(Boolean.FALSE);
        if(this.i) {
            FragmentManager fragmentManager0 = this.t;
            if(fragmentManager0.d == null) {
                fragmentManager0.d = new ArrayList();
            }
            fragmentManager0.d.add(this);
        }
        return true;
    }

    @Override  // androidx.fragment.app.FragmentManager$BackStackEntry
    public final CharSequence getBreadCrumbShortTitle() {
        return this.n == 0 ? this.o : this.t.getHost().b.getText(this.n);
    }

    @Override  // androidx.fragment.app.FragmentManager$BackStackEntry
    public final int getBreadCrumbShortTitleRes() {
        return this.n;
    }

    @Override  // androidx.fragment.app.FragmentManager$BackStackEntry
    public final CharSequence getBreadCrumbTitle() {
        return this.l == 0 ? this.m : this.t.getHost().b.getText(this.l);
    }

    @Override  // androidx.fragment.app.FragmentManager$BackStackEntry
    public final int getBreadCrumbTitleRes() {
        return this.l;
    }

    @Override  // androidx.fragment.app.FragmentManager$BackStackEntry
    public final int getId() {
        return this.v;
    }

    @Override  // androidx.fragment.app.FragmentManager$BackStackEntry
    public final String getName() {
        return this.k;
    }

    @Override  // androidx.fragment.app.FragmentTransaction
    public final FragmentTransaction hide(Fragment fragment0) {
        if(fragment0.mFragmentManager != null && fragment0.mFragmentManager != this.t) {
            throw new IllegalStateException("Cannot hide Fragment attached to a different FragmentManager. Fragment " + fragment0.toString() + " is already attached to a FragmentManager.");
        }
        return super.hide(fragment0);
    }

    @Override  // androidx.fragment.app.FragmentTransaction
    public final boolean isEmpty() {
        return this.c.isEmpty();
    }

    @Override  // androidx.fragment.app.FragmentTransaction
    public final FragmentTransaction remove(Fragment fragment0) {
        if(fragment0.mFragmentManager != null && fragment0.mFragmentManager != this.t) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment0.toString() + " is already attached to a FragmentManager.");
        }
        return super.remove(fragment0);
    }

    @Override  // androidx.fragment.app.FragmentTransaction
    public final FragmentTransaction setMaxLifecycle(Fragment fragment0, State lifecycle$State0) {
        FragmentManager fragmentManager0 = this.t;
        if(fragment0.mFragmentManager != fragmentManager0) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + fragmentManager0);
        }
        if(lifecycle$State0 == State.INITIALIZED && fragment0.mState > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + lifecycle$State0 + " after the Fragment has been created");
        }
        if(lifecycle$State0 == State.DESTROYED) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + lifecycle$State0 + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
        }
        return super.setMaxLifecycle(fragment0, lifecycle$State0);
    }

    @Override  // androidx.fragment.app.FragmentTransaction
    public final FragmentTransaction setPrimaryNavigationFragment(Fragment fragment0) {
        if(fragment0 != null && (fragment0.mFragmentManager != null && fragment0.mFragmentManager != this.t)) {
            throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + fragment0.toString() + " is already attached to a FragmentManager.");
        }
        return super.setPrimaryNavigationFragment(fragment0);
    }

    @Override  // androidx.fragment.app.FragmentTransaction
    public final FragmentTransaction show(Fragment fragment0) {
        if(fragment0.mFragmentManager != null && fragment0.mFragmentManager != this.t) {
            throw new IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + fragment0.toString() + " is already attached to a FragmentManager.");
        }
        return super.show(fragment0);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder(0x80);
        stringBuilder0.append("BackStackEntry{");
        stringBuilder0.append(Integer.toHexString(System.identityHashCode(this)));
        if(this.v >= 0) {
            stringBuilder0.append(" #");
            stringBuilder0.append(this.v);
        }
        if(this.k != null) {
            stringBuilder0.append(" ");
            stringBuilder0.append(this.k);
        }
        stringBuilder0.append("}");
        return stringBuilder0.toString();
    }
}

