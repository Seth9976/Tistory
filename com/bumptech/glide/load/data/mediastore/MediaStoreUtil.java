package com.bumptech.glide.load.data.mediastore;

import android.net.Uri;

public final class MediaStoreUtil {
    // 去混淆评级： 低(20)
    public static boolean isMediaStoreImageUri(Uri uri0) {
        return MediaStoreUtil.isMediaStoreUri(uri0) && !uri0.getPathSegments().contains("video");
    }

    // 去混淆评级： 低(20)
    public static boolean isMediaStoreUri(Uri uri0) {
        return uri0 != null && "content".equals(uri0.getScheme()) && "media".equals(uri0.getAuthority());
    }

    // 去混淆评级： 低(20)
    public static boolean isMediaStoreVideoUri(Uri uri0) {
        return MediaStoreUtil.isMediaStoreUri(uri0) && uri0.getPathSegments().contains("video");
    }

    public static boolean isThumbnailSize(int v, int v1) {
        return v != 0x80000000 && v1 != 0x80000000 && v <= 0x200 && v1 <= 0x180;
    }
}

