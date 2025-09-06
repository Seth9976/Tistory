package androidx.navigation;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.MainThread;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.SavedStateHandle;
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
import java.util.Collection;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import md.c;
import n4.d;
import n4.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u008A\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 R2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0003RSTB\u001D\b\u0017\u0012\u0006\u0010\u0005\u001A\u00020\u0000\u0012\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0006\u00A2\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001A\u00020\f2\u0006\u0010\u000B\u001A\u00020\nH\u0007\u00A2\u0006\u0004\b\r\u0010\u000EJ\u000F\u0010\u000F\u001A\u00020\fH\u0007\u00A2\u0006\u0004\b\u000F\u0010\u0010J\u0017\u0010\u0012\u001A\u00020\f2\u0006\u0010\u0011\u001A\u00020\u0006H\u0007\u00A2\u0006\u0004\b\u0012\u0010\u0013J\u001A\u0010\u0017\u001A\u00020\u00162\b\u0010\u0015\u001A\u0004\u0018\u00010\u0014H\u0096\u0002\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u000F\u0010\u001A\u001A\u00020\u0019H\u0016\u00A2\u0006\u0004\b\u001A\u0010\u001BJ\u000F\u0010\u001D\u001A\u00020\u001CH\u0016\u00A2\u0006\u0004\b\u001D\u0010\u001ER\"\u0010&\u001A\u00020\u001F8\u0006@\u0007X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b \u0010!\u001A\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0017\u0010*\u001A\u00020\u001C8\u0006\u00A2\u0006\f\n\u0004\b\'\u0010(\u001A\u0004\b)\u0010\u001ER\u001B\u00100\u001A\u00020+8GX\u0086\u0084\u0002\u00A2\u0006\f\n\u0004\b,\u0010-\u001A\u0004\b.\u0010/R*\u00109\u001A\u0002012\u0006\u00102\u001A\u0002018G@GX\u0086\u000E\u00A2\u0006\u0012\n\u0004\b3\u00104\u001A\u0004\b5\u00106\"\u0004\b7\u00108R\u001A\u0010?\u001A\u00020:8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b;\u0010<\u001A\u0004\b=\u0010>R\u0013\u0010\u0007\u001A\u0004\u0018\u00010\u00068F\u00A2\u0006\u0006\u001A\u0004\b@\u0010AR\u0014\u0010E\u001A\u00020B8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bC\u0010DR\u0014\u0010I\u001A\u00020F8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bG\u0010HR\u0014\u0010M\u001A\u00020J8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bK\u0010LR\u0014\u0010Q\u001A\u00020N8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bO\u0010P\u00A8\u0006U"}, d2 = {"Landroidx/navigation/NavBackStackEntry;", "Landroidx/lifecycle/LifecycleOwner;", "Landroidx/lifecycle/ViewModelStoreOwner;", "Landroidx/lifecycle/HasDefaultViewModelProviderFactory;", "Landroidx/savedstate/SavedStateRegistryOwner;", "entry", "Landroid/os/Bundle;", "arguments", "<init>", "(Landroidx/navigation/NavBackStackEntry;Landroid/os/Bundle;)V", "Landroidx/lifecycle/Lifecycle$Event;", "event", "", "handleLifecycleEvent", "(Landroidx/lifecycle/Lifecycle$Event;)V", "updateState", "()V", "outBundle", "saveState", "(Landroid/os/Bundle;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/navigation/NavDestination;", "b", "Landroidx/navigation/NavDestination;", "getDestination", "()Landroidx/navigation/NavDestination;", "setDestination", "(Landroidx/navigation/NavDestination;)V", "destination", "f", "Ljava/lang/String;", "getId", "id", "Landroidx/lifecycle/SavedStateHandle;", "l", "Lkotlin/Lazy;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "Landroidx/lifecycle/Lifecycle$State;", "maxState", "m", "Landroidx/lifecycle/Lifecycle$State;", "getMaxLifecycle", "()Landroidx/lifecycle/Lifecycle$State;", "setMaxLifecycle", "(Landroidx/lifecycle/Lifecycle$State;)V", "maxLifecycle", "Landroidx/lifecycle/ViewModelProvider$Factory;", "n", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getDefaultViewModelProviderFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "defaultViewModelProviderFactory", "getArguments", "()Landroid/os/Bundle;", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "lifecycle", "Landroidx/lifecycle/ViewModelStore;", "getViewModelStore", "()Landroidx/lifecycle/ViewModelStore;", "viewModelStore", "Landroidx/lifecycle/viewmodel/CreationExtras;", "getDefaultViewModelCreationExtras", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "defaultViewModelCreationExtras", "Landroidx/savedstate/SavedStateRegistry;", "getSavedStateRegistry", "()Landroidx/savedstate/SavedStateRegistry;", "savedStateRegistry", "Companion", "n4/b", "n4/c", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nNavBackStackEntry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavBackStackEntry.kt\nandroidx/navigation/NavBackStackEntry\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,309:1\n1#2:310\n1726#3,3:311\n1855#3,2:314\n*S KotlinDebug\n*F\n+ 1 NavBackStackEntry.kt\nandroidx/navigation/NavBackStackEntry\n*L\n256#1:311,3\n265#1:314,2\n*E\n"})
public final class NavBackStackEntry implements HasDefaultViewModelProviderFactory, LifecycleOwner, ViewModelStoreOwner, SavedStateRegistryOwner {
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001JY\u0010\u0010\u001A\u00020\u000F2\b\u0010\u0003\u001A\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001A\u00020\u00042\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001A\u00020\b2\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001A\u00020\f2\n\b\u0002\u0010\u000E\u001A\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/navigation/NavBackStackEntry$Companion;", "", "Landroid/content/Context;", "context", "Landroidx/navigation/NavDestination;", "destination", "Landroid/os/Bundle;", "arguments", "Landroidx/lifecycle/Lifecycle$State;", "hostLifecycleState", "Landroidx/navigation/NavViewModelStoreProvider;", "viewModelStoreProvider", "", "id", "savedState", "Landroidx/navigation/NavBackStackEntry;", "create", "(Landroid/content/Context;Landroidx/navigation/NavDestination;Landroid/os/Bundle;Landroidx/lifecycle/Lifecycle$State;Landroidx/navigation/NavViewModelStoreProvider;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/navigation/NavBackStackEntry;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @RestrictTo({Scope.LIBRARY_GROUP})
        @NotNull
        public final NavBackStackEntry create(@Nullable Context context0, @NotNull NavDestination navDestination0, @Nullable Bundle bundle0, @NotNull State lifecycle$State0, @Nullable NavViewModelStoreProvider navViewModelStoreProvider0, @NotNull String s, @Nullable Bundle bundle1) {
            Intrinsics.checkNotNullParameter(navDestination0, "destination");
            Intrinsics.checkNotNullParameter(lifecycle$State0, "hostLifecycleState");
            Intrinsics.checkNotNullParameter(s, "id");
            return new NavBackStackEntry(context0, navDestination0, bundle0, lifecycle$State0, navViewModelStoreProvider0, s, bundle1, null);
        }

        public static NavBackStackEntry create$default(Companion navBackStackEntry$Companion0, Context context0, NavDestination navDestination0, Bundle bundle0, State lifecycle$State0, NavViewModelStoreProvider navViewModelStoreProvider0, String s, Bundle bundle1, int v, Object object0) {
            Bundle bundle2 = (v & 4) == 0 ? bundle0 : null;
            State lifecycle$State1 = (v & 8) == 0 ? lifecycle$State0 : State.CREATED;
            NavViewModelStoreProvider navViewModelStoreProvider1 = (v & 16) == 0 ? navViewModelStoreProvider0 : null;
            if((v & 0x20) != 0) {
                Intrinsics.checkNotNullExpressionValue("15a8d330-4895-41c4-8556-239d2ebc3370", "randomUUID().toString()");
                return (v & 0x40) == 0 ? navBackStackEntry$Companion0.create(context0, navDestination0, bundle2, lifecycle$State1, navViewModelStoreProvider1, "15a8d330-4895-41c4-8556-239d2ebc3370", bundle1) : navBackStackEntry$Companion0.create(context0, navDestination0, bundle2, lifecycle$State1, navViewModelStoreProvider1, "15a8d330-4895-41c4-8556-239d2ebc3370", null);
            }
            return (v & 0x40) == 0 ? navBackStackEntry$Companion0.create(context0, navDestination0, bundle2, lifecycle$State1, navViewModelStoreProvider1, s, bundle1) : navBackStackEntry$Companion0.create(context0, navDestination0, bundle2, lifecycle$State1, navViewModelStoreProvider1, s, null);
        }
    }

