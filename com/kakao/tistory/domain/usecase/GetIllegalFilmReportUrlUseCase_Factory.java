package com.kakao.tistory.domain.usecase;

import com.kakao.tistory.domain.repository.IllegalFilmReportRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class GetIllegalFilmReportUrlUseCase_Factory implements Factory {
    public final Provider a;

    public GetIllegalFilmReportUrlUseCase_Factory(Provider provider0) {
        this.a = provider0;
    }

    public static GetIllegalFilmReportUrlUseCase_Factory create(Provider provider0) {
        return new GetIllegalFilmReportUrlUseCase_Factory(provider0);
    }

    public GetIllegalFilmReportUrlUseCase get() {
        return GetIllegalFilmReportUrlUseCase_Factory.newInstance(((IllegalFilmReportRepository)this.a.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static GetIllegalFilmReportUrlUseCase newInstance(IllegalFilmReportRepository illegalFilmReportRepository0) {
        return new GetIllegalFilmReportUrlUseCase(illegalFilmReportRepository0);
    }
}

