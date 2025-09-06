package kotlin.reflect.jvm.internal.impl.load.java.structure;

import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;

public interface JavaPackage extends JavaAnnotationOwner, JavaElement {
    @NotNull
    Collection getClasses(@NotNull Function1 arg1);

    @NotNull
    FqName getFqName();

    @NotNull
    Collection getSubPackages();
}

