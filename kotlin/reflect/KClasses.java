package kotlin.reflect;

import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.internal.LowPriorityInOverloadResolution;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A+\u0010\u0000\u001A\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0010\u0004\u001A\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0002\u0010\u0005\u001A-\u0010\u0006\u001A\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0010\u0004\u001A\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0002\u0010\u0005¨\u0006\u0007"}, d2 = {"cast", "T", "", "Lkotlin/reflect/KClass;", "value", "(Lkotlin/reflect/KClass;Ljava/lang/Object;)Ljava/lang/Object;", "safeCast", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@JvmName(name = "KClasses")
@SourceDebugExtension({"SMAP\nKClasses.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KClasses.kt\nkotlin/reflect/KClasses\n+ 2 KClassesImpl.kt\nkotlin/reflect/KClassesImplKt\n*L\n1#1,48:1\n9#2:49\n*S KotlinDebug\n*F\n+ 1 KClasses.kt\nkotlin/reflect/KClasses\n*L\n26#1:49\n*E\n"})
public final class KClasses {
    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @LowPriorityInOverloadResolution
    @NotNull
    public static final Object cast(@NotNull KClass kClass0, @Nullable Object object0) {
        Intrinsics.checkNotNullParameter(kClass0, "<this>");
        if(!kClass0.isInstance(object0)) {
            throw new ClassCastException("Value cannot be cast to " + kClass0.getQualifiedName());
        }
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
        return object0;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @LowPriorityInOverloadResolution
    @Nullable
    public static final Object safeCast(@NotNull KClass kClass0, @Nullable Object object0) {
        Intrinsics.checkNotNullParameter(kClass0, "<this>");
        if(kClass0.isInstance(object0)) {
            Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.safeCast");
            return object0;
        }
        return null;
    }
}

