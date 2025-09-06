package com.bumptech.glide.request;

import android.content.res.Resources.Theme;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
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
import com.bumptech.glide.load.MultiTransformation;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.model.stream.HttpGlideUrlLoader;
import com.bumptech.glide.load.resource.bitmap.BitmapEncoder;
import com.bumptech.glide.load.resource.bitmap.BitmapTransformation;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.CenterInside;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.bumptech.glide.load.resource.bitmap.Downsampler;
import com.bumptech.glide.load.resource.bitmap.DrawableTransformation;
import com.bumptech.glide.load.resource.bitmap.FitCenter;
import com.bumptech.glide.load.resource.bitmap.VideoDecoder;
import com.bumptech.glide.load.resource.drawable.ResourceDrawableDecoder;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.load.resource.gif.GifDrawableTransformation;
import com.bumptech.glide.load.resource.gif.GifOptions;
import com.bumptech.glide.signature.EmptySignature;
import com.bumptech.glide.util.CachedHashCodeArrayMap;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import java.util.Map;

public abstract class BaseRequestOptions implements Cloneable {
    public Resources.Theme A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public int g;
    public float h;
    public DiskCacheStrategy i;
    public Priority j;
    public Drawable k;
    public int l;
    public Drawable m;
    public int n;
    public boolean o;
    public int p;
    public int q;
    public Key r;
    public boolean s;
    public boolean t;
    public Drawable u;
    public int v;
    public Options w;
    public CachedHashCodeArrayMap x;
    public Class y;
    public boolean z;

    public BaseRequestOptions() {
        this.h = 1.0f;
        this.i = DiskCacheStrategy.AUTOMATIC;
        this.j = Priority.NORMAL;
        this.o = true;
        this.p = -1;
        this.q = -1;
        this.r = EmptySignature.obtain();
        this.t = true;
        this.w = new Options();
        this.x = new CachedHashCodeArrayMap();
        this.y = Object.class;
        this.E = true;
    }

    public static boolean a(int v, int v1) {
        return (v & v1) != 0;
    }

    @CheckResult
    @NonNull
    public BaseRequestOptions apply(@NonNull BaseRequestOptions baseRequestOptions0) {
        if(this.B) {
            return this.clone().apply(baseRequestOptions0);
        }
        if(BaseRequestOptions.a(baseRequestOptions0.g, 2)) {
            this.h = baseRequestOptions0.h;
        }
        if(BaseRequestOptions.a(baseRequestOptions0.g, 0x40000)) {
            this.C = baseRequestOptions0.C;
        }
        if(BaseRequestOptions.a(baseRequestOptions0.g, 0x100000)) {
            this.F = baseRequestOptions0.F;
        }
        if(BaseRequestOptions.a(baseRequestOptions0.g, 4)) {
            this.i = baseRequestOptions0.i;
        }
        if(BaseRequestOptions.a(baseRequestOptions0.g, 8)) {
            this.j = baseRequestOptions0.j;
        }
        if(BaseRequestOptions.a(baseRequestOptions0.g, 16)) {
            this.k = baseRequestOptions0.k;
            this.l = 0;
            this.g &= -33;
        }
        if(BaseRequestOptions.a(baseRequestOptions0.g, 0x20)) {
            this.l = baseRequestOptions0.l;
            this.k = null;
            this.g &= -17;
        }
        if(BaseRequestOptions.a(baseRequestOptions0.g, 0x40)) {
            this.m = baseRequestOptions0.m;
            this.n = 0;
            this.g &= 0xFFFFFF7F;
        }
        if(BaseRequestOptions.a(baseRequestOptions0.g, 0x80)) {
            this.n = baseRequestOptions0.n;
            this.m = null;
            this.g &= -65;
        }
        if(BaseRequestOptions.a(baseRequestOptions0.g, 0x100)) {
            this.o = baseRequestOptions0.o;
        }
        if(BaseRequestOptions.a(baseRequestOptions0.g, 0x200)) {
            this.q = baseRequestOptions0.q;
            this.p = baseRequestOptions0.p;
        }
        if(BaseRequestOptions.a(baseRequestOptions0.g, 0x400)) {
            this.r = baseRequestOptions0.r;
        }
        if(BaseRequestOptions.a(baseRequestOptions0.g, 0x1000)) {
            this.y = baseRequestOptions0.y;
        }
        if(BaseRequestOptions.a(baseRequestOptions0.g, 0x2000)) {
            this.u = baseRequestOptions0.u;
            this.v = 0;
            this.g &= 0xFFFFBFFF;
        }
        if(BaseRequestOptions.a(baseRequestOptions0.g, 0x4000)) {
            this.v = baseRequestOptions0.v;
            this.u = null;
            this.g &= 0xFFFFDFFF;
        }
        if(BaseRequestOptions.a(baseRequestOptions0.g, 0x8000)) {
            this.A = baseRequestOptions0.A;
        }
        if(BaseRequestOptions.a(baseRequestOptions0.g, 0x10000)) {
            this.t = baseRequestOptions0.t;
        }
        if(BaseRequestOptions.a(baseRequestOptions0.g, 0x20000)) {
            this.s = baseRequestOptions0.s;
        }
        if(BaseRequestOptions.a(baseRequestOptions0.g, 0x800)) {
            this.x.putAll(baseRequestOptions0.x);
            this.E = baseRequestOptions0.E;
        }
        if(BaseRequestOptions.a(baseRequestOptions0.g, 0x80000)) {
            this.D = baseRequestOptions0.D;
        }
        if(!this.t) {
            this.x.clear();
            this.s = false;
            this.g &= 0xFFFDF7FF;
            this.E = true;
        }
        this.g |= baseRequestOptions0.g;
        this.w.putAll(baseRequestOptions0.w);
        return this.selfOrThrowIfLocked();
    }

