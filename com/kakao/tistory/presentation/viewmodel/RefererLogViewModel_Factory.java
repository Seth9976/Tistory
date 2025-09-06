package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.data.repository.DashboardRepository;
import com.kakao.tistory.domain.repository.AccountRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class RefererLogViewModel_Factory implements Factory {
    public final Provider a;
    public final Provider b;

    public RefererLogViewModel_Factory(Provider provider0, Provider provider1) {
        this.a = provider0;
        this.b = provider1;
    }

    public static RefererLogViewModel_Factory create(Provider provider0, Provider provider1) {
        return new RefererLogViewModel_Factory(provider0, provider1);
    }

    public RefererLogViewModel get() {
        return RefererLogViewModel_Factory.newInstance(((AccountRepository)this.a.get()), ((DashboardRepository)this.b.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static RefererLogViewModel newInstance(AccountRepository accountRepository0, DashboardRepository dashboardRepository0) {
        return new RefererLogViewModel(accountRepository0, dashboardRepository0);
    }
}

