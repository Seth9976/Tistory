package com.kakao.tistory.presentation.viewmodel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class BlogSwitchViewModel_Factory implements Factory {
    public static BlogSwitchViewModel_Factory create() {
        return n.a;
    }

    public BlogSwitchViewModel get() {
        return BlogSwitchViewModel_Factory.newInstance();
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static BlogSwitchViewModel newInstance() {
        return new BlogSwitchViewModel();
    }
}

