package com.kakao.tistory;

import a2.b;
import androidx.appcompat.app.AppCompatDelegate;
import com.kakao.android.base.tiara.TiaraUtils;
import com.kakao.tistory.domain.usecase.GetCurrentBlogTitleUseCase;
import com.kakao.tistory.presentation.KandinskyInitializerKt;
import com.kakao.tistory.presentation.common.coil.CoilExtensionKt;
import com.kakao.tistory.presentation.common.push.PushChannelBuilder;
import com.kakao.tistory.presentation.common.tiara.TistoryTiara;
import dagger.hilt.android.HiltAndroidApp;
import javax.inject.Inject;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@HiltAndroidApp
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000F\u0010\u0005\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003R.\u0010\u000E\u001A\u0004\u0018\u00010\u00062\b\u0010\u0007\u001A\u0004\u0018\u00010\u00068\u0006@GX\u0086\u000E¢\u0006\u0012\n\u0004\b\b\u0010\t\u001A\u0004\b\n\u0010\u000B\"\u0004\b\f\u0010\rR.\u0010\u0016\u001A\u0004\u0018\u00010\u000F2\b\u0010\u0007\u001A\u0004\u0018\u00010\u000F8\u0006@GX\u0086\u000E¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/kakao/tistory/TistoryApplication;", "Landroid/app/Application;", "<init>", "()V", "", "onCreate", "Lcom/kakao/tistory/presentation/common/push/PushChannelBuilder;", "<set-?>", "d", "Lcom/kakao/tistory/presentation/common/push/PushChannelBuilder;", "getPushChannelBuilder", "()Lcom/kakao/tistory/presentation/common/push/PushChannelBuilder;", "setPushChannelBuilder", "(Lcom/kakao/tistory/presentation/common/push/PushChannelBuilder;)V", "pushChannelBuilder", "Lcom/kakao/tistory/domain/usecase/GetCurrentBlogTitleUseCase;", "e", "Lcom/kakao/tistory/domain/usecase/GetCurrentBlogTitleUseCase;", "getGetCurrentBlogTitleUseCase", "()Lcom/kakao/tistory/domain/usecase/GetCurrentBlogTitleUseCase;", "setGetCurrentBlogTitleUseCase", "(Lcom/kakao/tistory/domain/usecase/GetCurrentBlogTitleUseCase;)V", "getCurrentBlogTitleUseCase", "tistory-3.0.8(3080)_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class TistoryApplication extends Hilt_TistoryApplication {
    public final String c;
    public PushChannelBuilder d;
    public GetCurrentBlogTitleUseCase e;

    public TistoryApplication() {
        this.c = "tistory.m.app";
    }

    @Nullable
    public final GetCurrentBlogTitleUseCase getGetCurrentBlogTitleUseCase() {
        return this.e;
    }

    @Nullable
    public final PushChannelBuilder getPushChannelBuilder() {
        return this.d;
    }

    @Override  // com.kakao.tistory.Hilt_TistoryApplication
    public void onCreate() {
        super.onCreate();
        TiaraUtils.init$default(TiaraUtils.INSTANCE, this, this.c, null, "tistory.com", 4, null);
        TistoryTiara.init$default(TistoryTiara.INSTANCE, this, this.c, null, "tistory.com", 4, null);
        PushChannelBuilder pushChannelBuilder0 = this.d;
        if(pushChannelBuilder0 != null) {
            pushChannelBuilder0.initialize();
        }
        AppCompatDelegate.setDefaultNightMode(1);
        CoilExtensionKt.initCoil(this);
        KandinskyInitializerKt.initKandinsky(this, new b(this, 29));
    }

    @Inject
    public final void setGetCurrentBlogTitleUseCase(@Nullable GetCurrentBlogTitleUseCase getCurrentBlogTitleUseCase0) {
        this.e = getCurrentBlogTitleUseCase0;
    }

    @Inject
    public final void setPushChannelBuilder(@Nullable PushChannelBuilder pushChannelBuilder0) {
        this.d = pushChannelBuilder0;
    }
}

