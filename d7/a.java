package d7;

import java.util.regex.Pattern;

public abstract class a {
    public static final Pattern a;

    static {
        a.a = Pattern.compile("\\\\u[0-9a-fA-F]{4}");
    }
}

