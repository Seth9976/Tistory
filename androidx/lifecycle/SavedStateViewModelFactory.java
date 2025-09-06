package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u001B\b\u0016\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001A\u00020\u0007¢\u0006\u0004\b\u0003\u0010\tB%\b\u0017\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\b\u0010\u000B\u001A\u0004\u0018\u00010\n¢\u0006\u0004\b\u0003\u0010\fJ/\u0010\u0013\u001A\u00028\u0000\"\b\b\u0000\u0010\u000E*\u00020\r2\f\u0010\u0010\u001A\b\u0012\u0004\u0012\u00028\u00000\u000F2\u0006\u0010\u0012\u001A\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u0013\u001A\u00028\u0000\"\b\b\u0000\u0010\u000E*\u00020\r2\u0006\u0010\u0016\u001A\u00020\u00152\f\u0010\u0010\u001A\b\u0012\u0004\u0012\u00028\u00000\u000F¢\u0006\u0004\b\u0013\u0010\u0017J\'\u0010\u0013\u001A\u00028\u0000\"\b\b\u0000\u0010\u000E*\u00020\r2\f\u0010\u0010\u001A\b\u0012\u0004\u0012\u00028\u00000\u000FH\u0016¢\u0006\u0004\b\u0013\u0010\u0018J\u0017\u0010\u001B\u001A\u00020\u001A2\u0006\u0010\u0019\u001A\u00020\rH\u0017¢\u0006\u0004\b\u001B\u0010\u001C¨\u0006\u001D"}, d2 = {"Landroidx/lifecycle/SavedStateViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$OnRequeryFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "<init>", "()V", "Landroid/app/Application;", "application", "Landroidx/savedstate/SavedStateRegistryOwner;", "owner", "(Landroid/app/Application;Landroidx/savedstate/SavedStateRegistryOwner;)V", "Landroid/os/Bundle;", "defaultArgs", "(Landroid/app/Application;Landroidx/savedstate/SavedStateRegistryOwner;Landroid/os/Bundle;)V", "Landroidx/lifecycle/ViewModel;", "T", "Ljava/lang/Class;", "modelClass", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extras", "create", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "", "key", "(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "viewModel", "", "onRequery", "(Landroidx/lifecycle/ViewModel;)V", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class SavedStateViewModelFactory extends OnRequeryFactory implements Factory {
    public final Application a;
    public final AndroidViewModelFactory b;
    public final Bundle c;
    public final Lifecycle d;
    public final SavedStateRegistry e;

    public SavedStateViewModelFactory() {
        this.b = new AndroidViewModelFactory();
    }

    public SavedStateViewModelFactory(@Nullable Application application0, @NotNull SavedStateRegistryOwner savedStateRegistryOwner0) {
        Intrinsics.checkNotNullParameter(savedStateRegistryOwner0, "owner");
        this(application0, savedStateRegistryOwner0, null);
    }

    @SuppressLint({"LambdaLast"})
    public SavedStateViewModelFactory(@Nullable Application application0, @NotNull SavedStateRegistryOwner savedStateRegistryOwner0, @Nullable Bundle bundle0) {
        Intrinsics.checkNotNullParameter(savedStateRegistryOwner0, "owner");
        super();
        this.e = savedStateRegistryOwner0.getSavedStateRegistry();
        this.d = savedStateRegistryOwner0.getLifecycle();
        this.c = bundle0;
        this.a = application0;
        this.b = application0 == null ? new AndroidViewModelFactory() : AndroidViewModelFactory.Companion.getInstance(application0);
    }

    @Override  // androidx.lifecycle.ViewModelProvider$Factory
    @NotNull
    public ViewModel create(@NotNull Class class0) {
        Intrinsics.checkNotNullParameter(class0, "modelClass");
        String s = class0.getCanonicalName();
        if(s == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return this.create(s, class0);
    }

    @Override  // androidx.lifecycle.ViewModelProvider$Factory
    @NotNull
    public ViewModel create(@NotNull Class class0, @NotNull CreationExtras creationExtras0) {
        Intrinsics.checkNotNullParameter(class0, "modelClass");
        Intrinsics.checkNotNullParameter(creationExtras0, "extras");
        String s = (String)creationExtras0.get(NewInstanceFactory.VIEW_MODEL_KEY);
        if(s == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if(creationExtras0.get(SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY) != null && creationExtras0.get(SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY) != null) {
            Application application0 = (Application)creationExtras0.get(AndroidViewModelFactory.APPLICATION_KEY);
            boolean z = AndroidViewModel.class.isAssignableFrom(class0);
            Constructor constructor0 = !z || application0 == null ? SavedStateViewModelFactoryKt.findMatchingConstructor(class0, SavedStateViewModelFactoryKt.b) : SavedStateViewModelFactoryKt.findMatchingConstructor(class0, SavedStateViewModelFactoryKt.a);
            if(constructor0 == null) {
                return this.b.create(class0, creationExtras0);
            }
            return !z || application0 == null ? SavedStateViewModelFactoryKt.newInstance(class0, constructor0, new Object[]{SavedStateHandleSupport.createSavedStateHandle(creationExtras0)}) : SavedStateViewModelFactoryKt.newInstance(class0, constructor0, new Object[]{application0, SavedStateHandleSupport.createSavedStateHandle(creationExtras0)});
        }
        if(this.d == null) {
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        return this.create(s, class0);
    }

    @NotNull
    public final ViewModel create(@NotNull String s, @NotNull Class class0) {
        ViewModel viewModel0;
        Intrinsics.checkNotNullParameter(s, "key");
        Intrinsics.checkNotNullParameter(class0, "modelClass");
        Lifecycle lifecycle0 = this.d;
        if(lifecycle0 == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean z = AndroidViewModel.class.isAssignableFrom(class0);
        Application application0 = this.a;
        Constructor constructor0 = !z || application0 == null ? SavedStateViewModelFactoryKt.findMatchingConstructor(class0, SavedStateViewModelFactoryKt.access$getVIEWMODEL_SIGNATURE$p()) : SavedStateViewModelFactoryKt.findMatchingConstructor(class0, SavedStateViewModelFactoryKt.access$getANDROID_VIEWMODEL_SIGNATURE$p());
        if(constructor0 == null) {
            return application0 == null ? NewInstanceFactory.Companion.getInstance().create(class0) : this.b.create(class0);
        }
        Intrinsics.checkNotNull(this.e);
        SavedStateHandleController savedStateHandleController0 = LegacySavedStateHandleController.create(this.e, lifecycle0, s, this.c);
        if(!z || application0 == null) {
            viewModel0 = SavedStateViewModelFactoryKt.newInstance(class0, constructor0, new Object[]{savedStateHandleController0.getHandle()});
        }
        else {
            Intrinsics.checkNotNull(application0);
            viewModel0 = SavedStateViewModelFactoryKt.newInstance(class0, constructor0, new Object[]{application0, savedStateHandleController0.getHandle()});
        }
        viewModel0.addCloseable("androidx.lifecycle.savedstate.vm.tag", savedStateHandleController0);
        return viewModel0;
    }

    @Override  // androidx.lifecycle.ViewModelProvider$OnRequeryFactory
    @RestrictTo({Scope.LIBRARY_GROUP})
    public void onRequery(@NotNull ViewModel viewModel0) {
        Intrinsics.checkNotNullParameter(viewModel0, "viewModel");
        Lifecycle lifecycle0 = this.d;
        if(lifecycle0 != null) {
            Intrinsics.checkNotNull(this.e);
            Intrinsics.checkNotNull(lifecycle0);
            LegacySavedStateHandleController.attachHandleIfNeeded(viewModel0, this.e, lifecycle0);
        }
    }
}

