package com.kakao.tistory.presentation.view.comment.guestbook;

import com.kakao.tistory.domain.usecase.UpdateGuestbookUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class PinGuestbookModifyViewModel_Factory implements Factory {
    public final Provider a;

    public PinGuestbookModifyViewModel_Factory(Provider provider0) {
        this.a = provider0;
    }

    public static PinGuestbookModifyViewModel_Factory create(Provider provider0) {
        return new PinGuestbookModifyViewModel_Factory(provider0);
    }

    public PinGuestbookModifyViewModel get() {
        return PinGuestbookModifyViewModel_Factory.newInstance(((UpdateGuestbookUseCase)this.a.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static PinGuestbookModifyViewModel newInstance(UpdateGuestbookUseCase updateGuestbookUseCase0) {
        return new PinGuestbookModifyViewModel(updateGuestbookUseCase0);
    }
}

