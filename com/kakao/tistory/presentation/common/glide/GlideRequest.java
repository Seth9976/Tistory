package com.kakao.tistory.presentation.common.glide;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.CheckResult;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import com.bumptech.glide.Glide;
import com.bumptech.glide.Priority;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.TransitionOptions;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.RequestListener;
import java.io.File;
import java.net.URL;
import java.util.List;

public class GlideRequest extends RequestBuilder implements Cloneable {
    public GlideRequest(Glide glide0, GlideRequests glideRequests0, Class class0, Context context0) {
        super(glide0, glideRequests0, class0, context0);
    }

    public GlideRequest(GlideRequest glideRequest0) {
        super(File.class, glideRequest0);
    }

    @Override  // com.bumptech.glide.RequestBuilder
    @CheckResult
    @NonNull
    public RequestBuilder addListener(@Nullable RequestListener requestListener0) {
        return this.addListener(requestListener0);
    }

    @CheckResult
    @NonNull
    public GlideRequest addListener(@Nullable RequestListener requestListener0) {
        return (GlideRequest)super.addListener(requestListener0);
    }

    @Override  // com.bumptech.glide.RequestBuilder
    @CheckResult
    @NonNull
    public RequestBuilder apply(@NonNull BaseRequestOptions baseRequestOptions0) {
        return this.apply(baseRequestOptions0);
    }

    @Override  // com.bumptech.glide.RequestBuilder
    @CheckResult
    @NonNull
    public BaseRequestOptions apply(@NonNull BaseRequestOptions baseRequestOptions0) {
        return this.apply(baseRequestOptions0);
    }

    @CheckResult
    @NonNull
    public GlideRequest apply(@NonNull BaseRequestOptions baseRequestOptions0) {
        return (GlideRequest)super.apply(baseRequestOptions0);
    }

    @Override  // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    @NonNull
    public BaseRequestOptions centerCrop() {
        return this.centerCrop();
    }

    @CheckResult
    @NonNull
    public GlideRequest centerCrop() {
        return (GlideRequest)super.centerCrop();
    }

    @Override  // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    @NonNull
    public BaseRequestOptions centerInside() {
        return this.centerInside();
    }

    @CheckResult
    @NonNull
    public GlideRequest centerInside() {
        return (GlideRequest)super.centerInside();
    }

    @Override  // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    @NonNull
    public BaseRequestOptions circleCrop() {
        return this.circleCrop();
    }

    @CheckResult
    @NonNull
    public GlideRequest circleCrop() {
        return (GlideRequest)super.circleCrop();
    }

    @Override  // com.bumptech.glide.RequestBuilder
    @CheckResult
    public RequestBuilder clone() {
        return this.clone();
    }

    @Override  // com.bumptech.glide.RequestBuilder
    @CheckResult
    public BaseRequestOptions clone() {
        return this.clone();
    }

    @CheckResult
    public GlideRequest clone() {
        return (GlideRequest)super.clone();
    }

    @Override  // com.bumptech.glide.RequestBuilder
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
    public GlideRequest decode(@NonNull Class class0) {
        return (GlideRequest)super.decode(class0);
    }

    @Override  // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    @NonNull
    public BaseRequestOptions disallowHardwareConfig() {
        return this.disallowHardwareConfig();
    }

    @CheckResult
    @NonNull
    public GlideRequest disallowHardwareConfig() {
        return (GlideRequest)super.disallowHardwareConfig();
    }

    @Override  // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    @NonNull
    public BaseRequestOptions diskCacheStrategy(@NonNull DiskCacheStrategy diskCacheStrategy0) {
        return this.diskCacheStrategy(diskCacheStrategy0);
    }

    @CheckResult
    @NonNull
    public GlideRequest diskCacheStrategy(@NonNull DiskCacheStrategy diskCacheStrategy0) {
        return (GlideRequest)super.diskCacheStrategy(diskCacheStrategy0);
    }

    @Override  // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    @NonNull
    public BaseRequestOptions dontAnimate() {
        return this.dontAnimate();
    }

    @CheckResult
    @NonNull
    public GlideRequest dontAnimate() {
        return (GlideRequest)super.dontAnimate();
    }

    @Override  // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    @NonNull
    public BaseRequestOptions dontTransform() {
        return this.dontTransform();
    }

    @CheckResult
    @NonNull
    public GlideRequest dontTransform() {
        return (GlideRequest)super.dontTransform();
    }

