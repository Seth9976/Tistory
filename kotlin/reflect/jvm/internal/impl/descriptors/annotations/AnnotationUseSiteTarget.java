package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt;
import org.jetbrains.annotations.NotNull;

public enum AnnotationUseSiteTarget {
    FIELD(null),
    FILE(null),
    PROPERTY(null),
    PROPERTY_GETTER("get"),
    PROPERTY_SETTER("set"),
    RECEIVER(null),
    CONSTRUCTOR_PARAMETER("param"),
    SETTER_PARAMETER("setparam"),
    PROPERTY_DELEGATE_FIELD("delegate");

    public final String a;

    public AnnotationUseSiteTarget(String s1) {
        if(s1 == null) {
            s1 = CapitalizeDecapitalizeKt.toLowerCaseAsciiOnly(this.name());
        }
        this.a = s1;
    }

    @NotNull
    public final String getRenderName() {
        return this.a;
    }
}