    @NotNull
    public static final Companion Companion;
    public final Context a;
    public NavDestination b;
    public final Bundle c;
    public State d;
    public final NavViewModelStoreProvider e;
    public final String f;
    public final Bundle g;
    public final LifecycleRegistry h;
    public final SavedStateRegistryController i;
    public boolean j;
    public final Lazy k;
    public final Lazy l;
    public State m;
    public final SavedStateViewModelFactory n;

    static {
        NavBackStackEntry.Companion = new Companion(null);
    }

    public NavBackStackEntry(Context context0, NavDestination navDestination0, Bundle bundle0, State lifecycle$State0, NavViewModelStoreProvider navViewModelStoreProvider0, String s, Bundle bundle1) {
        this.a = context0;
        this.b = navDestination0;
        this.c = bundle0;
        this.d = lifecycle$State0;
        this.e = navViewModelStoreProvider0;
        this.f = s;
        this.g = bundle1;
        this.h = new LifecycleRegistry(this);
        this.i = SavedStateRegistryController.Companion.create(this);
        Lazy lazy0 = c.lazy(new d(this));
        this.k = lazy0;
        this.l = c.lazy(new e(this));
        this.m = State.INITIALIZED;
        this.n = (SavedStateViewModelFactory)lazy0.getValue();
    }

