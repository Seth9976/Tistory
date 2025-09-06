package com.kakao.tistory.module;

import android.content.ContentResolver;
import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata({"dagger.hilt.android.qualifiers.ApplicationContext"})
@ScopeMetadata
public final class ContextModule_ProvideContentResolverFactory implements Factory {
    public final ContextModule a;
    public final Provider b;

    public ContextModule_ProvideContentResolverFactory(ContextModule contextModule0, Provider provider0) {
        this.a = contextModule0;
        this.b = provider0;
    }

    public static ContextModule_ProvideContentResolverFactory create(ContextModule contextModule0, Provider provider0) {
        return new ContextModule_ProvideContentResolverFactory(contextModule0, provider0);
    }

    public ContentResolver get() {
        Context context0 = (Context)this.b.get();
        return ContextModule_ProvideContentResolverFactory.provideContentResolver(this.a, context0);
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static ContentResolver provideContentResolver(ContextModule contextModule0, Context context0) {
        return (ContentResolver)Preconditions.checkNotNullFromProvides(contextModule0.provideContentResolver(context0));
    }
}

