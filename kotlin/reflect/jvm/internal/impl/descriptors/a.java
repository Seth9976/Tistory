package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import ke.e;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

public final class a extends Lambda implements Function1 {
    public final NotFoundClasses w;

    public a(NotFoundClasses notFoundClasses0) {
        this.w = notFoundClasses0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        ClassOrPackageFragmentDescriptor classOrPackageFragmentDescriptor0;
        Intrinsics.checkNotNullParameter(((e)object0), "<name for destructuring parameter 0>");
        ClassId classId0 = ((e)object0).a;
        if(classId0.isLocal()) {
            throw new UnsupportedOperationException("Unresolved local class: " + classId0);
        }
        ClassId classId1 = classId0.getOuterClassId();
        NotFoundClasses notFoundClasses0 = this.w;
        List list0 = ((e)object0).b;
        if(classId1 == null) {
        label_9:
            FqName fqName0 = classId0.getPackageFqName();
            Intrinsics.checkNotNullExpressionValue(fqName0, "classId.packageFqName");
            classOrPackageFragmentDescriptor0 = (ClassOrPackageFragmentDescriptor)notFoundClasses0.c.invoke(fqName0);
        }
        else {
            classOrPackageFragmentDescriptor0 = notFoundClasses0.getClass(classId1, CollectionsKt___CollectionsKt.drop(list0, 1));
            if(classOrPackageFragmentDescriptor0 == null) {
                goto label_9;
            }
        }
        boolean z = classId0.isNestedClass();
        StorageManager storageManager0 = notFoundClasses0.a;
        Name name0 = classId0.getShortClassName();
        Intrinsics.checkNotNullExpressionValue(name0, "classId.shortClassName");
        Integer integer0 = (Integer)CollectionsKt___CollectionsKt.firstOrNull(list0);
        return integer0 == null ? new MockClassDescriptor(storageManager0, classOrPackageFragmentDescriptor0, name0, z, 0) : new MockClassDescriptor(storageManager0, classOrPackageFragmentDescriptor0, name0, z, ((int)integer0));
    }
}

