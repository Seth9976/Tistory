package com.kakao.tistory.presentation.common.glide;

import android.content.res.Resources.Theme;
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
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.RequestOptions;

public final class GlideOptions extends RequestOptions implements Cloneable {
    public static GlideOptions a;
    public static GlideOptions b;
    public static GlideOptions c;
    public static GlideOptions d;
    public static GlideOptions e;
    public static GlideOptions f;

    @Override  // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    @NonNull
    public BaseRequestOptions apply(@NonNull BaseRequestOptions baseRequestOptions0) {
        return this.apply(baseRequestOptions0);
    }

    @CheckResult
    @NonNull
    public GlideOptions apply(@NonNull BaseRequestOptions baseRequestOptions0) {
        return (GlideOptions)super.apply(baseRequestOptions0);
    }

    @Override  // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    public BaseRequestOptions autoClone() {
        return this.autoClone();
    }

    @NonNull
    public GlideOptions autoClone() {
        return (GlideOptions)super.autoClone();
    }

    @CheckResult
    @NonNull
    public static GlideOptions bitmapTransform(@NonNull Transformation transformation0) {
        return new GlideOptions().transform(transformation0);
    }

    @Override  // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    @NonNull
    public BaseRequestOptions centerCrop() {
        return this.centerCrop();
    }

    @CheckResult
    @NonNull
    public GlideOptions centerCrop() {
        return (GlideOptions)super.centerCrop();
    }

    @CheckResult
    @NonNull
    public static GlideOptions centerCropTransform() {
        if(GlideOptions.c == null) {
            GlideOptions.c = new GlideOptions().centerCrop().autoClone();
        }
        return GlideOptions.c;
    }

    @Override  // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    @NonNull
    public BaseRequestOptions centerInside() {
        return this.centerInside();
    }

    @CheckResult
    @NonNull
    public GlideOptions centerInside() {
        return (GlideOptions)super.centerInside();
    }

    @CheckResult
    @NonNull
    public static GlideOptions centerInsideTransform() {
        if(GlideOptions.b == null) {
            GlideOptions.b = new GlideOptions().centerInside().autoClone();
        }
        return GlideOptions.b;
    }

    @Override  // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    @NonNull
    public BaseRequestOptions circleCrop() {
        return this.circleCrop();
    }

    @CheckResult
    @NonNull
    public GlideOptions circleCrop() {
        return (GlideOptions)super.circleCrop();
    }

    @CheckResult
    @NonNull
    public static GlideOptions circleCropTransform() {
        if(GlideOptions.d == null) {
            GlideOptions.d = new GlideOptions().circleCrop().autoClone();
        }
        return GlideOptions.d;
    }

    @Override  // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    public BaseRequestOptions clone() {
        return this.clone();
    }

    @CheckResult
    public GlideOptions clone() {
        return (GlideOptions)super.clone();
    }

    @Override  // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    public Object clone() throws CloneNotSupportedException {
        return this.clone();
    }

    @Override  // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    @NonNull
    public BaseRequestOptions decode(@NonNull Class class0) {
        return this.decode(class0);
    }

    @CheckResult
    @NonNull
    public GlideOptions decode(@NonNull Class class0) {
        return (GlideOptions)super.decode(class0);
    }

    @CheckResult
    @NonNull
    public static GlideOptions decodeTypeOf(@NonNull Class class0) {
        return new GlideOptions().decode(class0);
    }

    @Override  // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    @NonNull
    public BaseRequestOptions disallowHardwareConfig() {
        return this.disallowHardwareConfig();
    }

    @CheckResult
    @NonNull
    public GlideOptions disallowHardwareConfig() {
        return (GlideOptions)super.disallowHardwareConfig();
    }

    @Override  // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    @NonNull
    public BaseRequestOptions diskCacheStrategy(@NonNull DiskCacheStrategy diskCacheStrategy0) {
        return this.diskCacheStrategy(diskCacheStrategy0);
    }

    @CheckResult
    @NonNull
    public GlideOptions diskCacheStrategy(@NonNull DiskCacheStrategy diskCacheStrategy0) {
        return (GlideOptions)super.diskCacheStrategy(diskCacheStrategy0);
    }

    @CheckResult
    @NonNull
    public static GlideOptions diskCacheStrategyOf(@NonNull DiskCacheStrategy diskCacheStrategy0) {
        return new GlideOptions().diskCacheStrategy(diskCacheStrategy0);
    }

    @Override  // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    @NonNull
    public BaseRequestOptions dontAnimate() {
        return this.dontAnimate();
    }

    @CheckResult
    @NonNull
    public GlideOptions dontAnimate() {
        return (GlideOptions)super.dontAnimate();
    }

    @Override  // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    @NonNull
    public BaseRequestOptions dontTransform() {
        return this.dontTransform();
    }

    @CheckResult
    @NonNull
    public GlideOptions dontTransform() {
        return (GlideOptions)super.dontTransform();
    }

    @Override  // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    @NonNull
    public BaseRequestOptions downsample(@NonNull DownsampleStrategy downsampleStrategy0) {
        return this.downsample(downsampleStrategy0);
    }

    @CheckResult
    @NonNull
    public GlideOptions downsample(@NonNull DownsampleStrategy downsampleStrategy0) {
        return (GlideOptions)super.downsample(downsampleStrategy0);
    }

    @CheckResult
    @NonNull
    public static GlideOptions downsampleOf(@NonNull DownsampleStrategy downsampleStrategy0) {
        return new GlideOptions().downsample(downsampleStrategy0);
    }

    @Override  // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    @NonNull
    public BaseRequestOptions encodeFormat(@NonNull Bitmap.CompressFormat bitmap$CompressFormat0) {
        return this.encodeFormat(bitmap$CompressFormat0);
    }

    @CheckResult
    @NonNull
    public GlideOptions encodeFormat(@NonNull Bitmap.CompressFormat bitmap$CompressFormat0) {
        return (GlideOptions)super.encodeFormat(bitmap$CompressFormat0);
    }

    @CheckResult
    @NonNull
    public static GlideOptions encodeFormatOf(@NonNull Bitmap.CompressFormat bitmap$CompressFormat0) {
        return new GlideOptions().encodeFormat(bitmap$CompressFormat0);
    }

    @Override  // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    @NonNull
    public BaseRequestOptions encodeQuality(@IntRange(from = 0L, to = 100L) int v) {
        return this.encodeQuality(v);
    }

    @CheckResult
    @NonNull
    public GlideOptions encodeQuality(@IntRange(from = 0L, to = 100L) int v) {
        return (GlideOptions)super.encodeQuality(v);
    }

    @CheckResult
    @NonNull
    public static GlideOptions encodeQualityOf(@IntRange(from = 0L, to = 100L) int v) {
        return new GlideOptions().encodeQuality(v);
    }

    @Override  // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    @NonNull
    public BaseRequestOptions error(@DrawableRes int v) {
        return this.error(v);
    }

    @Override  // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    @NonNull
    public BaseRequestOptions error(@Nullable Drawable drawable0) {
        return this.error(drawable0);
    }

    @CheckResult
    @NonNull
    public GlideOptions error(@DrawableRes int v) {
        return (GlideOptions)super.error(v);
    }

    @CheckResult
    @NonNull
    public GlideOptions error(@Nullable Drawable drawable0) {
        return (GlideOptions)super.error(drawable0);
    }

    @CheckResult
    @NonNull
    public static GlideOptions errorOf(@DrawableRes int v) {
        return new GlideOptions().error(v);
    }

    @CheckResult
    @NonNull
    public static GlideOptions errorOf(@Nullable Drawable drawable0) {
        return new GlideOptions().error(drawable0);
    }

    @Override  // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    @NonNull
    public BaseRequestOptions fallback(@DrawableRes int v) {
        return this.fallback(v);
    }

    @Override  // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    @NonNull
    public BaseRequestOptions fallback(@Nullable Drawable drawable0) {
        return this.fallback(drawable0);
    }

    @CheckResult
    @NonNull
    public GlideOptions fallback(@DrawableRes int v) {
        return (GlideOptions)super.fallback(v);
    }

    @CheckResult
    @NonNull
    public GlideOptions fallback(@Nullable Drawable drawable0) {
        return (GlideOptions)super.fallback(drawable0);
    }

    @Override  // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    @NonNull
    public BaseRequestOptions fitCenter() {
        return this.fitCenter();
    }

    @CheckResult
    @NonNull
    public GlideOptions fitCenter() {
        return (GlideOptions)super.fitCenter();
    }

    @CheckResult
    @NonNull
    public static GlideOptions fitCenterTransform() {
        if(GlideOptions.a == null) {
            GlideOptions.a = new GlideOptions().fitCenter().autoClone();
        }
        return GlideOptions.a;
    }

    @Override  // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    @NonNull
    public BaseRequestOptions format(@NonNull DecodeFormat decodeFormat0) {
        return this.format(decodeFormat0);
    }

    @CheckResult
    @NonNull
    public GlideOptions format(@NonNull DecodeFormat decodeFormat0) {
        return (GlideOptions)super.format(decodeFormat0);
    }

    @CheckResult
    @NonNull
    public static GlideOptions formatOf(@NonNull DecodeFormat decodeFormat0) {
        return new GlideOptions().format(decodeFormat0);
    }

    @Override  // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    @NonNull
    public BaseRequestOptions frame(@IntRange(from = 0L) long v) {
        return this.frame(v);
    }

    @CheckResult
    @NonNull
    public GlideOptions frame(@IntRange(from = 0L) long v) {
        return (GlideOptions)super.frame(v);
    }

    @CheckResult
    @NonNull
    public static GlideOptions frameOf(@IntRange(from = 0L) long v) {
        return new GlideOptions().frame(v);
    }

    @Override  // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    public BaseRequestOptions lock() {
        return this.lock();
    }

    @NonNull
    public GlideOptions lock() {
        return (GlideOptions)super.lock();
    }

    @CheckResult
    @NonNull
    public static GlideOptions noAnimation() {
        if(GlideOptions.f == null) {
            GlideOptions.f = new GlideOptions().dontAnimate().autoClone();
        }
        return GlideOptions.f;
    }

    @CheckResult
    @NonNull
    public static GlideOptions noTransformation() {
        if(GlideOptions.e == null) {
            GlideOptions.e = new GlideOptions().dontTransform().autoClone();
        }
        return GlideOptions.e;
    }

    @Override  // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    @NonNull
    public BaseRequestOptions onlyRetrieveFromCache(boolean z) {
        return this.onlyRetrieveFromCache(z);
    }

    @CheckResult
    @NonNull
    public GlideOptions onlyRetrieveFromCache(boolean z) {
        return (GlideOptions)super.onlyRetrieveFromCache(z);
    }

    @CheckResult
    @NonNull
    public static GlideOptions option(@NonNull Option option0, @NonNull Object object0) {
        return new GlideOptions().set(option0, object0);
    }

    @Override  // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    @NonNull
    public BaseRequestOptions optionalCenterCrop() {
        return this.optionalCenterCrop();
    }

    @CheckResult
    @NonNull
    public GlideOptions optionalCenterCrop() {
        return (GlideOptions)super.optionalCenterCrop();
    }

    @Override  // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    @NonNull
    public BaseRequestOptions optionalCenterInside() {
        return this.optionalCenterInside();
    }

    @CheckResult
    @NonNull
    public GlideOptions optionalCenterInside() {
        return (GlideOptions)super.optionalCenterInside();
    }

    @Override  // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    @NonNull
    public BaseRequestOptions optionalCircleCrop() {
        return this.optionalCircleCrop();
    }

    @CheckResult
    @NonNull
    public GlideOptions optionalCircleCrop() {
        return (GlideOptions)super.optionalCircleCrop();
    }

    @Override  // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    @NonNull
    public BaseRequestOptions optionalFitCenter() {
        return this.optionalFitCenter();
    }

    @CheckResult
    @NonNull
    public GlideOptions optionalFitCenter() {
        return (GlideOptions)super.optionalFitCenter();
    }

    @Override  // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    @NonNull
    public BaseRequestOptions optionalTransform(@NonNull Transformation transformation0) {
        return this.optionalTransform(transformation0);
    }

    @Override  // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    @NonNull
    public BaseRequestOptions optionalTransform(@NonNull Class class0, @NonNull Transformation transformation0) {
        return this.optionalTransform(class0, transformation0);
    }

    @CheckResult
    @NonNull
    public GlideOptions optionalTransform(@NonNull Transformation transformation0) {
        return (GlideOptions)super.optionalTransform(transformation0);
    }

    @CheckResult
    @NonNull
    public GlideOptions optionalTransform(@NonNull Class class0, @NonNull Transformation transformation0) {
        return (GlideOptions)super.optionalTransform(class0, transformation0);
    }

    @Override  // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    @NonNull
    public BaseRequestOptions override(int v) {
        return this.override(v);
    }

    @Override  // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    @NonNull
    public BaseRequestOptions override(int v, int v1) {
        return this.override(v, v1);
    }

    @CheckResult
    @NonNull
    public GlideOptions override(int v) {
        return (GlideOptions)super.override(v);
    }

    @CheckResult
    @NonNull
    public GlideOptions override(int v, int v1) {
        return (GlideOptions)super.override(v, v1);
    }

    @CheckResult
    @NonNull
    public static GlideOptions overrideOf(int v) {
        return new GlideOptions().override(v);
    }

    @CheckResult
    @NonNull
    public static GlideOptions overrideOf(int v, int v1) {
        return new GlideOptions().override(v, v1);
    }

    @Override  // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    @NonNull
    public BaseRequestOptions placeholder(@DrawableRes int v) {
        return this.placeholder(v);
    }

    @Override  // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    @NonNull
    public BaseRequestOptions placeholder(@Nullable Drawable drawable0) {
        return this.placeholder(drawable0);
    }

    @CheckResult
    @NonNull
    public GlideOptions placeholder(@DrawableRes int v) {
        return (GlideOptions)super.placeholder(v);
    }

    @CheckResult
    @NonNull
    public GlideOptions placeholder(@Nullable Drawable drawable0) {
        return (GlideOptions)super.placeholder(drawable0);
    }

    @CheckResult
    @NonNull
    public static GlideOptions placeholderOf(@DrawableRes int v) {
        return new GlideOptions().placeholder(v);
    }

    @CheckResult
    @NonNull
    public static GlideOptions placeholderOf(@Nullable Drawable drawable0) {
        return new GlideOptions().placeholder(drawable0);
    }

    @Override  // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    @NonNull
    public BaseRequestOptions priority(@NonNull Priority priority0) {
        return this.priority(priority0);
    }

    @CheckResult
    @NonNull
    public GlideOptions priority(@NonNull Priority priority0) {
        return (GlideOptions)super.priority(priority0);
    }

    @CheckResult
    @NonNull
    public static GlideOptions priorityOf(@NonNull Priority priority0) {
        return new GlideOptions().priority(priority0);
    }

    @Override  // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    @NonNull
    public BaseRequestOptions set(@NonNull Option option0, @NonNull Object object0) {
        return this.set(option0, object0);
    }

    @CheckResult
    @NonNull
    public GlideOptions set(@NonNull Option option0, @NonNull Object object0) {
        return (GlideOptions)super.set(option0, object0);
    }

    @Override  // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    @NonNull
    public BaseRequestOptions signature(@NonNull Key key0) {
        return this.signature(key0);
    }

    @CheckResult
    @NonNull
    public GlideOptions signature(@NonNull Key key0) {
        return (GlideOptions)super.signature(key0);
    }

    @CheckResult
    @NonNull
    public static GlideOptions signatureOf(@NonNull Key key0) {
        return new GlideOptions().signature(key0);
    }

    @Override  // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    @NonNull
    public BaseRequestOptions sizeMultiplier(@FloatRange(from = 0.0, to = 1.0) float f) {
        return this.sizeMultiplier(f);
    }

    @CheckResult
    @NonNull
    public GlideOptions sizeMultiplier(@FloatRange(from = 0.0, to = 1.0) float f) {
        return (GlideOptions)super.sizeMultiplier(f);
    }

    @CheckResult
    @NonNull
    public static GlideOptions sizeMultiplierOf(@FloatRange(from = 0.0, to = 1.0) float f) {
        return new GlideOptions().sizeMultiplier(f);
    }

    @Override  // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    @NonNull
    public BaseRequestOptions skipMemoryCache(boolean z) {
        return this.skipMemoryCache(z);
    }

    @CheckResult
    @NonNull
    public GlideOptions skipMemoryCache(boolean z) {
        return (GlideOptions)super.skipMemoryCache(z);
    }

    @CheckResult
    @NonNull
    public static GlideOptions skipMemoryCacheOf(boolean z) {
        return new GlideOptions().skipMemoryCache(z);
    }

    @Override  // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    @NonNull
    public BaseRequestOptions theme(@Nullable Resources.Theme resources$Theme0) {
        return this.theme(resources$Theme0);
    }

    @CheckResult
    @NonNull
    public GlideOptions theme(@Nullable Resources.Theme resources$Theme0) {
        return (GlideOptions)super.theme(resources$Theme0);
    }

    @Override  // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    @NonNull
    public BaseRequestOptions timeout(@IntRange(from = 0L) int v) {
        return this.timeout(v);
    }

    @CheckResult
    @NonNull
    public GlideOptions timeout(@IntRange(from = 0L) int v) {
        return (GlideOptions)super.timeout(v);
    }

    @CheckResult
    @NonNull
    public static GlideOptions timeoutOf(@IntRange(from = 0L) int v) {
        return new GlideOptions().timeout(v);
    }

    @Override  // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    @NonNull
    public BaseRequestOptions transform(@NonNull Transformation transformation0) {
        return this.transform(transformation0);
    }

    @Override  // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    @NonNull
    public BaseRequestOptions transform(@NonNull Class class0, @NonNull Transformation transformation0) {
        return this.transform(class0, transformation0);
    }

    @Override  // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    @NonNull
    @SafeVarargs
    public BaseRequestOptions transform(@NonNull Transformation[] arr_transformation) {
        return this.transform(arr_transformation);
    }

    @CheckResult
    @NonNull
    public GlideOptions transform(@NonNull Transformation transformation0) {
        return (GlideOptions)super.transform(transformation0);
    }

    @CheckResult
    @NonNull
    public GlideOptions transform(@NonNull Class class0, @NonNull Transformation transformation0) {
        return (GlideOptions)super.transform(class0, transformation0);
    }

    @CheckResult
    @NonNull
    @SafeVarargs
    public final GlideOptions transform(@NonNull Transformation[] arr_transformation) {
        return (GlideOptions)super.transform(arr_transformation);
    }

    @Override  // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    @NonNull
    @Deprecated
    @SafeVarargs
    public BaseRequestOptions transforms(@NonNull Transformation[] arr_transformation) {
        return this.transforms(arr_transformation);
    }

    @CheckResult
    @NonNull
    @Deprecated
    @SafeVarargs
    public final GlideOptions transforms(@NonNull Transformation[] arr_transformation) {
        return (GlideOptions)super.transforms(arr_transformation);
    }

    @Override  // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    @NonNull
    public BaseRequestOptions useAnimationPool(boolean z) {
        return this.useAnimationPool(z);
    }

    @CheckResult
    @NonNull
    public GlideOptions useAnimationPool(boolean z) {
        return (GlideOptions)super.useAnimationPool(z);
    }

    @Override  // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    @NonNull
    public BaseRequestOptions useUnlimitedSourceGeneratorsPool(boolean z) {
        return this.useUnlimitedSourceGeneratorsPool(z);
    }

    @CheckResult
    @NonNull
    public GlideOptions useUnlimitedSourceGeneratorsPool(boolean z) {
        return (GlideOptions)super.useUnlimitedSourceGeneratorsPool(z);
    }
}

