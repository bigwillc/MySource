package utils;

/**
 * The type Param check utils.
 */
public class ParamCheckUtils {
    
    /**
     * Dubbo body is empty boolean.
     *
     * @param body the body
     * @return the boolean
     */
    public static boolean dubboBodyIsEmpty(final String body) {
        return null == body || "".equals(body) || "{}".equals(body) || "null".equals(body);
    }
}
