package se;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;

public final class p extends Lambda implements Function1 {
    public final int w;
    public final LazyJavaScope x;

    public p(LazyJavaScope lazyJavaScope0, int v) {
        this.w = v;
        this.x = lazyJavaScope0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                Intrinsics.checkNotNullParameter(((Name)object0), "name");
                LazyJavaScope lazyJavaScope0 = this.x;
                if(lazyJavaScope0.getMainScope() != null) {
                    return (PropertyDescriptor)lazyJavaScope0.getMainScope().f.invoke(((Name)object0));
                }
                JavaField javaField0 = ((DeclaredMemberIndex)lazyJavaScope0.getDeclaredMemberIndex().invoke()).findFieldByName(((Name)object0));
                return javaField0 != null && !javaField0.isEnumEntry() ? LazyJavaScope.access$resolveProperty(lazyJavaScope0, javaField0) : null;
            }
            case 1: {
                Intrinsics.checkNotNullParameter(((Name)object0), "name");
                LazyJavaScope lazyJavaScope1 = this.x;
                if(lazyJavaScope1.getMainScope() != null) {
                    return (Collection)lazyJavaScope1.getMainScope().e.invoke(((Name)object0));
                }
                ArrayList arrayList1 = new ArrayList();
                for(Object object1: ((DeclaredMemberIndex)lazyJavaScope1.getDeclaredMemberIndex().invoke()).findMethodsByName(((Name)object0))) {
                    JavaMethod javaMethod0 = (JavaMethod)object1;
                    JavaMethodDescriptor javaMethodDescriptor0 = lazyJavaScope1.resolveMethodToFunctionDescriptor(javaMethod0);
                    if(lazyJavaScope1.isVisibleAsFunction(javaMethodDescriptor0)) {
                        lazyJavaScope1.getC().getComponents().getJavaResolverCache().recordMethod(javaMethod0, javaMethodDescriptor0);
                        arrayList1.add(javaMethodDescriptor0);
                    }
                }
                lazyJavaScope1.computeImplicitlyDeclaredFunctions(arrayList1, ((Name)object0));
                return arrayList1;
            }
            case 2: {
                Intrinsics.checkNotNullParameter(((Name)object0), "name");
                LinkedHashSet linkedHashSet0 = new LinkedHashSet(((Collection)this.x.e.invoke(((Name)object0))));
                LazyJavaScope.access$retainMostSpecificMethods(this.x, linkedHashSet0);
                this.x.computeNonDeclaredFunctions(linkedHashSet0, ((Name)object0));
                return CollectionsKt___CollectionsKt.toList(this.x.getC().getComponents().getSignatureEnhancement().enhanceSignatures(this.x.getC(), linkedHashSet0));
            }
            default: {
                Intrinsics.checkNotNullParameter(((Name)object0), "name");
                ArrayList arrayList0 = new ArrayList();
                CollectionsKt.addIfNotNull(arrayList0, this.x.f.invoke(((Name)object0)));
                this.x.computeNonDeclaredProperties(((Name)object0), arrayList0);
                return DescriptorUtils.isAnnotationClass(this.x.getOwnerDescriptor()) ? CollectionsKt___CollectionsKt.toList(arrayList0) : CollectionsKt___CollectionsKt.toList(this.x.getC().getComponents().getSignatureEnhancement().enhanceSignatures(this.x.getC(), arrayList0));
            }
        }
    }
}

