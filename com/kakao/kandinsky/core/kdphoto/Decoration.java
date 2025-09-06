package com.kakao.kandinsky.core.kdphoto;

import android.graphics.Matrix;
import androidx.compose.runtime.Immutable;
import com.kakao.kandinsky.utils.MatrixValues;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.Serializable;
import org.jetbrains.annotations.NotNull;

@Immutable
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00032\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/kakao/kandinsky/core/kdphoto/Decoration;", "", "Absolute", "Companion", "Relative", "Lcom/kakao/kandinsky/core/kdphoto/Decoration$Absolute;", "Lcom/kakao/kandinsky/core/kdphoto/Decoration$Relative;", "kdphoto_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@Serializable
public interface Decoration {
    @Immutable
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012R\u0014\u0010\u0002\u001A\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001A\u00020\u0007X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\b\u0010\tR\u0012\u0010\n\u001A\u00020\u000BX¦\u0004¢\u0006\u0006\u001A\u0004\b\f\u0010\rR\u0018\u0010\u000E\u001A\u00020\u000FX¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u0010\u0010\u0011\u0082\u0001\u0004\u0013\u0014\u0015\u0016\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Lcom/kakao/kandinsky/core/kdphoto/Decoration$Absolute;", "Lcom/kakao/kandinsky/core/kdphoto/Decoration;", "matrix", "Landroid/graphics/Matrix;", "getMatrix", "()Landroid/graphics/Matrix;", "matrixValues", "Lcom/kakao/kandinsky/utils/MatrixValues;", "getMatrixValues-pp_Gbr8", "()Lkotlinx/collections/immutable/ImmutableList;", "no", "", "getNo", "()I", "size", "Landroidx/compose/ui/geometry/Size;", "getSize-NH-jbRc", "()J", "Companion", "Lcom/kakao/kandinsky/core/kdphoto/Blur;", "Lcom/kakao/kandinsky/core/kdphoto/Mosaic;", "Lcom/kakao/kandinsky/core/kdphoto/Sticker;", "Lcom/kakao/kandinsky/core/kdphoto/Text;", "kdphoto_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @Serializable
    public interface Absolute extends Decoration {
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kakao/kandinsky/core/kdphoto/Decoration$Absolute$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kakao/kandinsky/core/kdphoto/Decoration$Absolute;", "serializer", "()Lkotlinx/serialization/KSerializer;", "kdphoto_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class Companion {
            public static final Companion a;

            static {
                Companion.a = new Companion();  // 初始化器: Ljava/lang/Object;-><init>()V
            }

            @NotNull
            public final KSerializer serializer() {
                return new SealedClassSerializer("com.kakao.kandinsky.core.kdphoto.Decoration.Absolute", Reflection.getOrCreateKotlinClass(Absolute.class), new KClass[]{Reflection.getOrCreateKotlinClass(Blur.class), Reflection.getOrCreateKotlinClass(Mosaic.class), Reflection.getOrCreateKotlinClass(Sticker.class), Reflection.getOrCreateKotlinClass(Text.class)}, new KSerializer[]{.serializer.INSTANCE, com.kakao.kandinsky.core.kdphoto.Mosaic..serializer.INSTANCE, com.kakao.kandinsky.core.kdphoto.Sticker..serializer.INSTANCE, com.kakao.kandinsky.core.kdphoto.Text..serializer.INSTANCE}, new Annotation[0]);
            }
        }

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
        public static final class DefaultImpls {
            @NotNull
            public static Matrix getMatrix(@NotNull Absolute decoration$Absolute0) {
                return MatrixValues.toMatrix-impl(decoration$Absolute0.getMatrixValues-pp_Gbr8());
            }
        }

        @NotNull
        public static final Companion Companion;

        static {
            Absolute.Companion = Companion.a;
        }

        @NotNull
        Matrix getMatrix();

        @NotNull
        ImmutableList getMatrixValues-pp_Gbr8();

        int getNo();

        long getSize-NH-jbRc();
    }

    @Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001A\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/kakao/kandinsky/core/kdphoto/Decoration$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kakao/kandinsky/core/kdphoto/Decoration;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "CORNER_RADIUS_PERCENT", "I", "kdphoto_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class com.kakao.kandinsky.core.kdphoto.Decoration.Companion {
        public static final int CORNER_RADIUS_PERCENT = 8;
        public static final com.kakao.kandinsky.core.kdphoto.Decoration.Companion a;

        static {
            com.kakao.kandinsky.core.kdphoto.Decoration.Companion.a = new com.kakao.kandinsky.core.kdphoto.Decoration.Companion();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        @NotNull
        public final KSerializer serializer() {
            return new SealedClassSerializer("com.kakao.kandinsky.core.kdphoto.Decoration", Reflection.getOrCreateKotlinClass(Decoration.class), new KClass[]{Reflection.getOrCreateKotlinClass(Blur.class), Reflection.getOrCreateKotlinClass(Mosaic.class), Reflection.getOrCreateKotlinClass(Sticker.class), Reflection.getOrCreateKotlinClass(Text.class), Reflection.getOrCreateKotlinClass(Border.class), Reflection.getOrCreateKotlinClass(Image.class), Reflection.getOrCreateKotlinClass(com.kakao.kandinsky.core.kdphoto.Signature.Text.class)}, new KSerializer[]{.serializer.INSTANCE, com.kakao.kandinsky.core.kdphoto.Mosaic..serializer.INSTANCE, com.kakao.kandinsky.core.kdphoto.Sticker..serializer.INSTANCE, com.kakao.kandinsky.core.kdphoto.Text..serializer.INSTANCE, com.kakao.kandinsky.core.kdphoto.Border..serializer.INSTANCE, com.kakao.kandinsky.core.kdphoto.Signature.Image..serializer.INSTANCE, com.kakao.kandinsky.core.kdphoto.Signature.Text..serializer.INSTANCE}, new Annotation[0]);
        }
    }

    @Immutable
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/kakao/kandinsky/core/kdphoto/Decoration$Relative;", "Lcom/kakao/kandinsky/core/kdphoto/Decoration;", "Lcom/kakao/kandinsky/core/kdphoto/Border;", "Lcom/kakao/kandinsky/core/kdphoto/Signature;", "kdphoto_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public interface Relative extends Decoration {
    }

    public static final int CORNER_RADIUS_PERCENT = 8;
    @NotNull
    public static final com.kakao.kandinsky.core.kdphoto.Decoration.Companion Companion;

    static {
        Decoration.Companion = com.kakao.kandinsky.core.kdphoto.Decoration.Companion.a;
    }
}

