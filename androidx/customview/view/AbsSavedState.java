package androidx.customview.view;

import a5.d;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import r3.a;

@SuppressLint({"BanParcelableUsage"})
public abstract class AbsSavedState implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public static final AbsSavedState EMPTY_STATE;
    public final Parcelable a;

    static {
        AbsSavedState.EMPTY_STATE = new a();  // 初始化器: Landroidx/customview/view/AbsSavedState;-><init>()V
        AbsSavedState.CREATOR = new d(11);
    }

    public AbsSavedState() {
        this.a = null;
    }

    public AbsSavedState(@NonNull Parcel parcel0) {
        this(parcel0, null);
    }

    public AbsSavedState(@NonNull Parcel parcel0, @Nullable ClassLoader classLoader0) {
        Parcelable parcelable0 = parcel0.readParcelable(classLoader0);
        if(parcelable0 == null) {
            parcelable0 = AbsSavedState.EMPTY_STATE;
        }
        this.a = parcelable0;
    }

    public AbsSavedState(@NonNull Parcelable parcelable0) {
        if(parcelable0 == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        if(parcelable0 == AbsSavedState.EMPTY_STATE) {
            parcelable0 = null;
        }
        this.a = parcelable0;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final Parcelable getSuperState() {
        return this.a;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeParcelable(this.a, v);
    }
}

