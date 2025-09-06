package kotlinx.serialization.modules;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001JQ\u0010\u0002\u001A\u00020\u0003\"\b\b\u0000\u0010\u0004*\u00020\u00012\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u0002H\u00040\u00062/\u0010\u0007\u001A+\u0012\u001D\u0012\u001B\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\t\u00A2\u0006\f\b\u000B\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\bH&J.\u0010\u0002\u001A\u00020\u0003\"\b\b\u0000\u0010\u0004*\u00020\u00012\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u0002H\u00040\u00062\f\u0010\u000E\u001A\b\u0012\u0004\u0012\u0002H\u00040\nH\u0016JF\u0010\u000F\u001A\u00020\u0003\"\b\b\u0000\u0010\u0010*\u00020\u0001\"\b\b\u0001\u0010\u0011*\u0002H\u00102\f\u0010\u0012\u001A\b\u0012\u0004\u0012\u0002H\u00100\u00062\f\u0010\u0013\u001A\b\u0012\u0004\u0012\u0002H\u00110\u00062\f\u0010\u0014\u001A\b\u0012\u0004\u0012\u0002H\u00110\nH&JM\u0010\u0015\u001A\u00020\u0003\"\b\b\u0000\u0010\u0010*\u00020\u00012\f\u0010\u0012\u001A\b\u0012\u0004\u0012\u0002H\u00100\u00062+\u0010\u0016\u001A\'\u0012\u0015\u0012\u0013\u0018\u00010\u0017\u00A2\u0006\f\b\u000B\u0012\b\b\f\u0012\u0004\b\b(\u0018\u0012\f\u0012\n\u0012\u0004\u0012\u0002H\u0010\u0018\u00010\u00190\bH\u0017JM\u0010\u001A\u001A\u00020\u0003\"\b\b\u0000\u0010\u0010*\u00020\u00012\f\u0010\u0012\u001A\b\u0012\u0004\u0012\u0002H\u00100\u00062+\u0010\u0016\u001A\'\u0012\u0015\u0012\u0013\u0018\u00010\u0017\u00A2\u0006\f\b\u000B\u0012\b\b\f\u0012\u0004\b\b(\u0018\u0012\f\u0012\n\u0012\u0004\u0012\u0002H\u0010\u0018\u00010\u00190\bH&JK\u0010\u001B\u001A\u00020\u0003\"\b\b\u0000\u0010\u0010*\u00020\u00012\f\u0010\u0012\u001A\b\u0012\u0004\u0012\u0002H\u00100\u00062)\u0010\u001C\u001A%\u0012\u0013\u0012\u0011H\u0010\u00A2\u0006\f\b\u000B\u0012\b\b\f\u0012\u0004\b\b(\u001D\u0012\f\u0012\n\u0012\u0004\u0012\u0002H\u0010\u0018\u00010\u001E0\bH&\u00A8\u0006\u001F"}, d2 = {"Lkotlinx/serialization/modules/SerializersModuleCollector;", "", "contextual", "", "T", "kClass", "Lkotlin/reflect/KClass;", "provider", "Lkotlin/Function1;", "", "Lkotlinx/serialization/KSerializer;", "Lkotlin/ParameterName;", "name", "typeArgumentsSerializers", "serializer", "polymorphic", "Base", "Sub", "baseClass", "actualClass", "actualSerializer", "polymorphicDefault", "defaultDeserializerProvider", "", "className", "Lkotlinx/serialization/DeserializationStrategy;", "polymorphicDefaultDeserializer", "polymorphicDefaultSerializer", "defaultSerializerProvider", "value", "Lkotlinx/serialization/SerializationStrategy;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@ExperimentalSerializationApi
public interface SerializersModuleCollector {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class DefaultImpls {
        public static void contextual(@NotNull SerializersModuleCollector serializersModuleCollector0, @NotNull KClass kClass0, @NotNull KSerializer kSerializer0) {
            Intrinsics.checkNotNullParameter(kClass0, "kClass");
            Intrinsics.checkNotNullParameter(kSerializer0, "serializer");
            serializersModuleCollector0.contextual(kClass0, new a(kSerializer0));
        }

        @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated in favor of function with more precise name: polymorphicDefaultDeserializer", replaceWith = @ReplaceWith(expression = "polymorphicDefaultDeserializer(baseClass, defaultDeserializerProvider)", imports = {}))
        public static void polymorphicDefault(@NotNull SerializersModuleCollector serializersModuleCollector0, @NotNull KClass kClass0, @NotNull Function1 function10) {
            Intrinsics.checkNotNullParameter(kClass0, "baseClass");
            Intrinsics.checkNotNullParameter(function10, "defaultDeserializerProvider");
            serializersModuleCollector0.polymorphicDefaultDeserializer(kClass0, function10);
        }
    }

    void contextual(@NotNull KClass arg1, @NotNull Function1 arg2);

    void contextual(@NotNull KClass arg1, @NotNull KSerializer arg2);

    void polymorphic(@NotNull KClass arg1, @NotNull KClass arg2, @NotNull KSerializer arg3);

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated in favor of function with more precise name: polymorphicDefaultDeserializer", replaceWith = @ReplaceWith(expression = "polymorphicDefaultDeserializer(baseClass, defaultDeserializerProvider)", imports = {}))
    void polymorphicDefault(@NotNull KClass arg1, @NotNull Function1 arg2);

    void polymorphicDefaultDeserializer(@NotNull KClass arg1, @NotNull Function1 arg2);

    void polymorphicDefaultSerializer(@NotNull KClass arg1, @NotNull Function1 arg2);
}

