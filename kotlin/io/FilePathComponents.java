package kotlin.io;

import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u000F\b\u0080\b\u0018\u00002\u00020\u0001B\u001F\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001D\u0010\u000B\u001A\u00020\u00022\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\n\u001A\u00020\b¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\r\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000EJ\u0016\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000F\u0010\u0010J*\u0010\u0011\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\u000E\b\u0002\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001A\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001A\u00020\bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001A\u0010\u001A\u001A\u00020\u00192\b\u0010\u0018\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001A\u0010\u001BR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\u000ER\u001D\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001F\u0010 \u001A\u0004\b!\u0010\u0010R\u0011\u0010#\u001A\u00020\u00138F¢\u0006\u0006\u001A\u0004\b\"\u0010\u0015R\u0011\u0010$\u001A\u00020\u00198F¢\u0006\u0006\u001A\u0004\b$\u0010%R\u0011\u0010\'\u001A\u00020\b8F¢\u0006\u0006\u001A\u0004\b&\u0010\u0017¨\u0006("}, d2 = {"Lkotlin/io/FilePathComponents;", "", "Ljava/io/File;", "root", "", "segments", "<init>", "(Ljava/io/File;Ljava/util/List;)V", "", "beginIndex", "endIndex", "subPath", "(II)Ljava/io/File;", "component1", "()Ljava/io/File;", "component2", "()Ljava/util/List;", "copy", "(Ljava/io/File;Ljava/util/List;)Lkotlin/io/FilePathComponents;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/io/File;", "getRoot", "b", "Ljava/util/List;", "getSegments", "getRootName", "rootName", "isRooted", "()Z", "getSize", "size", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class FilePathComponents {
    public final File a;
    public final List b;

    public FilePathComponents(@NotNull File file0, @NotNull List list0) {
        Intrinsics.checkNotNullParameter(file0, "root");
        Intrinsics.checkNotNullParameter(list0, "segments");
        super();
        this.a = file0;
        this.b = list0;
    }

    @NotNull
    public final File component1() {
        return this.a;
    }

    @NotNull
    public final List component2() {
        return this.b;
    }

    @NotNull
    public final FilePathComponents copy(@NotNull File file0, @NotNull List list0) {
        Intrinsics.checkNotNullParameter(file0, "root");
        Intrinsics.checkNotNullParameter(list0, "segments");
        return new FilePathComponents(file0, list0);
    }

    public static FilePathComponents copy$default(FilePathComponents filePathComponents0, File file0, List list0, int v, Object object0) {
        if((v & 1) != 0) {
            file0 = filePathComponents0.a;
        }
        if((v & 2) != 0) {
            list0 = filePathComponents0.b;
        }
        return filePathComponents0.copy(file0, list0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof FilePathComponents)) {
            return false;
        }
        return Intrinsics.areEqual(this.a, ((FilePathComponents)object0).a) ? Intrinsics.areEqual(this.b, ((FilePathComponents)object0).b) : false;
    }

    @NotNull
    public final File getRoot() {
        return this.a;
    }

    @NotNull
    public final String getRootName() {
        String s = this.a.getPath();
        Intrinsics.checkNotNullExpressionValue(s, "getPath(...)");
        return s;
    }

    @NotNull
    public final List getSegments() {
        return this.b;
    }

    public final int getSize() {
        return this.b.size();
    }

    @Override
    public int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    public final boolean isRooted() {
        String s = this.a.getPath();
        Intrinsics.checkNotNullExpressionValue(s, "getPath(...)");
        return s.length() > 0;
    }

    @NotNull
    public final File subPath(int v, int v1) {
        if(v < 0 || v > v1 || v1 > this.getSize()) {
            throw new IllegalArgumentException();
        }
        List list0 = this.b.subList(v, v1);
        Intrinsics.checkNotNullExpressionValue("/", "separator");
        return new File(CollectionsKt___CollectionsKt.joinToString$default(list0, "/", null, null, 0, null, null, 62, null));
    }

    @Override
    @NotNull
    public String toString() {
        return "FilePathComponents(root=" + this.a + ", segments=" + this.b + ')';
    }
}

