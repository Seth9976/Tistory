package com.google.android.gms.common.internal.safeparcel;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import androidx.annotation.NonNull;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

public class SafeParcelWriter {
    public static int a(Parcel parcel0, int v) {
        parcel0.writeInt(v | 0xFFFF0000);
        parcel0.writeInt(0);
        return parcel0.dataPosition();
    }

    public static void b(Parcel parcel0, int v) {
        int v1 = parcel0.dataPosition();
        parcel0.setDataPosition(v - 4);
        parcel0.writeInt(v1 - v);
        parcel0.setDataPosition(v1);
    }

    public static int beginObjectHeader(@NonNull Parcel parcel0) {
        return SafeParcelWriter.a(parcel0, 0x4F45);
    }

    public static void c(Parcel parcel0, int v, int v1) {
        parcel0.writeInt(v | v1 << 16);
    }

    public static void d(Parcel parcel0, Parcelable parcelable0, int v) {
        int v1 = parcel0.dataPosition();
        parcel0.writeInt(1);
        int v2 = parcel0.dataPosition();
        parcelable0.writeToParcel(parcel0, v);
        int v3 = parcel0.dataPosition();
        parcel0.setDataPosition(v1);
        parcel0.writeInt(v3 - v2);
        parcel0.setDataPosition(v3);
    }

    public static void finishObjectHeader(@NonNull Parcel parcel0, int v) {
        SafeParcelWriter.b(parcel0, v);
    }

    public static void writeBigDecimal(@NonNull Parcel parcel0, int v, @NonNull BigDecimal bigDecimal0, boolean z) {
        if(bigDecimal0 == null) {
            if(z) {
                SafeParcelWriter.c(parcel0, v, 0);
            }
            return;
        }
        int v1 = SafeParcelWriter.a(parcel0, v);
        parcel0.writeByteArray(bigDecimal0.unscaledValue().toByteArray());
        parcel0.writeInt(bigDecimal0.scale());
        SafeParcelWriter.b(parcel0, v1);
    }

    public static void writeBigDecimalArray(@NonNull Parcel parcel0, int v, @NonNull BigDecimal[] arr_bigDecimal, boolean z) {
        if(arr_bigDecimal == null) {
            if(z) {
                SafeParcelWriter.c(parcel0, v, 0);
            }
            return;
        }
        int v2 = SafeParcelWriter.a(parcel0, v);
        parcel0.writeInt(arr_bigDecimal.length);
        for(int v1 = 0; v1 < arr_bigDecimal.length; ++v1) {
            parcel0.writeByteArray(arr_bigDecimal[v1].unscaledValue().toByteArray());
            parcel0.writeInt(arr_bigDecimal[v1].scale());
        }
        SafeParcelWriter.b(parcel0, v2);
    }

    public static void writeBigInteger(@NonNull Parcel parcel0, int v, @NonNull BigInteger bigInteger0, boolean z) {
        if(bigInteger0 == null) {
            if(z) {
                SafeParcelWriter.c(parcel0, v, 0);
            }
            return;
        }
        int v1 = SafeParcelWriter.a(parcel0, v);
        parcel0.writeByteArray(bigInteger0.toByteArray());
        SafeParcelWriter.b(parcel0, v1);
    }

    public static void writeBigIntegerArray(@NonNull Parcel parcel0, int v, @NonNull BigInteger[] arr_bigInteger, boolean z) {
        if(arr_bigInteger == null) {
            if(z) {
                SafeParcelWriter.c(parcel0, v, 0);
            }
            return;
        }
        int v2 = SafeParcelWriter.a(parcel0, v);
        parcel0.writeInt(arr_bigInteger.length);
        for(int v1 = 0; v1 < arr_bigInteger.length; ++v1) {
            parcel0.writeByteArray(arr_bigInteger[v1].toByteArray());
        }
        SafeParcelWriter.b(parcel0, v2);
    }

    public static void writeBoolean(@NonNull Parcel parcel0, int v, boolean z) {
        SafeParcelWriter.c(parcel0, v, 4);
        parcel0.writeInt(((int)z));
    }

