package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.Set;
import org.jetbrains.annotations.NotNull;

public interface DescriptorRendererOptions {
    public static final class DefaultImpls {
        public static boolean getIncludeAnnotationArguments(@NotNull DescriptorRendererOptions descriptorRendererOptions0) {
            return descriptorRendererOptions0.getAnnotationArgumentsRenderingPolicy().getIncludeAnnotationArguments();
        }

        public static boolean getIncludeEmptyAnnotationArguments(@NotNull DescriptorRendererOptions descriptorRendererOptions0) {
            return descriptorRendererOptions0.getAnnotationArgumentsRenderingPolicy().getIncludeEmptyAnnotationArguments();
        }
    }

    @NotNull
    AnnotationArgumentsRenderingPolicy getAnnotationArgumentsRenderingPolicy();

    boolean getDebugMode();

    boolean getEnhancedTypes();

    @NotNull
    Set getExcludedTypeAnnotationClasses();

    void setAnnotationArgumentsRenderingPolicy(@NotNull AnnotationArgumentsRenderingPolicy arg1);

    void setClassifierNamePolicy(@NotNull ClassifierNamePolicy arg1);

    void setDebugMode(boolean arg1);

    void setExcludedTypeAnnotationClasses(@NotNull Set arg1);

    void setModifiers(@NotNull Set arg1);

    void setParameterNameRenderingPolicy(@NotNull ParameterNameRenderingPolicy arg1);

    void setReceiverAfterName(boolean arg1);

    void setRenderCompanionObjectName(boolean arg1);

    void setStartFromName(boolean arg1);

    void setTextFormat(@NotNull RenderingFormat arg1);

    void setVerbose(boolean arg1);

    void setWithDefinedIn(boolean arg1);

    void setWithoutSuperTypes(boolean arg1);

    void setWithoutTypeParameters(boolean arg1);
}

