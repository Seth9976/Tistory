package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.vector.PathParser;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0004\u001A\u0019\u0010\u0004\u001A\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001A\u001B\u0010\b\u001A\u00020\u0001*\u00020\u00002\b\b\u0002\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/graphics/Path;", "", "pathData", "", "addSvg", "(Landroidx/compose/ui/graphics/Path;Ljava/lang/String;)V", "", "asDocument", "toSvg", "(Landroidx/compose/ui/graphics/Path;Z)Ljava/lang/String;", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class PathSvgKt {
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

    public static final String a(Type pathSegment$Type0, Type pathSegment$Type1) {
        if(pathSegment$Type0 != pathSegment$Type1) {
            switch(WhenMappings.$EnumSwitchMapping$0[pathSegment$Type0.ordinal()]) {
                case 1: {
                    return "M";
                }
                case 2: {
                    return "L";
                }
                case 3: {
                    return "Q";
                }
                case 5: {
                    return "C";
                }
                case 6: {
                    return "Z";
                }
                default: {
                    return "";
                }
            }
        }
        return " ";
    }

    public static final void addSvg(@NotNull Path path0, @NotNull String s) {
        new PathParser().parsePathString(s).toPath(path0);
    }

    @NotNull
    public static final String toSvg(@NotNull Path path0, boolean z) {
        StringBuilder stringBuilder0 = new StringBuilder();
        Rect rect0 = path0.getBounds();
        if(z) {
            stringBuilder0.append("<svg xmlns=\"http://www.w3.org/2000/svg\" ");
            stringBuilder0.append("viewBox=\"" + rect0.getLeft() + ' ' + rect0.getTop() + ' ' + rect0.getWidth() + ' ' + rect0.getHeight() + "\">");
            Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(value)");
            stringBuilder0.append('\n');
            Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(\'\\n\')");
        }
        PathIterator pathIterator0 = path0.iterator();
        float[] arr_f = new float[8];
        Type pathSegment$Type0 = Type.Done;
        if(pathIterator0.hasNext()) {
            if(z) {
                if(PathFillType.equals-impl0(path0.getFillType-Rg-k1Os(), 1)) {
                    stringBuilder0.append("  <path fill-rule=\"evenodd\" d=\"");
                }
                else {
                    stringBuilder0.append("  <path d=\"");
                }
            }
            while(pathIterator0.hasNext()) {
                Type pathSegment$Type1 = PathIterator.next$default(pathIterator0, arr_f, 0, 2, null);
                switch(WhenMappings.$EnumSwitchMapping$0[pathSegment$Type1.ordinal()]) {
                    case 1: {
                        stringBuilder0.append(PathSvgKt.a(Type.Move, pathSegment$Type0) + arr_f[0] + ' ' + arr_f[1]);
                        break;
                    }
                    case 2: {
                        stringBuilder0.append(PathSvgKt.a(Type.Line, pathSegment$Type0) + arr_f[2] + ' ' + arr_f[3]);
                        break;
                    }
                    case 3: {
                        stringBuilder0.append(PathSvgKt.a(Type.Quadratic, pathSegment$Type0));
                        stringBuilder0.append(arr_f[2] + ' ' + arr_f[3] + ' ' + arr_f[4] + ' ' + arr_f[5]);
                        break;
                    }
                    case 5: {
                        stringBuilder0.append(PathSvgKt.a(Type.Cubic, pathSegment$Type0));
                        stringBuilder0.append(arr_f[2] + ' ' + arr_f[3] + ' ');
                        stringBuilder0.append(arr_f[4] + ' ' + arr_f[5] + ' ');
                        stringBuilder0.append(arr_f[6] + ' ' + arr_f[7]);
                        break;
                    }
                    case 6: {
                        stringBuilder0.append(PathSvgKt.a(Type.Close, pathSegment$Type0));
                        break;
                    }
                    case 4: 
                    case 7: {
                        continue;
                    }
                }
                pathSegment$Type0 = pathSegment$Type1;
            }
            if(z) {
                stringBuilder0.append("\"/>");
                Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(value)");
                stringBuilder0.append('\n');
                Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(\'\\n\')");
            }
        }
        if(z) {
            stringBuilder0.append("</svg>");
            Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(value)");
            stringBuilder0.append('\n');
            Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(\'\\n\')");
        }
        String s = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }

    public static String toSvg$default(Path path0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            z = false;
        }
        return PathSvgKt.toSvg(path0, z);
    }
}

