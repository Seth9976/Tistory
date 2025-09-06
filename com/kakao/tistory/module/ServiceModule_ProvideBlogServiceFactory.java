package com.kakao.tistory.module;

import com.kakao.tistory.data.blog.api.BlogService;
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
public final class ServiceModule_ProvideBlogServiceFactory implements Factory {
    public final ServiceModule a;
    public final Provider b;

    public ServiceModule_ProvideBlogServiceFactory(ServiceModule serviceModule0, Provider provider0) {
        this.a = serviceModule0;
        this.b = provider0;
    }

    public static ServiceModule_ProvideBlogServiceFactory create(ServiceModule serviceModule0, Provider provider0) {
        return new ServiceModule_ProvideBlogServiceFactory(serviceModule0, provider0);
    }

    public BlogService get() {
        Retrofit retrofit0 = (Retrofit)this.b.get();
        return ServiceModule_ProvideBlogServiceFactory.provideBlogService(this.a, retrofit0);
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static BlogService provideBlogService(ServiceModule serviceModule0, Retrofit retrofit0) {
        return (BlogService)Preconditions.checkNotNullFromProvides(serviceModule0.provideBlogService(retrofit0));
    }
}

