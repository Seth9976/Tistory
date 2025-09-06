package com.kakao.tistory.domain.usecase;

import com.kakao.tistory.domain.repository.AutoSaveRepository;
import com.kakao.tistory.domain.repository.EntryRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class CheckLatestEditEntryUseCase_Factory implements Factory {
    public final Provider a;
    public final Provider b;

    public CheckLatestEditEntryUseCase_Factory(Provider provider0, Provider provider1) {
        this.a = provider0;
        this.b = provider1;
    }

    public static CheckLatestEditEntryUseCase_Factory create(Provider provider0, Provider provider1) {
        return new CheckLatestEditEntryUseCase_Factory(provider0, provider1);
    }

    public CheckLatestEditEntryUseCase get() {
        return CheckLatestEditEntryUseCase_Factory.newInstance(((EntryRepository)this.a.get()), ((AutoSaveRepository)this.b.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static CheckLatestEditEntryUseCase newInstance(EntryRepository entryRepository0, AutoSaveRepository autoSaveRepository0) {
        return new CheckLatestEditEntryUseCase(entryRepository0, autoSaveRepository0);
    }
}

