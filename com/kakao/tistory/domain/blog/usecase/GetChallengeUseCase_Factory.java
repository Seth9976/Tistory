package com.kakao.tistory.domain.blog.usecase;

import com.kakao.tistory.domain.blog.repository.BlogRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class GetChallengeUseCase_Factory implements Factory {
    public final Provider a;

    public GetChallengeUseCase_Factory(Provider provider0) {
        this.a = provider0;
    }

    public static GetChallengeUseCase_Factory create(Provider provider0) {
        return new GetChallengeUseCase_Factory(provider0);
    }

    public GetChallengeUseCase get() {
        return GetChallengeUseCase_Factory.newInstance(((BlogRepository)this.a.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static GetChallengeUseCase newInstance(BlogRepository blogRepository0) {
        return new GetChallengeUseCase(blogRepository0);
    }
}

