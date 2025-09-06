package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.domain.repository.OldBlogRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class BlogCategoryViewModel_Factory implements Factory {
    public final Provider a;

    public BlogCategoryViewModel_Factory(Provider provider0) {
        this.a = provider0;
    }

    public static BlogCategoryViewModel_Factory create(Provider provider0) {
        return new BlogCategoryViewModel_Factory(provider0);
    }

    public BlogCategoryViewModel get() {
        return BlogCategoryViewModel_Factory.newInstance(((OldBlogRepository)this.a.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static BlogCategoryViewModel newInstance(OldBlogRepository oldBlogRepository0) {
        return new BlogCategoryViewModel(oldBlogRepository0);
    }
}

