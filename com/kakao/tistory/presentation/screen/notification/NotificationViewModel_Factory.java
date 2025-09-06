package com.kakao.tistory.presentation.screen.notification;

import com.kakao.tistory.domain.repository.AccountRepository;
import com.kakao.tistory.domain.repository.NotificationRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class NotificationViewModel_Factory implements Factory {
    public final Provider a;
    public final Provider b;

    public NotificationViewModel_Factory(Provider provider0, Provider provider1) {
        this.a = provider0;
        this.b = provider1;
    }

    public static NotificationViewModel_Factory create(Provider provider0, Provider provider1) {
        return new NotificationViewModel_Factory(provider0, provider1);
    }

    public NotificationViewModel get() {
        return NotificationViewModel_Factory.newInstance(((AccountRepository)this.a.get()), ((NotificationRepository)this.b.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static NotificationViewModel newInstance(AccountRepository accountRepository0, NotificationRepository notificationRepository0) {
        return new NotificationViewModel(accountRepository0, notificationRepository0);
    }
}

