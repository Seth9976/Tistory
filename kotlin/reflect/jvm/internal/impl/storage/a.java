package kotlin.reflect.jvm.internal.impl.storage;

public final class a extends LockBasedStorageManager {
    @Override  // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager
    public final m recursionDetectedDefault(String s, Object object0) {
        if(s == null) {
            throw new IllegalArgumentException("Argument for @NotNull parameter \'source\' of kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1.recursionDetectedDefault must not be null");
        }
        return new m(null, true);
    }
}

