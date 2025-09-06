package androidx.room;

import android.content.Context;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001J1\u0010\b\u001A\u00028\u0000\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0007\u001A\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJ5\u0010\u000E\u001A\b\u0012\u0004\u0012\u00028\u00000\r\"\b\b\u0000\u0010\u0002*\u00020\n2\u0006\u0010\f\u001A\u00020\u000B2\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0007¢\u0006\u0004\b\u000E\u0010\u000FJ?\u0010\u0011\u001A\b\u0012\u0004\u0012\u00028\u00000\r\"\b\b\u0000\u0010\u0002*\u00020\n2\u0006\u0010\f\u001A\u00020\u000B2\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0010\u0010\u001A\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001A\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001A\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/room/Room;", "", "T", "C", "Ljava/lang/Class;", "klass", "", "suffix", "getGeneratedImplementation", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;", "Landroidx/room/RoomDatabase;", "Landroid/content/Context;", "context", "Landroidx/room/RoomDatabase$Builder;", "inMemoryDatabaseBuilder", "(Landroid/content/Context;Ljava/lang/Class;)Landroidx/room/RoomDatabase$Builder;", "name", "databaseBuilder", "(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;)Landroidx/room/RoomDatabase$Builder;", "LOG_TAG", "Ljava/lang/String;", "MASTER_TABLE_NAME", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class Room {
    @NotNull
    public static final Room INSTANCE = null;
    @NotNull
    public static final String LOG_TAG = "ROOM";
    @NotNull
    public static final String MASTER_TABLE_NAME = "room_master_table";

    static {
        Room.INSTANCE = new Room();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @JvmStatic
    @NotNull
    public static final Builder databaseBuilder(@NotNull Context context0, @NotNull Class class0, @Nullable String s) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(class0, "klass");
        if(s == null || p.isBlank(s)) {
            throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        return new Builder(context0, class0, s);
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @JvmStatic
    public static final Object getGeneratedImplementation(@NotNull Class class0, @NotNull String s) {
        Intrinsics.checkNotNullParameter(class0, "klass");
        Intrinsics.checkNotNullParameter(s, "suffix");
        Package package0 = class0.getPackage();
        Intrinsics.checkNotNull(package0);
        String s1 = package0.getName();
        String s2 = class0.getCanonicalName();
        Intrinsics.checkNotNull(s2);
        Intrinsics.checkNotNullExpressionValue(s1, "fullPackage");
        if(s1.length() != 0) {
            s2 = s2.substring(s1.length() + 1);
            Intrinsics.checkNotNullExpressionValue(s2, "this as java.lang.String).substring(startIndex)");
        }
        String s3 = a.o(new StringBuilder(), p.replace$default(s2, '.', '_', false, 4, null), s);
        try {
            Class class1 = Class.forName((s1.length() == 0 ? s3 : s1 + '.' + s3), true, class0.getClassLoader());
            Intrinsics.checkNotNull(class1, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
            return class1.getDeclaredConstructor(null).newInstance(null);
        }
        catch(ClassNotFoundException unused_ex) {
            throw new RuntimeException("Cannot find implementation for " + class0.getCanonicalName() + ". " + s3 + " does not exist");
        }
        catch(IllegalAccessException unused_ex) {
            throw new RuntimeException("Cannot access the constructor " + class0.getCanonicalName());
        }
        catch(InstantiationException unused_ex) {
            throw new RuntimeException("Failed to create an instance of " + class0.getCanonicalName());
        }
    }

    @JvmStatic
    @NotNull
    public static final Builder inMemoryDatabaseBuilder(@NotNull Context context0, @NotNull Class class0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(class0, "klass");
        return new Builder(context0, class0, null);
    }
}