    @Override  // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    @NonNull
    public BaseRequestOptions downsample(@NonNull DownsampleStrategy downsampleStrategy0) {
        return this.downsample(downsampleStrategy0);
    }

    @CheckResult
    @NonNull
    public GlideRequest downsample(@NonNull DownsampleStrategy downsampleStrategy0) {
        return (GlideRequest)super.downsample(downsampleStrategy0);
    }

    @Override  // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    @NonNull
    public BaseRequestOptions encodeFormat(@NonNull Bitmap.CompressFormat bitmap$CompressFormat0) {
        return this.encodeFormat(bitmap$CompressFormat0);
    }

    @CheckResult
    @NonNull
    public GlideRequest encodeFormat(@NonNull Bitmap.CompressFormat bitmap$CompressFormat0) {
        return (GlideRequest)super.encodeFormat(bitmap$CompressFormat0);
    }

    @Override  // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    @NonNull
    public BaseRequestOptions encodeQuality(@IntRange(from = 0L, to = 100L) int v) {
        return this.encodeQuality(v);
    }

    @CheckResult
    @NonNull
    public GlideRequest encodeQuality(@IntRange(from = 0L, to = 100L) int v) {
        return (GlideRequest)super.encodeQuality(v);
    }

    @Override  // com.bumptech.glide.RequestBuilder
    @NonNull
    public RequestBuilder error(@Nullable RequestBuilder requestBuilder0) {
        return this.error(requestBuilder0);
    }

