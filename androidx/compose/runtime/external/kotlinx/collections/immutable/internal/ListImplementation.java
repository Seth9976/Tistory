package androidx.compose.runtime.external.kotlinx.collections.immutable.internal;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u001E\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001J\u001F\u0010\b\u001A\u00020\u00052\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001F\u0010\n\u001A\u00020\u00052\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u0002H\u0001¢\u0006\u0004\b\t\u0010\u0007J\'\u0010\u000F\u001A\u00020\u00052\u0006\u0010\u000B\u001A\u00020\u00022\u0006\u0010\f\u001A\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u0002H\u0001¢\u0006\u0004\b\r\u0010\u000EJ\u001B\u0010\u0014\u001A\u00020\u00022\n\u0010\u0011\u001A\u0006\u0012\u0002\b\u00030\u0010H\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\'\u0010\u0019\u001A\u00020\u00162\n\u0010\u0011\u001A\u0006\u0012\u0002\b\u00030\u00102\n\u0010\u0015\u001A\u0006\u0012\u0002\b\u00030\u0010H\u0001¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u001A"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/ListImplementation;", "", "", "index", "size", "", "checkElementIndex$runtime_release", "(II)V", "checkElementIndex", "checkPositionIndex$runtime_release", "checkPositionIndex", "fromIndex", "toIndex", "checkRangeIndexes$runtime_release", "(III)V", "checkRangeIndexes", "", "c", "orderedHashCode$runtime_release", "(Ljava/util/Collection;)I", "orderedHashCode", "other", "", "orderedEquals$runtime_release", "(Ljava/util/Collection;Ljava/util/Collection;)Z", "orderedEquals", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ListImplementation {
    public static final int $stable;
    @NotNull
    public static final ListImplementation INSTANCE;

    static {
        ListImplementation.INSTANCE = new ListImplementation();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @JvmStatic
    public static final void checkElementIndex$runtime_release(int v, int v1) {
        if(v < 0 || v >= v1) {
            throw new IndexOutOfBoundsException("index: " + v + ", size: " + v1);
        }
    }

    @JvmStatic
    public static final void checkPositionIndex$runtime_release(int v, int v1) {
        if(v < 0 || v > v1) {
            throw new IndexOutOfBoundsException("index: " + v + ", size: " + v1);
        }
    }

    @JvmStatic
    public static final void checkRangeIndexes$runtime_release(int v, int v1, int v2) {
        if(v >= 0 && v1 <= v2) {
            if(v > v1) {
                throw new IllegalArgumentException("fromIndex: " + v + " > toIndex: " + v1);
            }
            return;
        }
        StringBuilder stringBuilder0 = q.u("fromIndex: ", v, ", toIndex: ", v1, ", size: ");
        stringBuilder0.append(v2);
        throw new IndexOutOfBoundsException(stringBuilder0.toString());
    }

    @JvmStatic
    public static final boolean orderedEquals$runtime_release(@NotNull Collection collection0, @NotNull Collection collection1) {
        if(collection0.size() != collection1.size()) {
            return false;
        }
        Iterator iterator0 = collection1.iterator();
        for(Object object0: collection0) {
            Object object1 = iterator0.next();
            if(!Intrinsics.areEqual(object0, object1)) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    @JvmStatic
    public static final int orderedHashCode$runtime_release(@NotNull Collection collection0) {
        int v = 1;
        for(Object object0: collection0) {
            v = v * 0x1F + (object0 == null ? 0 : object0.hashCode());
        }
        return v;
    }
}

