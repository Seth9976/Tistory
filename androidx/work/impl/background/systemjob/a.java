package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo.Builder;
import android.content.pm.PackageInfo;
import android.content.pm.ShortcutInfo;
import android.content.pm.SigningInfo;
import android.graphics.ImageDecoder.Source;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.material.bottomappbar.BottomAppBar;

public abstract class a {
    public static void A(ImageDecoder imageDecoder0) {
        imageDecoder0.setAllocator(1);
    }

    public static void C(BottomAppBar bottomAppBar0) {
        bottomAppBar0.setOutlineSpotShadowColor(0);
    }

    public static void D(ImageDecoder imageDecoder0) {
        imageDecoder0.setMemorySizePolicy(0);
    }

    public static int a(ShortcutInfo shortcutInfo0) {
        return shortcutInfo0.getDisabledReason();
    }

    public static SigningInfo d(PackageInfo packageInfo0) {
        return packageInfo0.signingInfo;
    }

    public static ImageDecoder.Source g(Object object0) [...] // Inlined contents

    public static AnimatedImageDrawable j(Drawable drawable0) [...] // Inlined contents

    public static void q(JobInfo.Builder jobInfo$Builder0) {
        jobInfo$Builder0.setImportantWhileForeground(true);
    }

    public static void s(ImageDecoder imageDecoder0) {
        imageDecoder0.setAllocator(3);
    }

    public static void x(BottomAppBar bottomAppBar0) {
        bottomAppBar0.setOutlineAmbientShadowColor(0);
    }

    public static boolean y(Drawable drawable0) {
        return drawable0 instanceof AnimatedImageDrawable;
    }
}

