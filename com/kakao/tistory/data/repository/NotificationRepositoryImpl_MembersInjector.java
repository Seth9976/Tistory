package com.kakao.tistory.data.repository;

import com.kakao.tistory.domain.repository.ThrowableRepository;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
public final class NotificationRepositoryImpl_MembersInjector implements MembersInjector {
    public final Provider a;

    public NotificationRepositoryImpl_MembersInjector(Provider provider0) {
        this.a = provider0;
    }

    public static MembersInjector create(Provider provider0) {
        return new NotificationRepositoryImpl_MembersInjector(provider0);
    }

    public void injectMembers(NotificationRepositoryImpl notificationRepositoryImpl0) {
        BaseRepository_MembersInjector.injectThrowableRepository(notificationRepositoryImpl0, ((ThrowableRepository)this.a.get()));
    }

    @Override  // dagger.MembersInjector
    public void injectMembers(Object object0) {
        this.injectMembers(((NotificationRepositoryImpl)object0));
    }
}

