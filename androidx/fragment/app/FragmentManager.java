package androidx.fragment.app;

import a5.b;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.activity.result.contract.ActivityResultContracts.RequestMultiplePermissions;
import androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult;
import androidx.annotation.IdRes;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.core.app.OnMultiWindowModeChangedProvider;
import androidx.core.app.OnPictureInPictureModeChangedProvider;
import androidx.core.content.OnConfigurationChangedProvider;
import androidx.core.content.OnTrimMemoryProvider;
import androidx.core.view.MenuHost;
import androidx.fragment.R.id;
import androidx.fragment.app.strictmode.FragmentStrictMode.Policy;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import jeb.synthetic.FIN;

public abstract class FragmentManager implements FragmentResultOwner {
    public interface BackStackEntry {
        @Nullable
        @Deprecated
        CharSequence getBreadCrumbShortTitle();

        @StringRes
        @Deprecated
        int getBreadCrumbShortTitleRes();

        @Nullable
        @Deprecated
        CharSequence getBreadCrumbTitle();

        @StringRes
        @Deprecated
        int getBreadCrumbTitleRes();

        int getId();

        @Nullable
        String getName();
    }

    public static abstract class FragmentLifecycleCallbacks {
        @Deprecated
        public void onFragmentActivityCreated(@NonNull FragmentManager fragmentManager0, @NonNull Fragment fragment0, @Nullable Bundle bundle0) {
        }

        public void onFragmentAttached(@NonNull FragmentManager fragmentManager0, @NonNull Fragment fragment0, @NonNull Context context0) {
        }

        public void onFragmentCreated(@NonNull FragmentManager fragmentManager0, @NonNull Fragment fragment0, @Nullable Bundle bundle0) {
        }

        public void onFragmentDestroyed(@NonNull FragmentManager fragmentManager0, @NonNull Fragment fragment0) {
        }

        public void onFragmentDetached(@NonNull FragmentManager fragmentManager0, @NonNull Fragment fragment0) {
        }

        public void onFragmentPaused(@NonNull FragmentManager fragmentManager0, @NonNull Fragment fragment0) {
        }

        public void onFragmentPreAttached(@NonNull FragmentManager fragmentManager0, @NonNull Fragment fragment0, @NonNull Context context0) {
        }

        public void onFragmentPreCreated(@NonNull FragmentManager fragmentManager0, @NonNull Fragment fragment0, @Nullable Bundle bundle0) {
        }

        public void onFragmentResumed(@NonNull FragmentManager fragmentManager0, @NonNull Fragment fragment0) {
        }

        public void onFragmentSaveInstanceState(@NonNull FragmentManager fragmentManager0, @NonNull Fragment fragment0, @NonNull Bundle bundle0) {
        }

        public void onFragmentStarted(@NonNull FragmentManager fragmentManager0, @NonNull Fragment fragment0) {
        }

        public void onFragmentStopped(@NonNull FragmentManager fragmentManager0, @NonNull Fragment fragment0) {
        }

        public void onFragmentViewCreated(@NonNull FragmentManager fragmentManager0, @NonNull Fragment fragment0, @NonNull View view0, @Nullable Bundle bundle0) {
        }

        public void onFragmentViewDestroyed(@NonNull FragmentManager fragmentManager0, @NonNull Fragment fragment0) {
        }
    }

    public interface OnBackStackChangedListener {
        @MainThread
        default void onBackStackChangeCommitted(@NonNull Fragment fragment0, boolean z) {
        }

        @MainThread
        default void onBackStackChangeStarted(@NonNull Fragment fragment0, boolean z) {
        }

        @MainThread
        void onBackStackChanged();
    }

    interface OpGenerator {
        boolean generateOps(@NonNull ArrayList arg1, @NonNull ArrayList arg2);
    }

    public final s0 A;
    public final t0 B;
    public ActivityResultLauncher C;
    public ActivityResultLauncher D;
    public ActivityResultLauncher E;
    public ArrayDeque F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public ArrayList L;
    public ArrayList M;
    public ArrayList N;
    public g1 O;
    public Policy P;
    public static final int POP_BACK_STACK_INCLUSIVE = 1;
    public final m Q;
    public static boolean R = false;
    @RestrictTo({Scope.LIBRARY})
    public static final String TAG = "FragmentManager";
    public final ArrayList a;
    public boolean b;
    public final l1 c;
    public ArrayList d;
    public ArrayList e;
    public final l0 f;
    public OnBackPressedDispatcher g;
    public final q0 h;
    public final AtomicInteger i;
    public final Map j;
    public final Map k;
    public final Map l;
    public ArrayList m;
    public final n0 n;
    public final CopyOnWriteArrayList o;
    public final o0 p;
    public final o0 q;
    public final o0 r;
    public final o0 s;
    public final r0 t;
    public int u;
    public FragmentHostCallback v;
    public FragmentContainer w;
    public Fragment x;
    public Fragment y;
    public FragmentFactory z;

    public FragmentManager() {
        this.a = new ArrayList();
        this.c = new l1();
        this.f = new l0(this);
        this.h = new q0(this);
        this.i = new AtomicInteger();
        this.j = Collections.synchronizedMap(new HashMap());
        this.k = Collections.synchronizedMap(new HashMap());
        this.l = Collections.synchronizedMap(new HashMap());
        this.n = new n0(this);
        this.o = new CopyOnWriteArrayList();
        this.p = new o0(this, 0);
        this.q = new o0(this, 1);
        this.r = new o0(this, 2);
        this.s = new o0(this, 3);
        this.t = new r0(this);
        this.u = -1;
        this.z = null;
        this.A = new s0(this);
        this.B = new t0();  // 初始化器: Ljava/lang/Object;-><init>()V
        this.F = new ArrayDeque();
        this.Q = new m(this, 2);
    }

    public static Fragment A(View view0) {
        while(view0 != null) {
            Object object0 = view0.getTag(id.fragment_container_view_tag);
            Fragment fragment0 = object0 instanceof Fragment ? ((Fragment)object0) : null;
            if(fragment0 != null) {
                return fragment0;
            }
            ViewParent viewParent0 = view0.getParent();
            view0 = viewParent0 instanceof View ? ((View)viewParent0) : null;
        }
        return null;
    }

    public final ViewGroup B(Fragment fragment0) {
        ViewGroup viewGroup0 = fragment0.mContainer;
        if(viewGroup0 != null) {
            return viewGroup0;
        }
        if(fragment0.mContainerId <= 0) {
            return null;
        }
        if(this.w.onHasView()) {
            View view0 = this.w.onFindViewById(fragment0.mContainerId);
            return view0 instanceof ViewGroup ? ((ViewGroup)view0) : null;
        }
        return null;
    }

    public final SpecialEffectsControllerFactory C() {
        Fragment fragment0 = this.x;
        return fragment0 != null ? fragment0.mFragmentManager.C() : this.B;
    }

