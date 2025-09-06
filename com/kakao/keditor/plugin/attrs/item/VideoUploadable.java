package com.kakao.keditor.plugin.attrs.item;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\b\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001A\u00020\u0003X¦\u000E¢\u0006\f\u001A\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001A\u00020\u0003X¦\u000E¢\u0006\f\u001A\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007¨\u0006\u000B"}, d2 = {"Lcom/kakao/keditor/plugin/attrs/item/VideoUploadable;", "Lcom/kakao/keditor/plugin/attrs/item/MediaUploadable;", "thumbnail", "", "getThumbnail", "()Ljava/lang/String;", "setThumbnail", "(Ljava/lang/String;)V", "url", "getUrl", "setUrl", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface VideoUploadable extends MediaUploadable {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class DefaultImpls {
        public static void uploadFailed(@NotNull VideoUploadable videoUploadable0, @Nullable String s) {
            com.kakao.keditor.plugin.attrs.item.MediaUploadable.DefaultImpls.uploadFailed(videoUploadable0, s);
        }

        public static void uploadSucceed(@NotNull VideoUploadable videoUploadable0, @NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "src");
            com.kakao.keditor.plugin.attrs.item.MediaUploadable.DefaultImpls.uploadSucceed(videoUploadable0, s);
        }
    }

    @NotNull
    String getThumbnail();

    @NotNull
    String getUrl();

    void setThumbnail(@NotNull String arg1);

    void setUrl(@NotNull String arg1);
}

