package retrofit2;

import android.annotation.TargetApi;
import androidx.appcompat.view.menu.f;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

@TargetApi(24)
@IgnoreJRERequirement
public final class OptionalConverterFactory extends Factory {
    public static OptionalConverterFactory create() {
        return new OptionalConverterFactory();  // 初始化器: Lretrofit2/Converter$Factory;-><init>()V
    }

    @Override  // retrofit2.Converter$Factory
    @Nullable
    public Converter responseBodyConverter(Type type0, Annotation[] arr_annotation, Retrofit retrofit0) {
        return Factory.getRawType(type0) != Optional.class ? null : new f(retrofit0.responseBodyConverter(Factory.getParameterUpperBound(0, ((ParameterizedType)type0)), arr_annotation), 28);
    }
}

