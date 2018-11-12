package gameRoom.util;

import java.util.Locale;
import java.util.ResourceBundle;

public class BundleUtil {

    private final static String CONTENT_BUNDLE = "content";
    private final static String MESSAGE_BUNDLE = "messages";

    public ResourceBundle getBundleContent(){
        return ResourceBundle.getBundle(BundleUtil.CONTENT_BUNDLE);
    }
    public ResourceBundle getBundleContent_ua(){
        return ResourceBundle.getBundle(BundleUtil.CONTENT_BUNDLE, new Locale("ua", "UA"));
    }

    public ResourceBundle getBundleMessage(){
        return ResourceBundle.getBundle(BundleUtil.MESSAGE_BUNDLE);
    }
    public ResourceBundle getBundleMessage_ua(){
        return ResourceBundle.getBundle(BundleUtil.MESSAGE_BUNDLE, new Locale("ua", "UA"));
    }


}
