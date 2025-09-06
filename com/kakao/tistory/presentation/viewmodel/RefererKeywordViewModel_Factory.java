package com.kakao.tistory.presentation.viewmodel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class RefererKeywordViewModel_Factory implements Factory {
    public static RefererKeywordViewModel_Factory create() {
        return k3.a;
    }

    public RefererKeywordViewModel get() {
        return RefererKeywordViewModel_Factory.newInstance();
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static RefererKeywordViewModel newInstance() {
        return new RefererKeywordViewModel();
    }
}

