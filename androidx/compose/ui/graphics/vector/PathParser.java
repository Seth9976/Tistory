package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u0015\u0010\b\u001A\u00020\u00002\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ?\u0010\u000E\u001A\u0012\u0012\u0004\u0012\u00020\u000B0\nj\b\u0012\u0004\u0012\u00020\u000B`\f2\u0006\u0010\u0007\u001A\u00020\u00062\u0018\b\u0002\u0010\r\u001A\u0012\u0012\u0004\u0012\u00020\u000B0\nj\b\u0012\u0004\u0012\u00020\u000B`\f¢\u0006\u0004\b\u000E\u0010\u000FJ\u001B\u0010\u0011\u001A\u00020\u00002\f\u0010\r\u001A\b\u0012\u0004\u0012\u00020\u000B0\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001A\b\u0012\u0004\u0012\u00020\u000B0\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001A\u00020\u00152\b\b\u0002\u0010\u0016\u001A\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathParser;", "", "<init>", "()V", "", "clear", "", "pathData", "parsePathString", "(Ljava/lang/String;)Landroidx/compose/ui/graphics/vector/PathParser;", "Ljava/util/ArrayList;", "Landroidx/compose/ui/graphics/vector/PathNode;", "Lkotlin/collections/ArrayList;", "nodes", "pathStringToNodes", "(Ljava/lang/String;Ljava/util/ArrayList;)Ljava/util/ArrayList;", "", "addPathNodes", "(Ljava/util/List;)Landroidx/compose/ui/graphics/vector/PathParser;", "toNodes", "()Ljava/util/List;", "Landroidx/compose/ui/graphics/Path;", "target", "toPath", "(Landroidx/compose/ui/graphics/Path;)Landroidx/compose/ui/graphics/Path;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPathParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathParser.kt\nandroidx/compose/ui/graphics/vector/PathParser\n+ 2 FastFloatParser.kt\nandroidx/compose/ui/graphics/vector/FastFloatParserKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,589:1\n155#1,6:593\n43#2:590\n44#2:591\n22#3:592\n*S KotlinDebug\n*F\n+ 1 PathParser.kt\nandroidx/compose/ui/graphics/vector/PathParser\n*L\n138#1:593,6\n132#1:590\n133#1:591\n133#1:592\n*E\n"})
public final class PathParser {
    public ArrayList a;
    public float[] b;

    public PathParser() {
        this.b = new float[0x40];
    }

    @NotNull
    public final PathParser addPathNodes(@NotNull List list0) {
        ArrayList arrayList0 = this.a;
        if(arrayList0 == null) {
            arrayList0 = new ArrayList();
            this.a = arrayList0;
        }
        arrayList0.addAll(list0);
        return this;
    }

    public final void clear() {
        ArrayList arrayList0 = this.a;
        if(arrayList0 != null) {
            arrayList0.clear();
        }
    }

    @NotNull
    public final PathParser parsePathString(@NotNull String s) {
        ArrayList arrayList0 = this.a;
        if(arrayList0 == null) {
            arrayList0 = new ArrayList();
            this.a = arrayList0;
        }
        else {
            arrayList0.clear();
        }
        this.pathStringToNodes(s, arrayList0);
        return this;
    }

    @NotNull
    public final ArrayList pathStringToNodes(@NotNull String s, @NotNull ArrayList arrayList0) {
        int v7;
        int v4;
        int v3;
        int v = s.length();
        int v1;
        for(v1 = 0; v1 < v && Intrinsics.compare(s.charAt(v1), 0x20) <= 0; ++v1) {
        }
        while(v > v1 && Intrinsics.compare(s.charAt(v - 1), 0x20) <= 0) {
            --v;
        }
        int v2 = 0;
        while(v1 < v) {
            while(true) {
                v3 = v1 + 1;
                v4 = s.charAt(v1);
                int v5 = v4 | 0x20;
                if((v5 - 0x7A) * (v5 - 97) <= 0 && v5 != 101) {
                    break;
                }
                if(v3 >= v) {
                    v4 = 0;
                    break;
                }
                v1 = v3;
            }
            if(v4 != 0) {
                if((v4 | 0x20) != 0x7A) {
                    v2 = 0;
                    while(true) {
                        if(v3 < v && Intrinsics.compare(s.charAt(v3), 0x20) <= 0) {
                            ++v3;
                        }
                        else {
                            long v6 = FastFloatParserKt.nextFloat(s, v3, v);
                            v7 = (int)(v6 >>> 0x20);
                            float f = Float.intBitsToFloat(((int)(v6 & 0xFFFFFFFFL)));
                            if(!Float.isNaN(f)) {
                                float[] arr_f = this.b;
                                arr_f[v2] = f;
                                if(v2 + 1 >= arr_f.length) {
                                    float[] arr_f1 = new float[(v2 + 1) * 2];
                                    this.b = arr_f1;
                                    ArraysKt___ArraysJvmKt.copyInto(arr_f, arr_f1, 0, 0, arr_f.length);
                                }
                                ++v2;
                            }
                            while(v7 < v && s.charAt(v7) == 44) {
                                ++v7;
                            }
                            if(v7 >= v || Float.isNaN(f)) {
                                break;
                            }
                            v3 = v7;
                        }
                    }
                    v3 = v7;
                }
                PathNodeKt.addPathNodes(((char)v4), arrayList0, this.b, v2);
            }
            v1 = v3;
        }
        return arrayList0;
    }

    public static ArrayList pathStringToNodes$default(PathParser pathParser0, String s, ArrayList arrayList0, int v, Object object0) {
        if((v & 2) != 0) {
            arrayList0 = new ArrayList();
        }
        return pathParser0.pathStringToNodes(s, arrayList0);
    }

    @NotNull
    public final List toNodes() {
        return this.a == null ? CollectionsKt__CollectionsKt.emptyList() : this.a;
    }

    @NotNull
    public final Path toPath(@NotNull Path path0) {
        ArrayList arrayList0 = this.a;
        if(arrayList0 != null) {
            Path path1 = PathParserKt.toPath(arrayList0, path0);
            return path1 == null ? AndroidPath_androidKt.Path() : path1;
        }
        return AndroidPath_androidKt.Path();
    }

    public static Path toPath$default(PathParser pathParser0, Path path0, int v, Object object0) {
        if((v & 1) != 0) {
            path0 = AndroidPath_androidKt.Path();
        }
        return pathParser0.toPath(path0);
    }
}

