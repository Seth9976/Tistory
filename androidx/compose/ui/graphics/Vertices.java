package androidx.compose.ui.graphics;

import androidx.compose.material3.h8;
import androidx.compose.ui.geometry.Offset;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0014\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\u0017\n\u0002\b\u0005\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001A\b\u0012\u0004\u0012\u00020\b0\u0004\u0012\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\n0\u0004¢\u0006\u0004\b\f\u0010\rR\u001D\u0010\u0003\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000E\u0010\u000F\u001A\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0006\u001A\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0007\u001A\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001A\u0004\b\u0018\u0010\u0016R\u0017\u0010\t\u001A\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\u001DR\u0017\u0010\u000B\u001A\u00020\u001E8\u0006¢\u0006\f\n\u0004\b\u001F\u0010 \u001A\u0004\b!\u0010\"\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006#"}, d2 = {"Landroidx/compose/ui/graphics/Vertices;", "", "Landroidx/compose/ui/graphics/VertexMode;", "vertexMode", "", "Landroidx/compose/ui/geometry/Offset;", "positions", "textureCoordinates", "Landroidx/compose/ui/graphics/Color;", "colors", "", "indices", "<init>", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "I", "getVertexMode-c2xauaI", "()I", "", "b", "[F", "getPositions", "()[F", "c", "getTextureCoordinates", "", "d", "[I", "getColors", "()[I", "", "e", "[S", "getIndices", "()[S", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nVertices.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Vertices.kt\nandroidx/compose/ui/graphics/Vertices\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,76:1\n101#2,2:77\n33#2,6:79\n103#2:85\n*S KotlinDebug\n*F\n+ 1 Vertices.kt\nandroidx/compose/ui/graphics/Vertices\n*L\n42#1:77,2\n42#1:79,6\n42#1:85\n*E\n"})
public final class Vertices {
    public final int a;
    public final float[] b;
    public final float[] c;
    public final int[] d;
    public final short[] e;

    public Vertices(int v, List list0, List list1, List list2, List list3, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = v;
        h8 h80 = new h8(list0, 4);
        if(list1.size() != list0.size()) {
            throw new IllegalArgumentException("positions and textureCoordinates lengths must match.");
        }
        if(list2.size() != list0.size()) {
            throw new IllegalArgumentException("positions and colors lengths must match.");
        }
        int v1 = list3.size();
        for(int v3 = 0; v3 < v1; ++v3) {
            if(((Boolean)h80.invoke(list3.get(v3))).booleanValue()) {
                throw new IllegalArgumentException("indices values must be valid indices in the positions list.");
            }
        }
        this.b = Vertices.a(list0);
        this.c = Vertices.a(list1);
        int v4 = list2.size();
        int[] arr_v = new int[v4];
        for(int v5 = 0; v5 < v4; ++v5) {
            arr_v[v5] = ColorKt.toArgb-8_81llA(((Color)list2.get(v5)).unbox-impl());
        }
        this.d = arr_v;
        int v6 = list3.size();
        short[] arr_v1 = new short[v6];
        for(int v2 = 0; v2 < v6; ++v2) {
            arr_v1[v2] = (short)((Number)list3.get(v2)).intValue();
        }
        this.e = arr_v1;
    }

    public static float[] a(List list0) {
        int v = list0.size();
        float[] arr_f = new float[v * 2];
        for(int v1 = 0; v1 < v * 2; ++v1) {
            long v2 = ((Offset)list0.get(v1 / 2)).unbox-impl();
            arr_f[v1] = v1 % 2 == 0 ? Offset.getX-impl(v2) : Offset.getY-impl(v2);
        }
        return arr_f;
    }

    @NotNull
    public final int[] getColors() {
        return this.d;
    }

    @NotNull
    public final short[] getIndices() {
        return this.e;
    }

    @NotNull
    public final float[] getPositions() {
        return this.b;
    }

    @NotNull
    public final float[] getTextureCoordinates() {
        return this.c;
    }

    public final int getVertexMode-c2xauaI() {
        return this.a;
    }
}

