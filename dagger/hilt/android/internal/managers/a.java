package dagger.hilt.android.internal.managers;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.viewmodel.CreationExtras;
import dagger.hilt.android.EntryPointAccessors;

public final class a implements Factory {
    public final ComponentActivity a;

    public a(ComponentActivity componentActivity0) {
        this.a = componentActivity0;
    }

    @Override  // androidx.lifecycle.ViewModelProvider$Factory
    public final ViewModel create(Class class0, CreationExtras creationExtras0) {
        SavedStateHandleHolder savedStateHandleHolder0 = new SavedStateHandleHolder(creationExtras0);
        return new b(((ActivityRetainedComponentManager.ActivityRetainedComponentBuilderEntryPoint)EntryPointAccessors.fromApplication(this.a, ActivityRetainedComponentManager.ActivityRetainedComponentBuilderEntryPoint.class)).retainedComponentBuilder().savedStateHandleHolder(savedStateHandleHolder0).build(), savedStateHandleHolder0);
    }
}

