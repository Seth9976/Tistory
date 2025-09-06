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
public final class ChangeBlockUseCase_Factory implements Factory {
    public final Provider a;

    public ChangeBlockUseCase_Factory(Provider provider0) {
        this.a = provider0;
    }

    public static ChangeBlockUseCase_Factory create(Provider provider0) {
        return new ChangeBlockUseCase_Factory(provider0);
    }

    public ChangeBlockUseCase get() {
        return ChangeBlockUseCase_Factory.newInstance(((BlogRepository)this.a.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static ChangeBlockUseCase newInstance(BlogRepository blogRepository0) {
        return new ChangeBlockUseCase(blogRepository0);
    }
}

