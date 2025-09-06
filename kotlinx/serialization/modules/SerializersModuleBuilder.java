package kotlinx.serialization.modules;

import androidx.emoji2.text.flatbuffer.h;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ReplaceWith;
import kotlin.collections.z;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\r\u0018\u00002\u00020\u0001B\t\b\u0001\u00A2\u0006\u0004\b\u0002\u0010\u0003J5\u0010\u000B\u001A\u00020\n\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00000\u00062\f\u0010\t\u001A\b\u0012\u0004\u0012\u00028\u00000\bH\u0016\u00A2\u0006\u0004\b\u000B\u0010\fJX\u0010\u000B\u001A\u00020\n\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00000\u00062/\u0010\u0012\u001A+\u0012\u001D\u0012\u001B\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u000E\u00A2\u0006\f\b\u000F\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\rH\u0016\u00A2\u0006\u0004\b\u000B\u0010\u0013JM\u0010\u0019\u001A\u00020\n\"\b\b\u0000\u0010\u0014*\u00020\u0004\"\b\b\u0001\u0010\u0015*\u00028\u00002\f\u0010\u0016\u001A\b\u0012\u0004\u0012\u00028\u00000\u00062\f\u0010\u0017\u001A\b\u0012\u0004\u0012\u00028\u00010\u00062\f\u0010\u0018\u001A\b\u0012\u0004\u0012\u00028\u00010\bH\u0016\u00A2\u0006\u0004\b\u0019\u0010\u001AJR\u0010\u001E\u001A\u00020\n\"\b\b\u0000\u0010\u0014*\u00020\u00042\f\u0010\u0016\u001A\b\u0012\u0004\u0012\u00028\u00000\u00062)\u0010\u001D\u001A%\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\u000F\u0012\b\b\u0010\u0012\u0004\b\b(\u001B\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001C0\rH\u0016\u00A2\u0006\u0004\b\u001E\u0010\u0013JT\u0010#\u001A\u00020\n\"\b\b\u0000\u0010\u0014*\u00020\u00042\f\u0010\u0016\u001A\b\u0012\u0004\u0012\u00028\u00000\u00062+\u0010\"\u001A\'\u0012\u0015\u0012\u0013\u0018\u00010\u001F\u00A2\u0006\f\b\u000F\u0012\b\b\u0010\u0012\u0004\b\b( \u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010!0\rH\u0016\u00A2\u0006\u0004\b#\u0010\u0013J\u0015\u0010&\u001A\u00020\n2\u0006\u0010%\u001A\u00020$\u00A2\u0006\u0004\b&\u0010\'J9\u0010,\u001A\u00020\n\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010(\u001A\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\u0012\u001A\u00020)2\b\b\u0002\u0010+\u001A\u00020*H\u0001\u00A2\u0006\u0004\b,\u0010-JZ\u0010.\u001A\u00020\n\"\b\b\u0000\u0010\u0014*\u00020\u00042\f\u0010\u0016\u001A\b\u0012\u0004\u0012\u00028\u00000\u00062)\u0010\u001D\u001A%\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\u000F\u0012\b\b\u0010\u0012\u0004\b\b(\u001B\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001C0\r2\u0006\u0010+\u001A\u00020*H\u0001\u00A2\u0006\u0004\b.\u0010/J\\\u00100\u001A\u00020\n\"\b\b\u0000\u0010\u0014*\u00020\u00042\f\u0010\u0016\u001A\b\u0012\u0004\u0012\u00028\u00000\u00062+\u0010\"\u001A\'\u0012\u0015\u0012\u0013\u0018\u00010\u001F\u00A2\u0006\f\b\u000F\u0012\b\b\u0010\u0012\u0004\b\b( \u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010!0\r2\u0006\u0010+\u001A\u00020*H\u0001\u00A2\u0006\u0004\b0\u0010/JW\u00103\u001A\u00020\n\"\b\b\u0000\u0010\u0014*\u00020\u0004\"\b\b\u0001\u0010\u0015*\u00028\u00002\f\u0010\u0016\u001A\b\u0012\u0004\u0012\u00028\u00000\u00062\f\u00101\u001A\b\u0012\u0004\u0012\u00028\u00010\u00062\f\u00102\u001A\b\u0012\u0004\u0012\u00028\u00010\b2\b\b\u0002\u0010+\u001A\u00020*H\u0001\u00A2\u0006\u0004\b3\u00104J\u000F\u00105\u001A\u00020$H\u0001\u00A2\u0006\u0004\b5\u00106\u00A8\u00067"}, d2 = {"Lkotlinx/serialization/modules/SerializersModuleBuilder;", "Lkotlinx/serialization/modules/SerializersModuleCollector;", "<init>", "()V", "", "T", "Lkotlin/reflect/KClass;", "kClass", "Lkotlinx/serialization/KSerializer;", "serializer", "", "contextual", "(Lkotlin/reflect/KClass;Lkotlinx/serialization/KSerializer;)V", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "typeArgumentsSerializers", "provider", "(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function1;)V", "Base", "Sub", "baseClass", "actualClass", "actualSerializer", "polymorphic", "(Lkotlin/reflect/KClass;Lkotlin/reflect/KClass;Lkotlinx/serialization/KSerializer;)V", "value", "Lkotlinx/serialization/SerializationStrategy;", "defaultSerializerProvider", "polymorphicDefaultSerializer", "", "className", "Lkotlinx/serialization/DeserializationStrategy;", "defaultDeserializerProvider", "polymorphicDefaultDeserializer", "Lkotlinx/serialization/modules/SerializersModule;", "module", "include", "(Lkotlinx/serialization/modules/SerializersModule;)V", "forClass", "Lkotlinx/serialization/modules/ContextualProvider;", "", "allowOverwrite", "registerSerializer", "(Lkotlin/reflect/KClass;Lkotlinx/serialization/modules/ContextualProvider;Z)V", "registerDefaultPolymorphicSerializer", "(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function1;Z)V", "registerDefaultPolymorphicDeserializer", "concreteClass", "concreteSerializer", "registerPolymorphicSerializer", "(Lkotlin/reflect/KClass;Lkotlin/reflect/KClass;Lkotlinx/serialization/KSerializer;Z)V", "build", "()Lkotlinx/serialization/modules/SerializersModule;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSerializersModuleBuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerializersModuleBuilders.kt\nkotlinx/serialization/modules/SerializersModuleBuilder\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,270:1\n372#2,7:271\n372#2,7:278\n1#3:285\n*S KotlinDebug\n*F\n+ 1 SerializersModuleBuilders.kt\nkotlinx/serialization/modules/SerializersModuleBuilder\n*L\n195#1:271,7\n197#1:278,7\n*E\n"})
public final class SerializersModuleBuilder implements SerializersModuleCollector {
    public final HashMap a;
    public final HashMap b;
    public final HashMap c;
    public final HashMap d;
    public final HashMap e;

