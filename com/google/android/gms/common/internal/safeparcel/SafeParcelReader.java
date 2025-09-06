package com.google.android.gms.common.internal.safeparcel;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import androidx.annotation.NonNull;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.q;
import r0.a;

public class SafeParcelReader {
    public static class ParseException extends RuntimeException {
        public ParseException(@NonNull String s, @NonNull Parcel parcel0) {
            super(s + " Parcel: pos=" + parcel0.dataPosition() + " size=" + parcel0.dataSize());
        }
    }

    public static void a(Parcel parcel0, int v, int v1) {
        if(v != v1) {
            throw new ParseException(a.o(q.u("Expected size ", v1, " got ", v, " (0x"), Integer.toHexString(v), ")"), parcel0);
        }
    }

    public static void b(Parcel parcel0, int v, int v1) {
        int v2 = SafeParcelReader.readSize(parcel0, v);
        if(v2 != v1) {
            throw new ParseException(a.o(q.u("Expected size ", v1, " got ", v2, " (0x"), Integer.toHexString(v2), ")"), parcel0);
        }
    }

    @NonNull
    public static BigDecimal createBigDecimal(@NonNull Parcel parcel0, int v) {
        int v1 = SafeParcelReader.readSize(parcel0, v);
        int v2 = parcel0.dataPosition();
        if(v1 == 0) {
            return null;
        }
        byte[] arr_b = parcel0.createByteArray();
        int v3 = parcel0.readInt();
        parcel0.setDataPosition(v2 + v1);
        return new BigDecimal(new BigInteger(arr_b), v3);
    }

    @NonNull
    public static BigDecimal[] createBigDecimalArray(@NonNull Parcel parcel0, int v) {
        int v1 = SafeParcelReader.readSize(parcel0, v);
        int v2 = parcel0.dataPosition();
        if(v1 == 0) {
            return null;
        }
        int v3 = parcel0.readInt();
        BigDecimal[] arr_bigDecimal = new BigDecimal[v3];
        for(int v4 = 0; v4 < v3; ++v4) {
            byte[] arr_b = parcel0.createByteArray();
            int v5 = parcel0.readInt();
            arr_bigDecimal[v4] = new BigDecimal(new BigInteger(arr_b), v5);
        }
        parcel0.setDataPosition(v2 + v1);
        return arr_bigDecimal;
    }

    @NonNull
    public static BigInteger createBigInteger(@NonNull Parcel parcel0, int v) {
        int v1 = SafeParcelReader.readSize(parcel0, v);
        int v2 = parcel0.dataPosition();
        if(v1 == 0) {
            return null;
        }
        byte[] arr_b = parcel0.createByteArray();
        parcel0.setDataPosition(v2 + v1);
        return new BigInteger(arr_b);
    }

    @NonNull
    public static BigInteger[] createBigIntegerArray(@NonNull Parcel parcel0, int v) {
        int v1 = SafeParcelReader.readSize(parcel0, v);
        int v2 = parcel0.dataPosition();
        if(v1 == 0) {
            return null;
        }
        int v3 = parcel0.readInt();
        BigInteger[] arr_bigInteger = new BigInteger[v3];
        for(int v4 = 0; v4 < v3; ++v4) {
            arr_bigInteger[v4] = new BigInteger(parcel0.createByteArray());
        }
        parcel0.setDataPosition(v2 + v1);
        return arr_bigInteger;
    }

    @NonNull
    public static boolean[] createBooleanArray(@NonNull Parcel parcel0, int v) {
        int v1 = SafeParcelReader.readSize(parcel0, v);
        int v2 = parcel0.dataPosition();
        if(v1 == 0) {
            return null;
        }
        boolean[] arr_z = parcel0.createBooleanArray();
        parcel0.setDataPosition(v2 + v1);
        return arr_z;
    }

