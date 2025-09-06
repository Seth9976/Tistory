package g5;

import a5.d;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.view.View.BaseSavedState;

public final class n extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR;
    public int a;
    public int b;
    public Parcelable c;

    static {
        n.CREATOR = new d(10);
    }

    @Override  // android.view.View$BaseSavedState
    public final void writeToParcel(Parcel parcel0, int v) {
        super.writeToParcel(parcel0, v);
        parcel0.writeInt(this.a);
        parcel0.writeInt(this.b);
        parcel0.writeParcelable(this.c, v);
    }
}

