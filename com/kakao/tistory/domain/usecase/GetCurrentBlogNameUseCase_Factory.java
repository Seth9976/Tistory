package com.kakao.tistory.domain.usecase;

import com.kakao.tistory.domain.repository.AccountRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class GetCurrentBlogNameUseCase_Factory implements Factory {
    public final Provider a;

    public GetCurrentBlogNameUseCase_Factory(Provider provider0) {
        this.a = provider0;
    }

    public static GetCurrentBlogNameUseCase_Factory create(Provider provider0) {
        return new GetCurrentBlogNameUseCase_Factory(provider0);
    }

    public GetCurrentBlogNameUseCase get() {
        return GetCurrentBlogNameUseCase_Factory.newInstance(((AccountRepository)this.a.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static GetCurrentBlogNameUseCase newInstance(AccountRepository accountRepository0) {
        return new GetCurrentBlogNameUseCase(accountRepository0);
    }
}