    public NavBackStackEntry(Context context0, NavDestination navDestination0, Bundle bundle0, State lifecycle$State0, NavViewModelStoreProvider navViewModelStoreProvider0, String s, Bundle bundle1, DefaultConstructorMarker defaultConstructorMarker0) {
        this(context0, navDestination0, bundle0, lifecycle$State0, navViewModelStoreProvider0, s, bundle1);
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public NavBackStackEntry(@NotNull NavBackStackEntry navBackStackEntry0, @Nullable Bundle bundle0) {
        Intrinsics.checkNotNullParameter(navBackStackEntry0, "entry");
        this(navBackStackEntry0.a, navBackStackEntry0.b, bundle0, navBackStackEntry0.d, navBackStackEntry0.e, navBackStackEntry0.f, navBackStackEntry0.g);
        this.d = navBackStackEntry0.d;
        this.setMaxLifecycle(navBackStackEntry0.m);
    }

    public NavBackStackEntry(NavBackStackEntry navBackStackEntry0, Bundle bundle0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            bundle0 = navBackStackEntry0.getArguments();
        }
        this(navBackStackEntry0, bundle0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(object0 != null && object0 instanceof NavBackStackEntry && Intrinsics.areEqual(this.f, ((NavBackStackEntry)object0).f) && Intrinsics.areEqual(this.b, ((NavBackStackEntry)object0).b) && Intrinsics.areEqual(this.getLifecycle(), ((NavBackStackEntry)object0).getLifecycle()) && Intrinsics.areEqual(this.getSavedStateRegistry(), ((NavBackStackEntry)object0).getSavedStateRegistry())) {
            Bundle bundle0 = this.c;
            Bundle bundle1 = ((NavBackStackEntry)object0).c;
            if(Intrinsics.areEqual(bundle0, bundle1)) {
                return true;
            }
            if(bundle0 != null) {
                Set set0 = bundle0.keySet();
                if(set0 != null) {
                    if(!(set0 instanceof Collection) || !set0.isEmpty()) {
                        for(Object object1: set0) {
                            if(!Intrinsics.areEqual(bundle0.get(((String)object1)), (bundle1 == null ? null : bundle1.get(((String)object1))))) {
                                return false;
                            }
                            if(false) {
                                break;
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Nullable
    public final Bundle getArguments() {
        return this.c == null ? null : new Bundle(this.c);
    }

    @Override  // androidx.lifecycle.HasDefaultViewModelProviderFactory
    @NotNull
    public CreationExtras getDefaultViewModelCreationExtras() {
        Application application0 = null;
        CreationExtras creationExtras0 = new MutableCreationExtras(null, 1, null);
        Context context0 = this.a == null ? null : this.a.getApplicationContext();
        if(context0 instanceof Application) {
            application0 = (Application)context0;
        }
        if(application0 != null) {
            ((MutableCreationExtras)creationExtras0).set(AndroidViewModelFactory.APPLICATION_KEY, application0);
        }
        ((MutableCreationExtras)creationExtras0).set(SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY, this);
        ((MutableCreationExtras)creationExtras0).set(SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY, this);
        Bundle bundle0 = this.getArguments();
        if(bundle0 != null) {
            ((MutableCreationExtras)creationExtras0).set(SavedStateHandleSupport.DEFAULT_ARGS_KEY, bundle0);
        }
        return creationExtras0;
    }

    @Override  // androidx.lifecycle.HasDefaultViewModelProviderFactory
    @NotNull
    public Factory getDefaultViewModelProviderFactory() {
        return this.n;
    }

    @NotNull
    public final NavDestination getDestination() {
        return this.b;
    }

    @NotNull
    public final String getId() {
        return this.f;
    }

    @Override  // androidx.lifecycle.LifecycleOwner
    @NotNull
    public Lifecycle getLifecycle() {
        return this.h;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @NotNull
    public final State getMaxLifecycle() {
        return this.m;
    }

    @MainThread
    @NotNull
    public final SavedStateHandle getSavedStateHandle() {
        return (SavedStateHandle)this.l.getValue();
    }

    @Override  // androidx.savedstate.SavedStateRegistryOwner
    @NotNull
    public SavedStateRegistry getSavedStateRegistry() {
        return this.i.getSavedStateRegistry();
    }

    @Override  // androidx.lifecycle.ViewModelStoreOwner
    @NotNull
    public ViewModelStore getViewModelStore() {
        if(!this.j) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry\'s ViewModels until it is added to the NavController\'s back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        }
        if(this.getLifecycle().getCurrentState() == State.DESTROYED) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry\'s ViewModels after the NavBackStackEntry is destroyed.");
        }
        NavViewModelStoreProvider navViewModelStoreProvider0 = this.e;
        if(navViewModelStoreProvider0 == null) {
            throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
        }
        return navViewModelStoreProvider0.getViewModelStore(this.f);
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public final void handleLifecycleEvent(@NotNull Event lifecycle$Event0) {
        Intrinsics.checkNotNullParameter(lifecycle$Event0, "event");
        this.d = lifecycle$Event0.getTargetState();
        this.updateState();
    }

    @Override
    public int hashCode() {
        int v = this.b.hashCode() + this.f.hashCode() * 0x1F;
        Bundle bundle0 = this.c;
        if(bundle0 != null) {
            Set set0 = bundle0.keySet();
            if(set0 != null) {
                for(Object object0: set0) {
                    Object object1 = bundle0.get(((String)object0));
                    v = v * 0x1F + (object1 == null ? 0 : object1.hashCode());
                }
            }
        }
        return this.getSavedStateRegistry().hashCode() + (this.getLifecycle().hashCode() + v * 0x1F) * 0x1F;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public final void saveState(@NotNull Bundle bundle0) {
        Intrinsics.checkNotNullParameter(bundle0, "outBundle");
        this.i.performSave(bundle0);
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public final void setDestination(@NotNull NavDestination navDestination0) {
        Intrinsics.checkNotNullParameter(navDestination0, "<set-?>");
        this.b = navDestination0;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public final void setMaxLifecycle(@NotNull State lifecycle$State0) {
        Intrinsics.checkNotNullParameter(lifecycle$State0, "maxState");
        this.m = lifecycle$State0;
        this.updateState();
    }

    @Override
    @NotNull
    public String toString() {
        String s = "NavBackStackEntry" + ("(" + this.f + ')') + " destination=" + this.b;
        Intrinsics.checkNotNullExpressionValue(s, "sb.toString()");
        return s;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public final void updateState() {
        if(!this.j) {
            SavedStateRegistryController savedStateRegistryController0 = this.i;
            savedStateRegistryController0.performAttach();
            this.j = true;
            if(this.e != null) {
                SavedStateHandleSupport.enableSavedStateHandles(this);
            }
            savedStateRegistryController0.performRestore(this.g);
        }
        LifecycleRegistry lifecycleRegistry0 = this.h;
        if(this.d.ordinal() < this.m.ordinal()) {
            lifecycleRegistry0.setCurrentState(this.d);
            return;
        }
        lifecycleRegistry0.setCurrentState(this.m);
    }
}

