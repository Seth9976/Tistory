package com.kakao.tistory.data.repository;

import com.kakao.tistory.data.preference.SearchPreference;
import com.kakao.tistory.data.service.SearchService;
import com.kakao.tistory.domain.repository.ThrowableRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class SearchRepositoryImpl_Factory implements Factory {
    public final Provider a;
    public final Provider b;
    public final Provider c;

    public SearchRepositoryImpl_Factory(Provider provider0, Provider provider1, Provider provider2) {
        this.a = provider0;
        this.b = provider1;
        this.c = provider2;
    }

    public static SearchRepositoryImpl_Factory create(Provider provider0, Provider provider1, Provider provider2) {
        return new SearchRepositoryImpl_Factory(provider0, provider1, provider2);
    }

    public SearchRepositoryImpl get() {
        SearchRepositoryImpl searchRepositoryImpl0 = SearchRepositoryImpl_Factory.newInstance(((SearchPreference)this.a.get()), ((SearchService)this.b.get()));
        BaseRepository_MembersInjector.injectThrowableRepository(searchRepositoryImpl0, ((ThrowableRepository)this.c.get()));
        return searchRepositoryImpl0;
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static SearchRepositoryImpl newInstance(SearchPreference searchPreference0, SearchService searchService0) {
        return new SearchRepositoryImpl(searchPreference0, searchService0);
    }
}

