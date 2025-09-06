package com.kakao.tistory.presentation.viewmodel;

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
public final class DraftViewModel_Factory implements Factory {
    public final Provider a;
    public final Provider b;

    public DraftViewModel_Factory(Provider provider0, Provider provider1) {
        this.a = provider0;
        this.b = provider1;
    }

    public static DraftViewModel_Factory create(Provider provider0, Provider provider1) {
        return new DraftViewModel_Factory(provider0, provider1);
    }

    public DraftViewModel get() {
        return DraftViewModel_Factory.newInstance(((EntryRepository)this.a.get()), ((AccountRepository)this.b.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static DraftViewModel newInstance(EntryRepository entryRepository0, AccountRepository accountRepository0) {
        return new DraftViewModel(entryRepository0, accountRepository0);
    }
}

