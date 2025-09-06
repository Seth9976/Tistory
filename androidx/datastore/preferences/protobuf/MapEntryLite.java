package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.Map.Entry;

public class MapEntryLite {
    public final d2 a;
    public final Object b;
    public final Object c;

    public MapEntryLite(FieldType wireFormat$FieldType0, Object object0, FieldType wireFormat$FieldType1, Object object1) {
        this.a = new d2(wireFormat$FieldType0, object0, wireFormat$FieldType1, object1);
        this.b = object0;
        this.c = object1;
    }

    public static int a(d2 d20, Object object0, Object object1) {
        int v = d1.c(d20.a, 1, object0);
        return d1.c(d20.c, 2, object1) + v;
    }

    public static Object b(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0, FieldType wireFormat$FieldType0, Object object0) {
        switch(c2.a[wireFormat$FieldType0.ordinal()]) {
            case 1: {
                Builder messageLite$Builder0 = ((MessageLite)object0).toBuilder();
                codedInputStream0.readMessage(messageLite$Builder0, extensionRegistryLite0);
                return messageLite$Builder0.buildPartial();
            }
            case 2: {
                return codedInputStream0.readEnum();
            }
            case 3: {
                throw new RuntimeException("Groups are not allowed in maps.");
            }
            default: {
                return WireFormat.a(codedInputStream0, wireFormat$FieldType0, 2);
            }
        }
    }

    public static void c(CodedOutputStream codedOutputStream0, d2 d20, Object object0, Object object1) {
        d1.s(codedOutputStream0, d20.a, 1, object0);
        d1.s(codedOutputStream0, d20.c, 2, object1);
    }

    public int computeMessageSize(int v, Object object0, Object object1) {
        int v1 = MapEntryLite.a(this.a, object0, object1);
        return CodedOutputStream.computeUInt32SizeNoTag(v1) + v1 + CodedOutputStream.computeTagSize(v);
    }

    public Object getKey() {
        return this.b;
    }

    public Object getValue() {
        return this.c;
    }

    public static MapEntryLite newDefaultInstance(FieldType wireFormat$FieldType0, Object object0, FieldType wireFormat$FieldType1, Object object1) {
        return new MapEntryLite(wireFormat$FieldType0, object0, wireFormat$FieldType1, object1);
    }

    public Map.Entry parseEntry(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        CodedInputStream codedInputStream0 = byteString0.newCodedInput();
        d2 d20 = this.a;
        Object object0 = d20.b;
        Object object1 = d20.d;
        int v;
        while((v = codedInputStream0.readTag()) != 0) {
            FieldType wireFormat$FieldType0 = d20.a;
            if(v == (wireFormat$FieldType0.getWireType() | 8)) {
                object0 = MapEntryLite.b(codedInputStream0, extensionRegistryLite0, wireFormat$FieldType0, object0);
            }
            else {
                FieldType wireFormat$FieldType1 = d20.c;
                if(v == (wireFormat$FieldType1.getWireType() | 16)) {
                    object1 = MapEntryLite.b(codedInputStream0, extensionRegistryLite0, wireFormat$FieldType1, object1);
                }
                else if(!codedInputStream0.skipField(v)) {
                    break;
                }
            }
        }
        return new AbstractMap.SimpleImmutableEntry(object0, object1);
    }

    public void parseInto(MapFieldLite mapFieldLite0, CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        int v = codedInputStream0.pushLimit(codedInputStream0.readRawVarint32());
        d2 d20 = this.a;
        Object object0 = d20.b;
        Object object1 = d20.d;
        int v1;
        while((v1 = codedInputStream0.readTag()) != 0) {
            if(v1 == (d20.a.getWireType() | 8)) {
                object0 = MapEntryLite.b(codedInputStream0, extensionRegistryLite0, d20.a, object0);
            }
            else if(v1 == (d20.c.getWireType() | 16)) {
                object1 = MapEntryLite.b(codedInputStream0, extensionRegistryLite0, d20.c, object1);
            }
            else if(!codedInputStream0.skipField(v1)) {
                break;
            }
        }
        codedInputStream0.checkLastTagWas(0);
        codedInputStream0.popLimit(v);
        mapFieldLite0.put(object0, object1);
    }

    public void serializeTo(CodedOutputStream codedOutputStream0, int v, Object object0, Object object1) throws IOException {
        codedOutputStream0.writeTag(v, 2);
        codedOutputStream0.writeUInt32NoTag(MapEntryLite.a(this.a, object0, object1));
        MapEntryLite.c(codedOutputStream0, this.a, object0, object1);
    }
}

