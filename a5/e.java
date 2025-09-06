package a5;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.customview.view.AbsSavedState;

public final class e extends AbsSavedState {
    public static final Parcelable.Creator CREATOR;
    public boolean b;
    public int c;

    static {
        e.CREATOR = new d(0);
    }

    public e(Parcel parcel0) {
        super(parcel0, null);
        this.b = parcel0.readInt() != 0;
        this.c = parcel0.readInt();
    }

    @Override  // androidx.customview.view.AbsSavedState
    public final void writeToParcel(Parcel parcel0, int v) {
        super.writeToParcel(parcel0, v);
        parcel0.writeInt(((int)this.b));
        parcel0.writeInt(this.c);
    }
}

