package com.kakao.tistory.data.repository;

import com.kakao.tistory.data.service.NotificationService;
import com.kakao.tistory.domain.repository.ThrowableRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class NotificationRepositoryImpl_Factory implements Factory {
    public final Provider a;
    public final Provider b;

    public NotificationRepositoryImpl_Factory(Provider provider0, Provider provider1) {
        this.a = provider0;
        this.b = provider1;
    }

    public static NotificationRepositoryImpl_Factory create(Provider provider0, Provider provider1) {
        return new NotificationRepositoryImpl_Factory(provider0, provider1);
    }

    public NotificationRepositoryImpl get() {
        NotificationRepositoryImpl notificationRepositoryImpl0 = NotificationRepositoryImpl_Factory.newInstance(((NotificationService)this.a.get()));
        BaseRepository_MembersInjector.injectThrowableRepository(notificationRepositoryImpl0, ((ThrowableRepository)this.b.get()));
        return notificationRepositoryImpl0;
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static NotificationRepositoryImpl newInstance(NotificationService notificationService0) {
        return new NotificationRepositoryImpl(notificationService0);
    }
}

