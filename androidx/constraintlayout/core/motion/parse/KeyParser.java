package androidx.constraintlayout.core.motion.parse;

import androidx.constraintlayout.core.motion.utils.TypedBundle;
import androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType;
import androidx.constraintlayout.core.parser.CLElement;
import androidx.constraintlayout.core.parser.CLKey;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParser;
import androidx.constraintlayout.core.parser.CLParsingException;

public class KeyParser {
    interface DataType {
        int get(int arg1);
    }

    interface Ids {
        int get(String arg1);
    }

    public static void main(String[] arr_s) {
        KeyParser.parseAttributes("{frame:22,\ntarget:\'widget1\',\neasing:\'easeIn\',\ncurveFit:\'spline\',\nprogress:0.3,\nalpha:0.2,\nelevation:0.7,\nrotationZ:23,\nrotationX:25.0,\nrotationY:27.0,\npivotX:15,\npivotY:17,\npivotTarget:\'32\',\npathRotate:23,\nscaleX:0.5,\nscaleY:0.7,\ntranslationX:5,\ntranslationY:7,\ntranslationZ:11,\n}");
    }

    public static TypedBundle parseAttributes(String s) {
        int v1;
        TypedBundle typedBundle0 = new TypedBundle();
        try {
            CLObject cLObject0 = CLParser.parse(s);
            int v = cLObject0.size();
            for(v1 = 0; true; ++v1) {
                if(v1 >= v) {
                    return typedBundle0;
                }
                CLKey cLKey0 = (CLKey)cLObject0.get(v1);
                String s1 = cLKey0.content();
                CLElement cLElement0 = cLKey0.getValue();
                int v2 = AttributesType.getId(s1);
                if(v2 == -1) {
                    System.err.println("unknown type " + s1);
                }
                else {
                    switch(AttributesType.getType(v2)) {
                        case 1: {
                            typedBundle0.add(v2, cLObject0.getBoolean(v1));
                            break;
                        }
                        case 2: {
                            typedBundle0.add(v2, cLElement0.getInt());
                            System.out.println("parse " + s1 + " INT_MASK > " + cLElement0.getInt());
                            break;
                        }
                        case 4: {
                            typedBundle0.add(v2, cLElement0.getFloat());
                            System.out.println("parse " + s1 + " FLOAT_MASK > " + cLElement0.getFloat());
                            break;
                        }
                        case 8: {
                            typedBundle0.add(v2, cLElement0.content());
                            System.out.println("parse " + s1 + " STRING_MASK > " + cLElement0.content());
                        }
                    }
                }
            }
        }
        catch(CLParsingException cLParsingException0) {
        }
        cLParsingException0.printStackTrace();
        return typedBundle0;
    }
}

