package com.kakao.tistory.domain.usecase;

import com.kakao.tistory.domain.repository.FeedRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class GetBlogFollowingCountUseCase_Factory implements Factory {
    public final Provider a;

    public GetBlogFollowingCountUseCase_Factory(Provider provider0) {
        this.a = provider0;
    }

    public static GetBlogFollowingCountUseCase_Factory create(Provider provider0) {
        return new GetBlogFollowingCountUseCase_Factory(provider0);
    }

    public GetBlogFollowingCountUseCase get() {
        return GetBlogFollowingCountUseCase_Factory.newInstance(((FeedRepository)this.a.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static GetBlogFollowingCountUseCase newInstance(FeedRepository feedRepository0) {
        return new GetBlogFollowingCountUseCase(feedRepository0);
    }
}

