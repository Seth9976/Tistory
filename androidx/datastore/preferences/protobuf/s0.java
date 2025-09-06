package androidx.datastore.preferences.protobuf;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

public final class s0 extends q0 {
    @Override  // androidx.datastore.preferences.protobuf.q0
    public final int a(Map.Entry map$Entry0) {
        return ((j1)map$Entry0.getKey()).b;
    }

    @Override  // androidx.datastore.preferences.protobuf.q0
    public final GeneratedExtension b(ExtensionRegistryLite extensionRegistryLite0, MessageLite messageLite0, int v) {
        return extensionRegistryLite0.findLiteExtensionByNumber(messageLite0, v);
    }

    @Override  // androidx.datastore.preferences.protobuf.q0
    public final d1 c(Object object0) {
        return ((ExtendableMessage)object0).extensions;
    }

    @Override  // androidx.datastore.preferences.protobuf.q0
    public final d1 d(Object object0) {
        return ((ExtendableMessage)object0).p();
    }

    @Override  // androidx.datastore.preferences.protobuf.q0
    public final void e(Object object0) {
        ((ExtendableMessage)object0).extensions.n();
    }

    @Override  // androidx.datastore.preferences.protobuf.q0
    public final Object f(Object object0, Reader reader0, GeneratedExtension generatedMessageLite$GeneratedExtension0, ExtensionRegistryLite extensionRegistryLite0, d1 d10, Object object1, w3 w30) {
        Object object2;
        ArrayList arrayList0;
        int v = generatedMessageLite$GeneratedExtension0.getNumber();
        j1 j10 = generatedMessageLite$GeneratedExtension0.d;
        if(j10.d && j10.e) {
            switch(generatedMessageLite$GeneratedExtension0.getLiteType()) {
                case 1: {
                    arrayList0 = new ArrayList();
                    reader0.readDoubleList(arrayList0);
                    break;
                }
                case 2: {
                    arrayList0 = new ArrayList();
                    reader0.readFloatList(arrayList0);
                    break;
                }
                case 3: {
                    arrayList0 = new ArrayList();
                    reader0.readInt64List(arrayList0);
                    break;
                }
                case 4: {
                    arrayList0 = new ArrayList();
                    reader0.readUInt64List(arrayList0);
                    break;
                }
                case 5: {
                    arrayList0 = new ArrayList();
                    reader0.readInt32List(arrayList0);
                    break;
                }
                case 6: {
                    arrayList0 = new ArrayList();
                    reader0.readFixed64List(arrayList0);
                    break;
                }
                case 7: {
                    arrayList0 = new ArrayList();
                    reader0.readFixed32List(arrayList0);
                    break;
                }
                case 8: {
                    arrayList0 = new ArrayList();
                    reader0.readBoolList(arrayList0);
                    break;
                }
                case 9: {
                    arrayList0 = new ArrayList();
                    reader0.readUInt32List(arrayList0);
                    break;
                }
                case 10: {
                    arrayList0 = new ArrayList();
                    reader0.readSFixed32List(arrayList0);
                    break;
                }
                case 11: {
                    arrayList0 = new ArrayList();
                    reader0.readSFixed64List(arrayList0);
                    break;
                }
                case 12: {
                    arrayList0 = new ArrayList();
                    reader0.readSInt32List(arrayList0);
                    break;
                }
                case 13: {
                    arrayList0 = new ArrayList();
                    reader0.readSInt64List(arrayList0);
                    break;
                }
                case 14: {
                    arrayList0 = new ArrayList();
                    reader0.readEnumList(arrayList0);
                    object1 = c3.z(object0, v, arrayList0, j10.a, object1, w30);
                    break;
                }
                default: {
                    throw new IllegalStateException("Type cannot be packed: " + j10.c);
                }
            }
            d10.q(j10, arrayList0);
            return object1;
        }
        if(generatedMessageLite$GeneratedExtension0.getLiteType() == FieldType.ENUM) {
            int v1 = reader0.readInt32();
            if(j10.a.findValueByNumber(v1) == null) {
                return c3.E(object0, v, v1, object1, w30);
            }
            object2 = v1;
        }
        else {
            switch(generatedMessageLite$GeneratedExtension0.getLiteType()) {
                case 1: {
                    object2 = reader0.readDouble();
                    break;
                }
                case 2: {
                    object2 = reader0.readFloat();
                    break;
                }
                case 3: {
                    object2 = reader0.readInt64();
                    break;
                }
                case 4: {
                    object2 = reader0.readUInt64();
                    break;
                }
                case 5: {
                    object2 = reader0.readInt32();
                    break;
                }
                case 6: {
                    object2 = reader0.readFixed64();
                    break;
                }
                case 7: {
                    object2 = reader0.readFixed32();
                    break;
                }
                case 8: {
                    object2 = Boolean.valueOf(reader0.readBool());
                    break;
                }
                case 9: {
                    object2 = reader0.readUInt32();
                    break;
                }
                case 10: {
                    object2 = reader0.readSFixed32();
                    break;
                }
                case 11: {
                    object2 = reader0.readSFixed64();
                    break;
                }
                case 12: {
                    object2 = reader0.readSInt32();
                    break;
                }
                case 13: {
                    object2 = reader0.readSInt64();
                    break;
                }
                case 14: {
                    throw new IllegalStateException("Shouldn\'t reach here.");
                }
                case 15: {
                    object2 = reader0.readBytes();
                    break;
                }
                case 16: {
                    object2 = reader0.readString();
                    break;
                }
                case 17: {
                    if(!generatedMessageLite$GeneratedExtension0.isRepeated()) {
                        Object object3 = d10.f(j10);
                        if(object3 instanceof GeneratedMessageLite) {
                            Schema schema0 = v2.c.b(object3);
                            if(!((GeneratedMessageLite)object3).j()) {
                                Object object4 = schema0.newInstance();
                                schema0.mergeFrom(object4, object3);
                                d10.q(j10, object4);
                                object3 = object4;
                            }
                            reader0.mergeGroupField(object3, schema0, extensionRegistryLite0);
                            return object1;
                        }
                    }
                    object2 = reader0.readGroup(generatedMessageLite$GeneratedExtension0.getMessageDefaultInstance().getClass(), extensionRegistryLite0);
                    break;
                }
                case 18: {
                    if(!generatedMessageLite$GeneratedExtension0.isRepeated()) {
                        Object object5 = d10.f(j10);
                        if(object5 instanceof GeneratedMessageLite) {
                            Schema schema1 = v2.c.b(object5);
                            if(!((GeneratedMessageLite)object5).j()) {
                                Object object6 = schema1.newInstance();
                                schema1.mergeFrom(object6, object5);
                                d10.q(j10, object6);
                                object5 = object6;
                            }
                            reader0.mergeMessageField(object5, schema1, extensionRegistryLite0);
                            return object1;
                        }
                    }
                    object2 = reader0.readMessage(generatedMessageLite$GeneratedExtension0.getMessageDefaultInstance().getClass(), extensionRegistryLite0);
                    break;
                }
                default: {
                    object2 = null;
                    break;
                }
            }
        }
        if(generatedMessageLite$GeneratedExtension0.isRepeated()) {
            d10.a(j10, object2);
            return object1;
        }
        switch(generatedMessageLite$GeneratedExtension0.getLiteType()) {
            case 17: 
            case 18: {
                Object object7 = d10.f(j10);
                if(object7 != null) {
                    object2 = ((MessageLite)object7).toBuilder().mergeFrom(((MessageLite)object2)).buildPartial();
                }
            }
        }
        d10.q(j10, object2);
        return object1;
    }

