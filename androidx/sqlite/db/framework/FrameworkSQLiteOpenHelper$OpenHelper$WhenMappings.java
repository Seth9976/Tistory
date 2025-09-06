package androidx.sqlite.db.framework;

import kotlin.Metadata;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
public final class FrameworkSQLiteOpenHelper.OpenHelper.WhenMappings {
    public static final int[] $EnumSwitchMapping$0;

    static {
        int[] arr_v = new int[FrameworkSQLiteOpenHelper.OpenHelper.CallbackName.values().length];
        try {
            arr_v[FrameworkSQLiteOpenHelper.OpenHelper.CallbackName.ON_CONFIGURE.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[FrameworkSQLiteOpenHelper.OpenHelper.CallbackName.ON_CREATE.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[FrameworkSQLiteOpenHelper.OpenHelper.CallbackName.ON_UPGRADE.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[FrameworkSQLiteOpenHelper.OpenHelper.CallbackName.ON_DOWNGRADE.ordinal()] = 4;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[FrameworkSQLiteOpenHelper.OpenHelper.CallbackName.ON_OPEN.ordinal()] = 5;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        FrameworkSQLiteOpenHelper.OpenHelper.WhenMappings.$EnumSwitchMapping$0 = arr_v;
    }
}

