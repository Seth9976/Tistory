package com.kakao.tistory.presentation.view.comment.guestbook;

import com.kakao.tistory.domain.repository.AccountRepository;
import com.kakao.tistory.domain.usecase.DeleteGuestbookUseCase;
import com.kakao.tistory.domain.usecase.GetBlogUseCase;
import com.kakao.tistory.domain.usecase.GetGuestBookPinCommentUseCase;
import com.kakao.tistory.domain.usecase.GetGuestbookListUseCase;
import com.kakao.tistory.domain.usecase.GetPinGuestBookComment;
import com.kakao.tistory.domain.usecase.PinGuestBookCommentUseCase;
import com.kakao.tistory.domain.usecase.UnPinGuestBookCommentUseCase;
import com.kakao.tistory.domain.usecase.UpdateGuestbookUseCase;
import com.kakao.tistory.domain.usecase.WriteGuestbookUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class PinGuestbookViewModel_Factory implements Factory {
    public final Provider a;
    public final Provider b;
    public final Provider c;
    public final Provider d;
    public final Provider e;
    public final Provider f;
    public final Provider g;
    public final Provider h;
    public final Provider i;
    public final Provider j;

    public PinGuestbookViewModel_Factory(Provider provider0, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9) {
        this.a = provider0;
        this.b = provider1;
        this.c = provider2;
        this.d = provider3;
        this.e = provider4;
        this.f = provider5;
        this.g = provider6;
        this.h = provider7;
        this.i = provider8;
        this.j = provider9;
    }

    public static PinGuestbookViewModel_Factory create(Provider provider0, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9) {
        return new PinGuestbookViewModel_Factory(provider0, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    public PinGuestbookViewModel get() {
        return PinGuestbookViewModel_Factory.newInstance(((AccountRepository)this.a.get()), ((GetPinGuestBookComment)this.b.get()), ((GetGuestbookListUseCase)this.c.get()), ((UpdateGuestbookUseCase)this.d.get()), ((WriteGuestbookUseCase)this.e.get()), ((DeleteGuestbookUseCase)this.f.get()), ((PinGuestBookCommentUseCase)this.g.get()), ((UnPinGuestBookCommentUseCase)this.h.get()), ((GetGuestBookPinCommentUseCase)this.i.get()), ((GetBlogUseCase)this.j.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static PinGuestbookViewModel newInstance(AccountRepository accountRepository0, GetPinGuestBookComment getPinGuestBookComment0, GetGuestbookListUseCase getGuestbookListUseCase0, UpdateGuestbookUseCase updateGuestbookUseCase0, WriteGuestbookUseCase writeGuestbookUseCase0, DeleteGuestbookUseCase deleteGuestbookUseCase0, PinGuestBookCommentUseCase pinGuestBookCommentUseCase0, UnPinGuestBookCommentUseCase unPinGuestBookCommentUseCase0, GetGuestBookPinCommentUseCase getGuestBookPinCommentUseCase0, GetBlogUseCase getBlogUseCase0) {
        return new PinGuestbookViewModel(accountRepository0, getPinGuestBookComment0, getGuestbookListUseCase0, updateGuestbookUseCase0, writeGuestbookUseCase0, deleteGuestbookUseCase0, pinGuestBookCommentUseCase0, unPinGuestBookCommentUseCase0, getGuestBookPinCommentUseCase0, getBlogUseCase0);
    }
}

