package kotlin.io.path;

import java.nio.file.FileVisitOption;
import java.nio.file.LinkOption;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.collections.f0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001J\u001B\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001B\u0010\n\u001A\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\n\u0010\u000B¨\u0006\f"}, d2 = {"Lkotlin/io/path/LinkFollowing;", "", "", "followLinks", "", "Ljava/nio/file/LinkOption;", "toLinkOptions", "(Z)[Ljava/nio/file/LinkOption;", "", "Ljava/nio/file/FileVisitOption;", "toVisitOptions", "(Z)Ljava/util/Set;", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPathTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/LinkFollowing\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,177:1\n26#2:178\n*S KotlinDebug\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/LinkFollowing\n*L\n142#1:178\n*E\n"})
public final class LinkFollowing {
    @NotNull
    public static final LinkFollowing INSTANCE;
    public static final LinkOption[] a;
    public static final LinkOption[] b;
    public static final Set c;
    public static final Set d;

    static {
        LinkFollowing.INSTANCE = new LinkFollowing();  // 初始化器: Ljava/lang/Object;-><init>()V
        LinkFollowing.a = new LinkOption[]{LinkOption.NOFOLLOW_LINKS};
        LinkFollowing.b = new LinkOption[0];
        LinkFollowing.c = f0.emptySet();
        LinkFollowing.d = e0.setOf(FileVisitOption.FOLLOW_LINKS);
    }

    // 去混淆评级： 低(20)
    @NotNull
    public final LinkOption[] toLinkOptions(boolean z) {
        return z ? LinkFollowing.b : LinkFollowing.a;
    }

    // 去混淆评级： 低(20)
    @NotNull
    public final Set toVisitOptions(boolean z) {
        return z ? LinkFollowing.d : LinkFollowing.c;
    }
}

