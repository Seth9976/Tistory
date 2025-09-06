package com.kakao.tistory.module;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
@ScopeMetadata("javax.inject.Singleton")
public final class RetrofitModule_ProvideRetrofitFactory implements Factory {
    public final RetrofitModule a;
    public final Provider b;
    public final Provider c;

    public RetrofitModule_ProvideRetrofitFactory(RetrofitModule retrofitModule0, Provider provider0, Provider provider1) {
        this.a = retrofitModule0;
        this.b = provider0;
        this.c = provider1;
    }

    public static RetrofitModule_ProvideRetrofitFactory create(RetrofitModule retrofitModule0, Provider provider0, Provider provider1) {
        return new RetrofitModule_ProvideRetrofitFactory(retrofitModule0, provider0, provider1);
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public Retrofit get() {
        String s = (String)this.b.get();
        OkHttpClient okHttpClient0 = (OkHttpClient)this.c.get();
        return RetrofitModule_ProvideRetrofitFactory.provideRetrofit(this.a, s, okHttpClient0);
    }

    public static Retrofit provideRetrofit(RetrofitModule retrofitModule0, String s, OkHttpClient okHttpClient0) {
        return (Retrofit)Preconditions.checkNotNullFromProvides(retrofitModule0.provideRetrofit(s, okHttpClient0));
    }
}

