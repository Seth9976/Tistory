package retrofit2;

import a7.b;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;

public final class i extends Factory {
    public final Executor a;

    public i(Executor executor0) {
        this.a = executor0;
    }

    @Override  // retrofit2.CallAdapter$Factory
    public final CallAdapter get(Type type0, Annotation[] arr_annotation, Retrofit retrofit0) {
        Executor executor0 = null;
        if(Factory.getRawType(type0) != Call.class) {
            return null;
        }
        if(!(type0 instanceof ParameterizedType)) {
            throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
        }
        Type type1 = p0.e(0, ((ParameterizedType)type0));
        if(!p0.j(arr_annotation, SkipCallbackExecutor.class)) {
            executor0 = this.a;
        }
        return new b(28, type1, executor0);
    }
}

