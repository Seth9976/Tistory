package com.kakao.tistory.module;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata("javax.inject.Singleton")
public final class RetrofitModule_ProvideOkHttpClientFactory implements Factory {
    public final RetrofitModule a;
    public final Provider b;
    public final Provider c;

    public RetrofitModule_ProvideOkHttpClientFactory(RetrofitModule retrofitModule0, Provider provider0, Provider provider1) {
        this.a = retrofitModule0;
        this.b = provider0;
        this.c = provider1;
    }

    public static RetrofitModule_ProvideOkHttpClientFactory create(RetrofitModule retrofitModule0, Provider provider0, Provider provider1) {
        return new RetrofitModule_ProvideOkHttpClientFactory(retrofitModule0, provider0, provider1);
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public OkHttpClient get() {
        Interceptor interceptor0 = (Interceptor)this.b.get();
        HttpLoggingInterceptor httpLoggingInterceptor0 = (HttpLoggingInterceptor)this.c.get();
        return RetrofitModule_ProvideOkHttpClientFactory.provideOkHttpClient(this.a, interceptor0, httpLoggingInterceptor0);
    }

    public static OkHttpClient provideOkHttpClient(RetrofitModule retrofitModule0, Interceptor interceptor0, HttpLoggingInterceptor httpLoggingInterceptor0) {
        return (OkHttpClient)Preconditions.checkNotNullFromProvides(retrofitModule0.provideOkHttpClient(interceptor0, httpLoggingInterceptor0));
    }
}

