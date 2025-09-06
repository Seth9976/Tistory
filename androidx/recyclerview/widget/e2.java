package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class e2 implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        SavedState staggeredGridLayoutManager$SavedState0 = new SavedState();  // 初始化器: Ljava/lang/Object;-><init>()V
        staggeredGridLayoutManager$SavedState0.a = parcel0.readInt();
        staggeredGridLayoutManager$SavedState0.b = parcel0.readInt();
        int v = parcel0.readInt();
        staggeredGridLayoutManager$SavedState0.c = v;
        if(v > 0) {
            int[] arr_v = new int[v];
            staggeredGridLayoutManager$SavedState0.d = arr_v;
            parcel0.readIntArray(arr_v);
        }
        int v1 = parcel0.readInt();
        staggeredGridLayoutManager$SavedState0.e = v1;
        if(v1 > 0) {
            int[] arr_v1 = new int[v1];
            staggeredGridLayoutManager$SavedState0.f = arr_v1;
            parcel0.readIntArray(arr_v1);
        }
        boolean z = false;
        staggeredGridLayoutManager$SavedState0.h = parcel0.readInt() == 1;
        staggeredGridLayoutManager$SavedState0.i = parcel0.readInt() == 1;
        if(parcel0.readInt() == 1) {
            z = true;
        }
        staggeredGridLayoutManager$SavedState0.j = z;
        staggeredGridLayoutManager$SavedState0.g = parcel0.readArrayList(c2.class.getClassLoader());
        return staggeredGridLayoutManager$SavedState0;
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new SavedState[v];
    }
}