    public static void writeBooleanArray(@NonNull Parcel parcel0, int v, @NonNull boolean[] arr_z, boolean z) {
        if(arr_z == null) {
            if(z) {
                SafeParcelWriter.c(parcel0, v, 0);
            }
            return;
        }
        int v1 = SafeParcelWriter.a(parcel0, v);
        parcel0.writeBooleanArray(arr_z);
        SafeParcelWriter.b(parcel0, v1);
    }

    public static void writeBooleanList(@NonNull Parcel parcel0, int v, @NonNull List list0, boolean z) {
        if(list0 == null) {
            if(z) {
                SafeParcelWriter.c(parcel0, v, 0);
            }
            return;
        }
        int v2 = SafeParcelWriter.a(parcel0, v);
        int v3 = list0.size();
        parcel0.writeInt(v3);
        for(int v1 = 0; v1 < v3; ++v1) {
            parcel0.writeInt(((int)((Boolean)list0.get(v1)).booleanValue()));
        }
        SafeParcelWriter.b(parcel0, v2);
    }

    public static void writeBooleanObject(@NonNull Parcel parcel0, int v, @NonNull Boolean boolean0, boolean z) {
        if(boolean0 == null) {
            if(z) {
                SafeParcelWriter.c(parcel0, v, 0);
            }
            return;
        }
        SafeParcelWriter.c(parcel0, v, 4);
        parcel0.writeInt(((int)boolean0.booleanValue()));
    }

    public static void writeBundle(@NonNull Parcel parcel0, int v, @NonNull Bundle bundle0, boolean z) {
        if(bundle0 == null) {
            if(z) {
                SafeParcelWriter.c(parcel0, v, 0);
            }
            return;
        }
        int v1 = SafeParcelWriter.a(parcel0, v);
        parcel0.writeBundle(bundle0);
        SafeParcelWriter.b(parcel0, v1);
    }

    public static void writeByte(@NonNull Parcel parcel0, int v, byte b) {
        SafeParcelWriter.c(parcel0, v, 4);
        parcel0.writeInt(((int)b));
    }

    public static void writeByteArray(@NonNull Parcel parcel0, int v, @NonNull byte[] arr_b, boolean z) {
        if(arr_b == null) {
            if(z) {
                SafeParcelWriter.c(parcel0, v, 0);
            }
            return;
        }
        int v1 = SafeParcelWriter.a(parcel0, v);
        parcel0.writeByteArray(arr_b);
        SafeParcelWriter.b(parcel0, v1);
    }

    public static void writeByteArrayArray(@NonNull Parcel parcel0, int v, @NonNull byte[][] arr2_b, boolean z) {
        if(arr2_b == null) {
            if(z) {
                SafeParcelWriter.c(parcel0, v, 0);
            }
            return;
        }
        int v2 = SafeParcelWriter.a(parcel0, v);
        parcel0.writeInt(arr2_b.length);
        for(int v1 = 0; v1 < arr2_b.length; ++v1) {
            parcel0.writeByteArray(arr2_b[v1]);
        }
        SafeParcelWriter.b(parcel0, v2);
    }

    public static void writeByteArraySparseArray(@NonNull Parcel parcel0, int v, @NonNull SparseArray sparseArray0, boolean z) {
        if(sparseArray0 == null) {
            if(z) {
                SafeParcelWriter.c(parcel0, v, 0);
            }
            return;
        }
        int v2 = SafeParcelWriter.a(parcel0, v);
        int v3 = sparseArray0.size();
        parcel0.writeInt(v3);
        for(int v1 = 0; v1 < v3; ++v1) {
            parcel0.writeInt(sparseArray0.keyAt(v1));
            parcel0.writeByteArray(((byte[])sparseArray0.valueAt(v1)));
        }
        SafeParcelWriter.b(parcel0, v2);
    }

    public static void writeChar(@NonNull Parcel parcel0, int v, char c) {
        SafeParcelWriter.c(parcel0, v, 4);
        parcel0.writeInt(((int)c));
    }

    public static void writeCharArray(@NonNull Parcel parcel0, int v, @NonNull char[] arr_c, boolean z) {
        if(arr_c == null) {
            if(z) {
                SafeParcelWriter.c(parcel0, v, 0);
            }
            return;
        }
        int v1 = SafeParcelWriter.a(parcel0, v);
        parcel0.writeCharArray(arr_c);
        SafeParcelWriter.b(parcel0, v1);
    }

