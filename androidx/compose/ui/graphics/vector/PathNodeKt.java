package androidx.compose.ui.graphics.vector;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0010\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001A;\u0010\n\u001A\u00020\t*\u00020\u00002\u0016\u0010\u0004\u001A\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\b\u001A\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000B¨\u0006\f"}, d2 = {"", "Ljava/util/ArrayList;", "Landroidx/compose/ui/graphics/vector/PathNode;", "Lkotlin/collections/ArrayList;", "nodes", "", "args", "", "count", "", "addPathNodes", "(CLjava/util/ArrayList;[FI)V", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPathNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathNode.kt\nandroidx/compose/ui/graphics/vector/PathNodeKt\n*L\n1#1,419:1\n338#1,7:420\n338#1,7:427\n338#1,7:434\n338#1,7:441\n338#1,7:448\n338#1,7:455\n338#1,7:462\n338#1,7:469\n338#1,7:476\n338#1,7:483\n338#1,7:490\n338#1,7:497\n338#1,7:504\n338#1,7:511\n338#1,7:518\n338#1,7:525\n*S KotlinDebug\n*F\n+ 1 PathNode.kt\nandroidx/compose/ui/graphics/vector/PathNodeKt\n*L\n158#1:420,7\n167#1:427,7\n171#1:434,7\n180#1:441,7\n189#1:448,7\n198#1:455,7\n207#1:462,7\n223#1:469,7\n234#1:476,7\n248#1:483,7\n262#1:490,7\n276#1:497,7\n285#1:504,7\n294#1:511,7\n303#1:518,7\n315#1:525,7\n*E\n"})
public final class PathNodeKt {
    public static final void addPathNodes(char c, @NotNull ArrayList arrayList0, @NotNull float[] arr_f, int v) {
        if(c == 90 || c == 0x7A) {
            arrayList0.add(Close.INSTANCE);
            return;
        }
        int v1 = 2;
        int v2 = 0;
        if(c != 109) {
        alab1:
            switch(c) {
                case 65: {
                    for(int v3 = 0; v3 <= v - 7; v3 += 7) {
                        arrayList0.add(new ArcTo(arr_f[v3], arr_f[v3 + 1], arr_f[v3 + 2], Float.compare(arr_f[v3 + 3], 0.0f) != 0, Float.compare(arr_f[v3 + 4], 0.0f) != 0, arr_f[v3 + 5], arr_f[v3 + 6]));
                    }
                    return;
                }
                case 67: {
                    while(v2 <= v - 6) {
                        arrayList0.add(new CurveTo(arr_f[v2], arr_f[v2 + 1], arr_f[v2 + 2], arr_f[v2 + 3], arr_f[v2 + 4], arr_f[v2 + 5]));
                        v2 += 6;
                    }
                    return;
                }
                case 72: {
                    while(v2 <= v - 1) {
                        arrayList0.add(new HorizontalTo(arr_f[v2]));
                        ++v2;
                    }
                    return;
                }
                case 76: {
                    while(v2 <= v - 2) {
                        arrayList0.add(new LineTo(arr_f[v2], arr_f[v2 + 1]));
                        v2 += 2;
                    }
                    return;
                }
                case 77: {
                    if(v - 2 >= 0) {
                        arrayList0.add(new MoveTo(arr_f[0], arr_f[1]));
                        while(v1 <= v - 2) {
                            arrayList0.add(new LineTo(arr_f[v1], arr_f[v1 + 1]));
                            v1 += 2;
                        }
                        return;
                    }
                    break;
                }
                case 81: {
                    while(v2 <= v - 4) {
                        arrayList0.add(new QuadTo(arr_f[v2], arr_f[v2 + 1], arr_f[v2 + 2], arr_f[v2 + 3]));
                        v2 += 4;
                    }
                    return;
                }
                case 83: {
                    while(v2 <= v - 4) {
                        arrayList0.add(new ReflectiveCurveTo(arr_f[v2], arr_f[v2 + 1], arr_f[v2 + 2], arr_f[v2 + 3]));
                        v2 += 4;
                    }
                    return;
                }
                case 84: {
                    while(v2 <= v - 2) {
                        arrayList0.add(new ReflectiveQuadTo(arr_f[v2], arr_f[v2 + 1]));
                        v2 += 2;
                    }
                    return;
                }
                case 86: {
                    while(v2 <= v - 1) {
                        arrayList0.add(new VerticalTo(arr_f[v2]));
                        ++v2;
                    }
                    return;
                }
                case 97: {
                    for(int v4 = 0; v4 <= v - 7; v4 += 7) {
                        arrayList0.add(new RelativeArcTo(arr_f[v4], arr_f[v4 + 1], arr_f[v4 + 2], Float.compare(arr_f[v4 + 3], 0.0f) != 0, Float.compare(arr_f[v4 + 4], 0.0f) != 0, arr_f[v4 + 5], arr_f[v4 + 6]));
                    }
                    return;
                }
                case 99: {
                    while(v2 <= v - 6) {
                        arrayList0.add(new RelativeCurveTo(arr_f[v2], arr_f[v2 + 1], arr_f[v2 + 2], arr_f[v2 + 3], arr_f[v2 + 4], arr_f[v2 + 5]));
                        v2 += 6;
                    }
                    return;
                }
                case 104: {
                    while(v2 <= v - 1) {
                        arrayList0.add(new RelativeHorizontalTo(arr_f[v2]));
                        ++v2;
                    }
                    return;
                }
                case 108: {
                    while(v2 <= v - 2) {
                        arrayList0.add(new RelativeLineTo(arr_f[v2], arr_f[v2 + 1]));
                        v2 += 2;
                    }
                    return;
                }
                case 0x71: {
                    while(v2 <= v - 4) {
                        arrayList0.add(new RelativeQuadTo(arr_f[v2], arr_f[v2 + 1], arr_f[v2 + 2], arr_f[v2 + 3]));
                        v2 += 4;
                    }
                    return;
                }
                case 0x73: {
                    while(v2 <= v - 4) {
                        arrayList0.add(new RelativeReflectiveCurveTo(arr_f[v2], arr_f[v2 + 1], arr_f[v2 + 2], arr_f[v2 + 3]));
                        v2 += 4;
                    }
                    return;
                }
                case 0x74: {
                    while(v2 <= v - 2) {
                        arrayList0.add(new RelativeReflectiveQuadTo(arr_f[v2], arr_f[v2 + 1]));
                        v2 += 2;
                    }
                    return;
                }
                case 0x76: {
                    while(true) {
                        if(v2 > v - 1) {
                            break alab1;
                        }
                        arrayList0.add(new RelativeVerticalTo(arr_f[v2]));
                        ++v2;
                    }
                }
                default: {
                    throw new IllegalArgumentException("Unknown command for: " + c);
                }
            }
        }
        else if(v - 2 >= 0) {
            arrayList0.add(new RelativeMoveTo(arr_f[0], arr_f[1]));
            while(v1 <= v - 2) {
                arrayList0.add(new RelativeLineTo(arr_f[v1], arr_f[v1 + 1]));
                v1 += 2;
            }
        }
    }
}

