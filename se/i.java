package se;

import java.util.ArrayList;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.l;
import kotlin.collections.x;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinderKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.PackagePartProvider;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;

public final class i extends Lambda implements Function0 {
    public final int w;
    public final LazyJavaPackageFragment x;

    public i(LazyJavaPackageFragment lazyJavaPackageFragment0, int v) {
        this.w = v;
        this.x = lazyJavaPackageFragment0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if(this.w != 0) {
            Iterable iterable0 = this.x.g.getSubPackages();
            ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
            for(Object object0: iterable0) {
                arrayList0.add(((JavaPackage)object0).getFqName());
            }
            return arrayList0;
        }
        LazyJavaPackageFragment lazyJavaPackageFragment0 = this.x;
        PackagePartProvider packagePartProvider0 = lazyJavaPackageFragment0.h.getComponents().getPackagePartProvider();
        String s = lazyJavaPackageFragment0.getFqName().asString();
        Intrinsics.checkNotNullExpressionValue(s, "fqName.asString()");
        Iterable iterable1 = packagePartProvider0.findPackageParts(s);
        ArrayList arrayList1 = new ArrayList();
        for(Object object1: iterable1) {
            ClassId classId0 = ClassId.topLevel(JvmClassName.byInternalName(((String)object1)).getFqNameForTopLevelClassMaybeWithDollars());
            Intrinsics.checkNotNullExpressionValue(classId0, "topLevel(JvmClassName.by…velClassMaybeWithDollars)");
            KotlinJvmBinaryClass kotlinJvmBinaryClass0 = KotlinClassFinderKt.findKotlinClass(lazyJavaPackageFragment0.h.getComponents().getKotlinClassFinder(), classId0, lazyJavaPackageFragment0.i);
            Pair pair0 = kotlinJvmBinaryClass0 == null ? null : TuplesKt.to(((String)object1), kotlinJvmBinaryClass0);
            if(pair0 != null) {
                arrayList1.add(pair0);
            }
        }
        return x.toMap(arrayList1);
    }
}

