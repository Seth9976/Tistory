package com.kakao.tistory.presentation.viewmodel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class TistoryGuideViewModel_Factory implements Factory {
    public static TistoryGuideViewModel_Factory create() {
        return b7.a;
    }

    public TistoryGuideViewModel get() {
        return TistoryGuideViewModel_Factory.newInstance();
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static TistoryGuideViewModel newInstance() {
        return new TistoryGuideViewModel();
    }
}

