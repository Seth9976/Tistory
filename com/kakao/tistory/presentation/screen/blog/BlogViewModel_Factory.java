package com.kakao.tistory.presentation.screen.blog;

import com.kakao.tistory.domain.blog.usecase.GetBlogInfoUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class BlogViewModel_Factory implements Factory {
    public final Provider a;

    public BlogViewModel_Factory(Provider provider0) {
        this.a = provider0;
    }

    public static BlogViewModel_Factory create(Provider provider0) {
        return new BlogViewModel_Factory(provider0);
    }

    public BlogViewModel get() {
        return BlogViewModel_Factory.newInstance(((GetBlogInfoUseCase)this.a.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static BlogViewModel newInstance(GetBlogInfoUseCase getBlogInfoUseCase0) {
        return new BlogViewModel(getBlogInfoUseCase0);
    }
}

