package kotlin.reflect.jvm.internal.impl.load.java.structure;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\njavaTypes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 javaTypes.kt\norg/jetbrains/kotlin/load/java/structure/JavaTypesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,48:1\n1#2:49\n*E\n"})
public final class JavaTypesKt {
    public static final boolean isSuperWildcard(@Nullable JavaType javaType0) {
        JavaWildcardType javaWildcardType0 = javaType0 instanceof JavaWildcardType ? ((JavaWildcardType)javaType0) : null;
        return javaWildcardType0 != null && javaWildcardType0.getBound() != null && !javaWildcardType0.isExtends();
    }
}

