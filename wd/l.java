package wd;

import androidx.compose.material3.ni;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.io.FileAlreadyExistsException;
import kotlin.io.FilePathComponents;
import kotlin.io.FileSystemException;
import kotlin.io.NoSuchFileException;
import kotlin.io.OnErrorAction;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class l extends j {
    public static final ArrayList b(List list0) {
        ArrayList arrayList0 = new ArrayList(list0.size());
        for(Object object0: list0) {
            File file0 = (File)object0;
            String s = file0.getName();
            if(Intrinsics.areEqual(s, ".")) {
            }
            else if(!Intrinsics.areEqual(s, "..")) {
                arrayList0.add(file0);
            }
            else if(arrayList0.isEmpty() || Intrinsics.areEqual(((File)CollectionsKt___CollectionsKt.last(arrayList0)).getName(), "..")) {
                arrayList0.add(file0);
            }
            else {
                arrayList0.remove(arrayList0.size() - 1);
            }
        }
        return arrayList0;
    }

    public static final String c(File file0, File file1) {
        FilePathComponents filePathComponents0 = h.toComponents(file0);
        FilePathComponents filePathComponents1 = new FilePathComponents(filePathComponents0.getRoot(), l.b(filePathComponents0.getSegments()));
        FilePathComponents filePathComponents2 = h.toComponents(file1);
        FilePathComponents filePathComponents3 = new FilePathComponents(filePathComponents2.getRoot(), l.b(filePathComponents2.getSegments()));
        if(!Intrinsics.areEqual(filePathComponents1.getRoot(), filePathComponents3.getRoot())) {
            return null;
        }
        int v = filePathComponents3.getSize();
        int v1 = filePathComponents1.getSize();
        int v2 = Math.min(v1, v);
        int v3;
        for(v3 = 0; v3 < v2 && Intrinsics.areEqual(filePathComponents1.getSegments().get(v3), filePathComponents3.getSegments().get(v3)); ++v3) {
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        int v4 = v - 1;
        if(v3 <= v4) {
            while(true) {
                if(Intrinsics.areEqual(((File)filePathComponents3.getSegments().get(v4)).getName(), "..")) {
                    return null;
                }
                stringBuilder0.append("..");
                if(v4 != v3) {
                    stringBuilder0.append(File.separatorChar);
                }
                if(v4 == v3) {
                    break;
                }
                --v4;
            }
        }
        if(v3 < v1) {
            if(v3 < v) {
                stringBuilder0.append(File.separatorChar);
            }
            List list0 = CollectionsKt___CollectionsKt.drop(filePathComponents1.getSegments(), v3);
            Intrinsics.checkNotNullExpressionValue("/", "separator");
            CollectionsKt___CollectionsKt.joinTo$default(list0, stringBuilder0, "/", null, null, 0, null, null, 0x7C, null);
        }
        return stringBuilder0.toString();
    }

    public static final boolean copyRecursively(@NotNull File file0, @NotNull File file1, boolean z, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(file0, "<this>");
        Intrinsics.checkNotNullParameter(file1, "target");
        Intrinsics.checkNotNullParameter(function20, "onError");
        if(!file0.exists()) {
            return function20.invoke(file0, new NoSuchFileException(file0, null, "The source file doesn\'t exist.", 2, null)) != OnErrorAction.TERMINATE;
        }
        try {
            Iterator iterator0 = j.walkTopDown(file0).onFail(new ni(function20, 13)).iterator();
            while(true) {
                if(!iterator0.hasNext()) {
                    return true;
                }
                Object object0 = iterator0.next();
                File file2 = (File)object0;
                if(!file2.exists()) {
                    if(function20.invoke(file2, new NoSuchFileException(file2, null, "The source file doesn\'t exist.", 2, null)) != OnErrorAction.TERMINATE) {
                        continue;
                    }
                    return false;
                }
                File file3 = new File(file1, l.toRelativeString(file2, file0));
                if(file3.exists() && (!file2.isDirectory() || !file3.isDirectory()) && (!z || !l.deleteRecursively(file3) || !file3.isDirectory() && !file3.delete())) {
                    if(function20.invoke(file3, new FileAlreadyExistsException(file2, file3, "The destination file already exists.")) != OnErrorAction.TERMINATE) {
                        continue;
                    }
                    return false;
                }
                if(file2.isDirectory()) {
                    file3.mkdirs();
                }
                else if(l.copyTo$default(file2, file3, z, 0, 4, null).length() != file2.length() && function20.invoke(file2, new IOException("Source file wasn\'t copied completely, length of destination file differs.")) == OnErrorAction.TERMINATE) {
                    break;
                }
            }
        }
        catch(n unused_ex) {
        }
        return false;
    }

    public static boolean copyRecursively$default(File file0, File file1, boolean z, Function2 function20, int v, Object object0) {
        if((v & 2) != 0) {
            z = false;
        }
        if((v & 4) != 0) {
            function20 = k.w;
        }
        return l.copyRecursively(file0, file1, z, function20);
    }

    @NotNull
    public static final File copyTo(@NotNull File file0, @NotNull File file1, boolean z, int v) {
        Intrinsics.checkNotNullParameter(file0, "<this>");
        Intrinsics.checkNotNullParameter(file1, "target");
        if(!file0.exists()) {
            throw new NoSuchFileException(file0, null, "The source file doesn\'t exist.", 2, null);
        }
        if(file1.exists()) {
            if(!z) {
                throw new FileAlreadyExistsException(file0, file1, "The destination file already exists.");
            }
            if(!file1.delete()) {
                throw new FileAlreadyExistsException(file0, file1, "Tried to overwrite the destination, but failed to delete it.");
            }
        }
        if(!file0.isDirectory()) {
            File file2 = file1.getParentFile();
            if(file2 != null) {
                file2.mkdirs();
            }
            FileInputStream fileInputStream0 = new FileInputStream(file0);
            try {
                FileOutputStream fileOutputStream0 = new FileOutputStream(file1);
                try {
                    ByteStreamsKt.copyTo(fileInputStream0, fileOutputStream0, v);
                }
                catch(Throwable throwable1) {
                    CloseableKt.closeFinally(fileOutputStream0, throwable1);
                    throw throwable1;
                }
                CloseableKt.closeFinally(fileOutputStream0, null);
            }
            catch(Throwable throwable0) {
                CloseableKt.closeFinally(fileInputStream0, throwable0);
                throw throwable0;
            }
            CloseableKt.closeFinally(fileInputStream0, null);
        }
        else if(!file1.mkdirs()) {
            throw new FileSystemException(file0, file1, "Failed to create target directory.");
        }
        return file1;
    }

    public static File copyTo$default(File file0, File file1, boolean z, int v, int v1, Object object0) {
        if((v1 & 2) != 0) {
            z = false;
        }
        if((v1 & 4) != 0) {
            v = 0x2000;
        }
        return l.copyTo(file0, file1, z, v);
    }

    @Deprecated(message = "Avoid creating temporary directories in the default temp location with this function due to too wide permissions on the newly created directory. Use kotlin.io.path.createTempDirectory instead.")
    @NotNull
    public static final File createTempDir(@NotNull String s, @Nullable String s1, @Nullable File file0) {
        Intrinsics.checkNotNullParameter(s, "prefix");
        File file1 = File.createTempFile(s, s1, file0);
        file1.delete();
        if(!file1.mkdir()) {
            throw new IOException("Unable to create temporary directory " + file1 + '.');
        }
        Intrinsics.checkNotNull(file1);
        return file1;
    }

    public static File createTempDir$default(String s, String s1, File file0, int v, Object object0) {
        if((v & 1) != 0) {
            s = "tmp";
        }
        if((v & 2) != 0) {
            s1 = null;
        }
        if((v & 4) != 0) {
            file0 = null;
        }
        return l.createTempDir(s, s1, file0);
    }

    @Deprecated(message = "Avoid creating temporary files in the default temp location with this function due to too wide permissions on the newly created file. Use kotlin.io.path.createTempFile instead or resort to java.io.File.createTempFile.")
    @NotNull
    public static final File createTempFile(@NotNull String s, @Nullable String s1, @Nullable File file0) {
        Intrinsics.checkNotNullParameter(s, "prefix");
        File file1 = File.createTempFile(s, s1, file0);
        Intrinsics.checkNotNullExpressionValue(file1, "createTempFile(...)");
        return file1;
    }

    public static File createTempFile$default(String s, String s1, File file0, int v, Object object0) {
        if((v & 1) != 0) {
            s = "tmp";
        }
        if((v & 2) != 0) {
            s1 = null;
        }
        if((v & 4) != 0) {
            file0 = null;
        }
        return l.createTempFile(s, s1, file0);
    }

    public static final boolean deleteRecursively(@NotNull File file0) {
        boolean z;
        Intrinsics.checkNotNullParameter(file0, "<this>");
        Iterator iterator0 = j.walkBottomUp(file0).iterator();
    alab1:
        while(true) {
            for(z = true; true; z = false) {
                if(!iterator0.hasNext()) {
                    break alab1;
                }
                Object object0 = iterator0.next();
                if((((File)object0).delete() || !((File)object0).exists()) && z) {
                    break;
                }
            }
        }
        return z;
    }

    public static final boolean endsWith(@NotNull File file0, @NotNull File file1) {
        Intrinsics.checkNotNullParameter(file0, "<this>");
        Intrinsics.checkNotNullParameter(file1, "other");
        FilePathComponents filePathComponents0 = h.toComponents(file0);
        FilePathComponents filePathComponents1 = h.toComponents(file1);
        if(filePathComponents1.isRooted()) {
            return Intrinsics.areEqual(file0, file1);
        }
        int v = filePathComponents0.getSize() - filePathComponents1.getSize();
        return v >= 0 ? filePathComponents0.getSegments().subList(v, filePathComponents0.getSize()).equals(filePathComponents1.getSegments()) : false;
    }

    public static final boolean endsWith(@NotNull File file0, @NotNull String s) {
        Intrinsics.checkNotNullParameter(file0, "<this>");
        Intrinsics.checkNotNullParameter(s, "other");
        return l.endsWith(file0, new File(s));
    }

    @NotNull
    public static String getExtension(@NotNull File file0) {
        Intrinsics.checkNotNullParameter(file0, "<this>");
        String s = file0.getName();
        Intrinsics.checkNotNullExpressionValue(s, "getName(...)");
        return StringsKt__StringsKt.substringAfterLast(s, '.', "");
    }

    @NotNull
    public static final String getInvariantSeparatorsPath(@NotNull File file0) {
        Intrinsics.checkNotNullParameter(file0, "<this>");
        int v = File.separatorChar;
        String s = file0.getPath();
        Intrinsics.checkNotNullExpressionValue(s, "getPath(...)");
        return v == 0x2F ? s : p.replace$default(s, ((char)v), '/', false, 4, null);
    }

    @NotNull
    public static final String getNameWithoutExtension(@NotNull File file0) {
        Intrinsics.checkNotNullParameter(file0, "<this>");
        String s = file0.getName();
        Intrinsics.checkNotNullExpressionValue(s, "getName(...)");
        return StringsKt__StringsKt.substringBeforeLast$default(s, ".", null, 2, null);
    }

    @NotNull
    public static final File normalize(@NotNull File file0) {
        Intrinsics.checkNotNullParameter(file0, "<this>");
        FilePathComponents filePathComponents0 = h.toComponents(file0);
        ArrayList arrayList0 = l.b(filePathComponents0.getSegments());
        Intrinsics.checkNotNullExpressionValue("/", "separator");
        return l.resolve(filePathComponents0.getRoot(), CollectionsKt___CollectionsKt.joinToString$default(arrayList0, "/", null, null, 0, null, null, 62, null));
    }

    @NotNull
    public static final File relativeTo(@NotNull File file0, @NotNull File file1) {
        Intrinsics.checkNotNullParameter(file0, "<this>");
        Intrinsics.checkNotNullParameter(file1, "base");
        return new File(l.toRelativeString(file0, file1));
    }

    @Nullable
    public static final File relativeToOrNull(@NotNull File file0, @NotNull File file1) {
        Intrinsics.checkNotNullParameter(file0, "<this>");
        Intrinsics.checkNotNullParameter(file1, "base");
        String s = l.c(file0, file1);
        return s == null ? null : new File(s);
    }

    @NotNull
    public static final File relativeToOrSelf(@NotNull File file0, @NotNull File file1) {
        Intrinsics.checkNotNullParameter(file0, "<this>");
        Intrinsics.checkNotNullParameter(file1, "base");
        String s = l.c(file0, file1);
        return s == null ? file0 : new File(s);
    }

    @NotNull
    public static final File resolve(@NotNull File file0, @NotNull File file1) {
        Intrinsics.checkNotNullParameter(file0, "<this>");
        Intrinsics.checkNotNullParameter(file1, "relative");
        if(h.isRooted(file1)) {
            return file1;
        }
        String s = file0.toString();
        Intrinsics.checkNotNullExpressionValue(s, "toString(...)");
        if(s.length() != 0) {
            int v = File.separatorChar;
            return StringsKt__StringsKt.endsWith$default(s, ((char)v), false, 2, null) ? new File(s + file1) : new File(s + ((char)v) + file1);
        }
        return new File(s + file1);
    }

    @NotNull
    public static File resolve(@NotNull File file0, @NotNull String s) {
        Intrinsics.checkNotNullParameter(file0, "<this>");
        Intrinsics.checkNotNullParameter(s, "relative");
        return l.resolve(file0, new File(s));
    }

    @NotNull
    public static final File resolveSibling(@NotNull File file0, @NotNull File file1) {
        Intrinsics.checkNotNullParameter(file0, "<this>");
        Intrinsics.checkNotNullParameter(file1, "relative");
        FilePathComponents filePathComponents0 = h.toComponents(file0);
        return filePathComponents0.getSize() == 0 ? l.resolve(l.resolve(filePathComponents0.getRoot(), new File("..")), file1) : l.resolve(l.resolve(filePathComponents0.getRoot(), filePathComponents0.subPath(0, filePathComponents0.getSize() - 1)), file1);
    }

    @NotNull
    public static final File resolveSibling(@NotNull File file0, @NotNull String s) {
        Intrinsics.checkNotNullParameter(file0, "<this>");
        Intrinsics.checkNotNullParameter(s, "relative");
        return l.resolveSibling(file0, new File(s));
    }

    public static final boolean startsWith(@NotNull File file0, @NotNull File file1) {
        Intrinsics.checkNotNullParameter(file0, "<this>");
        Intrinsics.checkNotNullParameter(file1, "other");
        FilePathComponents filePathComponents0 = h.toComponents(file0);
        FilePathComponents filePathComponents1 = h.toComponents(file1);
        if(!Intrinsics.areEqual(filePathComponents0.getRoot(), filePathComponents1.getRoot())) {
            return false;
        }
        return filePathComponents0.getSize() < filePathComponents1.getSize() ? false : filePathComponents0.getSegments().subList(0, filePathComponents1.getSize()).equals(filePathComponents1.getSegments());
    }

    public static final boolean startsWith(@NotNull File file0, @NotNull String s) {
        Intrinsics.checkNotNullParameter(file0, "<this>");
        Intrinsics.checkNotNullParameter(s, "other");
        return l.startsWith(file0, new File(s));
    }

    @NotNull
    public static final String toRelativeString(@NotNull File file0, @NotNull File file1) {
        Intrinsics.checkNotNullParameter(file0, "<this>");
        Intrinsics.checkNotNullParameter(file1, "base");
        String s = l.c(file0, file1);
        if(s == null) {
            throw new IllegalArgumentException("this and base files have different roots: " + file0 + " and " + file1 + '.');
        }
        return s;
    }
}

