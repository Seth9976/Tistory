package com.kakao.tistory.module;

import com.kakao.tistory.domain.entity.AdInfo;
import com.kakao.tistory.domain.repository.ADIDRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import org.jetbrains.annotations.Nullable;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class RetrofitModule_ProvideAdInfoFactory implements Factory {
    public final RetrofitModule a;
    public final Provider b;

    public RetrofitModule_ProvideAdInfoFactory(RetrofitModule retrofitModule0, Provider provider0) {
        this.a = retrofitModule0;
        this.b = provider0;
    }

    public static RetrofitModule_ProvideAdInfoFactory create(RetrofitModule retrofitModule0, Provider provider0) {
        return new RetrofitModule_ProvideAdInfoFactory(retrofitModule0, provider0);
    }

    @Nullable
    public AdInfo get() {
        ADIDRepository aDIDRepository0 = (ADIDRepository)this.b.get();
        return RetrofitModule_ProvideAdInfoFactory.provideAdInfo(this.a, aDIDRepository0);
    }

    @Override  // javax.inject.Provider
    @Nullable
    public Object get() {
        return this.get();
    }

    @Nullable
    public static AdInfo provideAdInfo(RetrofitModule retrofitModule0, ADIDRepository aDIDRepository0) {
        return retrofitModule0.provideAdInfo(aDIDRepository0);
    }
}

