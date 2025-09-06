package com.kakao.tistory.domain.usecase;

import com.kakao.tistory.domain.repository.PushRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class DeletePushTokenUseCase_Factory implements Factory {
    public final Provider a;

    public DeletePushTokenUseCase_Factory(Provider provider0) {
        this.a = provider0;
    }

    public static DeletePushTokenUseCase_Factory create(Provider provider0) {
        return new DeletePushTokenUseCase_Factory(provider0);
    }

    public DeletePushTokenUseCase get() {
        return DeletePushTokenUseCase_Factory.newInstance(((PushRepository)this.a.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static DeletePushTokenUseCase newInstance(PushRepository pushRepository0) {
        return new DeletePushTokenUseCase(pushRepository0);
    }
}

