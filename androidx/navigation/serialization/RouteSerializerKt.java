package androidx.navigation.serialization;

import a5.b;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.compose.foundation.text.selection.w0;
import androidx.compose.material3.e0;
import androidx.navigation.NamedNavArgumentKt;
import androidx.navigation.NavType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KType;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.g4;

@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u001AE\u0010\b\u001A\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\b\u0002\u0010\u0005\u001A\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00022\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\b\u0010\t\u001A?\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u000B0\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\b\u0002\u0010\u0005\u001A\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0002H\u0007¢\u0006\u0004\b\f\u0010\r\u001A=\u0010\u0010\u001A\u00020\u0006\"\b\b\u0000\u0010\u0000*\u00020\u000E2\u0006\u0010\u000F\u001A\u00028\u00002\u001A\u0010\u0005\u001A\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000E0\u00040\u0002H\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001A\u001F\u0010\u0013\u001A\u00020\u0012\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"T", "Lkotlinx/serialization/KSerializer;", "", "Lkotlin/reflect/KType;", "Landroidx/navigation/NavType;", "typeMap", "", "path", "generateRoutePattern", "(Lkotlinx/serialization/KSerializer;Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;", "", "Landroidx/navigation/NamedNavArgument;", "generateNavArguments", "(Lkotlinx/serialization/KSerializer;Ljava/util/Map;)Ljava/util/List;", "", "route", "generateRouteWithArgs", "(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/String;", "", "generateHashCode", "(Lkotlinx/serialization/KSerializer;)I", "navigation-common_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRouteSerializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RouteSerializer.kt\nandroidx/navigation/serialization/RouteSerializerKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,202:1\n1#2:203\n*E\n"})
public final class RouteSerializerKt {
    public static final NavType a(SerialDescriptor serialDescriptor0, String s, Map map0) {
        NavType navType0;
        Object object0 = null;
        Iterator iterator0 = map0.keySet().iterator();
        while(true) {
            navType0 = null;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object1 = iterator0.next();
            if(NavTypeConverterKt.matchKType(serialDescriptor0, ((KType)object1))) {
                object0 = object1;
                break;
            }
        }
        NavType navType1 = ((KType)object0) == null ? null : ((NavType)map0.get(((KType)object0)));
        if(navType1 != null) {
            navType0 = navType1;
        }
        if(navType0 == null) {
            navType0 = NavTypeConverterKt.getNavType(serialDescriptor0);
        }
        if(!Intrinsics.areEqual(navType0, UNKNOWN.INSTANCE)) {
            Intrinsics.checkNotNull(navType0, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any?>");
            return navType0;
        }
        StringBuilder stringBuilder0 = b.v("Cannot cast ", s, " of type ");
        stringBuilder0.append(serialDescriptor0.getSerialName());
        stringBuilder0.append(" to a NavType. Make sure to provide custom NavType for this argument.");
        throw new IllegalArgumentException(stringBuilder0.toString());
    }

    public static final NavType access$computeNavType(SerialDescriptor serialDescriptor0, String s, Map map0) {
        return RouteSerializerKt.a(serialDescriptor0, s, map0);
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public static final int generateHashCode(@NotNull KSerializer kSerializer0) {
        Intrinsics.checkNotNullParameter(kSerializer0, "<this>");
        int v = kSerializer0.getDescriptor().getSerialName().hashCode();
        int v1 = kSerializer0.getDescriptor().getElementsCount();
        for(int v2 = 0; v2 < v1; ++v2) {
            v = v * 0x1F + kSerializer0.getDescriptor().getElementName(v2).hashCode();
        }
        return v;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @NotNull
    public static final List generateNavArguments(@NotNull KSerializer kSerializer0, @NotNull Map map0) {
        Intrinsics.checkNotNullParameter(kSerializer0, "<this>");
        Intrinsics.checkNotNullParameter(map0, "typeMap");
        q4.b b0 = new q4.b(kSerializer0, 0);
        if(!(kSerializer0 instanceof PolymorphicSerializer)) {
            int v = kSerializer0.getDescriptor().getElementsCount();
            List list0 = new ArrayList(v);
            for(int v1 = 0; v1 < v; ++v1) {
                String s = kSerializer0.getDescriptor().getElementName(v1);
                ((ArrayList)list0).add(NamedNavArgumentKt.navArgument(s, new g4(kSerializer0, v1, s, map0)));
            }
            return list0;
        }
        b0.invoke();
        throw null;
    }

    public static List generateNavArguments$default(KSerializer kSerializer0, Map map0, int v, Object object0) {
        if((v & 1) != 0) {
            map0 = x.emptyMap();
        }
        return RouteSerializerKt.generateNavArguments(kSerializer0, map0);
    }

    @NotNull
    public static final String generateRoutePattern(@NotNull KSerializer kSerializer0, @NotNull Map map0, @Nullable String s) {
        Intrinsics.checkNotNullParameter(kSerializer0, "<this>");
        Intrinsics.checkNotNullParameter(map0, "typeMap");
        q4.b b0 = new q4.b(kSerializer0, 1);
        if(!(kSerializer0 instanceof PolymorphicSerializer)) {
            RouteBuilder routeBuilder0 = s == null ? new RouteBuilder(kSerializer0) : new RouteBuilder(s, kSerializer0);
            e0 e00 = new e0(routeBuilder0, 9);
            int v = kSerializer0.getDescriptor().getElementsCount();
            for(int v1 = 0; v1 < v; ++v1) {
                String s1 = kSerializer0.getDescriptor().getElementName(v1);
                e00.invoke(v1, s1, RouteSerializerKt.a(kSerializer0.getDescriptor().getElementDescriptor(v1), s1, map0));
            }
            return routeBuilder0.build();
        }
        b0.invoke();
        throw null;
    }

    public static String generateRoutePattern$default(KSerializer kSerializer0, Map map0, String s, int v, Object object0) {
        if((v & 1) != 0) {
            map0 = x.emptyMap();
        }
        if((v & 2) != 0) {
            s = null;
        }
        return RouteSerializerKt.generateRoutePattern(kSerializer0, map0, s);
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @NotNull
    public static final String generateRouteWithArgs(@NotNull Object object0, @NotNull Map map0) {
        Intrinsics.checkNotNullParameter(object0, "route");
        Intrinsics.checkNotNullParameter(map0, "typeMap");
        KSerializer kSerializer0 = SerializersKt.serializer(Reflection.getOrCreateKotlinClass(object0.getClass()));
        Map map1 = new RouteEncoder(kSerializer0, map0).encodeToArgMap(object0);
        RouteBuilder routeBuilder0 = new RouteBuilder(kSerializer0);
        w0 w00 = new w0(6, map1, routeBuilder0);
        int v = kSerializer0.getDescriptor().getElementsCount();
        for(int v1 = 0; v1 < v; ++v1) {
            String s = kSerializer0.getDescriptor().getElementName(v1);
            NavType navType0 = (NavType)map0.get(s);
            if(navType0 == null) {
                throw new IllegalStateException(("Cannot locate NavType for argument [" + s + ']').toString());
            }
            w00.invoke(v1, s, navType0);
        }
        return routeBuilder0.build();
    }
}

