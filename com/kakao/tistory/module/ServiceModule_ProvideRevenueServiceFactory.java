package com.kakao.tistory.module;

import com.kakao.tistory.data.revenue.api.RevenueService;
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
public final class ServiceModule_ProvideRevenueServiceFactory implements Factory {
    public final ServiceModule a;
    public final Provider b;

    public ServiceModule_ProvideRevenueServiceFactory(ServiceModule serviceModule0, Provider provider0) {
        this.a = serviceModule0;
        this.b = provider0;
    }

    public static ServiceModule_ProvideRevenueServiceFactory create(ServiceModule serviceModule0, Provider provider0) {
        return new ServiceModule_ProvideRevenueServiceFactory(serviceModule0, provider0);
    }

    public RevenueService get() {
        Retrofit retrofit0 = (Retrofit)this.b.get();
        return ServiceModule_ProvideRevenueServiceFactory.provideRevenueService(this.a, retrofit0);
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static RevenueService provideRevenueService(ServiceModule serviceModule0, Retrofit retrofit0) {
        return (RevenueService)Preconditions.checkNotNullFromProvides(serviceModule0.provideRevenueService(retrofit0));
    }
}

