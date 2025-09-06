package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.data.repository.OldStatisticsRepository;
import com.kakao.tistory.domain.repository.AccountRepository;
import com.kakao.tistory.domain.statistics.usecase.GetTopEntriesUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class StatisticsViewModel_Factory implements Factory {
    public final Provider a;
    public final Provider b;
    public final Provider c;

    public StatisticsViewModel_Factory(Provider provider0, Provider provider1, Provider provider2) {
        this.a = provider0;
        this.b = provider1;
        this.c = provider2;
    }

    public static StatisticsViewModel_Factory create(Provider provider0, Provider provider1, Provider provider2) {
        return new StatisticsViewModel_Factory(provider0, provider1, provider2);
    }

    public StatisticsViewModel get() {
        return StatisticsViewModel_Factory.newInstance(((AccountRepository)this.a.get()), ((OldStatisticsRepository)this.b.get()), ((GetTopEntriesUseCase)this.c.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static StatisticsViewModel newInstance(AccountRepository accountRepository0, OldStatisticsRepository oldStatisticsRepository0, GetTopEntriesUseCase getTopEntriesUseCase0) {
        return new StatisticsViewModel(accountRepository0, oldStatisticsRepository0, getTopEntriesUseCase0);
    }
}

