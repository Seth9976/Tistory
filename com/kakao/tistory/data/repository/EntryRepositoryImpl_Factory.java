package com.kakao.tistory.data.repository;

import com.kakao.tistory.data.service.EntryService;
import com.kakao.tistory.domain.repository.ThrowableRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class EntryRepositoryImpl_Factory implements Factory {
    public final Provider a;
    public final Provider b;

    public EntryRepositoryImpl_Factory(Provider provider0, Provider provider1) {
        this.a = provider0;
        this.b = provider1;
    }

    public static EntryRepositoryImpl_Factory create(Provider provider0, Provider provider1) {
        return new EntryRepositoryImpl_Factory(provider0, provider1);
    }

    public EntryRepositoryImpl get() {
        EntryRepositoryImpl entryRepositoryImpl0 = EntryRepositoryImpl_Factory.newInstance(((EntryService)this.a.get()));
        BaseRepository_MembersInjector.injectThrowableRepository(entryRepositoryImpl0, ((ThrowableRepository)this.b.get()));
        return entryRepositoryImpl0;
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static EntryRepositoryImpl newInstance(EntryService entryService0) {
        return new EntryRepositoryImpl(entryService0);
    }
}

