package androidx.core.os;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.Serializable;
import java.util.ArrayList;

public final class BundleCompat {
    @Nullable
    @Deprecated
    public static IBinder getBinder(@NonNull Bundle bundle0, @Nullable String s) {
        return bundle0.getBinder(s);
    }

    @Nullable
    public static Object getParcelable(@NonNull Bundle bundle0, @Nullable String s, @NonNull Class class0) {
        if(Build.VERSION.SDK_INT >= 34) {
            return c.a(bundle0, s, class0);
        }
        Parcelable parcelable0 = bundle0.getParcelable(s);
        return !class0.isInstance(parcelable0) ? null : parcelable0;
    }

    @SuppressLint({"ArrayReturn", "NullableCollection"})
    @Nullable
    public static Parcelable[] getParcelableArray(@NonNull Bundle bundle0, @Nullable String s, @NonNull Class class0) {
        return Build.VERSION.SDK_INT < 34 ? bundle0.getParcelableArray(s) : ((Parcelable[])c.b(bundle0, s, class0));
    }

    @SuppressLint({"ConcreteCollection", "NullableCollection"})
    @Nullable
    public static ArrayList getParcelableArrayList(@NonNull Bundle bundle0, @Nullable String s, @NonNull Class class0) {
        return Build.VERSION.SDK_INT < 34 ? bundle0.getParcelableArrayList(s) : c.c(bundle0, s, class0);
    }

    @Nullable
    public static Serializable getSerializable(@NonNull Bundle bundle0, @Nullable String s, @NonNull Class class0) {
        if(Build.VERSION.SDK_INT >= 34) {
            return c.d(bundle0, s, class0);
        }
        Serializable serializable0 = bundle0.getSerializable(s);
        return class0.isInstance(serializable0) ? serializable0 : null;
    }

    @Nullable
    public static SparseArray getSparseParcelableArray(@NonNull Bundle bundle0, @Nullable String s, @NonNull Class class0) {
        return Build.VERSION.SDK_INT < 34 ? bundle0.getSparseParcelableArray(s) : c.e(bundle0, s, class0);
    }

    @Deprecated
    public static void putBinder(@NonNull Bundle bundle0, @Nullable String s, @Nullable IBinder iBinder0) {
        bundle0.putBinder(s, iBinder0);
    }
}

