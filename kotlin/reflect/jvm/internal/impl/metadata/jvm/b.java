package kotlin.reflect.jvm.internal.impl.metadata.jvm;

import kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;

public final class b extends AbstractParser {
    @Override  // kotlin.reflect.jvm.internal.impl.protobuf.Parser
    public final Object parsePartialFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) {
        return new JvmMethodSignature(codedInputStream0, extensionRegistryLite0);
    }
}

