package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nBuiltInsResourceLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuiltInsResourceLoader.kt\norg/jetbrains/kotlin/serialization/deserialization/builtins/BuiltInsResourceLoader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,21:1\n1#2:22\n*E\n"})
public final class BuiltInsResourceLoader {
    @Nullable
    public final InputStream loadResource(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "path");
        ClassLoader classLoader0 = BuiltInsResourceLoader.class.getClassLoader();
        if(classLoader0 == null) {
            return ClassLoader.getSystemResourceAsStream(s);
        }
        URL uRL0 = classLoader0.getResource(s);
        if(uRL0 == null) {
            return null;
        }
        URLConnection uRLConnection0 = uRL0.openConnection();
        uRLConnection0.setUseCaches(false);
        return uRLConnection0.getInputStream();
    }
}