    public final void D(Fragment fragment0) {
        if(FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "hide: " + fragment0);
        }
        if(!fragment0.mHidden) {
            fragment0.mHidden = true;
            fragment0.mHiddenChanged ^= true;
            this.V(fragment0);
        }
    }

    public static boolean E(Fragment fragment0) {
        if(!fragment0.mHasMenu || !fragment0.mMenuVisible) {
            boolean z = false;
            for(Object object0: fragment0.mChildFragmentManager.c.e()) {
                Fragment fragment1 = (Fragment)object0;
                if(fragment1 != null) {
                    z = FragmentManager.E(fragment1);
                }
                if(!z) {
                    continue;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    // 去混淆评级： 低(30)
    public final boolean F() {
        return this.x == null ? true : this.x.isAdded() && this.x.getParentFragmentManager().F();
    }

    public static boolean G(Fragment fragment0) {
        if(fragment0 == null) {
            return true;
        }
        FragmentManager fragmentManager0 = fragment0.mFragmentManager;
        return fragment0.equals(fragmentManager0.getPrimaryNavigationFragment()) && FragmentManager.G(fragmentManager0.x);
    }

    public final void H(int v, boolean z) {
        if(this.v == null && v != -1) {
            throw new IllegalStateException("No activity");
        }
        if(!z && v == this.u) {
            return;
        }
        this.u = v;
        l1 l10 = this.c;
        Iterator iterator0 = l10.a.iterator();
        while(true) {
            boolean z1 = iterator0.hasNext();
            HashMap hashMap0 = l10.b;
            if(!z1) {
                break;
            }
            Object object0 = iterator0.next();
            k1 k10 = (k1)hashMap0.get(((Fragment)object0).mWho);
            if(k10 != null) {
                k10.k();
            }
        }
        for(Object object1: hashMap0.values()) {
            k1 k11 = (k1)object1;
            if(k11 != null) {
                k11.k();
                Fragment fragment0 = k11.c;
                if(fragment0.mRemoving && !fragment0.isInBackStack()) {
                    if(fragment0.mBeingSaved && !l10.c.containsKey(fragment0.mWho)) {
                        l10.i(fragment0.mWho, k11.n());
                    }
                    l10.h(k11);
                }
            }
        }
        for(Object object2: l10.d()) {
            k1 k12 = (k1)object2;
            Fragment fragment1 = k12.c;
            if(!fragment1.mDeferStart) {
            }
            else if(this.b) {
                this.K = true;
            }
            else {
                fragment1.mDeferStart = false;
                k12.k();
            }
        }
        if(this.G) {
            FragmentHostCallback fragmentHostCallback0 = this.v;
            if(fragmentHostCallback0 != null && this.u == 7) {
                fragmentHostCallback0.onSupportInvalidateOptionsMenu();
                this.G = false;
            }
        }
    }

    public final void I() {
        if(this.v == null) {
            return;
        }
        this.H = false;
        this.I = false;
        this.O.N0 = false;
        for(Object object0: this.c.f()) {
            Fragment fragment0 = (Fragment)object0;
            if(fragment0 != null) {
                fragment0.noteStateNotSaved();
            }
        }
    }

    public final void J(int v, int v1, boolean z) {
        if(v < 0) {
            throw new IllegalArgumentException("Bad id: " + v);
        }
        this.u(new a1(this, null, v, v1), z);
    }

    public final boolean K(int v, int v1, String s) {
        this.w(false);
        this.v(true);
        if(this.y != null && v < 0 && s == null && this.y.getChildFragmentManager().popBackStackImmediate()) {
            return true;
        }
        boolean z = this.L(this.L, this.M, s, v, v1);
        if(z) {
            try {
                this.b = true;
                this.N(this.L, this.M);
            }
            finally {
                this.d();
            }
        }
        this.Y();
        l1 l10 = this.c;
        if(this.K) {
            this.K = false;
            for(Object object0: l10.d()) {
                k1 k10 = (k1)object0;
                Fragment fragment0 = k10.c;
                if(!fragment0.mDeferStart) {
                }
                else if(this.b) {
                    this.K = true;
                }
                else {
                    fragment0.mDeferStart = false;
                    k10.k();
                }
            }
        }
        l10.b.values().removeAll(Collections.singleton(null));
        return z;
    }

    public final boolean L(ArrayList arrayList0, ArrayList arrayList1, String s, int v, int v1) {
        int v2 = this.z(s, v, (v1 & 1) != 0);
        if(v2 < 0) {
            return false;
        }
        for(int v3 = this.d.size() - 1; v3 >= v2; --v3) {
            arrayList0.add(((a)this.d.remove(v3)));
            arrayList1.add(Boolean.TRUE);
        }
        return true;
    }

    public final void M(Fragment fragment0) {
        if(FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "remove: " + fragment0 + " nesting=" + fragment0.mBackStackNesting);
        }
        boolean z = fragment0.isInBackStack();
        if(!fragment0.mDetached || !z) {
            synchronized(this.c.a) {
                this.c.a.remove(fragment0);
            }
            fragment0.mAdded = false;
            if(FragmentManager.E(fragment0)) {
                this.G = true;
            }
            fragment0.mRemoving = true;
            this.V(fragment0);
        }
    }

    public final void N(ArrayList arrayList0, ArrayList arrayList1) {
        if(arrayList0.isEmpty()) {
            return;
        }
        if(arrayList0.size() != arrayList1.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int v = arrayList0.size();
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            if(!((a)arrayList0.get(v1)).r) {
                if(v2 != v1) {
                    this.y(arrayList0, arrayList1, v2, v1);
                }
                v2 = v1 + 1;
                if(((Boolean)arrayList1.get(v1)).booleanValue()) {
                    while(v2 < v && ((Boolean)arrayList1.get(v2)).booleanValue() && !((a)arrayList0.get(v2)).r) {
                        ++v2;
                    }
                }
                this.y(arrayList0, arrayList1, v1, v2);
                v1 = v2 - 1;
            }
        }
        if(v2 != v) {
            this.y(arrayList0, arrayList1, v2, v);
        }
    }

    // 检测为 Lambda 实现
    public final boolean O(ArrayList arrayList0, ArrayList arrayList1, String s) [...]

    public final void P(Parcelable parcelable0) {
        k1 k10;
        n0 n00;
        if(parcelable0 == null) {
            return;
        }
        for(Object object0: ((Bundle)parcelable0).keySet()) {
            String s = (String)object0;
            if(s.startsWith("result_")) {
                Bundle bundle0 = ((Bundle)parcelable0).getBundle(s);
                if(bundle0 != null) {
                    bundle0.setClassLoader(this.v.b.getClassLoader());
                    this.k.put(s.substring(7), bundle0);
                }
            }
        }
        HashMap hashMap0 = new HashMap();
        for(Object object1: ((Bundle)parcelable0).keySet()) {
            String s1 = (String)object1;
            if(s1.startsWith("fragment_")) {
                Bundle bundle1 = ((Bundle)parcelable0).getBundle(s1);
                if(bundle1 != null) {
                    bundle1.setClassLoader(this.v.b.getClassLoader());
                    hashMap0.put(s1.substring(9), bundle1);
                }
            }
        }
        l1 l10 = this.c;
        l10.c.clear();
        l10.c.putAll(hashMap0);
        e1 e10 = (e1)((Bundle)parcelable0).getParcelable("state");
        if(e10 == null) {
            return;
        }
        HashMap hashMap1 = l10.b;
        hashMap1.clear();
        Iterator iterator2 = e10.a.iterator();
        while(true) {
            boolean z = iterator2.hasNext();
            n00 = this.n;
            if(!z) {
                break;
            }
            Object object2 = iterator2.next();
            Bundle bundle2 = l10.i(((String)object2), null);
            if(bundle2 != null) {
                h1 h10 = (h1)bundle2.getParcelable("state");
                Fragment fragment0 = (Fragment)this.O.H0.get(h10.b);
                if(fragment0 == null) {
                    ClassLoader classLoader0 = this.v.b.getClassLoader();
                    FragmentFactory fragmentFactory0 = this.getFragmentFactory();
                    k10 = new k1(this.n, this.c, classLoader0, fragmentFactory0, bundle2);
                }
                else {
                    if(FragmentManager.isLoggingEnabled(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + fragment0);
                    }
                    k10 = new k1(n00, l10, fragment0, bundle2);
                }
                Fragment fragment1 = k10.c;
                fragment1.mSavedFragmentState = bundle2;
                fragment1.mFragmentManager = this;
                if(FragmentManager.isLoggingEnabled(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + fragment1.mWho + "): " + fragment1);
                }
                k10.l(this.v.b.getClassLoader());
                l10.g(k10);
                k10.e = this.u;
            }
        }
        g1 g10 = this.O;
        g10.getClass();
        for(Object object3: new ArrayList(g10.H0.values())) {
            Fragment fragment2 = (Fragment)object3;
            if(hashMap1.get(fragment2.mWho) == null) {
                if(FragmentManager.isLoggingEnabled(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment2 + " that was not found in the set of active Fragments " + e10.a);
                }
                this.O.f(fragment2);
                fragment2.mFragmentManager = this;
                k1 k11 = new k1(n00, l10, fragment2);
                k11.e = 1;
                k11.k();
                fragment2.mRemoving = true;
                k11.k();
            }
        }
        ArrayList arrayList0 = e10.b;
        l10.a.clear();
        if(arrayList0 != null) {
            for(Object object4: arrayList0) {
                String s2 = (String)object4;
                Fragment fragment3 = l10.b(s2);
                if(fragment3 == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + s2 + ")");
                }
                if(FragmentManager.isLoggingEnabled(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + s2 + "): " + fragment3);
                }
                l10.a(fragment3);
            }
        }
        if(e10.c == null) {
            this.d = null;
        }
        else {
            this.d = new ArrayList(e10.c.length);
            for(int v1 = 0; true; ++v1) {
                c[] arr_c = e10.c;
                if(v1 >= arr_c.length) {
                    break;
                }
                c c0 = arr_c[v1];
                c0.getClass();
                a a0 = new a(this);
                c0.a(a0);
                a0.v = c0.g;
                for(int v2 = 0; true; ++v2) {
                    ArrayList arrayList1 = c0.b;
                    if(v2 >= arrayList1.size()) {
                        break;
                    }
                    String s3 = (String)arrayList1.get(v2);
                    if(s3 != null) {
                        p1 p10 = (p1)a0.c.get(v2);
                        p10.b = l10.b(s3);
                    }
                }
                a0.d(1);
                if(FragmentManager.isLoggingEnabled(2)) {
                    StringBuilder stringBuilder0 = b.s(v1, "restoreAllState: back stack #", " (index ");
                    stringBuilder0.append(a0.v);
                    stringBuilder0.append("): ");
                    stringBuilder0.append(a0);
                    Log.v("FragmentManager", stringBuilder0.toString());
                    PrintWriter printWriter0 = new PrintWriter(new a2());
                    a0.f("  ", printWriter0, false);
                    printWriter0.close();
                }
                this.d.add(a0);
            }
        }
        this.i.set(e10.d);
        String s4 = e10.e;
        if(s4 != null) {
            Fragment fragment4 = l10.b(s4);
            this.y = fragment4;
            this.q(fragment4);
        }
        ArrayList arrayList2 = e10.f;
        if(arrayList2 != null) {
            for(int v = 0; v < arrayList2.size(); ++v) {
                String s5 = (String)arrayList2.get(v);
                d d0 = (d)e10.g.get(v);
                this.j.put(s5, d0);
            }
        }
        this.F = new ArrayDeque(e10.h);
    }

    public final Bundle Q() {
        c[] arr_c;
        ArrayList arrayList2;
        Bundle bundle0 = new Bundle();
        for(Object object0: this.e()) {
            ((SpecialEffectsController)object0).forcePostponedExecutePendingOperations();
        }
        for(Object object1: this.e()) {
            ((SpecialEffectsController)object1).forceCompleteAllOperations();
        }
        this.w(true);
        this.H = true;
        this.O.N0 = true;
        l1 l10 = this.c;
        l10.getClass();
        ArrayList arrayList0 = new ArrayList(l10.b.size());
        for(Object object2: l10.b.values()) {
            k1 k10 = (k1)object2;
            if(k10 != null) {
                Fragment fragment0 = k10.c;
                l10.i(fragment0.mWho, k10.n());
                arrayList0.add(fragment0.mWho);
                if(FragmentManager.isLoggingEnabled(2)) {
                    Log.v("FragmentManager", "Saved state of " + fragment0 + ": " + fragment0.mSavedFragmentState);
                }
            }
        }
        HashMap hashMap0 = this.c.c;
        if(!hashMap0.isEmpty()) {
            l1 l11 = this.c;
            synchronized(l11.a) {
                if(l11.a.isEmpty()) {
                    goto label_48;
                }
                else {
                    arrayList2 = new ArrayList(l11.a.size());
                    for(Object object3: l11.a) {
                        Fragment fragment1 = (Fragment)object3;
                        arrayList2.add(fragment1.mWho);
                        if(FragmentManager.isLoggingEnabled(2)) {
                            Log.v("FragmentManager", "saveAllState: adding fragment (" + fragment1.mWho + "): " + fragment1);
                        }
                    }
                }
            }
            goto label_54;
        label_48:
            arrayList2 = null;
        label_54:
            ArrayList arrayList3 = this.d;
            if(arrayList3 == null) {
                arr_c = null;
            }
            else {
                int v = arrayList3.size();
                if(v > 0) {
                    arr_c = new c[v];
                    for(int v1 = 0; v1 < v; ++v1) {
                        arr_c[v1] = new c(((a)this.d.get(v1)));
                        if(FragmentManager.isLoggingEnabled(2)) {
                            StringBuilder stringBuilder0 = b.s(v1, "saveAllState: adding back stack #", ": ");
                            stringBuilder0.append(this.d.get(v1));
                            Log.v("FragmentManager", stringBuilder0.toString());
                        }
                    }
                }
                else {
                    arr_c = null;
                }
            }
            e1 e10 = new e1();  // 初始化器: Ljava/lang/Object;-><init>()V
            e10.e = null;
            ArrayList arrayList4 = new ArrayList();
            e10.f = arrayList4;
            ArrayList arrayList5 = new ArrayList();
            e10.g = arrayList5;
            e10.a = arrayList0;
            e10.b = arrayList2;
            e10.c = arr_c;
            e10.d = this.i.get();
            Fragment fragment2 = this.y;
            if(fragment2 != null) {
                e10.e = fragment2.mWho;
            }
            arrayList4.addAll(this.j.keySet());
            arrayList5.addAll(this.j.values());
            e10.h = new ArrayList(this.F);
            bundle0.putParcelable("state", e10);
            for(Object object4: this.k.keySet()) {
                bundle0.putBundle(androidx.room.a.j("result_", ((String)object4)), ((Bundle)this.k.get(((String)object4))));
            }
            for(Object object5: hashMap0.keySet()) {
                bundle0.putBundle(androidx.room.a.j("fragment_", ((String)object5)), ((Bundle)hashMap0.get(((String)object5))));
            }
        }
        else if(FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle0;
        }
        return bundle0;
    }

    public final void R() {
        synchronized(this.a) {
            if(this.a.size() == 1) {
                this.v.getHandler().removeCallbacks(this.Q);
                this.v.getHandler().post(this.Q);
                this.Y();
            }
        }
    }

    public final void S(Fragment fragment0, boolean z) {
        ViewGroup viewGroup0 = this.B(fragment0);
        if(viewGroup0 != null && viewGroup0 instanceof FragmentContainerView) {
            ((FragmentContainerView)viewGroup0).setDrawDisappearingViewsLast(!z);
        }
    }

    public final void T(Fragment fragment0, State lifecycle$State0) {
        if(!fragment0.equals(this.c.b(fragment0.mWho)) || fragment0.mHost != null && fragment0.mFragmentManager != this) {
            throw new IllegalArgumentException("Fragment " + fragment0 + " is not an active fragment of FragmentManager " + this);
        }
        fragment0.mMaxState = lifecycle$State0;
    }

    public final void U(Fragment fragment0) {
        if(fragment0 != null && (!fragment0.equals(this.c.b(fragment0.mWho)) || fragment0.mHost != null && fragment0.mFragmentManager != this)) {
            throw new IllegalArgumentException("Fragment " + fragment0 + " is not an active fragment of FragmentManager " + this);
        }
        Fragment fragment1 = this.y;
        this.y = fragment0;
        this.q(fragment1);
        this.q(this.y);
    }

    public final void V(Fragment fragment0) {
        ViewGroup viewGroup0 = this.B(fragment0);
        if(viewGroup0 != null && fragment0.getPopExitAnim() + (fragment0.getPopEnterAnim() + (fragment0.getExitAnim() + fragment0.getEnterAnim())) > 0) {
            if(viewGroup0.getTag(id.visible_removing_fragment_view_tag) == null) {
                viewGroup0.setTag(id.visible_removing_fragment_view_tag, fragment0);
            }
            ((Fragment)viewGroup0.getTag(id.visible_removing_fragment_view_tag)).setPopDirection(fragment0.getPopDirection());
        }
    }

    public static void W(Fragment fragment0) {
        if(FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "show: " + fragment0);
        }
        if(fragment0.mHidden) {
            fragment0.mHidden = false;
            fragment0.mHiddenChanged = !fragment0.mHiddenChanged;
        }
    }

    public final void X(RuntimeException runtimeException0) {
        Log.e("FragmentManager", runtimeException0.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter0 = new PrintWriter(new a2());
        FragmentHostCallback fragmentHostCallback0 = this.v;
        if(fragmentHostCallback0 == null) {
            try {
                this.dump("  ", null, printWriter0, new String[0]);
            }
            catch(Exception exception1) {
                Log.e("FragmentManager", "Failed dumping state", exception1);
            }
        }
        else {
            try {
                fragmentHostCallback0.onDump("  ", null, printWriter0, new String[0]);
            }
            catch(Exception exception0) {
                Log.e("FragmentManager", "Failed dumping state", exception0);
            }
        }
        throw runtimeException0;
    }

    public final void Y() {
        boolean z = true;
        synchronized(this.a) {
            if(!this.a.isEmpty()) {
                this.h.setEnabled(true);
                return;
            }
        }
        q0 q00 = this.h;
        if(this.getBackStackEntryCount() <= 0 || !FragmentManager.G(this.x)) {
            z = false;
        }
        q00.setEnabled(z);
    }

    public final k1 a(Fragment fragment0) {
        String s = fragment0.mPreviousWho;
        if(s != null) {
            FragmentStrictMode.onFragmentReuse(fragment0, s);
        }
        if(FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "add: " + fragment0);
        }
        k1 k10 = this.f(fragment0);
        fragment0.mFragmentManager = this;
        l1 l10 = this.c;
        l10.g(k10);
        if(!fragment0.mDetached) {
            l10.a(fragment0);
            fragment0.mRemoving = false;
            if(fragment0.mView == null) {
                fragment0.mHiddenChanged = false;
            }
            if(FragmentManager.E(fragment0)) {
                this.G = true;
            }
        }
        return k10;
    }

    public void addFragmentOnAttachListener(@NonNull FragmentOnAttachListener fragmentOnAttachListener0) {
        this.o.add(fragmentOnAttachListener0);
    }

    public void addOnBackStackChangedListener(@NonNull OnBackStackChangedListener fragmentManager$OnBackStackChangedListener0) {
        if(this.m == null) {
            this.m = new ArrayList();
        }
        this.m.add(fragmentManager$OnBackStackChangedListener0);
    }

    public final void b(FragmentHostCallback fragmentHostCallback0, FragmentContainer fragmentContainer0, Fragment fragment0) {
        if(this.v != null) {
            throw new IllegalStateException("Already attached");
        }
        this.v = fragmentHostCallback0;
        this.w = fragmentContainer0;
        this.x = fragment0;
        if(fragment0 != null) {
            this.addFragmentOnAttachListener(new v0(fragment0));
        }
        else if(fragmentHostCallback0 instanceof FragmentOnAttachListener) {
            this.addFragmentOnAttachListener(((FragmentOnAttachListener)fragmentHostCallback0));
        }
        if(this.x != null) {
            this.Y();
        }
        if(fragmentHostCallback0 instanceof OnBackPressedDispatcherOwner) {
            OnBackPressedDispatcherOwner onBackPressedDispatcherOwner0 = (OnBackPressedDispatcherOwner)fragmentHostCallback0;
            OnBackPressedDispatcher onBackPressedDispatcher0 = onBackPressedDispatcherOwner0.getOnBackPressedDispatcher();
            this.g = onBackPressedDispatcher0;
            if(fragment0 != null) {
                onBackPressedDispatcherOwner0 = fragment0;
            }
            onBackPressedDispatcher0.addCallback(onBackPressedDispatcherOwner0, this.h);
        }
        if(fragment0 != null) {
            g1 g10 = fragment0.mFragmentManager.O;
            HashMap hashMap0 = g10.I0;
            g1 g11 = (g1)hashMap0.get(fragment0.mWho);
            if(g11 == null) {
                g11 = new g1(g10.K0);
                hashMap0.put(fragment0.mWho, g11);
            }
            this.O = g11;
        }
        else if(fragmentHostCallback0 instanceof ViewModelStoreOwner) {
            this.O = (g1)new ViewModelProvider(((ViewModelStoreOwner)fragmentHostCallback0).getViewModelStore(), g1.O0).get(g1.class);
        }
        else {
            this.O = new g1(false);
        }
        this.O.N0 = this.isStateSaved();
        this.c.d = this.O;
        FragmentHostCallback fragmentHostCallback1 = this.v;
        if(fragmentHostCallback1 instanceof SavedStateRegistryOwner && fragment0 == null) {
            SavedStateRegistry savedStateRegistry0 = ((SavedStateRegistryOwner)fragmentHostCallback1).getSavedStateRegistry();
            savedStateRegistry0.registerSavedStateProvider("android:support:fragments", new c0(this, 1));
            Bundle bundle0 = savedStateRegistry0.consumeRestoredStateForKey("android:support:fragments");
            if(bundle0 != null) {
                this.P(bundle0);
            }
        }
        FragmentHostCallback fragmentHostCallback2 = this.v;
        if(fragmentHostCallback2 instanceof ActivityResultRegistryOwner) {
            ActivityResultRegistry activityResultRegistry0 = ((ActivityResultRegistryOwner)fragmentHostCallback2).getActivityResultRegistry();
            String s = fragment0 == null ? "" : r0.a.o(new StringBuilder(), fragment0.mWho, ":");
            this.C = activityResultRegistry0.register("FragmentManager:" + s + "StartActivityForResult", new StartActivityForResult(), new p0(this, 1));
            this.D = activityResultRegistry0.register("FragmentManager:" + s + "StartIntentSenderForResult", new x0(), new p0(this, 2));  // 初始化器: Landroidx/activity/result/contract/ActivityResultContract;-><init>()V
            this.E = activityResultRegistry0.register("FragmentManager:" + s + "RequestPermissions", new RequestMultiplePermissions(), new p0(this, 0));
        }
        FragmentHostCallback fragmentHostCallback3 = this.v;
        if(fragmentHostCallback3 instanceof OnConfigurationChangedProvider) {
            ((OnConfigurationChangedProvider)fragmentHostCallback3).addOnConfigurationChangedListener(this.p);
        }
        FragmentHostCallback fragmentHostCallback4 = this.v;
        if(fragmentHostCallback4 instanceof OnTrimMemoryProvider) {
            ((OnTrimMemoryProvider)fragmentHostCallback4).addOnTrimMemoryListener(this.q);
        }
        FragmentHostCallback fragmentHostCallback5 = this.v;
        if(fragmentHostCallback5 instanceof OnMultiWindowModeChangedProvider) {
            ((OnMultiWindowModeChangedProvider)fragmentHostCallback5).addOnMultiWindowModeChangedListener(this.r);
        }
        FragmentHostCallback fragmentHostCallback6 = this.v;
        if(fragmentHostCallback6 instanceof OnPictureInPictureModeChangedProvider) {
            ((OnPictureInPictureModeChangedProvider)fragmentHostCallback6).addOnPictureInPictureModeChangedListener(this.s);
        }
        FragmentHostCallback fragmentHostCallback7 = this.v;
        if(fragmentHostCallback7 instanceof MenuHost && fragment0 == null) {
            ((MenuHost)fragmentHostCallback7).addMenuProvider(this.t);
        }
    }

    @NonNull
    public FragmentTransaction beginTransaction() {
        return new a(this);
    }

    public final void c(Fragment fragment0) {
        if(FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "attach: " + fragment0);
        }
        if(fragment0.mDetached) {
            fragment0.mDetached = false;
            if(!fragment0.mAdded) {
                this.c.a(fragment0);
                if(FragmentManager.isLoggingEnabled(2)) {
                    Log.v("FragmentManager", "add from attach: " + fragment0);
                }
                if(FragmentManager.E(fragment0)) {
                    this.G = true;
                }
            }
        }
    }

    public void clearBackStack(@NonNull String s) {
        this.u(new w0(this, s), false);
    }

    @Override  // androidx.fragment.app.FragmentResultOwner
    public final void clearFragmentResult(@NonNull String s) {
        this.k.remove(s);
        if(FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "Clearing fragment result with key " + s);
        }
    }

    @Override  // androidx.fragment.app.FragmentResultOwner
    public final void clearFragmentResultListener(@NonNull String s) {
        z0 z00 = (z0)this.l.remove(s);
        if(z00 != null) {
            z00.a.removeObserver(z00.c);
        }
        if(FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "Clearing FragmentResultListener for key " + s);
        }
    }

    public final void d() {
        this.b = false;
        this.M.clear();
        this.L.clear();
    }

    public void dump(@NonNull String s, @Nullable FileDescriptor fileDescriptor0, @NonNull PrintWriter printWriter0, @Nullable String[] arr_s) {
        l1 l10 = this.c;
        l10.getClass();
        HashMap hashMap0 = l10.b;
        if(!hashMap0.isEmpty()) {
            printWriter0.print(s);
            printWriter0.println("Active Fragments:");
            for(Object object0: hashMap0.values()) {
                k1 k10 = (k1)object0;
                printWriter0.print(s);
                if(k10 == null) {
                    printWriter0.println("null");
                }
                else {
                    printWriter0.println(k10.c);
                    k10.c.dump(s + "    ", fileDescriptor0, printWriter0, arr_s);
                }
            }
        }
        ArrayList arrayList0 = l10.a;
        int v = arrayList0.size();
        if(v > 0) {
            printWriter0.print(s);
            printWriter0.println("Added Fragments:");
            for(int v2 = 0; v2 < v; ++v2) {
                Fragment fragment0 = (Fragment)arrayList0.get(v2);
                printWriter0.print(s);
                printWriter0.print("  #");
                printWriter0.print(v2);
                printWriter0.print(": ");
                printWriter0.println("Fragment{69f08161} (6d15cb58-eaa6-4206-b45d-98afbbf72397)");
            }
        }
        ArrayList arrayList1 = this.e;
        if(arrayList1 != null) {
            int v3 = arrayList1.size();
            if(v3 > 0) {
                printWriter0.print(s);
                printWriter0.println("Fragments Created Menus:");
                for(int v4 = 0; v4 < v3; ++v4) {
                    Fragment fragment1 = (Fragment)this.e.get(v4);
                    printWriter0.print(s);
                    printWriter0.print("  #");
                    printWriter0.print(v4);
                    printWriter0.print(": ");
                    printWriter0.println("Fragment{69f08161} (6d15cb58-eaa6-4206-b45d-98afbbf72397)");
                }
            }
        }
        ArrayList arrayList2 = this.d;
        if(arrayList2 != null) {
            int v5 = arrayList2.size();
            if(v5 > 0) {
                printWriter0.print(s);
                printWriter0.println("Back Stack:");
                for(int v6 = 0; v6 < v5; ++v6) {
                    a a0 = (a)this.d.get(v6);
                    printWriter0.print(s);
                    printWriter0.print("  #");
                    printWriter0.print(v6);
                    printWriter0.print(": ");
                    printWriter0.println(a0.toString());
                    a0.f(s + "    ", printWriter0, true);
                }
            }
        }
        printWriter0.print(s);
        printWriter0.println("Back Stack Index: " + this.i.get());
        synchronized(this.a) {
            int v8 = this.a.size();
            if(v8 > 0) {
                printWriter0.print(s);
                printWriter0.println("Pending Actions:");
                for(int v1 = 0; v1 < v8; ++v1) {
                    OpGenerator fragmentManager$OpGenerator0 = (OpGenerator)this.a.get(v1);
                    printWriter0.print(s);
                    printWriter0.print("  #");
                    printWriter0.print(v1);
                    printWriter0.print(": ");
                    printWriter0.println(fragmentManager$OpGenerator0);
                }
            }
        }
        printWriter0.print(s);
        printWriter0.println("FragmentManager misc state:");
        printWriter0.print(s);
        printWriter0.print("  mHost=");
        printWriter0.println(this.v);
        printWriter0.print(s);
        printWriter0.print("  mContainer=");
        printWriter0.println(this.w);
        if(this.x != null) {
            printWriter0.print(s);
            printWriter0.print("  mParent=");
            printWriter0.println(this.x);
        }
        printWriter0.print(s);
        printWriter0.print("  mCurState=");
        printWriter0.print(this.u);
        printWriter0.print(" mStateSaved=");
        printWriter0.print(this.H);
        printWriter0.print(" mStopped=");
        printWriter0.print(this.I);
        printWriter0.print(" mDestroyed=");
        printWriter0.println(this.J);
        if(this.G) {
            printWriter0.print(s);
            printWriter0.print("  mNeedMenuInvalidate=");
            printWriter0.println(this.G);
        }
    }

    public final HashSet e() {
        HashSet hashSet0 = new HashSet();
        for(Object object0: this.c.d()) {
            ViewGroup viewGroup0 = ((k1)object0).c.mContainer;
            if(viewGroup0 != null) {
                hashSet0.add(SpecialEffectsController.getOrCreateController(viewGroup0, this.C()));
            }
        }
        return hashSet0;
    }

    @Deprecated
    public static void enableDebugLogging(boolean z) {
        FragmentManager.R = z;
    }

    @MainThread
    public boolean executePendingTransactions() {
        boolean z = this.w(true);
        for(Object object0: this.e()) {
            ((SpecialEffectsController)object0).forcePostponedExecutePendingOperations();
        }
        return z;
    }

    public final k1 f(Fragment fragment0) {
        l1 l10 = this.c;
        k1 k10 = (k1)l10.b.get(fragment0.mWho);
        if(k10 != null) {
            return k10;
        }
        k1 k11 = new k1(this.n, l10, fragment0);
        k11.l(this.v.b.getClassLoader());
        k11.e = this.u;
        return k11;
    }

    @NonNull
    public static Fragment findFragment(@NonNull View view0) {
        Fragment fragment0 = FragmentManager.A(view0);
        if(fragment0 == null) {
            throw new IllegalStateException("View " + view0 + " does not have a Fragment set");
        }
        return fragment0;
    }

    @Nullable
    public Fragment findFragmentById(@IdRes int v) {
        Fragment fragment0;
        l1 l10 = this.c;
        ArrayList arrayList0 = l10.a;
        int v1 = arrayList0.size() - 1;
        while(v1 >= 0) {
            fragment0 = (Fragment)arrayList0.get(v1);
            if(fragment0 == null || fragment0.mFragmentId != v) {
                --v1;
                continue;
            }
            return fragment0;
        }
        for(Object object0: l10.b.values()) {
            k1 k10 = (k1)object0;
            if(k10 != null) {
                fragment0 = k10.c;
                if(fragment0.mFragmentId == v) {
                    return fragment0;
                }
                if(false) {
                    break;
                }
            }
        }
        return null;
    }

    @Nullable
    public Fragment findFragmentByTag(@Nullable String s) {
        Fragment fragment0;
        l1 l10 = this.c;
        if(s != null) {
            ArrayList arrayList0 = l10.a;
            int v = arrayList0.size() - 1;
            while(v >= 0) {
                fragment0 = (Fragment)arrayList0.get(v);
                if(fragment0 == null || !s.equals(fragment0.mTag)) {
                    --v;
                    continue;
                }
                return fragment0;
            }
        }
        if(s == null) {
            l10.getClass();
        }
        else {
            for(Object object0: l10.b.values()) {
                k1 k10 = (k1)object0;
                if(k10 == null) {
                    continue;
                }
                fragment0 = k10.c;
                if(!s.equals(fragment0.mTag)) {
                    continue;
                }
                return fragment0;
            }
        }
        return null;
    }

    public final void g(Fragment fragment0) {
        if(FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "detach: " + fragment0);
        }
        if(!fragment0.mDetached) {
            fragment0.mDetached = true;
            if(fragment0.mAdded) {
                if(FragmentManager.isLoggingEnabled(2)) {
                    Log.v("FragmentManager", "remove from detach: " + fragment0);
                }
                synchronized(this.c.a) {
                    this.c.a.remove(fragment0);
                }
                fragment0.mAdded = false;
                if(FragmentManager.E(fragment0)) {
                    this.G = true;
                }
                this.V(fragment0);
            }
        }
    }

    @NonNull
    public BackStackEntry getBackStackEntryAt(int v) {
        return (BackStackEntry)this.d.get(v);
    }

    public int getBackStackEntryCount() {
        return this.d == null ? 0 : this.d.size();
    }

    @Nullable
    public Fragment getFragment(@NonNull Bundle bundle0, @NonNull String s) {
        String s1 = bundle0.getString(s);
        if(s1 == null) {
            return null;
        }
        Fragment fragment0 = this.c.b(s1);
        if(fragment0 != null) {
            return fragment0;
        }
        this.X(new IllegalStateException("Fragment no longer exists for key " + s + ": unique id " + s1));
        throw null;
    }

    @NonNull
    public FragmentFactory getFragmentFactory() {
        FragmentFactory fragmentFactory0 = this.z;
        if(fragmentFactory0 != null) {
            return fragmentFactory0;
        }
        Fragment fragment0 = this.x;
        return fragment0 != null ? fragment0.mFragmentManager.getFragmentFactory() : this.A;
    }

    @NonNull
    public List getFragments() {
        return this.c.f();
    }

    @NonNull
    @RestrictTo({Scope.LIBRARY})
    public FragmentHostCallback getHost() {
        return this.v;
    }

    @Nullable
    public Fragment getPrimaryNavigationFragment() {
        return this.y;
    }

    @Nullable
    public Policy getStrictModePolicy() {
        return this.P;
    }

    public final void h(boolean z, Configuration configuration0) {
        if(z && this.v instanceof OnConfigurationChangedProvider) {
            this.X(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for(Object object0: this.c.f()) {
            Fragment fragment0 = (Fragment)object0;
            if(fragment0 != null) {
                fragment0.performConfigurationChanged(configuration0);
                if(z) {
                    fragment0.mChildFragmentManager.h(true, configuration0);
                }
            }
        }
    }

    public final boolean i(MenuItem menuItem0) {
        if(this.u < 1) {
            return false;
        }
        for(Object object0: this.c.f()) {
            if(((Fragment)object0) != null && ((Fragment)object0).performContextItemSelected(menuItem0)) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    public boolean isDestroyed() {
        return this.J;
    }

    // 去混淆评级： 低(20)
    @RestrictTo({Scope.LIBRARY})
    public static boolean isLoggingEnabled(int v) {
        return FragmentManager.R || Log.isLoggable("FragmentManager", v);
    }

    // 去混淆评级： 低(20)
    public boolean isStateSaved() {
        return this.H || this.I;
    }

    public final boolean j(Menu menu0, MenuInflater menuInflater0) {
        if(this.u < 1) {
            return false;
        }
        ArrayList arrayList0 = null;
        boolean z = false;
        for(Object object0: this.c.f()) {
            Fragment fragment0 = (Fragment)object0;
            if(fragment0 != null && fragment0.isMenuVisible() && fragment0.performCreateOptionsMenu(menu0, menuInflater0)) {
                if(arrayList0 == null) {
                    arrayList0 = new ArrayList();
                }
                arrayList0.add(fragment0);
                z = true;
            }
        }
        if(this.e != null) {
            for(int v = 0; v < this.e.size(); ++v) {
                boolean z1 = arrayList0 != null && arrayList0.contains(((Fragment)this.e.get(v)));
            }
        }
        this.e = arrayList0;
        return z;
    }

    public final void k() {
        boolean z = true;
        this.J = true;
        this.w(true);
        for(Object object0: this.e()) {
            ((SpecialEffectsController)object0).forceCompleteAllOperations();
        }
        FragmentHostCallback fragmentHostCallback0 = this.v;
        l1 l10 = this.c;
        if(fragmentHostCallback0 instanceof ViewModelStoreOwner) {
            z = l10.d.L0;
        }
        else {
            Context context0 = fragmentHostCallback0.b;
            if(context0 instanceof Activity) {
                z = true ^ ((Activity)context0).isChangingConfigurations();
            }
        }
        if(z) {
            for(Object object1: this.j.values()) {
                for(Object object2: ((d)object1).a) {
                    l10.d.c(((String)object2), false);
                }
            }
        }
        this.t(-1);
        FragmentHostCallback fragmentHostCallback1 = this.v;
        if(fragmentHostCallback1 instanceof OnTrimMemoryProvider) {
            ((OnTrimMemoryProvider)fragmentHostCallback1).removeOnTrimMemoryListener(this.q);
        }
        FragmentHostCallback fragmentHostCallback2 = this.v;
        if(fragmentHostCallback2 instanceof OnConfigurationChangedProvider) {
            ((OnConfigurationChangedProvider)fragmentHostCallback2).removeOnConfigurationChangedListener(this.p);
        }
        FragmentHostCallback fragmentHostCallback3 = this.v;
        if(fragmentHostCallback3 instanceof OnMultiWindowModeChangedProvider) {
            ((OnMultiWindowModeChangedProvider)fragmentHostCallback3).removeOnMultiWindowModeChangedListener(this.r);
        }
        FragmentHostCallback fragmentHostCallback4 = this.v;
        if(fragmentHostCallback4 instanceof OnPictureInPictureModeChangedProvider) {
            ((OnPictureInPictureModeChangedProvider)fragmentHostCallback4).removeOnPictureInPictureModeChangedListener(this.s);
        }
        FragmentHostCallback fragmentHostCallback5 = this.v;
        if(fragmentHostCallback5 instanceof MenuHost && this.x == null) {
            ((MenuHost)fragmentHostCallback5).removeMenuProvider(this.t);
        }
        this.v = null;
        this.w = null;
        this.x = null;
        if(this.g != null) {
            this.h.remove();
            this.g = null;
        }
        ActivityResultLauncher activityResultLauncher0 = this.C;
        if(activityResultLauncher0 != null) {
            activityResultLauncher0.unregister();
            this.D.unregister();
            this.E.unregister();
        }
    }

    public final void l(boolean z) {
        if(z && this.v instanceof OnTrimMemoryProvider) {
            this.X(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for(Object object0: this.c.f()) {
            Fragment fragment0 = (Fragment)object0;
            if(fragment0 != null) {
                fragment0.performLowMemory();
                if(z) {
                    fragment0.mChildFragmentManager.l(true);
                }
            }
        }
    }

    public final void m(boolean z, boolean z1) {
        if(z1 && this.v instanceof OnMultiWindowModeChangedProvider) {
            this.X(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for(Object object0: this.c.f()) {
            Fragment fragment0 = (Fragment)object0;
            if(fragment0 != null && z1) {
                fragment0.mChildFragmentManager.m(z, true);
            }
        }
    }

    public final void n() {
        for(Object object0: this.c.e()) {
            Fragment fragment0 = (Fragment)object0;
            if(fragment0 != null) {
                fragment0.onHiddenChanged(fragment0.isHidden());
                fragment0.mChildFragmentManager.n();
            }
        }
    }

    public final boolean o(MenuItem menuItem0) {
        if(this.u < 1) {
            return false;
        }
        for(Object object0: this.c.f()) {
            if(((Fragment)object0) != null && ((Fragment)object0).performOptionsItemSelected(menuItem0)) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    @NonNull
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public FragmentTransaction openTransaction() {
        return this.beginTransaction();
    }

    public final void p(Menu menu0) {
        if(this.u < 1) {
            return;
        }
        for(Object object0: this.c.f()) {
            Fragment fragment0 = (Fragment)object0;
            if(fragment0 != null) {
                fragment0.performOptionsMenuClosed(menu0);
            }
        }
    }

    public void popBackStack() {
        this.u(new a1(this, null, -1, 0), false);
    }

    public void popBackStack(int v, int v1) {
        this.J(v, v1, false);
    }

    public void popBackStack(@Nullable String s, int v) {
        this.u(new a1(this, s, -1, v), false);
    }

    @MainThread
    public boolean popBackStackImmediate() {
        return this.K(-1, 0, null);
    }

    public boolean popBackStackImmediate(int v, int v1) {
        if(v < 0) {
            throw new IllegalArgumentException("Bad id: " + v);
        }
        return this.K(v, v1, null);
    }

    @MainThread
    public boolean popBackStackImmediate(@Nullable String s, int v) {
        return this.K(-1, v, s);
    }

    public void putFragment(@NonNull Bundle bundle0, @NonNull String s, @NonNull Fragment fragment0) {
        if(fragment0.mFragmentManager == this) {
            bundle0.putString(s, fragment0.mWho);
            return;
        }
        this.X(new IllegalStateException("Fragment " + fragment0 + " is not currently in the FragmentManager"));
        throw null;
    }

    public final void q(Fragment fragment0) {
        if(fragment0 != null && fragment0.equals(this.c.b(fragment0.mWho))) {
            fragment0.performPrimaryNavigationFragmentChanged();
        }
    }

    public final void r(boolean z, boolean z1) {
        if(z1 && this.v instanceof OnPictureInPictureModeChangedProvider) {
            this.X(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for(Object object0: this.c.f()) {
            Fragment fragment0 = (Fragment)object0;
            if(fragment0 != null && z1) {
                fragment0.mChildFragmentManager.r(z, true);
            }
        }
    }

    public void registerFragmentLifecycleCallbacks(@NonNull FragmentLifecycleCallbacks fragmentManager$FragmentLifecycleCallbacks0, boolean z) {
        m0 m00 = new m0(fragmentManager$FragmentLifecycleCallbacks0, z);
        this.n.a.add(m00);
    }

    public void removeFragmentOnAttachListener(@NonNull FragmentOnAttachListener fragmentOnAttachListener0) {
        this.o.remove(fragmentOnAttachListener0);
    }

    public void removeOnBackStackChangedListener(@NonNull OnBackStackChangedListener fragmentManager$OnBackStackChangedListener0) {
        ArrayList arrayList0 = this.m;
        if(arrayList0 != null) {
            arrayList0.remove(fragmentManager$OnBackStackChangedListener0);
        }
    }

    public void restoreBackStack(@NonNull String s) {
        this.u((ArrayList arrayList0, ArrayList arrayList1) -> {
            d d0 = (d)this.j.remove(s);
            boolean z = false;
            if(d0 == null) {
                return false;
            }
            HashMap hashMap0 = new HashMap();
            for(Object object0: arrayList0) {
                a a0 = (a)object0;
                if(a0.w) {
                    for(Object object1: a0.c) {
                        Fragment fragment0 = ((p1)object1).b;
                        if(fragment0 != null) {
                            hashMap0.put(fragment0.mWho, fragment0);
                        }
                    }
                }
            }
            HashMap hashMap1 = new HashMap(d0.a.size());
            for(Object object2: d0.a) {
                String s1 = (String)object2;
                Fragment fragment1 = (Fragment)hashMap0.get(s1);
                if(fragment1 == null) {
                    Bundle bundle0 = this.c.i(s1, null);
                    if(bundle0 != null) {
                        ClassLoader classLoader0 = this.getHost().b.getClassLoader();
                        Fragment fragment2 = ((h1)bundle0.getParcelable("state")).a(this.getFragmentFactory(), classLoader0);
                        fragment2.mSavedFragmentState = bundle0;
                        if(bundle0.getBundle("savedInstanceState") == null) {
                            fragment2.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
                        }
                        Bundle bundle1 = bundle0.getBundle("arguments");
                        if(bundle1 != null) {
                            bundle1.setClassLoader(classLoader0);
                        }
                        fragment2.setArguments(bundle1);
                        hashMap1.put(fragment2.mWho, fragment2);
                    }
                }
                else {
                    hashMap1.put(fragment1.mWho, fragment1);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for(Object object3: d0.b) {
                c c0 = (c)object3;
                c0.getClass();
                a a1 = new a(this);
                c0.a(a1);
                for(int v = 0; true; ++v) {
                    ArrayList arrayList3 = c0.b;
                    if(v >= arrayList3.size()) {
                        break;
                    }
                    String s2 = (String)arrayList3.get(v);
                    if(s2 != null) {
                        Fragment fragment3 = (Fragment)hashMap1.get(s2);
                        if(fragment3 == null) {
                            throw new IllegalStateException(b.r(new StringBuilder("Restoring FragmentTransaction "), c0.f, " failed due to missing saved state for Fragment (", s2, ")"));
                        }
                        ((p1)a1.c.get(v)).b = fragment3;
                        continue;
                    }
                }
                arrayList2.add(a1);
            }
            for(Object object4: arrayList2) {
                ((a)object4).generateOps(arrayList0, arrayList1);
                z = true;
            }
            return z;
        }, false);
    }

    public final boolean s(Menu menu0) {
        boolean z = false;
        if(this.u < 1) {
            return false;
        }
        for(Object object0: this.c.f()) {
            Fragment fragment0 = (Fragment)object0;
            if(fragment0 != null && fragment0.isMenuVisible() && fragment0.performPrepareOptionsMenu(menu0)) {
                z = true;
            }
        }
        return z;
    }

    public void saveBackStack(@NonNull String s) {
        this.u(new c1(this, s), false);
    }

    @Nullable
    public SavedState saveFragmentInstanceState(@NonNull Fragment fragment0) {
        k1 k10 = (k1)this.c.b.get(fragment0.mWho);
        if(k10 != null) {
            Fragment fragment1 = k10.c;
            if(fragment1.equals(fragment0)) {
                return fragment1.mState <= -1 ? null : new SavedState(k10.n());
            }
        }
        this.X(new IllegalStateException("Fragment " + fragment0 + " is not currently in the FragmentManager"));
        throw null;
    }

    public void setFragmentFactory(@NonNull FragmentFactory fragmentFactory0) {
        this.z = fragmentFactory0;
    }

    @Override  // androidx.fragment.app.FragmentResultOwner
    public final void setFragmentResult(@NonNull String s, @NonNull Bundle bundle0) {
        z0 z00 = (z0)this.l.get(s);
        if(z00 == null || !z00.a.getCurrentState().isAtLeast(State.STARTED)) {
            this.k.put(s, bundle0);
        }
        else {
            z00.onFragmentResult(s, bundle0);
        }
        if(FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "Setting fragment result with key " + s + " and result " + bundle0);
        }
    }

    @Override  // androidx.fragment.app.FragmentResultOwner
    @SuppressLint({"SyntheticAccessor"})
    public final void setFragmentResultListener(@NonNull String s, @NonNull LifecycleOwner lifecycleOwner0, @NonNull FragmentResultListener fragmentResultListener0) {
        Lifecycle lifecycle0 = lifecycleOwner0.getLifecycle();
        if(lifecycle0.getCurrentState() == State.DESTROYED) {
            return;
        }
        u0 u00 = new u0(this, s, fragmentResultListener0, lifecycle0);
        z0 z00 = new z0(lifecycle0, fragmentResultListener0, u00);
        z0 z01 = (z0)this.l.put(s, z00);
        if(z01 != null) {
            z01.a.removeObserver(z01.c);
        }
        if(FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "Setting FragmentResultListener with key " + s + " lifecycleOwner " + lifecycle0 + " and listener " + fragmentResultListener0);
        }
        lifecycle0.addObserver(u00);
    }

    public void setStrictModePolicy(@Nullable Policy fragmentStrictMode$Policy0) {
        this.P = fragmentStrictMode$Policy0;
    }

    public final void t(int v) {
        try {
            this.b = true;
            for(Object object0: this.c.b.values()) {
                k1 k10 = (k1)object0;
                if(k10 != null) {
                    k10.e = v;
                }
            }
            this.H(v, false);
            for(Object object1: this.e()) {
                ((SpecialEffectsController)object1).forceCompleteAllOperations();
            }
        }
        finally {
            this.b = false;
        }
        this.w(true);
    }

    @Override
    @NonNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder(0x80);
        stringBuilder0.append("FragmentManager{");
        stringBuilder0.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder0.append(" in ");
        Fragment fragment0 = this.x;
        if(fragment0 == null) {
            FragmentHostCallback fragmentHostCallback0 = this.v;
            if(fragmentHostCallback0 == null) {
                stringBuilder0.append("null");
            }
            else {
                stringBuilder0.append(fragmentHostCallback0.getClass().getSimpleName());
                stringBuilder0.append("{");
                stringBuilder0.append(Integer.toHexString(System.identityHashCode(this.v)));
                stringBuilder0.append("}");
            }
        }
        else {
            stringBuilder0.append(fragment0.getClass().getSimpleName());
            stringBuilder0.append("{");
            stringBuilder0.append(Integer.toHexString(System.identityHashCode(this.x)));
            stringBuilder0.append("}");
        }
        stringBuilder0.append("}}");
        return stringBuilder0.toString();
    }

    public final void u(OpGenerator fragmentManager$OpGenerator0, boolean z) {
        if(!z) {
            if(this.v == null) {
                throw this.J ? new IllegalStateException("FragmentManager has been destroyed") : new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            if(this.isStateSaved()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized(this.a) {
            if(this.v == null) {
                if(!z) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
                return;
            }
            this.a.add(fragmentManager$OpGenerator0);
            this.R();
        }
    }

    public void unregisterFragmentLifecycleCallbacks(@NonNull FragmentLifecycleCallbacks fragmentManager$FragmentLifecycleCallbacks0) {
        n0 n00 = this.n;
        synchronized(n00.a) {
            int v1 = n00.a.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                if(((m0)n00.a.get(v2)).a == fragmentManager$FragmentLifecycleCallbacks0) {
                    n00.a.remove(v2);
                    break;
                }
            }
        }
    }

    public final void v(boolean z) {
        if(this.b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if(this.v == null) {
            throw this.J ? new IllegalStateException("FragmentManager has been destroyed") : new IllegalStateException("FragmentManager has not been attached to a host.");
        }
        if(Looper.myLooper() != this.v.getHandler().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if(!z && this.isStateSaved()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if(this.L == null) {
            this.L = new ArrayList();
            this.M = new ArrayList();
        }
    }

    public final boolean w(boolean z) {
        boolean z2;
        this.v(z);
        boolean z1;
        for(z1 = false; true; z1 = true) {
            ArrayList arrayList0 = this.L;
            ArrayList arrayList1 = this.M;
            ArrayList arrayList2 = this.a;
            __monitor_enter(arrayList2);
            int v = FIN.finallyOpen$NT();
            if(this.a.isEmpty()) {
                FIN.finallyExec$NT(v);
                z2 = false;
            }
            else {
                try {
                    int v1 = this.a.size();
                    z2 = false;
                    for(int v2 = 0; v2 < v1; ++v2) {
                        z2 |= ((OpGenerator)this.a.get(v2)).generateOps(arrayList0, arrayList1);
                    }
                }
                catch(Throwable throwable0) {
                    this.a.clear();
                    this.v.getHandler().removeCallbacks(this.Q);
                    FIN.finallyExec$NT(v);
                    throw throwable0;
                }
                this.a.clear();
                this.v.getHandler().removeCallbacks(this.Q);
                FIN.finallyCodeBegin$NT(v);
                __monitor_exit(arrayList2);
                FIN.finallyCodeEnd$NT(v);
            }
            if(!z2) {
                break;
            }
            try {
                this.b = true;
                this.N(this.L, this.M);
            }
            finally {
                this.d();
            }
        }
        this.Y();
        if(this.K) {
            this.K = false;
            for(Object object0: this.c.d()) {
                k1 k10 = (k1)object0;
                Fragment fragment0 = k10.c;
                if(!fragment0.mDeferStart) {
                }
                else if(this.b) {
                    this.K = true;
                }
                else {
                    fragment0.mDeferStart = false;
                    k10.k();
                }
            }
        }
        this.c.b.values().removeAll(Collections.singleton(null));
        return z1;
    }

    public final void x(a a0, boolean z) {
        if(z && (this.v == null || this.J)) {
            return;
        }
        this.v(z);
        a0.generateOps(this.L, this.M);
        this.b = true;
        try {
            this.N(this.L, this.M);
        }
        finally {
            this.d();
        }
        this.Y();
        l1 l10 = this.c;
        if(this.K) {
            this.K = false;
            for(Object object0: l10.d()) {
                k1 k10 = (k1)object0;
                Fragment fragment0 = k10.c;
                if(!fragment0.mDeferStart) {
                }
                else if(this.b) {
                    this.K = true;
                }
                else {
                    fragment0.mDeferStart = false;
                    k10.k();
                }
            }
        }
        l10.b.values().removeAll(Collections.singleton(null));
    }

    public final void y(ArrayList arrayList0, ArrayList arrayList1, int v, int v1) {
        ArrayList arrayList9;
        l1 l14;
        l1 l12;
        l1 l11;
        int v7;
        boolean z = ((a)arrayList0.get(v)).r;
        ArrayList arrayList2 = this.N;
        if(arrayList2 == null) {
            this.N = new ArrayList();
        }
        else {
            arrayList2.clear();
        }
        l1 l10 = this.c;
        this.N.addAll(l10.f());
        Fragment fragment0 = this.getPrimaryNavigationFragment();
        int v2 = v;
        boolean z1 = false;
        while(v2 < v1) {
            a a0 = (a)arrayList0.get(v2);
            if(((Boolean)arrayList1.get(v2)).booleanValue()) {
                l12 = l10;
                ArrayList arrayList5 = this.N;
                ArrayList arrayList6 = a0.c;
                for(int v8 = arrayList6.size() - 1; v8 >= 0; --v8) {
                    p1 p12 = (p1)arrayList6.get(v8);
                    switch(p12.a) {
                        case 3: 
                        case 6: {
                            arrayList5.add(p12.b);
                            break;
                        }
                        case 1: 
                        case 7: {
                            arrayList5.remove(p12.b);
                            break;
                        }
                        case 8: {
                            fragment0 = null;
                            break;
                        }
                        case 9: {
                            fragment0 = p12.b;
                            break;
                        }
                        case 10: {
                            p12.i = p12.h;
                        }
                    }
                }
            }
            else {
                ArrayList arrayList3 = this.N;
                int v3 = 0;
                while(true) {
                    ArrayList arrayList4 = a0.c;
                    if(v3 >= arrayList4.size()) {
                        break;
                    }
                    p1 p10 = (p1)arrayList4.get(v3);
                    int v4 = p10.a;
                    if(v4 == 1) {
                        l11 = l10;
                    }
                    else {
                        switch(v4) {
                            case 2: {
                                Fragment fragment2 = p10.b;
                                int v5 = fragment2.mContainerId;
                                int v6 = arrayList3.size() - 1;
                                boolean z2 = false;
                                while(v6 >= 0) {
                                    Fragment fragment3 = (Fragment)arrayList3.get(v6);
                                    if(fragment3.mContainerId != v5) {
                                        v7 = v5;
                                    }
                                    else if(fragment3 == fragment2) {
                                        v7 = v5;
                                        z2 = true;
                                    }
                                    else {
                                        if(fragment3 == fragment0) {
                                            v7 = v5;
                                            arrayList4.add(v3, new p1(fragment3, 9, 0));
                                            ++v3;
                                            fragment0 = null;
                                        }
                                        else {
                                            v7 = v5;
                                        }
                                        p1 p11 = new p1(fragment3, 3, 0);
                                        p11.d = p10.d;
                                        p11.f = p10.f;
                                        p11.e = p10.e;
                                        p11.g = p10.g;
                                        arrayList4.add(v3, p11);
                                        arrayList3.remove(fragment3);
                                        ++v3;
                                    }
                                    --v6;
                                    v5 = v7;
                                }
                                l11 = l10;
                                if(z2) {
                                    arrayList4.remove(v3);
                                    --v3;
                                }
                                else {
                                    p10.a = 1;
                                    p10.c = true;
                                    arrayList3.add(fragment2);
                                }
                                goto label_82;
                            }
                            case 3: 
                            case 6: {
                                arrayList3.remove(p10.b);
                                Fragment fragment1 = p10.b;
                                if(fragment1 == fragment0) {
                                    arrayList4.add(v3, new p1(9, fragment1));
                                    ++v3;
                                    l11 = l10;
                                    fragment0 = null;
                                    goto label_82;
                                }
                                l11 = l10;
                                goto label_82;
                            }
                            case 7: {
                                l11 = l10;
                                break;
                            }
                            case 8: {
                                arrayList4.add(v3, new p1(fragment0, 9, 0));
                                p10.c = true;
                                ++v3;
                                fragment0 = p10.b;
                                l11 = l10;
                                goto label_82;
                            }
                            default: {
                                l11 = l10;
                                goto label_82;
                            }
                        }
                    }
                    arrayList3.add(p10.b);
                label_82:
                    ++v3;
                    l10 = l11;
                }
                l12 = l10;
            }
            z1 = z1 || a0.i;
            ++v2;
            l10 = l12;
        }
        l1 l13 = l10;
        this.N.clear();
        if(!z && this.u >= 1) {
            for(int v9 = v; v9 < v1; ++v9) {
                for(Object object0: ((a)arrayList0.get(v9)).c) {
                    Fragment fragment4 = ((p1)object0).b;
                    if(fragment4 == null || fragment4.mFragmentManager == null) {
                        l14 = l13;
                    }
                    else {
                        l14 = l13;
                        l14.g(this.f(fragment4));
                    }
                    l13 = l14;
                }
            }
        }
        int v10 = v;
        while(v10 < v1) {
            a a1 = (a)arrayList0.get(v10);
            if(((Boolean)arrayList1.get(v10)).booleanValue()) {
                a1.d(-1);
                ArrayList arrayList7 = a1.c;
                for(int v11 = arrayList7.size() - 1; v11 >= 0; --v11) {
                    p1 p13 = (p1)arrayList7.get(v11);
                    Fragment fragment5 = p13.b;
                    if(fragment5 != null) {
                        fragment5.mBeingSaved = a1.w;
                        fragment5.setPopDirection(true);
                        int v12 = a1.h;
                        int v13 = 0x2002;
                        switch(v12) {
                            case 0x1001: {
                                fragment5.setNextTransition(v13);
                                fragment5.setSharedElementNames(a1.q, a1.p);
                                break;
                            }
                            case 0x2002: {
                                fragment5.setNextTransition(0x1001);
                                fragment5.setSharedElementNames(a1.q, a1.p);
                                break;
                            }
                            default: {
                                v13 = 4100;
                                switch(v12) {
                                    case 0x1003: {
                                        v13 = 0x1003;
                                        fragment5.setNextTransition(v13);
                                        fragment5.setSharedElementNames(a1.q, a1.p);
                                        break;
                                    }
                                    case 4100: {
                                        v13 = 0x2005;
                                        fragment5.setNextTransition(v13);
                                        fragment5.setSharedElementNames(a1.q, a1.p);
                                        break;
                                    }
                                    case 0x2005: {
                                        fragment5.setNextTransition(v13);
                                        fragment5.setSharedElementNames(a1.q, a1.p);
                                        break;
                                    }
                                    default: {
                                        v13 = 0;
                                        fragment5.setNextTransition(v13);
                                        fragment5.setSharedElementNames(a1.q, a1.p);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    FragmentManager fragmentManager0 = a1.t;
                    switch(p13.a) {
                        case 1: {
                            fragment5.setAnimations(p13.d, p13.e, p13.f, p13.g);
                            fragmentManager0.S(fragment5, true);
                            fragmentManager0.M(fragment5);
                            break;
                        }
                        case 3: {
                            fragment5.setAnimations(p13.d, p13.e, p13.f, p13.g);
                            fragmentManager0.a(fragment5);
                            break;
                        }
                        case 4: {
                            fragment5.setAnimations(p13.d, p13.e, p13.f, p13.g);
                            fragmentManager0.getClass();
                            FragmentManager.W(fragment5);
                            break;
                        }
                        case 5: {
                            fragment5.setAnimations(p13.d, p13.e, p13.f, p13.g);
                            fragmentManager0.S(fragment5, true);
                            fragmentManager0.D(fragment5);
                            break;
                        }
                        case 6: {
                            fragment5.setAnimations(p13.d, p13.e, p13.f, p13.g);
                            fragmentManager0.c(fragment5);
                            break;
                        }
                        case 7: {
                            fragment5.setAnimations(p13.d, p13.e, p13.f, p13.g);
                            fragmentManager0.S(fragment5, true);
                            fragmentManager0.g(fragment5);
                            break;
                        }
                        case 8: {
                            fragmentManager0.U(null);
                            break;
                        }
                        case 9: {
                            fragmentManager0.U(fragment5);
                            break;
                        }
                        case 10: {
                            fragmentManager0.T(fragment5, p13.h);
                            break;
                        }
                        default: {
                            throw new IllegalArgumentException("Unknown cmd: " + p13.a);
                        }
                    }
                }
            }
            else {
                a1.d(1);
                ArrayList arrayList8 = a1.c;
                int v14 = arrayList8.size();
                int v15 = 0;
                while(v15 < v14) {
                    p1 p14 = (p1)arrayList8.get(v15);
                    Fragment fragment6 = p14.b;
                    if(fragment6 != null) {
                        fragment6.mBeingSaved = a1.w;
                        fragment6.setPopDirection(false);
                        fragment6.setNextTransition(a1.h);
                        fragment6.setSharedElementNames(a1.p, a1.q);
                    }
                    FragmentManager fragmentManager1 = a1.t;
                    switch(p14.a) {
                        case 1: {
                            arrayList9 = arrayList8;
                            fragment6.setAnimations(p14.d, p14.e, p14.f, p14.g);
                            fragmentManager1.S(fragment6, false);
                            fragmentManager1.a(fragment6);
                            ++v15;
                            arrayList8 = arrayList9;
                            continue;
                        }
                        case 3: {
                            arrayList9 = arrayList8;
                            fragment6.setAnimations(p14.d, p14.e, p14.f, p14.g);
                            fragmentManager1.M(fragment6);
                            ++v15;
                            arrayList8 = arrayList9;
                            continue;
                        }
                        case 4: {
                            arrayList9 = arrayList8;
                            fragment6.setAnimations(p14.d, p14.e, p14.f, p14.g);
                            fragmentManager1.D(fragment6);
                            ++v15;
                            arrayList8 = arrayList9;
                            continue;
                        }
                        case 5: {
                            arrayList9 = arrayList8;
                            fragment6.setAnimations(p14.d, p14.e, p14.f, p14.g);
                            fragmentManager1.S(fragment6, false);
                            FragmentManager.W(fragment6);
                            ++v15;
                            arrayList8 = arrayList9;
                            continue;
                        }
                        case 6: {
                            arrayList9 = arrayList8;
                            fragment6.setAnimations(p14.d, p14.e, p14.f, p14.g);
                            fragmentManager1.g(fragment6);
                            ++v15;
                            arrayList8 = arrayList9;
                            continue;
                        }
                        case 7: {
                            arrayList9 = arrayList8;
                            fragment6.setAnimations(p14.d, p14.e, p14.f, p14.g);
                            fragmentManager1.S(fragment6, false);
                            fragmentManager1.c(fragment6);
                            ++v15;
                            arrayList8 = arrayList9;
                            continue;
                        }
                        case 8: {
                            fragmentManager1.U(fragment6);
                            ++v15;
                            continue;
                        }
                        case 9: {
                            fragmentManager1.U(null);
                            ++v15;
                            continue;
                        }
                        case 10: {
                            break;
                        }
                        default: {
                            throw new IllegalArgumentException("Unknown cmd: " + p14.a);
                        }
                    }
                    fragmentManager1.T(fragment6, p14.i);
                    ++v15;
                }
            }
            ++v10;
        }
        boolean z3 = ((Boolean)arrayList1.get(v1 - 1)).booleanValue();
        if(z1 && (this.m != null && !this.m.isEmpty())) {
            LinkedHashSet linkedHashSet0 = new LinkedHashSet();
            for(Object object1: arrayList0) {
                a a2 = (a)object1;
                HashSet hashSet0 = new HashSet();
                for(int v16 = 0; v16 < a2.c.size(); ++v16) {
                    Fragment fragment7 = ((p1)a2.c.get(v16)).b;
                    if(fragment7 != null && a2.i) {
                        hashSet0.add(fragment7);
                    }
                }
                linkedHashSet0.addAll(hashSet0);
            }
            for(Object object2: this.m) {
                OnBackStackChangedListener fragmentManager$OnBackStackChangedListener0 = (OnBackStackChangedListener)object2;
                for(Object object3: linkedHashSet0) {
                    fragmentManager$OnBackStackChangedListener0.onBackStackChangeStarted(((Fragment)object3), z3);
                }
            }
            for(Object object4: this.m) {
                OnBackStackChangedListener fragmentManager$OnBackStackChangedListener1 = (OnBackStackChangedListener)object4;
                for(Object object5: linkedHashSet0) {
                    fragmentManager$OnBackStackChangedListener1.onBackStackChangeCommitted(((Fragment)object5), z3);
                }
            }
        }
        for(int v17 = v; v17 < v1; ++v17) {
            a a3 = (a)arrayList0.get(v17);
            if(z3) {
                for(int v18 = a3.c.size() - 1; v18 >= 0; --v18) {
                    Fragment fragment8 = ((p1)a3.c.get(v18)).b;
                    if(fragment8 != null) {
                        this.f(fragment8).k();
                    }
                }
            }
            else {
                for(Object object6: a3.c) {
                    Fragment fragment9 = ((p1)object6).b;
                    if(fragment9 != null) {
                        this.f(fragment9).k();
                    }
                }
            }
        }
        this.H(this.u, true);
        HashSet hashSet1 = new HashSet();
        for(int v19 = v; v19 < v1; ++v19) {
            for(Object object7: ((a)arrayList0.get(v19)).c) {
                Fragment fragment10 = ((p1)object7).b;
                if(fragment10 != null) {
                    ViewGroup viewGroup0 = fragment10.mContainer;
                    if(viewGroup0 != null) {
                        hashSet1.add(SpecialEffectsController.getOrCreateController(viewGroup0, this));
                    }
                }
            }
        }
        for(Object object8: hashSet1) {
            ((SpecialEffectsController)object8).updateOperationDirection(z3);
            ((SpecialEffectsController)object8).markPostponedState();
            ((SpecialEffectsController)object8).executePendingOperations();
        }
        for(int v20 = v; v20 < v1; ++v20) {
            a a4 = (a)arrayList0.get(v20);
            if(((Boolean)arrayList1.get(v20)).booleanValue() && a4.v >= 0) {
                a4.v = -1;
            }
            if(a4.s != null) {
                for(int v21 = 0; v21 < a4.s.size(); ++v21) {
                    ((Runnable)a4.s.get(v21)).run();
                }
                a4.s = null;
            }
        }
        if(z1 && this.m != null) {
            for(int v22 = 0; v22 < this.m.size(); ++v22) {
                ((OnBackStackChangedListener)this.m.get(v22)).onBackStackChanged();
            }
        }
    }

    public final int z(String s, int v, boolean z) {
        if(this.d != null && !this.d.isEmpty()) {
            if(s == null && v < 0) {
                return z ? 0 : this.d.size() - 1;
            }
            int v1;
            for(v1 = this.d.size() - 1; v1 >= 0; --v1) {
                a a0 = (a)this.d.get(v1);
                if(s != null && s.equals(a0.k) || v >= 0 && v == a0.v) {
                    break;
                }
            }
            if(v1 < 0) {
                return v1;
            }
            if(z) {
                while(v1 > 0) {
                    a a1 = (a)this.d.get(v1 - 1);
                    if((s == null || !s.equals(a1.k)) && (v < 0 || v != a1.v)) {
                        break;
                    }
                    --v1;
                }
                return v1;
            }
            return v1 == this.d.size() - 1 ? -1 : v1 + 1;
        }
        return -1;
    }
}