    @NonNull
    public BaseRequestOptions autoClone() {
        if(this.z && !this.B) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.B = true;
        return this.lock();
    }

    public final BaseRequestOptions b(DownsampleStrategy downsampleStrategy0, BitmapTransformation bitmapTransformation0) {
        if(this.B) {
            return this.clone().b(downsampleStrategy0, bitmapTransformation0);
        }
        this.downsample(downsampleStrategy0);
        return this.e(bitmapTransformation0, false);
    }

    public final BaseRequestOptions c(Option option0) {
        if(this.B) {
            return this.clone().c(option0);
        }
        this.w.remove(option0);
        return this.selfOrThrowIfLocked();
    }

    @CheckResult
    @NonNull
    public BaseRequestOptions centerCrop() {
        CenterCrop centerCrop0 = new CenterCrop();
        return this.f(DownsampleStrategy.CENTER_OUTSIDE, centerCrop0);
    }

    @CheckResult
    @NonNull
    public BaseRequestOptions centerInside() {
        CenterInside centerInside0 = new CenterInside();
        return this.d(DownsampleStrategy.CENTER_INSIDE, centerInside0, true);
    }

    @CheckResult
    @NonNull
    public BaseRequestOptions circleCrop() {
        CircleCrop circleCrop0 = new CircleCrop();
        return this.f(DownsampleStrategy.CENTER_INSIDE, circleCrop0);
    }

    @CheckResult
    public BaseRequestOptions clone() {
        try {
            BaseRequestOptions baseRequestOptions0 = (BaseRequestOptions)super.clone();
            Options options0 = new Options();
            baseRequestOptions0.w = options0;
            options0.putAll(this.w);
            CachedHashCodeArrayMap cachedHashCodeArrayMap0 = new CachedHashCodeArrayMap();
            baseRequestOptions0.x = cachedHashCodeArrayMap0;
            cachedHashCodeArrayMap0.putAll(this.x);
            baseRequestOptions0.z = false;
            baseRequestOptions0.B = false;
            return baseRequestOptions0;
        }
        catch(CloneNotSupportedException cloneNotSupportedException0) {
            throw new RuntimeException(cloneNotSupportedException0);
        }
    }

    @Override
    @CheckResult
    public Object clone() throws CloneNotSupportedException {
        return this.clone();
    }

    public final BaseRequestOptions d(DownsampleStrategy downsampleStrategy0, BitmapTransformation bitmapTransformation0, boolean z) {
        BaseRequestOptions baseRequestOptions0 = z ? this.f(downsampleStrategy0, bitmapTransformation0) : this.b(downsampleStrategy0, bitmapTransformation0);
        baseRequestOptions0.E = true;
        return baseRequestOptions0;
    }

