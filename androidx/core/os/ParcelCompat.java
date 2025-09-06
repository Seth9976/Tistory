package androidx.core.os;

import a5.b;
import android.annotation.SuppressLint;
import android.os.BadParcelableException;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class ParcelCompat {
    @SuppressLint({"ArrayReturn", "NullableCollection"})
    @Nullable
    public static Object[] readArray(@NonNull Parcel parcel0, @Nullable ClassLoader classLoader0, @NonNull Class class0) {
        return Build.VERSION.SDK_INT < 34 ? parcel0.readArray(classLoader0) : o.a(parcel0, classLoader0, class0);
    }

    @SuppressLint({"ConcreteCollection", "NullableCollection"})
    @Nullable
    public static ArrayList readArrayList(@NonNull Parcel parcel0, @Nullable ClassLoader classLoader0, @NonNull Class class0) {
        return Build.VERSION.SDK_INT < 34 ? parcel0.readArrayList(classLoader0) : o.b(parcel0, classLoader0, class0);
    }

    public static boolean readBoolean(@NonNull Parcel parcel0) {
        return parcel0.readInt() != 0;
    }

    @SuppressLint({"ConcreteCollection", "NullableCollection"})
    @Nullable
    public static HashMap readHashMap(@NonNull Parcel parcel0, @Nullable ClassLoader classLoader0, @NonNull Class class0, @NonNull Class class1) {
        return Build.VERSION.SDK_INT < 34 ? parcel0.readHashMap(classLoader0) : o.c(parcel0, classLoader0, class0, class1);
    }

    public static void readList(@NonNull Parcel parcel0, @NonNull List list0, @Nullable ClassLoader classLoader0, @NonNull Class class0) {
        if(Build.VERSION.SDK_INT >= 34) {
            o.d(parcel0, list0, classLoader0, class0);
            return;
        }
        parcel0.readList(list0, classLoader0);
    }

    public static void readMap(@NonNull Parcel parcel0, @NonNull Map map0, @Nullable ClassLoader classLoader0, @NonNull Class class0, @NonNull Class class1) {
        if(Build.VERSION.SDK_INT >= 34) {
            o.e(parcel0, map0, classLoader0, class0, class1);
            return;
        }
        parcel0.readMap(map0, classLoader0);
    }

    @Nullable
    public static Parcelable readParcelable(@NonNull Parcel parcel0, @Nullable ClassLoader classLoader0, @NonNull Class class0) {
        if(Build.VERSION.SDK_INT >= 34) {
            return o.f(parcel0, classLoader0, class0);
        }
        Parcelable parcelable0 = parcel0.readParcelable(classLoader0);
        if(parcelable0 != null && !class0.isInstance(parcelable0)) {
            throw new BadParcelableException("Parcelable " + parcelable0.getClass() + " is not a subclass of required class " + class0.getName() + " provided in the parameter");
        }
        return parcelable0;
    }

    @SuppressLint({"ArrayReturn", "NullableCollection"})
    @Nullable
    @Deprecated
    public static Object[] readParcelableArray(@NonNull Parcel parcel0, @Nullable ClassLoader classLoader0, @NonNull Class class0) {
        if(Build.VERSION.SDK_INT >= 34) {
            return o.g(parcel0, classLoader0, class0);
        }
        Object[] arr_object = parcel0.readParcelableArray(classLoader0);
        if(class0.isAssignableFrom(Parcelable.class)) {
            return arr_object;
        }
        Object[] arr_object1 = (Object[])Array.newInstance(class0, arr_object.length);
        for(int v = 0; v < arr_object.length; ++v) {
            try {
                arr_object1[v] = class0.cast(arr_object[v]);
            }
            catch(ClassCastException unused_ex) {
                StringBuilder stringBuilder0 = b.s(v, "Parcelable at index ", " is not a subclass of required class ");
                stringBuilder0.append(class0.getName());
                stringBuilder0.append(" provided in the parameter");
                throw new BadParcelableException(stringBuilder0.toString());
            }
        }
        return arr_object1;
    }

    @SuppressLint({"ArrayReturn", "NullableCollection"})
    @Nullable
    public static Parcelable[] readParcelableArrayTyped(@NonNull Parcel parcel0, @Nullable ClassLoader classLoader0, @NonNull Class class0) {
        return Build.VERSION.SDK_INT < 34 ? parcel0.readParcelableArray(classLoader0) : ((Parcelable[])o.g(parcel0, classLoader0, class0));
    }

    @Nullable
    @RequiresApi(30)
    public static Parcelable.Creator readParcelableCreator(@NonNull Parcel parcel0, @Nullable ClassLoader classLoader0, @NonNull Class class0) {
        return Build.VERSION.SDK_INT < 34 ? n.a(parcel0, classLoader0) : o.h(parcel0, classLoader0, class0);
    }

    @NonNull
    @RequiresApi(api = 29)
    public static List readParcelableList(@NonNull Parcel parcel0, @NonNull List list0, @Nullable ClassLoader classLoader0, @NonNull Class class0) {
        return Build.VERSION.SDK_INT < 34 ? m.a(parcel0, list0, classLoader0) : o.i(parcel0, list0, classLoader0, class0);
    }

    @Nullable
    public static Serializable readSerializable(@NonNull Parcel parcel0, @Nullable ClassLoader classLoader0, @NonNull Class class0) {
        return Build.VERSION.SDK_INT < 33 ? parcel0.readSerializable() : o.j(parcel0, classLoader0, class0);
    }

    @Nullable
    public static SparseArray readSparseArray(@NonNull Parcel parcel0, @Nullable ClassLoader classLoader0, @NonNull Class class0) {
        return Build.VERSION.SDK_INT < 34 ? parcel0.readSparseArray(classLoader0) : o.k(parcel0, classLoader0, class0);
    }

    public static void writeBoolean(@NonNull Parcel parcel0, boolean z) {
        parcel0.writeInt(((int)z));
    }
}

