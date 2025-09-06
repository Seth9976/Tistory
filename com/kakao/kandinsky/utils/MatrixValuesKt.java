package com.kakao.kandinsky.utils;

import android.graphics.Matrix;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.ImmutableList;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\u000F\u0010\u0000\u001A\u00020\u0001*\u00020\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"getMatrixValues", "Lcom/kakao/kandinsky/utils/MatrixValues;", "Landroid/graphics/Matrix;", "(Landroid/graphics/Matrix;)Lkotlinx/collections/immutable/ImmutableList;", "utils_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nMatrixValues.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MatrixValues.kt\ncom/kakao/kandinsky/utils/MatrixValuesKt\n+ 2 Matrix.kt\nandroidx/core/graphics/MatrixKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,21:1\n32#2:22\n1#3:23\n*S KotlinDebug\n*F\n+ 1 MatrixValues.kt\ncom/kakao/kandinsky/utils/MatrixValuesKt\n*L\n21#1:22\n21#1:23\n*E\n"})
public final class MatrixValuesKt {
    @NotNull
    public static final ImmutableList getMatrixValues(@NotNull Matrix matrix0) {
        Intrinsics.checkNotNullParameter(matrix0, "<this>");
        float[] arr_f = new float[9];
        matrix0.getValues(arr_f);
        return MatrixValues.constructor-impl(ExtensionsKt.toPersistentList(ArraysKt___ArraysKt.toList(arr_f)));
    }
}

