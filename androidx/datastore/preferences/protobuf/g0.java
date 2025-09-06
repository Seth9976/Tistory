package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

public final class g0 implements Writer {
    public final CodedOutputStream a;

    public g0(CodedOutputStream codedOutputStream0) {
        Internal.a(codedOutputStream0, "output");
        this.a = codedOutputStream0;
        codedOutputStream0.a = this;
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public final FieldOrder fieldOrder() {
        return FieldOrder.ASCENDING;
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public final void writeBool(int v, boolean z) {
        this.a.writeBool(v, z);
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public final void writeBoolList(int v, List list0, boolean z) {
        int v1 = 0;
        CodedOutputStream codedOutputStream0 = this.a;
        if(z) {
            codedOutputStream0.writeTag(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += CodedOutputStream.computeBoolSizeNoTag(((Boolean)list0.get(v2)).booleanValue());
            }
            codedOutputStream0.writeUInt32NoTag(v3);
            while(v1 < list0.size()) {
                codedOutputStream0.writeBoolNoTag(((Boolean)list0.get(v1)).booleanValue());
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            codedOutputStream0.writeBool(v, ((Boolean)list0.get(v1)).booleanValue());
            ++v1;
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public final void writeBytes(int v, ByteString byteString0) {
        this.a.writeBytes(v, byteString0);
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public final void writeBytesList(int v, List list0) {
        for(int v1 = 0; v1 < list0.size(); ++v1) {
            ByteString byteString0 = (ByteString)list0.get(v1);
            this.a.writeBytes(v, byteString0);
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public final void writeDouble(int v, double f) {
        this.a.writeDouble(v, f);
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public final void writeDoubleList(int v, List list0, boolean z) {
        int v1 = 0;
        CodedOutputStream codedOutputStream0 = this.a;
        if(z) {
            codedOutputStream0.writeTag(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += CodedOutputStream.computeDoubleSizeNoTag(((double)(((Double)list0.get(v2)))));
            }
            codedOutputStream0.writeUInt32NoTag(v3);
            while(v1 < list0.size()) {
                codedOutputStream0.writeDoubleNoTag(((double)(((Double)list0.get(v1)))));
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            codedOutputStream0.writeDouble(v, ((double)(((Double)list0.get(v1)))));
            ++v1;
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public final void writeEndGroup(int v) {
        this.a.writeTag(v, 4);
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public final void writeEnum(int v, int v1) {
        this.a.writeEnum(v, v1);
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public final void writeEnumList(int v, List list0, boolean z) {
        int v1 = 0;
        CodedOutputStream codedOutputStream0 = this.a;
        if(z) {
            codedOutputStream0.writeTag(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += CodedOutputStream.computeEnumSizeNoTag(((int)(((Integer)list0.get(v2)))));
            }
            codedOutputStream0.writeUInt32NoTag(v3);
            while(v1 < list0.size()) {
                codedOutputStream0.writeEnumNoTag(((int)(((Integer)list0.get(v1)))));
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            codedOutputStream0.writeEnum(v, ((int)(((Integer)list0.get(v1)))));
            ++v1;
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public final void writeFixed32(int v, int v1) {
        this.a.writeFixed32(v, v1);
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public final void writeFixed32List(int v, List list0, boolean z) {
        int v1 = 0;
        CodedOutputStream codedOutputStream0 = this.a;
        if(z) {
            codedOutputStream0.writeTag(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += CodedOutputStream.computeFixed32SizeNoTag(((int)(((Integer)list0.get(v2)))));
            }
            codedOutputStream0.writeUInt32NoTag(v3);
            while(v1 < list0.size()) {
                codedOutputStream0.writeFixed32NoTag(((int)(((Integer)list0.get(v1)))));
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            codedOutputStream0.writeFixed32(v, ((int)(((Integer)list0.get(v1)))));
            ++v1;
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public final void writeFixed64(int v, long v1) {
        this.a.writeFixed64(v, v1);
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public final void writeFixed64List(int v, List list0, boolean z) {
        int v1 = 0;
        CodedOutputStream codedOutputStream0 = this.a;
        if(z) {
            codedOutputStream0.writeTag(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += CodedOutputStream.computeFixed64SizeNoTag(((long)(((Long)list0.get(v2)))));
            }
            codedOutputStream0.writeUInt32NoTag(v3);
            while(v1 < list0.size()) {
                codedOutputStream0.writeFixed64NoTag(((long)(((Long)list0.get(v1)))));
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            codedOutputStream0.writeFixed64(v, ((long)(((Long)list0.get(v1)))));
            ++v1;
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public final void writeFloat(int v, float f) {
        this.a.writeFloat(v, f);
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public final void writeFloatList(int v, List list0, boolean z) {
        int v1 = 0;
        CodedOutputStream codedOutputStream0 = this.a;
        if(z) {
            codedOutputStream0.writeTag(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += CodedOutputStream.computeFloatSizeNoTag(((float)(((Float)list0.get(v2)))));
            }
            codedOutputStream0.writeUInt32NoTag(v3);
            while(v1 < list0.size()) {
                codedOutputStream0.writeFloatNoTag(((float)(((Float)list0.get(v1)))));
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            codedOutputStream0.writeFloat(v, ((float)(((Float)list0.get(v1)))));
            ++v1;
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public final void writeGroup(int v, Object object0) {
        this.a.writeGroup(v, ((MessageLite)object0));
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public final void writeGroup(int v, Object object0, Schema schema0) {
        this.a.writeTag(v, 3);
        schema0.writeTo(((MessageLite)object0), this.a.a);
        this.a.writeTag(v, 4);
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public final void writeGroupList(int v, List list0) {
        for(int v1 = 0; v1 < list0.size(); ++v1) {
            this.writeGroup(v, list0.get(v1));
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public final void writeGroupList(int v, List list0, Schema schema0) {
        for(int v1 = 0; v1 < list0.size(); ++v1) {
            this.writeGroup(v, list0.get(v1), schema0);
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public final void writeInt32(int v, int v1) {
        this.a.writeInt32(v, v1);
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public final void writeInt32List(int v, List list0, boolean z) {
        int v1 = 0;
        CodedOutputStream codedOutputStream0 = this.a;
        if(z) {
            codedOutputStream0.writeTag(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += CodedOutputStream.computeInt32SizeNoTag(((int)(((Integer)list0.get(v2)))));
            }
            codedOutputStream0.writeUInt32NoTag(v3);
            while(v1 < list0.size()) {
                codedOutputStream0.writeInt32NoTag(((int)(((Integer)list0.get(v1)))));
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            codedOutputStream0.writeInt32(v, ((int)(((Integer)list0.get(v1)))));
            ++v1;
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public final void writeInt64(int v, long v1) {
        this.a.writeInt64(v, v1);
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public final void writeInt64List(int v, List list0, boolean z) {
        int v1 = 0;
        CodedOutputStream codedOutputStream0 = this.a;
        if(z) {
            codedOutputStream0.writeTag(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += CodedOutputStream.computeInt64SizeNoTag(((long)(((Long)list0.get(v2)))));
            }
            codedOutputStream0.writeUInt32NoTag(v3);
            while(v1 < list0.size()) {
                codedOutputStream0.writeInt64NoTag(((long)(((Long)list0.get(v1)))));
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            codedOutputStream0.writeInt64(v, ((long)(((Long)list0.get(v1)))));
            ++v1;
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public final void writeMap(int v, d2 d20, Map map0) {
        CodedOutputStream codedOutputStream0 = this.a;
        if(codedOutputStream0.b) {
            int v1 = 0;
        alab1:
            switch(d20.a) {
                case 1: {
                    Object object4 = map0.get(Boolean.FALSE);
                    if(object4 != null) {
                        codedOutputStream0.writeTag(v, 2);
                        codedOutputStream0.writeUInt32NoTag(MapEntryLite.a(d20, Boolean.FALSE, object4));
                        MapEntryLite.c(codedOutputStream0, d20, Boolean.FALSE, object4);
                    }
                    Object object5 = map0.get(Boolean.TRUE);
                    if(object5 != null) {
                        codedOutputStream0.writeTag(v, 2);
                        codedOutputStream0.writeUInt32NoTag(MapEntryLite.a(d20, Boolean.TRUE, object5));
                        MapEntryLite.c(codedOutputStream0, d20, Boolean.TRUE, object5);
                        return;
                    }
                    break;
                }
                case 2: 
                case 3: 
                case 4: 
                case 5: 
                case 6: {
                    int v2 = map0.size();
                    int[] arr_v = new int[v2];
                    int v3 = 0;
                    for(Object object0: map0.keySet()) {
                        arr_v[v3] = (int)(((Integer)object0));
                        ++v3;
                    }
                    Arrays.sort(arr_v);
                    while(v1 < v2) {
                        int v4 = arr_v[v1];
                        Object object1 = map0.get(v4);
                        codedOutputStream0.writeTag(v, 2);
                        codedOutputStream0.writeUInt32NoTag(MapEntryLite.a(d20, v4, object1));
                        MapEntryLite.c(codedOutputStream0, d20, v4, object1);
                        ++v1;
                    }
                    return;
                }
                case 7: 
                case 8: 
                case 9: 
                case 10: 
                case 11: {
                    int v5 = map0.size();
                    long[] arr_v1 = new long[v5];
                    int v6 = 0;
                    for(Object object2: map0.keySet()) {
                        arr_v1[v6] = (long)(((Long)object2));
                        ++v6;
                    }
                    Arrays.sort(arr_v1);
                    while(v1 < v5) {
                        long v7 = arr_v1[v1];
                        Object object3 = map0.get(v7);
                        codedOutputStream0.writeTag(v, 2);
                        codedOutputStream0.writeUInt32NoTag(MapEntryLite.a(d20, v7, object3));
                        MapEntryLite.c(codedOutputStream0, d20, v7, object3);
                        ++v1;
                    }
                    return;
                }
                case 12: {
                    int v8 = map0.size();
                    String[] arr_s = new String[v8];
                    int v9 = 0;
                    for(Object object6: map0.keySet()) {
                        arr_s[v9] = (String)object6;
                        ++v9;
                    }
                    Arrays.sort(arr_s);
                    while(true) {
                        if(v1 >= v8) {
                            break alab1;
                        }
                        String s = arr_s[v1];
                        Object object7 = map0.get(s);
                        codedOutputStream0.writeTag(v, 2);
                        codedOutputStream0.writeUInt32NoTag(MapEntryLite.a(d20, s, object7));
                        MapEntryLite.c(codedOutputStream0, d20, s, object7);
                        ++v1;
                    }
                }
                default: {
                    throw new IllegalArgumentException("does not support key type: " + d20.a);
                }
            }
            return;
        }
        for(Object object8: map0.entrySet()) {
            codedOutputStream0.writeTag(v, 2);
            codedOutputStream0.writeUInt32NoTag(MapEntryLite.a(d20, ((Map.Entry)object8).getKey(), ((Map.Entry)object8).getValue()));
            MapEntryLite.c(codedOutputStream0, d20, ((Map.Entry)object8).getKey(), ((Map.Entry)object8).getValue());
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public final void writeMessage(int v, Object object0) {
        this.a.writeMessage(v, ((MessageLite)object0));
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public final void writeMessage(int v, Object object0, Schema schema0) {
        this.a.d(v, ((MessageLite)object0), schema0);
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public final void writeMessageList(int v, List list0) {
        for(int v1 = 0; v1 < list0.size(); ++v1) {
            this.writeMessage(v, list0.get(v1));
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public final void writeMessageList(int v, List list0, Schema schema0) {
        for(int v1 = 0; v1 < list0.size(); ++v1) {
            this.writeMessage(v, list0.get(v1), schema0);
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public final void writeMessageSetItem(int v, Object object0) {
        CodedOutputStream codedOutputStream0 = this.a;
        if(object0 instanceof ByteString) {
            codedOutputStream0.writeRawMessageSetExtension(v, ((ByteString)object0));
            return;
        }
        codedOutputStream0.writeMessageSetExtension(v, ((MessageLite)object0));
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public final void writeSFixed32(int v, int v1) {
        this.a.writeSFixed32(v, v1);
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public final void writeSFixed32List(int v, List list0, boolean z) {
        int v1 = 0;
        CodedOutputStream codedOutputStream0 = this.a;
        if(z) {
            codedOutputStream0.writeTag(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += CodedOutputStream.computeSFixed32SizeNoTag(((int)(((Integer)list0.get(v2)))));
            }
            codedOutputStream0.writeUInt32NoTag(v3);
            while(v1 < list0.size()) {
                codedOutputStream0.writeSFixed32NoTag(((int)(((Integer)list0.get(v1)))));
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            codedOutputStream0.writeSFixed32(v, ((int)(((Integer)list0.get(v1)))));
            ++v1;
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public final void writeSFixed64(int v, long v1) {
        this.a.writeSFixed64(v, v1);
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public final void writeSFixed64List(int v, List list0, boolean z) {
        int v1 = 0;
        CodedOutputStream codedOutputStream0 = this.a;
        if(z) {
            codedOutputStream0.writeTag(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += CodedOutputStream.computeSFixed64SizeNoTag(((long)(((Long)list0.get(v2)))));
            }
            codedOutputStream0.writeUInt32NoTag(v3);
            while(v1 < list0.size()) {
                codedOutputStream0.writeSFixed64NoTag(((long)(((Long)list0.get(v1)))));
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            codedOutputStream0.writeSFixed64(v, ((long)(((Long)list0.get(v1)))));
            ++v1;
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public final void writeSInt32(int v, int v1) {
        this.a.writeSInt32(v, v1);
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public final void writeSInt32List(int v, List list0, boolean z) {
        int v1 = 0;
        CodedOutputStream codedOutputStream0 = this.a;
        if(z) {
            codedOutputStream0.writeTag(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += CodedOutputStream.computeSInt32SizeNoTag(((int)(((Integer)list0.get(v2)))));
            }
            codedOutputStream0.writeUInt32NoTag(v3);
            while(v1 < list0.size()) {
                codedOutputStream0.writeSInt32NoTag(((int)(((Integer)list0.get(v1)))));
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            codedOutputStream0.writeSInt32(v, ((int)(((Integer)list0.get(v1)))));
            ++v1;
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public final void writeSInt64(int v, long v1) {
        this.a.writeSInt64(v, v1);
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public final void writeSInt64List(int v, List list0, boolean z) {
        int v1 = 0;
        CodedOutputStream codedOutputStream0 = this.a;
        if(z) {
            codedOutputStream0.writeTag(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += CodedOutputStream.computeSInt64SizeNoTag(((long)(((Long)list0.get(v2)))));
            }
            codedOutputStream0.writeUInt32NoTag(v3);
            while(v1 < list0.size()) {
                codedOutputStream0.writeSInt64NoTag(((long)(((Long)list0.get(v1)))));
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            codedOutputStream0.writeSInt64(v, ((long)(((Long)list0.get(v1)))));
            ++v1;
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public final void writeStartGroup(int v) {
        this.a.writeTag(v, 3);
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public final void writeString(int v, String s) {
        this.a.writeString(v, s);
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public final void writeStringList(int v, List list0) {
        CodedOutputStream codedOutputStream0 = this.a;
        int v1 = 0;
        if(list0 instanceof LazyStringList) {
            while(v1 < list0.size()) {
                Object object0 = ((LazyStringList)list0).getRaw(v1);
                if(object0 instanceof String) {
                    codedOutputStream0.writeString(v, ((String)object0));
                }
                else {
                    codedOutputStream0.writeBytes(v, ((ByteString)object0));
                }
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            codedOutputStream0.writeString(v, ((String)list0.get(v1)));
            ++v1;
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public final void writeUInt32(int v, int v1) {
        this.a.writeUInt32(v, v1);
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public final void writeUInt32List(int v, List list0, boolean z) {
        int v1 = 0;
        CodedOutputStream codedOutputStream0 = this.a;
        if(z) {
            codedOutputStream0.writeTag(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += CodedOutputStream.computeUInt32SizeNoTag(((int)(((Integer)list0.get(v2)))));
            }
            codedOutputStream0.writeUInt32NoTag(v3);
            while(v1 < list0.size()) {
                codedOutputStream0.writeUInt32NoTag(((int)(((Integer)list0.get(v1)))));
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            codedOutputStream0.writeUInt32(v, ((int)(((Integer)list0.get(v1)))));
            ++v1;
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public final void writeUInt64(int v, long v1) {
        this.a.writeUInt64(v, v1);
    }

    @Override  // androidx.datastore.preferences.protobuf.Writer
    public final void writeUInt64List(int v, List list0, boolean z) {
        int v1 = 0;
        CodedOutputStream codedOutputStream0 = this.a;
        if(z) {
            codedOutputStream0.writeTag(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += CodedOutputStream.computeUInt64SizeNoTag(((long)(((Long)list0.get(v2)))));
            }
            codedOutputStream0.writeUInt32NoTag(v3);
            while(v1 < list0.size()) {
                codedOutputStream0.writeUInt64NoTag(((long)(((Long)list0.get(v1)))));
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            codedOutputStream0.writeUInt64(v, ((long)(((Long)list0.get(v1)))));
            ++v1;
        }
    }
}