    @NonNull
    public static ArrayList createBooleanList(@NonNull Parcel parcel0, int v) {
        int v1 = SafeParcelReader.readSize(parcel0, v);
        int v2 = parcel0.dataPosition();
        if(v1 == 0) {
            return null;
        }
        ArrayList arrayList0 = new ArrayList();
        int v3 = parcel0.readInt();
        for(int v4 = 0; v4 < v3; ++v4) {
            arrayList0.add(Boolean.valueOf(parcel0.readInt() != 0));
        }
        parcel0.setDataPosition(v2 + v1);
        return arrayList0;
    }

    @NonNull
    public static Bundle createBundle(@NonNull Parcel parcel0, int v) {
        int v1 = SafeParcelReader.readSize(parcel0, v);
        int v2 = parcel0.dataPosition();
        if(v1 == 0) {
            return null;
        }
        Bundle bundle0 = parcel0.readBundle();
        parcel0.setDataPosition(v2 + v1);
        return bundle0;
    }

    @NonNull
    public static byte[] createByteArray(@NonNull Parcel parcel0, int v) {
        int v1 = SafeParcelReader.readSize(parcel0, v);
        int v2 = parcel0.dataPosition();
        if(v1 == 0) {
            return null;
        }
        byte[] arr_b = parcel0.createByteArray();
        parcel0.setDataPosition(v2 + v1);
        return arr_b;
    }

    @NonNull
    public static byte[][] createByteArrayArray(@NonNull Parcel parcel0, int v) {
        int v1 = SafeParcelReader.readSize(parcel0, v);
        int v2 = parcel0.dataPosition();
        if(v1 == 0) {
            return null;
        }
        int v3 = parcel0.readInt();
        byte[][] arr2_b = new byte[v3][];
        for(int v4 = 0; v4 < v3; ++v4) {
            arr2_b[v4] = parcel0.createByteArray();
        }
        parcel0.setDataPosition(v2 + v1);
        return arr2_b;
    }

    @NonNull
    public static SparseArray createByteArraySparseArray(@NonNull Parcel parcel0, int v) {
        int v1 = SafeParcelReader.readSize(parcel0, v);
        int v2 = parcel0.dataPosition();
        if(v1 == 0) {
            return null;
        }
        int v3 = parcel0.readInt();
        SparseArray sparseArray0 = new SparseArray(v3);
        for(int v4 = 0; v4 < v3; ++v4) {
            sparseArray0.append(parcel0.readInt(), parcel0.createByteArray());
        }
        parcel0.setDataPosition(v2 + v1);
        return sparseArray0;
    }

    @NonNull
    public static char[] createCharArray(@NonNull Parcel parcel0, int v) {
        int v1 = SafeParcelReader.readSize(parcel0, v);
        int v2 = parcel0.dataPosition();
        if(v1 == 0) {
            return null;
        }
        char[] arr_c = parcel0.createCharArray();
        parcel0.setDataPosition(v2 + v1);
        return arr_c;
    }

    @NonNull
    public static double[] createDoubleArray(@NonNull Parcel parcel0, int v) {
        int v1 = SafeParcelReader.readSize(parcel0, v);
        int v2 = parcel0.dataPosition();
        if(v1 == 0) {
            return null;
        }
        double[] arr_f = parcel0.createDoubleArray();
        parcel0.setDataPosition(v2 + v1);
        return arr_f;
    }

    @NonNull
    public static ArrayList createDoubleList(@NonNull Parcel parcel0, int v) {
        int v1 = SafeParcelReader.readSize(parcel0, v);
        int v2 = parcel0.dataPosition();
        if(v1 == 0) {
            return null;
        }
        ArrayList arrayList0 = new ArrayList();
        int v3 = parcel0.readInt();
        for(int v4 = 0; v4 < v3; ++v4) {
            arrayList0.add(parcel0.readDouble());
        }
        parcel0.setDataPosition(v2 + v1);
        return arrayList0;
    }

