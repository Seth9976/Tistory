package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.data.preference.DeviceInfoPreference;
import com.kakao.tistory.data.usecase.LoginUseCase;
import com.kakao.tistory.data.usecase.PushTokenUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class TistoryLoginViewModel_Factory implements Factory {
    public final Provider a;
    public final Provider b;
    public final Provider c;

    public TistoryLoginViewModel_Factory(Provider provider0, Provider provider1, Provider provider2) {
        this.a = provider0;
        this.b = provider1;
        this.c = provider2;
    }

    public static TistoryLoginViewModel_Factory create(Provider provider0, Provider provider1, Provider provider2) {
        return new TistoryLoginViewModel_Factory(provider0, provider1, provider2);
    }

    public TistoryLoginViewModel get() {
        return TistoryLoginViewModel_Factory.newInstance(((LoginUseCase)this.a.get()), ((PushTokenUseCase)this.b.get()), ((DeviceInfoPreference)this.c.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static TistoryLoginViewModel newInstance(LoginUseCase loginUseCase0, PushTokenUseCase pushTokenUseCase0, DeviceInfoPreference deviceInfoPreference0) {
        return new TistoryLoginViewModel(loginUseCase0, pushTokenUseCase0, deviceInfoPreference0);
    }
}

