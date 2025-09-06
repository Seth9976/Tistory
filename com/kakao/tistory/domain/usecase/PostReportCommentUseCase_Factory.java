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
public final class PostReportCommentUseCase_Factory implements Factory {
    public final Provider a;

    public PostReportCommentUseCase_Factory(Provider provider0) {
        this.a = provider0;
    }

    public static PostReportCommentUseCase_Factory create(Provider provider0) {
        return new PostReportCommentUseCase_Factory(provider0);
    }

    public PostReportCommentUseCase get() {
        return PostReportCommentUseCase_Factory.newInstance(((CommentRepository)this.a.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static PostReportCommentUseCase newInstance(CommentRepository commentRepository0) {
        return new PostReportCommentUseCase(commentRepository0);
    }
}

