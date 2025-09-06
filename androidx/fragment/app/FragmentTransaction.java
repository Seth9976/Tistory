package androidx.fragment.app;

import a5.b;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.AnimRes;
import androidx.annotation.AnimatorRes;
import androidx.annotation.IdRes;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.lifecycle.Lifecycle.State;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

public abstract class FragmentTransaction {
    public static final int TRANSIT_ENTER_MASK = 0x1000;
    public static final int TRANSIT_EXIT_MASK = 0x2000;
    public static final int TRANSIT_FRAGMENT_CLOSE = 0x2002;
    public static final int TRANSIT_FRAGMENT_FADE = 0x1003;
    public static final int TRANSIT_FRAGMENT_MATCH_ACTIVITY_CLOSE = 0x2005;
    public static final int TRANSIT_FRAGMENT_MATCH_ACTIVITY_OPEN = 4100;
    public static final int TRANSIT_FRAGMENT_OPEN = 0x1001;
    public static final int TRANSIT_NONE = 0;
    public static final int TRANSIT_UNSET = -1;
    public final FragmentFactory a;
    public final ClassLoader b;
    public final ArrayList c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public boolean j;
    public String k;
    public int l;
    public CharSequence m;
    public int n;
    public CharSequence o;
    public ArrayList p;
    public ArrayList q;
    public boolean r;
    public ArrayList s;

    @Deprecated
    public FragmentTransaction() {
        this.c = new ArrayList();
        this.j = true;
        this.r = false;
        this.a = null;
        this.b = null;
    }

    public FragmentTransaction(FragmentFactory fragmentFactory0, ClassLoader classLoader0) {
        this.c = new ArrayList();
        this.j = true;
        this.r = false;
        this.a = fragmentFactory0;
        this.b = classLoader0;
    }

    public final void a(p1 p10) {
        this.c.add(p10);
        p10.d = this.d;
        p10.e = this.e;
        p10.f = this.f;
        p10.g = this.g;
    }

    @NonNull
    public FragmentTransaction add(@IdRes int v, @NonNull Fragment fragment0) {
        this.c(v, fragment0, null, 1);
        return this;
    }

    @NonNull
    public FragmentTransaction add(@IdRes int v, @NonNull Fragment fragment0, @Nullable String s) {
        this.c(v, fragment0, s, 1);
        return this;
    }

    @NonNull
    public final FragmentTransaction add(@IdRes int v, @NonNull Class class0, @Nullable Bundle bundle0) {
        return this.add(v, this.b(bundle0, class0));
    }

    @NonNull
    public final FragmentTransaction add(@IdRes int v, @NonNull Class class0, @Nullable Bundle bundle0, @Nullable String s) {
        return this.add(v, this.b(bundle0, class0), s);
    }

    @NonNull
    public FragmentTransaction add(@NonNull Fragment fragment0, @Nullable String s) {
        this.c(0, fragment0, s, 1);
        return this;
    }

    @NonNull
    public final FragmentTransaction add(@NonNull Class class0, @Nullable Bundle bundle0, @Nullable String s) {
        return this.add(this.b(bundle0, class0), s);
    }

    @NonNull
    public FragmentTransaction addSharedElement(@NonNull View view0, @NonNull String s) {
        String s1 = ViewCompat.getTransitionName(view0);
        if(s1 == null) {
            throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
        }
        if(this.p == null) {
            this.p = new ArrayList();
            this.q = new ArrayList();
        }
        else {
            if(this.q.contains(s)) {
                throw new IllegalArgumentException("A shared element with the target name \'" + s + "\' has already been added to the transaction.");
            }
            if(this.p.contains(s1)) {
                throw new IllegalArgumentException("A shared element with the source name \'" + s1 + "\' has already been added to the transaction.");
            }
        }
        this.p.add(s1);
        this.q.add(s);
        return this;
    }

    @NonNull
    public FragmentTransaction addToBackStack(@Nullable String s) {
        if(!this.j) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.i = true;
        this.k = s;
        return this;
    }

    @NonNull
    public FragmentTransaction attach(@NonNull Fragment fragment0) {
        this.a(new p1(7, fragment0));
        return this;
    }

    public final Fragment b(Bundle bundle0, Class class0) {
        FragmentFactory fragmentFactory0 = this.a;
        if(fragmentFactory0 == null) {
            throw new IllegalStateException("Creating a Fragment requires that this FragmentTransaction was built with FragmentManager.beginTransaction()");
        }
        ClassLoader classLoader0 = this.b;
        if(classLoader0 == null) {
            throw new IllegalStateException("The FragmentManager must be attached to itshost to create a Fragment");
        }
        Fragment fragment0 = fragmentFactory0.instantiate(classLoader0, class0.getName());
        if(bundle0 != null) {
            fragment0.setArguments(bundle0);
        }
        return fragment0;
    }

