package com.kakao.tistory.module;

import com.kakao.tistory.domain.repository.AccountRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import org.jetbrains.annotations.Nullable;

@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
@ScopeMetadata
public final class RetrofitModule_ProvideAccessTokenFactory implements Factory {
    public final RetrofitModule a;
    public final Provider b;

    public RetrofitModule_ProvideAccessTokenFactory(RetrofitModule retrofitModule0, Provider provider0) {
        this.a = retrofitModule0;
        this.b = provider0;
    }

    public static RetrofitModule_ProvideAccessTokenFactory create(RetrofitModule retrofitModule0, Provider provider0) {
        return new RetrofitModule_ProvideAccessTokenFactory(retrofitModule0, provider0);
    }

    @Override  // javax.inject.Provider
    @Nullable
    public Object get() {
        return this.get();
    }

    @Nullable
    public String get() {
        AccountRepository accountRepository0 = (AccountRepository)this.b.get();
        return RetrofitModule_ProvideAccessTokenFactory.provideAccessToken(this.a, accountRepository0);
    }

    @Nullable
    public static String provideAccessToken(RetrofitModule retrofitModule0, AccountRepository accountRepository0) {
        return retrofitModule0.provideAccessToken(accountRepository0);
    }
}

