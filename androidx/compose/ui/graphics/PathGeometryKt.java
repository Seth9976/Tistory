package androidx.compose.ui.graphics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0007\u001A\u0011\u0010\u0002\u001A\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001A\'\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00000\u0004*\u00020\u00002\u000E\b\u0002\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001A\u001B\u0010\t\u001A\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\b\u001A\u00020\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000B"}, d2 = {"Landroidx/compose/ui/graphics/Path;", "Landroidx/compose/ui/graphics/Path$Direction;", "computeDirection", "(Landroidx/compose/ui/graphics/Path;)Landroidx/compose/ui/graphics/Path$Direction;", "", "contours", "divide", "(Landroidx/compose/ui/graphics/Path;Ljava/util/List;)Ljava/util/List;", "destination", "reverse", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Path;)Landroidx/compose/ui/graphics/Path;", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPathGeometry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathGeometry.kt\nandroidx/compose/ui/graphics/PathGeometryKt\n+ 2 Bezier.kt\nandroidx/compose/ui/graphics/BezierKt\n*L\n1#1,362:1\n562#2:363\n*S KotlinDebug\n*F\n+ 1 PathGeometry.kt\nandroidx/compose/ui/graphics/PathGeometryKt\n*L\n148#1:363\n*E\n"})
public final class PathGeometryKt {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[Type.values().length];
            try {
                arr_v[Type.Move.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Type.Line.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Type.Quadratic.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Type.Conic.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Type.Cubic.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Type.Close.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Type.Done.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    @NotNull
    public static final Direction computeDirection(@NotNull Path path0) {
        PathIterator pathIterator0 = path0.iterator();
        float[] arr_f = new float[8];
        Type pathSegment$Type0 = PathIterator.next$default(pathIterator0, arr_f, 0, 2, null);
        boolean z = true;
        float f = 0.0f;
        float f1 = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
    label_9:
        while(pathSegment$Type0 != Type.Done) {
            switch(WhenMappings.$EnumSwitchMapping$0[pathSegment$Type0.ordinal()]) {
                case 1: {
                    if(!z) {
                        break label_9;
                    }
                    f3 = arr_f[0];
                    f4 = arr_f[1];
                    z = false;
                    pathSegment$Type0 = PathIterator.next$default(pathIterator0, arr_f, 0, 2, null);
                    continue;
                }
                case 2: {
                    float f5 = arr_f[0];
                    float f6 = arr_f[1];
                    f1 = arr_f[2];
                    f2 = arr_f[3];
                    f += BezierKt.cubicArea(f5, f6, f5, f6, f1, f2, f1, f2);
                    pathSegment$Type0 = PathIterator.next$default(pathIterator0, arr_f, 0, 2, null);
                    continue;
                }
                case 3: {
                    float f7 = arr_f[0];
                    float f8 = arr_f[1];
                    float f9 = arr_f[2];
                    float f10 = arr_f[3];
                    float f11 = arr_f[4];
                    float f12 = arr_f[5];
                    f += BezierKt.cubicArea(f7, f8, (f9 - f7) * 0.666667f + f7, (f10 - f8) * 0.666667f + f8, (f9 - f11) * 0.666667f + f11, (f10 - f12) * 0.666667f + f12, f11, f12);
                    f2 = f12;
                    f1 = f11;
                    pathSegment$Type0 = PathIterator.next$default(pathIterator0, arr_f, 0, 2, null);
                    continue;
                }
                case 4: {
                    continue;
                }
                case 5: {
                    f += BezierKt.cubicArea(arr_f[0], arr_f[1], arr_f[2], arr_f[3], arr_f[4], arr_f[5], arr_f[6], arr_f[7]);
                    f1 = arr_f[6];
                    f2 = arr_f[7];
                    pathSegment$Type0 = PathIterator.next$default(pathIterator0, arr_f, 0, 2, null);
                    continue;
                }
                case 6: {
                    if(Math.abs(f1 - f3) >= 0.000001f || Math.abs(f2 - f4) >= 0.000001f) {
                        f += BezierKt.cubicArea(f1, f2, f1, f2, f3, f4, f3, f4);
                        f1 = f3;
                        f2 = f4;
                    }
                    pathSegment$Type0 = PathIterator.next$default(pathIterator0, arr_f, 0, 2, null);
                    continue;
                }
                case 7: {
                    break label_9;
                }
                default: {
                    pathSegment$Type0 = PathIterator.next$default(pathIterator0, arr_f, 0, 2, null);
                    continue;
                }
            }
        }
        return f >= 0.0f ? Direction.Clockwise : Direction.CounterClockwise;
    }

    @NotNull
    public static final List divide(@NotNull Path path0, @NotNull List list0) {
        Path path1 = AndroidPath_androidKt.Path();
        PathIterator pathIterator0 = path0.iterator();
        float[] arr_f = new float[8];
        Type pathSegment$Type0 = PathIterator.next$default(pathIterator0, arr_f, 0, 2, null);
        boolean z = true;
        boolean z1 = true;
        while(pathSegment$Type0 != Type.Done) {
            switch(WhenMappings.$EnumSwitchMapping$0[pathSegment$Type0.ordinal()]) {
                case 1: {
                    if(!z1 && !z) {
                        list0.add(path1);
                        path1 = AndroidPath_androidKt.Path();
                    }
                    path1.moveTo(arr_f[0], arr_f[1]);
                    z1 = false;
                    z = true;
                    break;
                }
                case 2: {
                    path1.lineTo(arr_f[2], arr_f[3]);
                    z = false;
                    break;
                }
                case 3: {
                    path1.quadraticTo(arr_f[2], arr_f[3], arr_f[4], arr_f[5]);
                    z = false;
                    break;
                }
                case 5: {
                    path1.cubicTo(arr_f[2], arr_f[3], arr_f[4], arr_f[5], arr_f[6], arr_f[7]);
                    z = false;
                    break;
                }
                case 6: {
                    path1.close();
                    break;
                }
                case 4: 
                case 7: {
                    continue;
                }
            }
            pathSegment$Type0 = PathIterator.next$default(pathIterator0, arr_f, 0, 2, null);
        }
        if(!z1 && !z) {
            list0.add(path1);
        }
        return list0;
    }

    public static List divide$default(Path path0, List list0, int v, Object object0) {
        if((v & 1) != 0) {
            list0 = new ArrayList();
        }
        return PathGeometryKt.divide(path0, list0);
    }

    @NotNull
    public static final Path reverse(@NotNull Path path0, @NotNull Path path1) {
        int v5;
        float[] arr_f2;
        PathIterator pathIterator0 = path0.iterator();
        int v = pathIterator0.calculateSize(false);
        ArrayList arrayList0 = new ArrayList(v);
        ArrayList arrayList1 = new ArrayList(v);
        float[] arr_f = new float[8];
        for(Type pathSegment$Type0 = PathIterator.next$default(pathIterator0, arr_f, 0, 2, null); true; pathSegment$Type0 = PathIterator.next$default(pathIterator0, arr_f, 0, 2, null)) {
            int v1 = 4;
            if(pathSegment$Type0 == Type.Done) {
                break;
            }
            arrayList0.add(pathSegment$Type0);
            if(pathSegment$Type0 != Type.Close) {
                switch(WhenMappings.$EnumSwitchMapping$0[pathSegment$Type0.ordinal()]) {
                    case 1: {
                        v1 = 2;
                        break;
                    }
                    case 2: {
                        break;
                    }
                    case 3: {
                        v1 = 6;
                        break;
                    }
                    case 4: 
                    case 5: {
                        v1 = 8;
                        break;
                    }
                    case 6: 
                    case 7: {
                        v1 = 0;
                        break;
                    }
                    default: {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                float[] arr_f1 = Arrays.copyOf(arr_f, v1);
                Intrinsics.checkNotNullExpressionValue(arr_f1, "copyOf(this, newSize)");
                arrayList1.add(arr_f1);
            }
        }
        int v2 = arrayList1.size();
        int v3 = arrayList0.size() - 1;
        boolean z = false;
        boolean z1 = true;
        while(-1 < v3) {
            if(z1) {
                arr_f2 = (float[])arrayList1.get(v2 - 1);
                int v4 = ArraysKt___ArraysKt.getLastIndex(arr_f2);
                path1.moveTo(arr_f2[v4 - 1], arr_f2[v4]);
                v5 = v2 - 1;
            }
            else {
                v5 = v2;
                arr_f2 = (float[])arrayList1.get(v2);
            }
            int v6 = WhenMappings.$EnumSwitchMapping$0[((Type)arrayList0.get(v3)).ordinal()];
        alab1:
            switch(v6) {
                case 1: {
                label_48:
                    if(z) {
                        path1.close();
                        z = false;
                    }
                    z1 = true;
                    v2 = v5;
                    goto label_58;
                }
                case 2: {
                    path1.lineTo(arr_f2[0], arr_f2[1]);
                    break;
                }
                default: {
                    if(v6 == 3) {
                        path1.quadraticTo(arr_f2[2], arr_f2[3], arr_f2[0], arr_f2[1]);
                        break;
                    }
                    else {
                        switch(v6) {
                            case 5: {
                                path1.cubicTo(arr_f2[4], arr_f2[5], arr_f2[2], arr_f2[3], arr_f2[0], arr_f2[1]);
                                break alab1;
                            }
                            case 6: {
                                z = true;
                                goto label_56;
                            }
                            default: {
                                goto label_56;
                            }
                        }
                    }
                    goto label_48;
                }
            }
            --v5;
        label_56:
            v2 = v5;
            z1 = false;
        label_58:
            --v3;
        }
        if(z) {
            path1.close();
        }
        return path1;
    }

    public static Path reverse$default(Path path0, Path path1, int v, Object object0) {
        if((v & 1) != 0) {
            path1 = AndroidPath_androidKt.Path();
        }
        return PathGeometryKt.reverse(path0, path1);
    }
}