    public static void writeDouble(@NonNull Parcel parcel0, int v, double f) {
        SafeParcelWriter.c(parcel0, v, 8);
        parcel0.writeDouble(f);
    }

    public static void writeDoubleArray(@NonNull Parcel parcel0, int v, @NonNull double[] arr_f, boolean z) {
        if(arr_f == null) {
            if(z) {
                SafeParcelWriter.c(parcel0, v, 0);
            }
            return;
        }
        int v1 = SafeParcelWriter.a(parcel0, v);
        parcel0.writeDoubleArray(arr_f);
        SafeParcelWriter.b(parcel0, v1);
    }

    public static void writeDoubleList(@NonNull Parcel parcel0, int v, @NonNull List list0, boolean z) {
        if(list0 == null) {
            if(z) {
                SafeParcelWriter.c(parcel0, v, 0);
            }
            return;
        }
        int v2 = SafeParcelWriter.a(parcel0, v);
        int v3 = list0.size();
        parcel0.writeInt(v3);
        for(int v1 = 0; v1 < v3; ++v1) {
            parcel0.writeDouble(((double)(((Double)list0.get(v1)))));
        }
        SafeParcelWriter.b(parcel0, v2);
    }

    public static void writeDoubleObject(@NonNull Parcel parcel0, int v, @NonNull Double double0, boolean z) {
        if(double0 == null) {
            if(z) {
                SafeParcelWriter.c(parcel0, v, 0);
            }
            return;
        }
        SafeParcelWriter.c(parcel0, v, 8);
        parcel0.writeDouble(((double)double0));
    }

    public static void writeDoubleSparseArray(@NonNull Parcel parcel0, int v, @NonNull SparseArray sparseArray0, boolean z) {
        if(sparseArray0 == null) {
            if(z) {
                SafeParcelWriter.c(parcel0, v, 0);
            }
            return;
        }
        int v2 = SafeParcelWriter.a(parcel0, v);
        int v3 = sparseArray0.size();
        parcel0.writeInt(v3);
        for(int v1 = 0; v1 < v3; ++v1) {
            parcel0.writeInt(sparseArray0.keyAt(v1));
            parcel0.writeDouble(((double)(((Double)sparseArray0.valueAt(v1)))));
        }
        SafeParcelWriter.b(parcel0, v2);
    }

    public static void writeFloat(@NonNull Parcel parcel0, int v, float f) {
        SafeParcelWriter.c(parcel0, v, 4);
        parcel0.writeFloat(f);
    }

    public static void writeFloatArray(@NonNull Parcel parcel0, int v, @NonNull float[] arr_f, boolean z) {
        if(arr_f == null) {
            if(z) {
                SafeParcelWriter.c(parcel0, v, 0);
            }
            return;
        }
        int v1 = SafeParcelWriter.a(parcel0, v);
        parcel0.writeFloatArray(arr_f);
        SafeParcelWriter.b(parcel0, v1);
    }

    public static void writeFloatList(@NonNull Parcel parcel0, int v, @NonNull List list0, boolean z) {
        if(list0 == null) {
            if(z) {
                SafeParcelWriter.c(parcel0, v, 0);
            }
            return;
        }
        int v2 = SafeParcelWriter.a(parcel0, v);
        int v3 = list0.size();
        parcel0.writeInt(v3);
        for(int v1 = 0; v1 < v3; ++v1) {
            parcel0.writeFloat(((float)(((Float)list0.get(v1)))));
        }
        SafeParcelWriter.b(parcel0, v2);
    }

    public static void writeFloatObject(@NonNull Parcel parcel0, int v, @NonNull Float float0, boolean z) {
        if(float0 == null) {
            if(z) {
                SafeParcelWriter.c(parcel0, v, 0);
            }
            return;
        }
        SafeParcelWriter.c(parcel0, v, 4);
        parcel0.writeFloat(((float)float0));
    }

