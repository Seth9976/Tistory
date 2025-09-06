package com.kakao.tistory.data.repository;

import com.kakao.tistory.data.service.OldBlogService;
import com.kakao.tistory.domain.repository.ThrowableRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class OldBlogRepositoryImpl_Factory implements Factory {
    public final Provider a;
    public final Provider b;

    public OldBlogRepositoryImpl_Factory(Provider provider0, Provider provider1) {
        this.a = provider0;
        this.b = provider1;
    }

    public static OldBlogRepositoryImpl_Factory create(Provider provider0, Provider provider1) {
        return new OldBlogRepositoryImpl_Factory(provider0, provider1);
    }

    public OldBlogRepositoryImpl get() {
        OldBlogRepositoryImpl oldBlogRepositoryImpl0 = OldBlogRepositoryImpl_Factory.newInstance(((OldBlogService)this.a.get()));
        BaseRepository_MembersInjector.injectThrowableRepository(oldBlogRepositoryImpl0, ((ThrowableRepository)this.b.get()));
        return oldBlogRepositoryImpl0;
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static OldBlogRepositoryImpl newInstance(OldBlogService oldBlogService0) {
        return new OldBlogRepositoryImpl(oldBlogService0);
    }
}

