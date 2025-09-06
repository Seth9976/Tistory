package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map.Entry;

public final class j2 implements Schema {
    public final MessageLite a;
    public final w3 b;
    public final boolean c;
    public final q0 d;

    public j2(w3 w30, q0 q00, MessageLite messageLite0) {
        this.b = w30;
        ((s0)q00).getClass();
        this.c = messageLite0 instanceof ExtendableMessage;
        this.d = q00;
        this.a = messageLite0;
    }

    public final boolean a(Reader reader0, ExtensionRegistryLite extensionRegistryLite0, q0 q00, d1 d10, w3 w30, UnknownFieldSetLite unknownFieldSetLite0) {
        int v = reader0.getTag();
        MessageLite messageLite0 = this.a;
        if(v != 11) {
            if((v & 7) == 2) {
                ((s0)q00).getClass();
                GeneratedExtension generatedMessageLite$GeneratedExtension0 = extensionRegistryLite0.findLiteExtensionByNumber(messageLite0, v >>> 3);
                if(generatedMessageLite$GeneratedExtension0 != null) {
                    ((s0)q00).getClass();
                    Object object0 = reader0.readMessage(generatedMessageLite$GeneratedExtension0.getMessageDefaultInstance().getClass(), extensionRegistryLite0);
                    d10.q(generatedMessageLite$GeneratedExtension0.d, object0);
                    return true;
                }
                return w30.c(unknownFieldSetLite0, reader0);
            }
            return reader0.skipField();
        }
        GeneratedExtension generatedMessageLite$GeneratedExtension1 = null;
        ByteString byteString0 = null;
        int v1 = 0;
        while(reader0.getFieldNumber() != 0x7FFFFFFF) {
            int v2 = reader0.getTag();
            if(v2 == 16) {
                v1 = reader0.readUInt32();
                ((s0)q00).getClass();
                generatedMessageLite$GeneratedExtension1 = extensionRegistryLite0.findLiteExtensionByNumber(messageLite0, v1);
            }
            else if(v2 == 26) {
                if(generatedMessageLite$GeneratedExtension1 == null) {
                    byteString0 = reader0.readBytes();
                }
                else {
                    ((s0)q00).getClass();
                    Object object1 = reader0.readMessage(generatedMessageLite$GeneratedExtension1.getMessageDefaultInstance().getClass(), extensionRegistryLite0);
                    d10.q(generatedMessageLite$GeneratedExtension1.d, object1);
                }
            }
            else if(!reader0.skipField()) {
                break;
            }
        }
        if(reader0.getTag() != 12) {
            throw InvalidProtocolBufferException.a();
        }
        if(byteString0 != null) {
            if(generatedMessageLite$GeneratedExtension1 != null) {
                ((s0)q00).getClass();
                Builder messageLite$Builder0 = generatedMessageLite$GeneratedExtension1.getMessageDefaultInstance().newBuilderForType();
                CodedInputStream codedInputStream0 = byteString0.newCodedInput();
                messageLite$Builder0.mergeFrom(codedInputStream0, extensionRegistryLite0);
                MessageLite messageLite1 = messageLite$Builder0.buildPartial();
                d10.q(generatedMessageLite$GeneratedExtension1.d, messageLite1);
                codedInputStream0.checkLastTagWas(0);
                return true;
            }
            ((x3)w30).getClass();
            unknownFieldSetLite0.e(v1 << 3 | 2, byteString0);
        }
        return true;
    }

    @Override  // androidx.datastore.preferences.protobuf.Schema
    public final boolean equals(Object object0, Object object1) {
        ((x3)this.b).getClass();
        UnknownFieldSetLite unknownFieldSetLite0 = ((GeneratedMessageLite)object0).unknownFields;
        ((x3)this.b).getClass();
        if(!unknownFieldSetLite0.equals(((GeneratedMessageLite)object1).unknownFields)) {
            return false;
        }
        if(this.c) {
            ((s0)this.d).getClass();
            d1 d10 = ((ExtendableMessage)object0).extensions;
            ((s0)this.d).getClass();
            return d10.equals(((ExtendableMessage)object1).extensions);
        }
        return true;
    }

