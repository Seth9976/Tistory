package com.kakao.tistory.domain.usecase;

import com.kakao.tistory.domain.repository.OldBlogRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class UnFollowBlogUseCase_Factory implements Factory {
    public final Provider a;

    public UnFollowBlogUseCase_Factory(Provider provider0) {
        this.a = provider0;
    }

    public static UnFollowBlogUseCase_Factory create(Provider provider0) {
        return new UnFollowBlogUseCase_Factory(provider0);
    }

    public UnFollowBlogUseCase get() {
        return UnFollowBlogUseCase_Factory.newInstance(((OldBlogRepository)this.a.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static UnFollowBlogUseCase newInstance(OldBlogRepository oldBlogRepository0) {
        return new UnFollowBlogUseCase(oldBlogRepository0);
    }
}

