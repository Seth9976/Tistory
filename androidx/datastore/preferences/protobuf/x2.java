package androidx.datastore.preferences.protobuf;

public final class x2 implements MessageInfo {
    public final MessageLite a;
    public final String b;
    public final Object[] c;
    public final int d;

    public x2(MessageLite messageLite0, String s, Object[] arr_object) {
        this.a = messageLite0;
        this.b = s;
        this.c = arr_object;
        int v = s.charAt(0);
        if(v < 0xD800) {
            this.d = v;
            return;
        }
        int v1 = v & 0x1FFF;
        int v2 = 13;
        int v4;
        for(int v3 = 1; (v4 = s.charAt(v3)) >= 0xD800; ++v3) {
            v1 |= (v4 & 0x1FFF) << v2;
            v2 += 13;
        }
        this.d = v1 | v4 << v2;
    }

    public final Object[] a() {
        return this.c;
    }

    public final String b() {
        return this.b;
    }

    @Override  // androidx.datastore.preferences.protobuf.MessageInfo
    public final MessageLite getDefaultInstance() {
        return this.a;
    }

    @Override  // androidx.datastore.preferences.protobuf.MessageInfo
    public final ProtoSyntax getSyntax() {
        return (this.d & 1) == 1 ? ProtoSyntax.PROTO2 : ProtoSyntax.PROTO3;
    }

    @Override  // androidx.datastore.preferences.protobuf.MessageInfo
    public final boolean isMessageSetWireFormat() {
        return (this.d & 2) == 2;
    }
}

