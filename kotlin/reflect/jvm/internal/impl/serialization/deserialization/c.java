package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import kotlin.collections.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.name.ClassId;

public final class c extends Lambda implements Function0 {
    public final DeserializedPackageFragmentImpl w;

    public c(DeserializedPackageFragmentImpl deserializedPackageFragmentImpl0) {
        this.w = deserializedPackageFragmentImpl0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Iterable iterable0 = this.w.getClassDataFinder().getAllClassIds();
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: iterable0) {
            if(!((ClassId)object0).isNestedClass() && !ClassDeserializer.Companion.getBLACK_LIST().contains(((ClassId)object0))) {
                arrayList0.add(object0);
            }
        }
        ArrayList arrayList1 = new ArrayList(l.collectionSizeOrDefault(arrayList0, 10));
        for(Object object1: arrayList0) {
            arrayList1.add(((ClassId)object1).getShortClassName());
        }
        return arrayList1;
    }
}

