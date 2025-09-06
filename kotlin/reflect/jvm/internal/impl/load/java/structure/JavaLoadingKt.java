package kotlin.reflect.jvm.internal.impl.load.java.structure;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;

public final class JavaLoadingKt {
    public static final boolean isObjectMethodInInterface(@NotNull JavaMember javaMember0) {
        Intrinsics.checkNotNullParameter(javaMember0, "<this>");
        if(javaMember0.getContainingClass().isInterface() && javaMember0 instanceof JavaMethod) {
            switch(((JavaMethod)javaMember0).getName().asString()) {
                case "equals": {
                    JavaValueParameter javaValueParameter0 = (JavaValueParameter)CollectionsKt___CollectionsKt.singleOrNull(((JavaMethod)javaMember0).getValueParameters());
                    JavaClassifierType javaClassifierType0 = null;
                    JavaType javaType0 = javaValueParameter0 == null ? null : javaValueParameter0.getType();
                    if(javaType0 instanceof JavaClassifierType) {
                        javaClassifierType0 = (JavaClassifierType)javaType0;
                    }
                    if(javaClassifierType0 != null) {
                        JavaClassifier javaClassifier0 = javaClassifierType0.getClassifier();
                        if(javaClassifier0 instanceof JavaClass) {
                            FqName fqName0 = ((JavaClass)javaClassifier0).getFqName();
                            return fqName0 != null && Intrinsics.areEqual(fqName0.asString(), "java.lang.Object");
                        }
                    }
                    return false;
                }
                case "hashCode": 
                case "toString": {
                    return ((JavaMethod)javaMember0).getValueParameters().isEmpty();
                }
                default: {
                    return false;
                }
            }
        }
        return false;
    }
}

