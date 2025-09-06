package com.kakao.tistory.module;

import com.kakao.tistory.data.home.api.HomeService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import retrofit2.Retrofit;

@DaggerGenerated
@QualifierMetadata({"com.kakao.tistory.module.RetrofitModule.SerializationRetrofit"})
@ScopeMetadata("javax.inject.Singleton")
public final class ServiceModule_ProvideHomeServiceFactory implements Factory {
    public final ServiceModule a;
    public final Provider b;

    public ServiceModule_ProvideHomeServiceFactory(ServiceModule serviceModule0, Provider provider0) {
        this.a = serviceModule0;
        this.b = provider0;
    }

    public static ServiceModule_ProvideHomeServiceFactory create(ServiceModule serviceModule0, Provider provider0) {
        return new ServiceModule_ProvideHomeServiceFactory(serviceModule0, provider0);
    }

    public HomeService get() {
        Retrofit retrofit0 = (Retrofit)this.b.get();
        return ServiceModule_ProvideHomeServiceFactory.provideHomeService(this.a, retrofit0);
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static HomeService provideHomeService(ServiceModule serviceModule0, Retrofit retrofit0) {
        return (HomeService)Preconditions.checkNotNullFromProvides(serviceModule0.provideHomeService(retrofit0));
    }
}