    @NonNull
    public static SparseArray createDoubleSparseArray(@NonNull Parcel parcel0, int v) {
        int v1 = SafeParcelReader.readSize(parcel0, v);
        int v2 = parcel0.dataPosition();
        if(v1 == 0) {
            return null;
        }
        SparseArray sparseArray0 = new SparseArray();
        int v3 = parcel0.readInt();
        for(int v4 = 0; v4 < v3; ++v4) {
            sparseArray0.append(parcel0.readInt(), parcel0.readDouble());
        }
        parcel0.setDataPosition(v2 + v1);
        return sparseArray0;
    }

    @NonNull
    public static float[] createFloatArray(@NonNull Parcel parcel0, int v) {
        int v1 = SafeParcelReader.readSize(parcel0, v);
        int v2 = parcel0.dataPosition();
        if(v1 == 0) {
            return null;
        }
        float[] arr_f = parcel0.createFloatArray();
        parcel0.setDataPosition(v2 + v1);
        return arr_f;
    }

    @NonNull
    public static ArrayList createFloatList(@NonNull Parcel parcel0, int v) {
        int v1 = SafeParcelReader.readSize(parcel0, v);
        int v2 = parcel0.dataPosition();
        if(v1 == 0) {
            return null;
        }
        ArrayList arrayList0 = new ArrayList();
        int v3 = parcel0.readInt();
        for(int v4 = 0; v4 < v3; ++v4) {
            arrayList0.add(parcel0.readFloat());
        }
        parcel0.setDataPosition(v2 + v1);
        return arrayList0;
    }

    @NonNull
    public static SparseArray createFloatSparseArray(@NonNull Parcel parcel0, int v) {
        int v1 = SafeParcelReader.readSize(parcel0, v);
        int v2 = parcel0.dataPosition();
        if(v1 == 0) {
            return null;
        }
        SparseArray sparseArray0 = new SparseArray();
        int v3 = parcel0.readInt();
        for(int v4 = 0; v4 < v3; ++v4) {
            sparseArray0.append(parcel0.readInt(), parcel0.readFloat());
        }
        parcel0.setDataPosition(v2 + v1);
        return sparseArray0;
    }

    @NonNull
    public static IBinder[] createIBinderArray(@NonNull Parcel parcel0, int v) {
        int v1 = SafeParcelReader.readSize(parcel0, v);
        int v2 = parcel0.dataPosition();
        if(v1 == 0) {
            return null;
        }
        IBinder[] arr_iBinder = parcel0.createBinderArray();
        parcel0.setDataPosition(v2 + v1);
        return arr_iBinder;
    }

    @NonNull
    public static ArrayList createIBinderList(@NonNull Parcel parcel0, int v) {
        int v1 = SafeParcelReader.readSize(parcel0, v);
        int v2 = parcel0.dataPosition();
        if(v1 == 0) {
            return null;
        }
        ArrayList arrayList0 = parcel0.createBinderArrayList();
        parcel0.setDataPosition(v2 + v1);
        return arrayList0;
    }

    @NonNull
    public static SparseArray createIBinderSparseArray(@NonNull Parcel parcel0, int v) {
        int v1 = SafeParcelReader.readSize(parcel0, v);
        int v2 = parcel0.dataPosition();
        if(v1 == 0) {
            return null;
        }
        int v3 = parcel0.readInt();
        SparseArray sparseArray0 = new SparseArray(v3);
        for(int v4 = 0; v4 < v3; ++v4) {
            sparseArray0.append(parcel0.readInt(), parcel0.readStrongBinder());
        }
        parcel0.setDataPosition(v2 + v1);
        return sparseArray0;
    }

    @NonNull
    public static int[] createIntArray(@NonNull Parcel parcel0, int v) {
        int v1 = SafeParcelReader.readSize(parcel0, v);
        int v2 = parcel0.dataPosition();
        if(v1 == 0) {
            return null;
        }
        int[] arr_v = parcel0.createIntArray();
        parcel0.setDataPosition(v2 + v1);
        return arr_v;
    }

