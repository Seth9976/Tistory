package kotlin.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.PublishedApi;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r0.a;

public abstract class ArraysKt___ArraysJvmKt extends f {
    @NotNull
    public static final List asList(@NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        return new RandomAccess() {
            public boolean contains(byte b) {
                return ArraysKt___ArraysKt.contains(arr_b, b);
            }

            @Override  // kotlin.collections.AbstractCollection
            public final boolean contains(Object object0) {
                return object0 instanceof Byte ? this.contains(((Number)object0).byteValue()) : false;
            }

            @NotNull
            public Byte get(int v) {
                return (byte)arr_b[v];
            }

            @Override  // kotlin.collections.AbstractList
            public Object get(int v) {
                return this.get(v);
            }

            @Override  // kotlin.collections.AbstractList
            public int getSize() {
                return arr_b.length;
            }

            public int indexOf(byte b) {
                return ArraysKt___ArraysKt.indexOf(arr_b, b);
            }

            @Override  // kotlin.collections.AbstractList
            public final int indexOf(Object object0) {
                return object0 instanceof Byte ? this.indexOf(((Number)object0).byteValue()) : -1;
            }

            @Override  // kotlin.collections.AbstractCollection
            public boolean isEmpty() {
                return arr_b.length == 0;
            }

            public int lastIndexOf(byte b) {
                return ArraysKt___ArraysKt.lastIndexOf(arr_b, b);
            }

            @Override  // kotlin.collections.AbstractList
            public final int lastIndexOf(Object object0) {
                return object0 instanceof Byte ? this.lastIndexOf(((Number)object0).byteValue()) : -1;
            }
        };
    }

