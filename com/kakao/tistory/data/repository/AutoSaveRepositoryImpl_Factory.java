package com.kakao.tistory.data.repository;

import com.kakao.tistory.data.mapper.AutoSavedMapper;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class AutoSaveRepositoryImpl_Factory implements Factory {
    public final Provider a;

    public AutoSaveRepositoryImpl_Factory(Provider provider0) {
        this.a = provider0;
    }

    public static AutoSaveRepositoryImpl_Factory create(Provider provider0) {
        return new AutoSaveRepositoryImpl_Factory(provider0);
    }

    public AutoSaveRepositoryImpl get() {
        return AutoSaveRepositoryImpl_Factory.newInstance(((AutoSavedMapper)this.a.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static AutoSaveRepositoryImpl newInstance(AutoSavedMapper autoSavedMapper0) {
        return new AutoSaveRepositoryImpl(autoSavedMapper0);
    }
}

