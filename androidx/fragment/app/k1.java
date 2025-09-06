package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.ViewCompat;
import androidx.fragment.R.id;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.lifecycle.ViewModelStoreOwner;
import java.util.ArrayList;
import r0.a;

public final class k1 {
    public final n0 a;
    public final l1 b;
    public final Fragment c;
    public boolean d;
    public int e;

    public k1(n0 n00, l1 l10, Fragment fragment0) {
        this.d = false;
        this.e = -1;
        this.a = n00;
        this.b = l10;
        this.c = fragment0;
    }

    public k1(n0 n00, l1 l10, Fragment fragment0, Bundle bundle0) {
        this.d = false;
        this.e = -1;
        this.a = n00;
        this.b = l10;
        this.c = fragment0;
        fragment0.mSavedViewState = null;
        fragment0.mSavedViewRegistryState = null;
        fragment0.mBackStackNesting = 0;
        fragment0.mInLayout = false;
        fragment0.mAdded = false;
        fragment0.mTargetWho = fragment0.mTarget == null ? null : fragment0.mTarget.mWho;
        fragment0.mTarget = null;
        fragment0.mSavedFragmentState = bundle0;
        fragment0.mArguments = bundle0.getBundle("arguments");
    }

    public k1(n0 n00, l1 l10, ClassLoader classLoader0, FragmentFactory fragmentFactory0, Bundle bundle0) {
        this.d = false;
        this.e = -1;
        this.a = n00;
        this.b = l10;
        Fragment fragment0 = ((h1)bundle0.getParcelable("state")).a(fragmentFactory0, classLoader0);
        this.c = fragment0;
        fragment0.mSavedFragmentState = bundle0;
        Bundle bundle1 = bundle0.getBundle("arguments");
        if(bundle1 != null) {
            bundle1.setClassLoader(classLoader0);
        }
        fragment0.setArguments(bundle1);
        if(FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + fragment0);
        }
    }

    public final void a() {
        boolean z = FragmentManager.isLoggingEnabled(3);
        Fragment fragment0 = this.c;
        if(z) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + fragment0);
        }
        Bundle bundle0 = fragment0.mSavedFragmentState == null ? null : fragment0.mSavedFragmentState.getBundle("savedInstanceState");
        fragment0.performActivityCreated(bundle0);
        this.a.a(fragment0, bundle0, false);
    }

    public final void b() {
        Fragment fragment0 = this.c;
        Fragment fragment1 = FragmentManager.A(fragment0.mContainer);
        if(fragment1 != null && !fragment1.equals(fragment0.getParentFragment())) {
            FragmentStrictMode.onWrongNestedHierarchy(fragment0, fragment1, fragment0.mContainerId);
        }
        l1 l10 = this.b;
        l10.getClass();
        ViewGroup viewGroup0 = fragment0.mContainer;
        int v = -1;
        if(viewGroup0 != null) {
            ArrayList arrayList0 = l10.a;
            int v1 = arrayList0.indexOf(fragment0);
            int v2 = v1 - 1;
        alab1:
            while(true) {
                if(v2 >= 0) {
                    Fragment fragment2 = (Fragment)arrayList0.get(v2);
                    if(fragment2.mContainer == viewGroup0) {
                        View view0 = fragment2.mView;
                        if(view0 != null) {
                            v = viewGroup0.indexOfChild(view0) + 1;
                            break;
                        }
                    }
                    --v2;
                }
                else {
                    while(true) {
                        while(true) {
                            ++v1;
                            if(v1 >= arrayList0.size()) {
                                break alab1;
                            }
                            Fragment fragment3 = (Fragment)arrayList0.get(v1);
                            if(fragment3.mContainer != viewGroup0) {
                                break;
                            }
                            View view1 = fragment3.mView;
                            if(view1 == null) {
                                break;
                            }
                            v = viewGroup0.indexOfChild(view1);
                            break alab1;
                        }
                    }
                }
            }
        }
        fragment0.mContainer.addView(fragment0.mView, v);
    }

    public final void c() {
        boolean z = FragmentManager.isLoggingEnabled(3);
        Fragment fragment0 = this.c;
        if(z) {
            Log.d("FragmentManager", "moveto ATTACHED: " + fragment0);
        }
        Fragment fragment1 = fragment0.mTarget;
        k1 k10 = null;
        l1 l10 = this.b;
        if(fragment1 == null) {
            String s = fragment0.mTargetWho;
            if(s != null) {
                k10 = (k1)l10.b.get(s);
                if(k10 == null) {
                    StringBuilder stringBuilder0 = new StringBuilder("Fragment ");
                    stringBuilder0.append(fragment0);
                    stringBuilder0.append(" declared target fragment ");
                    throw new IllegalStateException(a.o(stringBuilder0, fragment0.mTargetWho, " that does not belong to this FragmentManager!"));
                }
            }
        }
        else {
            k1 k11 = (k1)l10.b.get(fragment1.mWho);
            if(k11 == null) {
                throw new IllegalStateException("Fragment " + fragment0 + " declared target fragment " + fragment0.mTarget + " that does not belong to this FragmentManager!");
            }
            fragment0.mTargetWho = fragment0.mTarget.mWho;
            fragment0.mTarget = null;
            k10 = k11;
        }
        if(k10 != null) {
            k10.k();
        }
        fragment0.mHost = fragment0.mFragmentManager.getHost();
        fragment0.mParentFragment = fragment0.mFragmentManager.x;
        this.a.g(fragment0, false);
        fragment0.performAttach();
        this.a.b(fragment0, false);
    }

    public final int d() {
        Fragment fragment0 = this.c;
        if(fragment0.mFragmentManager == null) {
            return fragment0.mState;
        }
        int v = this.e;
        switch(j1.a[fragment0.mMaxState.ordinal()]) {
            case 1: {
                break;
            }
            case 2: {
                v = Math.min(v, 5);
                break;
            }
            case 3: {
                v = Math.min(v, 1);
                break;
            }
            case 4: {
                v = Math.min(v, 0);
                break;
            }
            default: {
                v = Math.min(v, -1);
            }
        }
        if(fragment0.mFromLayout) {
            if(fragment0.mInLayout) {
                v = Math.max(this.e, 2);
                if(fragment0.mView != null && fragment0.mView.getParent() == null) {
                    v = Math.min(v, 2);
                }
            }
            else {
                v = this.e >= 4 ? Math.min(v, 1) : Math.min(v, fragment0.mState);
            }
        }
        if(!fragment0.mAdded) {
            v = Math.min(v, 1);
        }
        LifecycleImpact specialEffectsController$Operation$LifecycleImpact0 = fragment0.mContainer == null ? null : SpecialEffectsController.getOrCreateController(fragment0.mContainer, fragment0.getParentFragmentManager()).getAwaitingCompletionLifecycleImpact(this);
        if(specialEffectsController$Operation$LifecycleImpact0 == LifecycleImpact.ADDING) {
            v = Math.min(v, 6);
        }
        else if(specialEffectsController$Operation$LifecycleImpact0 == LifecycleImpact.REMOVING) {
            v = Math.max(v, 3);
        }
        else if(fragment0.mRemoving) {
            v = fragment0.isInBackStack() ? Math.min(v, 1) : Math.min(v, -1);
        }
        if(fragment0.mDeferStart && fragment0.mState < 5) {
            v = Math.min(v, 4);
        }
        if(FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + v + " for " + fragment0);
        }
        return v;
    }

    public final void e() {
        boolean z = FragmentManager.isLoggingEnabled(3);
        Fragment fragment0 = this.c;
        if(z) {
            Log.d("FragmentManager", "moveto CREATED: " + fragment0);
        }
        Bundle bundle0 = fragment0.mSavedFragmentState == null ? null : fragment0.mSavedFragmentState.getBundle("savedInstanceState");
        if(!fragment0.mIsCreated) {
            this.a.h(fragment0, bundle0, false);
            fragment0.performCreate(bundle0);
            this.a.c(fragment0, bundle0, false);
            return;
        }
        fragment0.mState = 1;
        fragment0.restoreChildFragmentState();
    }

    public final void f() {
        String s;
        Fragment fragment0 = this.c;
        if(fragment0.mFromLayout) {
            return;
        }
        if(FragmentManager.isLoggingEnabled(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + fragment0);
        }
        ViewGroup viewGroup0 = null;
        Bundle bundle0 = fragment0.mSavedFragmentState == null ? null : fragment0.mSavedFragmentState.getBundle("savedInstanceState");
        LayoutInflater layoutInflater0 = fragment0.performGetLayoutInflater(bundle0);
        ViewGroup viewGroup1 = fragment0.mContainer;
        if(viewGroup1 == null) {
            int v = fragment0.mContainerId;
            switch(v) {
                case -1: {
                    throw new IllegalArgumentException("Cannot create fragment " + fragment0 + " for a container view with no id");
                label_16:
                    viewGroup0 = (ViewGroup)fragment0.mFragmentManager.w.onFindViewById(v);
                    if(viewGroup0 == null) {
                        if(!fragment0.mRestored) {
                            try {
                                s = "unknown";
                                s = fragment0.getResources().getResourceName(fragment0.mContainerId);
                            }
                            catch(Resources.NotFoundException unused_ex) {
                            }
                            throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(fragment0.mContainerId) + " (" + s + ") for fragment " + fragment0);
                        }
                    }
                    else if(!(viewGroup0 instanceof FragmentContainerView)) {
                        FragmentStrictMode.onWrongFragmentContainer(fragment0, viewGroup0);
                    }
                    break;
                }
                case 0: {
                    break;
                }
                default: {
                    goto label_16;
                }
            }
        }
        else {
            viewGroup0 = viewGroup1;
        }
        fragment0.mContainer = viewGroup0;
        fragment0.performCreateView(layoutInflater0, viewGroup0, bundle0);
        if(fragment0.mView != null) {
            if(FragmentManager.isLoggingEnabled(3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + fragment0);
            }
            fragment0.mView.setSaveFromParentEnabled(false);
            fragment0.mView.setTag(id.fragment_container_view_tag, fragment0);
            if(viewGroup0 != null) {
                this.b();
            }
            if(fragment0.mHidden) {
                fragment0.mView.setVisibility(8);
            }
            if(ViewCompat.isAttachedToWindow(fragment0.mView)) {
                ViewCompat.requestApplyInsets(fragment0.mView);
            }
            else {
                fragment0.mView.addOnAttachStateChangeListener(new i1(fragment0.mView));
            }
            fragment0.performViewCreated();
            this.a.m(fragment0, fragment0.mView, bundle0, false);
            int v1 = fragment0.mView.getVisibility();
            fragment0.setPostOnViewCreatedAlpha(fragment0.mView.getAlpha());
            if(fragment0.mContainer != null && v1 == 0) {
                View view0 = fragment0.mView.findFocus();
                if(view0 != null) {
                    fragment0.setFocusedView(view0);
                    if(FragmentManager.isLoggingEnabled(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + view0 + " for Fragment " + fragment0);
                    }
                }
                fragment0.mView.setAlpha(0.0f);
            }
        }
        fragment0.mState = 2;
    }

    public final void g() {
        boolean z3;
        boolean z = FragmentManager.isLoggingEnabled(3);
        Fragment fragment0 = this.c;
        if(z) {
            Log.d("FragmentManager", "movefrom CREATED: " + fragment0);
        }
        boolean z1 = true;
        boolean z2 = fragment0.mRemoving && !fragment0.isInBackStack();
        l1 l10 = this.b;
        if(z2 && !fragment0.mBeingSaved) {
            l10.i(fragment0.mWho, null);
        }
        if(!z2) {
            g1 g10 = l10.d;
            if(g10.H0.containsKey(fragment0.mWho)) {
                z3 = g10.K0 ? g10.L0 : !g10.M0;
            }
            else {
                z3 = true;
            }
            if(!z3) {
                String s = fragment0.mTargetWho;
                if(s != null) {
                    Fragment fragment1 = l10.b(s);
                    if(fragment1 != null && fragment1.mRetainInstance) {
                        fragment0.mTarget = fragment1;
                    }
                }
                fragment0.mState = 0;
                return;
            }
        }
        FragmentHostCallback fragmentHostCallback0 = fragment0.mHost;
        if(fragmentHostCallback0 instanceof ViewModelStoreOwner) {
            z1 = l10.d.L0;
        }
        else {
            Context context0 = fragmentHostCallback0.b;
            if(context0 instanceof Activity) {
                z1 = true ^ ((Activity)context0).isChangingConfigurations();
            }
        }
        if(z2 && !fragment0.mBeingSaved || z1) {
            l10.d.b(fragment0, false);
        }
        fragment0.performDestroy();
        this.a.d(fragment0, false);
        for(Object object0: l10.d()) {
            k1 k10 = (k1)object0;
            if(k10 != null) {
                Fragment fragment2 = k10.c;
                if(fragment0.mWho.equals(fragment2.mTargetWho)) {
                    fragment2.mTarget = fragment0;
                    fragment2.mTargetWho = null;
                }
            }
        }
        String s1 = fragment0.mTargetWho;
        if(s1 != null) {
            fragment0.mTarget = l10.b(s1);
        }
        l10.h(this);
    }

    public final void h() {
        boolean z = FragmentManager.isLoggingEnabled(3);
        Fragment fragment0 = this.c;
        if(z) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + fragment0);
        }
        ViewGroup viewGroup0 = fragment0.mContainer;
        if(viewGroup0 != null) {
            View view0 = fragment0.mView;
            if(view0 != null) {
                viewGroup0.removeView(view0);
            }
        }
        fragment0.performDestroyView();
        this.a.n(fragment0, false);
        fragment0.mContainer = null;
        fragment0.mView = null;
        fragment0.mViewLifecycleOwner = null;
        fragment0.mViewLifecycleOwnerLiveData.setValue(null);
        fragment0.mInLayout = false;
    }

    public final void i() {
        boolean z = FragmentManager.isLoggingEnabled(3);
        Fragment fragment0 = this.c;
        if(z) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + fragment0);
        }
        fragment0.performDetach();
        this.a.e(fragment0, false);
        fragment0.mState = -1;
        fragment0.mHost = null;
        fragment0.mParentFragment = null;
        fragment0.mFragmentManager = null;
        if(fragment0.mRemoving && !fragment0.isInBackStack()) {
        label_19:
            if(FragmentManager.isLoggingEnabled(3)) {
                Log.d("FragmentManager", "initState called for fragment: " + fragment0);
            }
            fragment0.initState();
        }
        else {
            g1 g10 = this.b.d;
            boolean z1 = true;
            if(g10.H0.containsKey(fragment0.mWho)) {
                z1 = g10.K0 ? g10.L0 : true ^ g10.M0;
            }
            if(z1) {
                goto label_19;
            }
        }
    }

    public final void j() {
        Fragment fragment0 = this.c;
        if(fragment0.mFromLayout && fragment0.mInLayout && !fragment0.mPerformedCreateView) {
            if(FragmentManager.isLoggingEnabled(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + fragment0);
            }
            Bundle bundle0 = fragment0.mSavedFragmentState == null ? null : fragment0.mSavedFragmentState.getBundle("savedInstanceState");
            fragment0.performCreateView(fragment0.performGetLayoutInflater(bundle0), null, bundle0);
            View view0 = fragment0.mView;
            if(view0 != null) {
                view0.setSaveFromParentEnabled(false);
                fragment0.mView.setTag(id.fragment_container_view_tag, fragment0);
                if(fragment0.mHidden) {
                    fragment0.mView.setVisibility(8);
                }
                fragment0.performViewCreated();
                this.a.m(fragment0, fragment0.mView, bundle0, false);
                fragment0.mState = 2;
            }
        }
    }

    public final void k() {
        l1 l10;
        Fragment fragment0 = this.c;
        if(this.d) {
            if(FragmentManager.isLoggingEnabled(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + fragment0);
            }
            return;
        }
        try {
            this.d = true;
            boolean z;
            for(z = false; true; z = true) {
                int v1 = this.d();
                int v2 = fragment0.mState;
                l10 = this.b;
                if(v1 == v2) {
                    break;
                }
                n0 n00 = this.a;
                if(v1 > v2) {
                    switch(v2 + 1) {
                        case 0: {
                            this.c();
                            break;
                        }
                        case 1: {
                            this.e();
                            break;
                        }
                        case 2: {
                            this.j();
                            this.f();
                            break;
                        }
                        case 3: {
                            this.a();
                            break;
                        }
                        case 4: {
                            if(fragment0.mView != null) {
                                ViewGroup viewGroup0 = fragment0.mContainer;
                                if(viewGroup0 != null) {
                                    SpecialEffectsController.getOrCreateController(viewGroup0, fragment0.getParentFragmentManager()).enqueueAdd(State.from(fragment0.mView.getVisibility()), this);
                                }
                            }
                            fragment0.mState = 4;
                            break;
                        }
                        case 5: {
                            if(FragmentManager.isLoggingEnabled(3)) {
                                Log.d("FragmentManager", "moveto STARTED: " + fragment0);
                            }
                            fragment0.performStart();
                            n00.k(fragment0, false);
                            break;
                        }
                        case 6: {
                            fragment0.mState = 6;
                            break;
                        }
                        case 7: {
                            this.m();
                        }
                    }
                }
                else {
                    switch(v2 - 1) {
                        case -1: {
                            this.i();
                            break;
                        }
                        case 0: {
                            if(fragment0.mBeingSaved && ((Bundle)l10.c.get(fragment0.mWho)) == null) {
                                l10.i(fragment0.mWho, this.n());
                            }
                            this.g();
                            break;
                        }
                        case 1: {
                            this.h();
                            fragment0.mState = 1;
                            break;
                        }
                        case 2: {
                            fragment0.mInLayout = false;
                            fragment0.mState = 2;
                            break;
                        }
                        case 3: {
                            if(FragmentManager.isLoggingEnabled(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + fragment0);
                            }
                            if(fragment0.mBeingSaved) {
                                l10.i(fragment0.mWho, this.n());
                            }
                            else if(fragment0.mView != null && fragment0.mSavedViewState == null) {
                                this.o();
                            }
                            if(fragment0.mView != null) {
                                ViewGroup viewGroup1 = fragment0.mContainer;
                                if(viewGroup1 != null) {
                                    SpecialEffectsController.getOrCreateController(viewGroup1, fragment0.getParentFragmentManager()).enqueueRemove(this);
                                }
                            }
                            fragment0.mState = 3;
                            break;
                        }
                        case 4: {
                            if(FragmentManager.isLoggingEnabled(3)) {
                                Log.d("FragmentManager", "movefrom STARTED: " + fragment0);
                            }
                            fragment0.performStop();
                            n00.l(fragment0, false);
                            break;
                        }
                        case 5: {
                            fragment0.mState = 5;
                            break;
                        }
                        case 6: {
                            if(FragmentManager.isLoggingEnabled(3)) {
                                Log.d("FragmentManager", "movefrom RESUMED: " + fragment0);
                            }
                            fragment0.performPause();
                            n00.f(fragment0, false);
                        }
                    }
                }
            }
            if(!z && v2 == -1 && fragment0.mRemoving && !fragment0.isInBackStack() && !fragment0.mBeingSaved) {
                if(FragmentManager.isLoggingEnabled(3)) {
                    Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + fragment0);
                }
                l10.d.b(fragment0, true);
                l10.h(this);
                if(FragmentManager.isLoggingEnabled(3)) {
                    Log.d("FragmentManager", "initState called for fragment: " + fragment0);
                }
                fragment0.initState();
            }
            if(fragment0.mHiddenChanged) {
                if(fragment0.mView != null) {
                    ViewGroup viewGroup2 = fragment0.mContainer;
                    if(viewGroup2 != null) {
                        SpecialEffectsController specialEffectsController0 = SpecialEffectsController.getOrCreateController(viewGroup2, fragment0.getParentFragmentManager());
                        if(fragment0.mHidden) {
                            specialEffectsController0.enqueueHide(this);
                        }
                        else {
                            specialEffectsController0.enqueueShow(this);
                        }
                    }
                }
                FragmentManager fragmentManager0 = fragment0.mFragmentManager;
                if(fragmentManager0 != null && fragment0.mAdded && FragmentManager.E(fragment0)) {
                    fragmentManager0.G = true;
                }
                fragment0.mHiddenChanged = false;
                fragment0.mChildFragmentManager.n();
            }
        }
        finally {
            this.d = false;
        }
    }

    public final void l(ClassLoader classLoader0) {
        Fragment fragment0 = this.c;
        Bundle bundle0 = fragment0.mSavedFragmentState;
        if(bundle0 == null) {
            return;
        }
        bundle0.setClassLoader(classLoader0);
        if(fragment0.mSavedFragmentState.getBundle("savedInstanceState") == null) {
            fragment0.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
        }
        fragment0.mSavedViewState = fragment0.mSavedFragmentState.getSparseParcelableArray("viewState");
        fragment0.mSavedViewRegistryState = fragment0.mSavedFragmentState.getBundle("viewRegistryState");
        h1 h10 = (h1)fragment0.mSavedFragmentState.getParcelable("state");
        if(h10 != null) {
            fragment0.mTargetWho = h10.l;
            fragment0.mTargetRequestCode = h10.m;
            Boolean boolean0 = fragment0.mSavedUserVisibleHint;
            if(boolean0 == null) {
                fragment0.mUserVisibleHint = h10.n;
            }
            else {
                fragment0.mUserVisibleHint = boolean0.booleanValue();
                fragment0.mSavedUserVisibleHint = null;
            }
        }
        if(!fragment0.mUserVisibleHint) {
            fragment0.mDeferStart = true;
        }
    }

    public final void m() {
        boolean z = FragmentManager.isLoggingEnabled(3);
        Fragment fragment0 = this.c;
        if(z) {
            Log.d("FragmentManager", "moveto RESUMED: " + fragment0);
        }
        View view0 = fragment0.getFocusedView();
        if(view0 != null) {
            if(view0 != fragment0.mView) {
                ViewParent viewParent0 = view0.getParent();
                while(viewParent0 != null) {
                    if(viewParent0 == fragment0.mView) {
                        goto label_13;
                    }
                    viewParent0 = viewParent0.getParent();
                }
                goto label_16;
            }
        label_13:
            boolean z1 = view0.requestFocus();
            if(FragmentManager.isLoggingEnabled(2)) {
                Log.v("FragmentManager", "requestFocus: Restoring focused view " + view0 + " " + (z1 ? "succeeded" : "failed") + " on Fragment " + fragment0 + " resulting in focused view " + fragment0.mView.findFocus());
            }
        }
    label_16:
        fragment0.setFocusedView(null);
        fragment0.performResume();
        this.a.i(fragment0, false);
        this.b.i(fragment0.mWho, null);
        fragment0.mSavedFragmentState = null;
        fragment0.mSavedViewState = null;
        fragment0.mSavedViewRegistryState = null;
    }

    public final Bundle n() {
        Bundle bundle0 = new Bundle();
        Fragment fragment0 = this.c;
        if(fragment0.mState == -1) {
            Bundle bundle1 = fragment0.mSavedFragmentState;
            if(bundle1 != null) {
                bundle0.putAll(bundle1);
            }
        }
        bundle0.putParcelable("state", new h1(fragment0));
        if(fragment0.mState > -1) {
            Bundle bundle2 = new Bundle();
            fragment0.performSaveInstanceState(bundle2);
            if(!bundle2.isEmpty()) {
                bundle0.putBundle("savedInstanceState", bundle2);
            }
            this.a.j(fragment0, bundle2, false);
            Bundle bundle3 = new Bundle();
            fragment0.mSavedStateRegistryController.performSave(bundle3);
            if(!bundle3.isEmpty()) {
                bundle0.putBundle("registryState", bundle3);
            }
            Bundle bundle4 = fragment0.mChildFragmentManager.Q();
            if(!bundle4.isEmpty()) {
                bundle0.putBundle("childFragmentManager", bundle4);
            }
            if(fragment0.mView != null) {
                this.o();
            }
            SparseArray sparseArray0 = fragment0.mSavedViewState;
            if(sparseArray0 != null) {
                bundle0.putSparseParcelableArray("viewState", sparseArray0);
            }
            Bundle bundle5 = fragment0.mSavedViewRegistryState;
            if(bundle5 != null) {
                bundle0.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = fragment0.mArguments;
        if(bundle6 != null) {
            bundle0.putBundle("arguments", bundle6);
        }
        return bundle0;
    }

    public final void o() {
        Fragment fragment0 = this.c;
        if(fragment0.mView == null) {
            return;
        }
        if(FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + fragment0 + " with view " + fragment0.mView);
        }
        SparseArray sparseArray0 = new SparseArray();
        fragment0.mView.saveHierarchyState(sparseArray0);
        if(sparseArray0.size() > 0) {
            fragment0.mSavedViewState = sparseArray0;
        }
        Bundle bundle0 = new Bundle();
        fragment0.mViewLifecycleOwner.f.performSave(bundle0);
        if(!bundle0.isEmpty()) {
            fragment0.mSavedViewRegistryState = bundle0;
        }
    }
}

