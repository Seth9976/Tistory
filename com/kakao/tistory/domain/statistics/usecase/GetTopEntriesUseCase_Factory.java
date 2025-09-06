package com.kakao.tistory.domain.statistics.usecase;

import com.kakao.tistory.domain.statistics.repository.StatisticsRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class GetTopEntriesUseCase_Factory implements Factory {
    public final Provider a;

    public GetTopEntriesUseCase_Factory(Provider provider0) {
        this.a = provider0;
    }

    public static GetTopEntriesUseCase_Factory create(Provider provider0) {
        return new GetTopEntriesUseCase_Factory(provider0);
    }

    public GetTopEntriesUseCase get() {
        return GetTopEntriesUseCase_Factory.newInstance(((StatisticsRepository)this.a.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static GetTopEntriesUseCase newInstance(StatisticsRepository statisticsRepository0) {
        return new GetTopEntriesUseCase(statisticsRepository0);
    }
}

