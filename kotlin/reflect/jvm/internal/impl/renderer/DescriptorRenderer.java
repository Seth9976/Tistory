package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ye.a;
import ye.b;
import ye.c;
import ye.d;
import ye.e;
import ye.f;

public abstract class DescriptorRenderer {
    public static final class Companion {
        public final class WhenMappings {
            public static final int[] $EnumSwitchMapping$0;

            static {
                int[] arr_v = new int[ClassKind.values().length];
                try {
                    arr_v[ClassKind.CLASS.ordinal()] = 1;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[ClassKind.INTERFACE.ordinal()] = 2;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[ClassKind.ENUM_CLASS.ordinal()] = 3;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[ClassKind.OBJECT.ordinal()] = 4;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[ClassKind.ANNOTATION_CLASS.ordinal()] = 5;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[ClassKind.ENUM_ENTRY.ordinal()] = 6;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                WhenMappings.$EnumSwitchMapping$0 = arr_v;
            }
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final String getClassifierKindPrefix(@NotNull ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters0) {
            Intrinsics.checkNotNullParameter(classifierDescriptorWithTypeParameters0, "classifier");
            if(classifierDescriptorWithTypeParameters0 instanceof TypeAliasDescriptor) {
                return "typealias";
            }
            if(classifierDescriptorWithTypeParameters0 instanceof ClassDescriptor) {
                if(((ClassDescriptor)classifierDescriptorWithTypeParameters0).isCompanionObject()) {
                    return "companion object";
                }
                switch(WhenMappings.$EnumSwitchMapping$0[((ClassDescriptor)classifierDescriptorWithTypeParameters0).getKind().ordinal()]) {
                    case 1: {
                        return "class";
                    }
                    case 2: {
                        return "interface";
                    }
                    case 3: {
                        return "enum class";
                    }
                    case 4: {
                        return "object";
                    }
                    case 5: {
                        return "annotation class";
                    }
                    case 6: {
                        return "enum entry";
                    }
                    default: {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
            throw new AssertionError("Unexpected classifier: " + classifierDescriptorWithTypeParameters0);
        }

        @NotNull
        public final DescriptorRenderer withOptions(@NotNull Function1 function10) {
            Intrinsics.checkNotNullParameter(function10, "changeOptions");
            DescriptorRendererOptionsImpl descriptorRendererOptionsImpl0 = new DescriptorRendererOptionsImpl();
            function10.invoke(descriptorRendererOptionsImpl0);
            descriptorRendererOptionsImpl0.lock();
            return new DescriptorRendererImpl(descriptorRendererOptionsImpl0);
        }
    }

    public interface ValueParametersHandler {
        public static final class DEFAULT implements ValueParametersHandler {
            @NotNull
            public static final DEFAULT INSTANCE;

            static {
                DEFAULT.INSTANCE = new DEFAULT();  // 初始化器: Ljava/lang/Object;-><init>()V
            }

            @Override  // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$ValueParametersHandler
            public void appendAfterValueParameter(@NotNull ValueParameterDescriptor valueParameterDescriptor0, int v, int v1, @NotNull StringBuilder stringBuilder0) {
                Intrinsics.checkNotNullParameter(valueParameterDescriptor0, "parameter");
                Intrinsics.checkNotNullParameter(stringBuilder0, "builder");
                if(v != v1 - 1) {
                    stringBuilder0.append(", ");
                }
            }

            @Override  // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$ValueParametersHandler
            public void appendAfterValueParameters(int v, @NotNull StringBuilder stringBuilder0) {
                Intrinsics.checkNotNullParameter(stringBuilder0, "builder");
                stringBuilder0.append(")");
            }

            @Override  // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$ValueParametersHandler
            public void appendBeforeValueParameter(@NotNull ValueParameterDescriptor valueParameterDescriptor0, int v, int v1, @NotNull StringBuilder stringBuilder0) {
                Intrinsics.checkNotNullParameter(valueParameterDescriptor0, "parameter");
                Intrinsics.checkNotNullParameter(stringBuilder0, "builder");
            }

            @Override  // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$ValueParametersHandler
            public void appendBeforeValueParameters(int v, @NotNull StringBuilder stringBuilder0) {
                Intrinsics.checkNotNullParameter(stringBuilder0, "builder");
                stringBuilder0.append("(");
            }
        }

        void appendAfterValueParameter(@NotNull ValueParameterDescriptor arg1, int arg2, int arg3, @NotNull StringBuilder arg4);

        void appendAfterValueParameters(int arg1, @NotNull StringBuilder arg2);

        void appendBeforeValueParameter(@NotNull ValueParameterDescriptor arg1, int arg2, int arg3, @NotNull StringBuilder arg4);

        void appendBeforeValueParameters(int arg1, @NotNull StringBuilder arg2);
    }

    @JvmField
    @NotNull
    public static final DescriptorRenderer COMPACT;
    @JvmField
    @NotNull
    public static final DescriptorRenderer COMPACT_WITHOUT_SUPERTYPES;
    @JvmField
    @NotNull
    public static final DescriptorRenderer COMPACT_WITH_MODIFIERS;
    @JvmField
    @NotNull
    public static final DescriptorRenderer COMPACT_WITH_SHORT_TYPES;
    @NotNull
    public static final Companion Companion;
    @JvmField
    @NotNull
    public static final DescriptorRenderer DEBUG_TEXT;
    @JvmField
    @NotNull
    public static final DescriptorRenderer FQ_NAMES_IN_TYPES;
    @JvmField
    @NotNull
    public static final DescriptorRenderer FQ_NAMES_IN_TYPES_WITH_ANNOTATIONS;
    @JvmField
    @NotNull
    public static final DescriptorRenderer HTML;
    @JvmField
    @NotNull
    public static final DescriptorRenderer ONLY_NAMES_WITH_SHORT_TYPES;
    @JvmField
    @NotNull
    public static final DescriptorRenderer SHORT_NAMES_IN_TYPES;

    static {
        Companion descriptorRenderer$Companion0 = new Companion(null);
        DescriptorRenderer.Companion = descriptorRenderer$Companion0;
        DescriptorRenderer.COMPACT_WITH_MODIFIERS = descriptorRenderer$Companion0.withOptions(c.w);
        DescriptorRenderer.COMPACT = descriptorRenderer$Companion0.withOptions(a.w);
        DescriptorRenderer.COMPACT_WITHOUT_SUPERTYPES = descriptorRenderer$Companion0.withOptions(b.w);
        DescriptorRenderer.COMPACT_WITH_SHORT_TYPES = descriptorRenderer$Companion0.withOptions(kotlin.reflect.jvm.internal.impl.renderer.a.w);
        DescriptorRenderer.ONLY_NAMES_WITH_SHORT_TYPES = descriptorRenderer$Companion0.withOptions(kotlin.reflect.jvm.internal.impl.renderer.c.w);
        DescriptorRenderer.FQ_NAMES_IN_TYPES = descriptorRenderer$Companion0.withOptions(d.w);
        DescriptorRenderer.FQ_NAMES_IN_TYPES_WITH_ANNOTATIONS = descriptorRenderer$Companion0.withOptions(e.w);
        DescriptorRenderer.SHORT_NAMES_IN_TYPES = descriptorRenderer$Companion0.withOptions(kotlin.reflect.jvm.internal.impl.renderer.d.w);
        DescriptorRenderer.DEBUG_TEXT = descriptorRenderer$Companion0.withOptions(kotlin.reflect.jvm.internal.impl.renderer.b.w);
        DescriptorRenderer.HTML = descriptorRenderer$Companion0.withOptions(f.w);
    }

    @NotNull
    public abstract String render(@NotNull DeclarationDescriptor arg1);

    @NotNull
    public abstract String renderAnnotation(@NotNull AnnotationDescriptor arg1, @Nullable AnnotationUseSiteTarget arg2);

    public static String renderAnnotation$default(DescriptorRenderer descriptorRenderer0, AnnotationDescriptor annotationDescriptor0, AnnotationUseSiteTarget annotationUseSiteTarget0, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: renderAnnotation");
        }
        if((v & 2) != 0) {
            annotationUseSiteTarget0 = null;
        }
        return descriptorRenderer0.renderAnnotation(annotationDescriptor0, annotationUseSiteTarget0);
    }

    @NotNull
    public abstract String renderFlexibleType(@NotNull String arg1, @NotNull String arg2, @NotNull KotlinBuiltIns arg3);

    @NotNull
    public abstract String renderFqName(@NotNull FqNameUnsafe arg1);

    @NotNull
    public abstract String renderName(@NotNull Name arg1, boolean arg2);

    @NotNull
    public abstract String renderType(@NotNull KotlinType arg1);

    @NotNull
    public abstract String renderTypeProjection(@NotNull TypeProjection arg1);

    @NotNull
    public final DescriptorRenderer withOptions(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "changeOptions");
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type org.jetbrains.kotlin.renderer.DescriptorRendererImpl");
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl0 = ((DescriptorRendererImpl)this).getOptions().copy();
        function10.invoke(descriptorRendererOptionsImpl0);
        descriptorRendererOptionsImpl0.lock();
        return new DescriptorRendererImpl(descriptorRendererOptionsImpl0);
    }
}

