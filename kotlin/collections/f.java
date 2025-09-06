package kotlin.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.TuplesKt;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShortArray;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;
import od.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class f extends e {
    public static final void a(Object[] arr_object, StringBuilder stringBuilder0, ArrayList arrayList0) {
        if(arrayList0.contains(arr_object)) {
            stringBuilder0.append("[...]");
            return;
        }
        arrayList0.add(arr_object);
        stringBuilder0.append('[');
        for(int v = 0; v < arr_object.length; ++v) {
            if(v != 0) {
                stringBuilder0.append(", ");
            }
            Object object0 = arr_object[v];
            if(object0 == null) {
                stringBuilder0.append("null");
            }
            else if(object0 instanceof Object[]) {
                f.a(((Object[])object0), stringBuilder0, arrayList0);
            }
            else if(object0 instanceof byte[]) {
                String s = Arrays.toString(((byte[])object0));
                Intrinsics.checkNotNullExpressionValue(s, "toString(...)");
                stringBuilder0.append(s);
            }
            else if(object0 instanceof short[]) {
                String s1 = Arrays.toString(((short[])object0));
                Intrinsics.checkNotNullExpressionValue(s1, "toString(...)");
                stringBuilder0.append(s1);
            }
            else if(object0 instanceof int[]) {
                String s2 = Arrays.toString(((int[])object0));
                Intrinsics.checkNotNullExpressionValue(s2, "toString(...)");
                stringBuilder0.append(s2);
            }
            else if(object0 instanceof long[]) {
                String s3 = Arrays.toString(((long[])object0));
                Intrinsics.checkNotNullExpressionValue(s3, "toString(...)");
                stringBuilder0.append(s3);
            }
            else if(object0 instanceof float[]) {
                String s4 = Arrays.toString(((float[])object0));
                Intrinsics.checkNotNullExpressionValue(s4, "toString(...)");
                stringBuilder0.append(s4);
            }
            else if(object0 instanceof double[]) {
                String s5 = Arrays.toString(((double[])object0));
                Intrinsics.checkNotNullExpressionValue(s5, "toString(...)");
                stringBuilder0.append(s5);
            }
            else if(object0 instanceof char[]) {
                String s6 = Arrays.toString(((char[])object0));
                Intrinsics.checkNotNullExpressionValue(s6, "toString(...)");
                stringBuilder0.append(s6);
            }
            else if(object0 instanceof boolean[]) {
                String s7 = Arrays.toString(((boolean[])object0));
                Intrinsics.checkNotNullExpressionValue(s7, "toString(...)");
                stringBuilder0.append(s7);
            }
            else if(object0 instanceof UByteArray) {
                stringBuilder0.append(a.contentToString-2csIQuQ(((UByteArray)object0).unbox-impl()));
            }
            else if(object0 instanceof UShortArray) {
                stringBuilder0.append(a.contentToString-d-6D3K8(((UShortArray)object0).unbox-impl()));
            }
            else if(object0 instanceof UIntArray) {
                stringBuilder0.append(a.contentToString-XUkPCBk(((UIntArray)object0).unbox-impl()));
            }
            else if(object0 instanceof ULongArray) {
                stringBuilder0.append(a.contentToString-uLth9ew(((ULongArray)object0).unbox-impl()));
            }
            else {
                stringBuilder0.append(object0.toString());
            }
        }
        stringBuilder0.append(']');
        arrayList0.remove(CollectionsKt__CollectionsKt.getLastIndex(arrayList0));
    }

    @PublishedApi
    @SinceKotlin(version = "1.3")
    @JvmName(name = "contentDeepEquals")
    public static boolean contentDeepEquals(@Nullable Object[] arr_object, @Nullable Object[] arr_object1) {
        if(arr_object == arr_object1) {
            return true;
        }
        if(arr_object != null && arr_object1 != null && arr_object.length == arr_object1.length) {
            for(int v = 0; v < arr_object.length; ++v) {
                Object object0 = arr_object[v];
                Object object1 = arr_object1[v];
                if(object0 != object1) {
                    if(object0 == null || object1 == null) {
                        return false;
                    }
                    if(object0 instanceof Object[] && object1 instanceof Object[]) {
                        if(!f.contentDeepEquals(((Object[])object0), ((Object[])object1))) {
                            return false;
                        }
                    }
                    else if(object0 instanceof byte[] && object1 instanceof byte[]) {
                        if(!Arrays.equals(((byte[])object0), ((byte[])object1))) {
                            return false;
                        }
                    }
                    else if(object0 instanceof short[] && object1 instanceof short[]) {
                        if(!Arrays.equals(((short[])object0), ((short[])object1))) {
                            return false;
                        }
                    }
                    else if(object0 instanceof int[] && object1 instanceof int[]) {
                        if(!Arrays.equals(((int[])object0), ((int[])object1))) {
                            return false;
                        }
                    }
                    else if(object0 instanceof long[] && object1 instanceof long[]) {
                        if(!Arrays.equals(((long[])object0), ((long[])object1))) {
                            return false;
                        }
                    }
                    else if(object0 instanceof float[] && object1 instanceof float[]) {
                        if(!Arrays.equals(((float[])object0), ((float[])object1))) {
                            return false;
                        }
                    }
                    else if(object0 instanceof double[] && object1 instanceof double[]) {
                        if(!Arrays.equals(((double[])object0), ((double[])object1))) {
                            return false;
                        }
                    }
                    else if(object0 instanceof char[] && object1 instanceof char[]) {
                        if(!Arrays.equals(((char[])object0), ((char[])object1))) {
                            return false;
                        }
                    }
                    else if(object0 instanceof boolean[] && object1 instanceof boolean[]) {
                        if(!Arrays.equals(((boolean[])object0), ((boolean[])object1))) {
                            return false;
                        }
                    }
                    else if(object0 instanceof UByteArray && object1 instanceof UByteArray) {
                        if(!a.contentEquals-kV0jMPg(((UByteArray)object0).unbox-impl(), ((UByteArray)object1).unbox-impl())) {
                            return false;
                        }
                    }
                    else if(object0 instanceof UShortArray && object1 instanceof UShortArray) {
                        if(!a.contentEquals-FGO6Aew(((UShortArray)object0).unbox-impl(), ((UShortArray)object1).unbox-impl())) {
                            return false;
                        }
                    }
                    else if(object0 instanceof UIntArray && object1 instanceof UIntArray) {
                        if(!a.contentEquals-KJPZfPQ(((UIntArray)object0).unbox-impl(), ((UIntArray)object1).unbox-impl())) {
                            return false;
                        }
                    }
                    else if(object0 instanceof ULongArray && object1 instanceof ULongArray) {
                        if(!a.contentEquals-lec5QzE(((ULongArray)object0).unbox-impl(), ((ULongArray)object1).unbox-impl())) {
                            return false;
                        }
                    }
                    else if(!Intrinsics.areEqual(object0, object1)) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    @PublishedApi
    @SinceKotlin(version = "1.3")
    @JvmName(name = "contentDeepToString")
    @NotNull
    public static final String contentDeepToString(@Nullable Object[] arr_object) {
        if(arr_object == null) {
            return "null";
        }
        StringBuilder stringBuilder0 = new StringBuilder(c.coerceAtMost(arr_object.length, 0x19999999) * 5 + 2);
        f.a(arr_object, stringBuilder0, new ArrayList());
        String s = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s, "toString(...)");
        return s;
    }

    @NotNull
    public static final List flatten(@NotNull Object[][] arr2_object) {
        Intrinsics.checkNotNullParameter(arr2_object, "<this>");
        int v2 = 0;
        for(int v1 = 0; v1 < arr2_object.length; ++v1) {
            v2 += arr2_object[v1].length;
        }
        List list0 = new ArrayList(v2);
        for(int v = 0; v < arr2_object.length; ++v) {
            o.addAll(list0, arr2_object[v]);
        }
        return list0;
    }

    @NotNull
    public static final Pair unzip(@NotNull Pair[] arr_pair) {
        Intrinsics.checkNotNullParameter(arr_pair, "<this>");
        ArrayList arrayList0 = new ArrayList(arr_pair.length);
        ArrayList arrayList1 = new ArrayList(arr_pair.length);
        for(int v = 0; v < arr_pair.length; ++v) {
            Pair pair0 = arr_pair[v];
            arrayList0.add(pair0.getFirst());
            arrayList1.add(pair0.getSecond());
        }
        return TuplesKt.to(arrayList0, arrayList1);
    }
}

