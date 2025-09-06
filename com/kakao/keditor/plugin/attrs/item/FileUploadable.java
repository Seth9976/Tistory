package com.kakao.keditor.plugin.attrs.item;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\b\bf\u0018\u00002\u00020\u0001R\u001A\u0010\u0002\u001A\u0004\u0018\u00010\u0003X¦\u000E¢\u0006\f\u001A\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001A\u00020\u0003X¦\u000E¢\u0006\f\u001A\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007R\u0018\u0010\u000B\u001A\u00020\fX¦\u000E¢\u0006\f\u001A\u0004\b\r\u0010\u000E\"\u0004\b\u000F\u0010\u0010R\u0018\u0010\u0011\u001A\u00020\u0003X¦\u000E¢\u0006\f\u001A\u0004\b\u0012\u0010\u0005\"\u0004\b\u0013\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/kakao/keditor/plugin/attrs/item/FileUploadable;", "Lcom/kakao/keditor/plugin/attrs/item/Uploadable;", "mimeType", "", "getMimeType", "()Ljava/lang/String;", "setMimeType", "(Ljava/lang/String;)V", "name", "getName", "setName", "size", "", "getSize", "()J", "setSize", "(J)V", "src", "getSrc", "setSrc", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface FileUploadable extends Uploadable {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class DefaultImpls {
        public static void uploadFailed(@NotNull FileUploadable fileUploadable0, @Nullable String s) {
            com.kakao.keditor.plugin.attrs.item.Uploadable.DefaultImpls.uploadFailed(fileUploadable0, s);
        }

        public static void uploadSucceed(@NotNull FileUploadable fileUploadable0, @NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "src");
            com.kakao.keditor.plugin.attrs.item.Uploadable.DefaultImpls.uploadSucceed(fileUploadable0, s);
        }
    }

    @Nullable
    String getMimeType();

    @NotNull
    String getName();

    long getSize();

    @NotNull
    String getSrc();

    void setMimeType(@Nullable String arg1);

    void setName(@NotNull String arg1);

    void setSize(long arg1);

    void setSrc(@NotNull String arg1);
}

