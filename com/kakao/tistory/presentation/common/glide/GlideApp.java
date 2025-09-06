package com.kakao.tistory.presentation.common.glide;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.Glide;
import com.bumptech.glide.GlideBuilder;
import java.io.File;

public final class GlideApp {
    @SuppressLint({"VisibleForTests"})
    @VisibleForTesting
    public static void enableHardwareBitmaps() {
        Glide.enableHardwareBitmaps();
    }

    @NonNull
    public static Glide get(@NonNull Context context0) {
        return Glide.get(context0);
    }

    @Nullable
    public static File getPhotoCacheDir(@NonNull Context context0) {
        return Glide.getPhotoCacheDir(context0);
    }

    @Nullable
    public static File getPhotoCacheDir(@NonNull Context context0, @NonNull String s) {
        return Glide.getPhotoCacheDir(context0, s);
    }

    @SuppressLint({"VisibleForTests"})
    @VisibleForTesting
    public static void init(@NonNull Context context0, @NonNull GlideBuilder glideBuilder0) {
        Glide.init(context0, glideBuilder0);
    }

    @SuppressLint({"VisibleForTests"})
    @VisibleForTesting
    @Deprecated
    public static void init(Glide glide0) {
        Glide.init(glide0);
    }

    @SuppressLint({"VisibleForTests"})
    @VisibleForTesting
    public static void tearDown() {
        Glide.tearDown();
    }

    @NonNull
    @Deprecated
    public static GlideRequests with(@NonNull Activity activity0) {
        return (GlideRequests)Glide.with(activity0);
    }

    @NonNull
    @Deprecated
    public static GlideRequests with(@NonNull Fragment fragment0) {
        return (GlideRequests)Glide.with(fragment0);
    }

    @NonNull
    public static GlideRequests with(@NonNull Context context0) {
        return (GlideRequests)Glide.with(context0);
    }

    @NonNull
    public static GlideRequests with(@NonNull View view0) {
        return (GlideRequests)Glide.with(view0);
    }

    @NonNull
    public static GlideRequests with(@NonNull androidx.fragment.app.Fragment fragment0) {
        return (GlideRequests)Glide.with(fragment0);
    }

    @NonNull
    public static GlideRequests with(@NonNull FragmentActivity fragmentActivity0) {
        return (GlideRequests)Glide.with(fragmentActivity0);
    }
}

