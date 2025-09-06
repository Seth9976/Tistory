package com.kakao.kandinsky.utils;

import android.graphics.Matrix;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001A\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A+\u0010\u0000\u001A\u00020\u00012\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00012\u0017\u0010\u0003\u001A\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006\u001A\n\u0010\u0007\u001A\u00020\u0001*\u00020\u0001\u001A\n\u0010\b\u001A\u00020\u0001*\u00020\u0001¨\u0006\t"}, d2 = {"buildMatrix", "Landroid/graphics/Matrix;", "matrix", "builder", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "copy", "invert", "utils_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class MatrixExtensionKt {
    @NotNull
    public static final Matrix buildMatrix(@Nullable Matrix matrix0, @NotNull Function1 function10) {
        Matrix matrix1;
        Intrinsics.checkNotNullParameter(function10, "builder");
        if(matrix0 == null) {
            matrix1 = new Matrix();
        }
        else {
            matrix1 = MatrixExtensionKt.copy(matrix0);
            if(matrix1 == null) {
                matrix1 = new Matrix();
            }
        }
        function10.invoke(matrix1);
        return matrix1;
    }

    public static Matrix buildMatrix$default(Matrix matrix0, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            matrix0 = null;
        }
        return MatrixExtensionKt.buildMatrix(matrix0, function10);
    }

    @NotNull
    public static final Matrix copy(@NotNull Matrix matrix0) {
        Intrinsics.checkNotNullParameter(matrix0, "<this>");
        return new Matrix(matrix0);
    }

    @NotNull
    public static final Matrix invert(@NotNull Matrix matrix0) {
        Intrinsics.checkNotNullParameter(matrix0, "<this>");
        Matrix matrix1 = new Matrix();
        matrix0.invert(matrix1);
        return matrix1;
    }
}

