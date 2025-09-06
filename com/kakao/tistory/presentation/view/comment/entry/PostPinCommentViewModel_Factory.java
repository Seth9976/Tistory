package com.kakao.tistory.presentation.view.comment.entry;

import com.kakao.tistory.domain.repository.AccountRepository;
import com.kakao.tistory.domain.repository.EntryRepository;
import com.kakao.tistory.domain.usecase.DeleteCommentUseCase;
import com.kakao.tistory.domain.usecase.GetCommentsUseCase;
import com.kakao.tistory.domain.usecase.GetPinCommentUseCase;
import com.kakao.tistory.domain.usecase.PinCommentUseCase;
import com.kakao.tistory.domain.usecase.PostCommentUseCase;
import com.kakao.tistory.domain.usecase.UnpinCommentUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class PostPinCommentViewModel_Factory implements Factory {
    public final Provider a;
    public final Provider b;
    public final Provider c;
    public final Provider d;
    public final Provider e;
    public final Provider f;
    public final Provider g;
    public final Provider h;

    public PostPinCommentViewModel_Factory(Provider provider0, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        this.a = provider0;
        this.b = provider1;
        this.c = provider2;
        this.d = provider3;
        this.e = provider4;
        this.f = provider5;
        this.g = provider6;
        this.h = provider7;
    }

    public static PostPinCommentViewModel_Factory create(Provider provider0, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        return new PostPinCommentViewModel_Factory(provider0, provider1, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public PostPinCommentViewModel get() {
        return PostPinCommentViewModel_Factory.newInstance(((AccountRepository)this.a.get()), ((EntryRepository)this.b.get()), ((GetCommentsUseCase)this.c.get()), ((PostCommentUseCase)this.d.get()), ((DeleteCommentUseCase)this.e.get()), ((PinCommentUseCase)this.f.get()), ((UnpinCommentUseCase)this.g.get()), ((GetPinCommentUseCase)this.h.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static PostPinCommentViewModel newInstance(AccountRepository accountRepository0, EntryRepository entryRepository0, GetCommentsUseCase getCommentsUseCase0, PostCommentUseCase postCommentUseCase0, DeleteCommentUseCase deleteCommentUseCase0, PinCommentUseCase pinCommentUseCase0, UnpinCommentUseCase unpinCommentUseCase0, GetPinCommentUseCase getPinCommentUseCase0) {
        return new PostPinCommentViewModel(accountRepository0, entryRepository0, getCommentsUseCase0, postCommentUseCase0, deleteCommentUseCase0, pinCommentUseCase0, unpinCommentUseCase0, getPinCommentUseCase0);
    }
}

