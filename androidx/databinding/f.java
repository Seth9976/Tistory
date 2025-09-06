package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class f implements Parcelable.Creator {
    public final int a;

    public f(int v) {
        this.a = v;
        super();
    }

    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        boolean z = true;
        switch(this.a) {
            case 0: {
                return new ObservableParcelable(parcel0.readParcelable(f.class.getClassLoader()));
            }
            case 1: {
                if(parcel0.readInt() != 1) {
                    z = false;
                }
                return new ObservableBoolean(z);
            }
            case 2: {
                return new ObservableByte(parcel0.readByte());
            }
            case 3: {
                return new ObservableChar(((char)parcel0.readInt()));
            }
            case 4: {
                return new ObservableDouble(parcel0.readDouble());
            }
            case 5: {
                return new ObservableFloat(parcel0.readFloat());
            }
            case 6: {
                return new ObservableInt(parcel0.readInt());
            }
            case 7: {
                return new ObservableLong(parcel0.readLong());
            }
            default: {
                return new ObservableShort(((short)parcel0.readInt()));
            }
        }
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        switch(this.a) {
            case 0: {
                return new ObservableParcelable[v];
            }
            case 1: {
                return new ObservableBoolean[v];
            }
            case 2: {
                return new ObservableByte[v];
            }
            case 3: {
                return new ObservableChar[v];
            }
            case 4: {
                return new ObservableDouble[v];
            }
            case 5: {
                return new ObservableFloat[v];
            }
            case 6: {
                return new ObservableInt[v];
            }
            case 7: {
                return new ObservableLong[v];
            }
            default: {
                return new ObservableShort[v];
            }
        }
    }
}

