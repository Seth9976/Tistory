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
public final class GuestbookModifyViewModel_Factory implements Factory {
    public final Provider a;

    public GuestbookModifyViewModel_Factory(Provider provider0) {
        this.a = provider0;
    }

    public static GuestbookModifyViewModel_Factory create(Provider provider0) {
        return new GuestbookModifyViewModel_Factory(provider0);
    }

    public GuestbookModifyViewModel get() {
        return GuestbookModifyViewModel_Factory.newInstance(((UpdateGuestbookUseCase)this.a.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static GuestbookModifyViewModel newInstance(UpdateGuestbookUseCase updateGuestbookUseCase0) {
        return new GuestbookModifyViewModel(updateGuestbookUseCase0);
    }
}

