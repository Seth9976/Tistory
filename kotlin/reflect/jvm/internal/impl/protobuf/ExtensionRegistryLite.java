package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ExtensionRegistryLite {
    public final Map a;
    public static final ExtensionRegistryLite b;

    static {
        ExtensionRegistryLite.b = new ExtensionRegistryLite(0);
    }

    public ExtensionRegistryLite() {
        this.a = new HashMap();
    }

    public ExtensionRegistryLite(int v) {
        this.a = Collections.emptyMap();
    }

    public final void add(GeneratedExtension generatedMessageLite$GeneratedExtension0) {
        b b0 = new b(generatedMessageLite$GeneratedExtension0.getContainingTypeDefaultInstance(), generatedMessageLite$GeneratedExtension0.getNumber());
        this.a.put(b0, generatedMessageLite$GeneratedExtension0);
    }

    public GeneratedExtension findLiteExtensionByNumber(MessageLite messageLite0, int v) {
        b b0 = new b(messageLite0, v);
        return (GeneratedExtension)this.a.get(b0);
    }

    public static ExtensionRegistryLite getEmptyRegistry() {
        return ExtensionRegistryLite.b;
    }

    public static ExtensionRegistryLite newInstance() {
        return new ExtensionRegistryLite();
    }
}

