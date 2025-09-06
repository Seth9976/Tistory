package com.kakao.kphotopicker.util;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sd.a;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000B\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001J\r\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0005\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\r\u0010\u0006\u001A\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/kakao/kphotopicker/util/MediaPermissionState;", "", "", "isGranted", "()Z", "isPartiallyGranted", "isDenied", "GRANTED", "PARTIALLY_GRANTED", "DENIED", "kphotopicker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public enum MediaPermissionState {
    GRANTED,
    PARTIALLY_GRANTED,
    DENIED;

    public static final MediaPermissionState[] a;
    public static final EnumEntries b;

    static {
        MediaPermissionState.a = arr_mediaPermissionState;
        Intrinsics.checkNotNullParameter(arr_mediaPermissionState, "entries");
        MediaPermissionState.b = new a(arr_mediaPermissionState);
    }

    @NotNull
    public static EnumEntries getEntries() {
        return MediaPermissionState.b;
    }

    public final boolean isDenied() {
        return this == MediaPermissionState.DENIED;
    }

    public final boolean isGranted() {
        return this == MediaPermissionState.GRANTED || this == MediaPermissionState.PARTIALLY_GRANTED;
    }

    public final boolean isPartiallyGranted() {
        return this == MediaPermissionState.PARTIALLY_GRANTED;
    }
}

