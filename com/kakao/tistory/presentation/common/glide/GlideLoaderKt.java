package com.kakao.tistory.presentation.common.glide;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.Target;
import com.kakao.tistory.presentation.common.utils.UrlUtils;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A%\u0010\u0006\u001A\u00020\u0005*\u00020\u00002\b\u0010\u0002\u001A\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001A\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001A#\u0010\u0006\u001A\u00020\u0005*\u00020\u00002\u0006\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\u0004\u001A\u00020\u0003¢\u0006\u0004\b\u0006\u0010\n\u001A%\u0010\u0006\u001A\u00020\u0005*\u00020\u00002\b\b\u0001\u0010\f\u001A\u00020\u000B2\b\b\u0002\u0010\u0004\u001A\u00020\u0003¢\u0006\u0004\b\u0006\u0010\r\u001AX\u0010\u0016\u001A\u00020\u00052\u0006\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0002\u001A\u00020\u00012\b\b\u0002\u0010\u0004\u001A\u00020\u00032!\u0010\u0013\u001A\u001D\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00050\u00102\f\u0010\u0015\u001A\b\u0012\u0004\u0012\u00020\u00050\u0014¢\u0006\u0004\b\u0016\u0010\u0017\u001A\u0019\u0010\u0018\u001A\u00020\u0005*\u00020\u00002\u0006\u0010\u000F\u001A\u00020\u000E¢\u0006\u0004\b\u0018\u0010\u0019\u001A9\u0010\u0006\u001A\u00020\u0005*\u00020\u00002\b\u0010\u0002\u001A\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001A\u00020\u00032\u0012\u0010\u001B\u001A\u000E\u0012\u0004\u0012\u00020\u001A\u0012\u0004\u0012\u00020\u00050\u0010¢\u0006\u0004\b\u0006\u0010\u001C\u001A;\u0010!\u001A\u00020\u00052\u0006\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u001D\u001A\u00020\u00012\u001C\u0010\u001B\u001A\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u001F\u0012\u0006\u0012\u0004\u0018\u00010 \u0012\u0004\u0012\u00020\u00050\u001E¢\u0006\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Landroid/widget/ImageView;", "", "url", "Lcom/bumptech/glide/request/RequestOptions;", "requestOptions", "", "load", "(Landroid/widget/ImageView;Ljava/lang/String;Lcom/bumptech/glide/request/RequestOptions;)V", "Landroid/graphics/Bitmap;", "bitmap", "(Landroid/widget/ImageView;Landroid/graphics/Bitmap;Lcom/bumptech/glide/request/RequestOptions;)V", "", "drawableResourceId", "(Landroid/widget/ImageView;ILcom/bumptech/glide/request/RequestOptions;)V", "Landroid/content/Context;", "context", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "onSuccess", "Lkotlin/Function0;", "onFail", "loadBitmap", "(Landroid/content/Context;Ljava/lang/String;Lcom/bumptech/glide/request/RequestOptions;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "cancel", "(Landroid/widget/ImageView;Landroid/content/Context;)V", "", "callback", "(Landroid/widget/ImageView;Ljava/lang/String;Lcom/bumptech/glide/request/RequestOptions;Lkotlin/jvm/functions/Function1;)V", "uri", "Lkotlin/Function2;", "", "Ljava/io/File;", "loadFile", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class GlideLoaderKt {
    public static final void cancel(@NotNull ImageView imageView0, @NotNull Context context0) {
        Intrinsics.checkNotNullParameter(imageView0, "<this>");
        Intrinsics.checkNotNullParameter(context0, "context");
        GlideApp.with(context0).clear(imageView0);
    }

    public static final void load(@NotNull ImageView imageView0, @DrawableRes int v, @NotNull RequestOptions requestOptions0) {
        Intrinsics.checkNotNullParameter(imageView0, "<this>");
        Intrinsics.checkNotNullParameter(requestOptions0, "requestOptions");
        GlideApp.with(imageView0.getContext()).load(v).apply(requestOptions0).into(imageView0);
    }

    public static final void load(@NotNull ImageView imageView0, @NotNull Bitmap bitmap0, @NotNull RequestOptions requestOptions0) {
        Intrinsics.checkNotNullParameter(imageView0, "<this>");
        Intrinsics.checkNotNullParameter(bitmap0, "bitmap");
        Intrinsics.checkNotNullParameter(requestOptions0, "requestOptions");
        GlideApp.with(imageView0.getContext()).load(bitmap0).apply(requestOptions0).into(imageView0);
    }

    public static final void load(@NotNull ImageView imageView0, @Nullable String s, @NotNull RequestOptions requestOptions0) {
        Intrinsics.checkNotNullParameter(imageView0, "<this>");
        Intrinsics.checkNotNullParameter(requestOptions0, "requestOptions");
        if(s != null && UrlUtils.INSTANCE.isGif(s)) {
            GlideApp.with(imageView0.getContext()).asGif().load(s).apply(requestOptions0).into(imageView0);
            return;
        }
        GlideApp.with(imageView0.getContext()).load(s).apply(requestOptions0).into(imageView0);
    }

    public static final void load(@NotNull ImageView imageView0, @Nullable String s, @NotNull RequestOptions requestOptions0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(imageView0, "<this>");
        Intrinsics.checkNotNullParameter(requestOptions0, "requestOptions");
        Intrinsics.checkNotNullParameter(function10, "callback");
        if(s != null && UrlUtils.INSTANCE.isGif(s)) {
            GlideApp.with(imageView0.getContext()).asGif().load(s).apply(requestOptions0).into(imageView0);
            return;
        }
        GlideApp.with(imageView0.getContext()).load(s).apply(requestOptions0).listener(new RequestListener() {
            @Override  // com.bumptech.glide.request.RequestListener
            public boolean onLoadFailed(@Nullable GlideException glideException0, @Nullable Object object0, @Nullable Target target0, boolean z) {
                function10.invoke(Boolean.FALSE);
                return false;
            }

            public boolean onResourceReady(@Nullable Drawable drawable0, @Nullable Object object0, @Nullable Target target0, @Nullable DataSource dataSource0, boolean z) {
                function10.invoke(Boolean.TRUE);
                return false;
            }

            @Override  // com.bumptech.glide.request.RequestListener
            public boolean onResourceReady(Object object0, Object object1, Target target0, DataSource dataSource0, boolean z) {
                return this.onResourceReady(((Drawable)object0), object1, target0, dataSource0, z);
            }
        }).into(imageView0);
    }

    public static void load$default(ImageView imageView0, int v, RequestOptions requestOptions0, int v1, Object object0) {
        if((v1 & 2) != 0) {
            requestOptions0 = GlideRequestOptions.INSTANCE.getDEFAULT();
        }
        GlideLoaderKt.load(imageView0, v, requestOptions0);
    }

    public static void load$default(ImageView imageView0, Bitmap bitmap0, RequestOptions requestOptions0, int v, Object object0) {
        if((v & 2) != 0) {
            requestOptions0 = GlideRequestOptions.INSTANCE.getDEFAULT();
        }
        GlideLoaderKt.load(imageView0, bitmap0, requestOptions0);
    }

    public static void load$default(ImageView imageView0, String s, RequestOptions requestOptions0, int v, Object object0) {
        if((v & 2) != 0) {
            requestOptions0 = GlideRequestOptions.INSTANCE.getDEFAULT();
        }
        GlideLoaderKt.load(imageView0, s, requestOptions0);
    }

    public static void load$default(ImageView imageView0, String s, RequestOptions requestOptions0, Function1 function10, int v, Object object0) {
        if((v & 2) != 0) {
            requestOptions0 = GlideRequestOptions.INSTANCE.getNONE();
        }
        GlideLoaderKt.load(imageView0, s, requestOptions0, function10);
    }

    public static final void loadBitmap(@NotNull Context context0, @NotNull String s, @NotNull RequestOptions requestOptions0, @NotNull Function1 function10, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(s, "url");
        Intrinsics.checkNotNullParameter(requestOptions0, "requestOptions");
        Intrinsics.checkNotNullParameter(function10, "onSuccess");
        Intrinsics.checkNotNullParameter(function00, "onFail");
        GlideApp.with(context0).asBitmap().load(s).apply(requestOptions0).listener(new RequestListener() {
            @Override  // com.bumptech.glide.request.RequestListener
            public boolean onLoadFailed(@Nullable GlideException glideException0, @Nullable Object object0, @Nullable Target target0, boolean z) {
                function00.invoke();
                return false;
            }

            public boolean onResourceReady(@Nullable Bitmap bitmap0, @Nullable Object object0, @Nullable Target target0, @Nullable DataSource dataSource0, boolean z) {
                Unit unit0;
                if(bitmap0 == null) {
                    unit0 = null;
                }
                else {
                    function10.invoke(bitmap0);
                    unit0 = Unit.INSTANCE;
                }
                if(unit0 == null) {
                    function00.invoke();
                }
                return false;
            }

            @Override  // com.bumptech.glide.request.RequestListener
            public boolean onResourceReady(Object object0, Object object1, Target target0, DataSource dataSource0, boolean z) {
                return this.onResourceReady(((Bitmap)object0), object1, target0, dataSource0, z);
            }
        }).submit();
    }

    public static void loadBitmap$default(Context context0, String s, RequestOptions requestOptions0, Function1 function10, Function0 function00, int v, Object object0) {
        if((v & 4) != 0) {
            requestOptions0 = GlideRequestOptions.INSTANCE.getNONE();
        }
        GlideLoaderKt.loadBitmap(context0, s, requestOptions0, function10, function00);
    }

    public static final void loadFile(@NotNull Context context0, @NotNull String s, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(s, "uri");
        Intrinsics.checkNotNullParameter(function20, "callback");
        GlideApp.with(context0).downloadOnly().load(s).listener(new RequestListener() {
            @Override  // com.bumptech.glide.request.RequestListener
            public boolean onLoadFailed(@Nullable GlideException glideException0, @Nullable Object object0, @Nullable Target target0, boolean z) {
                function20.invoke(glideException0, null);
                return false;
            }

            public boolean onResourceReady(@Nullable File file0, @Nullable Object object0, @Nullable Target target0, @Nullable DataSource dataSource0, boolean z) {
                function20.invoke((file0 == null ? new Exception() : null), file0);
                return false;
            }

            @Override  // com.bumptech.glide.request.RequestListener
            public boolean onResourceReady(Object object0, Object object1, Target target0, DataSource dataSource0, boolean z) {
                return this.onResourceReady(((File)object0), object1, target0, dataSource0, z);
            }
        }).submit();
    }
}

