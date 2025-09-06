package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.domain.repository.AccountRepository;
import com.kakao.tistory.domain.repository.AutoSaveRepository;
import com.kakao.tistory.domain.repository.EntryFileRepository;
import com.kakao.tistory.domain.repository.EntryRepository;
import com.kakao.tistory.domain.repository.GrammarRepository;
import com.kakao.tistory.domain.usecase.GetChallengeRequirementsUseCase;
import com.kakao.tistory.domain.usecase.GetEditableEntryUseCase;
import com.kakao.tistory.domain.usecase.GetLatestEditEntryUseCase;
import com.kakao.tistory.domain.usecase.GetMyBlogUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class EditorViewModel_Factory implements Factory {
    public final Provider a;
    public final Provider b;
    public final Provider c;
    public final Provider d;
    public final Provider e;
    public final Provider f;
    public final Provider g;
    public final Provider h;
    public final Provider i;

    public EditorViewModel_Factory(Provider provider0, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8) {
        this.a = provider0;
        this.b = provider1;
        this.c = provider2;
        this.d = provider3;
        this.e = provider4;
        this.f = provider5;
        this.g = provider6;
        this.h = provider7;
        this.i = provider8;
    }

    public static EditorViewModel_Factory create(Provider provider0, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8) {
        return new EditorViewModel_Factory(provider0, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public EditorViewModel get() {
        return EditorViewModel_Factory.newInstance(((EntryRepository)this.a.get()), ((EntryFileRepository)this.b.get()), ((AccountRepository)this.c.get()), ((AutoSaveRepository)this.d.get()), ((GrammarRepository)this.e.get()), ((GetEditableEntryUseCase)this.f.get()), ((GetLatestEditEntryUseCase)this.g.get()), ((GetMyBlogUseCase)this.h.get()), ((GetChallengeRequirementsUseCase)this.i.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static EditorViewModel newInstance(EntryRepository entryRepository0, EntryFileRepository entryFileRepository0, AccountRepository accountRepository0, AutoSaveRepository autoSaveRepository0, GrammarRepository grammarRepository0, GetEditableEntryUseCase getEditableEntryUseCase0, GetLatestEditEntryUseCase getLatestEditEntryUseCase0, GetMyBlogUseCase getMyBlogUseCase0, GetChallengeRequirementsUseCase getChallengeRequirementsUseCase0) {
        return new EditorViewModel(entryRepository0, entryFileRepository0, accountRepository0, autoSaveRepository0, grammarRepository0, getEditableEntryUseCase0, getLatestEditEntryUseCase0, getMyBlogUseCase0, getChallengeRequirementsUseCase0);
    }
}

