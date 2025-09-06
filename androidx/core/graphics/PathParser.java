package androidx.core.graphics;

import android.graphics.Path;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;

public final class PathParser {
    public static class PathDataNode {
        public char a;
        public final float[] b;

        public PathDataNode(char c, float[] arr_f) {
            this.a = c;
            this.b = arr_f;
        }

        public PathDataNode(PathDataNode pathParser$PathDataNode0) {
            this.a = pathParser$PathDataNode0.a;
            this.b = PathParser.a(pathParser$PathDataNode0.b.length, pathParser$PathDataNode0.b);
        }

        public static void a(Path path0, float f, float f1, float f2, float f3, float f4, float f5, float f6, boolean z, boolean z1) {
            double f27;
            double f26;
            double f7 = Math.toRadians(f6);
            double f8 = Math.cos(f7);
            double f9 = Math.sin(f7);
            double f10 = (double)f;
            double f11 = (((double)f1) * f9 + ((double)f) * f8) / ((double)f4);
            double f12 = (((double)f1) * f8 + ((double)(-f)) * f9) / ((double)f5);
            double f13 = (double)f1;
            double f14 = (((double)f3) * f9 + ((double)f2) * f8) / ((double)f4);
            double f15 = (((double)f3) * f8 + ((double)(-f2)) * f9) / ((double)f5);
            double f16 = f11 - f14;
            double f17 = f12 - f15;
            double f18 = (f11 + f14) / 2.0;
            double f19 = (f12 + f15) / 2.0;
            double f20 = f17 * f17 + f16 * f16;
            if(Double.compare(f20, 0.0) == 0) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double f21 = 1.0 / f20 - 0.25;
            if(f21 < 0.0) {
                Log.w("PathParser", "Points are too far apart " + f20);
                double f22 = Math.sqrt(f20);
                PathDataNode.a(path0, f, f1, f2, f3, f4 * ((float)(f22 / 1.99999)), f5 * ((float)(f22 / 1.99999)), f6, z, z1);
                return;
            }
            double f23 = Math.sqrt(f21);
            double f24 = f16 * f23;
            double f25 = f23 * f17;
            if(z == z1) {
                f26 = f18 - f25;
                f27 = f19 + f24;
            }
            else {
                f26 = f18 + f25;
                f27 = f19 - f24;
            }
            double f28 = Math.atan2(f12 - f27, f11 - f26);
            double f29 = Math.atan2(f15 - f27, f14 - f26) - f28;
            int v = Double.compare(f29, 0.0);
            if(z1 != v >= 0) {
                f29 = v <= 0 ? f29 + 6.283185 : f29 - 6.283185;
            }
            double f30 = f26 * ((double)f4);
            double f31 = f27 * ((double)f5);
            int v1 = (int)Math.ceil(Math.abs(f29 * 4.0 / 3.141593));
            double f32 = Math.cos(f7);
            double f33 = Math.sin(f7);
            double f34 = Math.cos(f28);
            double f35 = Math.sin(f28);
            double f36 = -((double)f4) * f32;
            double f37 = ((double)f5) * f33;
            double f38 = f36 * f35 - f37 * f34;
            double f39 = -((double)f4) * f33;
            double f40 = ((double)f5) * f32;
            double f41 = f34 * f40 + f35 * f39;
            int v2 = 0;
            while(v2 < v1) {
                double f42 = f28 + f29 / ((double)v1);
                double f43 = Math.sin(f42);
                double f44 = Math.cos(f42);
                double f45 = ((double)f4) * f32 * f44 + (f30 * f8 - f31 * f9) - f37 * f43;
                double f46 = f40 * f43 + (((double)f4) * f33 * f44 + (f31 * f8 + f30 * f9));
                double f47 = f36 * f43 - f37 * f44;
                double f48 = f44 * f40 + f43 * f39;
                double f49 = f42 - f28;
                double f50 = Math.tan(f49 / 2.0);
                double f51 = (Math.sqrt(f50 * 3.0 * f50 + 4.0) - 1.0) * Math.sin(f49) / 3.0;
                path0.rLineTo(0.0f, 0.0f);
                path0.cubicTo(((float)(f38 * f51 + f10)), ((float)(f41 * f51 + f13)), ((float)(f45 - f51 * f47)), ((float)(f46 - f51 * f48)), ((float)f45), ((float)f46));
                ++v2;
                f28 = f42;
                f41 = f48;
                f38 = f47;
                f10 = f45;
                f13 = f46;
            }
        }

