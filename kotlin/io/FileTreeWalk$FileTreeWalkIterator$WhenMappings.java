package kotlin.io;

import kotlin.Metadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
public final class FileTreeWalk.FileTreeWalkIterator.WhenMappings {
    public static final int[] $EnumSwitchMapping$0;

    static {
        int[] arr_v = new int[FileWalkDirection.values().length];
        try {
            arr_v[FileWalkDirection.TOP_DOWN.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[FileWalkDirection.BOTTOM_UP.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        FileTreeWalk.FileTreeWalkIterator.WhenMappings.$EnumSwitchMapping$0 = arr_v;
    }
}

