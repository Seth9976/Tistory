package com.kakao.tistory.domain.usecase;

import com.kakao.tistory.domain.repository.CommentRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class PutCommentUseCase_Factory implements Factory {
    public final Provider a;

    public PutCommentUseCase_Factory(Provider provider0) {
        this.a = provider0;
    }

    public static PutCommentUseCase_Factory create(Provider provider0) {
        return new PutCommentUseCase_Factory(provider0);
    }

    public PutCommentUseCase get() {
        return PutCommentUseCase_Factory.newInstance(((CommentRepository)this.a.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static PutCommentUseCase newInstance(CommentRepository commentRepository0) {
        return new PutCommentUseCase(commentRepository0);
    }
}

