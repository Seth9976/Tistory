package com.kakao.tistory.module;

import com.kakao.tistory.domain.entity.BuildType;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Module
@InstallIn({SingletonComponent.class})
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001A\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lcom/kakao/tistory/module/GradleModule;", "", "()V", "provideBuildType", "Lcom/kakao/tistory/domain/entity/BuildType;", "tistory-3.0.8(3080)_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class GradleModule {
    @Provides
    @Singleton
    @NotNull
    public final BuildType provideBuildType() {
        return new BuildType("prod");
    }
}

