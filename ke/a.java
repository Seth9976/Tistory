package ke;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.Variance;

public final class a implements TypeParameterDescriptor {
    public final TypeParameterDescriptor a;
    public final ClassifierDescriptorWithTypeParameters b;
    public final int c;

    public a(TypeParameterDescriptor typeParameterDescriptor0, ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters0, int v) {
        Intrinsics.checkNotNullParameter(typeParameterDescriptor0, "originalDescriptor");
        Intrinsics.checkNotNullParameter(classifierDescriptorWithTypeParameters0, "declarationDescriptor");
        super();
        this.a = typeParameterDescriptor0;
        this.b = classifierDescriptorWithTypeParameters0;
        this.c = v;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public final Object accept(DeclarationDescriptorVisitor declarationDescriptorVisitor0, Object object0) {
        return this.a.accept(declarationDescriptorVisitor0, object0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public final Annotations getAnnotations() {
        return this.a.getAnnotations();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot
    public final DeclarationDescriptor getContainingDeclaration() {
        return this.b;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public final SimpleType getDefaultType() {
        return this.a.getDefaultType();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public final int getIndex() {
        return this.a.getIndex() + this.c;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.Named
    public final Name getName() {
        return this.a.getName();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public final ClassifierDescriptor getOriginal() {
        return this.getOriginal();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public final DeclarationDescriptor getOriginal() {
        return this.getOriginal();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public final TypeParameterDescriptor getOriginal() {
        TypeParameterDescriptor typeParameterDescriptor0 = this.a.getOriginal();
        Intrinsics.checkNotNullExpressionValue(typeParameterDescriptor0, "originalDescriptor.original");
        return typeParameterDescriptor0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    public final SourceElement getSource() {
        return this.a.getSource();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public final StorageManager getStorageManager() {
        return this.a.getStorageManager();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public final TypeConstructor getTypeConstructor() {
        return this.a.getTypeConstructor();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public final List getUpperBounds() {
        return this.a.getUpperBounds();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public final Variance getVariance() {
        return this.a.getVariance();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public final boolean isCapturedFromOuterDeclaration() {
        return true;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public final boolean isReified() {
        return this.a.isReified();
    }

    @Override
    public final String toString() {
        return this.a + "[inner-copy]";
    }
}

