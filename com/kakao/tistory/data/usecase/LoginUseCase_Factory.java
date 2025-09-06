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
public final class LoginUseCase_Factory implements Factory {
    public final Provider a;

    public LoginUseCase_Factory(Provider provider0) {
        this.a = provider0;
    }

    public static LoginUseCase_Factory create(Provider provider0) {
        return new LoginUseCase_Factory(provider0);
    }

    public LoginUseCase get() {
        return LoginUseCase_Factory.newInstance(((AccountRepository)this.a.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static LoginUseCase newInstance(AccountRepository accountRepository0) {
        return new LoginUseCase(accountRepository0);
    }
}

