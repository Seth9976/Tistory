package com.kakao.tistory.data.blog.repository;

import com.kakao.tistory.data.blog.api.BlogService;
import com.kakao.tistory.data.preference.BlogPreference;
import com.kakao.tistory.data.repository.BaseRepository_MembersInjector;
import com.kakao.tistory.domain.repository.ThrowableRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class BlogRepositoryImpl_Factory implements Factory {
    public final Provider a;
    public final Provider b;
    public final Provider c;

    public BlogRepositoryImpl_Factory(Provider provider0, Provider provider1, Provider provider2) {
        this.a = provider0;
        this.b = provider1;
        this.c = provider2;
    }

    public static BlogRepositoryImpl_Factory create(Provider provider0, Provider provider1, Provider provider2) {
        return new BlogRepositoryImpl_Factory(provider0, provider1, provider2);
    }

    public BlogRepositoryImpl get() {
        BlogRepositoryImpl blogRepositoryImpl0 = BlogRepositoryImpl_Factory.newInstance(((BlogService)this.a.get()), ((BlogPreference)this.b.get()));
        BaseRepository_MembersInjector.injectThrowableRepository(blogRepositoryImpl0, ((ThrowableRepository)this.c.get()));
        return blogRepositoryImpl0;
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static BlogRepositoryImpl newInstance(BlogService blogService0, BlogPreference blogPreference0) {
        return new BlogRepositoryImpl(blogService0, blogPreference0);
    }
}

