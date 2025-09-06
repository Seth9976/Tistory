package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.data.preference.DeviceInfoPreference;
import com.kakao.tistory.data.usecase.CheckSingUpUseCase;
import com.kakao.tistory.data.usecase.LoginByKakaoUseCase;
import com.kakao.tistory.data.usecase.PushTokenUseCase;
import com.kakao.tistory.domain.repository.AppInfoRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class KakaoLoginViewModel_Factory implements Factory {
    public final Provider a;
    public final Provider b;
    public final Provider c;
    public final Provider d;
    public final Provider e;

    public KakaoLoginViewModel_Factory(Provider provider0, Provider provider1, Provider provider2, Provider provider3, Provider provider4) {
        this.a = provider0;
        this.b = provider1;
        this.c = provider2;
        this.d = provider3;
        this.e = provider4;
    }

    public static KakaoLoginViewModel_Factory create(Provider provider0, Provider provider1, Provider provider2, Provider provider3, Provider provider4) {
        return new KakaoLoginViewModel_Factory(provider0, provider1, provider2, provider3, provider4);
    }

    public KakaoLoginViewModel get() {
        return KakaoLoginViewModel_Factory.newInstance(((LoginByKakaoUseCase)this.a.get()), ((CheckSingUpUseCase)this.b.get()), ((PushTokenUseCase)this.c.get()), ((AppInfoRepository)this.d.get()), ((DeviceInfoPreference)this.e.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static KakaoLoginViewModel newInstance(LoginByKakaoUseCase loginByKakaoUseCase0, CheckSingUpUseCase checkSingUpUseCase0, PushTokenUseCase pushTokenUseCase0, AppInfoRepository appInfoRepository0, DeviceInfoPreference deviceInfoPreference0) {
        return new KakaoLoginViewModel(loginByKakaoUseCase0, checkSingUpUseCase0, pushTokenUseCase0, appInfoRepository0, deviceInfoPreference0);
    }
}

