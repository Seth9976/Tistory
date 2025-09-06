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
public final class UnPinGuestBookCommentUseCase_Factory implements Factory {
    public final Provider a;

    public UnPinGuestBookCommentUseCase_Factory(Provider provider0) {
        this.a = provider0;
    }

    public static UnPinGuestBookCommentUseCase_Factory create(Provider provider0) {
        return new UnPinGuestBookCommentUseCase_Factory(provider0);
    }

    public UnPinGuestBookCommentUseCase get() {
        return UnPinGuestBookCommentUseCase_Factory.newInstance(((GuestbookRepository)this.a.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static UnPinGuestBookCommentUseCase newInstance(GuestbookRepository guestbookRepository0) {
        return new UnPinGuestBookCommentUseCase(guestbookRepository0);
    }
}

