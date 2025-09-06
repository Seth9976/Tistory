package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Collection;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.x;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.PossiblyExternalAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p9.a;

@SourceDebugExtension({"SMAP\nJavaAnnotationMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JavaAnnotationMapper.kt\norg/jetbrains/kotlin/load/java/components/JavaAnnotationDescriptor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,182:1\n1#2:183\n*E\n"})
public class JavaAnnotationDescriptor implements AnnotationDescriptor, PossiblyExternalAnnotationDescriptor {
    public final FqName a;
    public final SourceElement b;
    public final NotNullLazyValue c;
    public final JavaAnnotationArgument d;
    public final boolean e;
    public static final KProperty[] f;

    static {
        JavaAnnotationDescriptor.f = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(JavaAnnotationDescriptor.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;"))};
    }

    public JavaAnnotationDescriptor(@NotNull LazyJavaResolverContext lazyJavaResolverContext0, @Nullable JavaAnnotation javaAnnotation0, @NotNull FqName fqName0) {
        Intrinsics.checkNotNullParameter(lazyJavaResolverContext0, "c");
        JavaAnnotationArgument javaAnnotationArgument0;
        SourceElement sourceElement0;
        Intrinsics.checkNotNullParameter(fqName0, "fqName");
        super();
        this.a = fqName0;
        if(javaAnnotation0 == null) {
            sourceElement0 = SourceElement.NO_SOURCE;
            Intrinsics.checkNotNullExpressionValue(sourceElement0, "NO_SOURCE");
        }
        else {
            sourceElement0 = lazyJavaResolverContext0.getComponents().getSourceElementFactory().source(javaAnnotation0);
            if(sourceElement0 == null) {
                sourceElement0 = SourceElement.NO_SOURCE;
                Intrinsics.checkNotNullExpressionValue(sourceElement0, "NO_SOURCE");
            }
        }
        this.b = sourceElement0;
        this.c = lazyJavaResolverContext0.getStorageManager().createLazyValue(new a(1, lazyJavaResolverContext0, this));
        if(javaAnnotation0 == null) {
            javaAnnotationArgument0 = null;
        }
        else {
            Collection collection0 = javaAnnotation0.getArguments();
            javaAnnotationArgument0 = collection0 == null ? null : ((JavaAnnotationArgument)CollectionsKt___CollectionsKt.firstOrNull(collection0));
        }
        this.d = javaAnnotationArgument0;
        this.e = javaAnnotation0 != null && javaAnnotation0.isIdeExternalAnnotation();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    public Map getAllValueArguments() {
        return x.emptyMap();
    }

    @Nullable
    public final JavaAnnotationArgument getFirstArgument() {
        return this.d;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    public FqName getFqName() {
        return this.a;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    public SourceElement getSource() {
        return this.b;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public KotlinType getType() {
        return this.getType();
    }

    @NotNull
    public SimpleType getType() {
        return (SimpleType)StorageKt.getValue(this.c, this, JavaAnnotationDescriptor.f[0]);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.descriptors.PossiblyExternalAnnotationDescriptor
    public boolean isIdeExternalAnnotation() {
        return this.e;
    }
}

