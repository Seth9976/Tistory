package androidx.core.os;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class o {
    @DoNotInline
    public static Object[] a(Parcel parcel0, ClassLoader classLoader0, Class class0) {
        return parcel0.readArray(classLoader0, class0);
    }

    @DoNotInline
    public static ArrayList b(Parcel parcel0, ClassLoader classLoader0, Class class0) {
        return parcel0.readArrayList(classLoader0, class0);
    }

    @DoNotInline
    public static HashMap c(Parcel parcel0, ClassLoader classLoader0, Class class0, Class class1) {
        return parcel0.readHashMap(classLoader0, class0, class1);
    }

    @DoNotInline
    public static void d(@NonNull Parcel parcel0, @NonNull List list0, @Nullable ClassLoader classLoader0, @NonNull Class class0) {
        parcel0.readList(list0, classLoader0, class0);
    }

    @DoNotInline
    public static void e(Parcel parcel0, Map map0, ClassLoader classLoader0, Class class0, Class class1) {
        parcel0.readMap(map0, classLoader0, class0, class1);
    }

    @DoNotInline
    public static Parcelable f(@NonNull Parcel parcel0, @Nullable ClassLoader classLoader0, @NonNull Class class0) {
        return (Parcelable)parcel0.readParcelable(classLoader0, class0);
    }

    @DoNotInline
    public static Object[] g(@NonNull Parcel parcel0, @Nullable ClassLoader classLoader0, @NonNull Class class0) {
        return parcel0.readParcelableArray(classLoader0, class0);
    }

    @DoNotInline
    public static Parcelable.Creator h(Parcel parcel0, ClassLoader classLoader0, Class class0) {
        return parcel0.readParcelableCreator(classLoader0, class0);
    }

    @DoNotInline
    public static List i(@NonNull Parcel parcel0, @NonNull List list0, @Nullable ClassLoader classLoader0, @NonNull Class class0) {
        return parcel0.readParcelableList(list0, classLoader0, class0);
    }

    @DoNotInline
    public static Serializable j(@NonNull Parcel parcel0, @Nullable ClassLoader classLoader0, @NonNull Class class0) {
        return (Serializable)parcel0.readSerializable(classLoader0, class0);
    }

    @DoNotInline
    public static SparseArray k(Parcel parcel0, ClassLoader classLoader0, Class class0) {
        return parcel0.readSparseArray(classLoader0, class0);
    }
}

