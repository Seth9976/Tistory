package kotlin.reflect;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import kotlin.NotImplementedError;
import kotlin.collections.l;
import kotlin.jvm.internal.Intrinsics;

public final class d implements TypeVariable, TypeImpl {
    public final KTypeParameter a;

    public d(KTypeParameter kTypeParameter0) {
        Intrinsics.checkNotNullParameter(kTypeParameter0, "typeParameter");
        super();
        this.a = kTypeParameter0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 instanceof TypeVariable && Intrinsics.areEqual(this.a.getName(), ((TypeVariable)object0).getName())) {
            this.getGenericDeclaration();
            throw null;
        }
        return false;
    }

    @Override
    public final Type[] getBounds() {
        Iterable iterable0 = this.a.getUpperBounds();
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
        for(Object object0: iterable0) {
            arrayList0.add(TypesJVMKt.a(((KType)object0), true));
        }
        return (Type[])arrayList0.toArray(new Type[0]);
    }

    @Override
    public final GenericDeclaration getGenericDeclaration() {
        throw new NotImplementedError("An operation is not implemented: " + ("getGenericDeclaration() is not yet supported for type variables created from KType: " + this.a));
    }

    @Override
    public final String getName() {
        return this.a.getName();
    }

    @Override  // kotlin.reflect.TypeImpl
    public final String getTypeName() {
        return this.a.getName();
    }

    @Override
    public final int hashCode() {
        this.a.getName().hashCode();
        this.getGenericDeclaration();
        throw null;
    }

    @Override
    public final String toString() {
        return this.a.getName();
    }
}

