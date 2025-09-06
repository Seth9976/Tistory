package androidx.datastore.preferences.protobuf;

import java.util.List;
import java.util.Map;

public final class y implements Reader {
    public final CodedInputStream a;
    public int b;
    public int c;
    public int d;

    public y(CodedInputStream codedInputStream0) {
        this.d = 0;
        Internal.a(codedInputStream0, "input");
        this.a = codedInputStream0;
        codedInputStream0.d = this;
    }

    public final void a(Object object0, Schema schema0, ExtensionRegistryLite extensionRegistryLite0) {
        int v1;
        try {
            v1 = this.c;
            this.c = this.b >>> 3 << 3 | 4;
            schema0.mergeFrom(object0, this, extensionRegistryLite0);
            if(this.b == this.c) {
                return;
            }
        }
        finally {
            this.c = v1;
        }
        throw InvalidProtocolBufferException.g();
    }

    public final void b(Object object0, Schema schema0, ExtensionRegistryLite extensionRegistryLite0) {
        CodedInputStream codedInputStream0 = this.a;
        int v = codedInputStream0.readUInt32();
        if(codedInputStream0.a >= codedInputStream0.b) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int v1 = codedInputStream0.pushLimit(v);
        ++codedInputStream0.a;
        schema0.mergeFrom(object0, this, extensionRegistryLite0);
        codedInputStream0.checkLastTagWas(0);
        --codedInputStream0.a;
        codedInputStream0.popLimit(v1);
    }

    public final Object c(FieldType wireFormat$FieldType0, Class class0, ExtensionRegistryLite extensionRegistryLite0) {
        switch(wireFormat$FieldType0) {
            case 1: {
                return Boolean.valueOf(this.readBool());
            }
            case 2: {
                return this.readBytes();
            }
            case 3: {
                return this.readDouble();
            }
            case 4: {
                return this.readEnum();
            }
            case 5: {
                return this.readFixed32();
            }
            case 6: {
                return this.readFixed64();
            }
            case 7: {
                return this.readFloat();
            }
            case 8: {
                return this.readInt32();
            }
            case 9: {
                return this.readInt64();
            }
            case 10: {
                return this.readMessage(class0, extensionRegistryLite0);
            }
            case 11: {
                return this.readSFixed32();
            }
            case 12: {
                return this.readSFixed64();
            }
            case 13: {
                return this.readSInt32();
            }
            case 14: {
                return this.readSInt64();
            }
            case 15: {
                return this.readStringRequireUtf8();
            }
            case 16: {
                return this.readUInt32();
            }
            case 17: {
                return this.readUInt64();
            }
            default: {
                throw new IllegalArgumentException("unsupported field type.");
            }
        }
    }

    public final void d(List list0, boolean z) {
        int v1;
        int v;
        if((this.b & 7) != 2) {
            throw InvalidProtocolBufferException.d();
        }
        CodedInputStream codedInputStream0 = this.a;
        if(list0 instanceof LazyStringList && !z) {
            do {
                ((LazyStringList)list0).add(this.readBytes());
                if(codedInputStream0.isAtEnd()) {
                    return;
                }
                v = codedInputStream0.readTag();
            }
            while(v == this.b);
            this.d = v;
            return;
        }
        do {
            list0.add((z ? this.readStringRequireUtf8() : this.readString()));
            if(codedInputStream0.isAtEnd()) {
                return;
            }
            v1 = codedInputStream0.readTag();
        }
        while(v1 == this.b);
        this.d = v1;
    }

    public final void e(int v) {
        if(this.a.getTotalBytesRead() != v) {
            throw InvalidProtocolBufferException.h();
        }
    }

    public final void f(int v) {
        if((this.b & 7) != v) {
            throw InvalidProtocolBufferException.d();
        }
    }

