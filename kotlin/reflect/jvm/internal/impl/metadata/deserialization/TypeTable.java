package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nTypeTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeTable.kt\norg/jetbrains/kotlin/metadata/deserialization/TypeTable\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,36:1\n1559#2:37\n1590#2,4:38\n*S KotlinDebug\n*F\n+ 1 TypeTable.kt\norg/jetbrains/kotlin/metadata/deserialization/TypeTable\n*L\n26#1:37\n26#1:38,4\n*E\n"})
public final class TypeTable {
    public final List a;

    public TypeTable(@NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable protoBuf$TypeTable0) {
        Intrinsics.checkNotNullParameter(protoBuf$TypeTable0, "typeTable");
        super();
        List list0 = protoBuf$TypeTable0.getTypeList();
        if(protoBuf$TypeTable0.hasFirstNullable()) {
            int v = protoBuf$TypeTable0.getFirstNullable();
            List list1 = protoBuf$TypeTable0.getTypeList();
            Intrinsics.checkNotNullExpressionValue(list1, "typeTable.typeList");
            ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(list1, 10));
            int v1 = 0;
            for(Object object0: list1) {
                if(v1 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                Type protoBuf$Type0 = (Type)object0;
                if(v1 >= v) {
                    protoBuf$Type0 = protoBuf$Type0.toBuilder().setNullable(true).build();
                }
                arrayList0.add(protoBuf$Type0);
                ++v1;
            }
            list0 = arrayList0;
        }
        Intrinsics.checkNotNullExpressionValue(list0, "run {\n        val origin… else originalTypes\n    }");
        this.a = list0;
    }

    @NotNull
    public final Type get(int v) {
        return (Type)this.a.get(v);
    }
}

