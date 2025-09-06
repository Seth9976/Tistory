package com.kakao.tistory.presentation.view.comment.entry;

import com.kakao.tistory.domain.usecase.PutCommentUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class PostCommentModifyViewModel_Factory implements Factory {
    public final Provider a;

    public PostCommentModifyViewModel_Factory(Provider provider0) {
        this.a = provider0;
    }

    public static PostCommentModifyViewModel_Factory create(Provider provider0) {
        return new PostCommentModifyViewModel_Factory(provider0);
    }

    public PostCommentModifyViewModel get() {
        return PostCommentModifyViewModel_Factory.newInstance(((PutCommentUseCase)this.a.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static PostCommentModifyViewModel newInstance(PutCommentUseCase putCommentUseCase0) {
        return new PostCommentModifyViewModel(putCommentUseCase0);
    }
}

