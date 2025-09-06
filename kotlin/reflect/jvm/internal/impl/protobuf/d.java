package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public final class d {
    public final l a;
    public boolean b;
    public boolean c;
    public static final d d;

    static {
        d.d = new d(0);
    }

    public d() {
        this.c = false;
        this.a = new l(16);
    }

    public d(int v) {
        this.c = false;
        this.a = new l(0);
        this.h();
    }

    public final void a(f f0, Object object0) {
        List list0;
        if(!f0.d) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        d.l(f0.c, object0);
        Object object1 = this.e(f0);
        if(object1 == null) {
            list0 = new ArrayList();
            this.a.e(f0, list0);
        }
        else {
            list0 = (List)object1;
        }
        list0.add(object0);
    }

    public final d b() {
        d d0 = new d();
        for(int v = 0; true; ++v) {
            l l0 = this.a;
            if(v >= l0.b.size()) {
                break;
            }
            Map.Entry map$Entry0 = (Map.Entry)l0.b.get(v);
            d0.k(((FieldSet.FieldDescriptorLite)map$Entry0.getKey()), map$Entry0.getValue());
        }
        for(Object object0: l0.c()) {
            d0.k(((FieldSet.FieldDescriptorLite)((Map.Entry)object0).getKey()), ((Map.Entry)object0).getValue());
        }
        d0.c = this.c;
        return d0;
    }

    public static int c(FieldType wireFormat$FieldType0, Object object0) {
        switch(wireFormat$FieldType0) {
            case 1: {
                return CodedOutputStream.computeDoubleSizeNoTag(((double)(((Double)object0))));
            }
            case 2: {
                return CodedOutputStream.computeFloatSizeNoTag(((float)(((Float)object0))));
            }
            case 3: {
                return CodedOutputStream.computeInt64SizeNoTag(((long)(((Long)object0))));
            }
            case 4: {
                return CodedOutputStream.computeUInt64SizeNoTag(((long)(((Long)object0))));
            }
            case 5: {
                return CodedOutputStream.computeInt32SizeNoTag(((int)(((Integer)object0))));
            }
            case 6: {
                return CodedOutputStream.computeFixed64SizeNoTag(((long)(((Long)object0))));
            }
            case 7: {
                return CodedOutputStream.computeFixed32SizeNoTag(((int)(((Integer)object0))));
            }
            case 8: {
                return CodedOutputStream.computeBoolSizeNoTag(((Boolean)object0).booleanValue());
            }
            case 9: {
                return CodedOutputStream.computeStringSizeNoTag(((String)object0));
            }
            case 10: {
                return object0 instanceof ByteString ? CodedOutputStream.computeBytesSizeNoTag(((ByteString)object0)) : CodedOutputStream.computeByteArraySizeNoTag(((byte[])object0));
            }
            case 11: {
                return CodedOutputStream.computeUInt32SizeNoTag(((int)(((Integer)object0))));
            }
            case 12: {
                return CodedOutputStream.computeSFixed32SizeNoTag(((int)(((Integer)object0))));
            }
            case 13: {
                return CodedOutputStream.computeSFixed64SizeNoTag(((long)(((Long)object0))));
            }
            case 14: {
                return CodedOutputStream.computeSInt32SizeNoTag(((int)(((Integer)object0))));
            }
            case 15: {
                return CodedOutputStream.computeSInt64SizeNoTag(((long)(((Long)object0))));
            }
            case 16: {
                return CodedOutputStream.computeGroupSizeNoTag(((MessageLite)object0));
            }
            case 17: {
                return object0 instanceof LazyField ? CodedOutputStream.computeLazyFieldSizeNoTag(((LazyField)object0)) : CodedOutputStream.computeMessageSizeNoTag(((MessageLite)object0));
            }
            case 18: {
                return object0 instanceof EnumLite ? CodedOutputStream.computeEnumSizeNoTag(((EnumLite)object0).getNumber()) : CodedOutputStream.computeEnumSizeNoTag(((int)(((Integer)object0))));
            }
            default: {
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
            }
        }
    }

    @Override
    public final Object clone() {
        return this.b();
    }

    public static int d(FieldSet.FieldDescriptorLite fieldSet$FieldDescriptorLite0, Object object0) {
        int v = 0;
        FieldType wireFormat$FieldType0 = fieldSet$FieldDescriptorLite0.getLiteType();
        int v1 = fieldSet$FieldDescriptorLite0.getNumber();
        if(fieldSet$FieldDescriptorLite0.isRepeated()) {
            if(fieldSet$FieldDescriptorLite0.isPacked()) {
                for(Object object1: ((List)object0)) {
                    v += d.c(wireFormat$FieldType0, object1);
                }
                return CodedOutputStream.computeRawVarint32Size(v) + (CodedOutputStream.computeTagSize(v1) + v);
            }
            for(Object object2: ((List)object0)) {
                v += d.c(wireFormat$FieldType0, object2) + (wireFormat$FieldType0 == FieldType.GROUP ? CodedOutputStream.computeTagSize(v1) * 2 : CodedOutputStream.computeTagSize(v1));
            }
            return v;
        }
        return d.c(wireFormat$FieldType0, object0) + (wireFormat$FieldType0 == FieldType.GROUP ? CodedOutputStream.computeTagSize(v1) * 2 : CodedOutputStream.computeTagSize(v1));
    }

    public final Object e(FieldSet.FieldDescriptorLite fieldSet$FieldDescriptorLite0) {
        MessageLite messageLite0 = this.a.get(fieldSet$FieldDescriptorLite0);
        return messageLite0 instanceof LazyField ? ((LazyField)messageLite0).getValue() : messageLite0;
    }

    public final boolean f() {
        for(int v = 0; true; ++v) {
            l l0 = this.a;
            if(v >= l0.b.size()) {
                break;
            }
            if(!d.g(((Map.Entry)l0.b.get(v)))) {
                return false;
            }
        }
        for(Object object0: l0.c()) {
            if(!d.g(((Map.Entry)object0))) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    public static boolean g(Map.Entry map$Entry0) {
        FieldSet.FieldDescriptorLite fieldSet$FieldDescriptorLite0 = (FieldSet.FieldDescriptorLite)map$Entry0.getKey();
        if(fieldSet$FieldDescriptorLite0.getLiteJavaType() == JavaType.MESSAGE) {
            if(fieldSet$FieldDescriptorLite0.isRepeated()) {
                Iterator iterator0 = ((List)map$Entry0.getValue()).iterator();
                while(true) {
                    if(!iterator0.hasNext()) {
                        return true;
                    }
                    Object object0 = iterator0.next();
                    if(((MessageLite)object0).isInitialized()) {
                        continue;
                    }
                    return false;
                }
            }
            Object object1 = map$Entry0.getValue();
            if(object1 instanceof MessageLite) {
                return ((MessageLite)object1).isInitialized();
            }
            if(!(object1 instanceof LazyField)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            return true;
        }
        return true;
    }

    public final void h() {
        if(this.b) {
            return;
        }
        l l0 = this.a;
        if(!l0.d) {
            for(int v = 0; v < l0.b.size(); ++v) {
                Map.Entry map$Entry0 = (Map.Entry)l0.b.get(v);
                if(((FieldSet.FieldDescriptorLite)map$Entry0.getKey()).isRepeated()) {
                    map$Entry0.setValue(Collections.unmodifiableList(((List)map$Entry0.getValue())));
                }
            }
            for(Object object0: l0.c()) {
                Map.Entry map$Entry1 = (Map.Entry)object0;
                if(((FieldSet.FieldDescriptorLite)map$Entry1.getKey()).isRepeated()) {
                    map$Entry1.setValue(Collections.unmodifiableList(((List)map$Entry1.getValue())));
                }
            }
        }
        if(!l0.d) {
            l0.c = l0.c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(l0.c);
            l0.d = true;
        }
        this.b = true;
    }

    public final void i(Map.Entry map$Entry0) {
        FieldSet.FieldDescriptorLite fieldSet$FieldDescriptorLite0 = (FieldSet.FieldDescriptorLite)map$Entry0.getKey();
        Object object0 = map$Entry0.getValue();
        if(object0 instanceof LazyField) {
            object0 = ((LazyField)object0).getValue();
        }
        boolean z = fieldSet$FieldDescriptorLite0.isRepeated();
        l l0 = this.a;
        if(z) {
            ArrayList arrayList0 = this.e(fieldSet$FieldDescriptorLite0);
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
            }
            for(byte[] arr_b: ((List)object0)) {
                if(arr_b instanceof byte[]) {
                    byte[] arr_b1 = new byte[arr_b.length];
                    System.arraycopy(arr_b, 0, arr_b1, 0, arr_b.length);
                    arr_b = arr_b1;
                }
                arrayList0.add(arr_b);
            }
            l0.e(fieldSet$FieldDescriptorLite0, arrayList0);
            return;
        }
        if(fieldSet$FieldDescriptorLite0.getLiteJavaType() == JavaType.MESSAGE) {
            Object object1 = this.e(fieldSet$FieldDescriptorLite0);
            if(object1 == null) {
                if(object0 instanceof byte[]) {
                    byte[] arr_b2 = new byte[((byte[])object0).length];
                    System.arraycopy(((byte[])object0), 0, arr_b2, 0, ((byte[])object0).length);
                    object0 = arr_b2;
                }
                l0.e(fieldSet$FieldDescriptorLite0, object0);
                return;
            }
            l0.e(fieldSet$FieldDescriptorLite0, fieldSet$FieldDescriptorLite0.internalMergeFrom(((MessageLite)object1).toBuilder(), ((MessageLite)object0)).build());
            return;
        }
        if(object0 instanceof byte[]) {
            byte[] arr_b3 = new byte[((byte[])object0).length];
            System.arraycopy(((byte[])object0), 0, arr_b3, 0, ((byte[])object0).length);
            object0 = arr_b3;
        }
        l0.e(fieldSet$FieldDescriptorLite0, object0);
    }

    public static Object j(CodedInputStream codedInputStream0, FieldType wireFormat$FieldType0) {
        switch(wireFormat$FieldType0) {
            case 1: {
                return codedInputStream0.readDouble();
            }
            case 2: {
                return codedInputStream0.readFloat();
            }
            case 3: {
                return codedInputStream0.readInt64();
            }
            case 4: {
                return codedInputStream0.readUInt64();
            }
            case 5: {
                return codedInputStream0.readInt32();
            }
            case 6: {
                return codedInputStream0.readFixed64();
            }
            case 7: {
                return codedInputStream0.readFixed32();
            }
            case 8: {
                return Boolean.valueOf(codedInputStream0.readBool());
            }
            case 9: {
                return codedInputStream0.readString();
            }
            case 10: {
                return codedInputStream0.readBytes();
            }
            case 11: {
                return codedInputStream0.readUInt32();
            }
            case 12: {
                return codedInputStream0.readSFixed32();
            }
            case 13: {
                return codedInputStream0.readSFixed64();
            }
            case 14: {
                return codedInputStream0.readSInt32();
            }
            case 15: {
                return codedInputStream0.readSInt64();
            }
            case 16: {
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            }
            case 17: {
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            }
            case 18: {
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            }
            default: {
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
            }
        }
    }

    public final void k(FieldSet.FieldDescriptorLite fieldSet$FieldDescriptorLite0, Object object0) {
        if(fieldSet$FieldDescriptorLite0.isRepeated()) {
            if(!(object0 instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList0 = new ArrayList();
            arrayList0.addAll(((List)object0));
            for(Object object1: arrayList0) {
                d.l(fieldSet$FieldDescriptorLite0.getLiteType(), object1);
            }
            object0 = arrayList0;
        }
        else {
            d.l(fieldSet$FieldDescriptorLite0.getLiteType(), object0);
        }
        if(object0 instanceof LazyField) {
            this.c = true;
        }
        this.a.e(fieldSet$FieldDescriptorLite0, object0);
    }

    public static void l(FieldType wireFormat$FieldType0, Object object0) {
        object0.getClass();
        boolean z = true;
        boolean z1 = false;
        switch(wireFormat$FieldType0.getJavaType()) {
            case 1: {
                z1 = object0 instanceof Integer;
                break;
            }
            case 2: {
                z1 = object0 instanceof Long;
                break;
            }
            case 3: {
                z1 = object0 instanceof Float;
                break;
            }
            case 4: {
                z1 = object0 instanceof Double;
                break;
            }
            case 5: {
                z1 = object0 instanceof Boolean;
                break;
            }
            case 6: {
                z1 = object0 instanceof String;
                break;
            }
            case 7: {
                if(!(object0 instanceof ByteString) && !(object0 instanceof byte[])) {
                    z = false;
                }
                z1 = z;
                break;
            }
            case 8: {
                if(!(object0 instanceof Integer) && !(object0 instanceof EnumLite)) {
                    z = false;
                }
                z1 = z;
                break;
            }
            case 9: {
                if(!(object0 instanceof MessageLite) && !(object0 instanceof LazyField)) {
                    z = false;
                }
                z1 = z;
            }
        }
        if(!z1) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    public static void m(CodedOutputStream codedOutputStream0, FieldType wireFormat$FieldType0, int v, Object object0) {
        if(wireFormat$FieldType0 == FieldType.GROUP) {
            codedOutputStream0.writeGroup(v, ((MessageLite)object0));
            return;
        }
        codedOutputStream0.writeTag(v, wireFormat$FieldType0.getWireType());
        d.n(codedOutputStream0, wireFormat$FieldType0, object0);
    }

    public static void n(CodedOutputStream codedOutputStream0, FieldType wireFormat$FieldType0, Object object0) {
        switch(wireFormat$FieldType0) {
            case 1: {
                codedOutputStream0.writeDoubleNoTag(((double)(((Double)object0))));
                return;
            }
            case 2: {
                codedOutputStream0.writeFloatNoTag(((float)(((Float)object0))));
                return;
            }
            case 3: {
                codedOutputStream0.writeInt64NoTag(((long)(((Long)object0))));
                return;
            }
            case 4: {
                codedOutputStream0.writeUInt64NoTag(((long)(((Long)object0))));
                return;
            }
            case 5: {
                codedOutputStream0.writeInt32NoTag(((int)(((Integer)object0))));
                return;
            }
            case 6: {
                codedOutputStream0.writeFixed64NoTag(((long)(((Long)object0))));
                return;
            }
            case 7: {
                codedOutputStream0.writeFixed32NoTag(((int)(((Integer)object0))));
                return;
            }
            case 8: {
                codedOutputStream0.writeBoolNoTag(((Boolean)object0).booleanValue());
                return;
            }
            case 9: {
                codedOutputStream0.writeStringNoTag(((String)object0));
                return;
            }
            case 10: {
                if(object0 instanceof ByteString) {
                    codedOutputStream0.writeBytesNoTag(((ByteString)object0));
                    return;
                }
                codedOutputStream0.writeByteArrayNoTag(((byte[])object0));
                return;
            }
            case 11: {
                codedOutputStream0.writeUInt32NoTag(((int)(((Integer)object0))));
                return;
            }
            case 12: {
                codedOutputStream0.writeSFixed32NoTag(((int)(((Integer)object0))));
                return;
            }
            case 13: {
                codedOutputStream0.writeSFixed64NoTag(((long)(((Long)object0))));
                return;
            }
            case 14: {
                codedOutputStream0.writeSInt32NoTag(((int)(((Integer)object0))));
                return;
            }
            case 15: {
                codedOutputStream0.writeSInt64NoTag(((long)(((Long)object0))));
                return;
            }
            case 16: {
                codedOutputStream0.writeGroupNoTag(((MessageLite)object0));
                return;
            }
            case 17: {
                codedOutputStream0.writeMessageNoTag(((MessageLite)object0));
                return;
            }
            case 18: {
                if(object0 instanceof EnumLite) {
                    codedOutputStream0.writeEnumNoTag(((EnumLite)object0).getNumber());
                    return;
                }
                codedOutputStream0.writeEnumNoTag(((int)(((Integer)object0))));
            }
        }
    }
}