    @NotNull
    public static final List asList(@NotNull char[] arr_c) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        return new RandomAccess() {
            public boolean contains(char c) {
                return ArraysKt___ArraysKt.contains(arr_c, c);
            }

            @Override  // kotlin.collections.AbstractCollection
            public final boolean contains(Object object0) {
                return object0 instanceof Character ? this.contains(((Character)object0).charValue()) : false;
            }

            @NotNull
            public Character get(int v) {
                return Character.valueOf(arr_c[v]);
            }

            @Override  // kotlin.collections.AbstractList
            public Object get(int v) {
                return this.get(v);
            }

            @Override  // kotlin.collections.AbstractList
            public int getSize() {
                return arr_c.length;
            }

            public int indexOf(char c) {
                return ArraysKt___ArraysKt.indexOf(arr_c, c);
            }

            @Override  // kotlin.collections.AbstractList
            public final int indexOf(Object object0) {
                return object0 instanceof Character ? this.indexOf(((Character)object0).charValue()) : -1;
            }

            @Override  // kotlin.collections.AbstractCollection
            public boolean isEmpty() {
                return arr_c.length == 0;
            }

            public int lastIndexOf(char c) {
                return ArraysKt___ArraysKt.lastIndexOf(arr_c, c);
            }

            @Override  // kotlin.collections.AbstractList
            public final int lastIndexOf(Object object0) {
                return object0 instanceof Character ? this.lastIndexOf(((Character)object0).charValue()) : -1;
            }
        };
    }

    @NotNull
    public static List asList(@NotNull double[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        return new RandomAccess() {
            public boolean contains(double f) {
                double[] arr_f = arr_f;
                for(int v = 0; v < arr_f.length; ++v) {
                    if(Double.doubleToLongBits(arr_f[v]) == Double.doubleToLongBits(f)) {
                        return true;
                    }
                }
                return false;
            }

            @Override  // kotlin.collections.AbstractCollection
            public final boolean contains(Object object0) {
                return object0 instanceof Double ? this.contains(((Number)object0).doubleValue()) : false;
            }

            @NotNull
            public Double get(int v) {
                return (double)arr_f[v];
            }

            @Override  // kotlin.collections.AbstractList
            public Object get(int v) {
                return this.get(v);
            }

            @Override  // kotlin.collections.AbstractList
            public int getSize() {
                return arr_f.length;
            }

            public int indexOf(double f) {
                double[] arr_f = arr_f;
                int v = 0;
                while(v < arr_f.length) {
                    if(Double.doubleToLongBits(arr_f[v]) != Double.doubleToLongBits(f)) {
                        ++v;
                        continue;
                    }
                    return v;
                }
                return -1;
            }

            @Override  // kotlin.collections.AbstractList
            public final int indexOf(Object object0) {
                return object0 instanceof Double ? this.indexOf(((Number)object0).doubleValue()) : -1;
            }

            @Override  // kotlin.collections.AbstractCollection
            public boolean isEmpty() {
                return arr_f.length == 0;
            }

            public int lastIndexOf(double f) {
                double[] arr_f = arr_f;
                int v = arr_f.length - 1;
                if(v >= 0) {
                    while(true) {
                        if(Double.doubleToLongBits(arr_f[v]) == Double.doubleToLongBits(f)) {
                            return v;
                        }
                        if(v - 1 < 0) {
                            break;
                        }
                        --v;
                    }
                }
                return -1;
            }

            @Override  // kotlin.collections.AbstractList
            public final int lastIndexOf(Object object0) {
                return object0 instanceof Double ? this.lastIndexOf(((Number)object0).doubleValue()) : -1;
            }
        };
    }

    @NotNull
    public static final List asList(@NotNull float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        return new RandomAccess() {
            public boolean contains(float f) {
                float[] arr_f = arr_f;
                for(int v = 0; v < arr_f.length; ++v) {
                    if(Float.floatToIntBits(arr_f[v]) == Float.floatToIntBits(f)) {
                        return true;
                    }
                }
                return false;
            }

            @Override  // kotlin.collections.AbstractCollection
            public final boolean contains(Object object0) {
                return object0 instanceof Float ? this.contains(((Number)object0).floatValue()) : false;
            }

            @NotNull
            public Float get(int v) {
                return (float)arr_f[v];
            }

            @Override  // kotlin.collections.AbstractList
            public Object get(int v) {
                return this.get(v);
            }

            @Override  // kotlin.collections.AbstractList
            public int getSize() {
                return arr_f.length;
            }

            public int indexOf(float f) {
                float[] arr_f = arr_f;
                int v = 0;
                while(v < arr_f.length) {
                    if(Float.floatToIntBits(arr_f[v]) != Float.floatToIntBits(f)) {
                        ++v;
                        continue;
                    }
                    return v;
                }
                return -1;
            }

            @Override  // kotlin.collections.AbstractList
            public final int indexOf(Object object0) {
                return object0 instanceof Float ? this.indexOf(((Number)object0).floatValue()) : -1;
            }

            @Override  // kotlin.collections.AbstractCollection
            public boolean isEmpty() {
                return arr_f.length == 0;
            }

            public int lastIndexOf(float f) {
                float[] arr_f = arr_f;
                int v = arr_f.length - 1;
                if(v >= 0) {
                    while(true) {
                        if(Float.floatToIntBits(arr_f[v]) == Float.floatToIntBits(f)) {
                            return v;
                        }
                        if(v - 1 < 0) {
                            break;
                        }
                        --v;
                    }
                }
                return -1;
            }

            @Override  // kotlin.collections.AbstractList
            public final int lastIndexOf(Object object0) {
                return object0 instanceof Float ? this.lastIndexOf(((Number)object0).floatValue()) : -1;
            }
        };
    }

    @NotNull
    public static List asList(@NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        return new RandomAccess() {
            public boolean contains(int v) {
                return ArraysKt___ArraysKt.contains(arr_v, v);
            }

            @Override  // kotlin.collections.AbstractCollection
            public final boolean contains(Object object0) {
                return object0 instanceof Integer ? this.contains(((Number)object0).intValue()) : false;
            }

            @NotNull
            public Integer get(int v) {
                return (int)arr_v[v];
            }

            @Override  // kotlin.collections.AbstractList
            public Object get(int v) {
                return this.get(v);
            }

            @Override  // kotlin.collections.AbstractList
            public int getSize() {
                return arr_v.length;
            }

            public int indexOf(int v) {
                return ArraysKt___ArraysKt.indexOf(arr_v, v);
            }

            @Override  // kotlin.collections.AbstractList
            public final int indexOf(Object object0) {
                return object0 instanceof Integer ? this.indexOf(((Number)object0).intValue()) : -1;
            }

            @Override  // kotlin.collections.AbstractCollection
            public boolean isEmpty() {
                return arr_v.length == 0;
            }

            public int lastIndexOf(int v) {
                return ArraysKt___ArraysKt.lastIndexOf(arr_v, v);
            }

            @Override  // kotlin.collections.AbstractList
            public final int lastIndexOf(Object object0) {
                return object0 instanceof Integer ? this.lastIndexOf(((Number)object0).intValue()) : -1;
            }
        };
    }

    @NotNull
    public static List asList(@NotNull long[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        return new RandomAccess() {
            public boolean contains(long v) {
                return ArraysKt___ArraysKt.contains(arr_v, v);
            }

            @Override  // kotlin.collections.AbstractCollection
            public final boolean contains(Object object0) {
                return object0 instanceof Long ? this.contains(((Number)object0).longValue()) : false;
            }

            @NotNull
            public Long get(int v) {
                return (long)arr_v[v];
            }

            @Override  // kotlin.collections.AbstractList
            public Object get(int v) {
                return this.get(v);
            }

            @Override  // kotlin.collections.AbstractList
            public int getSize() {
                return arr_v.length;
            }

            public int indexOf(long v) {
                return ArraysKt___ArraysKt.indexOf(arr_v, v);
            }

            @Override  // kotlin.collections.AbstractList
            public final int indexOf(Object object0) {
                return object0 instanceof Long ? this.indexOf(((Number)object0).longValue()) : -1;
            }

            @Override  // kotlin.collections.AbstractCollection
            public boolean isEmpty() {
                return arr_v.length == 0;
            }

            public int lastIndexOf(long v) {
                return ArraysKt___ArraysKt.lastIndexOf(arr_v, v);
            }

            @Override  // kotlin.collections.AbstractList
            public final int lastIndexOf(Object object0) {
                return object0 instanceof Long ? this.lastIndexOf(((Number)object0).longValue()) : -1;
            }
        };
    }

    @NotNull
    public static List asList(@NotNull Object[] arr_object) [...] // Inlined contents

    @NotNull
    public static final List asList(@NotNull short[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        return new RandomAccess() {
            @Override  // kotlin.collections.AbstractCollection
            public final boolean contains(Object object0) {
                return object0 instanceof Short ? this.contains(((Number)object0).shortValue()) : false;
            }

            public boolean contains(short v) {
                return ArraysKt___ArraysKt.contains(arr_v, v);
            }

            @Override  // kotlin.collections.AbstractList
            public Object get(int v) {
                return this.get(v);
            }

            @NotNull
            public Short get(int v) {
                return (short)arr_v[v];
            }

            @Override  // kotlin.collections.AbstractList
            public int getSize() {
                return arr_v.length;
            }

            @Override  // kotlin.collections.AbstractList
            public final int indexOf(Object object0) {
                return object0 instanceof Short ? this.indexOf(((Number)object0).shortValue()) : -1;
            }

            public int indexOf(short v) {
                return ArraysKt___ArraysKt.indexOf(arr_v, v);
            }

            @Override  // kotlin.collections.AbstractCollection
            public boolean isEmpty() {
                return arr_v.length == 0;
            }

            @Override  // kotlin.collections.AbstractList
            public final int lastIndexOf(Object object0) {
                return object0 instanceof Short ? this.lastIndexOf(((Number)object0).shortValue()) : -1;
            }

            public int lastIndexOf(short v) {
                return ArraysKt___ArraysKt.lastIndexOf(arr_v, v);
            }
        };
    }

    @NotNull
    public static final List asList(@NotNull boolean[] arr_z) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        return new RandomAccess() {
            @Override  // kotlin.collections.AbstractCollection
            public final boolean contains(Object object0) {
                return object0 instanceof Boolean ? this.contains(((Boolean)object0).booleanValue()) : false;
            }

            public boolean contains(boolean z) {
                return ArraysKt___ArraysKt.contains(arr_z, z);
            }

            @NotNull
            public Boolean get(int v) {
                return Boolean.valueOf(arr_z[v]);
            }

            @Override  // kotlin.collections.AbstractList
            public Object get(int v) {
                return this.get(v);
            }

            @Override  // kotlin.collections.AbstractList
            public int getSize() {
                return arr_z.length;
            }

            @Override  // kotlin.collections.AbstractList
            public final int indexOf(Object object0) {
                return object0 instanceof Boolean ? this.indexOf(((Boolean)object0).booleanValue()) : -1;
            }

            public int indexOf(boolean z) {
                return ArraysKt___ArraysKt.indexOf(arr_z, z);
            }

            @Override  // kotlin.collections.AbstractCollection
            public boolean isEmpty() {
                return arr_z.length == 0;
            }

            @Override  // kotlin.collections.AbstractList
            public final int lastIndexOf(Object object0) {
                return object0 instanceof Boolean ? this.lastIndexOf(((Boolean)object0).booleanValue()) : -1;
            }

            public int lastIndexOf(boolean z) {
                return ArraysKt___ArraysKt.lastIndexOf(arr_z, z);
            }
        };
    }

    public static final int binarySearch(@NotNull byte[] arr_b, byte b, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        return Arrays.binarySearch(arr_b, v, v1, b);
    }

    public static final int binarySearch(@NotNull char[] arr_c, char c, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        return Arrays.binarySearch(arr_c, v, v1, c);
    }

    public static final int binarySearch(@NotNull double[] arr_f, double f, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        return Arrays.binarySearch(arr_f, v, v1, f);
    }

    public static final int binarySearch(@NotNull float[] arr_f, float f, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        return Arrays.binarySearch(arr_f, v, v1, f);
    }

    public static final int binarySearch(@NotNull int[] arr_v, int v, int v1, int v2) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        return Arrays.binarySearch(arr_v, v1, v2, v);
    }

    public static final int binarySearch(@NotNull long[] arr_v, long v, int v1, int v2) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        return Arrays.binarySearch(arr_v, v1, v2, v);
    }

    public static final int binarySearch(@NotNull Object[] arr_object, Object object0, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        return Arrays.binarySearch(arr_object, v, v1, object0);
    }

    public static final int binarySearch(@NotNull Object[] arr_object, Object object0, @NotNull Comparator comparator0, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        return Arrays.binarySearch(arr_object, v, v1, object0, comparator0);
    }

    public static final int binarySearch(@NotNull short[] arr_v, short v, int v1, int v2) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        return Arrays.binarySearch(arr_v, v1, v2, v);
    }

    public static int binarySearch$default(byte[] arr_b, byte b, int v, int v1, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v = 0;
        }
        if((v2 & 4) != 0) {
            v1 = arr_b.length;
        }
        return ArraysKt___ArraysJvmKt.binarySearch(arr_b, b, v, v1);
    }

    public static int binarySearch$default(char[] arr_c, char c, int v, int v1, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v = 0;
        }
        if((v2 & 4) != 0) {
            v1 = arr_c.length;
        }
        return ArraysKt___ArraysJvmKt.binarySearch(arr_c, c, v, v1);
    }

    public static int binarySearch$default(double[] arr_f, double f, int v, int v1, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v = 0;
        }
        if((v2 & 4) != 0) {
            v1 = arr_f.length;
        }
        return ArraysKt___ArraysJvmKt.binarySearch(arr_f, f, v, v1);
    }

    public static int binarySearch$default(float[] arr_f, float f, int v, int v1, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v = 0;
        }
        if((v2 & 4) != 0) {
            v1 = arr_f.length;
        }
        return ArraysKt___ArraysJvmKt.binarySearch(arr_f, f, v, v1);
    }

    public static int binarySearch$default(int[] arr_v, int v, int v1, int v2, int v3, Object object0) {
        if((v3 & 2) != 0) {
            v1 = 0;
        }
        if((v3 & 4) != 0) {
            v2 = arr_v.length;
        }
        return ArraysKt___ArraysJvmKt.binarySearch(arr_v, v, v1, v2);
    }

    public static int binarySearch$default(long[] arr_v, long v, int v1, int v2, int v3, Object object0) {
        if((v3 & 2) != 0) {
            v1 = 0;
        }
        if((v3 & 4) != 0) {
            v2 = arr_v.length;
        }
        return ArraysKt___ArraysJvmKt.binarySearch(arr_v, v, v1, v2);
    }

    public static int binarySearch$default(Object[] arr_object, Object object0, int v, int v1, int v2, Object object1) {
        if((v2 & 2) != 0) {
            v = 0;
        }
        if((v2 & 4) != 0) {
            v1 = arr_object.length;
        }
        return ArraysKt___ArraysJvmKt.binarySearch(arr_object, object0, v, v1);
    }

    public static int binarySearch$default(Object[] arr_object, Object object0, Comparator comparator0, int v, int v1, int v2, Object object1) {
        if((v2 & 4) != 0) {
            v = 0;
        }
        if((v2 & 8) != 0) {
            v1 = arr_object.length;
        }
        return ArraysKt___ArraysJvmKt.binarySearch(arr_object, object0, comparator0, v, v1);
    }

    public static int binarySearch$default(short[] arr_v, short v, int v1, int v2, int v3, Object object0) {
        if((v3 & 2) != 0) {
            v1 = 0;
        }
        if((v3 & 4) != 0) {
            v2 = arr_v.length;
        }
        return ArraysKt___ArraysJvmKt.binarySearch(arr_v, v, v1, v2);
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static byte[] copyInto(@NotNull byte[] arr_b, @NotNull byte[] arr_b1, int v, int v1, int v2) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(arr_b1, "destination");
        System.arraycopy(arr_b, v1, arr_b1, v, v2 - v1);
        return arr_b1;
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static char[] copyInto(@NotNull char[] arr_c, @NotNull char[] arr_c1, int v, int v1, int v2) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(arr_c1, "destination");
        System.arraycopy(arr_c, v1, arr_c1, v, v2 - v1);
        return arr_c1;
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static final double[] copyInto(@NotNull double[] arr_f, @NotNull double[] arr_f1, int v, int v1, int v2) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(arr_f1, "destination");
        System.arraycopy(arr_f, v1, arr_f1, v, v2 - v1);
        return arr_f1;
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static float[] copyInto(@NotNull float[] arr_f, @NotNull float[] arr_f1, int v, int v1, int v2) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(arr_f1, "destination");
        System.arraycopy(arr_f, v1, arr_f1, v, v2 - v1);
        return arr_f1;
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static int[] copyInto(@NotNull int[] arr_v, @NotNull int[] arr_v1, int v, int v1, int v2) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(arr_v1, "destination");
        System.arraycopy(arr_v, v1, arr_v1, v, v2 - v1);
        return arr_v1;
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static long[] copyInto(@NotNull long[] arr_v, @NotNull long[] arr_v1, int v, int v1, int v2) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(arr_v1, "destination");
        System.arraycopy(arr_v, v1, arr_v1, v, v2 - v1);
        return arr_v1;
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static Object[] copyInto(@NotNull Object[] arr_object, @NotNull Object[] arr_object1, int v, int v1, int v2) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(arr_object1, "destination");
        System.arraycopy(arr_object, v1, arr_object1, v, v2 - v1);
        return arr_object1;
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static final short[] copyInto(@NotNull short[] arr_v, @NotNull short[] arr_v1, int v, int v1, int v2) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(arr_v1, "destination");
        System.arraycopy(arr_v, v1, arr_v1, v, v2 - v1);
        return arr_v1;
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static final boolean[] copyInto(@NotNull boolean[] arr_z, @NotNull boolean[] arr_z1, int v, int v1, int v2) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(arr_z1, "destination");
        System.arraycopy(arr_z, v1, arr_z1, v, v2 - v1);
        return arr_z1;
    }

    public static byte[] copyInto$default(byte[] arr_b, byte[] arr_b1, int v, int v1, int v2, int v3, Object object0) {
        if((v3 & 2) != 0) {
            v = 0;
        }
        if((v3 & 4) != 0) {
            v1 = 0;
        }
        if((v3 & 8) != 0) {
            v2 = arr_b.length;
        }
        return ArraysKt___ArraysJvmKt.copyInto(arr_b, arr_b1, v, v1, v2);
    }

    public static char[] copyInto$default(char[] arr_c, char[] arr_c1, int v, int v1, int v2, int v3, Object object0) {
        if((v3 & 2) != 0) {
            v = 0;
        }
        if((v3 & 4) != 0) {
            v1 = 0;
        }
        if((v3 & 8) != 0) {
            v2 = arr_c.length;
        }
        return ArraysKt___ArraysJvmKt.copyInto(arr_c, arr_c1, v, v1, v2);
    }

    public static double[] copyInto$default(double[] arr_f, double[] arr_f1, int v, int v1, int v2, int v3, Object object0) {
        if((v3 & 2) != 0) {
            v = 0;
        }
        if((v3 & 4) != 0) {
            v1 = 0;
        }
        if((v3 & 8) != 0) {
            v2 = arr_f.length;
        }
        return ArraysKt___ArraysJvmKt.copyInto(arr_f, arr_f1, v, v1, v2);
    }

    public static float[] copyInto$default(float[] arr_f, float[] arr_f1, int v, int v1, int v2, int v3, Object object0) {
        if((v3 & 2) != 0) {
            v = 0;
        }
        if((v3 & 4) != 0) {
            v1 = 0;
        }
        if((v3 & 8) != 0) {
            v2 = arr_f.length;
        }
        return ArraysKt___ArraysJvmKt.copyInto(arr_f, arr_f1, v, v1, v2);
    }

    public static int[] copyInto$default(int[] arr_v, int[] arr_v1, int v, int v1, int v2, int v3, Object object0) {
        if((v3 & 2) != 0) {
            v = 0;
        }
        if((v3 & 4) != 0) {
            v1 = 0;
        }
        if((v3 & 8) != 0) {
            v2 = arr_v.length;
        }
        return ArraysKt___ArraysJvmKt.copyInto(arr_v, arr_v1, v, v1, v2);
    }

    public static long[] copyInto$default(long[] arr_v, long[] arr_v1, int v, int v1, int v2, int v3, Object object0) {
        if((v3 & 2) != 0) {
            v = 0;
        }
        if((v3 & 4) != 0) {
            v1 = 0;
        }
        if((v3 & 8) != 0) {
            v2 = arr_v.length;
        }
        return ArraysKt___ArraysJvmKt.copyInto(arr_v, arr_v1, v, v1, v2);
    }

    public static Object[] copyInto$default(Object[] arr_object, Object[] arr_object1, int v, int v1, int v2, int v3, Object object0) {
        if((v3 & 2) != 0) {
            v = 0;
        }
        if((v3 & 4) != 0) {
            v1 = 0;
        }
        if((v3 & 8) != 0) {
            v2 = arr_object.length;
        }
        return ArraysKt___ArraysJvmKt.copyInto(arr_object, arr_object1, v, v1, v2);
    }

    public static short[] copyInto$default(short[] arr_v, short[] arr_v1, int v, int v1, int v2, int v3, Object object0) {
        if((v3 & 2) != 0) {
            v = 0;
        }
        if((v3 & 4) != 0) {
            v1 = 0;
        }
        if((v3 & 8) != 0) {
            v2 = arr_v.length;
        }
        return ArraysKt___ArraysJvmKt.copyInto(arr_v, arr_v1, v, v1, v2);
    }

    public static boolean[] copyInto$default(boolean[] arr_z, boolean[] arr_z1, int v, int v1, int v2, int v3, Object object0) {
        if((v3 & 2) != 0) {
            v = 0;
        }
        if((v3 & 4) != 0) {
            v1 = 0;
        }
        if((v3 & 8) != 0) {
            v2 = arr_z.length;
        }
        return ArraysKt___ArraysJvmKt.copyInto(arr_z, arr_z1, v, v1, v2);
    }

    @PublishedApi
    @SinceKotlin(version = "1.3")
    @JvmName(name = "copyOfRange")
    @NotNull
    public static byte[] copyOfRange(@NotNull byte[] arr_b, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        e.copyOfRangeToIndexCheck(v1, arr_b.length);
        byte[] arr_b1 = Arrays.copyOfRange(arr_b, v, v1);
        Intrinsics.checkNotNullExpressionValue(arr_b1, "copyOfRange(...)");
        return arr_b1;
    }

    @PublishedApi
    @SinceKotlin(version = "1.3")
    @JvmName(name = "copyOfRange")
    @NotNull
    public static final char[] copyOfRange(@NotNull char[] arr_c, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        e.copyOfRangeToIndexCheck(v1, arr_c.length);
        char[] arr_c1 = Arrays.copyOfRange(arr_c, v, v1);
        Intrinsics.checkNotNullExpressionValue(arr_c1, "copyOfRange(...)");
        return arr_c1;
    }

    @PublishedApi
    @SinceKotlin(version = "1.3")
    @JvmName(name = "copyOfRange")
    @NotNull
    public static final double[] copyOfRange(@NotNull double[] arr_f, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        e.copyOfRangeToIndexCheck(v1, arr_f.length);
        double[] arr_f1 = Arrays.copyOfRange(arr_f, v, v1);
        Intrinsics.checkNotNullExpressionValue(arr_f1, "copyOfRange(...)");
        return arr_f1;
    }

    @PublishedApi
    @SinceKotlin(version = "1.3")
    @JvmName(name = "copyOfRange")
    @NotNull
    public static final float[] copyOfRange(@NotNull float[] arr_f, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        e.copyOfRangeToIndexCheck(v1, arr_f.length);
        float[] arr_f1 = Arrays.copyOfRange(arr_f, v, v1);
        Intrinsics.checkNotNullExpressionValue(arr_f1, "copyOfRange(...)");
        return arr_f1;
    }

    @PublishedApi
    @SinceKotlin(version = "1.3")
    @JvmName(name = "copyOfRange")
    @NotNull
    public static int[] copyOfRange(@NotNull int[] arr_v, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        e.copyOfRangeToIndexCheck(v1, arr_v.length);
        int[] arr_v1 = Arrays.copyOfRange(arr_v, v, v1);
        Intrinsics.checkNotNullExpressionValue(arr_v1, "copyOfRange(...)");
        return arr_v1;
    }

    @PublishedApi
    @SinceKotlin(version = "1.3")
    @JvmName(name = "copyOfRange")
    @NotNull
    public static long[] copyOfRange(@NotNull long[] arr_v, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        e.copyOfRangeToIndexCheck(v1, arr_v.length);
        long[] arr_v1 = Arrays.copyOfRange(arr_v, v, v1);
        Intrinsics.checkNotNullExpressionValue(arr_v1, "copyOfRange(...)");
        return arr_v1;
    }

    @PublishedApi
    @SinceKotlin(version = "1.3")
    @JvmName(name = "copyOfRange")
    @NotNull
    public static Object[] copyOfRange(@NotNull Object[] arr_object, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        e.copyOfRangeToIndexCheck(v1, arr_object.length);
        Object[] arr_object1 = Arrays.copyOfRange(arr_object, v, v1);
        Intrinsics.checkNotNullExpressionValue(arr_object1, "copyOfRange(...)");
        return arr_object1;
    }

    @PublishedApi
    @SinceKotlin(version = "1.3")
    @JvmName(name = "copyOfRange")
    @NotNull
    public static short[] copyOfRange(@NotNull short[] arr_v, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        e.copyOfRangeToIndexCheck(v1, arr_v.length);
        short[] arr_v1 = Arrays.copyOfRange(arr_v, v, v1);
        Intrinsics.checkNotNullExpressionValue(arr_v1, "copyOfRange(...)");
        return arr_v1;
    }

    @PublishedApi
    @SinceKotlin(version = "1.3")
    @JvmName(name = "copyOfRange")
    @NotNull
    public static final boolean[] copyOfRange(@NotNull boolean[] arr_z, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        e.copyOfRangeToIndexCheck(v1, arr_z.length);
        boolean[] arr_z1 = Arrays.copyOfRange(arr_z, v, v1);
        Intrinsics.checkNotNullExpressionValue(arr_z1, "copyOfRange(...)");
        return arr_z1;
    }

    public static void fill(@NotNull byte[] arr_b, byte b, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Arrays.fill(arr_b, v, v1, b);
    }

    public static final void fill(@NotNull char[] arr_c, char c, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Arrays.fill(arr_c, v, v1, c);
    }

    public static final void fill(@NotNull double[] arr_f, double f, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Arrays.fill(arr_f, v, v1, f);
    }

    public static final void fill(@NotNull float[] arr_f, float f, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Arrays.fill(arr_f, v, v1, f);
    }

    public static void fill(@NotNull int[] arr_v, int v, int v1, int v2) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Arrays.fill(arr_v, v1, v2, v);
    }

    public static void fill(@NotNull long[] arr_v, long v, int v1, int v2) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Arrays.fill(arr_v, v1, v2, v);
    }

    public static void fill(@NotNull Object[] arr_object, Object object0, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Arrays.fill(arr_object, v, v1, object0);
    }

    public static void fill(@NotNull short[] arr_v, short v, int v1, int v2) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Arrays.fill(arr_v, v1, v2, v);
    }

    public static final void fill(@NotNull boolean[] arr_z, boolean z, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Arrays.fill(arr_z, v, v1, z);
    }

    public static void fill$default(byte[] arr_b, byte b, int v, int v1, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v = 0;
        }
        if((v2 & 4) != 0) {
            v1 = arr_b.length;
        }
        ArraysKt___ArraysJvmKt.fill(arr_b, b, v, v1);
    }

    public static void fill$default(char[] arr_c, char c, int v, int v1, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v = 0;
        }
        if((v2 & 4) != 0) {
            v1 = arr_c.length;
        }
        ArraysKt___ArraysJvmKt.fill(arr_c, c, v, v1);
    }

    public static void fill$default(double[] arr_f, double f, int v, int v1, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v = 0;
        }
        if((v2 & 4) != 0) {
            v1 = arr_f.length;
        }
        ArraysKt___ArraysJvmKt.fill(arr_f, f, v, v1);
    }

    public static void fill$default(float[] arr_f, float f, int v, int v1, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v = 0;
        }
        if((v2 & 4) != 0) {
            v1 = arr_f.length;
        }
        ArraysKt___ArraysJvmKt.fill(arr_f, f, v, v1);
    }

    public static void fill$default(int[] arr_v, int v, int v1, int v2, int v3, Object object0) {
        if((v3 & 2) != 0) {
            v1 = 0;
        }
        if((v3 & 4) != 0) {
            v2 = arr_v.length;
        }
        ArraysKt___ArraysJvmKt.fill(arr_v, v, v1, v2);
    }

    public static void fill$default(long[] arr_v, long v, int v1, int v2, int v3, Object object0) {
        if((v3 & 2) != 0) {
            v1 = 0;
        }
        if((v3 & 4) != 0) {
            v2 = arr_v.length;
        }
        ArraysKt___ArraysJvmKt.fill(arr_v, v, v1, v2);
    }

    public static void fill$default(Object[] arr_object, Object object0, int v, int v1, int v2, Object object1) {
        if((v2 & 2) != 0) {
            v = 0;
        }
        if((v2 & 4) != 0) {
            v1 = arr_object.length;
        }
        ArraysKt___ArraysJvmKt.fill(arr_object, object0, v, v1);
    }

    public static void fill$default(short[] arr_v, short v, int v1, int v2, int v3, Object object0) {
        if((v3 & 2) != 0) {
            v1 = 0;
        }
        if((v3 & 4) != 0) {
            v2 = arr_v.length;
        }
        ArraysKt___ArraysJvmKt.fill(arr_v, v, v1, v2);
    }

    public static void fill$default(boolean[] arr_z, boolean z, int v, int v1, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v = 0;
        }
        if((v2 & 4) != 0) {
            v1 = arr_z.length;
        }
        ArraysKt___ArraysJvmKt.fill(arr_z, z, v, v1);
    }

    @NotNull
    public static final List filterIsInstance(@NotNull Object[] arr_object, @NotNull Class class0) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(class0, "klass");
        return (List)ArraysKt___ArraysJvmKt.filterIsInstanceTo(arr_object, new ArrayList(), class0);
    }

    @NotNull
    public static final Collection filterIsInstanceTo(@NotNull Object[] arr_object, @NotNull Collection collection0, @NotNull Class class0) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(class0, "klass");
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
            if(class0.isInstance(object0)) {
                collection0.add(object0);
            }
        }
        return collection0;
    }

    @Deprecated(message = "Use maxOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Byte max(byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        return ArraysKt___ArraysKt.maxOrNull(arr_b);
    }

    @Deprecated(message = "Use maxOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Character max(char[] arr_c) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        return ArraysKt___ArraysKt.maxOrNull(arr_c);
    }

    @Deprecated(message = "Use maxOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Comparable max(Comparable[] arr_comparable) {
        Intrinsics.checkNotNullParameter(arr_comparable, "<this>");
        return ArraysKt___ArraysKt.maxOrNull(arr_comparable);
    }

    @Deprecated(message = "Use maxOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Double max(double[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        return ArraysKt___ArraysKt.maxOrNull(arr_f);
    }

    @Deprecated(message = "Use maxOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @SinceKotlin(version = "1.1")
    public static final Double max(Double[] arr_double) {
        Intrinsics.checkNotNullParameter(arr_double, "<this>");
        return ArraysKt___ArraysKt.maxOrNull(arr_double);
    }

    @Deprecated(message = "Use maxOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Float max(float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        return ArraysKt___ArraysKt.maxOrNull(arr_f);
    }

    @Deprecated(message = "Use maxOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @SinceKotlin(version = "1.1")
    public static final Float max(Float[] arr_float) {
        Intrinsics.checkNotNullParameter(arr_float, "<this>");
        return ArraysKt___ArraysKt.maxOrNull(arr_float);
    }

    @Deprecated(message = "Use maxOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Integer max(int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        return ArraysKt___ArraysKt.maxOrNull(arr_v);
    }

    @Deprecated(message = "Use maxOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Long max(long[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        return ArraysKt___ArraysKt.maxOrNull(arr_v);
    }

    @Deprecated(message = "Use maxOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Short max(short[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        return ArraysKt___ArraysKt.maxOrNull(arr_v);
    }

    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Boolean maxBy(boolean[] arr_z, Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        if(arr_z.length == 0) {
            return null;
        }
        boolean z = arr_z[0];
        int v = ArraysKt___ArraysKt.getLastIndex(arr_z);
        if(v == 0) {
            return Boolean.valueOf(z);
        }
        Comparable comparable0 = (Comparable)function10.invoke(Boolean.valueOf(z));
        IntIterator intIterator0 = a.t(1, v);
        while(intIterator0.hasNext()) {
            boolean z1 = arr_z[intIterator0.nextInt()];
            Comparable comparable1 = (Comparable)function10.invoke(Boolean.valueOf(z1));
            if(comparable0.compareTo(comparable1) < 0) {
                z = z1;
                comparable0 = comparable1;
            }
        }
        return Boolean.valueOf(z);
    }

    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Byte maxBy(byte[] arr_b, Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        if(arr_b.length == 0) {
            return null;
        }
        int v = arr_b[0];
        int v1 = ArraysKt___ArraysKt.getLastIndex(arr_b);
        if(v1 == 0) {
            return (byte)v;
        }
        Comparable comparable0 = (Comparable)function10.invoke(((byte)v));
        IntIterator intIterator0 = a.t(1, v1);
        while(intIterator0.hasNext()) {
            int v2 = arr_b[intIterator0.nextInt()];
            Comparable comparable1 = (Comparable)function10.invoke(((byte)v2));
            if(comparable0.compareTo(comparable1) < 0) {
                v = v2;
                comparable0 = comparable1;
            }
        }
        return (byte)v;
    }

    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Character maxBy(char[] arr_c, Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        if(arr_c.length == 0) {
            return null;
        }
        int v = arr_c[0];
        int v1 = ArraysKt___ArraysKt.getLastIndex(arr_c);
        if(v1 == 0) {
            return Character.valueOf(((char)v));
        }
        Comparable comparable0 = (Comparable)function10.invoke(Character.valueOf(((char)v)));
        IntIterator intIterator0 = a.t(1, v1);
        while(intIterator0.hasNext()) {
            int v2 = arr_c[intIterator0.nextInt()];
            Comparable comparable1 = (Comparable)function10.invoke(Character.valueOf(((char)v2)));
            if(comparable0.compareTo(comparable1) < 0) {
                v = v2;
                comparable0 = comparable1;
            }
        }
        return Character.valueOf(((char)v));
    }

    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Double maxBy(double[] arr_f, Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        if(arr_f.length == 0) {
            return null;
        }
        double f = arr_f[0];
        int v = ArraysKt___ArraysKt.getLastIndex(arr_f);
        if(v == 0) {
            return f;
        }
        Comparable comparable0 = (Comparable)function10.invoke(f);
        IntIterator intIterator0 = a.t(1, v);
        while(intIterator0.hasNext()) {
            double f1 = arr_f[intIterator0.nextInt()];
            Comparable comparable1 = (Comparable)function10.invoke(f1);
            if(comparable0.compareTo(comparable1) < 0) {
                f = f1;
                comparable0 = comparable1;
            }
        }
        return f;
    }

    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Float maxBy(float[] arr_f, Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        if(arr_f.length == 0) {
            return null;
        }
        float f = arr_f[0];
        int v = ArraysKt___ArraysKt.getLastIndex(arr_f);
        if(v == 0) {
            return f;
        }
        Comparable comparable0 = (Comparable)function10.invoke(f);
        IntIterator intIterator0 = a.t(1, v);
        while(intIterator0.hasNext()) {
            float f1 = arr_f[intIterator0.nextInt()];
            Comparable comparable1 = (Comparable)function10.invoke(f1);
            if(comparable0.compareTo(comparable1) < 0) {
                f = f1;
                comparable0 = comparable1;
            }
        }
        return f;
    }

    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Integer maxBy(int[] arr_v, Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        if(arr_v.length == 0) {
            return null;
        }
        int v = arr_v[0];
        int v1 = ArraysKt___ArraysKt.getLastIndex(arr_v);
        if(v1 == 0) {
            return v;
        }
        Comparable comparable0 = (Comparable)function10.invoke(v);
        IntIterator intIterator0 = a.t(1, v1);
        while(intIterator0.hasNext()) {
            int v2 = arr_v[intIterator0.nextInt()];
            Comparable comparable1 = (Comparable)function10.invoke(v2);
            if(comparable0.compareTo(comparable1) < 0) {
                v = v2;
                comparable0 = comparable1;
            }
        }
        return v;
    }

    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Long maxBy(long[] arr_v, Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        if(arr_v.length == 0) {
            return null;
        }
        long v = arr_v[0];
        int v1 = ArraysKt___ArraysKt.getLastIndex(arr_v);
        if(v1 == 0) {
            return v;
        }
        Comparable comparable0 = (Comparable)function10.invoke(v);
        IntIterator intIterator0 = a.t(1, v1);
        while(intIterator0.hasNext()) {
            long v2 = arr_v[intIterator0.nextInt()];
            Comparable comparable1 = (Comparable)function10.invoke(v2);
            if(comparable0.compareTo(comparable1) < 0) {
                v = v2;
                comparable0 = comparable1;
            }
        }
        return v;
    }

    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Object maxBy(Object[] arr_object, Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        if(arr_object.length == 0) {
            return null;
        }
        Object object0 = arr_object[0];
        int v = ArraysKt___ArraysKt.getLastIndex(arr_object);
        if(v != 0) {
            Comparable comparable0 = (Comparable)function10.invoke(object0);
            IntIterator intIterator0 = a.t(1, v);
            while(intIterator0.hasNext()) {
                Object object1 = arr_object[intIterator0.nextInt()];
                Comparable comparable1 = (Comparable)function10.invoke(object1);
                if(comparable0.compareTo(comparable1) < 0) {
                    object0 = object1;
                    comparable0 = comparable1;
                }
            }
        }
        return object0;
    }

    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Short maxBy(short[] arr_v, Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        if(arr_v.length == 0) {
            return null;
        }
        int v = arr_v[0];
        int v1 = ArraysKt___ArraysKt.getLastIndex(arr_v);
        if(v1 == 0) {
            return (short)v;
        }
        Comparable comparable0 = (Comparable)function10.invoke(((short)v));
        IntIterator intIterator0 = a.t(1, v1);
        while(intIterator0.hasNext()) {
            int v2 = arr_v[intIterator0.nextInt()];
            Comparable comparable1 = (Comparable)function10.invoke(((short)v2));
            if(comparable0.compareTo(comparable1) < 0) {
                v = v2;
                comparable0 = comparable1;
            }
        }
        return (short)v;
    }

    @Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Boolean maxWith(boolean[] arr_z, Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        return ArraysKt___ArraysKt.maxWithOrNull(arr_z, comparator0);
    }

    @Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Byte maxWith(byte[] arr_b, Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        return ArraysKt___ArraysKt.maxWithOrNull(arr_b, comparator0);
    }

    @Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Character maxWith(char[] arr_c, Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        return ArraysKt___ArraysKt.maxWithOrNull(arr_c, comparator0);
    }

    @Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Double maxWith(double[] arr_f, Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        return ArraysKt___ArraysKt.maxWithOrNull(arr_f, comparator0);
    }

    @Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Float maxWith(float[] arr_f, Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        return ArraysKt___ArraysKt.maxWithOrNull(arr_f, comparator0);
    }

    @Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Integer maxWith(int[] arr_v, Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        return ArraysKt___ArraysKt.maxWithOrNull(arr_v, comparator0);
    }

    @Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Long maxWith(long[] arr_v, Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        return ArraysKt___ArraysKt.maxWithOrNull(arr_v, comparator0);
    }

    @Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Object maxWith(Object[] arr_object, Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        return ArraysKt___ArraysKt.maxWithOrNull(arr_object, comparator0);
    }

    @Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Short maxWith(short[] arr_v, Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        return ArraysKt___ArraysKt.maxWithOrNull(arr_v, comparator0);
    }

    @Deprecated(message = "Use minOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Byte min(byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        return ArraysKt___ArraysKt.minOrNull(arr_b);
    }

    @Deprecated(message = "Use minOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Character min(char[] arr_c) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        return ArraysKt___ArraysKt.minOrNull(arr_c);
    }

    @Deprecated(message = "Use minOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Comparable min(Comparable[] arr_comparable) {
        Intrinsics.checkNotNullParameter(arr_comparable, "<this>");
        return ArraysKt___ArraysKt.minOrNull(arr_comparable);
    }

    @Deprecated(message = "Use minOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Double min(double[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        return ArraysKt___ArraysKt.minOrNull(arr_f);
    }

    @Deprecated(message = "Use minOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @SinceKotlin(version = "1.1")
    public static final Double min(Double[] arr_double) {
        Intrinsics.checkNotNullParameter(arr_double, "<this>");
        return ArraysKt___ArraysKt.minOrNull(arr_double);
    }

    @Deprecated(message = "Use minOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Float min(float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        return ArraysKt___ArraysKt.minOrNull(arr_f);
    }

    @Deprecated(message = "Use minOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @SinceKotlin(version = "1.1")
    public static final Float min(Float[] arr_float) {
        Intrinsics.checkNotNullParameter(arr_float, "<this>");
        return ArraysKt___ArraysKt.minOrNull(arr_float);
    }

    @Deprecated(message = "Use minOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Integer min(int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        return ArraysKt___ArraysKt.minOrNull(arr_v);
    }

    @Deprecated(message = "Use minOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Long min(long[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        return ArraysKt___ArraysKt.minOrNull(arr_v);
    }

    @Deprecated(message = "Use minOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Short min(short[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        return ArraysKt___ArraysKt.minOrNull(arr_v);
    }

    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Boolean minBy(boolean[] arr_z, Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        if(arr_z.length == 0) {
            return null;
        }
        boolean z = arr_z[0];
        int v = ArraysKt___ArraysKt.getLastIndex(arr_z);
        if(v == 0) {
            return Boolean.valueOf(z);
        }
        Comparable comparable0 = (Comparable)function10.invoke(Boolean.valueOf(z));
        IntIterator intIterator0 = a.t(1, v);
        while(intIterator0.hasNext()) {
            boolean z1 = arr_z[intIterator0.nextInt()];
            Comparable comparable1 = (Comparable)function10.invoke(Boolean.valueOf(z1));
            if(comparable0.compareTo(comparable1) > 0) {
                z = z1;
                comparable0 = comparable1;
            }
        }
        return Boolean.valueOf(z);
    }

    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Byte minBy(byte[] arr_b, Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        if(arr_b.length == 0) {
            return null;
        }
        int v = arr_b[0];
        int v1 = ArraysKt___ArraysKt.getLastIndex(arr_b);
        if(v1 == 0) {
            return (byte)v;
        }
        Comparable comparable0 = (Comparable)function10.invoke(((byte)v));
        IntIterator intIterator0 = a.t(1, v1);
        while(intIterator0.hasNext()) {
            int v2 = arr_b[intIterator0.nextInt()];
            Comparable comparable1 = (Comparable)function10.invoke(((byte)v2));
            if(comparable0.compareTo(comparable1) > 0) {
                v = v2;
                comparable0 = comparable1;
            }
        }
        return (byte)v;
    }

    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Character minBy(char[] arr_c, Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        if(arr_c.length == 0) {
            return null;
        }
        int v = arr_c[0];
        int v1 = ArraysKt___ArraysKt.getLastIndex(arr_c);
        if(v1 == 0) {
            return Character.valueOf(((char)v));
        }
        Comparable comparable0 = (Comparable)function10.invoke(Character.valueOf(((char)v)));
        IntIterator intIterator0 = a.t(1, v1);
        while(intIterator0.hasNext()) {
            int v2 = arr_c[intIterator0.nextInt()];
            Comparable comparable1 = (Comparable)function10.invoke(Character.valueOf(((char)v2)));
            if(comparable0.compareTo(comparable1) > 0) {
                v = v2;
                comparable0 = comparable1;
            }
        }
        return Character.valueOf(((char)v));
    }

    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Double minBy(double[] arr_f, Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        if(arr_f.length == 0) {
            return null;
        }
        double f = arr_f[0];
        int v = ArraysKt___ArraysKt.getLastIndex(arr_f);
        if(v == 0) {
            return f;
        }
        Comparable comparable0 = (Comparable)function10.invoke(f);
        IntIterator intIterator0 = a.t(1, v);
        while(intIterator0.hasNext()) {
            double f1 = arr_f[intIterator0.nextInt()];
            Comparable comparable1 = (Comparable)function10.invoke(f1);
            if(comparable0.compareTo(comparable1) > 0) {
                f = f1;
                comparable0 = comparable1;
            }
        }
        return f;
    }

    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Float minBy(float[] arr_f, Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        if(arr_f.length == 0) {
            return null;
        }
        float f = arr_f[0];
        int v = ArraysKt___ArraysKt.getLastIndex(arr_f);
        if(v == 0) {
            return f;
        }
        Comparable comparable0 = (Comparable)function10.invoke(f);
        IntIterator intIterator0 = a.t(1, v);
        while(intIterator0.hasNext()) {
            float f1 = arr_f[intIterator0.nextInt()];
            Comparable comparable1 = (Comparable)function10.invoke(f1);
            if(comparable0.compareTo(comparable1) > 0) {
                f = f1;
                comparable0 = comparable1;
            }
        }
        return f;
    }

    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Integer minBy(int[] arr_v, Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        if(arr_v.length == 0) {
            return null;
        }
        int v = arr_v[0];
        int v1 = ArraysKt___ArraysKt.getLastIndex(arr_v);
        if(v1 == 0) {
            return v;
        }
        Comparable comparable0 = (Comparable)function10.invoke(v);
        IntIterator intIterator0 = a.t(1, v1);
        while(intIterator0.hasNext()) {
            int v2 = arr_v[intIterator0.nextInt()];
            Comparable comparable1 = (Comparable)function10.invoke(v2);
            if(comparable0.compareTo(comparable1) > 0) {
                v = v2;
                comparable0 = comparable1;
            }
        }
        return v;
    }

    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Long minBy(long[] arr_v, Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        if(arr_v.length == 0) {
            return null;
        }
        long v = arr_v[0];
        int v1 = ArraysKt___ArraysKt.getLastIndex(arr_v);
        if(v1 == 0) {
            return v;
        }
        Comparable comparable0 = (Comparable)function10.invoke(v);
        IntIterator intIterator0 = a.t(1, v1);
        while(intIterator0.hasNext()) {
            long v2 = arr_v[intIterator0.nextInt()];
            Comparable comparable1 = (Comparable)function10.invoke(v2);
            if(comparable0.compareTo(comparable1) > 0) {
                v = v2;
                comparable0 = comparable1;
            }
        }
        return v;
    }

    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Object minBy(Object[] arr_object, Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        if(arr_object.length == 0) {
            return null;
        }
        Object object0 = arr_object[0];
        int v = ArraysKt___ArraysKt.getLastIndex(arr_object);
        if(v != 0) {
            Comparable comparable0 = (Comparable)function10.invoke(object0);
            IntIterator intIterator0 = a.t(1, v);
            while(intIterator0.hasNext()) {
                Object object1 = arr_object[intIterator0.nextInt()];
                Comparable comparable1 = (Comparable)function10.invoke(object1);
                if(comparable0.compareTo(comparable1) > 0) {
                    object0 = object1;
                    comparable0 = comparable1;
                }
            }
        }
        return object0;
    }

    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Short minBy(short[] arr_v, Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        if(arr_v.length == 0) {
            return null;
        }
        int v = arr_v[0];
        int v1 = ArraysKt___ArraysKt.getLastIndex(arr_v);
        if(v1 == 0) {
            return (short)v;
        }
        Comparable comparable0 = (Comparable)function10.invoke(((short)v));
        IntIterator intIterator0 = a.t(1, v1);
        while(intIterator0.hasNext()) {
            int v2 = arr_v[intIterator0.nextInt()];
            Comparable comparable1 = (Comparable)function10.invoke(((short)v2));
            if(comparable0.compareTo(comparable1) > 0) {
                v = v2;
                comparable0 = comparable1;
            }
        }
        return (short)v;
    }

    @Deprecated(message = "Use minWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Boolean minWith(boolean[] arr_z, Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        return ArraysKt___ArraysKt.minWithOrNull(arr_z, comparator0);
    }

    @Deprecated(message = "Use minWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Byte minWith(byte[] arr_b, Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        return ArraysKt___ArraysKt.minWithOrNull(arr_b, comparator0);
    }

    @Deprecated(message = "Use minWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Character minWith(char[] arr_c, Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        return ArraysKt___ArraysKt.minWithOrNull(arr_c, comparator0);
    }

    @Deprecated(message = "Use minWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Double minWith(double[] arr_f, Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        return ArraysKt___ArraysKt.minWithOrNull(arr_f, comparator0);
    }

    @Deprecated(message = "Use minWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Float minWith(float[] arr_f, Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        return ArraysKt___ArraysKt.minWithOrNull(arr_f, comparator0);
    }

    @Deprecated(message = "Use minWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Integer minWith(int[] arr_v, Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        return ArraysKt___ArraysKt.minWithOrNull(arr_v, comparator0);
    }

    @Deprecated(message = "Use minWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Long minWith(long[] arr_v, Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        return ArraysKt___ArraysKt.minWithOrNull(arr_v, comparator0);
    }

    @Deprecated(message = "Use minWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Object minWith(Object[] arr_object, Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        return ArraysKt___ArraysKt.minWithOrNull(arr_object, comparator0);
    }

    @Deprecated(message = "Use minWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Short minWith(short[] arr_v, Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        return ArraysKt___ArraysKt.minWithOrNull(arr_v, comparator0);
    }

    @NotNull
    public static final byte[] plus(@NotNull byte[] arr_b, byte b) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        byte[] arr_b1 = Arrays.copyOf(arr_b, arr_b.length + 1);
        arr_b1[arr_b.length] = b;
        Intrinsics.checkNotNull(arr_b1);
        return arr_b1;
    }

    @NotNull
    public static final byte[] plus(@NotNull byte[] arr_b, @NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "elements");
        int v = arr_b.length;
        byte[] arr_b1 = Arrays.copyOf(arr_b, collection0.size() + v);
        for(Object object0: collection0) {
            arr_b1[v] = ((Number)object0).byteValue();
            ++v;
        }
        Intrinsics.checkNotNull(arr_b1);
        return arr_b1;
    }

    @NotNull
    public static byte[] plus(@NotNull byte[] arr_b, @NotNull byte[] arr_b1) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(arr_b1, "elements");
        byte[] arr_b2 = Arrays.copyOf(arr_b, arr_b.length + arr_b1.length);
        System.arraycopy(arr_b1, 0, arr_b2, arr_b.length, arr_b1.length);
        Intrinsics.checkNotNull(arr_b2);
        return arr_b2;
    }

    @NotNull
    public static final char[] plus(@NotNull char[] arr_c, char c) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        char[] arr_c1 = Arrays.copyOf(arr_c, arr_c.length + 1);
        arr_c1[arr_c.length] = c;
        Intrinsics.checkNotNull(arr_c1);
        return arr_c1;
    }

    @NotNull
    public static final char[] plus(@NotNull char[] arr_c, @NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "elements");
        int v = arr_c.length;
        char[] arr_c1 = Arrays.copyOf(arr_c, collection0.size() + v);
        for(Object object0: collection0) {
            arr_c1[v] = ((Character)object0).charValue();
            ++v;
        }
        Intrinsics.checkNotNull(arr_c1);
        return arr_c1;
    }

    @NotNull
    public static final char[] plus(@NotNull char[] arr_c, @NotNull char[] arr_c1) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Intrinsics.checkNotNullParameter(arr_c1, "elements");
        char[] arr_c2 = Arrays.copyOf(arr_c, arr_c.length + arr_c1.length);
        System.arraycopy(arr_c1, 0, arr_c2, arr_c.length, arr_c1.length);
        Intrinsics.checkNotNull(arr_c2);
        return arr_c2;
    }

    @NotNull
    public static final double[] plus(@NotNull double[] arr_f, double f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        double[] arr_f1 = Arrays.copyOf(arr_f, arr_f.length + 1);
        arr_f1[arr_f.length] = f;
        Intrinsics.checkNotNull(arr_f1);
        return arr_f1;
    }

    @NotNull
    public static final double[] plus(@NotNull double[] arr_f, @NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "elements");
        int v = arr_f.length;
        double[] arr_f1 = Arrays.copyOf(arr_f, collection0.size() + v);
        for(Object object0: collection0) {
            arr_f1[v] = ((Number)object0).doubleValue();
            ++v;
        }
        Intrinsics.checkNotNull(arr_f1);
        return arr_f1;
    }

    @NotNull
    public static final double[] plus(@NotNull double[] arr_f, @NotNull double[] arr_f1) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(arr_f1, "elements");
        double[] arr_f2 = Arrays.copyOf(arr_f, arr_f.length + arr_f1.length);
        System.arraycopy(arr_f1, 0, arr_f2, arr_f.length, arr_f1.length);
        Intrinsics.checkNotNull(arr_f2);
        return arr_f2;
    }

    @NotNull
    public static final float[] plus(@NotNull float[] arr_f, float f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        float[] arr_f1 = Arrays.copyOf(arr_f, arr_f.length + 1);
        arr_f1[arr_f.length] = f;
        Intrinsics.checkNotNull(arr_f1);
        return arr_f1;
    }

    @NotNull
    public static final float[] plus(@NotNull float[] arr_f, @NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "elements");
        int v = arr_f.length;
        float[] arr_f1 = Arrays.copyOf(arr_f, collection0.size() + v);
        for(Object object0: collection0) {
            arr_f1[v] = ((Number)object0).floatValue();
            ++v;
        }
        Intrinsics.checkNotNull(arr_f1);
        return arr_f1;
    }

    @NotNull
    public static float[] plus(@NotNull float[] arr_f, @NotNull float[] arr_f1) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Intrinsics.checkNotNullParameter(arr_f1, "elements");
        float[] arr_f2 = Arrays.copyOf(arr_f, arr_f.length + arr_f1.length);
        System.arraycopy(arr_f1, 0, arr_f2, arr_f.length, arr_f1.length);
        Intrinsics.checkNotNull(arr_f2);
        return arr_f2;
    }

    @NotNull
    public static int[] plus(@NotNull int[] arr_v, int v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        int[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length + 1);
        arr_v1[arr_v.length] = v;
        Intrinsics.checkNotNull(arr_v1);
        return arr_v1;
    }

    @NotNull
    public static final int[] plus(@NotNull int[] arr_v, @NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "elements");
        int v = arr_v.length;
        int[] arr_v1 = Arrays.copyOf(arr_v, collection0.size() + v);
        for(Object object0: collection0) {
            arr_v1[v] = ((Number)object0).intValue();
            ++v;
        }
        Intrinsics.checkNotNull(arr_v1);
        return arr_v1;
    }

    @NotNull
    public static int[] plus(@NotNull int[] arr_v, @NotNull int[] arr_v1) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(arr_v1, "elements");
        int[] arr_v2 = Arrays.copyOf(arr_v, arr_v.length + arr_v1.length);
        System.arraycopy(arr_v1, 0, arr_v2, arr_v.length, arr_v1.length);
        Intrinsics.checkNotNull(arr_v2);
        return arr_v2;
    }

    @NotNull
    public static final long[] plus(@NotNull long[] arr_v, long v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        long[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length + 1);
        arr_v1[arr_v.length] = v;
        Intrinsics.checkNotNull(arr_v1);
        return arr_v1;
    }

    @NotNull
    public static final long[] plus(@NotNull long[] arr_v, @NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "elements");
        int v = arr_v.length;
        long[] arr_v1 = Arrays.copyOf(arr_v, collection0.size() + v);
        for(Object object0: collection0) {
            arr_v1[v] = ((Number)object0).longValue();
            ++v;
        }
        Intrinsics.checkNotNull(arr_v1);
        return arr_v1;
    }

    @NotNull
    public static long[] plus(@NotNull long[] arr_v, @NotNull long[] arr_v1) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(arr_v1, "elements");
        long[] arr_v2 = Arrays.copyOf(arr_v, arr_v.length + arr_v1.length);
        System.arraycopy(arr_v1, 0, arr_v2, arr_v.length, arr_v1.length);
        Intrinsics.checkNotNull(arr_v2);
        return arr_v2;
    }

    @NotNull
    public static Object[] plus(@NotNull Object[] arr_object, Object object0) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Object[] arr_object1 = Arrays.copyOf(arr_object, arr_object.length + 1);
        arr_object1[arr_object.length] = object0;
        Intrinsics.checkNotNull(arr_object1);
        return arr_object1;
    }

    @NotNull
    public static final Object[] plus(@NotNull Object[] arr_object, @NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "elements");
        int v = arr_object.length;
        Object[] arr_object1 = Arrays.copyOf(arr_object, collection0.size() + v);
        for(Object object0: collection0) {
            arr_object1[v] = object0;
            ++v;
        }
        Intrinsics.checkNotNull(arr_object1);
        return arr_object1;
    }

    @NotNull
    public static Object[] plus(@NotNull Object[] arr_object, @NotNull Object[] arr_object1) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(arr_object1, "elements");
        Object[] arr_object2 = Arrays.copyOf(arr_object, arr_object.length + arr_object1.length);
        System.arraycopy(arr_object1, 0, arr_object2, arr_object.length, arr_object1.length);
        Intrinsics.checkNotNull(arr_object2);
        return arr_object2;
    }

    @NotNull
    public static final short[] plus(@NotNull short[] arr_v, @NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "elements");
        int v = arr_v.length;
        short[] arr_v1 = Arrays.copyOf(arr_v, collection0.size() + v);
        for(Object object0: collection0) {
            arr_v1[v] = ((Number)object0).shortValue();
            ++v;
        }
        Intrinsics.checkNotNull(arr_v1);
        return arr_v1;
    }

    @NotNull
    public static final short[] plus(@NotNull short[] arr_v, short v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        short[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length + 1);
        arr_v1[arr_v.length] = v;
        Intrinsics.checkNotNull(arr_v1);
        return arr_v1;
    }

    @NotNull
    public static final short[] plus(@NotNull short[] arr_v, @NotNull short[] arr_v1) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Intrinsics.checkNotNullParameter(arr_v1, "elements");
        short[] arr_v2 = Arrays.copyOf(arr_v, arr_v.length + arr_v1.length);
        System.arraycopy(arr_v1, 0, arr_v2, arr_v.length, arr_v1.length);
        Intrinsics.checkNotNull(arr_v2);
        return arr_v2;
    }

    @NotNull
    public static final boolean[] plus(@NotNull boolean[] arr_z, @NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "elements");
        int v = arr_z.length;
        boolean[] arr_z1 = Arrays.copyOf(arr_z, collection0.size() + v);
        for(Object object0: collection0) {
            arr_z1[v] = ((Boolean)object0).booleanValue();
            ++v;
        }
        Intrinsics.checkNotNull(arr_z1);
        return arr_z1;
    }

    @NotNull
    public static final boolean[] plus(@NotNull boolean[] arr_z, boolean z) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        boolean[] arr_z1 = Arrays.copyOf(arr_z, arr_z.length + 1);
        arr_z1[arr_z.length] = z;
        Intrinsics.checkNotNull(arr_z1);
        return arr_z1;
    }

    @NotNull
    public static boolean[] plus(@NotNull boolean[] arr_z, @NotNull boolean[] arr_z1) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Intrinsics.checkNotNullParameter(arr_z1, "elements");
        boolean[] arr_z2 = Arrays.copyOf(arr_z, arr_z.length + arr_z1.length);
        System.arraycopy(arr_z1, 0, arr_z2, arr_z.length, arr_z1.length);
        Intrinsics.checkNotNull(arr_z2);
        return arr_z2;
    }

    public static final void sort(@NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        if(arr_b.length > 1) {
            Arrays.sort(arr_b);
        }
    }

    public static final void sort(@NotNull byte[] arr_b, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Arrays.sort(arr_b, v, v1);
    }

    public static final void sort(@NotNull char[] arr_c) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        if(arr_c.length > 1) {
            Arrays.sort(arr_c);
        }
    }

    public static final void sort(@NotNull char[] arr_c, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Arrays.sort(arr_c, v, v1);
    }

    public static final void sort(@NotNull double[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        if(arr_f.length > 1) {
            Arrays.sort(arr_f);
        }
    }

    public static final void sort(@NotNull double[] arr_f, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Arrays.sort(arr_f, v, v1);
    }

    public static final void sort(@NotNull float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        if(arr_f.length > 1) {
            Arrays.sort(arr_f);
        }
    }

    public static void sort(@NotNull float[] arr_f, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Arrays.sort(arr_f, v, v1);
    }

    public static final void sort(@NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        if(arr_v.length > 1) {
            Arrays.sort(arr_v);
        }
    }

    public static void sort(@NotNull int[] arr_v, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Arrays.sort(arr_v, v, v1);
    }

    public static final void sort(@NotNull long[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        if(arr_v.length > 1) {
            Arrays.sort(arr_v);
        }
    }

    public static void sort(@NotNull long[] arr_v, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Arrays.sort(arr_v, v, v1);
    }

    @SinceKotlin(version = "1.4")
    public static final void sort(@NotNull Comparable[] arr_comparable, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_comparable, "<this>");
        Arrays.sort(arr_comparable, v, v1);
    }

    public static void sort(@NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        if(arr_object.length > 1) {
            Arrays.sort(arr_object);
        }
    }

    public static final void sort(@NotNull Object[] arr_object, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Arrays.sort(arr_object, v, v1);
    }

    public static final void sort(@NotNull short[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        if(arr_v.length > 1) {
            Arrays.sort(arr_v);
        }
    }

    public static final void sort(@NotNull short[] arr_v, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Arrays.sort(arr_v, v, v1);
    }

    public static void sort$default(byte[] arr_b, int v, int v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = 0;
        }
        if((v2 & 2) != 0) {
            v1 = arr_b.length;
        }
        ArraysKt___ArraysJvmKt.sort(arr_b, v, v1);
    }

    public static void sort$default(char[] arr_c, int v, int v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = 0;
        }
        if((v2 & 2) != 0) {
            v1 = arr_c.length;
        }
        ArraysKt___ArraysJvmKt.sort(arr_c, v, v1);
    }

    public static void sort$default(double[] arr_f, int v, int v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = 0;
        }
        if((v2 & 2) != 0) {
            v1 = arr_f.length;
        }
        ArraysKt___ArraysJvmKt.sort(arr_f, v, v1);
    }

    public static void sort$default(float[] arr_f, int v, int v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = 0;
        }
        if((v2 & 2) != 0) {
            v1 = arr_f.length;
        }
        ArraysKt___ArraysJvmKt.sort(arr_f, v, v1);
    }

    public static void sort$default(int[] arr_v, int v, int v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = 0;
        }
        if((v2 & 2) != 0) {
            v1 = arr_v.length;
        }
        ArraysKt___ArraysJvmKt.sort(arr_v, v, v1);
    }

    public static void sort$default(long[] arr_v, int v, int v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = 0;
        }
        if((v2 & 2) != 0) {
            v1 = arr_v.length;
        }
        ArraysKt___ArraysJvmKt.sort(arr_v, v, v1);
    }

    public static void sort$default(Comparable[] arr_comparable, int v, int v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = 0;
        }
        if((v2 & 2) != 0) {
            v1 = arr_comparable.length;
        }
        ArraysKt___ArraysJvmKt.sort(arr_comparable, v, v1);
    }

    public static void sort$default(Object[] arr_object, int v, int v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = 0;
        }
        if((v2 & 2) != 0) {
            v1 = arr_object.length;
        }
        ArraysKt___ArraysJvmKt.sort(arr_object, v, v1);
    }

    public static void sort$default(short[] arr_v, int v, int v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = 0;
        }
        if((v2 & 2) != 0) {
            v1 = arr_v.length;
        }
        ArraysKt___ArraysJvmKt.sort(arr_v, v, v1);
    }

    public static final void sortWith(@NotNull Object[] arr_object, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        if(arr_object.length > 1) {
            Arrays.sort(arr_object, comparator0);
        }
    }

    public static void sortWith(@NotNull Object[] arr_object, @NotNull Comparator comparator0, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        Arrays.sort(arr_object, v, v1, comparator0);
    }

    public static void sortWith$default(Object[] arr_object, Comparator comparator0, int v, int v1, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v = 0;
        }
        if((v2 & 4) != 0) {
            v1 = arr_object.length;
        }
        ArraysKt___ArraysJvmKt.sortWith(arr_object, comparator0, v, v1);
    }

    @NotNull
    public static final SortedSet toSortedSet(@NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        return (SortedSet)ArraysKt___ArraysKt.toCollection(arr_b, new TreeSet());
    }

    @NotNull
    public static final SortedSet toSortedSet(@NotNull char[] arr_c) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        return (SortedSet)ArraysKt___ArraysKt.toCollection(arr_c, new TreeSet());
    }

    @NotNull
    public static final SortedSet toSortedSet(@NotNull double[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        return (SortedSet)ArraysKt___ArraysKt.toCollection(arr_f, new TreeSet());
    }

    @NotNull
    public static final SortedSet toSortedSet(@NotNull float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        return (SortedSet)ArraysKt___ArraysKt.toCollection(arr_f, new TreeSet());
    }

    @NotNull
    public static final SortedSet toSortedSet(@NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        return (SortedSet)ArraysKt___ArraysKt.toCollection(arr_v, new TreeSet());
    }

    @NotNull
    public static final SortedSet toSortedSet(@NotNull long[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        return (SortedSet)ArraysKt___ArraysKt.toCollection(arr_v, new TreeSet());
    }

    @NotNull
    public static final SortedSet toSortedSet(@NotNull Comparable[] arr_comparable) {
        Intrinsics.checkNotNullParameter(arr_comparable, "<this>");
        return (SortedSet)ArraysKt___ArraysKt.toCollection(arr_comparable, new TreeSet());
    }

    @NotNull
    public static final SortedSet toSortedSet(@NotNull Object[] arr_object, @NotNull Comparator comparator0) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        return (SortedSet)ArraysKt___ArraysKt.toCollection(arr_object, new TreeSet(comparator0));
    }

    @NotNull
    public static final SortedSet toSortedSet(@NotNull short[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        return (SortedSet)ArraysKt___ArraysKt.toCollection(arr_v, new TreeSet());
    }

    @NotNull
    public static final SortedSet toSortedSet(@NotNull boolean[] arr_z) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        return (SortedSet)ArraysKt___ArraysKt.toCollection(arr_z, new TreeSet());
    }

    @NotNull
    public static Boolean[] toTypedArray(@NotNull boolean[] arr_z) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        Boolean[] arr_boolean = new Boolean[arr_z.length];
        for(int v = 0; v < arr_z.length; ++v) {
            arr_boolean[v] = Boolean.valueOf(arr_z[v]);
        }
        return arr_boolean;
    }

    @NotNull
    public static final Byte[] toTypedArray(@NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Byte[] arr_byte = new Byte[arr_b.length];
        for(int v = 0; v < arr_b.length; ++v) {
            arr_byte[v] = (byte)arr_b[v];
        }
        return arr_byte;
    }

    @NotNull
    public static final Character[] toTypedArray(@NotNull char[] arr_c) {
        Intrinsics.checkNotNullParameter(arr_c, "<this>");
        Character[] arr_character = new Character[arr_c.length];
        for(int v = 0; v < arr_c.length; ++v) {
            arr_character[v] = Character.valueOf(arr_c[v]);
        }
        return arr_character;
    }

    @NotNull
    public static final Double[] toTypedArray(@NotNull double[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Double[] arr_double = new Double[arr_f.length];
        for(int v = 0; v < arr_f.length; ++v) {
            arr_double[v] = (double)arr_f[v];
        }
        return arr_double;
    }

    @NotNull
    public static Float[] toTypedArray(@NotNull float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<this>");
        Float[] arr_float = new Float[arr_f.length];
        for(int v = 0; v < arr_f.length; ++v) {
            arr_float[v] = (float)arr_f[v];
        }
        return arr_float;
    }

    @NotNull
    public static Integer[] toTypedArray(@NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Integer[] arr_integer = new Integer[arr_v.length];
        for(int v = 0; v < arr_v.length; ++v) {
            arr_integer[v] = (int)arr_v[v];
        }
        return arr_integer;
    }

    @NotNull
    public static Long[] toTypedArray(@NotNull long[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Long[] arr_long = new Long[arr_v.length];
        for(int v = 0; v < arr_v.length; ++v) {
            arr_long[v] = (long)arr_v[v];
        }
        return arr_long;
    }

    @NotNull
    public static final Short[] toTypedArray(@NotNull short[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        Short[] arr_short = new Short[arr_v.length];
        for(int v = 0; v < arr_v.length; ++v) {
            arr_short[v] = (short)arr_v[v];
        }
        return arr_short;
    }
}