    @CheckResult
    @NonNull
    public BaseRequestOptions decode(@NonNull Class class0) {
        if(this.B) {
            return this.clone().decode(class0);
        }
        this.y = (Class)Preconditions.checkNotNull(class0);
        this.g |= 0x1000;
        return this.selfOrThrowIfLocked();
    }

    @CheckResult
    @NonNull
    public BaseRequestOptions disallowHardwareConfig() {
        return this.set(Downsampler.ALLOW_HARDWARE_CONFIG, Boolean.FALSE);
    }

    @CheckResult
    @NonNull
    public BaseRequestOptions diskCacheStrategy(@NonNull DiskCacheStrategy diskCacheStrategy0) {
        if(this.B) {
            return this.clone().diskCacheStrategy(diskCacheStrategy0);
        }
        this.i = (DiskCacheStrategy)Preconditions.checkNotNull(diskCacheStrategy0);
        this.g |= 4;
        return this.selfOrThrowIfLocked();
    }

    @CheckResult
    @NonNull
    public BaseRequestOptions dontAnimate() {
        return this.set(GifOptions.DISABLE_ANIMATION, Boolean.TRUE);
    }

    @CheckResult
    @NonNull
    public BaseRequestOptions dontTransform() {
        if(this.B) {
            return this.clone().dontTransform();
        }
        this.x.clear();
        this.s = false;
        this.t = false;
        this.g = this.g & 0xFFFDF7FF | 0x10000;
        this.E = true;
        return this.selfOrThrowIfLocked();
    }

    @CheckResult
    @NonNull
    public BaseRequestOptions downsample(@NonNull DownsampleStrategy downsampleStrategy0) {
        Object object0 = Preconditions.checkNotNull(downsampleStrategy0);
        return this.set(DownsampleStrategy.OPTION, object0);
    }

    public final BaseRequestOptions e(Transformation transformation0, boolean z) {
        if(this.B) {
            return this.clone().e(transformation0, z);
        }
        DrawableTransformation drawableTransformation0 = new DrawableTransformation(transformation0, z);
        this.g(Bitmap.class, transformation0, z);
        this.g(Drawable.class, drawableTransformation0, z);
        this.g(BitmapDrawable.class, drawableTransformation0, z);
        GifDrawableTransformation gifDrawableTransformation0 = new GifDrawableTransformation(transformation0);
        this.g(GifDrawable.class, gifDrawableTransformation0, z);
        return this.selfOrThrowIfLocked();
    }

    @CheckResult
    @NonNull
    public BaseRequestOptions encodeFormat(@NonNull Bitmap.CompressFormat bitmap$CompressFormat0) {
        Object object0 = Preconditions.checkNotNull(bitmap$CompressFormat0);
        return this.set(BitmapEncoder.COMPRESSION_FORMAT, object0);
    }

    @CheckResult
    @NonNull
    public BaseRequestOptions encodeQuality(@IntRange(from = 0L, to = 100L) int v) {
        return this.set(BitmapEncoder.COMPRESSION_QUALITY, v);
    }

    // 去混淆评级： 低(25)
    @Override
    public boolean equals(Object object0) {
        if(object0 instanceof BaseRequestOptions) {
            BaseRequestOptions baseRequestOptions0 = (BaseRequestOptions)object0;
            return Float.compare(baseRequestOptions0.h, this.h) == 0 && this.l == baseRequestOptions0.l && Util.bothNullOrEqual(this.k, baseRequestOptions0.k) && this.n == baseRequestOptions0.n && Util.bothNullOrEqual(this.m, baseRequestOptions0.m) && this.v == baseRequestOptions0.v && Util.bothNullOrEqual(this.u, baseRequestOptions0.u) && this.o == baseRequestOptions0.o && this.p == baseRequestOptions0.p && this.q == baseRequestOptions0.q && this.s == baseRequestOptions0.s && this.t == baseRequestOptions0.t && this.C == baseRequestOptions0.C && this.D == baseRequestOptions0.D && this.i.equals(baseRequestOptions0.i) && this.j == baseRequestOptions0.j && this.w.equals(baseRequestOptions0.w) && this.x.equals(baseRequestOptions0.x) && this.y.equals(baseRequestOptions0.y) && Util.bothNullOrEqual(this.r, baseRequestOptions0.r) && Util.bothNullOrEqual(this.A, baseRequestOptions0.A);
        }
        return false;
    }

