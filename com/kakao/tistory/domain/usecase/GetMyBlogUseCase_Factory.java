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
public final class GetMyBlogUseCase_Factory implements Factory {
    public final Provider a;

    public GetMyBlogUseCase_Factory(Provider provider0) {
        this.a = provider0;
    }

    public static GetMyBlogUseCase_Factory create(Provider provider0) {
        return new GetMyBlogUseCase_Factory(provider0);
    }

    public GetMyBlogUseCase get() {
        return GetMyBlogUseCase_Factory.newInstance(((AccountRepository)this.a.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static GetMyBlogUseCase newInstance(AccountRepository accountRepository0) {
        return new GetMyBlogUseCase(accountRepository0);
    }
}

