package retrofit2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

public final class c extends d {
    @Override  // retrofit2.d
    public final List a(Executor executor0) {
        return Arrays.asList(new Factory[]{new g(), new i(executor0)});  // 初始化器: Lretrofit2/CallAdapter$Factory;-><init>()V
    }

    @Override  // retrofit2.d
    public final List b() {
        return Collections.singletonList(new OptionalConverterFactory());  // 初始化器: Lretrofit2/Converter$Factory;-><init>()V
    }
}

