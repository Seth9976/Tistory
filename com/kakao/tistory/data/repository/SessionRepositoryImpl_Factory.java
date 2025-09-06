package com.kakao.tistory.data.repository;

import com.kakao.tistory.data.preference.AppSessionPreference;
import com.kakao.tistory.data.service.AccountService;
import com.kakao.tistory.domain.repository.ThrowableRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class SessionRepositoryImpl_Factory implements Factory {
    public final Provider a;
    public final Provider b;
    public final Provider c;

    public SessionRepositoryImpl_Factory(Provider provider0, Provider provider1, Provider provider2) {
        this.a = provider0;
        this.b = provider1;
        this.c = provider2;
    }

    public static SessionRepositoryImpl_Factory create(Provider provider0, Provider provider1, Provider provider2) {
        return new SessionRepositoryImpl_Factory(provider0, provider1, provider2);
    }

    public SessionRepositoryImpl get() {
        SessionRepositoryImpl sessionRepositoryImpl0 = SessionRepositoryImpl_Factory.newInstance(((AppSessionPreference)this.a.get()), ((AccountService)this.b.get()));
        BaseRepository_MembersInjector.injectThrowableRepository(sessionRepositoryImpl0, ((ThrowableRepository)this.c.get()));
        return sessionRepositoryImpl0;
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static SessionRepositoryImpl newInstance(AppSessionPreference appSessionPreference0, AccountService accountService0) {
        return new SessionRepositoryImpl(appSessionPreference0, accountService0);
    }
}

