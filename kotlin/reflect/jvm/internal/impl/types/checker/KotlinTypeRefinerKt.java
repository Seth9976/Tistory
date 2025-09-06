package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleCapability;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nKotlinTypeRefiner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KotlinTypeRefiner.kt\norg/jetbrains/kotlin/types/checker/KotlinTypeRefinerKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,90:1\n1549#2:91\n1620#2,3:92\n*S KotlinDebug\n*F\n+ 1 KotlinTypeRefiner.kt\norg/jetbrains/kotlin/types/checker/KotlinTypeRefinerKt\n*L\n78#1:91\n78#1:92,3\n*E\n"})
public final class KotlinTypeRefinerKt {
    public static final ModuleCapability a;

    static {
        KotlinTypeRefinerKt.a = new ModuleCapability("KotlinTypeRefiner");
    }

    @NotNull
    public static final ModuleCapability getREFINER_CAPABILITY() {
        return KotlinTypeRefinerKt.a;
    }

    @NotNull
    public static final List refineTypes(@NotNull KotlinTypeRefiner kotlinTypeRefiner0, @NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner0, "<this>");
        Intrinsics.checkNotNullParameter(iterable0, "types");
        List list0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
        for(Object object0: iterable0) {
            list0.add(kotlinTypeRefiner0.refineType(((KotlinType)object0)));
        }
        return list0;
    }
}

