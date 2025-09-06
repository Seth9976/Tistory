package com.kakao.tistory.data.repository;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import zb.a;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class ThrowableRepositoryImpl_Factory implements Factory {
    public static ThrowableRepositoryImpl_Factory create() {
        return a.a;
    }

    public ThrowableRepositoryImpl get() {
        return ThrowableRepositoryImpl_Factory.newInstance();
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static ThrowableRepositoryImpl newInstance() {
        return new ThrowableRepositoryImpl();
    }
}

