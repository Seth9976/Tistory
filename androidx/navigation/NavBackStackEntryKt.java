package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.serialization.RouteDeserializerKt;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.w;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.SerializersKt;

@Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\u001A\u0010\u0000\u001A\u0002H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002H\u0086\b¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"toRoute", "T", "Landroidx/navigation/NavBackStackEntry;", "(Landroidx/navigation/NavBackStackEntry;)Ljava/lang/Object;", "navigation-common_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nNavBackStackEntry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavBackStackEntry.kt\nandroidx/navigation/NavBackStackEntryKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,309:1\n453#2:310\n403#2:311\n1238#3,4:312\n*S KotlinDebug\n*F\n+ 1 NavBackStackEntry.kt\nandroidx/navigation/NavBackStackEntryKt\n*L\n306#1:310\n306#1:311\n306#1:312,4\n*E\n"})
public final class NavBackStackEntryKt {
    public static final Object toRoute(NavBackStackEntry navBackStackEntry0) {
        Intrinsics.checkNotNullParameter(navBackStackEntry0, "<this>");
        Bundle bundle0 = navBackStackEntry0.getArguments();
        if(bundle0 == null) {
            bundle0 = new Bundle();
        }
        Map map0 = navBackStackEntry0.getDestination().getArguments();
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(w.mapCapacity(map0.size()));
        for(Object object0: map0.entrySet()) {
            linkedHashMap0.put(((Map.Entry)object0).getKey(), ((NavArgument)((Map.Entry)object0).getValue()).getType());
        }
        Intrinsics.reifiedOperationMarker(6, "T");
        return RouteDeserializerKt.decodeArguments(SerializersKt.serializer(null), bundle0, linkedHashMap0);
    }
}

