package com.kakao.tistory.data.repository;

import com.kakao.tistory.domain.repository.ThrowableRepository;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
public final class EntryFileRepositoryImpl_MembersInjector implements MembersInjector {
    public final Provider a;

    public EntryFileRepositoryImpl_MembersInjector(Provider provider0) {
        this.a = provider0;
    }

    public static MembersInjector create(Provider provider0) {
        return new EntryFileRepositoryImpl_MembersInjector(provider0);
    }

    public void injectMembers(EntryFileRepositoryImpl entryFileRepositoryImpl0) {
        BaseRepository_MembersInjector.injectThrowableRepository(entryFileRepositoryImpl0, ((ThrowableRepository)this.a.get()));
    }

    @Override  // dagger.MembersInjector
    public void injectMembers(Object object0) {
        this.injectMembers(((EntryFileRepositoryImpl)object0));
    }
}

