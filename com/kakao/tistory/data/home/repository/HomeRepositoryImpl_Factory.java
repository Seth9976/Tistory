package com.kakao.tistory.data.home.repository;

import com.kakao.tistory.data.home.api.HomeService;
import com.kakao.tistory.data.preference.HomePreference;
import com.kakao.tistory.data.repository.BaseRepository_MembersInjector;
import com.kakao.tistory.domain.repository.ThrowableRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class HomeRepositoryImpl_Factory implements Factory {
    public final Provider a;
    public final Provider b;
    public final Provider c;

    public HomeRepositoryImpl_Factory(Provider provider0, Provider provider1, Provider provider2) {
        this.a = provider0;
        this.b = provider1;
        this.c = provider2;
    }

    public static HomeRepositoryImpl_Factory create(Provider provider0, Provider provider1, Provider provider2) {
        return new HomeRepositoryImpl_Factory(provider0, provider1, provider2);
    }

    public HomeRepositoryImpl get() {
        HomeRepositoryImpl homeRepositoryImpl0 = HomeRepositoryImpl_Factory.newInstance(((HomeService)this.a.get()), ((HomePreference)this.b.get()));
        BaseRepository_MembersInjector.injectThrowableRepository(homeRepositoryImpl0, ((ThrowableRepository)this.c.get()));
        return homeRepositoryImpl0;
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static HomeRepositoryImpl newInstance(HomeService homeService0, HomePreference homePreference0) {
        return new HomeRepositoryImpl(homeService0, homePreference0);
    }
}

