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
public final class ReportGuestbookUseCase_Factory implements Factory {
    public final Provider a;

    public ReportGuestbookUseCase_Factory(Provider provider0) {
        this.a = provider0;
    }

    public static ReportGuestbookUseCase_Factory create(Provider provider0) {
        return new ReportGuestbookUseCase_Factory(provider0);
    }

    public ReportGuestbookUseCase get() {
        return ReportGuestbookUseCase_Factory.newInstance(((GuestbookRepository)this.a.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static ReportGuestbookUseCase newInstance(GuestbookRepository guestbookRepository0) {
        return new ReportGuestbookUseCase(guestbookRepository0);
    }
}

