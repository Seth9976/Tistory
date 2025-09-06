package cd;

import com.google.gson.internal.ObjectConstructor;
import com.google.gson.internal.UnsafeAllocator;
import io.reactivex.functions.Predicate;

public final class d implements ObjectConstructor, Predicate {
    public final Class a;

    public d(Class class0) {
        this.a = class0;
        super();
    }

    @Override  // com.google.gson.internal.ObjectConstructor
    public Object construct() {
        Class class0;
        try {
            class0 = this.a;
            return UnsafeAllocator.INSTANCE.newInstance(class0);
        }
        catch(Exception exception0) {
            throw new RuntimeException("Unable to create instance of " + class0 + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", exception0);
        }
    }

    @Override  // io.reactivex.functions.Predicate
    public boolean test(Object object0) {
        return this.a.isInstance(object0);
    }
}

