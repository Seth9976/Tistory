package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nCompanionObjectMapping.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompanionObjectMapping.kt\norg/jetbrains/kotlin/builtins/CompanionObjectMapping\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,20:1\n1549#2:21\n1620#2,3:22\n1620#2,3:25\n*S KotlinDebug\n*F\n+ 1 CompanionObjectMapping.kt\norg/jetbrains/kotlin/builtins/CompanionObjectMapping\n*L\n12#1:21\n12#1:22,3\n16#1:25,3\n*E\n"})
public final class CompanionObjectMapping {
    @NotNull
    public static final CompanionObjectMapping INSTANCE;
    public static final LinkedHashSet a;

    static {
        CompanionObjectMapping.INSTANCE = new CompanionObjectMapping();  // 初始化器: Ljava/lang/Object;-><init>()V
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(PrimitiveType.NUMBER_TYPES, 10));
        for(Object object0: PrimitiveType.NUMBER_TYPES) {
            arrayList0.add(StandardNames.getPrimitiveFqName(((PrimitiveType)object0)));
        }
        FqName fqName0 = FqNames.string.toSafe();
        Intrinsics.checkNotNullExpressionValue(fqName0, "string.toSafe()");
        Collection collection0 = CollectionsKt___CollectionsKt.plus(arrayList0, fqName0);
        FqName fqName1 = FqNames._boolean.toSafe();
        Intrinsics.checkNotNullExpressionValue(fqName1, "_boolean.toSafe()");
        Collection collection1 = CollectionsKt___CollectionsKt.plus(collection0, fqName1);
        FqName fqName2 = FqNames._enum.toSafe();
        Intrinsics.checkNotNullExpressionValue(fqName2, "_enum.toSafe()");
        Iterable iterable0 = CollectionsKt___CollectionsKt.plus(collection1, fqName2);
        LinkedHashSet linkedHashSet0 = new LinkedHashSet();
        for(Object object1: iterable0) {
            linkedHashSet0.add(ClassId.topLevel(((FqName)object1)));
        }
        CompanionObjectMapping.a = linkedHashSet0;
    }

    @NotNull
    public final Set allClassesWithIntrinsicCompanions() {
        return CompanionObjectMapping.a;
    }

    @NotNull
    public final Set getClassIds() {
        return CompanionObjectMapping.a;
    }
}

