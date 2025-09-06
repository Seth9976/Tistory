package androidx.versionedparcelable;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.collection.ArrayMap;
import r0.a;

public final class b extends VersionedParcel {
    public final SparseIntArray a;
    public final Parcel b;
    public final int c;
    public final int d;
    public final String e;
    public int f;
    public int g;
    public int h;

    public b(Parcel parcel0) {
        this(parcel0, parcel0.dataPosition(), parcel0.dataSize(), "", new ArrayMap(), new ArrayMap(), new ArrayMap());
    }

    public b(Parcel parcel0, int v, int v1, String s, ArrayMap arrayMap0, ArrayMap arrayMap1, ArrayMap arrayMap2) {
        super(arrayMap0, arrayMap1, arrayMap2);
        this.a = new SparseIntArray();
        this.f = -1;
        this.h = -1;
        this.b = parcel0;
        this.c = v;
        this.d = v1;
        this.g = v;
        this.e = s;
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public final void closeField() {
        int v = this.f;
        if(v >= 0) {
            int v1 = this.a.get(v);
            int v2 = this.b.dataPosition();
            this.b.setDataPosition(v1);
            this.b.writeInt(v2 - v1);
            this.b.setDataPosition(v2);
        }
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public final VersionedParcel createSubParcel() {
        int v = this.b.dataPosition();
        return new b(this.b, v, (this.g == this.c ? this.d : this.g), a.o(new StringBuilder(), this.e, "  "), this.mReadCache, this.mWriteCache, this.mParcelizerCache);
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public final boolean readBoolean() {
        return this.b.readInt() != 0;
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public final Bundle readBundle() {
        return this.b.readBundle(b.class.getClassLoader());
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public final byte[] readByteArray() {
        Parcel parcel0 = this.b;
        int v = parcel0.readInt();
        if(v < 0) {
            return null;
        }
        byte[] arr_b = new byte[v];
        parcel0.readByteArray(arr_b);
        return arr_b;
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public final CharSequence readCharSequence() {
        return (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.b);
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public final double readDouble() {
        return this.b.readDouble();
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public final boolean readField(int v) {
        boolean z;
        while(this.g < this.d) {
            int v1 = this.h;
            if(v1 == v) {
                return true;
            }
            if(String.valueOf(v1).compareTo(String.valueOf(v)) > 0) {
                return false;
            }
            z = false;
            this.b.setDataPosition(this.g);
            int v2 = this.b.readInt();
            this.h = this.b.readInt();
            this.g += v2;
        }
        return this.h == v ? true : z;
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public final float readFloat() {
        return this.b.readFloat();
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public final int readInt() {
        return this.b.readInt();
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public final long readLong() {
        return this.b.readLong();
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public final Parcelable readParcelable() {
        return this.b.readParcelable(b.class.getClassLoader());
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public final String readString() {
        return this.b.readString();
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public final IBinder readStrongBinder() {
        return this.b.readStrongBinder();
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public final void setOutputField(int v) {
        this.closeField();
        this.f = v;
        int v1 = this.b.dataPosition();
        this.a.put(v, v1);
        this.writeInt(0);
        this.writeInt(v);
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public final void writeBoolean(boolean z) {
        this.b.writeInt(((int)z));
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public final void writeBundle(Bundle bundle0) {
        this.b.writeBundle(bundle0);
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public final void writeByteArray(byte[] arr_b) {
        Parcel parcel0 = this.b;
        if(arr_b != null) {
            parcel0.writeInt(arr_b.length);
            parcel0.writeByteArray(arr_b);
            return;
        }
        parcel0.writeInt(-1);
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public final void writeByteArray(byte[] arr_b, int v, int v1) {
        Parcel parcel0 = this.b;
        if(arr_b != null) {
            parcel0.writeInt(arr_b.length);
            parcel0.writeByteArray(arr_b, v, v1);
            return;
        }
        parcel0.writeInt(-1);
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public final void writeCharSequence(CharSequence charSequence0) {
        TextUtils.writeToParcel(charSequence0, this.b, 0);
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public final void writeDouble(double f) {
        this.b.writeDouble(f);
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public final void writeFloat(float f) {
        this.b.writeFloat(f);
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public final void writeInt(int v) {
        this.b.writeInt(v);
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public final void writeLong(long v) {
        this.b.writeLong(v);
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public final void writeParcelable(Parcelable parcelable0) {
        this.b.writeParcelable(parcelable0, 0);
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public final void writeString(String s) {
        this.b.writeString(s);
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public final void writeStrongBinder(IBinder iBinder0) {
        this.b.writeStrongBinder(iBinder0);
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public final void writeStrongInterface(IInterface iInterface0) {
        this.b.writeStrongInterface(iInterface0);
    }
}

