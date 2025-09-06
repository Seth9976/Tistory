package yd;

import androidx.compose.material3.g1;
import d6.c;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystemException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.SecureDirectoryStream;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.SinceKotlin;
import kotlin.io.CloseableKt;
import kotlin.io.path.CopyActionResult;
import kotlin.io.path.ExperimentalPathApi;
import kotlin.io.path.LinkFollowing;
import kotlin.io.path.OnErrorResult;
import kotlin.io.path.PathsKt__PathRecursiveFunctionsKt.WhenMappings;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import md.b;
import org.jetbrains.annotations.NotNull;

public abstract class n extends h {
    public static final FileVisitResult a(Function3 function30, Path path0, Path path1, Path path2, Exception exception0) {
        Path path3 = path1.resolve(o.relativeTo(path2, path0).toString());
        Intrinsics.checkNotNullExpressionValue(path3, "resolve(...)");
        switch(PathsKt__PathRecursiveFunctionsKt.WhenMappings.$EnumSwitchMapping$1[((OnErrorResult)function30.invoke(path2, path3, exception0)).ordinal()]) {
            case 1: {
                return FileVisitResult.TERMINATE;
            }
            case 2: {
                return FileVisitResult.SKIP_SUBTREE;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public static final FileVisitResult access$copyToRecursively$copy(Function3 function30, Path path0, Path path1, Function3 function31, Path path2, BasicFileAttributes basicFileAttributes0) {
        try {
            Path path3 = path1.resolve(o.relativeTo(path2, path0).toString());
            Intrinsics.checkNotNullExpressionValue(path3, "resolve(...)");
            switch(PathsKt__PathRecursiveFunctionsKt.WhenMappings.$EnumSwitchMapping$0[((CopyActionResult)function30.invoke(a.a, path2, path3)).ordinal()]) {
                case 1: {
                    return FileVisitResult.CONTINUE;
                }
                case 2: {
                    return FileVisitResult.TERMINATE;
                }
                case 3: {
                    return FileVisitResult.SKIP_SUBTREE;
                }
                default: {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        catch(Exception exception0) {
            return n.a(function31, path0, path1, path2, exception0);
        }
    }

    public static final void b(SecureDirectoryStream secureDirectoryStream0, Path path0, c c0) {
        SecureDirectoryStream secureDirectoryStream1;
        try {
            try {
                secureDirectoryStream1 = null;
                secureDirectoryStream1 = secureDirectoryStream0.newDirectoryStream(path0, new LinkOption[]{LinkOption.NOFOLLOW_LINKS});
            }
            catch(NoSuchFileException unused_ex) {
            }
            if(secureDirectoryStream1 != null) {
                try {
                    for(Object object0: secureDirectoryStream1) {
                        Path path1 = ((Path)object0).getFileName();
                        Intrinsics.checkNotNullExpressionValue(path1, "getFileName(...)");
                        n.c(secureDirectoryStream1, path1, c0);
                    }
                }
                catch(Throwable throwable0) {
                    CloseableKt.closeFinally(secureDirectoryStream1, throwable0);
                    throw throwable0;
                }
                CloseableKt.closeFinally(secureDirectoryStream1, null);
            }
        }
        catch(Exception exception0) {
            c0.a(exception0);
        }
    }

    public static final void c(SecureDirectoryStream secureDirectoryStream0, Path path0, c c0) {
        Intrinsics.checkNotNullParameter(path0, "name");
        Path path1 = (Path)c0.d;
        Path path2 = null;
        Path path3 = path1 == null ? null : path1.resolve(path0);
        try {
            try {
                c0.d = path3;
                LinkOption[] arr_linkOption = (LinkOption[])Arrays.copyOf(new LinkOption[]{LinkOption.NOFOLLOW_LINKS}, 1);
                Boolean boolean0 = null;
                boolean0 = Boolean.valueOf(((BasicFileAttributeView)secureDirectoryStream0.getFileAttributeView(path0, BasicFileAttributeView.class, arr_linkOption)).readAttributes().isDirectory());
            }
            catch(NoSuchFileException unused_ex) {
            }
            if((boolean0 == null ? false : boolean0.booleanValue())) {
                int v = c0.b;
                n.b(secureDirectoryStream0, path0, c0);
                if(v == c0.b) {
                    try {
                        secureDirectoryStream0.deleteDirectory(path0);
                        goto label_18;
                    label_14:
                        secureDirectoryStream0.deleteFile(path0);
                    }
                    catch(NoSuchFileException unused_ex) {
                    }
                }
            }
            else {
                goto label_14;
            }
        }
        catch(Exception exception0) {
            c0.a(exception0);
        }
    label_18:
        Intrinsics.checkNotNullParameter(path0, "name");
        Path path4 = (Path)c0.d;
        if(!Intrinsics.areEqual(path0, (path4 == null ? null : path4.getFileName()))) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        Path path5 = (Path)c0.d;
        if(path5 != null) {
            path2 = path5.getParent();
        }
        c0.d = path2;
    }

    @SinceKotlin(version = "1.8")
    @ExperimentalPathApi
    @NotNull
    public static final Path copyToRecursively(@NotNull Path path0, @NotNull Path path1, @NotNull Function3 function30, boolean z, @NotNull Function3 function31) {
        boolean z1 = false;
        Intrinsics.checkNotNullParameter(path0, "<this>");
        Intrinsics.checkNotNullParameter(path1, "target");
        Intrinsics.checkNotNullParameter(function30, "onError");
        Intrinsics.checkNotNullParameter(function31, "copyAction");
        LinkOption[] arr_linkOption = LinkFollowing.INSTANCE.toLinkOptions(z);
        LinkOption[] arr_linkOption1 = (LinkOption[])Arrays.copyOf(arr_linkOption, arr_linkOption.length);
        if(!Files.exists(path0, ((LinkOption[])Arrays.copyOf(arr_linkOption1, arr_linkOption1.length)))) {
            throw new NoSuchFileException(path0.toString(), path1.toString(), "The source file doesn\'t exist.");
        }
        if(Files.exists(path0, ((LinkOption[])Arrays.copyOf(new LinkOption[0], 0))) && (z || !Files.isSymbolicLink(path0))) {
            boolean z2 = Files.exists(path1, ((LinkOption[])Arrays.copyOf(new LinkOption[0], 0))) && !Files.isSymbolicLink(path1);
            if(!z2 || !Files.isSameFile(path0, path1)) {
                if(Intrinsics.areEqual(path0.getFileSystem(), path1.getFileSystem())) {
                    if(z2) {
                        z1 = path1.toRealPath(new LinkOption[0]).startsWith(path0.toRealPath(new LinkOption[0]));
                    }
                    else {
                        Path path2 = path1.getParent();
                        if(path2 != null && Files.exists(path2, ((LinkOption[])Arrays.copyOf(new LinkOption[0], 0))) && path2.toRealPath(new LinkOption[0]).startsWith(path0.toRealPath(new LinkOption[0]))) {
                            z1 = true;
                        }
                    }
                }
                if(z1) {
                    throw new FileSystemException(path0.toString(), path1.toString(), "Recursively copying a directory into its subdirectory is prohibited.");
                }
            }
        }
        o.visitFileTree$default(path0, 0, z, new g1(6, function31, path0, path1, function30), 1, null);
        return path1;
    }

    @SinceKotlin(version = "1.8")
    @ExperimentalPathApi
    @NotNull
    public static final Path copyToRecursively(@NotNull Path path0, @NotNull Path path1, @NotNull Function3 function30, boolean z, boolean z1) {
        Intrinsics.checkNotNullParameter(path0, "<this>");
        Intrinsics.checkNotNullParameter(path1, "target");
        Intrinsics.checkNotNullParameter(function30, "onError");
        return z1 ? n.copyToRecursively(path0, path1, function30, z, new j(z, 0)) : n.copyToRecursively$default(path0, path1, function30, z, null, 8, null);
    }

    public static Path copyToRecursively$default(Path path0, Path path1, Function3 function30, boolean z, Function3 function31, int v, Object object0) {
        if((v & 2) != 0) {
            function30 = i.y;
        }
        if((v & 8) != 0) {
            function31 = new j(z, 1);
        }
        return n.copyToRecursively(path0, path1, function30, z, function31);
    }

    public static Path copyToRecursively$default(Path path0, Path path1, Function3 function30, boolean z, boolean z1, int v, Object object0) {
        if((v & 2) != 0) {
            function30 = i.x;
        }
        return n.copyToRecursively(path0, path1, function30, z, z1);
    }

    public static final void d(Path path0, c c0) {
        DirectoryStream directoryStream0;
        try {
            if(!Files.isDirectory(path0, ((LinkOption[])Arrays.copyOf(new LinkOption[]{LinkOption.NOFOLLOW_LINKS}, 1)))) {
                Files.deleteIfExists(path0);
                return;
            }
            int v = c0.b;
        }
        catch(Exception exception0) {
            c0.a(exception0);
            return;
        }
        try {
            directoryStream0 = null;
            directoryStream0 = Files.newDirectoryStream(path0);
            goto label_6;
        }
        catch(NoSuchFileException unused_ex) {
        label_6:
            if(directoryStream0 != null) {
                try {
                    Iterator iterator0 = directoryStream0.iterator();
                    while(true) {
                        if(!iterator0.hasNext()) {
                            goto label_16;
                        }
                        Object object0 = iterator0.next();
                        Intrinsics.checkNotNull(((Path)object0));
                        n.d(((Path)object0), c0);
                    }
                }
                catch(Throwable throwable0) {
                    try {
                        CloseableKt.closeFinally(directoryStream0, throwable0);
                        throw throwable0;
                    label_16:
                        CloseableKt.closeFinally(directoryStream0, null);
                        goto label_20;
                    }
                    catch(Exception exception1) {
                    }
                    goto label_19;
                }
            }
            goto label_20;
        }
        catch(Exception exception1) {
            try {
            label_19:
                c0.a(exception1);
            label_20:
                if(v == c0.b) {
                    Files.deleteIfExists(path0);
                    return;
                }
                return;
            }
            catch(Exception exception0) {
            }
        }
        c0.a(exception0);
    }

    @SinceKotlin(version = "1.8")
    @ExperimentalPathApi
    public static final void deleteRecursively(@NotNull Path path0) {
        DirectoryStream directoryStream0;
        Intrinsics.checkNotNullParameter(path0, "<this>");
        c c0 = new c();
        Path path1 = path0.getParent();
        boolean z = true;
        if(path1 != null) {
            try {
                directoryStream0 = null;
                directoryStream0 = Files.newDirectoryStream(path1);
            }
            catch(Throwable unused_ex) {
            }
            if(directoryStream0 != null) {
                if(directoryStream0 instanceof SecureDirectoryStream) {
                    try {
                        c0.d = path1;
                        Path path2 = path0.getFileName();
                        Intrinsics.checkNotNullExpressionValue(path2, "getFileName(...)");
                        n.c(((SecureDirectoryStream)directoryStream0), path2, c0);
                        z = false;
                    }
                    catch(Throwable throwable0) {
                        CloseableKt.closeFinally(directoryStream0, throwable0);
                        throw throwable0;
                    }
                }
                CloseableKt.closeFinally(directoryStream0, null);
            }
        }
        if(z) {
            n.d(path0, c0);
        }
        ArrayList arrayList0 = c0.c;
        if(!arrayList0.isEmpty()) {
            FileSystemException fileSystemException0 = new FileSystemException("Failed to delete one or more files. See suppressed exceptions for details.");
            for(Object object0: arrayList0) {
                b.addSuppressed(fileSystemException0, ((Exception)object0));
            }
            throw fileSystemException0;
        }
    }
}