    @PublishedApi
    public SerializersModuleBuilder() {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = new HashMap();
    }

    @PublishedApi
    @NotNull
    public final SerializersModule build() {
        return new SerialModuleImpl(this.a, this.b, this.c, this.d, this.e);
    }

    @Override  // kotlinx.serialization.modules.SerializersModuleCollector
    public void contextual(@NotNull KClass kClass0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(kClass0, "kClass");
        Intrinsics.checkNotNullParameter(function10, "provider");
        SerializersModuleBuilder.registerSerializer$default(this, kClass0, new WithTypeArguments(function10), false, 4, null);
    }

    @Override  // kotlinx.serialization.modules.SerializersModuleCollector
    public void contextual(@NotNull KClass kClass0, @NotNull KSerializer kSerializer0) {
        Intrinsics.checkNotNullParameter(kClass0, "kClass");
        Intrinsics.checkNotNullParameter(kSerializer0, "serializer");
        SerializersModuleBuilder.registerSerializer$default(this, kClass0, new Argless(kSerializer0), false, 4, null);
    }

    public final void include(@NotNull SerializersModule serializersModule0) {
        Intrinsics.checkNotNullParameter(serializersModule0, "module");
        serializersModule0.dumpTo(this);
    }

    @Override  // kotlinx.serialization.modules.SerializersModuleCollector
    public void polymorphic(@NotNull KClass kClass0, @NotNull KClass kClass1, @NotNull KSerializer kSerializer0) {
        Intrinsics.checkNotNullParameter(kClass0, "baseClass");
        Intrinsics.checkNotNullParameter(kClass1, "actualClass");
        Intrinsics.checkNotNullParameter(kSerializer0, "actualSerializer");
        SerializersModuleBuilder.registerPolymorphicSerializer$default(this, kClass0, kClass1, kSerializer0, false, 8, null);
    }

