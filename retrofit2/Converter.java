package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

public interface Converter {
    public static abstract class Factory {
        public static Type getParameterUpperBound(int v, ParameterizedType parameterizedType0) {
            return p0.e(v, parameterizedType0);
        }

        public static Class getRawType(Type type0) {
            return p0.f(type0);
        }

        @Nullable
        public Converter requestBodyConverter(Type type0, Annotation[] arr_annotation, Annotation[] arr_annotation1, Retrofit retrofit0) {
            return null;
        }

        @Nullable
        public Converter responseBodyConverter(Type type0, Annotation[] arr_annotation, Retrofit retrofit0) {
            return null;
        }

        @Nullable
        public Converter stringConverter(Type type0, Annotation[] arr_annotation, Retrofit retrofit0) {
            return null;
        }
    }

    @Nullable
    Object convert(Object arg1) throws IOException;
}

