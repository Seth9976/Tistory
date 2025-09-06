package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.domain.repository.AccountRepository;
import com.kakao.tistory.domain.repository.EntryRepository;
import com.kakao.tistory.domain.repository.OldBlogRepository;
import com.kakao.tistory.domain.repository.SearchRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class SearchResultViewModel_Factory implements Factory {
    public final Provider a;
    public final Provider b;
    public final Provider c;
    public final Provider d;

    public SearchResultViewModel_Factory(Provider provider0, Provider provider1, Provider provider2, Provider provider3) {
        this.a = provider0;
        this.b = provider1;
        this.c = provider2;
        this.d = provider3;
    }

    public static SearchResultViewModel_Factory create(Provider provider0, Provider provider1, Provider provider2, Provider provider3) {
        return new SearchResultViewModel_Factory(provider0, provider1, provider2, provider3);
    }

    public SearchResultViewModel get() {
        return SearchResultViewModel_Factory.newInstance(((AccountRepository)this.a.get()), ((EntryRepository)this.b.get()), ((OldBlogRepository)this.c.get()), ((SearchRepository)this.d.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static SearchResultViewModel newInstance(AccountRepository accountRepository0, EntryRepository entryRepository0, OldBlogRepository oldBlogRepository0, SearchRepository searchRepository0) {
        return new SearchResultViewModel(accountRepository0, entryRepository0, oldBlogRepository0, searchRepository0);
    }
}

