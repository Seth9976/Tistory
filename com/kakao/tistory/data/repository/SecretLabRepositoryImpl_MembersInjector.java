package com.kakao.tistory.data.repository;

import com.kakao.tistory.domain.repository.ThrowableRepository;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
public final class SecretLabRepositoryImpl_MembersInjector implements MembersInjector {
    public final Provider a;

    public SecretLabRepositoryImpl_MembersInjector(Provider provider0) {
        this.a = provider0;
    }

    public static MembersInjector create(Provider provider0) {
        return new SecretLabRepositoryImpl_MembersInjector(provider0);
    }

    public void injectMembers(SecretLabRepositoryImpl secretLabRepositoryImpl0) {
        BaseRepository_MembersInjector.injectThrowableRepository(secretLabRepositoryImpl0, ((ThrowableRepository)this.a.get()));
    }

    @Override  // dagger.MembersInjector
    public void injectMembers(Object object0) {
        this.injectMembers(((SecretLabRepositoryImpl)object0));
    }
}

