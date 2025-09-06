package kotlin.collections.builders;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0007\u001A#\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001A\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001A-\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0007\u001A\u00020\u0001H\u0000¢\u0006\u0004\b\b\u0010\t\u001A\'\u0010\f\u001A\u00020\u000B\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\n\u001A\u00020\u0001H\u0000¢\u0006\u0004\b\f\u0010\r\u001A/\u0010\u0010\u001A\u00020\u000B\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u000E\u001A\u00020\u00012\u0006\u0010\u000F\u001A\u00020\u0001H\u0000¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"E", "", "size", "", "arrayOfUninitializedElements", "(I)[Ljava/lang/Object;", "T", "newSize", "copyOfUninitializedElements", "([Ljava/lang/Object;I)[Ljava/lang/Object;", "index", "", "resetAt", "([Ljava/lang/Object;I)V", "fromIndex", "toIndex", "resetRange", "([Ljava/lang/Object;II)V", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/ListBuilderKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,487:1\n1#2:488\n*E\n"})
public final class ListBuilderKt {
    public static final boolean access$subarrayContentEquals(Object[] arr_object, int v, int v1, List list0) {
        if(v1 == list0.size()) {
            for(int v2 = 0; v2 < v1; ++v2) {
                if(!Intrinsics.areEqual(arr_object[v + v2], list0.get(v2))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static final int access$subarrayContentHashCode(Object[] arr_object, int v, int v1) {
        int v2 = 1;
        for(int v3 = 0; v3 < v1; ++v3) {
            Object object0 = arr_object[v + v3];
            v2 = v2 * 0x1F + (object0 == null ? 0 : object0.hashCode());
        }
        return v2;
    }

    public static final String access$subarrayContentToString(Object[] arr_object, int v, int v1, Collection collection0) {
        StringBuilder stringBuilder0 = new StringBuilder(v1 * 3 + 2);
        stringBuilder0.append("[");
        for(int v2 = 0; v2 < v1; ++v2) {
            if(v2 > 0) {
                stringBuilder0.append(", ");
            }
            Object object0 = arr_object[v + v2];
            if(object0 == collection0) {
                stringBuilder0.append("(this Collection)");
            }
            else {
                stringBuilder0.append(object0);
            }
        }
        stringBuilder0.append("]");
        String s = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s, "toString(...)");
        return s;
    }

    @NotNull
    public static final Object[] arrayOfUninitializedElements(int v) {
        if(v < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        return new Object[v];
    }

    @NotNull
    public static final Object[] copyOfUninitializedElements(@NotNull Object[] arr_object, int v) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        Object[] arr_object1 = Arrays.copyOf(arr_object, v);
        Intrinsics.checkNotNullExpressionValue(arr_object1, "copyOf(...)");
        return arr_object1;
    }

    public static final void resetAt(@NotNull Object[] arr_object, int v) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        arr_object[v] = null;
    }

    public static final void resetRange(@NotNull Object[] arr_object, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        while(v < v1) {
            ListBuilderKt.resetAt(arr_object, v);
            ++v;
        }
    }
}

