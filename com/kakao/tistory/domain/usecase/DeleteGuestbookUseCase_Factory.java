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
public final class DeleteGuestbookUseCase_Factory implements Factory {
    public final Provider a;

    public DeleteGuestbookUseCase_Factory(Provider provider0) {
        this.a = provider0;
    }

    public static DeleteGuestbookUseCase_Factory create(Provider provider0) {
        return new DeleteGuestbookUseCase_Factory(provider0);
    }

    public DeleteGuestbookUseCase get() {
        return DeleteGuestbookUseCase_Factory.newInstance(((GuestbookRepository)this.a.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static DeleteGuestbookUseCase newInstance(GuestbookRepository guestbookRepository0) {
        return new DeleteGuestbookUseCase(guestbookRepository0);
    }
}