    @CheckResult
    @NonNull
    public BaseRequestOptions error(@DrawableRes int v) {
        if(this.B) {
            return this.clone().error(v);
        }
        this.l = v;
        this.k = null;
        this.g = (this.g | 0x20) & -17;
        return this.selfOrThrowIfLocked();
    }

    @CheckResult
    @NonNull
    public BaseRequestOptions error(@Nullable Drawable drawable0) {
        if(this.B) {
            return this.clone().error(drawable0);
        }
        this.k = drawable0;
        this.l = 0;
        this.g = (this.g | 16) & -33;
        return this.selfOrThrowIfLocked();
    }

    public final BaseRequestOptions f(DownsampleStrategy downsampleStrategy0, BitmapTransformation bitmapTransformation0) {
        if(this.B) {
            return this.clone().f(downsampleStrategy0, bitmapTransformation0);
        }
        this.downsample(downsampleStrategy0);
        return this.transform(bitmapTransformation0);
    }

    @CheckResult
    @NonNull
    public BaseRequestOptions fallback(@DrawableRes int v) {
        if(this.B) {
            return this.clone().fallback(v);
        }
        this.v = v;
        this.u = null;
        this.g = (this.g | 0x4000) & 0xFFFFDFFF;
        return this.selfOrThrowIfLocked();
    }

    @CheckResult
    @NonNull
    public BaseRequestOptions fallback(@Nullable Drawable drawable0) {
        if(this.B) {
            return this.clone().fallback(drawable0);
        }
        this.u = drawable0;
        this.v = 0;
        this.g = (this.g | 0x2000) & 0xFFFFBFFF;
        return this.selfOrThrowIfLocked();
    }

    @CheckResult
    @NonNull
    public BaseRequestOptions fitCenter() {
        FitCenter fitCenter0 = new FitCenter();
        return this.d(DownsampleStrategy.FIT_CENTER, fitCenter0, true);
    }

    @CheckResult
    @NonNull
    public BaseRequestOptions format(@NonNull DecodeFormat decodeFormat0) {
        Preconditions.checkNotNull(decodeFormat0);
        return this.set(Downsampler.DECODE_FORMAT, decodeFormat0).set(GifOptions.DECODE_FORMAT, decodeFormat0);
    }

    @CheckResult
    @NonNull
    public BaseRequestOptions frame(@IntRange(from = 0L) long v) {
        return this.set(VideoDecoder.TARGET_FRAME, v);
    }

    public final BaseRequestOptions g(Class class0, Transformation transformation0, boolean z) {
        if(this.B) {
            return this.clone().g(class0, transformation0, z);
        }
        Preconditions.checkNotNull(class0);
        Preconditions.checkNotNull(transformation0);
        this.x.put(class0, transformation0);
        int v = this.g;
        this.t = true;
        this.g = 0x10800 | v;
        this.E = false;
        if(z) {
            this.g = v | 0x30800;
            this.s = true;
        }
        return this.selfOrThrowIfLocked();
    }

    @NonNull
    public final DiskCacheStrategy getDiskCacheStrategy() {
        return this.i;
    }

    public final int getErrorId() {
        return this.l;
    }

    @Nullable
    public final Drawable getErrorPlaceholder() {
        return this.k;
    }

    @Nullable
    public final Drawable getFallbackDrawable() {
        return this.u;
    }

    public final int getFallbackId() {
        return this.v;
    }

    public final boolean getOnlyRetrieveFromCache() {
        return this.D;
    }

    @NonNull
    public final Options getOptions() {
        return this.w;
    }

    public final int getOverrideHeight() {
        return this.p;
    }

    public final int getOverrideWidth() {
        return this.q;
    }

    @Nullable
    public final Drawable getPlaceholderDrawable() {
        return this.m;
    }

    public final int getPlaceholderId() {
        return this.n;
    }

    @NonNull
    public final Priority getPriority() {
        return this.j;
    }

    @NonNull
    public final Class getResourceClass() {
        return this.y;
    }

    @NonNull
    public final Key getSignature() {
        return this.r;
    }

    public final float getSizeMultiplier() {
        return this.h;
    }

    @Nullable
    public final Resources.Theme getTheme() {
        return this.A;
    }

    @NonNull
    public final Map getTransformations() {
        return this.x;
    }

    public final boolean getUseAnimationPool() {
        return this.F;
    }

