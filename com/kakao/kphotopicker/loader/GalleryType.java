package com.kakao.kphotopicker.loader;

import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sd.a;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0011\n\u0002\u0010\u000E\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001J\u0015\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/kakao/kphotopicker/loader/GalleryType;", "", "", "", "getMediaPermissions$kphotopicker_release", "()[Ljava/lang/String;", "getMediaPermissions", "VideoOnly", "ImageOnly", "AllMedia", "kphotopicker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public enum GalleryType {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[GalleryType.values().length];
            try {
                arr_v[GalleryType.AllMedia.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[GalleryType.ImageOnly.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[GalleryType.VideoOnly.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    VideoOnly,
    ImageOnly,
    AllMedia;

    public static final GalleryType[] a;
    public static final EnumEntries b;

    static {
        GalleryType.a = arr_galleryType;
        Intrinsics.checkNotNullParameter(arr_galleryType, "entries");
        GalleryType.b = new a(arr_galleryType);
    }

    @NotNull
    public static EnumEntries getEntries() {
        return GalleryType.b;
    }

    @RequiresApi(33)
    @NotNull
    public final String[] getMediaPermissions$kphotopicker_release() {
        int v = WhenMappings.$EnumSwitchMapping$0[this.ordinal()];
        switch(v) {
            case 1: {
                return new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"};
            }
            case 2: {
                return new String[]{"android.permission.READ_MEDIA_IMAGES"};
            }
            default: {
                if(v != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return new String[]{"android.permission.READ_MEDIA_VIDEO"};
            }
        }
    }
}

