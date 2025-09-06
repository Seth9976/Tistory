package com.kakao.tistory.data.repository;

import com.kakao.tistory.domain.repository.ThrowableRepository;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
public final class CommentRepositoryImpl_MembersInjector implements MembersInjector {
    public final Provider a;

    public CommentRepositoryImpl_MembersInjector(Provider provider0) {
        this.a = provider0;
    }

    public static MembersInjector create(Provider provider0) {
        return new CommentRepositoryImpl_MembersInjector(provider0);
    }

    public void injectMembers(CommentRepositoryImpl commentRepositoryImpl0) {
        BaseRepository_MembersInjector.injectThrowableRepository(commentRepositoryImpl0, ((ThrowableRepository)this.a.get()));
    }

    @Override  // dagger.MembersInjector
    public void injectMembers(Object object0) {
        this.injectMembers(((CommentRepositoryImpl)object0));
    }
}

