package dagger.hilt.android.internal.lifecycle;

import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.Set;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata({"dagger.hilt.android.internal.lifecycle.HiltViewModelMap.KeySet"})
@ScopeMetadata
public final class DefaultViewModelFactories_InternalFactoryFactory_Factory implements Factory {
    public final Provider a;
    public final Provider b;

    public DefaultViewModelFactories_InternalFactoryFactory_Factory(Provider provider0, Provider provider1) {
        this.a = provider0;
        this.b = provider1;
    }

    public static DefaultViewModelFactories_InternalFactoryFactory_Factory create(Provider provider0, Provider provider1) {
        return new DefaultViewModelFactories_InternalFactoryFactory_Factory(provider0, provider1);
    }

    public InternalFactoryFactory get() {
        return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(((Set)this.a.get()), ((ViewModelComponentBuilder)this.b.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static InternalFactoryFactory newInstance(Set set0, ViewModelComponentBuilder viewModelComponentBuilder0) {
        return new InternalFactoryFactory(set0, viewModelComponentBuilder0);
    }
}

