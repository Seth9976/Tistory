package com.kakao.tistory.presentation.common.glide;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.CheckResult;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.manager.Lifecycle;
import com.bumptech.glide.manager.RequestManagerTreeNode;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import java.io.File;
import java.net.URL;

public class GlideRequests extends RequestManager {
    public GlideRequests(@NonNull Glide glide0, @NonNull Lifecycle lifecycle0, @NonNull RequestManagerTreeNode requestManagerTreeNode0, @NonNull Context context0) {
        super(glide0, lifecycle0, requestManagerTreeNode0, context0);
    }

    @Override  // com.bumptech.glide.RequestManager
    @NonNull
    public RequestManager addDefaultRequestListener(RequestListener requestListener0) {
        return this.addDefaultRequestListener(requestListener0);
    }

    @NonNull
    public GlideRequests addDefaultRequestListener(RequestListener requestListener0) {
        return (GlideRequests)super.addDefaultRequestListener(requestListener0);
    }

    @Override  // com.bumptech.glide.RequestManager
    @NonNull
    public RequestManager applyDefaultRequestOptions(@NonNull RequestOptions requestOptions0) {
        return this.applyDefaultRequestOptions(requestOptions0);
    }

    @NonNull
    public GlideRequests applyDefaultRequestOptions(@NonNull RequestOptions requestOptions0) {
        synchronized(this) {
            return (GlideRequests)super.applyDefaultRequestOptions(requestOptions0);
        }
    }

    @Override  // com.bumptech.glide.RequestManager
    @CheckResult
    @NonNull
    public RequestBuilder as(@NonNull Class class0) {
        return this.as(class0);
    }

    @CheckResult
    @NonNull
    public GlideRequest as(@NonNull Class class0) {
        return new GlideRequest(this.glide, this, class0, this.context);
    }

    @Override  // com.bumptech.glide.RequestManager
    @CheckResult
    @NonNull
    public RequestBuilder asBitmap() {
        return this.asBitmap();
    }

    @CheckResult
    @NonNull
    public GlideRequest asBitmap() {
        return (GlideRequest)super.asBitmap();
    }

    @Override  // com.bumptech.glide.RequestManager
    @CheckResult
    @NonNull
    public RequestBuilder asDrawable() {
        return this.asDrawable();
    }

    @CheckResult
    @NonNull
    public GlideRequest asDrawable() {
        return (GlideRequest)super.asDrawable();
    }

    @Override  // com.bumptech.glide.RequestManager
    @CheckResult
    @NonNull
    public RequestBuilder asFile() {
        return this.asFile();
    }

    @CheckResult
    @NonNull
    public GlideRequest asFile() {
        return (GlideRequest)super.asFile();
    }

    @Override  // com.bumptech.glide.RequestManager
    @CheckResult
    @NonNull
    public RequestBuilder asGif() {
        return this.asGif();
    }

    @CheckResult
    @NonNull
    public GlideRequest asGif() {
        return (GlideRequest)super.asGif();
    }

    @Override  // com.bumptech.glide.RequestManager
    @CheckResult
    @NonNull
    public RequestBuilder download(@Nullable Object object0) {
        return this.download(object0);
    }

    @CheckResult
    @NonNull
    public GlideRequest download(@Nullable Object object0) {
        return (GlideRequest)super.download(object0);
    }

    @Override  // com.bumptech.glide.RequestManager
    @CheckResult
    @NonNull
    public RequestBuilder downloadOnly() {
        return this.downloadOnly();
    }

    @CheckResult
    @NonNull
    public GlideRequest downloadOnly() {
        return (GlideRequest)super.downloadOnly();
    }

    @Override  // com.bumptech.glide.RequestManager
    @CheckResult
    @NonNull
    public RequestBuilder load(@Nullable Bitmap bitmap0) {
        return this.load(bitmap0);
    }

    @Override  // com.bumptech.glide.RequestManager
    @CheckResult
    @NonNull
    public RequestBuilder load(@Nullable Drawable drawable0) {
        return this.load(drawable0);
    }

    @Override  // com.bumptech.glide.RequestManager
    @CheckResult
    @NonNull
    public RequestBuilder load(@Nullable Uri uri0) {
        return this.load(uri0);
    }

    @Override  // com.bumptech.glide.RequestManager
    @CheckResult
    @NonNull
    public RequestBuilder load(@Nullable File file0) {
        return this.load(file0);
    }

    @Override  // com.bumptech.glide.RequestManager
    @CheckResult
    @NonNull
    public RequestBuilder load(@DrawableRes @Nullable @RawRes Integer integer0) {
        return this.load(integer0);
    }

    @Override  // com.bumptech.glide.RequestManager
    @CheckResult
    @NonNull
    public RequestBuilder load(@Nullable Object object0) {
        return this.load(object0);
    }

    @Override  // com.bumptech.glide.RequestManager
    @CheckResult
    @NonNull
    public RequestBuilder load(@Nullable String s) {
        return this.load(s);
    }

    @Override  // com.bumptech.glide.RequestManager
    @CheckResult
    @Deprecated
    public RequestBuilder load(@Nullable URL uRL0) {
        return this.load(uRL0);
    }

    @Override  // com.bumptech.glide.RequestManager
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

    @Override  // com.bumptech.glide.RequestManager
    @CheckResult
    @NonNull
    public Object load(@Nullable Bitmap bitmap0) {
        return this.load(bitmap0);
    }

    @Override  // com.bumptech.glide.RequestManager
    @CheckResult
    @NonNull
    public Object load(@Nullable Drawable drawable0) {
        return this.load(drawable0);
    }

    @Override  // com.bumptech.glide.RequestManager
    @CheckResult
    @NonNull
    public Object load(@Nullable Uri uri0) {
        return this.load(uri0);
    }

    @Override  // com.bumptech.glide.RequestManager
    @CheckResult
    @NonNull
    public Object load(@Nullable File file0) {
        return this.load(file0);
    }

    @Override  // com.bumptech.glide.RequestManager
    @CheckResult
    @NonNull
    public Object load(@DrawableRes @Nullable @RawRes Integer integer0) {
        return this.load(integer0);
    }

    @Override  // com.bumptech.glide.RequestManager
    @CheckResult
    @NonNull
    public Object load(@Nullable Object object0) {
        return this.load(object0);
    }

    @Override  // com.bumptech.glide.RequestManager
    @CheckResult
    @NonNull
    public Object load(@Nullable String s) {
        return this.load(s);
    }

    @Override  // com.bumptech.glide.RequestManager
    @CheckResult
    @Deprecated
    public Object load(@Nullable URL uRL0) {
        return this.load(uRL0);
    }

    @Override  // com.bumptech.glide.RequestManager
    @CheckResult
    @NonNull
    public Object load(@Nullable byte[] arr_b) {
        return this.load(arr_b);
    }

    @Override  // com.bumptech.glide.RequestManager
    @NonNull
    public RequestManager setDefaultRequestOptions(@NonNull RequestOptions requestOptions0) {
        return this.setDefaultRequestOptions(requestOptions0);
    }

    @NonNull
    public GlideRequests setDefaultRequestOptions(@NonNull RequestOptions requestOptions0) {
        synchronized(this) {
            return (GlideRequests)super.setDefaultRequestOptions(requestOptions0);
        }
    }

    @Override  // com.bumptech.glide.RequestManager
    public void setRequestOptions(@NonNull RequestOptions requestOptions0) {
        if(requestOptions0 instanceof GlideOptions) {
            super.setRequestOptions(requestOptions0);
            return;
        }
        super.setRequestOptions(new GlideOptions().apply(requestOptions0));
    }
}

