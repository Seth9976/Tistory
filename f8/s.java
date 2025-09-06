package f8;

import a5.d;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import androidx.customview.view.AbsSavedState;

public final class s extends AbsSavedState {
    public static final Parcelable.Creator CREATOR;
    public CharSequence b;
    public boolean c;

    static {
        s.CREATOR = new d(9);
    }

    public s(Parcel parcel0, ClassLoader classLoader0) {
        super(parcel0, classLoader0);
        this.b = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel0);
        this.c = parcel0.readInt() == 1;
    }

    @Override
    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + this.b + "}";
    }

    @Override  // androidx.customview.view.AbsSavedState
    public final void writeToParcel(Parcel parcel0, int v) {
        super.writeToParcel(parcel0, v);
        TextUtils.writeToParcel(this.b, parcel0, v);
        parcel0.writeInt(((int)this.c));
    }
}

