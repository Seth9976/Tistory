package yd;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileVisitOption;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.Arrays;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.PublishedApi;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.f0;
import kotlin.internal.InlineOnly;
import kotlin.io.CloseableKt;
import kotlin.io.path.ExperimentalPathApi;
import kotlin.io.path.FileVisitorBuilderImpl;
import kotlin.io.path.PathTreeWalk;
import kotlin.io.path.PathWalkOption;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class o extends n {
    @SinceKotlin(version = "1.9")
    @NotNull
    public static final Path createParentDirectories(@NotNull Path path0, @NotNull FileAttribute[] arr_fileAttribute) throws IOException {
        Intrinsics.checkNotNullParameter(path0, "<this>");
        Intrinsics.checkNotNullParameter(arr_fileAttribute, "attributes");
        Path path1 = path0.getParent();
        if(path1 != null && !Files.isDirectory(path1, ((LinkOption[])Arrays.copyOf(new LinkOption[0], 0)))) {
            try {
                FileAttribute[] arr_fileAttribute1 = (FileAttribute[])Arrays.copyOf(arr_fileAttribute, arr_fileAttribute.length);
                Intrinsics.checkNotNullExpressionValue(Files.createDirectories(path1, ((FileAttribute[])Arrays.copyOf(arr_fileAttribute1, arr_fileAttribute1.length))), "createDirectories(...)");
                return path0;
            }
            catch(FileAlreadyExistsException fileAlreadyExistsException0) {
                if(!Files.isDirectory(path1, ((LinkOption[])Arrays.copyOf(new LinkOption[0], 0)))) {
                    throw fileAlreadyExistsException0;
                }
            }
        }
        return path0;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @NotNull
    public static final Path createTempDirectory(@Nullable Path path0, @Nullable String s, @NotNull FileAttribute[] arr_fileAttribute) throws IOException {
        Path path1;
        Intrinsics.checkNotNullParameter(arr_fileAttribute, "attributes");
        if(path0 != null) {
            path1 = Files.createTempDirectory(path0, s, ((FileAttribute[])Arrays.copyOf(arr_fileAttribute, arr_fileAttribute.length)));
            Intrinsics.checkNotNullExpressionValue(path1, "createTempDirectory(...)");
            return path1;
        }
        path1 = Files.createTempDirectory(s, ((FileAttribute[])Arrays.copyOf(arr_fileAttribute, arr_fileAttribute.length)));
        Intrinsics.checkNotNullExpressionValue(path1, "createTempDirectory(...)");
        return path1;
    }

    public static Path createTempDirectory$default(Path path0, String s, FileAttribute[] arr_fileAttribute, int v, Object object0) throws IOException {
        if((v & 2) != 0) {
            s = null;
        }
        return o.createTempDirectory(path0, s, arr_fileAttribute);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @NotNull
    public static final Path createTempFile(@Nullable Path path0, @Nullable String s, @Nullable String s1, @NotNull FileAttribute[] arr_fileAttribute) throws IOException {
        Path path1;
        Intrinsics.checkNotNullParameter(arr_fileAttribute, "attributes");
        if(path0 != null) {
            path1 = Files.createTempFile(path0, s, s1, ((FileAttribute[])Arrays.copyOf(arr_fileAttribute, arr_fileAttribute.length)));
            Intrinsics.checkNotNullExpressionValue(path1, "createTempFile(...)");
            return path1;
        }
        path1 = Files.createTempFile(s, s1, ((FileAttribute[])Arrays.copyOf(arr_fileAttribute, arr_fileAttribute.length)));
        Intrinsics.checkNotNullExpressionValue(path1, "createTempFile(...)");
        return path1;
    }

    public static Path createTempFile$default(Path path0, String s, String s1, FileAttribute[] arr_fileAttribute, int v, Object object0) throws IOException {
        if((v & 2) != 0) {
            s = null;
        }
        if((v & 4) != 0) {
            s1 = null;
        }
        return o.createTempFile(path0, s, s1, arr_fileAttribute);
    }

    @PublishedApi
    @NotNull
    public static final Void fileAttributeViewNotAvailable(@NotNull Path path0, @NotNull Class class0) {
        Intrinsics.checkNotNullParameter(path0, "path");
        Intrinsics.checkNotNullParameter(class0, "attributeViewClass");
        throw new UnsupportedOperationException("The desired attribute view type " + class0 + " is not available for the file " + path0 + '.');
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalPathApi
    @NotNull
    public static final FileVisitor fileVisitor(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "builderAction");
        FileVisitorBuilderImpl fileVisitorBuilderImpl0 = new FileVisitorBuilderImpl();
        function10.invoke(fileVisitorBuilderImpl0);
        return fileVisitorBuilderImpl0.build();
    }

    @NotNull
    public static final String getExtension(@NotNull Path path0) {
        Intrinsics.checkNotNullParameter(path0, "<this>");
        Path path1 = path0.getFileName();
        if(path1 != null) {
            String s = path1.toString();
            if(s != null) {
                String s1 = StringsKt__StringsKt.substringAfterLast(s, '.', "");
                return s1 == null ? "" : s1;
            }
        }
        return "";
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    public static void getExtension$annotations(Path path0) {
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Use invariantSeparatorsPathString property instead.", replaceWith = @ReplaceWith(expression = "invariantSeparatorsPathString", imports = {}))
    @SinceKotlin(version = "1.4")
    @InlineOnly
    @ExperimentalPathApi
    public static void getInvariantSeparatorsPath$annotations(Path path0) {
    }

    @NotNull
    public static final String getInvariantSeparatorsPathString(@NotNull Path path0) {
        Intrinsics.checkNotNullParameter(path0, "<this>");
        String s = path0.getFileSystem().getSeparator();
        if(!Intrinsics.areEqual(s, "/")) {
            Intrinsics.checkNotNull(s);
            return p.replace$default(path0.toString(), s, "/", false, 4, null);
        }
        return path0.toString();
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    public static void getInvariantSeparatorsPathString$annotations(Path path0) {
    }

    @NotNull
    public static final String getName(@NotNull Path path0) {
        Intrinsics.checkNotNullParameter(path0, "<this>");
        Path path1 = path0.getFileName();
        String s = path1 == null ? null : path1.toString();
        return s == null ? "" : s;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    public static void getName$annotations(Path path0) {
    }

    @NotNull
    public static final String getNameWithoutExtension(@NotNull Path path0) {
        Intrinsics.checkNotNullParameter(path0, "<this>");
        Path path1 = path0.getFileName();
        if(path1 != null) {
            String s = path1.toString();
            if(s != null) {
                String s1 = StringsKt__StringsKt.substringBeforeLast$default(s, ".", null, 2, null);
                return s1 == null ? "" : s1;
            }
        }
        return "";
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    public static void getNameWithoutExtension$annotations(Path path0) {
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    public static void getPathString$annotations(Path path0) {
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @NotNull
    public static final List listDirectoryEntries(@NotNull Path path0, @NotNull String s) throws IOException {
        List list0;
        Intrinsics.checkNotNullParameter(path0, "<this>");
        Intrinsics.checkNotNullParameter(s, "glob");
        DirectoryStream directoryStream0 = Files.newDirectoryStream(path0, s);
        try {
            Intrinsics.checkNotNull(directoryStream0);
            list0 = CollectionsKt___CollectionsKt.toList(directoryStream0);
        }
        catch(Throwable throwable0) {
            CloseableKt.closeFinally(directoryStream0, throwable0);
            throw throwable0;
        }
        CloseableKt.closeFinally(directoryStream0, null);
        return list0;
    }

    public static List listDirectoryEntries$default(Path path0, String s, int v, Object object0) throws IOException {
        if((v & 1) != 0) {
            s = "*";
        }
        return o.listDirectoryEntries(path0, s);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @NotNull
    public static final Path relativeTo(@NotNull Path path0, @NotNull Path path1) {
        Intrinsics.checkNotNullParameter(path0, "<this>");
        Intrinsics.checkNotNullParameter(path1, "base");
        try {
            return e.a(path0, path1);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            throw new IllegalArgumentException(illegalArgumentException0.getMessage() + "\nthis path: " + path0 + "\nbase path: " + path1, illegalArgumentException0);
        }
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @Nullable
    public static final Path relativeToOrNull(@NotNull Path path0, @NotNull Path path1) {
        Intrinsics.checkNotNullParameter(path0, "<this>");
        Intrinsics.checkNotNullParameter(path1, "base");
        try {
            return e.a(path0, path1);
        }
        catch(IllegalArgumentException unused_ex) {
            return null;
        }
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @NotNull
    public static final Path relativeToOrSelf(@NotNull Path path0, @NotNull Path path1) {
        Intrinsics.checkNotNullParameter(path0, "<this>");
        Intrinsics.checkNotNullParameter(path1, "base");
        Path path2 = o.relativeToOrNull(path0, path1);
        return path2 == null ? path0 : path2;
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalPathApi
    public static final void visitFileTree(@NotNull Path path0, int v, boolean z, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(path0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "builderAction");
        o.visitFileTree(path0, o.fileVisitor(function10), v, z);
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalPathApi
    public static final void visitFileTree(@NotNull Path path0, @NotNull FileVisitor fileVisitor0, int v, boolean z) {
        Intrinsics.checkNotNullParameter(path0, "<this>");
        Intrinsics.checkNotNullParameter(fileVisitor0, "visitor");
        Files.walkFileTree(path0, (z ? e0.setOf(FileVisitOption.FOLLOW_LINKS) : f0.emptySet()), v, fileVisitor0);
    }

    public static void visitFileTree$default(Path path0, int v, boolean z, Function1 function10, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = 0x7FFFFFFF;
        }
        if((v1 & 2) != 0) {
            z = false;
        }
        o.visitFileTree(path0, v, z, function10);
    }

    public static void visitFileTree$default(Path path0, FileVisitor fileVisitor0, int v, boolean z, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = 0x7FFFFFFF;
        }
        if((v1 & 4) != 0) {
            z = false;
        }
        o.visitFileTree(path0, fileVisitor0, v, z);
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalPathApi
    @NotNull
    public static final Sequence walk(@NotNull Path path0, @NotNull PathWalkOption[] arr_pathWalkOption) {
        Intrinsics.checkNotNullParameter(path0, "<this>");
        Intrinsics.checkNotNullParameter(arr_pathWalkOption, "options");
        return new PathTreeWalk(path0, arr_pathWalkOption);
    }
}

