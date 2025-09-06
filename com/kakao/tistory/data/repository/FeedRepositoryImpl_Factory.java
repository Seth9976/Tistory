package com.kakao.tistory.data.repository;

import com.kakao.tistory.data.service.FeedService;
import com.kakao.tistory.domain.repository.ThrowableRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class FeedRepositoryImpl_Factory implements Factory {
    public final Provider a;
    public final Provider b;

    public FeedRepositoryImpl_Factory(Provider provider0, Provider provider1) {
        this.a = provider0;
        this.b = provider1;
    }

    public static FeedRepositoryImpl_Factory create(Provider provider0, Provider provider1) {
        return new FeedRepositoryImpl_Factory(provider0, provider1);
    }

    public FeedRepositoryImpl get() {
        FeedRepositoryImpl feedRepositoryImpl0 = FeedRepositoryImpl_Factory.newInstance(((FeedService)this.a.get()));
        BaseRepository_MembersInjector.injectThrowableRepository(feedRepositoryImpl0, ((ThrowableRepository)this.b.get()));
        return feedRepositoryImpl0;
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static FeedRepositoryImpl newInstance(FeedService feedService0) {
        return new FeedRepositoryImpl(feedService0);
    }
}

