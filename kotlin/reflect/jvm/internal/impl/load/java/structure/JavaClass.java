package kotlin.reflect.jvm.internal.impl.load.java.structure;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface JavaClass extends JavaClassifier, JavaModifierListOwner, JavaTypeParameterListOwner {
    @NotNull
    Collection getConstructors();

    @NotNull
    Collection getFields();

    @Nullable
    FqName getFqName();

    @NotNull
    Collection getInnerClassNames();

    @Nullable
    LightClassOriginKind getLightClassOriginKind();

    @NotNull
    Collection getMethods();

    @Nullable
    JavaClass getOuterClass();

    @NotNull
    Collection getPermittedTypes();

    @NotNull
    Collection getRecordComponents();

    @NotNull
    Collection getSupertypes();

    boolean hasDefaultConstructor();

    boolean isAnnotationType();

    boolean isEnum();

    boolean isInterface();

    boolean isRecord();

    boolean isSealed();
}

