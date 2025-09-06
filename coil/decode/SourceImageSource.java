package coil.decode;

import coil.util.-Utils;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import md.b;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.FileSystem;
import okio.Okio;
import okio.Path.Companion;
import okio.Path;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001A\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000F\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u000BJ\u000F\u0010\f\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\u000BJ\u000F\u0010\u000E\u001A\u00020\rH\u0016¢\u0006\u0004\b\u000E\u0010\u000FJ\u0011\u0010\u0010\u001A\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000FJ\u000F\u0010\u0012\u001A\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001C\u0010\b\u001A\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001B\u001A\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0019\u0010\u001A¨\u0006\u001C"}, d2 = {"Lcoil/decode/SourceImageSource;", "Lcoil/decode/ImageSource;", "Lokio/BufferedSource;", "source", "Lkotlin/Function0;", "Ljava/io/File;", "cacheDirectoryFactory", "Lcoil/decode/ImageSource$Metadata;", "metadata", "<init>", "(Lokio/BufferedSource;Lkotlin/jvm/functions/Function0;Lcoil/decode/ImageSource$Metadata;)V", "()Lokio/BufferedSource;", "sourceOrNull", "Lokio/Path;", "file", "()Lokio/Path;", "fileOrNull", "", "close", "()V", "a", "Lcoil/decode/ImageSource$Metadata;", "getMetadata", "()Lcoil/decode/ImageSource$Metadata;", "Lokio/FileSystem;", "getFileSystem", "()Lokio/FileSystem;", "fileSystem", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nImageSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageSource.kt\ncoil/decode/SourceImageSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 FileSystem.kt\nokio/FileSystem\n+ 4 Okio.kt\nokio/Okio__OkioKt\n*L\n1#1,310:1\n1#2:311\n80#3:312\n165#3:313\n81#3:314\n82#3:320\n52#4,5:315\n60#4,10:321\n57#4,16:331\n*S KotlinDebug\n*F\n+ 1 ImageSource.kt\ncoil/decode/SourceImageSource\n*L\n276#1:312\n276#1:313\n276#1:314\n276#1:320\n276#1:315,5\n276#1:321,10\n276#1:331,16\n*E\n"})
public final class SourceImageSource extends ImageSource {
    public final coil.decode.ImageSource.Metadata a;
    public boolean b;
    public BufferedSource c;
    public Function0 d;
    public Path e;

    public SourceImageSource(@NotNull BufferedSource bufferedSource0, @NotNull Function0 function00, @Nullable coil.decode.ImageSource.Metadata imageSource$Metadata0) {
        super(null);
        this.a = imageSource$Metadata0;
        this.c = bufferedSource0;
        this.d = function00;
    }

    @Override
    public void close() {
        synchronized(this) {
            this.b = true;
            BufferedSource bufferedSource0 = this.c;
            if(bufferedSource0 != null) {
                -Utils.closeQuietly(bufferedSource0);
            }
            Path path0 = this.e;
            if(path0 != null) {
                this.getFileSystem().delete(path0);
            }
        }
    }

    @Override  // coil.decode.ImageSource
    @NotNull
    public Path file() {
        Throwable throwable2;
        Long long0;
        synchronized(this) {
            if(!this.b) {
                Path path0 = this.e;
                if(path0 != null) {
                    return path0;
                }
                Function0 function00 = this.d;
                Intrinsics.checkNotNull(function00);
                File file0 = (File)function00.invoke();
                if(!file0.isDirectory()) {
                    throw new IllegalStateException("cacheDirectory must be a directory.");
                }
                File file1 = File.createTempFile("tmp", null, file0);
                Path path1 = Companion.get$default(Path.Companion, file1, false, 1, null);
                BufferedSink bufferedSink0 = Okio.buffer(this.getFileSystem().sink(path1, false));
                try {
                    BufferedSource bufferedSource0 = this.c;
                    Intrinsics.checkNotNull(bufferedSource0);
                    long0 = bufferedSink0.writeAll(bufferedSource0);
                }
                catch(Throwable throwable0) {
                    if(bufferedSink0 != null) {
                        try {
                            bufferedSink0.close();
                        }
                        catch(Throwable throwable1) {
                            b.addSuppressed(throwable0, throwable1);
                        }
                    }
                    throwable2 = throwable0;
                    long0 = null;
                    goto label_33;
                }
                try {
                    bufferedSink0.close();
                    throwable2 = null;
                }
                catch(Throwable throwable2) {
                }
            label_33:
                if(throwable2 != null) {
                    throw throwable2;
                }
                Intrinsics.checkNotNull(long0);
                this.c = null;
                this.e = path1;
                this.d = null;
                return path1;
            }
        }
        throw new IllegalStateException("closed");
    }

    @Override  // coil.decode.ImageSource
    @Nullable
    public Path fileOrNull() {
        synchronized(this) {
            if(!this.b) {
                return this.e;
            }
        }
        throw new IllegalStateException("closed");
    }

    @Override  // coil.decode.ImageSource
    @NotNull
    public FileSystem getFileSystem() {
        return FileSystem.SYSTEM;
    }

    @Override  // coil.decode.ImageSource
    @Nullable
    public coil.decode.ImageSource.Metadata getMetadata() {
        return this.a;
    }

    @Override  // coil.decode.ImageSource
    @NotNull
    public BufferedSource source() {
        synchronized(this) {
            if(!this.b) {
                BufferedSource bufferedSource0 = this.c;
                if(bufferedSource0 != null) {
                    return bufferedSource0;
                }
                Path path0 = this.e;
                Intrinsics.checkNotNull(path0);
                BufferedSource bufferedSource1 = Okio.buffer(this.getFileSystem().source(path0));
                this.c = bufferedSource1;
                return bufferedSource1;
            }
        }
        throw new IllegalStateException("closed");
    }

    @Override  // coil.decode.ImageSource
    @NotNull
    public BufferedSource sourceOrNull() {
        return this.source();
    }
}

