package kotlin.reflect.jvm.internal.impl.builtins.functions;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.BuiltInsPackageFragment;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionInterfacePackageFragment;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nBuiltInFictitiousFunctionClassFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuiltInFictitiousFunctionClassFactory.kt\norg/jetbrains/kotlin/builtins/functions/BuiltInFictitiousFunctionClassFactory\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,68:1\n800#2,11:69\n800#2,11:80\n*S KotlinDebug\n*F\n+ 1 BuiltInFictitiousFunctionClassFactory.kt\norg/jetbrains/kotlin/builtins/functions/BuiltInFictitiousFunctionClassFactory\n*L\n53#1:69,11\n57#1:80,11\n*E\n"})
public final class BuiltInFictitiousFunctionClassFactory implements ClassDescriptorFactory {
    public final StorageManager a;
    public final ModuleDescriptor b;

    public BuiltInFictitiousFunctionClassFactory(@NotNull StorageManager storageManager0, @NotNull ModuleDescriptor moduleDescriptor0) {
        Intrinsics.checkNotNullParameter(storageManager0, "storageManager");
        Intrinsics.checkNotNullParameter(moduleDescriptor0, "module");
        super();
        this.a = storageManager0;
        this.b = moduleDescriptor0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    @Nullable
    public ClassDescriptor createClass(@NotNull ClassId classId0) {
        Intrinsics.checkNotNullParameter(classId0, "classId");
        if(!classId0.isLocal() && !classId0.isNestedClass()) {
            String s = classId0.getRelativeClassName().asString();
            Intrinsics.checkNotNullExpressionValue(s, "classId.relativeClassName.asString()");
            if(!StringsKt__StringsKt.contains$default(s, "Function", false, 2, null)) {
                return null;
            }
            FqName fqName0 = classId0.getPackageFqName();
            Intrinsics.checkNotNullExpressionValue(fqName0, "classId.packageFqName");
            KindWithArity functionClassKind$Companion$KindWithArity0 = FunctionClassKind.Companion.parseClassName(s, fqName0);
            if(functionClassKind$Companion$KindWithArity0 == null) {
                return null;
            }
            FunctionClassKind functionClassKind0 = functionClassKind$Companion$KindWithArity0.component1();
            int v = functionClassKind$Companion$KindWithArity0.component2();
            Iterable iterable0 = this.b.getPackage(fqName0).getFragments();
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: iterable0) {
                if(object0 instanceof BuiltInsPackageFragment) {
                    arrayList0.add(object0);
                }
            }
            ArrayList arrayList1 = new ArrayList();
            for(Object object1: arrayList0) {
                if(object1 instanceof FunctionInterfacePackageFragment) {
                    arrayList1.add(object1);
                }
            }
            BuiltInsPackageFragment builtInsPackageFragment0 = (FunctionInterfacePackageFragment)CollectionsKt___CollectionsKt.firstOrNull(arrayList1);
            if(builtInsPackageFragment0 == null) {
                builtInsPackageFragment0 = (BuiltInsPackageFragment)CollectionsKt___CollectionsKt.first(arrayList0);
            }
            return new FunctionClassDescriptor(this.a, builtInsPackageFragment0, functionClassKind0, v);
        }
        return null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    @NotNull
    public Collection getAllContributedClassesIfPossible(@NotNull FqName fqName0) {
        Intrinsics.checkNotNullParameter(fqName0, "packageFqName");
        return f0.emptySet();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    public boolean shouldCreateClass(@NotNull FqName fqName0, @NotNull Name name0) {
        Intrinsics.checkNotNullParameter(fqName0, "packageFqName");
        Intrinsics.checkNotNullParameter(name0, "name");
        String s = name0.asString();
        Intrinsics.checkNotNullExpressionValue(s, "name.asString()");
        return (p.startsWith$default(s, "Function", false, 2, null) || p.startsWith$default(s, "KFunction", false, 2, null) || p.startsWith$default(s, "SuspendFunction", false, 2, null) || p.startsWith$default(s, "KSuspendFunction", false, 2, null)) && FunctionClassKind.Companion.parseClassName(s, fqName0) != null;
    }
}