    public void c(int v, Fragment fragment0, String s, int v1) {
        String s1 = fragment0.mPreviousWho;
        if(s1 != null) {
            FragmentStrictMode.onFragmentReuse(fragment0, s1);
        }
        Class class0 = fragment0.getClass();
        int v2 = class0.getModifiers();
        if(class0.isAnonymousClass() || !Modifier.isPublic(v2) || class0.isMemberClass() && !Modifier.isStatic(v2)) {
            throw new IllegalStateException("Fragment " + class0.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if(s != null) {
            if(fragment0.mTag != null && !s.equals(fragment0.mTag)) {
                StringBuilder stringBuilder0 = new StringBuilder("Can\'t change tag of fragment ");
                stringBuilder0.append(fragment0);
                stringBuilder0.append(": was ");
                throw new IllegalStateException(b.q(stringBuilder0, fragment0.mTag, " now ", s));
            }
            fragment0.mTag = s;
        }
        switch(v) {
            case -1: {
                throw new IllegalArgumentException("Can\'t add fragment " + fragment0 + " with tag " + s + " to container view with no id");
            label_16:
                if(fragment0.mFragmentId != 0 && fragment0.mFragmentId != v) {
                    throw new IllegalStateException("Can\'t change container ID of fragment " + fragment0 + ": was " + fragment0.mFragmentId + " now " + v);
                }
                fragment0.mFragmentId = v;
                fragment0.mContainerId = v;
                break;
            }
            case 0: {
                break;
            }
            default: {
                goto label_16;
            }
        }
        this.a(new p1(v1, fragment0));
    }

    public abstract int commit();

    public abstract int commitAllowingStateLoss();

    @MainThread
    public abstract void commitNow();

    @MainThread
    public abstract void commitNowAllowingStateLoss();

    @NonNull
    public FragmentTransaction detach(@NonNull Fragment fragment0) {
        this.a(new p1(6, fragment0));
        return this;
    }

    @NonNull
    public FragmentTransaction disallowAddToBackStack() {
        if(this.i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.j = false;
        return this;
    }

    @NonNull
    public FragmentTransaction hide(@NonNull Fragment fragment0) {
        this.a(new p1(4, fragment0));
        return this;
    }

    public boolean isAddToBackStackAllowed() {
        return this.j;
    }

    public boolean isEmpty() {
        return this.c.isEmpty();
    }

    @NonNull
    public FragmentTransaction remove(@NonNull Fragment fragment0) {
        this.a(new p1(3, fragment0));
        return this;
    }

    @NonNull
    public FragmentTransaction replace(@IdRes int v, @NonNull Fragment fragment0) {
        return this.replace(v, fragment0, null);
    }

    @NonNull
    public FragmentTransaction replace(@IdRes int v, @NonNull Fragment fragment0, @Nullable String s) {
        if(v == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        this.c(v, fragment0, s, 2);
        return this;
    }

    @NonNull
    public final FragmentTransaction replace(@IdRes int v, @NonNull Class class0, @Nullable Bundle bundle0) {
        return this.replace(v, class0, bundle0, null);
    }

    @NonNull
    public final FragmentTransaction replace(@IdRes int v, @NonNull Class class0, @Nullable Bundle bundle0, @Nullable String s) {
        return this.replace(v, this.b(bundle0, class0), s);
    }

    @NonNull
    public FragmentTransaction runOnCommit(@NonNull Runnable runnable0) {
        this.disallowAddToBackStack();
        if(this.s == null) {
            this.s = new ArrayList();
        }
        this.s.add(runnable0);
        return this;
    }

    @NonNull
    @Deprecated
    public FragmentTransaction setAllowOptimization(boolean z) {
        return this.setReorderingAllowed(z);
    }

    @NonNull
    @Deprecated
    public FragmentTransaction setBreadCrumbShortTitle(@StringRes int v) {
        this.n = v;
        this.o = null;
        return this;
    }

    @NonNull
    @Deprecated
    public FragmentTransaction setBreadCrumbShortTitle(@Nullable CharSequence charSequence0) {
        this.n = 0;
        this.o = charSequence0;
        return this;
    }

    @NonNull
    @Deprecated
    public FragmentTransaction setBreadCrumbTitle(@StringRes int v) {
        this.l = v;
        this.m = null;
        return this;
    }

    @NonNull
    @Deprecated
    public FragmentTransaction setBreadCrumbTitle(@Nullable CharSequence charSequence0) {
        this.l = 0;
        this.m = charSequence0;
        return this;
    }

    @NonNull
    public FragmentTransaction setCustomAnimations(@AnimRes @AnimatorRes int v, @AnimRes @AnimatorRes int v1) {
        return this.setCustomAnimations(v, v1, 0, 0);
    }

    @NonNull
    public FragmentTransaction setCustomAnimations(@AnimRes @AnimatorRes int v, @AnimRes @AnimatorRes int v1, @AnimRes @AnimatorRes int v2, @AnimRes @AnimatorRes int v3) {
        this.d = v;
        this.e = v1;
        this.f = v2;
        this.g = v3;
        return this;
    }

    @NonNull
    public FragmentTransaction setMaxLifecycle(@NonNull Fragment fragment0, @NonNull State lifecycle$State0) {
        p1 p10 = new p1();  // 初始化器: Ljava/lang/Object;-><init>()V
        p10.a = 10;
        p10.b = fragment0;
        p10.c = false;
        p10.h = fragment0.mMaxState;
        p10.i = lifecycle$State0;
        this.a(p10);
        return this;
    }

    @NonNull
    public FragmentTransaction setPrimaryNavigationFragment(@Nullable Fragment fragment0) {
        this.a(new p1(8, fragment0));
        return this;
    }

    @NonNull
    public FragmentTransaction setReorderingAllowed(boolean z) {
        this.r = z;
        return this;
    }

    @NonNull
    public FragmentTransaction setTransition(int v) {
        this.h = v;
        return this;
    }

    @NonNull
    @Deprecated
    public FragmentTransaction setTransitionStyle(@StyleRes int v) {
        return this;
    }

    @NonNull
    public FragmentTransaction show(@NonNull Fragment fragment0) {
        this.a(new p1(5, fragment0));
        return this;
    }
}

