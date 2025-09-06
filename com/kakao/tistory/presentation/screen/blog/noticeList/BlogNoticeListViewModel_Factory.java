package com.kakao.tistory.presentation.screen.blog.noticeList;

import com.kakao.tistory.domain.blog.usecase.GetNoticeListUseCase;
import com.kakao.tistory.domain.repository.AccountRepository;
import com.kakao.tistory.domain.repository.EntryRepository;
import com.kakao.tistory.domain.repository.OldBlogRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class BlogNoticeListViewModel_Factory implements Factory {
    public final Provider a;
    public final Provider b;
    public final Provider c;
    public final Provider d;

    public BlogNoticeListViewModel_Factory(Provider provider0, Provider provider1, Provider provider2, Provider provider3) {
        this.a = provider0;
        this.b = provider1;
        this.c = provider2;
        this.d = provider3;
    }

    public static BlogNoticeListViewModel_Factory create(Provider provider0, Provider provider1, Provider provider2, Provider provider3) {
        return new BlogNoticeListViewModel_Factory(provider0, provider1, provider2, provider3);
    }

    public BlogNoticeListViewModel get() {
        return BlogNoticeListViewModel_Factory.newInstance(((AccountRepository)this.a.get()), ((GetNoticeListUseCase)this.b.get()), ((OldBlogRepository)this.c.get()), ((EntryRepository)this.d.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static BlogNoticeListViewModel newInstance(AccountRepository accountRepository0, GetNoticeListUseCase getNoticeListUseCase0, OldBlogRepository oldBlogRepository0, EntryRepository entryRepository0) {
        return new BlogNoticeListViewModel(accountRepository0, getNoticeListUseCase0, oldBlogRepository0, entryRepository0);
    }
}

