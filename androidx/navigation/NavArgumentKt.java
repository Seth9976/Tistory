package androidx.navigation;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000E\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0000\u001AC\u0010\u0000\u001A\b\u0012\u0004\u0012\u00020\u00020\u0001*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032!\u0010\u0005\u001A\u001D\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0006H\u0000¨\u0006\u000B"}, d2 = {"missingRequiredArguments", "", "", "", "Landroidx/navigation/NavArgument;", "isArgumentMissing", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "key", "", "navigation-common_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nNavArgument.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavArgument.kt\nandroidx/navigation/NavArgumentKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,238:1\n494#2,7:239\n766#3:246\n857#3,2:247\n*S KotlinDebug\n*F\n+ 1 NavArgument.kt\nandroidx/navigation/NavArgumentKt\n*L\n234#1:239,7\n236#1:246\n236#1:247,2\n*E\n"})
public final class NavArgumentKt {
    @NotNull
    public static final List missingRequiredArguments(@NotNull Map map0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(map0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "isArgumentMissing");
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        for(Object object0: map0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            NavArgument navArgument0 = (NavArgument)map$Entry0.getValue();
            Boolean boolean0 = navArgument0 == null ? null : Boolean.valueOf(navArgument0.isNullable());
            Intrinsics.checkNotNull(boolean0);
            if(!boolean0.booleanValue() && !navArgument0.isDefaultValuePresent()) {
                linkedHashMap0.put(map$Entry0.getKey(), map$Entry0.getValue());
            }
        }
        Iterable iterable0 = linkedHashMap0.keySet();
        List list0 = new ArrayList();
        for(Object object1: iterable0) {
            if(((Boolean)function10.invoke(((String)object1))).booleanValue()) {
                list0.add(object1);
            }
        }
        return list0;
    }
}

