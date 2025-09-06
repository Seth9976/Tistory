package com.kakao.tistory.data.blog.repository;

import com.kakao.tistory.data.repository.BaseRepository_MembersInjector;
import com.kakao.tistory.domain.repository.ThrowableRepository;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
public final class BlogRepositoryImpl_MembersInjector implements MembersInjector {
    public final Provider a;

    public BlogRepositoryImpl_MembersInjector(Provider provider0) {
        this.a = provider0;
    }

    public static MembersInjector create(Provider provider0) {
        return new BlogRepositoryImpl_MembersInjector(provider0);
    }

    public void injectMembers(BlogRepositoryImpl blogRepositoryImpl0) {
        BaseRepository_MembersInjector.injectThrowableRepository(blogRepositoryImpl0, ((ThrowableRepository)this.a.get()));
    }

    @Override  // dagger.MembersInjector
    public void injectMembers(Object object0) {
        this.injectMembers(((BlogRepositoryImpl)object0));
    }
}