    @NonNull
    public static ArrayList createIntegerList(@NonNull Parcel parcel0, int v) {
        int v1 = SafeParcelReader.readSize(parcel0, v);
        int v2 = parcel0.dataPosition();
        if(v1 == 0) {
            return null;
        }
        ArrayList arrayList0 = new ArrayList();
        int v3 = parcel0.readInt();
        for(int v4 = 0; v4 < v3; ++v4) {
            arrayList0.add(parcel0.readInt());
        }
        parcel0.setDataPosition(v2 + v1);
        return arrayList0;
    }

    @NonNull
    public static long[] createLongArray(@NonNull Parcel parcel0, int v) {
        int v1 = SafeParcelReader.readSize(parcel0, v);
        int v2 = parcel0.dataPosition();
        if(v1 == 0) {
            return null;
        }
        long[] arr_v = parcel0.createLongArray();
        parcel0.setDataPosition(v2 + v1);
        return arr_v;
    }

    @NonNull
    public static ArrayList createLongList(@NonNull Parcel parcel0, int v) {
        int v1 = SafeParcelReader.readSize(parcel0, v);
        int v2 = parcel0.dataPosition();
        if(v1 == 0) {
            return null;
        }
        ArrayList arrayList0 = new ArrayList();
        int v3 = parcel0.readInt();
        for(int v4 = 0; v4 < v3; ++v4) {
            arrayList0.add(parcel0.readLong());
        }
        parcel0.setDataPosition(v2 + v1);
        return arrayList0;
    }

    @NonNull
    public static Parcel createParcel(@NonNull Parcel parcel0, int v) {
        int v1 = SafeParcelReader.readSize(parcel0, v);
        int v2 = parcel0.dataPosition();
        if(v1 == 0) {
            return null;
        }
        Parcel parcel1 = Parcel.obtain();
        parcel1.appendFrom(parcel0, v2, v1);
        parcel0.setDataPosition(v2 + v1);
        return parcel1;
    }

    @NonNull
    public static Parcel[] createParcelArray(@NonNull Parcel parcel0, int v) {
        int v1 = SafeParcelReader.readSize(parcel0, v);
        int v2 = parcel0.dataPosition();
        if(v1 == 0) {
            return null;
        }
        int v3 = parcel0.readInt();
        Parcel[] arr_parcel = new Parcel[v3];
        for(int v4 = 0; v4 < v3; ++v4) {
            int v5 = parcel0.readInt();
            if(v5 == 0) {
                arr_parcel[v4] = null;
            }
            else {
                int v6 = parcel0.dataPosition();
                Parcel parcel1 = Parcel.obtain();
                parcel1.appendFrom(parcel0, v6, v5);
                arr_parcel[v4] = parcel1;
                parcel0.setDataPosition(v6 + v5);
            }
        }
        parcel0.setDataPosition(v2 + v1);
        return arr_parcel;
    }

    @NonNull
    public static ArrayList createParcelList(@NonNull Parcel parcel0, int v) {
        int v1 = SafeParcelReader.readSize(parcel0, v);
        int v2 = parcel0.dataPosition();
        if(v1 == 0) {
            return null;
        }
        int v3 = parcel0.readInt();
        ArrayList arrayList0 = new ArrayList();
        for(int v4 = 0; v4 < v3; ++v4) {
            int v5 = parcel0.readInt();
            if(v5 == 0) {
                arrayList0.add(null);
            }
            else {
                int v6 = parcel0.dataPosition();
                Parcel parcel1 = Parcel.obtain();
                parcel1.appendFrom(parcel0, v6, v5);
                arrayList0.add(parcel1);
                parcel0.setDataPosition(v6 + v5);
            }
        }
        parcel0.setDataPosition(v2 + v1);
        return arrayList0;
    }

