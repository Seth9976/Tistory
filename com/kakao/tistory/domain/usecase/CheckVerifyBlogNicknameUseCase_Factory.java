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
public final class CheckVerifyBlogNicknameUseCase_Factory implements Factory {
    public final Provider a;

    public CheckVerifyBlogNicknameUseCase_Factory(Provider provider0) {
        this.a = provider0;
    }

    public static CheckVerifyBlogNicknameUseCase_Factory create(Provider provider0) {
        return new CheckVerifyBlogNicknameUseCase_Factory(provider0);
    }

    public CheckVerifyBlogNicknameUseCase get() {
        return CheckVerifyBlogNicknameUseCase_Factory.newInstance(((AccountRepository)this.a.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static CheckVerifyBlogNicknameUseCase newInstance(AccountRepository accountRepository0) {
        return new CheckVerifyBlogNicknameUseCase(accountRepository0);
    }
}