    public final boolean getUseUnlimitedSourceGeneratorsPool() {
        return this.C;
    }

    @Override
    public int hashCode() {
        return Util.hashCode(this.A, Util.hashCode(this.r, Util.hashCode(this.y, Util.hashCode(this.x, Util.hashCode(this.w, Util.hashCode(this.j, Util.hashCode(this.i, Util.hashCode(this.D, Util.hashCode(this.C, Util.hashCode(this.t, Util.hashCode(this.s, (Util.hashCode(this.o, Util.hashCode(this.u, Util.hashCode(this.m, Util.hashCode(this.k, Util.hashCode(this.h) * 0x1F + this.l) * 0x1F + this.n) * 0x1F + this.v)) * 0x1F + this.p) * 0x1F + this.q)))))))))));
    }

    public final boolean isAutoCloneEnabled() {
        return this.B;
    }

    public final boolean isDiskCacheStrategySet() {
        return BaseRequestOptions.a(this.g, 4);
    }

    public final boolean isLocked() {
        return this.z;
    }

    public final boolean isMemoryCacheable() {
        return this.o;
    }

    public final boolean isPrioritySet() {
        return BaseRequestOptions.a(this.g, 8);
    }

    public final boolean isSkipMemoryCacheSet() {
        return BaseRequestOptions.a(this.g, 0x100);
    }

    public final boolean isTransformationAllowed() {
        return this.t;
    }

    public final boolean isTransformationRequired() {
        return this.s;
    }

    public final boolean isTransformationSet() {
        return BaseRequestOptions.a(this.g, 0x800);
    }

    public final boolean isValidOverride() {
        return Util.isValidDimensions(this.q, this.p);
    }

    @NonNull
    public BaseRequestOptions lock() {
        this.z = true;
        return this;
    }

    @CheckResult
    @NonNull
    public BaseRequestOptions onlyRetrieveFromCache(boolean z) {
        if(this.B) {
            return this.clone().onlyRetrieveFromCache(z);
        }
        this.D = z;
        this.g |= 0x80000;
        return this.selfOrThrowIfLocked();
    }

    @CheckResult
    @NonNull
    public BaseRequestOptions optionalCenterCrop() {
        CenterCrop centerCrop0 = new CenterCrop();
        return this.b(DownsampleStrategy.CENTER_OUTSIDE, centerCrop0);
    }

    @CheckResult
    @NonNull
    public BaseRequestOptions optionalCenterInside() {
        CenterInside centerInside0 = new CenterInside();
        return this.d(DownsampleStrategy.CENTER_INSIDE, centerInside0, false);
    }

    @CheckResult
    @NonNull
    public BaseRequestOptions optionalCircleCrop() {
        CircleCrop circleCrop0 = new CircleCrop();
        return this.b(DownsampleStrategy.CENTER_OUTSIDE, circleCrop0);
    }

    @CheckResult
    @NonNull
    public BaseRequestOptions optionalFitCenter() {
        FitCenter fitCenter0 = new FitCenter();
        return this.d(DownsampleStrategy.FIT_CENTER, fitCenter0, false);
    }

    @CheckResult
    @NonNull
    public BaseRequestOptions optionalTransform(@NonNull Transformation transformation0) {
        return this.e(transformation0, false);
    }

    @CheckResult
    @NonNull
    public BaseRequestOptions optionalTransform(@NonNull Class class0, @NonNull Transformation transformation0) {
        return this.g(class0, transformation0, false);
    }

    @CheckResult
    @NonNull
    public BaseRequestOptions override(int v) {
        return this.override(v, v);
    }

    @CheckResult
    @NonNull
    public BaseRequestOptions override(int v, int v1) {
        if(this.B) {
            return this.clone().override(v, v1);
        }
        this.q = v;
        this.p = v1;
        this.g |= 0x200;
        return this.selfOrThrowIfLocked();
    }

    @CheckResult
    @NonNull
    public BaseRequestOptions placeholder(@DrawableRes int v) {
        if(this.B) {
            return this.clone().placeholder(v);
        }
        this.n = v;
        this.m = null;
        this.g = (this.g | 0x80) & -65;
        return this.selfOrThrowIfLocked();
    }

