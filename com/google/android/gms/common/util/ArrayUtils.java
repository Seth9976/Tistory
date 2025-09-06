package com.google.android.gms.common.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

@KeepForSdk
@VisibleForTesting
public final class ArrayUtils {
    @NonNull
    @KeepForSdk
    public static Object[] concat(@NonNull Object[][] arr2_object) {
        if(arr2_object.length != 0) {
            int v1 = 0;
            for(int v = 0; v < arr2_object.length; ++v) {
                v1 += arr2_object[v].length;
            }
            Object[] arr_object = Arrays.copyOf(arr2_object[0], v1);
            int v2 = arr2_object[0].length;
            for(int v3 = 1; v3 < arr2_object.length; ++v3) {
                Object[] arr_object1 = arr2_object[v3];
                System.arraycopy(arr_object1, 0, arr_object, v2, arr_object1.length);
                v2 += arr_object1.length;
            }
            return arr_object;
        }
        return (Object[])Array.newInstance(arr2_object.getClass(), 0);
    }

    @NonNull
    @KeepForSdk
    public static byte[] concatByteArrays(@NonNull byte[][] arr2_b) {
        if(arr2_b.length != 0) {
            int v1 = 0;
            for(int v = 0; v < arr2_b.length; ++v) {
                v1 += arr2_b[v].length;
            }
            byte[] arr_b = Arrays.copyOf(arr2_b[0], v1);
            int v2 = arr2_b[0].length;
            for(int v3 = 1; v3 < arr2_b.length; ++v3) {
                byte[] arr_b1 = arr2_b[v3];
                System.arraycopy(arr_b1, 0, arr_b, v2, arr_b1.length);
                v2 += arr_b1.length;
            }
            return arr_b;
        }
        return new byte[0];
    }

    @KeepForSdk
    public static boolean contains(@NonNull int[] arr_v, int v) {
        if(arr_v == null) {
            return false;
        }
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            if(arr_v[v1] == v) {
                return true;
            }
        }
        return false;
    }

    @KeepForSdk
    public static boolean contains(@NonNull Object[] arr_object, @NonNull Object object0) {
        int v = arr_object == null ? 0 : arr_object.length;
        for(int v1 = 0; v1 < v; ++v1) {
            if(Objects.equal(arr_object[v1], object0)) {
                return v1 >= 0;
            }
        }
        return false;
    }

    @NonNull
    @KeepForSdk
    public static ArrayList newArrayList() {
        return new ArrayList();
    }

    @Nullable
    @KeepForSdk
    public static Object[] removeAll(@NonNull Object[] arr_object, @NonNull Object[] arr_object1) {
        int v2;
        if(arr_object == null) {
            return null;
        }
        if(arr_object1 != null && arr_object1.length != 0) {
            Object[] arr_object2 = (Object[])Array.newInstance(arr_object1.getClass().getComponentType(), arr_object.length);
            if(arr_object1.length == 1) {
                v2 = 0;
                for(int v1 = 0; v1 < arr_object.length; ++v1) {
                    Object object0 = arr_object[v1];
                    if(!Objects.equal(arr_object1[0], object0)) {
                        arr_object2[v2] = object0;
                        ++v2;
                    }
                }
            }
            else {
                int v3 = 0;
                for(int v = 0; v < arr_object.length; ++v) {
                    Object object1 = arr_object[v];
                    if(!ArrayUtils.contains(arr_object1, object1)) {
                        arr_object2[v3] = object1;
                        ++v3;
                    }
                }
                v2 = v3;
            }
            if(arr_object2 != null) {
                return v2 == arr_object2.length ? arr_object2 : Arrays.copyOf(arr_object2, v2);
            }
            return null;
        }
        return Arrays.copyOf(arr_object, arr_object.length);
    }

    @NonNull
    @KeepForSdk
    public static ArrayList toArrayList(@NonNull Object[] arr_object) {
        ArrayList arrayList0 = new ArrayList(arr_object.length);
        for(int v = 0; v < arr_object.length; ++v) {
            arrayList0.add(arr_object[v]);
        }
        return arrayList0;
    }

    @NonNull
    @KeepForSdk
    public static int[] toPrimitiveArray(@NonNull Collection collection0) {
        int v = 0;
        if(collection0 != null && !collection0.isEmpty()) {
            int[] arr_v = new int[collection0.size()];
            for(Object object0: collection0) {
                arr_v[v] = (int)(((Integer)object0));
                ++v;
            }
            return arr_v;
        }
        return new int[0];
    }

    @Nullable
    @KeepForSdk
    public static Integer[] toWrapperArray(@NonNull int[] arr_v) {
        if(arr_v == null) {
            return null;
        }
        Integer[] arr_integer = new Integer[arr_v.length];
        for(int v = 0; v < arr_v.length; ++v) {
            arr_integer[v] = (int)arr_v[v];
        }
        return arr_integer;
    }

    @KeepForSdk
    public static void writeArray(@NonNull StringBuilder stringBuilder0, @NonNull double[] arr_f) {
        for(int v = 0; v < arr_f.length; ++v) {
            if(v != 0) {
                stringBuilder0.append(",");
            }
            stringBuilder0.append(Double.toString(arr_f[v]));
        }
    }

    @KeepForSdk
    public static void writeArray(@NonNull StringBuilder stringBuilder0, @NonNull float[] arr_f) {
        for(int v = 0; v < arr_f.length; ++v) {
            if(v != 0) {
                stringBuilder0.append(",");
            }
            stringBuilder0.append(Float.toString(arr_f[v]));
        }
    }

    @KeepForSdk
    public static void writeArray(@NonNull StringBuilder stringBuilder0, @NonNull int[] arr_v) {
        for(int v = 0; v < arr_v.length; ++v) {
            if(v != 0) {
                stringBuilder0.append(",");
            }
            stringBuilder0.append(Integer.toString(arr_v[v]));
        }
    }

    @KeepForSdk
    public static void writeArray(@NonNull StringBuilder stringBuilder0, @NonNull long[] arr_v) {
        for(int v = 0; v < arr_v.length; ++v) {
            if(v != 0) {
                stringBuilder0.append(",");
            }
            stringBuilder0.append(Long.toString(arr_v[v]));
        }
    }

    @KeepForSdk
    public static void writeArray(@NonNull StringBuilder stringBuilder0, @NonNull Object[] arr_object) {
        for(int v = 0; v < arr_object.length; ++v) {
            if(v != 0) {
                stringBuilder0.append(",");
            }
            stringBuilder0.append(arr_object[v]);
        }
    }

    @KeepForSdk
    public static void writeArray(@NonNull StringBuilder stringBuilder0, @NonNull boolean[] arr_z) {
        for(int v = 0; v < arr_z.length; ++v) {
            if(v != 0) {
                stringBuilder0.append(",");
            }
            stringBuilder0.append(Boolean.toString(arr_z[v]));
        }
    }

    @KeepForSdk
    public static void writeStringArray(@NonNull StringBuilder stringBuilder0, @NonNull String[] arr_s) {
        for(int v = 0; v < arr_s.length; ++v) {
            if(v != 0) {
                stringBuilder0.append(",");
            }
            stringBuilder0.append("\"");
            stringBuilder0.append(arr_s[v]);
            stringBuilder0.append("\"");
        }
    }
}

