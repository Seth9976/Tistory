package com.kakao.tistory.data.usecase;

import com.kakao.tistory.domain.repository.AccountRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class LoginByTokenUseCase_Factory implements Factory {
    public final Provider a;

    public LoginByTokenUseCase_Factory(Provider provider0) {
        this.a = provider0;
    }

    public static LoginByTokenUseCase_Factory create(Provider provider0) {
        return new LoginByTokenUseCase_Factory(provider0);
    }

    public LoginByTokenUseCase get() {
        return LoginByTokenUseCase_Factory.newInstance(((AccountRepository)this.a.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static LoginByTokenUseCase newInstance(AccountRepository accountRepository0) {
        return new LoginByTokenUseCase(accountRepository0);
    }
}

