package com.kakao.tistory.data.repository;

import android.content.ContentResolver;
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
public final class EntryFileRepositoryImpl_Factory implements Factory {
    public final Provider a;
    public final Provider b;
    public final Provider c;

    public EntryFileRepositoryImpl_Factory(Provider provider0, Provider provider1, Provider provider2) {
        this.a = provider0;
        this.b = provider1;
        this.c = provider2;
    }

    public static EntryFileRepositoryImpl_Factory create(Provider provider0, Provider provider1, Provider provider2) {
        return new EntryFileRepositoryImpl_Factory(provider0, provider1, provider2);
    }

    public EntryFileRepositoryImpl get() {
        EntryFileRepositoryImpl entryFileRepositoryImpl0 = EntryFileRepositoryImpl_Factory.newInstance(((EntryService)this.a.get()), ((ContentResolver)this.b.get()));
        BaseRepository_MembersInjector.injectThrowableRepository(entryFileRepositoryImpl0, ((ThrowableRepository)this.c.get()));
        return entryFileRepositoryImpl0;
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static EntryFileRepositoryImpl newInstance(EntryService entryService0, ContentResolver contentResolver0) {
        return new EntryFileRepositoryImpl(entryService0, contentResolver0);
    }
}

