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
public final class GetEntryListUseCase_Factory implements Factory {
    public final Provider a;

    public GetEntryListUseCase_Factory(Provider provider0) {
        this.a = provider0;
    }

    public static GetEntryListUseCase_Factory create(Provider provider0) {
        return new GetEntryListUseCase_Factory(provider0);
    }

    public GetEntryListUseCase get() {
        return GetEntryListUseCase_Factory.newInstance(((BlogRepository)this.a.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static GetEntryListUseCase newInstance(BlogRepository blogRepository0) {
        return new GetEntryListUseCase(blogRepository0);
    }
}

