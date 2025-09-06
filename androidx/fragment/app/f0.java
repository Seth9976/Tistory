package androidx.fragment.app;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.core.app.ActivityCompat;
import androidx.core.app.OnMultiWindowModeChangedProvider;
import androidx.core.app.OnPictureInPictureModeChangedProvider;
import androidx.core.content.OnConfigurationChangedProvider;
import androidx.core.content.OnTrimMemoryProvider;
import androidx.core.util.Consumer;
import androidx.core.view.MenuHost;
import androidx.core.view.MenuProvider;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public final class f0 extends FragmentHostCallback implements OnBackPressedDispatcherOwner, ActivityResultRegistryOwner, OnMultiWindowModeChangedProvider, OnPictureInPictureModeChangedProvider, OnConfigurationChangedProvider, OnTrimMemoryProvider, MenuHost, FragmentOnAttachListener, ViewModelStoreOwner, SavedStateRegistryOwner {
    public final FragmentActivity f;

    public f0(FragmentActivity fragmentActivity0) {
        this.f = fragmentActivity0;
        super(fragmentActivity0, fragmentActivity0, new Handler(), 0);
    }

    @Override  // androidx.core.view.MenuHost
    public final void addMenuProvider(MenuProvider menuProvider0) {
        this.f.addMenuProvider(menuProvider0);
    }

    @Override  // androidx.core.view.MenuHost
    public final void addMenuProvider(MenuProvider menuProvider0, LifecycleOwner lifecycleOwner0) {
        this.f.addMenuProvider(menuProvider0, lifecycleOwner0);
    }

    @Override  // androidx.core.view.MenuHost
    public final void addMenuProvider(MenuProvider menuProvider0, LifecycleOwner lifecycleOwner0, State lifecycle$State0) {
        this.f.addMenuProvider(menuProvider0, lifecycleOwner0, lifecycle$State0);
    }

    @Override  // androidx.core.content.OnConfigurationChangedProvider
    public final void addOnConfigurationChangedListener(Consumer consumer0) {
        this.f.addOnConfigurationChangedListener(consumer0);
    }

    @Override  // androidx.core.app.OnMultiWindowModeChangedProvider
    public final void addOnMultiWindowModeChangedListener(Consumer consumer0) {
        this.f.addOnMultiWindowModeChangedListener(consumer0);
    }

    @Override  // androidx.core.app.OnPictureInPictureModeChangedProvider
    public final void addOnPictureInPictureModeChangedListener(Consumer consumer0) {
        this.f.addOnPictureInPictureModeChangedListener(consumer0);
    }

    @Override  // androidx.core.content.OnTrimMemoryProvider
    public final void addOnTrimMemoryListener(Consumer consumer0) {
        this.f.addOnTrimMemoryListener(consumer0);
    }

    @Override  // androidx.activity.result.ActivityResultRegistryOwner
    public final ActivityResultRegistry getActivityResultRegistry() {
        return this.f.getActivityResultRegistry();
    }

    @Override  // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.f.mFragmentLifecycleRegistry;
    }

    @Override  // androidx.activity.OnBackPressedDispatcherOwner
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.f.getOnBackPressedDispatcher();
    }

    @Override  // androidx.savedstate.SavedStateRegistryOwner
    public final SavedStateRegistry getSavedStateRegistry() {
        return this.f.getSavedStateRegistry();
    }

    @Override  // androidx.lifecycle.ViewModelStoreOwner
    public final ViewModelStore getViewModelStore() {
        return this.f.getViewModelStore();
    }

    @Override  // androidx.core.view.MenuHost
    public final void invalidateMenu() {
        this.f.invalidateMenu();
    }

    @Override  // androidx.fragment.app.FragmentOnAttachListener
    public final void onAttachFragment(FragmentManager fragmentManager0, Fragment fragment0) {
    }

    @Override  // androidx.fragment.app.FragmentHostCallback
    public final void onDump(String s, FileDescriptor fileDescriptor0, PrintWriter printWriter0, String[] arr_s) {
        this.f.dump(s, fileDescriptor0, printWriter0, arr_s);
    }

    @Override  // androidx.fragment.app.FragmentHostCallback
    public final View onFindViewById(int v) {
        return this.f.findViewById(v);
    }

    @Override  // androidx.fragment.app.FragmentHostCallback
    public final Object onGetHost() {
        return this.f;
    }

    @Override  // androidx.fragment.app.FragmentHostCallback
    public final LayoutInflater onGetLayoutInflater() {
        return this.f.getLayoutInflater().cloneInContext(this.f);
    }

    @Override  // androidx.fragment.app.FragmentHostCallback
    public final int onGetWindowAnimations() {
        Window window0 = this.f.getWindow();
        return window0 == null ? 0 : window0.getAttributes().windowAnimations;
    }

    @Override  // androidx.fragment.app.FragmentHostCallback
    public final boolean onHasView() {
        Window window0 = this.f.getWindow();
        return window0 != null && window0.peekDecorView() != null;
    }

    @Override  // androidx.fragment.app.FragmentHostCallback
    public final boolean onHasWindowAnimations() {
        return this.f.getWindow() != null;
    }

    @Override  // androidx.fragment.app.FragmentHostCallback
    public final boolean onShouldSaveFragmentState(Fragment fragment0) {
        return !this.f.isFinishing();
    }

    @Override  // androidx.fragment.app.FragmentHostCallback
    public final boolean onShouldShowRequestPermissionRationale(String s) {
        return ActivityCompat.shouldShowRequestPermissionRationale(this.f, s);
    }

    @Override  // androidx.fragment.app.FragmentHostCallback
    public final void onSupportInvalidateOptionsMenu() {
        this.invalidateMenu();
    }

    @Override  // androidx.core.view.MenuHost
    public final void removeMenuProvider(MenuProvider menuProvider0) {
        this.f.removeMenuProvider(menuProvider0);
    }

    @Override  // androidx.core.content.OnConfigurationChangedProvider
    public final void removeOnConfigurationChangedListener(Consumer consumer0) {
        this.f.removeOnConfigurationChangedListener(consumer0);
    }

    @Override  // androidx.core.app.OnMultiWindowModeChangedProvider
    public final void removeOnMultiWindowModeChangedListener(Consumer consumer0) {
        this.f.removeOnMultiWindowModeChangedListener(consumer0);
    }

    @Override  // androidx.core.app.OnPictureInPictureModeChangedProvider
    public final void removeOnPictureInPictureModeChangedListener(Consumer consumer0) {
        this.f.removeOnPictureInPictureModeChangedListener(consumer0);
    }

    @Override  // androidx.core.content.OnTrimMemoryProvider
    public final void removeOnTrimMemoryListener(Consumer consumer0) {
        this.f.removeOnTrimMemoryListener(consumer0);
    }
}

