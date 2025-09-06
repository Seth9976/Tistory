package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record;
import org.jetbrains.annotations.NotNull;

public final class JvmNameResolverKt {
    @NotNull
    public static final List toExpandedRecordsList(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "<this>");
        List list1 = new ArrayList();
        ((ArrayList)list1).ensureCapacity(list0.size());
        for(Object object0: list0) {
            Record jvmProtoBuf$StringTableTypes$Record0 = (Record)object0;
            int v = jvmProtoBuf$StringTableTypes$Record0.getRange();
            for(int v1 = 0; v1 < v; ++v1) {
                ((ArrayList)list1).add(jvmProtoBuf$StringTableTypes$Record0);
            }
        }
        ((ArrayList)list1).trimToSize();
        return list1;
    }
}

