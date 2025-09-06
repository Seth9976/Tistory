package com.kakao.tistory.module;

import com.kakao.tistory.data.service.SecretLabService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import retrofit2.Retrofit;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata("javax.inject.Singleton")
public final class ServiceModule_ProvideSecretLabServiceFactory implements Factory {
    public final ServiceModule a;
    public final Provider b;

    public ServiceModule_ProvideSecretLabServiceFactory(ServiceModule serviceModule0, Provider provider0) {
        this.a = serviceModule0;
        this.b = provider0;
    }

    public static ServiceModule_ProvideSecretLabServiceFactory create(ServiceModule serviceModule0, Provider provider0) {
        return new ServiceModule_ProvideSecretLabServiceFactory(serviceModule0, provider0);
    }

    public SecretLabService get() {
        Retrofit retrofit0 = (Retrofit)this.b.get();
        return ServiceModule_ProvideSecretLabServiceFactory.provideSecretLabService(this.a, retrofit0);
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static SecretLabService provideSecretLabService(ServiceModule serviceModule0, Retrofit retrofit0) {
        return (SecretLabService)Preconditions.checkNotNullFromProvides(serviceModule0.provideSecretLabService(retrofit0));
    }
}

