package dagger.hilt.android.internal.lifecycle;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.viewmodel.CreationExtras;
import dagger.hilt.EntryPoints;
import dagger.hilt.android.components.ViewModelComponent;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import javax.inject.Provider;
import kotlin.jvm.functions.Function1;

public final class c implements Factory {
    public final ViewModelComponentBuilder a;

    public c(ViewModelComponentBuilder viewModelComponentBuilder0) {
        this.a = viewModelComponentBuilder0;
    }

    @Override  // androidx.lifecycle.ViewModelProvider$Factory
    public final ViewModel create(Class class0, CreationExtras creationExtras0) {
        ViewModel viewModel0;
        RetainedLifecycleImpl retainedLifecycleImpl0 = new RetainedLifecycleImpl();
        SavedStateHandle savedStateHandle0 = SavedStateHandleSupport.createSavedStateHandle(creationExtras0);
        ViewModelComponent viewModelComponent0 = this.a.savedStateHandle(savedStateHandle0).viewModelLifecycle(retainedLifecycleImpl0).build();
        Provider provider0 = (Provider)((ViewModelFactoriesEntryPoint)EntryPoints.get(viewModelComponent0, ViewModelFactoriesEntryPoint.class)).getHiltViewModelMap().get(class0.getName());
        Function1 function10 = (Function1)creationExtras0.get(HiltViewModelFactory.CREATION_CALLBACK_KEY);
        Object object0 = ((ViewModelFactoriesEntryPoint)EntryPoints.get(viewModelComponent0, ViewModelFactoriesEntryPoint.class)).getHiltViewModelAssistedMap().get(class0.getName());
        if(object0 == null) {
            if(function10 != null) {
                throw new IllegalStateException("Found creation callback but class " + class0.getName() + " does not have an assisted factory specified in @HiltViewModel.");
            }
            if(provider0 == null) {
                throw new IllegalStateException("Expected the @HiltViewModel-annotated class " + class0.getName() + " to be available in the multi-binding of @HiltViewModelMap but none was found.");
            }
            viewModel0 = (ViewModel)provider0.get();
        }
        else {
            if(provider0 != null) {
                throw new AssertionError("Found the @HiltViewModel-annotated class " + class0.getName() + " in both the multi-bindings of @HiltViewModelMap and @HiltViewModelAssistedMap.");
            }
            if(function10 == null) {
                throw new IllegalStateException("Found @HiltViewModel-annotated class " + class0.getName() + " using @AssistedInject but no creation callback was provided in CreationExtras.");
            }
            viewModel0 = (ViewModel)function10.invoke(object0);
        }
        viewModel0.addCloseable(new b(retainedLifecycleImpl0));
        return viewModel0;
    }
}

