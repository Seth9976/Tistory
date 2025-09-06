package com.kakao.tistory.module;

import com.kakao.tistory.domain.entity.BuildType;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata("javax.inject.Singleton")
public final class GradleModule_ProvideBuildTypeFactory implements Factory {
    public final GradleModule a;

    public GradleModule_ProvideBuildTypeFactory(GradleModule gradleModule0) {
        this.a = gradleModule0;
    }

    public static GradleModule_ProvideBuildTypeFactory create(GradleModule gradleModule0) {
        return new GradleModule_ProvideBuildTypeFactory(gradleModule0);
    }

    public BuildType get() {
        return GradleModule_ProvideBuildTypeFactory.provideBuildType(this.a);
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static BuildType provideBuildType(GradleModule gradleModule0) {
        return (BuildType)Preconditions.checkNotNullFromProvides(gradleModule0.provideBuildType());
    }
}

