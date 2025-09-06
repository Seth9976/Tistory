package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.o;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nSyntheticJavaPartsProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SyntheticJavaPartsProvider.kt\norg/jetbrains/kotlin/resolve/jvm/CompositeSyntheticJavaPartsProvider\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,90:1\n1360#2:91\n1446#2,5:92\n1855#2,2:97\n1360#2:99\n1446#2,5:100\n1855#2,2:105\n1855#2,2:107\n1360#2:109\n1446#2,5:110\n1855#2,2:115\n*S KotlinDebug\n*F\n+ 1 SyntheticJavaPartsProvider.kt\norg/jetbrains/kotlin/resolve/jvm/CompositeSyntheticJavaPartsProvider\n*L\n54#1:91\n54#1:92,5\n63#1:97,2\n68#1:99\n68#1:100,5\n72#1:105,2\n77#1:107,2\n82#1:109\n82#1:110,5\n87#1:115,2\n*E\n"})
public final class CompositeSyntheticJavaPartsProvider implements SyntheticJavaPartsProvider {
    public final List a;

    public CompositeSyntheticJavaPartsProvider(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "inner");
        super();
        this.a = list0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    public void generateConstructors(@NotNull LazyJavaResolverContext lazyJavaResolverContext0, @NotNull ClassDescriptor classDescriptor0, @NotNull List list0) {
        Intrinsics.checkNotNullParameter(lazyJavaResolverContext0, "_context_receiver_0");
        Intrinsics.checkNotNullParameter(classDescriptor0, "thisDescriptor");
        Intrinsics.checkNotNullParameter(list0, "result");
        for(Object object0: this.a) {
            ((SyntheticJavaPartsProvider)object0).generateConstructors(lazyJavaResolverContext0, classDescriptor0, list0);
        }
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    public void generateMethods(@NotNull LazyJavaResolverContext lazyJavaResolverContext0, @NotNull ClassDescriptor classDescriptor0, @NotNull Name name0, @NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(lazyJavaResolverContext0, "_context_receiver_0");
        Intrinsics.checkNotNullParameter(classDescriptor0, "thisDescriptor");
        Intrinsics.checkNotNullParameter(name0, "name");
        Intrinsics.checkNotNullParameter(collection0, "result");
        for(Object object0: this.a) {
            ((SyntheticJavaPartsProvider)object0).generateMethods(lazyJavaResolverContext0, classDescriptor0, name0, collection0);
        }
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    public void generateNestedClass(@NotNull LazyJavaResolverContext lazyJavaResolverContext0, @NotNull ClassDescriptor classDescriptor0, @NotNull Name name0, @NotNull List list0) {
        Intrinsics.checkNotNullParameter(lazyJavaResolverContext0, "_context_receiver_0");
        Intrinsics.checkNotNullParameter(classDescriptor0, "thisDescriptor");
        Intrinsics.checkNotNullParameter(name0, "name");
        Intrinsics.checkNotNullParameter(list0, "result");
        for(Object object0: this.a) {
            ((SyntheticJavaPartsProvider)object0).generateNestedClass(lazyJavaResolverContext0, classDescriptor0, name0, list0);
        }
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    public void generateStaticFunctions(@NotNull LazyJavaResolverContext lazyJavaResolverContext0, @NotNull ClassDescriptor classDescriptor0, @NotNull Name name0, @NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(lazyJavaResolverContext0, "_context_receiver_0");
        Intrinsics.checkNotNullParameter(classDescriptor0, "thisDescriptor");
        Intrinsics.checkNotNullParameter(name0, "name");
        Intrinsics.checkNotNullParameter(collection0, "result");
        for(Object object0: this.a) {
            ((SyntheticJavaPartsProvider)object0).generateStaticFunctions(lazyJavaResolverContext0, classDescriptor0, name0, collection0);
        }
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    @NotNull
    public List getMethodNames(@NotNull LazyJavaResolverContext lazyJavaResolverContext0, @NotNull ClassDescriptor classDescriptor0) {
        Intrinsics.checkNotNullParameter(lazyJavaResolverContext0, "_context_receiver_0");
        Intrinsics.checkNotNullParameter(classDescriptor0, "thisDescriptor");
        List list0 = new ArrayList();
        for(Object object0: this.a) {
            o.addAll(list0, ((SyntheticJavaPartsProvider)object0).getMethodNames(lazyJavaResolverContext0, classDescriptor0));
        }
        return list0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    @NotNull
    public List getNestedClassNames(@NotNull LazyJavaResolverContext lazyJavaResolverContext0, @NotNull ClassDescriptor classDescriptor0) {
        Intrinsics.checkNotNullParameter(lazyJavaResolverContext0, "_context_receiver_0");
        Intrinsics.checkNotNullParameter(classDescriptor0, "thisDescriptor");
        List list0 = new ArrayList();
        for(Object object0: this.a) {
            o.addAll(list0, ((SyntheticJavaPartsProvider)object0).getNestedClassNames(lazyJavaResolverContext0, classDescriptor0));
        }
        return list0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    @NotNull
    public List getStaticFunctionNames(@NotNull LazyJavaResolverContext lazyJavaResolverContext0, @NotNull ClassDescriptor classDescriptor0) {
        Intrinsics.checkNotNullParameter(lazyJavaResolverContext0, "_context_receiver_0");
        Intrinsics.checkNotNullParameter(classDescriptor0, "thisDescriptor");
        List list0 = new ArrayList();
        for(Object object0: this.a) {
            o.addAll(list0, ((SyntheticJavaPartsProvider)object0).getStaticFunctionNames(lazyJavaResolverContext0, classDescriptor0));
        }
        return list0;
    }
}

