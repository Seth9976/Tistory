package l3;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class b {
    public static final a[] a;
    public static final Pattern b;
    public static final Pattern c;
    public static final Pattern d;
    public static final Pattern e;
    public static final Pattern f;
    public static final Pattern g;

    static {
        b.a = new a[]{new a(99, 99, -1, -1), new a(35, 36, -1, -1), new a(71, 72, -1, -1), new a(0x60, 0x60, -1, -1), new a(85, 86, -1, -1), new a(90, 0x60, -1, -1), new a(80, 81, -1, -1), new a(6, 6, -1, -1), new a(20, 20, -1, -1), new a(19, 19, -1, -1), new a(0x20, 34, -1, -1), new a(0x60, 0x60, -1, -1), new a(30, 0x1F, -1, -1), new a(0x60, 0x60, -1, -1), new a(0x60, 0x60, -1, -1), new a(50, 52, -1, -1), new a(83, 83, -1, -1), new a(60, 62, -1, -1), new a(46, 0x2F, -1, -1), new a(66, 67, 73, -1), new a(40, 42, -1, -1), new a(70, 71, -1, -1), new a(1, 2, -1, -1), new a(20, 21, -1, -1), new a(3, 4, -1, -1), new a(0x60, 0x60, -1, -1), new a(0x30, 49, -1, -1), new a(55, 56, -1, -1), new a(0x3F, 65, -1, -1), new a(0x60, 0x60, -1, -1), new a(38, 39, -1, -1), new a(55, 56, -1, -1), new a(27, 28, -1, -1), new a(58, 58, -1, -1), new a(68, 69, -1, -1), new a(3, 4, -1, -1), new a(7, 8, -1, -1), new a(87, 88, 86, -1), new a(88, 89, 0x60, -1), new a(10, 14, 0, 6), new a(43, 45, -1, -1), new a(73, 74, -1, -1), new a(97, 97, -1, -1), new a(15, 19, -1, -1), new a(6, 6, 0, 9), new a(0x60, 0x60, -1, -1), new a(2, 2, -1, -1), new a(29, 29, -1, -1), new a(57, 57, -1, -1), new a(37, 38, -1, -1), new a(75, 0x4F, 87, 88), new a(84, 84, -1, -1), new a(22, 24, 20, -1), new a(6, 9, -1, -1), new a(5, 5, -1, -1), new a(98, 99, -1, -1), new a(53, 54, -1, -1), new a(24, 26, -1, -1), new a(82, 83, -1, -1)};
        b.b = Pattern.compile("[^,*•\t                　\n\u000B\f\r\u0085  ]+(?=[,*•\t                　\n\u000B\f\r\u0085  ]|$)", 2);
        b.c = Pattern.compile("(?:one|[0-9]+([a-z](?=[^a-z]|$)|st|nd|rd|th)?)(?:-(?:one|[0-9]+([a-z](?=[^a-z]|$)|st|nd|rd|th)?))*(?=[,\"\'\t                　\n\u000B\f\r\u0085  ]|$)", 2);
        b.d = Pattern.compile("(?:(ak|alaska)|(al|alabama)|(ar|arkansas)|(as|american[\t \u00A0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200A\u202F\u205F\u3000]+samoa)|(az|arizona)|(ca|california)|(co|colorado)|(ct|connecticut)|(dc|district[\t \u00A0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200A\u202F\u205F\u3000]+of[\t \u00A0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200A\u202F\u205F\u3000]+columbia)|(de|delaware)|(fl|florida)|(fm|federated[\t \u00A0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200A\u202F\u205F\u3000]+states[\t \u00A0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200A\u202F\u205F\u3000]+of[\t \u00A0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200A\u202F\u205F\u3000]+micronesia)|(ga|georgia)|(gu|guam)|(hi|hawaii)|(ia|iowa)|(id|idaho)|(il|illinois)|(in|indiana)|(ks|kansas)|(ky|kentucky)|(la|louisiana)|(ma|massachusetts)|(md|maryland)|(me|maine)|(mh|marshall[\t \u00A0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200A\u202F\u205F\u3000]+islands)|(mi|michigan)|(mn|minnesota)|(mo|missouri)|(mp|northern[\t \u00A0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200A\u202F\u205F\u3000]+mariana[\t \u00A0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200A\u202F\u205F\u3000]+islands)|(ms|mississippi)|(mt|montana)|(nc|north[\t \u00A0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200A\u202F\u205F\u3000]+carolina)|(nd|north[\t \u00A0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200A\u202F\u205F\u3000]+dakota)|(ne|nebraska)|(nh|new[\t \u00A0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200A\u202F\u205F\u3000]+hampshire)|(nj|new[\t \u00A0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200A\u202F\u205F\u3000]+jersey)|(nm|new[\t \u00A0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200A\u202F\u205F\u3000]+mexico)|(nv|nevada)|(ny|new[\t \u00A0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200A\u202F\u205F\u3000]+york)|(oh|ohio)|(ok|oklahoma)|(or|oregon)|(pa|pennsylvania)|(pr|puerto[\t \u00A0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200A\u202F\u205F\u3000]+rico)|(pw|palau)|(ri|rhode[\t \u00A0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200A\u202F\u205F\u3000]+island)|(sc|south[\t \u00A0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200A\u202F\u205F\u3000]+carolina)|(sd|south[\t \u00A0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200A\u202F\u205F\u3000]+dakota)|(tn|tennessee)|(tx|texas)|(ut|utah)|(va|virginia)|(vi|virgin[\t \u00A0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200A\u202F\u205F\u3000]+islands)|(vt|vermont)|(wa|washington)|(wi|wisconsin)|(wv|west[\t \u00A0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200A\u202F\u205F\u3000]+virginia)|(wy|wyoming))(?=[,*\u2022\t \u00A0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200A\u202F\u205F\u3000\n\u000B\f\r\u0085\u2028\u2029]|$)", 2);
        b.e = Pattern.compile("(?:alley|annex|arcade|ave[.]?|avenue|alameda|bayou|beach|bend|bluffs?|bottom|boulevard|branch|bridge|brooks?|burgs?|bypass|broadway|camino|camp|canyon|cape|causeway|centers?|circles?|cliffs?|club|common|corners?|course|courts?|coves?|creek|crescent|crest|crossing|crossroad|curve|circulo|dale|dam|divide|drives?|estates?|expressway|extensions?|falls?|ferry|fields?|flats?|fords?|forest|forges?|forks?|fort|freeway|gardens?|gateway|glens?|greens?|groves?|harbors?|haven|heights|highway|hills?|hollow|inlet|islands?|isle|junctions?|keys?|knolls?|lakes?|land|landing|lane|lights?|loaf|locks?|lodge|loop|mall|manors?|meadows?|mews|mills?|mission|motorway|mount|mountains?|neck|orchard|oval|overpass|parks?|parkways?|pass|passage|path|pike|pines?|plains?|plaza|points?|ports?|prairie|privada|radial|ramp|ranch|rapids?|rd[.]?|rest|ridges?|river|roads?|route|row|rue|run|shoals?|shores?|skyway|springs?|spurs?|squares?|station|stravenue|stream|st[.]?|streets?|summit|speedway|terrace|throughway|trace|track|trafficway|trail|tunnel|turnpike|underpass|unions?|valleys?|viaduct|views?|villages?|ville|vista|walks?|wall|ways?|wells?|xing|xrd)(?=[,*\u2022\t \u00A0\u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200A\u202F\u205F\u3000\n\u000B\f\r\u0085\u2028\u2029]|$)", 2);
        b.f = Pattern.compile("([0-9]+)(st|nd|rd|th)", 2);
        b.g = Pattern.compile("(?:[0-9]{5}(?:-[0-9]{4})?)(?=[,*•\t                　\n\u000B\f\r\u0085  ]|$)", 2);
    }

    public static boolean a(String s) {
        int v1 = 0;
        for(int v = 0; v < s.length(); ++v) {
            if(Character.isDigit(s.charAt(v))) {
                ++v1;
            }
        }
        if(v1 > 5) {
            return false;
        }
        Matcher matcher0 = b.f.matcher(s);
        if(matcher0.find()) {
            int v2 = Integer.parseInt(matcher0.group(1));
            if(v2 == 0) {
                return false;
            }
            String s1 = matcher0.group(2).toLowerCase(Locale.getDefault());
            String s2 = "th";
            switch(v2 % 10) {
                case 1: {
                    if(v2 % 100 != 11) {
                        s2 = "st";
                    }
                    return s1.equals(s2);
                }
                case 2: {
                    if(v2 % 100 != 12) {
                        s2 = "nd";
                    }
                    return s1.equals(s2);
                }
                default: {
                    if(v2 % 10 != 3) {
                        return s1.equals("th");
                    }
                    if(v2 % 100 != 13) {
                        s2 = "rd";
                    }
                    return s1.equals(s2);
                }
            }
        }
        return true;
    }
}

