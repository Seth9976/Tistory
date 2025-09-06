package com.kakao.tistory.data.mapper;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import yb.a;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class AutoSavedMapper_Factory implements Factory {
    public static AutoSavedMapper_Factory create() {
        return a.a;
    }

    public AutoSavedMapper get() {
        return AutoSavedMapper_Factory.newInstance();
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static AutoSavedMapper newInstance() {
        return new AutoSavedMapper();
    }
}

