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
public final class LoginByKakaoUseCase_Factory implements Factory {
    public final Provider a;

    public LoginByKakaoUseCase_Factory(Provider provider0) {
        this.a = provider0;
    }

    public static LoginByKakaoUseCase_Factory create(Provider provider0) {
        return new LoginByKakaoUseCase_Factory(provider0);
    }

    public LoginByKakaoUseCase get() {
        return LoginByKakaoUseCase_Factory.newInstance(((AccountRepository)this.a.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static LoginByKakaoUseCase newInstance(AccountRepository accountRepository0) {
        return new LoginByKakaoUseCase(accountRepository0);
    }
}

