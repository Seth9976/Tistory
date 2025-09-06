package androidx.datastore.preferences.protobuf;

import java.util.ArrayDeque;
import java.util.Arrays;

public final class b2 implements SchemaFactory {
    public final Object a;
    public static final h1 b;

    static {
        b2.b = new h1(1);
    }

    public b2(int v) {
        MessageInfoFactory messageInfoFactory0;
        if(v != 1) {
            try {
                messageInfoFactory0 = (MessageInfoFactory)Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
            }
            catch(Exception unused_ex) {
                messageInfoFactory0 = b2.b;
            }
            a2 a20 = new a2();  // 初始化器: Ljava/lang/Object;-><init>()V
            a20.a = new MessageInfoFactory[]{h1.b, messageInfoFactory0};
            super();
            this.a = a20;
            return;
        }
        super();
        this.a = new ArrayDeque();
    }

    public void a(ByteString byteString0) {
        if(byteString0.isBalanced()) {
            int v = Arrays.binarySearch(b3.i, byteString0.size());
            if(v < 0) {
                v = -(v + 1) - 1;
            }
            int v1 = b3.h(v + 1);
            ArrayDeque arrayDeque0 = (ArrayDeque)this.a;
            if(!arrayDeque0.isEmpty() && ((ByteString)arrayDeque0.peek()).size() < v1) {
                int v2 = b3.h(v);
                ByteString byteString1;
                for(byteString1 = (ByteString)arrayDeque0.pop(); !arrayDeque0.isEmpty() && ((ByteString)arrayDeque0.peek()).size() < v2; byteString1 = new b3(((ByteString)arrayDeque0.pop()), byteString1)) {
                }
                b3 b30;
                for(b30 = new b3(byteString1, byteString0); !arrayDeque0.isEmpty(); b30 = new b3(((ByteString)arrayDeque0.pop()), b30)) {
                    int v3 = Arrays.binarySearch(b3.i, b30.d);
                    if(v3 < 0) {
                        v3 = -(v3 + 1) - 1;
                    }
                    int v4 = b3.h(v3 + 1);
                    if(((ByteString)arrayDeque0.peek()).size() >= v4) {
                        break;
                    }
                }
                arrayDeque0.push(b30);
                return;
            }
            arrayDeque0.push(byteString0);
            return;
        }
        if(!(byteString0 instanceof b3)) {
            throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + byteString0.getClass());
        }
        this.a(((b3)byteString0).e);
        this.a(((b3)byteString0).f);
    }

    @Override  // androidx.datastore.preferences.protobuf.SchemaFactory
    public Schema createSchema(Class class0) {
        Class class1 = GeneratedMessageLite.class;
        if(!class1.isAssignableFrom(class0) && (c3.a != null && !c3.a.isAssignableFrom(class0))) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
        MessageInfo messageInfo0 = ((a2)this.a).messageInfoFor(class0);
        if(messageInfo0.isMessageSetWireFormat()) {
            if(class1.isAssignableFrom(class0)) {
                MessageLite messageLite0 = messageInfo0.getDefaultInstance();
                return new j2(c3.d, t0.a, messageLite0);
            }
            w3 w30 = c3.b;
            q0 q00 = t0.b;
            if(q00 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            return new j2(w30, q00, messageInfo0.getDefaultInstance());
        }
        if(class1.isAssignableFrom(class0)) {
            return messageInfo0.getSyntax() == ProtoSyntax.PROTO2 ? i2.u(messageInfo0, o2.b, x1.b, c3.d, t0.a, f2.b) : i2.u(messageInfo0, o2.b, x1.b, c3.d, null, f2.b);
        }
        if(messageInfo0.getSyntax() == ProtoSyntax.PROTO2) {
            NewInstanceSchema newInstanceSchema0 = o2.a;
            v1 v10 = x1.a;
            w3 w31 = c3.b;
            q0 q01 = t0.b;
            if(q01 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            return i2.u(messageInfo0, newInstanceSchema0, v10, w31, q01, f2.a);
        }
        return i2.u(messageInfo0, o2.a, x1.a, c3.c, null, f2.a);
    }
}

