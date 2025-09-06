package androidx.versionedparcelable;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import androidx.collection.ArrayMap;
import androidx.core.app.y;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;

public final class d extends VersionedParcel {
    public final DataInputStream a;
    public final DataOutputStream b;
    public final DataInputStream c;
    public DataOutputStream d;
    public y e;
    public boolean f;
    public int g;
    public int h;
    public int i;
    public static final Charset j;

    static {
        d.j = Charset.forName("UTF-16");
    }

    public d(InputStream inputStream0, OutputStream outputStream0) {
        this(inputStream0, outputStream0, new ArrayMap(), new ArrayMap(), new ArrayMap());
    }

    public d(InputStream inputStream0, OutputStream outputStream0, ArrayMap arrayMap0, ArrayMap arrayMap1, ArrayMap arrayMap2) {
        super(arrayMap0, arrayMap1, arrayMap2);
        this.g = 0;
        this.h = -1;
        this.i = -1;
        DataOutputStream dataOutputStream0 = null;
        DataInputStream dataInputStream0 = inputStream0 == null ? null : new DataInputStream(new c(this, inputStream0));
        this.a = dataInputStream0;
        if(outputStream0 != null) {
            dataOutputStream0 = new DataOutputStream(outputStream0);
        }
        this.b = dataOutputStream0;
        this.c = dataInputStream0;
        this.d = dataOutputStream0;
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public final void closeField() {
        y y0 = this.e;
        if(y0 != null) {
            try {
                if(((ByteArrayOutputStream)y0.b).size() != 0) {
                    y y1 = this.e;
                    ((DataOutputStream)y1.c).flush();
                    ByteArrayOutputStream byteArrayOutputStream0 = (ByteArrayOutputStream)y1.b;
                    int v = byteArrayOutputStream0.size();
                    DataOutputStream dataOutputStream0 = (DataOutputStream)y1.d;
                    dataOutputStream0.writeInt(y1.a << 16 | (v < 0xFFFF ? v : 0xFFFF));
                    if(v >= 0xFFFF) {
                        dataOutputStream0.writeInt(v);
                    }
                    byteArrayOutputStream0.writeTo(dataOutputStream0);
                }
                this.e = null;
            }
            catch(IOException iOException0) {
                throw new ParcelException(iOException0);
            }
        }
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public final VersionedParcel createSubParcel() {
        return new d(this.c, this.d, this.mReadCache, this.mWriteCache, this.mParcelizerCache);
    }

    public final void h(Object object0) {
        if(object0 == null) {
            this.writeInt(0);
            return;
        }
        if(object0 instanceof Bundle) {
            this.writeInt(1);
            this.writeBundle(((Bundle)object0));
            return;
        }
        if(object0 instanceof String) {
            this.writeInt(3);
            this.writeString(((String)object0));
            return;
        }
        if(object0 instanceof String[]) {
            this.writeInt(4);
            this.writeArray(((String[])object0));
            return;
        }
        if(object0 instanceof Boolean) {
            this.writeInt(5);
            this.writeBoolean(((Boolean)object0).booleanValue());
            return;
        }
        if(object0 instanceof boolean[]) {
            this.writeInt(6);
            this.writeBooleanArray(((boolean[])object0));
            return;
        }
        if(object0 instanceof Double) {
            this.writeInt(7);
            this.writeDouble(((double)(((Double)object0))));
            return;
        }
        if(object0 instanceof double[]) {
            this.writeInt(8);
            this.writeDoubleArray(((double[])object0));
            return;
        }
        if(object0 instanceof Integer) {
            this.writeInt(9);
            this.writeInt(((int)(((Integer)object0))));
            return;
        }
        if(object0 instanceof int[]) {
            this.writeInt(10);
            this.writeIntArray(((int[])object0));
            return;
        }
        if(object0 instanceof Long) {
            this.writeInt(11);
            this.writeLong(((long)(((Long)object0))));
            return;
        }
        if(object0 instanceof long[]) {
            this.writeInt(12);
            this.writeLongArray(((long[])object0));
            return;
        }
        if(object0 instanceof Float) {
            this.writeInt(13);
            this.writeFloat(((float)(((Float)object0))));
            return;
        }
        if(!(object0 instanceof float[])) {
            throw new IllegalArgumentException("Unsupported type " + object0.getClass());
        }
        this.writeInt(14);
        this.writeFloatArray(((float[])object0));
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public final boolean isStream() {
        return true;
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public final boolean readBoolean() {
        try {
            return this.c.readBoolean();
        }
        catch(IOException iOException0) {
            throw new ParcelException(iOException0);
        }
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public final Bundle readBundle() {
        int v = this.readInt();
        if(v < 0) {
            return null;
        }
        Bundle bundle0 = new Bundle();
        for(int v1 = 0; v1 < v; ++v1) {
            String s = this.readString();
            int v2 = this.readInt();
            switch(v2) {
                case 0: {
                    bundle0.putParcelable(s, null);
                    break;
                }
                case 1: {
                    bundle0.putBundle(s, this.readBundle());
                    break;
                }
                case 2: {
                    bundle0.putBundle(s, this.readBundle());
                    break;
                }
                case 3: {
                    bundle0.putString(s, this.readString());
                    break;
                }
                case 4: {
                    bundle0.putStringArray(s, ((String[])this.readArray(new String[0])));
                    break;
                }
                case 5: {
                    bundle0.putBoolean(s, this.readBoolean());
                    break;
                }
                case 6: {
                    bundle0.putBooleanArray(s, this.readBooleanArray());
                    break;
                }
                case 7: {
                    bundle0.putDouble(s, this.readDouble());
                    break;
                }
                case 8: {
                    bundle0.putDoubleArray(s, this.readDoubleArray());
                    break;
                }
                case 9: {
                    bundle0.putInt(s, this.readInt());
                    break;
                }
                case 10: {
                    bundle0.putIntArray(s, this.readIntArray());
                    break;
                }
                case 11: {
                    bundle0.putLong(s, this.readLong());
                    break;
                }
                case 12: {
                    bundle0.putLongArray(s, this.readLongArray());
                    break;
                }
                case 13: {
                    bundle0.putFloat(s, this.readFloat());
                    break;
                }
                case 14: {
                    bundle0.putFloatArray(s, this.readFloatArray());
                    break;
                }
                default: {
                    throw new RuntimeException("Unknown type " + v2);
                }
            }
        }
        return bundle0;
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public final byte[] readByteArray() {
        try {
            DataInputStream dataInputStream0 = this.c;
            int v = dataInputStream0.readInt();
            if(v > 0) {
                byte[] arr_b = new byte[v];
                dataInputStream0.readFully(arr_b);
                return arr_b;
            }
            return null;
        }
        catch(IOException iOException0) {
            throw new ParcelException(iOException0);
        }
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public final CharSequence readCharSequence() {
        return null;
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public final double readDouble() {
        try {
            return this.c.readDouble();
        }
        catch(IOException iOException0) {
            throw new ParcelException(iOException0);
        }
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public final boolean readField(int v) {
        try {
            while(true) {
                int v1 = this.h;
                if(v1 == v) {
                    return true;
                }
                if(String.valueOf(v1).compareTo(String.valueOf(v)) > 0) {
                    return false;
                }
                int v2 = this.g;
                int v3 = this.i;
                DataInputStream dataInputStream0 = this.a;
                if(v2 < v3) {
                    dataInputStream0.skip(((long)(v3 - v2)));
                }
                this.i = -1;
                int v4 = dataInputStream0.readInt();
                this.g = 0;
                int v5 = (v4 & 0xFFFF) == 0xFFFF ? dataInputStream0.readInt() : v4 & 0xFFFF;
                this.h = v4 >> 16 & 0xFFFF;
                this.i = v5;
            }
        }
        catch(IOException unused_ex) {
            return false;
        }
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public final float readFloat() {
        try {
            return this.c.readFloat();
        }
        catch(IOException iOException0) {
            throw new ParcelException(iOException0);
        }
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public final int readInt() {
        try {
            return this.c.readInt();
        }
        catch(IOException iOException0) {
            throw new ParcelException(iOException0);
        }
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public final long readLong() {
        try {
            return this.c.readLong();
        }
        catch(IOException iOException0) {
            throw new ParcelException(iOException0);
        }
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public final Parcelable readParcelable() {
        return null;
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public final String readString() {
        try {
            DataInputStream dataInputStream0 = this.c;
            int v = dataInputStream0.readInt();
            if(v > 0) {
                byte[] arr_b = new byte[v];
                dataInputStream0.readFully(arr_b);
                return new String(arr_b, d.j);
            }
            return null;
        }
        catch(IOException iOException0) {
            throw new ParcelException(iOException0);
        }
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public final IBinder readStrongBinder() {
        return null;
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public final void setOutputField(int v) {
        this.closeField();
        y y0 = new y(v, this.b);
        this.e = y0;
        this.d = (DataOutputStream)y0.c;
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public final void setSerializationFlags(boolean z, boolean z1) {
        if(!z) {
            throw new RuntimeException("Serialization of this object is not allowed");
        }
        this.f = z1;
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public final void writeBoolean(boolean z) {
        try {
            this.d.writeBoolean(z);
        }
        catch(IOException iOException0) {
            throw new ParcelException(iOException0);
        }
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public final void writeBundle(Bundle bundle0) {
        try {
            if(bundle0 == null) {
                this.d.writeInt(-1);
                return;
            }
            Set set0 = bundle0.keySet();
            this.d.writeInt(set0.size());
            Iterator iterator0 = set0.iterator();
            while(true) {
                if(!iterator0.hasNext()) {
                    return;
                }
                Object object0 = iterator0.next();
                this.writeString(((String)object0));
                this.h(bundle0.get(((String)object0)));
            }
        }
        catch(IOException iOException0) {
        }
        throw new ParcelException(iOException0);
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public final void writeByteArray(byte[] arr_b) {
        try {
            if(arr_b != null) {
                this.d.writeInt(arr_b.length);
                this.d.write(arr_b);
                return;
            }
            this.d.writeInt(-1);
            return;
        }
        catch(IOException iOException0) {
        }
        throw new ParcelException(iOException0);
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public final void writeByteArray(byte[] arr_b, int v, int v1) {
        try {
            if(arr_b != null) {
                this.d.writeInt(v1);
                this.d.write(arr_b, v, v1);
                return;
            }
            this.d.writeInt(-1);
            return;
        }
        catch(IOException iOException0) {
        }
        throw new ParcelException(iOException0);
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public final void writeCharSequence(CharSequence charSequence0) {
        if(!this.f) {
            throw new RuntimeException("CharSequence cannot be written to an OutputStream");
        }
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public final void writeDouble(double f) {
        try {
            this.d.writeDouble(f);
        }
        catch(IOException iOException0) {
            throw new ParcelException(iOException0);
        }
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public final void writeFloat(float f) {
        try {
            this.d.writeFloat(f);
        }
        catch(IOException iOException0) {
            throw new ParcelException(iOException0);
        }
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public final void writeInt(int v) {
        try {
            this.d.writeInt(v);
        }
        catch(IOException iOException0) {
            throw new ParcelException(iOException0);
        }
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public final void writeLong(long v) {
        try {
            this.d.writeLong(v);
        }
        catch(IOException iOException0) {
            throw new ParcelException(iOException0);
        }
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public final void writeParcelable(Parcelable parcelable0) {
        if(!this.f) {
            throw new RuntimeException("Parcelables cannot be written to an OutputStream");
        }
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public final void writeString(String s) {
        try {
            if(s != null) {
                byte[] arr_b = s.getBytes(d.j);
                this.d.writeInt(arr_b.length);
                this.d.write(arr_b);
                return;
            }
            this.d.writeInt(-1);
            return;
        }
        catch(IOException iOException0) {
        }
        throw new ParcelException(iOException0);
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public final void writeStrongBinder(IBinder iBinder0) {
        if(!this.f) {
            throw new RuntimeException("Binders cannot be written to an OutputStream");
        }
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public final void writeStrongInterface(IInterface iInterface0) {
        if(!this.f) {
            throw new RuntimeException("Binders cannot be written to an OutputStream");
        }
    }
}

