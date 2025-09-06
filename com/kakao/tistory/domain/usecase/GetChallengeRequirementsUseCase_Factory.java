package com.kakao.tistory.domain.usecase;

import com.kakao.tistory.domain.repository.EntryRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class GetChallengeRequirementsUseCase_Factory implements Factory {
    public final Provider a;

    public GetChallengeRequirementsUseCase_Factory(Provider provider0) {
        this.a = provider0;
    }

    public static GetChallengeRequirementsUseCase_Factory create(Provider provider0) {
        return new GetChallengeRequirementsUseCase_Factory(provider0);
    }

    public GetChallengeRequirementsUseCase get() {
        return GetChallengeRequirementsUseCase_Factory.newInstance(((EntryRepository)this.a.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static GetChallengeRequirementsUseCase newInstance(EntryRepository entryRepository0) {
        return new GetChallengeRequirementsUseCase(entryRepository0);
    }
}

