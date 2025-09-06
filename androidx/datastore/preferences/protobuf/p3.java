package androidx.datastore.preferences.protobuf;

public final class p3 implements MessageInfo {
    public final ProtoSyntax a;
    public final boolean b;
    public final int[] c;
    public final a1[] d;
    public final MessageLite e;

    public p3(ProtoSyntax protoSyntax0, boolean z, int[] arr_v, a1[] arr_a1, Object object0) {
        this.a = protoSyntax0;
        this.b = z;
        this.c = arr_v;
        this.d = arr_a1;
        Internal.a(object0, "defaultInstance");
        this.e = (MessageLite)object0;
    }

    @Override  // androidx.datastore.preferences.protobuf.MessageInfo
    public final MessageLite getDefaultInstance() {
        return this.e;
    }

    @Override  // androidx.datastore.preferences.protobuf.MessageInfo
    public final ProtoSyntax getSyntax() {
        return this.a;
    }

    @Override  // androidx.datastore.preferences.protobuf.MessageInfo
    public final boolean isMessageSetWireFormat() {
        return this.b;
    }
}

