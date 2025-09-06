package kotlinx.serialization.modules;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.x;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\u001C\u0010\u0002\u001A\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001A\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001A\u001C\u0010\u0004\u001A\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001A\u00020\u0000H\u0086\u0004¢\u0006\u0004\b\u0004\u0010\u0003\" \u0010\u000B\u001A\u00020\u00008\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\n\u001A\u0004\b\u0007\u0010\b*\\\b\u0000\u0010\u0013\u001A\u0004\b\u0000\u0010\f\"\'\u0012\u0015\u0012\u0013\u0018\u00010\u000E¢\u0006\f\b\u000F\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00120\r2\'\u0012\u0015\u0012\u0013\u0018\u00010\u000E¢\u0006\f\b\u000F\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00120\r*X\b\u0000\u0010\u0016\u001A\u0004\b\u0000\u0010\f\"%\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000F\u0012\b\b\u0010\u0012\u0004\b\b(\u0014\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00150\r2%\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000F\u0012\b\b\u0010\u0012\u0004\b\b(\u0014\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00150\r¨\u0006\u0017"}, d2 = {"Lkotlinx/serialization/modules/SerializersModule;", "other", "plus", "(Lkotlinx/serialization/modules/SerializersModule;Lkotlinx/serialization/modules/SerializersModule;)Lkotlinx/serialization/modules/SerializersModule;", "overwriteWith", "a", "Lkotlinx/serialization/modules/SerializersModule;", "getEmptySerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "getEmptySerializersModule$annotations", "()V", "EmptySerializersModule", "Base", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "className", "Lkotlinx/serialization/DeserializationStrategy;", "PolymorphicDeserializerProvider", "value", "Lkotlinx/serialization/SerializationStrategy;", "PolymorphicSerializerProvider", "kotlinx-serialization-core"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSerializersModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerializersModule.kt\nkotlinx/serialization/modules/SerializersModuleKt\n+ 2 SerializersModuleBuilders.kt\nkotlinx/serialization/modules/SerializersModuleBuildersKt\n*L\n1#1,234:1\n31#2,3:235\n31#2,3:238\n*S KotlinDebug\n*F\n+ 1 SerializersModule.kt\nkotlinx/serialization/modules/SerializersModuleKt\n*L\n87#1:235,3\n99#1:238,3\n*E\n"})
public final class SerializersModuleKt {
    public static final SerialModuleImpl a;

    static {
        SerializersModuleKt.a = new SerialModuleImpl(x.emptyMap(), x.emptyMap(), x.emptyMap(), x.emptyMap(), x.emptyMap());
    }

    @NotNull
    public static final SerializersModule getEmptySerializersModule() {
        return SerializersModuleKt.a;
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated in the favour of \'EmptySerializersModule()\'", replaceWith = @ReplaceWith(expression = "EmptySerializersModule()", imports = {}))
    public static void getEmptySerializersModule$annotations() {
    }

    @NotNull
    public static final SerializersModule overwriteWith(@NotNull SerializersModule serializersModule0, @NotNull SerializersModule serializersModule1) {
        Intrinsics.checkNotNullParameter(serializersModule0, "<this>");
        Intrinsics.checkNotNullParameter(serializersModule1, "other");
        SerializersModuleBuilder serializersModuleBuilder0 = new SerializersModuleBuilder();
        serializersModuleBuilder0.include(serializersModule0);
        serializersModule1.dumpTo(new SerializersModuleCollector() {
            public final SerializersModuleBuilder a;

            {
                SerializersModuleBuilder serializersModuleBuilder0 = serializersModuleBuilder0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.a = serializersModuleBuilder0;
            }

            @Override  // kotlinx.serialization.modules.SerializersModuleCollector
            public void contextual(@NotNull KClass kClass0, @NotNull Function1 function10) {
                Intrinsics.checkNotNullParameter(kClass0, "kClass");
                Intrinsics.checkNotNullParameter(function10, "provider");
                WithTypeArguments contextualProvider$WithTypeArguments0 = new WithTypeArguments(function10);
                this.a.registerSerializer(kClass0, contextualProvider$WithTypeArguments0, true);
            }

            @Override  // kotlinx.serialization.modules.SerializersModuleCollector
            public void contextual(@NotNull KClass kClass0, @NotNull KSerializer kSerializer0) {
                Intrinsics.checkNotNullParameter(kClass0, "kClass");
                Intrinsics.checkNotNullParameter(kSerializer0, "serializer");
                Argless contextualProvider$Argless0 = new Argless(kSerializer0);
                this.a.registerSerializer(kClass0, contextualProvider$Argless0, true);
            }

            @Override  // kotlinx.serialization.modules.SerializersModuleCollector
            public void polymorphic(@NotNull KClass kClass0, @NotNull KClass kClass1, @NotNull KSerializer kSerializer0) {
                Intrinsics.checkNotNullParameter(kClass0, "baseClass");
                Intrinsics.checkNotNullParameter(kClass1, "actualClass");
                Intrinsics.checkNotNullParameter(kSerializer0, "actualSerializer");
                this.a.registerPolymorphicSerializer(kClass0, kClass1, kSerializer0, true);
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
                this.a.registerDefaultPolymorphicDeserializer(kClass0, function10, true);
            }

            @Override  // kotlinx.serialization.modules.SerializersModuleCollector
            public void polymorphicDefaultSerializer(@NotNull KClass kClass0, @NotNull Function1 function10) {
                Intrinsics.checkNotNullParameter(kClass0, "baseClass");
                Intrinsics.checkNotNullParameter(function10, "defaultSerializerProvider");
                this.a.registerDefaultPolymorphicSerializer(kClass0, function10, true);
            }
        });
        return serializersModuleBuilder0.build();
    }

    @NotNull
    public static final SerializersModule plus(@NotNull SerializersModule serializersModule0, @NotNull SerializersModule serializersModule1) {
        Intrinsics.checkNotNullParameter(serializersModule0, "<this>");
        Intrinsics.checkNotNullParameter(serializersModule1, "other");
        SerializersModuleBuilder serializersModuleBuilder0 = new SerializersModuleBuilder();
        serializersModuleBuilder0.include(serializersModule0);
        serializersModuleBuilder0.include(serializersModule1);
        return serializersModuleBuilder0.build();
    }
}

