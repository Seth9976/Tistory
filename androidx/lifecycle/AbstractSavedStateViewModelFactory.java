package androidx.lifecycle;

import android.os.Bundle;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u001B\b\u0016\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\b\u0010\b\u001A\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0003\u0010\tJ/\u0010\u0010\u001A\u00028\u0000\"\b\b\u0000\u0010\u000B*\u00020\n2\f\u0010\r\u001A\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u000F\u001A\u00020\u000EH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\'\u0010\u0010\u001A\u00028\u0000\"\b\b\u0000\u0010\u000B*\u00020\n2\f\u0010\r\u001A\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0012J7\u0010\u0010\u001A\u00028\u0000\"\b\b\u0000\u0010\u000B*\u00020\n2\u0006\u0010\u0014\u001A\u00020\u00132\f\u0010\r\u001A\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u0016\u001A\u00020\u0015H$¢\u0006\u0004\b\u0010\u0010\u0017J\u0017\u0010\u001A\u001A\u00020\u00192\u0006\u0010\u0018\u001A\u00020\nH\u0017¢\u0006\u0004\b\u001A\u0010\u001B¨\u0006\u001C"}, d2 = {"Landroidx/lifecycle/AbstractSavedStateViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$OnRequeryFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "<init>", "()V", "Landroidx/savedstate/SavedStateRegistryOwner;", "owner", "Landroid/os/Bundle;", "defaultArgs", "(Landroidx/savedstate/SavedStateRegistryOwner;Landroid/os/Bundle;)V", "Landroidx/lifecycle/ViewModel;", "T", "Ljava/lang/Class;", "modelClass", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extras", "create", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "", "key", "Landroidx/lifecycle/SavedStateHandle;", "handle", "(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/SavedStateHandle;)Landroidx/lifecycle/ViewModel;", "viewModel", "", "onRequery", "(Landroidx/lifecycle/ViewModel;)V", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public abstract class AbstractSavedStateViewModelFactory extends OnRequeryFactory implements Factory {
    public final SavedStateRegistry a;
    public final Lifecycle b;
    public final Bundle c;

    public AbstractSavedStateViewModelFactory() {
    }

    public AbstractSavedStateViewModelFactory(@NotNull SavedStateRegistryOwner savedStateRegistryOwner0, @Nullable Bundle bundle0) {
        Intrinsics.checkNotNullParameter(savedStateRegistryOwner0, "owner");
        super();
        this.a = savedStateRegistryOwner0.getSavedStateRegistry();
        this.b = savedStateRegistryOwner0.getLifecycle();
        this.c = bundle0;
    }

    @Override  // androidx.lifecycle.ViewModelProvider$Factory
    @NotNull
    public ViewModel create(@NotNull Class class0) {
        Intrinsics.checkNotNullParameter(class0, "modelClass");
        String s = class0.getCanonicalName();
        if(s == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        if(this.b == null) {
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        Intrinsics.checkNotNull(this.a);
        Intrinsics.checkNotNull(this.b);
        SavedStateHandleController savedStateHandleController0 = LegacySavedStateHandleController.create(this.a, this.b, s, this.c);
        ViewModel viewModel0 = this.create(s, class0, savedStateHandleController0.getHandle());
        viewModel0.addCloseable("androidx.lifecycle.savedstate.vm.tag", savedStateHandleController0);
        return viewModel0;
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
        SavedStateRegistry savedStateRegistry0 = this.a;
        if(savedStateRegistry0 != null) {
            Intrinsics.checkNotNull(savedStateRegistry0);
            Intrinsics.checkNotNull(this.b);
            SavedStateHandleController savedStateHandleController0 = LegacySavedStateHandleController.create(savedStateRegistry0, this.b, s, this.c);
            ViewModel viewModel0 = this.create(s, class0, savedStateHandleController0.getHandle());
            viewModel0.addCloseable("androidx.lifecycle.savedstate.vm.tag", savedStateHandleController0);
            return viewModel0;
        }
        return this.create(s, class0, SavedStateHandleSupport.createSavedStateHandle(creationExtras0));
    }

    @NotNull
    public abstract ViewModel create(@NotNull String arg1, @NotNull Class arg2, @NotNull SavedStateHandle arg3);

    @Override  // androidx.lifecycle.ViewModelProvider$OnRequeryFactory
    @RestrictTo({Scope.LIBRARY_GROUP})
    public void onRequery(@NotNull ViewModel viewModel0) {
        Intrinsics.checkNotNullParameter(viewModel0, "viewModel");
        SavedStateRegistry savedStateRegistry0 = this.a;
        if(savedStateRegistry0 != null) {
            Intrinsics.checkNotNull(savedStateRegistry0);
            Intrinsics.checkNotNull(this.b);
            LegacySavedStateHandleController.attachHandleIfNeeded(viewModel0, savedStateRegistry0, this.b);
        }
    }
}

