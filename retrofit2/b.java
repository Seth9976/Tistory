package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.http.Streaming;

public final class b extends Factory {
    @Override  // retrofit2.Converter$Factory
    public final Converter requestBodyConverter(Type type0, Annotation[] arr_annotation, Annotation[] arr_annotation1, Retrofit retrofit0) {
        Class class0 = p0.f(type0);
        return RequestBody.class.isAssignableFrom(class0) ? a.c : null;
    }

    @Override  // retrofit2.Converter$Factory
    public final Converter responseBodyConverter(Type type0, Annotation[] arr_annotation, Retrofit retrofit0) {
        if(type0 == ResponseBody.class) {
            return p0.j(arr_annotation, Streaming.class) ? a.d : a.b;
        }
        if(type0 == Void.class) {
            return a.g;
        }
        return p0.k(type0) ? a.f : null;
    }
}

