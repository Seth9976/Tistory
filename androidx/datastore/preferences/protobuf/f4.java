package androidx.datastore.preferences.protobuf;

public final class f4 extends IllegalArgumentException {
    public f4(int v, int v1) {
        super("Unpaired surrogate at index " + v + " of " + v1);
    }
}

