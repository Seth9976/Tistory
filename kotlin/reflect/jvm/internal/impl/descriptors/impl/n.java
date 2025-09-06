package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions;
import kotlin.reflect.jvm.internal.impl.storage.g;

public final class n implements Function1 {
    public final int a;

    public n(int v) {
        this.a = v;
        super();
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.a) {
            case 0: {
                return Boolean.valueOf(!((TypeParameterDescriptor)object0).isCapturedFromOuterDeclaration());
            }
            case 1: {
                return ((g)object0).b.invoke();
            }
            case 2: {
                return Name.guessByFirstCharacter(((String)object0));
            }
            case 3: {
                ((DescriptorRendererOptions)object0).setWithDefinedIn(false);
                ((DescriptorRendererOptions)object0).setVerbose(true);
                ((DescriptorRendererOptions)object0).setAnnotationArgumentsRenderingPolicy(AnnotationArgumentsRenderingPolicy.UNLESS_EMPTY);
                ((DescriptorRendererOptions)object0).setModifiers(DescriptorRendererModifier.ALL);
                return Unit.INSTANCE;
            }
            case 4: {
                return (CallableMemberDescriptor)object0;
            }
            default: {
                return (CallableMemberDescriptor)object0;
            }
        }
    }
}

