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
public final class PostPinCommentModifyViewModel_Factory implements Factory {
    public final Provider a;

    public PostPinCommentModifyViewModel_Factory(Provider provider0) {
        this.a = provider0;
    }

    public static PostPinCommentModifyViewModel_Factory create(Provider provider0) {
        return new PostPinCommentModifyViewModel_Factory(provider0);
    }

    public PostPinCommentModifyViewModel get() {
        return PostPinCommentModifyViewModel_Factory.newInstance(((PutCommentUseCase)this.a.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static PostPinCommentModifyViewModel newInstance(PutCommentUseCase putCommentUseCase0) {
        return new PostPinCommentModifyViewModel(putCommentUseCase0);
    }
}

