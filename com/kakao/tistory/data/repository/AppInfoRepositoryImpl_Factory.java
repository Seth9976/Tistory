package com.kakao.tistory.data.repository;

import com.kakao.tistory.data.service.AppInfoService;
import com.kakao.tistory.domain.repository.ThrowableRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class AppInfoRepositoryImpl_Factory implements Factory {
    public final Provider a;
    public final Provider b;

    public AppInfoRepositoryImpl_Factory(Provider provider0, Provider provider1) {
        this.a = provider0;
        this.b = provider1;
    }

    public static AppInfoRepositoryImpl_Factory create(Provider provider0, Provider provider1) {
        return new AppInfoRepositoryImpl_Factory(provider0, provider1);
    }

    public AppInfoRepositoryImpl get() {
        AppInfoRepositoryImpl appInfoRepositoryImpl0 = AppInfoRepositoryImpl_Factory.newInstance(((AppInfoService)this.a.get()));
        BaseRepository_MembersInjector.injectThrowableRepository(appInfoRepositoryImpl0, ((ThrowableRepository)this.b.get()));
        return appInfoRepositoryImpl0;
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static AppInfoRepositoryImpl newInstance(AppInfoService appInfoService0) {
        return new AppInfoRepositoryImpl(appInfoService0);
    }
}

