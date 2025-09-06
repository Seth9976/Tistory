package androidx.datastore.preferences.protobuf;

public final class h1 implements MessageInfoFactory {
    public final int a;
    public static final h1 b;

    static {
        h1.b = new h1(0);
    }

    public h1(int v) {
        this.a = v;
        super();
    }

    @Override  // androidx.datastore.preferences.protobuf.MessageInfoFactory
    public final boolean isSupported(Class class0) {
        return this.a == 0 ? GeneratedMessageLite.class.isAssignableFrom(class0) : false;
    }

    @Override  // androidx.datastore.preferences.protobuf.MessageInfoFactory
    public final MessageInfo messageInfoFor(Class class0) {
        if(this.a != 0) {
            throw new IllegalStateException("This should never be called.");
        }
        Class class1 = GeneratedMessageLite.class;
        if(class1.isAssignableFrom(class0)) {
            try {
                return (MessageInfo)GeneratedMessageLite.h(class0.asSubclass(class1)).dynamicMethod(MethodToInvoke.BUILD_MESSAGE_INFO);
            }
            catch(Exception exception0) {
                throw new RuntimeException("Unable to get message info for " + class0.getName(), exception0);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: " + class0.getName());
    }
}

