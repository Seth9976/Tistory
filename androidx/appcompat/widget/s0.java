package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;

public final class s0 extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR;
    public boolean a;

    static {
        s0.CREATOR = new m(1);
    }

    @Override  // android.view.View$BaseSavedState
    public final void writeToParcel(Parcel parcel0, int v) {
        super.writeToParcel(parcel0, v);
        parcel0.writeByte(((byte)this.a));
    }
}

