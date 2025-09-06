package kotlin.reflect.jvm.internal.impl.util.collectionUtils;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Empty;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nscopeUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 scopeUtils.kt\norg/jetbrains/kotlin/util/collectionUtils/ScopeUtilsKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,136:1\n112#1,2:141\n127#1,7:143\n4307#2,2:137\n857#3,2:139\n*S KotlinDebug\n*F\n+ 1 scopeUtils.kt\norg/jetbrains/kotlin/util/collectionUtils/ScopeUtilsKt\n*L\n109#1:141,2\n124#1:143,7\n85#1:137,2\n88#1:139,2\n*E\n"})
public final class ScopeUtilsKt {
    @Nullable
    public static final Collection concat(@Nullable Collection collection0, @NotNull Collection collection1) {
        Intrinsics.checkNotNullParameter(collection1, "collection");
        if(collection1.isEmpty()) {
            return collection0;
        }
        if(collection0 == null) {
            return collection1;
        }
        if(collection0 instanceof LinkedHashSet) {
            ((LinkedHashSet)collection0).addAll(collection1);
            return collection0;
        }
        Collection collection2 = new LinkedHashSet(collection0);
        ((AbstractCollection)collection2).addAll(collection1);
        return collection2;
    }

    @NotNull
    public static final SmartList listOfNonEmptyScopes(@NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "scopes");
        SmartList smartList0 = new SmartList();
        for(Object object0: iterable0) {
            if(((MemberScope)object0) != null && ((MemberScope)object0) != Empty.INSTANCE) {
                smartList0.add(object0);
            }
        }
        return smartList0;
    }
}

