package androidx.datastore.preferences.protobuf;

@CheckReturnValue
interface MessageInfoFactory {
    boolean isSupported(Class arg1);

    MessageInfo messageInfoFor(Class arg1);
}

