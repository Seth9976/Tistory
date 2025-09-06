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
public final class GetCurrentBlogTitleUseCase_Factory implements Factory {
    public final Provider a;

    public GetCurrentBlogTitleUseCase_Factory(Provider provider0) {
        this.a = provider0;
    }

    public static GetCurrentBlogTitleUseCase_Factory create(Provider provider0) {
        return new GetCurrentBlogTitleUseCase_Factory(provider0);
    }

    public GetCurrentBlogTitleUseCase get() {
        return GetCurrentBlogTitleUseCase_Factory.newInstance(((AccountRepository)this.a.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static GetCurrentBlogTitleUseCase newInstance(AccountRepository accountRepository0) {
        return new GetCurrentBlogTitleUseCase(accountRepository0);
    }
}