    @NonNull
    public static SparseArray createParcelSparseArray(@NonNull Parcel parcel0, int v) {
        int v1 = SafeParcelReader.readSize(parcel0, v);
        int v2 = parcel0.dataPosition();
        if(v1 == 0) {
            return null;
        }
        int v3 = parcel0.readInt();
        SparseArray sparseArray0 = new SparseArray();
        for(int v4 = 0; v4 < v3; ++v4) {
            int v5 = parcel0.readInt();
            int v6 = parcel0.readInt();
            if(v6 == 0) {
                sparseArray0.append(v5, null);
            }
            else {
                int v7 = parcel0.dataPosition();
                Parcel parcel1 = Parcel.obtain();
                parcel1.appendFrom(parcel0, v7, v6);
                sparseArray0.append(v5, parcel1);
                parcel0.setDataPosition(v7 + v6);
            }
        }
        parcel0.setDataPosition(v2 + v1);
        return sparseArray0;
    }

    @NonNull
    public static Parcelable createParcelable(@NonNull Parcel parcel0, int v, @NonNull Parcelable.Creator parcelable$Creator0) {
        int v1 = SafeParcelReader.readSize(parcel0, v);
        int v2 = parcel0.dataPosition();
        if(v1 == 0) {
            return null;
        }
        Parcelable parcelable0 = (Parcelable)parcelable$Creator0.createFromParcel(parcel0);
        parcel0.setDataPosition(v2 + v1);
        return parcelable0;
    }

    @NonNull
    public static SparseBooleanArray createSparseBooleanArray(@NonNull Parcel parcel0, int v) {
        int v1 = SafeParcelReader.readSize(parcel0, v);
        int v2 = parcel0.dataPosition();
        if(v1 == 0) {
            return null;
        }
        SparseBooleanArray sparseBooleanArray0 = parcel0.readSparseBooleanArray();
        parcel0.setDataPosition(v2 + v1);
        return sparseBooleanArray0;
    }

    @NonNull
    public static SparseIntArray createSparseIntArray(@NonNull Parcel parcel0, int v) {
        int v1 = SafeParcelReader.readSize(parcel0, v);
        int v2 = parcel0.dataPosition();
        if(v1 == 0) {
            return null;
        }
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        int v3 = parcel0.readInt();
        for(int v4 = 0; v4 < v3; ++v4) {
            sparseIntArray0.append(parcel0.readInt(), parcel0.readInt());
        }
        parcel0.setDataPosition(v2 + v1);
        return sparseIntArray0;
    }

    @NonNull
    public static SparseLongArray createSparseLongArray(@NonNull Parcel parcel0, int v) {
        int v1 = SafeParcelReader.readSize(parcel0, v);
        int v2 = parcel0.dataPosition();
        if(v1 == 0) {
            return null;
        }
        SparseLongArray sparseLongArray0 = new SparseLongArray();
        int v3 = parcel0.readInt();
        for(int v4 = 0; v4 < v3; ++v4) {
            sparseLongArray0.append(parcel0.readInt(), parcel0.readLong());
        }
        parcel0.setDataPosition(v2 + v1);
        return sparseLongArray0;
    }

    @NonNull
    public static String createString(@NonNull Parcel parcel0, int v) {
        int v1 = SafeParcelReader.readSize(parcel0, v);
        int v2 = parcel0.dataPosition();
        if(v1 == 0) {
            return null;
        }
        String s = parcel0.readString();
        parcel0.setDataPosition(v2 + v1);
        return s;
    }

    @NonNull
    public static String[] createStringArray(@NonNull Parcel parcel0, int v) {
        int v1 = SafeParcelReader.readSize(parcel0, v);
        int v2 = parcel0.dataPosition();
        if(v1 == 0) {
            return null;
        }
        String[] arr_s = parcel0.createStringArray();
        parcel0.setDataPosition(v2 + v1);
        return arr_s;
    }

    @NonNull
    public static ArrayList createStringList(@NonNull Parcel parcel0, int v) {
        int v1 = SafeParcelReader.readSize(parcel0, v);
        int v2 = parcel0.dataPosition();
        if(v1 == 0) {
            return null;
        }
        ArrayList arrayList0 = parcel0.createStringArrayList();
        parcel0.setDataPosition(v2 + v1);
        return arrayList0;
    }