    @Override  // kotlinx.serialization.modules.SerializersModuleCollector
    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated in favor of function with more precise name: polymorphicDefaultDeserializer", replaceWith = @ReplaceWith(expression = "polymorphicDefaultDeserializer(baseClass, defaultDeserializerProvider)", imports = {}))
    public void polymorphicDefault(@NotNull KClass kClass0, @NotNull Function1 function10) {
        DefaultImpls.polymorphicDefault(this, kClass0, function10);
    }

    @Override  // kotlinx.serialization.modules.SerializersModuleCollector
    public void polymorphicDefaultDeserializer(@NotNull KClass kClass0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(kClass0, "baseClass");
        Intrinsics.checkNotNullParameter(function10, "defaultDeserializerProvider");
        this.registerDefaultPolymorphicDeserializer(kClass0, function10, false);
    }

    @Override  // kotlinx.serialization.modules.SerializersModuleCollector
    public void polymorphicDefaultSerializer(@NotNull KClass kClass0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(kClass0, "baseClass");
        Intrinsics.checkNotNullParameter(function10, "defaultSerializerProvider");
        this.registerDefaultPolymorphicSerializer(kClass0, function10, false);
    }

    @JvmName(name = "registerDefaultPolymorphicDeserializer")
    public final void registerDefaultPolymorphicDeserializer(@NotNull KClass kClass0, @NotNull Function1 function10, boolean z) {
        Intrinsics.checkNotNullParameter(kClass0, "baseClass");
        Intrinsics.checkNotNullParameter(function10, "defaultDeserializerProvider");
        HashMap hashMap0 = this.e;
        Function1 function11 = (Function1)hashMap0.get(kClass0);
        if(function11 != null && !Intrinsics.areEqual(function11, function10) && !z) {
            throw new IllegalArgumentException("Default deserializers provider for " + kClass0 + " is already registered: " + function11);
        }
        hashMap0.put(kClass0, function10);
    }

    @JvmName(name = "registerDefaultPolymorphicSerializer")
    public final void registerDefaultPolymorphicSerializer(@NotNull KClass kClass0, @NotNull Function1 function10, boolean z) {
        Intrinsics.checkNotNullParameter(kClass0, "baseClass");
        Intrinsics.checkNotNullParameter(function10, "defaultSerializerProvider");
        HashMap hashMap0 = this.c;
        Function1 function11 = (Function1)hashMap0.get(kClass0);
        if(function11 != null && !Intrinsics.areEqual(function11, function10) && !z) {
            throw new IllegalArgumentException("Default serializers provider for " + kClass0 + " is already registered: " + function11);
        }
        hashMap0.put(kClass0, function10);
    }

