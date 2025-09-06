package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.data.preference.DeviceInfoPreference;
import com.kakao.tistory.domain.repository.PushRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class PushViewModel_Factory implements Factory {
    public final Provider a;
    public final Provider b;

    public PushViewModel_Factory(Provider provider0, Provider provider1) {
        this.a = provider0;
        this.b = provider1;
    }

    public static PushViewModel_Factory create(Provider provider0, Provider provider1) {
        return new PushViewModel_Factory(provider0, provider1);
    }

    public PushViewModel get() {
        return PushViewModel_Factory.newInstance(((PushRepository)this.a.get()), ((DeviceInfoPreference)this.b.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static PushViewModel newInstance(PushRepository pushRepository0, DeviceInfoPreference deviceInfoPreference0) {
        return new PushViewModel(pushRepository0, deviceInfoPreference0);
    }
}

