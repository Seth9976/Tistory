package com.kakao.tistory.presentation.screen.blogswitch;

import com.kakao.tistory.domain.repository.AccountRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class BlogSwitchViewModel_Factory implements Factory {
    public final Provider a;

    public BlogSwitchViewModel_Factory(Provider provider0) {
        this.a = provider0;
    }

    public static BlogSwitchViewModel_Factory create(Provider provider0) {
        return new BlogSwitchViewModel_Factory(provider0);
    }

    public BlogSwitchViewModel get() {
        return BlogSwitchViewModel_Factory.newInstance(((AccountRepository)this.a.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static BlogSwitchViewModel newInstance(AccountRepository accountRepository0) {
        return new BlogSwitchViewModel(accountRepository0);
    }
}

