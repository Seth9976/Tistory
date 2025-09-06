package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import java.nio.charset.Charset;
import java.security.MessageDigest;

public interface Key {
    public static final Charset CHARSET = null;
    public static final String STRING_CHARSET_NAME = "UTF-8";

    static {
        Key.CHARSET = Charset.forName("UTF-8");
    }

    @Override
    boolean equals(Object arg1);

    @Override
    int hashCode();

    void updateDiskCacheKey(@NonNull MessageDigest arg1);
}

