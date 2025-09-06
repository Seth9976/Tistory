package com.kakao.tistory.domain.blog.usecase;

import com.kakao.tistory.domain.blog.repository.BlogRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class GetNoticeListUseCase_Factory implements Factory {
    public final Provider a;

    public GetNoticeListUseCase_Factory(Provider provider0) {
        this.a = provider0;
    }

    public static GetNoticeListUseCase_Factory create(Provider provider0) {
        return new GetNoticeListUseCase_Factory(provider0);
    }

    public GetNoticeListUseCase get() {
        return GetNoticeListUseCase_Factory.newInstance(((BlogRepository)this.a.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static GetNoticeListUseCase newInstance(BlogRepository blogRepository0) {
        return new GetNoticeListUseCase(blogRepository0);
    }
}

