package com.kakao.tistory.module;

import com.kakao.tistory.data.statistics.service.EntryStatisticsService;
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
public final class ServiceModule_ProvideEntryStatisticsServiceFactory implements Factory {
    public final ServiceModule a;
    public final Provider b;

    public ServiceModule_ProvideEntryStatisticsServiceFactory(ServiceModule serviceModule0, Provider provider0) {
        this.a = serviceModule0;
        this.b = provider0;
    }

    public static ServiceModule_ProvideEntryStatisticsServiceFactory create(ServiceModule serviceModule0, Provider provider0) {
        return new ServiceModule_ProvideEntryStatisticsServiceFactory(serviceModule0, provider0);
    }

    public EntryStatisticsService get() {
        Retrofit retrofit0 = (Retrofit)this.b.get();
        return ServiceModule_ProvideEntryStatisticsServiceFactory.provideEntryStatisticsService(this.a, retrofit0);
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static EntryStatisticsService provideEntryStatisticsService(ServiceModule serviceModule0, Retrofit retrofit0) {
        return (EntryStatisticsService)Preconditions.checkNotNullFromProvides(serviceModule0.provideEntryStatisticsService(retrofit0));
    }
}

