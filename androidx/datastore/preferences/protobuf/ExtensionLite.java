package androidx.datastore.preferences.protobuf;

public abstract class ExtensionLite {
    public abstract Object getDefaultValue();

    public abstract FieldType getLiteType();

    public abstract MessageLite getMessageDefaultInstance();

    public abstract int getNumber();

    public abstract boolean isRepeated();
}

