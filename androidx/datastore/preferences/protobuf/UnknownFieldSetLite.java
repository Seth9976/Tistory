package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.Arrays;

public final class UnknownFieldSetLite {
    public int a;
    public int[] b;
    public Object[] c;
    public int d;
    public boolean e;
    public static final UnknownFieldSetLite f;

    static {
        UnknownFieldSetLite.f = new UnknownFieldSetLite(0, new int[0], new Object[0], false);
    }

    public UnknownFieldSetLite() {
        this(0, new int[8], new Object[8], true);
    }

    public UnknownFieldSetLite(int v, int[] arr_v, Object[] arr_object, boolean z) {
        this.d = -1;
        this.a = v;
        this.b = arr_v;
        this.c = arr_object;
        this.e = z;
    }

    public final void a() {
        if(!this.e) {
            throw new UnsupportedOperationException();
        }
    }

    public final void b(int v) {
        int[] arr_v = this.b;
        if(v > arr_v.length) {
            int v1 = this.a / 2 + this.a;
            if(v1 >= v) {
                v = v1;
            }
            if(v < 8) {
                v = 8;
            }
            this.b = Arrays.copyOf(arr_v, v);
            this.c = Arrays.copyOf(this.c, v);
        }
    }

    public final boolean c(int v, CodedInputStream codedInputStream0) {
        this.a();
        switch(v & 7) {
            case 0: {
                this.e(v, codedInputStream0.readInt64());
                return true;
            }
            case 1: {
                this.e(v, codedInputStream0.readFixed64());
                return true;
            }
            default: {
                if((v & 7) != 2) {
                    switch(v & 7) {
                        case 3: {
                            UnknownFieldSetLite unknownFieldSetLite0 = new UnknownFieldSetLite();
                            do {
                                int v1 = codedInputStream0.readTag();
                            }
                            while(v1 != 0 && unknownFieldSetLite0.c(v1, codedInputStream0));
                            codedInputStream0.checkLastTagWas(v >>> 3 << 3 | 4);
                            this.e(v, unknownFieldSetLite0);
                            return true;
                        }
                        case 4: {
                            return false;
                        }
                        default: {
                            if((v & 7) != 5) {
                                throw InvalidProtocolBufferException.d();
                            }
                            this.e(v, codedInputStream0.readFixed32());
                            return true;
                        }
                    }
                }
                this.e(v, codedInputStream0.readBytes());
                return true;
            }
        }
    }

    public static UnknownFieldSetLite d(UnknownFieldSetLite unknownFieldSetLite0, UnknownFieldSetLite unknownFieldSetLite1) {
        int v = unknownFieldSetLite0.a + unknownFieldSetLite1.a;
        int[] arr_v = Arrays.copyOf(unknownFieldSetLite0.b, v);
        System.arraycopy(unknownFieldSetLite1.b, 0, arr_v, unknownFieldSetLite0.a, unknownFieldSetLite1.a);
        Object[] arr_object = Arrays.copyOf(unknownFieldSetLite0.c, v);
        System.arraycopy(unknownFieldSetLite1.c, 0, arr_object, unknownFieldSetLite0.a, unknownFieldSetLite1.a);
        return new UnknownFieldSetLite(v, arr_v, arr_object, true);
    }

