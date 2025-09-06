package com.kakao.tistory.presentation.screen.blog.main;

import com.kakao.tistory.domain.blog.usecase.ChangeBlockUseCase;
import com.kakao.tistory.domain.blog.usecase.GetCategoriesUseCase;
import com.kakao.tistory.domain.blog.usecase.GetChallengeUseCase;
import com.kakao.tistory.domain.blog.usecase.GetEntryListUseCase;
import com.kakao.tistory.domain.blog.usecase.GetFirstOpenUseCase;
import com.kakao.tistory.domain.blog.usecase.GetRecentNoticeListUseCase;
import com.kakao.tistory.domain.blog.usecase.GetRefererKeywordsUseCase;
import com.kakao.tistory.domain.blog.usecase.GetRefererLogUseCase;
import com.kakao.tistory.domain.blog.usecase.GetTrendUseCase;
import com.kakao.tistory.domain.blog.usecase.SetFirstOpenedUseCase;
import com.kakao.tistory.domain.repository.AccountRepository;
import com.kakao.tistory.domain.repository.EntryRepository;
import com.kakao.tistory.domain.revenue.usecase.GetRevenueCurrentUseCase;
import com.kakao.tistory.domain.revenue.usecase.GetRevenueVendorListUseCase;
import com.kakao.tistory.domain.statistics.usecase.GetTopEntriesLastWeekUseCase;
import com.kakao.tistory.domain.usecase.FollowBlogUseCase;
import com.kakao.tistory.domain.usecase.UnFollowBlogUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class BlogMainViewModel_Factory implements Factory {
    public final Provider a;
    public final Provider b;
    public final Provider c;
    public final Provider d;
    public final Provider e;
    public final Provider f;
    public final Provider g;
    public final Provider h;
    public final Provider i;
    public final Provider j;
    public final Provider k;
    public final Provider l;
    public final Provider m;
    public final Provider n;
    public final Provider o;
    public final Provider p;
    public final Provider q;

    public BlogMainViewModel_Factory(Provider provider0, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, Provider provider14, Provider provider15, Provider provider16) {
        this.a = provider0;
        this.b = provider1;
        this.c = provider2;
        this.d = provider3;
        this.e = provider4;
        this.f = provider5;
        this.g = provider6;
        this.h = provider7;
        this.i = provider8;
        this.j = provider9;
        this.k = provider10;
        this.l = provider11;
        this.m = provider12;
        this.n = provider13;
        this.o = provider14;
        this.p = provider15;
        this.q = provider16;
    }

    public static BlogMainViewModel_Factory create(Provider provider0, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, Provider provider14, Provider provider15, Provider provider16) {
        return new BlogMainViewModel_Factory(provider0, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16);
    }

    public BlogMainViewModel get() {
        return BlogMainViewModel_Factory.newInstance(((GetTopEntriesLastWeekUseCase)this.a.get()), ((GetRecentNoticeListUseCase)this.b.get()), ((GetCategoriesUseCase)this.c.get()), ((GetEntryListUseCase)this.d.get()), ((FollowBlogUseCase)this.e.get()), ((UnFollowBlogUseCase)this.f.get()), ((GetTrendUseCase)this.g.get()), ((GetRefererLogUseCase)this.h.get()), ((GetRefererKeywordsUseCase)this.i.get()), ((GetRevenueVendorListUseCase)this.j.get()), ((GetRevenueCurrentUseCase)this.k.get()), ((GetFirstOpenUseCase)this.l.get()), ((SetFirstOpenedUseCase)this.m.get()), ((ChangeBlockUseCase)this.n.get()), ((EntryRepository)this.o.get()), ((GetChallengeUseCase)this.p.get()), ((AccountRepository)this.q.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static BlogMainViewModel newInstance(GetTopEntriesLastWeekUseCase getTopEntriesLastWeekUseCase0, GetRecentNoticeListUseCase getRecentNoticeListUseCase0, GetCategoriesUseCase getCategoriesUseCase0, GetEntryListUseCase getEntryListUseCase0, FollowBlogUseCase followBlogUseCase0, UnFollowBlogUseCase unFollowBlogUseCase0, GetTrendUseCase getTrendUseCase0, GetRefererLogUseCase getRefererLogUseCase0, GetRefererKeywordsUseCase getRefererKeywordsUseCase0, GetRevenueVendorListUseCase getRevenueVendorListUseCase0, GetRevenueCurrentUseCase getRevenueCurrentUseCase0, GetFirstOpenUseCase getFirstOpenUseCase0, SetFirstOpenedUseCase setFirstOpenedUseCase0, ChangeBlockUseCase changeBlockUseCase0, EntryRepository entryRepository0, GetChallengeUseCase getChallengeUseCase0, AccountRepository accountRepository0) {
        return new BlogMainViewModel(getTopEntriesLastWeekUseCase0, getRecentNoticeListUseCase0, getCategoriesUseCase0, getEntryListUseCase0, followBlogUseCase0, unFollowBlogUseCase0, getTrendUseCase0, getRefererLogUseCase0, getRefererKeywordsUseCase0, getRevenueVendorListUseCase0, getRevenueCurrentUseCase0, getFirstOpenUseCase0, setFirstOpenedUseCase0, changeBlockUseCase0, entryRepository0, getChallengeUseCase0, accountRepository0);
    }
}

