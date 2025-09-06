package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.SavedStateViewModelFactory;
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.SavedStateRegistryOwner;

public final class w1 implements HasDefaultViewModelProviderFactory, ViewModelStoreOwner, SavedStateRegistryOwner {
    public final Fragment a;
    public final ViewModelStore b;
    public final r c;
    public Factory d;
    public LifecycleRegistry e;
    public SavedStateRegistryController f;

    public w1(Fragment fragment0, ViewModelStore viewModelStore0, r r0) {
        this.e = null;
        this.f = null;
        this.a = fragment0;
        this.b = viewModelStore0;
        this.c = r0;
    }

    public final void a(Event lifecycle$Event0) {
        this.e.handleLifecycleEvent(lifecycle$Event0);
    }

    public final void b() {
        if(this.e == null) {
            this.e = new LifecycleRegistry(this);
            SavedStateRegistryController savedStateRegistryController0 = SavedStateRegistryController.create(this);
            this.f = savedStateRegistryController0;
            savedStateRegistryController0.performAttach();
            this.c.run();
        }
    }

    @Override  // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final CreationExtras getDefaultViewModelCreationExtras() {
        Application application0;
        Fragment fragment0 = this.a;
        for(Context context0 = fragment0.requireContext().getApplicationContext(); true; context0 = ((ContextWrapper)context0).getBaseContext()) {
            application0 = null;
            if(!(context0 instanceof ContextWrapper)) {
                break;
            }
            if(context0 instanceof Application) {
                application0 = (Application)context0;
                break;
            }
        }
        CreationExtras creationExtras0 = new MutableCreationExtras();
        if(application0 != null) {
            ((MutableCreationExtras)creationExtras0).set(AndroidViewModelFactory.APPLICATION_KEY, application0);
        }
        ((MutableCreationExtras)creationExtras0).set(SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY, fragment0);
        ((MutableCreationExtras)creationExtras0).set(SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY, this);
        if(fragment0.getArguments() != null) {
            ((MutableCreationExtras)creationExtras0).set(SavedStateHandleSupport.DEFAULT_ARGS_KEY, fragment0.getArguments());
        }
        return creationExtras0;
    }

    @Override  // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final Factory getDefaultViewModelProviderFactory() {
        Application application0;
        Fragment fragment0 = this.a;
        Factory viewModelProvider$Factory0 = fragment0.getDefaultViewModelProviderFactory();
        if(!viewModelProvider$Factory0.equals(fragment0.mDefaultFactory)) {
            this.d = viewModelProvider$Factory0;
            return viewModelProvider$Factory0;
        }
        if(this.d == null) {
            for(Context context0 = fragment0.requireContext().getApplicationContext(); true; context0 = ((ContextWrapper)context0).getBaseContext()) {
                application0 = null;
                if(!(context0 instanceof ContextWrapper)) {
                    break;
                }
                if(context0 instanceof Application) {
                    application0 = (Application)context0;
                    break;
                }
            }
            this.d = new SavedStateViewModelFactory(application0, fragment0, fragment0.getArguments());
        }
        return this.d;
    }

    @Override  // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        this.b();
        return this.e;
    }

    @Override  // androidx.savedstate.SavedStateRegistryOwner
    public final SavedStateRegistry getSavedStateRegistry() {
        this.b();
        return this.f.getSavedStateRegistry();
    }

    @Override  // androidx.lifecycle.ViewModelStoreOwner
    public final ViewModelStore getViewModelStore() {
        this.b();
        return this.b;
    }
}

