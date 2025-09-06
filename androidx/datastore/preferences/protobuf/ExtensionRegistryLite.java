package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ExtensionRegistryLite {
    public final Map a;
    public static volatile boolean b = false;
    public static volatile ExtensionRegistryLite c;
    public static final ExtensionRegistryLite d;

    static {
        ExtensionRegistryLite.d = new ExtensionRegistryLite(0);
    }

    public ExtensionRegistryLite() {
        this.a = new HashMap();
    }

    public ExtensionRegistryLite(int v) {
        this.a = Collections.emptyMap();
    }

    public ExtensionRegistryLite(ExtensionRegistryLite extensionRegistryLite0) {
        if(extensionRegistryLite0 == ExtensionRegistryLite.d) {
            this.a = Collections.emptyMap();
            return;
        }
        this.a = Collections.unmodifiableMap(extensionRegistryLite0.a);
    }

    public final void add(ExtensionLite extensionLite0) {
        Class class0 = extensionLite0.getClass();
        if(GeneratedExtension.class.isAssignableFrom(class0)) {
            this.add(((GeneratedExtension)extensionLite0));
        }
        if(n0.a != null && n0.a.isAssignableFrom(this.getClass())) {
            try {
                this.getClass().getMethod("add", o0.a).invoke(this, extensionLite0);
            }
            catch(Exception exception0) {
                throw new IllegalArgumentException(String.format("Could not invoke ExtensionRegistry#add for %s", extensionLite0), exception0);
            }
        }
    }

    public final void add(GeneratedExtension generatedMessageLite$GeneratedExtension0) {
        p0 p00 = new p0(generatedMessageLite$GeneratedExtension0.getNumber(), generatedMessageLite$GeneratedExtension0.getContainingTypeDefaultInstance());
        this.a.put(p00, generatedMessageLite$GeneratedExtension0);
    }

    public GeneratedExtension findLiteExtensionByNumber(MessageLite messageLite0, int v) {
        p0 p00 = new p0(v, messageLite0);
        return (GeneratedExtension)this.a.get(p00);
    }

    public static ExtensionRegistryLite getEmptyRegistry() {
        ExtensionRegistryLite extensionRegistryLite0 = ExtensionRegistryLite.c;
        if(extensionRegistryLite0 == null) {
            synchronized(ExtensionRegistryLite.class) {
                extensionRegistryLite0 = ExtensionRegistryLite.c;
                if(extensionRegistryLite0 == null) {
                    ExtensionRegistryLite extensionRegistryLite1 = null;
                    Class class1 = n0.a;
                    if(class1 != null) {
                        try {
                            extensionRegistryLite1 = (ExtensionRegistryLite)class1.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        }
                        catch(Exception unused_ex) {
                        }
                    }
                    if(extensionRegistryLite1 == null) {
                        extensionRegistryLite1 = ExtensionRegistryLite.d;
                    }
                    ExtensionRegistryLite.c = extensionRegistryLite1;
                    extensionRegistryLite0 = extensionRegistryLite1;
                }
            }
        }
        return extensionRegistryLite0;
    }

    public ExtensionRegistryLite getUnmodifiable() {
        return new ExtensionRegistryLite(this);
    }

    public static boolean isEagerlyParseMessageSets() {
        return ExtensionRegistryLite.b;
    }

    public static ExtensionRegistryLite newInstance() {
        Class class0 = n0.a;
        ExtensionRegistryLite extensionRegistryLite0 = null;
        if(class0 != null) {
            try {
                extensionRegistryLite0 = (ExtensionRegistryLite)class0.getDeclaredMethod("newInstance", null).invoke(null, null);
            }
            catch(Exception unused_ex) {
            }
        }
        return extensionRegistryLite0 == null ? new ExtensionRegistryLite() : extensionRegistryLite0;
    }

    public static void setEagerlyParseMessageSets(boolean z) {
        ExtensionRegistryLite.b = z;
    }
}

