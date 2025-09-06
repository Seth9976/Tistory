package com.bumptech.glide.load;

public enum DecodeFormat {
    PREFER_ARGB_8888,
    PREFER_RGB_565;

    public static final DecodeFormat DEFAULT;

    static {
        DecodeFormat.DEFAULT = DecodeFormat.PREFER_ARGB_8888;
    }
}