    @NonNull
    public static SparseArray createStringSparseArray(@NonNull Parcel parcel0, int v) {
        int v1 = SafeParcelReader.readSize(parcel0, v);
        int v2 = parcel0.dataPosition();
        if(v1 == 0) {
            return null;
        }
        SparseArray sparseArray0 = new SparseArray();
        int v3 = parcel0.readInt();
        for(int v4 = 0; v4 < v3; ++v4) {
            sparseArray0.append(parcel0.readInt(), parcel0.readString());
        }
        parcel0.setDataPosition(v2 + v1);
        return sparseArray0;
    }

    @NonNull
    public static Object[] createTypedArray(@NonNull Parcel parcel0, int v, @NonNull Parcelable.Creator parcelable$Creator0) {
        int v1 = SafeParcelReader.readSize(parcel0, v);
        int v2 = parcel0.dataPosition();
        if(v1 == 0) {
            return null;
        }
        Object[] arr_object = parcel0.createTypedArray(parcelable$Creator0);
        parcel0.setDataPosition(v2 + v1);
        return arr_object;
    }

    @NonNull
    public static ArrayList createTypedList(@NonNull Parcel parcel0, int v, @NonNull Parcelable.Creator parcelable$Creator0) {
        int v1 = SafeParcelReader.readSize(parcel0, v);
        int v2 = parcel0.dataPosition();
        if(v1 == 0) {
            return null;
        }
        ArrayList arrayList0 = parcel0.createTypedArrayList(parcelable$Creator0);
        parcel0.setDataPosition(v2 + v1);
        return arrayList0;
    }

    @NonNull
    public static SparseArray createTypedSparseArray(@NonNull Parcel parcel0, int v, @NonNull Parcelable.Creator parcelable$Creator0) {
        int v1 = SafeParcelReader.readSize(parcel0, v);
        int v2 = parcel0.dataPosition();
        if(v1 == 0) {
            return null;
        }
        int v3 = parcel0.readInt();
        SparseArray sparseArray0 = new SparseArray();
        for(int v4 = 0; v4 < v3; ++v4) {
            sparseArray0.append(parcel0.readInt(), (parcel0.readInt() == 0 ? null : parcelable$Creator0.createFromParcel(parcel0)));
        }
        parcel0.setDataPosition(v2 + v1);
        return sparseArray0;
    }

    public static void ensureAtEnd(@NonNull Parcel parcel0, int v) {
        if(parcel0.dataPosition() != v) {
            throw new ParseException("Overread allowed size end=" + v, parcel0);
        }
    }

    public static int getFieldId(int v) [...] // Inlined contents

    public static boolean readBoolean(@NonNull Parcel parcel0, int v) {
        SafeParcelReader.b(parcel0, v, 4);
        return parcel0.readInt() != 0;
    }

    @NonNull
    public static Boolean readBooleanObject(@NonNull Parcel parcel0, int v) {
        int v1 = SafeParcelReader.readSize(parcel0, v);
        if(v1 == 0) {
            return null;
        }
        SafeParcelReader.a(parcel0, v1, 4);
        return parcel0.readInt() == 0 ? false : true;
    }

    public static byte readByte(@NonNull Parcel parcel0, int v) {
        SafeParcelReader.b(parcel0, v, 4);
        return (byte)parcel0.readInt();
    }

    public static char readChar(@NonNull Parcel parcel0, int v) {
        SafeParcelReader.b(parcel0, v, 4);
        return (char)parcel0.readInt();
    }

    public static double readDouble(@NonNull Parcel parcel0, int v) {
        SafeParcelReader.b(parcel0, v, 8);
        return parcel0.readDouble();
    }

    @NonNull
    public static Double readDoubleObject(@NonNull Parcel parcel0, int v) {
        int v1 = SafeParcelReader.readSize(parcel0, v);
        if(v1 == 0) {
            return null;
        }
        SafeParcelReader.a(parcel0, v1, 8);
        return parcel0.readDouble();
    }

