package com.kakao.tistory.presentation.design.ui.thumbnail;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sd.a;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000E\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000B"}, d2 = {"Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailSize;", "", "", "a", "Ljava/lang/String;", "getThumbnailString", "()Ljava/lang/String;", "thumbnailString", "SMALL", "MEDIUM", "LARGE", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public enum ThumbnailSize {
    SMALL("R100x0"),
    MEDIUM("R300x0"),
    LARGE("R700x0");

    public final String a;
    public static final ThumbnailSize[] b;
    public static final EnumEntries c;

    static {
        ThumbnailSize.b = arr_thumbnailSize;
        Intrinsics.checkNotNullParameter(arr_thumbnailSize, "entries");
        ThumbnailSize.c = new a(arr_thumbnailSize);
    }

    public ThumbnailSize(String s1) {
        this.a = s1;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return ThumbnailSize.c;
    }

    @NotNull
    public final String getThumbnailString() {
        return this.a;
    }
}

