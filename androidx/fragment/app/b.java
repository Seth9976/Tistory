package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;

public final class b implements Parcelable.Creator {
    public final int a;

    public b(int v) {
        this.a = v;
        super();
    }

    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        switch(this.a) {
            case 0: {
                return new c(parcel0);
            }
            case 1: {
                return new d(parcel0);
            }
            case 2: {
                y0 y00 = new y0();  // 初始化器: Ljava/lang/Object;-><init>()V
                y00.a = parcel0.readString();
                y00.b = parcel0.readInt();
                return y00;
            }
            case 3: {
                e1 e10 = new e1();  // 初始化器: Ljava/lang/Object;-><init>()V
                e10.e = null;
                e10.f = new ArrayList();
                e10.g = new ArrayList();
                e10.a = parcel0.createStringArrayList();
                e10.b = parcel0.createStringArrayList();
                e10.c = (c[])parcel0.createTypedArray(c.CREATOR);
                e10.d = parcel0.readInt();
                e10.e = parcel0.readString();
                e10.f = parcel0.createStringArrayList();
                e10.g = parcel0.createTypedArrayList(d.CREATOR);
                e10.h = parcel0.createTypedArrayList(y0.CREATOR);
                return e10;
            }
            case 4: {
                return new h1(parcel0);
            }
            default: {
                n1 n10 = new n1(parcel0);  // 初始化器: Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V
                n10.a = parcel0.readString();
                return n10;
            }
        }
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        switch(this.a) {
            case 0: {
                return new c[v];
            }
            case 1: {
                return new d[v];
            }
            case 2: {
                return new y0[v];
            }
            case 3: {
                return new e1[v];
            }
            case 4: {
                return new h1[v];
            }
            default: {
                return new n1[v];
            }
        }
    }
}

