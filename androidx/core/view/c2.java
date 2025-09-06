package androidx.core.view;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.content.res.loader.ResourcesLoader;
import android.content.res.loader.ResourcesProvider;
import android.os.ParcelFileDescriptor;
import android.system.Os;
import android.view.WindowInsetsController;
import java.io.FileDescriptor;
import java.util.List;

public abstract class c2 {
    public static ApplicationExitInfo d(Object object0) [...] // Inlined contents

    public static ResourcesLoader e() {
        return new ResourcesLoader();
    }

    public static ResourcesProvider f(ParcelFileDescriptor parcelFileDescriptor0) {
        return ResourcesProvider.loadFromTable(parcelFileDescriptor0, null);
    }

    public static FileDescriptor j() {
        return Os.memfd_create("temp.arsc", 0);
    }

    public static List m(ActivityManager activityManager0) {
        return activityManager0.getHistoricalProcessExitReasons(null, 0, 0);
    }

    public static List n(ShortcutManager shortcutManager0, int v) {
        return shortcutManager0.getShortcuts(v);
    }

    public static void o() {
    }

    public static void p(ShortcutManager shortcutManager0, ShortcutInfo shortcutInfo0) {
        shortcutManager0.pushDynamicShortcut(shortcutInfo0);
    }

    public static void q(ShortcutManager shortcutManager0, List list0) {
        shortcutManager0.removeLongLivedShortcuts(list0);
    }

    public static void u(WindowInsetsController windowInsetsController0) {
        windowInsetsController0.setSystemBarsAppearance(8, 8);
    }

    public static boolean w(ShortcutInfo shortcutInfo0) {
        return shortcutInfo0.isCached();
    }
}

