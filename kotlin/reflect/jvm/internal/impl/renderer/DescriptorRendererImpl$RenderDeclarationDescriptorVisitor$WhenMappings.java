package kotlin.reflect.jvm.internal.impl.renderer;

public final class DescriptorRendererImpl.RenderDeclarationDescriptorVisitor.WhenMappings {
    public static final int[] $EnumSwitchMapping$0;

    static {
        int[] arr_v = new int[PropertyAccessorRenderingPolicy.values().length];
        try {
            arr_v[PropertyAccessorRenderingPolicy.PRETTY.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[PropertyAccessorRenderingPolicy.DEBUG.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[PropertyAccessorRenderingPolicy.NONE.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        DescriptorRendererImpl.RenderDeclarationDescriptorVisitor.WhenMappings.$EnumSwitchMapping$0 = arr_v;
    }
}

