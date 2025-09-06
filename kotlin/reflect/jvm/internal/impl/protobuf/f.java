package kotlin.reflect.jvm.internal.impl.protobuf;

public final class f implements FieldSet.FieldDescriptorLite {
    public final EnumLiteMap a;
    public final int b;
    public final FieldType c;
    public final boolean d;
    public final boolean e;

    public f(EnumLiteMap internal$EnumLiteMap0, int v, FieldType wireFormat$FieldType0, boolean z, boolean z1) {
        this.a = internal$EnumLiteMap0;
        this.b = v;
        this.c = wireFormat$FieldType0;
        this.d = z;
        this.e = z1;
    }

    @Override
    public final int compareTo(Object object0) {
        return this.b - ((f)object0).b;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet$FieldDescriptorLite
    public final JavaType getLiteJavaType() {
        return this.c.getJavaType();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet$FieldDescriptorLite
    public final FieldType getLiteType() {
        return this.c;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet$FieldDescriptorLite
    public final int getNumber() {
        return this.b;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet$FieldDescriptorLite
    public final Builder internalMergeFrom(Builder messageLite$Builder0, MessageLite messageLite0) {
        return ((kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder)messageLite$Builder0).mergeFrom(((GeneratedMessageLite)messageLite0));
    }

    @Override  // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet$FieldDescriptorLite
    public final boolean isPacked() {
        return this.e;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet$FieldDescriptorLite
    public final boolean isRepeated() {
        return this.d;
    }
}

