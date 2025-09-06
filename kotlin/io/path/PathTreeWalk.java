package kotlin.io.path;

import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequenceBuilderKt;
import org.jetbrains.annotations.NotNull;
import yd.f;
import yd.g;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u000E\u0010\u0006\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\n\u001A\b\u0012\u0004\u0012\u00020\u00020\tH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000B¨\u0006\f"}, d2 = {"Lkotlin/io/path/PathTreeWalk;", "Lkotlin/sequences/Sequence;", "Ljava/nio/file/Path;", "start", "", "Lkotlin/io/path/PathWalkOption;", "options", "<init>", "(Ljava/nio/file/Path;[Lkotlin/io/path/PathWalkOption;)V", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@ExperimentalPathApi
public final class PathTreeWalk implements Sequence {
    public final Path a;
    public final PathWalkOption[] b;

    public PathTreeWalk(@NotNull Path path0, @NotNull PathWalkOption[] arr_pathWalkOption) {
        Intrinsics.checkNotNullParameter(path0, "start");
        Intrinsics.checkNotNullParameter(arr_pathWalkOption, "options");
        super();
        this.a = path0;
        this.b = arr_pathWalkOption;
    }

    public static final boolean access$getFollowLinks(PathTreeWalk pathTreeWalk0) {
        return ArraysKt___ArraysKt.contains(pathTreeWalk0.b, PathWalkOption.FOLLOW_LINKS);
    }

    public static final boolean access$getIncludeDirectories(PathTreeWalk pathTreeWalk0) {
        return ArraysKt___ArraysKt.contains(pathTreeWalk0.b, PathWalkOption.INCLUDE_DIRECTORIES);
    }

    public static final LinkOption[] access$getLinkOptions(PathTreeWalk pathTreeWalk0) {
        pathTreeWalk0.getClass();
        boolean z = ArraysKt___ArraysKt.contains(pathTreeWalk0.b, PathWalkOption.FOLLOW_LINKS);
        return LinkFollowing.INSTANCE.toLinkOptions(z);
    }

    // 去混淆评级： 低(20)
    @Override  // kotlin.sequences.Sequence
    @NotNull
    public Iterator iterator() {
        return ArraysKt___ArraysKt.contains(this.b, PathWalkOption.BREADTH_FIRST) ? SequencesKt__SequenceBuilderKt.iterator(new f(this, null)) : SequencesKt__SequenceBuilderKt.iterator(new g(this, null));
    }
}