    @Override  // androidx.datastore.preferences.protobuf.q0
    public final void g(Writer writer0, Map.Entry map$Entry0) {
        j1 j10 = (j1)map$Entry0.getKey();
        FieldType wireFormat$FieldType0 = j10.c;
        int v = j10.b;
        if(j10.d) {
            boolean z = j10.e;
            switch(wireFormat$FieldType0) {
                case 1: {
                    c3.H(v, ((List)map$Entry0.getValue()), writer0, z);
                    return;
                }
                case 2: {
                    c3.L(v, ((List)map$Entry0.getValue()), writer0, z);
                    return;
                }
                case 3: {
                    c3.O(v, ((List)map$Entry0.getValue()), writer0, z);
                    return;
                }
                case 4: {
                    c3.W(v, ((List)map$Entry0.getValue()), writer0, z);
                    return;
                }
                case 5: {
                    c3.N(v, ((List)map$Entry0.getValue()), writer0, z);
                    return;
                }
                case 6: {
                    c3.K(v, ((List)map$Entry0.getValue()), writer0, z);
                    return;
                }
                case 7: {
                    c3.J(v, ((List)map$Entry0.getValue()), writer0, z);
                    return;
                }
                case 8: {
                    c3.F(v, ((List)map$Entry0.getValue()), writer0, z);
                    return;
                }
                case 9: {
                    c3.V(v, ((List)map$Entry0.getValue()), writer0, z);
                    return;
                }
                case 10: {
                    c3.Q(v, ((List)map$Entry0.getValue()), writer0, z);
                    return;
                }
                case 11: {
                    c3.R(v, ((List)map$Entry0.getValue()), writer0, z);
                    return;
                }
                case 12: {
                    c3.S(v, ((List)map$Entry0.getValue()), writer0, z);
                    return;
                }
                case 13: {
                    c3.T(v, ((List)map$Entry0.getValue()), writer0, z);
                    return;
                }
                case 14: {
                    c3.N(v, ((List)map$Entry0.getValue()), writer0, z);
                    return;
                }
                case 15: {
                    c3.G(v, ((List)map$Entry0.getValue()), writer0);
                    return;
                }
                case 16: {
                    c3.U(v, ((List)map$Entry0.getValue()), writer0);
                    return;
                }
                case 17: {
                    List list0 = (List)map$Entry0.getValue();
                    if(list0 != null && !list0.isEmpty()) {
                        List list1 = (List)map$Entry0.getValue();
                        Class class0 = list0.get(0).getClass();
                        c3.M(v, list1, writer0, v2.c.a(class0));
                        return;
                    }
                    break;
                }
                case 18: {
                    List list2 = (List)map$Entry0.getValue();
                    if(list2 != null && !list2.isEmpty()) {
                        List list3 = (List)map$Entry0.getValue();
                        Class class1 = list2.get(0).getClass();
                        c3.P(v, list3, writer0, v2.c.a(class1));
                        return;
                    }
                    break;
                }
            }
        }
        else {
            switch(wireFormat$FieldType0) {
                case 1: {
                    writer0.writeDouble(v, ((double)(((Double)map$Entry0.getValue()))));
                    break;
                }
                case 2: {
                    writer0.writeFloat(v, ((float)(((Float)map$Entry0.getValue()))));
                    return;
                }
                case 3: {
                    writer0.writeInt64(v, ((long)(((Long)map$Entry0.getValue()))));
                    return;
                }
                case 4: {
                    writer0.writeUInt64(v, ((long)(((Long)map$Entry0.getValue()))));
                    return;
                }
                case 5: {
                    writer0.writeInt32(v, ((int)(((Integer)map$Entry0.getValue()))));
                    return;
                }
                case 6: {
                    writer0.writeFixed64(v, ((long)(((Long)map$Entry0.getValue()))));
                    return;
                }
                case 7: {
                    writer0.writeFixed32(v, ((int)(((Integer)map$Entry0.getValue()))));
                    return;
                }
                case 8: {
                    writer0.writeBool(v, ((Boolean)map$Entry0.getValue()).booleanValue());
                    return;
                }
                case 9: {
                    writer0.writeUInt32(v, ((int)(((Integer)map$Entry0.getValue()))));
                    return;
                }
                case 10: {
                    writer0.writeSFixed32(v, ((int)(((Integer)map$Entry0.getValue()))));
                    return;
                }
                case 11: {
                    writer0.writeSFixed64(v, ((long)(((Long)map$Entry0.getValue()))));
                    return;
                }
                case 12: {
                    writer0.writeSInt32(v, ((int)(((Integer)map$Entry0.getValue()))));
                    return;
                }
                case 13: {
                    writer0.writeSInt64(v, ((long)(((Long)map$Entry0.getValue()))));
                    return;
                }
                case 14: {
                    writer0.writeInt32(v, ((int)(((Integer)map$Entry0.getValue()))));
                    return;
                }
                case 15: {
                    writer0.writeBytes(v, ((ByteString)map$Entry0.getValue()));
                    return;
                }
                case 16: {
                    writer0.writeString(v, ((String)map$Entry0.getValue()));
                    return;
                }
                case 17: {
                    Object object0 = map$Entry0.getValue();
                    Class class2 = map$Entry0.getValue().getClass();
                    writer0.writeGroup(v, object0, v2.c.a(class2));
                    return;
                }
                case 18: {
                    Object object1 = map$Entry0.getValue();
                    Class class3 = map$Entry0.getValue().getClass();
                    writer0.writeMessage(v, object1, v2.c.a(class3));
                }
            }
        }
    }
}

