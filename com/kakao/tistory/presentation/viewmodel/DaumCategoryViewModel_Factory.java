package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.domain.repository.EntryRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class DaumCategoryViewModel_Factory implements Factory {
    public final Provider a;

    public DaumCategoryViewModel_Factory(Provider provider0) {
        this.a = provider0;
    }

    public static DaumCategoryViewModel_Factory create(Provider provider0) {
        return new DaumCategoryViewModel_Factory(provider0);
    }

    public DaumCategoryViewModel get() {
        return DaumCategoryViewModel_Factory.newInstance(((EntryRepository)this.a.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static DaumCategoryViewModel newInstance(EntryRepository entryRepository0) {
        return new DaumCategoryViewModel(entryRepository0);
    }
}

