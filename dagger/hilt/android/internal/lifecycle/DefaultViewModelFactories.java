package dagger.hilt.android.internal.lifecycle;

import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider.Factory;
import dagger.Module;
import dagger.hilt.EntryPoint;
import dagger.hilt.EntryPoints;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.components.FragmentComponent;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.internal.Preconditions;
import dagger.multibindings.Multibinds;
import java.util.Set;

public final class DefaultViewModelFactories {
    @EntryPoint
    @InstallIn({ActivityComponent.class})
    public interface ActivityEntryPoint {
        InternalFactoryFactory getHiltInternalFactoryFactory();
    }

    @Module
    @InstallIn({ActivityComponent.class})
    interface ActivityModule {
        @KeySet
        @Multibinds
        Set viewModelKeys();
    }

    @EntryPoint
    @InstallIn({FragmentComponent.class})
    public interface FragmentEntryPoint {
        InternalFactoryFactory getHiltInternalFactoryFactory();
    }

    public static final class InternalFactoryFactory {
        public final Set a;
        public final ViewModelComponentBuilder b;

        public InternalFactoryFactory(Set set0, ViewModelComponentBuilder viewModelComponentBuilder0) {
            this.a = set0;
            this.b = viewModelComponentBuilder0;
        }
    }

    public static Factory getActivityFactory(ComponentActivity componentActivity0, Factory viewModelProvider$Factory0) {
        InternalFactoryFactory defaultViewModelFactories$InternalFactoryFactory0 = ((ActivityEntryPoint)EntryPoints.get(componentActivity0, ActivityEntryPoint.class)).getHiltInternalFactoryFactory();
        defaultViewModelFactories$InternalFactoryFactory0.getClass();
        Factory viewModelProvider$Factory1 = (Factory)Preconditions.checkNotNull(viewModelProvider$Factory0);
        return new HiltViewModelFactory(defaultViewModelFactories$InternalFactoryFactory0.a, viewModelProvider$Factory1, defaultViewModelFactories$InternalFactoryFactory0.b);
    }

    public static Factory getFragmentFactory(Fragment fragment0, Factory viewModelProvider$Factory0) {
        InternalFactoryFactory defaultViewModelFactories$InternalFactoryFactory0 = ((FragmentEntryPoint)EntryPoints.get(fragment0, FragmentEntryPoint.class)).getHiltInternalFactoryFactory();
        defaultViewModelFactories$InternalFactoryFactory0.getClass();
        Factory viewModelProvider$Factory1 = (Factory)Preconditions.checkNotNull(viewModelProvider$Factory0);
        return new HiltViewModelFactory(defaultViewModelFactories$InternalFactoryFactory0.a, viewModelProvider$Factory1, defaultViewModelFactories$InternalFactoryFactory0.b);
    }
}

