package a;

import com.kakao.kandinsky.home.contract.HomeMenu;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

public abstract class s1 {
    public static final EnumEntries a;

    static {
        s1.a = EnumEntriesKt.enumEntries(HomeMenu.values());
    }
}

