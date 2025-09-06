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
public final class GetBlogFollowerCountUseCase_Factory implements Factory {
    public final Provider a;

    public GetBlogFollowerCountUseCase_Factory(Provider provider0) {
        this.a = provider0;
    }

    public static GetBlogFollowerCountUseCase_Factory create(Provider provider0) {
        return new GetBlogFollowerCountUseCase_Factory(provider0);
    }

    public GetBlogFollowerCountUseCase get() {
        return GetBlogFollowerCountUseCase_Factory.newInstance(((FeedRepository)this.a.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static GetBlogFollowerCountUseCase newInstance(FeedRepository feedRepository0) {
        return new GetBlogFollowerCountUseCase(feedRepository0);
    }
}

