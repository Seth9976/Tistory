package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.ArrayList;
import kotlin.collections.p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import org.jetbrains.annotations.NotNull;

public interface ClassifierNamePolicy {
    public static final class FULLY_QUALIFIED implements ClassifierNamePolicy {
        @NotNull
        public static final FULLY_QUALIFIED INSTANCE;

        static {
            FULLY_QUALIFIED.INSTANCE = new FULLY_QUALIFIED();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        @Override  // kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy
        @NotNull
        public String renderClassifier(@NotNull ClassifierDescriptor classifierDescriptor0, @NotNull DescriptorRenderer descriptorRenderer0) {
            Intrinsics.checkNotNullParameter(classifierDescriptor0, "classifier");
            Intrinsics.checkNotNullParameter(descriptorRenderer0, "renderer");
            if(classifierDescriptor0 instanceof TypeParameterDescriptor) {
                Name name0 = ((TypeParameterDescriptor)classifierDescriptor0).getName();
                Intrinsics.checkNotNullExpressionValue(name0, "classifier.name");
                return descriptorRenderer0.renderName(name0, false);
            }
            FqNameUnsafe fqNameUnsafe0 = DescriptorUtils.getFqName(classifierDescriptor0);
            Intrinsics.checkNotNullExpressionValue(fqNameUnsafe0, "getFqName(classifier)");
            return descriptorRenderer0.renderFqName(fqNameUnsafe0);
        }
    }

    public static final class SHORT implements ClassifierNamePolicy {
        @NotNull
        public static final SHORT INSTANCE;

        static {
            SHORT.INSTANCE = new SHORT();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        @Override  // kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy
        @NotNull
        public String renderClassifier(@NotNull ClassifierDescriptor classifierDescriptor0, @NotNull DescriptorRenderer descriptorRenderer0) {
            Intrinsics.checkNotNullParameter(classifierDescriptor0, "classifier");
            Intrinsics.checkNotNullParameter(descriptorRenderer0, "renderer");
            if(classifierDescriptor0 instanceof TypeParameterDescriptor) {
                Name name0 = ((TypeParameterDescriptor)classifierDescriptor0).getName();
                Intrinsics.checkNotNullExpressionValue(name0, "classifier.name");
                return descriptorRenderer0.renderName(name0, false);
            }
            ArrayList arrayList0 = new ArrayList();
            do {
                arrayList0.add(classifierDescriptor0.getName());
                classifierDescriptor0 = classifierDescriptor0.getContainingDeclaration();
            }
            while(classifierDescriptor0 instanceof ClassDescriptor);
            return RenderingUtilsKt.renderFqName(p.asReversedMutable(arrayList0));
        }
    }

    public static final class SOURCE_CODE_QUALIFIED implements ClassifierNamePolicy {
        @NotNull
        public static final SOURCE_CODE_QUALIFIED INSTANCE;

        static {
            SOURCE_CODE_QUALIFIED.INSTANCE = new SOURCE_CODE_QUALIFIED();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        public static String a(ClassifierDescriptor classifierDescriptor0) {
            String s1;
            Name name0 = classifierDescriptor0.getName();
            Intrinsics.checkNotNullExpressionValue(name0, "descriptor.name");
            String s = RenderingUtilsKt.render(name0);
            if(classifierDescriptor0 instanceof TypeParameterDescriptor) {
                return s;
            }
            DeclarationDescriptor declarationDescriptor0 = classifierDescriptor0.getContainingDeclaration();
            Intrinsics.checkNotNullExpressionValue(declarationDescriptor0, "descriptor.containingDeclaration");
            if(declarationDescriptor0 instanceof ClassDescriptor) {
                s1 = SOURCE_CODE_QUALIFIED.a(((ClassifierDescriptor)declarationDescriptor0));
                return s1 == null || Intrinsics.areEqual(s1, "") ? s : s1 + '.' + s;
            }
            if(declarationDescriptor0 instanceof PackageFragmentDescriptor) {
                FqNameUnsafe fqNameUnsafe0 = ((PackageFragmentDescriptor)declarationDescriptor0).getFqName().toUnsafe();
                Intrinsics.checkNotNullExpressionValue(fqNameUnsafe0, "descriptor.fqName.toUnsafe()");
                s1 = RenderingUtilsKt.render(fqNameUnsafe0);
                return s1 == null || Intrinsics.areEqual(s1, "") ? s : s1 + '.' + s;
            }
            return s;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy
        @NotNull
        public String renderClassifier(@NotNull ClassifierDescriptor classifierDescriptor0, @NotNull DescriptorRenderer descriptorRenderer0) {
            Intrinsics.checkNotNullParameter(classifierDescriptor0, "classifier");
            Intrinsics.checkNotNullParameter(descriptorRenderer0, "renderer");
            return SOURCE_CODE_QUALIFIED.a(classifierDescriptor0);
        }
    }

    @NotNull
    String renderClassifier(@NotNull ClassifierDescriptor arg1, @NotNull DescriptorRenderer arg2);
}

