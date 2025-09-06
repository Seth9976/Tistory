package com.kakao.tistory.data.statistics.repository;

import com.kakao.tistory.data.repository.BaseRepository_MembersInjector;
import com.kakao.tistory.data.statistics.service.BlogStatisticsService;
import com.kakao.tistory.domain.repository.ThrowableRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class StatisticsRepositoryImpl_Factory implements Factory {
    public final Provider a;
    public final Provider b;

    public StatisticsRepositoryImpl_Factory(Provider provider0, Provider provider1) {
        this.a = provider0;
        this.b = provider1;
    }

    public static StatisticsRepositoryImpl_Factory create(Provider provider0, Provider provider1) {
        return new StatisticsRepositoryImpl_Factory(provider0, provider1);
    }

    public StatisticsRepositoryImpl get() {
        StatisticsRepositoryImpl statisticsRepositoryImpl0 = StatisticsRepositoryImpl_Factory.newInstance(((BlogStatisticsService)this.a.get()));
        BaseRepository_MembersInjector.injectThrowableRepository(statisticsRepositoryImpl0, ((ThrowableRepository)this.b.get()));
        return statisticsRepositoryImpl0;
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static StatisticsRepositoryImpl newInstance(BlogStatisticsService blogStatisticsService0) {
        return new StatisticsRepositoryImpl(blogStatisticsService0);
    }
}

