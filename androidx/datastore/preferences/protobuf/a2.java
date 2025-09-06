package androidx.datastore.preferences.protobuf;

public final class a2 implements MessageInfoFactory {
    public MessageInfoFactory[] a;

    @Override  // androidx.datastore.preferences.protobuf.MessageInfoFactory
    public final boolean isSupported(Class class0) {
        MessageInfoFactory[] arr_messageInfoFactory = this.a;
        for(int v = 0; v < arr_messageInfoFactory.length; ++v) {
            if(arr_messageInfoFactory[v].isSupported(class0)) {
                return true;
            }
        }
        return false;
    }

    @Override  // androidx.datastore.preferences.protobuf.MessageInfoFactory
    public final MessageInfo messageInfoFor(Class class0) {
        MessageInfoFactory[] arr_messageInfoFactory = this.a;
        for(int v = 0; v < arr_messageInfoFactory.length; ++v) {
            MessageInfoFactory messageInfoFactory0 = arr_messageInfoFactory[v];
            if(messageInfoFactory0.isSupported(class0)) {
                return messageInfoFactory0.messageInfoFor(class0);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: " + class0.getName());
    }
}

