package com.kakao.tistory.module;

import android.content.ContentResolver;
import android.content.Context;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Module
@InstallIn({SingletonComponent.class})
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001A\u00020\u00042\b\b\u0001\u0010\u0005\u001A\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/kakao/tistory/module/ContextModule;", "", "()V", "provideContentResolver", "Landroid/content/ContentResolver;", "context", "Landroid/content/Context;", "tistory-3.0.8(3080)_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class ContextModule {
    @Provides
    @NotNull
    public final ContentResolver provideContentResolver(@ApplicationContext @NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        ContentResolver contentResolver0 = context0.getContentResolver();
        Intrinsics.checkNotNullExpressionValue(contentResolver0, "getContentResolver(...)");
        return contentResolver0;
    }
}

