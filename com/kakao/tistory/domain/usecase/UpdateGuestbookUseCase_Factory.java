package com.kakao.tistory.domain.usecase;

import com.kakao.tistory.domain.repository.GuestbookRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class UpdateGuestbookUseCase_Factory implements Factory {
    public final Provider a;

    public UpdateGuestbookUseCase_Factory(Provider provider0) {
        this.a = provider0;
    }

    public static UpdateGuestbookUseCase_Factory create(Provider provider0) {
        return new UpdateGuestbookUseCase_Factory(provider0);
    }

    public UpdateGuestbookUseCase get() {
        return UpdateGuestbookUseCase_Factory.newInstance(((GuestbookRepository)this.a.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static UpdateGuestbookUseCase newInstance(GuestbookRepository guestbookRepository0) {
        return new UpdateGuestbookUseCase(guestbookRepository0);
    }
}

