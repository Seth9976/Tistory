package com.google.android.gms.common.util;

import android.database.CharArrayBuffer;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.io.ByteArrayOutputStream;

@KeepForSdk
public final class DataUtils {
    @KeepForSdk
    public static void copyStringToBuffer(@Nullable String s, @NonNull CharArrayBuffer charArrayBuffer0) {
        if(TextUtils.isEmpty(s)) {
            charArrayBuffer0.sizeCopied = 0;
            return;
        }
        if(charArrayBuffer0.data == null || charArrayBuffer0.data.length < s.length()) {
            charArrayBuffer0.data = s.toCharArray();
        }
        charArrayBuffer0.sizeCopied = s.length();
    }

    @NonNull
    @KeepForSdk
    public static byte[] loadImageBytes(@NonNull Bitmap bitmap0) {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        bitmap0.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream0);
        return byteArrayOutputStream0.toByteArray();
    }
}

