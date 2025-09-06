package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.data.preference.DeviceInfoPreference;
import com.kakao.tistory.domain.entity.BuildType;
import com.kakao.tistory.domain.repository.AccountRepository;
import com.kakao.tistory.domain.repository.PushRepository;
import com.kakao.tistory.domain.usecase.GetAppInfoUseCase;
import com.kakao.tistory.domain.usecase.LogoutUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class SettingViewModel_Factory implements Factory {
    public final Provider a;
    public final Provider b;
    public final Provider c;
    public final Provider d;
    public final Provider e;
    public final Provider f;

    public SettingViewModel_Factory(Provider provider0, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.a = provider0;
        this.b = provider1;
        this.c = provider2;
        this.d = provider3;
        this.e = provider4;
        this.f = provider5;
    }

    public static SettingViewModel_Factory create(Provider provider0, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new SettingViewModel_Factory(provider0, provider1, provider2, provider3, provider4, provider5);
    }

    public SettingViewModel get() {
        return SettingViewModel_Factory.newInstance(((AccountRepository)this.a.get()), ((GetAppInfoUseCase)this.b.get()), ((PushRepository)this.c.get()), ((DeviceInfoPreference)this.d.get()), ((LogoutUseCase)this.e.get()), ((BuildType)this.f.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static SettingViewModel newInstance(AccountRepository accountRepository0, GetAppInfoUseCase getAppInfoUseCase0, PushRepository pushRepository0, DeviceInfoPreference deviceInfoPreference0, LogoutUseCase logoutUseCase0, BuildType buildType0) {
        return new SettingViewModel(accountRepository0, getAppInfoUseCase0, pushRepository0, deviceInfoPreference0, logoutUseCase0, buildType0);
    }
}