    @CheckResult
    @NonNull
    public BaseRequestOptions placeholder(@Nullable Drawable drawable0) {
        if(this.B) {
            return this.clone().placeholder(drawable0);
        }
        this.m = drawable0;
        this.n = 0;
        this.g = (this.g | 0x40) & 0xFFFFFF7F;
        return this.selfOrThrowIfLocked();
    }

    @CheckResult
    @NonNull
    public BaseRequestOptions priority(@NonNull Priority priority0) {
        if(this.B) {
            return this.clone().priority(priority0);
        }
        this.j = (Priority)Preconditions.checkNotNull(priority0);
        this.g |= 8;
        return this.selfOrThrowIfLocked();
    }

    @NonNull
    public final BaseRequestOptions selfOrThrowIfLocked() {
        if(this.z) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
        return this;
    }

    @CheckResult
    @NonNull
    public BaseRequestOptions set(@NonNull Option option0, @NonNull Object object0) {
        if(this.B) {
            return this.clone().set(option0, object0);
        }
        Preconditions.checkNotNull(option0);
        Preconditions.checkNotNull(object0);
        this.w.set(option0, object0);
        return this.selfOrThrowIfLocked();
    }

    @CheckResult
    @NonNull
    public BaseRequestOptions signature(@NonNull Key key0) {
        if(this.B) {
            return this.clone().signature(key0);
        }
        this.r = (Key)Preconditions.checkNotNull(key0);
        this.g |= 0x400;
        return this.selfOrThrowIfLocked();
    }

    @CheckResult
    @NonNull
    public BaseRequestOptions sizeMultiplier(@FloatRange(from = 0.0, to = 1.0) float f) {
        if(this.B) {
            return this.clone().sizeMultiplier(f);
        }
        if(f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.h = f;
        this.g |= 2;
        return this.selfOrThrowIfLocked();
    }

    @CheckResult
    @NonNull
    public BaseRequestOptions skipMemoryCache(boolean z) {
        if(this.B) {
            return this.clone().skipMemoryCache(true);
        }
        this.o = !z;
        this.g |= 0x100;
        return this.selfOrThrowIfLocked();
    }

    @CheckResult
    @NonNull
    public BaseRequestOptions theme(@Nullable Resources.Theme resources$Theme0) {
        if(this.B) {
            return this.clone().theme(resources$Theme0);
        }
        this.A = resources$Theme0;
        if(resources$Theme0 != null) {
            this.g |= 0x8000;
            return this.set(ResourceDrawableDecoder.THEME, resources$Theme0);
        }
        this.g &= 0xFFFF7FFF;
        return this.c(ResourceDrawableDecoder.THEME);
    }

    @CheckResult
    @NonNull
    public BaseRequestOptions timeout(@IntRange(from = 0L) int v) {
        return this.set(HttpGlideUrlLoader.TIMEOUT, v);
    }

    @CheckResult
    @NonNull
    public BaseRequestOptions transform(@NonNull Transformation transformation0) {
        return this.e(transformation0, true);
    }

    @CheckResult
    @NonNull
    public BaseRequestOptions transform(@NonNull Class class0, @NonNull Transformation transformation0) {
        return this.g(class0, transformation0, true);
    }

    @CheckResult
    @NonNull
    public BaseRequestOptions transform(@NonNull Transformation[] arr_transformation) {
        if(arr_transformation.length > 1) {
            return this.e(new MultiTransformation(arr_transformation), true);
        }
        return arr_transformation.length == 1 ? this.transform(arr_transformation[0]) : this.selfOrThrowIfLocked();
    }

    @CheckResult
    @NonNull
    @Deprecated
    public BaseRequestOptions transforms(@NonNull Transformation[] arr_transformation) {
        return this.e(new MultiTransformation(arr_transformation), true);
    }

    @CheckResult
    @NonNull
    public BaseRequestOptions useAnimationPool(boolean z) {
        if(this.B) {
            return this.clone().useAnimationPool(z);
        }
        this.F = z;
        this.g |= 0x100000;
        return this.selfOrThrowIfLocked();
    }

    @CheckResult
    @NonNull
    public BaseRequestOptions useUnlimitedSourceGeneratorsPool(boolean z) {
        if(this.B) {
            return this.clone().useUnlimitedSourceGeneratorsPool(z);
        }
        this.C = z;
        this.g |= 0x40000;
        return this.selfOrThrowIfLocked();
    }
}

