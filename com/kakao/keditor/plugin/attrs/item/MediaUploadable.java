package com.kakao.keditor.plugin.attrs.item;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\bf\u0018\u00002\u00020\u0001R\u001A\u0010\u0002\u001A\u0004\u0018\u00010\u0003X¦\u000E¢\u0006\f\u001A\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001A\u00020\u0003X¦\u000E¢\u0006\f\u001A\u0004\b\t\u0010\n\"\u0004\b\u000B\u0010\fR\u0018\u0010\r\u001A\u00020\u0003X¦\u000E¢\u0006\f\u001A\u0004\b\u000E\u0010\n\"\u0004\b\u000F\u0010\fR\u001A\u0010\u0010\u001A\u0004\u0018\u00010\u0003X¦\u000E¢\u0006\f\u001A\u0004\b\u0011\u0010\u0005\"\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/kakao/keditor/plugin/attrs/item/MediaUploadable;", "Lcom/kakao/keditor/plugin/attrs/item/Uploadable;", "height", "", "getHeight", "()Ljava/lang/Integer;", "setHeight", "(Ljava/lang/Integer;)V", "originHeight", "getOriginHeight", "()I", "setOriginHeight", "(I)V", "originWidth", "getOriginWidth", "setOriginWidth", "width", "getWidth", "setWidth", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface MediaUploadable extends Uploadable {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class DefaultImpls {
        public static void uploadFailed(@NotNull MediaUploadable mediaUploadable0, @Nullable String s) {
            com.kakao.keditor.plugin.attrs.item.Uploadable.DefaultImpls.uploadFailed(mediaUploadable0, s);
        }

        public static void uploadSucceed(@NotNull MediaUploadable mediaUploadable0, @NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "src");
            com.kakao.keditor.plugin.attrs.item.Uploadable.DefaultImpls.uploadSucceed(mediaUploadable0, s);
        }
    }

    @Nullable
    Integer getHeight();

    int getOriginHeight();

    int getOriginWidth();

    @Nullable
    Integer getWidth();

    void setHeight(@Nullable Integer arg1);

    void setOriginHeight(int arg1);

    void setOriginWidth(int arg1);

    void setWidth(@Nullable Integer arg1);
}

