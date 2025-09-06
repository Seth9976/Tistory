package com.kakao.tistory.presentation.viewmodel;

import androidx.lifecycle.SavedStateHandle;
import com.kakao.tistory.domain.repository.AccountRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class SavedStateViewModel_Factory implements Factory {
    public final Provider a;
    public final Provider b;

    public SavedStateViewModel_Factory(Provider provider0, Provider provider1) {
        this.a = provider0;
        this.b = provider1;
    }

    public static SavedStateViewModel_Factory create(Provider provider0, Provider provider1) {
        return new SavedStateViewModel_Factory(provider0, provider1);
    }

    public SavedStateViewModel get() {
        return SavedStateViewModel_Factory.newInstance(((SavedStateHandle)this.a.get()), ((AccountRepository)this.b.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static SavedStateViewModel newInstance(SavedStateHandle savedStateHandle0, AccountRepository accountRepository0) {
        return new SavedStateViewModel(savedStateHandle0, accountRepository0);
    }
}