    public final void e(int v, Object object0) {
        this.a();
        this.b(this.a + 1);
        int v1 = this.a;
        this.b[v1] = v;
        this.c[v1] = object0;
        this.a = v1 + 1;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof UnknownFieldSetLite)) {
            return false;
        }
        int v = this.a;
        if(v == ((UnknownFieldSetLite)object0).a) {
            int[] arr_v = this.b;
            int[] arr_v1 = ((UnknownFieldSetLite)object0).b;
            for(int v1 = 0; v1 < v; ++v1) {
                if(arr_v[v1] != arr_v1[v1]) {
                    return false;
                }
            }
            Object[] arr_object = this.c;
            Object[] arr_object1 = ((UnknownFieldSetLite)object0).c;
            int v2 = this.a;
            for(int v3 = 0; v3 < v2; ++v3) {
                if(!arr_object[v3].equals(arr_object1[v3])) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static void f(int v, Object object0, Writer writer0) {
        switch(v & 7) {
            case 0: {
                writer0.writeInt64(v >>> 3, ((long)(((Long)object0))));
                return;
            }
            case 1: {
                writer0.writeFixed64(v >>> 3, ((long)(((Long)object0))));
                return;
            }
            case 2: {
                writer0.writeBytes(v >>> 3, ((ByteString)object0));
                return;
            }
            case 3: {
                if(writer0.fieldOrder() == FieldOrder.ASCENDING) {
                    writer0.writeStartGroup(v >>> 3);
                    ((UnknownFieldSetLite)object0).writeTo(writer0);
                    writer0.writeEndGroup(v >>> 3);
                    return;
                }
                writer0.writeEndGroup(v >>> 3);
                ((UnknownFieldSetLite)object0).writeTo(writer0);
                writer0.writeStartGroup(v >>> 3);
                return;
            }
            case 5: {
                writer0.writeFixed32(v >>> 3, ((int)(((Integer)object0))));
                return;
            }
            default: {
                throw new RuntimeException(InvalidProtocolBufferException.d());
            }
        }
    }

    public static UnknownFieldSetLite getDefaultInstance() {
        return UnknownFieldSetLite.f;
    }

    public int getSerializedSize() {
        int v = this.d;
        if(v != -1) {
            return v;
        }
        int v2 = 0;
        for(int v1 = 0; v1 < this.a; ++v1) {
            int v3 = this.b[v1];
            int v4 = v3 >>> 3;
            switch(v3 & 7) {
                case 0: {
                    v2 = CodedOutputStream.computeUInt64Size(v4, ((long)(((Long)this.c[v1])))) + v2;
                    break;
                }
                case 1: {
                    v2 = CodedOutputStream.computeFixed64Size(v4, ((long)(((Long)this.c[v1])))) + v2;
                    break;
                }
                case 2: {
                    v2 = CodedOutputStream.computeBytesSize(v4, ((ByteString)this.c[v1])) + v2;
                    break;
                }
                case 3: {
                    v2 = ((UnknownFieldSetLite)this.c[v1]).getSerializedSize() + CodedOutputStream.computeTagSize(v4) * 2 + v2;
                    break;
                }
                case 5: {
                    v2 = CodedOutputStream.computeFixed32Size(v4, ((int)(((Integer)this.c[v1])))) + v2;
                    break;
                }
                default: {
                    throw new IllegalStateException(InvalidProtocolBufferException.d());
                }
            }
        }
        this.d = v2;
        return v2;
    }

    public int getSerializedSizeAsMessageSet() {
        int v = this.d;
        if(v != -1) {
            return v;
        }
        int v2 = 0;
        for(int v1 = 0; v1 < this.a; ++v1) {
            v2 += CodedOutputStream.computeRawMessageSetExtensionSize(WireFormat.getTagFieldNumber(this.b[v1]), ((ByteString)this.c[v1]));
        }
        this.d = v2;
        return v2;
    }

    @Override
    public int hashCode() {
        int v = this.a;
        int[] arr_v = this.b;
        int v2 = 17;
        int v4 = 17;
        for(int v3 = 0; v3 < v; ++v3) {
            v4 = v4 * 0x1F + arr_v[v3];
        }
        Object[] arr_object = this.c;
        int v5 = this.a;
        for(int v1 = 0; v1 < v5; ++v1) {
            v2 = v2 * 0x1F + arr_object[v1].hashCode();
        }
        return ((v + 0x20F) * 0x1F + v4) * 0x1F + v2;
    }

    public void makeImmutable() {
        this.e = false;
    }

    public void writeAsMessageSetTo(CodedOutputStream codedOutputStream0) throws IOException {
        for(int v = 0; v < this.a; ++v) {
            codedOutputStream0.writeRawMessageSetExtension(WireFormat.getTagFieldNumber(this.b[v]), ((ByteString)this.c[v]));
        }
    }

    public void writeTo(CodedOutputStream codedOutputStream0) throws IOException {
        for(int v = 0; v < this.a; ++v) {
            int v1 = this.b[v];
            int v2 = v1 >>> 3;
            switch(v1 & 7) {
                case 0: {
                    codedOutputStream0.writeUInt64(v2, ((long)(((Long)this.c[v]))));
                    break;
                }
                case 1: {
                    codedOutputStream0.writeFixed64(v2, ((long)(((Long)this.c[v]))));
                    break;
                }
                case 2: {
                    codedOutputStream0.writeBytes(v2, ((ByteString)this.c[v]));
                    break;
                }
                case 3: {
                    codedOutputStream0.writeTag(v2, 3);
                    ((UnknownFieldSetLite)this.c[v]).writeTo(codedOutputStream0);
                    codedOutputStream0.writeTag(v2, 4);
                    break;
                }
                case 5: {
                    codedOutputStream0.writeFixed32(v2, ((int)(((Integer)this.c[v]))));
                    break;
                }
                default: {
                    throw InvalidProtocolBufferException.d();
                }
            }
        }
    }

    public void writeTo(Writer writer0) throws IOException {
        if(this.a == 0) {
            return;
        }
        if(writer0.fieldOrder() == FieldOrder.ASCENDING) {
            for(int v = 0; v < this.a; ++v) {
                UnknownFieldSetLite.f(this.b[v], this.c[v], writer0);
            }
            return;
        }
        for(int v1 = this.a - 1; v1 >= 0; --v1) {
            UnknownFieldSetLite.f(this.b[v1], this.c[v1], writer0);
        }
    }
}

