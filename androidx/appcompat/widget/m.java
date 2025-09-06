package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.os.ResultReceiver;
import androidx.recyclerview.widget.c2;
import androidx.swiperefreshlayout.widget.i;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.gms.cloudmessaging.zzd;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.material.datepicker.DateValidatorPointBackward;
import com.google.android.material.datepicker.DateValidatorPointForward;
import com.google.android.material.datepicker.RangeDateSelector;
import com.google.android.material.datepicker.SingleDateSelector;
import com.google.android.material.datepicker.y;
import com.google.android.material.internal.ParcelableSparseArray;
import com.google.android.material.internal.ParcelableSparseBooleanArray;
import com.google.android.material.internal.ParcelableSparseIntArray;
import com.google.android.material.slider.e;
import com.google.android.material.slider.f;
import com.google.android.material.timepicker.k;
import java.util.ArrayList;
import p3.j;
import t7.b;
import y7.d;

public final class m implements Parcelable.Creator {
    public final int a;

    public m(int v) {
        this.a = v;
        super();
    }

    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        switch(this.a) {
            case 0: {
                n n0 = new n();  // 初始化器: Ljava/lang/Object;-><init>()V
                n0.a = parcel0.readInt();
                return n0;
            }
            case 1: {
                s0 s00 = new s0(parcel0);  // 初始化器: Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V
                s00.a = parcel0.readByte() != 0;
                return s00;
            }
            case 2: {
                c2 c20 = new c2();  // 初始化器: Ljava/lang/Object;-><init>()V
                c20.a = parcel0.readInt();
                c20.b = parcel0.readInt();
                c20.d = parcel0.readInt() == 1;
                int v = parcel0.readInt();
                if(v > 0) {
                    int[] arr_v = new int[v];
                    c20.c = arr_v;
                    parcel0.readIntArray(arr_v);
                }
                return c20;
            }
            case 3: {
                return new i(parcel0);
            }
            case 4: {
                return new ParcelImpl(parcel0);
            }
            case 5: {
                return new zzd(parcel0.readStrongBinder());
            }
            case 6: {
                BinderWrapper binderWrapper0 = new BinderWrapper();  // 初始化器: Ljava/lang/Object;-><init>()V
                binderWrapper0.a = parcel0.readStrongBinder();
                return binderWrapper0;
            }
            case 7: {
                return new DateValidatorPointBackward(parcel0.readLong());
            }
            case 8: {
                return new DateValidatorPointForward(parcel0.readLong());
            }
            case 9: {
                return y.b(parcel0.readInt(), parcel0.readInt());
            }
            case 10: {
                RangeDateSelector rangeDateSelector0 = new RangeDateSelector();
                rangeDateSelector0.c = (Long)parcel0.readValue(Long.class.getClassLoader());
                rangeDateSelector0.d = (Long)parcel0.readValue(Long.class.getClassLoader());
                return rangeDateSelector0;
            }
            case 11: {
                SingleDateSelector singleDateSelector0 = new SingleDateSelector();
                singleDateSelector0.b = (Long)parcel0.readValue(Long.class.getClassLoader());
                return singleDateSelector0;
            }
            case 12: {
                int v1 = parcel0.readInt();
                ParcelableSparseBooleanArray parcelableSparseBooleanArray0 = new ParcelableSparseBooleanArray(v1);
                int[] arr_v1 = new int[v1];
                boolean[] arr_z = new boolean[v1];
                parcel0.readIntArray(arr_v1);
                parcel0.readBooleanArray(arr_z);
                for(int v2 = 0; v2 < v1; ++v2) {
                    parcelableSparseBooleanArray0.put(arr_v1[v2], arr_z[v2]);
                }
                return parcelableSparseBooleanArray0;
            }
            case 13: {
                int v3 = parcel0.readInt();
                ParcelableSparseIntArray parcelableSparseIntArray0 = new ParcelableSparseIntArray(v3);
                int[] arr_v2 = new int[v3];
                int[] arr_v3 = new int[v3];
                parcel0.readIntArray(arr_v2);
                parcel0.readIntArray(arr_v3);
                for(int v4 = 0; v4 < v3; ++v4) {
                    parcelableSparseIntArray0.put(arr_v2[v4], arr_v3[v4]);
                }
                return parcelableSparseIntArray0;
            }
            case 14: {
                e e0 = new e(parcel0);  // 初始化器: Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V
                e0.a = parcel0.readFloat();
                e0.b = parcel0.readFloat();
                ArrayList arrayList0 = new ArrayList();
                e0.c = arrayList0;
                parcel0.readList(arrayList0, Float.class.getClassLoader());
                e0.d = parcel0.readFloat();
                e0.e = parcel0.createBooleanArray()[0];
                return e0;
            }
            case 15: {
                return new f(parcel0);
            }
            case 16: {
                return new k(parcel0.readInt(), parcel0.readInt(), parcel0.readInt(), parcel0.readInt());
            }
            case 17: {
                return new ResultReceiver(parcel0);
            }
            case 18: {
                j j0 = new j(parcel0);  // 初始化器: Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V
                j0.a = parcel0.readInt();
                return j0;
            }
            case 19: {
                b b0 = new b(parcel0);  // 初始化器: Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V
                b0.a = (int)(((Integer)parcel0.readValue(b.class.getClassLoader())));
                return b0;
            }
            default: {
                d d0 = new d();  // 初始化器: Ljava/lang/Object;-><init>()V
                d0.a = parcel0.readInt();
                d0.b = (ParcelableSparseArray)parcel0.readParcelable(d.class.getClassLoader());
                return d0;
            }
        }
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        switch(this.a) {
            case 0: {
                return new n[v];
            }
            case 1: {
                return new s0[v];
            }
            case 2: {
                return new c2[v];
            }
            case 3: {
                return new i[v];
            }
            case 4: {
                return new ParcelImpl[v];
            }
            case 5: {
                return new zzd[v];
            }
            case 6: {
                return new BinderWrapper[v];
            }
            case 7: {
                return new DateValidatorPointBackward[v];
            }
            case 8: {
                return new DateValidatorPointForward[v];
            }
            case 9: {
                return new y[v];
            }
            case 10: {
                return new RangeDateSelector[v];
            }
            case 11: {
                return new SingleDateSelector[v];
            }
            case 12: {
                return new ParcelableSparseBooleanArray[v];
            }
            case 13: {
                return new ParcelableSparseIntArray[v];
            }
            case 14: {
                return new e[v];
            }
            case 15: {
                return new f[v];
            }
            case 16: {
                return new k[v];
            }
            case 17: {
                return new ResultReceiver[v];
            }
            case 18: {
                return new j[v];
            }
            case 19: {
                return new b[v];
            }
            default: {
                return new d[v];
            }
        }
    }
}

