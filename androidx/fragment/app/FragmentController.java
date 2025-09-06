package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.SimpleArrayMap;
import androidx.core.util.Preconditions;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.loader.app.LoaderManager;
import androidx.savedstate.SavedStateRegistryOwner;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class FragmentController {
    public final FragmentHostCallback a;

    public FragmentController(FragmentHostCallback fragmentHostCallback0) {
        this.a = fragmentHostCallback0;
    }

    public void attachHost(@Nullable Fragment fragment0) {
        this.a.e.b(this.a, this.a, fragment0);
    }

    @NonNull
    public static FragmentController createController(@NonNull FragmentHostCallback fragmentHostCallback0) {
        return new FragmentController(((FragmentHostCallback)Preconditions.checkNotNull(fragmentHostCallback0, "callbacks == null")));
    }

    public void dispatchActivityCreated() {
        this.a.e.H = false;
        this.a.e.I = false;
        this.a.e.O.N0 = false;
        this.a.e.t(4);
    }

    @Deprecated
    public void dispatchConfigurationChanged(@NonNull Configuration configuration0) {
        this.a.e.h(true, configuration0);
    }

    public boolean dispatchContextItemSelected(@NonNull MenuItem menuItem0) {
        return this.a.e.i(menuItem0);
    }

    public void dispatchCreate() {
        this.a.e.H = false;
        this.a.e.I = false;
        this.a.e.O.N0 = false;
        this.a.e.t(1);
    }

    @Deprecated
    public boolean dispatchCreateOptionsMenu(@NonNull Menu menu0, @NonNull MenuInflater menuInflater0) {
        return this.a.e.j(menu0, menuInflater0);
    }

    public void dispatchDestroy() {
        this.a.e.k();
    }

    public void dispatchDestroyView() {
        this.a.e.t(1);
    }

    @Deprecated
    public void dispatchLowMemory() {
        this.a.e.l(true);
    }

    @Deprecated
    public void dispatchMultiWindowModeChanged(boolean z) {
        this.a.e.m(z, true);
    }

    @Deprecated
    public boolean dispatchOptionsItemSelected(@NonNull MenuItem menuItem0) {
        return this.a.e.o(menuItem0);
    }

    @Deprecated
    public void dispatchOptionsMenuClosed(@NonNull Menu menu0) {
        this.a.e.p(menu0);
    }

    public void dispatchPause() {
        this.a.e.t(5);
    }

    @Deprecated
    public void dispatchPictureInPictureModeChanged(boolean z) {
        this.a.e.r(z, true);
    }

    @Deprecated
    public boolean dispatchPrepareOptionsMenu(@NonNull Menu menu0) {
        return this.a.e.s(menu0);
    }

    @Deprecated
    public void dispatchReallyStop() {
    }

    public void dispatchResume() {
        this.a.e.H = false;
        this.a.e.I = false;
        this.a.e.O.N0 = false;
        this.a.e.t(7);
    }

    public void dispatchStart() {
        this.a.e.H = false;
        this.a.e.I = false;
        this.a.e.O.N0 = false;
        this.a.e.t(5);
    }

    public void dispatchStop() {
        this.a.e.I = true;
        this.a.e.O.N0 = true;
        this.a.e.t(4);
    }

    @Deprecated
    public void doLoaderDestroy() {
    }

    @Deprecated
    public void doLoaderRetain() {
    }

    @Deprecated
    public void doLoaderStart() {
    }

    @Deprecated
    public void doLoaderStop(boolean z) {
    }

    @Deprecated
    public void dumpLoaders(@NonNull String s, @Nullable FileDescriptor fileDescriptor0, @NonNull PrintWriter printWriter0, @Nullable String[] arr_s) {
    }

    public boolean execPendingActions() {
        return this.a.e.w(true);
    }

    @Nullable
    public Fragment findFragmentByWho(@NonNull String s) {
        return this.a.e.c.c(s);
    }

    @NonNull
    public List getActiveFragments(@SuppressLint({"UnknownNullness"}) List list0) {
        return this.a.e.c.e();
    }

    public int getActiveFragmentsCount() {
        return this.a.e.c.b.size();
    }

    @NonNull
    public FragmentManager getSupportFragmentManager() {
        return this.a.e;
    }

    @SuppressLint({"UnknownNullness"})
    @Deprecated
    public LoaderManager getSupportLoaderManager() {
        throw new UnsupportedOperationException("Loaders are managed separately from FragmentController, use LoaderManager.getInstance() to obtain a LoaderManager.");
    }

    public void noteStateNotSaved() {
        this.a.e.I();
    }

    @Nullable
    public View onCreateView(@Nullable View view0, @NonNull String s, @NonNull Context context0, @NonNull AttributeSet attributeSet0) {
        return this.a.e.f.onCreateView(view0, s, context0, attributeSet0);
    }

    @Deprecated
    public void reportLoaderStart() {
    }

    @Deprecated
    public void restoreAllState(@Nullable Parcelable parcelable0, @Nullable FragmentManagerNonConfig fragmentManagerNonConfig0) {
        d1 d10 = this.a.e;
        if(!(d10.v instanceof ViewModelStoreOwner)) {
            d10.O.g(fragmentManagerNonConfig0);
            d10.P(parcelable0);
            return;
        }
        d10.X(new IllegalStateException("You must use restoreSaveState when your FragmentHostCallback implements ViewModelStoreOwner"));
        throw null;
    }

    @Deprecated
    public void restoreAllState(@Nullable Parcelable parcelable0, @Nullable List list0) {
        d1 d10 = this.a.e;
        FragmentManagerNonConfig fragmentManagerNonConfig0 = new FragmentManagerNonConfig(list0, null, null);
        if(!(d10.v instanceof ViewModelStoreOwner)) {
            d10.O.g(fragmentManagerNonConfig0);
            d10.P(parcelable0);
            return;
        }
        d10.X(new IllegalStateException("You must use restoreSaveState when your FragmentHostCallback implements ViewModelStoreOwner"));
        throw null;
    }

    @Deprecated
    public void restoreLoaderNonConfig(@SuppressLint({"UnknownNullness"}) SimpleArrayMap simpleArrayMap0) {
    }

    @Deprecated
    public void restoreSaveState(@Nullable Parcelable parcelable0) {
        FragmentHostCallback fragmentHostCallback0 = this.a;
        if(!(fragmentHostCallback0 instanceof ViewModelStoreOwner)) {
            throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you\'re still using retainNestedNonConfig().");
        }
        d1 d10 = fragmentHostCallback0.e;
        if(!(d10.v instanceof SavedStateRegistryOwner)) {
            d10.P(parcelable0);
            return;
        }
        d10.X(new IllegalStateException("You cannot use restoreSaveState when your FragmentHostCallback implements SavedStateRegistryOwner."));
        throw null;
    }

    @Nullable
    @Deprecated
    public SimpleArrayMap retainLoaderNonConfig() {
        return null;
    }

    @Nullable
    @Deprecated
    public FragmentManagerNonConfig retainNestedNonConfig() {
        d1 d10 = this.a.e;
        if(!(d10.v instanceof ViewModelStoreOwner)) {
            return d10.O.e();
        }
        d10.X(new IllegalStateException("You cannot use retainNonConfig when your FragmentHostCallback implements ViewModelStoreOwner."));
        throw null;
    }

    @Nullable
    @Deprecated
    public List retainNonConfig() {
        d1 d10 = this.a.e;
        if(!(d10.v instanceof ViewModelStoreOwner)) {
            FragmentManagerNonConfig fragmentManagerNonConfig0 = d10.O.e();
            if(fragmentManagerNonConfig0 != null) {
                List list0 = fragmentManagerNonConfig0.a;
                if(list0 != null) {
                    return new ArrayList(list0);
                }
            }
            return null;
        }
        d10.X(new IllegalStateException("You cannot use retainNonConfig when your FragmentHostCallback implements ViewModelStoreOwner."));
        throw null;
    }

    @Nullable
    @Deprecated
    public Parcelable saveAllState() {
        d1 d10 = this.a.e;
        if(!(d10.v instanceof SavedStateRegistryOwner)) {
            Bundle bundle0 = d10.Q();
            return !bundle0.isEmpty() ? bundle0 : null;
        }
        d10.X(new IllegalStateException("You cannot use saveAllState when your FragmentHostCallback implements SavedStateRegistryOwner."));
        throw null;
    }
}

