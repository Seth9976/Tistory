package com.kakao.tistory.presentation.screen.feed;

import com.kakao.tistory.domain.repository.AccountRepository;
import com.kakao.tistory.domain.repository.EntryRepository;
import com.kakao.tistory.domain.repository.FeedRepository;
import com.kakao.tistory.domain.usecase.GetBlogFollowerCountUseCase;
import com.kakao.tistory.domain.usecase.GetBlogFollowingCountUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class FeedViewModel_Factory implements Factory {
    public final Provider a;
    public final Provider b;
    public final Provider c;
    public final Provider d;
    public final Provider e;

    public FeedViewModel_Factory(Provider provider0, Provider provider1, Provider provider2, Provider provider3, Provider provider4) {
        this.a = provider0;
        this.b = provider1;
        this.c = provider2;
        this.d = provider3;
        this.e = provider4;
    }

    public static FeedViewModel_Factory create(Provider provider0, Provider provider1, Provider provider2, Provider provider3, Provider provider4) {
        return new FeedViewModel_Factory(provider0, provider1, provider2, provider3, provider4);
    }

    public FeedViewModel get() {
        return FeedViewModel_Factory.newInstance(((AccountRepository)this.a.get()), ((FeedRepository)this.b.get()), ((EntryRepository)this.c.get()), ((GetBlogFollowingCountUseCase)this.d.get()), ((GetBlogFollowerCountUseCase)this.e.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static FeedViewModel newInstance(AccountRepository accountRepository0, FeedRepository feedRepository0, EntryRepository entryRepository0, GetBlogFollowingCountUseCase getBlogFollowingCountUseCase0, GetBlogFollowerCountUseCase getBlogFollowerCountUseCase0) {
        return new FeedViewModel(accountRepository0, feedRepository0, entryRepository0, getBlogFollowingCountUseCase0, getBlogFollowerCountUseCase0);
    }
}

