package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;
import r0.a;

public final class n1 extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR;
    public String a;

    static {
        n1.CREATOR = new b(5);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("FragmentTabHost.SavedState{");
        stringBuilder0.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder0.append(" curTab=");
        return a.o(stringBuilder0, this.a, "}");
    }

    @Override  // android.view.View$BaseSavedState
    public final void writeToParcel(Parcel parcel0, int v) {
        super.writeToParcel(parcel0, v);
        parcel0.writeString(this.a);
    }
}

