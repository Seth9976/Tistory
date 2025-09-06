package retrofit2;

import com.google.gson.internal.f;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;

public final class g extends Factory {
    @Override  // retrofit2.CallAdapter$Factory
    public final CallAdapter get(Type type0, Annotation[] arr_annotation, Retrofit retrofit0) {
        if(Factory.getRawType(type0) != CompletableFuture.class) {
            return null;
        }
        if(!(type0 instanceof ParameterizedType)) {
            throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        }
        Type type1 = Factory.getParameterUpperBound(0, ((ParameterizedType)type0));
        if(Factory.getRawType(type1) != Response.class) {
            return new f(2, type1);
        }
        if(!(type1 instanceof ParameterizedType)) {
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        return new f(3, Factory.getParameterUpperBound(0, ((ParameterizedType)type1)));
    }
}

