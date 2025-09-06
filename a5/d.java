package a5;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;
import androidx.appcompat.widget.v2;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.bottomappbar.h;
import com.google.android.material.button.a;
import com.google.android.material.internal.ParcelableSparseArray;
import com.google.android.material.internal.c;
import com.google.android.material.search.b;
import com.google.android.material.search.n;
import com.google.android.material.stateful.ExtendableSavedState;
import f8.s;

public final class d implements Parcelable.ClassLoaderCreator {
    public final int a;

    public d(int v) {
        this.a = v;
        super();
    }

    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        switch(this.a) {
            case 0: {
                return new e(parcel0);
            }
            case 1: {
                return new v2(parcel0, null);
            }
            case 2: {
                return new h(parcel0, null);
            }
            case 3: {
                return new a(parcel0, null);
            }
            case 4: {
                return new c(parcel0, null);
            }
            case 5: {
                return new ParcelableSparseArray(parcel0, null);
            }
            case 6: {
                return new b(parcel0, null);
            }
            case 7: {
                return new n(parcel0, null);
            }
            case 8: {
                return new ExtendableSavedState(parcel0, null);
            }
            case 9: {
                return new s(parcel0, null);
            }
            case 10: {
                g5.n n0 = new g5.n(parcel0, null);  // 初始化器: Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V
                n0.a = parcel0.readInt();
                n0.b = parcel0.readInt();
                n0.c = parcel0.readParcelable(null);
                return n0;
            }
            case 11: {
                if(parcel0.readParcelable(null) != null) {
                    throw new IllegalStateException("superState must be null");
                }
                return AbsSavedState.EMPTY_STATE;
            }
            default: {
                return new y7.e(parcel0, null);
            }
        }
    }

    @Override  // android.os.Parcelable$ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel0, ClassLoader classLoader0) {
        switch(this.a) {
            case 0: {
                return new e(parcel0);
            }
            case 1: {
                return new v2(parcel0, classLoader0);
            }
            case 2: {
                return new h(parcel0, classLoader0);
            }
            case 3: {
                return new a(parcel0, classLoader0);
            }
            case 4: {
                return new c(parcel0, classLoader0);
            }
            case 5: {
                return new ParcelableSparseArray(parcel0, classLoader0);
            }
            case 6: {
                return new b(parcel0, classLoader0);
            }
            case 7: {
                return new n(parcel0, classLoader0);
            }
            case 8: {
                return new ExtendableSavedState(parcel0, classLoader0);
            }
            case 9: {
                return new s(parcel0, classLoader0);
            }
            case 10: {
                g5.n n0 = new g5.n(parcel0, classLoader0);  // 初始化器: Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V
                n0.a = parcel0.readInt();
                n0.b = parcel0.readInt();
                n0.c = parcel0.readParcelable(classLoader0);
                return n0;
            }
            case 11: {
                if(parcel0.readParcelable(classLoader0) != null) {
                    throw new IllegalStateException("superState must be null");
                }
                return AbsSavedState.EMPTY_STATE;
            }
            default: {
                return new y7.e(parcel0, classLoader0);
            }
        }
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        switch(this.a) {
            case 0: {
                return new e[v];
            }
            case 1: {
                return new v2[v];
            }
            case 2: {
                return new h[v];
            }
            case 3: {
                return new a[v];
            }
            case 4: {
                return new c[v];
            }
            case 5: {
                return new ParcelableSparseArray[v];
            }
            case 6: {
                return new b[v];
            }
            case 7: {
                return new n[v];
            }
            case 8: {
                return new ExtendableSavedState[v];
            }
            case 9: {
                return new s[v];
            }
            case 10: {
                return new g5.n[v];
            }
            case 11: {
                return new AbsSavedState[v];
            }
            default: {
                return new y7.e[v];
            }
        }
    }
}

