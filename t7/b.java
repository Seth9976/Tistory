package t7;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.m;
import r0.a;

public final class b extends View.BaseSavedState {
    @NonNull
    public static final Parcelable.Creator CREATOR;
    public int a;

    static {
        b.CREATOR = new m(19);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("MaterialCheckBox.SavedState{");
        stringBuilder0.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder0.append(" CheckedState=");
        switch(this.a) {
            case 1: {
                return a.o(stringBuilder0, "checked", "}");
            }
            case 2: {
                return a.o(stringBuilder0, "indeterminate", "}");
            }
            default: {
                return a.o(stringBuilder0, "unchecked", "}");
            }
        }
    }

    @Override  // android.view.View$BaseSavedState
    public final void writeToParcel(Parcel parcel0, int v) {
        super.writeToParcel(parcel0, v);
        parcel0.writeValue(this.a);
    }
}

