package androidx.compose.ui.graphics;

import androidx.graphics.path.PathSegment.Type;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A)\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/graphics/Path;", "path", "Landroidx/compose/ui/graphics/PathIterator$ConicEvaluation;", "conicEvaluation", "", "tolerance", "Landroidx/compose/ui/graphics/PathIterator;", "PathIterator", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/PathIterator$ConicEvaluation;F)Landroidx/compose/ui/graphics/PathIterator;", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class AndroidPathIterator_androidKt {
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
    public static final PathIterator PathIterator(@NotNull Path path0, @NotNull ConicEvaluation pathIterator$ConicEvaluation0, float f) {
        return new a(path0, pathIterator$ConicEvaluation0, f);
    }

    public static PathIterator PathIterator$default(Path path0, ConicEvaluation pathIterator$ConicEvaluation0, float f, int v, Object object0) {
        if((v & 2) != 0) {
            pathIterator$ConicEvaluation0 = ConicEvaluation.AsQuadratics;
        }
        if((v & 4) != 0) {
            f = 0.25f;
        }
        return AndroidPathIterator_androidKt.PathIterator(path0, pathIterator$ConicEvaluation0, f);
    }

    public static final androidx.compose.ui.graphics.PathSegment.Type access$toPathSegmentType(Type pathSegment$Type0) {
        switch(WhenMappings.$EnumSwitchMapping$0[pathSegment$Type0.ordinal()]) {
            case 1: {
                return androidx.compose.ui.graphics.PathSegment.Type.Move;
            }
            case 2: {
                return androidx.compose.ui.graphics.PathSegment.Type.Line;
            }
            case 3: {
                return androidx.compose.ui.graphics.PathSegment.Type.Quadratic;
            }
            case 4: {
                return androidx.compose.ui.graphics.PathSegment.Type.Conic;
            }
            case 5: {
                return androidx.compose.ui.graphics.PathSegment.Type.Cubic;
            }
            case 6: {
                return androidx.compose.ui.graphics.PathSegment.Type.Close;
            }
            case 7: {
                return androidx.compose.ui.graphics.PathSegment.Type.Done;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }
}

