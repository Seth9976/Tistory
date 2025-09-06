package com.kakao.tistory.data.repository;

import com.kakao.tistory.domain.repository.ThrowableRepository;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
public final class OldBlogRepositoryImpl_MembersInjector implements MembersInjector {
    public final Provider a;

    public OldBlogRepositoryImpl_MembersInjector(Provider provider0) {
        this.a = provider0;
    }

    public static MembersInjector create(Provider provider0) {
        return new OldBlogRepositoryImpl_MembersInjector(provider0);
    }

    public void injectMembers(OldBlogRepositoryImpl oldBlogRepositoryImpl0) {
        BaseRepository_MembersInjector.injectThrowableRepository(oldBlogRepositoryImpl0, ((ThrowableRepository)this.a.get()));
    }

    @Override  // dagger.MembersInjector
    public void injectMembers(Object object0) {
        this.injectMembers(((OldBlogRepositoryImpl)object0));
    }
}

