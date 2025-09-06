package com.kakao.tistory.data.repository;

import com.kakao.tistory.data.service.GuestbookService;
import com.kakao.tistory.domain.repository.ThrowableRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class GuestbookRepositoryImpl_Factory implements Factory {
    public final Provider a;
    public final Provider b;

    public GuestbookRepositoryImpl_Factory(Provider provider0, Provider provider1) {
        this.a = provider0;
        this.b = provider1;
    }

    public static GuestbookRepositoryImpl_Factory create(Provider provider0, Provider provider1) {
        return new GuestbookRepositoryImpl_Factory(provider0, provider1);
    }

    public GuestbookRepositoryImpl get() {
        GuestbookRepositoryImpl guestbookRepositoryImpl0 = GuestbookRepositoryImpl_Factory.newInstance(((GuestbookService)this.a.get()));
        BaseRepository_MembersInjector.injectThrowableRepository(guestbookRepositoryImpl0, ((ThrowableRepository)this.b.get()));
        return guestbookRepositoryImpl0;
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static GuestbookRepositoryImpl newInstance(GuestbookService guestbookService0) {
        return new GuestbookRepositoryImpl(guestbookService0);
    }
}

