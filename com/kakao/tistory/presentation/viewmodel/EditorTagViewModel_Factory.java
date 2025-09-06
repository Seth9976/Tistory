package com.kakao.tistory.presentation.viewmodel;

import androidx.lifecycle.SavedStateHandle;
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
public final class EditorTagViewModel_Factory implements Factory {
    public final Provider a;
    public final Provider b;
    public final Provider c;

    public EditorTagViewModel_Factory(Provider provider0, Provider provider1, Provider provider2) {
        this.a = provider0;
        this.b = provider1;
        this.c = provider2;
    }

    public static EditorTagViewModel_Factory create(Provider provider0, Provider provider1, Provider provider2) {
        return new EditorTagViewModel_Factory(provider0, provider1, provider2);
    }

    public EditorTagViewModel get() {
        return EditorTagViewModel_Factory.newInstance(((SavedStateHandle)this.a.get()), ((EntryRepository)this.b.get()), ((AccountRepository)this.c.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static EditorTagViewModel newInstance(SavedStateHandle savedStateHandle0, EntryRepository entryRepository0, AccountRepository accountRepository0) {
        return new EditorTagViewModel(savedStateHandle0, entryRepository0, accountRepository0);
    }
}

