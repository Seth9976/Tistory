package je;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.BuiltInsPackageFragment;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;

public final class b extends Lambda implements Function1 {
    public static final b w;

    static {
        b.w = new b(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((ModuleDescriptor)object0), "module");
        Iterable iterable0 = ((ModuleDescriptor)object0).getPackage(JvmBuiltInClassDescriptorFactory.access$getKOTLIN_FQ_NAME$cp()).getFragments();
        ArrayList arrayList0 = new ArrayList();
        for(Object object1: iterable0) {
            if(object1 instanceof BuiltInsPackageFragment) {
                arrayList0.add(object1);
            }
        }
        return (BuiltInsPackageFragment)CollectionsKt___CollectionsKt.first(arrayList0);
    }
}