    public static void writeFloatSparseArray(@NonNull Parcel parcel0, int v, @NonNull SparseArray sparseArray0, boolean z) {
        if(sparseArray0 == null) {
            if(z) {
                SafeParcelWriter.c(parcel0, v, 0);
            }
            return;
        }
        int v2 = SafeParcelWriter.a(parcel0, v);
        int v3 = sparseArray0.size();
        parcel0.writeInt(v3);
        for(int v1 = 0; v1 < v3; ++v1) {
            parcel0.writeInt(sparseArray0.keyAt(v1));
            parcel0.writeFloat(((float)(((Float)sparseArray0.valueAt(v1)))));
        }
        SafeParcelWriter.b(parcel0, v2);
    }

    public static void writeIBinder(@NonNull Parcel parcel0, int v, @NonNull IBinder iBinder0, boolean z) {
        if(iBinder0 == null) {
            if(z) {
                SafeParcelWriter.c(parcel0, v, 0);
            }
            return;
        }
        int v1 = SafeParcelWriter.a(parcel0, v);
        parcel0.writeStrongBinder(iBinder0);
        SafeParcelWriter.b(parcel0, v1);
    }

    public static void writeIBinderArray(@NonNull Parcel parcel0, int v, @NonNull IBinder[] arr_iBinder, boolean z) {
        if(arr_iBinder == null) {
            if(z) {
                SafeParcelWriter.c(parcel0, v, 0);
            }
            return;
        }
        int v1 = SafeParcelWriter.a(parcel0, v);
        parcel0.writeBinderArray(arr_iBinder);
        SafeParcelWriter.b(parcel0, v1);
    }

    public static void writeIBinderList(@NonNull Parcel parcel0, int v, @NonNull List list0, boolean z) {
        if(list0 == null) {
            if(z) {
                SafeParcelWriter.c(parcel0, v, 0);
            }
            return;
        }
        int v1 = SafeParcelWriter.a(parcel0, v);
        parcel0.writeBinderList(list0);
        SafeParcelWriter.b(parcel0, v1);
    }

    public static void writeIBinderSparseArray(@NonNull Parcel parcel0, int v, @NonNull SparseArray sparseArray0, boolean z) {
        if(sparseArray0 == null) {
            if(z) {
                SafeParcelWriter.c(parcel0, v, 0);
            }
            return;
        }
        int v2 = SafeParcelWriter.a(parcel0, v);
        int v3 = sparseArray0.size();
        parcel0.writeInt(v3);
        for(int v1 = 0; v1 < v3; ++v1) {
            parcel0.writeInt(sparseArray0.keyAt(v1));
            parcel0.writeStrongBinder(((IBinder)sparseArray0.valueAt(v1)));
        }
        SafeParcelWriter.b(parcel0, v2);
    }

    public static void writeInt(@NonNull Parcel parcel0, int v, int v1) {
        SafeParcelWriter.c(parcel0, v, 4);
        parcel0.writeInt(v1);
    }

    public static void writeIntArray(@NonNull Parcel parcel0, int v, @NonNull int[] arr_v, boolean z) {
        if(arr_v == null) {
            if(z) {
                SafeParcelWriter.c(parcel0, v, 0);
            }
            return;
        }
        int v1 = SafeParcelWriter.a(parcel0, v);
        parcel0.writeIntArray(arr_v);
        SafeParcelWriter.b(parcel0, v1);
    }

    public static void writeIntegerList(@NonNull Parcel parcel0, int v, @NonNull List list0, boolean z) {
        if(list0 == null) {
            if(z) {
                SafeParcelWriter.c(parcel0, v, 0);
            }
            return;
        }
        int v2 = SafeParcelWriter.a(parcel0, v);
        int v3 = list0.size();
        parcel0.writeInt(v3);
        for(int v1 = 0; v1 < v3; ++v1) {
            parcel0.writeInt(((int)(((Integer)list0.get(v1)))));
        }
        SafeParcelWriter.b(parcel0, v2);
    }

    public static void writeIntegerObject(@NonNull Parcel parcel0, int v, @NonNull Integer integer0, boolean z) {
        if(integer0 == null) {
            if(z) {
                SafeParcelWriter.c(parcel0, v, 0);
            }
            return;
        }
        SafeParcelWriter.c(parcel0, v, 4);
        parcel0.writeInt(((int)integer0));
    }

