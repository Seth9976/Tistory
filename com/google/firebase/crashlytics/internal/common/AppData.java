package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider;

public class AppData {
    public final String buildId;
    public final DevelopmentPlatformProvider developmentPlatformProvider;
    public final String googleAppId;
    public final String installerPackageName;
    public final String packageName;
    public final String versionCode;
    public final String versionName;

    public AppData(String s, String s1, String s2, String s3, String s4, String s5, DevelopmentPlatformProvider developmentPlatformProvider0) {
        this.googleAppId = s;
        this.buildId = s1;
        this.installerPackageName = s2;
        this.packageName = s3;
        this.versionCode = s4;
        this.versionName = s5;
        this.developmentPlatformProvider = developmentPlatformProvider0;
    }

    public static AppData create(Context context0, IdManager idManager0, String s, String s1, DevelopmentPlatformProvider developmentPlatformProvider0) throws PackageManager.NameNotFoundException {
        String s2 = idManager0.getInstallerPackageName();
        PackageInfo packageInfo0 = context0.getPackageManager().getPackageInfo("net.daum.android.tistoryapp", 0);
        return new AppData(s, s1, s2, "net.daum.android.tistoryapp", Integer.toString(packageInfo0.versionCode), (packageInfo0.versionName == null ? "0.0" : packageInfo0.versionName), developmentPlatformProvider0);
    }
}

