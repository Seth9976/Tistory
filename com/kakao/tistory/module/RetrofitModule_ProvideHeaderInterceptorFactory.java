package com.kakao.tistory.module;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import okhttp3.Interceptor;

@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
@ScopeMetadata("javax.inject.Singleton")
public final class RetrofitModule_ProvideHeaderInterceptorFactory implements Factory {
    public final RetrofitModule a;
    public final Provider b;
    public final Provider c;

    public RetrofitModule_ProvideHeaderInterceptorFactory(RetrofitModule retrofitModule0, Provider provider0, Provider provider1) {
        this.a = retrofitModule0;
        this.b = provider0;
        this.c = provider1;
    }

    public static RetrofitModule_ProvideHeaderInterceptorFactory create(RetrofitModule retrofitModule0, Provider provider0, Provider provider1) {
        return new RetrofitModule_ProvideHeaderInterceptorFactory(retrofitModule0, provider0, provider1);
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public Interceptor get() {
        return RetrofitModule_ProvideHeaderInterceptorFactory.provideHeaderInterceptor(this.a, this.b, this.c);
    }

    public static Interceptor provideHeaderInterceptor(RetrofitModule retrofitModule0, Provider provider0, Provider provider1) {
        return (Interceptor)Preconditions.checkNotNullFromProvides(retrofitModule0.provideHeaderInterceptor(provider0, provider1));
    }
}

