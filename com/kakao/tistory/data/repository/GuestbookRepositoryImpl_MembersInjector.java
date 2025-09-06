package com.kakao.tistory.data.repository;

import com.kakao.tistory.domain.repository.ThrowableRepository;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
public final class GuestbookRepositoryImpl_MembersInjector implements MembersInjector {
    public final Provider a;

    public GuestbookRepositoryImpl_MembersInjector(Provider provider0) {
        this.a = provider0;
    }

    public static MembersInjector create(Provider provider0) {
        return new GuestbookRepositoryImpl_MembersInjector(provider0);
    }

    public void injectMembers(GuestbookRepositoryImpl guestbookRepositoryImpl0) {
        BaseRepository_MembersInjector.injectThrowableRepository(guestbookRepositoryImpl0, ((ThrowableRepository)this.a.get()));
    }

    @Override  // dagger.MembersInjector
    public void injectMembers(Object object0) {
        this.injectMembers(((GuestbookRepositoryImpl)object0));
    }
}

