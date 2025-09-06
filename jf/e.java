package jf;

import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

public final class e extends Lambda implements Function1 {
    public static final e w;

    static {
        e.w = new e(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((FunctionDescriptor)object0), "$this$$receiver");
        DeclarationDescriptor declarationDescriptor0 = ((FunctionDescriptor)object0).getContainingDeclaration();
        Intrinsics.checkNotNullExpressionValue(declarationDescriptor0, "containingDeclaration");
        if(!(declarationDescriptor0 instanceof ClassDescriptor) || !KotlinBuiltIns.isAny(((ClassDescriptor)declarationDescriptor0))) {
            Collection collection0 = ((FunctionDescriptor)object0).getOverriddenDescriptors();
            Intrinsics.checkNotNullExpressionValue(collection0, "overriddenDescriptors");
            if(!collection0.isEmpty()) {
                for(Object object1: collection0) {
                    DeclarationDescriptor declarationDescriptor1 = ((FunctionDescriptor)object1).getContainingDeclaration();
                    Intrinsics.checkNotNullExpressionValue(declarationDescriptor1, "it.containingDeclaration");
                    if(declarationDescriptor1 instanceof ClassDescriptor && KotlinBuiltIns.isAny(((ClassDescriptor)declarationDescriptor1))) {
                        return null;
                    }
                    if(false) {
                        break;
                    }
                }
            }
            if(!DescriptorUtilKt.isTypedEqualsInValueClass(((FunctionDescriptor)object0))) {
                StringBuilder stringBuilder0 = new StringBuilder("must override \'\'equals()\'\' in Any");
                DeclarationDescriptor declarationDescriptor2 = ((FunctionDescriptor)object0).getContainingDeclaration();
                Intrinsics.checkNotNullExpressionValue(declarationDescriptor2, "containingDeclaration");
                if(InlineClassesUtilsKt.isValueClass(declarationDescriptor2)) {
                    DeclarationDescriptor declarationDescriptor3 = ((FunctionDescriptor)object0).getContainingDeclaration();
                    Intrinsics.checkNotNull(declarationDescriptor3, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    SimpleType simpleType0 = ((ClassDescriptor)declarationDescriptor3).getDefaultType();
                    Intrinsics.checkNotNullExpressionValue(simpleType0, "containingDeclaration as…ssDescriptor).defaultType");
                    KotlinType kotlinType0 = TypeUtilsKt.replaceArgumentsWithStarProjections(simpleType0);
                    stringBuilder0.append(" or define \'\'equals(other: " + DescriptorRenderer.SHORT_NAMES_IN_TYPES.renderType(kotlinType0) + "): Boolean\'\'");
                }
                String s = stringBuilder0.toString();
                Intrinsics.checkNotNullExpressionValue(s, "StringBuilder().apply(builderAction).toString()");
                return s;
            }
        }
        return null;
    }
}

