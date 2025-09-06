package kotlinx.serialization.modules;

import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u00E6\u0001\u0012\u0016\u0010\u0005\u001A\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012*\u0010\u0007\u001A&\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0018\u0012\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00020\u0002\u0012.\u0010\u000B\u001A*\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u001C\u0012\u001A\u0012\u0002\b\u0003\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\t0\bj\u0006\u0012\u0002\b\u0003`\n0\u0002\u0012&\u0010\r\u001A\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00020\u0002\u0012A\u0010\u0013\u001A=\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012/\u0012-\u0012\u0015\u0012\u0013\u0018\u00010\f\u00A2\u0006\f\b\u000E\u0012\b\b\u000F\u0012\u0004\b\b(\u0010\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00110\bj\u0006\u0012\u0002\b\u0003`\u00120\u0002\u00A2\u0006\u0004\b\u0014\u0010\u0015J9\u0010\u001A\u001A\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t\"\b\b\u0000\u0010\u0017*\u00020\u00162\u000E\u0010\u0018\u001A\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00032\u0006\u0010\u0019\u001A\u00028\u0000H\u0016\u00A2\u0006\u0004\b\u001A\u0010\u001BJ;\u0010\u001A\u001A\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0011\"\b\b\u0000\u0010\u0017*\u00020\u00162\u000E\u0010\u0018\u001A\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00032\b\u0010\u001C\u001A\u0004\u0018\u00010\fH\u0016\u00A2\u0006\u0004\b\u001A\u0010\u001DJA\u0010!\u001A\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006\"\b\b\u0000\u0010\u0017*\u00020\u00162\f\u0010\u001E\u001A\b\u0012\u0004\u0012\u00028\u00000\u00032\u0010\u0010 \u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u001FH\u0016\u00A2\u0006\u0004\b!\u0010\"J\u0017\u0010&\u001A\u00020%2\u0006\u0010$\u001A\u00020#H\u0016\u00A2\u0006\u0004\b&\u0010\'R8\u0010\u0007\u001A&\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0018\u0012\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00020\u00028\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b\u0007\u0010(\u00A8\u0006)"}, d2 = {"Lkotlinx/serialization/modules/SerialModuleImpl;", "Lkotlinx/serialization/modules/SerializersModule;", "", "Lkotlin/reflect/KClass;", "Lkotlinx/serialization/modules/ContextualProvider;", "class2ContextualFactory", "Lkotlinx/serialization/KSerializer;", "polyBase2Serializers", "Lkotlin/Function1;", "Lkotlinx/serialization/SerializationStrategy;", "Lkotlinx/serialization/modules/PolymorphicSerializerProvider;", "polyBase2DefaultSerializerProvider", "", "polyBase2NamedSerializers", "Lkotlin/ParameterName;", "name", "className", "Lkotlinx/serialization/DeserializationStrategy;", "Lkotlinx/serialization/modules/PolymorphicDeserializerProvider;", "polyBase2DefaultDeserializerProvider", "<init>", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "", "T", "baseClass", "value", "getPolymorphic", "(Lkotlin/reflect/KClass;Ljava/lang/Object;)Lkotlinx/serialization/SerializationStrategy;", "serializedClassName", "(Lkotlin/reflect/KClass;Ljava/lang/String;)Lkotlinx/serialization/DeserializationStrategy;", "kClass", "", "typeArgumentsSerializers", "getContextual", "(Lkotlin/reflect/KClass;Ljava/util/List;)Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/modules/SerializersModuleCollector;", "collector", "", "dumpTo", "(Lkotlinx/serialization/modules/SerializersModuleCollector;)V", "Ljava/util/Map;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSerializersModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerializersModule.kt\nkotlinx/serialization/modules/SerialModuleImpl\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n*L\n1#1,234:1\n215#2,2:235\n215#2:237\n215#2:238\n216#2:240\n216#2:241\n215#2,2:242\n215#2,2:244\n79#3:239\n*S KotlinDebug\n*F\n+ 1 SerializersModule.kt\nkotlinx/serialization/modules/SerialModuleImpl\n*L\n175#1:235,2\n185#1:237\n186#1:238\n186#1:240\n185#1:241\n195#1:242,2\n199#1:244,2\n190#1:239\n*E\n"})
public final class SerialModuleImpl extends SerializersModule {
    public final Map a;
    public final Map b;
    public final Map c;
    public final Map d;
    @JvmField
    @NotNull
    public final Map polyBase2Serializers;

    public SerialModuleImpl(@NotNull Map map0, @NotNull Map map1, @NotNull Map map2, @NotNull Map map3, @NotNull Map map4) {
        Intrinsics.checkNotNullParameter(map0, "class2ContextualFactory");
        Intrinsics.checkNotNullParameter(map1, "polyBase2Serializers");
        Intrinsics.checkNotNullParameter(map2, "polyBase2DefaultSerializerProvider");
        Intrinsics.checkNotNullParameter(map3, "polyBase2NamedSerializers");
        Intrinsics.checkNotNullParameter(map4, "polyBase2DefaultDeserializerProvider");
        super(null);
        this.a = map0;
        this.polyBase2Serializers = map1;
        this.b = map2;
        this.c = map3;
        this.d = map4;
    }

