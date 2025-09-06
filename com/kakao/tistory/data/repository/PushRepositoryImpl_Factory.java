package com.kakao.tistory.data.repository;

import com.kakao.tistory.data.preference.DeviceInfoPreference;
import com.kakao.tistory.data.service.PushService;
import com.kakao.tistory.domain.repository.ThrowableRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class PushRepositoryImpl_Factory implements Factory {
    public final Provider a;
    public final Provider b;
    public final Provider c;

    public PushRepositoryImpl_Factory(Provider provider0, Provider provider1, Provider provider2) {
        this.a = provider0;
        this.b = provider1;
        this.c = provider2;
    }

    public static PushRepositoryImpl_Factory create(Provider provider0, Provider provider1, Provider provider2) {
        return new PushRepositoryImpl_Factory(provider0, provider1, provider2);
    }

    public PushRepositoryImpl get() {
        PushRepositoryImpl pushRepositoryImpl0 = PushRepositoryImpl_Factory.newInstance(((DeviceInfoPreference)this.a.get()), ((PushService)this.b.get()));
        BaseRepository_MembersInjector.injectThrowableRepository(pushRepositoryImpl0, ((ThrowableRepository)this.c.get()));
        return pushRepositoryImpl0;
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static PushRepositoryImpl newInstance(DeviceInfoPreference deviceInfoPreference0, PushService pushService0) {
        return new PushRepositoryImpl(deviceInfoPreference0, pushService0);
    }
}