    public static void writeList(@NonNull Parcel parcel0, int v, @NonNull List list0, boolean z) {
        if(list0 == null) {
            if(z) {
                SafeParcelWriter.c(parcel0, v, 0);
            }
            return;
        }
        int v1 = SafeParcelWriter.a(parcel0, v);
        parcel0.writeList(list0);
        SafeParcelWriter.b(parcel0, v1);
    }

    public static void writeLong(@NonNull Parcel parcel0, int v, long v1) {
        SafeParcelWriter.c(parcel0, v, 8);
        parcel0.writeLong(v1);
    }

    public static void writeLongArray(@NonNull Parcel parcel0, int v, @NonNull long[] arr_v, boolean z) {
        if(arr_v == null) {
            if(z) {
                SafeParcelWriter.c(parcel0, v, 0);
            }
            return;
        }
        int v1 = SafeParcelWriter.a(parcel0, v);
        parcel0.writeLongArray(arr_v);
        SafeParcelWriter.b(parcel0, v1);
    }

    public static void writeLongList(@NonNull Parcel parcel0, int v, @NonNull List list0, boolean z) {
        if(list0 == null) {
            if(z) {
                SafeParcelWriter.c(parcel0, v, 0);
            }
            return;
        }
        int v2 = SafeParcelWriter.a(parcel0, v);
        int v3 = list0.size();
        parcel0.writeInt(v3);
        for(int v1 = 0; v1 < v3; ++v1) {
            parcel0.writeLong(((long)(((Long)list0.get(v1)))));
        }
        SafeParcelWriter.b(parcel0, v2);
    }

    public static void writeLongObject(@NonNull Parcel parcel0, int v, @NonNull Long long0, boolean z) {
        if(long0 == null) {
            if(z) {
                SafeParcelWriter.c(parcel0, v, 0);
            }
            return;
        }
        SafeParcelWriter.c(parcel0, v, 8);
        parcel0.writeLong(((long)long0));
    }

    public static void writeParcel(@NonNull Parcel parcel0, int v, @NonNull Parcel parcel1, boolean z) {
        if(parcel1 == null) {
            if(z) {
                SafeParcelWriter.c(parcel0, v, 0);
            }
            return;
        }
        int v1 = SafeParcelWriter.a(parcel0, v);
        parcel0.appendFrom(parcel1, 0, parcel1.dataSize());
        SafeParcelWriter.b(parcel0, v1);
    }

    public static void writeParcelArray(@NonNull Parcel parcel0, int v, @NonNull Parcel[] arr_parcel, boolean z) {
        if(arr_parcel == null) {
            if(z) {
                SafeParcelWriter.c(parcel0, v, 0);
            }
            return;
        }
        int v1 = SafeParcelWriter.a(parcel0, v);
        parcel0.writeInt(arr_parcel.length);
        for(int v2 = 0; v2 < arr_parcel.length; ++v2) {
            Parcel parcel1 = arr_parcel[v2];
            if(parcel1 == null) {
                parcel0.writeInt(0);
            }
            else {
                parcel0.writeInt(parcel1.dataSize());
                parcel0.appendFrom(parcel1, 0, parcel1.dataSize());
            }
        }
        SafeParcelWriter.b(parcel0, v1);
    }

    public static void writeParcelList(@NonNull Parcel parcel0, int v, @NonNull List list0, boolean z) {
        if(list0 == null) {
            if(z) {
                SafeParcelWriter.c(parcel0, v, 0);
            }
            return;
        }
        int v1 = SafeParcelWriter.a(parcel0, v);
        int v2 = list0.size();
        parcel0.writeInt(v2);
        for(int v3 = 0; v3 < v2; ++v3) {
            Parcel parcel1 = (Parcel)list0.get(v3);
            if(parcel1 == null) {
                parcel0.writeInt(0);
            }
            else {
                parcel0.writeInt(parcel1.dataSize());
                parcel0.appendFrom(parcel1, 0, parcel1.dataSize());
            }
        }
        SafeParcelWriter.b(parcel0, v1);
    }