    @Override  // kotlinx.serialization.modules.SerializersModule
    public void dumpTo(@NotNull SerializersModuleCollector serializersModuleCollector0) {
        Intrinsics.checkNotNullParameter(serializersModuleCollector0, "collector");
        for(Object object0: this.a.entrySet()) {
            KClass kClass0 = (KClass)((Map.Entry)object0).getKey();
            ContextualProvider contextualProvider0 = (ContextualProvider)((Map.Entry)object0).getValue();
            if(contextualProvider0 instanceof Argless) {
                Intrinsics.checkNotNull(kClass0, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                KSerializer kSerializer0 = ((Argless)contextualProvider0).getSerializer();
                Intrinsics.checkNotNull(kSerializer0, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                serializersModuleCollector0.contextual(kClass0, kSerializer0);
            }
            else if(contextualProvider0 instanceof WithTypeArguments) {
                serializersModuleCollector0.contextual(kClass0, ((WithTypeArguments)contextualProvider0).getProvider());
            }
        }
        for(Object object1: this.polyBase2Serializers.entrySet()) {
            KClass kClass1 = (KClass)((Map.Entry)object1).getKey();
            for(Object object2: ((Map)((Map.Entry)object1).getValue()).entrySet()) {
                KClass kClass2 = (KClass)((Map.Entry)object2).getKey();
                KSerializer kSerializer1 = (KSerializer)((Map.Entry)object2).getValue();
                Intrinsics.checkNotNull(kClass1, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                Intrinsics.checkNotNull(kClass2, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                Intrinsics.checkNotNull(kSerializer1, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                serializersModuleCollector0.polymorphic(kClass1, kClass2, kSerializer1);
            }
        }
        for(Object object3: this.b.entrySet()) {
            KClass kClass3 = (KClass)((Map.Entry)object3).getKey();
            Function1 function10 = (Function1)((Map.Entry)object3).getValue();
            Intrinsics.checkNotNull(kClass3, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            Intrinsics.checkNotNull(function10, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \'value\')] kotlin.Any, kotlinx.serialization.SerializationStrategy<kotlin.Any>?>{ kotlinx.serialization.modules.SerializersModuleKt.PolymorphicSerializerProvider<kotlin.Any> }");
            serializersModuleCollector0.polymorphicDefaultSerializer(kClass3, ((Function1)TypeIntrinsics.beforeCheckcastToFunctionOfArity(function10, 1)));
        }
        for(Object object4: this.d.entrySet()) {
            KClass kClass4 = (KClass)((Map.Entry)object4).getKey();
            Function1 function11 = (Function1)((Map.Entry)object4).getValue();
            Intrinsics.checkNotNull(kClass4, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            Intrinsics.checkNotNull(function11, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \'className\')] kotlin.String?, kotlinx.serialization.DeserializationStrategy<out kotlin.Any>?>{ kotlinx.serialization.modules.SerializersModuleKt.PolymorphicDeserializerProvider<out kotlin.Any> }");
            serializersModuleCollector0.polymorphicDefaultDeserializer(kClass4, ((Function1)TypeIntrinsics.beforeCheckcastToFunctionOfArity(function11, 1)));
        }
    }

    @Override  // kotlinx.serialization.modules.SerializersModule
    @Nullable
    public KSerializer getContextual(@NotNull KClass kClass0, @NotNull List list0) {
        Intrinsics.checkNotNullParameter(kClass0, "kClass");
        Intrinsics.checkNotNullParameter(list0, "typeArgumentsSerializers");
        ContextualProvider contextualProvider0 = (ContextualProvider)this.a.get(kClass0);
        KSerializer kSerializer0 = contextualProvider0 == null ? null : contextualProvider0.invoke(list0);
        return kSerializer0 == null ? null : kSerializer0;
    }

    @Override  // kotlinx.serialization.modules.SerializersModule
    @Nullable
    public DeserializationStrategy getPolymorphic(@NotNull KClass kClass0, @Nullable String s) {
        Intrinsics.checkNotNullParameter(kClass0, "baseClass");
        Map map0 = (Map)this.c.get(kClass0);
        DeserializationStrategy deserializationStrategy0 = map0 == null ? null : ((KSerializer)map0.get(s));
        if(deserializationStrategy0 == null) {
            deserializationStrategy0 = null;
        }
        if(deserializationStrategy0 != null) {
            return deserializationStrategy0;
        }
        Object object0 = this.d.get(kClass0);
        Function1 function10 = TypeIntrinsics.isFunctionOfArity(object0, 1) ? ((Function1)object0) : null;
        return function10 == null ? null : ((DeserializationStrategy)function10.invoke(s));
    }

    @Override  // kotlinx.serialization.modules.SerializersModule
    @Nullable
    public SerializationStrategy getPolymorphic(@NotNull KClass kClass0, @NotNull Object object0) {
        Intrinsics.checkNotNullParameter(kClass0, "baseClass");
        Intrinsics.checkNotNullParameter(object0, "value");
        if(!kClass0.isInstance(object0)) {
            return null;
        }
        Map map0 = (Map)this.polyBase2Serializers.get(kClass0);
        SerializationStrategy serializationStrategy0 = map0 == null ? null : ((KSerializer)map0.get(Reflection.getOrCreateKotlinClass(object0.getClass())));
        if(serializationStrategy0 == null) {
            serializationStrategy0 = null;
        }
        if(serializationStrategy0 != null) {
            return serializationStrategy0;
        }
        Object object1 = this.b.get(kClass0);
        Function1 function10 = TypeIntrinsics.isFunctionOfArity(object1, 1) ? ((Function1)object1) : null;
        return function10 == null ? null : ((SerializationStrategy)function10.invoke(object0));
    }
}

