package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;

@RestrictTo({Scope.LIBRARY})
public class IconCompatParcelizer {
    public static IconCompat read(VersionedParcel versionedParcel0) {
        IconCompat iconCompat0 = new IconCompat();
        iconCompat0.mType = versionedParcel0.readInt(iconCompat0.mType, 1);
        iconCompat0.mData = versionedParcel0.readByteArray(iconCompat0.mData, 2);
        iconCompat0.mParcelable = versionedParcel0.readParcelable(iconCompat0.mParcelable, 3);
        iconCompat0.mInt1 = versionedParcel0.readInt(iconCompat0.mInt1, 4);
        iconCompat0.mInt2 = versionedParcel0.readInt(iconCompat0.mInt2, 5);
        iconCompat0.mTintList = (ColorStateList)versionedParcel0.readParcelable(iconCompat0.mTintList, 6);
        iconCompat0.mTintModeStr = versionedParcel0.readString(iconCompat0.mTintModeStr, 7);
        iconCompat0.mString1 = versionedParcel0.readString(iconCompat0.mString1, 8);
        iconCompat0.onPostParceling();
        return iconCompat0;
    }

    public static void write(IconCompat iconCompat0, VersionedParcel versionedParcel0) {
        versionedParcel0.setSerializationFlags(true, true);
        iconCompat0.onPreParceling(versionedParcel0.isStream());
        int v = iconCompat0.mType;
        if(-1 != v) {
            versionedParcel0.writeInt(v, 1);
        }
        byte[] arr_b = iconCompat0.mData;
        if(arr_b != null) {
            versionedParcel0.writeByteArray(arr_b, 2);
        }
        Parcelable parcelable0 = iconCompat0.mParcelable;
        if(parcelable0 != null) {
            versionedParcel0.writeParcelable(parcelable0, 3);
        }
        int v1 = iconCompat0.mInt1;
        if(v1 != 0) {
            versionedParcel0.writeInt(v1, 4);
        }
        int v2 = iconCompat0.mInt2;
        if(v2 != 0) {
            versionedParcel0.writeInt(v2, 5);
        }
        ColorStateList colorStateList0 = iconCompat0.mTintList;
        if(colorStateList0 != null) {
            versionedParcel0.writeParcelable(colorStateList0, 6);
        }
        String s = iconCompat0.mTintModeStr;
        if(s != null) {
            versionedParcel0.writeString(s, 7);
        }
        String s1 = iconCompat0.mString1;
        if(s1 != null) {
            versionedParcel0.writeString(s1, 8);
        }
    }
}

