package com.google.android.gms.common;

import a7.a;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.res.Resources;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.HideFirstParty;
import com.google.android.gms.common.internal.zag;
import com.google.android.gms.common.util.VisibleForTesting;

public final class GooglePlayServicesUtil extends GooglePlayServicesUtilLight {
    @NonNull
    public static final String GMS_ERROR_DIALOG = "GooglePlayServicesErrorDialog";
    @NonNull
    @Deprecated
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    @Deprecated
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = 0;
    @NonNull
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";

    static {
        GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE = GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    @Nullable
    @Deprecated
    public static Dialog getErrorDialog(int v, @NonNull Activity activity0, int v1) {
        return GooglePlayServicesUtil.getErrorDialog(v, activity0, v1, null);
    }

    @Nullable
    @Deprecated
    public static Dialog getErrorDialog(int v, @NonNull Activity activity0, int v1, @Nullable DialogInterface.OnCancelListener dialogInterface$OnCancelListener0) {
        if(GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(activity0, v)) {
            v = 18;
        }
        return GoogleApiAvailability.getInstance().getErrorDialog(activity0, v, v1, dialogInterface$OnCancelListener0);
    }

    @Override  // com.google.android.gms.common.GooglePlayServicesUtilLight
    @NonNull
    @Deprecated
    public static PendingIntent getErrorPendingIntent(int v, @NonNull Context context0, int v1) {
        return GooglePlayServicesUtilLight.getErrorPendingIntent(v, context0, v1);
    }

    @Override  // com.google.android.gms.common.GooglePlayServicesUtilLight
    @NonNull
    @VisibleForTesting
    @Deprecated
    public static String getErrorString(int v) {
        return GooglePlayServicesUtilLight.getErrorString(v);
    }

    @Override  // com.google.android.gms.common.GooglePlayServicesUtilLight
    @NonNull
    public static Context getRemoteContext(@NonNull Context context0) {
        return GooglePlayServicesUtilLight.getRemoteContext(context0);
    }

    @Override  // com.google.android.gms.common.GooglePlayServicesUtilLight
    @NonNull
    public static Resources getRemoteResource(@NonNull Context context0) {
        return GooglePlayServicesUtilLight.getRemoteResource(context0);
    }

    @Override  // com.google.android.gms.common.GooglePlayServicesUtilLight
    @HideFirstParty
    @Deprecated
    public static int isGooglePlayServicesAvailable(@NonNull Context context0) {
        return GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(context0);
    }

    @Override  // com.google.android.gms.common.GooglePlayServicesUtilLight
    @KeepForSdk
    @Deprecated
    public static int isGooglePlayServicesAvailable(@NonNull Context context0, int v) {
        return GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(context0, v);
    }

    @Override  // com.google.android.gms.common.GooglePlayServicesUtilLight
    @Deprecated
    public static boolean isUserRecoverableError(int v) {
        return GooglePlayServicesUtilLight.isUserRecoverableError(v);
    }

    @Deprecated
    public static boolean showErrorDialogFragment(int v, @NonNull Activity activity0, int v1) {
        return GooglePlayServicesUtil.showErrorDialogFragment(v, activity0, v1, null);
    }

    @Deprecated
    public static boolean showErrorDialogFragment(int v, @NonNull Activity activity0, int v1, @Nullable DialogInterface.OnCancelListener dialogInterface$OnCancelListener0) {
        return GooglePlayServicesUtil.showErrorDialogFragment(v, activity0, null, v1, dialogInterface$OnCancelListener0);
    }

    public static boolean showErrorDialogFragment(int v, @NonNull Activity activity0, @Nullable Fragment fragment0, int v1, @Nullable DialogInterface.OnCancelListener dialogInterface$OnCancelListener0) {
        if(GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(activity0, v)) {
            v = 18;
        }
        GoogleApiAvailability googleApiAvailability0 = GoogleApiAvailability.getInstance();
        if(fragment0 == null) {
            return googleApiAvailability0.showErrorDialogFragment(activity0, v, v1, dialogInterface$OnCancelListener0);
        }
        zag zag0 = zag.zac(fragment0, GoogleApiAvailability.getInstance().getErrorResolutionIntent(activity0, v, "d"), v1);
        googleApiAvailability0.getClass();
        AlertDialog alertDialog0 = GoogleApiAvailability.a(activity0, v, zag0, dialogInterface$OnCancelListener0);
        if(alertDialog0 == null) {
            return false;
        }
        GoogleApiAvailability.b(activity0, alertDialog0, "GooglePlayServicesErrorDialog", dialogInterface$OnCancelListener0);
        return true;
    }

    @Deprecated
    public static void showErrorNotification(int v, @NonNull Context context0) {
        GoogleApiAvailability googleApiAvailability0 = GoogleApiAvailability.getInstance();
        if(!GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(context0, v) && !GooglePlayServicesUtilLight.isPlayStorePossiblyUpdating(context0, v)) {
            googleApiAvailability0.showErrorNotification(context0, v);
            return;
        }
        googleApiAvailability0.getClass();
        new a(googleApiAvailability0, context0).sendEmptyMessageDelayed(1, 120000L);
    }
}

