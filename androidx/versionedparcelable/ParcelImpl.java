package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.m;

@SuppressLint({"BanParcelableUsage"})
@RestrictTo({Scope.LIBRARY})
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final VersionedParcelable a;

    static {
        ParcelImpl.CREATOR = new m(4);
    }

    public ParcelImpl(Parcel parcel0) {
        this.a = new b(parcel0).readVersionedParcelable();
    }

    public ParcelImpl(VersionedParcelable versionedParcelable0) {
        this.a = versionedParcelable0;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public VersionedParcelable getVersionedParcel() {
        return this.a;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        new b(parcel0).writeVersionedParcelable(this.a);
    }
}

