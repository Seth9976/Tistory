package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.domain.repository.FeedRepository;
import com.kakao.tistory.domain.repository.OldBlogRepository;
import com.kakao.tistory.domain.usecase.GetCurrentBlogNameUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class BlogFollowViewModel_Factory implements Factory {
    public final Provider a;
    public final Provider b;
    public final Provider c;

    public BlogFollowViewModel_Factory(Provider provider0, Provider provider1, Provider provider2) {
        this.a = provider0;
        this.b = provider1;
        this.c = provider2;
    }

    public static BlogFollowViewModel_Factory create(Provider provider0, Provider provider1, Provider provider2) {
        return new BlogFollowViewModel_Factory(provider0, provider1, provider2);
    }

    public BlogFollowViewModel get() {
        return BlogFollowViewModel_Factory.newInstance(((FeedRepository)this.a.get()), ((OldBlogRepository)this.b.get()), ((GetCurrentBlogNameUseCase)this.c.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static BlogFollowViewModel newInstance(FeedRepository feedRepository0, OldBlogRepository oldBlogRepository0, GetCurrentBlogNameUseCase getCurrentBlogNameUseCase0) {
        return new BlogFollowViewModel(feedRepository0, oldBlogRepository0, getCurrentBlogNameUseCase0);
    }
}

