package com.kakao.keditor.delegate;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0000\bf\u0018\u00002\u00020\u0001J.\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00072\u0014\u0010\b\u001A\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00030\tH\u0016Jx\u0010\u000B\u001A\u00020\u00032\u0006\u0010\f\u001A\u00020\r2\u0006\u0010\u000E\u001A\u00020\u00052\u0006\u0010\u000F\u001A\u00020\u00052\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\u0013\u001A\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00142\u0010\b\u0002\u0010\u0015\u001A\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00142\u0010\b\u0002\u0010\u0016\u001A\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00142\b\b\u0002\u0010\u0017\u001A\u00020\u0018H&¨\u0006\u0019"}, d2 = {"Lcom/kakao/keditor/delegate/ImageLoader;", "", "downloadImage", "", "src", "", "context", "Landroid/content/Context;", "callback", "Lkotlin/Function1;", "Ljava/io/File;", "loadImage", "imageView", "Landroid/widget/ImageView;", "uri", "itemType", "placeHolder", "Landroid/graphics/drawable/Drawable;", "onError", "onSucceed", "Lkotlin/Function0;", "onFailed", "onCompleted", "clearBeforeLoad", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface ImageLoader {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class DefaultImpls {
        public static void downloadImage(@NotNull ImageLoader imageLoader0, @NotNull String s, @NotNull Context context0, @NotNull Function1 function10) {
            Intrinsics.checkNotNullParameter(s, "src");
            Intrinsics.checkNotNullParameter(context0, "context");
            Intrinsics.checkNotNullParameter(function10, "callback");
        }

        public static void loadImage$default(ImageLoader imageLoader0, ImageView imageView0, String s, String s1, Drawable drawable0, Drawable drawable1, Function0 function00, Function0 function01, Function0 function02, boolean z, int v, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadImage");
            }
            imageLoader0.loadImage(imageView0, s, s1, ((v & 8) == 0 ? drawable0 : null), ((v & 16) == 0 ? drawable1 : null), ((v & 0x20) == 0 ? function00 : null), ((v & 0x40) == 0 ? function01 : null), ((v & 0x80) == 0 ? function02 : null), ((v & 0x100) == 0 ? z : false));
        }
    }

    void downloadImage(@NotNull String arg1, @NotNull Context arg2, @NotNull Function1 arg3);

    void loadImage(@NotNull ImageView arg1, @NotNull String arg2, @NotNull String arg3, @Nullable Drawable arg4, @Nullable Drawable arg5, @Nullable Function0 arg6, @Nullable Function0 arg7, @Nullable Function0 arg8, boolean arg9);
}

