package com.kakao.tistory.domain.usecase;

import com.kakao.tistory.domain.repository.AutoSaveRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class GetLatestEditEntryUseCase_Factory implements Factory {
    public final Provider a;
    public final Provider b;

    public GetLatestEditEntryUseCase_Factory(Provider provider0, Provider provider1) {
        this.a = provider0;
        this.b = provider1;
    }

    public static GetLatestEditEntryUseCase_Factory create(Provider provider0, Provider provider1) {
        return new GetLatestEditEntryUseCase_Factory(provider0, provider1);
    }

    public GetLatestEditEntryUseCase get() {
        return GetLatestEditEntryUseCase_Factory.newInstance(((CheckLatestEditEntryUseCase)this.a.get()), ((AutoSaveRepository)this.b.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static GetLatestEditEntryUseCase newInstance(CheckLatestEditEntryUseCase checkLatestEditEntryUseCase0, AutoSaveRepository autoSaveRepository0) {
        return new GetLatestEditEntryUseCase(checkLatestEditEntryUseCase0, autoSaveRepository0);
    }
}