    public static void writeParcelSparseArray(@NonNull Parcel parcel0, int v, @NonNull SparseArray sparseArray0, boolean z) {
        if(sparseArray0 == null) {
            if(z) {
                SafeParcelWriter.c(parcel0, v, 0);
            }
            return;
        }
        int v1 = SafeParcelWriter.a(parcel0, v);
        int v2 = sparseArray0.size();
        parcel0.writeInt(v2);
        for(int v3 = 0; v3 < v2; ++v3) {
            parcel0.writeInt(sparseArray0.keyAt(v3));
            Parcel parcel1 = (Parcel)sparseArray0.valueAt(v3);
            if(parcel1 == null) {
                parcel0.writeInt(0);
            }
            else {
                parcel0.writeInt(parcel1.dataSize());
                parcel0.appendFrom(parcel1, 0, parcel1.dataSize());
            }
        }
        SafeParcelWriter.b(parcel0, v1);
    }

    public static void writeParcelable(@NonNull Parcel parcel0, int v, @NonNull Parcelable parcelable0, int v1, boolean z) {
        if(parcelable0 == null) {
            if(z) {
                SafeParcelWriter.c(parcel0, v, 0);
            }
            return;
        }
        int v2 = SafeParcelWriter.a(parcel0, v);
        parcelable0.writeToParcel(parcel0, v1);
        SafeParcelWriter.b(parcel0, v2);
    }

    public static void writePendingIntent(@NonNull Parcel parcel0, int v, @NonNull PendingIntent pendingIntent0, boolean z) {
        if(pendingIntent0 == null) {
            if(z) {
                SafeParcelWriter.c(parcel0, v, 0);
            }
            return;
        }
        int v1 = SafeParcelWriter.a(parcel0, v);
        PendingIntent.writePendingIntentOrNullToParcel(pendingIntent0, parcel0);
        SafeParcelWriter.b(parcel0, v1);
    }

    public static void writeShort(@NonNull Parcel parcel0, int v, short v1) {
        SafeParcelWriter.c(parcel0, v, 4);
        parcel0.writeInt(((int)v1));
    }

    public static void writeSparseBooleanArray(@NonNull Parcel parcel0, int v, @NonNull SparseBooleanArray sparseBooleanArray0, boolean z) {
        if(sparseBooleanArray0 == null) {
            if(z) {
                SafeParcelWriter.c(parcel0, v, 0);
            }
            return;
        }
        int v1 = SafeParcelWriter.a(parcel0, v);
        parcel0.writeSparseBooleanArray(sparseBooleanArray0);
        SafeParcelWriter.b(parcel0, v1);
    }

    public static void writeSparseIntArray(@NonNull Parcel parcel0, int v, @NonNull SparseIntArray sparseIntArray0, boolean z) {
        if(sparseIntArray0 == null) {
            if(z) {
                SafeParcelWriter.c(parcel0, v, 0);
            }
            return;
        }
        int v2 = SafeParcelWriter.a(parcel0, v);
        int v3 = sparseIntArray0.size();
        parcel0.writeInt(v3);
        for(int v1 = 0; v1 < v3; ++v1) {
            parcel0.writeInt(sparseIntArray0.keyAt(v1));
            parcel0.writeInt(sparseIntArray0.valueAt(v1));
        }
        SafeParcelWriter.b(parcel0, v2);
    }

    public static void writeSparseLongArray(@NonNull Parcel parcel0, int v, @NonNull SparseLongArray sparseLongArray0, boolean z) {
        if(sparseLongArray0 == null) {
            if(z) {
                SafeParcelWriter.c(parcel0, v, 0);
            }
            return;
        }
        int v2 = SafeParcelWriter.a(parcel0, v);
        int v3 = sparseLongArray0.size();
        parcel0.writeInt(v3);
        for(int v1 = 0; v1 < v3; ++v1) {
            parcel0.writeInt(sparseLongArray0.keyAt(v1));
            parcel0.writeLong(sparseLongArray0.valueAt(v1));
        }
        SafeParcelWriter.b(parcel0, v2);
    }

