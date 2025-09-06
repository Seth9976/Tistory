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
public final class GetBlogInfoUseCase_Factory implements Factory {
    public final Provider a;

    public GetBlogInfoUseCase_Factory(Provider provider0) {
        this.a = provider0;
    }

    public static GetBlogInfoUseCase_Factory create(Provider provider0) {
        return new GetBlogInfoUseCase_Factory(provider0);
    }

    public GetBlogInfoUseCase get() {
        return GetBlogInfoUseCase_Factory.newInstance(((BlogRepository)this.a.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static GetBlogInfoUseCase newInstance(BlogRepository blogRepository0) {
        return new GetBlogInfoUseCase(blogRepository0);
    }
}

