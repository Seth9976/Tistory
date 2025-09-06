package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.domain.repository.AccountRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class DefaultBlogViewModel_Factory implements Factory {
    public final Provider a;

    public DefaultBlogViewModel_Factory(Provider provider0) {
        this.a = provider0;
    }

    public static DefaultBlogViewModel_Factory create(Provider provider0) {
        return new DefaultBlogViewModel_Factory(provider0);
    }

    public DefaultBlogViewModel get() {
        return DefaultBlogViewModel_Factory.newInstance(((AccountRepository)this.a.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static DefaultBlogViewModel newInstance(AccountRepository accountRepository0) {
        return new DefaultBlogViewModel(accountRepository0);
    }
}

