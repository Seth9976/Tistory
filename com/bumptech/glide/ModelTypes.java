package com.bumptech.glide;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.CheckResult;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import java.io.File;
import java.net.URL;

interface ModelTypes {
    @CheckResult
    @NonNull
    Object load(@Nullable Bitmap arg1);

    @CheckResult
    @NonNull
    Object load(@Nullable Drawable arg1);

    @CheckResult
    @NonNull
    Object load(@Nullable Uri arg1);

    @CheckResult
    @NonNull
    Object load(@Nullable File arg1);

    @CheckResult
    @NonNull
    Object load(@DrawableRes @Nullable @RawRes Integer arg1);

    @CheckResult
    @NonNull
    Object load(@Nullable Object arg1);

    @CheckResult
    @NonNull
    Object load(@Nullable String arg1);

    @CheckResult
    @Deprecated
    Object load(@Nullable URL arg1);

    @CheckResult
    @NonNull
    Object load(@Nullable byte[] arg1);
}

