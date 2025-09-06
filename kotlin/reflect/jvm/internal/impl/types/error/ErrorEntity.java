package kotlin.reflect.jvm.internal.impl.types.error;

import org.jetbrains.annotations.NotNull;

public enum ErrorEntity {
    ERROR_CLASS("<Error class: %s>"),
    ERROR_FUNCTION("<Error function>"),
    ERROR_SCOPE("<Error scope>"),
    ERROR_MODULE("<Error module>"),
    ERROR_PROPERTY("<Error property>"),
    ERROR_TYPE("[Error type: %s]"),
    PARENT_OF_ERROR_SCOPE("<Fake parent for error lexical scope>");

    public final String a;

    public ErrorEntity(String s1) {
        this.a = s1;
    }

    @NotNull
    public final String getDebugText() {
        return this.a;
    }
}

