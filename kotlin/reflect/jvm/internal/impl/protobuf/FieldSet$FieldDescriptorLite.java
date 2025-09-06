package kotlin.reflect.jvm.internal.impl.protobuf;

public interface FieldSet.FieldDescriptorLite extends Comparable {
    JavaType getLiteJavaType();

    FieldType getLiteType();

    int getNumber();

    Builder internalMergeFrom(Builder arg1, MessageLite arg2);

    boolean isPacked();

    boolean isRepeated();
}

