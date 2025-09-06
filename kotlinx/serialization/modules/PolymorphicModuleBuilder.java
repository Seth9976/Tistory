package kotlinx.serialization.modules;

import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.ReplaceWith;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0000*\u00020\u00012\u00020\u0001B)\b\u0001\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0010\b\u0002\u0010\u0006\u001A\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\n\u001A\u00020\f\"\b\b\u0001\u0010\t*\u00028\u00002\f\u0010\n\u001A\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\n\u0010\bJ:\u0010\u0014\u001A\u00020\f2+\u0010\u0013\u001A\'\u0012\u0015\u0012\u0013\u0018\u00010\u000E¢\u0006\f\b\u000F\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00120\r¢\u0006\u0004\b\u0014\u0010\u0015J<\u0010\u0017\u001A\u00020\f2+\u0010\u0016\u001A\'\u0012\u0015\u0012\u0013\u0018\u00010\u000E¢\u0006\f\b\u000F\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00120\rH\u0007¢\u0006\u0004\b\u0017\u0010\u0015J\u0017\u0010\u001A\u001A\u00020\f2\u0006\u0010\u0019\u001A\u00020\u0018H\u0001¢\u0006\u0004\b\u001A\u0010\u001B¨\u0006\u001C"}, d2 = {"Lkotlinx/serialization/modules/PolymorphicModuleBuilder;", "", "Base", "Lkotlin/reflect/KClass;", "baseClass", "Lkotlinx/serialization/KSerializer;", "baseSerializer", "<init>", "(Lkotlin/reflect/KClass;Lkotlinx/serialization/KSerializer;)V", "T", "subclass", "serializer", "", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "className", "Lkotlinx/serialization/DeserializationStrategy;", "defaultDeserializerProvider", "defaultDeserializer", "(Lkotlin/jvm/functions/Function1;)V", "defaultSerializerProvider", "default", "Lkotlinx/serialization/modules/SerializersModuleBuilder;", "builder", "buildTo", "(Lkotlinx/serialization/modules/SerializersModuleBuilder;)V", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPolymorphicModuleBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PolymorphicModuleBuilder.kt\nkotlinx/serialization/modules/PolymorphicModuleBuilder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n*L\n1#1,119:1\n1855#2:120\n1856#2:122\n79#3:121\n*S KotlinDebug\n*F\n+ 1 PolymorphicModuleBuilder.kt\nkotlinx/serialization/modules/PolymorphicModuleBuilder\n*L\n88#1:120\n88#1:122\n92#1:121\n*E\n"})
public final class PolymorphicModuleBuilder {
    public final KClass a;
    public final KSerializer b;
    public final ArrayList c;
    public Function1 d;

    @PublishedApi
    public PolymorphicModuleBuilder(@NotNull KClass kClass0, @Nullable KSerializer kSerializer0) {
        Intrinsics.checkNotNullParameter(kClass0, "baseClass");
        super();
        this.a = kClass0;
        this.b = kSerializer0;
        this.c = new ArrayList();
    }

    public PolymorphicModuleBuilder(KClass kClass0, KSerializer kSerializer0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            kSerializer0 = null;
        }
        this(kClass0, kSerializer0);
    }

    @PublishedApi
    public final void buildTo(@NotNull SerializersModuleBuilder serializersModuleBuilder0) {
        Intrinsics.checkNotNullParameter(serializersModuleBuilder0, "builder");
        KSerializer kSerializer0 = this.b;
        if(kSerializer0 != null) {
            SerializersModuleBuilder.registerPolymorphicSerializer$default(serializersModuleBuilder0, this.a, this.a, kSerializer0, false, 8, null);
        }
        for(Object object0: this.c) {
            Object object1 = ((Pair)object0).component1();
            Object object2 = ((Pair)object0).component2();
            Intrinsics.checkNotNull(((KClass)object1), "null cannot be cast to non-null type kotlin.reflect.KClass<Base of kotlinx.serialization.modules.PolymorphicModuleBuilder.buildTo$lambda$1>");
            Intrinsics.checkNotNull(((KSerializer)object2), "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            SerializersModuleBuilder.registerPolymorphicSerializer$default(serializersModuleBuilder0, this.a, ((KClass)object1), ((KSerializer)object2), false, 8, null);
        }
        Function1 function10 = this.d;
        if(function10 != null) {
            serializersModuleBuilder0.registerDefaultPolymorphicDeserializer(this.a, function10, false);
        }
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated in favor of function with more precise name: defaultDeserializer", replaceWith = @ReplaceWith(expression = "defaultDeserializer(defaultSerializerProvider)", imports = {}))
    public final void default(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "defaultSerializerProvider");
        this.defaultDeserializer(function10);
    }

    public final void defaultDeserializer(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "defaultDeserializerProvider");
        if(this.d != null) {
            throw new IllegalArgumentException(("Default deserializer provider is already registered for class " + this.a + ": " + this.d).toString());
        }
        this.d = function10;
    }

    public final void subclass(@NotNull KClass kClass0, @NotNull KSerializer kSerializer0) {
        Intrinsics.checkNotNullParameter(kClass0, "subclass");
        Intrinsics.checkNotNullParameter(kSerializer0, "serializer");
        Pair pair0 = TuplesKt.to(kClass0, kSerializer0);
        this.c.add(pair0);
    }
}