    @Override  // androidx.datastore.preferences.protobuf.Schema
    public final int getSerializedSize(Object object0) {
        ((x3)this.b).getClass();
        int v = ((GeneratedMessageLite)object0).unknownFields.getSerializedSizeAsMessageSet();
        if(this.c) {
            ((s0)this.d).getClass();
            return v + ((ExtendableMessage)object0).extensions.g();
        }
        return v;
    }

    @Override  // androidx.datastore.preferences.protobuf.Schema
    public final int hashCode(Object object0) {
        ((x3)this.b).getClass();
        int v = ((GeneratedMessageLite)object0).unknownFields.hashCode();
        if(this.c) {
            ((s0)this.d).getClass();
            return v * 53 + ((ExtendableMessage)object0).extensions.a.hashCode();
        }
        return v;
    }

    @Override  // androidx.datastore.preferences.protobuf.Schema
    public final boolean isInitialized(Object object0) {
        ((s0)this.d).getClass();
        return ((ExtendableMessage)object0).extensions.k();
    }

    @Override  // androidx.datastore.preferences.protobuf.Schema
    public final void makeImmutable(Object object0) {
        this.b.b(object0);
        this.d.e(object0);
    }

    @Override  // androidx.datastore.preferences.protobuf.Schema
    public final void mergeFrom(Object object0, Reader reader0, ExtensionRegistryLite extensionRegistryLite0) {
        w3 w30 = this.b;
        UnknownFieldSetLite unknownFieldSetLite0 = w30.a(object0);
        q0 q00 = this.d;
        ((s0)q00).getClass();
        d1 d10 = ((ExtendableMessage)object0).p();
        try {
            while(reader0.getFieldNumber() != 0x7FFFFFFF && this.a(reader0, extensionRegistryLite0, q00, d10, w30, unknownFieldSetLite0)) {
            }
        }
        finally {
            ((GeneratedMessageLite)object0).unknownFields = unknownFieldSetLite0;
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Schema
    public final void mergeFrom(Object object0, Object object1) {
        c3.C(this.b, object0, object1);
        if(this.c) {
            ((s0)this.d).getClass();
            d1 d10 = ((ExtendableMessage)object1).extensions;
            if(!d10.a.isEmpty()) {
                ((ExtendableMessage)object0).p().o(d10);
            }
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Schema
    public final void mergeFrom(Object object0, byte[] arr_b, int v, int v1, g g0) {
        UnknownFieldSetLite unknownFieldSetLite0 = ((GeneratedMessageLite)object0).unknownFields;
        if(unknownFieldSetLite0 == UnknownFieldSetLite.getDefaultInstance()) {
            unknownFieldSetLite0 = new UnknownFieldSetLite();
            ((GeneratedMessageLite)object0).unknownFields = unknownFieldSetLite0;
        }
        d1 d10 = ((ExtendableMessage)object0).p();
        int v2 = v;
        GeneratedExtension generatedMessageLite$GeneratedExtension0 = null;
        while(v2 < v1) {
            int v3 = h.H(arr_b, v2, g0);
            int v4 = g0.a;
            MessageLite messageLite0 = this.a;
            q0 q00 = this.d;
            ExtensionRegistryLite extensionRegistryLite0 = g0.d;
            if(v4 == 11) {
                int v5 = 0;
                ByteString byteString0 = null;
                while(v3 < v1) {
                    v3 = h.H(arr_b, v3, g0);
                    int v6 = g0.a;
                    int v7 = v6 & 7;
                    switch(v6 >>> 3) {
                        case 2: {
                            if(v7 == 0) {
                                v3 = h.H(arr_b, v3, g0);
                                v5 = g0.a;
                                ((s0)q00).getClass();
                                generatedMessageLite$GeneratedExtension0 = extensionRegistryLite0.findLiteExtensionByNumber(messageLite0, v5);
                                continue;
                            }
                            break;
                        }
                        case 3: {
                            if(generatedMessageLite$GeneratedExtension0 != null) {
                                Class class1 = generatedMessageLite$GeneratedExtension0.getMessageDefaultInstance().getClass();
                                v3 = h.o(v2.c.a(class1), arr_b, v3, v1, g0);
                                d10.q(generatedMessageLite$GeneratedExtension0.d, g0.c);
                                continue;
                            }
                            else if(v7 == 2) {
                                v3 = h.b(arr_b, v3, g0);
                                byteString0 = (ByteString)g0.c;
                                continue;
                            }
                        }
                    }
                    if(v6 == 12) {
                        break;
                    }
                    v3 = h.N(v6, arr_b, v3, v1, g0);
                }
                if(byteString0 != null) {
                    unknownFieldSetLite0.e(v5 << 3 | 2, byteString0);
                }
                v2 = v3;
            }
            else if((v4 & 7) == 2) {
                ((s0)q00).getClass();
                GeneratedExtension generatedMessageLite$GeneratedExtension1 = extensionRegistryLite0.findLiteExtensionByNumber(messageLite0, v4 >>> 3);
                if(generatedMessageLite$GeneratedExtension1 == null) {
                    v2 = h.F(v4, arr_b, v3, v1, unknownFieldSetLite0, g0);
                }
                else {
                    Class class0 = generatedMessageLite$GeneratedExtension1.getMessageDefaultInstance().getClass();
                    v2 = h.o(v2.c.a(class0), arr_b, v3, v1, g0);
                    d10.q(generatedMessageLite$GeneratedExtension1.d, g0.c);
                }
                generatedMessageLite$GeneratedExtension0 = generatedMessageLite$GeneratedExtension1;
            }
            else {
                v2 = h.N(v4, arr_b, v3, v1, g0);
            }
        }
        if(v2 != v1) {
            throw InvalidProtocolBufferException.g();
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Schema
    public final Object newInstance() {
        MessageLite messageLite0 = this.a;
        return messageLite0 instanceof GeneratedMessageLite ? ((GeneratedMessageLite)messageLite0).l() : messageLite0.newBuilderForType().buildPartial();
    }

    @Override  // androidx.datastore.preferences.protobuf.Schema
    public final void writeTo(Object object0, Writer writer0) {
        ((s0)this.d).getClass();
        Iterator iterator0 = ((ExtendableMessage)object0).extensions.m();
        while(iterator0.hasNext()) {
            Object object1 = iterator0.next();
            Map.Entry map$Entry0 = (Map.Entry)object1;
            FieldSet.FieldDescriptorLite fieldSet$FieldDescriptorLite0 = (FieldSet.FieldDescriptorLite)map$Entry0.getKey();
            if(fieldSet$FieldDescriptorLite0.getLiteJavaType() != JavaType.MESSAGE || fieldSet$FieldDescriptorLite0.isRepeated() || fieldSet$FieldDescriptorLite0.isPacked()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if(map$Entry0 instanceof s1) {
                writer0.writeMessageSetItem(fieldSet$FieldDescriptorLite0.getNumber(), ((LazyField)((s1)map$Entry0).a.getValue()).toByteString());
            }
            else {
                writer0.writeMessageSetItem(fieldSet$FieldDescriptorLite0.getNumber(), map$Entry0.getValue());
            }
        }
        ((x3)this.b).getClass();
        UnknownFieldSetLite unknownFieldSetLite0 = ((GeneratedMessageLite)object0).unknownFields;
        unknownFieldSetLite0.getClass();
        if(writer0.fieldOrder() == FieldOrder.DESCENDING) {
            for(int v = unknownFieldSetLite0.a - 1; v >= 0; --v) {
                writer0.writeMessageSetItem(WireFormat.getTagFieldNumber(unknownFieldSetLite0.b[v]), unknownFieldSetLite0.c[v]);
            }
            return;
        }
        for(int v1 = 0; v1 < unknownFieldSetLite0.a; ++v1) {
            writer0.writeMessageSetItem(WireFormat.getTagFieldNumber(unknownFieldSetLite0.b[v1]), unknownFieldSetLite0.c[v1]);
        }
    }
}

