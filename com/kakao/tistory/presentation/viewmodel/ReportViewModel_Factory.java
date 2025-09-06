package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.domain.repository.EntryRepository;
import com.kakao.tistory.domain.usecase.GetIllegalFilmReportUrlUseCase;
import com.kakao.tistory.domain.usecase.PostReportCommentUseCase;
import com.kakao.tistory.domain.usecase.ReportBlogUseCase;
import com.kakao.tistory.domain.usecase.ReportGuestbookUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class ReportViewModel_Factory implements Factory {
    public final Provider a;
    public final Provider b;
    public final Provider c;
    public final Provider d;
    public final Provider e;

    public ReportViewModel_Factory(Provider provider0, Provider provider1, Provider provider2, Provider provider3, Provider provider4) {
        this.a = provider0;
        this.b = provider1;
        this.c = provider2;
        this.d = provider3;
        this.e = provider4;
    }

    public static ReportViewModel_Factory create(Provider provider0, Provider provider1, Provider provider2, Provider provider3, Provider provider4) {
        return new ReportViewModel_Factory(provider0, provider1, provider2, provider3, provider4);
    }

    public ReportViewModel get() {
        return ReportViewModel_Factory.newInstance(((EntryRepository)this.a.get()), ((PostReportCommentUseCase)this.b.get()), ((ReportGuestbookUseCase)this.c.get()), ((ReportBlogUseCase)this.d.get()), ((GetIllegalFilmReportUrlUseCase)this.e.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static ReportViewModel newInstance(EntryRepository entryRepository0, PostReportCommentUseCase postReportCommentUseCase0, ReportGuestbookUseCase reportGuestbookUseCase0, ReportBlogUseCase reportBlogUseCase0, GetIllegalFilmReportUrlUseCase getIllegalFilmReportUrlUseCase0) {
        return new ReportViewModel(entryRepository0, postReportCommentUseCase0, reportGuestbookUseCase0, reportBlogUseCase0, getIllegalFilmReportUrlUseCase0);
    }
}