    public static float readFloat(@NonNull Parcel parcel0, int v) {
        SafeParcelReader.b(parcel0, v, 4);
        return parcel0.readFloat();
    }

    @NonNull
    public static Float readFloatObject(@NonNull Parcel parcel0, int v) {
        int v1 = SafeParcelReader.readSize(parcel0, v);
        if(v1 == 0) {
            return null;
        }
        SafeParcelReader.a(parcel0, v1, 4);
        return parcel0.readFloat();
    }

    public static int readHeader(@NonNull Parcel parcel0) {
        return parcel0.readInt();
    }

    @NonNull
    public static IBinder readIBinder(@NonNull Parcel parcel0, int v) {
        int v1 = SafeParcelReader.readSize(parcel0, v);
        int v2 = parcel0.dataPosition();
        if(v1 == 0) {
            return null;
        }
        IBinder iBinder0 = parcel0.readStrongBinder();
        parcel0.setDataPosition(v2 + v1);
        return iBinder0;
    }

    public static int readInt(@NonNull Parcel parcel0, int v) {
        SafeParcelReader.b(parcel0, v, 4);
        return parcel0.readInt();
    }

    @NonNull
    public static Integer readIntegerObject(@NonNull Parcel parcel0, int v) {
        int v1 = SafeParcelReader.readSize(parcel0, v);
        if(v1 == 0) {
            return null;
        }
        SafeParcelReader.a(parcel0, v1, 4);
        return parcel0.readInt();
    }

    public static void readList(@NonNull Parcel parcel0, int v, @NonNull List list0, @NonNull ClassLoader classLoader0) {
        int v1 = SafeParcelReader.readSize(parcel0, v);
        int v2 = parcel0.dataPosition();
        if(v1 == 0) {
            return;
        }
        parcel0.readList(list0, classLoader0);
        parcel0.setDataPosition(v2 + v1);
    }

    public static long readLong(@NonNull Parcel parcel0, int v) {
        SafeParcelReader.b(parcel0, v, 8);
        return parcel0.readLong();
    }

    @NonNull
    public static Long readLongObject(@NonNull Parcel parcel0, int v) {
        int v1 = SafeParcelReader.readSize(parcel0, v);
        if(v1 == 0) {
            return null;
        }
        SafeParcelReader.a(parcel0, v1, 8);
        return parcel0.readLong();
    }

    @NonNull
    public static PendingIntent readPendingIntent(@NonNull Parcel parcel0, int v) {
        int v1 = SafeParcelReader.readSize(parcel0, v);
        int v2 = parcel0.dataPosition();
        if(v1 == 0) {
            return null;
        }
        PendingIntent pendingIntent0 = PendingIntent.readPendingIntentOrNullFromParcel(parcel0);
        parcel0.setDataPosition(v2 + v1);
        return pendingIntent0;
    }

    public static short readShort(@NonNull Parcel parcel0, int v) {
        SafeParcelReader.b(parcel0, v, 4);
        return (short)parcel0.readInt();
    }

    public static int readSize(@NonNull Parcel parcel0, int v) {
        return (v & 0xFFFF0000) != 0xFFFF0000 ? ((char)(v >> 16)) : parcel0.readInt();
    }

    public static void skipUnknownField(@NonNull Parcel parcel0, int v) {
        int v1 = SafeParcelReader.readSize(parcel0, v);
        parcel0.setDataPosition(parcel0.dataPosition() + v1);
    }

    public static int validateObjectHeader(@NonNull Parcel parcel0) {
        int v = SafeParcelReader.readHeader(parcel0);
        int v1 = SafeParcelReader.readSize(parcel0, v);
        int v2 = parcel0.dataPosition();
        if(((char)v) != 0x4F45) {
            throw new ParseException("Expected object header. Got 0x" + Integer.toHexString(v), parcel0);
        }
        int v3 = v1 + v2;
        if(v3 < v2 || v3 > parcel0.dataSize()) {
            throw new ParseException("Size read is invalid start=" + v2 + " end=" + v3, parcel0);
        }
        return v3;
    }
}

