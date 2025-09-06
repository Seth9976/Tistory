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
public final class GetFirstOpenUseCase_Factory implements Factory {
    public final Provider a;

    public GetFirstOpenUseCase_Factory(Provider provider0) {
        this.a = provider0;
    }

    public static GetFirstOpenUseCase_Factory create(Provider provider0) {
        return new GetFirstOpenUseCase_Factory(provider0);
    }

    public GetFirstOpenUseCase get() {
        return GetFirstOpenUseCase_Factory.newInstance(((BlogRepository)this.a.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static GetFirstOpenUseCase newInstance(BlogRepository blogRepository0) {
        return new GetFirstOpenUseCase(blogRepository0);
    }
}

