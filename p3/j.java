package p3;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;
import androidx.appcompat.widget.m;
import wb.a;

public final class j extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR;
    public int a;

    static {
        j.CREATOR = new m(18);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("HorizontalScrollView.SavedState{");
        stringBuilder0.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder0.append(" scrollPosition=");
        return a.c(this.a, "}", stringBuilder0);
    }

    @Override  // android.view.View$BaseSavedState
    public final void writeToParcel(Parcel parcel0, int v) {
        super.writeToParcel(parcel0, v);
        parcel0.writeInt(this.a);
    }
}

