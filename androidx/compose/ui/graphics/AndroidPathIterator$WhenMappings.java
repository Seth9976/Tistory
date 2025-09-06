package androidx.compose.ui.graphics;

import kotlin.Metadata;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
public final class AndroidPathIterator.WhenMappings {
    public static final int[] $EnumSwitchMapping$0;
    public static final int[] $EnumSwitchMapping$1;

    static {
        int[] arr_v = new int[ConicEvaluation.values().length];
        try {
            arr_v[ConicEvaluation.AsConic.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[ConicEvaluation.AsQuadratics.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        AndroidPathIterator.WhenMappings.$EnumSwitchMapping$0 = arr_v;
        int[] arr_v1 = new int[Type.values().length];
        try {
            arr_v1[Type.Move.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v1[Type.Line.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v1[Type.Quadratic.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v1[Type.Conic.ordinal()] = 4;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v1[Type.Cubic.ordinal()] = 5;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        AndroidPathIterator.WhenMappings.$EnumSwitchMapping$1 = arr_v1;
    }
}

