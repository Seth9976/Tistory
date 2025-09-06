package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.io.ByteArrayInputStream;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.Parser;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nDeserializedMemberScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeserializedMemberScope.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1\n*L\n1#1,512:1\n*E\n"})
public final class DeserializedMemberScope.OptimizedImplementation.computeDescriptors.1.1 extends Lambda implements Function0 {
    public final Parser w;
    public final ByteArrayInputStream x;
    public final DeserializedMemberScope y;

    public DeserializedMemberScope.OptimizedImplementation.computeDescriptors.1.1(Parser parser0, ByteArrayInputStream byteArrayInputStream0, DeserializedMemberScope deserializedMemberScope0) {
        this.w = parser0;
        this.x = byteArrayInputStream0;
        this.y = deserializedMemberScope0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public Object invoke() {
        return this.invoke();
    }

    @Nullable
    public final MessageLite invoke() {
        ExtensionRegistryLite extensionRegistryLite0 = this.y.getC().getComponents().getExtensionRegistryLite();
        return (MessageLite)this.w.parseDelimitedFrom(this.x, extensionRegistryLite0);
    }
}

