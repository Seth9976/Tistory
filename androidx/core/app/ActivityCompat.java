package androidx.core.app;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.DragEvent;
import android.view.View;
import androidx.activity.h;
import androidx.annotation.IdRes;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.content.ContextCompat;
import androidx.core.content.LocusIdCompat;
import androidx.core.view.DragAndDropPermissionsCompat;
import java.util.Arrays;
import java.util.HashSet;

public class ActivityCompat extends ContextCompat {
    public interface OnRequestPermissionsResultCallback {
        void onRequestPermissionsResult(int arg1, @NonNull String[] arg2, @NonNull int[] arg3);
    }

    public interface PermissionCompatDelegate {
        boolean onActivityResult(@NonNull Activity arg1, @IntRange(from = 0L) int arg2, int arg3, @Nullable Intent arg4);

        boolean requestPermissions(@NonNull Activity arg1, @NonNull String[] arg2, @IntRange(from = 0L) int arg3);
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public interface RequestPermissionsRequestCodeValidator {
        void validateRequestPermissionsRequestCode(int arg1);
    }

    public static PermissionCompatDelegate b;

    public static void finishAffinity(@NonNull Activity activity0) {
        activity0.finishAffinity();
    }

    public static void finishAfterTransition(@NonNull Activity activity0) {
        a.a(activity0);
    }

    @Nullable
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public static PermissionCompatDelegate getPermissionCompatDelegate() {
        return ActivityCompat.b;
    }

    @Nullable
    public static Uri getReferrer(@NonNull Activity activity0) {
        return b.a(activity0);
    }

    @Deprecated
    public static boolean invalidateOptionsMenu(Activity activity0) {
        activity0.invalidateOptionsMenu();
        return true;
    }

    public static boolean isLaunchedFromBubble(@NonNull Activity activity0) {
        int v = Build.VERSION.SDK_INT;
        if(v >= 0x1F) {
            return f.a(activity0);
        }
        switch(v) {
            case 29: {
                return activity0.getWindowManager().getDefaultDisplay() != null && activity0.getWindowManager().getDefaultDisplay().getDisplayId() != 0;
            }
            case 30: {
                return e.a(activity0) != null && e.a(activity0).getDisplayId() != 0;
            }
            default: {
                return false;
            }
        }
    }

    public static void postponeEnterTransition(@NonNull Activity activity0) {
        a.b(activity0);
    }

    public static void recreate(@NonNull Activity activity0) {
        if(Build.VERSION.SDK_INT >= 28) {
            activity0.recreate();
            return;
        }
        new Handler(activity0.getMainLooper()).post(new h(activity0, 6));
    }

    @Nullable
    public static DragAndDropPermissionsCompat requestDragAndDropPermissions(@NonNull Activity activity0, @NonNull DragEvent dragEvent0) {
        return DragAndDropPermissionsCompat.request(activity0, dragEvent0);
    }

    public static void requestPermissions(@NonNull Activity activity0, @NonNull String[] arr_s, @IntRange(from = 0L) int v) {
        if(ActivityCompat.b != null && ActivityCompat.b.requestPermissions(activity0, arr_s, v)) {
            return;
        }
        HashSet hashSet0 = new HashSet();
        for(int v2 = 0; v2 < arr_s.length; ++v2) {
            if(TextUtils.isEmpty(arr_s[v2])) {
                throw new IllegalArgumentException(r0.a.o(new StringBuilder("Permission request for permissions "), Arrays.toString(arr_s), " must not contain null or empty values"));
            }
            if(Build.VERSION.SDK_INT < 33 && TextUtils.equals(arr_s[v2], "android.permission.POST_NOTIFICATIONS")) {
                hashSet0.add(v2);
            }
        }
        int v3 = hashSet0.size();
        String[] arr_s1 = v3 <= 0 ? arr_s : new String[arr_s.length - v3];
        if(v3 > 0) {
            if(v3 == arr_s.length) {
                return;
            }
            int v4 = 0;
            for(int v1 = 0; v1 < arr_s.length; ++v1) {
                if(!hashSet0.contains(v1)) {
                    arr_s1[v4] = arr_s[v1];
                    ++v4;
                }
            }
        }
        if(activity0 instanceof RequestPermissionsRequestCodeValidator) {
            ((RequestPermissionsRequestCodeValidator)activity0).validateRequestPermissionsRequestCode(v);
        }
        c.b(activity0, arr_s, v);
    }

    @NonNull
    public static View requireViewById(@NonNull Activity activity0, @IdRes int v) {
        if(Build.VERSION.SDK_INT >= 28) {
            return (View)d.a(activity0, v);
        }
        View view0 = activity0.findViewById(v);
        if(view0 == null) {
            throw new IllegalArgumentException("ID does not reference a View inside this Activity");
        }
        return view0;
    }

    public static void setEnterSharedElementCallback(@NonNull Activity activity0, @Nullable SharedElementCallback sharedElementCallback0) {
        a.c(activity0, (sharedElementCallback0 == null ? null : new i(sharedElementCallback0)));
    }

    public static void setExitSharedElementCallback(@NonNull Activity activity0, @Nullable SharedElementCallback sharedElementCallback0) {
        a.d(activity0, (sharedElementCallback0 == null ? null : new i(sharedElementCallback0)));
    }

    public static void setLocusContext(@NonNull Activity activity0, @Nullable LocusIdCompat locusIdCompat0, @Nullable Bundle bundle0) {
        if(Build.VERSION.SDK_INT >= 30) {
            e.b(activity0, locusIdCompat0, bundle0);
        }
    }

    public static void setPermissionCompatDelegate(@Nullable PermissionCompatDelegate activityCompat$PermissionCompatDelegate0) {
        ActivityCompat.b = activityCompat$PermissionCompatDelegate0;
    }

    public static boolean shouldShowRequestPermissionRationale(@NonNull Activity activity0, @NonNull String s) {
        int v = Build.VERSION.SDK_INT;
        if(v < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", s)) {
            return false;
        }
        if(v >= 0x20) {
            return g.a(activity0, s);
        }
        return v == 0x1F ? f.b(activity0, s) : c.c(activity0, s);
    }

    public static void startActivityForResult(@NonNull Activity activity0, @NonNull Intent intent0, int v, @Nullable Bundle bundle0) {
        activity0.startActivityForResult(intent0, v, bundle0);
    }

    public static void startIntentSenderForResult(@NonNull Activity activity0, @NonNull IntentSender intentSender0, int v, @Nullable Intent intent0, int v1, int v2, int v3, @Nullable Bundle bundle0) throws IntentSender.SendIntentException {
        activity0.startIntentSenderForResult(intentSender0, v, intent0, v1, v2, v3, bundle0);
    }

    public static void startPostponedEnterTransition(@NonNull Activity activity0) {
        a.e(activity0);
    }
}

