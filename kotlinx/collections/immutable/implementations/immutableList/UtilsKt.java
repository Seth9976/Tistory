package kotlinx.collections.immutable.implementations.immutableList;

import kotlin.Metadata;
import kotlinx.collections.immutable.PersistentList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001E\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0005\u001A\u0018\u0010\u0005\u001A\u00020\u00012\u0006\u0010\u0006\u001A\u00020\u00012\u0006\u0010\u0007\u001A\u00020\u0001H\u0000\u001A\u0014\u0010\b\u001A\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\nH\u0000\u001A\u001F\u0010\u000B\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f2\b\u0010\u000E\u001A\u0004\u0018\u00010\rH\u0000¢\u0006\u0002\u0010\u000F\u001A\u0010\u0010\u0010\u001A\u00020\u00012\u0006\u0010\u0011\u001A\u00020\u0001H\u0000\"\u000E\u0010\u0000\u001A\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000E\u0010\u0002\u001A\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000E\u0010\u0003\u001A\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000E\u0010\u0004\u001A\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"LOG_MAX_BUFFER_SIZE", "", "MAX_BUFFER_SIZE", "MAX_BUFFER_SIZE_MINUS_ONE", "MUTABLE_BUFFER_SIZE", "indexSegment", "index", "shift", "persistentVectorOf", "Lkotlinx/collections/immutable/PersistentList;", "E", "presizedBufferWith", "", "", "element", "(Ljava/lang/Object;)[Ljava/lang/Object;", "rootSize", "vectorSize", "kotlinx-collections-immutable"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class UtilsKt {
    public static final int LOG_MAX_BUFFER_SIZE = 5;
    public static final int MAX_BUFFER_SIZE = 0x20;
    public static final int MAX_BUFFER_SIZE_MINUS_ONE = 0x1F;
    public static final int MUTABLE_BUFFER_SIZE = 33;

    public static final int indexSegment(int v, int v1) [...] // Inlined contents

    @NotNull
    public static final PersistentList persistentVectorOf() {
        return SmallPersistentVector.Companion.getEMPTY();
    }

    @NotNull
    public static final Object[] presizedBufferWith(@Nullable Object object0) {
        Object[] arr_object = new Object[0x20];
        arr_object[0] = object0;
        return arr_object;
    }

    public static final int rootSize(int v) [...] // Inlined contents
}

