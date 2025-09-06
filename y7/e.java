package y7;

import a5.d;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.customview.view.AbsSavedState;

public final class e extends AbsSavedState {
    public static final Parcelable.Creator CREATOR;
    public Bundle b;

    static {
        e.CREATOR = new d(12);
    }

    public e(Parcel parcel0, ClassLoader classLoader0) {
        super(parcel0, classLoader0);
        if(classLoader0 == null) {
            classLoader0 = e.class.getClassLoader();
        }
        this.b = parcel0.readBundle(classLoader0);
    }

    @Override  // androidx.customview.view.AbsSavedState
    public final void writeToParcel(Parcel parcel0, int v) {
        super.writeToParcel(parcel0, v);
        parcel0.writeBundle(this.b);
    }
}

