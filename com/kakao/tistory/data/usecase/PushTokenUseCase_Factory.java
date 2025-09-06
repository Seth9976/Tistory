package com.kakao.tistory.data.usecase;

import com.kakao.tistory.domain.repository.PushRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class PushTokenUseCase_Factory implements Factory {
    public final Provider a;

    public PushTokenUseCase_Factory(Provider provider0) {
        this.a = provider0;
    }

    public static PushTokenUseCase_Factory create(Provider provider0) {
        return new PushTokenUseCase_Factory(provider0);
    }

    public PushTokenUseCase get() {
        return PushTokenUseCase_Factory.newInstance(((PushRepository)this.a.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static PushTokenUseCase newInstance(PushRepository pushRepository0) {
        return new PushTokenUseCase(pushRepository0);
    }
}

