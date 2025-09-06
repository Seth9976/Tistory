package androidx.datastore.preferences.protobuf;

public interface FieldSet.FieldDescriptorLite extends Comparable {
    EnumLiteMap getEnumType();

    JavaType getLiteJavaType();

    FieldType getLiteType();

    int getNumber();

    Builder internalMergeFrom(Builder arg1, MessageLite arg2);

    boolean isPacked();

    boolean isRepeated();
}

