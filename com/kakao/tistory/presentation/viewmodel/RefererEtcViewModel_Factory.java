package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.data.repository.OldStatisticsRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class RefererEtcViewModel_Factory implements Factory {
    public final Provider a;

    public RefererEtcViewModel_Factory(Provider provider0) {
        this.a = provider0;
    }

    public static RefererEtcViewModel_Factory create(Provider provider0) {
        return new RefererEtcViewModel_Factory(provider0);
    }

    public RefererEtcViewModel get() {
        return RefererEtcViewModel_Factory.newInstance(((OldStatisticsRepository)this.a.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static RefererEtcViewModel newInstance(OldStatisticsRepository oldStatisticsRepository0) {
        return new RefererEtcViewModel(oldStatisticsRepository0);
    }
}

