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
public final class LogoutUseCase_Factory implements Factory {
    public final Provider a;

    public LogoutUseCase_Factory(Provider provider0) {
        this.a = provider0;
    }

    public static LogoutUseCase_Factory create(Provider provider0) {
        return new LogoutUseCase_Factory(provider0);
    }

    public LogoutUseCase get() {
        return LogoutUseCase_Factory.newInstance(((AccountRepository)this.a.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static LogoutUseCase newInstance(AccountRepository accountRepository0) {
        return new LogoutUseCase(accountRepository0);
    }
}

