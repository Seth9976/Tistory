package com.kakao.kandinsky.designsystem.util;

import android.graphics.Matrix;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001A\n\u0010\u0000\u001A\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"getTransform", "Lcom/kakao/kandinsky/designsystem/util/Transform;", "Landroid/graphics/Matrix;", "designsystem_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nMatrixTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MatrixTransform.kt\ncom/kakao/kandinsky/designsystem/util/MatrixTransformKt\n+ 2 Matrix.kt\nandroidx/core/graphics/MatrixKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,54:1\n32#2:55\n1#3:56\n*S KotlinDebug\n*F\n+ 1 MatrixTransform.kt\ncom/kakao/kandinsky/designsystem/util/MatrixTransformKt\n*L\n28#1:55\n28#1:56\n*E\n"})
public final class MatrixTransformKt {
    @NotNull
    public static final Transform getTransform(@NotNull Matrix matrix0) {
        Intrinsics.checkNotNullParameter(matrix0, "<this>");
        float[] arr_f = new float[9];
        matrix0.getValues(arr_f);
        Pair pair0 = TuplesKt.to(((float)arr_f[2]), ((float)arr_f[5]));
        float f = ((Number)pair0.component1()).floatValue();
        float f1 = ((Number)pair0.component2()).floatValue();
        boolean z = false;
        float f2 = arr_f[0];
        int v = 1;
        float f3 = arr_f[1];
        float f4 = arr_f[4];
        float f5 = arr_f[3];
        if(f2 * f4 - f3 * f5 < 0.0f) {
            z = true;
        }
        float f6 = ((float)Math.sqrt(((float)Math.pow(f2, 2.0)) + ((float)Math.pow(f5, 2.0)))) * ((float)(!z || f2 >= f4 ? 1 : -1));
        float f7 = (float)Math.sqrt(((float)Math.pow(f4, 2.0)) + ((float)Math.pow(f3, 2.0)));
        if(z && f2 >= f4) {
            v = -1;
        }
        return new Transform(f, f1, ((float)Math.toDegrees(((float)Math.atan2(f5 / f6, f2 / f6)))), f6, f7 * ((float)v));
    }
}

