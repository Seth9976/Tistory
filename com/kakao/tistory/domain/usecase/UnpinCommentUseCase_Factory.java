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
public final class UnpinCommentUseCase_Factory implements Factory {
    public final Provider a;

    public UnpinCommentUseCase_Factory(Provider provider0) {
        this.a = provider0;
    }

    public static UnpinCommentUseCase_Factory create(Provider provider0) {
        return new UnpinCommentUseCase_Factory(provider0);
    }

    public UnpinCommentUseCase get() {
        return UnpinCommentUseCase_Factory.newInstance(((CommentRepository)this.a.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static UnpinCommentUseCase newInstance(CommentRepository commentRepository0) {
        return new UnpinCommentUseCase(commentRepository0);
    }
}