        @NonNull
        public float[] getParams() {
            return this.b;
        }

        public char getType() {
            return this.a;
        }

        public void interpolatePathDataNode(@NonNull PathDataNode pathParser$PathDataNode0, @NonNull PathDataNode pathParser$PathDataNode1, float f) {
            this.a = pathParser$PathDataNode0.a;
            for(int v = 0; true; ++v) {
                float[] arr_f = pathParser$PathDataNode0.b;
                if(v >= arr_f.length) {
                    break;
                }
                this.b[v] = pathParser$PathDataNode1.b[v] * f + (1.0f - f) * arr_f[v];
            }
        }

        @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
        @Deprecated
        public static void nodesToPath(@NonNull PathDataNode[] arr_pathParser$PathDataNode, @NonNull Path path0) {
            PathParser.nodesToPath(arr_pathParser$PathDataNode, path0);
        }
    }

    public static float[] a(int v, float[] arr_f) {
        if(v < 0) {
            throw new IllegalArgumentException();
        }
        if(arr_f.length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        float[] arr_f1 = new float[v];
        System.arraycopy(arr_f, 0, arr_f1, 0, Math.min(v, arr_f.length));
        return arr_f1;
    }

    public static boolean canMorph(@Nullable PathDataNode[] arr_pathParser$PathDataNode, @Nullable PathDataNode[] arr_pathParser$PathDataNode1) {
        if(arr_pathParser$PathDataNode == null || arr_pathParser$PathDataNode1 == null || arr_pathParser$PathDataNode.length != arr_pathParser$PathDataNode1.length) {
            return false;
        }
        int v = 0;
        while(v < arr_pathParser$PathDataNode.length) {
            PathDataNode pathParser$PathDataNode0 = arr_pathParser$PathDataNode[v];
            int v1 = pathParser$PathDataNode0.a;
            PathDataNode pathParser$PathDataNode1 = arr_pathParser$PathDataNode1[v];
            if(v1 == pathParser$PathDataNode1.a && pathParser$PathDataNode0.b.length == pathParser$PathDataNode1.b.length) {
                ++v;
                continue;
            }
            return false;
        }
        return true;
    }

    @NonNull
    public static PathDataNode[] createNodesFromPathData(@NonNull String s) {
        float[] arr_f1;
        ArrayList arrayList0 = new ArrayList();
        int v = 0;
        int v1 = 1;
        while(v1 < s.length()) {
            while(v1 < s.length()) {
                int v2 = s.charAt(v1);
                if(((v2 - 90) * (v2 - 65) <= 0 || (v2 - 0x7A) * (v2 - 97) <= 0) && v2 != 101 && v2 != 69) {
                    break;
                }
                ++v1;
            }
            String s1 = s.substring(v, v1).trim();
            if(!s1.isEmpty()) {
                if(s1.charAt(0) == 90 || s1.charAt(0) == 0x7A) {
                    arr_f1 = new float[0];
                }
                else {
                    try {
                        float[] arr_f = new float[s1.length()];
                        int v3 = s1.length();
                        int v4 = 0;
                        for(int v5 = 1; v5 < v3; v5 = z3 ? v6 : v6 + 1) {
                            boolean z = false;
                            boolean z1 = false;
                            boolean z2 = false;
                            boolean z3 = false;
                            int v6;
                            for(v6 = v5; v6 < s1.length(); ++v6) {
                                switch(s1.charAt(v6)) {
                                    case 0x20: 
                                    case 44: {
                                        z = false;
                                        z2 = true;
                                        break;
                                    }
                                    case 45: {
                                        if(v6 == v5 || z) {
                                            z = false;
                                            break;
                                        }
                                        z = false;
                                        z2 = true;
                                        z3 = true;
                                        break;
                                    }
                                    case 46: {
                                        if(!z1) {
                                            z = false;
                                            z1 = true;
                                            break;
                                        }
                                        z = false;
                                        z2 = true;
                                        z3 = true;
                                        break;
                                    }
                                    case 69: 
                                    case 101: {
                                        z = true;
                                        break;
                                    }
                                    default: {
                                        z = false;
                                    }
                                }
                                if(z2) {
                                    break;
                                }
                            }
                            if(v5 < v6) {
                                arr_f[v4] = Float.parseFloat(s1.substring(v5, v6));
                                ++v4;
                            }
                        }
                        arr_f1 = PathParser.a(v4, arr_f);
                        goto label_57;
                    }
                    catch(NumberFormatException numberFormatException0) {
                    }
                    throw new RuntimeException("error in parsing \"" + s1 + "\"", numberFormatException0);
                }
            label_57:
                arrayList0.add(new PathDataNode(s1.charAt(0), arr_f1));
            }
            v = v1;
            ++v1;
        }
        if(v1 - v == 1 && v < s.length()) {
            arrayList0.add(new PathDataNode(s.charAt(v), new float[0]));
        }
        return (PathDataNode[])arrayList0.toArray(new PathDataNode[0]);
    }

    @NonNull
    public static Path createPathFromPathData(@NonNull String s) {
        Path path0 = new Path();
        PathDataNode[] arr_pathParser$PathDataNode = PathParser.createNodesFromPathData(s);
        try {
            PathDataNode.nodesToPath(arr_pathParser$PathDataNode, path0);
            return path0;
        }
        catch(RuntimeException runtimeException0) {
            throw new RuntimeException("Error in parsing " + s, runtimeException0);
        }
    }

    @NonNull
    public static PathDataNode[] deepCopyNodes(@NonNull PathDataNode[] arr_pathParser$PathDataNode) {
        PathDataNode[] arr_pathParser$PathDataNode1 = new PathDataNode[arr_pathParser$PathDataNode.length];
        for(int v = 0; v < arr_pathParser$PathDataNode.length; ++v) {
            arr_pathParser$PathDataNode1[v] = new PathDataNode(arr_pathParser$PathDataNode[v]);
        }
        return arr_pathParser$PathDataNode1;
    }

    public static void interpolatePathDataNodes(@NonNull PathDataNode[] arr_pathParser$PathDataNode, float f, @NonNull PathDataNode[] arr_pathParser$PathDataNode1, @NonNull PathDataNode[] arr_pathParser$PathDataNode2) {
        if(!PathParser.interpolatePathDataNodes(arr_pathParser$PathDataNode, arr_pathParser$PathDataNode1, arr_pathParser$PathDataNode2, f)) {
            throw new IllegalArgumentException("Can\'t interpolate between two incompatible pathData");
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static boolean interpolatePathDataNodes(@NonNull PathDataNode[] arr_pathParser$PathDataNode, @NonNull PathDataNode[] arr_pathParser$PathDataNode1, @NonNull PathDataNode[] arr_pathParser$PathDataNode2, float f) {
        if(arr_pathParser$PathDataNode.length != arr_pathParser$PathDataNode1.length || arr_pathParser$PathDataNode1.length != arr_pathParser$PathDataNode2.length) {
            throw new IllegalArgumentException("The nodes to be interpolated and resulting nodes must have the same length");
        }
        if(!PathParser.canMorph(arr_pathParser$PathDataNode1, arr_pathParser$PathDataNode2)) {
            return false;
        }
        for(int v = 0; v < arr_pathParser$PathDataNode.length; ++v) {
            arr_pathParser$PathDataNode[v].interpolatePathDataNode(arr_pathParser$PathDataNode1[v], arr_pathParser$PathDataNode2[v], f);
        }
        return true;
    }

    public static void nodesToPath(@NonNull PathDataNode[] arr_pathParser$PathDataNode, @NonNull Path path0) {
        int v7;
        int v6;
        int v5;
        float f15;
        float f14;
        float f34;
        float f33;
        float f27;
        float f26;
        float f25;
        float f24;
        float f21;
        float f20;
        PathDataNode pathParser$PathDataNode1;
        int v3;
        float f = 0.0f;
        float f1 = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        int v = 0;
        int v1 = 109;
        while(v < arr_pathParser$PathDataNode.length) {
            PathDataNode pathParser$PathDataNode0 = arr_pathParser$PathDataNode[v];
            int v2 = pathParser$PathDataNode0.a;
            float f6 = f;
            float f7 = f1;
            float f8 = f2;
            float f9 = f3;
            switch(v2) {
                case 65: 
                case 97: {
                    v3 = 7;
                    break;
                }
                case 67: 
                case 99: {
                    v3 = 6;
                    break;
                }
                case 81: 
                case 83: 
                case 0x71: 
                case 0x73: {
                    v3 = 4;
                    break;
                }
                case 72: 
                case 86: 
                case 104: 
                case 0x76: {
                    v3 = 1;
                    break;
                }
                case 90: 
                case 0x7A: {
                    path0.close();
                    path0.moveTo(f4, f5);
                    f6 = f4;
                    f8 = f6;
                    f7 = f5;
                    f9 = f7;
                    v3 = 2;
                    break;
                }
                default: {
                    v3 = 2;
                }
            }
            float f10 = f4;
            float f11 = f5;
            float f12 = f6;
            float f13 = f7;
            int v4 = 0;
            while(true) {
                float[] arr_f = pathParser$PathDataNode0.b;
                if(v4 >= arr_f.length) {
                    break;
                }
                switch(v2) {
                    case 65: {
                        v5 = v4;
                        v6 = 65;
                        v7 = v;
                        pathParser$PathDataNode1 = pathParser$PathDataNode0;
                        PathDataNode.a(path0, f12, f13, arr_f[v5 + 5], arr_f[v5 + 6], arr_f[v5], arr_f[v5 + 1], arr_f[v5 + 2], arr_f[v5 + 3] != 0.0f, arr_f[v5 + 4] != 0.0f);
                        f12 = arr_f[v5 + 5];
                        f13 = arr_f[v5 + 6];
                        f9 = f13;
                        f8 = f12;
                        break;
                    }
                    case 67: {
                        v5 = v4;
                        v6 = 67;
                        v7 = v;
                        pathParser$PathDataNode1 = pathParser$PathDataNode0;
                        path0.cubicTo(arr_f[v5], arr_f[v5 + 1], arr_f[v5 + 2], arr_f[v5 + 3], arr_f[v5 + 4], arr_f[v5 + 5]);
                        f12 = arr_f[v5 + 4];
                        f13 = arr_f[v5 + 5];
                        f8 = arr_f[v5 + 2];
                        f9 = arr_f[v5 + 3];
                        break;
                    }
                    case 72: {
                        v5 = v4;
                        v6 = 72;
                        v7 = v;
                        pathParser$PathDataNode1 = pathParser$PathDataNode0;
                        path0.lineTo(arr_f[v5], f13);
                        f12 = arr_f[v5];
                        break;
                    }
                    case 76: {
                        v5 = v4;
                        path0.lineTo(arr_f[v5], arr_f[v5 + 1]);
                        f12 = arr_f[v5];
                        f13 = arr_f[v5 + 1];
                        v6 = 76;
                        v7 = v;
                        pathParser$PathDataNode1 = pathParser$PathDataNode0;
                        break;
                    }
                    case 77: {
                        v5 = v4;
                        f12 = arr_f[v5];
                        f13 = arr_f[v5 + 1];
                        if(v5 > 0) {
                            path0.lineTo(f12, f13);
                        }
                        else {
                            path0.moveTo(f12, f13);
                            f11 = f13;
                            f10 = f12;
                        }
                        v6 = 77;
                        v7 = v;
                        pathParser$PathDataNode1 = pathParser$PathDataNode0;
                        break;
                    }
                    case 81: {
                        v5 = v4;
                        v6 = 81;
                        v7 = v;
                        pathParser$PathDataNode1 = pathParser$PathDataNode0;
                        path0.quadTo(arr_f[v5], arr_f[v5 + 1], arr_f[v5 + 2], arr_f[v5 + 3]);
                        float f18 = arr_f[v5];
                        float f19 = arr_f[v5 + 1];
                        f12 = arr_f[v5 + 2];
                        f13 = arr_f[v5 + 3];
                        f8 = f18;
                        f9 = f19;
                        break;
                    }
                    case 83: {
                        v5 = v4;
                        if(v1 == 99 || v1 == 0x73 || v1 == 67 || v1 == 83) {
                            f21 = f13 * 2.0f - f9;
                            f20 = f12 * 2.0f - f8;
                        }
                        else {
                            f20 = f12;
                            f21 = f13;
                        }
                        path0.cubicTo(f20, f21, arr_f[v5], arr_f[v5 + 1], arr_f[v5 + 2], arr_f[v5 + 3]);
                        float f22 = arr_f[v5];
                        float f23 = arr_f[v5 + 1];
                        f12 = arr_f[v5 + 2];
                        f13 = arr_f[v5 + 3];
                        f9 = f23;
                        f8 = f22;
                        v6 = 83;
                        v7 = v;
                        pathParser$PathDataNode1 = pathParser$PathDataNode0;
                        break;
                    }
                    case 84: {
                        v5 = v4;
                        if(v1 == 81 || v1 == 84 || v1 == 0x71 || v1 == 0x74) {
                            f24 = f12 * 2.0f - f8;
                            f25 = f13 * 2.0f - f9;
                        }
                        else {
                            f24 = f12;
                            f25 = f13;
                        }
                        path0.quadTo(f24, f25, arr_f[v5], arr_f[v5 + 1]);
                        f26 = arr_f[v5];
                        f27 = arr_f[v5 + 1];
                        goto label_224;
                    }
                    case 86: {
                        v5 = v4;
                        v6 = 86;
                        v7 = v;
                        pathParser$PathDataNode1 = pathParser$PathDataNode0;
                        path0.lineTo(f12, arr_f[v5]);
                        f13 = arr_f[v5];
                        break;
                    }
                    case 97: {
                        v5 = v4;
                        v6 = 97;
                        pathParser$PathDataNode1 = pathParser$PathDataNode0;
                        v7 = v;
                        PathDataNode.a(path0, f12, f13, arr_f[v5 + 5] + f12, arr_f[v5 + 6] + f13, arr_f[v5], arr_f[v5 + 1], arr_f[v5 + 2], arr_f[v5 + 3] != 0.0f, arr_f[v5 + 4] != 0.0f);
                        f12 += arr_f[v5 + 5];
                        f13 += arr_f[v5 + 6];
                        f9 = f13;
                        f8 = f12;
                        break;
                    }
                    case 99: {
                        v5 = v4;
                        path0.rCubicTo(arr_f[v5], arr_f[v5 + 1], arr_f[v5 + 2], arr_f[v5 + 3], arr_f[v5 + 4], arr_f[v5 + 5]);
                        f24 = f12 + arr_f[v5 + 2];
                        f25 = f13 + arr_f[v5 + 3];
                        f26 = f12 + arr_f[v5 + 4];
                        f27 = arr_f[v5 + 5] + f13;
                        goto label_224;
                    }
                    case 104: {
                        v5 = v4;
                        path0.rLineTo(arr_f[v5], 0.0f);
                        f12 += arr_f[v5];
                        v6 = 104;
                        v7 = v;
                        pathParser$PathDataNode1 = pathParser$PathDataNode0;
                        break;
                    }
                    case 108: {
                        v5 = v4;
                        path0.rLineTo(arr_f[v5], arr_f[v5 + 1]);
                        f12 += arr_f[v5];
                        f13 += arr_f[v5 + 1];
                        v6 = 108;
                        v7 = v;
                        pathParser$PathDataNode1 = pathParser$PathDataNode0;
                        break;
                    }
                    case 109: {
                        v5 = v4;
                        float f28 = arr_f[v5];
                        f12 += f28;
                        float f29 = arr_f[v5 + 1];
                        f13 += f29;
                        if(v5 > 0) {
                            path0.rLineTo(f28, f29);
                        }
                        else {
                            path0.rMoveTo(f28, f29);
                            f11 = f13;
                            f10 = f12;
                        }
                        v6 = 109;
                        v7 = v;
                        pathParser$PathDataNode1 = pathParser$PathDataNode0;
                        break;
                    }
                    case 0x71: {
                        v5 = v4;
                        path0.rQuadTo(arr_f[v5], arr_f[v5 + 1], arr_f[v5 + 2], arr_f[v5 + 3]);
                        float f30 = f12 + arr_f[v5];
                        float f31 = arr_f[v5 + 1] + f13;
                        float f32 = f12 + arr_f[v5 + 2];
                        f13 += arr_f[v5 + 3];
                        f9 = f31;
                        f8 = f30;
                        v6 = 0x71;
                        v7 = v;
                        f12 = f32;
                        pathParser$PathDataNode1 = pathParser$PathDataNode0;
                        break;
                    }
                    case 0x73: {
                        if(v1 == 99 || v1 == 0x73 || v1 == 67 || v1 == 83) {
                            f33 = f13 - f9;
                            f34 = f12 - f8;
                        }
                        else {
                            f33 = 0.0f;
                            f34 = 0.0f;
                        }
                        v5 = v4;
                        path0.rCubicTo(f34, f33, arr_f[v4], arr_f[v4 + 1], arr_f[v4 + 2], arr_f[v4 + 3]);
                        f24 = f12 + arr_f[v5];
                        f25 = f13 + arr_f[v4 + 1];
                        f26 = f12 + arr_f[v4 + 2];
                        f27 = arr_f[v4 + 3] + f13;
                    label_224:
                        f9 = f25;
                        f8 = f24;
                        v6 = v2;
                        v7 = v;
                        f12 = f26;
                        f13 = f27;
                        pathParser$PathDataNode1 = pathParser$PathDataNode0;
                        break;
                    }
                    case 0x76: {
                        v5 = v4;
                        path0.rLineTo(0.0f, arr_f[v5]);
                        f13 += arr_f[v5];
                        v6 = 0x76;
                        v7 = v;
                        pathParser$PathDataNode1 = pathParser$PathDataNode0;
                        break;
                    }
                    default: {
                        if(v2 == 0x74) {
                            if(v1 == 0x71 || v1 == 0x74 || v1 == 81 || v1 == 84) {
                                f15 = f12 - f8;
                                f14 = f13 - f9;
                            }
                            else {
                                f14 = 0.0f;
                                f15 = 0.0f;
                            }
                            path0.rQuadTo(f15, f14, arr_f[v4], arr_f[v4 + 1]);
                            float f16 = f15 + f12;
                            float f17 = f14 + f13;
                            f12 += arr_f[v4];
                            f13 += arr_f[v4 + 1];
                            f9 = f17;
                            v5 = v4;
                            v6 = 0x74;
                            v7 = v;
                            f8 = f16;
                        }
                        else {
                            v5 = v4;
                            v6 = v2;
                            v7 = v;
                        }
                        pathParser$PathDataNode1 = pathParser$PathDataNode0;
                        break;
                    }
                }
                v4 = v5 + v3;
                pathParser$PathDataNode0 = pathParser$PathDataNode1;
                v1 = v6;
                v2 = v1;
                v = v7;
            }
            f = f12;
            f1 = f13;
            f2 = f8;
            f3 = f9;
            f4 = f10;
            f5 = f11;
            v1 = pathParser$PathDataNode0.a;
            ++v;
        }
    }

    public static void updateNodes(@NonNull PathDataNode[] arr_pathParser$PathDataNode, @NonNull PathDataNode[] arr_pathParser$PathDataNode1) {
        for(int v = 0; v < arr_pathParser$PathDataNode1.length; ++v) {
            arr_pathParser$PathDataNode[v].a = arr_pathParser$PathDataNode1[v].a;
            for(int v1 = 0; true; ++v1) {
                float[] arr_f = arr_pathParser$PathDataNode1[v].b;
                if(v1 >= arr_f.length) {
                    break;
                }
                arr_pathParser$PathDataNode[v].b[v1] = arr_f[v1];
            }
        }
    }
}

