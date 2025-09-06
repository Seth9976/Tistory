package kotlinx.serialization.json.internal;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind.CONTEXTUAL;
import kotlinx.serialization.descriptors.SerialKind.ENUM;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind.LIST;
import kotlinx.serialization.descriptors.StructureKind.MAP;
import kotlinx.serialization.modules.SerializersModuleCollector.DefaultImpls;
import kotlinx.serialization.modules.SerializersModuleCollector;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JX\u0010\u0014\u001A\u00020\u0013\"\b\b\u0000\u0010\t*\u00020\b2\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00028\u00000\n2/\u0010\u0012\u001A+\u0012\u001D\u0012\u001B\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000E0\r¢\u0006\f\b\u000F\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000E0\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015JM\u0010\u001B\u001A\u00020\u0013\"\b\b\u0000\u0010\u0016*\u00020\b\"\b\b\u0001\u0010\u0017*\u00028\u00002\f\u0010\u0018\u001A\b\u0012\u0004\u0012\u00028\u00000\n2\f\u0010\u0019\u001A\b\u0012\u0004\u0012\u00028\u00010\n2\f\u0010\u001A\u001A\b\u0012\u0004\u0012\u00028\u00010\u000EH\u0016¢\u0006\u0004\b\u001B\u0010\u001CJR\u0010 \u001A\u00020\u0013\"\b\b\u0000\u0010\u0016*\u00020\b2\f\u0010\u0018\u001A\b\u0012\u0004\u0012\u00028\u00000\n2)\u0010\u001F\u001A%\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000F\u0012\b\b\u0010\u0012\u0004\b\b(\u001D\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001E0\fH\u0016¢\u0006\u0004\b \u0010\u0015JT\u0010$\u001A\u00020\u0013\"\b\b\u0000\u0010\u0016*\u00020\b2\f\u0010\u0018\u001A\b\u0012\u0004\u0012\u00028\u00000\n2+\u0010#\u001A\'\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\u000F\u0012\b\b\u0010\u0012\u0004\b\b(!\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\"0\fH\u0016¢\u0006\u0004\b$\u0010\u0015¨\u0006%"}, d2 = {"Lkotlinx/serialization/json/internal/PolymorphismValidator;", "Lkotlinx/serialization/modules/SerializersModuleCollector;", "", "useArrayPolymorphism", "", "discriminator", "<init>", "(ZLjava/lang/String;)V", "", "T", "Lkotlin/reflect/KClass;", "kClass", "Lkotlin/Function1;", "", "Lkotlinx/serialization/KSerializer;", "Lkotlin/ParameterName;", "name", "typeArgumentsSerializers", "provider", "", "contextual", "(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function1;)V", "Base", "Sub", "baseClass", "actualClass", "actualSerializer", "polymorphic", "(Lkotlin/reflect/KClass;Lkotlin/reflect/KClass;Lkotlinx/serialization/KSerializer;)V", "value", "Lkotlinx/serialization/SerializationStrategy;", "defaultSerializerProvider", "polymorphicDefaultSerializer", "className", "Lkotlinx/serialization/DeserializationStrategy;", "defaultDeserializerProvider", "polymorphicDefaultDeserializer", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class PolymorphismValidator implements SerializersModuleCollector {
    public final boolean a;
    public final String b;

    public PolymorphismValidator(boolean z, @NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "discriminator");
        super();
        this.a = z;
        this.b = s;
    }

    @Override  // kotlinx.serialization.modules.SerializersModuleCollector
    public void contextual(@NotNull KClass kClass0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(kClass0, "kClass");
        Intrinsics.checkNotNullParameter(function10, "provider");
    }

    @Override  // kotlinx.serialization.modules.SerializersModuleCollector
    public void contextual(@NotNull KClass kClass0, @NotNull KSerializer kSerializer0) {
        DefaultImpls.contextual(this, kClass0, kSerializer0);
    }

    @Override  // kotlinx.serialization.modules.SerializersModuleCollector
    public void polymorphic(@NotNull KClass kClass0, @NotNull KClass kClass1, @NotNull KSerializer kSerializer0) {
        Intrinsics.checkNotNullParameter(kClass0, "baseClass");
        Intrinsics.checkNotNullParameter(kClass1, "actualClass");
        Intrinsics.checkNotNullParameter(kSerializer0, "actualSerializer");
        SerialDescriptor serialDescriptor0 = kSerializer0.getDescriptor();
        SerialKind serialKind0 = serialDescriptor0.getKind();
        if(serialKind0 instanceof PolymorphicKind || Intrinsics.areEqual(serialKind0, CONTEXTUAL.INSTANCE)) {
            throw new IllegalArgumentException("Serializer for " + kClass1.getSimpleName() + " can\'t be registered as a subclass for polymorphic serialization because its kind " + serialKind0 + " is not concrete. To work with multiple hierarchies, register it as a base class.");
        }
        boolean z = this.a;
        if(!z && (Intrinsics.areEqual(serialKind0, LIST.INSTANCE) || Intrinsics.areEqual(serialKind0, MAP.INSTANCE) || serialKind0 instanceof PrimitiveKind || serialKind0 instanceof ENUM)) {
            throw new IllegalArgumentException("Serializer for " + kClass1.getSimpleName() + " of kind " + serialKind0 + " cannot be serialized polymorphically with class discriminator.");
        }
        if(!z) {
            int v = serialDescriptor0.getElementsCount();
            for(int v1 = 0; v1 < v; ++v1) {
                String s = serialDescriptor0.getElementName(v1);
                if(Intrinsics.areEqual(s, this.b)) {
                    throw new IllegalArgumentException("Polymorphic serializer for " + kClass1 + " has property \'" + s + "\' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
                }
            }
        }
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
    }

    @Override  // kotlinx.serialization.modules.SerializersModuleCollector
    public void polymorphicDefaultSerializer(@NotNull KClass kClass0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(kClass0, "baseClass");
        Intrinsics.checkNotNullParameter(function10, "defaultSerializerProvider");
    }
}

