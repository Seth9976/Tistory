package androidx.datastore.preferences.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public final class d1 {
    public final d3 a;
    public boolean b;
    public boolean c;
    public static final d1 d;

    static {
        d1.d = new d1(0);
    }

    public d1() {
        this.a = new d3(16);
    }

    public d1(int v) {
        d3 d30 = new d3(0);
        super();
        this.a = d30;
        this.n();
        this.n();
    }

    public final void a(FieldSet.FieldDescriptorLite fieldSet$FieldDescriptorLite0, Object object0) {
        List list0;
        if(!fieldSet$FieldDescriptorLite0.isRepeated()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        d1.r(fieldSet$FieldDescriptorLite0, object0);
        Object object1 = this.f(fieldSet$FieldDescriptorLite0);
        if(object1 == null) {
            list0 = new ArrayList();
            this.a.f(fieldSet$FieldDescriptorLite0, list0);
        }
        else {
            list0 = (List)object1;
        }
        list0.add(object0);
    }

    public final d1 b() {
        d1 d10 = new d1();
        for(int v = 0; true; ++v) {
            d3 d30 = this.a;
            if(v >= d30.b.size()) {
                break;
            }
            Map.Entry map$Entry0 = d30.c(v);
            d10.q(((FieldSet.FieldDescriptorLite)map$Entry0.getKey()), map$Entry0.getValue());
        }
        for(Object object0: d30.d()) {
            d10.q(((FieldSet.FieldDescriptorLite)((Map.Entry)object0).getKey()), ((Map.Entry)object0).getValue());
        }
        d10.c = this.c;
        return d10;
    }

    public static int c(FieldType wireFormat$FieldType0, int v, Object object0) {
        return d1.d(wireFormat$FieldType0, object0) + (wireFormat$FieldType0 == FieldType.GROUP ? CodedOutputStream.computeTagSize(v) * 2 : CodedOutputStream.computeTagSize(v));
    }

    @Override
    public final Object clone() {
        return this.b();
    }

    public static int d(FieldType wireFormat$FieldType0, Object object0) {
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
                return CodedOutputStream.computeGroupSizeNoTag(((MessageLite)object0));
            }
            case 10: {
                return object0 instanceof LazyField ? CodedOutputStream.computeLazyFieldSizeNoTag(((LazyField)object0)) : CodedOutputStream.computeMessageSizeNoTag(((MessageLite)object0));
            }
            case 11: {
                return object0 instanceof ByteString ? CodedOutputStream.computeBytesSizeNoTag(((ByteString)object0)) : CodedOutputStream.computeStringSizeNoTag(((String)object0));
            }
            case 12: {
                return object0 instanceof ByteString ? CodedOutputStream.computeBytesSizeNoTag(((ByteString)object0)) : CodedOutputStream.computeByteArraySizeNoTag(((byte[])object0));
            }
            case 13: {
                return CodedOutputStream.computeUInt32SizeNoTag(((int)(((Integer)object0))));
            }
            case 14: {
                return CodedOutputStream.computeSFixed32SizeNoTag(((int)(((Integer)object0))));
            }
            case 15: {
                return CodedOutputStream.computeSFixed64SizeNoTag(((long)(((Long)object0))));
            }
            case 16: {
                return CodedOutputStream.computeSInt32SizeNoTag(((int)(((Integer)object0))));
            }
            case 17: {
                return CodedOutputStream.computeSInt64SizeNoTag(((long)(((Long)object0))));
            }
            case 18: {
                return object0 instanceof EnumLite ? CodedOutputStream.computeEnumSizeNoTag(((EnumLite)object0).getNumber()) : CodedOutputStream.computeEnumSizeNoTag(((int)(((Integer)object0))));
            }
            default: {
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
            }
        }
    }

    public static int e(FieldSet.FieldDescriptorLite fieldSet$FieldDescriptorLite0, Object object0) {
        int v = 0;
        FieldType wireFormat$FieldType0 = fieldSet$FieldDescriptorLite0.getLiteType();
        int v1 = fieldSet$FieldDescriptorLite0.getNumber();
        if(fieldSet$FieldDescriptorLite0.isRepeated()) {
            if(fieldSet$FieldDescriptorLite0.isPacked()) {
                if(((List)object0).isEmpty()) {
                    return 0;
                }
                for(Object object1: ((List)object0)) {
                    v += d1.d(wireFormat$FieldType0, object1);
                }
                return CodedOutputStream.computeUInt32SizeNoTag(v) + (CodedOutputStream.computeTagSize(v1) + v);
            }
            for(Object object2: ((List)object0)) {
                v += d1.c(wireFormat$FieldType0, v1, object2);
            }
            return v;
        }
        return d1.c(wireFormat$FieldType0, v1, object0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof d1 ? this.a.equals(((d1)object0).a) : false;
    }

    public final Object f(FieldSet.FieldDescriptorLite fieldSet$FieldDescriptorLite0) {
        MessageLite messageLite0 = this.a.get(fieldSet$FieldDescriptorLite0);
        return messageLite0 instanceof LazyField ? ((LazyField)messageLite0).getValue() : messageLite0;
    }

    public final int g() {
        int v1 = 0;
        for(int v = 0; true; ++v) {
            d3 d30 = this.a;
            if(v >= d30.b.size()) {
                break;
            }
            v1 += d1.h(d30.c(v));
        }
        for(Object object0: d30.d()) {
            v1 += d1.h(((Map.Entry)object0));
        }
        return v1;
    }

    public static int h(Map.Entry map$Entry0) {
        FieldSet.FieldDescriptorLite fieldSet$FieldDescriptorLite0 = (FieldSet.FieldDescriptorLite)map$Entry0.getKey();
        Object object0 = map$Entry0.getValue();
        if(fieldSet$FieldDescriptorLite0.getLiteJavaType() == JavaType.MESSAGE && !fieldSet$FieldDescriptorLite0.isRepeated() && !fieldSet$FieldDescriptorLite0.isPacked()) {
            return object0 instanceof LazyField ? CodedOutputStream.computeLazyFieldMessageSetExtensionSize(((FieldSet.FieldDescriptorLite)map$Entry0.getKey()).getNumber(), ((LazyField)object0)) : CodedOutputStream.computeMessageSetExtensionSize(((FieldSet.FieldDescriptorLite)map$Entry0.getKey()).getNumber(), ((MessageLite)object0));
        }
        return d1.e(fieldSet$FieldDescriptorLite0, object0);
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    public final int i() {
        int v1 = 0;
        for(int v = 0; true; ++v) {
            d3 d30 = this.a;
            if(v >= d30.b.size()) {
                break;
            }
            Map.Entry map$Entry0 = d30.c(v);
            v1 += d1.e(((FieldSet.FieldDescriptorLite)map$Entry0.getKey()), map$Entry0.getValue());
        }
        for(Object object0: d30.d()) {
            v1 += d1.e(((FieldSet.FieldDescriptorLite)((Map.Entry)object0).getKey()), ((Map.Entry)object0).getValue());
        }
        return v1;
    }

    public final boolean j() {
        return this.a.isEmpty();
    }

    public final boolean k() {
        for(int v = 0; true; ++v) {
            d3 d30 = this.a;
            if(v >= d30.b.size()) {
                break;
            }
            if(!d1.l(d30.c(v))) {
                return false;
            }
        }
        for(Object object0: d30.d()) {
            if(!d1.l(((Map.Entry)object0))) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    public static boolean l(Map.Entry map$Entry0) {
        boolean z;
        FieldSet.FieldDescriptorLite fieldSet$FieldDescriptorLite0 = (FieldSet.FieldDescriptorLite)map$Entry0.getKey();
        if(fieldSet$FieldDescriptorLite0.getLiteJavaType() == JavaType.MESSAGE) {
            if(fieldSet$FieldDescriptorLite0.isRepeated()) {
                Iterator iterator0 = ((List)map$Entry0.getValue()).iterator();
                while(true) {
                    if(!iterator0.hasNext()) {
                        return true;
                    }
                    Object object0 = iterator0.next();
                    if(object0 instanceof MessageLiteOrBuilder) {
                        z = ((MessageLiteOrBuilder)object0).isInitialized();
                    }
                    else {
                        if(!(object0 instanceof LazyField)) {
                            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                        }
                        z = true;
                    }
                    if(z) {
                        continue;
                    }
                    return false;
                }
            }
            Object object1 = map$Entry0.getValue();
            if(object1 instanceof MessageLiteOrBuilder) {
                return ((MessageLiteOrBuilder)object1).isInitialized();
            }
            if(!(object1 instanceof LazyField)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            return true;
        }
        return true;
    }

    public final Iterator m() {
        d3 d30 = this.a;
        return this.c ? new t1(((k3)d30.entrySet()).iterator()) : ((k3)d30.entrySet()).iterator();
    }

    public final void n() {
        d3 d30;
        if(this.b) {
            return;
        }
        for(int v1 = 0; true; ++v1) {
            d30 = this.a;
            if(v1 >= d30.b.size()) {
                break;
            }
            Map.Entry map$Entry0 = d30.c(v1);
            if(map$Entry0.getValue() instanceof GeneratedMessageLite) {
                ((GeneratedMessageLite)map$Entry0.getValue()).makeImmutable();
            }
        }
        if(!d30.d) {
            for(int v = 0; v < d30.b.size(); ++v) {
                Map.Entry map$Entry1 = d30.c(v);
                if(((FieldSet.FieldDescriptorLite)map$Entry1.getKey()).isRepeated()) {
                    map$Entry1.setValue(Collections.unmodifiableList(((List)map$Entry1.getValue())));
                }
            }
            for(Object object0: d30.d()) {
                Map.Entry map$Entry2 = (Map.Entry)object0;
                if(((FieldSet.FieldDescriptorLite)map$Entry2.getKey()).isRepeated()) {
                    map$Entry2.setValue(Collections.unmodifiableList(((List)map$Entry2.getValue())));
                }
            }
        }
        if(!d30.d) {
            d30.c = d30.c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(d30.c);
            d30.f = d30.f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(d30.f);
            d30.d = true;
        }
        this.b = true;
    }

    public final void o(d1 d10) {
        for(int v = 0; true; ++v) {
            d3 d30 = d10.a;
            if(v >= d10.a.b.size()) {
                break;
            }
            this.p(d30.c(v));
        }
        for(Object object0: d30.d()) {
            this.p(((Map.Entry)object0));
        }
    }

    public final void p(Map.Entry map$Entry0) {
        FieldSet.FieldDescriptorLite fieldSet$FieldDescriptorLite0 = (FieldSet.FieldDescriptorLite)map$Entry0.getKey();
        Object object0 = map$Entry0.getValue();
        if(object0 instanceof LazyField) {
            object0 = ((LazyField)object0).getValue();
        }
        boolean z = fieldSet$FieldDescriptorLite0.isRepeated();
        d3 d30 = this.a;
        if(z) {
            ArrayList arrayList0 = this.f(fieldSet$FieldDescriptorLite0);
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
            d30.f(fieldSet$FieldDescriptorLite0, arrayList0);
            return;
        }
        if(fieldSet$FieldDescriptorLite0.getLiteJavaType() == JavaType.MESSAGE) {
            Object object1 = this.f(fieldSet$FieldDescriptorLite0);
            if(object1 == null) {
                if(object0 instanceof byte[]) {
                    byte[] arr_b2 = new byte[((byte[])object0).length];
                    System.arraycopy(((byte[])object0), 0, arr_b2, 0, ((byte[])object0).length);
                    object0 = arr_b2;
                }
                d30.f(fieldSet$FieldDescriptorLite0, object0);
                return;
            }
            d30.f(fieldSet$FieldDescriptorLite0, fieldSet$FieldDescriptorLite0.internalMergeFrom(((MessageLite)object1).toBuilder(), ((MessageLite)object0)).build());
            return;
        }
        if(object0 instanceof byte[]) {
            byte[] arr_b3 = new byte[((byte[])object0).length];
            System.arraycopy(((byte[])object0), 0, arr_b3, 0, ((byte[])object0).length);
            object0 = arr_b3;
        }
        d30.f(fieldSet$FieldDescriptorLite0, object0);
    }

    public final void q(FieldSet.FieldDescriptorLite fieldSet$FieldDescriptorLite0, Object object0) {
        if(fieldSet$FieldDescriptorLite0.isRepeated()) {
            if(!(object0 instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList0 = new ArrayList();
            arrayList0.addAll(((List)object0));
            for(Object object1: arrayList0) {
                d1.r(fieldSet$FieldDescriptorLite0, object1);
            }
            object0 = arrayList0;
        }
        else {
            d1.r(fieldSet$FieldDescriptorLite0, object0);
        }
        if(object0 instanceof LazyField) {
            this.c = true;
        }
        this.a.f(fieldSet$FieldDescriptorLite0, object0);
    }

    public static void r(FieldSet.FieldDescriptorLite fieldSet$FieldDescriptorLite0, Object object0) {
        FieldType wireFormat$FieldType0 = fieldSet$FieldDescriptorLite0.getLiteType();
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
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", fieldSet$FieldDescriptorLite0.getNumber(), fieldSet$FieldDescriptorLite0.getLiteType().getJavaType(), object0.getClass().getName()));
        }
    }

    public static void s(CodedOutputStream codedOutputStream0, FieldType wireFormat$FieldType0, int v, Object object0) {
        if(wireFormat$FieldType0 == FieldType.GROUP) {
            codedOutputStream0.writeGroup(v, ((MessageLite)object0));
            return;
        }
        codedOutputStream0.writeTag(v, wireFormat$FieldType0.getWireType());
        d1.t(codedOutputStream0, wireFormat$FieldType0, object0);
    }

    public static void t(CodedOutputStream codedOutputStream0, FieldType wireFormat$FieldType0, Object object0) {
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
                codedOutputStream0.writeGroupNoTag(((MessageLite)object0));
                return;
            }
            case 10: {
                codedOutputStream0.writeMessageNoTag(((MessageLite)object0));
                return;
            }
            case 11: {
                if(object0 instanceof ByteString) {
                    codedOutputStream0.writeBytesNoTag(((ByteString)object0));
                    return;
                }
                codedOutputStream0.writeStringNoTag(((String)object0));
                return;
            }
            case 12: {
                if(object0 instanceof ByteString) {
                    codedOutputStream0.writeBytesNoTag(((ByteString)object0));
                    return;
                }
                codedOutputStream0.writeByteArrayNoTag(((byte[])object0));
                return;
            }
            case 13: {
                codedOutputStream0.writeUInt32NoTag(((int)(((Integer)object0))));
                return;
            }
            case 14: {
                codedOutputStream0.writeSFixed32NoTag(((int)(((Integer)object0))));
                return;
            }
            case 15: {
                codedOutputStream0.writeSFixed64NoTag(((long)(((Long)object0))));
                return;
            }
            case 16: {
                codedOutputStream0.writeSInt32NoTag(((int)(((Integer)object0))));
                return;
            }
            case 17: {
                codedOutputStream0.writeSInt64NoTag(((long)(((Long)object0))));
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