    public static void g(int v) {
        if((v & 3) != 0) {
            throw InvalidProtocolBufferException.g();
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public final int getFieldNumber() {
        int v = this.d;
        if(v != 0) {
            this.b = v;
            this.d = 0;
            return this.b == 0 || this.b == this.c ? 0x7FFFFFFF : this.b >>> 3;
        }
        this.b = this.a.readTag();
        return this.b == 0 || this.b == this.c ? 0x7FFFFFFF : this.b >>> 3;
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public final int getTag() {
        return this.b;
    }

    public static void h(int v) {
        if((v & 7) != 0) {
            throw InvalidProtocolBufferException.g();
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public final void mergeGroupField(Object object0, Schema schema0, ExtensionRegistryLite extensionRegistryLite0) {
        this.f(3);
        this.a(object0, schema0, extensionRegistryLite0);
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public final void mergeMessageField(Object object0, Schema schema0, ExtensionRegistryLite extensionRegistryLite0) {
        this.f(2);
        this.b(object0, schema0, extensionRegistryLite0);
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public final boolean readBool() {
        this.f(0);
        return this.a.readBool();
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public final void readBoolList(List list0) {
        int v3;
        int v;
        CodedInputStream codedInputStream0 = this.a;
        if(list0 instanceof j) {
            switch(this.b & 7) {
                case 0: {
                    do {
                        ((j)list0).addBoolean(codedInputStream0.readBool());
                        if(codedInputStream0.isAtEnd()) {
                            return;
                        }
                        v = codedInputStream0.readTag();
                    }
                    while(v == this.b);
                    this.d = v;
                    return;
                }
                case 2: {
                    int v1 = codedInputStream0.readUInt32();
                    int v2 = codedInputStream0.getTotalBytesRead() + v1;
                    do {
                        ((j)list0).addBoolean(codedInputStream0.readBool());
                    }
                    while(codedInputStream0.getTotalBytesRead() < v2);
                    this.e(v2);
                    return;
                }
                default: {
                    throw InvalidProtocolBufferException.d();
                }
            }
        }
        switch(this.b & 7) {
            case 0: {
                do {
                    list0.add(Boolean.valueOf(codedInputStream0.readBool()));
                    if(codedInputStream0.isAtEnd()) {
                        return;
                    }
                    v3 = codedInputStream0.readTag();
                }
                while(v3 == this.b);
                this.d = v3;
                return;
            }
            case 2: {
                int v4 = codedInputStream0.readUInt32();
                int v5 = codedInputStream0.getTotalBytesRead() + v4;
                do {
                    list0.add(Boolean.valueOf(codedInputStream0.readBool()));
                }
                while(codedInputStream0.getTotalBytesRead() < v5);
                this.e(v5);
                return;
            }
            default: {
                throw InvalidProtocolBufferException.d();
            }
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public final ByteString readBytes() {
        this.f(2);
        return this.a.readBytes();
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public final void readBytesList(List list0) {
        int v;
        if((this.b & 7) != 2) {
            throw InvalidProtocolBufferException.d();
        }
        do {
            list0.add(this.readBytes());
            CodedInputStream codedInputStream0 = this.a;
            if(codedInputStream0.isAtEnd()) {
                return;
            }
            v = codedInputStream0.readTag();
        }
        while(v == this.b);
        this.d = v;
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public final double readDouble() {
        this.f(1);
        return this.a.readDouble();
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public final void readDoubleList(List list0) {
        int v3;
        int v;
        CodedInputStream codedInputStream0 = this.a;
        if(list0 instanceof h0) {
            switch(this.b & 7) {
                case 1: {
                    do {
                        ((h0)list0).addDouble(codedInputStream0.readDouble());
                        if(codedInputStream0.isAtEnd()) {
                            return;
                        }
                        v = codedInputStream0.readTag();
                    }
                    while(v == this.b);
                    this.d = v;
                    return;
                }
                case 2: {
                    int v1 = codedInputStream0.readUInt32();
                    y.h(v1);
                    int v2 = codedInputStream0.getTotalBytesRead();
                    do {
                        ((h0)list0).addDouble(codedInputStream0.readDouble());
                    }
                    while(codedInputStream0.getTotalBytesRead() < v2 + v1);
                    return;
                }
                default: {
                    throw InvalidProtocolBufferException.d();
                }
            }
        }
        switch(this.b & 7) {
            case 1: {
                do {
                    list0.add(codedInputStream0.readDouble());
                    if(codedInputStream0.isAtEnd()) {
                        return;
                    }
                    v3 = codedInputStream0.readTag();
                }
                while(v3 == this.b);
                this.d = v3;
                return;
            }
            case 2: {
                int v4 = codedInputStream0.readUInt32();
                y.h(v4);
                int v5 = codedInputStream0.getTotalBytesRead();
                do {
                    list0.add(codedInputStream0.readDouble());
                }
                while(codedInputStream0.getTotalBytesRead() < v5 + v4);
                return;
            }
            default: {
                throw InvalidProtocolBufferException.d();
            }
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public final int readEnum() {
        this.f(0);
        return this.a.readEnum();
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public final void readEnumList(List list0) {
        int v3;
        int v;
        CodedInputStream codedInputStream0 = this.a;
        if(list0 instanceof m1) {
            switch(this.b & 7) {
                case 0: {
                    do {
                        ((m1)list0).addInt(codedInputStream0.readEnum());
                        if(codedInputStream0.isAtEnd()) {
                            return;
                        }
                        v = codedInputStream0.readTag();
                    }
                    while(v == this.b);
                    this.d = v;
                    return;
                }
                case 2: {
                    int v1 = codedInputStream0.readUInt32();
                    int v2 = codedInputStream0.getTotalBytesRead() + v1;
                    do {
                        ((m1)list0).addInt(codedInputStream0.readEnum());
                    }
                    while(codedInputStream0.getTotalBytesRead() < v2);
                    this.e(v2);
                    return;
                }
                default: {
                    throw InvalidProtocolBufferException.d();
                }
            }
        }
        switch(this.b & 7) {
            case 0: {
                do {
                    list0.add(codedInputStream0.readEnum());
                    if(codedInputStream0.isAtEnd()) {
                        return;
                    }
                    v3 = codedInputStream0.readTag();
                }
                while(v3 == this.b);
                this.d = v3;
                return;
            }
            case 2: {
                int v4 = codedInputStream0.readUInt32();
                int v5 = codedInputStream0.getTotalBytesRead() + v4;
                do {
                    list0.add(codedInputStream0.readEnum());
                }
                while(codedInputStream0.getTotalBytesRead() < v5);
                this.e(v5);
                return;
            }
            default: {
                throw InvalidProtocolBufferException.d();
            }
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public final int readFixed32() {
        this.f(5);
        return this.a.readFixed32();
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public final void readFixed32List(List list0) {
        int v5;
        int v2;
        CodedInputStream codedInputStream0 = this.a;
        if(list0 instanceof m1) {
            switch(this.b & 7) {
                case 2: {
                    int v = codedInputStream0.readUInt32();
                    y.g(v);
                    int v1 = codedInputStream0.getTotalBytesRead();
                    do {
                        ((m1)list0).addInt(codedInputStream0.readFixed32());
                    }
                    while(codedInputStream0.getTotalBytesRead() < v1 + v);
                    return;
                }
                case 5: {
                    break;
                }
                default: {
                    throw InvalidProtocolBufferException.d();
                }
            }
            do {
                ((m1)list0).addInt(codedInputStream0.readFixed32());
                if(codedInputStream0.isAtEnd()) {
                    return;
                }
                v2 = codedInputStream0.readTag();
            }
            while(v2 == this.b);
            this.d = v2;
            return;
        }
        switch(this.b & 7) {
            case 2: {
                int v3 = codedInputStream0.readUInt32();
                y.g(v3);
                int v4 = codedInputStream0.getTotalBytesRead();
                do {
                    list0.add(codedInputStream0.readFixed32());
                }
                while(codedInputStream0.getTotalBytesRead() < v4 + v3);
                return;
            }
            case 5: {
                break;
            }
            default: {
                throw InvalidProtocolBufferException.d();
            }
        }
        do {
            list0.add(codedInputStream0.readFixed32());
            if(codedInputStream0.isAtEnd()) {
                return;
            }
            v5 = codedInputStream0.readTag();
        }
        while(v5 == this.b);
        this.d = v5;
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public final long readFixed64() {
        this.f(1);
        return this.a.readFixed64();
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public final void readFixed64List(List list0) {
        int v3;
        int v;
        CodedInputStream codedInputStream0 = this.a;
        if(list0 instanceof z1) {
            switch(this.b & 7) {
                case 1: {
                    do {
                        ((z1)list0).addLong(codedInputStream0.readFixed64());
                        if(codedInputStream0.isAtEnd()) {
                            return;
                        }
                        v = codedInputStream0.readTag();
                    }
                    while(v == this.b);
                    this.d = v;
                    return;
                }
                case 2: {
                    int v1 = codedInputStream0.readUInt32();
                    y.h(v1);
                    int v2 = codedInputStream0.getTotalBytesRead();
                    do {
                        ((z1)list0).addLong(codedInputStream0.readFixed64());
                    }
                    while(codedInputStream0.getTotalBytesRead() < v2 + v1);
                    return;
                }
                default: {
                    throw InvalidProtocolBufferException.d();
                }
            }
        }
        switch(this.b & 7) {
            case 1: {
                do {
                    list0.add(codedInputStream0.readFixed64());
                    if(codedInputStream0.isAtEnd()) {
                        return;
                    }
                    v3 = codedInputStream0.readTag();
                }
                while(v3 == this.b);
                this.d = v3;
                return;
            }
            case 2: {
                int v4 = codedInputStream0.readUInt32();
                y.h(v4);
                int v5 = codedInputStream0.getTotalBytesRead();
                do {
                    list0.add(codedInputStream0.readFixed64());
                }
                while(codedInputStream0.getTotalBytesRead() < v5 + v4);
                return;
            }
            default: {
                throw InvalidProtocolBufferException.d();
            }
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public final float readFloat() {
        this.f(5);
        return this.a.readFloat();
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public final void readFloatList(List list0) {
        int v5;
        int v2;
        CodedInputStream codedInputStream0 = this.a;
        if(list0 instanceof f1) {
            switch(this.b & 7) {
                case 2: {
                    int v = codedInputStream0.readUInt32();
                    y.g(v);
                    int v1 = codedInputStream0.getTotalBytesRead();
                    do {
                        ((f1)list0).addFloat(codedInputStream0.readFloat());
                    }
                    while(codedInputStream0.getTotalBytesRead() < v1 + v);
                    return;
                }
                case 5: {
                    break;
                }
                default: {
                    throw InvalidProtocolBufferException.d();
                }
            }
            do {
                ((f1)list0).addFloat(codedInputStream0.readFloat());
                if(codedInputStream0.isAtEnd()) {
                    return;
                }
                v2 = codedInputStream0.readTag();
            }
            while(v2 == this.b);
            this.d = v2;
            return;
        }
        switch(this.b & 7) {
            case 2: {
                int v3 = codedInputStream0.readUInt32();
                y.g(v3);
                int v4 = codedInputStream0.getTotalBytesRead();
                do {
                    list0.add(codedInputStream0.readFloat());
                }
                while(codedInputStream0.getTotalBytesRead() < v4 + v3);
                return;
            }
            case 5: {
                break;
            }
            default: {
                throw InvalidProtocolBufferException.d();
            }
        }
        do {
            list0.add(codedInputStream0.readFloat());
            if(codedInputStream0.isAtEnd()) {
                return;
            }
            v5 = codedInputStream0.readTag();
        }
        while(v5 == this.b);
        this.d = v5;
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public final Object readGroup(Class class0, ExtensionRegistryLite extensionRegistryLite0) {
        this.f(3);
        Schema schema0 = v2.c.a(class0);
        Object object0 = schema0.newInstance();
        this.a(object0, schema0, extensionRegistryLite0);
        schema0.makeImmutable(object0);
        return object0;
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public final Object readGroupBySchemaWithCheck(Schema schema0, ExtensionRegistryLite extensionRegistryLite0) {
        this.f(3);
        Object object0 = schema0.newInstance();
        this.a(object0, schema0, extensionRegistryLite0);
        schema0.makeImmutable(object0);
        return object0;
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public final void readGroupList(List list0, Schema schema0, ExtensionRegistryLite extensionRegistryLite0) {
        if((this.b & 7) != 3) {
            throw InvalidProtocolBufferException.d();
        }
        int v = this.b;
        while(true) {
            Object object0 = schema0.newInstance();
            this.a(object0, schema0, extensionRegistryLite0);
            schema0.makeImmutable(object0);
            list0.add(object0);
            CodedInputStream codedInputStream0 = this.a;
            if(codedInputStream0.isAtEnd() || this.d != 0) {
                break;
            }
            int v1 = codedInputStream0.readTag();
            if(v1 != v) {
                this.d = v1;
                return;
            }
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public final void readGroupList(List list0, Class class0, ExtensionRegistryLite extensionRegistryLite0) {
        this.readGroupList(list0, v2.c.a(class0), extensionRegistryLite0);
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public final int readInt32() {
        this.f(0);
        return this.a.readInt32();
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public final void readInt32List(List list0) {
        int v3;
        int v;
        CodedInputStream codedInputStream0 = this.a;
        if(list0 instanceof m1) {
            switch(this.b & 7) {
                case 0: {
                    do {
                        ((m1)list0).addInt(codedInputStream0.readInt32());
                        if(codedInputStream0.isAtEnd()) {
                            return;
                        }
                        v = codedInputStream0.readTag();
                    }
                    while(v == this.b);
                    this.d = v;
                    return;
                }
                case 2: {
                    int v1 = codedInputStream0.readUInt32();
                    int v2 = codedInputStream0.getTotalBytesRead() + v1;
                    do {
                        ((m1)list0).addInt(codedInputStream0.readInt32());
                    }
                    while(codedInputStream0.getTotalBytesRead() < v2);
                    this.e(v2);
                    return;
                }
                default: {
                    throw InvalidProtocolBufferException.d();
                }
            }
        }
        switch(this.b & 7) {
            case 0: {
                do {
                    list0.add(codedInputStream0.readInt32());
                    if(codedInputStream0.isAtEnd()) {
                        return;
                    }
                    v3 = codedInputStream0.readTag();
                }
                while(v3 == this.b);
                this.d = v3;
                return;
            }
            case 2: {
                int v4 = codedInputStream0.readUInt32();
                int v5 = codedInputStream0.getTotalBytesRead() + v4;
                do {
                    list0.add(codedInputStream0.readInt32());
                }
                while(codedInputStream0.getTotalBytesRead() < v5);
                this.e(v5);
                return;
            }
            default: {
                throw InvalidProtocolBufferException.d();
            }
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public final long readInt64() {
        this.f(0);
        return this.a.readInt64();
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public final void readInt64List(List list0) {
        int v3;
        int v;
        CodedInputStream codedInputStream0 = this.a;
        if(list0 instanceof z1) {
            switch(this.b & 7) {
                case 0: {
                    do {
                        ((z1)list0).addLong(codedInputStream0.readInt64());
                        if(codedInputStream0.isAtEnd()) {
                            return;
                        }
                        v = codedInputStream0.readTag();
                    }
                    while(v == this.b);
                    this.d = v;
                    return;
                }
                case 2: {
                    int v1 = codedInputStream0.readUInt32();
                    int v2 = codedInputStream0.getTotalBytesRead() + v1;
                    do {
                        ((z1)list0).addLong(codedInputStream0.readInt64());
                    }
                    while(codedInputStream0.getTotalBytesRead() < v2);
                    this.e(v2);
                    return;
                }
                default: {
                    throw InvalidProtocolBufferException.d();
                }
            }
        }
        switch(this.b & 7) {
            case 0: {
                do {
                    list0.add(codedInputStream0.readInt64());
                    if(codedInputStream0.isAtEnd()) {
                        return;
                    }
                    v3 = codedInputStream0.readTag();
                }
                while(v3 == this.b);
                this.d = v3;
                return;
            }
            case 2: {
                int v4 = codedInputStream0.readUInt32();
                int v5 = codedInputStream0.getTotalBytesRead() + v4;
                do {
                    list0.add(codedInputStream0.readInt64());
                }
                while(codedInputStream0.getTotalBytesRead() < v5);
                this.e(v5);
                return;
            }
            default: {
                throw InvalidProtocolBufferException.d();
            }
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public final void readMap(Map map0, d2 d20, ExtensionRegistryLite extensionRegistryLite0) {
        this.f(2);
        CodedInputStream codedInputStream0 = this.a;
        int v = codedInputStream0.pushLimit(codedInputStream0.readUInt32());
        Object object0 = d20.b;
        Object object1 = d20.d;
        Object object2 = object1;
        try {
        alab1:
            while(true) {
                while(true) {
                    int v2 = this.getFieldNumber();
                    if(v2 == 0x7FFFFFFF || codedInputStream0.isAtEnd()) {
                        break alab1;
                    }
                    try {
                        switch(v2) {
                            case 1: {
                                object0 = this.c(d20.a, null, null);
                                continue;
                            }
                            case 2: {
                                goto label_15;
                            }
                            default: {
                                if(this.skipField()) {
                                    continue;
                                }
                            }
                        }
                        throw new InvalidProtocolBufferException("Unable to parse map entry.");
                    label_15:
                        Class class0 = object1.getClass();
                        object2 = this.c(d20.c, class0, extensionRegistryLite0);
                        continue;
                    }
                    catch(InvalidWireTypeException unused_ex) {
                    }
                    break;
                }
                if(!this.skipField()) {
                    throw new InvalidProtocolBufferException("Unable to parse map entry.");
                }
            }
            map0.put(object0, object2);
        }
        finally {
            codedInputStream0.popLimit(v);
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public final Object readMessage(Class class0, ExtensionRegistryLite extensionRegistryLite0) {
        this.f(2);
        Schema schema0 = v2.c.a(class0);
        Object object0 = schema0.newInstance();
        this.b(object0, schema0, extensionRegistryLite0);
        schema0.makeImmutable(object0);
        return object0;
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public final Object readMessageBySchemaWithCheck(Schema schema0, ExtensionRegistryLite extensionRegistryLite0) {
        this.f(2);
        Object object0 = schema0.newInstance();
        this.b(object0, schema0, extensionRegistryLite0);
        schema0.makeImmutable(object0);
        return object0;
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public final void readMessageList(List list0, Schema schema0, ExtensionRegistryLite extensionRegistryLite0) {
        if((this.b & 7) != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int v = this.b;
        while(true) {
            Object object0 = schema0.newInstance();
            this.b(object0, schema0, extensionRegistryLite0);
            schema0.makeImmutable(object0);
            list0.add(object0);
            CodedInputStream codedInputStream0 = this.a;
            if(codedInputStream0.isAtEnd() || this.d != 0) {
                break;
            }
            int v1 = codedInputStream0.readTag();
            if(v1 != v) {
                this.d = v1;
                return;
            }
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public final void readMessageList(List list0, Class class0, ExtensionRegistryLite extensionRegistryLite0) {
        this.readMessageList(list0, v2.c.a(class0), extensionRegistryLite0);
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public final int readSFixed32() {
        this.f(5);
        return this.a.readSFixed32();
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public final void readSFixed32List(List list0) {
        int v5;
        int v2;
        CodedInputStream codedInputStream0 = this.a;
        if(list0 instanceof m1) {
            switch(this.b & 7) {
                case 2: {
                    int v = codedInputStream0.readUInt32();
                    y.g(v);
                    int v1 = codedInputStream0.getTotalBytesRead();
                    do {
                        ((m1)list0).addInt(codedInputStream0.readSFixed32());
                    }
                    while(codedInputStream0.getTotalBytesRead() < v1 + v);
                    return;
                }
                case 5: {
                    break;
                }
                default: {
                    throw InvalidProtocolBufferException.d();
                }
            }
            do {
                ((m1)list0).addInt(codedInputStream0.readSFixed32());
                if(codedInputStream0.isAtEnd()) {
                    return;
                }
                v2 = codedInputStream0.readTag();
            }
            while(v2 == this.b);
            this.d = v2;
            return;
        }
        switch(this.b & 7) {
            case 2: {
                int v3 = codedInputStream0.readUInt32();
                y.g(v3);
                int v4 = codedInputStream0.getTotalBytesRead();
                do {
                    list0.add(codedInputStream0.readSFixed32());
                }
                while(codedInputStream0.getTotalBytesRead() < v4 + v3);
                return;
            }
            case 5: {
                break;
            }
            default: {
                throw InvalidProtocolBufferException.d();
            }
        }
        do {
            list0.add(codedInputStream0.readSFixed32());
            if(codedInputStream0.isAtEnd()) {
                return;
            }
            v5 = codedInputStream0.readTag();
        }
        while(v5 == this.b);
        this.d = v5;
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public final long readSFixed64() {
        this.f(1);
        return this.a.readSFixed64();
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public final void readSFixed64List(List list0) {
        int v3;
        int v;
        CodedInputStream codedInputStream0 = this.a;
        if(list0 instanceof z1) {
            switch(this.b & 7) {
                case 1: {
                    do {
                        ((z1)list0).addLong(codedInputStream0.readSFixed64());
                        if(codedInputStream0.isAtEnd()) {
                            return;
                        }
                        v = codedInputStream0.readTag();
                    }
                    while(v == this.b);
                    this.d = v;
                    return;
                }
                case 2: {
                    int v1 = codedInputStream0.readUInt32();
                    y.h(v1);
                    int v2 = codedInputStream0.getTotalBytesRead();
                    do {
                        ((z1)list0).addLong(codedInputStream0.readSFixed64());
                    }
                    while(codedInputStream0.getTotalBytesRead() < v2 + v1);
                    return;
                }
                default: {
                    throw InvalidProtocolBufferException.d();
                }
            }
        }
        switch(this.b & 7) {
            case 1: {
                do {
                    list0.add(codedInputStream0.readSFixed64());
                    if(codedInputStream0.isAtEnd()) {
                        return;
                    }
                    v3 = codedInputStream0.readTag();
                }
                while(v3 == this.b);
                this.d = v3;
                return;
            }
            case 2: {
                int v4 = codedInputStream0.readUInt32();
                y.h(v4);
                int v5 = codedInputStream0.getTotalBytesRead();
                do {
                    list0.add(codedInputStream0.readSFixed64());
                }
                while(codedInputStream0.getTotalBytesRead() < v5 + v4);
                return;
            }
            default: {
                throw InvalidProtocolBufferException.d();
            }
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public final int readSInt32() {
        this.f(0);
        return this.a.readSInt32();
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public final void readSInt32List(List list0) {
        int v3;
        int v;
        CodedInputStream codedInputStream0 = this.a;
        if(list0 instanceof m1) {
            switch(this.b & 7) {
                case 0: {
                    do {
                        ((m1)list0).addInt(codedInputStream0.readSInt32());
                        if(codedInputStream0.isAtEnd()) {
                            return;
                        }
                        v = codedInputStream0.readTag();
                    }
                    while(v == this.b);
                    this.d = v;
                    return;
                }
                case 2: {
                    int v1 = codedInputStream0.readUInt32();
                    int v2 = codedInputStream0.getTotalBytesRead() + v1;
                    do {
                        ((m1)list0).addInt(codedInputStream0.readSInt32());
                    }
                    while(codedInputStream0.getTotalBytesRead() < v2);
                    this.e(v2);
                    return;
                }
                default: {
                    throw InvalidProtocolBufferException.d();
                }
            }
        }
        switch(this.b & 7) {
            case 0: {
                do {
                    list0.add(codedInputStream0.readSInt32());
                    if(codedInputStream0.isAtEnd()) {
                        return;
                    }
                    v3 = codedInputStream0.readTag();
                }
                while(v3 == this.b);
                this.d = v3;
                return;
            }
            case 2: {
                int v4 = codedInputStream0.readUInt32();
                int v5 = codedInputStream0.getTotalBytesRead() + v4;
                do {
                    list0.add(codedInputStream0.readSInt32());
                }
                while(codedInputStream0.getTotalBytesRead() < v5);
                this.e(v5);
                return;
            }
            default: {
                throw InvalidProtocolBufferException.d();
            }
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public final long readSInt64() {
        this.f(0);
        return this.a.readSInt64();
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public final void readSInt64List(List list0) {
        int v3;
        int v;
        CodedInputStream codedInputStream0 = this.a;
        if(list0 instanceof z1) {
            switch(this.b & 7) {
                case 0: {
                    do {
                        ((z1)list0).addLong(codedInputStream0.readSInt64());
                        if(codedInputStream0.isAtEnd()) {
                            return;
                        }
                        v = codedInputStream0.readTag();
                    }
                    while(v == this.b);
                    this.d = v;
                    return;
                }
                case 2: {
                    int v1 = codedInputStream0.readUInt32();
                    int v2 = codedInputStream0.getTotalBytesRead() + v1;
                    do {
                        ((z1)list0).addLong(codedInputStream0.readSInt64());
                    }
                    while(codedInputStream0.getTotalBytesRead() < v2);
                    this.e(v2);
                    return;
                }
                default: {
                    throw InvalidProtocolBufferException.d();
                }
            }
        }
        switch(this.b & 7) {
            case 0: {
                do {
                    list0.add(codedInputStream0.readSInt64());
                    if(codedInputStream0.isAtEnd()) {
                        return;
                    }
                    v3 = codedInputStream0.readTag();
                }
                while(v3 == this.b);
                this.d = v3;
                return;
            }
            case 2: {
                int v4 = codedInputStream0.readUInt32();
                int v5 = codedInputStream0.getTotalBytesRead() + v4;
                do {
                    list0.add(codedInputStream0.readSInt64());
                }
                while(codedInputStream0.getTotalBytesRead() < v5);
                this.e(v5);
                return;
            }
            default: {
                throw InvalidProtocolBufferException.d();
            }
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public final String readString() {
        this.f(2);
        return this.a.readString();
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public final void readStringList(List list0) {
        this.d(list0, false);
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public final void readStringListRequireUtf8(List list0) {
        this.d(list0, true);
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public final String readStringRequireUtf8() {
        this.f(2);
        return this.a.readStringRequireUtf8();
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public final int readUInt32() {
        this.f(0);
        return this.a.readUInt32();
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public final void readUInt32List(List list0) {
        int v3;
        int v;
        CodedInputStream codedInputStream0 = this.a;
        if(list0 instanceof m1) {
            switch(this.b & 7) {
                case 0: {
                    do {
                        ((m1)list0).addInt(codedInputStream0.readUInt32());
                        if(codedInputStream0.isAtEnd()) {
                            return;
                        }
                        v = codedInputStream0.readTag();
                    }
                    while(v == this.b);
                    this.d = v;
                    return;
                }
                case 2: {
                    int v1 = codedInputStream0.readUInt32();
                    int v2 = codedInputStream0.getTotalBytesRead() + v1;
                    do {
                        ((m1)list0).addInt(codedInputStream0.readUInt32());
                    }
                    while(codedInputStream0.getTotalBytesRead() < v2);
                    this.e(v2);
                    return;
                }
                default: {
                    throw InvalidProtocolBufferException.d();
                }
            }
        }
        switch(this.b & 7) {
            case 0: {
                do {
                    list0.add(codedInputStream0.readUInt32());
                    if(codedInputStream0.isAtEnd()) {
                        return;
                    }
                    v3 = codedInputStream0.readTag();
                }
                while(v3 == this.b);
                this.d = v3;
                return;
            }
            case 2: {
                int v4 = codedInputStream0.readUInt32();
                int v5 = codedInputStream0.getTotalBytesRead() + v4;
                do {
                    list0.add(codedInputStream0.readUInt32());
                }
                while(codedInputStream0.getTotalBytesRead() < v5);
                this.e(v5);
                return;
            }
            default: {
                throw InvalidProtocolBufferException.d();
            }
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public final long readUInt64() {
        this.f(0);
        return this.a.readUInt64();
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public final void readUInt64List(List list0) {
        int v3;
        int v;
        CodedInputStream codedInputStream0 = this.a;
        if(list0 instanceof z1) {
            switch(this.b & 7) {
                case 0: {
                    do {
                        ((z1)list0).addLong(codedInputStream0.readUInt64());
                        if(codedInputStream0.isAtEnd()) {
                            return;
                        }
                        v = codedInputStream0.readTag();
                    }
                    while(v == this.b);
                    this.d = v;
                    return;
                }
                case 2: {
                    int v1 = codedInputStream0.readUInt32();
                    int v2 = codedInputStream0.getTotalBytesRead() + v1;
                    do {
                        ((z1)list0).addLong(codedInputStream0.readUInt64());
                    }
                    while(codedInputStream0.getTotalBytesRead() < v2);
                    this.e(v2);
                    return;
                }
                default: {
                    throw InvalidProtocolBufferException.d();
                }
            }
        }
        switch(this.b & 7) {
            case 0: {
                do {
                    list0.add(codedInputStream0.readUInt64());
                    if(codedInputStream0.isAtEnd()) {
                        return;
                    }
                    v3 = codedInputStream0.readTag();
                }
                while(v3 == this.b);
                this.d = v3;
                return;
            }
            case 2: {
                int v4 = codedInputStream0.readUInt32();
                int v5 = codedInputStream0.getTotalBytesRead() + v4;
                do {
                    list0.add(codedInputStream0.readUInt64());
                }
                while(codedInputStream0.getTotalBytesRead() < v5);
                this.e(v5);
                return;
            }
            default: {
                throw InvalidProtocolBufferException.d();
            }
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public final boolean shouldDiscardUnknownFields() {
        this.a.getClass();
        return false;
    }

    @Override  // androidx.datastore.preferences.protobuf.Reader
    public final boolean skipField() {
        CodedInputStream codedInputStream0 = this.a;
        if(!codedInputStream0.isAtEnd()) {
            return this.b == this.c ? false : codedInputStream0.skipField(this.b);
        }
        return false;
    }
}

