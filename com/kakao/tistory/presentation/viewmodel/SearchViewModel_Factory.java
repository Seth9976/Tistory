package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.domain.repository.SearchRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class SearchViewModel_Factory implements Factory {
    public final Provider a;

    public SearchViewModel_Factory(Provider provider0) {
        this.a = provider0;
    }

    public static SearchViewModel_Factory create(Provider provider0) {
        return new SearchViewModel_Factory(provider0);
    }

    public SearchViewModel get() {
        return SearchViewModel_Factory.newInstance(((SearchRepository)this.a.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static SearchViewModel newInstance(SearchRepository searchRepository0) {
        return new SearchViewModel(searchRepository0);
    }
}

