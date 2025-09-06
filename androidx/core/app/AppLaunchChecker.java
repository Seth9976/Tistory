package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;

@SuppressLint({"PrivateConstructorForUtilityClass"})
public class AppLaunchChecker {
    public static boolean hasStartedFromLauncher(@NonNull Context context0) {
        return context0.getSharedPreferences("android.support.AppLaunchChecker", 0).getBoolean("startedFromLauncher", false);
    }

    public static void onActivityCreate(@NonNull Activity activity0) {
        SharedPreferences sharedPreferences0 = activity0.getSharedPreferences("android.support.AppLaunchChecker", 0);
        if(sharedPreferences0.getBoolean("startedFromLauncher", false)) {
            return;
        }
        Intent intent0 = activity0.getIntent();
        if(intent0 == null) {
            return;
        }
        if("android.intent.action.MAIN".equals(intent0.getAction()) && (intent0.hasCategory("android.intent.category.LAUNCHER") || intent0.hasCategory("android.intent.category.LEANBACK_LAUNCHER"))) {
            sharedPreferences0.edit().putBoolean("startedFromLauncher", true).apply();
        }
    }
}