    public static void writeString(@NonNull Parcel parcel0, int v, @NonNull String s, boolean z) {
        if(s == null) {
            if(z) {
                SafeParcelWriter.c(parcel0, v, 0);
            }
            return;
        }
        int v1 = SafeParcelWriter.a(parcel0, v);
        parcel0.writeString(s);
        SafeParcelWriter.b(parcel0, v1);
    }

    public static void writeStringArray(@NonNull Parcel parcel0, int v, @NonNull String[] arr_s, boolean z) {
        if(arr_s == null) {
            if(z) {
                SafeParcelWriter.c(parcel0, v, 0);
            }
            return;
        }
        int v1 = SafeParcelWriter.a(parcel0, v);
        parcel0.writeStringArray(arr_s);
        SafeParcelWriter.b(parcel0, v1);
    }

    public static void writeStringList(@NonNull Parcel parcel0, int v, @NonNull List list0, boolean z) {
        if(list0 == null) {
            if(z) {
                SafeParcelWriter.c(parcel0, v, 0);
            }
            return;
        }
        int v1 = SafeParcelWriter.a(parcel0, v);
        parcel0.writeStringList(list0);
        SafeParcelWriter.b(parcel0, v1);
    }

    public static void writeStringSparseArray(@NonNull Parcel parcel0, int v, @NonNull SparseArray sparseArray0, boolean z) {
        if(sparseArray0 == null) {
            if(z) {
                SafeParcelWriter.c(parcel0, v, 0);
            }
            return;
        }
        int v2 = SafeParcelWriter.a(parcel0, v);
        int v3 = sparseArray0.size();
        parcel0.writeInt(v3);
        for(int v1 = 0; v1 < v3; ++v1) {
            parcel0.writeInt(sparseArray0.keyAt(v1));
            parcel0.writeString(((String)sparseArray0.valueAt(v1)));
        }
        SafeParcelWriter.b(parcel0, v2);
    }

    public static void writeTypedArray(@NonNull Parcel parcel0, int v, @NonNull Parcelable[] arr_parcelable, int v1, boolean z) {
        if(arr_parcelable == null) {
            if(z) {
                SafeParcelWriter.c(parcel0, v, 0);
            }
            return;
        }
        int v2 = SafeParcelWriter.a(parcel0, v);
        parcel0.writeInt(arr_parcelable.length);
        for(int v3 = 0; v3 < arr_parcelable.length; ++v3) {
            Parcelable parcelable0 = arr_parcelable[v3];
            if(parcelable0 == null) {
                parcel0.writeInt(0);
            }
            else {
                SafeParcelWriter.d(parcel0, parcelable0, v1);
            }
        }
        SafeParcelWriter.b(parcel0, v2);
    }

    public static void writeTypedList(@NonNull Parcel parcel0, int v, @NonNull List list0, boolean z) {
        if(list0 == null) {
            if(z) {
                SafeParcelWriter.c(parcel0, v, 0);
            }
            return;
        }
        int v1 = SafeParcelWriter.a(parcel0, v);
        int v2 = list0.size();
        parcel0.writeInt(v2);
        for(int v3 = 0; v3 < v2; ++v3) {
            Parcelable parcelable0 = (Parcelable)list0.get(v3);
            if(parcelable0 == null) {
                parcel0.writeInt(0);
            }
            else {
                SafeParcelWriter.d(parcel0, parcelable0, 0);
            }
        }
        SafeParcelWriter.b(parcel0, v1);
    }

    public static void writeTypedSparseArray(@NonNull Parcel parcel0, int v, @NonNull SparseArray sparseArray0, boolean z) {
        if(sparseArray0 == null) {
            if(z) {
                SafeParcelWriter.c(parcel0, v, 0);
            }
            return;
        }
        int v1 = SafeParcelWriter.a(parcel0, v);
        int v2 = sparseArray0.size();
        parcel0.writeInt(v2);
        for(int v3 = 0; v3 < v2; ++v3) {
            parcel0.writeInt(sparseArray0.keyAt(v3));
            Parcelable parcelable0 = (Parcelable)sparseArray0.valueAt(v3);
            if(parcelable0 == null) {
                parcel0.writeInt(0);
            }
            else {
                SafeParcelWriter.d(parcel0, parcelable0, 0);
            }
        }
        SafeParcelWriter.b(parcel0, v1);
    }
}

