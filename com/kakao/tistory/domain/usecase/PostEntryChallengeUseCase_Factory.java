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
public final class PostEntryChallengeUseCase_Factory implements Factory {
    public final Provider a;

    public PostEntryChallengeUseCase_Factory(Provider provider0) {
        this.a = provider0;
    }

    public static PostEntryChallengeUseCase_Factory create(Provider provider0) {
        return new PostEntryChallengeUseCase_Factory(provider0);
    }

    public PostEntryChallengeUseCase get() {
        return PostEntryChallengeUseCase_Factory.newInstance(((EntryRepository)this.a.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static PostEntryChallengeUseCase newInstance(EntryRepository entryRepository0) {
        return new PostEntryChallengeUseCase(entryRepository0);
    }
}

