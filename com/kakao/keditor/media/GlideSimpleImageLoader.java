package com.kakao.keditor.media;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.kakao.keditor.delegate.ImageLoader;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\b2\u0014\u0010\t\u001A\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000B\u0012\u0004\u0012\u00020\u00040\nH\u0016Jl\u0010\f\u001A\u00020\u00042\u0006\u0010\r\u001A\u00020\u000E2\u0006\u0010\u000F\u001A\u00020\u00062\u0006\u0010\u0010\u001A\u00020\u00062\b\u0010\u0011\u001A\u0004\u0018\u00010\u00122\b\u0010\u0013\u001A\u0004\u0018\u00010\u00122\u000E\u0010\u0014\u001A\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00152\u000E\u0010\u0016\u001A\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00152\u000E\u0010\u0017\u001A\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001A\u00020\u0019H\u0016¨\u0006\u001A"}, d2 = {"Lcom/kakao/keditor/media/GlideSimpleImageLoader;", "Lcom/kakao/keditor/delegate/ImageLoader;", "()V", "downloadImage", "", "src", "", "context", "Landroid/content/Context;", "callback", "Lkotlin/Function1;", "Ljava/io/File;", "loadImage", "imageView", "Landroid/widget/ImageView;", "uri", "itemType", "placeHolder", "Landroid/graphics/drawable/Drawable;", "onError", "onSucceed", "Lkotlin/Function0;", "onFailed", "onCompleted", "clearBeforeLoad", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class GlideSimpleImageLoader implements ImageLoader {
    @NotNull
    public static final GlideSimpleImageLoader INSTANCE;

    static {
        GlideSimpleImageLoader.INSTANCE = new GlideSimpleImageLoader();
    }

    @Override  // com.kakao.keditor.delegate.ImageLoader
    public void downloadImage(@NotNull String s, @NotNull Context context0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(s, "src");
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(function10, "callback");
        Glide.with(context0).downloadOnly().load(s).listener(new RequestListener() {
            @Override  // com.bumptech.glide.request.RequestListener
            public boolean onLoadFailed(@Nullable GlideException glideException0, @Nullable Object object0, @Nullable Target target0, boolean z) {
                this.$callback.invoke(null);
                return false;
            }

            public boolean onResourceReady(@Nullable File file0, @Nullable Object object0, @Nullable Target target0, @Nullable DataSource dataSource0, boolean z) {
                this.$callback.invoke(file0);
                return false;
            }

            @Override  // com.bumptech.glide.request.RequestListener
            public boolean onResourceReady(Object object0, Object object1, Target target0, DataSource dataSource0, boolean z) {
                return this.onResourceReady(((File)object0), object1, target0, dataSource0, z);
            }
        }).submit();
    }

    @Override  // com.kakao.keditor.delegate.ImageLoader
    public void loadImage(@NotNull ImageView imageView0, @NotNull String s, @NotNull String s1, @Nullable Drawable drawable0, @Nullable Drawable drawable1, @Nullable Function0 function00, @Nullable Function0 function01, @Nullable Function0 function02, boolean z) {
        Intrinsics.checkNotNullParameter(imageView0, "imageView");
        Intrinsics.checkNotNullParameter(s, "uri");
        Intrinsics.checkNotNullParameter(s1, "itemType");
        if(z) {
            Glide.with(imageView0.getContext()).clear(imageView0);
        }
        ((RequestBuilder)((RequestBuilder)Glide.with(imageView0.getContext()).load(s).placeholder(drawable0)).error(drawable1)).listener(new RequestListener() {
            @Override  // com.bumptech.glide.request.RequestListener
            public boolean onLoadFailed(@Nullable GlideException glideException0, @Nullable Object object0, @Nullable Target target0, boolean z) {
                Function0 function00 = function02;
                if(function00 != null) {
                    function00.invoke();
                }
                Function0 function01 = function00;
                if(function01 != null) {
                    function01.invoke();
                }
                return false;
            }

            public boolean onResourceReady(@Nullable Drawable drawable0, @Nullable Object object0, @Nullable Target target0, @Nullable DataSource dataSource0, boolean z) {
                Function0 function00 = this.$onSucceed;
                if(function00 != null) {
                    function00.invoke();
                }
                Function0 function01 = function00;
                if(function01 != null) {
                    function01.invoke();
                }
                return false;
            }

            @Override  // com.bumptech.glide.request.RequestListener
            public boolean onResourceReady(Object object0, Object object1, Target target0, DataSource dataSource0, boolean z) {
                return this.onResourceReady(((Drawable)object0), object1, target0, dataSource0, z);
            }
        }).into(imageView0);
    }
}

