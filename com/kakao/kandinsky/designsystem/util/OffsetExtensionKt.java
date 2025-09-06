package com.kakao.kandinsky.designsystem.util;

import android.graphics.Matrix;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001E\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0003\u001A\u0014\u0010\u0000\u001A\u00020\u0001*\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001A\u000F\u0010\u0005\u001A\u00020\u0002*\u00020\u0006¢\u0006\u0002\u0010\u0007\u001A\u001C\u0010\b\u001A\u00020\u0002*\u00020\u00062\u0006\u0010\t\u001A\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000B\u001A\u001E\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u00020\r*\u00020\u00062\f\u0010\t\u001A\b\u0012\u0004\u0012\u00020\u00020\r\u001A\u001C\u0010\u000E\u001A\u00020\u0002*\u00020\u00062\u0006\u0010\t\u001A\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u000F\u0010\u000B\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0010"}, d2 = {"atan2", "", "Landroidx/compose/ui/geometry/Offset;", "atan2-k-4lQ0M", "(J)F", "getTransition", "Landroid/graphics/Matrix;", "(Landroid/graphics/Matrix;)J", "mapOffset", "offset", "mapOffset-Uv8p0NA", "(Landroid/graphics/Matrix;J)J", "mapOffsets", "", "mapVector", "mapVector-Uv8p0NA", "designsystem_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nOffsetExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OffsetExtension.kt\ncom/kakao/kandinsky/designsystem/util/OffsetExtensionKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Matrix.kt\nandroidx/core/graphics/MatrixKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,35:1\n1549#2:36\n1620#2,3:37\n32#3:40\n1#4:41\n*S KotlinDebug\n*F\n+ 1 OffsetExtension.kt\ncom/kakao/kandinsky/designsystem/util/OffsetExtensionKt\n*L\n20#1:36\n20#1:37,3\n28#1:40\n28#1:41\n*E\n"})
public final class OffsetExtensionKt {
    public static final float atan2-k-4lQ0M(long v) {
        return (float)Math.atan2(Offset.getY-impl(v), Offset.getX-impl(v));
    }

    public static final long getTransition(@NotNull Matrix matrix0) {
        Intrinsics.checkNotNullParameter(matrix0, "<this>");
        float[] arr_f = new float[9];
        matrix0.getValues(arr_f);
        return OffsetKt.Offset(arr_f[2], arr_f[5]);
    }

    public static final long mapOffset-Uv8p0NA(@NotNull Matrix matrix0, long v) {
        Intrinsics.checkNotNullParameter(matrix0, "$this$mapOffset");
        float[] arr_f = {Offset.getX-impl(v), Offset.getY-impl(v)};
        matrix0.mapPoints(arr_f);
        return OffsetKt.Offset(arr_f[0], arr_f[1]);
    }

    @NotNull
    public static final List mapOffsets(@NotNull Matrix matrix0, @NotNull List list0) {
        Intrinsics.checkNotNullParameter(matrix0, "<this>");
        Intrinsics.checkNotNullParameter(list0, "offset");
        List list1 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
        for(Object object0: list0) {
            long v = ((Offset)object0).unbox-impl();
            float[] arr_f = {Offset.getX-impl(v), Offset.getY-impl(v)};
            matrix0.mapPoints(arr_f);
            list1.add(Offset.box-impl(OffsetKt.Offset(arr_f[0], arr_f[1])));
        }
        return list1;
    }

    public static final long mapVector-Uv8p0NA(@NotNull Matrix matrix0, long v) {
        Intrinsics.checkNotNullParameter(matrix0, "$this$mapVector");
        float[] arr_f = {Offset.getX-impl(v), Offset.getY-impl(v)};
        matrix0.mapVectors(arr_f);
        return OffsetKt.Offset(arr_f[0], arr_f[1]);
    }
}

