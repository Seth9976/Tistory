package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nJvmNameResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmNameResolver.kt\norg/jetbrains/kotlin/metadata/jvm/deserialization/JvmNameResolver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,34:1\n1#2:35\n*E\n"})
public final class JvmNameResolver extends JvmNameResolverBase {
    public JvmNameResolver(@NotNull StringTableTypes jvmProtoBuf$StringTableTypes0, @NotNull String[] arr_s) {
        Intrinsics.checkNotNullParameter(jvmProtoBuf$StringTableTypes0, "types");
        Set set0;
        Intrinsics.checkNotNullParameter(arr_s, "strings");
        List list0 = jvmProtoBuf$StringTableTypes0.getLocalNameList();
        if(list0.isEmpty()) {
            set0 = f0.emptySet();
        }
        else {
            Intrinsics.checkNotNullExpressionValue(list0, "_init_$lambda$0");
            set0 = CollectionsKt___CollectionsKt.toSet(list0);
        }
        List list1 = jvmProtoBuf$StringTableTypes0.getRecordList();
        Intrinsics.checkNotNullExpressionValue(list1, "types.recordList");
        super(arr_s, set0, JvmNameResolverKt.toExpandedRecordsList(list1));
    }
}

