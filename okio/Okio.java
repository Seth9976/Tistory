package okio;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import md.b;
import okio.internal.ResourceFileSystem;
import okio.internal.ZipFilesKt;
import org.jetbrains.annotations.NotNull;
import vg.c;
import vg.f;
import vg.h;
import vg.i;

@Metadata(d1 = {"vg/g"}, d2 = {}, k = 4, mv = {1, 9, 0}, xi = 0x30)
public final class Okio {
    @NotNull
    public static final Sink appendingSink(@NotNull File file0) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(file0, "<this>");
        return Okio.sink(new FileOutputStream(file0, true));
    }

    @NotNull
    public static final FileSystem asResourceFileSystem(@NotNull ClassLoader classLoader0) {
        Intrinsics.checkNotNullParameter(classLoader0, "<this>");
        return new ResourceFileSystem(classLoader0, true, null, 4, null);
    }

    @JvmName(name = "blackhole")
    @NotNull
    public static final Sink blackhole() {
        return new c();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @NotNull
    public static final BufferedSink buffer(@NotNull Sink sink0) {
        Intrinsics.checkNotNullParameter(sink0, "<this>");
        return new RealBufferedSink(sink0);
    }

    @NotNull
    public static final BufferedSource buffer(@NotNull Source source0) {
        Intrinsics.checkNotNullParameter(source0, "<this>");
        return new RealBufferedSource(source0);
    }

    @NotNull
    public static final CipherSink cipherSink(@NotNull Sink sink0, @NotNull Cipher cipher0) {
        Intrinsics.checkNotNullParameter(sink0, "<this>");
        Intrinsics.checkNotNullParameter(cipher0, "cipher");
        return new CipherSink(Okio.buffer(sink0), cipher0);
    }

    @NotNull
    public static final CipherSource cipherSource(@NotNull Source source0, @NotNull Cipher cipher0) {
        Intrinsics.checkNotNullParameter(source0, "<this>");
        Intrinsics.checkNotNullParameter(cipher0, "cipher");
        return new CipherSource(Okio.buffer(source0), cipher0);
    }

    @NotNull
    public static final HashingSink hashingSink(@NotNull Sink sink0, @NotNull MessageDigest messageDigest0) {
        Intrinsics.checkNotNullParameter(sink0, "<this>");
        Intrinsics.checkNotNullParameter(messageDigest0, "digest");
        return new HashingSink(sink0, messageDigest0);
    }

    @NotNull
    public static final HashingSink hashingSink(@NotNull Sink sink0, @NotNull Mac mac0) {
        Intrinsics.checkNotNullParameter(sink0, "<this>");
        Intrinsics.checkNotNullParameter(mac0, "mac");
        return new HashingSink(sink0, mac0);
    }

    @NotNull
    public static final HashingSource hashingSource(@NotNull Source source0, @NotNull MessageDigest messageDigest0) {
        Intrinsics.checkNotNullParameter(source0, "<this>");
        Intrinsics.checkNotNullParameter(messageDigest0, "digest");
        return new HashingSource(source0, messageDigest0);
    }

    @NotNull
    public static final HashingSource hashingSource(@NotNull Source source0, @NotNull Mac mac0) {
        Intrinsics.checkNotNullParameter(source0, "<this>");
        Intrinsics.checkNotNullParameter(mac0, "mac");
        return new HashingSource(source0, mac0);
    }

    public static final boolean isAndroidGetsocknameError(@NotNull AssertionError assertionError0) {
        Intrinsics.checkNotNullParameter(assertionError0, "<this>");
        if(assertionError0.getCause() != null) {
            String s = assertionError0.getMessage();
            return s == null ? false : StringsKt__StringsKt.contains$default(s, "getsockname failed", false, 2, null);
        }
        return false;
    }

    @NotNull
    public static final FileSystem openZip(@NotNull FileSystem fileSystem0, @NotNull Path path0) throws IOException {
        Intrinsics.checkNotNullParameter(fileSystem0, "<this>");
        Intrinsics.checkNotNullParameter(path0, "zipPath");
        return ZipFilesKt.openZip$default(path0, fileSystem0, null, 4, null);
    }

    @JvmOverloads
    @NotNull
    public static final Sink sink(@NotNull File file0) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(file0, "<this>");
        return Okio.sink$default(file0, false, 1, null);
    }

    @JvmOverloads
    @NotNull
    public static final Sink sink(@NotNull File file0, boolean z) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(file0, "<this>");
        return Okio.sink(new FileOutputStream(file0, z));
    }

    @NotNull
    public static final Sink sink(@NotNull OutputStream outputStream0) {
        Intrinsics.checkNotNullParameter(outputStream0, "<this>");
        return new h(outputStream0, new Timeout());
    }

    @NotNull
    public static final Sink sink(@NotNull Socket socket0) throws IOException {
        Intrinsics.checkNotNullParameter(socket0, "<this>");
        i i0 = new i(socket0);
        OutputStream outputStream0 = socket0.getOutputStream();
        Intrinsics.checkNotNullExpressionValue(outputStream0, "getOutputStream(...)");
        return i0.sink(new h(outputStream0, i0));
    }

    @NotNull
    public static final Sink sink(@NotNull java.nio.file.Path path0, @NotNull OpenOption[] arr_openOption) throws IOException {
        Intrinsics.checkNotNullParameter(path0, "<this>");
        Intrinsics.checkNotNullParameter(arr_openOption, "options");
        OutputStream outputStream0 = Files.newOutputStream(path0, ((OpenOption[])Arrays.copyOf(arr_openOption, arr_openOption.length)));
        Intrinsics.checkNotNullExpressionValue(outputStream0, "newOutputStream(...)");
        return Okio.sink(outputStream0);
    }

    public static Sink sink$default(File file0, boolean z, int v, Object object0) throws FileNotFoundException {
        if((v & 1) != 0) {
            z = false;
        }
        return Okio.sink(file0, z);
    }

    @NotNull
    public static final Source source(@NotNull File file0) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(file0, "<this>");
        return new f(new FileInputStream(file0), Timeout.NONE);
    }

    @NotNull
    public static final Source source(@NotNull InputStream inputStream0) {
        Intrinsics.checkNotNullParameter(inputStream0, "<this>");
        return new f(inputStream0, new Timeout());
    }

    @NotNull
    public static final Source source(@NotNull Socket socket0) throws IOException {
        Intrinsics.checkNotNullParameter(socket0, "<this>");
        i i0 = new i(socket0);
        InputStream inputStream0 = socket0.getInputStream();
        Intrinsics.checkNotNullExpressionValue(inputStream0, "getInputStream(...)");
        return i0.source(new f(inputStream0, i0));
    }

    @NotNull
    public static final Source source(@NotNull java.nio.file.Path path0, @NotNull OpenOption[] arr_openOption) throws IOException {
        Intrinsics.checkNotNullParameter(path0, "<this>");
        Intrinsics.checkNotNullParameter(arr_openOption, "options");
        InputStream inputStream0 = Files.newInputStream(path0, ((OpenOption[])Arrays.copyOf(arr_openOption, arr_openOption.length)));
        Intrinsics.checkNotNullExpressionValue(inputStream0, "newInputStream(...)");
        return Okio.source(inputStream0);
    }

    public static final Object use(Closeable closeable0, @NotNull Function1 function10) {
        Object object0;
        Intrinsics.checkNotNullParameter(function10, "block");
        Throwable throwable0 = null;
        try {
            object0 = function10.invoke(closeable0);
        }
        catch(Throwable throwable1) {
            if(closeable0 != null) {
                try {
                    closeable0.close();
                }
                catch(Throwable throwable2) {
                    b.addSuppressed(throwable1, throwable2);
                }
            }
            throwable0 = throwable1;
            object0 = null;
            goto label_17;
        }
        if(closeable0 != null) {
            try {
                closeable0.close();
            }
            catch(Throwable throwable0) {
            }
        }
    label_17:
        if(throwable0 != null) {
            throw throwable0;
        }
        Intrinsics.checkNotNull(object0);
        return object0;
    }
}

