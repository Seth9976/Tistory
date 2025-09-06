package dagger.hilt.android.internal.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.viewmodel.CreationExtras.Key;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.savedstate.SavedStateRegistryOwner;
import dagger.Module;
import dagger.hilt.EntryPoint;
import dagger.hilt.EntryPoints;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.components.ViewModelComponent;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.multibindings.Multibinds;
import java.util.Map;
import java.util.Set;

public final class HiltViewModelFactory implements Factory {
    @EntryPoint
    @InstallIn({ActivityComponent.class})
    interface ActivityCreatorEntryPoint {
        ViewModelComponentBuilder getViewModelComponentBuilder();

        @KeySet
        Set getViewModelKeys();
    }

    @EntryPoint
    @InstallIn({ViewModelComponent.class})
    public interface ViewModelFactoriesEntryPoint {
        @HiltViewModelAssistedMap
        Map getHiltViewModelAssistedMap();

        @HiltViewModelMap
        Map getHiltViewModelMap();
    }

    @Module
    @InstallIn({ViewModelComponent.class})
    interface ViewModelModule {
        @HiltViewModelAssistedMap
        @Multibinds
        Map hiltViewModelAssistedMap();

        @HiltViewModelMap
        @Multibinds
        Map hiltViewModelMap();
    }

    public static final Key CREATION_CALLBACK_KEY;
    public final Set a;
    public final Factory b;
    public final c c;

    static {
        HiltViewModelFactory.CREATION_CALLBACK_KEY = new a();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public HiltViewModelFactory(@NonNull Set set0, @NonNull Factory viewModelProvider$Factory0, @NonNull ViewModelComponentBuilder viewModelComponentBuilder0) {
        this.a = set0;
        this.b = viewModelProvider$Factory0;
        this.c = new c(viewModelComponentBuilder0);
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.lifecycle.ViewModelProvider$Factory
    @NonNull
    public ViewModel create(@NonNull Class class0) {
        return this.a.contains(class0.getName()) ? this.c.create(class0) : this.b.create(class0);
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.lifecycle.ViewModelProvider$Factory
    @NonNull
    public ViewModel create(@NonNull Class class0, @NonNull CreationExtras creationExtras0) {
        return this.a.contains(class0.getName()) ? this.c.create(class0, creationExtras0) : this.b.create(class0, creationExtras0);
    }

    public static Factory createInternal(@NonNull Activity activity0, @NonNull Factory viewModelProvider$Factory0) {
        ActivityCreatorEntryPoint hiltViewModelFactory$ActivityCreatorEntryPoint0 = (ActivityCreatorEntryPoint)EntryPoints.get(activity0, ActivityCreatorEntryPoint.class);
        return new HiltViewModelFactory(hiltViewModelFactory$ActivityCreatorEntryPoint0.getViewModelKeys(), viewModelProvider$Factory0, hiltViewModelFactory$ActivityCreatorEntryPoint0.getViewModelComponentBuilder());
    }

    public static Factory createInternal(@NonNull Activity activity0, @NonNull SavedStateRegistryOwner savedStateRegistryOwner0, @Nullable Bundle bundle0, @NonNull Factory viewModelProvider$Factory0) {
        return HiltViewModelFactory.createInternal(activity0, viewModelProvider$Factory0);
    }
}

