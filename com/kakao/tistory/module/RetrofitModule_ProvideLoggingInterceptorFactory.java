package com.kakao.tistory.module;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import okhttp3.logging.HttpLoggingInterceptor;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata("javax.inject.Singleton")
public final class RetrofitModule_ProvideLoggingInterceptorFactory implements Factory {
    public final RetrofitModule a;

    public RetrofitModule_ProvideLoggingInterceptorFactory(RetrofitModule retrofitModule0) {
        this.a = retrofitModule0;
    }

    public static RetrofitModule_ProvideLoggingInterceptorFactory create(RetrofitModule retrofitModule0) {
        return new RetrofitModule_ProvideLoggingInterceptorFactory(retrofitModule0);
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public HttpLoggingInterceptor get() {
        return RetrofitModule_ProvideLoggingInterceptorFactory.provideLoggingInterceptor(this.a);
    }

    public static HttpLoggingInterceptor provideLoggingInterceptor(RetrofitModule retrofitModule0) {
        return (HttpLoggingInterceptor)Preconditions.checkNotNullFromProvides(retrofitModule0.provideLoggingInterceptor());
    }
}

