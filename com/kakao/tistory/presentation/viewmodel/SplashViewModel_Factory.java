package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.data.preference.DeviceInfoPreference;
import com.kakao.tistory.data.usecase.LoginByTokenUseCase;
import com.kakao.tistory.data.usecase.PushTokenUseCase;
import com.kakao.tistory.domain.repository.AccountRepository;
import com.kakao.tistory.domain.repository.NotificationRepository;
import com.kakao.tistory.domain.usecase.GetAppInfoUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class SplashViewModel_Factory implements Factory {
    public final Provider a;
    public final Provider b;
    public final Provider c;
    public final Provider d;
    public final Provider e;
    public final Provider f;

    public SplashViewModel_Factory(Provider provider0, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.a = provider0;
        this.b = provider1;
        this.c = provider2;
        this.d = provider3;
        this.e = provider4;
        this.f = provider5;
    }

    public static SplashViewModel_Factory create(Provider provider0, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new SplashViewModel_Factory(provider0, provider1, provider2, provider3, provider4, provider5);
    }

    public SplashViewModel get() {
        return SplashViewModel_Factory.newInstance(((GetAppInfoUseCase)this.a.get()), ((LoginByTokenUseCase)this.b.get()), ((PushTokenUseCase)this.c.get()), ((NotificationRepository)this.d.get()), ((DeviceInfoPreference)this.e.get()), ((AccountRepository)this.f.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static SplashViewModel newInstance(GetAppInfoUseCase getAppInfoUseCase0, LoginByTokenUseCase loginByTokenUseCase0, PushTokenUseCase pushTokenUseCase0, NotificationRepository notificationRepository0, DeviceInfoPreference deviceInfoPreference0, AccountRepository accountRepository0) {
        return new SplashViewModel(getAppInfoUseCase0, loginByTokenUseCase0, pushTokenUseCase0, notificationRepository0, deviceInfoPreference0, accountRepository0);
    }
}

