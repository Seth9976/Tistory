package com.kakao.tistory.data.repository;

import com.kakao.tistory.data.service.DashboardService;
import com.kakao.tistory.data.service.OldBlogService;
import com.kakao.tistory.domain.repository.ThrowableRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class DashboardRepositoryImpl_Factory implements Factory {
    public final Provider a;
    public final Provider b;
    public final Provider c;

    public DashboardRepositoryImpl_Factory(Provider provider0, Provider provider1, Provider provider2) {
        this.a = provider0;
        this.b = provider1;
        this.c = provider2;
    }

    public static DashboardRepositoryImpl_Factory create(Provider provider0, Provider provider1, Provider provider2) {
        return new DashboardRepositoryImpl_Factory(provider0, provider1, provider2);
    }

    public DashboardRepositoryImpl get() {
        DashboardRepositoryImpl dashboardRepositoryImpl0 = DashboardRepositoryImpl_Factory.newInstance(((DashboardService)this.a.get()), ((OldBlogService)this.b.get()));
        BaseRepository_MembersInjector.injectThrowableRepository(dashboardRepositoryImpl0, ((ThrowableRepository)this.c.get()));
        return dashboardRepositoryImpl0;
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static DashboardRepositoryImpl newInstance(DashboardService dashboardService0, OldBlogService oldBlogService0) {
        return new DashboardRepositoryImpl(dashboardService0, oldBlogService0);
    }
}

