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
public final class SetFirstOpenedUseCase_Factory implements Factory {
    public final Provider a;

    public SetFirstOpenedUseCase_Factory(Provider provider0) {
        this.a = provider0;
    }

    public static SetFirstOpenedUseCase_Factory create(Provider provider0) {
        return new SetFirstOpenedUseCase_Factory(provider0);
    }

    public SetFirstOpenedUseCase get() {
        return SetFirstOpenedUseCase_Factory.newInstance(((BlogRepository)this.a.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static SetFirstOpenedUseCase newInstance(BlogRepository blogRepository0) {
        return new SetFirstOpenedUseCase(blogRepository0);
    }
}

