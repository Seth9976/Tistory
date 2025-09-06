package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.HashSet;
import java.util.Set;
import kotlin.collections.o;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nMemberScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MemberScope.kt\norg/jetbrains/kotlin/resolve/scopes/MemberScopeKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 addToStdlib.kt\norg/jetbrains/kotlin/utils/addToStdlib/AddToStdlibKt\n*L\n1#1,261:1\n223#2,2:262\n288#2,2:264\n766#2:271\n857#2,2:272\n196#3,5:266\n*S KotlinDebug\n*F\n+ 1 MemberScope.kt\norg/jetbrains/kotlin/resolve/scopes/MemberScopeKt\n*L\n71#1:262,2\n74#1:264,2\n87#1:271\n87#1:272,2\n77#1:266,5\n*E\n"})
public final class MemberScopeKt {
    @Nullable
    public static final Set flatMapClassifierNamesOrNull(@NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        Set set0 = new HashSet();
        for(Object object0: iterable0) {
            Iterable iterable1 = ((MemberScope)object0).getClassifierNames();
            if(iterable1 == null) {
                return null;
            }
            o.addAll(set0, iterable1);
        }
        return set0;
    }
}

