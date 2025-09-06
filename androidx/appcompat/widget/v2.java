package androidx.appcompat.widget;

import a5.d;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.customview.view.AbsSavedState;

public final class v2 extends AbsSavedState {
    public static final Parcelable.Creator CREATOR;
    public boolean b;

    static {
        v2.CREATOR = new d(1);
    }

    public v2(Parcel parcel0, ClassLoader classLoader0) {
        super(parcel0, classLoader0);
        this.b = ((Boolean)parcel0.readValue(null)).booleanValue();
    }

    @Override
    public final String toString() {
        return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.b + "}";
    }

    @Override  // androidx.customview.view.AbsSavedState
    public final void writeToParcel(Parcel parcel0, int v) {
        super.writeToParcel(parcel0, v);
        parcel0.writeValue(Boolean.valueOf(this.b));
    }
}

