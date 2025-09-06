package com.kakao.tistory.presentation.main;

import androidx.lifecycle.SavedStateHandle;
import com.kakao.tistory.domain.repository.AccountRepository;
import com.kakao.tistory.domain.repository.AutoSaveRepository;
import com.kakao.tistory.domain.repository.NotificationRepository;
import com.kakao.tistory.domain.usecase.CheckLatestEditEntryUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class MainAppViewModel_Factory implements Factory {
    public final Provider a;
    public final Provider b;
    public final Provider c;
    public final Provider d;
    public final Provider e;

    public MainAppViewModel_Factory(Provider provider0, Provider provider1, Provider provider2, Provider provider3, Provider provider4) {
        this.a = provider0;
        this.b = provider1;
        this.c = provider2;
        this.d = provider3;
        this.e = provider4;
    }

    public static MainAppViewModel_Factory create(Provider provider0, Provider provider1, Provider provider2, Provider provider3, Provider provider4) {
        return new MainAppViewModel_Factory(provider0, provider1, provider2, provider3, provider4);
    }

    public MainAppViewModel get() {
        return MainAppViewModel_Factory.newInstance(((SavedStateHandle)this.a.get()), ((AccountRepository)this.b.get()), ((NotificationRepository)this.c.get()), ((CheckLatestEditEntryUseCase)this.d.get()), ((AutoSaveRepository)this.e.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static MainAppViewModel newInstance(SavedStateHandle savedStateHandle0, AccountRepository accountRepository0, NotificationRepository notificationRepository0, CheckLatestEditEntryUseCase checkLatestEditEntryUseCase0, AutoSaveRepository autoSaveRepository0) {
        return new MainAppViewModel(savedStateHandle0, accountRepository0, notificationRepository0, checkLatestEditEntryUseCase0, autoSaveRepository0);
    }
}

