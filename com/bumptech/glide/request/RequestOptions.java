package com.bumptech.glide.request;

import android.graphics.Bitmap.CompressFormat;
import android.graphics.drawable.Drawable;
import androidx.annotation.CheckResult;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;

public class RequestOptions extends BaseRequestOptions {
    public static RequestOptions G;
    public static RequestOptions H;
    public static RequestOptions I;
    public static RequestOptions J;
    public static RequestOptions K;
    public static RequestOptions L;
    public static RequestOptions M;
    public static RequestOptions N;

    @CheckResult
    @NonNull
    public static RequestOptions bitmapTransform(@NonNull Transformation transformation0) {
        return (RequestOptions)new RequestOptions().transform(transformation0);
    }

    @CheckResult
    @NonNull
    public static RequestOptions centerCropTransform() {
        if(RequestOptions.K == null) {
            RequestOptions.K = (RequestOptions)((RequestOptions)new RequestOptions().centerCrop()).autoClone();
        }
        return RequestOptions.K;
    }

    @CheckResult
    @NonNull
    public static RequestOptions centerInsideTransform() {
        if(RequestOptions.J == null) {
            RequestOptions.J = (RequestOptions)((RequestOptions)new RequestOptions().centerInside()).autoClone();
        }
        return RequestOptions.J;
    }

    @CheckResult
    @NonNull
    public static RequestOptions circleCropTransform() {
        if(RequestOptions.L == null) {
            RequestOptions.L = (RequestOptions)((RequestOptions)new RequestOptions().circleCrop()).autoClone();
        }
        return RequestOptions.L;
    }

    @CheckResult
    @NonNull
    public static RequestOptions decodeTypeOf(@NonNull Class class0) {
        return (RequestOptions)new RequestOptions().decode(class0);
    }

    @CheckResult
    @NonNull
    public static RequestOptions diskCacheStrategyOf(@NonNull DiskCacheStrategy diskCacheStrategy0) {
        return (RequestOptions)new RequestOptions().diskCacheStrategy(diskCacheStrategy0);
    }

    @CheckResult
    @NonNull
    public static RequestOptions downsampleOf(@NonNull DownsampleStrategy downsampleStrategy0) {
        return (RequestOptions)new RequestOptions().downsample(downsampleStrategy0);
    }

    @CheckResult
    @NonNull
    public static RequestOptions encodeFormatOf(@NonNull Bitmap.CompressFormat bitmap$CompressFormat0) {
        return (RequestOptions)new RequestOptions().encodeFormat(bitmap$CompressFormat0);
    }

    @CheckResult
    @NonNull
    public static RequestOptions encodeQualityOf(@IntRange(from = 0L, to = 100L) int v) {
        return (RequestOptions)new RequestOptions().encodeQuality(v);
    }

    // 去混淆评级： 低(20)
    @Override  // com.bumptech.glide.request.BaseRequestOptions
    public boolean equals(Object object0) {
        return object0 instanceof RequestOptions && super.equals(object0);
    }

    @CheckResult
    @NonNull
    public static RequestOptions errorOf(@DrawableRes int v) {
        return (RequestOptions)new RequestOptions().error(v);
    }

    @CheckResult
    @NonNull
    public static RequestOptions errorOf(@Nullable Drawable drawable0) {
        return (RequestOptions)new RequestOptions().error(drawable0);
    }

    @CheckResult
    @NonNull
    public static RequestOptions fitCenterTransform() {
        if(RequestOptions.I == null) {
            RequestOptions.I = (RequestOptions)((RequestOptions)new RequestOptions().fitCenter()).autoClone();
        }
        return RequestOptions.I;
    }

    @CheckResult
    @NonNull
    public static RequestOptions formatOf(@NonNull DecodeFormat decodeFormat0) {
        return (RequestOptions)new RequestOptions().format(decodeFormat0);
    }

    @CheckResult
    @NonNull
    public static RequestOptions frameOf(@IntRange(from = 0L) long v) {
        return (RequestOptions)new RequestOptions().frame(v);
    }

    @Override  // com.bumptech.glide.request.BaseRequestOptions
    public int hashCode() {
        return super.hashCode();
    }

    @CheckResult
    @NonNull
    public static RequestOptions noAnimation() {
        if(RequestOptions.N == null) {
            RequestOptions.N = (RequestOptions)((RequestOptions)new RequestOptions().dontAnimate()).autoClone();
        }
        return RequestOptions.N;
    }

    @CheckResult
    @NonNull
    public static RequestOptions noTransformation() {
        if(RequestOptions.M == null) {
            RequestOptions.M = (RequestOptions)((RequestOptions)new RequestOptions().dontTransform()).autoClone();
        }
        return RequestOptions.M;
    }

    @CheckResult
    @NonNull
    public static RequestOptions option(@NonNull Option option0, @NonNull Object object0) {
        return (RequestOptions)new RequestOptions().set(option0, object0);
    }

    @CheckResult
    @NonNull
    public static RequestOptions overrideOf(int v) {
        return RequestOptions.overrideOf(v, v);
    }

    @CheckResult
    @NonNull
    public static RequestOptions overrideOf(int v, int v1) {
        return (RequestOptions)new RequestOptions().override(v, v1);
    }

    @CheckResult
    @NonNull
    public static RequestOptions placeholderOf(@DrawableRes int v) {
        return (RequestOptions)new RequestOptions().placeholder(v);
    }

    @CheckResult
    @NonNull
    public static RequestOptions placeholderOf(@Nullable Drawable drawable0) {
        return (RequestOptions)new RequestOptions().placeholder(drawable0);
    }

    @CheckResult
    @NonNull
    public static RequestOptions priorityOf(@NonNull Priority priority0) {
        return (RequestOptions)new RequestOptions().priority(priority0);
    }

    @CheckResult
    @NonNull
    public static RequestOptions signatureOf(@NonNull Key key0) {
        return (RequestOptions)new RequestOptions().signature(key0);
    }

    @CheckResult
    @NonNull
    public static RequestOptions sizeMultiplierOf(@FloatRange(from = 0.0, to = 1.0) float f) {
        return (RequestOptions)new RequestOptions().sizeMultiplier(f);
    }

    @CheckResult
    @NonNull
    public static RequestOptions skipMemoryCacheOf(boolean z) {
        if(z) {
            if(RequestOptions.G == null) {
                RequestOptions.G = (RequestOptions)((RequestOptions)new RequestOptions().skipMemoryCache(true)).autoClone();
            }
            return RequestOptions.G;
        }
        if(RequestOptions.H == null) {
            RequestOptions.H = (RequestOptions)((RequestOptions)new RequestOptions().skipMemoryCache(false)).autoClone();
        }
        return RequestOptions.H;
    }

    @CheckResult
    @NonNull
    public static RequestOptions timeoutOf(@IntRange(from = 0L) int v) {
        return (RequestOptions)new RequestOptions().timeout(v);
    }
}