    @Override  // com.bumptech.glide.RequestBuilder
    @CheckResult
    @NonNull
    public RequestBuilder error(Object object0) {
        return this.error(object0);
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
    public GlideRequest error(@DrawableRes int v) {
        return (GlideRequest)super.error(v);
    }

    @CheckResult
    @NonNull
    public GlideRequest error(@Nullable Drawable drawable0) {
        return (GlideRequest)super.error(drawable0);
    }

    @NonNull
    public GlideRequest error(@Nullable RequestBuilder requestBuilder0) {
        return (GlideRequest)super.error(requestBuilder0);
    }

    @CheckResult
    @NonNull
    public GlideRequest error(Object object0) {
        return (GlideRequest)super.error(object0);
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
    public GlideRequest fallback(@DrawableRes int v) {
        return (GlideRequest)super.fallback(v);
    }

    @CheckResult
    @NonNull
    public GlideRequest fallback(@Nullable Drawable drawable0) {
        return (GlideRequest)super.fallback(drawable0);
    }

    @Override  // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    @NonNull
    public BaseRequestOptions fitCenter() {
        return this.fitCenter();
    }

    @CheckResult
    @NonNull
    public GlideRequest fitCenter() {
        return (GlideRequest)super.fitCenter();
    }

    @Override  // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    @NonNull
    public BaseRequestOptions format(@NonNull DecodeFormat decodeFormat0) {
        return this.format(decodeFormat0);
    }

    @CheckResult
    @NonNull
    public GlideRequest format(@NonNull DecodeFormat decodeFormat0) {
        return (GlideRequest)super.format(decodeFormat0);
    }

    @Override  // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    @NonNull
    public BaseRequestOptions frame(@IntRange(from = 0L) long v) {
        return this.frame(v);
    }

    @CheckResult
    @NonNull
    public GlideRequest frame(@IntRange(from = 0L) long v) {
        return (GlideRequest)super.frame(v);
    }

    @Override  // com.bumptech.glide.RequestBuilder
    @CheckResult
    @NonNull
    public RequestBuilder getDownloadOnlyRequest() {
        return this.getDownloadOnlyRequest();
    }

    @CheckResult
    @NonNull
    public GlideRequest getDownloadOnlyRequest() {
        return new GlideRequest(this).apply(RequestBuilder.DOWNLOAD_ONLY_OPTIONS);
    }

    @Override  // com.bumptech.glide.RequestBuilder
    @CheckResult
    @NonNull
    public RequestBuilder listener(@Nullable RequestListener requestListener0) {
        return this.listener(requestListener0);
    }

    @CheckResult
    @NonNull
    public GlideRequest listener(@Nullable RequestListener requestListener0) {
        return (GlideRequest)super.listener(requestListener0);
    }

    @Override  // com.bumptech.glide.RequestBuilder
    @CheckResult
    @NonNull
    public RequestBuilder load(@Nullable Bitmap bitmap0) {
        return this.load(bitmap0);
    }

    @Override  // com.bumptech.glide.RequestBuilder
    @CheckResult
    @NonNull
    public RequestBuilder load(@Nullable Drawable drawable0) {
        return this.load(drawable0);
    }

    @Override  // com.bumptech.glide.RequestBuilder
    @CheckResult
    @NonNull
    public RequestBuilder load(@Nullable Uri uri0) {
        return this.load(uri0);
    }

    @Override  // com.bumptech.glide.RequestBuilder
    @CheckResult
    @NonNull
    public RequestBuilder load(@Nullable File file0) {
        return this.load(file0);
    }

    @Override  // com.bumptech.glide.RequestBuilder
    @CheckResult
    @NonNull
    public RequestBuilder load(@DrawableRes @Nullable @RawRes Integer integer0) {
        return this.load(integer0);
    }

    @Override  // com.bumptech.glide.RequestBuilder
    @CheckResult
    @NonNull
    public RequestBuilder load(@Nullable Object object0) {
        return this.load(object0);
    }

    @Override  // com.bumptech.glide.RequestBuilder
    @CheckResult
    @NonNull
    public RequestBuilder load(@Nullable String s) {
        return this.load(s);
    }

    @Override  // com.bumptech.glide.RequestBuilder
    @CheckResult
    @Deprecated
    public RequestBuilder load(@Nullable URL uRL0) {
        return this.load(uRL0);
    }

    @Override  // com.bumptech.glide.RequestBuilder
    @CheckResult
    @NonNull
    public RequestBuilder load(@Nullable byte[] arr_b) {
        return this.load(arr_b);
    }

    @CheckResult
    @NonNull
    public GlideRequest load(@Nullable Bitmap bitmap0) {
        return (GlideRequest)super.load(bitmap0);
    }

    @CheckResult
    @NonNull
    public GlideRequest load(@Nullable Drawable drawable0) {
        return (GlideRequest)super.load(drawable0);
    }

    @CheckResult
    @NonNull
    public GlideRequest load(@Nullable Uri uri0) {
        return (GlideRequest)super.load(uri0);
    }

    @CheckResult
    @NonNull
    public GlideRequest load(@Nullable File file0) {
        return (GlideRequest)super.load(file0);
    }

    @CheckResult
    @NonNull
    public GlideRequest load(@DrawableRes @Nullable @RawRes Integer integer0) {
        return (GlideRequest)super.load(integer0);
    }

    @CheckResult
    @NonNull
    public GlideRequest load(@Nullable Object object0) {
        return (GlideRequest)super.load(object0);
    }

    @CheckResult
    @NonNull
    public GlideRequest load(@Nullable String s) {
        return (GlideRequest)super.load(s);
    }

    @CheckResult
    @Deprecated
    public GlideRequest load(@Nullable URL uRL0) {
        return (GlideRequest)super.load(uRL0);
    }

    @CheckResult
    @NonNull
    public GlideRequest load(@Nullable byte[] arr_b) {
        return (GlideRequest)super.load(arr_b);
    }

    @Override  // com.bumptech.glide.RequestBuilder
    @CheckResult
    @NonNull
    public Object load(@Nullable Bitmap bitmap0) {
        return this.load(bitmap0);
    }

    @Override  // com.bumptech.glide.RequestBuilder
    @CheckResult
    @NonNull
    public Object load(@Nullable Drawable drawable0) {
        return this.load(drawable0);
    }

    @Override  // com.bumptech.glide.RequestBuilder
    @CheckResult
    @NonNull
    public Object load(@Nullable Uri uri0) {
        return this.load(uri0);
    }

    @Override  // com.bumptech.glide.RequestBuilder
    @CheckResult
    @NonNull
    public Object load(@Nullable File file0) {
        return this.load(file0);
    }

    @Override  // com.bumptech.glide.RequestBuilder
    @CheckResult
    @NonNull
    public Object load(@DrawableRes @Nullable @RawRes Integer integer0) {
        return this.load(integer0);
    }

    @Override  // com.bumptech.glide.RequestBuilder
    @CheckResult
    @NonNull
    public Object load(@Nullable Object object0) {
        return this.load(object0);
    }

    @Override  // com.bumptech.glide.RequestBuilder
    @CheckResult
    @NonNull
    public Object load(@Nullable String s) {
        return this.load(s);
    }

    @Override  // com.bumptech.glide.RequestBuilder
    @CheckResult
    @Deprecated
    public Object load(@Nullable URL uRL0) {
        return this.load(uRL0);
    }

    @Override  // com.bumptech.glide.RequestBuilder
    @CheckResult
    @NonNull
    public Object load(@Nullable byte[] arr_b) {
        return this.load(arr_b);
    }

    @Override  // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    @NonNull
    public BaseRequestOptions onlyRetrieveFromCache(boolean z) {
        return this.onlyRetrieveFromCache(z);
    }

    @CheckResult
    @NonNull
    public GlideRequest onlyRetrieveFromCache(boolean z) {
        return (GlideRequest)super.onlyRetrieveFromCache(z);
    }

    @Override  // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    @NonNull
    public BaseRequestOptions optionalCenterCrop() {
        return this.optionalCenterCrop();
    }

    @CheckResult
    @NonNull
    public GlideRequest optionalCenterCrop() {
        return (GlideRequest)super.optionalCenterCrop();
    }

    @Override  // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    @NonNull
    public BaseRequestOptions optionalCenterInside() {
        return this.optionalCenterInside();
    }

    @CheckResult
    @NonNull
    public GlideRequest optionalCenterInside() {
        return (GlideRequest)super.optionalCenterInside();
    }

    @Override  // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    @NonNull
    public BaseRequestOptions optionalCircleCrop() {
        return this.optionalCircleCrop();
    }

    @CheckResult
    @NonNull
    public GlideRequest optionalCircleCrop() {
        return (GlideRequest)super.optionalCircleCrop();
    }

    @Override  // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    @NonNull
    public BaseRequestOptions optionalFitCenter() {
        return this.optionalFitCenter();
    }

    @CheckResult
    @NonNull
    public GlideRequest optionalFitCenter() {
        return (GlideRequest)super.optionalFitCenter();
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
    public GlideRequest optionalTransform(@NonNull Transformation transformation0) {
        return (GlideRequest)super.optionalTransform(transformation0);
    }

    @CheckResult
    @NonNull
    public GlideRequest optionalTransform(@NonNull Class class0, @NonNull Transformation transformation0) {
        return (GlideRequest)super.optionalTransform(class0, transformation0);
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
    public GlideRequest override(int v) {
        return (GlideRequest)super.override(v);
    }

    @CheckResult
    @NonNull
    public GlideRequest override(int v, int v1) {
        return (GlideRequest)super.override(v, v1);
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
    public GlideRequest placeholder(@DrawableRes int v) {
        return (GlideRequest)super.placeholder(v);
    }

    @CheckResult
    @NonNull
    public GlideRequest placeholder(@Nullable Drawable drawable0) {
        return (GlideRequest)super.placeholder(drawable0);
    }

    @Override  // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    @NonNull
    public BaseRequestOptions priority(@NonNull Priority priority0) {
        return this.priority(priority0);
    }

    @CheckResult
    @NonNull
    public GlideRequest priority(@NonNull Priority priority0) {
        return (GlideRequest)super.priority(priority0);
    }

    @Override  // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    @NonNull
    public BaseRequestOptions set(@NonNull Option option0, @NonNull Object object0) {
        return this.set(option0, object0);
    }

    @CheckResult
    @NonNull
    public GlideRequest set(@NonNull Option option0, @NonNull Object object0) {
        return (GlideRequest)super.set(option0, object0);
    }

    @Override  // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    @NonNull
    public BaseRequestOptions signature(@NonNull Key key0) {
        return this.signature(key0);
    }

    @CheckResult
    @NonNull
    public GlideRequest signature(@NonNull Key key0) {
        return (GlideRequest)super.signature(key0);
    }

    @Override  // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    @NonNull
    public BaseRequestOptions sizeMultiplier(@FloatRange(from = 0.0, to = 1.0) float f) {
        return this.sizeMultiplier(f);
    }

    @CheckResult
    @NonNull
    public GlideRequest sizeMultiplier(@FloatRange(from = 0.0, to = 1.0) float f) {
        return (GlideRequest)super.sizeMultiplier(f);
    }

    @Override  // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    @NonNull
    public BaseRequestOptions skipMemoryCache(boolean z) {
        return this.skipMemoryCache(z);
    }

    @CheckResult
    @NonNull
    public GlideRequest skipMemoryCache(boolean z) {
        return (GlideRequest)super.skipMemoryCache(z);
    }

    @Override  // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    @NonNull
    public BaseRequestOptions theme(@Nullable Resources.Theme resources$Theme0) {
        return this.theme(resources$Theme0);
    }

    @CheckResult
    @NonNull
    public GlideRequest theme(@Nullable Resources.Theme resources$Theme0) {
        return (GlideRequest)super.theme(resources$Theme0);
    }

    @Override  // com.bumptech.glide.RequestBuilder
    @CheckResult
    @NonNull
    @Deprecated
    public RequestBuilder thumbnail(float f) {
        return this.thumbnail(f);
    }

    @Override  // com.bumptech.glide.RequestBuilder
    @CheckResult
    @NonNull
    public RequestBuilder thumbnail(@Nullable RequestBuilder requestBuilder0) {
        return this.thumbnail(requestBuilder0);
    }

    @Override  // com.bumptech.glide.RequestBuilder
    @CheckResult
    @NonNull
    public RequestBuilder thumbnail(@Nullable List list0) {
        return this.thumbnail(list0);
    }

    @Override  // com.bumptech.glide.RequestBuilder
    @CheckResult
    @NonNull
    @SafeVarargs
    public RequestBuilder thumbnail(@Nullable RequestBuilder[] arr_requestBuilder) {
        return this.thumbnail(arr_requestBuilder);
    }

    @CheckResult
    @NonNull
    @Deprecated
    public GlideRequest thumbnail(float f) {
        return (GlideRequest)super.thumbnail(f);
    }

    @CheckResult
    @NonNull
    public GlideRequest thumbnail(@Nullable RequestBuilder requestBuilder0) {
        return (GlideRequest)super.thumbnail(requestBuilder0);
    }

    @CheckResult
    @NonNull
    public GlideRequest thumbnail(@Nullable List list0) {
        return (GlideRequest)super.thumbnail(list0);
    }

    @CheckResult
    @NonNull
    @SafeVarargs
    public final GlideRequest thumbnail(@Nullable RequestBuilder[] arr_requestBuilder) {
        return (GlideRequest)super.thumbnail(arr_requestBuilder);
    }

    @Override  // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    @NonNull
    public BaseRequestOptions timeout(@IntRange(from = 0L) int v) {
        return this.timeout(v);
    }

    @CheckResult
    @NonNull
    public GlideRequest timeout(@IntRange(from = 0L) int v) {
        return (GlideRequest)super.timeout(v);
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
    public BaseRequestOptions transform(@NonNull Transformation[] arr_transformation) {
        return this.transform(arr_transformation);
    }

    @CheckResult
    @NonNull
    public GlideRequest transform(@NonNull Transformation transformation0) {
        return (GlideRequest)super.transform(transformation0);
    }

    @CheckResult
    @NonNull
    public GlideRequest transform(@NonNull Class class0, @NonNull Transformation transformation0) {
        return (GlideRequest)super.transform(class0, transformation0);
    }

    @CheckResult
    @NonNull
    public GlideRequest transform(@NonNull Transformation[] arr_transformation) {
        return (GlideRequest)super.transform(arr_transformation);
    }

    @Override  // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    @NonNull
    @Deprecated
    public BaseRequestOptions transforms(@NonNull Transformation[] arr_transformation) {
        return this.transforms(arr_transformation);
    }

    @CheckResult
    @NonNull
    @Deprecated
    public GlideRequest transforms(@NonNull Transformation[] arr_transformation) {
        return (GlideRequest)super.transforms(arr_transformation);
    }

    @Override  // com.bumptech.glide.RequestBuilder
    @CheckResult
    @NonNull
    public RequestBuilder transition(@NonNull TransitionOptions transitionOptions0) {
        return this.transition(transitionOptions0);
    }

    @CheckResult
    @NonNull
    public GlideRequest transition(@NonNull TransitionOptions transitionOptions0) {
        return (GlideRequest)super.transition(transitionOptions0);
    }

    @Override  // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    @NonNull
    public BaseRequestOptions useAnimationPool(boolean z) {
        return this.useAnimationPool(z);
    }

    @CheckResult
    @NonNull
    public GlideRequest useAnimationPool(boolean z) {
        return (GlideRequest)super.useAnimationPool(z);
    }

    @Override  // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    @NonNull
    public BaseRequestOptions useUnlimitedSourceGeneratorsPool(boolean z) {
        return this.useUnlimitedSourceGeneratorsPool(z);
    }

    @CheckResult
    @NonNull
    public GlideRequest useUnlimitedSourceGeneratorsPool(boolean z) {
        return (GlideRequest)super.useUnlimitedSourceGeneratorsPool(z);
    }
}

