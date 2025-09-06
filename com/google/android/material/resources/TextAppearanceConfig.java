package com.google.android.material.resources;

@Deprecated
public class TextAppearanceConfig {
    public static boolean a;

    public static void setShouldLoadFontSynchronously(boolean z) {
        TextAppearanceConfig.a = z;
    }

    public static boolean shouldLoadFontSynchronously() [...] // 潜在的解密器
}

