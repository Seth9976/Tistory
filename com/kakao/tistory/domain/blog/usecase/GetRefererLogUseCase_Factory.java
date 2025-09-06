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
public final class GetRefererLogUseCase_Factory implements Factory {
    public final Provider a;

    public GetRefererLogUseCase_Factory(Provider provider0) {
        this.a = provider0;
    }

    public static GetRefererLogUseCase_Factory create(Provider provider0) {
        return new GetRefererLogUseCase_Factory(provider0);
    }

    public GetRefererLogUseCase get() {
        return GetRefererLogUseCase_Factory.newInstance(((BlogRepository)this.a.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static GetRefererLogUseCase newInstance(BlogRepository blogRepository0) {
        return new GetRefererLogUseCase(blogRepository0);
    }
}

