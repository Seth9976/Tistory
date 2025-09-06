package retrofit2.converter.gson;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import retrofit2.Converter.Factory;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.p;

public final class GsonConverterFactory extends Factory {
    public final Gson a;

    public GsonConverterFactory(Gson gson0) {
        this.a = gson0;
    }

    public static GsonConverterFactory create() {
        return GsonConverterFactory.create(new Gson());
    }

    public static GsonConverterFactory create(Gson gson0) {
        if(gson0 == null) {
            throw new NullPointerException("gson == null");
        }
        return new GsonConverterFactory(gson0);
    }

    @Override  // retrofit2.Converter$Factory
    public Converter requestBodyConverter(Type type0, Annotation[] arr_annotation, Annotation[] arr_annotation1, Retrofit retrofit0) {
        TypeToken typeToken0 = TypeToken.get(type0);
        TypeAdapter typeAdapter0 = this.a.getAdapter(typeToken0);
        return new a(this.a, typeAdapter0);
    }

    @Override  // retrofit2.Converter$Factory
    public Converter responseBodyConverter(Type type0, Annotation[] arr_annotation, Retrofit retrofit0) {
        TypeToken typeToken0 = TypeToken.get(type0);
        TypeAdapter typeAdapter0 = this.a.getAdapter(typeToken0);
        return new p(this.a, typeAdapter0);
    }
}

