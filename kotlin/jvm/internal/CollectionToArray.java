package kotlin.jvm.internal;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u001E\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0006\u001A#\u0010\u0006\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\n\u0010\u0001\u001A\u0006\u0012\u0002\b\u00030\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001A5\u0010\u0006\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\n\u0010\u0001\u001A\u0006\u0012\u0002\b\u00030\u00002\u0010\u0010\u0007\u001A\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"", "collection", "", "", "toArray", "(Ljava/util/Collection;)[Ljava/lang/Object;", "collectionToArray", "a", "(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@JvmName(name = "CollectionToArray")
@SourceDebugExtension({"SMAP\nCollectionToArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionToArray.kt\nkotlin/jvm/internal/CollectionToArray\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,88:1\n63#1,22:89\n63#1,22:111\n26#2:133\n*S KotlinDebug\n*F\n+ 1 CollectionToArray.kt\nkotlin/jvm/internal/CollectionToArray\n*L\n22#1:89,22\n37#1:111,22\n14#1:133\n*E\n"})
public final class CollectionToArray {
    public static final Object[] a;

    static {
        CollectionToArray.a = new Object[0];
    }

    @Deprecated(message = "This function will be made internal in a future release")
    @DeprecatedSinceKotlin(warningSince = "1.9")
    @JvmName(name = "toArray")
    @NotNull
    public static final Object[] toArray(@NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "collection");
        int v = collection0.size();
        Object[] arr_object = CollectionToArray.a;
        if(v != 0) {
            Iterator iterator0 = collection0.iterator();
            if(iterator0.hasNext()) {
                arr_object = new Object[v];
                for(int v1 = 0; true; ++v1) {
                    Object object0 = iterator0.next();
                    arr_object[v1] = object0;
                    if(v1 + 1 >= arr_object.length) {
                        if(!iterator0.hasNext()) {
                            break;
                        }
                        int v2 = (v1 + 1) * 3 + 1 >>> 1;
                        if(v2 <= v1 + 1 && v1 + 1 >= 0x7FFFFFFD) {
                            throw new OutOfMemoryError();
                        }
                        arr_object = Arrays.copyOf(arr_object, v2);
                        Intrinsics.checkNotNullExpressionValue(arr_object, "copyOf(...)");
                    }
                    else if(!iterator0.hasNext()) {
                        arr_object = Arrays.copyOf(arr_object, v1 + 1);
                        Intrinsics.checkNotNullExpressionValue(arr_object, "copyOf(...)");
                        return arr_object;
                    }
                }
            }
        }
        return arr_object;
    }

    @Deprecated(message = "This function will be made internal in a future release")
    @DeprecatedSinceKotlin(warningSince = "1.9")
    @JvmName(name = "toArray")
    @NotNull
    public static final Object[] toArray(@NotNull Collection collection0, @Nullable Object[] arr_object) {
        Object[] arr_object1;
        Intrinsics.checkNotNullParameter(collection0, "collection");
        arr_object.getClass();
        int v = collection0.size();
        if(v == 0) {
            if(arr_object.length <= 0) {
                return arr_object;
            }
            arr_object[0] = null;
            return arr_object;
        }
        Iterator iterator0 = collection0.iterator();
        if(!iterator0.hasNext()) {
            if(arr_object.length <= 0) {
                return arr_object;
            }
            arr_object[0] = null;
            return arr_object;
        }
        if(v <= arr_object.length) {
            arr_object1 = arr_object;
        }
        else {
            Object object0 = Array.newInstance(arr_object.getClass().getComponentType(), v);
            Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            arr_object1 = (Object[])object0;
        }
        for(int v1 = 0; true; ++v1) {
            Object object1 = iterator0.next();
            arr_object1[v1] = object1;
            if(v1 + 1 >= arr_object1.length) {
                if(!iterator0.hasNext()) {
                    return arr_object1;
                }
                int v2 = (v1 + 1) * 3 + 1 >>> 1;
                if(v2 <= v1 + 1 && v1 + 1 >= 0x7FFFFFFD) {
                    throw new OutOfMemoryError();
                }
                arr_object1 = Arrays.copyOf(arr_object1, v2);
                Intrinsics.checkNotNullExpressionValue(arr_object1, "copyOf(...)");
            }
            else if(!iterator0.hasNext()) {
                if(arr_object1 == arr_object) {
                    arr_object[v1 + 1] = null;
                    return arr_object;
                }
                arr_object = Arrays.copyOf(arr_object1, v1 + 1);
                Intrinsics.checkNotNullExpressionValue(arr_object, "copyOf(...)");
                return arr_object;
            }
        }
    }
}

