package androidx.work;

import android.annotation.SuppressLint;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.room.TypeConverter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public final class Data {
    public static final class Builder {
        public final HashMap a;

        public Builder() {
            this.a = new HashMap();
        }

        @NonNull
        public Data build() {
            Data data0 = new Data(this.a);
            Data.toByteArrayInternal(data0);
            return data0;
        }

        @NonNull
        @RestrictTo({Scope.LIBRARY_GROUP})
        public Builder put(@NonNull String s, @Nullable Object object0) {
            HashMap hashMap0 = this.a;
            if(object0 == null) {
                hashMap0.put(s, null);
                return this;
            }
            Class class0 = object0.getClass();
            if(class0 != Boolean.class && class0 != Byte.class && class0 != Integer.class && class0 != Long.class && class0 != Float.class && class0 != Double.class && class0 != String.class && class0 != Boolean[].class && class0 != Byte[].class && class0 != Integer[].class && class0 != Long[].class && class0 != Float[].class && class0 != Double[].class && class0 != String[].class) {
                if(class0 == boolean[].class) {
                    hashMap0.put(s, Data.convertPrimitiveBooleanArray(((boolean[])object0)));
                    return this;
                }
                if(class0 == byte[].class) {
                    hashMap0.put(s, Data.convertPrimitiveByteArray(((byte[])object0)));
                    return this;
                }
                if(class0 == int[].class) {
                    hashMap0.put(s, Data.convertPrimitiveIntArray(((int[])object0)));
                    return this;
                }
                if(class0 == long[].class) {
                    hashMap0.put(s, Data.convertPrimitiveLongArray(((long[])object0)));
                    return this;
                }
                if(class0 == float[].class) {
                    hashMap0.put(s, Data.convertPrimitiveFloatArray(((float[])object0)));
                    return this;
                }
                if(class0 != double[].class) {
                    throw new IllegalArgumentException("Key " + s + " has invalid type " + class0);
                }
                hashMap0.put(s, Data.convertPrimitiveDoubleArray(((double[])object0)));
                return this;
            }
            hashMap0.put(s, object0);
            return this;
        }

        @NonNull
        public Builder putAll(@NonNull Data data0) {
            this.putAll(data0.a);
            return this;
        }

        @NonNull
        public Builder putAll(@NonNull Map map0) {
            for(Object object0: map0.entrySet()) {
                this.put(((String)((Map.Entry)object0).getKey()), ((Map.Entry)object0).getValue());
            }
            return this;
        }

        @NonNull
        public Builder putBoolean(@NonNull String s, boolean z) {
            this.a.put(s, Boolean.valueOf(z));
            return this;
        }

        @NonNull
        public Builder putBooleanArray(@NonNull String s, @NonNull boolean[] arr_z) {
            Boolean[] arr_boolean = Data.convertPrimitiveBooleanArray(arr_z);
            this.a.put(s, arr_boolean);
            return this;
        }

        @NonNull
        public Builder putByte(@NonNull String s, byte b) {
            this.a.put(s, b);
            return this;
        }

        @NonNull
        public Builder putByteArray(@NonNull String s, @NonNull byte[] arr_b) {
            Byte[] arr_byte = Data.convertPrimitiveByteArray(arr_b);
            this.a.put(s, arr_byte);
            return this;
        }

        @NonNull
        public Builder putDouble(@NonNull String s, double f) {
            this.a.put(s, f);
            return this;
        }

        @NonNull
        public Builder putDoubleArray(@NonNull String s, @NonNull double[] arr_f) {
            Double[] arr_double = Data.convertPrimitiveDoubleArray(arr_f);
            this.a.put(s, arr_double);
            return this;
        }

        @NonNull
        public Builder putFloat(@NonNull String s, float f) {
            this.a.put(s, f);
            return this;
        }

        @NonNull
        public Builder putFloatArray(@NonNull String s, @NonNull float[] arr_f) {
            Float[] arr_float = Data.convertPrimitiveFloatArray(arr_f);
            this.a.put(s, arr_float);
            return this;
        }

        @NonNull
        public Builder putInt(@NonNull String s, int v) {
            this.a.put(s, v);
            return this;
        }

        @NonNull
        public Builder putIntArray(@NonNull String s, @NonNull int[] arr_v) {
            Integer[] arr_integer = Data.convertPrimitiveIntArray(arr_v);
            this.a.put(s, arr_integer);
            return this;
        }

        @NonNull
        public Builder putLong(@NonNull String s, long v) {
            this.a.put(s, v);
            return this;
        }

        @NonNull
        public Builder putLongArray(@NonNull String s, @NonNull long[] arr_v) {
            Long[] arr_long = Data.convertPrimitiveLongArray(arr_v);
            this.a.put(s, arr_long);
            return this;
        }

        @NonNull
        public Builder putString(@NonNull String s, @Nullable String s1) {
            this.a.put(s, s1);
            return this;
        }

        @NonNull
        public Builder putStringArray(@NonNull String s, @NonNull String[] arr_s) {
            this.a.put(s, arr_s);
            return this;
        }
    }

    public static final Data EMPTY = null;
    @SuppressLint({"MinMaxConstant"})
    public static final int MAX_DATA_BYTES = 0x2800;
    public final HashMap a;
    public static final String b;

    static {
        Data.b = "WM-Data";
        Data.EMPTY = new Builder().build();
    }

    public Data(@NonNull Data data0) {
        this.a = new HashMap(data0.a);
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public Data(@NonNull Map map0) {
        this.a = new HashMap(map0);
    }

    @NonNull
    @RestrictTo({Scope.LIBRARY_GROUP})
    public static Boolean[] convertPrimitiveBooleanArray(@NonNull boolean[] arr_z) {
        Boolean[] arr_boolean = new Boolean[arr_z.length];
        for(int v = 0; v < arr_z.length; ++v) {
            arr_boolean[v] = Boolean.valueOf(arr_z[v]);
        }
        return arr_boolean;
    }

    @NonNull
    @RestrictTo({Scope.LIBRARY_GROUP})
    public static Byte[] convertPrimitiveByteArray(@NonNull byte[] arr_b) {
        Byte[] arr_byte = new Byte[arr_b.length];
        for(int v = 0; v < arr_b.length; ++v) {
            arr_byte[v] = (byte)arr_b[v];
        }
        return arr_byte;
    }

    @NonNull
    @RestrictTo({Scope.LIBRARY_GROUP})
    public static Double[] convertPrimitiveDoubleArray(@NonNull double[] arr_f) {
        Double[] arr_double = new Double[arr_f.length];
        for(int v = 0; v < arr_f.length; ++v) {
            arr_double[v] = (double)arr_f[v];
        }
        return arr_double;
    }

    @NonNull
    @RestrictTo({Scope.LIBRARY_GROUP})
    public static Float[] convertPrimitiveFloatArray(@NonNull float[] arr_f) {
        Float[] arr_float = new Float[arr_f.length];
        for(int v = 0; v < arr_f.length; ++v) {
            arr_float[v] = (float)arr_f[v];
        }
        return arr_float;
    }

    @NonNull
    @RestrictTo({Scope.LIBRARY_GROUP})
    public static Integer[] convertPrimitiveIntArray(@NonNull int[] arr_v) {
        Integer[] arr_integer = new Integer[arr_v.length];
        for(int v = 0; v < arr_v.length; ++v) {
            arr_integer[v] = (int)arr_v[v];
        }
        return arr_integer;
    }

    @NonNull
    @RestrictTo({Scope.LIBRARY_GROUP})
    public static Long[] convertPrimitiveLongArray(@NonNull long[] arr_v) {
        Long[] arr_long = new Long[arr_v.length];
        for(int v = 0; v < arr_v.length; ++v) {
            arr_long[v] = (long)arr_v[v];
        }
        return arr_long;
    }

    @NonNull
    @RestrictTo({Scope.LIBRARY_GROUP})
    public static byte[] convertToPrimitiveArray(@NonNull Byte[] arr_byte) {
        byte[] arr_b = new byte[arr_byte.length];
        for(int v = 0; v < arr_byte.length; ++v) {
            arr_b[v] = (byte)arr_byte[v];
        }
        return arr_b;
    }

    @NonNull
    @RestrictTo({Scope.LIBRARY_GROUP})
    public static double[] convertToPrimitiveArray(@NonNull Double[] arr_double) {
        double[] arr_f = new double[arr_double.length];
        for(int v = 0; v < arr_double.length; ++v) {
            arr_f[v] = (double)arr_double[v];
        }
        return arr_f;
    }

    @NonNull
    @RestrictTo({Scope.LIBRARY_GROUP})
    public static float[] convertToPrimitiveArray(@NonNull Float[] arr_float) {
        float[] arr_f = new float[arr_float.length];
        for(int v = 0; v < arr_float.length; ++v) {
            arr_f[v] = (float)arr_float[v];
        }
        return arr_f;
    }

    @NonNull
    @RestrictTo({Scope.LIBRARY_GROUP})
    public static int[] convertToPrimitiveArray(@NonNull Integer[] arr_integer) {
        int[] arr_v = new int[arr_integer.length];
        for(int v = 0; v < arr_integer.length; ++v) {
            arr_v[v] = (int)arr_integer[v];
        }
        return arr_v;
    }

    @NonNull
    @RestrictTo({Scope.LIBRARY_GROUP})
    public static long[] convertToPrimitiveArray(@NonNull Long[] arr_long) {
        long[] arr_v = new long[arr_long.length];
        for(int v = 0; v < arr_long.length; ++v) {
            arr_v[v] = (long)arr_long[v];
        }
        return arr_v;
    }

    @NonNull
    @RestrictTo({Scope.LIBRARY_GROUP})
    public static boolean[] convertToPrimitiveArray(@NonNull Boolean[] arr_boolean) {
        boolean[] arr_z = new boolean[arr_boolean.length];
        for(int v = 0; v < arr_boolean.length; ++v) {
            arr_z[v] = arr_boolean[v].booleanValue();
        }
        return arr_z;
    }

    @Override
    public boolean equals(Object object0) {
        boolean z;
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            if(Data.class == class0) {
                HashMap hashMap0 = this.a;
                Set set0 = hashMap0.keySet();
                HashMap hashMap1 = ((Data)object0).a;
                if(!set0.equals(hashMap1.keySet())) {
                    return false;
                }
                for(Object object1: set0) {
                    Object object2 = hashMap0.get(((String)object1));
                    Object object3 = hashMap1.get(((String)object1));
                    if(object2 == null || object3 == null) {
                        z = object2 == object3;
                    }
                    else if(!(object2 instanceof Object[]) || !(object3 instanceof Object[])) {
                        z = object2.equals(object3);
                    }
                    else {
                        z = Arrays.deepEquals(((Object[])object2), ((Object[])object3));
                    }
                    if(!z) {
                        return false;
                    }
                    if(false) {
                        break;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @NonNull
    @TypeConverter
    public static Data fromByteArray(@NonNull byte[] arr_b) {
        Throwable throwable1;
        IOException iOException1;
        ObjectInputStream objectInputStream0;
        if(arr_b.length <= 0x2800) {
            HashMap hashMap0 = new HashMap();
            ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(arr_b);
            try {
                objectInputStream0 = null;
                objectInputStream0 = new ObjectInputStream(byteArrayInputStream0);
            }
            catch(IOException | ClassNotFoundException iOException0) {
                iOException1 = iOException0;
                goto label_18;
            }
            catch(Throwable throwable0) {
                throwable1 = throwable0;
                goto label_27;
            }
            try {
                int v = objectInputStream0.readInt();
                while(true) {
                    if(v <= 0) {
                        goto label_37;
                    }
                    hashMap0.put(objectInputStream0.readUTF(), objectInputStream0.readObject());
                    --v;
                }
            }
            catch(IOException | ClassNotFoundException iOException1) {
                try {
                label_18:
                    Log.e("WM-Data", "Error in Data#fromByteArray: ", iOException1);
                    if(objectInputStream0 != null) {
                        goto label_20;
                    }
                    goto label_24;
                }
                catch(Throwable throwable1) {
                    goto label_27;
                }
                try {
                label_20:
                    objectInputStream0.close();
                }
                catch(IOException iOException2) {
                    Log.e("WM-Data", "Error in Data#fromByteArray: ", iOException2);
                }
                try {
                label_24:
                    byteArrayInputStream0.close();
                }
                catch(IOException iOException3) {
                    Log.e("WM-Data", "Error in Data#fromByteArray: ", iOException3);
                    return new Data(hashMap0);
                }
                return new Data(hashMap0);
            }
            catch(Throwable throwable1) {
            }
        label_27:
            if(objectInputStream0 != null) {
                try {
                    objectInputStream0.close();
                }
                catch(IOException iOException4) {
                    Log.e("WM-Data", "Error in Data#fromByteArray: ", iOException4);
                }
            }
            try {
                byteArrayInputStream0.close();
            }
            catch(IOException iOException5) {
                Log.e("WM-Data", "Error in Data#fromByteArray: ", iOException5);
            }
            throw throwable1;
            try {
            label_37:
                objectInputStream0.close();
            }
            catch(IOException iOException6) {
                Log.e("WM-Data", "Error in Data#fromByteArray: ", iOException6);
            }
            try {
                byteArrayInputStream0.close();
                return new Data(hashMap0);
            }
            catch(IOException iOException3) {
                Log.e("WM-Data", "Error in Data#fromByteArray: ", iOException3);
                return new Data(hashMap0);
            }
        }
        throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
    }

    public boolean getBoolean(@NonNull String s, boolean z) {
        Object object0 = this.a.get(s);
        return object0 instanceof Boolean ? ((Boolean)object0).booleanValue() : z;
    }

    @Nullable
    public boolean[] getBooleanArray(@NonNull String s) {
        Object object0 = this.a.get(s);
        return object0 instanceof Boolean[] ? Data.convertToPrimitiveArray(((Boolean[])object0)) : null;
    }

    public byte getByte(@NonNull String s, byte b) {
        Object object0 = this.a.get(s);
        return object0 instanceof Byte ? ((byte)(((Byte)object0))) : b;
    }

    @Nullable
    public byte[] getByteArray(@NonNull String s) {
        Object object0 = this.a.get(s);
        return object0 instanceof Byte[] ? Data.convertToPrimitiveArray(((Byte[])object0)) : null;
    }

    public double getDouble(@NonNull String s, double f) {
        Object object0 = this.a.get(s);
        return object0 instanceof Double ? ((double)(((Double)object0))) : f;
    }

    @Nullable
    public double[] getDoubleArray(@NonNull String s) {
        Object object0 = this.a.get(s);
        return object0 instanceof Double[] ? Data.convertToPrimitiveArray(((Double[])object0)) : null;
    }

    public float getFloat(@NonNull String s, float f) {
        Object object0 = this.a.get(s);
        return object0 instanceof Float ? ((float)(((Float)object0))) : f;
    }

    @Nullable
    public float[] getFloatArray(@NonNull String s) {
        Object object0 = this.a.get(s);
        return object0 instanceof Float[] ? Data.convertToPrimitiveArray(((Float[])object0)) : null;
    }

    public int getInt(@NonNull String s, int v) {
        Object object0 = this.a.get(s);
        return object0 instanceof Integer ? ((int)(((Integer)object0))) : v;
    }

    @Nullable
    public int[] getIntArray(@NonNull String s) {
        Object object0 = this.a.get(s);
        return object0 instanceof Integer[] ? Data.convertToPrimitiveArray(((Integer[])object0)) : null;
    }

    @NonNull
    public Map getKeyValueMap() {
        return Collections.unmodifiableMap(this.a);
    }

    public long getLong(@NonNull String s, long v) {
        Object object0 = this.a.get(s);
        return object0 instanceof Long ? ((long)(((Long)object0))) : v;
    }

    @Nullable
    public long[] getLongArray(@NonNull String s) {
        Object object0 = this.a.get(s);
        return object0 instanceof Long[] ? Data.convertToPrimitiveArray(((Long[])object0)) : null;
    }

    @Nullable
    public String getString(@NonNull String s) {
        Object object0 = this.a.get(s);
        return object0 instanceof String ? ((String)object0) : null;
    }

    @Nullable
    public String[] getStringArray(@NonNull String s) {
        Object object0 = this.a.get(s);
        return object0 instanceof String[] ? ((String[])object0) : null;
    }

    public boolean hasKeyWithValueOfType(@NonNull String s, @NonNull Class class0) {
        Object object0 = this.a.get(s);
        return object0 != null && class0.isAssignableFrom(object0.getClass());
    }

    @Override
    public int hashCode() {
        return this.a.hashCode() * 0x1F;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public int size() {
        return this.a.size();
    }

    @NonNull
    public byte[] toByteArray() {
        return Data.toByteArrayInternal(this);
    }

    @NonNull
    @RestrictTo({Scope.LIBRARY_GROUP})
    @TypeConverter
    public static byte[] toByteArrayInternal(@NonNull Data data0) {
        byte[] arr_b;
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream0 = null;
        try {
            try {
                objectOutputStream0 = new ObjectOutputStream(byteArrayOutputStream0);
                objectOutputStream0.writeInt(data0.size());
                Iterator iterator0 = data0.a.entrySet().iterator();
                while(true) {
                    if(!iterator0.hasNext()) {
                        goto label_34;
                    }
                    Object object0 = iterator0.next();
                    objectOutputStream0.writeUTF(((String)((Map.Entry)object0).getKey()));
                    objectOutputStream0.writeObject(((Map.Entry)object0).getValue());
                }
            }
            catch(IOException iOException0) {
            }
            Log.e("WM-Data", "Error in Data#toByteArray: ", iOException0);
            arr_b = byteArrayOutputStream0.toByteArray();
            if(objectOutputStream0 != null) {
                goto label_14;
            }
            goto label_18;
        }
        catch(Throwable throwable0) {
            goto label_24;
        }
        try {
        label_14:
            objectOutputStream0.close();
        }
        catch(IOException iOException1) {
            Log.e("WM-Data", "Error in Data#toByteArray: ", iOException1);
        }
        try {
        label_18:
            byteArrayOutputStream0.close();
        }
        catch(IOException iOException2) {
            Log.e("WM-Data", "Error in Data#toByteArray: ", iOException2);
        }
        return arr_b;
    label_24:
        if(objectOutputStream0 != null) {
            try {
                objectOutputStream0.close();
            }
            catch(IOException iOException3) {
                Log.e("WM-Data", "Error in Data#toByteArray: ", iOException3);
            }
        }
        try {
            byteArrayOutputStream0.close();
        }
        catch(IOException iOException4) {
            Log.e("WM-Data", "Error in Data#toByteArray: ", iOException4);
        }
        throw throwable0;
        try {
        label_34:
            objectOutputStream0.close();
        }
        catch(IOException iOException5) {
            Log.e("WM-Data", "Error in Data#toByteArray: ", iOException5);
        }
        try {
            byteArrayOutputStream0.close();
        }
        catch(IOException iOException6) {
            Log.e("WM-Data", "Error in Data#toByteArray: ", iOException6);
        }
        if(byteArrayOutputStream0.size() > 0x2800) {
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        }
        return byteArrayOutputStream0.toByteArray();
    }

    @Override
    @NonNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("Data {");
        HashMap hashMap0 = this.a;
        if(!hashMap0.isEmpty()) {
            for(Object object0: hashMap0.keySet()) {
                stringBuilder0.append(((String)object0));
                stringBuilder0.append(" : ");
                Object object1 = hashMap0.get(((String)object0));
                if(object1 instanceof Object[]) {
                    stringBuilder0.append(Arrays.toString(((Object[])object1)));
                }
                else {
                    stringBuilder0.append(object1);
                }
                stringBuilder0.append(", ");
            }
        }
        stringBuilder0.append("}");
        return stringBuilder0.toString();
    }
}

