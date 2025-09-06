package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Preconditions;
import java.io.Serializable;
import java.util.ArrayList;

public final class IntentCompat {
    @SuppressLint({"ActionValue"})
    public static final String ACTION_CREATE_REMINDER = "android.intent.action.CREATE_REMINDER";
    public static final String CATEGORY_LEANBACK_LAUNCHER = "android.intent.category.LEANBACK_LAUNCHER";
    public static final String EXTRA_HTML_TEXT = "android.intent.extra.HTML_TEXT";
    public static final String EXTRA_START_PLAYBACK = "android.intent.extra.START_PLAYBACK";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_TIME = "android.intent.extra.TIME";

    @NonNull
    public static Intent createManageUnusedAppRestrictionsIntent(@NonNull Context context0, @NonNull String s) {
        if(!PackageManagerCompat.areUnusedAppRestrictionsAvailable(context0.getPackageManager())) {
            throw new UnsupportedOperationException("Unused App Restriction features are not available on this device");
        }
        int v = Build.VERSION.SDK_INT;
        if(v >= 0x1F) {
            return new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.fromParts("package", s, null));
        }
        Intent intent0 = new Intent("android.intent.action.AUTO_REVOKE_PERMISSIONS").setData(Uri.fromParts("package", s, null));
        return v < 30 ? intent0.setPackage(((String)Preconditions.checkNotNull(PackageManagerCompat.getPermissionRevocationVerifierApp(context0.getPackageManager())))) : intent0;
    }

    @SuppressLint({"ArrayReturn", "NullableCollection"})
    @Nullable
    public static Parcelable[] getParcelableArrayExtra(@NonNull Intent intent0, @Nullable String s, @NonNull Class class0) {
        return Build.VERSION.SDK_INT < 34 ? intent0.getParcelableArrayExtra(s) : ((Parcelable[])j.a(intent0, s, class0));
    }

    @SuppressLint({"ConcreteCollection", "NullableCollection"})
    @Nullable
    public static ArrayList getParcelableArrayListExtra(@NonNull Intent intent0, @Nullable String s, @NonNull Class class0) {
        return Build.VERSION.SDK_INT < 34 ? intent0.getParcelableArrayListExtra(s) : j.b(intent0, s, class0);
    }

    @Nullable
    public static Object getParcelableExtra(@NonNull Intent intent0, @Nullable String s, @NonNull Class class0) {
        if(Build.VERSION.SDK_INT >= 34) {
            return j.c(intent0, s, class0);
        }
        Parcelable parcelable0 = intent0.getParcelableExtra(s);
        return !class0.isInstance(parcelable0) ? null : parcelable0;
    }

    @Nullable
    public static Serializable getSerializableExtra(@NonNull Intent intent0, @Nullable String s, @NonNull Class class0) {
        if(Build.VERSION.SDK_INT >= 34) {
            return j.d(intent0, s, class0);
        }
        Serializable serializable0 = intent0.getSerializableExtra(s);
        return class0.isInstance(serializable0) ? serializable0 : null;
    }

    @NonNull
    public static Intent makeMainSelectorActivity(@NonNull String s, @NonNull String s1) {
        return Intent.makeMainSelectorActivity(s, s1);
    }
}

