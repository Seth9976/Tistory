package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.domain.blog.usecase.GetShowChallengeAuthUseCase;
import com.kakao.tistory.domain.blog.usecase.SetShowChallengeAuthUseCase;
import com.kakao.tistory.domain.repository.AccountRepository;
import com.kakao.tistory.domain.repository.EntryRepository;
import com.kakao.tistory.domain.repository.OldBlogRepository;
import com.kakao.tistory.domain.repository.SessionRepository;
import com.kakao.tistory.domain.usecase.PostEntryChallengeUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class EntryViewModel_Factory implements Factory {
    public final Provider a;
    public final Provider b;
    public final Provider c;
    public final Provider d;
    public final Provider e;
    public final Provider f;
    public final Provider g;

    public EntryViewModel_Factory(Provider provider0, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        this.a = provider0;
        this.b = provider1;
        this.c = provider2;
        this.d = provider3;
        this.e = provider4;
        this.f = provider5;
        this.g = provider6;
    }

    public static EntryViewModel_Factory create(Provider provider0, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        return new EntryViewModel_Factory(provider0, provider1, provider2, provider3, provider4, provider5, provider6);
    }

    public EntryViewModel get() {
        return EntryViewModel_Factory.newInstance(((AccountRepository)this.a.get()), ((SessionRepository)this.b.get()), ((EntryRepository)this.c.get()), ((OldBlogRepository)this.d.get()), ((PostEntryChallengeUseCase)this.e.get()), ((GetShowChallengeAuthUseCase)this.f.get()), ((SetShowChallengeAuthUseCase)this.g.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static EntryViewModel newInstance(AccountRepository accountRepository0, SessionRepository sessionRepository0, EntryRepository entryRepository0, OldBlogRepository oldBlogRepository0, PostEntryChallengeUseCase postEntryChallengeUseCase0, GetShowChallengeAuthUseCase getShowChallengeAuthUseCase0, SetShowChallengeAuthUseCase setShowChallengeAuthUseCase0) {
        return new EntryViewModel(accountRepository0, sessionRepository0, entryRepository0, oldBlogRepository0, postEntryChallengeUseCase0, getShowChallengeAuthUseCase0, setShowChallengeAuthUseCase0);
    }
}