    @JvmName(name = "registerPolymorphicSerializer")
    public final void registerPolymorphicSerializer(@NotNull KClass kClass0, @NotNull KClass kClass1, @NotNull KSerializer kSerializer0, boolean z) {
        Intrinsics.checkNotNullParameter(kClass0, "baseClass");
        Intrinsics.checkNotNullParameter(kClass1, "concreteClass");
        Intrinsics.checkNotNullParameter(kSerializer0, "concreteSerializer");
        String s = kSerializer0.getDescriptor().getSerialName();
        HashMap hashMap0 = this.b;
        HashMap hashMap1 = hashMap0.get(kClass0);
        if(hashMap1 == null) {
            hashMap1 = new HashMap();
            hashMap0.put(kClass0, hashMap1);
        }
        KSerializer kSerializer1 = (KSerializer)hashMap1.get(kClass1);
        HashMap hashMap2 = this.d;
        HashMap hashMap3 = hashMap2.get(kClass0);
        if(hashMap3 == null) {
            hashMap3 = new HashMap();
            hashMap2.put(kClass0, hashMap3);
        }
        if(z) {
            if(kSerializer1 != null) {
                hashMap3.remove(kSerializer1.getDescriptor().getSerialName());
            }
            hashMap1.put(kClass1, kSerializer0);
            hashMap3.put(s, kSerializer0);
            return;
        }
        if(kSerializer1 != null) {
            if(Intrinsics.areEqual(kSerializer1, kSerializer0)) {
                hashMap3.remove(kSerializer1.getDescriptor().getSerialName());
                goto label_28;
            }
            Intrinsics.checkNotNullParameter(kClass0, "baseClass");
            Intrinsics.checkNotNullParameter(kClass1, "concreteClass");
            throw new h("Serializer for " + kClass1 + " already registered in the scope of " + kClass0);
        }
    label_28:
        KSerializer kSerializer2 = (KSerializer)hashMap3.get(s);
        if(kSerializer2 != null) {
            Object object0 = null;
            Object object1 = hashMap0.get(kClass0);
            Intrinsics.checkNotNull(object1);
            for(Object object2: z.asSequence(((Map)object1))) {
                if(((Map.Entry)object2).getValue() == kSerializer2) {
                    object0 = object2;
                    break;
                }
            }
            throw new IllegalArgumentException("Multiple polymorphic serializers for base class \'" + kClass0 + "\' have the same serial name \'" + s + "\': \'" + kClass1 + "\' and \'" + ((Map.Entry)object0) + '\'');
        }
        hashMap1.put(kClass1, kSerializer0);
        hashMap3.put(s, kSerializer0);
    }

    public static void registerPolymorphicSerializer$default(SerializersModuleBuilder serializersModuleBuilder0, KClass kClass0, KClass kClass1, KSerializer kSerializer0, boolean z, int v, Object object0) {
        if((v & 8) != 0) {
            z = false;
        }
        serializersModuleBuilder0.registerPolymorphicSerializer(kClass0, kClass1, kSerializer0, z);
    }

    @JvmName(name = "registerSerializer")
    public final void registerSerializer(@NotNull KClass kClass0, @NotNull ContextualProvider contextualProvider0, boolean z) {
        Intrinsics.checkNotNullParameter(kClass0, "forClass");
        Intrinsics.checkNotNullParameter(contextualProvider0, "provider");
        HashMap hashMap0 = this.a;
        if(!z) {
            ContextualProvider contextualProvider1 = (ContextualProvider)hashMap0.get(kClass0);
            if(contextualProvider1 != null && !Intrinsics.areEqual(contextualProvider1, contextualProvider0)) {
                throw new h("Contextual serializer or serializer provider for " + kClass0 + " already registered in this module");
            }
        }
        hashMap0.put(kClass0, contextualProvider0);
    }

    public static void registerSerializer$default(SerializersModuleBuilder serializersModuleBuilder0, KClass kClass0, ContextualProvider contextualProvider0, boolean z, int v, Object object0) {
        if((v & 4) != 0) {
            z = false;
        }
        serializersModuleBuilder0.registerSerializer(kClass0, contextualProvider0, z);
    }
}

