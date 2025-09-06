package com.kakao.tistory.data.statistics.repository;

import com.kakao.tistory.data.repository.BaseRepository_MembersInjector;
import com.kakao.tistory.domain.repository.ThrowableRepository;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
public final class StatisticsRepositoryImpl_MembersInjector implements MembersInjector {
    public final Provider a;

    public StatisticsRepositoryImpl_MembersInjector(Provider provider0) {
        this.a = provider0;
    }

    public static MembersInjector create(Provider provider0) {
        return new StatisticsRepositoryImpl_MembersInjector(provider0);
    }

    public void injectMembers(StatisticsRepositoryImpl statisticsRepositoryImpl0) {
        BaseRepository_MembersInjector.injectThrowableRepository(statisticsRepositoryImpl0, ((ThrowableRepository)this.a.get()));
    }

    @Override  // dagger.MembersInjector
    public void injectMembers(Object object0) {
        this.injectMembers(((StatisticsRepositoryImpl)object0));
    }
}

