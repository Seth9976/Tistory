package com.kakao.tistory.presentation.common.glide;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.RequestOptions;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.R.drawable;
import com.kakao.tistory.presentation.common.utils.ScaleUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\bÇ\u0002\u0018\u00002\u00020\u0001R\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001A\u0004\b\t\u0010\u0006R\u0017\u0010\r\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000B\u0010\u0004\u001A\u0004\b\f\u0010\u0006R\u0017\u0010\u0010\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000E\u0010\u0004\u001A\u0004\b\u000F\u0010\u0006R\u0017\u0010\u0013\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001A\u0004\b\u0012\u0010\u0006¨\u0006\u0014"}, d2 = {"Lcom/kakao/tistory/presentation/common/glide/GlideRequestOptions;", "", "Lcom/bumptech/glide/request/RequestOptions;", "a", "Lcom/bumptech/glide/request/RequestOptions;", "getNONE", "()Lcom/bumptech/glide/request/RequestOptions;", "NONE", "b", "getDEFAULT", "DEFAULT", "c", "getUSER_PROFILE_NO_BORDER", "USER_PROFILE_NO_BORDER", "d", "getBLOG_TOP_PROFILE", "BLOG_TOP_PROFILE", "e", "getBLOG_BOTTOM_NAVIGATION", "BLOG_BOTTOM_NAVIGATION", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class GlideRequestOptions {
    public static final int $stable;
    @NotNull
    public static final GlideRequestOptions INSTANCE;
    public static final RequestOptions a;
    public static final RequestOptions b;
    public static final RequestOptions c;
    public static final RequestOptions d;
    public static final RequestOptions e;

    static {
        GlideRequestOptions.INSTANCE = new GlideRequestOptions();
        BaseRequestOptions baseRequestOptions0 = new RequestOptions().placeholder(color.color_d0d0d0);
        Intrinsics.checkNotNullExpressionValue(baseRequestOptions0, "placeholder(...)");
        GlideRequestOptions.a = (RequestOptions)baseRequestOptions0;
        BaseRequestOptions baseRequestOptions1 = ((RequestOptions)((RequestOptions)new RequestOptions().transform(new Transformation[]{new CenterCrop(), new BorderTransformation(CornerType.ROUNDED, 1, 0, 0, 12, null)})).placeholder(drawable.bg_d0_rounded_1dp)).error(drawable.bg_d0_rounded_1dp);
        Intrinsics.checkNotNullExpressionValue(baseRequestOptions1, "error(...)");
        GlideRequestOptions.b = (RequestOptions)baseRequestOptions1;
        BaseRequestOptions baseRequestOptions2 = ((RequestOptions)((RequestOptions)new RequestOptions().circleCrop()).placeholder(drawable.dot_d0d0d0)).error(drawable.dot_d0d0d0);
        Intrinsics.checkNotNullExpressionValue(baseRequestOptions2, "error(...)");
        GlideRequestOptions.c = (RequestOptions)baseRequestOptions2;
        BaseRequestOptions baseRequestOptions3 = ((RequestOptions)((RequestOptions)new RequestOptions().centerCrop()).placeholder(color.color_d0d0d0)).error(color.color_d0d0d0);
        Intrinsics.checkNotNullExpressionValue(baseRequestOptions3, "error(...)");
        GlideRequestOptions.d = (RequestOptions)baseRequestOptions3;
        BaseRequestOptions baseRequestOptions4 = ((RequestOptions)((RequestOptions)new RequestOptions().transform(new Transformation[]{new CenterCrop(), new RoundedCorners(ScaleUtils.dp2px$default(ScaleUtils.INSTANCE, 3.0f, null, 2, null))})).placeholder(drawable.bg_d0_rounded_3dp)).error(drawable.bg_d0_rounded_3dp);
        Intrinsics.checkNotNullExpressionValue(baseRequestOptions4, "error(...)");
        GlideRequestOptions.e = (RequestOptions)baseRequestOptions4;
        GlideRequestOptions.$stable = 8;
    }

    @NotNull
    public final RequestOptions getBLOG_BOTTOM_NAVIGATION() {
        return GlideRequestOptions.e;
    }

    @NotNull
    public final RequestOptions getBLOG_TOP_PROFILE() {
        return GlideRequestOptions.d;
    }

    @NotNull
    public final RequestOptions getDEFAULT() {
        return GlideRequestOptions.b;
    }

    @NotNull
    public final RequestOptions getNONE() {
        return GlideRequestOptions.a;
    }

    @NotNull
    public final RequestOptions getUSER_PROFILE_NO_BORDER() {
        return GlideRequestOptions.c;
    }
}

