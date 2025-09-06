package com.kakao.tistory.data.repository;

import com.kakao.tistory.data.service.CommentService;
import com.kakao.tistory.domain.repository.ThrowableRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class CommentRepositoryImpl_Factory implements Factory {
    public final Provider a;
    public final Provider b;

    public CommentRepositoryImpl_Factory(Provider provider0, Provider provider1) {
        this.a = provider0;
        this.b = provider1;
    }

    public static CommentRepositoryImpl_Factory create(Provider provider0, Provider provider1) {
        return new CommentRepositoryImpl_Factory(provider0, provider1);
    }

    public CommentRepositoryImpl get() {
        CommentRepositoryImpl commentRepositoryImpl0 = CommentRepositoryImpl_Factory.newInstance(((CommentService)this.a.get()));
        BaseRepository_MembersInjector.injectThrowableRepository(commentRepositoryImpl0, ((ThrowableRepository)this.b.get()));
        return commentRepositoryImpl0;
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static CommentRepositoryImpl newInstance(CommentService commentService0) {
        return new CommentRepositoryImpl(commentService0);
    }
}

