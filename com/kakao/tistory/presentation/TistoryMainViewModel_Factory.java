package com.kakao.tistory.presentation;

import com.kakao.tistory.domain.repository.AccountRepository;
import com.kakao.tistory.domain.repository.EntryRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class TistoryMainViewModel_Factory implements Factory {
    public final Provider a;
    public final Provider b;

    public TistoryMainViewModel_Factory(Provider provider0, Provider provider1) {
        this.a = provider0;
        this.b = provider1;
    }

    public static TistoryMainViewModel_Factory create(Provider provider0, Provider provider1) {
        return new TistoryMainViewModel_Factory(provider0, provider1);
    }

    public TistoryMainViewModel get() {
        return TistoryMainViewModel_Factory.newInstance(((EntryRepository)this.a.get()), ((AccountRepository)this.b.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static TistoryMainViewModel newInstance(EntryRepository entryRepository0, AccountRepository accountRepository0) {
        return new TistoryMainViewModel(entryRepository0, accountRepository0);
    }
}

