package com.kakao.tistory.data.repository;

import com.kakao.tistory.data.service.IllegalFilmReportService;
import com.kakao.tistory.domain.repository.ThrowableRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class IllegalFilmReportRepositoryImpl_Factory implements Factory {
    public final Provider a;
    public final Provider b;

    public IllegalFilmReportRepositoryImpl_Factory(Provider provider0, Provider provider1) {
        this.a = provider0;
        this.b = provider1;
    }

    public static IllegalFilmReportRepositoryImpl_Factory create(Provider provider0, Provider provider1) {
        return new IllegalFilmReportRepositoryImpl_Factory(provider0, provider1);
    }

    public IllegalFilmReportRepositoryImpl get() {
        IllegalFilmReportRepositoryImpl illegalFilmReportRepositoryImpl0 = IllegalFilmReportRepositoryImpl_Factory.newInstance(((IllegalFilmReportService)this.a.get()));
        BaseRepository_MembersInjector.injectThrowableRepository(illegalFilmReportRepositoryImpl0, ((ThrowableRepository)this.b.get()));
        return illegalFilmReportRepositoryImpl0;
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static IllegalFilmReportRepositoryImpl newInstance(IllegalFilmReportService illegalFilmReportService0) {
        return new IllegalFilmReportRepositoryImpl(illegalFilmReportService0);
    }
}

