package com.kakao.tistory.module;

import com.kakao.tistory.data.service.SearchService;
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
public final class ServiceModule_ProvideSearchServiceFactory implements Factory {
    public final ServiceModule a;
    public final Provider b;

    public ServiceModule_ProvideSearchServiceFactory(ServiceModule serviceModule0, Provider provider0) {
        this.a = serviceModule0;
        this.b = provider0;
    }

    public static ServiceModule_ProvideSearchServiceFactory create(ServiceModule serviceModule0, Provider provider0) {
        return new ServiceModule_ProvideSearchServiceFactory(serviceModule0, provider0);
    }

    public SearchService get() {
        Retrofit retrofit0 = (Retrofit)this.b.get();
        return ServiceModule_ProvideSearchServiceFactory.provideSearchService(this.a, retrofit0);
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static SearchService provideSearchService(ServiceModule serviceModule0, Retrofit retrofit0) {
        return (SearchService)Preconditions.checkNotNullFromProvides(serviceModule0.provideSearchService(retrofit0));
    }
}

