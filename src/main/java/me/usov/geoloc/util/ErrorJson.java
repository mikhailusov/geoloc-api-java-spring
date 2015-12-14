package me.usov.geoloc.util;

import java.util.Map;

/**
 * Created by Mikhail Usov <usov.me@gmail.com> on 12/13/15.
 */
public class ErrorJson {

    public String error;

    public ErrorJson(Map<String, Object> errorAttributes) {
        this.error = (String) errorAttributes.get("message");
    }

}
