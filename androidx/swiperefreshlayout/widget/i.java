package androidx.swiperefreshlayout.widget;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.view.View.BaseSavedState;
import androidx.appcompat.widget.m;

public final class i extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR;
    public final boolean a;

    static {
        i.CREATOR = new m(3);
    }

    public i(Parcel parcel0) {
        super(parcel0);
        this.a = parcel0.readByte() != 0;
    }

    public i(Parcelable parcelable0, boolean z) {
        super(parcelable0);
        this.a = z;
    }

    @Override  // android.view.View$BaseSavedState
    public final void writeToParcel(Parcel parcel0, int v) {
        super.writeToParcel(parcel0, v);
        parcel0.writeByte(((byte)this.a));
    }
}

