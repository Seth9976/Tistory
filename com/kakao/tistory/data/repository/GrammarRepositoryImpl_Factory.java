package com.kakao.tistory.data.repository;

import com.kakao.tistory.data.service.GrammarService;
import com.kakao.tistory.domain.repository.ThrowableRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class GrammarRepositoryImpl_Factory implements Factory {
    public final Provider a;
    public final Provider b;

    public GrammarRepositoryImpl_Factory(Provider provider0, Provider provider1) {
        this.a = provider0;
        this.b = provider1;
    }

    public static GrammarRepositoryImpl_Factory create(Provider provider0, Provider provider1) {
        return new GrammarRepositoryImpl_Factory(provider0, provider1);
    }

    public GrammarRepositoryImpl get() {
        GrammarRepositoryImpl grammarRepositoryImpl0 = GrammarRepositoryImpl_Factory.newInstance(((GrammarService)this.a.get()));
        BaseRepository_MembersInjector.injectThrowableRepository(grammarRepositoryImpl0, ((ThrowableRepository)this.b.get()));
        return grammarRepositoryImpl0;
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static GrammarRepositoryImpl newInstance(GrammarService grammarService0) {
        return new GrammarRepositoryImpl(grammarService0);
    }
}

