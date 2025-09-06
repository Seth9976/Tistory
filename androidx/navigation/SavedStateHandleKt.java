package androidx.navigation;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.serialization.RouteDeserializerKt;
import androidx.navigation.serialization.RouteSerializerKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001AA\u0010\u0000\u001A\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u00020\u00032\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u0002H\u00010\u00052\u0016\u0010\u0006\u001A\u0012\u0012\u0004\u0012\u00020\b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\u0007H\u0007¢\u0006\u0002\u0010\n\u001A=\u0010\u000B\u001A\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u00032\u001D\b\u0002\u0010\u0006\u001A\u0017\u0012\u0004\u0012\u00020\b\u0012\r\u0012\u000B\u0012\u0002\b\u00030\t¢\u0006\u0002\b\f0\u0007H\u0086\b¢\u0006\u0002\u0010\r¨\u0006\u000E"}, d2 = {"internalToRoute", "T", "", "Landroidx/lifecycle/SavedStateHandle;", "route", "Lkotlin/reflect/KClass;", "typeMap", "", "Lkotlin/reflect/KType;", "Landroidx/navigation/NavType;", "(Landroidx/lifecycle/SavedStateHandle;Lkotlin/reflect/KClass;Ljava/util/Map;)Ljava/lang/Object;", "toRoute", "Lkotlin/jvm/JvmSuppressWildcards;", "(Landroidx/lifecycle/SavedStateHandle;Ljava/util/Map;)Ljava/lang/Object;", "navigation-common_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSavedStateHandle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandle.kt\nandroidx/navigation/SavedStateHandleKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,53:1\n2634#2:54\n1#3:55\n*S KotlinDebug\n*F\n+ 1 SavedStateHandle.kt\nandroidx/navigation/SavedStateHandleKt\n*L\n50#1:54\n50#1:55\n*E\n"})
public final class SavedStateHandleKt {
    @RestrictTo({Scope.LIBRARY_GROUP})
    @NotNull
    public static final Object internalToRoute(@NotNull SavedStateHandle savedStateHandle0, @NotNull KClass kClass0, @NotNull Map map0) {
        Intrinsics.checkNotNullParameter(savedStateHandle0, "<this>");
        Intrinsics.checkNotNullParameter(kClass0, "route");
        Intrinsics.checkNotNullParameter(map0, "typeMap");
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        KSerializer kSerializer0 = SerializersKt.serializer(kClass0);
        for(Object object0: RouteSerializerKt.generateNavArguments(kSerializer0, map0)) {
            linkedHashMap0.put(((NamedNavArgument)object0).getName(), ((NamedNavArgument)object0).getArgument().getType());
        }
        return RouteDeserializerKt.decodeArguments(kSerializer0, savedStateHandle0, linkedHashMap0);
    }

    public static final Object toRoute(SavedStateHandle savedStateHandle0, Map map0) {
        Intrinsics.checkNotNullParameter(savedStateHandle0, "<this>");
        Intrinsics.checkNotNullParameter(map0, "typeMap");
        Intrinsics.reifiedOperationMarker(4, "T");
        return SavedStateHandleKt.internalToRoute(savedStateHandle0, Reflection.getOrCreateKotlinClass(Object.class), map0);
    }

    public static Object toRoute$default(SavedStateHandle savedStateHandle0, Map map0, int v, Object object0) {
        if((v & 1) != 0) {
            map0 = x.emptyMap();
        }
        Intrinsics.checkNotNullParameter(savedStateHandle0, "<this>");
        Intrinsics.checkNotNullParameter(map0, "typeMap");
        Intrinsics.reifiedOperationMarker(4, "T");
        return SavedStateHandleKt.internalToRoute(savedStateHandle0, Reflection.getOrCreateKotlinClass(Object.class), map0);
    }
}

