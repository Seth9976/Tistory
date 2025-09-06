package com.kakao.keditor.media;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sd.a;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000F\b\u0002\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/kakao/keditor/media/VideoHost;", "", "host", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getHost", "()Ljava/lang/String;", "YouTube", "KakaoTv", "Vimeo", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public enum VideoHost {
    YouTube("youtube"),
    KakaoTv("kakaotv"),
    Vimeo("vimeo");

    private static final EnumEntries $ENTRIES;
    private static final VideoHost[] $VALUES;
    @NotNull
    private final String host;

    private static final VideoHost[] $values() [...] // Inlined contents

    static {
        VideoHost.$VALUES = arr_videoHost;
        Intrinsics.checkNotNullParameter(arr_videoHost, "entries");
        VideoHost.$ENTRIES = new a(arr_videoHost);
    }

    private VideoHost(String s1) {
        this.host = s1;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return VideoHost.$ENTRIES;
    }

    @NotNull
    public final String getHost() {
        return this.host;
    }
}

