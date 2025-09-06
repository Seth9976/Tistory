package com.kakao.tistory.presentation.common.glide;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bumptech.glide.GlideBuilder;
import com.bumptech.glide.annotation.GlideModule;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.module.AppGlideModule;
import com.bumptech.glide.request.RequestOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@GlideModule
@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/kakao/tistory/presentation/common/glide/TistoryGlideModule;", "Lcom/bumptech/glide/module/AppGlideModule;", "()V", "applyOptions", "", "context", "Landroid/content/Context;", "builder", "Lcom/bumptech/glide/GlideBuilder;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class TistoryGlideModule extends AppGlideModule {
    public static final int $stable;

    @Override  // com.bumptech.glide.module.AppGlideModule
    public void applyOptions(@NotNull Context context0, @NotNull GlideBuilder glideBuilder0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(glideBuilder0, "builder");
        glideBuilder0.setLogLevel(3);
        glideBuilder0.setDefaultRequestOptions(((RequestOptions)((RequestOptions)new RequestOptions().format(DecodeFormat.PREFER_ARGB_8888)).diskCacheStrategy(DiskCacheStrategy.RESOURCE)));
    }
}

