package com.kakao.tistory.data.repository;

import com.kakao.tistory.data.service.SecretLabService;
import com.kakao.tistory.domain.repository.ThrowableRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class SecretLabRepositoryImpl_Factory implements Factory {
    public final Provider a;
    public final Provider b;

    public SecretLabRepositoryImpl_Factory(Provider provider0, Provider provider1) {
        this.a = provider0;
        this.b = provider1;
    }

    public static SecretLabRepositoryImpl_Factory create(Provider provider0, Provider provider1) {
        return new SecretLabRepositoryImpl_Factory(provider0, provider1);
    }

    public SecretLabRepositoryImpl get() {
        SecretLabRepositoryImpl secretLabRepositoryImpl0 = SecretLabRepositoryImpl_Factory.newInstance(((SecretLabService)this.a.get()));
        BaseRepository_MembersInjector.injectThrowableRepository(secretLabRepositoryImpl0, ((ThrowableRepository)this.b.get()));
        return secretLabRepositoryImpl0;
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static SecretLabRepositoryImpl newInstance(SecretLabService secretLabService0) {
        return new SecretLabRepositoryImpl(secretLabService0);
    }
}

